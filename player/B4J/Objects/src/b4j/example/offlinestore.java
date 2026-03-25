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
RDebugUtils.currentLine=40828928;
 //BA.debugLineNum = 40828928;BA.debugLine="Public Sub GetStoredPlaylistDescriptors As List";
RDebugUtils.currentLine=40828929;
 //BA.debugLineNum = 40828929;BA.debugLine="Return storage.GetDefault(\"playlist_descriptors\",";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"playlist_descriptors",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=40828930;
 //BA.debugLineNum = 40828930;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadataurl(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadataurl", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadataurl", new Object[] {_playlistid}));}
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Public Sub PlaylistMetadataUrl(playlistId As Strin";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="Return playlistCdnBaseUrl & playlistId & \".json\"";
if (true) return __ref._playlistcdnbaseurl /*String*/ +_playlistid+".json";
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Public Sub SavePlaylistMetadata(descriptor As Map,";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="EnsureDirectory(GetOfflinePlaylistsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getofflineplaylistsdir /*String*/ (null));
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="Dim normalizedPlaylistData As Map = NormalizeOffl";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
_normalizedplaylistdata = __ref._normalizeofflineplaylistdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_descriptor,_playlistdata);
RDebugUtils.currentLine=41156612;
 //BA.debugLineNum = 41156612;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=41156613;
 //BA.debugLineNum = 41156613;BA.debugLine="generator.Initialize(normalizedPlaylistData)";
_generator.Initialize(_normalizedplaylistdata);
RDebugUtils.currentLine=41156614;
 //BA.debugLineNum = 41156614;BA.debugLine="File.WriteString(GetOfflinePlaylistsDir, Playlist";
__c.File.WriteString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid),_generator.ToString());
RDebugUtils.currentLine=41156615;
 //BA.debugLineNum = 41156615;BA.debugLine="Dim cachedEntry As Map";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41156616;
 //BA.debugLineNum = 41156616;BA.debugLine="cachedEntry.Initialize";
_cachedentry.Initialize();
RDebugUtils.currentLine=41156617;
 //BA.debugLineNum = 41156617;BA.debugLine="cachedEntry.Put(\"id\", playlistId)";
_cachedentry.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=41156618;
 //BA.debugLineNum = 41156618;BA.debugLine="cachedEntry.Put(\"updated\", descriptor.GetDefault(";
