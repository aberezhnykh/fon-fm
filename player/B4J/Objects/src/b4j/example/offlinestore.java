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
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Public Sub GetStoredPlaylistDescriptors As List";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="Return storage.GetDefault(\"playlist_descriptors\",";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"playlist_descriptors",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadataurl(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadataurl", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadataurl", new Object[] {_playlistid}));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Public Sub PlaylistMetadataUrl(playlistId As Strin";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="Return playlistCdnBaseUrl & playlistId & \".json\"";
if (true) return __ref._playlistcdnbaseurl /*String*/ +_playlistid+".json";
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Public Sub SavePlaylistMetadata(descriptor As Map,";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="EnsureDirectory(GetOfflinePlaylistsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getofflineplaylistsdir /*String*/ (null));
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="Dim normalizedPlaylistData As Map = NormalizeOffl";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
_normalizedplaylistdata = __ref._normalizeofflineplaylistdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_descriptor,_playlistdata);
RDebugUtils.currentLine=27721732;
 //BA.debugLineNum = 27721732;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=27721733;
 //BA.debugLineNum = 27721733;BA.debugLine="generator.Initialize(normalizedPlaylistData)";
_generator.Initialize(_normalizedplaylistdata);
RDebugUtils.currentLine=27721734;
 //BA.debugLineNum = 27721734;BA.debugLine="File.WriteString(GetOfflinePlaylistsDir, Playlist";
__c.File.WriteString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid),_generator.ToString());
RDebugUtils.currentLine=27721735;
 //BA.debugLineNum = 27721735;BA.debugLine="Dim cachedEntry As Map";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=27721736;
 //BA.debugLineNum = 27721736;BA.debugLine="cachedEntry.Initialize";
_cachedentry.Initialize();
RDebugUtils.currentLine=27721737;
 //BA.debugLineNum = 27721737;BA.debugLine="cachedEntry.Put(\"id\", playlistId)";
_cachedentry.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=27721738;
 //BA.debugLineNum = 27721738;BA.debugLine="cachedEntry.Put(\"updated\", descriptor.GetDefault(";
_cachedentry.Put((Object)("updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=27721739;
 //BA.debugLineNum = 27721739;BA.debugLine="cachedEntry.Put(\"saved_at\", DateTime.Now)";
_cachedentry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=27721740;
 //BA.debugLineNum = 27721740;BA.debugLine="cachedEntry.Put(\"title\", descriptor.GetDefault(\"t";
_cachedentry.Put((Object)("title"),_descriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=27721741;
 //BA.debugLineNum = 27721741;BA.debugLine="cachedEntry.Put(\"track_count\", GetPlaylistTrackCo";
_cachedentry.Put((Object)("track_count"),(Object)(__ref._getplaylisttrackcount /*int*/ (null,_normalizedplaylistdata)));
RDebugUtils.currentLine=27721742;
 //BA.debugLineNum = 27721742;BA.debugLine="cachedPlaylistIndex.Put(playlistId, cachedEntry)";
_cachedplaylistindex.Put((Object)(_playlistid),(Object)(_cachedentry.getObject()));
RDebugUtils.currentLine=27721743;
 //BA.debugLineNum = 27721743;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedplaylistindex(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getcachedplaylistindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedplaylistindex", null));}
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Public Sub GetCachedPlaylistIndex As Map";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Return storage.GetDefault(\"cached_playlist_index\"";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="End Sub";
return null;
}
public String  _savecachedplaylistindex(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "savecachedplaylistindex", false))
	 {return ((String) Debug.delegate(ba, "savecachedplaylistindex", new Object[] {_cachedplaylistindex}));}
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Public Sub SaveCachedPlaylistIndex(cachedPlaylistI";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayli";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.offlinestore __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4j.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _playerdatafilenamevalue,String _playlistrequirementsfilenamevalue,String _playlistsdirnamevalue,String _playlistcdnbaseurlvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_storagevalue,_targetmodulevalue,_tracesubnamevalue,_playerdatafilenamevalue,_playlistrequirementsfilenamevalue,_playlistsdirnamevalue,_playlistcdnbaseurlvalue}));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="storage = storageValue";
__ref._storage /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=27197443;
 //BA.debugLineNum = 27197443;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=27197444;
 //BA.debugLineNum = 27197444;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=27197445;
 //BA.debugLineNum = 27197445;BA.debugLine="playerDataFileName = playerDataFileNameValue";
