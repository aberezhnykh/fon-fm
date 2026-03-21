package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dataplaybackresolver_subs_0 {


public static RemoteObject  _builddataslotkey(RemoteObject __ref,RemoteObject _currentslot) throws Exception{
try {
		Debug.PushSubsStack("BuildDataSlotKey (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("builddataslotkey")) { return __ref.runUserSub(false, "dataplaybackresolver","builddataslotkey", __ref, _currentslot);}
Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 272;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
Debug.ShouldStop(65536);
if (true) return RemoteObject.concat(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _choosenextplaylistdescriptor(RemoteObject __ref,RemoteObject _currentslot,RemoteObject _workingcursors) throws Exception{
try {
		Debug.PushSubsStack("ChooseNextPlaylistDescriptor (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,96);
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
 BA.debugLineNum = 96;BA.debugLine="Public Sub ChooseNextPlaylistDescriptor(currentSlo";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim emptyDescriptor As Map";
Debug.ShouldStop(1);
_emptydescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyDescriptor", _emptydescriptor);
 BA.debugLineNum = 98;BA.debugLine="emptyDescriptor.Initialize";
Debug.ShouldStop(2);
_emptydescriptor.runVoidMethod ("Initialize");
 BA.debugLineNum = 99;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(4);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 100;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptydescriptor;};
 BA.debugLineNum = 101;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
Debug.ShouldStop(16);
_slotkey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_currentslot));Debug.locals.put("slotKey", _slotkey);Debug.locals.put("slotKey", _slotkey);
 BA.debugLineNum = 102;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
Debug.ShouldStop(32);
_cursorvalue = BA.numberCast(int.class, _workingcursors.runMethod(false,"GetDefault",(Object)((_slotkey)),(Object)(__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_slotkey)),(Object)(RemoteObject.createImmutable((0)))))));Debug.locals.put("cursorValue", _cursorvalue);Debug.locals.put("cursorValue", _cursorvalue);
 BA.debugLineNum = 103;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",_cursorvalue,BA.numberCast(double.class, 0))) { 
_cursorvalue = BA.numberCast(int.class, 0);Debug.locals.put("cursorValue", _cursorvalue);};
 BA.debugLineNum = 104;BA.debugLine="Dim playlistIndexForSlot As Int = cursorValue Mod";
Debug.ShouldStop(128);
_playlistindexforslot = RemoteObject.solve(new RemoteObject[] {_cursorvalue,_playlists.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("playlistIndexForSlot", _playlistindexforslot);Debug.locals.put("playlistIndexForSlot", _playlistindexforslot);
 BA.debugLineNum = 105;BA.debugLine="workingCursors.Put(slotKey, playlistIndexForSlot";
Debug.ShouldStop(256);
_workingcursors.runVoidMethod ("Put",(Object)((_slotkey)),(Object)((RemoteObject.solve(new RemoteObject[] {_playlistindexforslot,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 106;BA.debugLine="Trace(\"Курсор playlists. slot=\" & slotKey & \", st";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Курсор playlists. slot="),_slotkey,RemoteObject.createImmutable(", stored="),_cursorvalue,RemoteObject.createImmutable(", previewNextStored="),_workingcursors.runMethod(false,"GetDefault",(Object)((_slotkey)),(Object)(RemoteObject.createImmutable((0)))),RemoteObject.createImmutable(", playlists="),_playlists.runMethod(true,"getSize"))));
 BA.debugLineNum = 107;BA.debugLine="Dim playlistObject As Object = playlists.Get(play";
Debug.ShouldStop(1024);
_playlistobject = _playlists.runMethod(false,"Get",(Object)(_playlistindexforslot));Debug.locals.put("playlistObject", _playlistobject);Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 108;BA.debugLine="If playlistObject Is Map Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 109;BA.debugLine="Dim playlistSource As Map = playlistObject";
Debug.ShouldStop(4096);
_playlistsource = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistsource = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlistSource", _playlistsource);Debug.locals.put("playlistSource", _playlistsource);
 BA.debugLineNum = 110;BA.debugLine="Dim playlist As Map = CloneMap(playlistSource)";
Debug.ShouldStop(8192);
_playlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlist = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,(Object)(_playlistsource));Debug.locals.put("playlist", _playlist);Debug.locals.put("playlist", _playlist);
 BA.debugLineNum = 111;BA.debugLine="playlist.Put(\"_slot_key\", slotKey)";
Debug.ShouldStop(16384);
_playlist.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_slot_key"))),(Object)((_slotkey)));
 BA.debugLineNum = 112;BA.debugLine="playlist.Put(\"_playlist_index\", playlistIndexFor";
Debug.ShouldStop(32768);
_playlist.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_playlist_index"))),(Object)((_playlistindexforslot)));
 BA.debugLineNum = 113;BA.debugLine="Trace(\"Выбран playlist для локального воспроизве";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Выбран playlist для локального воспроизведения. slot="),_slotkey,RemoteObject.createImmutable(", index="),_playlistindexforslot,RemoteObject.createImmutable(", playlistId="),_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(", title="),_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 114;BA.debugLine="Return playlist";
Debug.ShouldStop(131072);
if (true) return _playlist;
 };
 BA.debugLineNum = 116;BA.debugLine="Return emptyDescriptor";
Debug.ShouldStop(524288);
if (true) return _emptydescriptor;
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chooserandomtrackfromplaylist(RemoteObject __ref,RemoteObject _playlistdata,RemoteObject _mediacacheservice,RemoteObject _cachedonly) throws Exception{
try {
		Debug.PushSubsStack("ChooseRandomTrackFromPlaylist (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("chooserandomtrackfromplaylist")) { return __ref.runUserSub(false, "dataplaybackresolver","chooserandomtrackfromplaylist", __ref, _playlistdata, _mediacacheservice, _cachedonly);}
RemoteObject _emptytrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filteredtracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cachedtracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackobject = RemoteObject.declareNull("Object");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _sourcetracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _randomindex = RemoteObject.createImmutable(0);
Debug.locals.put("playlistData", _playlistdata);
Debug.locals.put("mediaCacheService", _mediacacheservice);
Debug.locals.put("cachedOnly", _cachedonly);
 BA.debugLineNum = 136;BA.debugLine="Public Sub ChooseRandomTrackFromPlaylist(playlistD";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Dim emptyTrack As Map";
Debug.ShouldStop(256);
_emptytrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyTrack", _emptytrack);
 BA.debugLineNum = 138;BA.debugLine="emptyTrack.Initialize";
Debug.ShouldStop(512);
_emptytrack.runVoidMethod ("Initialize");
 BA.debugLineNum = 139;BA.debugLine="If playlistData.IsInitialized = False Then Return";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 140;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
Debug.ShouldStop(2048);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("tracks", _tracks);Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 141;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_tracks.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_tracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 142;BA.debugLine="Dim filteredTracks As List";
Debug.ShouldStop(8192);
_filteredtracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("filteredTracks", _filteredtracks);
 BA.debugLineNum = 143;BA.debugLine="filteredTracks.Initialize";
Debug.ShouldStop(16384);
_filteredtracks.runVoidMethod ("Initialize");
 BA.debugLineNum = 144;BA.debugLine="Dim cachedTracks As List";
Debug.ShouldStop(32768);
_cachedtracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cachedTracks", _cachedtracks);
 BA.debugLineNum = 145;BA.debugLine="cachedTracks.Initialize";
Debug.ShouldStop(65536);
_cachedtracks.runVoidMethod ("Initialize");
 BA.debugLineNum = 146;BA.debugLine="For Each trackObject As Object In tracks";
Debug.ShouldStop(131072);
{
final RemoteObject group10 = _tracks;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_trackobject = group10.runMethod(false,"Get",index10);Debug.locals.put("trackObject", _trackobject);
Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 147;BA.debugLine="If trackObject Is Map Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 148;BA.debugLine="Dim track As Map = trackObject";
Debug.ShouldStop(524288);
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_track = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 149;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
Debug.ShouldStop(1048576);
_trackid = BA.ObjectToString(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 150;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 151;BA.debugLine="If cachedOnly And mediaCacheService.IsTrackCach";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(".",_cachedonly) && RemoteObject.solveBoolean("=",_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 152;BA.debugLine="cachedTracks.Add(track)";
Debug.ShouldStop(8388608);
_cachedtracks.runVoidMethod ("Add",(Object)((_track.getObject())));
 BA.debugLineNum = 153;BA.debugLine="If recentTrackIds.IndexOf(trackId) = -1 Then fi";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_recenttrackids" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_trackid))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
_filteredtracks.runVoidMethod ("Add",(Object)((_track.getObject())));};
 };
 }
}Debug.locals.put("trackObject", _trackobject);
;
 BA.debugLineNum = 156;BA.debugLine="Dim sourceTracks As List";
Debug.ShouldStop(134217728);
_sourcetracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sourceTracks", _sourcetracks);
 BA.debugLineNum = 157;BA.debugLine="If cachedOnly Then";
Debug.ShouldStop(268435456);
if (_cachedonly.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 158;BA.debugLine="sourceTracks = cachedTracks";
Debug.ShouldStop(536870912);
_sourcetracks = _cachedtracks;Debug.locals.put("sourceTracks", _sourcetracks);
 BA.debugLineNum = 159;BA.debugLine="If filteredTracks.Size > 0 Then sourceTracks = f";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_filteredtracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_sourcetracks = _filteredtracks;Debug.locals.put("sourceTracks", _sourcetracks);};
 }else {
 BA.debugLineNum = 161;BA.debugLine="sourceTracks = tracks";
Debug.ShouldStop(1);
_sourcetracks = _tracks;Debug.locals.put("sourceTracks", _sourcetracks);
 BA.debugLineNum = 162;BA.debugLine="If filteredTracks.Size > 0 Then sourceTracks = f";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_filteredtracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_sourcetracks = _filteredtracks;Debug.locals.put("sourceTracks", _sourcetracks);};
 };
 BA.debugLineNum = 164;BA.debugLine="If sourceTracks.IsInitialized = False Or sourceTr";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_sourcetracks.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_sourcetracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 165;BA.debugLine="Dim randomIndex As Int = Rnd(0, sourceTracks.Size";
Debug.ShouldStop(16);
_randomindex = dataplaybackresolver.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(_sourcetracks.runMethod(true,"getSize")));Debug.locals.put("randomIndex", _randomindex);Debug.locals.put("randomIndex", _randomindex);
 BA.debugLineNum = 166;BA.debugLine="Dim trackObject As Object = sourceTracks.Get(rand";
Debug.ShouldStop(32);
_trackobject = _sourcetracks.runMethod(false,"Get",(Object)(_randomindex));Debug.locals.put("trackObject", _trackobject);Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 167;BA.debugLine="If trackObject Is Map Then Return trackObject";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map"))) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);};
 BA.debugLineNum = 168;BA.debugLine="Return emptyTrack";
Debug.ShouldStop(128);
if (true) return _emptytrack;
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private storageDir As String";
dataplaybackresolver._storagedir = RemoteObject.createImmutable("");__ref.setField("_storagedir",dataplaybackresolver._storagedir);
 //BA.debugLineNum = 4;BA.debugLine="Private targetModule As Object";
dataplaybackresolver._targetmodule = RemoteObject.createNew ("Object");__ref.setField("_targetmodule",dataplaybackresolver._targetmodule);
 //BA.debugLineNum = 5;BA.debugLine="Private traceSubName As String";
dataplaybackresolver._tracesubname = RemoteObject.createImmutable("");__ref.setField("_tracesubname",dataplaybackresolver._tracesubname);
 //BA.debugLineNum = 6;BA.debugLine="Private playlistCursors As Map";
dataplaybackresolver._playlistcursors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_playlistcursors",dataplaybackresolver._playlistcursors);
 //BA.debugLineNum = 7;BA.debugLine="Private recentTrackIds As List";
dataplaybackresolver._recenttrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_recenttrackids",dataplaybackresolver._recenttrackids);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "dataplaybackresolver","clonemap", __ref, _source);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 331;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="Dim copy As Map";
Debug.ShouldStop(2048);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 333;BA.debugLine="copy.Initialize";
Debug.ShouldStop(4096);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 334;BA.debugLine="If source.IsInitialized = False Then Return copy";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 335;BA.debugLine="For Each key As Object In source.Keys";
Debug.ShouldStop(16384);
{
final RemoteObject group4 = _source.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 336;BA.debugLine="copy.Put(key, source.Get(key))";
Debug.ShouldStop(32768);
_copy.runVoidMethod ("Put",(Object)(_key),(Object)(_source.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 338;BA.debugLine="Return copy";
Debug.ShouldStop(131072);
if (true) return _copy;
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ClonePlaylistCursors (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("cloneplaylistcursors")) { return __ref.runUserSub(false, "dataplaybackresolver","cloneplaylistcursors", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Public Sub ClonePlaylistCursors As Map";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Return CloneMap(playlistCursors)";
Debug.ShouldStop(268435456);
if (true) return __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_playlistcursors" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("CommitPlaylistCursor (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("commitplaylistcursor")) { return __ref.runUserSub(false, "dataplaybackresolver","commitplaylistcursor", __ref, _storage, _item);}
RemoteObject _slotkey = RemoteObject.createImmutable("");
RemoteObject _nextstored = RemoteObject.createImmutable(0);
Debug.locals.put("storage", _storage);
Debug.locals.put("item", _item);
 BA.debugLineNum = 190;BA.debugLine="Public Sub CommitPlaylistCursor(storage As KeyValu";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="If item.IsInitialized = False Then Return";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 192;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("track")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 193;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_key";
Debug.ShouldStop(1);
_slotkey = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_key"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotKey", _slotkey);Debug.locals.put("slotKey", _slotkey);
 BA.debugLineNum = 194;BA.debugLine="If slotKey = \"\" Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_slotkey,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 195;BA.debugLine="Dim nextStored As Int = item.GetDefault(\"playlist";
Debug.ShouldStop(4);
_nextstored = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_index"))),(Object)(RemoteObject.createImmutable((0))))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("nextStored", _nextstored);Debug.locals.put("nextStored", _nextstored);
 BA.debugLineNum = 196;BA.debugLine="playlistCursors.Put(slotKey, nextStored)";
Debug.ShouldStop(8);
__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_slotkey)),(Object)((_nextstored)));
 BA.debugLineNum = 197;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
Debug.ShouldStop(16);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("data_slot_playlist_cursors")),(Object)((__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 198;BA.debugLine="Trace(\"Зафиксирован курсор playlists. slot=\" & sl";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Зафиксирован курсор playlists. slot="),_slotkey,RemoteObject.createImmutable(", committed="),_nextstored)));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("CreateInitializedList (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("createinitializedlist")) { return __ref.runUserSub(false, "dataplaybackresolver","createinitializedlist", __ref);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 341;BA.debugLine="Private Sub CreateInitializedList As List";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 342;BA.debugLine="Dim items As List";
Debug.ShouldStop(2097152);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 343;BA.debugLine="items.Initialize";
Debug.ShouldStop(4194304);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 344;BA.debugLine="Return items";
Debug.ShouldStop(8388608);
if (true) return _items;
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("CreateInitializedMap (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("createinitializedmap")) { return __ref.runUserSub(false, "dataplaybackresolver","createinitializedmap", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 325;BA.debugLine="Private Sub CreateInitializedMap As Map";
Debug.ShouldStop(16);
 BA.debugLineNum = 326;BA.debugLine="Dim m As Map";
Debug.ShouldStop(32);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 327;BA.debugLine="m.Initialize";
Debug.ShouldStop(64);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 328;BA.debugLine="Return m";
Debug.ShouldStop(128);
if (true) return _m;
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("CreateQueueTrackFromPlaylist (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("createqueuetrackfromplaylist")) { return __ref.runUserSub(false, "dataplaybackresolver","createqueuetrackfromplaylist", __ref, _currentslot, _playlistdescriptor, _track, _offlinedata);}
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("playlistDescriptor", _playlistdescriptor);
Debug.locals.put("track", _track);
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 171;BA.debugLine="Public Sub CreateQueueTrackFromPlaylist(currentSlo";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="Dim item As Map";
Debug.ShouldStop(2048);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("item", _item);
 BA.debugLineNum = 173;BA.debugLine="item.Initialize";
Debug.ShouldStop(4096);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 174;BA.debugLine="item.Put(\"type\", \"track\")";
Debug.ShouldStop(8192);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("track"))));
 BA.debugLineNum = 175;BA.debugLine="item.Put(\"id\", track.GetDefault(\"id\", \"\"))";
Debug.ShouldStop(16384);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 176;BA.debugLine="item.Put(\"code\", track.GetDefault(\"code\", \"\"))";
Debug.ShouldStop(32768);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("code"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 177;BA.debugLine="item.Put(\"set\", track.GetDefault(\"set\", \"\"))";
Debug.ShouldStop(65536);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 178;BA.debugLine="item.Put(\"duration\", track.GetDefault(\"duration\",";
Debug.ShouldStop(131072);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 179;BA.debugLine="item.Put(\"gain\", track.GetDefault(\"gain\", -3))";
Debug.ShouldStop(262144);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 3)))))));
 BA.debugLineNum = 180;BA.debugLine="item.Put(\"stream\", ResolvePlaybackStreamTitle(cur";
Debug.ShouldStop(524288);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolveplaybackstreamtitle" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_playlistdescriptor),(Object)(_offlinedata)))));
 BA.debugLineNum = 181;BA.debugLine="item.Put(\"playlist_id\", playlistDescriptor.GetDef";
Debug.ShouldStop(1048576);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 182;BA.debugLine="item.Put(\"playlist_title\", playlistDescriptor.Get";
Debug.ShouldStop(2097152);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 183;BA.debugLine="item.Put(\"slot_key\", playlistDescriptor.GetDefaul";
Debug.ShouldStop(4194304);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_key"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("_slot_key"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_currentslot)))))));
 BA.debugLineNum = 184;BA.debugLine="item.Put(\"playlist_index\", playlistDescriptor.Get";
Debug.ShouldStop(8388608);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_index"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("_playlist_index"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 185;BA.debugLine="item.Put(\"schedule_title\", currentSlot.GetDefault";
Debug.ShouldStop(16777216);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 186;BA.debugLine="item.Put(\"slot_time\", currentSlot.GetDefault(\"slo";
Debug.ShouldStop(33554432);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 187;BA.debugLine="Return item";
Debug.ShouldStop(67108864);
if (true) return _item;
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _currentisoweekday(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CurrentIsoWeekday (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("currentisoweekday")) { return __ref.runUserSub(false, "dataplaybackresolver","currentisoweekday", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _today = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _dayofweek = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 302;BA.debugLine="Private Sub CurrentIsoWeekday As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 303;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(16384);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 304;BA.debugLine="jo.InitializeStatic(\"java.time.LocalDate\")";
Debug.ShouldStop(32768);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.LocalDate")));
 BA.debugLineNum = 305;BA.debugLine="Dim today As JavaObject = jo.RunMethod(\"now\", Nul";
Debug.ShouldStop(65536);
_today = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_today = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("now")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));Debug.locals.put("today", _today);Debug.locals.put("today", _today);
 BA.debugLineNum = 306;BA.debugLine="Dim dayOfWeek As JavaObject = today.RunMethod(\"ge";
Debug.ShouldStop(131072);
_dayofweek = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_dayofweek = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _today.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDayOfWeek")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));Debug.locals.put("dayOfWeek", _dayofweek);Debug.locals.put("dayOfWeek", _dayofweek);
 BA.debugLineNum = 307;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
Debug.ShouldStop(262144);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_dayofweek.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getValue")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _currentminutesofday(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CurrentMinutesOfDay (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("currentminutesofday")) { return __ref.runUserSub(false, "dataplaybackresolver","currentminutesofday", __ref);}
RemoteObject _previoustimeformat = RemoteObject.createImmutable("");
RemoteObject _timevalue = RemoteObject.createImmutable("");
RemoteObject _parts = null;
 BA.debugLineNum = 292;BA.debugLine="Private Sub CurrentMinutesOfDay As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
Debug.ShouldStop(16);
_previoustimeformat = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("previousTimeFormat", _previoustimeformat);Debug.locals.put("previousTimeFormat", _previoustimeformat);
 BA.debugLineNum = 294;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(32);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 295;BA.debugLine="Dim timeValue As String = DateTime.Time(DateTime.";
Debug.ShouldStop(64);
_timevalue = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("timeValue", _timevalue);Debug.locals.put("timeValue", _timevalue);
 BA.debugLineNum = 296;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
Debug.ShouldStop(128);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_previoustimeformat);
 BA.debugLineNum = 297;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
Debug.ShouldStop(256);
_parts = dataplaybackresolver.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_timevalue));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 298;BA.debugLine="If parts.Length < 2 Then Return 0";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("<",_parts.getField(true,"length"),BA.numberCast(double.class, 2))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 299;BA.debugLine="Return parts(0) * 60 + parts(1)";
Debug.ShouldStop(1024);
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _parts.getArrayElement(true,BA.numberCast(int.class, 0))),RemoteObject.createImmutable(60),BA.numberCast(double.class, _parts.getArrayElement(true,BA.numberCast(int.class, 1)))}, "*+",1, 0));
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cursorcount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CursorCount (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("cursorcount")) { return __ref.runUserSub(false, "dataplaybackresolver","cursorcount", __ref);}
 BA.debugLineNum = 23;BA.debugLine="Public Sub CursorCount As Int";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="If playlistCursors.IsInitialized = False Then Ret";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 25;BA.debugLine="Return playlistCursors.Size";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ExtractSlotStreamData (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("extractslotstreamdata")) { return __ref.runUserSub(false, "dataplaybackresolver","extractslotstreamdata", __ref, _slot);}