_cachedentry.Put((Object)("updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=41156619;
 //BA.debugLineNum = 41156619;BA.debugLine="cachedEntry.Put(\"saved_at\", DateTime.Now)";
_cachedentry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=41156620;
 //BA.debugLineNum = 41156620;BA.debugLine="cachedEntry.Put(\"title\", descriptor.GetDefault(\"t";
_cachedentry.Put((Object)("title"),_descriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=41156621;
 //BA.debugLineNum = 41156621;BA.debugLine="cachedEntry.Put(\"track_count\", GetPlaylistTrackCo";
_cachedentry.Put((Object)("track_count"),(Object)(__ref._getplaylisttrackcount /*int*/ (null,_normalizedplaylistdata)));
RDebugUtils.currentLine=41156622;
 //BA.debugLineNum = 41156622;BA.debugLine="cachedPlaylistIndex.Put(playlistId, cachedEntry)";
_cachedplaylistindex.Put((Object)(_playlistid),(Object)(_cachedentry.getObject()));
RDebugUtils.currentLine=41156623;
 //BA.debugLineNum = 41156623;BA.debugLine="InvalidatePlaylistPlaybackOrder(playlistId)";
__ref._invalidateplaylistplaybackorder /*String*/ (null,_playlistid);
RDebugUtils.currentLine=41156624;
 //BA.debugLineNum = 41156624;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.offlinestore __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4j.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _playerdatafilenamevalue,String _playlistrequirementsfilenamevalue,String _playlistsdirnamevalue,String _playlistcdnbaseurlvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_storagevalue,_targetmodulevalue,_tracesubnamevalue,_playerdatafilenamevalue,_playlistrequirementsfilenamevalue,_playlistsdirnamevalue,_playlistcdnbaseurlvalue}));}
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="storage = storageValue";
__ref._storage /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=40632323;
 //BA.debugLineNum = 40632323;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=40632324;
 //BA.debugLineNum = 40632324;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=40632325;
 //BA.debugLineNum = 40632325;BA.debugLine="playerDataFileName = playerDataFileNameValue";
__ref._playerdatafilename /*String*/  = _playerdatafilenamevalue;
RDebugUtils.currentLine=40632326;
 //BA.debugLineNum = 40632326;BA.debugLine="playlistRequirementsFileName = playlistRequiremen";
__ref._playlistrequirementsfilename /*String*/  = _playlistrequirementsfilenamevalue;
RDebugUtils.currentLine=40632327;
 //BA.debugLineNum = 40632327;BA.debugLine="playlistsDirName = playlistsDirNameValue";
__ref._playlistsdirname /*String*/  = _playlistsdirnamevalue;
RDebugUtils.currentLine=40632328;
 //BA.debugLineNum = 40632328;BA.debugLine="playlistCdnBaseUrl = playlistCdnBaseUrlValue";
__ref._playlistcdnbaseurl /*String*/  = _playlistcdnbaseurlvalue;
RDebugUtils.currentLine=40632329;
 //BA.debugLineNum = 40632329;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Public Sub LoadOfflineData As Map";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=40697859;
 //BA.debugLineNum = 40697859;BA.debugLine="If File.Exists(storageDir, playerDataFileName) =";
if (__c.File.Exists(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ )==__c.False) { 
if (true) return _data;};
RDebugUtils.currentLine=40697860;
 //BA.debugLineNum = 40697860;BA.debugLine="Try";
try {RDebugUtils.currentLine=40697861;
 //BA.debugLineNum = 40697861;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=40697862;
 //BA.debugLineNum = 40697862;BA.debugLine="parser.Initialize(File.ReadString(storageDir, pl";
_parser.Initialize(__c.File.ReadString(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ ));
RDebugUtils.currentLine=40697863;
 //BA.debugLineNum = 40697863;BA.debugLine="Dim parsed As Map = parser.NextObject";
_parsed = new anywheresoftware.b4a.objects.collections.Map();
_parsed = _parser.NextObject();
RDebugUtils.currentLine=40697864;
 //BA.debugLineNum = 40697864;BA.debugLine="If parsed.IsInitialized Then";
if (_parsed.IsInitialized()) { 
RDebugUtils.currentLine=40697865;
 //BA.debugLineNum = 40697865;BA.debugLine="data = parsed";
_data = _parsed;
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=40697868;
 //BA.debugLineNum = 40697868;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=40697869;
 //BA.debugLineNum = 40697869;BA.debugLine="Trace(\"данные плеера load ошибка message=\" & Las";
__ref._trace /*String*/ (null,"данные плеера load ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=40697871;
 //BA.debugLineNum = 40697871;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=40697872;
 //BA.debugLineNum = 40697872;BA.debugLine="End Sub";
return null;
}
public String  _getofflineplaylistsdir(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Public Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="Return File.Combine(storageDir, playlistsDirName)";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,__ref._playlistsdirname /*String*/ );
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedplaylistindex(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getcachedplaylistindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedplaylistindex", null));}
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Public Sub GetCachedPlaylistIndex As Map";
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="Return storage.GetDefault(\"cached_playlist_index\"";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Public Sub ResolvePlaylistSyncAction(descriptor As";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="If playlistId = \"\" Then Return \"skip\"";
if ((_playlistid).equals("")) { 
if (true) return "skip";};
RDebugUtils.currentLine=41091075;
 //BA.debugLineNum = 41091075;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId) =";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=41091076;
 //BA.debugLineNum = 41091076;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylistI";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=41091077;
 //BA.debugLineNum = 41091077;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=41091078;
 //BA.debugLineNum = 41091078;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=41091079;
 //BA.debugLineNum = 41091079;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> desc";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
if (true) return "outdated";};
RDebugUtils.currentLine=41091080;
 //BA.debugLineNum = 41091080;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=41091081;
 //BA.debugLineNum = 41091081;BA.debugLine="Return \"skip\"";
if (true) return "skip";
 };
RDebugUtils.currentLine=41091083;
 //BA.debugLineNum = 41091083;BA.debugLine="Return \"missing\"";
if (true) return "missing";
RDebugUtils.currentLine=41091084;
 //BA.debugLineNum = 41091084;BA.debugLine="End Sub";
return "";
}
public String  _savecachedplaylistindex(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "savecachedplaylistindex", false))
	 {return ((String) Debug.delegate(ba, "savecachedplaylistindex", new Object[] {_cachedplaylistindex}));}
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Public Sub SaveCachedPlaylistIndex(cachedPlaylistI";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayli";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="End Sub";
return "";
}
public String  _refreshplaylistcachestatus(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _playlistdescriptors) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "refreshplaylistcachestatus", false))
	 {return ((String) Debug.delegate(ba, "refreshplaylistcachestatus", new Object[] {_playlistdescriptors}));}
anywheresoftware.b4a.objects.collections.Map _refreshedcachestatus = null;
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Public Sub RefreshPlaylistCacheStatus(playlistDesc";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="Dim refreshedCacheStatus As Map = CompareOfflineP";
_refreshedcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_refreshedcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="storage.Put(\"playlist_download_ids\", refreshedCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_download_ids",_refreshedcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=41025539;
 //BA.debugLineNum = 41025539;BA.debugLine="storage.Put(\"playlist_missing_count\", refreshedCa";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_missing_count",_refreshedcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=41025540;
 //BA.debugLineNum = 41025540;BA.debugLine="storage.Put(\"playlist_outdated_count\", refreshedC";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_outdated_count",_refreshedcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=41025541;
 //BA.debugLineNum = 41025541;BA.debugLine="storage.Put(\"playlist_actual_count\", refreshedCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_actual_count",_refreshedcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=41025542;
 //BA.debugLineNum = 41025542;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Public Sub SaveOfflineData(sourceData As Map, play";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="Dim normalizedData As Map = NormalizeOfflineData(";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
_normalizeddata = __ref._normalizeofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sourcedata,_playercode,_deviceid);
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="Dim offlineDataUpdatedAt As Long = DateTime.Now";
_offlinedataupdatedat = __c.DateTime.getNow();
RDebugUtils.currentLine=40763395;
 //BA.debugLineNum = 40763395;BA.debugLine="storage.Put(\"player_data_updated_at\", offlineData";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"player_data_updated_at",(Object)(_offlinedataupdatedat));
RDebugUtils.currentLine=40763396;
 //BA.debugLineNum = 40763396;BA.debugLine="storage.Put(\"player_data_source_updated\", normali";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"player_data_source_updated",_normalizeddata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=40763397;
 //BA.debugLineNum = 40763397;BA.debugLine="Dim playlistIds As List = GetOfflinePlaylistIds(n";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
_playlistids = __ref._getofflineplaylistids /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=40763398;
 //BA.debugLineNum = 40763398;BA.debugLine="Dim playlistDescriptors As List = BuildOfflinePla";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = __ref._buildofflineplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=40763399;
 //BA.debugLineNum = 40763399;BA.debugLine="Dim playlistCacheStatus As Map = CompareOfflinePl";
_playlistcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_playlistcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=40763400;
 //BA.debugLineNum = 40763400;BA.debugLine="storage.Put(\"playlist_ids\", playlistIds)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_ids",(Object)(_playlistids.getObject()));
RDebugUtils.currentLine=40763401;
 //BA.debugLineNum = 40763401;BA.debugLine="storage.Put(\"playlist_descriptors\", playlistDescr";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_descriptors",(Object)(_playlistdescriptors.getObject()));
RDebugUtils.currentLine=40763402;
 //BA.debugLineNum = 40763402;BA.debugLine="storage.Put(\"playlist_download_ids\", playlistCach";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_download_ids",_playlistcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=40763403;
 //BA.debugLineNum = 40763403;BA.debugLine="storage.Put(\"playlist_missing_count\", playlistCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_missing_count",_playlistcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=40763404;
 //BA.debugLineNum = 40763404;BA.debugLine="storage.Put(\"playlist_outdated_count\", playlistCa";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_outdated_count",_playlistcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=40763405;
 //BA.debugLineNum = 40763405;BA.debugLine="storage.Put(\"playlist_actual_count\", playlistCach";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_actual_count",_playlistcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=40763406;
 //BA.debugLineNum = 40763406;BA.debugLine="storage.Put(\"ad_count\", GetOfflineAdsCount(normal";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"ad_count",(Object)(__ref._getofflineadscount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=40763407;
 //BA.debugLineNum = 40763407;BA.debugLine="storage.Put(\"schedule_count\", GetOfflineSchedules";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"schedule_count",(Object)(__ref._getofflineschedulescount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=40763408;
 //BA.debugLineNum = 40763408;BA.debugLine="CleanupObsoletePlaylistMetadata(playlistDescripto";
__ref._cleanupobsoleteplaylistmetadata /*String*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=40763409;
 //BA.debugLineNum = 40763409;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=40763410;
 //BA.debugLineNum = 40763410;BA.debugLine="generator.Initialize(normalizedData)";
_generator.Initialize(_normalizeddata);
RDebugUtils.currentLine=40763411;
 //BA.debugLineNum = 40763411;BA.debugLine="File.WriteString(storageDir, playerDataFileName,";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=40763412;
 //BA.debugLineNum = 40763412;BA.debugLine="WriteOfflinePlaylistRequirementsFile(playlistDesc";
__ref._writeofflineplaylistrequirementsfile /*String*/ (null,_playlistdescriptors,_playercode);
RDebugUtils.currentLine=40763413;
 //BA.debugLineNum = 40763413;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=40763414;
 //BA.debugLineNum = 40763414;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Private Sub BuildOfflinePlaylistDescriptors(data A";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="Dim descriptors As List";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="descriptors.Initialize";
_descriptors.Initialize();
RDebugUtils.currentLine=41680899;
 //BA.debugLineNum = 41680899;BA.debugLine="If data.IsInitialized = False Then Return descrip";
if (_data.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=41680900;
 //BA.debugLineNum = 41680900;BA.debugLine="Dim uniqueDescriptors As Map";
_uniquedescriptors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41680901;
 //BA.debugLineNum = 41680901;BA.debugLine="uniqueDescriptors.Initialize";
_uniquedescriptors.Initialize();
RDebugUtils.currentLine=41680902;
 //BA.debugLineNum = 41680902;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=41680903;
 //BA.debugLineNum = 41680903;BA.debugLine="If schedules.IsInitialized = False Then Return de";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=41680904;
 //BA.debugLineNum = 41680904;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=41680905;
 //BA.debugLineNum = 41680905;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=41680906;
 //BA.debugLineNum = 41680906;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=41680907;
 //BA.debugLineNum = 41680907;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=41680908;
 //BA.debugLineNum = 41680908;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=41680909;
 //BA.debugLineNum = 41680909;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=41680910;
 //BA.debugLineNum = 41680910;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group14 = _slots;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_slotobject = group14.Get(index14);
RDebugUtils.currentLine=41680911;
 //BA.debugLineNum = 41680911;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=41680912;
 //BA.debugLineNum = 41680912;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=41680913;
 //BA.debugLineNum = 41680913;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=41680914;
 //BA.debugLineNum = 41680914;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=41680915;
 //BA.debugLineNum = 41680915;BA.debugLine="Dim streamId As String = streamData.GetDefaul";
_streamid = BA.ObjectToString(_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=41680916;
 //BA.debugLineNum = 41680916;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=41680917;
 //BA.debugLineNum = 41680917;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=41680918;
 //BA.debugLineNum = 41680918;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=41680919;
 //BA.debugLineNum = 41680919;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group23 = _playlists;
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_playlistobject = group23.Get(index23);
RDebugUtils.currentLine=41680920;
 //BA.debugLineNum = 41680920;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=41680921;
 //BA.debugLineNum = 41680921;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=41680922;
 //BA.debugLineNum = 41680922;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=41680923;
 //BA.debugLineNum = 41680923;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=41680924;
 //BA.debugLineNum = 41680924;BA.debugLine="If uniqueDescriptors.ContainsKey(playlistId";
if (_uniquedescriptors.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
RDebugUtils.currentLine=41680925;
 //BA.debugLineNum = 41680925;BA.debugLine="Dim descriptor As Map";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41680926;
 //BA.debugLineNum = 41680926;BA.debugLine="descriptor.Initialize";
_descriptor.Initialize();
RDebugUtils.currentLine=41680927;
 //BA.debugLineNum = 41680927;BA.debugLine="descriptor.Put(\"id\", playlistId)";
_descriptor.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=41680928;
 //BA.debugLineNum = 41680928;BA.debugLine="descriptor.Put(\"updated\", playlist.GetDefau";
_descriptor.Put((Object)("updated"),_playlist.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=41680929;
 //BA.debugLineNum = 41680929;BA.debugLine="descriptor.Put(\"title\", playlist.GetDefault";
_descriptor.Put((Object)("title"),_playlist.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=41680930;
 //BA.debugLineNum = 41680930;BA.debugLine="descriptor.Put(\"schedule_title\", scheduleTi";
_descriptor.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=41680931;
 //BA.debugLineNum = 41680931;BA.debugLine="descriptor.Put(\"slot_time\", slotTime)";
_descriptor.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=41680932;
 //BA.debugLineNum = 41680932;BA.debugLine="descriptor.Put(\"stream_id\", streamId)";
_descriptor.Put((Object)("stream_id"),(Object)(_streamid));
RDebugUtils.currentLine=41680933;
 //BA.debugLineNum = 41680933;BA.debugLine="descriptor.Put(\"stream_title\", streamTitle)";
_descriptor.Put((Object)("stream_title"),(Object)(_streamtitle));
RDebugUtils.currentLine=41680934;
 //BA.debugLineNum = 41680934;BA.debugLine="uniqueDescriptors.Put(playlistId, descripto";
_uniquedescriptors.Put((Object)(_playlistid),(Object)(_descriptor.getObject()));
RDebugUtils.currentLine=41680935;
 //BA.debugLineNum = 41680935;BA.debugLine="descriptors.Add(descriptor)";
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
RDebugUtils.currentLine=41680942;
 //BA.debugLineNum = 41680942;BA.debugLine="Return descriptors";
if (true) return _descriptors;
RDebugUtils.currentLine=41680943;
 //BA.debugLineNum = 41680943;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=42008580;
 //BA.debugLineNum = 42008580;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=42008581;
 //BA.debugLineNum = 42008581;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=42008582;
 //BA.debugLineNum = 42008582;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=42008583;
 //BA.debugLineNum = 42008583;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=42008585;
 //BA.debugLineNum = 42008585;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=42008586;
 //BA.debugLineNum = 42008586;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=42008587;
 //BA.debugLineNum = 42008587;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=42008588;
 //BA.debugLineNum = 42008588;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=40566785;
 //BA.debugLineNum = 40566785;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=40566787;
 //BA.debugLineNum = 40566787;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=40566788;
 //BA.debugLineNum = 40566788;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=40566789;
 //BA.debugLineNum = 40566789;BA.debugLine="Private playerDataFileName As String";
_playerdatafilename = "";
RDebugUtils.currentLine=40566790;
 //BA.debugLineNum = 40566790;BA.debugLine="Private playlistRequirementsFileName As String";
_playlistrequirementsfilename = "";
RDebugUtils.currentLine=40566791;
 //BA.debugLineNum = 40566791;BA.debugLine="Private playlistsDirName As String";
_playlistsdirname = "";
RDebugUtils.currentLine=40566792;
 //BA.debugLineNum = 40566792;BA.debugLine="Private playlistCdnBaseUrl As String";
_playlistcdnbaseurl = "";
RDebugUtils.currentLine=40566793;
 //BA.debugLineNum = 40566793;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=82116608;
 //BA.debugLineNum = 82116608;BA.debugLine="Private Sub CleanupObsoletePlaylistMetadata(descri";
RDebugUtils.currentLine=82116609;
 //BA.debugLineNum = 82116609;BA.debugLine="Dim actualIds As Map";
_actualids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=82116610;
 //BA.debugLineNum = 82116610;BA.debugLine="actualIds.Initialize";
_actualids.Initialize();
RDebugUtils.currentLine=82116611;
 //BA.debugLineNum = 82116611;BA.debugLine="If descriptors.IsInitialized Then";
if (_descriptors.IsInitialized()) { 
RDebugUtils.currentLine=82116612;
 //BA.debugLineNum = 82116612;BA.debugLine="For Each descriptorObject As Object In descripto";
{
final anywheresoftware.b4a.BA.IterableList group4 = _descriptors;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_descriptorobject = group4.Get(index4);
RDebugUtils.currentLine=82116613;
 //BA.debugLineNum = 82116613;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=82116614;
 //BA.debugLineNum = 82116614;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=82116615;
 //BA.debugLineNum = 82116615;BA.debugLine="Dim playlistId As String = descriptor.GetDefau";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=82116616;
 //BA.debugLineNum = 82116616;BA.debugLine="If playlistId <> \"\" Then actualIds.Put(playlis";
if ((_playlistid).equals("") == false) { 
_actualids.Put((Object)(_playlistid),(Object)(__c.True));};
 };
 }
};
 };
RDebugUtils.currentLine=82116620;
 //BA.debugLineNum = 82116620;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=82116621;
 //BA.debugLineNum = 82116621;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
RDebugUtils.currentLine=82116622;
 //BA.debugLineNum = 82116622;BA.debugLine="Dim obsoleteIds As List";
_obsoleteids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=82116623;
 //BA.debugLineNum = 82116623;BA.debugLine="obsoleteIds.Initialize";
_obsoleteids.Initialize();
RDebugUtils.currentLine=82116624;
 //BA.debugLineNum = 82116624;BA.debugLine="For Each playlistId As String In cachedPlaylistIn";
{
final anywheresoftware.b4a.BA.IterableList group16 = _cachedplaylistindex.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_playlistid = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=82116625;
 //BA.debugLineNum = 82116625;BA.debugLine="If actualIds.ContainsKey(playlistId) = False The";
if (_actualids.ContainsKey((Object)(_playlistid))==__c.False) { 
_obsoleteids.Add((Object)(_playlistid));};
 }
};
RDebugUtils.currentLine=82116627;
 //BA.debugLineNum = 82116627;BA.debugLine="For Each playlistId As String In obsoleteIds";
{
final anywheresoftware.b4a.BA.IterableList group19 = _obsoleteids;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistid = BA.ObjectToString(group19.Get(index19));
RDebugUtils.currentLine=82116628;
 //BA.debugLineNum = 82116628;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))) { 
RDebugUtils.currentLine=82116629;
 //BA.debugLineNum = 82116629;BA.debugLine="File.Delete(GetOfflinePlaylistsDir, PlaylistMet";
__c.File.Delete(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid));
 };
RDebugUtils.currentLine=82116631;
 //BA.debugLineNum = 82116631;BA.debugLine="cachedPlaylistIndex.Remove(playlistId)";
_cachedplaylistindex.Remove((Object)(_playlistid));
RDebugUtils.currentLine=82116632;
 //BA.debugLineNum = 82116632;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
 }
};
RDebugUtils.currentLine=82116634;
 //BA.debugLineNum = 82116634;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=82116635;
 //BA.debugLineNum = 82116635;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayl";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
