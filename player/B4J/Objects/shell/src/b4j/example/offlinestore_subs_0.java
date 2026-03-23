package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class offlinestore_subs_0 {


public static RemoteObject  _buildofflineplaylistdescriptors(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("BuildOfflinePlaylistDescriptors (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("buildofflineplaylistdescriptors")) { return __ref.runUserSub(false, "offlinestore","buildofflineplaylistdescriptors", __ref, _data);}
RemoteObject _descriptors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _uniquedescriptors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _schedules = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _scheduleobject = RemoteObject.declareNull("Object");
RemoteObject _schedule = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _scheduletitle = RemoteObject.createImmutable("");
RemoteObject _slots = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _slotobject = RemoteObject.declareNull("Object");
RemoteObject _slot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slottime = RemoteObject.createImmutable("");
RemoteObject _streamdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _streamid = RemoteObject.createImmutable("");
RemoteObject _streamtitle = RemoteObject.createImmutable("");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _playlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _descriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("data", _data);
 BA.debugLineNum = 200;BA.debugLine="Private Sub BuildOfflinePlaylistDescriptors(data A";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Dim descriptors As List";
Debug.ShouldStop(256);
_descriptors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("descriptors", _descriptors);
 BA.debugLineNum = 202;BA.debugLine="descriptors.Initialize";
Debug.ShouldStop(512);
_descriptors.runVoidMethod ("Initialize");
 BA.debugLineNum = 203;BA.debugLine="If data.IsInitialized = False Then Return descrip";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return _descriptors;};
 BA.debugLineNum = 204;BA.debugLine="Dim uniqueDescriptors As Map";
Debug.ShouldStop(2048);
_uniquedescriptors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("uniqueDescriptors", _uniquedescriptors);
 BA.debugLineNum = 205;BA.debugLine="uniqueDescriptors.Initialize";
Debug.ShouldStop(4096);
_uniquedescriptors.runVoidMethod ("Initialize");
 BA.debugLineNum = 206;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
Debug.ShouldStop(8192);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(offlinestore.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 207;BA.debugLine="If schedules.IsInitialized = False Then Return de";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return _descriptors;};
 BA.debugLineNum = 208;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(32768);
{
final RemoteObject group8 = _schedules;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.runMethod(false,"Get",index8);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 209;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 210;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(131072);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 211;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
Debug.ShouldStop(262144);
_scheduletitle = BA.ObjectToString(_schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("scheduleTitle", _scheduletitle);Debug.locals.put("scheduleTitle", _scheduletitle);
 BA.debugLineNum = 212;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
Debug.ShouldStop(524288);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(offlinestore.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 213;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 214;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(2097152);
{
final RemoteObject group14 = _slots;
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_slotobject = group14.runMethod(false,"Get",index14);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 215;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 216;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(8388608);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 217;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
Debug.ShouldStop(16777216);
_slottime = BA.ObjectToString(_slot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("slotTime", _slottime);Debug.locals.put("slotTime", _slottime);
 BA.debugLineNum = 218;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
Debug.ShouldStop(33554432);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.offlinestore.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 219;BA.debugLine="Dim streamId As String = streamData.GetDefaul";
Debug.ShouldStop(67108864);
_streamid = BA.ObjectToString(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamId", _streamid);Debug.locals.put("streamId", _streamid);
 BA.debugLineNum = 220;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
Debug.ShouldStop(134217728);
_streamtitle = BA.ObjectToString(_streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamTitle", _streamtitle);Debug.locals.put("streamTitle", _streamtitle);
 BA.debugLineNum = 221;BA.debugLine="Dim playlists As List = streamData.GetDefault";
Debug.ShouldStop(268435456);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(offlinestore.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 222;BA.debugLine="If playlists.IsInitialized = False Then Conti";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 223;BA.debugLine="For Each playlistObject As Object In playlist";
Debug.ShouldStop(1073741824);
{
final RemoteObject group23 = _playlists;
final int groupLen23 = group23.runMethod(true,"getSize").<Integer>get()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_playlistobject = group23.runMethod(false,"Get",index23);Debug.locals.put("playlistObject", _playlistobject);
Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 224;BA.debugLine="If playlistObject Is Map Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 225;BA.debugLine="Dim playlist As Map = playlistObject";
Debug.ShouldStop(1);
_playlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlist", _playlist);Debug.locals.put("playlist", _playlist);
 BA.debugLineNum = 226;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
Debug.ShouldStop(2);
_playlistid = BA.ObjectToString(_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 227;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 228;BA.debugLine="If uniqueDescriptors.ContainsKey(playlistId";
Debug.ShouldStop(8);
if (_uniquedescriptors.runMethod(true,"ContainsKey",(Object)((_playlistid))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 229;BA.debugLine="Dim descriptor As Map";
Debug.ShouldStop(16);
_descriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("descriptor", _descriptor);
 BA.debugLineNum = 230;BA.debugLine="descriptor.Initialize";
Debug.ShouldStop(32);
_descriptor.runVoidMethod ("Initialize");
 BA.debugLineNum = 231;BA.debugLine="descriptor.Put(\"id\", playlistId)";
Debug.ShouldStop(64);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_playlistid)));
 BA.debugLineNum = 232;BA.debugLine="descriptor.Put(\"updated\", playlist.GetDefau";
Debug.ShouldStop(128);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("updated"))),(Object)(_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 233;BA.debugLine="descriptor.Put(\"title\", playlist.GetDefault";
Debug.ShouldStop(256);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 234;BA.debugLine="descriptor.Put(\"schedule_title\", scheduleTi";
Debug.ShouldStop(512);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((_scheduletitle)));
 BA.debugLineNum = 235;BA.debugLine="descriptor.Put(\"slot_time\", slotTime)";
Debug.ShouldStop(1024);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((_slottime)));
 BA.debugLineNum = 236;BA.debugLine="descriptor.Put(\"stream_id\", streamId)";
Debug.ShouldStop(2048);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((_streamid)));
 BA.debugLineNum = 237;BA.debugLine="descriptor.Put(\"stream_title\", streamTitle)";
Debug.ShouldStop(4096);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)((_streamtitle)));
 BA.debugLineNum = 238;BA.debugLine="uniqueDescriptors.Put(playlistId, descripto";
Debug.ShouldStop(8192);
_uniquedescriptors.runVoidMethod ("Put",(Object)((_playlistid)),(Object)((_descriptor.getObject())));
 BA.debugLineNum = 239;BA.debugLine="descriptors.Add(descriptor)";
Debug.ShouldStop(16384);
_descriptors.runVoidMethod ("Add",(Object)((_descriptor.getObject())));
 };
 }
}Debug.locals.put("playlistObject", _playlistobject);
;
 };
 }
}Debug.locals.put("slotObject", _slotobject);
;
 };
 }
}Debug.locals.put("scheduleObject", _scheduleobject);
;
 BA.debugLineNum = 246;BA.debugLine="Return descriptors";
Debug.ShouldStop(2097152);
if (true) return _descriptors;
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
offlinestore._storagedir = RemoteObject.createImmutable("");__ref.setField("_storagedir",offlinestore._storagedir);
 //BA.debugLineNum = 7;BA.debugLine="Private storage As KeyValueStore";