RemoteObject _streamdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _streamobject = RemoteObject.declareNull("Object");
Debug.locals.put("slot", _slot);
 BA.debugLineNum = 247;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="Dim streamData As Map";
Debug.ShouldStop(8388608);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 249;BA.debugLine="streamData.Initialize";
Debug.ShouldStop(16777216);
_streamdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 250;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_slot.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _streamdata;};
 BA.debugLineNum = 251;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
Debug.ShouldStop(67108864);
_streamobject = _slot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stream"))));Debug.locals.put("streamObject", _streamobject);Debug.locals.put("streamObject", _streamobject);
 BA.debugLineNum = 252;BA.debugLine="If streamObject Is Map Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("i",_streamobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 253;BA.debugLine="streamData = streamObject";
Debug.ShouldStop(268435456);
_streamdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _streamobject);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 254;BA.debugLine="Return streamData";
Debug.ShouldStop(536870912);
if (true) return _streamdata;
 };
 BA.debugLineNum = 256;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("N",_streamobject)) { 
_streamdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),_streamobject))));};
 BA.debugLineNum = 257;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
Debug.ShouldStop(1);
if (_slot.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("playlists")))).<Boolean>get().booleanValue()) { 
_streamdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(_slot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("playlists"))))));};
 BA.debugLineNum = 258;BA.debugLine="Return streamData";
