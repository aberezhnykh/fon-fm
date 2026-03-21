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
public String _offlinedatafilename = "";
public String _offlineplaylistrequirementsfilename = "";
public String _offlineplaylistsdirname = "";
public String _playlistcdnbaseurl = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _playlistmetadataurl(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadataurl", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadataurl", new Object[] {_playlistid}));}
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Public Sub PlaylistMetadataUrl(playlistId As Strin";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="Return playlistCdnBaseUrl & playlistId & \".json\"";
if (true) return __ref._playlistcdnbaseurl /*String*/ +_playlistid+".json";
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Public Sub SavePlaylistMetadata(descriptor As Map,";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="EnsureDirectory(GetOfflinePlaylistsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getofflineplaylistsdir /*String*/ (null));
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=36569091;
 //BA.debugLineNum = 36569091;BA.debugLine="Dim normalizedPlaylistData As Map = NormalizeOffl";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
_normalizedplaylistdata = __ref._normalizeofflineplaylistdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_descriptor,_playlistdata);
RDebugUtils.currentLine=36569092;
 //BA.debugLineNum = 36569092;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=36569093;
 //BA.debugLineNum = 36569093;BA.debugLine="generator.Initialize(normalizedPlaylistData)";
_generator.Initialize(_normalizedplaylistdata);
RDebugUtils.currentLine=36569094;
 //BA.debugLineNum = 36569094;BA.debugLine="File.WriteString(GetOfflinePlaylistsDir, Playlist";
__c.File.WriteString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid),_generator.ToString());
RDebugUtils.currentLine=36569095;
 //BA.debugLineNum = 36569095;BA.debugLine="Dim cachedEntry As Map";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36569096;
 //BA.debugLineNum = 36569096;BA.debugLine="cachedEntry.Initialize";
_cachedentry.Initialize();
RDebugUtils.currentLine=36569097;
 //BA.debugLineNum = 36569097;BA.debugLine="cachedEntry.Put(\"id\", playlistId)";
_cachedentry.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=36569098;
 //BA.debugLineNum = 36569098;BA.debugLine="cachedEntry.Put(\"updated\", descriptor.GetDefault(";
_cachedentry.Put((Object)("updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=36569099;
 //BA.debugLineNum = 36569099;BA.debugLine="cachedEntry.Put(\"saved_at\", DateTime.Now)";
_cachedentry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=36569100;
 //BA.debugLineNum = 36569100;BA.debugLine="cachedEntry.Put(\"title\", descriptor.GetDefault(\"t";
_cachedentry.Put((Object)("title"),_descriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=36569101;
 //BA.debugLineNum = 36569101;BA.debugLine="cachedEntry.Put(\"track_count\", GetPlaylistTrackCo";
_cachedentry.Put((Object)("track_count"),(Object)(__ref._getplaylisttrackcount /*int*/ (null,_normalizedplaylistdata)));
RDebugUtils.currentLine=36569102;
 //BA.debugLineNum = 36569102;BA.debugLine="cachedPlaylistIndex.Put(playlistId, cachedEntry)";
_cachedplaylistindex.Put((Object)(_playlistid),(Object)(_cachedentry.getObject()));
RDebugUtils.currentLine=36569103;
 //BA.debugLineNum = 36569103;BA.debugLine="Trace(\"Playlist metadata сохранен. id=\" & playlis";
__ref._trace /*String*/ (null,"Playlist metadata сохранен. id="+_playlistid+", tracks="+BA.ObjectToString(_cachedentry.GetDefault((Object)("track_count"),(Object)(0)))+", updated="+BA.ObjectToString(_cachedentry.GetDefault((Object)("updated"),(Object)(""))));
RDebugUtils.currentLine=36569104;
 //BA.debugLineNum = 36569104;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedplaylistindex(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getcachedplaylistindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedplaylistindex", null));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Public Sub GetCachedPlaylistIndex As Map";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="Return storage.GetDefault(\"cached_playlist_index\"";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="End Sub";
return null;
}
public String  _savecachedplaylistindex(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "savecachedplaylistindex", false))
	 {return ((String) Debug.delegate(ba, "savecachedplaylistindex", new Object[] {_cachedplaylistindex}));}
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Public Sub SaveCachedPlaylistIndex(cachedPlaylistI";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayli";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.offlinestore __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4j.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _offlinedatafilenamevalue,String _offlineplaylistrequirementsfilenamevalue,String _offlineplaylistsdirnamevalue,String _playlistcdnbaseurlvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_storagevalue,_targetmodulevalue,_tracesubnamevalue,_offlinedatafilenamevalue,_offlineplaylistrequirementsfilenamevalue,_offlineplaylistsdirnamevalue,_playlistcdnbaseurlvalue}));}
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="storage = storageValue";
__ref._storage /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=36044804;
 //BA.debugLineNum = 36044804;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="offlineDataFileName = offlineDataFileNameValue";
