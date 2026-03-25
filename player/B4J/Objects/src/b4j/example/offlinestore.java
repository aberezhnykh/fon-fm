package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class offlinestore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.offlinestore", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.offlinestore.class).invoke(this, new Object[] {null});
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
public String _storagedir = "";
public b4j.example.keyvaluestore _storage = null;
public Object _targetmodule = null;
public String _tracesubname = "";
public String _playerdatafilename = "";
public String _playlistrequirementsfilename = "";
public String _playlistsdirname = "";
public String _playlistcdnbaseurl = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.collections.List  _getstoredplaylistdescriptors(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getstoredplaylistdescriptors", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getstoredplaylistdescriptors", null));}
RDebugUtils.currentLine=47906816;
 //BA.debugLineNum = 47906816;BA.debugLine="Public Sub GetStoredPlaylistDescriptors As List";
RDebugUtils.currentLine=47906817;
 //BA.debugLineNum = 47906817;BA.debugLine="Return storage.GetDefault(\"playlist_descriptors\",";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"playlist_descriptors",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=47906818;
 //BA.debugLineNum = 47906818;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadataurl(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadataurl", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadataurl", new Object[] {_playlistid}));}
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Public Sub PlaylistMetadataUrl(playlistId As Strin";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="Return playlistCdnBaseUrl & playlistId & \".json\"";
if (true) return __ref._playlistcdnbaseurl /*String*/ +_playlistid+".json";
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="End Sub";
return "";
}
public String  _saveplaylistmetadata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _playlistdata,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "saveplaylistmetadata", false))
	 {return ((String) Debug.delegate(ba, "saveplaylistmetadata", new Object[] {_descriptor,_playlistdata,_cachedplaylistindex}));}
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _normalizedplaylistdata = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _generator = null;
anywheresoftware.b4a.objects.collections.Map _cachedentry = null;
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Public Sub SavePlaylistMetadata(descriptor As Map,";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="EnsureDirectory(GetOfflinePlaylistsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getofflineplaylistsdir /*String*/ (null));
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=48234499;
 //BA.debugLineNum = 48234499;BA.debugLine="Dim normalizedPlaylistData As Map = NormalizeOffl";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
_normalizedplaylistdata = __ref._normalizeofflineplaylistdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_descriptor,_playlistdata);
RDebugUtils.currentLine=48234500;
 //BA.debugLineNum = 48234500;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=48234501;
 //BA.debugLineNum = 48234501;BA.debugLine="generator.Initialize(normalizedPlaylistData)";
_generator.Initialize(_normalizedplaylistdata);
RDebugUtils.currentLine=48234502;
 //BA.debugLineNum = 48234502;BA.debugLine="File.WriteString(GetOfflinePlaylistsDir, Playlist";
__c.File.WriteString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid),_generator.ToString());
RDebugUtils.currentLine=48234503;
 //BA.debugLineNum = 48234503;BA.debugLine="Dim cachedEntry As Map";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=48234504;
 //BA.debugLineNum = 48234504;BA.debugLine="cachedEntry.Initialize";
_cachedentry.Initialize();
RDebugUtils.currentLine=48234505;
 //BA.debugLineNum = 48234505;BA.debugLine="cachedEntry.Put(\"id\", playlistId)";
_cachedentry.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=48234506;
 //BA.debugLineNum = 48234506;BA.debugLine="cachedEntry.Put(\"updated\", descriptor.GetDefault(";