offlinestore._storage = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_storage",offlinestore._storage);
 //BA.debugLineNum = 8;BA.debugLine="Private targetModule As Object";
offlinestore._targetmodule = RemoteObject.createNew ("Object");__ref.setField("_targetmodule",offlinestore._targetmodule);
 //BA.debugLineNum = 9;BA.debugLine="Private traceSubName As String";
offlinestore._tracesubname = RemoteObject.createImmutable("");__ref.setField("_tracesubname",offlinestore._tracesubname);
 //BA.debugLineNum = 10;BA.debugLine="Private playerDataFileName As String";
offlinestore._playerdatafilename = RemoteObject.createImmutable("");__ref.setField("_playerdatafilename",offlinestore._playerdatafilename);
 //BA.debugLineNum = 11;BA.debugLine="Private playlistRequirementsFileName As String";
offlinestore._playlistrequirementsfilename = RemoteObject.createImmutable("");__ref.setField("_playlistrequirementsfilename",offlinestore._playlistrequirementsfilename);
 //BA.debugLineNum = 12;BA.debugLine="Private playlistsDirName As String";
offlinestore._playlistsdirname = RemoteObject.createImmutable("");__ref.setField("_playlistsdirname",offlinestore._playlistsdirname);
 //BA.debugLineNum = 13;BA.debugLine="Private playlistCdnBaseUrl As String";
offlinestore._playlistcdnbaseurl = RemoteObject.createImmutable("");__ref.setField("_playlistcdnbaseurl",offlinestore._playlistcdnbaseurl);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _compareofflineplaylistswithcache(RemoteObject __ref,RemoteObject _descriptors) throws Exception{
try {
		Debug.PushSubsStack("CompareOfflinePlaylistsWithCache (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("compareofflineplaylistswithcache")) { return __ref.runUserSub(false, "offlinestore","compareofflineplaylistswithcache", __ref, _descriptors);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _downloadids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cachedplaylistindex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _missingcount = RemoteObject.createImmutable(0);
RemoteObject _outdatedcount = RemoteObject.createImmutable(0);
RemoteObject _actualcount = RemoteObject.createImmutable(0);
RemoteObject _descriptorobject = RemoteObject.declareNull("Object");
RemoteObject _descriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _cachedentryobject = RemoteObject.declareNull("Object");
RemoteObject _cachedentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("descriptors", _descriptors);
 BA.debugLineNum = 249;BA.debugLine="Private Sub CompareOfflinePlaylistsWithCache(descr";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="Dim result As Map";
Debug.ShouldStop(33554432);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 251;BA.debugLine="result.Initialize";
Debug.ShouldStop(67108864);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 252;BA.debugLine="Dim downloadIds As List";
Debug.ShouldStop(134217728);
_downloadids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("downloadIds", _downloadids);
 BA.debugLineNum = 253;BA.debugLine="downloadIds.Initialize";
Debug.ShouldStop(268435456);
_downloadids.runVoidMethod ("Initialize");
 BA.debugLineNum = 254;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
Debug.ShouldStop(536870912);
_cachedplaylistindex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedplaylistindex = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_playlist_index")),(Object)((__ref.runClassMethod (b4j.example.offlinestore.class, "_createinitializedmap" /*RemoteObject*/ ).getObject()))));Debug.locals.put("cachedPlaylistIndex", _cachedplaylistindex);Debug.locals.put("cachedPlaylistIndex", _cachedplaylistindex);
 BA.debugLineNum = 255;BA.debugLine="Dim missingCount As Int = 0";
Debug.ShouldStop(1073741824);
_missingcount = BA.numberCast(int.class, 0);Debug.locals.put("missingCount", _missingcount);Debug.locals.put("missingCount", _missingcount);
 BA.debugLineNum = 256;BA.debugLine="Dim outdatedCount As Int = 0";
Debug.ShouldStop(-2147483648);
_outdatedcount = BA.numberCast(int.class, 0);Debug.locals.put("outdatedCount", _outdatedcount);Debug.locals.put("outdatedCount", _outdatedcount);
 BA.debugLineNum = 257;BA.debugLine="Dim actualCount As Int = 0";
Debug.ShouldStop(1);
_actualcount = BA.numberCast(int.class, 0);Debug.locals.put("actualCount", _actualcount);Debug.locals.put("actualCount", _actualcount);
 BA.debugLineNum = 258;BA.debugLine="For Each descriptorObject As Object In descriptor";
Debug.ShouldStop(2);
{
final RemoteObject group9 = _descriptors;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_descriptorobject = group9.runMethod(false,"Get",index9);Debug.locals.put("descriptorObject", _descriptorobject);
Debug.locals.put("descriptorObject", _descriptorobject);
 BA.debugLineNum = 259;BA.debugLine="If descriptorObject Is Map Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("i",_descriptorobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 260;BA.debugLine="Dim descriptor As Map = descriptorObject";
Debug.ShouldStop(8);
_descriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_descriptor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _descriptorobject);Debug.locals.put("descriptor", _descriptor);Debug.locals.put("descriptor", _descriptor);
 BA.debugLineNum = 261;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
Debug.ShouldStop(16);
_playlistid = BA.ObjectToString(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 262;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 263;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId)";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_cachedplaylistindex.runMethod(true,"ContainsKey",(Object)((_playlistid))),offlinestore.__c.getField(true,"False"))) { 
 BA.debugLineNum = 264;BA.debugLine="missingCount = missingCount + 1";
Debug.ShouldStop(128);
_missingcount = RemoteObject.solve(new RemoteObject[] {_missingcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("missingCount", _missingcount);
 BA.debugLineNum = 265;BA.debugLine="downloadIds.Add(playlistId)";
Debug.ShouldStop(256);
_downloadids.runVoidMethod ("Add",(Object)((_playlistid)));
 BA.debugLineNum = 266;BA.debugLine="Continue";
Debug.ShouldStop(512);
if (true) continue;
 };
 BA.debugLineNum = 268;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylis";
Debug.ShouldStop(2048);
_cachedentryobject = _cachedplaylistindex.runMethod(false,"Get",(Object)((_playlistid)));Debug.locals.put("cachedEntryObject", _cachedentryobject);Debug.locals.put("cachedEntryObject", _cachedentryobject);
 BA.debugLineNum = 269;BA.debugLine="If cachedEntryObject Is Map Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("i",_cachedentryobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 270;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
Debug.ShouldStop(8192);
_cachedentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _cachedentryobject);Debug.locals.put("cachedEntry", _cachedentry);Debug.locals.put("cachedEntry", _cachedentry);
 BA.debugLineNum = 271;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> de";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_cachedentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable("")))),_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable("")))))) { 
 BA.debugLineNum = 272;BA.debugLine="outdatedCount = outdatedCount + 1";
Debug.ShouldStop(32768);
_outdatedcount = RemoteObject.solve(new RemoteObject[] {_outdatedcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("outdatedCount", _outdatedcount);
 BA.debugLineNum = 273;BA.debugLine="downloadIds.Add(playlistId)";
Debug.ShouldStop(65536);
_downloadids.runVoidMethod ("Add",(Object)((_playlistid)));
 }else {
 BA.debugLineNum = 275;BA.debugLine="actualCount = actualCount + 1";
Debug.ShouldStop(262144);
_actualcount = RemoteObject.solve(new RemoteObject[] {_actualcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("actualCount", _actualcount);
 };
 }else {
 BA.debugLineNum = 278;BA.debugLine="missingCount = missingCount + 1";
Debug.ShouldStop(2097152);
_missingcount = RemoteObject.solve(new RemoteObject[] {_missingcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("missingCount", _missingcount);
 BA.debugLineNum = 279;BA.debugLine="downloadIds.Add(playlistId)";
Debug.ShouldStop(4194304);
_downloadids.runVoidMethod ("Add",(Object)((_playlistid)));
 };
 };
 }
}Debug.locals.put("descriptorObject", _descriptorobject);
;
 BA.debugLineNum = 283;BA.debugLine="result.Put(\"DownloadIds\", downloadIds)";
Debug.ShouldStop(67108864);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DownloadIds"))),(Object)((_downloadids.getObject())));
 BA.debugLineNum = 284;BA.debugLine="result.Put(\"MissingCount\", missingCount)";
Debug.ShouldStop(134217728);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("MissingCount"))),(Object)((_missingcount)));
 BA.debugLineNum = 285;BA.debugLine="result.Put(\"OutdatedCount\", outdatedCount)";
Debug.ShouldStop(268435456);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("OutdatedCount"))),(Object)((_outdatedcount)));
 BA.debugLineNum = 286;BA.debugLine="result.Put(\"ActualCount\", actualCount)";
