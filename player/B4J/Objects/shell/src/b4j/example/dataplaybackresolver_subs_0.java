package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dataplaybackresolver_subs_0 {


public static RemoteObject  _builddataslotkey(RemoteObject __ref,RemoteObject _currentslot) throws Exception{
try {
		Debug.PushSubsStack("BuildDataSlotKey (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("builddataslotkey")) { return __ref.runUserSub(false, "dataplaybackresolver","builddataslotkey", __ref, _currentslot);}
Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 331;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
Debug.ShouldStop(2048);
if (true) return RemoteObject.concat(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ChooseNextPlaylistDescriptor (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,151);
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
 BA.debugLineNum = 151;BA.debugLine="Public Sub ChooseNextPlaylistDescriptor(currentSlo";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Dim emptyDescriptor As Map";
Debug.ShouldStop(8388608);
_emptydescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyDescriptor", _emptydescriptor);
 BA.debugLineNum = 153;BA.debugLine="emptyDescriptor.Initialize";
Debug.ShouldStop(16777216);
_emptydescriptor.runVoidMethod ("Initialize");
 BA.debugLineNum = 154;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(33554432);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 155;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptydescriptor;};
 BA.debugLineNum = 156;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
Debug.ShouldStop(134217728);
_slotkey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_currentslot));Debug.locals.put("slotKey", _slotkey);Debug.locals.put("slotKey", _slotkey);
 BA.debugLineNum = 157;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
Debug.ShouldStop(268435456);
_cursorvalue = BA.numberCast(int.class, _workingcursors.runMethod(false,"GetDefault",(Object)((_slotkey)),(Object)(__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_slotkey)),(Object)(RemoteObject.createImmutable((0)))))));Debug.locals.put("cursorValue", _cursorvalue);Debug.locals.put("cursorValue", _cursorvalue);
 BA.debugLineNum = 158;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("<",_cursorvalue,BA.numberCast(double.class, 0))) { 
_cursorvalue = BA.numberCast(int.class, 0);Debug.locals.put("cursorValue", _cursorvalue);};
 BA.debugLineNum = 159;BA.debugLine="Dim playlistIndexForSlot As Int = cursorValue Mod";