_cachedentry.Put((Object)("updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=48234507;
 //BA.debugLineNum = 48234507;BA.debugLine="cachedEntry.Put(\"saved_at\", DateTime.Now)";
_cachedentry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=48234508;
 //BA.debugLineNum = 48234508;BA.debugLine="cachedEntry.Put(\"title\", descriptor.GetDefault(\"t";
_cachedentry.Put((Object)("title"),_descriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=48234509;
 //BA.debugLineNum = 48234509;BA.debugLine="cachedEntry.Put(\"track_count\", GetPlaylistTrackCo";
_cachedentry.Put((Object)("track_count"),(Object)(__ref._getplaylisttrackcount /*int*/ (null,_normalizedplaylistdata)));
RDebugUtils.currentLine=48234510;
 //BA.debugLineNum = 48234510;BA.debugLine="cachedPlaylistIndex.Put(playlistId, cachedEntry)";
_cachedplaylistindex.Put((Object)(_playlistid),(Object)(_cachedentry.getObject()));
RDebugUtils.currentLine=48234511;
 //BA.debugLineNum = 48234511;BA.debugLine="InvalidatePlaylistPlaybackOrder(playlistId)";
__ref._invalidateplaylistplaybackorder /*String*/ (null,_playlistid);
RDebugUtils.currentLine=48234512;
 //BA.debugLineNum = 48234512;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.offlinestore __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4j.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _playerdatafilenamevalue,String _playlistrequirementsfilenamevalue,String _playlistsdirnamevalue,String _playlistcdnbaseurlvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_storagevalue,_targetmodulevalue,_tracesubnamevalue,_playerdatafilenamevalue,_playlistrequirementsfilenamevalue,_playlistsdirnamevalue,_playlistcdnbaseurlvalue}));}
RDebugUtils.currentLine=47710208;
 //BA.debugLineNum = 47710208;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
RDebugUtils.currentLine=47710209;
 //BA.debugLineNum = 47710209;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=47710210;
 //BA.debugLineNum = 47710210;BA.debugLine="storage = storageValue";
__ref._storage /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=47710211;
 //BA.debugLineNum = 47710211;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=47710212;
 //BA.debugLineNum = 47710212;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=47710213;
 //BA.debugLineNum = 47710213;BA.debugLine="playerDataFileName = playerDataFileNameValue";
__ref._playerdatafilename /*String*/  = _playerdatafilenamevalue;
RDebugUtils.currentLine=47710214;
 //BA.debugLineNum = 47710214;BA.debugLine="playlistRequirementsFileName = playlistRequiremen";
__ref._playlistrequirementsfilename /*String*/  = _playlistrequirementsfilenamevalue;
RDebugUtils.currentLine=47710215;
 //BA.debugLineNum = 47710215;BA.debugLine="playlistsDirName = playlistsDirNameValue";
__ref._playlistsdirname /*String*/  = _playlistsdirnamevalue;
RDebugUtils.currentLine=47710216;
 //BA.debugLineNum = 47710216;BA.debugLine="playlistCdnBaseUrl = playlistCdnBaseUrlValue";
__ref._playlistcdnbaseurl /*String*/  = _playlistcdnbaseurlvalue;
RDebugUtils.currentLine=47710217;
 //BA.debugLineNum = 47710217;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadofflinedata(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "loadofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadofflinedata", null));}
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _parsed = null;
RDebugUtils.currentLine=47775744;
 //BA.debugLineNum = 47775744;BA.debugLine="Public Sub LoadOfflineData As Map";
RDebugUtils.currentLine=47775745;
 //BA.debugLineNum = 47775745;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=47775746;
 //BA.debugLineNum = 47775746;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=47775747;
 //BA.debugLineNum = 47775747;BA.debugLine="If File.Exists(storageDir, playerDataFileName) =";
if (__c.File.Exists(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ )==__c.False) { 
if (true) return _data;};
RDebugUtils.currentLine=47775748;
 //BA.debugLineNum = 47775748;BA.debugLine="Try";
try {RDebugUtils.currentLine=47775749;
 //BA.debugLineNum = 47775749;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=47775750;
 //BA.debugLineNum = 47775750;BA.debugLine="parser.Initialize(File.ReadString(storageDir, pl";
_parser.Initialize(__c.File.ReadString(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ ));
RDebugUtils.currentLine=47775751;
 //BA.debugLineNum = 47775751;BA.debugLine="Dim parsed As Map = parser.NextObject";
_parsed = new anywheresoftware.b4a.objects.collections.Map();
_parsed = _parser.NextObject();
RDebugUtils.currentLine=47775752;
 //BA.debugLineNum = 47775752;BA.debugLine="If parsed.IsInitialized Then";
if (_parsed.IsInitialized()) { 
RDebugUtils.currentLine=47775753;
 //BA.debugLineNum = 47775753;BA.debugLine="data = parsed";
_data = _parsed;
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=47775756;
 //BA.debugLineNum = 47775756;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=47775757;
 //BA.debugLineNum = 47775757;BA.debugLine="Trace(\"данные плеера load ошибка message=\" & Las";
__ref._trace /*String*/ (null,"данные плеера load ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=47775759;
 //BA.debugLineNum = 47775759;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=47775760;
 //BA.debugLineNum = 47775760;BA.debugLine="End Sub";
return null;
}
public String  _getofflineplaylistsdir(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Public Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="Return File.Combine(storageDir, playlistsDirName)";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,__ref._playlistsdirname /*String*/ );
RDebugUtils.currentLine=48300034;
 //BA.debugLineNum = 48300034;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedplaylistindex(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getcachedplaylistindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedplaylistindex", null));}
RDebugUtils.currentLine=47972352;
 //BA.debugLineNum = 47972352;BA.debugLine="Public Sub GetCachedPlaylistIndex As Map";
RDebugUtils.currentLine=47972353;
 //BA.debugLineNum = 47972353;BA.debugLine="Return storage.GetDefault(\"cached_playlist_index\"";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=47972354;
 //BA.debugLineNum = 47972354;BA.debugLine="End Sub";
return null;
}
public String  _resolveplaylistsyncaction(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "resolveplaylistsyncaction", false))
	 {return ((String) Debug.delegate(ba, "resolveplaylistsyncaction", new Object[] {_descriptor,_cachedplaylistindex}));}
String _playlistid = "";
Object _cachedentryobject = null;
anywheresoftware.b4a.objects.collections.Map _cachedentry = null;
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Public Sub ResolvePlaylistSyncAction(descriptor As";
RDebugUtils.currentLine=48168961;
 //BA.debugLineNum = 48168961;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=48168962;
 //BA.debugLineNum = 48168962;BA.debugLine="If playlistId = \"\" Then Return \"skip\"";
if ((_playlistid).equals("")) { 
if (true) return "skip";};
RDebugUtils.currentLine=48168963;
 //BA.debugLineNum = 48168963;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId) =";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=48168964;
 //BA.debugLineNum = 48168964;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylistI";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=48168965;
 //BA.debugLineNum = 48168965;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48168966;
 //BA.debugLineNum = 48168966;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=48168967;
 //BA.debugLineNum = 48168967;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> desc";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
if (true) return "outdated";};
RDebugUtils.currentLine=48168968;
 //BA.debugLineNum = 48168968;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=48168969;
 //BA.debugLineNum = 48168969;BA.debugLine="Return \"skip\"";
if (true) return "skip";
 };
RDebugUtils.currentLine=48168971;
 //BA.debugLineNum = 48168971;BA.debugLine="Return \"missing\"";
if (true) return "missing";
RDebugUtils.currentLine=48168972;
 //BA.debugLineNum = 48168972;BA.debugLine="End Sub";
return "";
}
public String  _savecachedplaylistindex(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "savecachedplaylistindex", false))
	 {return ((String) Debug.delegate(ba, "savecachedplaylistindex", new Object[] {_cachedplaylistindex}));}
RDebugUtils.currentLine=48037888;
 //BA.debugLineNum = 48037888;BA.debugLine="Public Sub SaveCachedPlaylistIndex(cachedPlaylistI";
RDebugUtils.currentLine=48037889;
 //BA.debugLineNum = 48037889;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayli";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
RDebugUtils.currentLine=48037890;
 //BA.debugLineNum = 48037890;BA.debugLine="End Sub";
return "";
}
public String  _refreshplaylistcachestatus(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _playlistdescriptors) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "refreshplaylistcachestatus", false))
	 {return ((String) Debug.delegate(ba, "refreshplaylistcachestatus", new Object[] {_playlistdescriptors}));}