RDebugUtils.currentLine=82116636;
 //BA.debugLineNum = 82116636;BA.debugLine="Trace(\"playlist metadata cleanup done removed=\"";
__ref._trace /*String*/ (null,"playlist metadata cleanup done removed="+BA.NumberToString(_removedcount));
 };
RDebugUtils.currentLine=82116638;
 //BA.debugLineNum = 82116638;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=42139651;
 //BA.debugLineNum = 42139651;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=42139652;
 //BA.debugLineNum = 42139652;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadatafilename(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Public Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.offlinestore __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=42270722;
 //BA.debugLineNum = 42270722;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=42270724;
 //BA.debugLineNum = 42270724;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Private Sub CompareOfflinePlaylistsWithCache(descr";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=41746435;
 //BA.debugLineNum = 41746435;BA.debugLine="Dim downloadIds As List";
_downloadids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=41746436;
 //BA.debugLineNum = 41746436;BA.debugLine="downloadIds.Initialize";
_downloadids.Initialize();
RDebugUtils.currentLine=41746437;
 //BA.debugLineNum = 41746437;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=41746438;
 //BA.debugLineNum = 41746438;BA.debugLine="Dim missingCount As Int = 0";
_missingcount = (int) (0);
RDebugUtils.currentLine=41746439;
 //BA.debugLineNum = 41746439;BA.debugLine="Dim outdatedCount As Int = 0";
