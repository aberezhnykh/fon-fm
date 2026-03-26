package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dataplaybackresolver_subs_0 {


public static RemoteObject  _builddataslotkey(RemoteObject __ref,RemoteObject _currentslot) throws Exception{
try {
		Debug.PushSubsStack("BuildDataSlotKey (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,588);
if (RapidSub.canDelegate("builddataslotkey")) { return __ref.runUserSub(false, "dataplaybackresolver","builddataslotkey", __ref, _currentslot);}
Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 588;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 589;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
Debug.ShouldStop(4096);
if (true) return RemoteObject.concat(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 590;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildplaylistplaybackmanifest(RemoteObject __ref,RemoteObject _playlistdata) throws Exception{
try {
		Debug.PushSubsStack("BuildPlaylistPlaybackManifest (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("buildplaylistplaybackmanifest")) { return __ref.runUserSub(false, "dataplaybackresolver","buildplaylistplaybackmanifest", __ref, _playlistdata);}
RemoteObject _manifest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _tracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackentries = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _order = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackobject = RemoteObject.declareNull("Object");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 343;BA.debugLine="Private Sub BuildPlaylistPlaybackManifest(playlist";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="Dim manifest As Map";
Debug.ShouldStop(8388608);
_manifest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("manifest", _manifest);
 BA.debugLineNum = 345;BA.debugLine="manifest.Initialize";
Debug.ShouldStop(16777216);
_manifest.runVoidMethod ("Initialize");
 BA.debugLineNum = 346;BA.debugLine="If playlistData.IsInitialized = False Then Return";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _manifest;};
 BA.debugLineNum = 347;BA.debugLine="Dim playlistId As String = playlistData.GetDefaul";
Debug.ShouldStop(67108864);
_playlistid = BA.ObjectToString(_playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 348;BA.debugLine="If playlistId = \"\" Then Return manifest";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return _manifest;};
 BA.debugLineNum = 349;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
Debug.ShouldStop(268435456);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("tracks", _tracks);Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 350;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_tracks.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_tracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _manifest;};
 BA.debugLineNum = 351;BA.debugLine="Dim trackEntries As Map";
Debug.ShouldStop(1073741824);
_trackentries = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("trackEntries", _trackentries);
 BA.debugLineNum = 352;BA.debugLine="trackEntries.Initialize";
Debug.ShouldStop(-2147483648);
_trackentries.runVoidMethod ("Initialize");
 BA.debugLineNum = 353;BA.debugLine="Dim order As List";
Debug.ShouldStop(1);
_order = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("order", _order);
 BA.debugLineNum = 354;BA.debugLine="order.Initialize";
Debug.ShouldStop(2);
_order.runVoidMethod ("Initialize");
 BA.debugLineNum = 355;BA.debugLine="For Each trackObject As Object In tracks";
Debug.ShouldStop(4);
{
final RemoteObject group12 = _tracks;
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_trackobject = group12.runMethod(false,"Get",index12);Debug.locals.put("trackObject", _trackobject);
Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 356;BA.debugLine="If (trackObject Is Map) = False Then Continue";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map")))),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 357;BA.debugLine="Dim track As Map = trackObject";
Debug.ShouldStop(16);
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_track = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 358;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
Debug.ShouldStop(32);
_trackid = BA.ObjectToString(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 359;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 360;BA.debugLine="If trackEntries.ContainsKey(trackId) Then Contin";
Debug.ShouldStop(128);
if (_trackentries.runMethod(true,"ContainsKey",(Object)((_trackid))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 361;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(256);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 362;BA.debugLine="entry.Initialize";
Debug.ShouldStop(512);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 363;BA.debugLine="entry.Put(\"type\", \"track\")";
Debug.ShouldStop(1024);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("track"))));
 BA.debugLineNum = 364;BA.debugLine="entry.Put(\"id\", trackId)";
Debug.ShouldStop(2048);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_trackid)));
 BA.debugLineNum = 365;BA.debugLine="entry.Put(\"code\", track.GetDefault(\"code\", \"\"))";
Debug.ShouldStop(4096);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("code"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 366;BA.debugLine="entry.Put(\"set\", track.GetDefault(\"set\", \"\"))";
Debug.ShouldStop(8192);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 367;BA.debugLine="entry.Put(\"duration\", track.GetDefault(\"duration";
Debug.ShouldStop(16384);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 368;BA.debugLine="entry.Put(\"gain\", track.GetDefault(\"gain\", -3))";
Debug.ShouldStop(32768);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 3)))))));
 BA.debugLineNum = 369;BA.debugLine="entry.Put(\"title\", track.GetDefault(\"title\", \"\")";
Debug.ShouldStop(65536);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 370;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
Debug.ShouldStop(131072);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_playlistid)));
 BA.debugLineNum = 371;BA.debugLine="trackEntries.Put(trackId, entry)";
Debug.ShouldStop(262144);
_trackentries.runVoidMethod ("Put",(Object)((_trackid)),(Object)((_entry.getObject())));
 BA.debugLineNum = 372;BA.debugLine="order.Add(trackId)";
Debug.ShouldStop(524288);
_order.runVoidMethod ("Add",(Object)((_trackid)));
 }
}Debug.locals.put("trackObject", _trackobject);
;
 BA.debugLineNum = 374;BA.debugLine="If order.Size = 0 Then Return manifest";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_order.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _manifest;};
 BA.debugLineNum = 375;BA.debugLine="ShuffleListInPlace(order)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_shufflelistinplace" /*RemoteObject*/ ,(Object)(_order));
 BA.debugLineNum = 376;BA.debugLine="manifest.Put(\"version\", PlaylistPlaybackManifestV";
Debug.ShouldStop(8388608);
_manifest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistplaybackmanifestversion" /*RemoteObject*/ ,(Object)(_playlistdata)))));
 BA.debugLineNum = 377;BA.debugLine="manifest.Put(\"playlist_id\", playlistId)";
Debug.ShouldStop(16777216);
_manifest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_playlistid)));
 BA.debugLineNum = 378;BA.debugLine="manifest.Put(\"title\", playlistData.GetDefault(\"ti";
Debug.ShouldStop(33554432);
_manifest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 379;BA.debugLine="manifest.Put(\"updated\", playlistData.GetDefault(\"";
Debug.ShouldStop(67108864);
_manifest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("updated"))),(Object)(_playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 380;BA.debugLine="manifest.Put(\"track_count\", order.Size)";
Debug.ShouldStop(134217728);
_manifest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("track_count"))),(Object)((_order.runMethod(true,"getSize"))));
 BA.debugLineNum = 381;BA.debugLine="manifest.Put(\"order\", order)";
Debug.ShouldStop(268435456);
_manifest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("order"))),(Object)((_order.getObject())));
 BA.debugLineNum = 382;BA.debugLine="manifest.Put(\"tracks\", trackEntries)";
Debug.ShouldStop(536870912);
_manifest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)((_trackentries.getObject())));
 BA.debugLineNum = 383;BA.debugLine="Return manifest";
Debug.ShouldStop(1073741824);
if (true) return _manifest;
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildslotfallbackresult(RemoteObject __ref,RemoteObject _descriptor,RemoteObject _cachedtrack,RemoteObject _ispreferredplaylist) throws Exception{
try {
		Debug.PushSubsStack("BuildSlotFallbackResult (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,460);
if (RapidSub.canDelegate("buildslotfallbackresult")) { return __ref.runUserSub(false, "dataplaybackresolver","buildslotfallbackresult", __ref, _descriptor, _cachedtrack, _ispreferredplaylist);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("descriptor", _descriptor);
Debug.locals.put("cachedTrack", _cachedtrack);
Debug.locals.put("isPreferredPlaylist", _ispreferredplaylist);
 BA.debugLineNum = 460;BA.debugLine="Private Sub BuildSlotFallbackResult(descriptor As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 461;BA.debugLine="Dim result As Map";
Debug.ShouldStop(4096);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 462;BA.debugLine="result.Initialize";
Debug.ShouldStop(8192);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 463;BA.debugLine="result.Put(\"playlist\", descriptor)";
Debug.ShouldStop(16384);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist"))),(Object)((_descriptor.getObject())));
 BA.debugLineNum = 464;BA.debugLine="result.Put(\"track\", cachedTrack)";
Debug.ShouldStop(32768);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("track"))),(Object)((_cachedtrack.getObject())));
 BA.debugLineNum = 465;BA.debugLine="If isPreferredPlaylist Then";
Debug.ShouldStop(65536);
if (_ispreferredplaylist.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 466;BA.debugLine="result.Put(\"source\", \"fallback_same_playlist\")";
Debug.ShouldStop(131072);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("source"))),(Object)((RemoteObject.createImmutable("fallback_same_playlist"))));
 }else {
 BA.debugLineNum = 468;BA.debugLine="result.Put(\"source\", \"fallback_other_playlist\")";
Debug.ShouldStop(524288);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("source"))),(Object)((RemoteObject.createImmutable("fallback_other_playlist"))));
 };
 BA.debugLineNum = 470;BA.debugLine="Return result";
Debug.ShouldStop(2097152);
if (true) return _result;
 BA.debugLineNum = 471;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _choosecachedtrackfromslot(RemoteObject __ref,RemoteObject _currentslot,RemoteObject _preferredplaylistid,RemoteObject _mediacacheservice) throws Exception{
try {
		Debug.PushSubsStack("ChooseCachedTrackFromSlot (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("choosecachedtrackfromslot")) { return __ref.runUserSub(false, "dataplaybackresolver","choosecachedtrackfromslot", __ref, _currentslot, _preferredplaylistid, _mediacacheservice);}
RemoteObject _emptyresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _preferreddescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fallbackdescriptors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _ordereddescriptors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _descriptorobject = RemoteObject.declareNull("Object");
RemoteObject _selectedresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _descriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cachedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("preferredPlaylistId", _preferredplaylistid);
Debug.locals.put("mediaCacheService", _mediacacheservice);
 BA.debugLineNum = 417;BA.debugLine="Public Sub ChooseCachedTrackFromSlot(currentSlot A";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="Dim emptyResult As Map";
Debug.ShouldStop(2);
_emptyresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyResult", _emptyresult);
 BA.debugLineNum = 419;BA.debugLine="emptyResult.Initialize";
Debug.ShouldStop(4);
_emptyresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 420;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptyresult;};
 BA.debugLineNum = 421;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(16);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 422;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptyresult;};
 BA.debugLineNum = 423;BA.debugLine="Dim preferredDescriptor As Map";
Debug.ShouldStop(64);
_preferreddescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("preferredDescriptor", _preferreddescriptor);
 BA.debugLineNum = 424;BA.debugLine="preferredDescriptor.Initialize";
Debug.ShouldStop(128);
_preferreddescriptor.runVoidMethod ("Initialize");
 BA.debugLineNum = 425;BA.debugLine="Dim fallbackDescriptors As List";
Debug.ShouldStop(256);
_fallbackdescriptors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fallbackDescriptors", _fallbackdescriptors);
 BA.debugLineNum = 426;BA.debugLine="fallbackDescriptors.Initialize";
Debug.ShouldStop(512);
_fallbackdescriptors.runVoidMethod ("Initialize");
 BA.debugLineNum = 427;BA.debugLine="For Each playlistObject As Object In playlists";
Debug.ShouldStop(1024);
{
final RemoteObject group10 = _playlists;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_playlistobject = group10.runMethod(false,"Get",index10);Debug.locals.put("playlistObject", _playlistobject);
Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 428;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map")))),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 429;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
Debug.ShouldStop(4096);
_playlistdescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlistDescriptor", _playlistdescriptor);Debug.locals.put("playlistDescriptor", _playlistdescriptor);
 BA.debugLineNum = 430;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
Debug.ShouldStop(8192);
_playlistid = BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 431;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 432;BA.debugLine="If playlistId = preferredPlaylistId Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_playlistid,_preferredplaylistid)) { 
 BA.debugLineNum = 433;BA.debugLine="preferredDescriptor = CloneMap(playlistDescript";
Debug.ShouldStop(65536);
_preferreddescriptor = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,(Object)(_playlistdescriptor));Debug.locals.put("preferredDescriptor", _preferreddescriptor);
 }else {
 BA.debugLineNum = 435;BA.debugLine="fallbackDescriptors.Add(CloneMap(playlistDescri";
Debug.ShouldStop(262144);
_fallbackdescriptors.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,(Object)(_playlistdescriptor)).getObject())));
 };
 }
}Debug.locals.put("playlistObject", _playlistobject);
;
 BA.debugLineNum = 438;BA.debugLine="Dim orderedDescriptors As List";
Debug.ShouldStop(2097152);
_ordereddescriptors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("orderedDescriptors", _ordereddescriptors);
 BA.debugLineNum = 439;BA.debugLine="orderedDescriptors.Initialize";
Debug.ShouldStop(4194304);
_ordereddescriptors.runVoidMethod ("Initialize");
 BA.debugLineNum = 440;BA.debugLine="If preferredDescriptor.IsInitialized And preferre";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(".",_preferreddescriptor.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_preferreddescriptor.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_ordereddescriptors.runVoidMethod ("Add",(Object)((_preferreddescriptor.getObject())));};
 BA.debugLineNum = 441;BA.debugLine="For Each descriptorObject As Object In fallbackDe";
Debug.ShouldStop(16777216);
{
final RemoteObject group24 = _fallbackdescriptors;
final int groupLen24 = group24.runMethod(true,"getSize").<Integer>get()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_descriptorobject = group24.runMethod(false,"Get",index24);Debug.locals.put("descriptorObject", _descriptorobject);
Debug.locals.put("descriptorObject", _descriptorobject);
 BA.debugLineNum = 442;BA.debugLine="orderedDescriptors.Add(descriptorObject)";
Debug.ShouldStop(33554432);
_ordereddescriptors.runVoidMethod ("Add",(Object)(_descriptorobject));
 }
}Debug.locals.put("descriptorObject", _descriptorobject);
;
 BA.debugLineNum = 444;BA.debugLine="Dim selectedResult As Map";
Debug.ShouldStop(134217728);
_selectedresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("selectedResult", _selectedresult);
 BA.debugLineNum = 445;BA.debugLine="selectedResult.Initialize";