Debug.ShouldStop(1073741824);
_playlistindexforslot = RemoteObject.solve(new RemoteObject[] {_cursorvalue,_playlists.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("playlistIndexForSlot", _playlistindexforslot);Debug.locals.put("playlistIndexForSlot", _playlistindexforslot);
 BA.debugLineNum = 160;BA.debugLine="workingCursors.Put(slotKey, playlistIndexForSlot";
Debug.ShouldStop(-2147483648);
_workingcursors.runVoidMethod ("Put",(Object)((_slotkey)),(Object)((RemoteObject.solve(new RemoteObject[] {_playlistindexforslot,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 161;BA.debugLine="Trace(\"Курсор playlists. slot=\" & slotKey & \", st";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Курсор playlists. slot="),_slotkey,RemoteObject.createImmutable(", stored="),_cursorvalue,RemoteObject.createImmutable(", previewNextStored="),_workingcursors.runMethod(false,"GetDefault",(Object)((_slotkey)),(Object)(RemoteObject.createImmutable((0)))),RemoteObject.createImmutable(", playlists="),_playlists.runMethod(true,"getSize"))));
 BA.debugLineNum = 162;BA.debugLine="Dim playlistObject As Object = playlists.Get(play";
Debug.ShouldStop(2);
_playlistobject = _playlists.runMethod(false,"Get",(Object)(_playlistindexforslot));Debug.locals.put("playlistObject", _playlistobject);Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 163;BA.debugLine="If playlistObject Is Map Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 164;BA.debugLine="Dim playlistSource As Map = playlistObject";
Debug.ShouldStop(8);
_playlistsource = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistsource = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlistSource", _playlistsource);Debug.locals.put("playlistSource", _playlistsource);
 BA.debugLineNum = 165;BA.debugLine="Dim playlist As Map = CloneMap(playlistSource)";
Debug.ShouldStop(16);
_playlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlist = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_clonemap" /*RemoteObject*/ ,(Object)(_playlistsource));Debug.locals.put("playlist", _playlist);Debug.locals.put("playlist", _playlist);
 BA.debugLineNum = 166;BA.debugLine="playlist.Put(\"_slot_key\", slotKey)";
Debug.ShouldStop(32);
_playlist.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_slot_key"))),(Object)((_slotkey)));
 BA.debugLineNum = 167;BA.debugLine="playlist.Put(\"_playlist_index\", playlistIndexFor";
Debug.ShouldStop(64);
_playlist.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_playlist_index"))),(Object)((_playlistindexforslot)));
 BA.debugLineNum = 168;BA.debugLine="Trace(\"Выбран playlist для локального воспроизве";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Выбран playlist для локального воспроизведения. slot="),_slotkey,RemoteObject.createImmutable(", index="),_playlistindexforslot,RemoteObject.createImmutable(", playlistId="),_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(", title="),_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 169;BA.debugLine="Return playlist";
Debug.ShouldStop(256);
if (true) return _playlist;
 };
 BA.debugLineNum = 171;BA.debugLine="Return emptyDescriptor";
Debug.ShouldStop(1024);
if (true) return _emptydescriptor;
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("ChooseRandomTrackFromPlaylist (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,191);
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
 BA.debugLineNum = 191;BA.debugLine="Public Sub ChooseRandomTrackFromPlaylist(playlistD";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Dim emptyTrack As Map";
Debug.ShouldStop(-2147483648);
_emptytrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyTrack", _emptytrack);
 BA.debugLineNum = 193;BA.debugLine="emptyTrack.Initialize";
Debug.ShouldStop(1);
_emptytrack.runVoidMethod ("Initialize");
 BA.debugLineNum = 194;BA.debugLine="If playlistData.IsInitialized = False Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 195;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
Debug.ShouldStop(4);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("tracks", _tracks);Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 196;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_tracks.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_tracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 197;BA.debugLine="Dim filteredTracks As List";
Debug.ShouldStop(16);
_filteredtracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("filteredTracks", _filteredtracks);
 BA.debugLineNum = 198;BA.debugLine="filteredTracks.Initialize";
Debug.ShouldStop(32);
_filteredtracks.runVoidMethod ("Initialize");
 BA.debugLineNum = 199;BA.debugLine="Dim cachedTracks As List";
Debug.ShouldStop(64);
_cachedtracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cachedTracks", _cachedtracks);
 BA.debugLineNum = 200;BA.debugLine="cachedTracks.Initialize";
Debug.ShouldStop(128);
_cachedtracks.runVoidMethod ("Initialize");
 BA.debugLineNum = 201;BA.debugLine="For Each trackObject As Object In tracks";
Debug.ShouldStop(256);
{
final RemoteObject group10 = _tracks;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_trackobject = group10.runMethod(false,"Get",index10);Debug.locals.put("trackObject", _trackobject);
Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 202;BA.debugLine="If trackObject Is Map Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 203;BA.debugLine="Dim track As Map = trackObject";
Debug.ShouldStop(1024);
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_track = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 204;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
Debug.ShouldStop(2048);
_trackid = BA.ObjectToString(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 205;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 206;BA.debugLine="If cachedOnly And mediaCacheService.IsTrackCach";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(".",_cachedonly) && RemoteObject.solveBoolean("=",_mediacacheservice.runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 207;BA.debugLine="cachedTracks.Add(track)";
Debug.ShouldStop(16384);
_cachedtracks.runVoidMethod ("Add",(Object)((_track.getObject())));
 BA.debugLineNum = 208;BA.debugLine="If recentTrackIds.IndexOf(trackId) = -1 Then fi";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_recenttrackids" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_trackid))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
_filteredtracks.runVoidMethod ("Add",(Object)((_track.getObject())));};
 };
 }
}Debug.locals.put("trackObject", _trackobject);
;
 BA.debugLineNum = 211;BA.debugLine="Dim sourceTracks As List";
Debug.ShouldStop(262144);
_sourcetracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sourceTracks", _sourcetracks);
 BA.debugLineNum = 212;BA.debugLine="If cachedOnly Then";
Debug.ShouldStop(524288);
if (_cachedonly.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 213;BA.debugLine="sourceTracks = cachedTracks";
Debug.ShouldStop(1048576);
_sourcetracks = _cachedtracks;Debug.locals.put("sourceTracks", _sourcetracks);
 BA.debugLineNum = 214;BA.debugLine="If filteredTracks.Size > 0 Then sourceTracks = f";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_filteredtracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_sourcetracks = _filteredtracks;Debug.locals.put("sourceTracks", _sourcetracks);};
 }else {
 BA.debugLineNum = 216;BA.debugLine="sourceTracks = tracks";
Debug.ShouldStop(8388608);
_sourcetracks = _tracks;Debug.locals.put("sourceTracks", _sourcetracks);
 BA.debugLineNum = 217;BA.debugLine="If filteredTracks.Size > 0 Then sourceTracks = f";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_filteredtracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_sourcetracks = _filteredtracks;Debug.locals.put("sourceTracks", _sourcetracks);};
 };
 BA.debugLineNum = 219;BA.debugLine="If sourceTracks.IsInitialized = False Or sourceTr";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_sourcetracks.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_sourcetracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptytrack;};
 BA.debugLineNum = 220;BA.debugLine="Dim randomIndex As Int = Rnd(0, sourceTracks.Size";
Debug.ShouldStop(134217728);
_randomindex = dataplaybackresolver.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(_sourcetracks.runMethod(true,"getSize")));Debug.locals.put("randomIndex", _randomindex);Debug.locals.put("randomIndex", _randomindex);
 BA.debugLineNum = 221;BA.debugLine="Dim trackObject As Object = sourceTracks.Get(rand";
Debug.ShouldStop(268435456);
_trackobject = _sourcetracks.runMethod(false,"Get",(Object)(_randomindex));Debug.locals.put("trackObject", _trackobject);Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 222;BA.debugLine="If trackObject Is Map Then Return trackObject";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map"))) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);};
 BA.debugLineNum = 223;BA.debugLine="Return emptyTrack";
Debug.ShouldStop(1073741824);
if (true) return _emptytrack;
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("CloneMap (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,406);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "dataplaybackresolver","clonemap", __ref, _source);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 406;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 407;BA.debugLine="Dim copy As Map";
Debug.ShouldStop(4194304);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 408;BA.debugLine="copy.Initialize";
Debug.ShouldStop(8388608);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 409;BA.debugLine="If source.IsInitialized = False Then Return copy";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 410;BA.debugLine="For Each key As Object In source.Keys";
Debug.ShouldStop(33554432);
{
final RemoteObject group4 = _source.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 411;BA.debugLine="copy.Put(key, source.Get(key))";
Debug.ShouldStop(67108864);
_copy.runVoidMethod ("Put",(Object)(_key),(Object)(_source.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 413;BA.debugLine="Return copy";
Debug.ShouldStop(268435456);
if (true) return _copy;
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("CommitPlaylistCursor (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("commitplaylistcursor")) { return __ref.runUserSub(false, "dataplaybackresolver","commitplaylistcursor", __ref, _storage, _item);}
RemoteObject _slotkey = RemoteObject.createImmutable("");
RemoteObject _nextstored = RemoteObject.createImmutable(0);
Debug.locals.put("storage", _storage);
Debug.locals.put("item", _item);
 BA.debugLineNum = 245;BA.debugLine="Public Sub CommitPlaylistCursor(storage As KeyValu";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="If item.IsInitialized = False Then Return";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 247;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("track")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 248;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_key";
Debug.ShouldStop(8388608);
_slotkey = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_key"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotKey", _slotkey);Debug.locals.put("slotKey", _slotkey);
 BA.debugLineNum = 249;BA.debugLine="If slotKey = \"\" Then Return";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_slotkey,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 250;BA.debugLine="Dim nextStored As Int = item.GetDefault(\"playlist";
Debug.ShouldStop(33554432);
_nextstored = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_index"))),(Object)(RemoteObject.createImmutable((0))))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("nextStored", _nextstored);Debug.locals.put("nextStored", _nextstored);
 BA.debugLineNum = 251;BA.debugLine="playlistCursors.Put(slotKey, nextStored)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_slotkey)),(Object)((_nextstored)));
 BA.debugLineNum = 252;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
Debug.ShouldStop(134217728);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("data_slot_playlist_cursors")),(Object)((__ref.getField(false,"_playlistcursors" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 253;BA.debugLine="Trace(\"Зафиксирован курсор playlists. slot=\" & sl";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Зафиксирован курсор playlists. slot="),_slotkey,RemoteObject.createImmutable(", committed="),_nextstored)));
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("CreateInitializedList (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,416);
if (RapidSub.canDelegate("createinitializedlist")) { return __ref.runUserSub(false, "dataplaybackresolver","createinitializedlist", __ref);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 416;BA.debugLine="Private Sub CreateInitializedList As List";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 417;BA.debugLine="Dim items As List";
Debug.ShouldStop(1);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 418;BA.debugLine="items.Initialize";
Debug.ShouldStop(2);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 419;BA.debugLine="Return items";
Debug.ShouldStop(4);
if (true) return _items;
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("CreateInitializedMap (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,400);
if (RapidSub.canDelegate("createinitializedmap")) { return __ref.runUserSub(false, "dataplaybackresolver","createinitializedmap", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 400;BA.debugLine="Private Sub CreateInitializedMap As Map";
Debug.ShouldStop(32768);
 BA.debugLineNum = 401;BA.debugLine="Dim m As Map";
Debug.ShouldStop(65536);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 402;BA.debugLine="m.Initialize";
Debug.ShouldStop(131072);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 403;BA.debugLine="Return m";
Debug.ShouldStop(262144);
if (true) return _m;
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("CreateQueueTrackFromPlaylist (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("createqueuetrackfromplaylist")) { return __ref.runUserSub(false, "dataplaybackresolver","createqueuetrackfromplaylist", __ref, _currentslot, _playlistdescriptor, _track, _offlinedata);}
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("playlistDescriptor", _playlistdescriptor);
Debug.locals.put("track", _track);
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 226;BA.debugLine="Public Sub CreateQueueTrackFromPlaylist(currentSlo";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="Dim item As Map";
Debug.ShouldStop(4);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("item", _item);
 BA.debugLineNum = 228;BA.debugLine="item.Initialize";
Debug.ShouldStop(8);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 229;BA.debugLine="item.Put(\"type\", \"track\")";
Debug.ShouldStop(16);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("track"))));
 BA.debugLineNum = 230;BA.debugLine="item.Put(\"id\", track.GetDefault(\"id\", \"\"))";
Debug.ShouldStop(32);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 231;BA.debugLine="item.Put(\"code\", track.GetDefault(\"code\", \"\"))";
Debug.ShouldStop(64);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("code"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 232;BA.debugLine="item.Put(\"set\", track.GetDefault(\"set\", \"\"))";
Debug.ShouldStop(128);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("set"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 233;BA.debugLine="item.Put(\"duration\", track.GetDefault(\"duration\",";
Debug.ShouldStop(256);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("duration"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 234;BA.debugLine="item.Put(\"gain\", track.GetDefault(\"gain\", -3))";
Debug.ShouldStop(512);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("gain"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 3)))))));
 BA.debugLineNum = 235;BA.debugLine="item.Put(\"stream\", ResolvePlaybackStreamTitle(cur";
Debug.ShouldStop(1024);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolveplaybackstreamtitle" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_playlistdescriptor),(Object)(_offlinedata)))));
 BA.debugLineNum = 236;BA.debugLine="item.Put(\"playlist_id\", playlistDescriptor.GetDef";
Debug.ShouldStop(2048);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 237;BA.debugLine="item.Put(\"playlist_title\", playlistDescriptor.Get";
Debug.ShouldStop(4096);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 238;BA.debugLine="item.Put(\"slot_key\", playlistDescriptor.GetDefaul";
Debug.ShouldStop(8192);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_key"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("_slot_key"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_currentslot)))))));
 BA.debugLineNum = 239;BA.debugLine="item.Put(\"playlist_index\", playlistDescriptor.Get";
Debug.ShouldStop(16384);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_index"))),(Object)(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("_playlist_index"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 240;BA.debugLine="item.Put(\"schedule_title\", currentSlot.GetDefault";
Debug.ShouldStop(32768);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 241;BA.debugLine="item.Put(\"slot_time\", currentSlot.GetDefault(\"slo";
Debug.ShouldStop(65536);
_item.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 242;BA.debugLine="Return item";
Debug.ShouldStop(131072);
if (true) return _item;
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ExtractSlotStreamData (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("extractslotstreamdata")) { return __ref.runUserSub(false, "dataplaybackresolver","extractslotstreamdata", __ref, _slot);}
RemoteObject _streamdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _streamobject = RemoteObject.declareNull("Object");
Debug.locals.put("slot", _slot);
 BA.debugLineNum = 302;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 303;BA.debugLine="Dim streamData As Map";
Debug.ShouldStop(16384);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 304;BA.debugLine="streamData.Initialize";
Debug.ShouldStop(32768);
_streamdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 305;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_slot.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _streamdata;};
 BA.debugLineNum = 306;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
Debug.ShouldStop(131072);
_streamobject = _slot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stream"))));Debug.locals.put("streamObject", _streamobject);Debug.locals.put("streamObject", _streamobject);
 BA.debugLineNum = 307;BA.debugLine="If streamObject Is Map Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("i",_streamobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 308;BA.debugLine="streamData = streamObject";
Debug.ShouldStop(524288);
_streamdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _streamobject);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 309;BA.debugLine="Return streamData";
Debug.ShouldStop(1048576);
if (true) return _streamdata;
 };
 BA.debugLineNum = 311;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("N",_streamobject)) { 
_streamdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),_streamobject))));};
 BA.debugLineNum = 312;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