__ref._offlinedatafilename /*String*/  = _offlinedatafilenamevalue;
RDebugUtils.currentLine=36044806;
 //BA.debugLineNum = 36044806;BA.debugLine="offlinePlaylistRequirementsFileName = offlinePlay";
__ref._offlineplaylistrequirementsfilename /*String*/  = _offlineplaylistrequirementsfilenamevalue;
RDebugUtils.currentLine=36044807;
 //BA.debugLineNum = 36044807;BA.debugLine="offlinePlaylistsDirName = offlinePlaylistsDirName";
__ref._offlineplaylistsdirname /*String*/  = _offlineplaylistsdirnamevalue;
RDebugUtils.currentLine=36044808;
 //BA.debugLineNum = 36044808;BA.debugLine="playlistCdnBaseUrl = playlistCdnBaseUrlValue";
__ref._playlistcdnbaseurl /*String*/  = _playlistcdnbaseurlvalue;
RDebugUtils.currentLine=36044809;
 //BA.debugLineNum = 36044809;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Public Sub LoadOfflineData As Map";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="If File.Exists(storageDir, offlineDataFileName) =";
if (__c.File.Exists(__ref._storagedir /*String*/ ,__ref._offlinedatafilename /*String*/ )==__c.False) { 
if (true) return _data;};
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="Try";
try {RDebugUtils.currentLine=36110341;
 //BA.debugLineNum = 36110341;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="parser.Initialize(File.ReadString(storageDir, of";
_parser.Initialize(__c.File.ReadString(__ref._storagedir /*String*/ ,__ref._offlinedatafilename /*String*/ ));
RDebugUtils.currentLine=36110343;
 //BA.debugLineNum = 36110343;BA.debugLine="Dim parsed As Map = parser.NextObject";
_parsed = new anywheresoftware.b4a.objects.collections.Map();
_parsed = _parser.NextObject();
RDebugUtils.currentLine=36110344;
 //BA.debugLineNum = 36110344;BA.debugLine="If parsed.IsInitialized Then";
if (_parsed.IsInitialized()) { 
RDebugUtils.currentLine=36110345;
 //BA.debugLineNum = 36110345;BA.debugLine="data = parsed";
_data = _parsed;
RDebugUtils.currentLine=36110346;
 //BA.debugLineNum = 36110346;BA.debugLine="Trace(\"Офлайн-метаданные загружены. playlists=\"";
__ref._trace /*String*/ (null,"Офлайн-метаданные загружены. playlists="+BA.NumberToString(__ref._getofflineplaylistids /*anywheresoftware.b4a.objects.collections.List*/ (null,_data).getSize())+", ads="+BA.NumberToString(__ref._getofflineadscount /*int*/ (null,_data))+", schedules="+BA.NumberToString(__ref._getofflineschedulescount /*int*/ (null,_data)));
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=36110349;
 //BA.debugLineNum = 36110349;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=36110350;
 //BA.debugLineNum = 36110350;BA.debugLine="Trace(\"Не удалось загрузить offline_data.json. \"";
__ref._trace /*String*/ (null,"Не удалось загрузить offline_data.json. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=36110352;
 //BA.debugLineNum = 36110352;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=36110353;
 //BA.debugLineNum = 36110353;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Public Sub SaveOfflineData(sourceData As Map, play";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="Dim normalizedData As Map = NormalizeOfflineData(";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
_normalizeddata = __ref._normalizeofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sourcedata,_playercode,_deviceid);
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="Dim offlineDataUpdatedAt As Long = DateTime.Now";
_offlinedataupdatedat = __c.DateTime.getNow();
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="storage.Put(\"offline_data_updated_at\", offlineDat";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_data_updated_at",(Object)(_offlinedataupdatedat));
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="storage.Put(\"offline_data_source_updated\", normal";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_data_source_updated",_normalizeddata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="Dim playlistIds As List = GetOfflinePlaylistIds(n";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
_playlistids = __ref._getofflineplaylistids /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=36175878;
 //BA.debugLineNum = 36175878;BA.debugLine="Dim playlistDescriptors As List = BuildOfflinePla";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = __ref._buildofflineplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=36175879;
 //BA.debugLineNum = 36175879;BA.debugLine="Dim playlistCacheStatus As Map = CompareOfflinePl";
_playlistcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_playlistcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=36175880;
 //BA.debugLineNum = 36175880;BA.debugLine="storage.Put(\"offline_playlist_ids\", playlistIds)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_ids",(Object)(_playlistids.getObject()));
RDebugUtils.currentLine=36175881;
 //BA.debugLineNum = 36175881;BA.debugLine="storage.Put(\"offline_playlist_descriptors\", playl";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_descriptors",(Object)(_playlistdescriptors.getObject()));
RDebugUtils.currentLine=36175882;
 //BA.debugLineNum = 36175882;BA.debugLine="storage.Put(\"offline_playlist_download_ids\", play";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_download_ids",_playlistcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=36175883;
 //BA.debugLineNum = 36175883;BA.debugLine="storage.Put(\"offline_playlist_missing_count\", pla";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_missing_count",_playlistcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=36175884;
 //BA.debugLineNum = 36175884;BA.debugLine="storage.Put(\"offline_playlist_outdated_count\", pl";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_outdated_count",_playlistcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=36175885;
 //BA.debugLineNum = 36175885;BA.debugLine="storage.Put(\"offline_playlist_actual_count\", play";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_actual_count",_playlistcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=36175886;
 //BA.debugLineNum = 36175886;BA.debugLine="storage.Put(\"offline_ads_count\", GetOfflineAdsCou";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_ads_count",(Object)(__ref._getofflineadscount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=36175887;
 //BA.debugLineNum = 36175887;BA.debugLine="storage.Put(\"offline_schedules_count\", GetOffline";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_schedules_count",(Object)(__ref._getofflineschedulescount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=36175888;
 //BA.debugLineNum = 36175888;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=36175889;
 //BA.debugLineNum = 36175889;BA.debugLine="generator.Initialize(normalizedData)";
_generator.Initialize(_normalizeddata);
RDebugUtils.currentLine=36175890;
 //BA.debugLineNum = 36175890;BA.debugLine="File.WriteString(storageDir, offlineDataFileName,";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._offlinedatafilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=36175891;
 //BA.debugLineNum = 36175891;BA.debugLine="WriteOfflinePlaylistRequirementsFile(playlistDesc";
__ref._writeofflineplaylistrequirementsfile /*String*/ (null,_playlistdescriptors,_playercode);
RDebugUtils.currentLine=36175892;
 //BA.debugLineNum = 36175892;BA.debugLine="Trace(\"Офлайн-метаданные сохранены. playlists=\" &";
__ref._trace /*String*/ (null,"Офлайн-метаданные сохранены. playlists="+BA.NumberToString(_playlistids.getSize())+", ads="+BA.NumberToString(__ref._getofflineadscount /*int*/ (null,_normalizeddata))+", schedules="+BA.NumberToString(__ref._getofflineschedulescount /*int*/ (null,_normalizeddata))+", missingPlaylists="+BA.ObjectToString(_playlistcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)))+", outdatedPlaylists="+BA.ObjectToString(_playlistcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0))));
RDebugUtils.currentLine=36175893;
 //BA.debugLineNum = 36175893;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=36175894;
 //BA.debugLineNum = 36175894;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getstoredplaylistdescriptors(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getstoredplaylistdescriptors", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getstoredplaylistdescriptors", null));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Public Sub GetStoredPlaylistDescriptors As List";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="Return storage.GetDefault(\"offline_playlist_descr";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"offline_playlist_descriptors",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="End Sub";
