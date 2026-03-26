package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class autonomouscachemanager_subs_0 {


public static RemoteObject  _adddesiredtrackitemsforslot(RemoteObject __ref,RemoteObject _result,RemoteObject _seentrackids,RemoteObject _slot,RemoteObject _slotreserve,RemoteObject _slotneed,RemoteObject _slotlabel,RemoteObject _trackplayliststats) throws Exception{
try {
		Debug.PushSubsStack("AddDesiredTrackItemsForSlot (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("adddesiredtrackitemsforslot")) { return __ref.runUserSub(false, "autonomouscachemanager","adddesiredtrackitemsforslot", __ref, _result, _seentrackids, _slot, _slotreserve, _slotneed, _slotlabel, _trackplayliststats);}
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totalplayable = RemoteObject.createImmutable(0);
RemoteObject _allplaylistsready = RemoteObject.createImmutable(false);
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _descriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _playlistplayablecount = RemoteObject.createImmutable(0);
RemoteObject _manifestsbyplaylist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _manifest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _remainingneed = RemoteObject.createImmutable(0);
RemoteObject _playableinplaylist = RemoteObject.createImmutable(0);
RemoteObject _missingforplaylist = RemoteObject.createImmutable(0);
RemoteObject _addedcount = RemoteObject.createImmutable(0);
RemoteObject _addedinround = RemoteObject.createImmutable(0);
Debug.locals.put("result", _result);
Debug.locals.put("seenTrackIds", _seentrackids);
Debug.locals.put("slot", _slot);
Debug.locals.put("slotReserve", _slotreserve);
Debug.locals.put("slotNeed", _slotneed);
Debug.locals.put("slotLabel", _slotlabel);
Debug.locals.put("trackPlaylistStats", _trackplayliststats);
 BA.debugLineNum = 235;BA.debugLine="Private Sub AddDesiredTrackItemsForSlot(result As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_slot.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_slot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 238;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
Debug.ShouldStop(8192);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getslotplaylists" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 239;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 241;BA.debugLine="Dim playlistIds As List";
Debug.ShouldStop(65536);
_playlistids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("playlistIds", _playlistids);
 BA.debugLineNum = 242;BA.debugLine="playlistIds.Initialize";
Debug.ShouldStop(131072);
_playlistids.runVoidMethod ("Initialize");
 BA.debugLineNum = 243;BA.debugLine="Dim totalPlayable As Int = 0";
Debug.ShouldStop(262144);
_totalplayable = BA.numberCast(int.class, 0);Debug.locals.put("totalPlayable", _totalplayable);Debug.locals.put("totalPlayable", _totalplayable);
 BA.debugLineNum = 244;BA.debugLine="Dim allPlaylistsReady As Boolean = True";
Debug.ShouldStop(524288);
_allplaylistsready = autonomouscachemanager.__c.getField(true,"True");Debug.locals.put("allPlaylistsReady", _allplaylistsready);Debug.locals.put("allPlaylistsReady", _allplaylistsready);
 BA.debugLineNum = 246;BA.debugLine="For Each playlistObject As Object In playlists";
Debug.ShouldStop(2097152);
{
final RemoteObject group8 = _playlists;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_playlistobject = group8.runMethod(false,"Get",index8);Debug.locals.put("playlistObject", _playlistobject);
Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 247;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map")))),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 248;BA.debugLine="Dim descriptor As Map = playlistObject";
Debug.ShouldStop(8388608);
_descriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_descriptor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("descriptor", _descriptor);Debug.locals.put("descriptor", _descriptor);
 BA.debugLineNum = 249;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
Debug.ShouldStop(16777216);
_playlistid = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getplaylistidfromdescriptor" /*RemoteObject*/ ,(Object)(_descriptor));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 250;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 251;BA.debugLine="If playlistIds.IndexOf(playlistId) >= 0 Then Con";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("g",_playlistids.runMethod(true,"IndexOf",(Object)((_playlistid))),BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 252;BA.debugLine="playlistIds.Add(playlistId)";
Debug.ShouldStop(134217728);
_playlistids.runVoidMethod ("Add",(Object)((_playlistid)));
 BA.debugLineNum = 253;BA.debugLine="Dim playlistPlayableCount As Int = GetCachedTrac";
Debug.ShouldStop(268435456);
_playlistplayablecount = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getcachedtrackcountforplaylist" /*RemoteObject*/ ,(Object)(_trackplayliststats),(Object)(_playlistid));Debug.locals.put("playlistPlayableCount", _playlistplayablecount);Debug.locals.put("playlistPlayableCount", _playlistplayablecount);
 BA.debugLineNum = 254;BA.debugLine="totalPlayable = totalPlayable + playlistPlayable";
Debug.ShouldStop(536870912);
_totalplayable = RemoteObject.solve(new RemoteObject[] {_totalplayable,_playlistplayablecount}, "+",1, 1);Debug.locals.put("totalPlayable", _totalplayable);
 BA.debugLineNum = 255;BA.debugLine="If playlistPlayableCount < perPlaylistMinReserve";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",_playlistplayablecount,BA.numberCast(double.class, __ref.getField(true,"_perplaylistminreserve" /*RemoteObject*/ )))) { 
_allplaylistsready = autonomouscachemanager.__c.getField(true,"False");Debug.locals.put("allPlaylistsReady", _allplaylistsready);};
 }
}Debug.locals.put("playlistObject", _playlistobject);
;
 BA.debugLineNum = 258;BA.debugLine="If playlistIds.Size = 0 Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_playlistids.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 259;BA.debugLine="If slotNeed <= 0 And totalPlayable >= slotReserve";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("k",_slotneed,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("g",_totalplayable,BA.numberCast(double.class, _slotreserve)) && RemoteObject.solveBoolean(".",_allplaylistsready)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 261;BA.debugLine="Dim manifestsByPlaylist As Map";
Debug.ShouldStop(16);
_manifestsbyplaylist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("manifestsByPlaylist", _manifestsbyplaylist);
 BA.debugLineNum = 262;BA.debugLine="manifestsByPlaylist.Initialize";
Debug.ShouldStop(32);
_manifestsbyplaylist.runVoidMethod ("Initialize");
 BA.debugLineNum = 263;BA.debugLine="totalPlayable = 0";
Debug.ShouldStop(64);
_totalplayable = BA.numberCast(int.class, 0);Debug.locals.put("totalPlayable", _totalplayable);
 BA.debugLineNum = 265;BA.debugLine="For Each playlistObject As Object In playlists";
Debug.ShouldStop(256);
{
final RemoteObject group24 = _playlists;
final int groupLen24 = group24.runMethod(true,"getSize").<Integer>get()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_playlistobject = group24.runMethod(false,"Get",index24);Debug.locals.put("playlistObject", _playlistobject);
Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 266;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map")))),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 268;BA.debugLine="Dim descriptor As Map = playlistObject";
Debug.ShouldStop(2048);
_descriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_descriptor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("descriptor", _descriptor);Debug.locals.put("descriptor", _descriptor);
 BA.debugLineNum = 269;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
Debug.ShouldStop(4096);
_playlistid = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getplaylistidfromdescriptor" /*RemoteObject*/ ,(Object)(_descriptor));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 270;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 272;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
Debug.ShouldStop(32768);
_manifest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_manifest = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_loadplaylistmanifestsafe" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("manifest", _manifest);Debug.locals.put("manifest", _manifest);
 BA.debugLineNum = 273;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_manifest.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_manifest.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 274;BA.debugLine="If manifestsByPlaylist.ContainsKey(playlistId) T";
Debug.ShouldStop(131072);
if (_manifestsbyplaylist.runMethod(true,"ContainsKey",(Object)((_playlistid))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 276;BA.debugLine="manifestsByPlaylist.Put(playlistId, manifest)";
Debug.ShouldStop(524288);
_manifestsbyplaylist.runVoidMethod ("Put",(Object)((_playlistid)),(Object)((_manifest.getObject())));
 BA.debugLineNum = 277;BA.debugLine="totalPlayable = totalPlayable + GetCachedTrackCo";
Debug.ShouldStop(1048576);
_totalplayable = RemoteObject.solve(new RemoteObject[] {_totalplayable,__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getcachedtrackcountforplaylist" /*RemoteObject*/ ,(Object)(_trackplayliststats),(Object)(_playlistid))}, "+",1, 1);Debug.locals.put("totalPlayable", _totalplayable);
 }
}Debug.locals.put("playlistObject", _playlistobject);
;
 BA.debugLineNum = 280;BA.debugLine="If playlistIds.Size = 0 Then Return";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_playlistids.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 282;BA.debugLine="Dim remainingNeed As Int = Max(0, slotReserve - t";
Debug.ShouldStop(33554432);
_remainingneed = BA.numberCast(int.class, autonomouscachemanager.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_slotreserve,_totalplayable}, "-",1, 1)))));Debug.locals.put("remainingNeed", _remainingneed);Debug.locals.put("remainingNeed", _remainingneed);
 BA.debugLineNum = 283;BA.debugLine="If slotNeed > remainingNeed Then remainingNeed =";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_slotneed,BA.numberCast(double.class, _remainingneed))) { 
_remainingneed = _slotneed;Debug.locals.put("remainingNeed", _remainingneed);};
 BA.debugLineNum = 285;BA.debugLine="For Each playlistId As String In playlistIds";