Debug.ShouldStop(8388608);
if (_slot.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("playlists")))).<Boolean>get().booleanValue()) { 
_streamdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(_slot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("playlists"))))));};
 BA.debugLineNum = 313;BA.debugLine="Return streamData";
Debug.ShouldStop(16777216);
if (true) return _streamdata;
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("FormatIsoDate (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("formatisodate")) { return __ref.runUserSub(false, "dataplaybackresolver","formatisodate", __ref, _ticks);}
RemoteObject _previousdateformat = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 343;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
Debug.ShouldStop(8388608);
_previousdateformat = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("previousDateFormat", _previousdateformat);Debug.locals.put("previousDateFormat", _previousdateformat);
 BA.debugLineNum = 345;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(16777216);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 346;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
Debug.ShouldStop(33554432);
_value = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 347;BA.debugLine="DateTime.DateFormat = previousDateFormat";
Debug.ShouldStop(67108864);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_previousdateformat);
 BA.debugLineNum = 348;BA.debugLine="Return value";
Debug.ShouldStop(134217728);
if (true) return _value;
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("GetOfflinePlaylistsDir (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("getofflineplaylistsdir")) { return __ref.runUserSub(false, "dataplaybackresolver","getofflineplaylistsdir", __ref);}
 BA.debugLineNum = 335;BA.debugLine="Private Sub GetOfflinePlaylistsDir As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="Return File.Combine(storageDir, \"playlists\")";
Debug.ShouldStop(32768);
if (true) return dataplaybackresolver.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("playlists")));
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _isoweekdayfromticks(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("IsoWeekdayFromTicks (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,361);
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
 BA.debugLineNum = 361;BA.debugLine="Private Sub IsoWeekdayFromTicks(ticks As Long) As";
Debug.ShouldStop(256);
 BA.debugLineNum = 362;BA.debugLine="Dim instantClass As JavaObject";
Debug.ShouldStop(512);
_instantclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("instantClass", _instantclass);
 BA.debugLineNum = 363;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
Debug.ShouldStop(1024);
_instantclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.Instant")));
 BA.debugLineNum = 364;BA.debugLine="Dim zoneClass As JavaObject";
Debug.ShouldStop(2048);
_zoneclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("zoneClass", _zoneclass);
 BA.debugLineNum = 365;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
Debug.ShouldStop(4096);
_zoneclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.ZoneId")));
 BA.debugLineNum = 366;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
Debug.ShouldStop(8192);
_zoneddatetimeclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("zonedDateTimeClass", _zoneddatetimeclass);
 BA.debugLineNum = 367;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
Debug.ShouldStop(16384);
_zoneddatetimeclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.ZonedDateTime")));
 BA.debugLineNum = 368;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
Debug.ShouldStop(32768);
_instant = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_instant = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _instantclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("ofEpochMilli")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ticks)}))));Debug.locals.put("instant", _instant);Debug.locals.put("instant", _instant);
 BA.debugLineNum = 369;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
Debug.ShouldStop(65536);
_zoneid = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_zoneid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _zoneclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("systemDefault")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));Debug.locals.put("zoneId", _zoneid);Debug.locals.put("zoneId", _zoneid);
 BA.debugLineNum = 370;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
Debug.ShouldStop(131072);
_zoneddatetime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_zoneddatetime = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _zoneddatetimeclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("ofInstant")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_instant.getObject()),(_zoneid.getObject())}))));Debug.locals.put("zonedDateTime", _zoneddatetime);Debug.locals.put("zonedDateTime", _zoneddatetime);
 BA.debugLineNum = 371;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