Debug.ShouldStop(536870912);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ActualCount"))),(Object)((_actualcount)));
 BA.debugLineNum = 287;BA.debugLine="Return result";
Debug.ShouldStop(1073741824);
if (true) return _result;
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinitializedlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateInitializedList (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("createinitializedlist")) { return __ref.runUserSub(false, "offlinestore","createinitializedlist", __ref);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 346;BA.debugLine="Private Sub CreateInitializedList As List";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="Dim items As List";
Debug.ShouldStop(67108864);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 348;BA.debugLine="items.Initialize";
Debug.ShouldStop(134217728);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 349;BA.debugLine="Return items";
Debug.ShouldStop(268435456);
if (true) return _items;
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("CreateInitializedMap (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("createinitializedmap")) { return __ref.runUserSub(false, "offlinestore","createinitializedmap", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 340;BA.debugLine="Private Sub CreateInitializedMap As Map";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1048576);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 342;BA.debugLine="m.Initialize";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 343;BA.debugLine="Return m";
Debug.ShouldStop(4194304);
if (true) return _m;
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuredirectory(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("EnsureDirectory (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("ensuredirectory")) { return __ref.runUserSub(false, "offlinestore","ensuredirectory", __ref, _path);}
RemoteObject _jofile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 334;BA.debugLine="Private Sub EnsureDirectory(path As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="Dim joFile As JavaObject";
Debug.ShouldStop(16384);
_jofile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joFile", _jofile);
 BA.debugLineNum = 336;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
Debug.ShouldStop(32768);
_jofile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 337;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
Debug.ShouldStop(65536);
_jofile.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("mkdirs")),(Object)((offlinestore.__c.getField(false,"Null"))));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extractslotstreamdata(RemoteObject __ref,RemoteObject _slot) throws Exception{
try {
		Debug.PushSubsStack("ExtractSlotStreamData (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("extractslotstreamdata")) { return __ref.runUserSub(false, "offlinestore","extractslotstreamdata", __ref, _slot);}
RemoteObject _streamdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _streamobject = RemoteObject.declareNull("Object");
Debug.locals.put("slot", _slot);
 BA.debugLineNum = 320;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="Dim streamData As Map";
Debug.ShouldStop(1);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 322;BA.debugLine="streamData.Initialize";
Debug.ShouldStop(2);
_streamdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 323;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_slot.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return _streamdata;};
 BA.debugLineNum = 324;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
Debug.ShouldStop(8);
_streamobject = _slot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stream"))));Debug.locals.put("streamObject", _streamobject);Debug.locals.put("streamObject", _streamobject);
 BA.debugLineNum = 325;BA.debugLine="If streamObject Is Map Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("i",_streamobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 326;BA.debugLine="streamData = streamObject";
Debug.ShouldStop(32);
_streamdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _streamobject);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 327;BA.debugLine="Return streamData";
Debug.ShouldStop(64);
if (true) return _streamdata;
 };
 BA.debugLineNum = 329;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("N",_streamobject)) { 
_streamdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),_streamobject))));};
 BA.debugLineNum = 330;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
Debug.ShouldStop(512);
if (_slot.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("playlists")))).<Boolean>get().booleanValue()) { 
_streamdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(_slot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("playlists"))))));};
 BA.debugLineNum = 331;BA.debugLine="Return streamData";