Debug.ShouldStop(2);
if (true) return _streamdata;
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("FormatIsoDate (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("formatisodate")) { return __ref.runUserSub(false, "dataplaybackresolver","formatisodate", __ref, _ticks);}
RemoteObject _previousdateformat = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 284;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
Debug.ShouldStop(268435456);
_previousdateformat = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("previousDateFormat", _previousdateformat);Debug.locals.put("previousDateFormat", _previousdateformat);
 BA.debugLineNum = 286;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(536870912);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 287;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
Debug.ShouldStop(1073741824);
_value = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 288;BA.debugLine="DateTime.DateFormat = previousDateFormat";
Debug.ShouldStop(-2147483648);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_previousdateformat);
 BA.debugLineNum = 289;BA.debugLine="Return value";
Debug.ShouldStop(1);
if (true) return _value;
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("GetOfflinePlaylistsDir (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("getofflineplaylistsdir")) { return __ref.runUserSub(false, "dataplaybackresolver","getofflineplaylistsdir", __ref);}
 BA.debugLineNum = 276;BA.debugLine="Private Sub GetOfflinePlaylistsDir As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="Return File.Combine(storageDir, \"playlists\")";
Debug.ShouldStop(1048576);
if (true) return dataplaybackresolver.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("playlists")));
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagedirvalue,RemoteObject _targetmodulevalue,RemoteObject _tracesubnamevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dataplaybackresolver","initialize", __ref, _ba, _storagedirvalue, _targetmodulevalue, _tracesubnamevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(storageDirValue As String, t";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(1024);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 12;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(2048);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 13;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(4096);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 14;BA.debugLine="playlistCursors.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="recentTrackIds.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_recenttrackids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("LoadCachedPlaylistMetadata (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("loadcachedplaylistmetadata")) { return __ref.runUserSub(false, "dataplaybackresolver","loadcachedplaylistmetadata", __ref, _playlistid);}
RemoteObject _playlistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _parseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 119;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim playlistData As Map";
Debug.ShouldStop(8388608);
_playlistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 121;BA.debugLine="playlistData.Initialize";
Debug.ShouldStop(16777216);
_playlistdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 122;BA.debugLine="If playlistId = \"\" Then Return playlistData";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return _playlistdata;};
 BA.debugLineNum = 123;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistMe";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",dataplaybackresolver.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_getofflineplaylistsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistmetadatafilename" /*RemoteObject*/ ,(Object)(_playlistid)))),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _playlistdata;};
 BA.debugLineNum = 124;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 125;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 126;BA.debugLine="parser.Initialize(File.ReadString(GetOfflinePlay";