Debug.ShouldStop(268435456);
{
final RemoteObject group38 = _playlistids;
final int groupLen38 = group38.runMethod(true,"getSize").<Integer>get()
;int index38 = 0;
;
for (; index38 < groupLen38;index38++){
_playlistid = BA.ObjectToString(group38.runMethod(false,"Get",index38));Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 286;BA.debugLine="Dim manifest As Map = manifestsByPlaylist.Get(pl";
Debug.ShouldStop(536870912);
_manifest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_manifest = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _manifestsbyplaylist.runMethod(false,"Get",(Object)((_playlistid))));Debug.locals.put("manifest", _manifest);Debug.locals.put("manifest", _manifest);
 BA.debugLineNum = 287;BA.debugLine="Dim playableInPlaylist As Int = GetCachedTrackCo";
Debug.ShouldStop(1073741824);
_playableinplaylist = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getcachedtrackcountforplaylist" /*RemoteObject*/ ,(Object)(_trackplayliststats),(Object)(_playlistid));Debug.locals.put("playableInPlaylist", _playableinplaylist);Debug.locals.put("playableInPlaylist", _playableinplaylist);
 BA.debugLineNum = 288;BA.debugLine="Dim missingForPlaylist As Int = Max(0, perPlayli";
Debug.ShouldStop(-2147483648);
_missingforplaylist = BA.numberCast(int.class, autonomouscachemanager.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_perplaylistminreserve" /*RemoteObject*/ ),_playableinplaylist}, "-",1, 1)))));Debug.locals.put("missingForPlaylist", _missingforplaylist);Debug.locals.put("missingForPlaylist", _missingforplaylist);
 BA.debugLineNum = 289;BA.debugLine="If missingForPlaylist <= 0 Then Continue";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("k",_missingforplaylist,BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 290;BA.debugLine="Dim addedCount As Int = CollectUpcomingTracksFor";
Debug.ShouldStop(2);
_addedcount = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_collectupcomingtracksforplaylist" /*RemoteObject*/ ,(Object)(_result),(Object)(_seentrackids),(Object)(_playlistid),(Object)(_missingforplaylist));Debug.locals.put("addedCount", _addedcount);Debug.locals.put("addedCount", _addedcount);
 BA.debugLineNum = 291;BA.debugLine="If addedCount > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_addedcount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 292;BA.debugLine="Trace(\"autocache slot fill slot=\" & slotLabel &";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("autocache slot fill slot="),_slotlabel,RemoteObject.createImmutable(" playlistId="),_playlistid,RemoteObject.createImmutable(" added="),_addedcount,RemoteObject.createImmutable(" reason=per_playlist_min"))));
 };
 }
}Debug.locals.put("playlistId", _playlistid);
;
 BA.debugLineNum = 296;BA.debugLine="If remainingNeed <= 0 Then Return";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("k",_remainingneed,BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 298;BA.debugLine="Do While remainingNeed > 0";
Debug.ShouldStop(512);
while (RemoteObject.solveBoolean(">",_remainingneed,BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 299;BA.debugLine="Dim addedInRound As Int = 0";
Debug.ShouldStop(1024);
_addedinround = BA.numberCast(int.class, 0);Debug.locals.put("addedInRound", _addedinround);Debug.locals.put("addedInRound", _addedinround);
 BA.debugLineNum = 300;BA.debugLine="For Each playlistId As String In playlistIds";
Debug.ShouldStop(2048);
{
final RemoteObject group51 = _playlistids;
final int groupLen51 = group51.runMethod(true,"getSize").<Integer>get()
;int index51 = 0;
;
for (; index51 < groupLen51;index51++){
_playlistid = BA.ObjectToString(group51.runMethod(false,"Get",index51));Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 301;BA.debugLine="If remainingNeed <= 0 Then Exit";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("k",_remainingneed,BA.numberCast(double.class, 0))) { 
if (true) break;};
 BA.debugLineNum = 302;BA.debugLine="Dim addedCount As Int = CollectUpcomingTracksFo";
Debug.ShouldStop(8192);
_addedcount = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_collectupcomingtracksforplaylist" /*RemoteObject*/ ,(Object)(_result),(Object)(_seentrackids),(Object)(_playlistid),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("addedCount", _addedcount);Debug.locals.put("addedCount", _addedcount);
 BA.debugLineNum = 303;BA.debugLine="If addedCount <= 0 Then Continue";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("k",_addedcount,BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 304;BA.debugLine="addedInRound = addedInRound + addedCount";
Debug.ShouldStop(32768);
_addedinround = RemoteObject.solve(new RemoteObject[] {_addedinround,_addedcount}, "+",1, 1);Debug.locals.put("addedInRound", _addedinround);
 BA.debugLineNum = 305;BA.debugLine="remainingNeed = Max(0, remainingNeed - addedCou";
Debug.ShouldStop(65536);
_remainingneed = BA.numberCast(int.class, autonomouscachemanager.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_remainingneed,_addedcount}, "-",1, 1)))));Debug.locals.put("remainingNeed", _remainingneed);
 }
}Debug.locals.put("playlistId", _playlistid);
;
 BA.debugLineNum = 307;BA.debugLine="If addedInRound <= 0 Then Exit";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("k",_addedinround,BA.numberCast(double.class, 0))) { 
if (true) break;};
 }
;
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _builddesiredtrackitemsforslots(RemoteObject __ref,RemoteObject _currentslot,RemoteObject _nextslot,RemoteObject _currentneed,RemoteObject _nextneed,RemoteObject _trackplayliststats) throws Exception{
try {
		Debug.PushSubsStack("BuildDesiredTrackItemsForSlots (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("builddesiredtrackitemsforslots")) { return __ref.runUserSub(false, "autonomouscachemanager","builddesiredtrackitemsforslots", __ref, _currentslot, _nextslot, _currentneed, _nextneed, _trackplayliststats);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _seentrackids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("nextSlot", _nextslot);
Debug.locals.put("currentNeed", _currentneed);
Debug.locals.put("nextNeed", _nextneed);
Debug.locals.put("trackPlaylistStats", _trackplayliststats);
 BA.debugLineNum = 222;BA.debugLine="Private Sub BuildDesiredTrackItemsForSlots(current";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Dim result As List";
Debug.ShouldStop(1073741824);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 224;BA.debugLine="result.Initialize";
Debug.ShouldStop(-2147483648);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 226;BA.debugLine="Dim seenTrackIds As Map";
Debug.ShouldStop(2);
_seentrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("seenTrackIds", _seentrackids);
 BA.debugLineNum = 227;BA.debugLine="seenTrackIds.Initialize";
Debug.ShouldStop(4);
_seentrackids.runVoidMethod ("Initialize");
 BA.debugLineNum = 229;BA.debugLine="AddDesiredTrackItemsForSlot(result, seenTrackIds,";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_adddesiredtrackitemsforslot" /*RemoteObject*/ ,(Object)(_result),(Object)(_seentrackids),(Object)(_currentslot),(Object)(__ref.getField(true,"_currentslotminreserve" /*RemoteObject*/ )),(Object)(_currentneed),(Object)(BA.ObjectToString("current")),(Object)(_trackplayliststats));
 BA.debugLineNum = 230;BA.debugLine="AddDesiredTrackItemsForSlot(result, seenTrackIds,";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_adddesiredtrackitemsforslot" /*RemoteObject*/ ,(Object)(_result),(Object)(_seentrackids),(Object)(_nextslot),(Object)(__ref.getField(true,"_nextslotminreserve" /*RemoteObject*/ )),(Object)(_nextneed),(Object)(BA.ObjectToString("next")),(Object)(_trackplayliststats));
 BA.debugLineNum = 232;BA.debugLine="Return result";
Debug.ShouldStop(128);
if (true) return _result;
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildprotectedtrackids(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildProtectedTrackIds (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("buildprotectedtrackids")) { return __ref.runUserSub(false, "autonomouscachemanager","buildprotectedtrackids", __ref);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 374;BA.debugLine="Private Sub BuildProtectedTrackIds As List";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 375;BA.debugLine="Dim result As List";
Debug.ShouldStop(4194304);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 376;BA.debugLine="result.Initialize";
Debug.ShouldStop(8388608);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 377;BA.debugLine="Return result";
Debug.ShouldStop(16777216);
if (true) return _result;
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildrelevanttrackids(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildRelevantTrackIds (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,380);
if (RapidSub.canDelegate("buildrelevanttrackids")) { return __ref.runUserSub(false, "autonomouscachemanager","buildrelevanttrackids", __ref);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _relevantids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _descriptors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _descriptorobject = RemoteObject.declareNull("Object");
RemoteObject _descriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _manifest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _order = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackid = RemoteObject.createImmutable("");
 BA.debugLineNum = 380;BA.debugLine="Private Sub BuildRelevantTrackIds As List";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 381;BA.debugLine="Dim result As List";
Debug.ShouldStop(268435456);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 382;BA.debugLine="result.Initialize";
Debug.ShouldStop(536870912);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 384;BA.debugLine="Dim relevantIds As Map";
Debug.ShouldStop(-2147483648);
_relevantids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("relevantIds", _relevantids);
 BA.debugLineNum = 385;BA.debugLine="relevantIds.Initialize";
Debug.ShouldStop(1);
_relevantids.runVoidMethod ("Initialize");
 BA.debugLineNum = 387;BA.debugLine="Dim descriptors As List = GetStoredPlaylistDescri";
Debug.ShouldStop(4);
_descriptors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_descriptors = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getstoredplaylistdescriptorssafe" /*RemoteObject*/ );Debug.locals.put("descriptors", _descriptors);Debug.locals.put("descriptors", _descriptors);
 BA.debugLineNum = 388;BA.debugLine="If descriptors.IsInitialized = False Or descripto";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_descriptors.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_descriptors.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _result;};
 BA.debugLineNum = 390;BA.debugLine="For Each descriptorObject As Object In descriptor";
Debug.ShouldStop(32);
{
final RemoteObject group7 = _descriptors;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_descriptorobject = group7.runMethod(false,"Get",index7);Debug.locals.put("descriptorObject", _descriptorobject);
Debug.locals.put("descriptorObject", _descriptorobject);
 BA.debugLineNum = 391;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_descriptorobject, RemoteObject.createImmutable("java.util.Map")))),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 393;BA.debugLine="Dim descriptor As Map = descriptorObject";
Debug.ShouldStop(256);
_descriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_descriptor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _descriptorobject);Debug.locals.put("descriptor", _descriptor);Debug.locals.put("descriptor", _descriptor);
 BA.debugLineNum = 394;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
Debug.ShouldStop(512);
_playlistid = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getplaylistidfromdescriptor" /*RemoteObject*/ ,(Object)(_descriptor));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 395;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 397;BA.debugLine="Dim manifest As Map = LoadPlaylistManifestSafe(p";
Debug.ShouldStop(4096);
_manifest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_manifest = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_loadplaylistmanifestsafe" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("manifest", _manifest);Debug.locals.put("manifest", _manifest);
 BA.debugLineNum = 398;BA.debugLine="If manifest.IsInitialized = False Or manifest.Si";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_manifest.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_manifest.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 400;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
Debug.ShouldStop(32768);
_order = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_order = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _manifest.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("order"))),(Object)(autonomouscachemanager.__c.getField(false,"Null"))));Debug.locals.put("order", _order);Debug.locals.put("order", _order);
 BA.debugLineNum = 401;BA.debugLine="If order.IsInitialized = False Then Continue";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_order.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 403;BA.debugLine="For Each trackId As String In order";