anywheresoftware.b4a.objects.collections.Map _refreshedcachestatus = null;
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Public Sub RefreshPlaylistCacheStatus(playlistDesc";
RDebugUtils.currentLine=48103425;
 //BA.debugLineNum = 48103425;BA.debugLine="Dim refreshedCacheStatus As Map = CompareOfflineP";
_refreshedcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_refreshedcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="storage.Put(\"playlist_download_ids\", refreshedCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_download_ids",_refreshedcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=48103427;
 //BA.debugLineNum = 48103427;BA.debugLine="storage.Put(\"playlist_missing_count\", refreshedCa";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_missing_count",_refreshedcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=48103428;
 //BA.debugLineNum = 48103428;BA.debugLine="storage.Put(\"playlist_outdated_count\", refreshedC";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_outdated_count",_refreshedcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=48103429;
 //BA.debugLineNum = 48103429;BA.debugLine="storage.Put(\"playlist_actual_count\", refreshedCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_actual_count",_refreshedcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=48103430;
 //BA.debugLineNum = 48103430;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _buildofflineplaylistdescriptors(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "buildofflineplaylistdescriptors", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "buildofflineplaylistdescriptors", new Object[] {_data}));}
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
RDebugUtils.currentLine=48758784;
 //BA.debugLineNum = 48758784;BA.debugLine="Private Sub BuildOfflinePlaylistDescriptors(data A";
RDebugUtils.currentLine=48758785;
 //BA.debugLineNum = 48758785;BA.debugLine="Dim descriptors As List";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=48758786;
 //BA.debugLineNum = 48758786;BA.debugLine="descriptors.Initialize";
_descriptors.Initialize();
RDebugUtils.currentLine=48758787;
 //BA.debugLineNum = 48758787;BA.debugLine="If data.IsInitialized = False Then Return descrip";
if (_data.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=48758788;
 //BA.debugLineNum = 48758788;BA.debugLine="Dim uniqueDescriptors As Map";
_uniquedescriptors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=48758789;
 //BA.debugLineNum = 48758789;BA.debugLine="uniqueDescriptors.Initialize";
_uniquedescriptors.Initialize();
RDebugUtils.currentLine=48758790;
 //BA.debugLineNum = 48758790;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=48758791;
 //BA.debugLineNum = 48758791;BA.debugLine="If schedules.IsInitialized = False Then Return de";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=48758792;
 //BA.debugLineNum = 48758792;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=48758793;
 //BA.debugLineNum = 48758793;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48758794;
 //BA.debugLineNum = 48758794;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=48758795;
 //BA.debugLineNum = 48758795;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=48758796;
 //BA.debugLineNum = 48758796;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=48758797;
 //BA.debugLineNum = 48758797;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=48758798;
 //BA.debugLineNum = 48758798;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group14 = _slots;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_slotobject = group14.Get(index14);
RDebugUtils.currentLine=48758799;
 //BA.debugLineNum = 48758799;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48758800;
 //BA.debugLineNum = 48758800;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=48758801;
 //BA.debugLineNum = 48758801;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=48758802;
 //BA.debugLineNum = 48758802;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=48758803;
 //BA.debugLineNum = 48758803;BA.debugLine="Dim streamId As String = streamData.GetDefaul";
_streamid = BA.ObjectToString(_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=48758804;
 //BA.debugLineNum = 48758804;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=48758805;
 //BA.debugLineNum = 48758805;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=48758806;
 //BA.debugLineNum = 48758806;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=48758807;
 //BA.debugLineNum = 48758807;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group23 = _playlists;
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_playlistobject = group23.Get(index23);
RDebugUtils.currentLine=48758808;
 //BA.debugLineNum = 48758808;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48758809;
 //BA.debugLineNum = 48758809;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=48758810;
 //BA.debugLineNum = 48758810;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=48758811;
 //BA.debugLineNum = 48758811;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=48758812;
 //BA.debugLineNum = 48758812;BA.debugLine="If uniqueDescriptors.ContainsKey(playlistId";
if (_uniquedescriptors.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
RDebugUtils.currentLine=48758813;
 //BA.debugLineNum = 48758813;BA.debugLine="Dim descriptor As Map";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=48758814;
 //BA.debugLineNum = 48758814;BA.debugLine="descriptor.Initialize";
_descriptor.Initialize();
RDebugUtils.currentLine=48758815;
 //BA.debugLineNum = 48758815;BA.debugLine="descriptor.Put(\"id\", playlistId)";
_descriptor.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=48758816;
 //BA.debugLineNum = 48758816;BA.debugLine="descriptor.Put(\"updated\", playlist.GetDefau";
_descriptor.Put((Object)("updated"),_playlist.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=48758817;
 //BA.debugLineNum = 48758817;BA.debugLine="descriptor.Put(\"title\", playlist.GetDefault";
_descriptor.Put((Object)("title"),_playlist.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=48758818;
 //BA.debugLineNum = 48758818;BA.debugLine="descriptor.Put(\"schedule_title\", scheduleTi";
_descriptor.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=48758819;
 //BA.debugLineNum = 48758819;BA.debugLine="descriptor.Put(\"slot_time\", slotTime)";
_descriptor.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=48758820;
 //BA.debugLineNum = 48758820;BA.debugLine="descriptor.Put(\"stream_id\", streamId)";
_descriptor.Put((Object)("stream_id"),(Object)(_streamid));
RDebugUtils.currentLine=48758821;
 //BA.debugLineNum = 48758821;BA.debugLine="descriptor.Put(\"stream_title\", streamTitle)";
_descriptor.Put((Object)("stream_title"),(Object)(_streamtitle));
RDebugUtils.currentLine=48758822;
 //BA.debugLineNum = 48758822;BA.debugLine="uniqueDescriptors.Put(playlistId, descripto";
_uniquedescriptors.Put((Object)(_playlistid),(Object)(_descriptor.getObject()));
RDebugUtils.currentLine=48758823;
 //BA.debugLineNum = 48758823;BA.debugLine="descriptors.Add(descriptor)";
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
RDebugUtils.currentLine=48758830;
 //BA.debugLineNum = 48758830;BA.debugLine="Return descriptors";
if (true) return _descriptors;
RDebugUtils.currentLine=48758831;
 //BA.debugLineNum = 48758831;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=49217536;
 //BA.debugLineNum = 49217536;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49217538;
 //BA.debugLineNum = 49217538;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=49217539;
 //BA.debugLineNum = 49217539;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=49217540;
 //BA.debugLineNum = 49217540;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=49217541;
 //BA.debugLineNum = 49217541;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=49217542;
 //BA.debugLineNum = 49217542;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=49217543;
 //BA.debugLineNum = 49217543;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=49217545;
 //BA.debugLineNum = 49217545;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=49217546;
 //BA.debugLineNum = 49217546;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=49217547;
 //BA.debugLineNum = 49217547;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=49217548;
 //BA.debugLineNum = 49217548;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
RDebugUtils.currentLine=47644672;
 //BA.debugLineNum = 47644672;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=47644673;
 //BA.debugLineNum = 47644673;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=47644674;
 //BA.debugLineNum = 47644674;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=47644675;
 //BA.debugLineNum = 47644675;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=47644676;
 //BA.debugLineNum = 47644676;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=47644677;
 //BA.debugLineNum = 47644677;BA.debugLine="Private playerDataFileName As String";
_playerdatafilename = "";
RDebugUtils.currentLine=47644678;
 //BA.debugLineNum = 47644678;BA.debugLine="Private playlistRequirementsFileName As String";
_playlistrequirementsfilename = "";
RDebugUtils.currentLine=47644679;
 //BA.debugLineNum = 47644679;BA.debugLine="Private playlistsDirName As String";
_playlistsdirname = "";
RDebugUtils.currentLine=47644680;
 //BA.debugLineNum = 47644680;BA.debugLine="Private playlistCdnBaseUrl As String";
_playlistcdnbaseurl = "";
RDebugUtils.currentLine=47644681;
 //BA.debugLineNum = 47644681;BA.debugLine="End Sub";
return "";
}
public String  _cleanupobsoleteplaylistmetadata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _descriptors) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "cleanupobsoleteplaylistmetadata", false))
	 {return ((String) Debug.delegate(ba, "cleanupobsoleteplaylistmetadata", new Object[] {_descriptors}));}
anywheresoftware.b4a.objects.collections.Map _actualids = null;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex = null;
int _removedcount = 0;
anywheresoftware.b4a.objects.collections.List _obsoleteids = null;
RDebugUtils.currentLine=49020928;
 //BA.debugLineNum = 49020928;BA.debugLine="Private Sub CleanupObsoletePlaylistMetadata(descri";
RDebugUtils.currentLine=49020929;
 //BA.debugLineNum = 49020929;BA.debugLine="Dim actualIds As Map";
_actualids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49020930;
 //BA.debugLineNum = 49020930;BA.debugLine="actualIds.Initialize";
_actualids.Initialize();
RDebugUtils.currentLine=49020931;
 //BA.debugLineNum = 49020931;BA.debugLine="If descriptors.IsInitialized Then";
if (_descriptors.IsInitialized()) { 
RDebugUtils.currentLine=49020932;
 //BA.debugLineNum = 49020932;BA.debugLine="For Each descriptorObject As Object In descripto";
{
final anywheresoftware.b4a.BA.IterableList group4 = _descriptors;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_descriptorobject = group4.Get(index4);
RDebugUtils.currentLine=49020933;
 //BA.debugLineNum = 49020933;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=49020934;
 //BA.debugLineNum = 49020934;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=49020935;
 //BA.debugLineNum = 49020935;BA.debugLine="Dim playlistId As String = descriptor.GetDefau";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=49020936;
 //BA.debugLineNum = 49020936;BA.debugLine="If playlistId <> \"\" Then actualIds.Put(playlis";
if ((_playlistid).equals("") == false) { 
_actualids.Put((Object)(_playlistid),(Object)(__c.True));};
 };
 }
};
 };