_outdatedcount = (int) (0);
RDebugUtils.currentLine=41746440;
 //BA.debugLineNum = 41746440;BA.debugLine="Dim actualCount As Int = 0";
_actualcount = (int) (0);
RDebugUtils.currentLine=41746441;
 //BA.debugLineNum = 41746441;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group9 = _descriptors;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_descriptorobject = group9.Get(index9);
RDebugUtils.currentLine=41746442;
 //BA.debugLineNum = 41746442;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=41746443;
 //BA.debugLineNum = 41746443;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=41746444;
 //BA.debugLineNum = 41746444;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=41746445;
 //BA.debugLineNum = 41746445;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=41746446;
 //BA.debugLineNum = 41746446;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId)";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=41746447;
 //BA.debugLineNum = 41746447;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=41746448;
 //BA.debugLineNum = 41746448;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
RDebugUtils.currentLine=41746449;
 //BA.debugLineNum = 41746449;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=41746451;
 //BA.debugLineNum = 41746451;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylis";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=41746452;
 //BA.debugLineNum = 41746452;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=41746453;
 //BA.debugLineNum = 41746453;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=41746454;
 //BA.debugLineNum = 41746454;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> de";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
RDebugUtils.currentLine=41746455;
 //BA.debugLineNum = 41746455;BA.debugLine="outdatedCount = outdatedCount + 1";