Debug.ShouldStop(262144);
{
final RemoteObject group16 = _order;
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_trackid = BA.ObjectToString(group16.runMethod(false,"Get",index16));Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 404;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 405;BA.debugLine="If relevantIds.ContainsKey(trackId) Then Contin";
Debug.ShouldStop(1048576);
if (_relevantids.runMethod(true,"ContainsKey",(Object)((_trackid))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 406;BA.debugLine="relevantIds.Put(trackId, True)";
Debug.ShouldStop(2097152);
_relevantids.runVoidMethod ("Put",(Object)((_trackid)),(Object)((autonomouscachemanager.__c.getField(true,"True"))));
 }
}Debug.locals.put("trackId", _trackid);
;
 }
}Debug.locals.put("descriptorObject", _descriptorobject);
;
 BA.debugLineNum = 410;BA.debugLine="For Each trackId As String In relevantIds.Keys";
Debug.ShouldStop(33554432);
{
final RemoteObject group22 = _relevantids.runMethod(false,"Keys");
final int groupLen22 = group22.runMethod(true,"getSize").<Integer>get()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_trackid = BA.ObjectToString(group22.runMethod(false,"Get",index22));Debug.locals.put("trackId", _trackid);
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 411;BA.debugLine="result.Add(trackId)";
Debug.ShouldStop(67108864);
_result.runVoidMethod ("Add",(Object)((_trackid)));
 }
}Debug.locals.put("trackId", _trackid);
;
 BA.debugLineNum = 414;BA.debugLine="Return result";
Debug.ShouldStop(536870912);
if (true) return _result;
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private kvs As KeyValueStore";
autonomouscachemanager._kvs = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_kvs",autonomouscachemanager._kvs);
 //BA.debugLineNum = 8;BA.debugLine="Private offlineStoreService As OfflineStore";
autonomouscachemanager._offlinestoreservice = RemoteObject.createNew ("b4j.example.offlinestore");__ref.setField("_offlinestoreservice",autonomouscachemanager._offlinestoreservice);
 //BA.debugLineNum = 9;BA.debugLine="Private dataResolverService As DataPlaybackResolv";
autonomouscachemanager._dataresolverservice = RemoteObject.createNew ("b4j.example.dataplaybackresolver");__ref.setField("_dataresolverservice",autonomouscachemanager._dataresolverservice);
 //BA.debugLineNum = 10;BA.debugLine="Private mediaCacheService As MediaCache";
autonomouscachemanager._mediacacheservice = RemoteObject.createNew ("b4j.example.mediacache");__ref.setField("_mediacacheservice",autonomouscachemanager._mediacacheservice);
 //BA.debugLineNum = 12;BA.debugLine="Private traceTarget As Object";
autonomouscachemanager._tracetarget = RemoteObject.createNew ("Object");__ref.setField("_tracetarget",autonomouscachemanager._tracetarget);
 //BA.debugLineNum = 13;BA.debugLine="Private traceSubName As String";
autonomouscachemanager._tracesubname = RemoteObject.createImmutable("");__ref.setField("_tracesubname",autonomouscachemanager._tracesubname);
 //BA.debugLineNum = 15;BA.debugLine="Private workerTimer As Timer";
autonomouscachemanager._workertimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_workertimer",autonomouscachemanager._workertimer);
 //BA.debugLineNum = 16;BA.debugLine="Private isRunning As Boolean";
autonomouscachemanager._isrunning = RemoteObject.createImmutable(false);__ref.setField("_isrunning",autonomouscachemanager._isrunning);
 //BA.debugLineNum = 17;BA.debugLine="Private stepInProgress As Boolean";
autonomouscachemanager._stepinprogress = RemoteObject.createImmutable(false);__ref.setField("_stepinprogress",autonomouscachemanager._stepinprogress);
 //BA.debugLineNum = 19;BA.debugLine="Private Const DEFAULT_TICK_INTERVAL_MS As Int = 3";
autonomouscachemanager._default_tick_interval_ms = BA.numberCast(int.class, 30000);__ref.setField("_default_tick_interval_ms",autonomouscachemanager._default_tick_interval_ms);
 //BA.debugLineNum = 20;BA.debugLine="Private Const DEFAULT_DOWNLOAD_COOLDOWN_MS As Lon";
autonomouscachemanager._default_download_cooldown_ms = BA.numberCast(long.class, 15000);__ref.setField("_default_download_cooldown_ms",autonomouscachemanager._default_download_cooldown_ms);
 //BA.debugLineNum = 21;BA.debugLine="Private Const DEFAULT_FAILURE_COOLDOWN_MS As Long";
autonomouscachemanager._default_failure_cooldown_ms = BA.numberCast(long.class, 120000);__ref.setField("_default_failure_cooldown_ms",autonomouscachemanager._default_failure_cooldown_ms);
 //BA.debugLineNum = 22;BA.debugLine="Private Const DEFAULT_PRUNE_COOLDOWN_MS As Long =";
autonomouscachemanager._default_prune_cooldown_ms = BA.numberCast(long.class, 60000);__ref.setField("_default_prune_cooldown_ms",autonomouscachemanager._default_prune_cooldown_ms);
 //BA.debugLineNum = 24;BA.debugLine="Private Const DEFAULT_CURRENT_SLOT_MIN_RESERVE As";
autonomouscachemanager._default_current_slot_min_reserve = BA.numberCast(int.class, 8);__ref.setField("_default_current_slot_min_reserve",autonomouscachemanager._default_current_slot_min_reserve);
 //BA.debugLineNum = 25;BA.debugLine="Private Const DEFAULT_NEXT_SLOT_MIN_RESERVE As In";
autonomouscachemanager._default_next_slot_min_reserve = BA.numberCast(int.class, 4);__ref.setField("_default_next_slot_min_reserve",autonomouscachemanager._default_next_slot_min_reserve);
 //BA.debugLineNum = 26;BA.debugLine="Private Const DEFAULT_PER_PLAYLIST_MIN_RESERVE As";
autonomouscachemanager._default_per_playlist_min_reserve = BA.numberCast(int.class, 2);__ref.setField("_default_per_playlist_min_reserve",autonomouscachemanager._default_per_playlist_min_reserve);
 //BA.debugLineNum = 27;BA.debugLine="Private Const DEFAULT_MAX_DOWNLOADS_PER_STEP As I";
autonomouscachemanager._default_max_downloads_per_step = BA.numberCast(int.class, 2);__ref.setField("_default_max_downloads_per_step",autonomouscachemanager._default_max_downloads_per_step);
 //BA.debugLineNum = 29;BA.debugLine="Private tickIntervalMs As Int = DEFAULT_TICK_INTE";
autonomouscachemanager._tickintervalms = __ref.getField(true,"_default_tick_interval_ms" /*RemoteObject*/ );__ref.setField("_tickintervalms",autonomouscachemanager._tickintervalms);
 //BA.debugLineNum = 30;BA.debugLine="Private downloadCooldownMs As Long = DEFAULT_DOWN";
autonomouscachemanager._downloadcooldownms = __ref.getField(true,"_default_download_cooldown_ms" /*RemoteObject*/ );__ref.setField("_downloadcooldownms",autonomouscachemanager._downloadcooldownms);
 //BA.debugLineNum = 31;BA.debugLine="Private failureCooldownMs As Long = DEFAULT_FAILU";
autonomouscachemanager._failurecooldownms = __ref.getField(true,"_default_failure_cooldown_ms" /*RemoteObject*/ );__ref.setField("_failurecooldownms",autonomouscachemanager._failurecooldownms);
 //BA.debugLineNum = 32;BA.debugLine="Private pruneCooldownMs As Long = DEFAULT_PRUNE_C";
autonomouscachemanager._prunecooldownms = __ref.getField(true,"_default_prune_cooldown_ms" /*RemoteObject*/ );__ref.setField("_prunecooldownms",autonomouscachemanager._prunecooldownms);
 //BA.debugLineNum = 34;BA.debugLine="Private currentSlotMinReserve As Int = DEFAULT_CU";
autonomouscachemanager._currentslotminreserve = __ref.getField(true,"_default_current_slot_min_reserve" /*RemoteObject*/ );__ref.setField("_currentslotminreserve",autonomouscachemanager._currentslotminreserve);
 //BA.debugLineNum = 35;BA.debugLine="Private nextSlotMinReserve As Int = DEFAULT_NEXT_";
autonomouscachemanager._nextslotminreserve = __ref.getField(true,"_default_next_slot_min_reserve" /*RemoteObject*/ );__ref.setField("_nextslotminreserve",autonomouscachemanager._nextslotminreserve);
 //BA.debugLineNum = 36;BA.debugLine="Private perPlaylistMinReserve As Int = DEFAULT_PE";
autonomouscachemanager._perplaylistminreserve = __ref.getField(true,"_default_per_playlist_min_reserve" /*RemoteObject*/ );__ref.setField("_perplaylistminreserve",autonomouscachemanager._perplaylistminreserve);
 //BA.debugLineNum = 37;BA.debugLine="Private maxDownloadsPerStep As Int = DEFAULT_MAX_";
autonomouscachemanager._maxdownloadsperstep = __ref.getField(true,"_default_max_downloads_per_step" /*RemoteObject*/ );__ref.setField("_maxdownloadsperstep",autonomouscachemanager._maxdownloadsperstep);
 //BA.debugLineNum = 39;BA.debugLine="Private lastSuccessfulDownloadAt As Long";
autonomouscachemanager._lastsuccessfuldownloadat = RemoteObject.createImmutable(0L);__ref.setField("_lastsuccessfuldownloadat",autonomouscachemanager._lastsuccessfuldownloadat);
 //BA.debugLineNum = 40;BA.debugLine="Private lastFailureAt As Long";
autonomouscachemanager._lastfailureat = RemoteObject.createImmutable(0L);__ref.setField("_lastfailureat",autonomouscachemanager._lastfailureat);
 //BA.debugLineNum = 41;BA.debugLine="Private lastPruneAt As Long";