Debug.ShouldStop(262144);
_localdate = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_localdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _zoneddatetime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toLocalDate")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));Debug.locals.put("localDate", _localdate);Debug.locals.put("localDate", _localdate);
 BA.debugLineNum = 372;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
Debug.ShouldStop(524288);
_dayofweek = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_dayofweek = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _localdate.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDayOfWeek")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));Debug.locals.put("dayOfWeek", _dayofweek);Debug.locals.put("dayOfWeek", _dayofweek);
 BA.debugLineNum = 373;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_dayofweek.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getValue")),(Object)((dataplaybackresolver.__c.getField(false,"Null")))));
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("LoadCachedPlaylistMetadata (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("loadcachedplaylistmetadata")) { return __ref.runUserSub(false, "dataplaybackresolver","loadcachedplaylistmetadata", __ref, _playlistid);}
RemoteObject _playlistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _parseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 174;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="Dim playlistData As Map";
Debug.ShouldStop(16384);
_playlistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 176;BA.debugLine="playlistData.Initialize";
Debug.ShouldStop(32768);
_playlistdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 177;BA.debugLine="If playlistId = \"\" Then Return playlistData";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return _playlistdata;};
 BA.debugLineNum = 178;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistMe";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",dataplaybackresolver.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_getofflineplaylistsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistmetadatafilename" /*RemoteObject*/ ,(Object)(_playlistid)))),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _playlistdata;};
 BA.debugLineNum = 179;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 180;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(524288);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 181;BA.debugLine="parser.Initialize(File.ReadString(GetOfflinePlay";