Debug.ShouldStop(1024);
if (true) return _streamdata;
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcachedplaylistindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCachedPlaylistIndex (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("getcachedplaylistindex")) { return __ref.runUserSub(false, "offlinestore","getcachedplaylistindex", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Public Sub GetCachedPlaylistIndex As Map";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Return storage.GetDefault(\"cached_playlist_index\"";
Debug.ShouldStop(1024);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_playlist_index")),(Object)((__ref.runClassMethod (b4j.example.offlinestore.class, "_createinitializedmap" /*RemoteObject*/ ).getObject()))));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getofflineadscount(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("GetOfflineAdsCount (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("getofflineadscount")) { return __ref.runUserSub(false, "offlinestore","getofflineadscount", __ref, _data);}
RemoteObject _ads = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("data", _data);
 BA.debugLineNum = 186;BA.debugLine="Private Sub GetOfflineAdsCount(data As Map) As Int";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="If data.IsInitialized = False Then Return 0";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 188;BA.debugLine="Dim ads As List = data.GetDefault(\"ads\", Null)";
Debug.ShouldStop(134217728);
_ads = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ads = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ads"))),(Object)(offlinestore.__c.getField(false,"Null"))));Debug.locals.put("ads", _ads);Debug.locals.put("ads", _ads);
 BA.debugLineNum = 189;BA.debugLine="If ads.IsInitialized = False Then Return 0";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_ads.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 190;BA.debugLine="Return ads.Size";
Debug.ShouldStop(536870912);
if (true) return _ads.runMethod(true,"getSize");
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getofflineplaylistids(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("GetOfflinePlaylistIds (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("getofflineplaylistids")) { return __ref.runUserSub(false, "offlinestore","getofflineplaylistids", __ref, _data);}
RemoteObject _playlistids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _uniqueids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _schedules = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _scheduleobject = RemoteObject.declareNull("Object");
RemoteObject _schedule = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slots = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _slotobject = RemoteObject.declareNull("Object");
RemoteObject _slot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _streamdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _playlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
Debug.locals.put("data", _data);
 BA.debugLineNum = 150;BA.debugLine="Private Sub GetOfflinePlaylistIds(data As Map) As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Dim playlistIds As List";
Debug.ShouldStop(4194304);
_playlistids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("playlistIds", _playlistids);
 BA.debugLineNum = 152;BA.debugLine="playlistIds.Initialize";
Debug.ShouldStop(8388608);
_playlistids.runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="If data.IsInitialized = False Then Return playlis";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return _playlistids;};
 BA.debugLineNum = 154;BA.debugLine="Dim uniqueIds As Map";
Debug.ShouldStop(33554432);
_uniqueids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("uniqueIds", _uniqueids);
 BA.debugLineNum = 155;BA.debugLine="uniqueIds.Initialize";
Debug.ShouldStop(67108864);
_uniqueids.runVoidMethod ("Initialize");
 BA.debugLineNum = 156;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
Debug.ShouldStop(134217728);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(offlinestore.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 157;BA.debugLine="If schedules.IsInitialized = False Then Return pl";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return _playlistids;};
 BA.debugLineNum = 158;BA.debugLine="For Each scheduleObject As Object In schedules";
Debug.ShouldStop(536870912);
{
final RemoteObject group8 = _schedules;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.runMethod(false,"Get",index8);Debug.locals.put("scheduleObject", _scheduleobject);
Debug.locals.put("scheduleObject", _scheduleobject);
 BA.debugLineNum = 159;BA.debugLine="If scheduleObject Is Map Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("i",_scheduleobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 160;BA.debugLine="Dim schedule As Map = scheduleObject";
Debug.ShouldStop(-2147483648);
_schedule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_schedule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _scheduleobject);Debug.locals.put("schedule", _schedule);Debug.locals.put("schedule", _schedule);
 BA.debugLineNum = 161;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
Debug.ShouldStop(1);
_slots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slots = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _schedule.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slots"))),(Object)(offlinestore.__c.getField(false,"Null"))));Debug.locals.put("slots", _slots);Debug.locals.put("slots", _slots);
 BA.debugLineNum = 162;BA.debugLine="If slots.IsInitialized = False Then Continue";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_slots.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 163;BA.debugLine="For Each slotObject As Object In slots";
Debug.ShouldStop(4);
{
final RemoteObject group13 = _slots;
final int groupLen13 = group13.runMethod(true,"getSize").<Integer>get()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_slotobject = group13.runMethod(false,"Get",index13);Debug.locals.put("slotObject", _slotobject);
Debug.locals.put("slotObject", _slotobject);
 BA.debugLineNum = 164;BA.debugLine="If slotObject Is Map Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("i",_slotobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 165;BA.debugLine="Dim slot As Map = slotObject";
Debug.ShouldStop(16);
_slot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_slot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _slotobject);Debug.locals.put("slot", _slot);Debug.locals.put("slot", _slot);
 BA.debugLineNum = 166;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
Debug.ShouldStop(32);
_streamdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_streamdata = __ref.runClassMethod (b4j.example.offlinestore.class, "_extractslotstreamdata" /*RemoteObject*/ ,(Object)(_slot));Debug.locals.put("streamData", _streamdata);Debug.locals.put("streamData", _streamdata);
 BA.debugLineNum = 167;BA.debugLine="Dim playlists As List = streamData.GetDefault";
Debug.ShouldStop(64);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _streamdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(offlinestore.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 168;BA.debugLine="If playlists.IsInitialized = False Then Conti";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 169;BA.debugLine="For Each playlistObject As Object In playlist";
Debug.ShouldStop(256);
{
final RemoteObject group19 = _playlists;
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistobject = group19.runMethod(false,"Get",index19);Debug.locals.put("playlistObject", _playlistobject);
Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 170;BA.debugLine="If playlistObject Is Map Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 171;BA.debugLine="Dim playlist As Map = playlistObject";
Debug.ShouldStop(1024);
_playlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlist", _playlist);Debug.locals.put("playlist", _playlist);
 BA.debugLineNum = 172;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
Debug.ShouldStop(2048);
_playlistid = BA.ObjectToString(_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 173;BA.debugLine="If playlistId <> \"\" And uniqueIds.ContainsK";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_playlistid,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",_uniqueids.runMethod(true,"ContainsKey",(Object)((_playlistid))),offlinestore.__c.getField(true,"False"))) { 
 BA.debugLineNum = 174;BA.debugLine="uniqueIds.Put(playlistId, True)";
Debug.ShouldStop(8192);
_uniqueids.runVoidMethod ("Put",(Object)((_playlistid)),(Object)((offlinestore.__c.getField(true,"True"))));
 BA.debugLineNum = 175;BA.debugLine="playlistIds.Add(playlistId)";
Debug.ShouldStop(16384);
_playlistids.runVoidMethod ("Add",(Object)((_playlistid)));
 };
 };
 }
}Debug.locals.put("playlistObject", _playlistobject);
;
 };
 }
}Debug.locals.put("slotObject", _slotobject);
;
 };
 }
}Debug.locals.put("scheduleObject", _scheduleobject);
;
 BA.debugLineNum = 183;BA.debugLine="Return playlistIds";