Debug.ShouldStop(268435456);
_selectedresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 446;BA.debugLine="For Each descriptorObject As Object In orderedDes";
Debug.ShouldStop(536870912);
{
final RemoteObject group29 = _ordereddescriptors;
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_descriptorobject = group29.runMethod(false,"Get",index29);Debug.locals.put("descriptorObject", _descriptorobject);
Debug.locals.put("descriptorObject", _descriptorobject);
 BA.debugLineNum = 447;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_descriptorobject, RemoteObject.createImmutable("java.util.Map")))),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 448;BA.debugLine="Dim descriptor As Map = descriptorObject";
Debug.ShouldStop(-2147483648);
_descriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_descriptor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _descriptorobject);Debug.locals.put("descriptor", _descriptor);Debug.locals.put("descriptor", _descriptor);
 BA.debugLineNum = 449;BA.debugLine="Dim playlistId As String = descriptor.GetDefault";
Debug.ShouldStop(1);
_playlistid = BA.ObjectToString(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 450;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 451;BA.debugLine="Dim cachedTrack As Map = ResolveOrderedCachedTra";
Debug.ShouldStop(4);
_cachedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedtrack = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolveorderedcachedtrackfromplaylistbyid" /*RemoteObject*/ ,(Object)(_playlistid),(Object)(_mediacacheservice));Debug.locals.put("cachedTrack", _cachedtrack);Debug.locals.put("cachedTrack", _cachedtrack);
 BA.debugLineNum = 452;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_cachedtrack.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_cachedtrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 453;BA.debugLine="selectedResult = BuildSlotFallbackResult(descrip";
Debug.ShouldStop(16);
_selectedresult = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_buildslotfallbackresult" /*RemoteObject*/ ,(Object)(_descriptor),(Object)(_cachedtrack),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_playlistid,_preferredplaylistid))));Debug.locals.put("selectedResult", _selectedresult);
 BA.debugLineNum = 454;BA.debugLine="Exit";
Debug.ShouldStop(32);
if (true) break;
 }
}Debug.locals.put("descriptorObject", _descriptorobject);
;
 BA.debugLineNum = 456;BA.debugLine="If selectedResult.IsInitialized And selectedResul";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(".",_selectedresult.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_selectedresult.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _selectedresult;};
 BA.debugLineNum = 457;BA.debugLine="Return emptyResult";
Debug.ShouldStop(256);
if (true) return _emptyresult;
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _choosenextplaylistdescriptor(RemoteObject __ref,RemoteObject _currentslot,RemoteObject _workingcursors) throws Exception{
try {
		Debug.PushSubsStack("ChooseNextPlaylistDescriptor (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("choosenextplaylistdescriptor")) { return __ref.runUserSub(false, "dataplaybackresolver","choosenextplaylistdescriptor", __ref, _currentslot, _workingcursors);}
RemoteObject _emptydescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _slotkey = RemoteObject.createImmutable("");
RemoteObject _cursorvalue = RemoteObject.createImmutable(0);
RemoteObject _playlistindexforslot = RemoteObject.createImmutable(0);
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _playlistsource = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("workingCursors", _workingcursors);
 BA.debugLineNum = 158;BA.debugLine="Public Sub ChooseNextPlaylistDescriptor(currentSlo";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Dim emptyDescriptor As Map";
Debug.ShouldStop(1073741824);
_emptydescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyDescriptor", _emptydescriptor);
 BA.debugLineNum = 160;BA.debugLine="emptyDescriptor.Initialize";
Debug.ShouldStop(-2147483648);
_emptydescriptor.runVoidMethod ("Initialize");
 BA.debugLineNum = 161;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(1);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 162;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptydescriptor;};
 BA.debugLineNum = 163;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
Debug.ShouldStop(4);
_slotkey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_currentslot));Debug.locals.put("slotKey", _slotkey);Debug.locals.put("slotKey", _slotkey);
 BA.debugLineNum = 164;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
Debug.ShouldStop(8);
_cursorvalue = BA.numberCast(int.class, _workingcursors.runMethod(false,"GetDefault",(Object)((_slotkey)),(Object)(__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_slotkey)),(Object)(RemoteObject.createImmutable((0)))))));Debug.locals.put("cursorValue", _cursorvalue);Debug.locals.put("cursorValue", _cursorvalue);
 BA.debugLineNum = 165;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_cursorvalue,BA.numberCast(double.class, 0))) { 
_cursorvalue = BA.numberCast(int.class, 0);Debug.locals.put("cursorValue", _cursorvalue);};
 BA.debugLineNum = 166;BA.debugLine="Dim playlistIndexForSlot As Int = cursorValue Mod";
Debug.ShouldStop(32);
_playlistindexforslot = RemoteObject.solve(new RemoteObject[] {_cursorvalue,_playlists.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("playlistIndexForSlot", _playlistindexforslot);Debug.locals.put("playlistIndexForSlot", _playlistindexforslot);
 BA.debugLineNum = 167;BA.debugLine="workingCursors.Put(slotKey, playlistIndexForSlot";
Debug.ShouldStop(64);
_workingcursors.runVoidMethod ("Put",(Object)((_slotkey)),(Object)((RemoteObject.solve(new RemoteObject[] {_playlistindexforslot,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 168;BA.debugLine="Dim playlistObject As Object = playlists.Get(play";
Debug.ShouldStop(128);
_playlistobject = _playlists.runMethod(false,"Get",(Object)(_playlistindexforslot));Debug.locals.put("playlistObject", _playlistobject);Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 169;BA.debugLine="If playlistObject Is Map Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 170;BA.debugLine="Dim playlistSource As Map = playlistObject";
Debug.ShouldStop(512);
_playlistsource = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistsource = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlistSource", _playlistsource);Debug.locals.put("playlistSource", _playlistsource);
 BA.debugLineNum = 171;BA.debugLine="Dim playlist As Map = CloneMap(playlistSource)";
Debug.ShouldStop(1024);
_playlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlist = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,(Object)(_playlistsource));Debug.locals.put("playlist", _playlist);Debug.locals.put("playlist", _playlist);
 BA.debugLineNum = 172;BA.debugLine="playlist.Put(\"_slot_key\", slotKey)";
Debug.ShouldStop(2048);
_playlist.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_slot_key"))),(Object)((_slotkey)));
 BA.debugLineNum = 173;BA.debugLine="playlist.Put(\"_playlist_index\", playlistIndexFor";
Debug.ShouldStop(4096);
_playlist.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_playlist_index"))),(Object)((_playlistindexforslot)));
 BA.debugLineNum = 174;BA.debugLine="Return playlist";
Debug.ShouldStop(8192);
if (true) return _playlist;
 };
 BA.debugLineNum = 176;BA.debugLine="Return emptyDescriptor";
Debug.ShouldStop(32768);
if (true) return _emptydescriptor;
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private storageDir As String";
dataplaybackresolver._storagedir = RemoteObject.createImmutable("");__ref.setField("_storagedir",dataplaybackresolver._storagedir);
 //BA.debugLineNum = 7;BA.debugLine="Private targetModule As Object";
dataplaybackresolver._targetmodule = RemoteObject.createNew ("Object");__ref.setField("_targetmodule",dataplaybackresolver._targetmodule);
 //BA.debugLineNum = 8;BA.debugLine="Private traceSubName As String";
dataplaybackresolver._tracesubname = RemoteObject.createImmutable("");__ref.setField("_tracesubname",dataplaybackresolver._tracesubname);
 //BA.debugLineNum = 9;BA.debugLine="Private playlistCursors As Map";
dataplaybackresolver._playlistcursors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_playlistcursors",dataplaybackresolver._playlistcursors);
 //BA.debugLineNum = 10;BA.debugLine="Private storageRef As KeyValueStore";
dataplaybackresolver._storageref = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_storageref",dataplaybackresolver._storageref);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,663);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "dataplaybackresolver","clonemap", __ref, _source);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 663;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 664;BA.debugLine="Dim copy As Map";
Debug.ShouldStop(8388608);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 665;BA.debugLine="copy.Initialize";
Debug.ShouldStop(16777216);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 666;BA.debugLine="If source.IsInitialized = False Then Return copy";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 667;BA.debugLine="For Each key As Object In source.Keys";
Debug.ShouldStop(67108864);
{
final RemoteObject group4 = _source.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 668;BA.debugLine="copy.Put(key, source.Get(key))";
Debug.ShouldStop(134217728);
_copy.runVoidMethod ("Put",(Object)(_key),(Object)(_source.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 670;BA.debugLine="Return copy";
Debug.ShouldStop(536870912);
if (true) return _copy;
 BA.debugLineNum = 671;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cloneplaylistcursors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClonePlaylistCursors (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("cloneplaylistcursors")) { return __ref.runUserSub(false, "dataplaybackresolver","cloneplaylistcursors", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Public Sub ClonePlaylistCursors As Map";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Return CloneMap(playlistCursors)";
Debug.ShouldStop(1);
if (true) return __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_playlistcursors" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _commitplaylistcursor(RemoteObject __ref,RemoteObject _storage,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("CommitPlaylistCursor (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("commitplaylistcursor")) { return __ref.runUserSub(false, "dataplaybackresolver","commitplaylistcursor", __ref, _storage, _item);}
RemoteObject _slotkey = RemoteObject.createImmutable("");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _playlisttrackindex = RemoteObject.createImmutable(0);
RemoteObject _storedcursor = RemoteObject.createImmutable(0);
RemoteObject _playlistindex = RemoteObject.createImmutable(0);
Debug.locals.put("storage", _storage);
Debug.locals.put("item", _item);
 BA.debugLineNum = 495;BA.debugLine="Public Sub CommitPlaylistCursor(storage As KeyValu";
Debug.ShouldStop(16384);
 BA.debugLineNum = 496;BA.debugLine="If item.IsInitialized = False Then Return";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 497;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("track")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 498;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_key";
Debug.ShouldStop(131072);
_slotkey = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_key"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotKey", _slotkey);Debug.locals.put("slotKey", _slotkey);
 BA.debugLineNum = 499;BA.debugLine="Dim playlistId As String = item.GetDefault(\"playl";
Debug.ShouldStop(262144);
_playlistid = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 500;BA.debugLine="Dim playlistTrackIndex As Int = item.GetDefault(\"";
Debug.ShouldStop(524288);
_playlisttrackindex = BA.numberCast(int.class, _item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_track_index"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("playlistTrackIndex", _playlisttrackindex);Debug.locals.put("playlistTrackIndex", _playlisttrackindex);
 BA.debugLineNum = 501;BA.debugLine="If playlistId <> \"\" And playlistTrackIndex >= 0 T";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString("")) && RemoteObject.solveBoolean("g",_playlisttrackindex,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 502;BA.debugLine="Dim storedCursor As Int = item.GetDefault(\"playl";
Debug.ShouldStop(2097152);
_storedcursor = BA.numberCast(int.class, _item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_cursor"))),(Object)((RemoteObject.solve(new RemoteObject[] {_playlisttrackindex,RemoteObject.createImmutable(1)}, "+",1, 1)))));Debug.locals.put("storedCursor", _storedcursor);Debug.locals.put("storedCursor", _storedcursor);
 BA.debugLineNum = 503;BA.debugLine="storage.Put(PlaylistTrackIndexKey(playlistId), p";
Debug.ShouldStop(4194304);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlisttrackindexkey" /*RemoteObject*/ ,(Object)(_playlistid))),(Object)((_playlisttrackindex)));
 BA.debugLineNum = 504;BA.debugLine="storage.Put(PlaylistPlaybackCursorKey(playlistId";
Debug.ShouldStop(8388608);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistplaybackcursorkey" /*RemoteObject*/ ,(Object)(_playlistid))),(Object)((_storedcursor)));
 BA.debugLineNum = 505;BA.debugLine="Trace(\"playlist commit track playlistId=\" & play";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("playlist commit track playlistId="),_playlistid,RemoteObject.createImmutable(" trackIndex="),_playlisttrackindex,RemoteObject.createImmutable(" cursor="),_storedcursor,RemoteObject.createImmutable(" trackId="),_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 };
 BA.debugLineNum = 507;BA.debugLine="If slotKey = \"\" Then Return";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_slotkey,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 508;BA.debugLine="Dim playlistIndex As Int = item.GetDefault(\"playl";
Debug.ShouldStop(134217728);
_playlistindex = BA.numberCast(int.class, _item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_index"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("playlistIndex", _playlistindex);Debug.locals.put("playlistIndex", _playlistindex);
 BA.debugLineNum = 509;BA.debugLine="If playlistIndex < 0 Then Return";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",_playlistindex,BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 510;BA.debugLine="playlistCursors.Put(slotKey, playlistIndex + 1)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_slotkey)),(Object)((RemoteObject.solve(new RemoteObject[] {_playlistindex,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 511;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
Debug.ShouldStop(1073741824);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("data_slot_playlist_cursors")),(Object)((__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 512;BA.debugLine="Trace(\"playlist commit slot slotKey=\" & slotKey &";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("playlist commit slot slotKey="),_slotkey,RemoteObject.createImmutable(" playlistIndex="),_playlistindex,RemoteObject.createImmutable(" nextPlaylistCursor="),(RemoteObject.solve(new RemoteObject[] {_playlistindex,RemoteObject.createImmutable(1)}, "+",1, 1)))));
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinitializedlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateInitializedList (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,673);
if (RapidSub.canDelegate("createinitializedlist")) { return __ref.runUserSub(false, "dataplaybackresolver","createinitializedlist", __ref);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 673;BA.debugLine="Private Sub CreateInitializedList As List";
Debug.ShouldStop(1);
 BA.debugLineNum = 674;BA.debugLine="Dim items As List";
Debug.ShouldStop(2);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 675;BA.debugLine="items.Initialize";
Debug.ShouldStop(4);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 676;BA.debugLine="Return items";
Debug.ShouldStop(8);
if (true) return _items;
 BA.debugLineNum = 677;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinitializedmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateInitializedMap (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,657);
if (RapidSub.canDelegate("createinitializedmap")) { return __ref.runUserSub(false, "dataplaybackresolver","createinitializedmap", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 657;BA.debugLine="Private Sub CreateInitializedMap As Map";
Debug.ShouldStop(65536);
 BA.debugLineNum = 658;BA.debugLine="Dim m As Map";
Debug.ShouldStop(131072);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 659;BA.debugLine="m.Initialize";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 660;BA.debugLine="Return m";
Debug.ShouldStop(524288);
if (true) return _m;
 BA.debugLineNum = 661;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createqueuetrackfromplaylist(RemoteObject __ref,RemoteObject _currentslot,RemoteObject _playlistdescriptor,RemoteObject _track,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("CreateQueueTrackFromPlaylist (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,474);
if (RapidSub.canDelegate("createqueuetrackfromplaylist")) { return __ref.runUserSub(false, "dataplaybackresolver","createqueuetrackfromplaylist", __ref, _currentslot, _playlistdescriptor, _track, _offlinedata);}
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("playlistDescriptor", _playlistdescriptor);
Debug.locals.put("track", _track);
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 474;BA.debugLine="Public Sub CreateQueueTrackFromPlaylist(currentSlo";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 475;BA.debugLine="Dim item As Map";
Debug.ShouldStop(67108864);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("item", _item);
 BA.debugLineNum = 476;BA.debugLine="item.Initialize";
Debug.ShouldStop(134217728);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 477;BA.debugLine="item.Put(\"type\", \"track\")";
Debug.ShouldStop(268435456);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("track"))));
 BA.debugLineNum = 478;BA.debugLine="item.Put(\"id\", track.GetDefault(\"id\", \"\"))";
Debug.ShouldStop(536870912);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 479;BA.debugLine="item.Put(\"code\", track.GetDefault(\"code\", \"\"))";
Debug.ShouldStop(1073741824);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("code"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 480;BA.debugLine="item.Put(\"set\", track.GetDefault(\"set\", \"\"))";
Debug.ShouldStop(-2147483648);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 481;BA.debugLine="item.Put(\"duration\", track.GetDefault(\"duration\",";
Debug.ShouldStop(1);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 482;BA.debugLine="item.Put(\"gain\", track.GetDefault(\"gain\", -3))";
Debug.ShouldStop(2);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 3)))))));
 BA.debugLineNum = 483;BA.debugLine="item.Put(\"stream\", ResolvePlaybackStreamTitle(cur";
Debug.ShouldStop(4);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolveplaybackstreamtitle" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_playlistdescriptor),(Object)(_offlinedata)))));
 BA.debugLineNum = 484;BA.debugLine="item.Put(\"playlist_id\", playlistDescriptor.GetDef";
Debug.ShouldStop(8);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 485;BA.debugLine="item.Put(\"playlist_title\", playlistDescriptor.Get";
Debug.ShouldStop(16);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 486;BA.debugLine="item.Put(\"slot_key\", playlistDescriptor.GetDefaul";
Debug.ShouldStop(32);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_key"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("_slot_key"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_currentslot)))))));
 BA.debugLineNum = 487;BA.debugLine="item.Put(\"playlist_index\", playlistDescriptor.Get";
Debug.ShouldStop(64);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_index"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("_playlist_index"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 488;BA.debugLine="item.Put(\"playlist_track_index\", track.GetDefault";
Debug.ShouldStop(128);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_track_index"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_track_index"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))))));
 BA.debugLineNum = 489;BA.debugLine="item.Put(\"playlist_cursor\", track.GetDefault(\"pla";
Debug.ShouldStop(256);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_cursor"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_cursor"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1)))))));
 BA.debugLineNum = 490;BA.debugLine="item.Put(\"schedule_title\", currentSlot.GetDefault";