_outdatedcount = (int) (_outdatedcount+1);
RDebugUtils.currentLine=41746456;
 //BA.debugLineNum = 41746456;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 }else {
RDebugUtils.currentLine=41746458;
 //BA.debugLineNum = 41746458;BA.debugLine="actualCount = actualCount + 1";
_actualcount = (int) (_actualcount+1);
 };
 }else {
RDebugUtils.currentLine=41746461;
 //BA.debugLineNum = 41746461;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=41746462;
 //BA.debugLineNum = 41746462;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 };
 };
 }
};
RDebugUtils.currentLine=41746466;
 //BA.debugLineNum = 41746466;BA.debugLine="result.Put(\"DownloadIds\", downloadIds)";
_result.Put((Object)("DownloadIds"),(Object)(_downloadids.getObject()));
RDebugUtils.currentLine=41746467;
 //BA.debugLineNum = 41746467;BA.debugLine="result.Put(\"MissingCount\", missingCount)";
_result.Put((Object)("MissingCount"),(Object)(_missingcount));
RDebugUtils.currentLine=41746468;
 //BA.debugLineNum = 41746468;BA.debugLine="result.Put(\"OutdatedCount\", outdatedCount)";
_result.Put((Object)("OutdatedCount"),(Object)(_outdatedcount));
RDebugUtils.currentLine=41746469;
 //BA.debugLineNum = 41746469;BA.debugLine="result.Put(\"ActualCount\", actualCount)";