__ref._playerdatafilename /*String*/  = _playerdatafilenamevalue;
RDebugUtils.currentLine=27197446;
 //BA.debugLineNum = 27197446;BA.debugLine="playlistRequirementsFileName = playlistRequiremen";
__ref._playlistrequirementsfilename /*String*/  = _playlistrequirementsfilenamevalue;
RDebugUtils.currentLine=27197447;
 //BA.debugLineNum = 27197447;BA.debugLine="playlistsDirName = playlistsDirNameValue";
__ref._playlistsdirname /*String*/  = _playlistsdirnamevalue;
RDebugUtils.currentLine=27197448;
 //BA.debugLineNum = 27197448;BA.debugLine="playlistCdnBaseUrl = playlistCdnBaseUrlValue";
__ref._playlistcdnbaseurl /*String*/  = _playlistcdnbaseurlvalue;
RDebugUtils.currentLine=27197449;
 //BA.debugLineNum = 27197449;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Public Sub LoadOfflineData As Map";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=27262979;
 //BA.debugLineNum = 27262979;BA.debugLine="If File.Exists(storageDir, playerDataFileName) =";
if (__c.File.Exists(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ )==__c.False) { 
if (true) return _data;};
RDebugUtils.currentLine=27262980;
 //BA.debugLineNum = 27262980;BA.debugLine="Try";
try {RDebugUtils.currentLine=27262981;
 //BA.debugLineNum = 27262981;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=27262982;
 //BA.debugLineNum = 27262982;BA.debugLine="parser.Initialize(File.ReadString(storageDir, pl";
_parser.Initialize(__c.File.ReadString(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ ));
RDebugUtils.currentLine=27262983;
 //BA.debugLineNum = 27262983;BA.debugLine="Dim parsed As Map = parser.NextObject";
_parsed = new anywheresoftware.b4a.objects.collections.Map();
_parsed = _parser.NextObject();
RDebugUtils.currentLine=27262984;
 //BA.debugLineNum = 27262984;BA.debugLine="If parsed.IsInitialized Then";
if (_parsed.IsInitialized()) { 
RDebugUtils.currentLine=27262985;
 //BA.debugLineNum = 27262985;BA.debugLine="data = parsed";
_data = _parsed;
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=27262988;
 //BA.debugLineNum = 27262988;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=27262989;
 //BA.debugLineNum = 27262989;BA.debugLine="Trace(\"данные плеера load ошибка message=\" & Las";
__ref._trace /*String*/ (null,"данные плеера load ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=27262991;
 //BA.debugLineNum = 27262991;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=27262992;
 //BA.debugLineNum = 27262992;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Public Sub SaveOfflineData(sourceData As Map, play";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="Dim normalizedData As Map = NormalizeOfflineData(";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
_normalizeddata = __ref._normalizeofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sourcedata,_playercode,_deviceid);
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="Dim offlineDataUpdatedAt As Long = DateTime.Now";
_offlinedataupdatedat = __c.DateTime.getNow();
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="storage.Put(\"player_data_updated_at\", offlineData";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"player_data_updated_at",(Object)(_offlinedataupdatedat));
RDebugUtils.currentLine=27328516;
 //BA.debugLineNum = 27328516;BA.debugLine="storage.Put(\"player_data_source_updated\", normali";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"player_data_source_updated",_normalizeddata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=27328517;
 //BA.debugLineNum = 27328517;BA.debugLine="Dim playlistIds As List = GetOfflinePlaylistIds(n";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
_playlistids = __ref._getofflineplaylistids /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=27328518;
 //BA.debugLineNum = 27328518;BA.debugLine="Dim playlistDescriptors As List = BuildOfflinePla";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = __ref._buildofflineplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=27328519;
 //BA.debugLineNum = 27328519;BA.debugLine="Dim playlistCacheStatus As Map = CompareOfflinePl";
_playlistcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_playlistcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=27328520;
 //BA.debugLineNum = 27328520;BA.debugLine="storage.Put(\"playlist_ids\", playlistIds)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_ids",(Object)(_playlistids.getObject()));
RDebugUtils.currentLine=27328521;
 //BA.debugLineNum = 27328521;BA.debugLine="storage.Put(\"playlist_descriptors\", playlistDescr";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_descriptors",(Object)(_playlistdescriptors.getObject()));
RDebugUtils.currentLine=27328522;
 //BA.debugLineNum = 27328522;BA.debugLine="storage.Put(\"playlist_download_ids\", playlistCach";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_download_ids",_playlistcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=27328523;
 //BA.debugLineNum = 27328523;BA.debugLine="storage.Put(\"playlist_missing_count\", playlistCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_missing_count",_playlistcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=27328524;
 //BA.debugLineNum = 27328524;BA.debugLine="storage.Put(\"playlist_outdated_count\", playlistCa";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_outdated_count",_playlistcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=27328525;
 //BA.debugLineNum = 27328525;BA.debugLine="storage.Put(\"playlist_actual_count\", playlistCach";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_actual_count",_playlistcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=27328526;
 //BA.debugLineNum = 27328526;BA.debugLine="storage.Put(\"ad_count\", GetOfflineAdsCount(normal";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"ad_count",(Object)(__ref._getofflineadscount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=27328527;
 //BA.debugLineNum = 27328527;BA.debugLine="storage.Put(\"schedule_count\", GetOfflineSchedules";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"schedule_count",(Object)(__ref._getofflineschedulescount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=27328528;
 //BA.debugLineNum = 27328528;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=27328529;
 //BA.debugLineNum = 27328529;BA.debugLine="generator.Initialize(normalizedData)";
_generator.Initialize(_normalizeddata);
RDebugUtils.currentLine=27328530;
 //BA.debugLineNum = 27328530;BA.debugLine="File.WriteString(storageDir, playerDataFileName,";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=27328531;
 //BA.debugLineNum = 27328531;BA.debugLine="WriteOfflinePlaylistRequirementsFile(playlistDesc";
__ref._writeofflineplaylistrequirementsfile /*String*/ (null,_playlistdescriptors,_playercode);
RDebugUtils.currentLine=27328532;
 //BA.debugLineNum = 27328532;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=27328533;
 //BA.debugLineNum = 27328533;BA.debugLine="End Sub";
return null;
}
public String  _getofflineplaylistsdir(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Public Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="Return File.Combine(storageDir, playlistsDirName)";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,__ref._playlistsdirname /*String*/ );
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaylistsyncaction(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "resolveplaylistsyncaction", false))
	 {return ((String) Debug.delegate(ba, "resolveplaylistsyncaction", new Object[] {_descriptor,_cachedplaylistindex}));}