Debug.ShouldStop(512);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 491;BA.debugLine="item.Put(\"slot_time\", currentSlot.GetDefault(\"slo";
Debug.ShouldStop(1024);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 492;BA.debugLine="Return item";
Debug.ShouldStop(2048);
if (true) return _item;
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cursorcount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CursorCount (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("cursorcount")) { return __ref.runUserSub(false, "dataplaybackresolver","cursorcount", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Public Sub CursorCount As Int";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="If playlistCursors.IsInitialized = False Then Ret";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 29;BA.debugLine="Return playlistCursors.Size";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extractslotstreamdata(RemoteObject __ref,RemoteObject _slot) throws Exception{
try {
		Debug.PushSubsStack("ExtractSlotStreamData (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,559);
if (RapidSub.canDelegate("extractslotstreamdata")) { return __ref.runUserSub(false, "dataplaybackresolver","extractslotstreamdata", __ref, _slot);}
RemoteObject _streamdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _streamobject = RemoteObject.declareNull("Object");
Debug.locals.put("slot", _slot);
 BA.debugLineNum = 559;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 560;BA.debugLine="Dim streamData As Map";
Debug.ShouldStop(32768);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 561;BA.debugLine="streamData.Initialize";
Debug.ShouldStop(65536);
_streamdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 562;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_slot.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _streamdata;};
 BA.debugLineNum = 563;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
Debug.ShouldStop(262144);
_streamobject = _slot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stream"))));Debug.locals.put("streamObject", _streamobject);Debug.locals.put("streamObject", _streamobject);
 BA.debugLineNum = 564;BA.debugLine="If streamObject Is Map Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("i",_streamobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 565;BA.debugLine="streamData = streamObject";
Debug.ShouldStop(1048576);
_streamdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _streamobject);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 566;BA.debugLine="Return streamData";
Debug.ShouldStop(2097152);
if (true) return _streamdata;
 };
 BA.debugLineNum = 568;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_streamobject)) { 
_streamdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),_streamobject))));};
 BA.debugLineNum = 569;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
Debug.ShouldStop(16777216);
if (_slot.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("playlists")))).<Boolean>get().booleanValue()) { 
_streamdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(_slot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("playlists"))))));};
 BA.debugLineNum = 570;BA.debugLine="Return streamData";
Debug.ShouldStop(33554432);
if (true) return _streamdata;
 BA.debugLineNum = 571;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatisodate(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("FormatIsoDate (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,600);
if (RapidSub.canDelegate("formatisodate")) { return __ref.runUserSub(false, "dataplaybackresolver","formatisodate", __ref, _ticks);}
RemoteObject _previousdateformat = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 600;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 601;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
Debug.ShouldStop(16777216);
_previousdateformat = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("previousDateFormat", _previousdateformat);Debug.locals.put("previousDateFormat", _previousdateformat);
 BA.debugLineNum = 602;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(33554432);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 603;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
Debug.ShouldStop(67108864);
_value = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 604;BA.debugLine="DateTime.DateFormat = previousDateFormat";
Debug.ShouldStop(134217728);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_previousdateformat);
 BA.debugLineNum = 605;BA.debugLine="Return value";
Debug.ShouldStop(268435456);
if (true) return _value;
 BA.debugLineNum = 606;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getofflineplaylistsdir(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetOfflinePlaylistsDir (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,592);
if (RapidSub.canDelegate("getofflineplaylistsdir")) { return __ref.runUserSub(false, "dataplaybackresolver","getofflineplaylistsdir", __ref);}
 BA.debugLineNum = 592;BA.debugLine="Private Sub GetOfflinePlaylistsDir As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 593;BA.debugLine="Return File.Combine(storageDir, \"playlists\")";
Debug.ShouldStop(65536);
if (true) return dataplaybackresolver.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("playlists")));
 BA.debugLineNum = 594;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getplaylistplaybackmanifestbyid(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("GetPlaylistPlaybackManifestById (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,685);
if (RapidSub.canDelegate("getplaylistplaybackmanifestbyid")) { return __ref.runUserSub(false, "dataplaybackresolver","getplaylistplaybackmanifestbyid", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 685;BA.debugLine="Public Sub GetPlaylistPlaybackManifestById(playlis";
Debug.ShouldStop(4096);
 BA.debugLineNum = 686;BA.debugLine="Return LoadOrBuildPlaylistPlaybackManifestById(pl";
Debug.ShouldStop(8192);
if (true) return __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_loadorbuildplaylistplaybackmanifestbyid" /*RemoteObject*/ ,(Object)(_playlistid));
 BA.debugLineNum = 687;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getupcomingplaybacktracksbyid(RemoteObject __ref,RemoteObject _playlistid,RemoteObject _limitcount,RemoteObject _mediacacheservice,RemoteObject _includecached) throws Exception{
try {
		Debug.PushSubsStack("GetUpcomingPlaybackTracksById (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("getupcomingplaybacktracksbyid")) { return __ref.runUserSub(false, "dataplaybackresolver","getupcomingplaybacktracksbyid", __ref, _playlistid, _limitcount, _mediacacheservice, _includecached);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _manifest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlisttitle = RemoteObject.createImmutable("");
RemoteObject _order = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cursorkey = RemoteObject.createImmutable("");
RemoteObject _storedcursor = RemoteObject.createImmutable(0);
RemoteObject _trackindexkey = RemoteObject.createImmutable("");
RemoteObject _storedtrackindexvalue = RemoteObject.createImmutable(0);
RemoteObject _storedtrackindex = RemoteObject.createImmutable(0);
RemoteObject _startindex = RemoteObject.createImmutable(0);
int _offset = 0;
RemoteObject _orderindex = RemoteObject.createImmutable(0);
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _trackobject = RemoteObject.declareNull("Object");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("limitCount", _limitcount);
Debug.locals.put("mediaCacheService", _mediacacheservice);
Debug.locals.put("includeCached", _includecached);
 BA.debugLineNum = 275;BA.debugLine="Public Sub GetUpcomingPlaybackTracksById(playlistI";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="Dim result As List";
Debug.ShouldStop(524288);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 277;BA.debugLine="result.Initialize";
Debug.ShouldStop(1048576);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 278;BA.debugLine="If storageRef.IsInitialized = False Then Return r";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_storageref" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _result;};
 BA.debugLineNum = 279;BA.debugLine="If playlistId = \"\" Or limitCount <= 0 Then Return";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString("")) || RemoteObject.solveBoolean("k",_limitcount,BA.numberCast(double.class, 0))) { 
if (true) return _result;};
 BA.debugLineNum = 280;BA.debugLine="Dim manifest As Map = LoadOrBuildPlaylistPlayback";
Debug.ShouldStop(8388608);
_manifest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_manifest = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_loadorbuildplaylistplaybackmanifestbyid" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("manifest", _manifest);Debug.locals.put("manifest", _manifest);
 BA.debugLineNum = 281;BA.debugLine="If manifest.IsInitialized = False Or manifest.Siz";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_manifest.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_manifest.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _result;};
 BA.debugLineNum = 282;BA.debugLine="Dim playlistTitle As String = manifest.GetDefault";
Debug.ShouldStop(33554432);
_playlisttitle = BA.ObjectToString(_manifest.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistTitle", _playlisttitle);Debug.locals.put("playlistTitle", _playlisttitle);
 BA.debugLineNum = 283;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
Debug.ShouldStop(67108864);
_order = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_order = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _manifest.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("order"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("order", _order);Debug.locals.put("order", _order);
 BA.debugLineNum = 284;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_order.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_order.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _result;};
 BA.debugLineNum = 285;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
Debug.ShouldStop(268435456);
_trackmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_trackmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _manifest.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("trackMap", _trackmap);Debug.locals.put("trackMap", _trackmap);
 BA.debugLineNum = 286;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_trackmap.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_trackmap.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _result;};
 BA.debugLineNum = 288;BA.debugLine="Dim cursorKey As String = PlaylistPlaybackCursorK";
Debug.ShouldStop(-2147483648);
_cursorkey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistplaybackcursorkey" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("cursorKey", _cursorkey);Debug.locals.put("cursorKey", _cursorkey);
 BA.debugLineNum = 289;BA.debugLine="Dim storedCursor As Int = storageRef.GetDefault(c";
Debug.ShouldStop(1);
_storedcursor = BA.numberCast(int.class, __ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(_cursorkey),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("storedCursor", _storedcursor);Debug.locals.put("storedCursor", _storedcursor);
 BA.debugLineNum = 290;BA.debugLine="Dim trackIndexKey As String = PlaylistTrackIndexK";
Debug.ShouldStop(2);
_trackindexkey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlisttrackindexkey" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("trackIndexKey", _trackindexkey);Debug.locals.put("trackIndexKey", _trackindexkey);
 BA.debugLineNum = 291;BA.debugLine="Dim storedTrackIndexValue As Int = storageRef.Get";
Debug.ShouldStop(4);
_storedtrackindexvalue = BA.numberCast(int.class, __ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(_trackindexkey),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("storedTrackIndexValue", _storedtrackindexvalue);Debug.locals.put("storedTrackIndexValue", _storedtrackindexvalue);
 BA.debugLineNum = 292;BA.debugLine="If storedCursor < 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_storedcursor,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 293;BA.debugLine="If storedTrackIndexValue >= 0 Then storedCursor";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("g",_storedtrackindexvalue,BA.numberCast(double.class, 0))) { 
_storedcursor = RemoteObject.solve(new RemoteObject[] {_storedtrackindexvalue,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("storedCursor", _storedcursor);};
 };
 BA.debugLineNum = 295;BA.debugLine="Dim storedTrackIndex As Int = storedCursor - 1";
Debug.ShouldStop(64);
_storedtrackindex = RemoteObject.solve(new RemoteObject[] {_storedcursor,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("storedTrackIndex", _storedtrackindex);Debug.locals.put("storedTrackIndex", _storedtrackindex);
 BA.debugLineNum = 296;BA.debugLine="If storedTrackIndex >= order.Size Then storedTrac";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("g",_storedtrackindex,BA.numberCast(double.class, _order.runMethod(true,"getSize")))) { 
_storedtrackindex = RemoteObject.solve(new RemoteObject[] {_storedtrackindex,_order.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("storedTrackIndex", _storedtrackindex);};
 BA.debugLineNum = 298;BA.debugLine="Dim startIndex As Int = storedTrackIndex + 1";
Debug.ShouldStop(512);
_startindex = RemoteObject.solve(new RemoteObject[] {_storedtrackindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("startIndex", _startindex);Debug.locals.put("startIndex", _startindex);
 BA.debugLineNum = 299;BA.debugLine="If startIndex < 0 Then startIndex = 0";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",_startindex,BA.numberCast(double.class, 0))) { 
_startindex = BA.numberCast(int.class, 0);Debug.locals.put("startIndex", _startindex);};
 BA.debugLineNum = 300;BA.debugLine="If startIndex >= order.Size Then startIndex = sta";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("g",_startindex,BA.numberCast(double.class, _order.runMethod(true,"getSize")))) { 
_startindex = RemoteObject.solve(new RemoteObject[] {_startindex,_order.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("startIndex", _startindex);};
 BA.debugLineNum = 302;BA.debugLine="For offset = 0 To order.Size - 1";
Debug.ShouldStop(8192);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_order.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_offset = 0 ;
for (;(step24 > 0 && _offset <= limit24) || (step24 < 0 && _offset >= limit24) ;_offset = ((int)(0 + _offset + step24))  ) {
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 303;BA.debugLine="If result.Size >= limitCount Then Exit";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("g",_result.runMethod(true,"getSize"),BA.numberCast(double.class, _limitcount))) { 
if (true) break;};
 BA.debugLineNum = 304;BA.debugLine="Dim orderIndex As Int = (startIndex + offset) Mo";
Debug.ShouldStop(32768);
_orderindex = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_startindex,RemoteObject.createImmutable(_offset)}, "+",1, 1)),_order.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("orderIndex", _orderindex);Debug.locals.put("orderIndex", _orderindex);
 BA.debugLineNum = 305;BA.debugLine="Dim trackId As String = order.Get(orderIndex)";
Debug.ShouldStop(65536);
_trackid = BA.ObjectToString(_order.runMethod(false,"Get",(Object)(_orderindex)));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 306;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 307;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("g",_storedtrackindex,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_order.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_orderindex,BA.numberCast(double.class, _storedtrackindex))) { 
if (true) continue;};
 BA.debugLineNum = 308;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
Debug.ShouldStop(524288);
_trackobject = _trackmap.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(dataplaybackresolver.__c.getField(false,"Null")));Debug.locals.put("trackObject", _trackobject);Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 309;BA.debugLine="If (trackObject Is Map) = False Then Continue";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map")))),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 310;BA.debugLine="Dim track As Map = CloneMap(trackObject)";
Debug.ShouldStop(2097152);
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_track = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject));Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 311;BA.debugLine="track.Put(\"playlist_id\", playlistId)";
Debug.ShouldStop(4194304);
_track.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_playlistid)));
 BA.debugLineNum = 312;BA.debugLine="track.Put(\"playlist_title\", playlistTitle)";
Debug.ShouldStop(8388608);
_track.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)((_playlisttitle)));
 BA.debugLineNum = 313;BA.debugLine="track.Put(\"playlist_track_index\", orderIndex)";