RDebugUtils.currentLine=49020940;
 //BA.debugLineNum = 49020940;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=49020941;
 //BA.debugLineNum = 49020941;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
RDebugUtils.currentLine=49020942;
 //BA.debugLineNum = 49020942;BA.debugLine="Dim obsoleteIds As List";
_obsoleteids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49020943;
 //BA.debugLineNum = 49020943;BA.debugLine="obsoleteIds.Initialize";
_obsoleteids.Initialize();
RDebugUtils.currentLine=49020944;
 //BA.debugLineNum = 49020944;BA.debugLine="For Each playlistId As String In cachedPlaylistIn";
{
final anywheresoftware.b4a.BA.IterableList group16 = _cachedplaylistindex.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_playlistid = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=49020945;
 //BA.debugLineNum = 49020945;BA.debugLine="If actualIds.ContainsKey(playlistId) = False The";
if (_actualids.ContainsKey((Object)(_playlistid))==__c.False) { 
_obsoleteids.Add((Object)(_playlistid));};
 }
};
RDebugUtils.currentLine=49020947;
 //BA.debugLineNum = 49020947;BA.debugLine="For Each playlistId As String In obsoleteIds";
{
final anywheresoftware.b4a.BA.IterableList group19 = _obsoleteids;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistid = BA.ObjectToString(group19.Get(index19));
RDebugUtils.currentLine=49020948;
 //BA.debugLineNum = 49020948;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))) { 
RDebugUtils.currentLine=49020949;
 //BA.debugLineNum = 49020949;BA.debugLine="File.Delete(GetOfflinePlaylistsDir, PlaylistMet";
__c.File.Delete(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid));
 };
RDebugUtils.currentLine=49020951;
 //BA.debugLineNum = 49020951;BA.debugLine="InvalidatePlaylistPlaybackOrder(playlistId)";
__ref._invalidateplaylistplaybackorder /*String*/ (null,_playlistid);
RDebugUtils.currentLine=49020952;
 //BA.debugLineNum = 49020952;BA.debugLine="cachedPlaylistIndex.Remove(playlistId)";