String _playlistid = "";
Object _cachedentryobject = null;
anywheresoftware.b4a.objects.collections.Map _cachedentry = null;
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Public Sub ResolvePlaylistSyncAction(descriptor As";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="If playlistId = \"\" Then Return \"skip\"";
if ((_playlistid).equals("")) { 
if (true) return "skip";};
RDebugUtils.currentLine=27656195;
 //BA.debugLineNum = 27656195;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId) =";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=27656196;
 //BA.debugLineNum = 27656196;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylistI";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=27656197;
 //BA.debugLineNum = 27656197;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=27656198;
 //BA.debugLineNum = 27656198;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=27656199;
 //BA.debugLineNum = 27656199;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> desc";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
if (true) return "outdated";};
RDebugUtils.currentLine=27656200;
 //BA.debugLineNum = 27656200;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=27656201;
 //BA.debugLineNum = 27656201;BA.debugLine="Return \"skip\"";
if (true) return "skip";
 };
RDebugUtils.currentLine=27656203;
 //BA.debugLineNum = 27656203;BA.debugLine="Return \"missing\"";
if (true) return "missing";
RDebugUtils.currentLine=27656204;
 //BA.debugLineNum = 27656204;BA.debugLine="End Sub";
return "";
}
public String  _refreshplaylistcachestatus(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _playlistdescriptors) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "refreshplaylistcachestatus", false))
	 {return ((String) Debug.delegate(ba, "refreshplaylistcachestatus", new Object[] {_playlistdescriptors}));}