Debug.ShouldStop(16777216);
_track.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_track_index"))),(Object)((_orderindex)));
 BA.debugLineNum = 314;BA.debugLine="track.Put(\"playlist_cursor\", orderIndex + 1)";
Debug.ShouldStop(33554432);
_track.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_cursor"))),(Object)((RemoteObject.solve(new RemoteObject[] {_orderindex,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 315;BA.debugLine="If includeCached = False And mediaCacheService.H";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_includecached,dataplaybackresolver.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_track)))) { 
if (true) continue;};
 BA.debugLineNum = 316;BA.debugLine="result.Add(track)";
Debug.ShouldStop(134217728);
_result.runVoidMethod ("Add",(Object)((_track.getObject())));
 }
}Debug.locals.put("offset", _offset);
;
 BA.debugLineNum = 319;BA.debugLine="Return result";
Debug.ShouldStop(1073741824);
if (true) return _result;
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagedirvalue,RemoteObject _targetmodulevalue,RemoteObject _tracesubnamevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dataplaybackresolver","initialize", __ref, _ba, _storagedirvalue, _targetmodulevalue, _tracesubnamevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(storageDirValue As String, t";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(8192);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 15;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(16384);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 16;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(32768);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 17;BA.debugLine="playlistCursors.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isoweekdayfromticks(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("IsoWeekdayFromTicks (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,618);
if (RapidSub.canDelegate("isoweekdayfromticks")) { return __ref.runUserSub(false, "dataplaybackresolver","isoweekdayfromticks", __ref, _ticks);}
RemoteObject _instantclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneddatetimeclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _instant = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneid = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneddatetime = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _localdate = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _dayofweek = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 618;BA.debugLine="Private Sub IsoWeekdayFromTicks(ticks As Long) As";
Debug.ShouldStop(512);
 BA.debugLineNum = 619;BA.debugLine="Dim instantClass As JavaObject";
Debug.ShouldStop(1024);
_instantclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("instantClass", _instantclass);
 BA.debugLineNum = 620;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
Debug.ShouldStop(2048);
_instantclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.Instant")));
 BA.debugLineNum = 621;BA.debugLine="Dim zoneClass As JavaObject";
Debug.ShouldStop(4096);
_zoneclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("zoneClass", _zoneclass);
 BA.debugLineNum = 622;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
Debug.ShouldStop(8192);
_zoneclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.ZoneId")));
 BA.debugLineNum = 623;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
Debug.ShouldStop(16384);
_zoneddatetimeclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("zonedDateTimeClass", _zoneddatetimeclass);
 BA.debugLineNum = 624;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
Debug.ShouldStop(32768);
_zoneddatetimeclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.ZonedDateTime")));
 BA.debugLineNum = 625;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
Debug.ShouldStop(65536);
_instant = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_instant = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _instantclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("ofEpochMilli")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ticks)}))));Debug.locals.put("instant", _instant);Debug.locals.put("instant", _instant);
 BA.debugLineNum = 626;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
Debug.ShouldStop(131072);
_zoneid = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_zoneid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _zoneclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("systemDefault")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));Debug.locals.put("zoneId", _zoneid);Debug.locals.put("zoneId", _zoneid);
 BA.debugLineNum = 627;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
Debug.ShouldStop(262144);
_zoneddatetime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_zoneddatetime = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _zoneddatetimeclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("ofInstant")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_instant.getObject()),(_zoneid.getObject())}))));Debug.locals.put("zonedDateTime", _zoneddatetime);Debug.locals.put("zonedDateTime", _zoneddatetime);
 BA.debugLineNum = 628;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
Debug.ShouldStop(524288);
_localdate = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_localdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _zoneddatetime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toLocalDate")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));Debug.locals.put("localDate", _localdate);Debug.locals.put("localDate", _localdate);
 BA.debugLineNum = 629;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
Debug.ShouldStop(1048576);
_dayofweek = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_dayofweek = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _localdate.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDayOfWeek")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));Debug.locals.put("dayOfWeek", _dayofweek);Debug.locals.put("dayOfWeek", _dayofweek);
 BA.debugLineNum = 630;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_dayofweek.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getValue")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));
 BA.debugLineNum = 631;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcachedplaylistmetadata(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("LoadCachedPlaylistMetadata (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("loadcachedplaylistmetadata")) { return __ref.runUserSub(false, "dataplaybackresolver","loadcachedplaylistmetadata", __ref, _playlistid);}
RemoteObject _playlistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _parseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 179;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Dim playlistData As Map";
Debug.ShouldStop(524288);
_playlistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 181;BA.debugLine="playlistData.Initialize";
Debug.ShouldStop(1048576);
_playlistdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 182;BA.debugLine="If playlistId = \"\" Then Return playlistData";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return _playlistdata;};
 BA.debugLineNum = 183;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistMe";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",dataplaybackresolver.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_getofflineplaylistsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistmetadatafilename" /*RemoteObject*/ ,(Object)(_playlistid)))),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _playlistdata;};
 BA.debugLineNum = 184;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 185;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16777216);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 186;BA.debugLine="parser.Initialize(File.ReadString(GetOfflinePlay";