_cachedplaylistindex.Remove((Object)(_playlistid));
RDebugUtils.currentLine=49020953;
 //BA.debugLineNum = 49020953;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
 }
};
RDebugUtils.currentLine=49020955;
 //BA.debugLineNum = 49020955;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=49020956;
 //BA.debugLineNum = 49020956;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayl";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
RDebugUtils.currentLine=49020957;
 //BA.debugLineNum = 49020957;BA.debugLine="Trace(\"playlist metadata cleanup done removed=\"";
__ref._trace /*String*/ (null,"playlist metadata cleanup done removed="+BA.NumberToString(_removedcount));
 };
RDebugUtils.currentLine=49020959;
 //BA.debugLineNum = 49020959;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=49348608;
 //BA.debugLineNum = 49348608;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49348610;
 //BA.debugLineNum = 49348610;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=49348611;
 //BA.debugLineNum = 49348611;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=49348612;
 //BA.debugLineNum = 49348612;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadatafilename(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Public Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="End Sub";
return "";
}
public String  _invalidateplaylistplaybackorder(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "invalidateplaylistplaybackorder", false))
	 {return ((String) Debug.delegate(ba, "invalidateplaylistplaybackorder", new Object[] {_playlistid}));}
RDebugUtils.currentLine=48889856;
 //BA.debugLineNum = 48889856;BA.debugLine="Private Sub InvalidatePlaylistPlaybackOrder(playli";
RDebugUtils.currentLine=48889857;
 //BA.debugLineNum = 48889857;BA.debugLine="If playlistId = \"\" Then Return";
if ((_playlistid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=48889858;
 //BA.debugLineNum = 48889858;BA.debugLine="storage.Remove(\"playlist_playback_manifest_\" & pl";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,"playlist_playback_manifest_"+_playlistid);
RDebugUtils.currentLine=48889859;
 //BA.debugLineNum = 48889859;BA.debugLine="storage.Remove(\"playlist_playback_cursor_\" & play";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,"playlist_playback_cursor_"+_playlistid);
RDebugUtils.currentLine=48889860;
 //BA.debugLineNum = 48889860;BA.debugLine="storage.Remove(\"playlist_track_index_\" & playlist";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,"playlist_track_index_"+_playlistid);
RDebugUtils.currentLine=48889861;
 //BA.debugLineNum = 48889861;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.offlinestore __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=49479680;
 //BA.debugLineNum = 49479680;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=49479681;
 //BA.debugLineNum = 49479681;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=49479682;
 //BA.debugLineNum = 49479682;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=49479684;
 //BA.debugLineNum = 49479684;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _compareofflineplaylistswithcache(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _descriptors) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "compareofflineplaylistswithcache", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "compareofflineplaylistswithcache", new Object[] {_descriptors}));}
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
RDebugUtils.currentLine=48824320;
 //BA.debugLineNum = 48824320;BA.debugLine="Private Sub CompareOfflinePlaylistsWithCache(descr";
RDebugUtils.currentLine=48824321;
 //BA.debugLineNum = 48824321;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=48824322;
 //BA.debugLineNum = 48824322;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=48824323;
 //BA.debugLineNum = 48824323;BA.debugLine="Dim downloadIds As List";
_downloadids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=48824324;
 //BA.debugLineNum = 48824324;BA.debugLine="downloadIds.Initialize";
_downloadids.Initialize();
RDebugUtils.currentLine=48824325;
 //BA.debugLineNum = 48824325;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=48824326;
 //BA.debugLineNum = 48824326;BA.debugLine="Dim missingCount As Int = 0";
_missingcount = (int) (0);
RDebugUtils.currentLine=48824327;
 //BA.debugLineNum = 48824327;BA.debugLine="Dim outdatedCount As Int = 0";
_outdatedcount = (int) (0);
RDebugUtils.currentLine=48824328;
 //BA.debugLineNum = 48824328;BA.debugLine="Dim actualCount As Int = 0";
_actualcount = (int) (0);
RDebugUtils.currentLine=48824329;
 //BA.debugLineNum = 48824329;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group9 = _descriptors;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_descriptorobject = group9.Get(index9);
RDebugUtils.currentLine=48824330;
 //BA.debugLineNum = 48824330;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48824331;
 //BA.debugLineNum = 48824331;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=48824332;
 //BA.debugLineNum = 48824332;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=48824333;
 //BA.debugLineNum = 48824333;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=48824334;
 //BA.debugLineNum = 48824334;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId)";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=48824335;
 //BA.debugLineNum = 48824335;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=48824336;
 //BA.debugLineNum = 48824336;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
RDebugUtils.currentLine=48824337;
 //BA.debugLineNum = 48824337;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=48824339;
 //BA.debugLineNum = 48824339;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylis";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=48824340;
 //BA.debugLineNum = 48824340;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48824341;
 //BA.debugLineNum = 48824341;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=48824342;
 //BA.debugLineNum = 48824342;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> de";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
RDebugUtils.currentLine=48824343;
 //BA.debugLineNum = 48824343;BA.debugLine="outdatedCount = outdatedCount + 1";
_outdatedcount = (int) (_outdatedcount+1);
RDebugUtils.currentLine=48824344;
 //BA.debugLineNum = 48824344;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 }else {
RDebugUtils.currentLine=48824346;
 //BA.debugLineNum = 48824346;BA.debugLine="actualCount = actualCount + 1";
_actualcount = (int) (_actualcount+1);
 };
 }else {
RDebugUtils.currentLine=48824349;
 //BA.debugLineNum = 48824349;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=48824350;
 //BA.debugLineNum = 48824350;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 };
 };
 }
};
RDebugUtils.currentLine=48824354;
 //BA.debugLineNum = 48824354;BA.debugLine="result.Put(\"DownloadIds\", downloadIds)";
_result.Put((Object)("DownloadIds"),(Object)(_downloadids.getObject()));
RDebugUtils.currentLine=48824355;
 //BA.debugLineNum = 48824355;BA.debugLine="result.Put(\"MissingCount\", missingCount)";