autonomouscachemanager._lastpruneat = RemoteObject.createImmutable(0L);__ref.setField("_lastpruneat",autonomouscachemanager._lastpruneat);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,504);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "autonomouscachemanager","clonemap", __ref, _sourcemap);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 504;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 505;BA.debugLine="Dim result As Map";
Debug.ShouldStop(16777216);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 506;BA.debugLine="result.Initialize";
Debug.ShouldStop(33554432);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 508;BA.debugLine="If sourceMap.IsInitialized = False Then Return re";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_sourcemap.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) return _result;};
 BA.debugLineNum = 510;BA.debugLine="For Each key As Object In sourceMap.Keys";
Debug.ShouldStop(536870912);
{
final RemoteObject group4 = _sourcemap.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 511;BA.debugLine="result.Put(key, sourceMap.Get(key))";
Debug.ShouldStop(1073741824);
_result.runVoidMethod ("Put",(Object)(_key),(Object)(_sourcemap.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 514;BA.debugLine="Return result";
Debug.ShouldStop(2);
if (true) return _result;
 BA.debugLineNum = 515;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _collectupcomingtracksforplaylist(RemoteObject __ref,RemoteObject _result,RemoteObject _seentrackids,RemoteObject _playlistid,RemoteObject _limitcount) throws Exception{
try {
		Debug.PushSubsStack("CollectUpcomingTracksForPlaylist (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("collectupcomingtracksforplaylist")) { return __ref.runUserSub(false, "autonomouscachemanager","collectupcomingtracksforplaylist", __ref, _result, _seentrackids, _playlistid, _limitcount);}
RemoteObject _requestcount = RemoteObject.createImmutable(0);
RemoteObject _upcomingtracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _addedcount = RemoteObject.createImmutable(0);
RemoteObject _trackobject = RemoteObject.declareNull("Object");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _normalizedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("result", _result);
Debug.locals.put("seenTrackIds", _seentrackids);
Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("limitCount", _limitcount);
 BA.debugLineNum = 320;BA.debugLine="Private Sub CollectUpcomingTracksForPlaylist(resul";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="If playlistId = \"\" Or limitCount <= 0 Then Return";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString("")) || RemoteObject.solveBoolean("k",_limitcount,BA.numberCast(double.class, 0))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 322;BA.debugLine="Dim requestCount As Int = Max(limitCount * 8, per";
Debug.ShouldStop(2);
_requestcount = BA.numberCast(int.class, autonomouscachemanager.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_limitcount,RemoteObject.createImmutable(8)}, "*",0, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_perplaylistminreserve" /*RemoteObject*/ ),RemoteObject.createImmutable(8)}, "*",0, 1)))));Debug.locals.put("requestCount", _requestcount);Debug.locals.put("requestCount", _requestcount);
 BA.debugLineNum = 323;BA.debugLine="Dim upcomingTracks As List = dataResolverService.";
Debug.ShouldStop(4);
_upcomingtracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_upcomingtracks = __ref.getField(false,"_dataresolverservice" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_getupcomingplaybacktracksbyid" /*RemoteObject*/ ,(Object)(_playlistid),(Object)(_requestcount),(Object)(__ref.getField(false,"_mediacacheservice" /*RemoteObject*/ )),(Object)(autonomouscachemanager.__c.getField(true,"False")));Debug.locals.put("upcomingTracks", _upcomingtracks);Debug.locals.put("upcomingTracks", _upcomingtracks);
 BA.debugLineNum = 324;BA.debugLine="If upcomingTracks.IsInitialized = False Or upcomi";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_upcomingtracks.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_upcomingtracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 325;BA.debugLine="Dim addedCount As Int = 0";
Debug.ShouldStop(16);
_addedcount = BA.numberCast(int.class, 0);Debug.locals.put("addedCount", _addedcount);Debug.locals.put("addedCount", _addedcount);
 BA.debugLineNum = 326;BA.debugLine="For Each trackObject As Object In upcomingTracks";
Debug.ShouldStop(32);
{
final RemoteObject group6 = _upcomingtracks;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_trackobject = group6.runMethod(false,"Get",index6);Debug.locals.put("trackObject", _trackobject);
Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 327;BA.debugLine="If addedCount >= limitCount Then Exit";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",_addedcount,BA.numberCast(double.class, _limitcount))) { 
if (true) break;};
 BA.debugLineNum = 328;BA.debugLine="If (trackObject Is Map) = False Then Continue";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map")))),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 329;BA.debugLine="Dim track As Map = trackObject";
Debug.ShouldStop(256);
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_track = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 330;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
Debug.ShouldStop(512);
_trackid = BA.ObjectToString(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 331;BA.debugLine="If trackId = \"\" Then Continue";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 332;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Contin";
Debug.ShouldStop(2048);
if (_seentrackids.runMethod(true,"ContainsKey",(Object)((_trackid))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 333;BA.debugLine="If IsTrackAlreadyAvailable(track, playlistId) Th";
Debug.ShouldStop(4096);
if (__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_istrackalreadyavailable" /*RemoteObject*/ ,(Object)(_track),(Object)(_playlistid)).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 334;BA.debugLine="Dim normalizedTrack As Map = CloneMap(track)";
Debug.ShouldStop(8192);
_normalizedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_normalizedtrack = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_clonemap" /*RemoteObject*/ ,(Object)(_track));Debug.locals.put("normalizedTrack", _normalizedtrack);Debug.locals.put("normalizedTrack", _normalizedtrack);
 BA.debugLineNum = 335;BA.debugLine="If normalizedTrack.ContainsKey(\"type\") = False T";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_normalizedtrack.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("type")))),autonomouscachemanager.__c.getField(true,"False"))) { 
_normalizedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("track"))));};
 BA.debugLineNum = 336;BA.debugLine="normalizedTrack.Put(\"playlist_prefetch_source\",";
Debug.ShouldStop(32768);
_normalizedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_prefetch_source"))),(Object)((RemoteObject.createImmutable("playback_upcoming"))));
 BA.debugLineNum = 337;BA.debugLine="result.Add(normalizedTrack)";
Debug.ShouldStop(65536);
_result.runVoidMethod ("Add",(Object)((_normalizedtrack.getObject())));
 BA.debugLineNum = 338;BA.debugLine="seenTrackIds.Put(trackId, True)";
Debug.ShouldStop(131072);
_seentrackids.runVoidMethod ("Put",(Object)((_trackid)),(Object)((autonomouscachemanager.__c.getField(true,"True"))));
 BA.debugLineNum = 339;BA.debugLine="addedCount = addedCount + 1";
Debug.ShouldStop(262144);
_addedcount = RemoteObject.solve(new RemoteObject[] {_addedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("addedCount", _addedcount);
 BA.debugLineNum = 340;BA.debugLine="Trace(\"autocache candidate playlistId=\" & playli";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("autocache candidate playlistId="),_playlistid,RemoteObject.createImmutable(" orderIndex="),_normalizedtrack.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_track_index"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))),RemoteObject.createImmutable(" trackId="),_trackid,RemoteObject.createImmutable(" source=playback_manifest_cursor"))));
 }
}Debug.locals.put("trackObject", _trackobject);
;
 BA.debugLineNum = 342;BA.debugLine="Return addedCount";
Debug.ShouldStop(2097152);
if (true) return _addedcount;
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configure(RemoteObject __ref,RemoteObject _tickms,RemoteObject _currentreserve,RemoteObject _nextreserve,RemoteObject _perplaylistreserve,RemoteObject _maxdownloads) throws Exception{
try {
		Debug.PushSubsStack("Configure (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("configure")) { return __ref.runUserSub(false, "autonomouscachemanager","configure", __ref, _tickms, _currentreserve, _nextreserve, _perplaylistreserve, _maxdownloads);}
Debug.locals.put("tickMs", _tickms);
Debug.locals.put("currentReserve", _currentreserve);
Debug.locals.put("nextReserve", _nextreserve);
Debug.locals.put("perPlaylistReserve", _perplaylistreserve);
Debug.locals.put("maxDownloads", _maxdownloads);
 BA.debugLineNum = 62;BA.debugLine="Public Sub Configure( _ 	tickMs As Int, _ 	current";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 69;BA.debugLine="If tickMs > 0 Then tickIntervalMs = tickMs";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_tickms,BA.numberCast(double.class, 0))) { 
__ref.setField ("_tickintervalms" /*RemoteObject*/ ,_tickms);};
 BA.debugLineNum = 70;BA.debugLine="If currentReserve >= 0 Then currentSlotMinReserve";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("g",_currentreserve,BA.numberCast(double.class, 0))) { 
__ref.setField ("_currentslotminreserve" /*RemoteObject*/ ,_currentreserve);};
 BA.debugLineNum = 71;BA.debugLine="If nextReserve >= 0 Then nextSlotMinReserve = nex";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",_nextreserve,BA.numberCast(double.class, 0))) { 
__ref.setField ("_nextslotminreserve" /*RemoteObject*/ ,_nextreserve);};
 BA.debugLineNum = 72;BA.debugLine="If perPlaylistReserve >= 0 Then perPlaylistMinRes";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("g",_perplaylistreserve,BA.numberCast(double.class, 0))) { 
__ref.setField ("_perplaylistminreserve" /*RemoteObject*/ ,_perplaylistreserve);};
 BA.debugLineNum = 73;BA.debugLine="If maxDownloads > 0 Then maxDownloadsPerStep = ma";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_maxdownloads,BA.numberCast(double.class, 0))) { 
__ref.setField ("_maxdownloadsperstep" /*RemoteObject*/ ,_maxdownloads);};
 BA.debugLineNum = 75;BA.debugLine="workerTimer.Interval = tickIntervalMs";