Debug.ShouldStop(33554432);
_parser.runVoidMethod ("Initialize",(Object)(dataplaybackresolver.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_getofflineplaylistsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistmetadatafilename" /*RemoteObject*/ ,(Object)(_playlistid))))));
 BA.debugLineNum = 187;BA.debugLine="Dim parsedData As Map = parser.NextObject";
Debug.ShouldStop(67108864);
_parseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_parseddata = _parser.runMethod(false,"NextObject");Debug.locals.put("parsedData", _parseddata);Debug.locals.put("parsedData", _parseddata);
 BA.debugLineNum = 188;BA.debugLine="If parsedData.IsInitialized Then playlistData =";
Debug.ShouldStop(134217728);
if (_parseddata.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_playlistdata = _parseddata;Debug.locals.put("playlistData", _playlistdata);};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 190;BA.debugLine="playlistData.Initialize";
Debug.ShouldStop(536870912);
_playlistdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 191;BA.debugLine="Trace(\"Не удалось загрузить playlist metadata из";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось загрузить playlist metadata из кэша. id="),_playlistid,RemoteObject.createImmutable(", message="),dataplaybackresolver.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 193;BA.debugLine="Return playlistData";
Debug.ShouldStop(1);
if (true) return _playlistdata;
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadorbuildplaylistplaybackmanifestbyid(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("LoadOrBuildPlaylistPlaybackManifestById (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("loadorbuildplaylistplaybackmanifestbyid")) { return __ref.runUserSub(false, "dataplaybackresolver","loadorbuildplaylistplaybackmanifestbyid", __ref, _playlistid);}
RemoteObject _manifest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _storedmanifest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _storedorder = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _storedtracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sourceplaylistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 322;BA.debugLine="Private Sub LoadOrBuildPlaylistPlaybackManifestByI";
Debug.ShouldStop(2);
 BA.debugLineNum = 323;BA.debugLine="Dim manifest As Map";
Debug.ShouldStop(4);
_manifest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("manifest", _manifest);
 BA.debugLineNum = 324;BA.debugLine="manifest.Initialize";
Debug.ShouldStop(8);
_manifest.runVoidMethod ("Initialize");
 BA.debugLineNum = 325;BA.debugLine="If playlistId = \"\" Then Return manifest";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return _manifest;};
 BA.debugLineNum = 326;BA.debugLine="Dim storedManifest As Map = storageRef.GetDefault";
Debug.ShouldStop(32);
_storedmanifest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_storedmanifest = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistplaybackmanifestkey" /*RemoteObject*/ ,(Object)(_playlistid))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("storedManifest", _storedmanifest);Debug.locals.put("storedManifest", _storedmanifest);
 BA.debugLineNum = 327;BA.debugLine="If storedManifest.IsInitialized Then";
Debug.ShouldStop(64);
if (_storedmanifest.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 328;BA.debugLine="Dim storedOrder As List = storedManifest.GetDefa";
Debug.ShouldStop(128);
_storedorder = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_storedorder = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _storedmanifest.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("order"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("storedOrder", _storedorder);Debug.locals.put("storedOrder", _storedorder);
 BA.debugLineNum = 329;BA.debugLine="Dim storedTracks As Map = storedManifest.GetDefa";
Debug.ShouldStop(256);
_storedtracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_storedtracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _storedmanifest.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("storedTracks", _storedtracks);Debug.locals.put("storedTracks", _storedtracks);
 BA.debugLineNum = 330;BA.debugLine="If storedOrder.IsInitialized And storedOrder.Siz";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(".",_storedorder.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_storedorder.runMethod(true,"getSize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",_storedtracks.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_storedtracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 331;BA.debugLine="Return storedManifest";
Debug.ShouldStop(1024);
if (true) return _storedmanifest;
 };
 };
 BA.debugLineNum = 334;BA.debugLine="Dim sourcePlaylistData As Map = LoadCachedPlaylis";
Debug.ShouldStop(8192);
_sourceplaylistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_sourceplaylistdata = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_loadcachedplaylistmetadata" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("sourcePlaylistData", _sourceplaylistdata);Debug.locals.put("sourcePlaylistData", _sourceplaylistdata);
 BA.debugLineNum = 335;BA.debugLine="If sourcePlaylistData.IsInitialized = False Or so";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_sourceplaylistdata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_sourceplaylistdata.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _manifest;};
 BA.debugLineNum = 336;BA.debugLine="manifest = BuildPlaylistPlaybackManifest(sourcePl";
Debug.ShouldStop(32768);
_manifest = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_buildplaylistplaybackmanifest" /*RemoteObject*/ ,(Object)(_sourceplaylistdata));Debug.locals.put("manifest", _manifest);
 BA.debugLineNum = 337;BA.debugLine="If manifest.IsInitialized And manifest.Size > 0 T";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(".",_manifest.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_manifest.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 338;BA.debugLine="storageRef.Put(PlaylistPlaybackManifestKey(playl";
Debug.ShouldStop(131072);
__ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistplaybackmanifestkey" /*RemoteObject*/ ,(Object)(_playlistid))),(Object)((_manifest.getObject())));
 };
 BA.debugLineNum = 340;BA.debugLine="Return manifest";
Debug.ShouldStop(524288);
if (true) return _manifest;
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadstate(RemoteObject __ref,RemoteObject _storage) throws Exception{
try {
		Debug.PushSubsStack("LoadState (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("loadstate")) { return __ref.runUserSub(false, "dataplaybackresolver","loadstate", __ref, _storage);}
Debug.locals.put("storage", _storage);
 BA.debugLineNum = 21;BA.debugLine="Public Sub LoadState(storage As KeyValueStore)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="storageRef = storage";
Debug.ShouldStop(2097152);
__ref.setField ("_storageref" /*RemoteObject*/ ,_storage);
 BA.debugLineNum = 23;BA.debugLine="playlistCursors = storage.GetDefault(\"data_slot_p";
Debug.ShouldStop(4194304);
__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).setObject (_storage.runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("data_slot_playlist_cursors")),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_createinitializedmap" /*RemoteObject*/ ).getObject()))));
 BA.debugLineNum = 24;BA.debugLine="If playlistCursors.IsInitialized = False Then pla";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _minutesofdayfromticks(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("MinutesOfDayFromTicks (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("minutesofdayfromticks")) { return __ref.runUserSub(false, "dataplaybackresolver","minutesofdayfromticks", __ref, _ticks);}
RemoteObject _previoustimeformat = RemoteObject.createImmutable("");
RemoteObject _timevalue = RemoteObject.createImmutable("");
RemoteObject _parts = null;
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 608;BA.debugLine="Private Sub MinutesOfDayFromTicks(ticks As Long) A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 609;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
Debug.ShouldStop(1);
_previoustimeformat = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("previousTimeFormat", _previoustimeformat);Debug.locals.put("previousTimeFormat", _previoustimeformat);
 BA.debugLineNum = 610;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(2);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 611;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
Debug.ShouldStop(4);
_timevalue = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_ticks));Debug.locals.put("timeValue", _timevalue);Debug.locals.put("timeValue", _timevalue);
 BA.debugLineNum = 612;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
Debug.ShouldStop(8);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_previoustimeformat);
 BA.debugLineNum = 613;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
Debug.ShouldStop(16);
_parts = dataplaybackresolver.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_timevalue));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 614;BA.debugLine="If parts.Length < 2 Then Return 0";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",_parts.getField(true,"length"),BA.numberCast(double.class, 2))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 615;BA.debugLine="Return parts(0) * 60 + parts(1)";
Debug.ShouldStop(64);
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _parts.getArrayElement(true,BA.numberCast(int.class, 0))),RemoteObject.createImmutable(60),BA.numberCast(double.class, _parts.getArrayElement(true,BA.numberCast(int.class, 1)))}, "*+",1, 0));
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playlistmetadatafilename(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("PlaylistMetadataFileName (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,596);
if (RapidSub.canDelegate("playlistmetadatafilename")) { return __ref.runUserSub(false, "dataplaybackresolver","playlistmetadatafilename", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 596;BA.debugLine="Private Sub PlaylistMetadataFileName(playlistId As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 597;BA.debugLine="Return playlistId & \".json\"";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.concat(_playlistid,RemoteObject.createImmutable(".json"));
 BA.debugLineNum = 598;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playlistplaybackcursorkey(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("PlaylistPlaybackCursorKey (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("playlistplaybackcursorkey")) { return __ref.runUserSub(false, "dataplaybackresolver","playlistplaybackcursorkey", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 398;BA.debugLine="Private Sub PlaylistPlaybackCursorKey(playlistId A";
Debug.ShouldStop(8192);
 BA.debugLineNum = 399;BA.debugLine="Return \"playlist_playback_cursor_\" & playlistId";
Debug.ShouldStop(16384);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("playlist_playback_cursor_"),_playlistid);
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playlistplaybackmanifestkey(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("PlaylistPlaybackManifestKey (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("playlistplaybackmanifestkey")) { return __ref.runUserSub(false, "dataplaybackresolver","playlistplaybackmanifestkey", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 394;BA.debugLine="Private Sub PlaylistPlaybackManifestKey(playlistId";
Debug.ShouldStop(512);
 BA.debugLineNum = 395;BA.debugLine="Return \"playlist_playback_manifest_\" & playlistId";
Debug.ShouldStop(1024);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("playlist_playback_manifest_"),_playlistid);
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playlistplaybackmanifestversion(RemoteObject __ref,RemoteObject _playlistdata) throws Exception{
try {
		Debug.PushSubsStack("PlaylistPlaybackManifestVersion (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,386);
if (RapidSub.canDelegate("playlistplaybackmanifestversion")) { return __ref.runUserSub(false, "dataplaybackresolver","playlistplaybackmanifestversion", __ref, _playlistdata);}
RemoteObject _updatedvalue = RemoteObject.createImmutable("");
RemoteObject _tracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackcount = RemoteObject.createImmutable(0);
Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 386;BA.debugLine="Private Sub PlaylistPlaybackManifestVersion(playli";
Debug.ShouldStop(2);
 BA.debugLineNum = 387;BA.debugLine="Dim updatedValue As String = playlistData.GetDefa";
Debug.ShouldStop(4);
_updatedvalue = BA.ObjectToString(_playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("updatedValue", _updatedvalue);Debug.locals.put("updatedValue", _updatedvalue);
 BA.debugLineNum = 388;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
Debug.ShouldStop(8);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("tracks", _tracks);Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 389;BA.debugLine="Dim trackCount As Int = 0";
Debug.ShouldStop(16);
_trackcount = BA.numberCast(int.class, 0);Debug.locals.put("trackCount", _trackcount);Debug.locals.put("trackCount", _trackcount);
 BA.debugLineNum = 390;BA.debugLine="If tracks.IsInitialized Then trackCount = tracks.";
Debug.ShouldStop(32);
if (_tracks.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_trackcount = _tracks.runMethod(true,"getSize");Debug.locals.put("trackCount", _trackcount);};
 BA.debugLineNum = 391;BA.debugLine="Return updatedValue & \"|\" & trackCount";
Debug.ShouldStop(64);
if (true) return RemoteObject.concat(_updatedvalue,RemoteObject.createImmutable("|"),_trackcount);
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playlisttrackindexkey(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("PlaylistTrackIndexKey (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,402);
if (RapidSub.canDelegate("playlisttrackindexkey")) { return __ref.runUserSub(false, "dataplaybackresolver","playlisttrackindexkey", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 402;BA.debugLine="Private Sub PlaylistTrackIndexKey(playlistId As St";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="Return \"playlist_track_index_\" & playlistId";
Debug.ShouldStop(262144);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("playlist_track_index_"),_playlistid);
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvecurrentdataslot(RemoteObject __ref,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("ResolveCurrentDataSlot (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("resolvecurrentdataslot")) { return __ref.runUserSub(false, "dataplaybackresolver","resolvecurrentdataslot", __ref, _offlinedata);}
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 36;BA.debugLine="Public Sub ResolveCurrentDataSlot(offlineData As M";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return ResolveDataSlotAtTicks(offlineData, DateTi";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvedataslotatticks(RemoteObject __ref,RemoteObject _offlinedata,RemoteObject _targetticks) throws Exception{
try {
		Debug.PushSubsStack("ResolveDataSlotAtTicks (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("resolvedataslotatticks")) { return __ref.runUserSub(false, "dataplaybackresolver","resolvedataslotatticks", __ref, _offlinedata, _targetticks);}
RemoteObject _slotcontext = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _schedules = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _todaykey = RemoteObject.createImmutable("");
RemoteObject _nowminutes = RemoteObject.createImmutable(0);
RemoteObject _todayweekday = RemoteObject.createImmutable("");
RemoteObject _matchedslots = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _scheduleobject = RemoteObject.declareNull("Object");
RemoteObject _schedule = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _scheduletitle = RemoteObject.createImmutable("");
RemoteObject _slots = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _slotobject = RemoteObject.declareNull("Object");
RemoteObject _slot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slottime = RemoteObject.createImmutable("");
RemoteObject _slotminutes = RemoteObject.createImmutable(0);
RemoteObject _streamdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _selectedslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _selectedminutes = RemoteObject.createImmutable(0);
RemoteObject _slotentryobject = RemoteObject.declareNull("Object");
RemoteObject _slotentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("targetTicks", _targetticks);
 BA.debugLineNum = 41;BA.debugLine="Public Sub ResolveDataSlotAtTicks(offlineData As M";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Dim slotContext As Map";
Debug.ShouldStop(512);
_slotcontext = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("slotContext", _slotcontext);
 BA.debugLineNum = 43;BA.debugLine="slotContext.Initialize";
Debug.ShouldStop(1024);
_slotcontext.runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _slotcontext;};
 BA.debugLineNum = 45;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
Debug.ShouldStop(4096);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 46;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_schedules.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _slotcontext;};
 BA.debugLineNum = 47;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
Debug.ShouldStop(16384);
_todaykey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_formatisodate" /*RemoteObject*/ ,(Object)(_targetticks));Debug.locals.put("todayKey", _todaykey);Debug.locals.put("todayKey", _todaykey);
 BA.debugLineNum = 48;BA.debugLine="Dim nowMinutes As Int = MinutesOfDayFromTicks(tar";
Debug.ShouldStop(32768);
_nowminutes = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_minutesofdayfromticks" /*RemoteObject*/ ,(Object)(_targetticks));Debug.locals.put("nowMinutes", _nowminutes);Debug.locals.put("nowMinutes", _nowminutes);
 BA.debugLineNum = 49;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTicks(";
Debug.ShouldStop(65536);
_todayweekday = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_isoweekdayfromticks" /*RemoteObject*/ ,(Object)(_targetticks));Debug.locals.put("todayWeekday", _todayweekday);Debug.locals.put("todayWeekday", _todayweekday);
 BA.debugLineNum = 50;BA.debugLine="Dim matchedSlots As List";
Debug.ShouldStop(131072);
_matchedslots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("matchedSlots", _matchedslots);
 BA.debugLineNum = 51;BA.debugLine="matchedSlots.Initialize";
Debug.ShouldStop(262144);
_matchedslots.runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(524288);
{
final RemoteObject group11 = _schedules;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_scheduleobject = group11.runMethod(false,"Get",index11);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 53;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 54;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(2097152);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 55;BA.debugLine="If ScheduleAppliesToday(schedule, todayKey, tod";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_scheduleappliestoday" /*RemoteObject*/ ,(Object)(_schedule),(Object)(_todaykey),(Object)(_todayweekday)),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 56;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
Debug.ShouldStop(8388608);
_scheduletitle = BA.ObjectToString(_schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("scheduleTitle", _scheduletitle);Debug.locals.put("scheduleTitle", _scheduletitle);
 BA.debugLineNum = 57;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
Debug.ShouldStop(16777216);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 58;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 59;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(67108864);
{
final RemoteObject group18 = _slots;
final int groupLen18 = group18.runMethod(true,"getSize").<Integer>get()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_slotobject = group18.runMethod(false,"Get",index18);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 60;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 61;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(268435456);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 62;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
Debug.ShouldStop(536870912);
_slottime = BA.ObjectToString(_slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotTime", _slottime);Debug.locals.put("slotTime", _slottime);
 BA.debugLineNum = 63;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes(";
Debug.ShouldStop(1073741824);
_slotminutes = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_timestringtominutes" /*RemoteObject*/ ,(Object)(_slottime));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 64;BA.debugLine="If slotMinutes < 0 Then Continue";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_slotminutes,BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 65;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
Debug.ShouldStop(1);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 66;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(2);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 67;BA.debugLine="entry.Initialize";
Debug.ShouldStop(4);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 68;BA.debugLine="entry.Put(\"schedule_title\", scheduleTitle)";
Debug.ShouldStop(8);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((_scheduletitle)));
 BA.debugLineNum = 69;BA.debugLine="entry.Put(\"slot_time\", slotTime)";
Debug.ShouldStop(16);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((_slottime)));
 BA.debugLineNum = 70;BA.debugLine="entry.Put(\"slot_minutes\", slotMinutes)";
Debug.ShouldStop(32);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)((_slotminutes)));
 BA.debugLineNum = 71;BA.debugLine="entry.Put(\"stream_id\", streamData.GetDefault(";
Debug.ShouldStop(64);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 72;BA.debugLine="entry.Put(\"stream_title\", streamData.GetDefau";
Debug.ShouldStop(128);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 73;BA.debugLine="entry.Put(\"playlists\", streamData.GetDefault(";
Debug.ShouldStop(256);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 74;BA.debugLine="matchedSlots.Add(entry)";
Debug.ShouldStop(512);
_matchedslots.runVoidMethod ("Add",(Object)((_entry.getObject())));
 };
 }
}Debug.locals.put("slotObject", _slotobject);
;
 };
 }
}Debug.locals.put("scheduleObject", _scheduleobject);
;
 BA.debugLineNum = 79;BA.debugLine="If matchedSlots.Size = 0 Then Return slotContext";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_matchedslots.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _slotcontext;};
 BA.debugLineNum = 80;BA.debugLine="Dim selectedSlot As Map";
Debug.ShouldStop(32768);
_selectedslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("selectedSlot", _selectedslot);
 BA.debugLineNum = 81;BA.debugLine="selectedSlot.Initialize";
Debug.ShouldStop(65536);
_selectedslot.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="Dim selectedMinutes As Int = -1";
Debug.ShouldStop(131072);
_selectedminutes = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("selectedMinutes", _selectedminutes);Debug.locals.put("selectedMinutes", _selectedminutes);
 BA.debugLineNum = 83;BA.debugLine="For Each slotEntryObject As Object In matchedSlot";
Debug.ShouldStop(262144);
{
final RemoteObject group42 = _matchedslots;
final int groupLen42 = group42.runMethod(true,"getSize").<Integer>get()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_slotentryobject = group42.runMethod(false,"Get",index42);Debug.locals.put("slotEntryObject", _slotentryobject);
Debug.locals.put("slotEntryObject", _slotentryobject);
 BA.debugLineNum = 84;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
Debug.ShouldStop(524288);
_slotentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slotentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotentryobject);Debug.locals.put("slotEntry", _slotentry);Debug.locals.put("slotEntry", _slotentry);
 BA.debugLineNum = 85;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"s";
Debug.ShouldStop(1048576);
_slotminutes = BA.numberCast(int.class, _slotentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 86;BA.debugLine="If slotMinutes <= nowMinutes And slotMinutes >=";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("k",_slotminutes,BA.numberCast(double.class, _nowminutes)) && RemoteObject.solveBoolean("g",_slotminutes,BA.numberCast(double.class, _selectedminutes))) { 
 BA.debugLineNum = 87;BA.debugLine="selectedSlot = slotEntry";
Debug.ShouldStop(4194304);
_selectedslot = _slotentry;Debug.locals.put("selectedSlot", _selectedslot);
 BA.debugLineNum = 88;BA.debugLine="selectedMinutes = slotMinutes";
Debug.ShouldStop(8388608);
_selectedminutes = _slotminutes;Debug.locals.put("selectedMinutes", _selectedminutes);
 };
 }
}Debug.locals.put("slotEntryObject", _slotentryobject);
;
 BA.debugLineNum = 91;BA.debugLine="If selectedSlot.Size = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_selectedslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 92;BA.debugLine="selectedMinutes = 24 * 60 + 1";
Debug.ShouldStop(134217728);
_selectedminutes = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(24),RemoteObject.createImmutable(60),RemoteObject.createImmutable(1)}, "*+",1, 1);Debug.locals.put("selectedMinutes", _selectedminutes);
 BA.debugLineNum = 93;BA.debugLine="For Each slotEntryObject As Object In matchedSlo";
Debug.ShouldStop(268435456);
{
final RemoteObject group52 = _matchedslots;
final int groupLen52 = group52.runMethod(true,"getSize").<Integer>get()
;int index52 = 0;
;
for (; index52 < groupLen52;index52++){
_slotentryobject = group52.runMethod(false,"Get",index52);Debug.locals.put("slotEntryObject", _slotentryobject);
Debug.locals.put("slotEntryObject", _slotentryobject);
 BA.debugLineNum = 94;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
Debug.ShouldStop(536870912);
_slotentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slotentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotentryobject);Debug.locals.put("slotEntry", _slotentry);Debug.locals.put("slotEntry", _slotentry);
 BA.debugLineNum = 95;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"";
Debug.ShouldStop(1073741824);
_slotminutes = BA.numberCast(int.class, _slotentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 96;BA.debugLine="If slotMinutes > nowMinutes And slotMinutes < s";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_slotminutes,BA.numberCast(double.class, _nowminutes)) && RemoteObject.solveBoolean("<",_slotminutes,BA.numberCast(double.class, _selectedminutes))) { 
 BA.debugLineNum = 97;BA.debugLine="selectedSlot = slotEntry";
Debug.ShouldStop(1);
_selectedslot = _slotentry;Debug.locals.put("selectedSlot", _selectedslot);
 BA.debugLineNum = 98;BA.debugLine="selectedMinutes = slotMinutes";
Debug.ShouldStop(2);
_selectedminutes = _slotminutes;Debug.locals.put("selectedMinutes", _selectedminutes);
 };
 }
}Debug.locals.put("slotEntryObject", _slotentryobject);
;
 };
 BA.debugLineNum = 102;BA.debugLine="Return selectedSlot";
Debug.ShouldStop(32);
if (true) return _selectedslot;
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvenextdataslot(RemoteObject __ref,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("ResolveNextDataSlot (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("resolvenextdataslot")) { return __ref.runUserSub(false, "dataplaybackresolver","resolvenextdataslot", __ref, _offlinedata);}
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 105;BA.debugLine="Public Sub ResolveNextDataSlot(offlineData As Map)";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Return ResolveNextDataSlotAtTicks(offlineData, Da";
Debug.ShouldStop(512);
if (true) return __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvenextdataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvenextdataslotatticks(RemoteObject __ref,RemoteObject _offlinedata,RemoteObject _referenceticks) throws Exception{
try {
		Debug.PushSubsStack("ResolveNextDataSlotAtTicks (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("resolvenextdataslotatticks")) { return __ref.runUserSub(false, "dataplaybackresolver","resolvenextdataslotatticks", __ref, _offlinedata, _referenceticks);}
RemoteObject _nextslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _schedules = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nowticks = RemoteObject.createImmutable(0L);
RemoteObject _bestslotticks = RemoteObject.createImmutable(0L);
int _dayoffset = 0;
RemoteObject _dayticks = RemoteObject.createImmutable(0L);
RemoteObject _daykey = RemoteObject.createImmutable("");
RemoteObject _dayweekday = RemoteObject.createImmutable("");
RemoteObject _scheduleobject = RemoteObject.declareNull("Object");
RemoteObject _schedule = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _scheduletitle = RemoteObject.createImmutable("");
RemoteObject _slots = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _slotobject = RemoteObject.declareNull("Object");
RemoteObject _slot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slottime = RemoteObject.createImmutable("");
RemoteObject _slotminutes = RemoteObject.createImmutable(0);
RemoteObject _slotticks = RemoteObject.createImmutable(0L);
RemoteObject _streamdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("referenceTicks", _referenceticks);
 BA.debugLineNum = 110;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(offlineData";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Dim nextSlot As Map";
Debug.ShouldStop(16384);
_nextslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("nextSlot", _nextslot);
 BA.debugLineNum = 112;BA.debugLine="nextSlot.Initialize";
Debug.ShouldStop(32768);
_nextslot.runVoidMethod ("Initialize");
 BA.debugLineNum = 113;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _nextslot;};
 BA.debugLineNum = 114;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
Debug.ShouldStop(131072);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 115;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_schedules.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _nextslot;};
 BA.debugLineNum = 116;BA.debugLine="Dim nowTicks As Long = referenceTicks";
Debug.ShouldStop(524288);
_nowticks = _referenceticks;Debug.locals.put("nowTicks", _nowticks);Debug.locals.put("nowTicks", _nowticks);
 BA.debugLineNum = 117;BA.debugLine="Dim bestSlotTicks As Long = 0";
Debug.ShouldStop(1048576);
_bestslotticks = BA.numberCast(long.class, 0);Debug.locals.put("bestSlotTicks", _bestslotticks);Debug.locals.put("bestSlotTicks", _bestslotticks);
 BA.debugLineNum = 118;BA.debugLine="For dayOffset = 0 To 7";
Debug.ShouldStop(2097152);
{
final int step8 = 1;
final int limit8 = 7;
_dayoffset = 0 ;
for (;(step8 > 0 && _dayoffset <= limit8) || (step8 < 0 && _dayoffset >= limit8) ;_dayoffset = ((int)(0 + _dayoffset + step8))  ) {
Debug.locals.put("dayOffset", _dayoffset);
 BA.debugLineNum = 119;BA.debugLine="Dim dayTicks As Long = StartOfDayTicks(nowTicks";
Debug.ShouldStop(4194304);
_dayticks = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_startofdayticks" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_nowticks,RemoteObject.createImmutable(_dayoffset),dataplaybackresolver.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "+*",1, 2)));Debug.locals.put("dayTicks", _dayticks);Debug.locals.put("dayTicks", _dayticks);
 BA.debugLineNum = 120;BA.debugLine="Dim dayKey As String = FormatIsoDate(dayTicks)";
Debug.ShouldStop(8388608);
_daykey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_formatisodate" /*RemoteObject*/ ,(Object)(_dayticks));Debug.locals.put("dayKey", _daykey);Debug.locals.put("dayKey", _daykey);
 BA.debugLineNum = 121;BA.debugLine="Dim dayWeekday As String = IsoWeekdayFromTicks(d";
Debug.ShouldStop(16777216);
_dayweekday = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_isoweekdayfromticks" /*RemoteObject*/ ,(Object)(_dayticks));Debug.locals.put("dayWeekday", _dayweekday);Debug.locals.put("dayWeekday", _dayweekday);
 BA.debugLineNum = 122;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(33554432);
{
final RemoteObject group12 = _schedules;
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_scheduleobject = group12.runMethod(false,"Get",index12);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 123;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 124;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(134217728);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 125;BA.debugLine="If ScheduleAppliesOnDate(schedule, dayKey, day";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_scheduleappliesondate" /*RemoteObject*/ ,(Object)(_schedule),(Object)(_daykey),(Object)(_dayweekday)),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 126;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefa";
Debug.ShouldStop(536870912);
_scheduletitle = BA.ObjectToString(_schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("scheduleTitle", _scheduletitle);Debug.locals.put("scheduleTitle", _scheduletitle);
 BA.debugLineNum = 127;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots";
Debug.ShouldStop(1073741824);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 128;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 129;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(1);
{
final RemoteObject group19 = _slots;
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_slotobject = group19.runMethod(false,"Get",index19);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 130;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 131;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(4);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 132;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"ti";
Debug.ShouldStop(8);
_slottime = BA.ObjectToString(_slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotTime", _slottime);Debug.locals.put("slotTime", _slottime);
 BA.debugLineNum = 133;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes";
Debug.ShouldStop(16);
_slotminutes = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_timestringtominutes" /*RemoteObject*/ ,(Object)(_slottime));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 134;BA.debugLine="If slotMinutes < 0 Then Continue";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",_slotminutes,BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 135;BA.debugLine="Dim slotTicks As Long = dayTicks + slotMinut";
Debug.ShouldStop(64);
_slotticks = RemoteObject.solve(new RemoteObject[] {_dayticks,_slotminutes,dataplaybackresolver.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "+*",1, 2);Debug.locals.put("slotTicks", _slotticks);Debug.locals.put("slotTicks", _slotticks);
 BA.debugLineNum = 136;BA.debugLine="If slotTicks <= nowTicks Then Continue";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("k",_slotticks,_nowticks)) { 
if (true) continue;};
 BA.debugLineNum = 137;BA.debugLine="If bestSlotTicks > 0 And slotTicks >= bestSl";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_bestslotticks,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("g",_slotticks,_bestslotticks)) { 
if (true) continue;};
 BA.debugLineNum = 138;BA.debugLine="Dim streamData As Map = ExtractSlotStreamDat";
Debug.ShouldStop(512);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 139;BA.debugLine="nextSlot.Initialize";
Debug.ShouldStop(1024);
_nextslot.runVoidMethod ("Initialize");
 BA.debugLineNum = 140;BA.debugLine="nextSlot.Put(\"schedule_title\", scheduleTitle";
Debug.ShouldStop(2048);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((_scheduletitle)));
 BA.debugLineNum = 141;BA.debugLine="nextSlot.Put(\"slot_time\", slotTime)";
Debug.ShouldStop(4096);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((_slottime)));
 BA.debugLineNum = 142;BA.debugLine="nextSlot.Put(\"slot_minutes\", slotMinutes)";
Debug.ShouldStop(8192);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)((_slotminutes)));
 BA.debugLineNum = 143;BA.debugLine="nextSlot.Put(\"slot_ticks\", slotTicks)";
Debug.ShouldStop(16384);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_ticks"))),(Object)((_slotticks)));
 BA.debugLineNum = 144;BA.debugLine="nextSlot.Put(\"stream_id\", streamData.GetDefa";
Debug.ShouldStop(32768);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 145;BA.debugLine="nextSlot.Put(\"stream_title\", streamData.GetD";
Debug.ShouldStop(65536);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 146;BA.debugLine="nextSlot.Put(\"playlists\", streamData.GetDefa";
Debug.ShouldStop(131072);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 147;BA.debugLine="bestSlotTicks = slotTicks";
Debug.ShouldStop(262144);
_bestslotticks = _slotticks;Debug.locals.put("bestSlotTicks", _bestslotticks);
 };
 }
}Debug.locals.put("slotObject", _slotobject);
;
 };
 }
}Debug.locals.put("scheduleObject", _scheduleobject);
;
 BA.debugLineNum = 152;BA.debugLine="If nextSlot.IsInitialized And nextSlot.Size > 0";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(".",_nextslot.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_nextslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) break;};
 }
}Debug.locals.put("dayOffset", _dayoffset);
;
 BA.debugLineNum = 154;BA.debugLine="Return nextSlot";
Debug.ShouldStop(33554432);
if (true) return _nextslot;
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveofflinestreamtitle(RemoteObject __ref,RemoteObject _currentslot,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("ResolveOfflineStreamTitle (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("resolveofflinestreamtitle")) { return __ref.runUserSub(false, "dataplaybackresolver","resolveofflinestreamtitle", __ref, _currentslot, _offlinedata);}
RemoteObject _targetstreamid = RemoteObject.createImmutable("");
RemoteObject _targetslottime = RemoteObject.createImmutable("");
RemoteObject _schedules = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _scheduleobject = RemoteObject.declareNull("Object");
RemoteObject _schedule = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slots = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _slotobject = RemoteObject.declareNull("Object");
RemoteObject _slot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _streamdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _streamtitle = RemoteObject.createImmutable("");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 533;BA.debugLine="Private Sub ResolveOfflineStreamTitle(currentSlot";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 534;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 535;BA.debugLine="Dim targetStreamId As String = currentSlot.GetDef";
Debug.ShouldStop(4194304);
_targetstreamid = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("targetStreamId", _targetstreamid);Debug.locals.put("targetStreamId", _targetstreamid);
 BA.debugLineNum = 536;BA.debugLine="Dim targetSlotTime As String = currentSlot.GetDef";
Debug.ShouldStop(8388608);
_targetslottime = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("targetSlotTime", _targetslottime);Debug.locals.put("targetSlotTime", _targetslottime);
 BA.debugLineNum = 537;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
Debug.ShouldStop(16777216);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 538;BA.debugLine="If schedules.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 539;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(67108864);
{
final RemoteObject group6 = _schedules;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_scheduleobject = group6.runMethod(false,"Get",index6);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 540;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 541;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(268435456);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 542;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
Debug.ShouldStop(536870912);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 543;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 544;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(-2147483648);
{
final RemoteObject group11 = _slots;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.runMethod(false,"Get",index11);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 545;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 546;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(2);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 547;BA.debugLine="If targetSlotTime <> \"\" And slot.GetDefault(\"";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_targetslottime,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))),(_targetslottime))) { 
if (true) continue;};
 BA.debugLineNum = 548;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
Debug.ShouldStop(8);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 549;BA.debugLine="If targetStreamId <> \"\" And streamData.GetDef";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_targetstreamid,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),(_targetstreamid))) { 
if (true) continue;};
 BA.debugLineNum = 550;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