anywheresoftware.b4a.objects.collections.Map _refreshedcachestatus = null;
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Public Sub RefreshPlaylistCacheStatus(playlistDesc";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="Dim refreshedCacheStatus As Map = CompareOfflineP";
_refreshedcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_refreshedcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="storage.Put(\"playlist_download_ids\", refreshedCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_download_ids",_refreshedcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=27590659;
 //BA.debugLineNum = 27590659;BA.debugLine="storage.Put(\"playlist_missing_count\", refreshedCa";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_missing_count",_refreshedcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=27590660;
 //BA.debugLineNum = 27590660;BA.debugLine="storage.Put(\"playlist_outdated_count\", refreshedC";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_outdated_count",_refreshedcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=27590661;
 //BA.debugLineNum = 27590661;BA.debugLine="storage.Put(\"playlist_actual_count\", refreshedCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_actual_count",_refreshedcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=27590662;
 //BA.debugLineNum = 27590662;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Private Sub BuildOfflinePlaylistDescriptors(data A";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="Dim descriptors As List";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="descriptors.Initialize";
_descriptors.Initialize();
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="If data.IsInitialized = False Then Return descrip";
if (_data.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=28246020;
 //BA.debugLineNum = 28246020;BA.debugLine="Dim uniqueDescriptors As Map";
_uniquedescriptors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28246021;
 //BA.debugLineNum = 28246021;BA.debugLine="uniqueDescriptors.Initialize";
_uniquedescriptors.Initialize();
RDebugUtils.currentLine=28246022;
 //BA.debugLineNum = 28246022;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=28246023;
 //BA.debugLineNum = 28246023;BA.debugLine="If schedules.IsInitialized = False Then Return de";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=28246024;
 //BA.debugLineNum = 28246024;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=28246025;
 //BA.debugLineNum = 28246025;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28246026;
 //BA.debugLineNum = 28246026;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=28246027;
 //BA.debugLineNum = 28246027;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=28246028;
 //BA.debugLineNum = 28246028;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=28246029;
 //BA.debugLineNum = 28246029;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=28246030;
 //BA.debugLineNum = 28246030;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group14 = _slots;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_slotobject = group14.Get(index14);
RDebugUtils.currentLine=28246031;
 //BA.debugLineNum = 28246031;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28246032;
 //BA.debugLineNum = 28246032;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=28246033;
 //BA.debugLineNum = 28246033;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=28246034;
 //BA.debugLineNum = 28246034;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=28246035;
 //BA.debugLineNum = 28246035;BA.debugLine="Dim streamId As String = streamData.GetDefaul";
_streamid = BA.ObjectToString(_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=28246036;
 //BA.debugLineNum = 28246036;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=28246037;
 //BA.debugLineNum = 28246037;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=28246038;
 //BA.debugLineNum = 28246038;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=28246039;
 //BA.debugLineNum = 28246039;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group23 = _playlists;
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_playlistobject = group23.Get(index23);
RDebugUtils.currentLine=28246040;
 //BA.debugLineNum = 28246040;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28246041;
 //BA.debugLineNum = 28246041;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=28246042;
 //BA.debugLineNum = 28246042;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=28246043;
 //BA.debugLineNum = 28246043;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=28246044;
 //BA.debugLineNum = 28246044;BA.debugLine="If uniqueDescriptors.ContainsKey(playlistId";
if (_uniquedescriptors.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
RDebugUtils.currentLine=28246045;
 //BA.debugLineNum = 28246045;BA.debugLine="Dim descriptor As Map";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28246046;
 //BA.debugLineNum = 28246046;BA.debugLine="descriptor.Initialize";
_descriptor.Initialize();
RDebugUtils.currentLine=28246047;
 //BA.debugLineNum = 28246047;BA.debugLine="descriptor.Put(\"id\", playlistId)";
_descriptor.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=28246048;
 //BA.debugLineNum = 28246048;BA.debugLine="descriptor.Put(\"updated\", playlist.GetDefau";
_descriptor.Put((Object)("updated"),_playlist.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=28246049;
 //BA.debugLineNum = 28246049;BA.debugLine="descriptor.Put(\"title\", playlist.GetDefault";
_descriptor.Put((Object)("title"),_playlist.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=28246050;
 //BA.debugLineNum = 28246050;BA.debugLine="descriptor.Put(\"schedule_title\", scheduleTi";
_descriptor.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=28246051;
 //BA.debugLineNum = 28246051;BA.debugLine="descriptor.Put(\"slot_time\", slotTime)";
_descriptor.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=28246052;
 //BA.debugLineNum = 28246052;BA.debugLine="descriptor.Put(\"stream_id\", streamId)";
_descriptor.Put((Object)("stream_id"),(Object)(_streamid));
RDebugUtils.currentLine=28246053;
 //BA.debugLineNum = 28246053;BA.debugLine="descriptor.Put(\"stream_title\", streamTitle)";
_descriptor.Put((Object)("stream_title"),(Object)(_streamtitle));
RDebugUtils.currentLine=28246054;
 //BA.debugLineNum = 28246054;BA.debugLine="uniqueDescriptors.Put(playlistId, descripto";
_uniquedescriptors.Put((Object)(_playlistid),(Object)(_descriptor.getObject()));
RDebugUtils.currentLine=28246055;
 //BA.debugLineNum = 28246055;BA.debugLine="descriptors.Add(descriptor)";
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
RDebugUtils.currentLine=28246062;
 //BA.debugLineNum = 28246062;BA.debugLine="Return descriptors";
if (true) return _descriptors;
RDebugUtils.currentLine=28246063;
 //BA.debugLineNum = 28246063;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=28573699;
 //BA.debugLineNum = 28573699;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=28573700;
 //BA.debugLineNum = 28573700;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=28573701;
 //BA.debugLineNum = 28573701;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28573702;
 //BA.debugLineNum = 28573702;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=28573703;
 //BA.debugLineNum = 28573703;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=28573705;
 //BA.debugLineNum = 28573705;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=28573706;
 //BA.debugLineNum = 28573706;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=28573707;
 //BA.debugLineNum = 28573707;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=28573708;
 //BA.debugLineNum = 28573708;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=27131909;
 //BA.debugLineNum = 27131909;BA.debugLine="Private playerDataFileName As String";
_playerdatafilename = "";
RDebugUtils.currentLine=27131910;
 //BA.debugLineNum = 27131910;BA.debugLine="Private playlistRequirementsFileName As String";
_playlistrequirementsfilename = "";
RDebugUtils.currentLine=27131911;
 //BA.debugLineNum = 27131911;BA.debugLine="Private playlistsDirName As String";
_playlistsdirname = "";
RDebugUtils.currentLine=27131912;
 //BA.debugLineNum = 27131912;BA.debugLine="Private playlistCdnBaseUrl As String";
_playlistcdnbaseurl = "";
RDebugUtils.currentLine=27131913;
 //BA.debugLineNum = 27131913;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Private Sub CompareOfflinePlaylistsWithCache(descr";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="Dim downloadIds As List";
_downloadids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28311556;
 //BA.debugLineNum = 28311556;BA.debugLine="downloadIds.Initialize";
_downloadids.Initialize();
RDebugUtils.currentLine=28311557;
 //BA.debugLineNum = 28311557;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="Dim missingCount As Int = 0";
_missingcount = (int) (0);
RDebugUtils.currentLine=28311559;
 //BA.debugLineNum = 28311559;BA.debugLine="Dim outdatedCount As Int = 0";
_outdatedcount = (int) (0);
RDebugUtils.currentLine=28311560;
 //BA.debugLineNum = 28311560;BA.debugLine="Dim actualCount As Int = 0";
_actualcount = (int) (0);
RDebugUtils.currentLine=28311561;
 //BA.debugLineNum = 28311561;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group9 = _descriptors;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_descriptorobject = group9.Get(index9);
RDebugUtils.currentLine=28311562;
 //BA.debugLineNum = 28311562;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28311563;
 //BA.debugLineNum = 28311563;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=28311564;
 //BA.debugLineNum = 28311564;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=28311565;
 //BA.debugLineNum = 28311565;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=28311566;
 //BA.debugLineNum = 28311566;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId)";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=28311567;
 //BA.debugLineNum = 28311567;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=28311568;
 //BA.debugLineNum = 28311568;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
RDebugUtils.currentLine=28311569;
 //BA.debugLineNum = 28311569;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=28311571;
 //BA.debugLineNum = 28311571;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylis";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=28311572;
 //BA.debugLineNum = 28311572;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28311573;
 //BA.debugLineNum = 28311573;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=28311574;
 //BA.debugLineNum = 28311574;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> de";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
RDebugUtils.currentLine=28311575;
 //BA.debugLineNum = 28311575;BA.debugLine="outdatedCount = outdatedCount + 1";
_outdatedcount = (int) (_outdatedcount+1);
RDebugUtils.currentLine=28311576;
 //BA.debugLineNum = 28311576;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 }else {
RDebugUtils.currentLine=28311578;
 //BA.debugLineNum = 28311578;BA.debugLine="actualCount = actualCount + 1";
_actualcount = (int) (_actualcount+1);
 };
 }else {
RDebugUtils.currentLine=28311581;
 //BA.debugLineNum = 28311581;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=28311582;
 //BA.debugLineNum = 28311582;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 };
 };
 }
};
RDebugUtils.currentLine=28311586;
 //BA.debugLineNum = 28311586;BA.debugLine="result.Put(\"DownloadIds\", downloadIds)";
_result.Put((Object)("DownloadIds"),(Object)(_downloadids.getObject()));
RDebugUtils.currentLine=28311587;
 //BA.debugLineNum = 28311587;BA.debugLine="result.Put(\"MissingCount\", missingCount)";
_result.Put((Object)("MissingCount"),(Object)(_missingcount));
RDebugUtils.currentLine=28311588;
 //BA.debugLineNum = 28311588;BA.debugLine="result.Put(\"OutdatedCount\", outdatedCount)";
_result.Put((Object)("OutdatedCount"),(Object)(_outdatedcount));
RDebugUtils.currentLine=28311589;
 //BA.debugLineNum = 28311589;BA.debugLine="result.Put(\"ActualCount\", actualCount)";
_result.Put((Object)("ActualCount"),(Object)(_actualcount));
RDebugUtils.currentLine=28311590;
 //BA.debugLineNum = 28311590;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=28311591;
 //BA.debugLineNum = 28311591;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=28770308;
 //BA.debugLineNum = 28770308;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.offlinestore __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="End Sub";
return "";
}
public int  _getofflineadscount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineadscount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineadscount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _ads = null;
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Private Sub GetOfflineAdsCount(data As Map) As Int";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="Dim ads As List = data.GetDefault(\"ads\", Null)";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("ads"),__c.Null)));
RDebugUtils.currentLine=28114947;
 //BA.debugLineNum = 28114947;BA.debugLine="If ads.IsInitialized = False Then Return 0";