Debug.ShouldStop(1048576);
_parser.runVoidMethod ("Initialize",(Object)(dataplaybackresolver.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_getofflineplaylistsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_playlistmetadatafilename" /*RemoteObject*/ ,(Object)(_playlistid))))));
 BA.debugLineNum = 182;BA.debugLine="Dim parsedData As Map = parser.NextObject";
Debug.ShouldStop(2097152);
_parseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_parseddata = _parser.runMethod(false,"NextObject");Debug.locals.put("parsedData", _parseddata);Debug.locals.put("parsedData", _parseddata);
 BA.debugLineNum = 183;BA.debugLine="If parsedData.IsInitialized Then playlistData =";
Debug.ShouldStop(4194304);
if (_parseddata.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_playlistdata = _parseddata;Debug.locals.put("playlistData", _playlistdata);};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 185;BA.debugLine="playlistData.Initialize";
Debug.ShouldStop(16777216);
_playlistdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 186;BA.debugLine="Trace(\"Не удалось загрузить playlist metadata из";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось загрузить playlist metadata из кэша. id="),_playlistid,RemoteObject.createImmutable(", message="),dataplaybackresolver.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 188;BA.debugLine="Return playlistData";
Debug.ShouldStop(134217728);
if (true) return _playlistdata;
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _minutesofdayfromticks(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("MinutesOfDayFromTicks (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,351);
if (RapidSub.canDelegate("minutesofdayfromticks")) { return __ref.runUserSub(false, "dataplaybackresolver","minutesofdayfromticks", __ref, _ticks);}
RemoteObject _previoustimeformat = RemoteObject.createImmutable("");
RemoteObject _timevalue = RemoteObject.createImmutable("");
RemoteObject _parts = null;
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 351;BA.debugLine="Private Sub MinutesOfDayFromTicks(ticks As Long) A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 352;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
Debug.ShouldStop(-2147483648);
_previoustimeformat = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("previousTimeFormat", _previoustimeformat);Debug.locals.put("previousTimeFormat", _previoustimeformat);
 BA.debugLineNum = 353;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(1);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 354;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
Debug.ShouldStop(2);
_timevalue = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_ticks));Debug.locals.put("timeValue", _timevalue);Debug.locals.put("timeValue", _timevalue);
 BA.debugLineNum = 355;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
Debug.ShouldStop(4);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_previoustimeformat);
 BA.debugLineNum = 356;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
Debug.ShouldStop(8);
_parts = dataplaybackresolver.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_timevalue));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 357;BA.debugLine="If parts.Length < 2 Then Return 0";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_parts.getField(true,"length"),BA.numberCast(double.class, 2))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 358;BA.debugLine="Return parts(0) * 60 + parts(1)";
Debug.ShouldStop(32);
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _parts.getArrayElement(true,BA.numberCast(int.class, 0))),RemoteObject.createImmutable(60),BA.numberCast(double.class, _parts.getArrayElement(true,BA.numberCast(int.class, 1)))}, "*+",1, 0));
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("PlaylistMetadataFileName (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,339);
if (RapidSub.canDelegate("playlistmetadatafilename")) { return __ref.runUserSub(false, "dataplaybackresolver","playlistmetadatafilename", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 339;BA.debugLine="Private Sub PlaylistMetadataFileName(playlistId As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 340;BA.debugLine="Return playlistId & \".json\"";
Debug.ShouldStop(524288);
if (true) return RemoteObject.concat(_playlistid,RemoteObject.createImmutable(".json"));
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("RememberResolvedTrack (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("rememberresolvedtrack")) { return __ref.runUserSub(false, "dataplaybackresolver","rememberresolvedtrack", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 256;BA.debugLine="Public Sub RememberResolvedTrack(trackId As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="If trackId = \"\" Then Return";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 258;BA.debugLine="recentTrackIds.Add(trackId)";
Debug.ShouldStop(2);
__ref.getField(false,"_recenttrackids" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_trackid)));
 BA.debugLineNum = 259;BA.debugLine="Do While recentTrackIds.Size > 20";
Debug.ShouldStop(4);
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_recenttrackids" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 20))) {
 BA.debugLineNum = 260;BA.debugLine="recentTrackIds.RemoveAt(0)";
Debug.ShouldStop(8);
__ref.getField(false,"_recenttrackids" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 32;BA.debugLine="Public Sub ResolveCurrentDataSlot(offlineData As M";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Return ResolveDataSlotAtTicks(offlineData, DateTi";
Debug.ShouldStop(1);
if (true) return __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getNow")));
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
public static RemoteObject  _resolvedataslotatticks(RemoteObject __ref,RemoteObject _offlinedata,RemoteObject _targetticks) throws Exception{
try {
		Debug.PushSubsStack("ResolveDataSlotAtTicks (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,36);
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
 BA.debugLineNum = 36;BA.debugLine="Public Sub ResolveDataSlotAtTicks(offlineData As M";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Dim slotContext As Map";
Debug.ShouldStop(16);
_slotcontext = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("slotContext", _slotcontext);
 BA.debugLineNum = 38;BA.debugLine="slotContext.Initialize";
Debug.ShouldStop(32);
_slotcontext.runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _slotcontext;};
 BA.debugLineNum = 40;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
Debug.ShouldStop(128);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 41;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_schedules.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _slotcontext;};
 BA.debugLineNum = 42;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
Debug.ShouldStop(512);
_todaykey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_formatisodate" /*RemoteObject*/ ,(Object)(_targetticks));Debug.locals.put("todayKey", _todaykey);Debug.locals.put("todayKey", _todaykey);
 BA.debugLineNum = 43;BA.debugLine="Dim nowMinutes As Int = MinutesOfDayFromTicks(tar";
Debug.ShouldStop(1024);
_nowminutes = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_minutesofdayfromticks" /*RemoteObject*/ ,(Object)(_targetticks));Debug.locals.put("nowMinutes", _nowminutes);Debug.locals.put("nowMinutes", _nowminutes);
 BA.debugLineNum = 44;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTicks(";
Debug.ShouldStop(2048);
_todayweekday = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_isoweekdayfromticks" /*RemoteObject*/ ,(Object)(_targetticks));Debug.locals.put("todayWeekday", _todayweekday);Debug.locals.put("todayWeekday", _todayweekday);
 BA.debugLineNum = 45;BA.debugLine="Dim matchedSlots As List";
Debug.ShouldStop(4096);
_matchedslots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("matchedSlots", _matchedslots);
 BA.debugLineNum = 46;BA.debugLine="matchedSlots.Initialize";
Debug.ShouldStop(8192);
_matchedslots.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(16384);
{
final RemoteObject group11 = _schedules;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_scheduleobject = group11.runMethod(false,"Get",index11);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 48;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 49;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(65536);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 50;BA.debugLine="If ScheduleAppliesToday(schedule, todayKey, tod";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_scheduleappliestoday" /*RemoteObject*/ ,(Object)(_schedule),(Object)(_todaykey),(Object)(_todayweekday)),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 51;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
Debug.ShouldStop(262144);
_scheduletitle = BA.ObjectToString(_schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("scheduleTitle", _scheduletitle);Debug.locals.put("scheduleTitle", _scheduletitle);
 BA.debugLineNum = 52;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
Debug.ShouldStop(524288);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 53;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 54;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(2097152);
{
final RemoteObject group18 = _slots;
final int groupLen18 = group18.runMethod(true,"getSize").<Integer>get()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_slotobject = group18.runMethod(false,"Get",index18);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 55;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 56;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(8388608);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 57;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
Debug.ShouldStop(16777216);
_slottime = BA.ObjectToString(_slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotTime", _slottime);Debug.locals.put("slotTime", _slottime);
 BA.debugLineNum = 58;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes(";
Debug.ShouldStop(33554432);
_slotminutes = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_timestringtominutes" /*RemoteObject*/ ,(Object)(_slottime));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 59;BA.debugLine="If slotMinutes < 0 Then Continue";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",_slotminutes,BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 60;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
Debug.ShouldStop(134217728);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 61;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(268435456);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 62;BA.debugLine="entry.Initialize";
Debug.ShouldStop(536870912);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="entry.Put(\"schedule_title\", scheduleTitle)";
Debug.ShouldStop(1073741824);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((_scheduletitle)));
 BA.debugLineNum = 64;BA.debugLine="entry.Put(\"slot_time\", slotTime)";
Debug.ShouldStop(-2147483648);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((_slottime)));
 BA.debugLineNum = 65;BA.debugLine="entry.Put(\"slot_minutes\", slotMinutes)";
Debug.ShouldStop(1);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)((_slotminutes)));
 BA.debugLineNum = 66;BA.debugLine="entry.Put(\"stream_id\", streamData.GetDefault(";
Debug.ShouldStop(2);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 67;BA.debugLine="entry.Put(\"stream_title\", streamData.GetDefau";
Debug.ShouldStop(4);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 68;BA.debugLine="entry.Put(\"playlists\", streamData.GetDefault(";
Debug.ShouldStop(8);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 69;BA.debugLine="matchedSlots.Add(entry)";
Debug.ShouldStop(16);
_matchedslots.runVoidMethod ("Add",(Object)((_entry.getObject())));
 };
 }
}Debug.locals.put("slotObject", _slotobject);
;
 };
 }
}Debug.locals.put("scheduleObject", _scheduleobject);
;
 BA.debugLineNum = 74;BA.debugLine="If matchedSlots.Size = 0 Then Return slotContext";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_matchedslots.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _slotcontext;};
 BA.debugLineNum = 75;BA.debugLine="Dim selectedSlot As Map";
Debug.ShouldStop(1024);
_selectedslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("selectedSlot", _selectedslot);
 BA.debugLineNum = 76;BA.debugLine="selectedSlot.Initialize";
Debug.ShouldStop(2048);
_selectedslot.runVoidMethod ("Initialize");
 BA.debugLineNum = 77;BA.debugLine="Dim selectedMinutes As Int = -1";
Debug.ShouldStop(4096);
_selectedminutes = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("selectedMinutes", _selectedminutes);Debug.locals.put("selectedMinutes", _selectedminutes);
 BA.debugLineNum = 78;BA.debugLine="For Each slotEntryObject As Object In matchedSlot";
Debug.ShouldStop(8192);
{
final RemoteObject group42 = _matchedslots;
final int groupLen42 = group42.runMethod(true,"getSize").<Integer>get()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_slotentryobject = group42.runMethod(false,"Get",index42);Debug.locals.put("slotEntryObject", _slotentryobject);
Debug.locals.put("slotEntryObject", _slotentryobject);
 BA.debugLineNum = 79;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
Debug.ShouldStop(16384);
_slotentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slotentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotentryobject);Debug.locals.put("slotEntry", _slotentry);Debug.locals.put("slotEntry", _slotentry);
 BA.debugLineNum = 80;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"s";
Debug.ShouldStop(32768);
_slotminutes = BA.numberCast(int.class, _slotentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 81;BA.debugLine="If slotMinutes <= nowMinutes And slotMinutes >=";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("k",_slotminutes,BA.numberCast(double.class, _nowminutes)) && RemoteObject.solveBoolean("g",_slotminutes,BA.numberCast(double.class, _selectedminutes))) { 
 BA.debugLineNum = 82;BA.debugLine="selectedSlot = slotEntry";
Debug.ShouldStop(131072);
_selectedslot = _slotentry;Debug.locals.put("selectedSlot", _selectedslot);
 BA.debugLineNum = 83;BA.debugLine="selectedMinutes = slotMinutes";
Debug.ShouldStop(262144);
_selectedminutes = _slotminutes;Debug.locals.put("selectedMinutes", _selectedminutes);
 };
 }
}Debug.locals.put("slotEntryObject", _slotentryobject);
;
 BA.debugLineNum = 86;BA.debugLine="If selectedSlot.Size = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_selectedslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 87;BA.debugLine="selectedMinutes = 24 * 60 + 1";
Debug.ShouldStop(4194304);
_selectedminutes = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(24),RemoteObject.createImmutable(60),RemoteObject.createImmutable(1)}, "*+",1, 1);Debug.locals.put("selectedMinutes", _selectedminutes);
 BA.debugLineNum = 88;BA.debugLine="For Each slotEntryObject As Object In matchedSlo";