Debug.ShouldStop(32);
_streamtitle = BA.ObjectToString(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamTitle", _streamtitle);Debug.locals.put("streamTitle", _streamtitle);
 BA.debugLineNum = 551;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_streamtitle,BA.ObjectToString(""))) { 
if (true) return _streamtitle;};
 };
 }
}Debug.locals.put("slotObject", _slotobject);
;
 };
 }
}Debug.locals.put("scheduleObject", _scheduleobject);
;
 BA.debugLineNum = 556;BA.debugLine="Return \"\"";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 557;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveorderedcachedtrackfromplaylistbyid(RemoteObject __ref,RemoteObject _playlistid,RemoteObject _mediacacheservice) throws Exception{
try {
		Debug.PushSubsStack("ResolveOrderedCachedTrackFromPlaylistById (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("resolveorderedcachedtrackfromplaylistbyid")) { return __ref.runUserSub(false, "dataplaybackresolver","resolveorderedcachedtrackfromplaylistbyid", __ref, _playlistid, _mediacacheservice);}
RemoteObject _emptytrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _manifest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlisttitle = RemoteObject.createImmutable("");
RemoteObject _order = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cursorkey = RemoteObject.createImmutable("");
RemoteObject _storedcursor = RemoteObject.createImmutable(0);
RemoteObject _trackindexkey = RemoteObject.createImmutable("");
RemoteObject _storedtrackindexvalue = RemoteObject.createImmutable(0);
RemoteObject _storedtrackindex = RemoteObject.createImmutable(0);
RemoteObject _selectedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _startindex = RemoteObject.createImmutable(0);
int _offset = 0;
RemoteObject _orderindex = RemoteObject.createImmutable(0);
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _trackobject = RemoteObject.declareNull("Object");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fallbackorderindex = RemoteObject.createImmutable(0);
RemoteObject _fallbacktrackid = RemoteObject.createImmutable("");
RemoteObject _fallbacktrackobject = RemoteObject.declareNull("Object");
Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("mediaCacheService", _mediacacheservice);
 BA.debugLineNum = 198;BA.debugLine="Public Sub ResolveOrderedCachedTrackFromPlaylistBy";
Debug.ShouldStop(32);
 BA.debugLineNum = 199;BA.debugLine="Dim emptyTrack As Map";
Debug.ShouldStop(64);
_emptytrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyTrack", _emptytrack);
 BA.debugLineNum = 200;BA.debugLine="emptyTrack.Initialize";
Debug.ShouldStop(128);
_emptytrack.runVoidMethod ("Initialize");
 BA.debugLineNum = 201;BA.debugLine="If storageRef.IsInitialized = False Then Return e";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_storageref" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 202;BA.debugLine="If playlistId = \"\" Then Return emptyTrack";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 203;BA.debugLine="Dim manifest As Map = LoadOrBuildPlaylistPlayback";
Debug.ShouldStop(1024);
_manifest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_manifest = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_loadorbuildplaylistplaybackmanifestbyid" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("manifest", _manifest);Debug.locals.put("manifest", _manifest);
 BA.debugLineNum = 204;BA.debugLine="If manifest.IsInitialized = False Or manifest.Siz";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_manifest.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_manifest.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 205;BA.debugLine="Dim playlistTitle As String = manifest.GetDefault";
Debug.ShouldStop(4096);
_playlisttitle = BA.ObjectToString(_manifest.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistTitle", _playlisttitle);Debug.locals.put("playlistTitle", _playlisttitle);
 BA.debugLineNum = 206;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
Debug.ShouldStop(8192);
_order = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_order = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _manifest.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("order"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("order", _order);Debug.locals.put("order", _order);
 BA.debugLineNum = 207;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_order.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_order.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 208;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
Debug.ShouldStop(32768);
_trackmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_trackmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _manifest.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("trackMap", _trackmap);Debug.locals.put("trackMap", _trackmap);
 BA.debugLineNum = 209;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_trackmap.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_trackmap.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 210;BA.debugLine="Dim cursorKey As String = PlaylistPlaybackCursorK";
Debug.ShouldStop(131072);
_cursorkey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistplaybackcursorkey" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("cursorKey", _cursorkey);Debug.locals.put("cursorKey", _cursorkey);
 BA.debugLineNum = 211;BA.debugLine="Dim storedCursor As Int = storageRef.GetDefault(c";
Debug.ShouldStop(262144);
_storedcursor = BA.numberCast(int.class, __ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(_cursorkey),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("storedCursor", _storedcursor);Debug.locals.put("storedCursor", _storedcursor);
 BA.debugLineNum = 212;BA.debugLine="Dim trackIndexKey As String = PlaylistTrackIndexK";
Debug.ShouldStop(524288);
_trackindexkey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlisttrackindexkey" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("trackIndexKey", _trackindexkey);Debug.locals.put("trackIndexKey", _trackindexkey);
 BA.debugLineNum = 213;BA.debugLine="Dim storedTrackIndexValue As Int = storageRef.Get";
Debug.ShouldStop(1048576);
_storedtrackindexvalue = BA.numberCast(int.class, __ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(_trackindexkey),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("storedTrackIndexValue", _storedtrackindexvalue);Debug.locals.put("storedTrackIndexValue", _storedtrackindexvalue);
 BA.debugLineNum = 214;BA.debugLine="If storedCursor < 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",_storedcursor,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 215;BA.debugLine="If storedTrackIndexValue >= 0 Then storedCursor";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("g",_storedtrackindexvalue,BA.numberCast(double.class, 0))) { 
_storedcursor = RemoteObject.solve(new RemoteObject[] {_storedtrackindexvalue,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("storedCursor", _storedcursor);};
 };
 BA.debugLineNum = 217;BA.debugLine="Dim storedTrackIndex As Int = storedCursor - 1";
Debug.ShouldStop(16777216);
_storedtrackindex = RemoteObject.solve(new RemoteObject[] {_storedcursor,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("storedTrackIndex", _storedtrackindex);Debug.locals.put("storedTrackIndex", _storedtrackindex);
 BA.debugLineNum = 218;BA.debugLine="If storedTrackIndex >= order.Size Then storedTrac";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("g",_storedtrackindex,BA.numberCast(double.class, _order.runMethod(true,"getSize")))) { 
_storedtrackindex = RemoteObject.solve(new RemoteObject[] {_storedtrackindex,_order.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("storedTrackIndex", _storedtrackindex);};
 BA.debugLineNum = 219;BA.debugLine="Trace(\"playlist resolve start playlistId=\" & play";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("playlist resolve start playlistId="),_playlistid,RemoteObject.createImmutable(" orderSize="),_order.runMethod(true,"getSize"),RemoteObject.createImmutable(" storedCursor="),_storedcursor,RemoteObject.createImmutable(" storedTrackIndexKey="),_storedtrackindexvalue,RemoteObject.createImmutable(" effectiveStoredTrackIndex="),_storedtrackindex)));
 BA.debugLineNum = 220;BA.debugLine="Dim selectedTrack As Map";
Debug.ShouldStop(134217728);
_selectedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("selectedTrack", _selectedtrack);
 BA.debugLineNum = 221;BA.debugLine="selectedTrack.Initialize";
Debug.ShouldStop(268435456);
_selectedtrack.runVoidMethod ("Initialize");
 BA.debugLineNum = 222;BA.debugLine="Dim startIndex As Int = storedTrackIndex + 1";
Debug.ShouldStop(536870912);
_startindex = RemoteObject.solve(new RemoteObject[] {_storedtrackindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("startIndex", _startindex);Debug.locals.put("startIndex", _startindex);
 BA.debugLineNum = 223;BA.debugLine="If startIndex < 0 Then startIndex = 0";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",_startindex,BA.numberCast(double.class, 0))) { 
_startindex = BA.numberCast(int.class, 0);Debug.locals.put("startIndex", _startindex);};
 BA.debugLineNum = 224;BA.debugLine="If startIndex >= order.Size Then startIndex = sta";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("g",_startindex,BA.numberCast(double.class, _order.runMethod(true,"getSize")))) { 
_startindex = RemoteObject.solve(new RemoteObject[] {_startindex,_order.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("startIndex", _startindex);};
 BA.debugLineNum = 225;BA.debugLine="For offset = 0 To order.Size - 1";
Debug.ShouldStop(1);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_order.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_offset = 0 ;
for (;(step27 > 0 && _offset <= limit27) || (step27 < 0 && _offset >= limit27) ;_offset = ((int)(0 + _offset + step27))  ) {
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 226;BA.debugLine="Dim orderIndex As Int = (startIndex + offset) Mo";
Debug.ShouldStop(2);
_orderindex = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_startindex,RemoteObject.createImmutable(_offset)}, "+",1, 1)),_order.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("orderIndex", _orderindex);Debug.locals.put("orderIndex", _orderindex);
 BA.debugLineNum = 227;BA.debugLine="Dim trackId As String = order.Get(orderIndex)";
Debug.ShouldStop(4);
_trackid = BA.ObjectToString(_order.runMethod(false,"Get",(Object)(_orderindex)));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 228;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 229;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("g",_storedtrackindex,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_order.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_orderindex,BA.numberCast(double.class, _storedtrackindex))) { 
 BA.debugLineNum = 230;BA.debugLine="Trace(\"playlist resolve skip_current playlistId";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("playlist resolve skip_current playlistId="),_playlistid,RemoteObject.createImmutable(" orderIndex="),_orderindex,RemoteObject.createImmutable(" trackId="),_trackid)));
 BA.debugLineNum = 231;BA.debugLine="Continue";
Debug.ShouldStop(64);
if (true) continue;
 };
 BA.debugLineNum = 233;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
Debug.ShouldStop(256);
_trackobject = _trackmap.runMethod(false,"GetDefault",(Object)((_trackid)),(Object)(dataplaybackresolver.__c.getField(false,"Null")));Debug.locals.put("trackObject", _trackobject);Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 234;BA.debugLine="If (trackObject Is Map) = False Then Continue";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map")))),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 235;BA.debugLine="Dim track As Map = trackObject";
Debug.ShouldStop(1024);
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_track = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 236;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(trac";
Debug.ShouldStop(2048);
if (_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_track)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 237;BA.debugLine="storageRef.Put(trackIndexKey, orderIndex)";
Debug.ShouldStop(4096);
__ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_trackindexkey),(Object)((_orderindex)));
 BA.debugLineNum = 238;BA.debugLine="storageRef.Put(cursorKey, orderIndex + 1)";
Debug.ShouldStop(8192);
__ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_cursorkey),(Object)((RemoteObject.solve(new RemoteObject[] {_orderindex,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 239;BA.debugLine="selectedTrack = CloneMap(track)";
Debug.ShouldStop(16384);
_selectedtrack = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,(Object)(_track));Debug.locals.put("selectedTrack", _selectedtrack);
 BA.debugLineNum = 240;BA.debugLine="selectedTrack.Put(\"playlist_track_index\", order";
Debug.ShouldStop(32768);
_selectedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_track_index"))),(Object)((_orderindex)));
 BA.debugLineNum = 241;BA.debugLine="selectedTrack.Put(\"playlist_cursor\", orderIndex";
Debug.ShouldStop(65536);
_selectedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_cursor"))),(Object)((RemoteObject.solve(new RemoteObject[] {_orderindex,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 242;BA.debugLine="selectedTrack.Put(\"playlist_title\", playlistTit";
Debug.ShouldStop(131072);
_selectedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)((_playlisttitle)));
 BA.debugLineNum = 243;BA.debugLine="Trace(\"playlist resolve selected playlistId=\" &";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("playlist resolve selected playlistId="),_playlistid,RemoteObject.createImmutable(" orderIndex="),_orderindex,RemoteObject.createImmutable(" nextCursor="),(RemoteObject.solve(new RemoteObject[] {_orderindex,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(" trackId="),_trackid)));
 BA.debugLineNum = 244;BA.debugLine="Exit";
Debug.ShouldStop(524288);
if (true) break;
 }else {
 };
 }
}Debug.locals.put("offset", _offset);
;
 BA.debugLineNum = 249;BA.debugLine="If selectedTrack.IsInitialized = False Or selecte";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_selectedtrack.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_selectedtrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 250;BA.debugLine="For offset = 0 To order.Size - 1";