_result.Put((Object)("MissingCount"),(Object)(_missingcount));
RDebugUtils.currentLine=48824356;
 //BA.debugLineNum = 48824356;BA.debugLine="result.Put(\"OutdatedCount\", outdatedCount)";
_result.Put((Object)("OutdatedCount"),(Object)(_outdatedcount));
RDebugUtils.currentLine=48824357;
 //BA.debugLineNum = 48824357;BA.debugLine="result.Put(\"ActualCount\", actualCount)";
_result.Put((Object)("ActualCount"),(Object)(_actualcount));
RDebugUtils.currentLine=48824358;
 //BA.debugLineNum = 48824358;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=48824359;
 //BA.debugLineNum = 48824359;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=49414144;
 //BA.debugLineNum = 49414144;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=49414145;
 //BA.debugLineNum = 49414145;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49414146;
 //BA.debugLineNum = 49414146;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=49414147;
 //BA.debugLineNum = 49414147;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=49414148;
 //BA.debugLineNum = 49414148;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.offlinestore __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=49283072;
 //BA.debugLineNum = 49283072;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=49283073;
 //BA.debugLineNum = 49283073;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=49283074;
 //BA.debugLineNum = 49283074;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=49283075;
 //BA.debugLineNum = 49283075;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=49283076;
 //BA.debugLineNum = 49283076;BA.debugLine="End Sub";
return "";
}
public int  _getofflineadscount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineadscount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineadscount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _ads = null;
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Private Sub GetOfflineAdsCount(data As Map) As Int";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=48627714;
 //BA.debugLineNum = 48627714;BA.debugLine="Dim ads As List = data.GetDefault(\"ads\", Null)";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("ads"),__c.Null)));
RDebugUtils.currentLine=48627715;
 //BA.debugLineNum = 48627715;BA.debugLine="If ads.IsInitialized = False Then Return 0";