Debug.ShouldStop(1024);
__ref.getField(false,"_workertimer" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, __ref.getField(true,"_tickintervalms" /*RemoteObject*/ )));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _countplayabletracksinslot(RemoteObject __ref,RemoteObject _slot,RemoteObject _trackplayliststats) throws Exception{
try {
		Debug.PushSubsStack("CountPlayableTracksInSlot (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("countplayabletracksinslot")) { return __ref.runUserSub(false, "autonomouscachemanager","countplayabletracksinslot", __ref, _slot, _trackplayliststats);}
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totalcount = RemoteObject.createImmutable(0);
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
Debug.locals.put("slot", _slot);
Debug.locals.put("trackPlaylistStats", _trackplayliststats);
 BA.debugLineNum = 203;BA.debugLine="Private Sub CountPlayableTracksInSlot(slot As Map,";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="If slot.IsInitialized = False Then Return 0";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_slot.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 206;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
Debug.ShouldStop(8192);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getslotplaylists" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 207;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 209;BA.debugLine="Dim totalCount As Int = 0";
Debug.ShouldStop(65536);
_totalcount = BA.numberCast(int.class, 0);Debug.locals.put("totalCount", _totalcount);Debug.locals.put("totalCount", _totalcount);
 BA.debugLineNum = 211;BA.debugLine="For Each playlistObject As Object In playlists";
Debug.ShouldStop(262144);
{
final RemoteObject group5 = _playlists;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_playlistobject = group5.runMethod(false,"Get",index5);Debug.locals.put("playlistObject", _playlistobject);
Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 212;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map")))),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 213;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
Debug.ShouldStop(1048576);
_playlistdescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlistDescriptor", _playlistdescriptor);Debug.locals.put("playlistDescriptor", _playlistdescriptor);
 BA.debugLineNum = 214;BA.debugLine="Dim playlistId As String = GetPlaylistIdFromDesc";
Debug.ShouldStop(2097152);
_playlistid = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getplaylistidfromdescriptor" /*RemoteObject*/ ,(Object)(_playlistdescriptor));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 215;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 216;BA.debugLine="totalCount = totalCount + GetCachedTrackCountFor";
Debug.ShouldStop(8388608);
_totalcount = RemoteObject.solve(new RemoteObject[] {_totalcount,__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getcachedtrackcountforplaylist" /*RemoteObject*/ ,(Object)(_trackplayliststats),(Object)(_playlistid))}, "+",1, 1);Debug.locals.put("totalCount", _totalcount);
 }
}Debug.locals.put("playlistObject", _playlistobject);
;
 BA.debugLineNum = 219;BA.debugLine="Return totalCount";
Debug.ShouldStop(67108864);
if (true) return _totalcount;
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedtrackcountforplaylist(RemoteObject __ref,RemoteObject _trackplayliststats,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("GetCachedTrackCountForPlaylist (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("getcachedtrackcountforplaylist")) { return __ref.runUserSub(false, "autonomouscachemanager","getcachedtrackcountforplaylist", __ref, _trackplayliststats, _playlistid);}
RemoteObject _statskey = RemoteObject.createImmutable("");
RemoteObject _playlistentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("trackPlaylistStats", _trackplayliststats);
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 311;BA.debugLine="Private Sub GetCachedTrackCountForPlaylist(trackPl";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 312;BA.debugLine="If trackPlaylistStats.IsInitialized = False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_trackplayliststats.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 313;BA.debugLine="Dim statsKey As String = playlistId";
Debug.ShouldStop(16777216);
_statskey = _playlistid;Debug.locals.put("statsKey", _statskey);Debug.locals.put("statsKey", _statskey);
 BA.debugLineNum = 314;BA.debugLine="If statsKey = \"\" Then statsKey = \"_unknown\"";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_statskey,BA.ObjectToString(""))) { 
_statskey = BA.ObjectToString("_unknown");Debug.locals.put("statsKey", _statskey);};
 BA.debugLineNum = 315;BA.debugLine="Dim playlistEntry As Map = trackPlaylistStats.Get";
Debug.ShouldStop(67108864);
_playlistentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackplayliststats.runMethod(false,"GetDefault",(Object)((_statskey)),(Object)(autonomouscachemanager.__c.getField(false,"Null"))));Debug.locals.put("playlistEntry", _playlistentry);Debug.locals.put("playlistEntry", _playlistentry);
 BA.debugLineNum = 316;BA.debugLine="If playlistEntry.IsInitialized = False Then Retur";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_playlistentry.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 317;BA.debugLine="Return playlistEntry.GetDefault(\"count\", 0)";
Debug.ShouldStop(268435456);
if (true) return BA.numberCast(int.class, _playlistentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("count"))),(Object)(RemoteObject.createImmutable((0)))));
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getplaylistidfromdescriptor(RemoteObject __ref,RemoteObject _descriptor) throws Exception{
try {
		Debug.PushSubsStack("GetPlaylistIdFromDescriptor (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("getplaylistidfromdescriptor")) { return __ref.runUserSub(false, "autonomouscachemanager","getplaylistidfromdescriptor", __ref, _descriptor);}
RemoteObject _playlistid = RemoteObject.createImmutable("");
Debug.locals.put("descriptor", _descriptor);
 BA.debugLineNum = 435;BA.debugLine="Private Sub GetPlaylistIdFromDescriptor(descriptor";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="If descriptor.IsInitialized = False Then Return \"";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_descriptor.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 438;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
Debug.ShouldStop(2097152);
_playlistid = BA.ObjectToString(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 439;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString(""))) { 
if (true) return _playlistid;};
 BA.debugLineNum = 441;BA.debugLine="playlistId = descriptor.GetDefault(\"playlist_id\",";
Debug.ShouldStop(16777216);
_playlistid = BA.ObjectToString(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 442;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString(""))) { 
if (true) return _playlistid;};
 BA.debugLineNum = 444;BA.debugLine="playlistId = descriptor.GetDefault(\"playlistId\",";
Debug.ShouldStop(134217728);
_playlistid = BA.ObjectToString(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlistId"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 445;BA.debugLine="Return playlistId";
Debug.ShouldStop(268435456);
if (true) return _playlistid;
 BA.debugLineNum = 446;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getslotplaylists(RemoteObject __ref,RemoteObject _slot) throws Exception{
try {
		Debug.PushSubsStack("GetSlotPlaylists (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,417);
if (RapidSub.canDelegate("getslotplaylists")) { return __ref.runUserSub(false, "autonomouscachemanager","getslotplaylists", __ref, _slot);}
RemoteObject _emptylist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _emptyresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("slot", _slot);
 BA.debugLineNum = 417;BA.debugLine="Private Sub GetSlotPlaylists(slot As Map) As List";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="If slot.IsInitialized = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_slot.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 419;BA.debugLine="Dim emptyList As List";
Debug.ShouldStop(4);
_emptylist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("emptyList", _emptylist);
 BA.debugLineNum = 420;BA.debugLine="emptyList.Initialize";
Debug.ShouldStop(8);
_emptylist.runVoidMethod ("Initialize");
 BA.debugLineNum = 421;BA.debugLine="Return emptyList";
Debug.ShouldStop(16);
if (true) return _emptylist;
 };
 BA.debugLineNum = 424;BA.debugLine="Dim playlists As List = slot.GetDefault(\"playlist";
Debug.ShouldStop(128);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(autonomouscachemanager.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 425;BA.debugLine="If playlists.IsInitialized Then Return playlists";
Debug.ShouldStop(256);
if (_playlists.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
if (true) return _playlists;};
 BA.debugLineNum = 427;BA.debugLine="playlists = slot.GetDefault(\"playlist_descriptors";
Debug.ShouldStop(1024);
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_descriptors"))),(Object)(autonomouscachemanager.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 428;BA.debugLine="If playlists.IsInitialized Then Return playlists";
Debug.ShouldStop(2048);
if (_playlists.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
if (true) return _playlists;};
 BA.debugLineNum = 430;BA.debugLine="Dim emptyResult As List";
Debug.ShouldStop(8192);
_emptyresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("emptyResult", _emptyresult);
 BA.debugLineNum = 431;BA.debugLine="emptyResult.Initialize";
Debug.ShouldStop(16384);
_emptyresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 432;BA.debugLine="Return emptyResult";
Debug.ShouldStop(32768);
if (true) return _emptyresult;
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstoredplaylistdescriptorssafe(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetStoredPlaylistDescriptorsSafe (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,462);
if (RapidSub.canDelegate("getstoredplaylistdescriptorssafe")) { return __ref.runUserSub(false, "autonomouscachemanager","getstoredplaylistdescriptorssafe", __ref);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 462;BA.debugLine="Private Sub GetStoredPlaylistDescriptorsSafe As Li";
Debug.ShouldStop(8192);
 BA.debugLineNum = 463;BA.debugLine="Dim result As List";
Debug.ShouldStop(16384);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 464;BA.debugLine="result.Initialize";
Debug.ShouldStop(32768);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 466;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 467;BA.debugLine="result = offlineStoreService.GetStoredPlaylistDe";
Debug.ShouldStop(262144);
_result = __ref.getField(false,"_offlinestoreservice" /*RemoteObject*/ ).runClassMethod (b4j.example.offlinestore.class, "_getstoredplaylistdescriptors" /*RemoteObject*/ );Debug.locals.put("result", _result);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 469;BA.debugLine="result.Initialize";
Debug.ShouldStop(1048576);
_result.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 472;BA.debugLine="Return result";
Debug.ShouldStop(8388608);
if (true) return _result;
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasmediacacherecentfailure(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasMediaCacheRecentFailure (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,475);
if (RapidSub.canDelegate("hasmediacacherecentfailure")) { return __ref.runUserSub(false, "autonomouscachemanager","hasmediacacherecentfailure", __ref);}
 BA.debugLineNum = 475;BA.debugLine="Private Sub HasMediaCacheRecentFailure As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 476;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 477;BA.debugLine="Return mediaCacheService.ConsumeRecentMediaNetwo";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(false,"_mediacacheservice" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_consumerecentmedianetworkfailure" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e4.toString()); BA.debugLineNum = 479;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) return autonomouscachemanager.__c.getField(true,"False");
 };
 BA.debugLineNum = 481;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagevalue,RemoteObject _offlinestorevalue,RemoteObject _dataresolvervalue,RemoteObject _mediacachevalue,RemoteObject _tracetargetvalue,RemoteObject _tracesubnamevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "autonomouscachemanager","initialize", __ref, _ba, _storagevalue, _offlinestorevalue, _dataresolvervalue, _mediacachevalue, _tracetargetvalue, _tracesubnamevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageValue", _storagevalue);
Debug.locals.put("offlineStoreValue", _offlinestorevalue);
Debug.locals.put("dataResolverValue", _dataresolvervalue);
Debug.locals.put("mediaCacheValue", _mediacachevalue);
Debug.locals.put("traceTargetValue", _tracetargetvalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
 BA.debugLineNum = 44;BA.debugLine="Public Sub Initialize( _ 	storageValue As KeyValue";
Debug.ShouldStop(2048);
 BA.debugLineNum = 52;BA.debugLine="kvs = storageValue";
Debug.ShouldStop(524288);
__ref.setField ("_kvs" /*RemoteObject*/ ,_storagevalue);
 BA.debugLineNum = 53;BA.debugLine="offlineStoreService = offlineStoreValue";
Debug.ShouldStop(1048576);
__ref.setField ("_offlinestoreservice" /*RemoteObject*/ ,_offlinestorevalue);
 BA.debugLineNum = 54;BA.debugLine="dataResolverService = dataResolverValue";
Debug.ShouldStop(2097152);
__ref.setField ("_dataresolverservice" /*RemoteObject*/ ,_dataresolvervalue);
 BA.debugLineNum = 55;BA.debugLine="mediaCacheService = mediaCacheValue";
Debug.ShouldStop(4194304);
__ref.setField ("_mediacacheservice" /*RemoteObject*/ ,_mediacachevalue);
 BA.debugLineNum = 56;BA.debugLine="traceTarget = traceTargetValue";
Debug.ShouldStop(8388608);
__ref.setField ("_tracetarget" /*RemoteObject*/ ,_tracetargetvalue);
 BA.debugLineNum = 57;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(16777216);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 59;BA.debugLine="workerTimer.Initialize(\"workerTimer\", tickInterva";
Debug.ShouldStop(67108864);
__ref.getField(false,"_workertimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("workerTimer")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_tickintervalms" /*RemoteObject*/ ))));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isdownloadcooldownactive(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsDownloadCooldownActive (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,483);
if (RapidSub.canDelegate("isdownloadcooldownactive")) { return __ref.runUserSub(false, "autonomouscachemanager","isdownloadcooldownactive", __ref);}
 BA.debugLineNum = 483;BA.debugLine="Private Sub IsDownloadCooldownActive As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 484;BA.debugLine="If lastSuccessfulDownloadAt <= 0 Then Return Fals";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_lastsuccessfuldownloadat" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
if (true) return autonomouscachemanager.__c.getField(true,"False");};
 BA.debugLineNum = 485;BA.debugLine="Return DateTime.Now - lastSuccessfulDownloadAt <";
Debug.ShouldStop(16);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {autonomouscachemanager.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_lastsuccessfuldownloadat" /*RemoteObject*/ )}, "-",1, 2),__ref.getField(true,"_downloadcooldownms" /*RemoteObject*/ )));
 BA.debugLineNum = 486;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isfailurecooldownactive(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsFailureCooldownActive (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,488);
if (RapidSub.canDelegate("isfailurecooldownactive")) { return __ref.runUserSub(false, "autonomouscachemanager","isfailurecooldownactive", __ref);}
 BA.debugLineNum = 488;BA.debugLine="Private Sub IsFailureCooldownActive As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 489;BA.debugLine="If lastFailureAt <= 0 Then Return False";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_lastfailureat" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
if (true) return autonomouscachemanager.__c.getField(true,"False");};
 BA.debugLineNum = 490;BA.debugLine="Return DateTime.Now - lastFailureAt < failureCool";
Debug.ShouldStop(512);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {autonomouscachemanager.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_lastfailureat" /*RemoteObject*/ )}, "-",1, 2),__ref.getField(true,"_failurecooldownms" /*RemoteObject*/ )));
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isstarted(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsStarted (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("isstarted")) { return __ref.runUserSub(false, "autonomouscachemanager","isstarted", __ref);}
 BA.debugLineNum = 97;BA.debugLine="Public Sub IsStarted As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Return isRunning";
Debug.ShouldStop(2);
if (true) return __ref.getField(true,"_isrunning" /*RemoteObject*/ );
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istrackalreadyavailable(RemoteObject __ref,RemoteObject _track,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("IsTrackAlreadyAvailable (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,345);
if (RapidSub.canDelegate("istrackalreadyavailable")) { return __ref.runUserSub(false, "autonomouscachemanager","istrackalreadyavailable", __ref, _track, _playlistid);}
RemoteObject _trackid = RemoteObject.createImmutable("");
RemoteObject _normalizedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("track", _track);
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 345;BA.debugLine="Private Sub IsTrackAlreadyAvailable(track As Map,";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 346;BA.debugLine="If track.IsInitialized = False Then Return False";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_track.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) return autonomouscachemanager.__c.getField(true,"False");};
 BA.debugLineNum = 347;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"\"";
Debug.ShouldStop(67108864);
_trackid = BA.ObjectToString(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 348;BA.debugLine="If trackId = \"\" Then Return False";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_trackid,BA.ObjectToString(""))) { 
if (true) return autonomouscachemanager.__c.getField(true,"False");};
 BA.debugLineNum = 349;BA.debugLine="If playlistId = \"\" Then playlistId = track.GetDef";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
_playlistid = BA.ObjectToString(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);};
 BA.debugLineNum = 350;BA.debugLine="If playlistId <> \"\" And mediaCacheService.HasTrac";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString("")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_mediacacheservice" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_hastrackfilebyplaylist" /*RemoteObject*/ ,(Object)(_trackid),(Object)(_playlistid)))) { 
if (true) return autonomouscachemanager.__c.getField(true,"True");};
 BA.debugLineNum = 351;BA.debugLine="If mediaCacheService.IsTrackCached(trackId) Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(false,"_mediacacheservice" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)).<Boolean>get().booleanValue()) { 
if (true) return autonomouscachemanager.__c.getField(true,"True");};
 BA.debugLineNum = 352;BA.debugLine="Dim normalizedTrack As Map = CloneMap(track)";