Debug.ShouldStop(33554432);
{
final int step51 = 1;
final int limit51 = RemoteObject.solve(new RemoteObject[] {_order.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_offset = 0 ;
for (;(step51 > 0 && _offset <= limit51) || (step51 < 0 && _offset >= limit51) ;_offset = ((int)(0 + _offset + step51))  ) {
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 251;BA.debugLine="Dim fallbackOrderIndex As Int = (startIndex + o";
Debug.ShouldStop(67108864);
_fallbackorderindex = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_startindex,RemoteObject.createImmutable(_offset)}, "+",1, 1)),_order.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("fallbackOrderIndex", _fallbackorderindex);Debug.locals.put("fallbackOrderIndex", _fallbackorderindex);
 BA.debugLineNum = 252;BA.debugLine="Dim fallbackTrackId As String = order.Get(fallb";
Debug.ShouldStop(134217728);
_fallbacktrackid = BA.ObjectToString(_order.runMethod(false,"Get",(Object)(_fallbackorderindex)));Debug.locals.put("fallbackTrackId", _fallbacktrackid);Debug.locals.put("fallbackTrackId", _fallbacktrackid);
 BA.debugLineNum = 253;BA.debugLine="If fallbackTrackId = \"\" Then Continue";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_fallbacktrackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 254;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("g",_storedtrackindex,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_order.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_fallbackorderindex,BA.numberCast(double.class, _storedtrackindex))) { 
if (true) continue;};
 BA.debugLineNum = 255;BA.debugLine="If mediaCacheService.IsTrackCached(fallbackTrac";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_fallbacktrackid)),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 256;BA.debugLine="Dim fallbackTrackObject As Object = trackMap.Ge";
Debug.ShouldStop(-2147483648);
_fallbacktrackobject = _trackmap.runMethod(false,"GetDefault",(Object)((_fallbacktrackid)),(Object)(dataplaybackresolver.__c.getField(false,"Null")));Debug.locals.put("fallbackTrackObject", _fallbacktrackobject);Debug.locals.put("fallbackTrackObject", _fallbacktrackobject);
 BA.debugLineNum = 257;BA.debugLine="If (fallbackTrackObject Is Map) = False Then Co";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_fallbacktrackobject, RemoteObject.createImmutable("java.util.Map")))),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 258;BA.debugLine="selectedTrack = CloneMap(fallbackTrackObject)";
Debug.ShouldStop(2);
_selectedtrack = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _fallbacktrackobject));Debug.locals.put("selectedTrack", _selectedtrack);
 BA.debugLineNum = 259;BA.debugLine="selectedTrack.Put(\"playlist_title\", playlistTit";
Debug.ShouldStop(4);
_selectedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)((_playlisttitle)));
 BA.debugLineNum = 260;BA.debugLine="storageRef.Put(trackIndexKey, fallbackOrderInde";
Debug.ShouldStop(8);
__ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_trackindexkey),(Object)((_fallbackorderindex)));
 BA.debugLineNum = 261;BA.debugLine="storageRef.Put(cursorKey, fallbackOrderIndex +";
Debug.ShouldStop(16);
__ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_cursorkey),(Object)((RemoteObject.solve(new RemoteObject[] {_fallbackorderindex,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 262;BA.debugLine="selectedTrack.Put(\"playlist_track_index\", fallb";
Debug.ShouldStop(32);
_selectedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_track_index"))),(Object)((_fallbackorderindex)));
 BA.debugLineNum = 263;BA.debugLine="selectedTrack.Put(\"playlist_cursor\", fallbackOr";
Debug.ShouldStop(64);
_selectedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_cursor"))),(Object)((RemoteObject.solve(new RemoteObject[] {_fallbackorderindex,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 264;BA.debugLine="Trace(\"playlist resolve fallback_index playlist";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("playlist resolve fallback_index playlistId="),_playlistid,RemoteObject.createImmutable(" orderIndex="),_fallbackorderindex,RemoteObject.createImmutable(" trackId="),_fallbacktrackid)));
 BA.debugLineNum = 265;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 }
}Debug.locals.put("offset", _offset);
;
 BA.debugLineNum = 267;BA.debugLine="If selectedTrack.IsInitialized = False Or select";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_selectedtrack.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_selectedtrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 268;BA.debugLine="Trace(\"playlist resolve empty playlistId=\" & pl";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("playlist resolve empty playlistId="),_playlistid,RemoteObject.createImmutable(" orderSize="),_order.runMethod(true,"getSize"))));
 };
 };
 BA.debugLineNum = 271;BA.debugLine="If selectedTrack.IsInitialized And selectedTrack.";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",_selectedtrack.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_selectedtrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _selectedtrack;};
 BA.debugLineNum = 272;BA.debugLine="Return emptyTrack";