Debug.ShouldStop(536870912);
_parser.runVoidMethod ("Initialize",(Object)(dataplaybackresolver.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_getofflineplaylistsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistmetadatafilename" /*RemoteObject*/ ,(Object)(_playlistid))))));
 BA.debugLineNum = 127;BA.debugLine="Dim parsedData As Map = parser.NextObject";
Debug.ShouldStop(1073741824);
_parseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_parseddata = _parser.runMethod(false,"NextObject");Debug.locals.put("parsedData", _parseddata);Debug.locals.put("parsedData", _parseddata);
 BA.debugLineNum = 128;BA.debugLine="If parsedData.IsInitialized Then playlistData =";
Debug.ShouldStop(-2147483648);
if (_parseddata.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_playlistdata = _parseddata;Debug.locals.put("playlistData", _playlistdata);};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 130;BA.debugLine="playlistData.Initialize";
Debug.ShouldStop(2);
_playlistdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 131;BA.debugLine="Trace(\"Не удалось загрузить playlist metadata из";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось загрузить playlist metadata из кэша. id="),_playlistid,RemoteObject.createImmutable(", message="),dataplaybackresolver.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 133;BA.debugLine="Return playlistData";
Debug.ShouldStop(16);
if (true) return _playlistdata;
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("LoadState (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("loadstate")) { return __ref.runUserSub(false, "dataplaybackresolver","loadstate", __ref, _storage);}
Debug.locals.put("storage", _storage);
 BA.debugLineNum = 18;BA.debugLine="Public Sub LoadState(storage As KeyValueStore)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="playlistCursors = storage.GetDefault(\"data_slot_p";
Debug.ShouldStop(262144);
__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).setObject (_storage.runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("data_slot_playlist_cursors")),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_createinitializedmap" /*RemoteObject*/ ).getObject()))));
 BA.debugLineNum = 20;BA.debugLine="If playlistCursors.IsInitialized = False Then pla";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playlistmetadatafilename(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("PlaylistMetadataFileName (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("playlistmetadatafilename")) { return __ref.runUserSub(false, "dataplaybackresolver","playlistmetadatafilename", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 280;BA.debugLine="Private Sub PlaylistMetadataFileName(playlistId As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="Return playlistId & \".json\"";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.concat(_playlistid,RemoteObject.createImmutable(".json"));
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rememberresolvedtrack(RemoteObject __ref,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("RememberResolvedTrack (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("rememberresolvedtrack")) { return __ref.runUserSub(false, "dataplaybackresolver","rememberresolvedtrack", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 201;BA.debugLine="Public Sub RememberResolvedTrack(trackId As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="If trackId = \"\" Then Return";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 203;BA.debugLine="recentTrackIds.Add(trackId)";
Debug.ShouldStop(1024);
__ref.getField(false,"_recenttrackids" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_trackid)));
 BA.debugLineNum = 204;BA.debugLine="Do While recentTrackIds.Size > 20";
Debug.ShouldStop(2048);
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_recenttrackids" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 20))) {
 BA.debugLineNum = 205;BA.debugLine="recentTrackIds.RemoveAt(0)";
Debug.ShouldStop(4096);
__ref.getField(false,"_recenttrackids" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("ResolveCurrentDataSlot (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("resolvecurrentdataslot")) { return __ref.runUserSub(false, "dataplaybackresolver","resolvecurrentdataslot", __ref, _offlinedata);}
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
 BA.debugLineNum = 32;BA.debugLine="Public Sub ResolveCurrentDataSlot(offlineData As M";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Dim slotContext As Map";
Debug.ShouldStop(1);
_slotcontext = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("slotContext", _slotcontext);
 BA.debugLineNum = 34;BA.debugLine="slotContext.Initialize";
Debug.ShouldStop(2);
_slotcontext.runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _slotcontext;};
 BA.debugLineNum = 36;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
Debug.ShouldStop(8);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 37;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_schedules.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _slotcontext;};
 BA.debugLineNum = 38;BA.debugLine="Dim todayKey As String = FormatIsoDate(DateTime.N";
Debug.ShouldStop(32);
_todaykey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_formatisodate" /*RemoteObject*/ ,(Object)(dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("todayKey", _todaykey);Debug.locals.put("todayKey", _todaykey);
 BA.debugLineNum = 39;BA.debugLine="Dim nowMinutes As Int = CurrentMinutesOfDay";
Debug.ShouldStop(64);
_nowminutes = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_currentminutesofday" /*RemoteObject*/ );Debug.locals.put("nowMinutes", _nowminutes);Debug.locals.put("nowMinutes", _nowminutes);
 BA.debugLineNum = 40;BA.debugLine="Dim todayWeekday As String = CurrentIsoWeekday";
Debug.ShouldStop(128);
_todayweekday = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_currentisoweekday" /*RemoteObject*/ );Debug.locals.put("todayWeekday", _todayweekday);Debug.locals.put("todayWeekday", _todayweekday);
 BA.debugLineNum = 41;BA.debugLine="Dim matchedSlots As List";
Debug.ShouldStop(256);
_matchedslots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("matchedSlots", _matchedslots);
 BA.debugLineNum = 42;BA.debugLine="matchedSlots.Initialize";
Debug.ShouldStop(512);
_matchedslots.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(1024);
{
final RemoteObject group11 = _schedules;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_scheduleobject = group11.runMethod(false,"Get",index11);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 44;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 45;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(4096);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 46;BA.debugLine="If ScheduleAppliesToday(schedule, todayKey, tod";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_scheduleappliestoday" /*RemoteObject*/ ,(Object)(_schedule),(Object)(_todaykey),(Object)(_todayweekday)),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 47;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
Debug.ShouldStop(16384);
_scheduletitle = BA.ObjectToString(_schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("scheduleTitle", _scheduletitle);Debug.locals.put("scheduleTitle", _scheduletitle);
 BA.debugLineNum = 48;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
Debug.ShouldStop(32768);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 49;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 50;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(131072);
{
final RemoteObject group18 = _slots;
final int groupLen18 = group18.runMethod(true,"getSize").<Integer>get()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_slotobject = group18.runMethod(false,"Get",index18);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 51;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 52;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(524288);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 53;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
Debug.ShouldStop(1048576);
_slottime = BA.ObjectToString(_slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotTime", _slottime);Debug.locals.put("slotTime", _slottime);
 BA.debugLineNum = 54;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes(";
Debug.ShouldStop(2097152);
_slotminutes = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_timestringtominutes" /*RemoteObject*/ ,(Object)(_slottime));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 55;BA.debugLine="If slotMinutes < 0 Then Continue";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("<",_slotminutes,BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 56;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
Debug.ShouldStop(8388608);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 57;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(16777216);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 58;BA.debugLine="entry.Initialize";
Debug.ShouldStop(33554432);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="entry.Put(\"schedule_title\", scheduleTitle)";
Debug.ShouldStop(67108864);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((_scheduletitle)));
 BA.debugLineNum = 60;BA.debugLine="entry.Put(\"slot_time\", slotTime)";
Debug.ShouldStop(134217728);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((_slottime)));
 BA.debugLineNum = 61;BA.debugLine="entry.Put(\"slot_minutes\", slotMinutes)";
Debug.ShouldStop(268435456);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)((_slotminutes)));
 BA.debugLineNum = 62;BA.debugLine="entry.Put(\"stream_id\", streamData.GetDefault(";
Debug.ShouldStop(536870912);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 63;BA.debugLine="entry.Put(\"stream_title\", streamData.GetDefau";
Debug.ShouldStop(1073741824);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 64;BA.debugLine="entry.Put(\"playlists\", streamData.GetDefault(";
Debug.ShouldStop(-2147483648);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 65;BA.debugLine="matchedSlots.Add(entry)";
Debug.ShouldStop(1);
_matchedslots.runVoidMethod ("Add",(Object)((_entry.getObject())));
 };
 }
}Debug.locals.put("slotObject", _slotobject);
;
 };
 }
}Debug.locals.put("scheduleObject", _scheduleobject);
;
 BA.debugLineNum = 70;BA.debugLine="If matchedSlots.Size = 0 Then Return slotContext";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_matchedslots.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _slotcontext;};
 BA.debugLineNum = 71;BA.debugLine="Dim selectedSlot As Map";
Debug.ShouldStop(64);
_selectedslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("selectedSlot", _selectedslot);
 BA.debugLineNum = 72;BA.debugLine="selectedSlot.Initialize";
Debug.ShouldStop(128);
_selectedslot.runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="Dim selectedMinutes As Int = -1";
Debug.ShouldStop(256);
_selectedminutes = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("selectedMinutes", _selectedminutes);Debug.locals.put("selectedMinutes", _selectedminutes);
 BA.debugLineNum = 74;BA.debugLine="For Each slotEntryObject As Object In matchedSlot";
Debug.ShouldStop(512);
{
final RemoteObject group42 = _matchedslots;
final int groupLen42 = group42.runMethod(true,"getSize").<Integer>get()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_slotentryobject = group42.runMethod(false,"Get",index42);Debug.locals.put("slotEntryObject", _slotentryobject);
Debug.locals.put("slotEntryObject", _slotentryobject);
 BA.debugLineNum = 75;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
Debug.ShouldStop(1024);
_slotentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slotentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotentryobject);Debug.locals.put("slotEntry", _slotentry);Debug.locals.put("slotEntry", _slotentry);
 BA.debugLineNum = 76;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"s";
Debug.ShouldStop(2048);
_slotminutes = BA.numberCast(int.class, _slotentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 77;BA.debugLine="If slotMinutes <= nowMinutes And slotMinutes >=";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("k",_slotminutes,BA.numberCast(double.class, _nowminutes)) && RemoteObject.solveBoolean("g",_slotminutes,BA.numberCast(double.class, _selectedminutes))) { 
 BA.debugLineNum = 78;BA.debugLine="selectedSlot = slotEntry";
Debug.ShouldStop(8192);
_selectedslot = _slotentry;Debug.locals.put("selectedSlot", _selectedslot);
 BA.debugLineNum = 79;BA.debugLine="selectedMinutes = slotMinutes";
Debug.ShouldStop(16384);
_selectedminutes = _slotminutes;Debug.locals.put("selectedMinutes", _selectedminutes);
 };
 }
}Debug.locals.put("slotEntryObject", _slotentryobject);
;
 BA.debugLineNum = 82;BA.debugLine="If selectedSlot.Size = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_selectedslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 83;BA.debugLine="selectedMinutes = 24 * 60 + 1";