Debug.ShouldStop(-2147483648);
_normalizedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_normalizedtrack = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_clonemap" /*RemoteObject*/ ,(Object)(_track));Debug.locals.put("normalizedTrack", _normalizedtrack);Debug.locals.put("normalizedTrack", _normalizedtrack);
 BA.debugLineNum = 353;BA.debugLine="If normalizedTrack.ContainsKey(\"type\") = False Th";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_normalizedtrack.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("type")))),autonomouscachemanager.__c.getField(true,"False"))) { 
_normalizedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("track"))));};
 BA.debugLineNum = 354;BA.debugLine="If playlistId <> \"\" And normalizedTrack.ContainsK";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",_normalizedtrack.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("playlist_id")))),autonomouscachemanager.__c.getField(true,"False"))) { 
_normalizedtrack.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((_playlistid)));};
 BA.debugLineNum = 355;BA.debugLine="Return mediaCacheService.HasValidatedLocalMedia(n";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_mediacacheservice" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_normalizedtrack));
 BA.debugLineNum = 356;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadplaylistmanifestsafe(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("LoadPlaylistManifestSafe (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,448);
if (RapidSub.canDelegate("loadplaylistmanifestsafe")) { return __ref.runUserSub(false, "autonomouscachemanager","loadplaylistmanifestsafe", __ref, _playlistid);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 448;BA.debugLine="Private Sub LoadPlaylistManifestSafe(playlistId As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 449;BA.debugLine="Dim result As Map";
Debug.ShouldStop(1);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 450;BA.debugLine="result.Initialize";
Debug.ShouldStop(2);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 451;BA.debugLine="If playlistId = \"\" Then Return result";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return _result;};
 BA.debugLineNum = 453;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 454;BA.debugLine="result = dataResolverService.GetPlaylistPlayback";
Debug.ShouldStop(32);
_result = __ref.getField(false,"_dataresolverservice" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_getplaylistplaybackmanifestbyid" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("result", _result);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 456;BA.debugLine="result.Initialize";
Debug.ShouldStop(128);
_result.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 459;BA.debugLine="Return result";
Debug.ShouldStop(1024);
if (true) return _result;
 BA.debugLineNum = 460;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _requestplaybackresumeifneeded(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RequestPlaybackResumeIfNeeded (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,493);
if (RapidSub.canDelegate("requestplaybackresumeifneeded")) { return __ref.runUserSub(false, "autonomouscachemanager","requestplaybackresumeifneeded", __ref);}
 BA.debugLineNum = 493;BA.debugLine="Private Sub RequestPlaybackResumeIfNeeded";
Debug.ShouldStop(4096);
 BA.debugLineNum = 494;BA.debugLine="If traceTarget = Null Then Return";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_tracetarget" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 495;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 496;BA.debugLine="If SubExists(traceTarget, \"AutoResumeAfterCacheW";
Debug.ShouldStop(32768);
if (autonomouscachemanager.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_tracetarget" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("AutoResumeAfterCacheWarmup"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 497;BA.debugLine="CallSubDelayed(traceTarget, \"AutoResumeAfterCac";
Debug.ShouldStop(65536);
autonomouscachemanager.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_tracetarget" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("AutoResumeAfterCacheWarmup")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 500;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(524288);
autonomouscachemanager.__c.runVoidMethod ("LogImpl","233095687",autonomouscachemanager.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 502;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveslotneed(RemoteObject __ref,RemoteObject _slot,RemoteObject _minreserve,RemoteObject _trackplayliststats) throws Exception{
try {
		Debug.PushSubsStack("ResolveSlotNeed (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("resolveslotneed")) { return __ref.runUserSub(false, "autonomouscachemanager","resolveslotneed", __ref, _slot, _minreserve, _trackplayliststats);}
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playablecount = RemoteObject.createImmutable(0);
Debug.locals.put("slot", _slot);
Debug.locals.put("minReserve", _minreserve);
Debug.locals.put("trackPlaylistStats", _trackplayliststats);
 BA.debugLineNum = 193;BA.debugLine="Private Sub ResolveSlotNeed(slot As Map, minReserv";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="If slot.IsInitialized = False Or slot.Size = 0 Th";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_slot.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_slot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 196;BA.debugLine="Dim playlists As List = GetSlotPlaylists(slot)";
Debug.ShouldStop(8);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_getslotplaylists" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 197;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),autonomouscachemanager.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 199;BA.debugLine="Dim playableCount As Int = CountPlayableTracksInS";
Debug.ShouldStop(64);
_playablecount = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_countplayabletracksinslot" /*RemoteObject*/ ,(Object)(_slot),(Object)(_trackplayliststats));Debug.locals.put("playableCount", _playablecount);Debug.locals.put("playableCount", _playablecount);
 BA.debugLineNum = 200;BA.debugLine="Return Max(0, minReserve - playableCount)";
Debug.ShouldStop(128);
if (true) return BA.numberCast(int.class, autonomouscachemanager.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_minreserve,_playablecount}, "-",1, 1)))));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _runpruneifneeded(RemoteObject __ref,RemoteObject _initiator) throws Exception{
try {
		Debug.PushSubsStack("RunPruneIfNeeded (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("runpruneifneeded")) { return __ref.runUserSub(false, "autonomouscachemanager","runpruneifneeded", __ref, _initiator);}
RemoteObject _protectedtrackids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _relevanttrackids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _removedcount = RemoteObject.createImmutable(0);
Debug.locals.put("initiator", _initiator);
 BA.debugLineNum = 358;BA.debugLine="Private Sub RunPruneIfNeeded(initiator As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 359;BA.debugLine="If DateTime.Now - lastPruneAt < pruneCooldownMs T";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {autonomouscachemanager.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_lastpruneat" /*RemoteObject*/ )}, "-",1, 2),__ref.getField(true,"_prunecooldownms" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 361;BA.debugLine="Dim protectedTrackIds As List = BuildProtectedTra";
Debug.ShouldStop(256);
_protectedtrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_protectedtrackids = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_buildprotectedtrackids" /*RemoteObject*/ );Debug.locals.put("protectedTrackIds", _protectedtrackids);Debug.locals.put("protectedTrackIds", _protectedtrackids);
 BA.debugLineNum = 362;BA.debugLine="Dim relevantTrackIds As List = BuildRelevantTrack";
Debug.ShouldStop(512);
_relevanttrackids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_relevanttrackids = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_buildrelevanttrackids" /*RemoteObject*/ );Debug.locals.put("relevantTrackIds", _relevanttrackids);Debug.locals.put("relevantTrackIds", _relevanttrackids);
 BA.debugLineNum = 364;BA.debugLine="Dim removedCount As Int = mediaCacheService.Prune";
Debug.ShouldStop(2048);
_removedcount = __ref.getField(false,"_mediacacheservice" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_prunetrackcacheifneeded" /*RemoteObject*/ ,(Object)(_protectedtrackids),(Object)(_relevanttrackids));Debug.locals.put("removedCount", _removedcount);Debug.locals.put("removedCount", _removedcount);
 BA.debugLineNum = 365;BA.debugLine="lastPruneAt = DateTime.Now";
Debug.ShouldStop(4096);
__ref.setField ("_lastpruneat" /*RemoteObject*/ ,autonomouscachemanager.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 367;BA.debugLine="If removedCount > 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_removedcount,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 368;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("autocache prune completed initiator="),_initiator,RemoteObject.createImmutable(" removed="),_removedcount)));
 }else {
 BA.debugLineNum = 370;BA.debugLine="Trace(\"autocache prune completed initiator=\" & i";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("autocache prune completed initiator="),_initiator,RemoteObject.createImmutable(" removed=0"))));
 };
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _runstepasync(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RunStepAsync (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("runstepasync")) { return __ref.runUserSub(false, "autonomouscachemanager","runstepasync", __ref);}
ResumableSub_RunStepAsync rsub = new ResumableSub_RunStepAsync(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RunStepAsync extends BA.ResumableSub {
public ResumableSub_RunStepAsync(b4j.example.autonomouscachemanager parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.autonomouscachemanager parent;
RemoteObject _summary = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _offlinedata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackplayliststats = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nowticks = RemoteObject.createImmutable(0L);
RemoteObject _currentslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nextslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _currentneed = RemoteObject.createImmutable(0);
RemoteObject _nextneed = RemoteObject.createImmutable(0);
RemoteObject _desiredtrackitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _actualmaxdownloads = RemoteObject.createImmutable(0);
RemoteObject _downloaded = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RunStepAsync (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,114);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 115;BA.debugLine="Dim summary As Map";
Debug.ShouldStop(262144);
_summary = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("summary", _summary);
 BA.debugLineNum = 116;BA.debugLine="summary.Initialize";
Debug.ShouldStop(524288);
_summary.runVoidMethod ("Initialize");
 BA.debugLineNum = 117;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "autonomouscachemanager", "runstepasync"),BA.numberCast(int.class, 0));
this.state = 28;
return;
case 28:
//C
this.state = 1;
;
 BA.debugLineNum = 119;BA.debugLine="If kvs.IsInitialized = False Or offlineStoreServi";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_kvs" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_offlinestoreservice" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_dataresolverservice" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_mediacacheservice" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 120;BA.debugLine="summary.Put(\"status\", \"not_initialized\")";
Debug.ShouldStop(8388608);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("not_initialized"))));
 BA.debugLineNum = 121;BA.debugLine="Return summary";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_summary));return;};
 if (true) break;
;
 BA.debugLineNum = 124;BA.debugLine="If IsFailureCooldownActive Then";
Debug.ShouldStop(134217728);

case 4:
//if
this.state = 7;
if (__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_isfailurecooldownactive" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 125;BA.debugLine="summary.Put(\"status\", \"failure_cooldown\")";
Debug.ShouldStop(268435456);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("failure_cooldown"))));
 BA.debugLineNum = 126;BA.debugLine="Trace(\"autocache step skipped reason=failure_coo";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("autocache step skipped reason=failure_cooldown")));
 BA.debugLineNum = 127;BA.debugLine="Return summary";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_summary));return;};
 if (true) break;