return null;
}
public String  _getofflineplaylistsdir(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Public Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="Return File.Combine(storageDir, offlinePlaylistsD";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,__ref._offlineplaylistsdirname /*String*/ );
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Public Sub ResolvePlaylistSyncAction(descriptor As";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="If playlistId = \"\" Then Return \"skip\"";
if ((_playlistid).equals("")) { 
if (true) return "skip";};
RDebugUtils.currentLine=36503555;
 //BA.debugLineNum = 36503555;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId) =";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=36503556;
 //BA.debugLineNum = 36503556;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylistI";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=36503557;
 //BA.debugLineNum = 36503557;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=36503558;
 //BA.debugLineNum = 36503558;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=36503559;
 //BA.debugLineNum = 36503559;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> desc";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
if (true) return "outdated";};
RDebugUtils.currentLine=36503560;
 //BA.debugLineNum = 36503560;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=36503561;
 //BA.debugLineNum = 36503561;BA.debugLine="Return \"skip\"";
if (true) return "skip";
 };
RDebugUtils.currentLine=36503563;
 //BA.debugLineNum = 36503563;BA.debugLine="Return \"missing\"";
if (true) return "missing";
RDebugUtils.currentLine=36503564;
 //BA.debugLineNum = 36503564;BA.debugLine="End Sub";