_result.Put((Object)("ActualCount"),(Object)(_actualcount));
RDebugUtils.currentLine=41746470;
 //BA.debugLineNum = 41746470;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=41746471;
 //BA.debugLineNum = 41746471;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=42205187;
 //BA.debugLineNum = 42205187;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=42205188;
 //BA.debugLineNum = 42205188;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.offlinestore __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=42074115;
 //BA.debugLineNum = 42074115;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=42074116;
 //BA.debugLineNum = 42074116;BA.debugLine="End Sub";
return "";
}
public int  _getofflineadscount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineadscount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineadscount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _ads = null;
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Private Sub GetOfflineAdsCount(data As Map) As Int";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="Dim ads As List = data.GetDefault(\"ads\", Null)";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("ads"),__c.Null)));
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="If ads.IsInitialized = False Then Return 0";
if (_ads.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=41549828;
 //BA.debugLineNum = 41549828;BA.debugLine="Return ads.Size";
if (true) return _ads.getSize();
RDebugUtils.currentLine=41549829;
 //BA.debugLineNum = 41549829;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Private Sub GetOfflinePlaylistIds(data As Map) As";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
RDebugUtils.currentLine=41484291;
 //BA.debugLineNum = 41484291;BA.debugLine="If data.IsInitialized = False Then Return playlis";
if (_data.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=41484292;
 //BA.debugLineNum = 41484292;BA.debugLine="Dim uniqueIds As Map";
_uniqueids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41484293;
 //BA.debugLineNum = 41484293;BA.debugLine="uniqueIds.Initialize";
_uniqueids.Initialize();
RDebugUtils.currentLine=41484294;
 //BA.debugLineNum = 41484294;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=41484295;
 //BA.debugLineNum = 41484295;BA.debugLine="If schedules.IsInitialized = False Then Return pl";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=41484296;
 //BA.debugLineNum = 41484296;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=41484297;
 //BA.debugLineNum = 41484297;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=41484298;
 //BA.debugLineNum = 41484298;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=41484299;
 //BA.debugLineNum = 41484299;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=41484300;
 //BA.debugLineNum = 41484300;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=41484301;
 //BA.debugLineNum = 41484301;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group13 = _slots;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_slotobject = group13.Get(index13);
RDebugUtils.currentLine=41484302;
 //BA.debugLineNum = 41484302;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=41484303;
 //BA.debugLineNum = 41484303;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=41484304;
 //BA.debugLineNum = 41484304;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=41484305;
 //BA.debugLineNum = 41484305;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=41484306;
 //BA.debugLineNum = 41484306;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=41484307;
 //BA.debugLineNum = 41484307;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group19 = _playlists;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistobject = group19.Get(index19);
RDebugUtils.currentLine=41484308;
 //BA.debugLineNum = 41484308;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=41484309;
 //BA.debugLineNum = 41484309;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=41484310;
 //BA.debugLineNum = 41484310;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=41484311;
 //BA.debugLineNum = 41484311;BA.debugLine="If playlistId <> \"\" And uniqueIds.ContainsK";
if ((_playlistid).equals("") == false && _uniqueids.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=41484312;
 //BA.debugLineNum = 41484312;BA.debugLine="uniqueIds.Put(playlistId, True)";
_uniqueids.Put((Object)(_playlistid),(Object)(__c.True));
RDebugUtils.currentLine=41484313;
 //BA.debugLineNum = 41484313;BA.debugLine="playlistIds.Add(playlistId)";
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
RDebugUtils.currentLine=41484321;
 //BA.debugLineNum = 41484321;BA.debugLine="Return playlistIds";
if (true) return _playlistids;
RDebugUtils.currentLine=41484322;
 //BA.debugLineNum = 41484322;BA.debugLine="End Sub";
return null;
}
public int  _getofflineschedulescount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineschedulescount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineschedulescount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _schedules = null;
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Private Sub GetOfflineSchedulesCount(data As Map)";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=41615363;
 //BA.debugLineNum = 41615363;BA.debugLine="If schedules.IsInitialized = False Then Return 0";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=41615364;
 //BA.debugLineNum = 41615364;BA.debugLine="Return schedules.Size";
if (true) return _schedules.getSize();
RDebugUtils.currentLine=41615365;
 //BA.debugLineNum = 41615365;BA.debugLine="End Sub";
return 0;
}
public int  _getplaylisttrackcount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getplaylisttrackcount", false))
	 {return ((Integer) Debug.delegate(ba, "getplaylisttrackcount", new Object[] {_playlistdata}));}
anywheresoftware.b4a.objects.collections.List _tracks = null;
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Private Sub GetPlaylistTrackCount(playlistData As";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="If tracks.IsInitialized = False Then Return 0";
if (_tracks.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="Return tracks.Size";
if (true) return _tracks.getSize();
RDebugUtils.currentLine=41943045;
 //BA.debugLineNum = 41943045;BA.debugLine="End Sub";
return 0;
}
public String  _invalidateplaylistplaybackorder(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "invalidateplaylistplaybackorder", false))
	 {return ((String) Debug.delegate(ba, "invalidateplaylistplaybackorder", new Object[] {_playlistid}));}
RDebugUtils.currentLine=87490560;
 //BA.debugLineNum = 87490560;BA.debugLine="Private Sub InvalidatePlaylistPlaybackOrder(playli";
RDebugUtils.currentLine=87490561;
 //BA.debugLineNum = 87490561;BA.debugLine="If playlistId = \"\" Then Return";
if ((_playlistid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=87490562;
 //BA.debugLineNum = 87490562;BA.debugLine="storage.Remove(\"playlist_playback_manifest_\" & pl";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,"playlist_playback_manifest_"+_playlistid);
RDebugUtils.currentLine=87490563;
 //BA.debugLineNum = 87490563;BA.debugLine="storage.Remove(\"playlist_playback_cursor_\" & play";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,"playlist_playback_cursor_"+_playlistid);
RDebugUtils.currentLine=87490564;
 //BA.debugLineNum = 87490564;BA.debugLine="storage.Remove(\"playlist_track_index_\" & playlist";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,"playlist_track_index_"+_playlistid);
RDebugUtils.currentLine=87490565;
 //BA.debugLineNum = 87490565;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflinedata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _sourcedata,String _playercode,String _deviceid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflinedata", new Object[] {_sourcedata,_playercode,_deviceid}));}
anywheresoftware.b4a.objects.collections.Map _normalizeddata = null;
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Private Sub NormalizeOfflineData(sourceData As Map";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="Dim normalizedData As Map";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="normalizedData.Initialize";
_normalizeddata.Initialize();
RDebugUtils.currentLine=41418755;
 //BA.debugLineNum = 41418755;BA.debugLine="normalizedData.Put(\"ok\", sourceData.GetDefault(\"o";
_normalizeddata.Put((Object)("ok"),_sourcedata.GetDefault((Object)("ok"),(Object)(__c.False)));
RDebugUtils.currentLine=41418756;
 //BA.debugLineNum = 41418756;BA.debugLine="normalizedData.Put(\"type\", sourceData.GetDefault(";
_normalizeddata.Put((Object)("type"),_sourcedata.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=41418757;
 //BA.debugLineNum = 41418757;BA.debugLine="normalizedData.Put(\"updated\", sourceData.GetDefau";
_normalizeddata.Put((Object)("updated"),_sourcedata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=41418758;
 //BA.debugLineNum = 41418758;BA.debugLine="normalizedData.Put(\"saved_at\", DateTime.Now)";
_normalizeddata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=41418759;
 //BA.debugLineNum = 41418759;BA.debugLine="normalizedData.Put(\"player_code\", playerCode)";
_normalizeddata.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=41418760;
 //BA.debugLineNum = 41418760;BA.debugLine="normalizedData.Put(\"device_id\", deviceId)";
_normalizeddata.Put((Object)("device_id"),(Object)(_deviceid));
RDebugUtils.currentLine=41418761;
 //BA.debugLineNum = 41418761;BA.debugLine="If sourceData.ContainsKey(\"player\") Then normaliz";
if (_sourcedata.ContainsKey((Object)("player"))) { 
_normalizeddata.Put((Object)("player"),_sourcedata.Get((Object)("player")));};
RDebugUtils.currentLine=41418762;
 //BA.debugLineNum = 41418762;BA.debugLine="If sourceData.ContainsKey(\"ads\") Then normalizedD";
if (_sourcedata.ContainsKey((Object)("ads"))) { 
_normalizeddata.Put((Object)("ads"),_sourcedata.Get((Object)("ads")));};
RDebugUtils.currentLine=41418763;
 //BA.debugLineNum = 41418763;BA.debugLine="If sourceData.ContainsKey(\"schedules\") Then norma";
if (_sourcedata.ContainsKey((Object)("schedules"))) { 
_normalizeddata.Put((Object)("schedules"),_sourcedata.Get((Object)("schedules")));};
RDebugUtils.currentLine=41418764;
 //BA.debugLineNum = 41418764;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=41418765;
 //BA.debugLineNum = 41418765;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflineplaylistdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflineplaylistdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflineplaylistdata", new Object[] {_descriptor,_playlistdata}));}
anywheresoftware.b4a.objects.collections.Map _normalizedplaylistdata = null;
String _key = "";
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Private Sub NormalizeOfflinePlaylistData(descripto";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="Dim normalizedPlaylistData As Map";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="normalizedPlaylistData.Initialize";
_normalizedplaylistdata.Initialize();
RDebugUtils.currentLine=41877507;
 //BA.debugLineNum = 41877507;BA.debugLine="For Each key As String In playlistData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _playlistdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=41877508;
 //BA.debugLineNum = 41877508;BA.debugLine="normalizedPlaylistData.Put(key, playlistData.Get";
_normalizedplaylistdata.Put((Object)(_key),_playlistdata.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=41877510;
 //BA.debugLineNum = 41877510;BA.debugLine="normalizedPlaylistData.Put(\"id\", descriptor.GetDe";
_normalizedplaylistdata.Put((Object)("id"),_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=41877511;
 //BA.debugLineNum = 41877511;BA.debugLine="normalizedPlaylistData.Put(\"required_updated\", de";
_normalizedplaylistdata.Put((Object)("required_updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=41877512;
 //BA.debugLineNum = 41877512;BA.debugLine="normalizedPlaylistData.Put(\"saved_at\", DateTime.N";
_normalizedplaylistdata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=41877513;
 //BA.debugLineNum = 41877513;BA.debugLine="Return normalizedPlaylistData";
if (true) return _normalizedplaylistdata;
RDebugUtils.currentLine=41877514;
 //BA.debugLineNum = 41877514;BA.debugLine="End Sub";
return null;
}
public String  _writeofflineplaylistrequirementsfile(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _descriptors,String _playercode) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "writeofflineplaylistrequirementsfile", false))
	 {return ((String) Debug.delegate(ba, "writeofflineplaylistrequirementsfile", new Object[] {_descriptors,_playercode}));}
anywheresoftware.b4a.objects.collections.Map _payload = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _generator = null;
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Private Sub WriteOfflinePlaylistRequirementsFile(d";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="Dim payload As Map";
_payload = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="payload.Initialize";
_payload.Initialize();
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="payload.Put(\"saved_at\", DateTime.Now)";
_payload.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="payload.Put(\"player_code\", playerCode)";
_payload.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="payload.Put(\"descriptors\", descriptors)";
_payload.Put((Object)("descriptors"),(Object)(_descriptors.getObject()));
RDebugUtils.currentLine=41811974;
 //BA.debugLineNum = 41811974;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=41811975;
 //BA.debugLineNum = 41811975;BA.debugLine="generator.Initialize(payload)";
_generator.Initialize(_payload);
RDebugUtils.currentLine=41811976;
 //BA.debugLineNum = 41811976;BA.debugLine="File.WriteString(storageDir, playlistRequirements";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._playlistrequirementsfilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=41811977;
 //BA.debugLineNum = 41811977;BA.debugLine="End Sub";
return "";
}
}