;
 BA.debugLineNum = 130;BA.debugLine="If IsDownloadCooldownActive Then";
Debug.ShouldStop(2);

case 7:
//if
this.state = 10;
if (__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_isdownloadcooldownactive" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 131;BA.debugLine="summary.Put(\"status\", \"download_cooldown\")";
Debug.ShouldStop(4);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("download_cooldown"))));
 BA.debugLineNum = 132;BA.debugLine="Trace(\"autocache step skipped reason=download_co";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("autocache step skipped reason=download_cooldown")));
 BA.debugLineNum = 133;BA.debugLine="RunPruneIfNeeded(\"cooldown\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_runpruneifneeded" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("cooldown")));
 BA.debugLineNum = 134;BA.debugLine="Return summary";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_summary));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 137;BA.debugLine="Dim offlineData As Map = offlineStoreService.Load";
Debug.ShouldStop(256);
_offlinedata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_offlinedata = __ref.getField(false,"_offlinestoreservice" /*RemoteObject*/ ).runClassMethod (b4j.example.offlinestore.class, "_loadofflinedata" /*RemoteObject*/ );Debug.locals.put("offlineData", _offlinedata);Debug.locals.put("offlineData", _offlinedata);
 BA.debugLineNum = 138;BA.debugLine="If offlineData.IsInitialized = False Or offlineDa";
Debug.ShouldStop(512);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 139;BA.debugLine="summary.Put(\"status\", \"no_offline_data\")";
Debug.ShouldStop(1024);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("no_offline_data"))));
 BA.debugLineNum = 140;BA.debugLine="Trace(\"autocache step skipped reason=no_offline_";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("autocache step skipped reason=no_offline_data")));
 BA.debugLineNum = 141;BA.debugLine="Return summary";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_summary));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 144;BA.debugLine="mediaCacheService.EnsureTrackCacheReady";
Debug.ShouldStop(32768);
__ref.getField(false,"_mediacacheservice" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_ensuretrackcacheready" /*RemoteObject*/ );
 BA.debugLineNum = 145;BA.debugLine="Dim trackPlaylistStats As Map = mediaCacheService";
Debug.ShouldStop(65536);
_trackplayliststats = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_trackplayliststats = __ref.getField(false,"_mediacacheservice" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_getcachedtrackplayliststats" /*RemoteObject*/ );Debug.locals.put("trackPlaylistStats", _trackplayliststats);Debug.locals.put("trackPlaylistStats", _trackplayliststats);
 BA.debugLineNum = 147;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
Debug.ShouldStop(262144);
_nowticks = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("nowTicks", _nowticks);Debug.locals.put("nowTicks", _nowticks);
 BA.debugLineNum = 148;BA.debugLine="Dim currentSlot As Map = dataResolverService.Reso";
Debug.ShouldStop(524288);
_currentslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_currentslot = __ref.getField(false,"_dataresolverservice" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_nowticks));Debug.locals.put("currentSlot", _currentslot);Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 149;BA.debugLine="Dim nextSlot As Map = dataResolverService.Resolve";
Debug.ShouldStop(1048576);
_nextslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nextslot = __ref.getField(false,"_dataresolverservice" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvenextdataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_nowticks));Debug.locals.put("nextSlot", _nextslot);Debug.locals.put("nextSlot", _nextslot);
 BA.debugLineNum = 151;BA.debugLine="Dim currentNeed As Int = ResolveSlotNeed(currentS";
Debug.ShouldStop(4194304);
_currentneed = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_resolveslotneed" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(__ref.getField(true,"_currentslotminreserve" /*RemoteObject*/ )),(Object)(_trackplayliststats));Debug.locals.put("currentNeed", _currentneed);Debug.locals.put("currentNeed", _currentneed);
 BA.debugLineNum = 152;BA.debugLine="Dim nextNeed As Int = ResolveSlotNeed(nextSlot, n";
Debug.ShouldStop(8388608);
_nextneed = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_resolveslotneed" /*RemoteObject*/ ,(Object)(_nextslot),(Object)(__ref.getField(true,"_nextslotminreserve" /*RemoteObject*/ )),(Object)(_trackplayliststats));Debug.locals.put("nextNeed", _nextneed);Debug.locals.put("nextNeed", _nextneed);
 BA.debugLineNum = 154;BA.debugLine="Dim desiredTrackItems As List = BuildDesiredTrack";
Debug.ShouldStop(33554432);
_desiredtrackitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_desiredtrackitems = __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_builddesiredtrackitemsforslots" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_nextslot),(Object)(_currentneed),(Object)(_nextneed),(Object)(_trackplayliststats));Debug.locals.put("desiredTrackItems", _desiredtrackitems);Debug.locals.put("desiredTrackItems", _desiredtrackitems);
 BA.debugLineNum = 156;BA.debugLine="summary.Put(\"current_need\", currentNeed)";
Debug.ShouldStop(134217728);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("current_need"))),(Object)((_currentneed)));
 BA.debugLineNum = 157;BA.debugLine="summary.Put(\"next_need\", nextNeed)";
Debug.ShouldStop(268435456);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("next_need"))),(Object)((_nextneed)));
 BA.debugLineNum = 158;BA.debugLine="summary.Put(\"candidate_count\", desiredTrackItems.";