return "";
}
public String  _refreshplaylistcachestatus(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _playlistdescriptors) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "refreshplaylistcachestatus", false))
	 {return ((String) Debug.delegate(ba, "refreshplaylistcachestatus", new Object[] {_playlistdescriptors}));}
anywheresoftware.b4a.objects.collections.Map _refreshedcachestatus = null;
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Public Sub RefreshPlaylistCacheStatus(playlistDesc";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="Dim refreshedCacheStatus As Map = CompareOfflineP";
_refreshedcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_refreshedcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="storage.Put(\"offline_playlist_download_ids\", refr";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_download_ids",_refreshedcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=36438019;
 //BA.debugLineNum = 36438019;BA.debugLine="storage.Put(\"offline_playlist_missing_count\", ref";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_missing_count",_refreshedcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=36438020;
 //BA.debugLineNum = 36438020;BA.debugLine="storage.Put(\"offline_playlist_outdated_count\", re";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_outdated_count",_refreshedcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="storage.Put(\"offline_playlist_actual_count\", refr";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"offline_playlist_actual_count",_refreshedcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=36438022;
 //BA.debugLineNum = 36438022;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Private Sub BuildOfflinePlaylistDescriptors(data A";
RDebugUtils.currentLine=37093377;
 //BA.debugLineNum = 37093377;BA.debugLine="Dim descriptors As List";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="descriptors.Initialize";
_descriptors.Initialize();
RDebugUtils.currentLine=37093379;
 //BA.debugLineNum = 37093379;BA.debugLine="If data.IsInitialized = False Then Return descrip";
if (_data.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=37093380;
 //BA.debugLineNum = 37093380;BA.debugLine="Dim uniqueDescriptors As Map";
_uniquedescriptors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37093381;
 //BA.debugLineNum = 37093381;BA.debugLine="uniqueDescriptors.Initialize";
_uniquedescriptors.Initialize();
RDebugUtils.currentLine=37093382;
 //BA.debugLineNum = 37093382;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=37093383;
 //BA.debugLineNum = 37093383;BA.debugLine="If schedules.IsInitialized = False Then Return de";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=37093384;
 //BA.debugLineNum = 37093384;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=37093385;
 //BA.debugLineNum = 37093385;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=37093386;
 //BA.debugLineNum = 37093386;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=37093387;
 //BA.debugLineNum = 37093387;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=37093388;
 //BA.debugLineNum = 37093388;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=37093389;
 //BA.debugLineNum = 37093389;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=37093390;
 //BA.debugLineNum = 37093390;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group14 = _slots;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_slotobject = group14.Get(index14);
RDebugUtils.currentLine=37093391;
 //BA.debugLineNum = 37093391;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=37093392;
 //BA.debugLineNum = 37093392;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=37093393;
 //BA.debugLineNum = 37093393;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=37093394;
 //BA.debugLineNum = 37093394;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=37093395;
 //BA.debugLineNum = 37093395;BA.debugLine="Dim streamId As String = streamData.GetDefaul";
_streamid = BA.ObjectToString(_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=37093396;
 //BA.debugLineNum = 37093396;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=37093397;
 //BA.debugLineNum = 37093397;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=37093398;
 //BA.debugLineNum = 37093398;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=37093399;
 //BA.debugLineNum = 37093399;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group23 = _playlists;
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_playlistobject = group23.Get(index23);
RDebugUtils.currentLine=37093400;
 //BA.debugLineNum = 37093400;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=37093401;
 //BA.debugLineNum = 37093401;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=37093402;
 //BA.debugLineNum = 37093402;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=37093403;
 //BA.debugLineNum = 37093403;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=37093404;
 //BA.debugLineNum = 37093404;BA.debugLine="If uniqueDescriptors.ContainsKey(playlistId";
if (_uniquedescriptors.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
RDebugUtils.currentLine=37093405;
 //BA.debugLineNum = 37093405;BA.debugLine="Dim descriptor As Map";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37093406;
 //BA.debugLineNum = 37093406;BA.debugLine="descriptor.Initialize";
_descriptor.Initialize();
RDebugUtils.currentLine=37093407;
 //BA.debugLineNum = 37093407;BA.debugLine="descriptor.Put(\"id\", playlistId)";
_descriptor.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=37093408;
 //BA.debugLineNum = 37093408;BA.debugLine="descriptor.Put(\"updated\", playlist.GetDefau";
_descriptor.Put((Object)("updated"),_playlist.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=37093409;
 //BA.debugLineNum = 37093409;BA.debugLine="descriptor.Put(\"title\", playlist.GetDefault";
_descriptor.Put((Object)("title"),_playlist.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=37093410;
 //BA.debugLineNum = 37093410;BA.debugLine="descriptor.Put(\"schedule_title\", scheduleTi";
_descriptor.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=37093411;
 //BA.debugLineNum = 37093411;BA.debugLine="descriptor.Put(\"slot_time\", slotTime)";
_descriptor.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=37093412;
 //BA.debugLineNum = 37093412;BA.debugLine="descriptor.Put(\"stream_id\", streamId)";
_descriptor.Put((Object)("stream_id"),(Object)(_streamid));
RDebugUtils.currentLine=37093413;
 //BA.debugLineNum = 37093413;BA.debugLine="descriptor.Put(\"stream_title\", streamTitle)";
_descriptor.Put((Object)("stream_title"),(Object)(_streamtitle));
RDebugUtils.currentLine=37093414;
 //BA.debugLineNum = 37093414;BA.debugLine="uniqueDescriptors.Put(playlistId, descripto";
_uniquedescriptors.Put((Object)(_playlistid),(Object)(_descriptor.getObject()));
RDebugUtils.currentLine=37093415;
 //BA.debugLineNum = 37093415;BA.debugLine="descriptors.Add(descriptor)";
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
RDebugUtils.currentLine=37093422;
 //BA.debugLineNum = 37093422;BA.debugLine="Return descriptors";
if (true) return _descriptors;
RDebugUtils.currentLine=37093423;
 //BA.debugLineNum = 37093423;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=37421059;
 //BA.debugLineNum = 37421059;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=37421060;
 //BA.debugLineNum = 37421060;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=37421061;
 //BA.debugLineNum = 37421061;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=37421062;
 //BA.debugLineNum = 37421062;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=37421063;
 //BA.debugLineNum = 37421063;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=37421065;
 //BA.debugLineNum = 37421065;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=37421066;
 //BA.debugLineNum = 37421066;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=37421067;
 //BA.debugLineNum = 37421067;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=37421068;
 //BA.debugLineNum = 37421068;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=35979268;
 //BA.debugLineNum = 35979268;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=35979269;
 //BA.debugLineNum = 35979269;BA.debugLine="Private offlineDataFileName As String";
_offlinedatafilename = "";
RDebugUtils.currentLine=35979270;
 //BA.debugLineNum = 35979270;BA.debugLine="Private offlinePlaylistRequirementsFileName As St";
_offlineplaylistrequirementsfilename = "";
RDebugUtils.currentLine=35979271;
 //BA.debugLineNum = 35979271;BA.debugLine="Private offlinePlaylistsDirName As String";
_offlineplaylistsdirname = "";
RDebugUtils.currentLine=35979272;
 //BA.debugLineNum = 35979272;BA.debugLine="Private playlistCdnBaseUrl As String";
_playlistcdnbaseurl = "";
RDebugUtils.currentLine=35979273;
 //BA.debugLineNum = 35979273;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Private Sub CompareOfflinePlaylistsWithCache(descr";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=37158915;
 //BA.debugLineNum = 37158915;BA.debugLine="Dim downloadIds As List";
_downloadids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37158916;
 //BA.debugLineNum = 37158916;BA.debugLine="downloadIds.Initialize";
_downloadids.Initialize();
RDebugUtils.currentLine=37158917;
 //BA.debugLineNum = 37158917;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=37158918;
 //BA.debugLineNum = 37158918;BA.debugLine="Dim missingCount As Int = 0";
_missingcount = (int) (0);
RDebugUtils.currentLine=37158919;
 //BA.debugLineNum = 37158919;BA.debugLine="Dim outdatedCount As Int = 0";
_outdatedcount = (int) (0);
RDebugUtils.currentLine=37158920;
 //BA.debugLineNum = 37158920;BA.debugLine="Dim actualCount As Int = 0";
_actualcount = (int) (0);
RDebugUtils.currentLine=37158921;
 //BA.debugLineNum = 37158921;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group9 = _descriptors;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_descriptorobject = group9.Get(index9);
RDebugUtils.currentLine=37158922;
 //BA.debugLineNum = 37158922;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=37158923;
 //BA.debugLineNum = 37158923;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=37158924;
 //BA.debugLineNum = 37158924;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=37158925;
 //BA.debugLineNum = 37158925;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=37158926;
 //BA.debugLineNum = 37158926;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId)";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=37158927;
 //BA.debugLineNum = 37158927;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=37158928;
 //BA.debugLineNum = 37158928;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
RDebugUtils.currentLine=37158929;
 //BA.debugLineNum = 37158929;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=37158931;
 //BA.debugLineNum = 37158931;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylis";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=37158932;
 //BA.debugLineNum = 37158932;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=37158933;
 //BA.debugLineNum = 37158933;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=37158934;
 //BA.debugLineNum = 37158934;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> de";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
RDebugUtils.currentLine=37158935;
 //BA.debugLineNum = 37158935;BA.debugLine="outdatedCount = outdatedCount + 1";
_outdatedcount = (int) (_outdatedcount+1);
RDebugUtils.currentLine=37158936;
 //BA.debugLineNum = 37158936;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 }else {
RDebugUtils.currentLine=37158938;
 //BA.debugLineNum = 37158938;BA.debugLine="actualCount = actualCount + 1";
_actualcount = (int) (_actualcount+1);
 };
 }else {
RDebugUtils.currentLine=37158941;
 //BA.debugLineNum = 37158941;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=37158942;
 //BA.debugLineNum = 37158942;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 };
 };
 }
};
RDebugUtils.currentLine=37158946;
 //BA.debugLineNum = 37158946;BA.debugLine="result.Put(\"DownloadIds\", downloadIds)";
_result.Put((Object)("DownloadIds"),(Object)(_downloadids.getObject()));
RDebugUtils.currentLine=37158947;
 //BA.debugLineNum = 37158947;BA.debugLine="result.Put(\"MissingCount\", missingCount)";
_result.Put((Object)("MissingCount"),(Object)(_missingcount));
RDebugUtils.currentLine=37158948;
 //BA.debugLineNum = 37158948;BA.debugLine="result.Put(\"OutdatedCount\", outdatedCount)";
_result.Put((Object)("OutdatedCount"),(Object)(_outdatedcount));
RDebugUtils.currentLine=37158949;
 //BA.debugLineNum = 37158949;BA.debugLine="result.Put(\"ActualCount\", actualCount)";
_result.Put((Object)("ActualCount"),(Object)(_actualcount));
RDebugUtils.currentLine=37158950;
 //BA.debugLineNum = 37158950;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=37158951;
 //BA.debugLineNum = 37158951;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=37617667;
 //BA.debugLineNum = 37617667;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.offlinestore __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=37486596;
 //BA.debugLineNum = 37486596;BA.debugLine="End Sub";
return "";
}
public int  _getofflineadscount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineadscount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineadscount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _ads = null;
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Private Sub GetOfflineAdsCount(data As Map) As Int";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="Dim ads As List = data.GetDefault(\"ads\", Null)";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("ads"),__c.Null)));
RDebugUtils.currentLine=36962307;
 //BA.debugLineNum = 36962307;BA.debugLine="If ads.IsInitialized = False Then Return 0";