Debug.ShouldStop(262144);
_selectedminutes = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(24),RemoteObject.createImmutable(60),RemoteObject.createImmutable(1)}, "*+",1, 1);Debug.locals.put("selectedMinutes", _selectedminutes);
 BA.debugLineNum = 84;BA.debugLine="For Each slotEntryObject As Object In matchedSlo";
Debug.ShouldStop(524288);
{
final RemoteObject group52 = _matchedslots;
final int groupLen52 = group52.runMethod(true,"getSize").<Integer>get()
;int index52 = 0;
;
for (; index52 < groupLen52;index52++){
_slotentryobject = group52.runMethod(false,"Get",index52);Debug.locals.put("slotEntryObject", _slotentryobject);
Debug.locals.put("slotEntryObject", _slotentryobject);
 BA.debugLineNum = 85;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
Debug.ShouldStop(1048576);
_slotentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slotentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotentryobject);Debug.locals.put("slotEntry", _slotentry);Debug.locals.put("slotEntry", _slotentry);
 BA.debugLineNum = 86;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"";
Debug.ShouldStop(2097152);
_slotminutes = BA.numberCast(int.class, _slotentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 87;BA.debugLine="If slotMinutes > nowMinutes And slotMinutes < s";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_slotminutes,BA.numberCast(double.class, _nowminutes)) && RemoteObject.solveBoolean("<",_slotminutes,BA.numberCast(double.class, _selectedminutes))) { 
 BA.debugLineNum = 88;BA.debugLine="selectedSlot = slotEntry";
Debug.ShouldStop(8388608);
_selectedslot = _slotentry;Debug.locals.put("selectedSlot", _selectedslot);
 BA.debugLineNum = 89;BA.debugLine="selectedMinutes = slotMinutes";
Debug.ShouldStop(16777216);
_selectedminutes = _slotminutes;Debug.locals.put("selectedMinutes", _selectedminutes);
 };
 }
}Debug.locals.put("slotEntryObject", _slotentryobject);
;
 };
 BA.debugLineNum = 93;BA.debugLine="Return selectedSlot";