Debug.ShouldStop(536870912);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("candidate_count"))),(Object)((_desiredtrackitems.runMethod(true,"getSize"))));
 BA.debugLineNum = 160;BA.debugLine="If desiredTrackItems.Size = 0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_desiredtrackitems.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 161;BA.debugLine="summary.Put(\"status\", \"nothing_to_download\")";
Debug.ShouldStop(1);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("nothing_to_download"))));
 BA.debugLineNum = 162;BA.debugLine="Trace(\"autocache step no work currentNeed=\" & cu";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("autocache step no work currentNeed="),_currentneed,RemoteObject.createImmutable(" nextNeed="),_nextneed)));
 BA.debugLineNum = 163;BA.debugLine="RunPruneIfNeeded(\"idle\")";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_runpruneifneeded" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("idle")));
 BA.debugLineNum = 164;BA.debugLine="Return summary";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_summary));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 167;BA.debugLine="Dim actualMaxDownloads As Int = Min(maxDownloadsP";
Debug.ShouldStop(64);
_actualmaxdownloads = BA.numberCast(int.class, parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxdownloadsperstep" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _desiredtrackitems.runMethod(true,"getSize")))));Debug.locals.put("actualMaxDownloads", _actualmaxdownloads);Debug.locals.put("actualMaxDownloads", _actualmaxdownloads);
 BA.debugLineNum = 168;BA.debugLine="Trace(\"autocache step download start candidates=\"";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("autocache step download start candidates="),_desiredtrackitems.runMethod(true,"getSize"),RemoteObject.createImmutable(" maxDownloads="),_actualmaxdownloads)));
 BA.debugLineNum = 170;BA.debugLine="Wait For (mediaCacheService.EnsureTracksCached(de";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "autonomouscachemanager", "runstepasync"), __ref.getField(false,"_mediacacheservice" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_ensuretrackscached" /*RemoteObject*/ ,(Object)(_desiredtrackitems),(Object)(_actualmaxdownloads)));
this.state = 29;
return;
case 29:
//C
this.state = 19;
_downloaded = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("downloaded", _downloaded);
;
 BA.debugLineNum = 172;BA.debugLine="If HasMediaCacheRecentFailure Then";
Debug.ShouldStop(2048);
if (true) break;

case 19:
//if
this.state = 22;
if (__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_hasmediacacherecentfailure" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 173;BA.debugLine="lastFailureAt = DateTime.Now";
Debug.ShouldStop(4096);
__ref.setField ("_lastfailureat" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 174;BA.debugLine="summary.Put(\"status\", \"network_failure\")";
Debug.ShouldStop(8192);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("network_failure"))));
 BA.debugLineNum = 175;BA.debugLine="Trace(\"autocache step network failure\")";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("autocache step network failure")));
 BA.debugLineNum = 176;BA.debugLine="Return summary";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_summary));return;};
 if (true) break;
;
 BA.debugLineNum = 179;BA.debugLine="If downloaded Then";
Debug.ShouldStop(262144);

case 22:
//if
this.state = 27;
if (_downloaded.<Boolean>get().booleanValue()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 180;BA.debugLine="lastSuccessfulDownloadAt = DateTime.Now";
Debug.ShouldStop(524288);
__ref.setField ("_lastsuccessfuldownloadat" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 181;BA.debugLine="summary.Put(\"status\", \"downloaded\")";
Debug.ShouldStop(1048576);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("downloaded"))));
 BA.debugLineNum = 182;BA.debugLine="summary.Put(\"downloaded\", True)";
Debug.ShouldStop(2097152);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("downloaded"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 183;BA.debugLine="RequestPlaybackResumeIfNeeded";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_requestplaybackresumeifneeded" /*RemoteObject*/ );
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 185;BA.debugLine="summary.Put(\"status\", \"no_new_downloads\")";
Debug.ShouldStop(16777216);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("no_new_downloads"))));
 BA.debugLineNum = 186;BA.debugLine="summary.Put(\"downloaded\", False)";
Debug.ShouldStop(33554432);
_summary.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("downloaded"))),(Object)((parent.__c.getField(true,"False"))));
 if (true) break;

case 27:
//C
this.state = -1;
;
 BA.debugLineNum = 189;BA.debugLine="RunPruneIfNeeded(\"post_download\")";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_runpruneifneeded" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("post_download")));
 BA.debugLineNum = 190;BA.debugLine="Return summary";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_summary));return;};
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _downloaded) throws Exception{
}
public static void  _runstepasyncdeferred(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RunStepAsyncDeferred (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("runstepasyncdeferred")) { __ref.runUserSub(false, "autonomouscachemanager","runstepasyncdeferred", __ref); return;}
ResumableSub_RunStepAsyncDeferred rsub = new ResumableSub_RunStepAsyncDeferred(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RunStepAsyncDeferred extends BA.ResumableSub {
public ResumableSub_RunStepAsyncDeferred(b4j.example.autonomouscachemanager parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.autonomouscachemanager parent;
RemoteObject _summary = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RunStepAsyncDeferred (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,109);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 110;BA.debugLine="Wait For (RunStepAsync) Complete (summary As Map)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "autonomouscachemanager", "runstepasyncdeferred"), __ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_runstepasync" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_summary = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("summary", _summary);
;
 BA.debugLineNum = 111;BA.debugLine="stepInProgress = False";
Debug.ShouldStop(16384);
__ref.setField ("_stepinprogress" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _setcooldowns(RemoteObject __ref,RemoteObject _downloadcooldownvalue,RemoteObject _failurecooldownvalue,RemoteObject _prunecooldownvalue) throws Exception{
try {
		Debug.PushSubsStack("SetCooldowns (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("setcooldowns")) { return __ref.runUserSub(false, "autonomouscachemanager","setcooldowns", __ref, _downloadcooldownvalue, _failurecooldownvalue, _prunecooldownvalue);}
Debug.locals.put("downloadCooldownValue", _downloadcooldownvalue);
Debug.locals.put("failureCooldownValue", _failurecooldownvalue);
Debug.locals.put("pruneCooldownValue", _prunecooldownvalue);
 BA.debugLineNum = 78;BA.debugLine="Public Sub SetCooldowns(downloadCooldownValue As L";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="If downloadCooldownValue >= 0 Then downloadCooldo";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("g",_downloadcooldownvalue,BA.numberCast(long.class, 0))) { 
__ref.setField ("_downloadcooldownms" /*RemoteObject*/ ,_downloadcooldownvalue);};
 BA.debugLineNum = 80;BA.debugLine="If failureCooldownValue >= 0 Then failureCooldown";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("g",_failurecooldownvalue,BA.numberCast(long.class, 0))) { 
__ref.setField ("_failurecooldownms" /*RemoteObject*/ ,_failurecooldownvalue);};
 BA.debugLineNum = 81;BA.debugLine="If pruneCooldownValue >= 0 Then pruneCooldownMs =";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("g",_prunecooldownvalue,BA.numberCast(long.class, 0))) { 
__ref.setField ("_prunecooldownms" /*RemoteObject*/ ,_prunecooldownvalue);};
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Start (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("start")) { return __ref.runUserSub(false, "autonomouscachemanager","start", __ref);}
 BA.debugLineNum = 84;BA.debugLine="Public Sub Start";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="isRunning = True";
Debug.ShouldStop(1048576);
__ref.setField ("_isrunning" /*RemoteObject*/ ,autonomouscachemanager.__c.getField(true,"True"));
 BA.debugLineNum = 86;BA.debugLine="workerTimer.Interval = tickIntervalMs";
Debug.ShouldStop(2097152);
__ref.getField(false,"_workertimer" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, __ref.getField(true,"_tickintervalms" /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="workerTimer.Enabled = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_workertimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",autonomouscachemanager.__c.getField(true,"True"));
 BA.debugLineNum = 88;BA.debugLine="Trace(\"autocache manager started tickMs=\" & tickI";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("autocache manager started tickMs="),__ref.getField(true,"_tickintervalms" /*RemoteObject*/ ))));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopmanager(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopManager (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("stopmanager")) { return __ref.runUserSub(false, "autonomouscachemanager","stopmanager", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Public Sub StopManager";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="isRunning = False";
Debug.ShouldStop(134217728);
__ref.setField ("_isrunning" /*RemoteObject*/ ,autonomouscachemanager.__c.getField(true,"False"));
 BA.debugLineNum = 93;BA.debugLine="workerTimer.Enabled = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_workertimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",autonomouscachemanager.__c.getField(true,"False"));
 BA.debugLineNum = 94;BA.debugLine="Trace(\"autocache manager stopped\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.autonomouscachemanager.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("autocache manager stopped")));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trace(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("Trace (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,517);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "autonomouscachemanager","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 517;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 518;BA.debugLine="If traceTarget = Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_tracetarget" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 519;BA.debugLine="Log(message)";
Debug.ShouldStop(64);
autonomouscachemanager.__c.runVoidMethod ("LogImpl","233226754",_message,0);
 BA.debugLineNum = 520;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 523;BA.debugLine="If traceSubName = \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_tracesubname" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 524;BA.debugLine="Log(message)";
Debug.ShouldStop(2048);
autonomouscachemanager.__c.runVoidMethod ("LogImpl","233226759",_message,0);
 BA.debugLineNum = 525;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 528;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 529;BA.debugLine="CallSub2(traceTarget, traceSubName, message)";
Debug.ShouldStop(65536);
autonomouscachemanager.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_tracetarget" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 531;BA.debugLine="Log(message)";
Debug.ShouldStop(262144);
autonomouscachemanager.__c.runVoidMethod ("LogImpl","233226766",_message,0);
 };
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _workertimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("workerTimer_Tick (autonomouscachemanager) ","autonomouscachemanager",5,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("workertimer_tick")) { return __ref.runUserSub(false, "autonomouscachemanager","workertimer_tick", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Private Sub workerTimer_Tick";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="If isRunning = False Then Return";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isrunning" /*RemoteObject*/ ),autonomouscachemanager.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 103;BA.debugLine="If stepInProgress Then Return";
Debug.ShouldStop(64);
if (__ref.getField(true,"_stepinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 105;BA.debugLine="stepInProgress = True";
Debug.ShouldStop(256);
__ref.setField ("_stepinprogress" /*RemoteObject*/ ,autonomouscachemanager.__c.getField(true,"True"));
 BA.debugLineNum = 106;BA.debugLine="CallSubDelayed(Me, \"RunStepAsyncDeferred\")";
Debug.ShouldStop(512);
autonomouscachemanager.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("RunStepAsyncDeferred")));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
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