Debug.ShouldStop(4194304);
if (true) return _playlistids;
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getofflineplaylistsdir(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetOfflinePlaylistsDir (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("getofflineplaylistsdir")) { return __ref.runUserSub(false, "offlinestore","getofflineplaylistsdir", __ref);}
 BA.debugLineNum = 123;BA.debugLine="Public Sub GetOfflinePlaylistsDir As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Return File.Combine(storageDir, playlistsDirName)";
Debug.ShouldStop(134217728);
if (true) return offlinestore.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_playlistsdirname" /*RemoteObject*/ )));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getofflineschedulescount(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("GetOfflineSchedulesCount (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("getofflineschedulescount")) { return __ref.runUserSub(false, "offlinestore","getofflineschedulescount", __ref, _data);}
RemoteObject _schedules = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("data", _data);
 BA.debugLineNum = 193;BA.debugLine="Private Sub GetOfflineSchedulesCount(data As Map)";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="If data.IsInitialized = False Then Return 0";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 195;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
Debug.ShouldStop(4);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(offlinestore.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 196;BA.debugLine="If schedules.IsInitialized = False Then Return 0";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 197;BA.debugLine="Return schedules.Size";
Debug.ShouldStop(16);
if (true) return _schedules.runMethod(true,"getSize");
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getplaylisttrackcount(RemoteObject __ref,RemoteObject _playlistdata) throws Exception{
try {
		Debug.PushSubsStack("GetPlaylistTrackCount (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("getplaylisttrackcount")) { return __ref.runUserSub(false, "offlinestore","getplaylisttrackcount", __ref, _playlistdata);}
RemoteObject _tracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 313;BA.debugLine="Private Sub GetPlaylistTrackCount(playlistData As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="If playlistData.IsInitialized = False Then Return";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 315;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
Debug.ShouldStop(67108864);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(offlinestore.__c.getField(false,"Null"))));Debug.locals.put("tracks", _tracks);Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 316;BA.debugLine="If tracks.IsInitialized = False Then Return 0";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_tracks.runMethod(true,"IsInitialized"),offlinestore.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 317;BA.debugLine="Return tracks.Size";
Debug.ShouldStop(268435456);
if (true) return _tracks.runMethod(true,"getSize");
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
public static RemoteObject  _getstoredplaylistdescriptors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetStoredPlaylistDescriptors (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("getstoredplaylistdescriptors")) { return __ref.runUserSub(false, "offlinestore","getstoredplaylistdescriptors", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Public Sub GetStoredPlaylistDescriptors As List";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Return storage.GetDefault(\"playlist_descriptors\",";
Debug.ShouldStop(64);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_descriptors")),(Object)((__ref.runClassMethod (b4j.example.offlinestore.class, "_createinitializedlist" /*RemoteObject*/ ).getObject()))));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagedirvalue,RemoteObject _storagevalue,RemoteObject _targetmodulevalue,RemoteObject _tracesubnamevalue,RemoteObject _playerdatafilenamevalue,RemoteObject _playlistrequirementsfilenamevalue,RemoteObject _playlistsdirnamevalue,RemoteObject _playlistcdnbaseurlvalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "offlinestore","initialize", __ref, _ba, _storagedirvalue, _storagevalue, _targetmodulevalue, _tracesubnamevalue, _playerdatafilenamevalue, _playlistrequirementsfilenamevalue, _playlistsdirnamevalue, _playlistcdnbaseurlvalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("storageValue", _storagevalue);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
Debug.locals.put("traceSubNameValue", _tracesubnamevalue);
Debug.locals.put("playerDataFileNameValue", _playerdatafilenamevalue);
Debug.locals.put("playlistRequirementsFileNameValue", _playlistrequirementsfilenamevalue);
Debug.locals.put("playlistsDirNameValue", _playlistsdirnamevalue);
Debug.locals.put("playlistCdnBaseUrlValue", _playlistcdnbaseurlvalue);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(65536);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 18;BA.debugLine="storage = storageValue";
Debug.ShouldStop(131072);
__ref.setField ("_storage" /*RemoteObject*/ ,_storagevalue);
 BA.debugLineNum = 19;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(262144);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 20;BA.debugLine="traceSubName = traceSubNameValue";
Debug.ShouldStop(524288);
__ref.setField ("_tracesubname" /*RemoteObject*/ ,_tracesubnamevalue);
 BA.debugLineNum = 21;BA.debugLine="playerDataFileName = playerDataFileNameValue";
Debug.ShouldStop(1048576);
__ref.setField ("_playerdatafilename" /*RemoteObject*/ ,_playerdatafilenamevalue);
 BA.debugLineNum = 22;BA.debugLine="playlistRequirementsFileName = playlistRequiremen";
Debug.ShouldStop(2097152);
__ref.setField ("_playlistrequirementsfilename" /*RemoteObject*/ ,_playlistrequirementsfilenamevalue);
 BA.debugLineNum = 23;BA.debugLine="playlistsDirName = playlistsDirNameValue";
Debug.ShouldStop(4194304);
__ref.setField ("_playlistsdirname" /*RemoteObject*/ ,_playlistsdirnamevalue);
 BA.debugLineNum = 24;BA.debugLine="playlistCdnBaseUrl = playlistCdnBaseUrlValue";
Debug.ShouldStop(8388608);
__ref.setField ("_playlistcdnbaseurl" /*RemoteObject*/ ,_playlistcdnbaseurlvalue);
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
public static RemoteObject  _loadofflinedata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadOfflineData (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("loadofflinedata")) { return __ref.runUserSub(false, "offlinestore","loadofflinedata", __ref);}
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _parsed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 28;BA.debugLine="Public Sub LoadOfflineData As Map";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Dim data As Map";
Debug.ShouldStop(268435456);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 30;BA.debugLine="data.Initialize";
Debug.ShouldStop(536870912);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="If File.Exists(storageDir, playerDataFileName) =";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",offlinestore.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_playerdatafilename" /*RemoteObject*/ ))),offlinestore.__c.getField(true,"False"))) { 
if (true) return _data;};
 BA.debugLineNum = 32;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 33;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 34;BA.debugLine="parser.Initialize(File.ReadString(storageDir, pl";
Debug.ShouldStop(2);
_parser.runVoidMethod ("Initialize",(Object)(offlinestore.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_playerdatafilename" /*RemoteObject*/ )))));
 BA.debugLineNum = 35;BA.debugLine="Dim parsed As Map = parser.NextObject";
Debug.ShouldStop(4);
_parsed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_parsed = _parser.runMethod(false,"NextObject");Debug.locals.put("parsed", _parsed);Debug.locals.put("parsed", _parsed);
 BA.debugLineNum = 36;BA.debugLine="If parsed.IsInitialized Then";
Debug.ShouldStop(8);
if (_parsed.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 37;BA.debugLine="data = parsed";
Debug.ShouldStop(16);
_data = _parsed;Debug.locals.put("data", _data);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 40;BA.debugLine="data.Initialize";
Debug.ShouldStop(128);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="Trace(\"данные плеера load ошибка message=\" & Las";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.offlinestore.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("данные плеера load ошибка message="),offlinestore.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 43;BA.debugLine="Return data";
Debug.ShouldStop(1024);
if (true) return _data;
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizeofflinedata(RemoteObject __ref,RemoteObject _sourcedata,RemoteObject _playercode,RemoteObject _deviceid) throws Exception{
try {
		Debug.PushSubsStack("NormalizeOfflineData (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("normalizeofflinedata")) { return __ref.runUserSub(false, "offlinestore","normalizeofflinedata", __ref, _sourcedata, _playercode, _deviceid);}
RemoteObject _normalizeddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("sourceData", _sourcedata);
Debug.locals.put("playerCode", _playercode);
Debug.locals.put("deviceId", _deviceid);
 BA.debugLineNum = 135;BA.debugLine="Private Sub NormalizeOfflineData(sourceData As Map";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim normalizedData As Map";
Debug.ShouldStop(128);
_normalizeddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("normalizedData", _normalizeddata);
 BA.debugLineNum = 137;BA.debugLine="normalizedData.Initialize";
Debug.ShouldStop(256);
_normalizeddata.runVoidMethod ("Initialize");
 BA.debugLineNum = 138;BA.debugLine="normalizedData.Put(\"ok\", sourceData.GetDefault(\"o";
Debug.ShouldStop(512);
_normalizeddata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ok"))),(Object)(_sourcedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((offlinestore.__c.getField(true,"False"))))));
 BA.debugLineNum = 139;BA.debugLine="normalizedData.Put(\"type\", sourceData.GetDefault(";
Debug.ShouldStop(1024);
_normalizeddata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)(_sourcedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 140;BA.debugLine="normalizedData.Put(\"updated\", sourceData.GetDefau";
Debug.ShouldStop(2048);
_normalizeddata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("updated"))),(Object)(_sourcedata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 141;BA.debugLine="normalizedData.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(4096);
_normalizeddata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((offlinestore.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 142;BA.debugLine="normalizedData.Put(\"player_code\", playerCode)";
Debug.ShouldStop(8192);
_normalizeddata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player_code"))),(Object)((_playercode)));
 BA.debugLineNum = 143;BA.debugLine="normalizedData.Put(\"device_id\", deviceId)";
Debug.ShouldStop(16384);
_normalizeddata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device_id"))),(Object)((_deviceid)));
 BA.debugLineNum = 144;BA.debugLine="If sourceData.ContainsKey(\"player\") Then normaliz";
Debug.ShouldStop(32768);
if (_sourcedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("player")))).<Boolean>get().booleanValue()) { 
_normalizeddata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)(_sourcedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("player"))))));};
 BA.debugLineNum = 145;BA.debugLine="If sourceData.ContainsKey(\"ads\") Then normalizedD";
Debug.ShouldStop(65536);
if (_sourcedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("ads")))).<Boolean>get().booleanValue()) { 
_normalizeddata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ads"))),(Object)(_sourcedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ads"))))));};
 BA.debugLineNum = 146;BA.debugLine="If sourceData.ContainsKey(\"schedules\") Then norma";