Debug.ShouldStop(268435456);
if (true) return _selectedslot;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("ResolveOfflineStreamTitle (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,221);
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
 BA.debugLineNum = 221;BA.debugLine="Private Sub ResolveOfflineStreamTitle(currentSlot";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 223;BA.debugLine="Dim targetStreamId As String = currentSlot.GetDef";
Debug.ShouldStop(1073741824);
_targetstreamid = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("targetStreamId", _targetstreamid);Debug.locals.put("targetStreamId", _targetstreamid);
 BA.debugLineNum = 224;BA.debugLine="Dim targetSlotTime As String = currentSlot.GetDef";
Debug.ShouldStop(-2147483648);
_targetslottime = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("targetSlotTime", _targetslottime);Debug.locals.put("targetSlotTime", _targetslottime);
 BA.debugLineNum = 225;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
Debug.ShouldStop(1);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 226;BA.debugLine="If schedules.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 227;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(4);
{
final RemoteObject group6 = _schedules;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_scheduleobject = group6.runMethod(false,"Get",index6);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 228;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 229;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(16);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 230;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
Debug.ShouldStop(32);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 231;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 232;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(128);
{
final RemoteObject group11 = _slots;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.runMethod(false,"Get",index11);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 233;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 234;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(512);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 235;BA.debugLine="If targetSlotTime <> \"\" And slot.GetDefault(\"";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",_targetslottime,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))),(_targetslottime))) { 
if (true) continue;};
 BA.debugLineNum = 236;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
Debug.ShouldStop(2048);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 237;BA.debugLine="If targetStreamId <> \"\" And streamData.GetDef";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_targetstreamid,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),(_targetstreamid))) { 
if (true) continue;};
 BA.debugLineNum = 238;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