Debug.ShouldStop(8388608);
{
final RemoteObject group52 = _matchedslots;
final int groupLen52 = group52.runMethod(true,"getSize").<Integer>get()
;int index52 = 0;
;
for (; index52 < groupLen52;index52++){
_slotentryobject = group52.runMethod(false,"Get",index52);Debug.locals.put("slotEntryObject", _slotentryobject);
Debug.locals.put("slotEntryObject", _slotentryobject);
 BA.debugLineNum = 89;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
Debug.ShouldStop(16777216);
_slotentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slotentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotentryobject);Debug.locals.put("slotEntry", _slotentry);Debug.locals.put("slotEntry", _slotentry);
 BA.debugLineNum = 90;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"";
Debug.ShouldStop(33554432);
_slotminutes = BA.numberCast(int.class, _slotentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 91;BA.debugLine="If slotMinutes > nowMinutes And slotMinutes < s";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_slotminutes,BA.numberCast(double.class, _nowminutes)) && RemoteObject.solveBoolean("<",_slotminutes,BA.numberCast(double.class, _selectedminutes))) { 
 BA.debugLineNum = 92;BA.debugLine="selectedSlot = slotEntry";
Debug.ShouldStop(134217728);
_selectedslot = _slotentry;Debug.locals.put("selectedSlot", _selectedslot);
 BA.debugLineNum = 93;BA.debugLine="selectedMinutes = slotMinutes";
Debug.ShouldStop(268435456);
_selectedminutes = _slotminutes;Debug.locals.put("selectedMinutes", _selectedminutes);
 };
 }
}Debug.locals.put("slotEntryObject", _slotentryobject);
;
 };
 BA.debugLineNum = 97;BA.debugLine="Return selectedSlot";
Debug.ShouldStop(1);
if (true) return _selectedslot;
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("ResolveNextDataSlot (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("resolvenextdataslot")) { return __ref.runUserSub(false, "dataplaybackresolver","resolvenextdataslot", __ref, _offlinedata);}
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 100;BA.debugLine="Public Sub ResolveNextDataSlot(offlineData As Map)";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Return ResolveNextDataSlotAtTicks(offlineData, Da";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvenextdataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("ResolveNextDataSlotAtTicks (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,104);
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
 BA.debugLineNum = 104;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(offlineData";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Dim nextSlot As Map";
Debug.ShouldStop(256);
_nextslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("nextSlot", _nextslot);
 BA.debugLineNum = 106;BA.debugLine="nextSlot.Initialize";
Debug.ShouldStop(512);
_nextslot.runVoidMethod ("Initialize");
 BA.debugLineNum = 107;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return _nextslot;};
 BA.debugLineNum = 108;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
Debug.ShouldStop(2048);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 109;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_schedules.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _nextslot;};
 BA.debugLineNum = 110;BA.debugLine="Dim nowTicks As Long = referenceTicks";
Debug.ShouldStop(8192);
_nowticks = _referenceticks;Debug.locals.put("nowTicks", _nowticks);Debug.locals.put("nowTicks", _nowticks);
 BA.debugLineNum = 111;BA.debugLine="Dim bestSlotTicks As Long = 0";
Debug.ShouldStop(16384);
_bestslotticks = BA.numberCast(long.class, 0);Debug.locals.put("bestSlotTicks", _bestslotticks);Debug.locals.put("bestSlotTicks", _bestslotticks);
 BA.debugLineNum = 112;BA.debugLine="For dayOffset = 0 To 7";
Debug.ShouldStop(32768);
{
final int step8 = 1;
final int limit8 = 7;
_dayoffset = 0 ;
for (;(step8 > 0 && _dayoffset <= limit8) || (step8 < 0 && _dayoffset >= limit8) ;_dayoffset = ((int)(0 + _dayoffset + step8))  ) {
Debug.locals.put("dayOffset", _dayoffset);
 BA.debugLineNum = 113;BA.debugLine="Dim dayTicks As Long = StartOfDayTicks(nowTicks";
Debug.ShouldStop(65536);
_dayticks = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_startofdayticks" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_nowticks,RemoteObject.createImmutable(_dayoffset),dataplaybackresolver.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "+*",1, 2)));Debug.locals.put("dayTicks", _dayticks);Debug.locals.put("dayTicks", _dayticks);
 BA.debugLineNum = 114;BA.debugLine="Dim dayKey As String = FormatIsoDate(dayTicks)";
Debug.ShouldStop(131072);
_daykey = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_formatisodate" /*RemoteObject*/ ,(Object)(_dayticks));Debug.locals.put("dayKey", _daykey);Debug.locals.put("dayKey", _daykey);
 BA.debugLineNum = 115;BA.debugLine="Dim dayWeekday As String = IsoWeekdayFromTicks(d";
Debug.ShouldStop(262144);
_dayweekday = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_isoweekdayfromticks" /*RemoteObject*/ ,(Object)(_dayticks));Debug.locals.put("dayWeekday", _dayweekday);Debug.locals.put("dayWeekday", _dayweekday);
 BA.debugLineNum = 116;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(524288);
{
final RemoteObject group12 = _schedules;
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_scheduleobject = group12.runMethod(false,"Get",index12);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 117;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 118;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(2097152);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 119;BA.debugLine="If ScheduleAppliesOnDate(schedule, dayKey, day";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_scheduleappliesondate" /*RemoteObject*/ ,(Object)(_schedule),(Object)(_daykey),(Object)(_dayweekday)),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 120;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefa";
Debug.ShouldStop(8388608);
_scheduletitle = BA.ObjectToString(_schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("scheduleTitle", _scheduletitle);Debug.locals.put("scheduleTitle", _scheduletitle);
 BA.debugLineNum = 121;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots";
Debug.ShouldStop(16777216);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 122;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 123;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(67108864);
{
final RemoteObject group19 = _slots;
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_slotobject = group19.runMethod(false,"Get",index19);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 124;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 125;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(268435456);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 126;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"ti";
Debug.ShouldStop(536870912);
_slottime = BA.ObjectToString(_slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotTime", _slottime);Debug.locals.put("slotTime", _slottime);
 BA.debugLineNum = 127;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes";
Debug.ShouldStop(1073741824);
_slotminutes = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_timestringtominutes" /*RemoteObject*/ ,(Object)(_slottime));Debug.locals.put("slotMinutes", _slotminutes);Debug.locals.put("slotMinutes", _slotminutes);
 BA.debugLineNum = 128;BA.debugLine="If slotMinutes < 0 Then Continue";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_slotminutes,BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 129;BA.debugLine="Dim slotTicks As Long = dayTicks + slotMinut";
Debug.ShouldStop(1);
_slotticks = RemoteObject.solve(new RemoteObject[] {_dayticks,_slotminutes,dataplaybackresolver.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "+*",1, 2);Debug.locals.put("slotTicks", _slotticks);Debug.locals.put("slotTicks", _slotticks);
 BA.debugLineNum = 130;BA.debugLine="If slotTicks <= nowTicks Then Continue";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("k",_slotticks,_nowticks)) { 
if (true) continue;};
 BA.debugLineNum = 131;BA.debugLine="If bestSlotTicks > 0 And slotTicks >= bestSl";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_bestslotticks,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("g",_slotticks,_bestslotticks)) { 
if (true) continue;};
 BA.debugLineNum = 132;BA.debugLine="Dim streamData As Map = ExtractSlotStreamDat";
Debug.ShouldStop(8);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 133;BA.debugLine="nextSlot.Initialize";
Debug.ShouldStop(16);
_nextslot.runVoidMethod ("Initialize");
 BA.debugLineNum = 134;BA.debugLine="nextSlot.Put(\"schedule_title\", scheduleTitle";
Debug.ShouldStop(32);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((_scheduletitle)));
 BA.debugLineNum = 135;BA.debugLine="nextSlot.Put(\"slot_time\", slotTime)";
Debug.ShouldStop(64);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((_slottime)));
 BA.debugLineNum = 136;BA.debugLine="nextSlot.Put(\"slot_minutes\", slotMinutes)";
Debug.ShouldStop(128);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_minutes"))),(Object)((_slotminutes)));
 BA.debugLineNum = 137;BA.debugLine="nextSlot.Put(\"slot_ticks\", slotTicks)";
Debug.ShouldStop(256);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_ticks"))),(Object)((_slotticks)));
 BA.debugLineNum = 138;BA.debugLine="nextSlot.Put(\"stream_id\", streamData.GetDefa";
Debug.ShouldStop(512);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 139;BA.debugLine="nextSlot.Put(\"stream_title\", streamData.GetD";
Debug.ShouldStop(1024);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 140;BA.debugLine="nextSlot.Put(\"playlists\", streamData.GetDefa";
Debug.ShouldStop(2048);
_nextslot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)((__ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 141;BA.debugLine="bestSlotTicks = slotTicks";
Debug.ShouldStop(4096);
_bestslotticks = _slotticks;Debug.locals.put("bestSlotTicks", _bestslotticks);
 };
 }
}Debug.locals.put("slotObject", _slotobject);
;
 };
 }
}Debug.locals.put("scheduleObject", _scheduleobject);
;
 BA.debugLineNum = 146;BA.debugLine="If nextSlot.IsInitialized And nextSlot.Size > 0";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",_nextslot.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_nextslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) break;};
 }
}Debug.locals.put("dayOffset", _dayoffset);
;
 BA.debugLineNum = 148;BA.debugLine="Return nextSlot";