Debug.ShouldStop(32768);
if (true) return _emptytrack;
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveplaybackstreamtitle(RemoteObject __ref,RemoteObject _currentslot,RemoteObject _playlistdescriptor,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("ResolvePlaybackStreamTitle (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,521);
if (RapidSub.canDelegate("resolveplaybackstreamtitle")) { return __ref.runUserSub(false, "dataplaybackresolver","resolveplaybackstreamtitle", __ref, _currentslot, _playlistdescriptor, _offlinedata);}
RemoteObject _streamtitle = RemoteObject.createImmutable("");
RemoteObject _resolvedstreamtitle = RemoteObject.createImmutable("");
RemoteObject _scheduletitle = RemoteObject.createImmutable("");
RemoteObject _descriptorstreamtitle = RemoteObject.createImmutable("");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("playlistDescriptor", _playlistdescriptor);
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 521;BA.debugLine="Private Sub ResolvePlaybackStreamTitle(currentSlot";
Debug.ShouldStop(256);
 BA.debugLineNum = 522;BA.debugLine="Dim streamTitle As String = currentSlot.GetDefaul";
Debug.ShouldStop(512);
_streamtitle = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamTitle", _streamtitle);Debug.locals.put("streamTitle", _streamtitle);
 BA.debugLineNum = 523;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",_streamtitle,BA.ObjectToString(""))) { 
if (true) return _streamtitle;};
 BA.debugLineNum = 524;BA.debugLine="Dim resolvedStreamTitle As String = ResolveOfflin";
Debug.ShouldStop(2048);
_resolvedstreamtitle = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolveofflinestreamtitle" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_offlinedata));Debug.locals.put("resolvedStreamTitle", _resolvedstreamtitle);Debug.locals.put("resolvedStreamTitle", _resolvedstreamtitle);
 BA.debugLineNum = 525;BA.debugLine="If resolvedStreamTitle <> \"\" Then Return resolved";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_resolvedstreamtitle,BA.ObjectToString(""))) { 
if (true) return _resolvedstreamtitle;};
 BA.debugLineNum = 526;BA.debugLine="Dim scheduleTitle As String = currentSlot.GetDefa";
Debug.ShouldStop(8192);
_scheduletitle = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("scheduleTitle", _scheduletitle);Debug.locals.put("scheduleTitle", _scheduletitle);
 BA.debugLineNum = 527;BA.debugLine="Dim descriptorStreamTitle As String = playlistDes";
Debug.ShouldStop(16384);
_descriptorstreamtitle = BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("descriptorStreamTitle", _descriptorstreamtitle);Debug.locals.put("descriptorStreamTitle", _descriptorstreamtitle);
 BA.debugLineNum = 528;BA.debugLine="If descriptorStreamTitle <> \"\" Then Return descri";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_descriptorstreamtitle,BA.ObjectToString(""))) { 
if (true) return _descriptorstreamtitle;};
 BA.debugLineNum = 529;BA.debugLine="If scheduleTitle <> \"\" Then Return scheduleTitle";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",_scheduletitle,BA.ObjectToString(""))) { 
if (true) return _scheduletitle;};
 BA.debugLineNum = 530;BA.debugLine="Return playlistDescriptor.GetDefault(\"title\", \"\")";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 531;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savepreviewplaylistcursors(RemoteObject __ref,RemoteObject _storage,RemoteObject _workingcursors) throws Exception{
try {
		Debug.PushSubsStack("SavePreviewPlaylistCursors (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,515);
if (RapidSub.canDelegate("savepreviewplaylistcursors")) { return __ref.runUserSub(false, "dataplaybackresolver","savepreviewplaylistcursors", __ref, _storage, _workingcursors);}
Debug.locals.put("storage", _storage);
Debug.locals.put("workingCursors", _workingcursors);
 BA.debugLineNum = 515;BA.debugLine="Public Sub SavePreviewPlaylistCursors(storage As K";
Debug.ShouldStop(4);
 BA.debugLineNum = 516;BA.debugLine="If workingCursors.IsInitialized = False Or workin";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_workingcursors.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_workingcursors.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 517;BA.debugLine="playlistCursors = CloneMap(workingCursors)";
Debug.ShouldStop(16);
__ref.setField ("_playlistcursors" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,(Object)(_workingcursors)));
 BA.debugLineNum = 518;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
Debug.ShouldStop(32);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("data_slot_playlist_cursors")),(Object)((__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 519;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scheduleappliesondate(RemoteObject __ref,RemoteObject _schedule,RemoteObject _targetdatekey,RemoteObject _targetweekday) throws Exception{
try {
		Debug.PushSubsStack("ScheduleAppliesOnDate (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,577);
if (RapidSub.canDelegate("scheduleappliesondate")) { return __ref.runUserSub(false, "dataplaybackresolver","scheduleappliesondate", __ref, _schedule, _targetdatekey, _targetweekday);}
RemoteObject _startdate = RemoteObject.createImmutable("");
RemoteObject _weekdays = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _weekdayobject = RemoteObject.declareNull("Object");
Debug.locals.put("schedule", _schedule);
Debug.locals.put("targetDateKey", _targetdatekey);
Debug.locals.put("targetWeekday", _targetweekday);
 BA.debugLineNum = 577;BA.debugLine="Private Sub ScheduleAppliesOnDate(schedule As Map,";
Debug.ShouldStop(1);
 BA.debugLineNum = 578;BA.debugLine="Dim startDate As String = schedule.GetDefault(\"st";
Debug.ShouldStop(2);
_startdate = BA.ObjectToString(_schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("start"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("startDate", _startdate);Debug.locals.put("startDate", _startdate);
 BA.debugLineNum = 579;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(target";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_startdate,BA.ObjectToString("")) && RemoteObject.solveBoolean(">",_startdate.runMethod(true,"compareTo",(Object)(_targetdatekey)),BA.numberCast(double.class, 0))) { 
if (true) return dataplaybackresolver.__c.getField(true,"False");};
 BA.debugLineNum = 580;BA.debugLine="Dim weekdays As List = schedule.GetDefault(\"weekd";
Debug.ShouldStop(8);
_weekdays = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_weekdays = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weekdays"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("weekdays", _weekdays);Debug.locals.put("weekdays", _weekdays);
 BA.debugLineNum = 581;BA.debugLine="If weekdays.IsInitialized = False Or weekdays.Siz";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_weekdays.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_weekdays.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return dataplaybackresolver.__c.getField(true,"True");};
 BA.debugLineNum = 582;BA.debugLine="For Each weekdayObject As Object In weekdays";
Debug.ShouldStop(32);
{
final RemoteObject group5 = _weekdays;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_weekdayobject = group5.runMethod(false,"Get",index5);Debug.locals.put("weekdayObject", _weekdayobject);
Debug.locals.put("weekdayObject", _weekdayobject);
 BA.debugLineNum = 583;BA.debugLine="If (\"\" & weekdayObject).Trim = targetWeekday The";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",(RemoteObject.concat(RemoteObject.createImmutable(""),_weekdayobject)).runMethod(true,"trim"),_targetweekday)) { 
if (true) return dataplaybackresolver.__c.getField(true,"True");};
 }
}Debug.locals.put("weekdayObject", _weekdayobject);
;
 BA.debugLineNum = 585;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) return dataplaybackresolver.__c.getField(true,"False");
 BA.debugLineNum = 586;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scheduleappliestoday(RemoteObject __ref,RemoteObject _schedule,RemoteObject _todaykey,RemoteObject _todayweekday) throws Exception{
try {
		Debug.PushSubsStack("ScheduleAppliesToday (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,573);
if (RapidSub.canDelegate("scheduleappliestoday")) { return __ref.runUserSub(false, "dataplaybackresolver","scheduleappliestoday", __ref, _schedule, _todaykey, _todayweekday);}
Debug.locals.put("schedule", _schedule);
Debug.locals.put("todayKey", _todaykey);
Debug.locals.put("todayWeekday", _todayweekday);
 BA.debugLineNum = 573;BA.debugLine="Private Sub ScheduleAppliesToday(schedule As Map,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 574;BA.debugLine="Return ScheduleAppliesOnDate(schedule, todayKey,";
Debug.ShouldStop(536870912);
if (true) return __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_scheduleappliesondate" /*RemoteObject*/ ,(Object)(_schedule),(Object)(_todaykey),(Object)(_todayweekday));
 BA.debugLineNum = 575;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shufflelistinplace(RemoteObject __ref,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("ShuffleListInPlace (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,406);
if (RapidSub.canDelegate("shufflelistinplace")) { return __ref.runUserSub(false, "dataplaybackresolver","shufflelistinplace", __ref, _items);}
int _i = 0;
RemoteObject _j = RemoteObject.createImmutable(0);
RemoteObject _temp = RemoteObject.declareNull("Object");
Debug.locals.put("items", _items);
 BA.debugLineNum = 406;BA.debugLine="Private Sub ShuffleListInPlace(items As List)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 407;BA.debugLine="If items.IsInitialized = False Or items.Size < 2";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_items.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",_items.runMethod(true,"getSize"),BA.numberCast(double.class, 2))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 408;BA.debugLine="For i = items.Size - 1 To 1 Step -1";
Debug.ShouldStop(8388608);
{
final int step2 = -1;
final int limit2 = 1;
_i = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 409;BA.debugLine="Dim j As Int = Rnd(0, i + 1)";
Debug.ShouldStop(16777216);
_j = dataplaybackresolver.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 410;BA.debugLine="If j = i Then Continue";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_j,BA.numberCast(double.class, _i))) { 
if (true) continue;};
 BA.debugLineNum = 411;BA.debugLine="Dim temp As Object = items.Get(i)";
Debug.ShouldStop(67108864);
_temp = _items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("temp", _temp);Debug.locals.put("temp", _temp);
 BA.debugLineNum = 412;BA.debugLine="items.Set(i, items.Get(j))";
Debug.ShouldStop(134217728);
_items.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, _i)),(Object)(_items.runMethod(false,"Get",(Object)(_j))));
 BA.debugLineNum = 413;BA.debugLine="items.Set(j, temp)";
Debug.ShouldStop(268435456);
_items.runVoidMethod ("Set",(Object)(_j),(Object)(_temp));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startofdayticks(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("StartOfDayTicks (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,648);
if (RapidSub.canDelegate("startofdayticks")) { return __ref.runUserSub(false, "dataplaybackresolver","startofdayticks", __ref, _ticks);}
RemoteObject _previousdateformat = RemoteObject.createImmutable("");
RemoteObject _daykey = RemoteObject.createImmutable("");
RemoteObject _dayticks = RemoteObject.createImmutable(0L);
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 648;BA.debugLine="Private Sub StartOfDayTicks(ticks As Long) As Long";
Debug.ShouldStop(128);
 BA.debugLineNum = 649;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
Debug.ShouldStop(256);
_previousdateformat = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("previousDateFormat", _previousdateformat);Debug.locals.put("previousDateFormat", _previousdateformat);
 BA.debugLineNum = 650;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(512);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 651;BA.debugLine="Dim dayKey As String = DateTime.Date(ticks)";
Debug.ShouldStop(1024);
_daykey = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("dayKey", _daykey);Debug.locals.put("dayKey", _daykey);
 BA.debugLineNum = 652;BA.debugLine="Dim dayTicks As Long = DateTime.DateParse(dayKey)";
Debug.ShouldStop(2048);
_dayticks = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_daykey));Debug.locals.put("dayTicks", _dayticks);Debug.locals.put("dayTicks", _dayticks);
 BA.debugLineNum = 653;BA.debugLine="DateTime.DateFormat = previousDateFormat";
Debug.ShouldStop(4096);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_previousdateformat);
 BA.debugLineNum = 654;BA.debugLine="Return dayTicks";
Debug.ShouldStop(8192);
if (true) return _dayticks;
 BA.debugLineNum = 655;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timestringtominutes(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TimeStringToMinutes (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,633);
if (RapidSub.canDelegate("timestringtominutes")) { return __ref.runUserSub(false, "dataplaybackresolver","timestringtominutes", __ref, _value);}
RemoteObject _parts = null;
RemoteObject _hours = RemoteObject.createImmutable(0);
RemoteObject _minutes = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 633;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 634;BA.debugLine="If value = \"\" Then Return -1";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 635;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
Debug.ShouldStop(67108864);
_parts = dataplaybackresolver.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_value));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 636;BA.debugLine="If parts.Length < 2 Then Return -1";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("<",_parts.getField(true,"length"),BA.numberCast(double.class, 2))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 637;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 638;BA.debugLine="Dim hours As Int = parts(0)";
Debug.ShouldStop(536870912);
_hours = BA.numberCast(int.class, _parts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("hours", _hours);Debug.locals.put("hours", _hours);
 BA.debugLineNum = 639;BA.debugLine="Dim minutes As Int = parts(1)";
Debug.ShouldStop(1073741824);
_minutes = BA.numberCast(int.class, _parts.getArrayElement(true,BA.numberCast(int.class, 1)));Debug.locals.put("minutes", _minutes);Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 640;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_hours,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_hours,BA.numberCast(double.class, 23))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 641;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",_minutes,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_minutes,BA.numberCast(double.class, 59))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 642;BA.debugLine="Return hours * 60 + minutes";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.solve(new RemoteObject[] {_hours,RemoteObject.createImmutable(60),_minutes}, "*+",1, 1);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 644;BA.debugLine="Return -1";
Debug.ShouldStop(8);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 };
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trace(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("Trace (dataplaybackresolver) ","dataplaybackresolver",7,__ref.getField(false, "ba"),__ref,679);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "dataplaybackresolver","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 679;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 680;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(128);
if (dataplaybackresolver.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 681;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(256);
dataplaybackresolver.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 683;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}