if (_ads.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28114948;
 //BA.debugLineNum = 28114948;BA.debugLine="Return ads.Size";
if (true) return _ads.getSize();
RDebugUtils.currentLine=28114949;
 //BA.debugLineNum = 28114949;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Private Sub GetOfflinePlaylistIds(data As Map) As";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
RDebugUtils.currentLine=28049411;
 //BA.debugLineNum = 28049411;BA.debugLine="If data.IsInitialized = False Then Return playlis";
if (_data.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=28049412;
 //BA.debugLineNum = 28049412;BA.debugLine="Dim uniqueIds As Map";
_uniqueids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28049413;
 //BA.debugLineNum = 28049413;BA.debugLine="uniqueIds.Initialize";
_uniqueids.Initialize();
RDebugUtils.currentLine=28049414;
 //BA.debugLineNum = 28049414;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=28049415;
 //BA.debugLineNum = 28049415;BA.debugLine="If schedules.IsInitialized = False Then Return pl";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=28049416;
 //BA.debugLineNum = 28049416;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=28049417;
 //BA.debugLineNum = 28049417;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28049418;
 //BA.debugLineNum = 28049418;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=28049419;
 //BA.debugLineNum = 28049419;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=28049420;
 //BA.debugLineNum = 28049420;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=28049421;
 //BA.debugLineNum = 28049421;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group13 = _slots;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_slotobject = group13.Get(index13);
RDebugUtils.currentLine=28049422;
 //BA.debugLineNum = 28049422;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28049423;
 //BA.debugLineNum = 28049423;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=28049424;
 //BA.debugLineNum = 28049424;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=28049425;
 //BA.debugLineNum = 28049425;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=28049426;
 //BA.debugLineNum = 28049426;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=28049427;
 //BA.debugLineNum = 28049427;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group19 = _playlists;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistobject = group19.Get(index19);
RDebugUtils.currentLine=28049428;
 //BA.debugLineNum = 28049428;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=28049429;
 //BA.debugLineNum = 28049429;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=28049430;
 //BA.debugLineNum = 28049430;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=28049431;
 //BA.debugLineNum = 28049431;BA.debugLine="If playlistId <> \"\" And uniqueIds.ContainsK";
if ((_playlistid).equals("") == false && _uniqueids.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=28049432;
 //BA.debugLineNum = 28049432;BA.debugLine="uniqueIds.Put(playlistId, True)";
_uniqueids.Put((Object)(_playlistid),(Object)(__c.True));
RDebugUtils.currentLine=28049433;
 //BA.debugLineNum = 28049433;BA.debugLine="playlistIds.Add(playlistId)";
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
RDebugUtils.currentLine=28049441;
 //BA.debugLineNum = 28049441;BA.debugLine="Return playlistIds";
if (true) return _playlistids;
RDebugUtils.currentLine=28049442;
 //BA.debugLineNum = 28049442;BA.debugLine="End Sub";
return null;
}
public int  _getofflineschedulescount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineschedulescount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineschedulescount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _schedules = null;
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Private Sub GetOfflineSchedulesCount(data As Map)";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=28180483;
 //BA.debugLineNum = 28180483;BA.debugLine="If schedules.IsInitialized = False Then Return 0";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28180484;
 //BA.debugLineNum = 28180484;BA.debugLine="Return schedules.Size";
if (true) return _schedules.getSize();
RDebugUtils.currentLine=28180485;
 //BA.debugLineNum = 28180485;BA.debugLine="End Sub";
return 0;
}
public int  _getplaylisttrackcount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getplaylisttrackcount", false))
	 {return ((Integer) Debug.delegate(ba, "getplaylisttrackcount", new Object[] {_playlistdata}));}
anywheresoftware.b4a.objects.collections.List _tracks = null;
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Private Sub GetPlaylistTrackCount(playlistData As";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=28508163;
 //BA.debugLineNum = 28508163;BA.debugLine="If tracks.IsInitialized = False Then Return 0";
if (_tracks.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=28508164;
 //BA.debugLineNum = 28508164;BA.debugLine="Return tracks.Size";
if (true) return _tracks.getSize();
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="End Sub";
return 0;
}
public String  _trace(b4j.example.offlinestore __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflinedata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _sourcedata,String _playercode,String _deviceid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflinedata", new Object[] {_sourcedata,_playercode,_deviceid}));}
anywheresoftware.b4a.objects.collections.Map _normalizeddata = null;
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Private Sub NormalizeOfflineData(sourceData As Map";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="Dim normalizedData As Map";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="normalizedData.Initialize";
_normalizeddata.Initialize();
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="normalizedData.Put(\"ok\", sourceData.GetDefault(\"o";
_normalizeddata.Put((Object)("ok"),_sourcedata.GetDefault((Object)("ok"),(Object)(__c.False)));
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="normalizedData.Put(\"type\", sourceData.GetDefault(";
_normalizeddata.Put((Object)("type"),_sourcedata.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=27983877;
 //BA.debugLineNum = 27983877;BA.debugLine="normalizedData.Put(\"updated\", sourceData.GetDefau";
_normalizeddata.Put((Object)("updated"),_sourcedata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=27983878;
 //BA.debugLineNum = 27983878;BA.debugLine="normalizedData.Put(\"saved_at\", DateTime.Now)";
_normalizeddata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=27983879;
 //BA.debugLineNum = 27983879;BA.debugLine="normalizedData.Put(\"player_code\", playerCode)";
_normalizeddata.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=27983880;
 //BA.debugLineNum = 27983880;BA.debugLine="normalizedData.Put(\"device_id\", deviceId)";
_normalizeddata.Put((Object)("device_id"),(Object)(_deviceid));
RDebugUtils.currentLine=27983881;
 //BA.debugLineNum = 27983881;BA.debugLine="If sourceData.ContainsKey(\"player\") Then normaliz";
if (_sourcedata.ContainsKey((Object)("player"))) { 
_normalizeddata.Put((Object)("player"),_sourcedata.Get((Object)("player")));};
RDebugUtils.currentLine=27983882;
 //BA.debugLineNum = 27983882;BA.debugLine="If sourceData.ContainsKey(\"ads\") Then normalizedD";
if (_sourcedata.ContainsKey((Object)("ads"))) { 
_normalizeddata.Put((Object)("ads"),_sourcedata.Get((Object)("ads")));};
RDebugUtils.currentLine=27983883;
 //BA.debugLineNum = 27983883;BA.debugLine="If sourceData.ContainsKey(\"schedules\") Then norma";
if (_sourcedata.ContainsKey((Object)("schedules"))) { 
_normalizeddata.Put((Object)("schedules"),_sourcedata.Get((Object)("schedules")));};
RDebugUtils.currentLine=27983884;
 //BA.debugLineNum = 27983884;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=27983885;
 //BA.debugLineNum = 27983885;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflineplaylistdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflineplaylistdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflineplaylistdata", new Object[] {_descriptor,_playlistdata}));}
anywheresoftware.b4a.objects.collections.Map _normalizedplaylistdata = null;
String _key = "";
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Private Sub NormalizeOfflinePlaylistData(descripto";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="Dim normalizedPlaylistData As Map";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="normalizedPlaylistData.Initialize";
_normalizedplaylistdata.Initialize();
RDebugUtils.currentLine=28442627;
 //BA.debugLineNum = 28442627;BA.debugLine="For Each key As String In playlistData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _playlistdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=28442628;
 //BA.debugLineNum = 28442628;BA.debugLine="normalizedPlaylistData.Put(key, playlistData.Get";
_normalizedplaylistdata.Put((Object)(_key),_playlistdata.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=28442630;
 //BA.debugLineNum = 28442630;BA.debugLine="normalizedPlaylistData.Put(\"id\", descriptor.GetDe";
_normalizedplaylistdata.Put((Object)("id"),_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=28442631;
 //BA.debugLineNum = 28442631;BA.debugLine="normalizedPlaylistData.Put(\"required_updated\", de";
_normalizedplaylistdata.Put((Object)("required_updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=28442632;
 //BA.debugLineNum = 28442632;BA.debugLine="normalizedPlaylistData.Put(\"saved_at\", DateTime.N";
_normalizedplaylistdata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=28442633;
 //BA.debugLineNum = 28442633;BA.debugLine="Return normalizedPlaylistData";
if (true) return _normalizedplaylistdata;
RDebugUtils.currentLine=28442634;
 //BA.debugLineNum = 28442634;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadatafilename(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Public Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="End Sub";
return "";
}
public String  _writeofflineplaylistrequirementsfile(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _descriptors,String _playercode) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "writeofflineplaylistrequirementsfile", false))
	 {return ((String) Debug.delegate(ba, "writeofflineplaylistrequirementsfile", new Object[] {_descriptors,_playercode}));}
anywheresoftware.b4a.objects.collections.Map _payload = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _generator = null;
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Private Sub WriteOfflinePlaylistRequirementsFile(d";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Dim payload As Map";
_payload = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="payload.Initialize";
_payload.Initialize();
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="payload.Put(\"saved_at\", DateTime.Now)";
_payload.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="payload.Put(\"player_code\", playerCode)";
_payload.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=28377093;
 //BA.debugLineNum = 28377093;BA.debugLine="payload.Put(\"descriptors\", descriptors)";
_payload.Put((Object)("descriptors"),(Object)(_descriptors.getObject()));
RDebugUtils.currentLine=28377094;
 //BA.debugLineNum = 28377094;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=28377095;
 //BA.debugLineNum = 28377095;BA.debugLine="generator.Initialize(payload)";
_generator.Initialize(_payload);
RDebugUtils.currentLine=28377096;
 //BA.debugLineNum = 28377096;BA.debugLine="File.WriteString(storageDir, playlistRequirements";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._playlistrequirementsfilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=28377097;
 //BA.debugLineNum = 28377097;BA.debugLine="End Sub";
return "";
}
}