Debug.ShouldStop(524288);
if (true) return _nextslot;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ResolveOfflineStreamTitle (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,276);
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
 BA.debugLineNum = 276;BA.debugLine="Private Sub ResolveOfflineStreamTitle(currentSlot";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 278;BA.debugLine="Dim targetStreamId As String = currentSlot.GetDef";
Debug.ShouldStop(2097152);
_targetstreamid = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("targetStreamId", _targetstreamid);Debug.locals.put("targetStreamId", _targetstreamid);
 BA.debugLineNum = 279;BA.debugLine="Dim targetSlotTime As String = currentSlot.GetDef";
Debug.ShouldStop(4194304);
_targetslottime = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("targetSlotTime", _targetslottime);Debug.locals.put("targetSlotTime", _targetslottime);
 BA.debugLineNum = 280;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
Debug.ShouldStop(8388608);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _offlinedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 281;BA.debugLine="If schedules.IsInitialized = False Then Return \"\"";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 282;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(33554432);
{
final RemoteObject group6 = _schedules;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_scheduleobject = group6.runMethod(false,"Get",index6);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 283;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 284;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(134217728);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 285;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
Debug.ShouldStop(268435456);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 286;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 287;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(1073741824);
{
final RemoteObject group11 = _slots;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.runMethod(false,"Get",index11);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 288;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 289;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(1);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 290;BA.debugLine="If targetSlotTime <> \"\" And slot.GetDefault(\"";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_targetslottime,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))),(_targetslottime))) { 
if (true) continue;};
 BA.debugLineNum = 291;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
Debug.ShouldStop(4);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 292;BA.debugLine="If targetStreamId <> \"\" And streamData.GetDef";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",_targetstreamid,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),(_targetstreamid))) { 
if (true) continue;};
 BA.debugLineNum = 293;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
Debug.ShouldStop(16);
_streamtitle = BA.ObjectToString(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamTitle", _streamtitle);Debug.locals.put("streamTitle", _streamtitle);
 BA.debugLineNum = 294;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 299;BA.debugLine="Return \"\"";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("ResolvePlaybackStreamTitle (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("resolveplaybackstreamtitle")) { return __ref.runUserSub(false, "dataplaybackresolver","resolveplaybackstreamtitle", __ref, _currentslot, _playlistdescriptor, _offlinedata);}
RemoteObject _streamtitle = RemoteObject.createImmutable("");
RemoteObject _resolvedstreamtitle = RemoteObject.createImmutable("");
RemoteObject _scheduletitle = RemoteObject.createImmutable("");
RemoteObject _descriptorstreamtitle = RemoteObject.createImmutable("");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("playlistDescriptor", _playlistdescriptor);
Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 264;BA.debugLine="Private Sub ResolvePlaybackStreamTitle(currentSlot";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Dim streamTitle As String = currentSlot.GetDefaul";
Debug.ShouldStop(256);
_streamtitle = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamTitle", _streamtitle);Debug.locals.put("streamTitle", _streamtitle);
 BA.debugLineNum = 266;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_streamtitle,BA.ObjectToString(""))) { 
if (true) return _streamtitle;};
 BA.debugLineNum = 267;BA.debugLine="Dim resolvedStreamTitle As String = ResolveOfflin";
Debug.ShouldStop(1024);
_resolvedstreamtitle = __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_resolveofflinestreamtitle" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_offlinedata));Debug.locals.put("resolvedStreamTitle", _resolvedstreamtitle);Debug.locals.put("resolvedStreamTitle", _resolvedstreamtitle);
 BA.debugLineNum = 268;BA.debugLine="If resolvedStreamTitle <> \"\" Then Return resolved";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",_resolvedstreamtitle,BA.ObjectToString(""))) { 
if (true) return _resolvedstreamtitle;};
 BA.debugLineNum = 269;BA.debugLine="Dim scheduleTitle As String = currentSlot.GetDefa";