Debug.ShouldStop(8192);
_streamtitle = BA.ObjectToString(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamTitle", _streamtitle);Debug.locals.put("streamTitle", _streamtitle);
 BA.debugLineNum = 239;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 244;BA.debugLine="Return \"\"";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveplaybackstreamtitle(RemoteObject __ref,RemoteObject _currentslot,RemoteObject _playlistdescriptor,RemoteObject _offlinedata) throws Exception{
try {
		Debug.PushSubsStack("ResolvePlaybackStreamTitle (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("resolveplaybackstreamtitle")) { return __ref.runUserSub(false, "dataplaybackresolver","resolveplaybackstreamtitle", __ref, _currentslot, _playlistdescriptor, _offlinedata);}
RemoteObject _streamtitle = RemoteObject.createImmutable("");
RemoteObject _resolvedstreamtitle = RemoteObject.createImmutable("");
RemoteObject _scheduletitle = RemoteObject.createImmutable("");
RemoteObject _descriptorstreamtitle = RemoteObject.createImmutable("");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("playlistDescriptor", _playlistdescriptor);
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 209;BA.debugLine="Private Sub ResolvePlaybackStreamTitle(currentSlot";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim streamTitle As String = currentSlot.GetDefaul";
Debug.ShouldStop(131072);
_streamtitle = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamTitle", _streamtitle);Debug.locals.put("streamTitle", _streamtitle);
 BA.debugLineNum = 211;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_streamtitle,BA.ObjectToString(""))) { 
if (true) return _streamtitle;};
 BA.debugLineNum = 212;BA.debugLine="Dim resolvedStreamTitle As String = ResolveOfflin";
Debug.ShouldStop(524288);
_resolvedstreamtitle = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolveofflinestreamtitle" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_offlinedata));Debug.locals.put("resolvedStreamTitle", _resolvedstreamtitle);Debug.locals.put("resolvedStreamTitle", _resolvedstreamtitle);
 BA.debugLineNum = 213;BA.debugLine="If resolvedStreamTitle <> \"\" Then Return resolved";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_resolvedstreamtitle,BA.ObjectToString(""))) { 
if (true) return _resolvedstreamtitle;};
 BA.debugLineNum = 214;BA.debugLine="Dim scheduleTitle As String = currentSlot.GetDefa";