if (_ads.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=36962308;
 //BA.debugLineNum = 36962308;BA.debugLine="Return ads.Size";
if (true) return _ads.getSize();
RDebugUtils.currentLine=36962309;
 //BA.debugLineNum = 36962309;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Private Sub GetOfflinePlaylistIds(data As Map) As";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="If data.IsInitialized = False Then Return playlis";
if (_data.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=36896772;
 //BA.debugLineNum = 36896772;BA.debugLine="Dim uniqueIds As Map";
_uniqueids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36896773;
 //BA.debugLineNum = 36896773;BA.debugLine="uniqueIds.Initialize";
_uniqueids.Initialize();
RDebugUtils.currentLine=36896774;
 //BA.debugLineNum = 36896774;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=36896775;
 //BA.debugLineNum = 36896775;BA.debugLine="If schedules.IsInitialized = False Then Return pl";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=36896776;
 //BA.debugLineNum = 36896776;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=36896777;
 //BA.debugLineNum = 36896777;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=36896778;
 //BA.debugLineNum = 36896778;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=36896779;
 //BA.debugLineNum = 36896779;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=36896780;
 //BA.debugLineNum = 36896780;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=36896781;
 //BA.debugLineNum = 36896781;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group13 = _slots;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_slotobject = group13.Get(index13);
RDebugUtils.currentLine=36896782;
 //BA.debugLineNum = 36896782;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=36896783;
 //BA.debugLineNum = 36896783;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=36896784;
 //BA.debugLineNum = 36896784;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=36896785;
 //BA.debugLineNum = 36896785;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=36896786;
 //BA.debugLineNum = 36896786;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=36896787;
 //BA.debugLineNum = 36896787;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group19 = _playlists;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistobject = group19.Get(index19);
RDebugUtils.currentLine=36896788;
 //BA.debugLineNum = 36896788;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=36896789;
 //BA.debugLineNum = 36896789;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=36896790;
 //BA.debugLineNum = 36896790;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=36896791;
 //BA.debugLineNum = 36896791;BA.debugLine="If playlistId <> \"\" And uniqueIds.ContainsK";
if ((_playlistid).equals("") == false && _uniqueids.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=36896792;
 //BA.debugLineNum = 36896792;BA.debugLine="uniqueIds.Put(playlistId, True)";
_uniqueids.Put((Object)(_playlistid),(Object)(__c.True));
RDebugUtils.currentLine=36896793;
 //BA.debugLineNum = 36896793;BA.debugLine="playlistIds.Add(playlistId)";
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
RDebugUtils.currentLine=36896801;
 //BA.debugLineNum = 36896801;BA.debugLine="Return playlistIds";
if (true) return _playlistids;
RDebugUtils.currentLine=36896802;
 //BA.debugLineNum = 36896802;BA.debugLine="End Sub";
return null;
}
public int  _getofflineschedulescount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineschedulescount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineschedulescount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _schedules = null;
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Private Sub GetOfflineSchedulesCount(data As Map)";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="If schedules.IsInitialized = False Then Return 0";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=37027844;
 //BA.debugLineNum = 37027844;BA.debugLine="Return schedules.Size";
if (true) return _schedules.getSize();
RDebugUtils.currentLine=37027845;
 //BA.debugLineNum = 37027845;BA.debugLine="End Sub";
return 0;
}
public int  _getplaylisttrackcount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getplaylisttrackcount", false))
	 {return ((Integer) Debug.delegate(ba, "getplaylisttrackcount", new Object[] {_playlistdata}));}
anywheresoftware.b4a.objects.collections.List _tracks = null;
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Private Sub GetPlaylistTrackCount(playlistData As";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=37355523;
 //BA.debugLineNum = 37355523;BA.debugLine="If tracks.IsInitialized = False Then Return 0";
if (_tracks.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="Return tracks.Size";
if (true) return _tracks.getSize();
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="End Sub";
return 0;
}
public String  _trace(b4j.example.offlinestore __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=37683204;
 //BA.debugLineNum = 37683204;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflinedata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _sourcedata,String _playercode,String _deviceid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflinedata", new Object[] {_sourcedata,_playercode,_deviceid}));}
anywheresoftware.b4a.objects.collections.Map _normalizeddata = null;
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Private Sub NormalizeOfflineData(sourceData As Map";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="Dim normalizedData As Map";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="normalizedData.Initialize";
_normalizeddata.Initialize();
RDebugUtils.currentLine=36831235;
 //BA.debugLineNum = 36831235;BA.debugLine="normalizedData.Put(\"ok\", sourceData.GetDefault(\"o";
_normalizeddata.Put((Object)("ok"),_sourcedata.GetDefault((Object)("ok"),(Object)(__c.False)));
RDebugUtils.currentLine=36831236;
 //BA.debugLineNum = 36831236;BA.debugLine="normalizedData.Put(\"type\", sourceData.GetDefault(";
_normalizeddata.Put((Object)("type"),_sourcedata.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=36831237;
 //BA.debugLineNum = 36831237;BA.debugLine="normalizedData.Put(\"updated\", sourceData.GetDefau";
_normalizeddata.Put((Object)("updated"),_sourcedata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=36831238;
 //BA.debugLineNum = 36831238;BA.debugLine="normalizedData.Put(\"saved_at\", DateTime.Now)";
_normalizeddata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=36831239;
 //BA.debugLineNum = 36831239;BA.debugLine="normalizedData.Put(\"player_code\", playerCode)";
_normalizeddata.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=36831240;
 //BA.debugLineNum = 36831240;BA.debugLine="normalizedData.Put(\"device_id\", deviceId)";
_normalizeddata.Put((Object)("device_id"),(Object)(_deviceid));
RDebugUtils.currentLine=36831241;
 //BA.debugLineNum = 36831241;BA.debugLine="If sourceData.ContainsKey(\"player\") Then normaliz";
if (_sourcedata.ContainsKey((Object)("player"))) { 
_normalizeddata.Put((Object)("player"),_sourcedata.Get((Object)("player")));};
RDebugUtils.currentLine=36831242;
 //BA.debugLineNum = 36831242;BA.debugLine="If sourceData.ContainsKey(\"ads\") Then normalizedD";
if (_sourcedata.ContainsKey((Object)("ads"))) { 
_normalizeddata.Put((Object)("ads"),_sourcedata.Get((Object)("ads")));};
RDebugUtils.currentLine=36831243;
 //BA.debugLineNum = 36831243;BA.debugLine="If sourceData.ContainsKey(\"schedules\") Then norma";
if (_sourcedata.ContainsKey((Object)("schedules"))) { 
_normalizeddata.Put((Object)("schedules"),_sourcedata.Get((Object)("schedules")));};
RDebugUtils.currentLine=36831244;
 //BA.debugLineNum = 36831244;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=36831245;
 //BA.debugLineNum = 36831245;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflineplaylistdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflineplaylistdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflineplaylistdata", new Object[] {_descriptor,_playlistdata}));}
anywheresoftware.b4a.objects.collections.Map _normalizedplaylistdata = null;
String _key = "";
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Private Sub NormalizeOfflinePlaylistData(descripto";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="Dim normalizedPlaylistData As Map";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="normalizedPlaylistData.Initialize";
_normalizedplaylistdata.Initialize();
RDebugUtils.currentLine=37289987;
 //BA.debugLineNum = 37289987;BA.debugLine="For Each key As String In playlistData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _playlistdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=37289988;
 //BA.debugLineNum = 37289988;BA.debugLine="normalizedPlaylistData.Put(key, playlistData.Get";
_normalizedplaylistdata.Put((Object)(_key),_playlistdata.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=37289990;
 //BA.debugLineNum = 37289990;BA.debugLine="normalizedPlaylistData.Put(\"id\", descriptor.GetDe";
_normalizedplaylistdata.Put((Object)("id"),_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=37289991;
 //BA.debugLineNum = 37289991;BA.debugLine="normalizedPlaylistData.Put(\"required_updated\", de";
_normalizedplaylistdata.Put((Object)("required_updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=37289992;
 //BA.debugLineNum = 37289992;BA.debugLine="normalizedPlaylistData.Put(\"saved_at\", DateTime.N";
_normalizedplaylistdata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=37289993;
 //BA.debugLineNum = 37289993;BA.debugLine="Return normalizedPlaylistData";
if (true) return _normalizedplaylistdata;
RDebugUtils.currentLine=37289994;
 //BA.debugLineNum = 37289994;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadatafilename(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Public Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="End Sub";
return "";
}
public String  _writeofflineplaylistrequirementsfile(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _descriptors,String _playercode) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "writeofflineplaylistrequirementsfile", false))
	 {return ((String) Debug.delegate(ba, "writeofflineplaylistrequirementsfile", new Object[] {_descriptors,_playercode}));}
anywheresoftware.b4a.objects.collections.Map _payload = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _generator = null;
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Private Sub WriteOfflinePlaylistRequirementsFile(d";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="Dim payload As Map";
_payload = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="payload.Initialize";
_payload.Initialize();
RDebugUtils.currentLine=37224451;
 //BA.debugLineNum = 37224451;BA.debugLine="payload.Put(\"saved_at\", DateTime.Now)";
_payload.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="payload.Put(\"player_code\", playerCode)";
_payload.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=37224453;
 //BA.debugLineNum = 37224453;BA.debugLine="payload.Put(\"descriptors\", descriptors)";
_payload.Put((Object)("descriptors"),(Object)(_descriptors.getObject()));
RDebugUtils.currentLine=37224454;
 //BA.debugLineNum = 37224454;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=37224455;
 //BA.debugLineNum = 37224455;BA.debugLine="generator.Initialize(payload)";
_generator.Initialize(_payload);
RDebugUtils.currentLine=37224456;
 //BA.debugLineNum = 37224456;BA.debugLine="File.WriteString(storageDir, offlinePlaylistRequi";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._offlineplaylistrequirementsfilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=37224457;
 //BA.debugLineNum = 37224457;BA.debugLine="End Sub";
return "";
}
}