Debug.ShouldStop(131072);
if (_sourcedata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("schedules")))).<Boolean>get().booleanValue()) { 
_normalizeddata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(_sourcedata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("schedules"))))));};
 BA.debugLineNum = 147;BA.debugLine="Return normalizedData";
Debug.ShouldStop(262144);
if (true) return _normalizeddata;
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizeofflineplaylistdata(RemoteObject __ref,RemoteObject _descriptor,RemoteObject _playlistdata) throws Exception{
try {
		Debug.PushSubsStack("NormalizeOfflinePlaylistData (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("normalizeofflineplaylistdata")) { return __ref.runUserSub(false, "offlinestore","normalizeofflineplaylistdata", __ref, _descriptor, _playlistdata);}
RemoteObject _normalizedplaylistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("descriptor", _descriptor);
Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 301;BA.debugLine="Private Sub NormalizeOfflinePlaylistData(descripto";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="Dim normalizedPlaylistData As Map";
Debug.ShouldStop(8192);
_normalizedplaylistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("normalizedPlaylistData", _normalizedplaylistdata);
 BA.debugLineNum = 303;BA.debugLine="normalizedPlaylistData.Initialize";
Debug.ShouldStop(16384);
_normalizedplaylistdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 304;BA.debugLine="For Each key As String In playlistData.Keys";
Debug.ShouldStop(32768);
{
final RemoteObject group3 = _playlistdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 305;BA.debugLine="normalizedPlaylistData.Put(key, playlistData.Get";
Debug.ShouldStop(65536);
_normalizedplaylistdata.runVoidMethod ("Put",(Object)((_key)),(Object)(_playlistdata.runMethod(false,"Get",(Object)((_key)))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 307;BA.debugLine="normalizedPlaylistData.Put(\"id\", descriptor.GetDe";
Debug.ShouldStop(262144);
_normalizedplaylistdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 308;BA.debugLine="normalizedPlaylistData.Put(\"required_updated\", de";
Debug.ShouldStop(524288);
_normalizedplaylistdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("required_updated"))),(Object)(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 309;BA.debugLine="normalizedPlaylistData.Put(\"saved_at\", DateTime.N";
Debug.ShouldStop(1048576);
_normalizedplaylistdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((offlinestore.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 310;BA.debugLine="Return normalizedPlaylistData";
Debug.ShouldStop(2097152);
if (true) return _normalizedplaylistdata;
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playlistmetadatafilename(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("PlaylistMetadataFileName (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("playlistmetadatafilename")) { return __ref.runUserSub(false, "offlinestore","playlistmetadatafilename", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 127;BA.debugLine="Public Sub PlaylistMetadataFileName(playlistId As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Return playlistId & \".json\"";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.concat(_playlistid,RemoteObject.createImmutable(".json"));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playlistmetadataurl(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("PlaylistMetadataUrl (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("playlistmetadataurl")) { return __ref.runUserSub(false, "offlinestore","playlistmetadataurl", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 131;BA.debugLine="Public Sub PlaylistMetadataUrl(playlistId As Strin";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="Return playlistCdnBaseUrl & playlistId & \".json\"";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(__ref.getField(true,"_playlistcdnbaseurl" /*RemoteObject*/ ),_playlistid,RemoteObject.createImmutable(".json"));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshplaylistcachestatus(RemoteObject __ref,RemoteObject _playlistdescriptors) throws Exception{
try {
		Debug.PushSubsStack("RefreshPlaylistCacheStatus (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("refreshplaylistcachestatus")) { return __ref.runUserSub(false, "offlinestore","refreshplaylistcachestatus", __ref, _playlistdescriptors);}
RemoteObject _refreshedcachestatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playlistDescriptors", _playlistdescriptors);
 BA.debugLineNum = 82;BA.debugLine="Public Sub RefreshPlaylistCacheStatus(playlistDesc";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Dim refreshedCacheStatus As Map = CompareOfflineP";
Debug.ShouldStop(262144);
_refreshedcachestatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_refreshedcachestatus = __ref.runClassMethod (b4j.example.offlinestore.class, "_compareofflineplaylistswithcache" /*RemoteObject*/ ,(Object)(_playlistdescriptors));Debug.locals.put("refreshedCacheStatus", _refreshedcachestatus);Debug.locals.put("refreshedCacheStatus", _refreshedcachestatus);
 BA.debugLineNum = 84;BA.debugLine="storage.Put(\"playlist_download_ids\", refreshedCac";
Debug.ShouldStop(524288);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_download_ids")),(Object)(_refreshedcachestatus.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("DownloadIds"))),(Object)((__ref.runClassMethod (b4j.example.offlinestore.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 85;BA.debugLine="storage.Put(\"playlist_missing_count\", refreshedCa";
Debug.ShouldStop(1048576);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_missing_count")),(Object)(_refreshedcachestatus.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("MissingCount"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 86;BA.debugLine="storage.Put(\"playlist_outdated_count\", refreshedC";
Debug.ShouldStop(2097152);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_outdated_count")),(Object)(_refreshedcachestatus.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("OutdatedCount"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 87;BA.debugLine="storage.Put(\"playlist_actual_count\", refreshedCac";
Debug.ShouldStop(4194304);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_actual_count")),(Object)(_refreshedcachestatus.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ActualCount"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveplaylistsyncaction(RemoteObject __ref,RemoteObject _descriptor,RemoteObject _cachedplaylistindex) throws Exception{
try {
		Debug.PushSubsStack("ResolvePlaylistSyncAction (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("resolveplaylistsyncaction")) { return __ref.runUserSub(false, "offlinestore","resolveplaylistsyncaction", __ref, _descriptor, _cachedplaylistindex);}
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _cachedentryobject = RemoteObject.declareNull("Object");
RemoteObject _cachedentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("descriptor", _descriptor);
Debug.locals.put("cachedPlaylistIndex", _cachedplaylistindex);
 BA.debugLineNum = 91;BA.debugLine="Public Sub ResolvePlaylistSyncAction(descriptor As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
Debug.ShouldStop(134217728);
_playlistid = BA.ObjectToString(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 93;BA.debugLine="If playlistId = \"\" Then Return \"skip\"";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("skip");};
 BA.debugLineNum = 94;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId) =";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_cachedplaylistindex.runMethod(true,"ContainsKey",(Object)((_playlistid))),offlinestore.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("missing");};
 BA.debugLineNum = 95;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylistI";
Debug.ShouldStop(1073741824);
_cachedentryobject = _cachedplaylistindex.runMethod(false,"Get",(Object)((_playlistid)));Debug.locals.put("cachedEntryObject", _cachedentryobject);Debug.locals.put("cachedEntryObject", _cachedentryobject);
 BA.debugLineNum = 96;BA.debugLine="If cachedEntryObject Is Map Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("i",_cachedentryobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 97;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
Debug.ShouldStop(1);
_cachedentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedentry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _cachedentryobject);Debug.locals.put("cachedEntry", _cachedentry);Debug.locals.put("cachedEntry", _cachedentry);
 BA.debugLineNum = 98;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> desc";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_cachedentry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable("")))),_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable("")))))) { 
if (true) return BA.ObjectToString("outdated");};
 BA.debugLineNum = 99;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",offlinestore.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.runClassMethod (b4j.example.offlinestore.class, "_getofflineplaylistsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.offlinestore.class, "_playlistmetadatafilename" /*RemoteObject*/ ,(Object)(_playlistid)))),offlinestore.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("missing");};
 BA.debugLineNum = 100;BA.debugLine="Return \"skip\"";
Debug.ShouldStop(8);
if (true) return BA.ObjectToString("skip");
 };
 BA.debugLineNum = 102;BA.debugLine="Return \"missing\"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToString("missing");
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savecachedplaylistindex(RemoteObject __ref,RemoteObject _cachedplaylistindex) throws Exception{
try {
		Debug.PushSubsStack("SaveCachedPlaylistIndex (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("savecachedplaylistindex")) { return __ref.runUserSub(false, "offlinestore","savecachedplaylistindex", __ref, _cachedplaylistindex);}
Debug.locals.put("cachedPlaylistIndex", _cachedplaylistindex);
 BA.debugLineNum = 78;BA.debugLine="Public Sub SaveCachedPlaylistIndex(cachedPlaylistI";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayli";
Debug.ShouldStop(16384);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cached_playlist_index")),(Object)((_cachedplaylistindex.getObject())));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveofflinedata(RemoteObject __ref,RemoteObject _sourcedata,RemoteObject _playercode,RemoteObject _deviceid) throws Exception{
try {
		Debug.PushSubsStack("SaveOfflineData (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("saveofflinedata")) { return __ref.runUserSub(false, "offlinestore","saveofflinedata", __ref, _sourcedata, _playercode, _deviceid);}
RemoteObject _normalizeddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _offlinedataupdatedat = RemoteObject.createImmutable(0L);
RemoteObject _playlistids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistdescriptors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistcachestatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _generator = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("sourceData", _sourcedata);
Debug.locals.put("playerCode", _playercode);
Debug.locals.put("deviceId", _deviceid);
 BA.debugLineNum = 47;BA.debugLine="Public Sub SaveOfflineData(sourceData As Map, play";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Dim normalizedData As Map = NormalizeOfflineData(";
Debug.ShouldStop(32768);
_normalizeddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_normalizeddata = __ref.runClassMethod (b4j.example.offlinestore.class, "_normalizeofflinedata" /*RemoteObject*/ ,(Object)(_sourcedata),(Object)(_playercode),(Object)(_deviceid));Debug.locals.put("normalizedData", _normalizeddata);Debug.locals.put("normalizedData", _normalizeddata);
 BA.debugLineNum = 49;BA.debugLine="Dim offlineDataUpdatedAt As Long = DateTime.Now";
Debug.ShouldStop(65536);
_offlinedataupdatedat = offlinestore.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("offlineDataUpdatedAt", _offlinedataupdatedat);Debug.locals.put("offlineDataUpdatedAt", _offlinedataupdatedat);
 BA.debugLineNum = 50;BA.debugLine="storage.Put(\"player_data_updated_at\", offlineData";
Debug.ShouldStop(131072);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("player_data_updated_at")),(Object)((_offlinedataupdatedat)));
 BA.debugLineNum = 51;BA.debugLine="storage.Put(\"player_data_source_updated\", normali";
Debug.ShouldStop(262144);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("player_data_source_updated")),(Object)(_normalizeddata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 52;BA.debugLine="Dim playlistIds As List = GetOfflinePlaylistIds(n";
Debug.ShouldStop(524288);
_playlistids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlistids = __ref.runClassMethod (b4j.example.offlinestore.class, "_getofflineplaylistids" /*RemoteObject*/ ,(Object)(_normalizeddata));Debug.locals.put("playlistIds", _playlistids);Debug.locals.put("playlistIds", _playlistids);
 BA.debugLineNum = 53;BA.debugLine="Dim playlistDescriptors As List = BuildOfflinePla";
Debug.ShouldStop(1048576);
_playlistdescriptors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlistdescriptors = __ref.runClassMethod (b4j.example.offlinestore.class, "_buildofflineplaylistdescriptors" /*RemoteObject*/ ,(Object)(_normalizeddata));Debug.locals.put("playlistDescriptors", _playlistdescriptors);Debug.locals.put("playlistDescriptors", _playlistdescriptors);
 BA.debugLineNum = 54;BA.debugLine="Dim playlistCacheStatus As Map = CompareOfflinePl";
Debug.ShouldStop(2097152);
_playlistcachestatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistcachestatus = __ref.runClassMethod (b4j.example.offlinestore.class, "_compareofflineplaylistswithcache" /*RemoteObject*/ ,(Object)(_playlistdescriptors));Debug.locals.put("playlistCacheStatus", _playlistcachestatus);Debug.locals.put("playlistCacheStatus", _playlistcachestatus);
 BA.debugLineNum = 55;BA.debugLine="storage.Put(\"playlist_ids\", playlistIds)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_ids")),(Object)((_playlistids.getObject())));
 BA.debugLineNum = 56;BA.debugLine="storage.Put(\"playlist_descriptors\", playlistDescr";
Debug.ShouldStop(8388608);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_descriptors")),(Object)((_playlistdescriptors.getObject())));
 BA.debugLineNum = 57;BA.debugLine="storage.Put(\"playlist_download_ids\", playlistCach";
Debug.ShouldStop(16777216);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_download_ids")),(Object)(_playlistcachestatus.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("DownloadIds"))),(Object)((__ref.runClassMethod (b4j.example.offlinestore.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 58;BA.debugLine="storage.Put(\"playlist_missing_count\", playlistCac";
Debug.ShouldStop(33554432);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_missing_count")),(Object)(_playlistcachestatus.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("MissingCount"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 59;BA.debugLine="storage.Put(\"playlist_outdated_count\", playlistCa";
Debug.ShouldStop(67108864);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_outdated_count")),(Object)(_playlistcachestatus.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("OutdatedCount"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 60;BA.debugLine="storage.Put(\"playlist_actual_count\", playlistCach";
Debug.ShouldStop(134217728);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_actual_count")),(Object)(_playlistcachestatus.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ActualCount"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 61;BA.debugLine="storage.Put(\"ad_count\", GetOfflineAdsCount(normal";
Debug.ShouldStop(268435456);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ad_count")),(Object)((__ref.runClassMethod (b4j.example.offlinestore.class, "_getofflineadscount" /*RemoteObject*/ ,(Object)(_normalizeddata)))));
 BA.debugLineNum = 62;BA.debugLine="storage.Put(\"schedule_count\", GetOfflineSchedules";
Debug.ShouldStop(536870912);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("schedule_count")),(Object)((__ref.runClassMethod (b4j.example.offlinestore.class, "_getofflineschedulescount" /*RemoteObject*/ ,(Object)(_normalizeddata)))));
 BA.debugLineNum = 63;BA.debugLine="Dim generator As JSONGenerator";
Debug.ShouldStop(1073741824);
_generator = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("generator", _generator);
 BA.debugLineNum = 64;BA.debugLine="generator.Initialize(normalizedData)";
Debug.ShouldStop(-2147483648);
_generator.runVoidMethod ("Initialize",(Object)(_normalizeddata));
 BA.debugLineNum = 65;BA.debugLine="File.WriteString(storageDir, playerDataFileName,";
Debug.ShouldStop(1);
offlinestore.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_playerdatafilename" /*RemoteObject*/ )),(Object)(_generator.runMethod(true,"ToString")));
 BA.debugLineNum = 66;BA.debugLine="WriteOfflinePlaylistRequirementsFile(playlistDesc";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.offlinestore.class, "_writeofflineplaylistrequirementsfile" /*RemoteObject*/ ,(Object)(_playlistdescriptors),(Object)(_playercode));
 BA.debugLineNum = 67;BA.debugLine="Return normalizedData";
Debug.ShouldStop(4);
if (true) return _normalizeddata;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveplaylistmetadata(RemoteObject __ref,RemoteObject _descriptor,RemoteObject _playlistdata,RemoteObject _cachedplaylistindex) throws Exception{
try {
		Debug.PushSubsStack("SavePlaylistMetadata (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("saveplaylistmetadata")) { return __ref.runUserSub(false, "offlinestore","saveplaylistmetadata", __ref, _descriptor, _playlistdata, _cachedplaylistindex);}
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _normalizedplaylistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _generator = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
RemoteObject _cachedentry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("descriptor", _descriptor);
Debug.locals.put("playlistData", _playlistdata);
Debug.locals.put("cachedPlaylistIndex", _cachedplaylistindex);
 BA.debugLineNum = 106;BA.debugLine="Public Sub SavePlaylistMetadata(descriptor As Map,";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="EnsureDirectory(GetOfflinePlaylistsDir)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.offlinestore.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.offlinestore.class, "_getofflineplaylistsdir" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
Debug.ShouldStop(2048);
_playlistid = BA.ObjectToString(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 109;BA.debugLine="Dim normalizedPlaylistData As Map = NormalizeOffl";
Debug.ShouldStop(4096);
_normalizedplaylistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_normalizedplaylistdata = __ref.runClassMethod (b4j.example.offlinestore.class, "_normalizeofflineplaylistdata" /*RemoteObject*/ ,(Object)(_descriptor),(Object)(_playlistdata));Debug.locals.put("normalizedPlaylistData", _normalizedplaylistdata);Debug.locals.put("normalizedPlaylistData", _normalizedplaylistdata);
 BA.debugLineNum = 110;BA.debugLine="Dim generator As JSONGenerator";
Debug.ShouldStop(8192);
_generator = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("generator", _generator);
 BA.debugLineNum = 111;BA.debugLine="generator.Initialize(normalizedPlaylistData)";
Debug.ShouldStop(16384);
_generator.runVoidMethod ("Initialize",(Object)(_normalizedplaylistdata));
 BA.debugLineNum = 112;BA.debugLine="File.WriteString(GetOfflinePlaylistsDir, Playlist";
Debug.ShouldStop(32768);
offlinestore.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.runClassMethod (b4j.example.offlinestore.class, "_getofflineplaylistsdir" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.offlinestore.class, "_playlistmetadatafilename" /*RemoteObject*/ ,(Object)(_playlistid))),(Object)(_generator.runMethod(true,"ToString")));
 BA.debugLineNum = 113;BA.debugLine="Dim cachedEntry As Map";
Debug.ShouldStop(65536);
_cachedentry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("cachedEntry", _cachedentry);
 BA.debugLineNum = 114;BA.debugLine="cachedEntry.Initialize";
Debug.ShouldStop(131072);
_cachedentry.runVoidMethod ("Initialize");
 BA.debugLineNum = 115;BA.debugLine="cachedEntry.Put(\"id\", playlistId)";
Debug.ShouldStop(262144);
_cachedentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_playlistid)));
 BA.debugLineNum = 116;BA.debugLine="cachedEntry.Put(\"updated\", descriptor.GetDefault(";
Debug.ShouldStop(524288);
_cachedentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("updated"))),(Object)(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 117;BA.debugLine="cachedEntry.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(1048576);
_cachedentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((offlinestore.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 118;BA.debugLine="cachedEntry.Put(\"title\", descriptor.GetDefault(\"t";
Debug.ShouldStop(2097152);
_cachedentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_descriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 119;BA.debugLine="cachedEntry.Put(\"track_count\", GetPlaylistTrackCo";
Debug.ShouldStop(4194304);
_cachedentry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("track_count"))),(Object)((__ref.runClassMethod (b4j.example.offlinestore.class, "_getplaylisttrackcount" /*RemoteObject*/ ,(Object)(_normalizedplaylistdata)))));
 BA.debugLineNum = 120;BA.debugLine="cachedPlaylistIndex.Put(playlistId, cachedEntry)";
Debug.ShouldStop(8388608);
_cachedplaylistindex.runVoidMethod ("Put",(Object)((_playlistid)),(Object)((_cachedentry.getObject())));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Trace (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "offlinestore","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 352;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
Debug.ShouldStop(1);
if (offlinestore.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 354;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
Debug.ShouldStop(2);
offlinestore.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tracesubname" /*RemoteObject*/ )),(Object)((_message)));
 };
 BA.debugLineNum = 356;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writeofflineplaylistrequirementsfile(RemoteObject __ref,RemoteObject _descriptors,RemoteObject _playercode) throws Exception{
try {
		Debug.PushSubsStack("WriteOfflinePlaylistRequirementsFile (offlinestore) ","offlinestore",11,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("writeofflineplaylistrequirementsfile")) { return __ref.runUserSub(false, "offlinestore","writeofflineplaylistrequirementsfile", __ref, _descriptors, _playercode);}
RemoteObject _payload = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _generator = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("descriptors", _descriptors);
Debug.locals.put("playerCode", _playercode);
 BA.debugLineNum = 290;BA.debugLine="Private Sub WriteOfflinePlaylistRequirementsFile(d";
Debug.ShouldStop(2);
 BA.debugLineNum = 291;BA.debugLine="Dim payload As Map";
Debug.ShouldStop(4);
_payload = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("payload", _payload);
 BA.debugLineNum = 292;BA.debugLine="payload.Initialize";
Debug.ShouldStop(8);
_payload.runVoidMethod ("Initialize");
 BA.debugLineNum = 293;BA.debugLine="payload.Put(\"saved_at\", DateTime.Now)";
Debug.ShouldStop(16);
_payload.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("saved_at"))),(Object)((offlinestore.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 294;BA.debugLine="payload.Put(\"player_code\", playerCode)";
Debug.ShouldStop(32);
_payload.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player_code"))),(Object)((_playercode)));
 BA.debugLineNum = 295;BA.debugLine="payload.Put(\"descriptors\", descriptors)";
Debug.ShouldStop(64);
_payload.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("descriptors"))),(Object)((_descriptors.getObject())));
 BA.debugLineNum = 296;BA.debugLine="Dim generator As JSONGenerator";
Debug.ShouldStop(128);
_generator = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("generator", _generator);
 BA.debugLineNum = 297;BA.debugLine="generator.Initialize(payload)";
Debug.ShouldStop(256);
_generator.runVoidMethod ("Initialize",(Object)(_payload));
 BA.debugLineNum = 298;BA.debugLine="File.WriteString(storageDir, playlistRequirements";
Debug.ShouldStop(512);
offlinestore.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_playlistrequirementsfilename" /*RemoteObject*/ )),(Object)(_generator.runMethod(true,"ToString")));
 BA.debugLineNum = 299;BA.debugLine="End Sub";
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