if (_ads.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=48627716;
 //BA.debugLineNum = 48627716;BA.debugLine="Return ads.Size";
if (true) return _ads.getSize();
RDebugUtils.currentLine=48627717;
 //BA.debugLineNum = 48627717;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getofflineplaylistids(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineplaylistids", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getofflineplaylistids", new Object[] {_data}));}
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
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Private Sub GetOfflinePlaylistIds(data As Map) As";
RDebugUtils.currentLine=48562177;
 //BA.debugLineNum = 48562177;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
RDebugUtils.currentLine=48562179;
 //BA.debugLineNum = 48562179;BA.debugLine="If data.IsInitialized = False Then Return playlis";
if (_data.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=48562180;
 //BA.debugLineNum = 48562180;BA.debugLine="Dim uniqueIds As Map";
_uniqueids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=48562181;
 //BA.debugLineNum = 48562181;BA.debugLine="uniqueIds.Initialize";
_uniqueids.Initialize();
RDebugUtils.currentLine=48562182;
 //BA.debugLineNum = 48562182;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=48562183;
 //BA.debugLineNum = 48562183;BA.debugLine="If schedules.IsInitialized = False Then Return pl";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=48562184;
 //BA.debugLineNum = 48562184;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=48562185;
 //BA.debugLineNum = 48562185;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48562186;
 //BA.debugLineNum = 48562186;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=48562187;
 //BA.debugLineNum = 48562187;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=48562188;
 //BA.debugLineNum = 48562188;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=48562189;
 //BA.debugLineNum = 48562189;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group13 = _slots;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_slotobject = group13.Get(index13);
RDebugUtils.currentLine=48562190;
 //BA.debugLineNum = 48562190;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48562191;
 //BA.debugLineNum = 48562191;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=48562192;
 //BA.debugLineNum = 48562192;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=48562193;
 //BA.debugLineNum = 48562193;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=48562194;
 //BA.debugLineNum = 48562194;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=48562195;
 //BA.debugLineNum = 48562195;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group19 = _playlists;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistobject = group19.Get(index19);
RDebugUtils.currentLine=48562196;
 //BA.debugLineNum = 48562196;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=48562197;
 //BA.debugLineNum = 48562197;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=48562198;
 //BA.debugLineNum = 48562198;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=48562199;
 //BA.debugLineNum = 48562199;BA.debugLine="If playlistId <> \"\" And uniqueIds.ContainsK";
if ((_playlistid).equals("") == false && _uniqueids.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=48562200;
 //BA.debugLineNum = 48562200;BA.debugLine="uniqueIds.Put(playlistId, True)";
_uniqueids.Put((Object)(_playlistid),(Object)(__c.True));
RDebugUtils.currentLine=48562201;
 //BA.debugLineNum = 48562201;BA.debugLine="playlistIds.Add(playlistId)";
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
RDebugUtils.currentLine=48562209;
 //BA.debugLineNum = 48562209;BA.debugLine="Return playlistIds";
if (true) return _playlistids;
RDebugUtils.currentLine=48562210;
 //BA.debugLineNum = 48562210;BA.debugLine="End Sub";
return null;
}
public int  _getofflineschedulescount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineschedulescount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineschedulescount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _schedules = null;
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Private Sub GetOfflineSchedulesCount(data As Map)";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=48693251;
 //BA.debugLineNum = 48693251;BA.debugLine="If schedules.IsInitialized = False Then Return 0";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=48693252;
 //BA.debugLineNum = 48693252;BA.debugLine="Return schedules.Size";
if (true) return _schedules.getSize();
RDebugUtils.currentLine=48693253;
 //BA.debugLineNum = 48693253;BA.debugLine="End Sub";
return 0;
}
public int  _getplaylisttrackcount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getplaylisttrackcount", false))
	 {return ((Integer) Debug.delegate(ba, "getplaylisttrackcount", new Object[] {_playlistdata}));}
anywheresoftware.b4a.objects.collections.List _tracks = null;
RDebugUtils.currentLine=49152000;
 //BA.debugLineNum = 49152000;BA.debugLine="Private Sub GetPlaylistTrackCount(playlistData As";
RDebugUtils.currentLine=49152001;
 //BA.debugLineNum = 49152001;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=49152002;
 //BA.debugLineNum = 49152002;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=49152003;
 //BA.debugLineNum = 49152003;BA.debugLine="If tracks.IsInitialized = False Then Return 0";
if (_tracks.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=49152004;
 //BA.debugLineNum = 49152004;BA.debugLine="Return tracks.Size";
if (true) return _tracks.getSize();
RDebugUtils.currentLine=49152005;
 //BA.debugLineNum = 49152005;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflinedata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _sourcedata,String _playercode,String _deviceid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflinedata", new Object[] {_sourcedata,_playercode,_deviceid}));}
anywheresoftware.b4a.objects.collections.Map _normalizeddata = null;
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Private Sub NormalizeOfflineData(sourceData As Map";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="Dim normalizedData As Map";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="normalizedData.Initialize";
_normalizeddata.Initialize();
RDebugUtils.currentLine=48496643;
 //BA.debugLineNum = 48496643;BA.debugLine="normalizedData.Put(\"ok\", sourceData.GetDefault(\"o";
_normalizeddata.Put((Object)("ok"),_sourcedata.GetDefault((Object)("ok"),(Object)(__c.False)));
RDebugUtils.currentLine=48496644;
 //BA.debugLineNum = 48496644;BA.debugLine="normalizedData.Put(\"type\", sourceData.GetDefault(";
_normalizeddata.Put((Object)("type"),_sourcedata.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=48496645;
 //BA.debugLineNum = 48496645;BA.debugLine="normalizedData.Put(\"updated\", sourceData.GetDefau";
_normalizeddata.Put((Object)("updated"),_sourcedata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=48496646;
 //BA.debugLineNum = 48496646;BA.debugLine="normalizedData.Put(\"saved_at\", DateTime.Now)";
_normalizeddata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=48496647;
 //BA.debugLineNum = 48496647;BA.debugLine="normalizedData.Put(\"player_code\", playerCode)";
_normalizeddata.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=48496648;
 //BA.debugLineNum = 48496648;BA.debugLine="normalizedData.Put(\"device_id\", deviceId)";
_normalizeddata.Put((Object)("device_id"),(Object)(_deviceid));
RDebugUtils.currentLine=48496649;
 //BA.debugLineNum = 48496649;BA.debugLine="If sourceData.ContainsKey(\"player\") Then normaliz";
if (_sourcedata.ContainsKey((Object)("player"))) { 
_normalizeddata.Put((Object)("player"),_sourcedata.Get((Object)("player")));};
RDebugUtils.currentLine=48496650;
 //BA.debugLineNum = 48496650;BA.debugLine="If sourceData.ContainsKey(\"ads\") Then normalizedD";
if (_sourcedata.ContainsKey((Object)("ads"))) { 
_normalizeddata.Put((Object)("ads"),_sourcedata.Get((Object)("ads")));};
RDebugUtils.currentLine=48496651;
 //BA.debugLineNum = 48496651;BA.debugLine="If sourceData.ContainsKey(\"schedules\") Then norma";
if (_sourcedata.ContainsKey((Object)("schedules"))) { 
_normalizeddata.Put((Object)("schedules"),_sourcedata.Get((Object)("schedules")));};
RDebugUtils.currentLine=48496652;
 //BA.debugLineNum = 48496652;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=48496653;
 //BA.debugLineNum = 48496653;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflineplaylistdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflineplaylistdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflineplaylistdata", new Object[] {_descriptor,_playlistdata}));}
anywheresoftware.b4a.objects.collections.Map _normalizedplaylistdata = null;
String _key = "";
RDebugUtils.currentLine=49086464;
 //BA.debugLineNum = 49086464;BA.debugLine="Private Sub NormalizeOfflinePlaylistData(descripto";
RDebugUtils.currentLine=49086465;
 //BA.debugLineNum = 49086465;BA.debugLine="Dim normalizedPlaylistData As Map";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49086466;
 //BA.debugLineNum = 49086466;BA.debugLine="normalizedPlaylistData.Initialize";
_normalizedplaylistdata.Initialize();
RDebugUtils.currentLine=49086467;
 //BA.debugLineNum = 49086467;BA.debugLine="For Each key As String In playlistData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _playlistdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=49086468;
 //BA.debugLineNum = 49086468;BA.debugLine="normalizedPlaylistData.Put(key, playlistData.Get";
_normalizedplaylistdata.Put((Object)(_key),_playlistdata.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=49086470;
 //BA.debugLineNum = 49086470;BA.debugLine="normalizedPlaylistData.Put(\"id\", descriptor.GetDe";
_normalizedplaylistdata.Put((Object)("id"),_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=49086471;
 //BA.debugLineNum = 49086471;BA.debugLine="normalizedPlaylistData.Put(\"required_updated\", de";
_normalizedplaylistdata.Put((Object)("required_updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=49086472;
 //BA.debugLineNum = 49086472;BA.debugLine="normalizedPlaylistData.Put(\"saved_at\", DateTime.N";
_normalizedplaylistdata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=49086473;
 //BA.debugLineNum = 49086473;BA.debugLine="Return normalizedPlaylistData";
if (true) return _normalizedplaylistdata;
RDebugUtils.currentLine=49086474;
 //BA.debugLineNum = 49086474;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _saveofflinedata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _sourcedata,String _playercode,String _deviceid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "saveofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "saveofflinedata", new Object[] {_sourcedata,_playercode,_deviceid}));}
anywheresoftware.b4a.objects.collections.Map _normalizeddata = null;
long _offlinedataupdatedat = 0L;
anywheresoftware.b4a.objects.collections.List _playlistids = null;
anywheresoftware.b4a.objects.collections.List _playlistdescriptors = null;
anywheresoftware.b4a.objects.collections.Map _playlistcachestatus = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _generator = null;
RDebugUtils.currentLine=47841280;
 //BA.debugLineNum = 47841280;BA.debugLine="Public Sub SaveOfflineData(sourceData As Map, play";
RDebugUtils.currentLine=47841281;
 //BA.debugLineNum = 47841281;BA.debugLine="Dim normalizedData As Map = NormalizeOfflineData(";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
_normalizeddata = __ref._normalizeofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sourcedata,_playercode,_deviceid);
RDebugUtils.currentLine=47841282;
 //BA.debugLineNum = 47841282;BA.debugLine="Dim offlineDataUpdatedAt As Long = DateTime.Now";
_offlinedataupdatedat = __c.DateTime.getNow();
RDebugUtils.currentLine=47841283;
 //BA.debugLineNum = 47841283;BA.debugLine="storage.Put(\"player_data_updated_at\", offlineData";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"player_data_updated_at",(Object)(_offlinedataupdatedat));
RDebugUtils.currentLine=47841284;
 //BA.debugLineNum = 47841284;BA.debugLine="storage.Put(\"player_data_source_updated\", normali";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"player_data_source_updated",_normalizeddata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=47841285;
 //BA.debugLineNum = 47841285;BA.debugLine="Dim playlistIds As List = GetOfflinePlaylistIds(n";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
_playlistids = __ref._getofflineplaylistids /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=47841286;
 //BA.debugLineNum = 47841286;BA.debugLine="Dim playlistDescriptors As List = BuildOfflinePla";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = __ref._buildofflineplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=47841287;
 //BA.debugLineNum = 47841287;BA.debugLine="Dim playlistCacheStatus As Map = CompareOfflinePl";
_playlistcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_playlistcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=47841288;
 //BA.debugLineNum = 47841288;BA.debugLine="storage.Put(\"playlist_ids\", playlistIds)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_ids",(Object)(_playlistids.getObject()));
RDebugUtils.currentLine=47841289;
 //BA.debugLineNum = 47841289;BA.debugLine="storage.Put(\"playlist_descriptors\", playlistDescr";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_descriptors",(Object)(_playlistdescriptors.getObject()));
RDebugUtils.currentLine=47841290;
 //BA.debugLineNum = 47841290;BA.debugLine="storage.Put(\"playlist_download_ids\", playlistCach";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_download_ids",_playlistcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=47841291;
 //BA.debugLineNum = 47841291;BA.debugLine="storage.Put(\"playlist_missing_count\", playlistCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_missing_count",_playlistcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=47841292;
 //BA.debugLineNum = 47841292;BA.debugLine="storage.Put(\"playlist_outdated_count\", playlistCa";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_outdated_count",_playlistcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=47841293;
 //BA.debugLineNum = 47841293;BA.debugLine="storage.Put(\"playlist_actual_count\", playlistCach";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_actual_count",_playlistcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=47841294;
 //BA.debugLineNum = 47841294;BA.debugLine="storage.Put(\"ad_count\", GetOfflineAdsCount(normal";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"ad_count",(Object)(__ref._getofflineadscount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=47841295;
 //BA.debugLineNum = 47841295;BA.debugLine="storage.Put(\"schedule_count\", GetOfflineSchedules";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"schedule_count",(Object)(__ref._getofflineschedulescount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=47841296;
 //BA.debugLineNum = 47841296;BA.debugLine="CleanupObsoletePlaylistMetadata(playlistDescripto";
__ref._cleanupobsoleteplaylistmetadata /*String*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=47841297;
 //BA.debugLineNum = 47841297;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=47841298;
 //BA.debugLineNum = 47841298;BA.debugLine="generator.Initialize(normalizedData)";
_generator.Initialize(_normalizeddata);
RDebugUtils.currentLine=47841299;
 //BA.debugLineNum = 47841299;BA.debugLine="File.WriteString(storageDir, playerDataFileName,";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=47841300;
 //BA.debugLineNum = 47841300;BA.debugLine="WriteOfflinePlaylistRequirementsFile(playlistDesc";
__ref._writeofflineplaylistrequirementsfile /*String*/ (null,_playlistdescriptors,_playercode);
RDebugUtils.currentLine=47841301;
 //BA.debugLineNum = 47841301;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=47841302;
 //BA.debugLineNum = 47841302;BA.debugLine="End Sub";
return null;
}
public String  _writeofflineplaylistrequirementsfile(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _descriptors,String _playercode) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "writeofflineplaylistrequirementsfile", false))
	 {return ((String) Debug.delegate(ba, "writeofflineplaylistrequirementsfile", new Object[] {_descriptors,_playercode}));}
anywheresoftware.b4a.objects.collections.Map _payload = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _generator = null;
RDebugUtils.currentLine=48955392;
 //BA.debugLineNum = 48955392;BA.debugLine="Private Sub WriteOfflinePlaylistRequirementsFile(d";
RDebugUtils.currentLine=48955393;
 //BA.debugLineNum = 48955393;BA.debugLine="Dim payload As Map";
_payload = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=48955394;
 //BA.debugLineNum = 48955394;BA.debugLine="payload.Initialize";
_payload.Initialize();
RDebugUtils.currentLine=48955395;
 //BA.debugLineNum = 48955395;BA.debugLine="payload.Put(\"saved_at\", DateTime.Now)";
_payload.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=48955396;
 //BA.debugLineNum = 48955396;BA.debugLine="payload.Put(\"player_code\", playerCode)";
_payload.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=48955397;
 //BA.debugLineNum = 48955397;BA.debugLine="payload.Put(\"descriptors\", descriptors)";
_payload.Put((Object)("descriptors"),(Object)(_descriptors.getObject()));
RDebugUtils.currentLine=48955398;
 //BA.debugLineNum = 48955398;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=48955399;
 //BA.debugLineNum = 48955399;BA.debugLine="generator.Initialize(payload)";
_generator.Initialize(_payload);
RDebugUtils.currentLine=48955400;
 //BA.debugLineNum = 48955400;BA.debugLine="File.WriteString(storageDir, playlistRequirements";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._playlistrequirementsfilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=48955401;
 //BA.debugLineNum = 48955401;BA.debugLine="End Sub";
return "";
}
}