Debug.ShouldStop(2097152);
_scheduletitle = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("scheduleTitle", _scheduletitle);Debug.locals.put("scheduleTitle", _scheduletitle);
 BA.debugLineNum = 215;BA.debugLine="Dim descriptorStreamTitle As String = playlistDes";
Debug.ShouldStop(4194304);
_descriptorstreamtitle = BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("descriptorStreamTitle", _descriptorstreamtitle);Debug.locals.put("descriptorStreamTitle", _descriptorstreamtitle);
 BA.debugLineNum = 216;BA.debugLine="If descriptorStreamTitle <> \"\" Then Return descri";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("!",_descriptorstreamtitle,BA.ObjectToString(""))) { 
if (true) return _descriptorstreamtitle;};
 BA.debugLineNum = 217;BA.debugLine="If scheduleTitle <> \"\" Then Return scheduleTitle";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",_scheduletitle,BA.ObjectToString(""))) { 
if (true) return _scheduletitle;};
 BA.debugLineNum = 218;BA.debugLine="Return playlistDescriptor.GetDefault(\"title\", \"\")";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scheduleappliestoday(RemoteObject __ref,RemoteObject _schedule,RemoteObject _todaykey,RemoteObject _todayweekday) throws Exception{
try {
		Debug.PushSubsStack("ScheduleAppliesToday (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("scheduleappliestoday")) { return __ref.runUserSub(false, "dataplaybackresolver","scheduleappliestoday", __ref, _schedule, _todaykey, _todayweekday);}
RemoteObject _startdate = RemoteObject.createImmutable("");
RemoteObject _weekdays = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _weekdayobject = RemoteObject.declareNull("Object");
Debug.locals.put("schedule", _schedule);
Debug.locals.put("todayKey", _todaykey);
Debug.locals.put("todayWeekday", _todayweekday);
 BA.debugLineNum = 261;BA.debugLine="Private Sub ScheduleAppliesToday(schedule As Map,";
Debug.ShouldStop(16);
 BA.debugLineNum = 262;BA.debugLine="Dim startDate As String = schedule.GetDefault(\"st";
Debug.ShouldStop(32);
_startdate = BA.ObjectToString(_schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("start"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("startDate", _startdate);Debug.locals.put("startDate", _startdate);
 BA.debugLineNum = 263;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(todayK";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_startdate,BA.ObjectToString("")) && RemoteObject.solveBoolean(">",_startdate.runMethod(true,"compareTo",(Object)(_todaykey)),BA.numberCast(double.class, 0))) { 
if (true) return dataplaybackresolver.__c.getField(true,"False");};
 BA.debugLineNum = 264;BA.debugLine="Dim weekdays As List = schedule.GetDefault(\"weekd";
Debug.ShouldStop(128);
_weekdays = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_weekdays = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weekdays"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("weekdays", _weekdays);Debug.locals.put("weekdays", _weekdays);
 BA.debugLineNum = 265;BA.debugLine="If weekdays.IsInitialized = False Or weekdays.Siz";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_weekdays.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_weekdays.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return dataplaybackresolver.__c.getField(true,"True");};
 BA.debugLineNum = 266;BA.debugLine="For Each weekdayObject As Object In weekdays";
Debug.ShouldStop(512);
{
final RemoteObject group5 = _weekdays;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_weekdayobject = group5.runMethod(false,"Get",index5);Debug.locals.put("weekdayObject", _weekdayobject);
Debug.locals.put("weekdayObject", _weekdayobject);
 BA.debugLineNum = 267;BA.debugLine="If (\"\" & weekdayObject).Trim = todayWeekday Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",(RemoteObject.concat(RemoteObject.createImmutable(""),_weekdayobject)).runMethod(true,"trim"),_todayweekday)) { 
if (true) return dataplaybackresolver.__c.getField(true,"True");};
 }
}Debug.locals.put("weekdayObject", _weekdayobject);
;
 BA.debugLineNum = 269;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) return dataplaybackresolver.__c.getField(true,"False");
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timestringtominutes(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TimeStringToMinutes (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,310);
if (RapidSub.canDelegate("timestringtominutes")) { return __ref.runUserSub(false, "dataplaybackresolver","timestringtominutes", __ref, _value);}
RemoteObject _parts = null;
RemoteObject _hours = RemoteObject.createImmutable(0);
RemoteObject _minutes = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 310;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="If value = \"\" Then Return -1";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 312;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
Debug.ShouldStop(8388608);
_parts = dataplaybackresolver.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_value));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 313;BA.debugLine="If parts.Length < 2 Then Return -1";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",_parts.getField(true,"length"),BA.numberCast(double.class, 2))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 314;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 315;BA.debugLine="Dim hours As Int = parts(0)";
Debug.ShouldStop(67108864);
_hours = BA.numberCast(int.class, _parts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("hours", _hours);Debug.locals.put("hours", _hours);
 BA.debugLineNum = 316;BA.debugLine="Dim minutes As Int = parts(1)";
Debug.ShouldStop(134217728);
_minutes = BA.numberCast(int.class, _parts.getArrayElement(true,BA.numberCast(int.class, 1)));Debug.locals.put("minutes", _minutes);Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 317;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",_hours,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_hours,BA.numberCast(double.class, 23))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 318;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("<",_minutes,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_minutes,BA.numberCast(double.class, 59))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 319;BA.debugLine="Return hours * 60 + minutes";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.solve(new RemoteObject[] {_hours,RemoteObject.createImmutable(60),_minutes}, "*+",1, 1);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 321;BA.debugLine="Return -1";
Debug.ShouldStop(1);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 };
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Trace (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "dataplaybackresolver","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 347;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 348;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(134217728);
if (dataplaybackresolver.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 349;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(268435456);
dataplaybackresolver.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}