Debug.ShouldStop(4096);
_scheduletitle = BA.ObjectToString(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("scheduleTitle", _scheduletitle);Debug.locals.put("scheduleTitle", _scheduletitle);
 BA.debugLineNum = 270;BA.debugLine="Dim descriptorStreamTitle As String = playlistDes";
Debug.ShouldStop(8192);
_descriptorstreamtitle = BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("descriptorStreamTitle", _descriptorstreamtitle);Debug.locals.put("descriptorStreamTitle", _descriptorstreamtitle);
 BA.debugLineNum = 271;BA.debugLine="If descriptorStreamTitle <> \"\" Then Return descri";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_descriptorstreamtitle,BA.ObjectToString(""))) { 
if (true) return _descriptorstreamtitle;};
 BA.debugLineNum = 272;BA.debugLine="If scheduleTitle <> \"\" Then Return scheduleTitle";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_scheduletitle,BA.ObjectToString(""))) { 
if (true) return _scheduletitle;};
 BA.debugLineNum = 273;BA.debugLine="Return playlistDescriptor.GetDefault(\"title\", \"\")";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));
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
public static RemoteObject  _scheduleappliesondate(RemoteObject __ref,RemoteObject _schedule,RemoteObject _targetdatekey,RemoteObject _targetweekday) throws Exception{
try {
		Debug.PushSubsStack("ScheduleAppliesOnDate (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("scheduleappliesondate")) { return __ref.runUserSub(false, "dataplaybackresolver","scheduleappliesondate", __ref, _schedule, _targetdatekey, _targetweekday);}
RemoteObject _startdate = RemoteObject.createImmutable("");
RemoteObject _weekdays = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _weekdayobject = RemoteObject.declareNull("Object");
Debug.locals.put("schedule", _schedule);
Debug.locals.put("targetDateKey", _targetdatekey);
Debug.locals.put("targetWeekday", _targetweekday);
 BA.debugLineNum = 320;BA.debugLine="Private Sub ScheduleAppliesOnDate(schedule As Map,";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="Dim startDate As String = schedule.GetDefault(\"st";
Debug.ShouldStop(1);
_startdate = BA.ObjectToString(_schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("start"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("startDate", _startdate);Debug.locals.put("startDate", _startdate);
 BA.debugLineNum = 322;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(target";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_startdate,BA.ObjectToString("")) && RemoteObject.solveBoolean(">",_startdate.runMethod(true,"compareTo",(Object)(_targetdatekey)),BA.numberCast(double.class, 0))) { 
if (true) return dataplaybackresolver.__c.getField(true,"False");};
 BA.debugLineNum = 323;BA.debugLine="Dim weekdays As List = schedule.GetDefault(\"weekd";
Debug.ShouldStop(4);
_weekdays = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_weekdays = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weekdays"))),(Object)(dataplaybackresolver.__c.getField(false,"Null"))));Debug.locals.put("weekdays", _weekdays);Debug.locals.put("weekdays", _weekdays);
 BA.debugLineNum = 324;BA.debugLine="If weekdays.IsInitialized = False Or weekdays.Siz";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_weekdays.runMethod(true,"IsInitialized"),dataplaybackresolver.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_weekdays.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return dataplaybackresolver.__c.getField(true,"True");};
 BA.debugLineNum = 325;BA.debugLine="For Each weekdayObject As Object In weekdays";
Debug.ShouldStop(16);
{
final RemoteObject group5 = _weekdays;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_weekdayobject = group5.runMethod(false,"Get",index5);Debug.locals.put("weekdayObject", _weekdayobject);
Debug.locals.put("weekdayObject", _weekdayobject);
 BA.debugLineNum = 326;BA.debugLine="If (\"\" & weekdayObject).Trim = targetWeekday The";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",(RemoteObject.concat(RemoteObject.createImmutable(""),_weekdayobject)).runMethod(true,"trim"),_targetweekday)) { 
if (true) return dataplaybackresolver.__c.getField(true,"True");};
 }
}Debug.locals.put("weekdayObject", _weekdayobject);
;
 BA.debugLineNum = 328;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return dataplaybackresolver.__c.getField(true,"False");
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("ScheduleAppliesToday (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("scheduleappliestoday")) { return __ref.runUserSub(false, "dataplaybackresolver","scheduleappliestoday", __ref, _schedule, _todaykey, _todayweekday);}
Debug.locals.put("schedule", _schedule);
Debug.locals.put("todayKey", _todaykey);
Debug.locals.put("todayWeekday", _todayweekday);
 BA.debugLineNum = 316;BA.debugLine="Private Sub ScheduleAppliesToday(schedule As Map,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 317;BA.debugLine="Return ScheduleAppliesOnDate(schedule, todayKey,";
Debug.ShouldStop(268435456);
if (true) return __ref.runClassMethod (b4j.example.dataplaybackresolver.class, "_scheduleappliesondate" /*RemoteObject*/ ,(Object)(_schedule),(Object)(_todaykey),(Object)(_todayweekday));
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startofdayticks(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("StartOfDayTicks (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,391);
if (RapidSub.canDelegate("startofdayticks")) { return __ref.runUserSub(false, "dataplaybackresolver","startofdayticks", __ref, _ticks);}
RemoteObject _previousdateformat = RemoteObject.createImmutable("");
RemoteObject _daykey = RemoteObject.createImmutable("");
RemoteObject _dayticks = RemoteObject.createImmutable(0L);
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 391;BA.debugLine="Private Sub StartOfDayTicks(ticks As Long) As Long";
Debug.ShouldStop(64);
 BA.debugLineNum = 392;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
Debug.ShouldStop(128);
_previousdateformat = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("previousDateFormat", _previousdateformat);Debug.locals.put("previousDateFormat", _previousdateformat);
 BA.debugLineNum = 393;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(256);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 394;BA.debugLine="Dim dayKey As String = DateTime.Date(ticks)";
Debug.ShouldStop(512);
_daykey = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("dayKey", _daykey);Debug.locals.put("dayKey", _daykey);
 BA.debugLineNum = 395;BA.debugLine="Dim dayTicks As Long = DateTime.DateParse(dayKey)";
Debug.ShouldStop(1024);
_dayticks = dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_daykey));Debug.locals.put("dayTicks", _dayticks);Debug.locals.put("dayTicks", _dayticks);
 BA.debugLineNum = 396;BA.debugLine="DateTime.DateFormat = previousDateFormat";
Debug.ShouldStop(2048);
dataplaybackresolver.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_previousdateformat);
 BA.debugLineNum = 397;BA.debugLine="Return dayTicks";
Debug.ShouldStop(4096);
if (true) return _dayticks;
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("TimeStringToMinutes (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,376);
if (RapidSub.canDelegate("timestringtominutes")) { return __ref.runUserSub(false, "dataplaybackresolver","timestringtominutes", __ref, _value);}
RemoteObject _parts = null;
RemoteObject _hours = RemoteObject.createImmutable(0);
RemoteObject _minutes = RemoteObject.createImmutable(0);
Debug.locals.put("value", _value);
 BA.debugLineNum = 376;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 377;BA.debugLine="If value = \"\" Then Return -1";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 378;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
Debug.ShouldStop(33554432);
_parts = dataplaybackresolver.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_value));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 379;BA.debugLine="If parts.Length < 2 Then Return -1";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",_parts.getField(true,"length"),BA.numberCast(double.class, 2))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 380;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 381;BA.debugLine="Dim hours As Int = parts(0)";
Debug.ShouldStop(268435456);
_hours = BA.numberCast(int.class, _parts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("hours", _hours);Debug.locals.put("hours", _hours);
 BA.debugLineNum = 382;BA.debugLine="Dim minutes As Int = parts(1)";
Debug.ShouldStop(536870912);
_minutes = BA.numberCast(int.class, _parts.getArrayElement(true,BA.numberCast(int.class, 1)));Debug.locals.put("minutes", _minutes);Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 383;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",_hours,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_hours,BA.numberCast(double.class, 23))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 384;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_minutes,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",_minutes,BA.numberCast(double.class, 59))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 385;BA.debugLine="Return hours * 60 + minutes";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.solve(new RemoteObject[] {_hours,RemoteObject.createImmutable(60),_minutes}, "*+",1, 1);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 387;BA.debugLine="Return -1";
Debug.ShouldStop(4);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 };
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Trace (dataplaybackresolver) ","dataplaybackresolver",5,__ref.getField(false, "ba"),__ref,422);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "dataplaybackresolver","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 422;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 423;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(64);
if (dataplaybackresolver.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 424;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(128);
dataplaybackresolver.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}