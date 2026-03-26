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
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.collections.List  _getstoredplaylistdescriptors(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getstoredplaylistdescriptors", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getstoredplaylistdescriptors", null));}
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Public Sub GetStoredPlaylistDescriptors As List";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="Return storage.GetDefault(\"playlist_descriptors\",";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"playlist_descriptors",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _loadofflinedata(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "loadofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadofflinedata", null));}
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _parsed = null;
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Public Sub LoadOfflineData As Map";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=45416450;
 //BA.debugLineNum = 45416450;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=45416451;
 //BA.debugLineNum = 45416451;BA.debugLine="If File.Exists(storageDir, playerDataFileName) =";
if (__c.File.Exists(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ )==__c.False) { 
if (true) return _data;};
RDebugUtils.currentLine=45416452;
 //BA.debugLineNum = 45416452;BA.debugLine="Try";
try {RDebugUtils.currentLine=45416453;
 //BA.debugLineNum = 45416453;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=45416454;
 //BA.debugLineNum = 45416454;BA.debugLine="parser.Initialize(File.ReadString(storageDir, pl";
_parser.Initialize(__c.File.ReadString(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ ));
RDebugUtils.currentLine=45416455;
 //BA.debugLineNum = 45416455;BA.debugLine="Dim parsed As Map = parser.NextObject";
_parsed = new anywheresoftware.b4a.objects.collections.Map();
_parsed = _parser.NextObject();
RDebugUtils.currentLine=45416456;
 //BA.debugLineNum = 45416456;BA.debugLine="If parsed.IsInitialized Then";
if (_parsed.IsInitialized()) { 
RDebugUtils.currentLine=45416457;
 //BA.debugLineNum = 45416457;BA.debugLine="data = parsed";
_data = _parsed;
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=45416460;
 //BA.debugLineNum = 45416460;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=45416461;
 //BA.debugLineNum = 45416461;BA.debugLine="Trace(\"данные плеера load ошибка message=\" & Las";
__ref._trace /*String*/ (null,"данные плеера load ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=45416463;
 //BA.debugLineNum = 45416463;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=45416464;
 //BA.debugLineNum = 45416464;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadataurl(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadataurl", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadataurl", new Object[] {_playlistid}));}
RDebugUtils.currentLine=46071808;
 //BA.debugLineNum = 46071808;BA.debugLine="Public Sub PlaylistMetadataUrl(playlistId As Strin";
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="Return playlistCdnBaseUrl & playlistId & \".json\"";
if (true) return __ref._playlistcdnbaseurl /*String*/ +_playlistid+".json";
RDebugUtils.currentLine=46071810;
 //BA.debugLineNum = 46071810;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45875200;
 //BA.debugLineNum = 45875200;BA.debugLine="Public Sub SavePlaylistMetadata(descriptor As Map,";
RDebugUtils.currentLine=45875201;
 //BA.debugLineNum = 45875201;BA.debugLine="EnsureDirectory(GetOfflinePlaylistsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getofflineplaylistsdir /*String*/ (null));
RDebugUtils.currentLine=45875202;
 //BA.debugLineNum = 45875202;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=45875203;
 //BA.debugLineNum = 45875203;BA.debugLine="Dim normalizedPlaylistData As Map = NormalizeOffl";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
_normalizedplaylistdata = __ref._normalizeofflineplaylistdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_descriptor,_playlistdata);
RDebugUtils.currentLine=45875204;
 //BA.debugLineNum = 45875204;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=45875205;
 //BA.debugLineNum = 45875205;BA.debugLine="generator.Initialize(normalizedPlaylistData)";
_generator.Initialize(_normalizedplaylistdata);
RDebugUtils.currentLine=45875206;
 //BA.debugLineNum = 45875206;BA.debugLine="File.WriteString(GetOfflinePlaylistsDir, Playlist";
__c.File.WriteString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid),_generator.ToString());
RDebugUtils.currentLine=45875207;
 //BA.debugLineNum = 45875207;BA.debugLine="Dim cachedEntry As Map";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=45875208;
 //BA.debugLineNum = 45875208;BA.debugLine="cachedEntry.Initialize";
_cachedentry.Initialize();
RDebugUtils.currentLine=45875209;
 //BA.debugLineNum = 45875209;BA.debugLine="cachedEntry.Put(\"id\", playlistId)";
_cachedentry.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=45875210;
 //BA.debugLineNum = 45875210;BA.debugLine="cachedEntry.Put(\"updated\", descriptor.GetDefault(";
_cachedentry.Put((Object)("updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=45875211;
 //BA.debugLineNum = 45875211;BA.debugLine="cachedEntry.Put(\"saved_at\", DateTime.Now)";
_cachedentry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=45875212;
 //BA.debugLineNum = 45875212;BA.debugLine="cachedEntry.Put(\"title\", descriptor.GetDefault(\"t";
_cachedentry.Put((Object)("title"),_descriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=45875213;
 //BA.debugLineNum = 45875213;BA.debugLine="cachedEntry.Put(\"track_count\", GetPlaylistTrackCo";
_cachedentry.Put((Object)("track_count"),(Object)(__ref._getplaylisttrackcount /*int*/ (null,_normalizedplaylistdata)));
RDebugUtils.currentLine=45875214;
 //BA.debugLineNum = 45875214;BA.debugLine="cachedPlaylistIndex.Put(playlistId, cachedEntry)";
_cachedplaylistindex.Put((Object)(_playlistid),(Object)(_cachedentry.getObject()));
RDebugUtils.currentLine=45875215;
 //BA.debugLineNum = 45875215;BA.debugLine="InvalidatePlaylistPlaybackOrder(playlistId)";
__ref._invalidateplaylistplaybackorder /*String*/ (null,_playlistid);
RDebugUtils.currentLine=45875216;
 //BA.debugLineNum = 45875216;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.offlinestore __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4j.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _playerdatafilenamevalue,String _playlistrequirementsfilenamevalue,String _playlistsdirnamevalue,String _playlistcdnbaseurlvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_storagevalue,_targetmodulevalue,_tracesubnamevalue,_playerdatafilenamevalue,_playlistrequirementsfilenamevalue,_playlistsdirnamevalue,_playlistcdnbaseurlvalue}));}
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="storage = storageValue";
__ref._storage /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=45350915;
 //BA.debugLineNum = 45350915;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=45350916;
 //BA.debugLineNum = 45350916;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=45350917;
 //BA.debugLineNum = 45350917;BA.debugLine="playerDataFileName = playerDataFileNameValue";
__ref._playerdatafilename /*String*/  = _playerdatafilenamevalue;
RDebugUtils.currentLine=45350918;
 //BA.debugLineNum = 45350918;BA.debugLine="playlistRequirementsFileName = playlistRequiremen";
__ref._playlistrequirementsfilename /*String*/  = _playlistrequirementsfilenamevalue;
RDebugUtils.currentLine=45350919;
 //BA.debugLineNum = 45350919;BA.debugLine="playlistsDirName = playlistsDirNameValue";
__ref._playlistsdirname /*String*/  = _playlistsdirnamevalue;
RDebugUtils.currentLine=45350920;
 //BA.debugLineNum = 45350920;BA.debugLine="playlistCdnBaseUrl = playlistCdnBaseUrlValue";
__ref._playlistcdnbaseurl /*String*/  = _playlistcdnbaseurlvalue;
RDebugUtils.currentLine=45350921;
 //BA.debugLineNum = 45350921;BA.debugLine="End Sub";
return "";
}
public String  _getofflineplaylistsdir(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=45940736;
 //BA.debugLineNum = 45940736;BA.debugLine="Public Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=45940737;
 //BA.debugLineNum = 45940737;BA.debugLine="Return File.Combine(storageDir, playlistsDirName)";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,__ref._playlistsdirname /*String*/ );
RDebugUtils.currentLine=45940738;
 //BA.debugLineNum = 45940738;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedplaylistindex(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getcachedplaylistindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedplaylistindex", null));}
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Public Sub GetCachedPlaylistIndex As Map";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="Return storage.GetDefault(\"cached_playlist_index\"";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=45613058;
 //BA.debugLineNum = 45613058;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45809664;
 //BA.debugLineNum = 45809664;BA.debugLine="Public Sub ResolvePlaylistSyncAction(descriptor As";
RDebugUtils.currentLine=45809665;
 //BA.debugLineNum = 45809665;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=45809666;
 //BA.debugLineNum = 45809666;BA.debugLine="If playlistId = \"\" Then Return \"skip\"";
if ((_playlistid).equals("")) { 
if (true) return "skip";};
RDebugUtils.currentLine=45809667;
 //BA.debugLineNum = 45809667;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId) =";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=45809668;
 //BA.debugLineNum = 45809668;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylistI";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=45809669;
 //BA.debugLineNum = 45809669;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=45809670;
 //BA.debugLineNum = 45809670;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=45809671;
 //BA.debugLineNum = 45809671;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> desc";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
if (true) return "outdated";};
RDebugUtils.currentLine=45809672;
 //BA.debugLineNum = 45809672;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return "missing";};
RDebugUtils.currentLine=45809673;
 //BA.debugLineNum = 45809673;BA.debugLine="Return \"skip\"";
if (true) return "skip";
 };
RDebugUtils.currentLine=45809675;
 //BA.debugLineNum = 45809675;BA.debugLine="Return \"missing\"";
if (true) return "missing";
RDebugUtils.currentLine=45809676;
 //BA.debugLineNum = 45809676;BA.debugLine="End Sub";
return "";
}
public String  _savecachedplaylistindex(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "savecachedplaylistindex", false))
	 {return ((String) Debug.delegate(ba, "savecachedplaylistindex", new Object[] {_cachedplaylistindex}));}
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Public Sub SaveCachedPlaylistIndex(cachedPlaylistI";
RDebugUtils.currentLine=45678593;
 //BA.debugLineNum = 45678593;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayli";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
RDebugUtils.currentLine=45678594;
 //BA.debugLineNum = 45678594;BA.debugLine="End Sub";
return "";
}
public String  _refreshplaylistcachestatus(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _playlistdescriptors) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "refreshplaylistcachestatus", false))
	 {return ((String) Debug.delegate(ba, "refreshplaylistcachestatus", new Object[] {_playlistdescriptors}));}
anywheresoftware.b4a.objects.collections.Map _refreshedcachestatus = null;
RDebugUtils.currentLine=45744128;
 //BA.debugLineNum = 45744128;BA.debugLine="Public Sub RefreshPlaylistCacheStatus(playlistDesc";
RDebugUtils.currentLine=45744129;
 //BA.debugLineNum = 45744129;BA.debugLine="Dim refreshedCacheStatus As Map = CompareOfflineP";
_refreshedcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_refreshedcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=45744130;
 //BA.debugLineNum = 45744130;BA.debugLine="storage.Put(\"playlist_download_ids\", refreshedCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_download_ids",_refreshedcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=45744131;
 //BA.debugLineNum = 45744131;BA.debugLine="storage.Put(\"playlist_missing_count\", refreshedCa";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_missing_count",_refreshedcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=45744132;
 //BA.debugLineNum = 45744132;BA.debugLine="storage.Put(\"playlist_outdated_count\", refreshedC";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_outdated_count",_refreshedcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=45744133;
 //BA.debugLineNum = 45744133;BA.debugLine="storage.Put(\"playlist_actual_count\", refreshedCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_actual_count",_refreshedcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=45744134;
 //BA.debugLineNum = 45744134;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46399488;
 //BA.debugLineNum = 46399488;BA.debugLine="Private Sub BuildOfflinePlaylistDescriptors(data A";
RDebugUtils.currentLine=46399489;
 //BA.debugLineNum = 46399489;BA.debugLine="Dim descriptors As List";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="descriptors.Initialize";
_descriptors.Initialize();
RDebugUtils.currentLine=46399491;
 //BA.debugLineNum = 46399491;BA.debugLine="If data.IsInitialized = False Then Return descrip";
if (_data.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=46399492;
 //BA.debugLineNum = 46399492;BA.debugLine="Dim uniqueDescriptors As Map";
_uniquedescriptors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46399493;
 //BA.debugLineNum = 46399493;BA.debugLine="uniqueDescriptors.Initialize";
_uniquedescriptors.Initialize();
RDebugUtils.currentLine=46399494;
 //BA.debugLineNum = 46399494;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=46399495;
 //BA.debugLineNum = 46399495;BA.debugLine="If schedules.IsInitialized = False Then Return de";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _descriptors;};
RDebugUtils.currentLine=46399496;
 //BA.debugLineNum = 46399496;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=46399497;
 //BA.debugLineNum = 46399497;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46399498;
 //BA.debugLineNum = 46399498;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=46399499;
 //BA.debugLineNum = 46399499;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=46399500;
 //BA.debugLineNum = 46399500;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=46399501;
 //BA.debugLineNum = 46399501;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=46399502;
 //BA.debugLineNum = 46399502;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group14 = _slots;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_slotobject = group14.Get(index14);
RDebugUtils.currentLine=46399503;
 //BA.debugLineNum = 46399503;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46399504;
 //BA.debugLineNum = 46399504;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=46399505;
 //BA.debugLineNum = 46399505;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=46399506;
 //BA.debugLineNum = 46399506;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=46399507;
 //BA.debugLineNum = 46399507;BA.debugLine="Dim streamId As String = streamData.GetDefaul";
_streamid = BA.ObjectToString(_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=46399508;
 //BA.debugLineNum = 46399508;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=46399509;
 //BA.debugLineNum = 46399509;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=46399510;
 //BA.debugLineNum = 46399510;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=46399511;
 //BA.debugLineNum = 46399511;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group23 = _playlists;
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_playlistobject = group23.Get(index23);
RDebugUtils.currentLine=46399512;
 //BA.debugLineNum = 46399512;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46399513;
 //BA.debugLineNum = 46399513;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=46399514;
 //BA.debugLineNum = 46399514;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=46399515;
 //BA.debugLineNum = 46399515;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=46399516;
 //BA.debugLineNum = 46399516;BA.debugLine="If uniqueDescriptors.ContainsKey(playlistId";
if (_uniquedescriptors.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
RDebugUtils.currentLine=46399517;
 //BA.debugLineNum = 46399517;BA.debugLine="Dim descriptor As Map";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46399518;
 //BA.debugLineNum = 46399518;BA.debugLine="descriptor.Initialize";
_descriptor.Initialize();
RDebugUtils.currentLine=46399519;
 //BA.debugLineNum = 46399519;BA.debugLine="descriptor.Put(\"id\", playlistId)";
_descriptor.Put((Object)("id"),(Object)(_playlistid));
RDebugUtils.currentLine=46399520;
 //BA.debugLineNum = 46399520;BA.debugLine="descriptor.Put(\"updated\", playlist.GetDefau";
_descriptor.Put((Object)("updated"),_playlist.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=46399521;
 //BA.debugLineNum = 46399521;BA.debugLine="descriptor.Put(\"title\", playlist.GetDefault";
_descriptor.Put((Object)("title"),_playlist.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=46399522;
 //BA.debugLineNum = 46399522;BA.debugLine="descriptor.Put(\"schedule_title\", scheduleTi";
_descriptor.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=46399523;
 //BA.debugLineNum = 46399523;BA.debugLine="descriptor.Put(\"slot_time\", slotTime)";
_descriptor.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=46399524;
 //BA.debugLineNum = 46399524;BA.debugLine="descriptor.Put(\"stream_id\", streamId)";
_descriptor.Put((Object)("stream_id"),(Object)(_streamid));
RDebugUtils.currentLine=46399525;
 //BA.debugLineNum = 46399525;BA.debugLine="descriptor.Put(\"stream_title\", streamTitle)";
_descriptor.Put((Object)("stream_title"),(Object)(_streamtitle));
RDebugUtils.currentLine=46399526;
 //BA.debugLineNum = 46399526;BA.debugLine="uniqueDescriptors.Put(playlistId, descripto";
_uniquedescriptors.Put((Object)(_playlistid),(Object)(_descriptor.getObject()));
RDebugUtils.currentLine=46399527;
 //BA.debugLineNum = 46399527;BA.debugLine="descriptors.Add(descriptor)";
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
RDebugUtils.currentLine=46399534;
 //BA.debugLineNum = 46399534;BA.debugLine="Return descriptors";
if (true) return _descriptors;
RDebugUtils.currentLine=46399535;
 //BA.debugLineNum = 46399535;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46858242;
 //BA.debugLineNum = 46858242;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=46858243;
 //BA.debugLineNum = 46858243;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=46858244;
 //BA.debugLineNum = 46858244;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=46858245;
 //BA.debugLineNum = 46858245;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46858246;
 //BA.debugLineNum = 46858246;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=46858247;
 //BA.debugLineNum = 46858247;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=46858249;
 //BA.debugLineNum = 46858249;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=46858250;
 //BA.debugLineNum = 46858250;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=46858251;
 //BA.debugLineNum = 46858251;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=46858252;
 //BA.debugLineNum = 46858252;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
RDebugUtils.currentLine=45285376;
 //BA.debugLineNum = 45285376;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=45285377;
 //BA.debugLineNum = 45285377;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=45285378;
 //BA.debugLineNum = 45285378;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=45285379;
 //BA.debugLineNum = 45285379;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=45285380;
 //BA.debugLineNum = 45285380;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=45285381;
 //BA.debugLineNum = 45285381;BA.debugLine="Private playerDataFileName As String";
_playerdatafilename = "";
RDebugUtils.currentLine=45285382;
 //BA.debugLineNum = 45285382;BA.debugLine="Private playlistRequirementsFileName As String";
_playlistrequirementsfilename = "";
RDebugUtils.currentLine=45285383;
 //BA.debugLineNum = 45285383;BA.debugLine="Private playlistsDirName As String";
_playlistsdirname = "";
RDebugUtils.currentLine=45285384;
 //BA.debugLineNum = 45285384;BA.debugLine="Private playlistCdnBaseUrl As String";
_playlistcdnbaseurl = "";
RDebugUtils.currentLine=45285385;
 //BA.debugLineNum = 45285385;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Private Sub CleanupObsoletePlaylistMetadata(descri";
RDebugUtils.currentLine=46661633;
 //BA.debugLineNum = 46661633;BA.debugLine="Dim actualIds As Map";
_actualids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46661634;
 //BA.debugLineNum = 46661634;BA.debugLine="actualIds.Initialize";
_actualids.Initialize();
RDebugUtils.currentLine=46661635;
 //BA.debugLineNum = 46661635;BA.debugLine="If descriptors.IsInitialized Then";
if (_descriptors.IsInitialized()) { 
RDebugUtils.currentLine=46661636;
 //BA.debugLineNum = 46661636;BA.debugLine="For Each descriptorObject As Object In descripto";
{
final anywheresoftware.b4a.BA.IterableList group4 = _descriptors;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_descriptorobject = group4.Get(index4);
RDebugUtils.currentLine=46661637;
 //BA.debugLineNum = 46661637;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46661638;
 //BA.debugLineNum = 46661638;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=46661639;
 //BA.debugLineNum = 46661639;BA.debugLine="Dim playlistId As String = descriptor.GetDefau";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=46661640;
 //BA.debugLineNum = 46661640;BA.debugLine="If playlistId <> \"\" Then actualIds.Put(playlis";
if ((_playlistid).equals("") == false) { 
_actualids.Put((Object)(_playlistid),(Object)(__c.True));};
 };
 }
};
 };
RDebugUtils.currentLine=46661644;
 //BA.debugLineNum = 46661644;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=46661645;
 //BA.debugLineNum = 46661645;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
RDebugUtils.currentLine=46661646;
 //BA.debugLineNum = 46661646;BA.debugLine="Dim obsoleteIds As List";
_obsoleteids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=46661647;
 //BA.debugLineNum = 46661647;BA.debugLine="obsoleteIds.Initialize";
_obsoleteids.Initialize();
RDebugUtils.currentLine=46661648;
 //BA.debugLineNum = 46661648;BA.debugLine="For Each playlistId As String In cachedPlaylistIn";
{
final anywheresoftware.b4a.BA.IterableList group16 = _cachedplaylistindex.Keys();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_playlistid = BA.ObjectToString(group16.Get(index16));
RDebugUtils.currentLine=46661649;
 //BA.debugLineNum = 46661649;BA.debugLine="If actualIds.ContainsKey(playlistId) = False The";
if (_actualids.ContainsKey((Object)(_playlistid))==__c.False) { 
_obsoleteids.Add((Object)(_playlistid));};
 }
};
RDebugUtils.currentLine=46661651;
 //BA.debugLineNum = 46661651;BA.debugLine="For Each playlistId As String In obsoleteIds";
{
final anywheresoftware.b4a.BA.IterableList group19 = _obsoleteids;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistid = BA.ObjectToString(group19.Get(index19));
RDebugUtils.currentLine=46661652;
 //BA.debugLineNum = 46661652;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistM";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))) { 
RDebugUtils.currentLine=46661653;
 //BA.debugLineNum = 46661653;BA.debugLine="File.Delete(GetOfflinePlaylistsDir, PlaylistMet";
__c.File.Delete(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid));
 };
RDebugUtils.currentLine=46661655;
 //BA.debugLineNum = 46661655;BA.debugLine="InvalidatePlaylistPlaybackOrder(playlistId)";
__ref._invalidateplaylistplaybackorder /*String*/ (null,_playlistid);
RDebugUtils.currentLine=46661656;
 //BA.debugLineNum = 46661656;BA.debugLine="cachedPlaylistIndex.Remove(playlistId)";
_cachedplaylistindex.Remove((Object)(_playlistid));
RDebugUtils.currentLine=46661657;
 //BA.debugLineNum = 46661657;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
 }
};
RDebugUtils.currentLine=46661659;
 //BA.debugLineNum = 46661659;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=46661660;
 //BA.debugLineNum = 46661660;BA.debugLine="storage.Put(\"cached_playlist_index\", cachedPlayl";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_playlist_index",(Object)(_cachedplaylistindex.getObject()));
RDebugUtils.currentLine=46661661;
 //BA.debugLineNum = 46661661;BA.debugLine="Trace(\"playlist metadata cleanup done removed=\"";
__ref._trace /*String*/ (null,"playlist metadata cleanup done removed="+BA.NumberToString(_removedcount));
 };
RDebugUtils.currentLine=46661663;
 //BA.debugLineNum = 46661663;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=46989315;
 //BA.debugLineNum = 46989315;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=46989316;
 //BA.debugLineNum = 46989316;BA.debugLine="End Sub";
return null;
}
public String  _playlistmetadatafilename(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=46006272;
 //BA.debugLineNum = 46006272;BA.debugLine="Public Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=46006273;
 //BA.debugLineNum = 46006273;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=46006274;
 //BA.debugLineNum = 46006274;BA.debugLine="End Sub";
return "";
}
public String  _invalidateplaylistplaybackorder(b4j.example.offlinestore __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "invalidateplaylistplaybackorder", false))
	 {return ((String) Debug.delegate(ba, "invalidateplaylistplaybackorder", new Object[] {_playlistid}));}
RDebugUtils.currentLine=46530560;
 //BA.debugLineNum = 46530560;BA.debugLine="Private Sub InvalidatePlaylistPlaybackOrder(playli";
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="If playlistId = \"\" Then Return";
if ((_playlistid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="storage.Remove(\"playlist_playback_manifest_\" & pl";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,"playlist_playback_manifest_"+_playlistid);
RDebugUtils.currentLine=46530563;
 //BA.debugLineNum = 46530563;BA.debugLine="storage.Remove(\"playlist_playback_cursor_\" & play";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,"playlist_playback_cursor_"+_playlistid);
RDebugUtils.currentLine=46530564;
 //BA.debugLineNum = 46530564;BA.debugLine="storage.Remove(\"playlist_track_index_\" & playlist";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,"playlist_track_index_"+_playlistid);
RDebugUtils.currentLine=46530565;
 //BA.debugLineNum = 46530565;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.offlinestore __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=47120388;
 //BA.debugLineNum = 47120388;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46465024;
 //BA.debugLineNum = 46465024;BA.debugLine="Private Sub CompareOfflinePlaylistsWithCache(descr";
RDebugUtils.currentLine=46465025;
 //BA.debugLineNum = 46465025;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46465026;
 //BA.debugLineNum = 46465026;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=46465027;
 //BA.debugLineNum = 46465027;BA.debugLine="Dim downloadIds As List";
_downloadids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=46465028;
 //BA.debugLineNum = 46465028;BA.debugLine="downloadIds.Initialize";
_downloadids.Initialize();
RDebugUtils.currentLine=46465029;
 //BA.debugLineNum = 46465029;BA.debugLine="Dim cachedPlaylistIndex As Map = storage.GetDefau";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_playlist_index",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=46465030;
 //BA.debugLineNum = 46465030;BA.debugLine="Dim missingCount As Int = 0";
_missingcount = (int) (0);
RDebugUtils.currentLine=46465031;
 //BA.debugLineNum = 46465031;BA.debugLine="Dim outdatedCount As Int = 0";
_outdatedcount = (int) (0);
RDebugUtils.currentLine=46465032;
 //BA.debugLineNum = 46465032;BA.debugLine="Dim actualCount As Int = 0";
_actualcount = (int) (0);
RDebugUtils.currentLine=46465033;
 //BA.debugLineNum = 46465033;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group9 = _descriptors;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_descriptorobject = group9.Get(index9);
RDebugUtils.currentLine=46465034;
 //BA.debugLineNum = 46465034;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46465035;
 //BA.debugLineNum = 46465035;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=46465036;
 //BA.debugLineNum = 46465036;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=46465037;
 //BA.debugLineNum = 46465037;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=46465038;
 //BA.debugLineNum = 46465038;BA.debugLine="If cachedPlaylistIndex.ContainsKey(playlistId)";
if (_cachedplaylistindex.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=46465039;
 //BA.debugLineNum = 46465039;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=46465040;
 //BA.debugLineNum = 46465040;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
RDebugUtils.currentLine=46465041;
 //BA.debugLineNum = 46465041;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=46465043;
 //BA.debugLineNum = 46465043;BA.debugLine="Dim cachedEntryObject As Object = cachedPlaylis";
_cachedentryobject = _cachedplaylistindex.Get((Object)(_playlistid));
RDebugUtils.currentLine=46465044;
 //BA.debugLineNum = 46465044;BA.debugLine="If cachedEntryObject Is Map Then";
if (_cachedentryobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46465045;
 //BA.debugLineNum = 46465045;BA.debugLine="Dim cachedEntry As Map = cachedEntryObject";
_cachedentry = new anywheresoftware.b4a.objects.collections.Map();
_cachedentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedentryobject));
RDebugUtils.currentLine=46465046;
 //BA.debugLineNum = 46465046;BA.debugLine="If cachedEntry.GetDefault(\"updated\", \"\") <> de";
if ((_cachedentry.GetDefault((Object)("updated"),(Object)(""))).equals(_descriptor.GetDefault((Object)("updated"),(Object)(""))) == false) { 
RDebugUtils.currentLine=46465047;
 //BA.debugLineNum = 46465047;BA.debugLine="outdatedCount = outdatedCount + 1";
_outdatedcount = (int) (_outdatedcount+1);
RDebugUtils.currentLine=46465048;
 //BA.debugLineNum = 46465048;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 }else {
RDebugUtils.currentLine=46465050;
 //BA.debugLineNum = 46465050;BA.debugLine="actualCount = actualCount + 1";
_actualcount = (int) (_actualcount+1);
 };
 }else {
RDebugUtils.currentLine=46465053;
 //BA.debugLineNum = 46465053;BA.debugLine="missingCount = missingCount + 1";
_missingcount = (int) (_missingcount+1);
RDebugUtils.currentLine=46465054;
 //BA.debugLineNum = 46465054;BA.debugLine="downloadIds.Add(playlistId)";
_downloadids.Add((Object)(_playlistid));
 };
 };
 }
};
RDebugUtils.currentLine=46465058;
 //BA.debugLineNum = 46465058;BA.debugLine="result.Put(\"DownloadIds\", downloadIds)";
_result.Put((Object)("DownloadIds"),(Object)(_downloadids.getObject()));
RDebugUtils.currentLine=46465059;
 //BA.debugLineNum = 46465059;BA.debugLine="result.Put(\"MissingCount\", missingCount)";
_result.Put((Object)("MissingCount"),(Object)(_missingcount));
RDebugUtils.currentLine=46465060;
 //BA.debugLineNum = 46465060;BA.debugLine="result.Put(\"OutdatedCount\", outdatedCount)";
_result.Put((Object)("OutdatedCount"),(Object)(_outdatedcount));
RDebugUtils.currentLine=46465061;
 //BA.debugLineNum = 46465061;BA.debugLine="result.Put(\"ActualCount\", actualCount)";
_result.Put((Object)("ActualCount"),(Object)(_actualcount));
RDebugUtils.currentLine=46465062;
 //BA.debugLineNum = 46465062;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=46465063;
 //BA.debugLineNum = 46465063;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.offlinestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=47054851;
 //BA.debugLineNum = 47054851;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=47054852;
 //BA.debugLineNum = 47054852;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.offlinestore __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=46923776;
 //BA.debugLineNum = 46923776;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=46923779;
 //BA.debugLineNum = 46923779;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=46923780;
 //BA.debugLineNum = 46923780;BA.debugLine="End Sub";
return "";
}
public int  _getofflineadscount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineadscount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineadscount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _ads = null;
RDebugUtils.currentLine=46268416;
 //BA.debugLineNum = 46268416;BA.debugLine="Private Sub GetOfflineAdsCount(data As Map) As Int";
RDebugUtils.currentLine=46268417;
 //BA.debugLineNum = 46268417;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="Dim ads As List = data.GetDefault(\"ads\", Null)";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("ads"),__c.Null)));
RDebugUtils.currentLine=46268419;
 //BA.debugLineNum = 46268419;BA.debugLine="If ads.IsInitialized = False Then Return 0";
if (_ads.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=46268420;
 //BA.debugLineNum = 46268420;BA.debugLine="Return ads.Size";
if (true) return _ads.getSize();
RDebugUtils.currentLine=46268421;
 //BA.debugLineNum = 46268421;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Private Sub GetOfflinePlaylistIds(data As Map) As";
RDebugUtils.currentLine=46202881;
 //BA.debugLineNum = 46202881;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=46202882;
 //BA.debugLineNum = 46202882;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
RDebugUtils.currentLine=46202883;
 //BA.debugLineNum = 46202883;BA.debugLine="If data.IsInitialized = False Then Return playlis";
if (_data.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=46202884;
 //BA.debugLineNum = 46202884;BA.debugLine="Dim uniqueIds As Map";
_uniqueids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46202885;
 //BA.debugLineNum = 46202885;BA.debugLine="uniqueIds.Initialize";
_uniqueids.Initialize();
RDebugUtils.currentLine=46202886;
 //BA.debugLineNum = 46202886;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=46202887;
 //BA.debugLineNum = 46202887;BA.debugLine="If schedules.IsInitialized = False Then Return pl";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return _playlistids;};
RDebugUtils.currentLine=46202888;
 //BA.debugLineNum = 46202888;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group8 = _schedules;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_scheduleobject = group8.Get(index8);
RDebugUtils.currentLine=46202889;
 //BA.debugLineNum = 46202889;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46202890;
 //BA.debugLineNum = 46202890;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=46202891;
 //BA.debugLineNum = 46202891;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=46202892;
 //BA.debugLineNum = 46202892;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=46202893;
 //BA.debugLineNum = 46202893;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group13 = _slots;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_slotobject = group13.Get(index13);
RDebugUtils.currentLine=46202894;
 //BA.debugLineNum = 46202894;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46202895;
 //BA.debugLineNum = 46202895;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=46202896;
 //BA.debugLineNum = 46202896;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=46202897;
 //BA.debugLineNum = 46202897;BA.debugLine="Dim playlists As List = streamData.GetDefault";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_streamdata.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=46202898;
 //BA.debugLineNum = 46202898;BA.debugLine="If playlists.IsInitialized = False Then Conti";
if (_playlists.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=46202899;
 //BA.debugLineNum = 46202899;BA.debugLine="For Each playlistObject As Object In playlist";
{
final anywheresoftware.b4a.BA.IterableList group19 = _playlists;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_playlistobject = group19.Get(index19);
RDebugUtils.currentLine=46202900;
 //BA.debugLineNum = 46202900;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=46202901;
 //BA.debugLineNum = 46202901;BA.debugLine="Dim playlist As Map = playlistObject";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=46202902;
 //BA.debugLineNum = 46202902;BA.debugLine="Dim playlistId As String = playlist.GetDefa";
_playlistid = BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=46202903;
 //BA.debugLineNum = 46202903;BA.debugLine="If playlistId <> \"\" And uniqueIds.ContainsK";
if ((_playlistid).equals("") == false && _uniqueids.ContainsKey((Object)(_playlistid))==__c.False) { 
RDebugUtils.currentLine=46202904;
 //BA.debugLineNum = 46202904;BA.debugLine="uniqueIds.Put(playlistId, True)";
_uniqueids.Put((Object)(_playlistid),(Object)(__c.True));
RDebugUtils.currentLine=46202905;
 //BA.debugLineNum = 46202905;BA.debugLine="playlistIds.Add(playlistId)";
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
RDebugUtils.currentLine=46202913;
 //BA.debugLineNum = 46202913;BA.debugLine="Return playlistIds";
if (true) return _playlistids;
RDebugUtils.currentLine=46202914;
 //BA.debugLineNum = 46202914;BA.debugLine="End Sub";
return null;
}
public int  _getofflineschedulescount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getofflineschedulescount", false))
	 {return ((Integer) Debug.delegate(ba, "getofflineschedulescount", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _schedules = null;
RDebugUtils.currentLine=46333952;
 //BA.debugLineNum = 46333952;BA.debugLine="Private Sub GetOfflineSchedulesCount(data As Map)";
RDebugUtils.currentLine=46333953;
 //BA.debugLineNum = 46333953;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=46333954;
 //BA.debugLineNum = 46333954;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=46333955;
 //BA.debugLineNum = 46333955;BA.debugLine="If schedules.IsInitialized = False Then Return 0";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=46333956;
 //BA.debugLineNum = 46333956;BA.debugLine="Return schedules.Size";
if (true) return _schedules.getSize();
RDebugUtils.currentLine=46333957;
 //BA.debugLineNum = 46333957;BA.debugLine="End Sub";
return 0;
}
public int  _getplaylisttrackcount(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "getplaylisttrackcount", false))
	 {return ((Integer) Debug.delegate(ba, "getplaylisttrackcount", new Object[] {_playlistdata}));}
anywheresoftware.b4a.objects.collections.List _tracks = null;
RDebugUtils.currentLine=46792704;
 //BA.debugLineNum = 46792704;BA.debugLine="Private Sub GetPlaylistTrackCount(playlistData As";
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=46792707;
 //BA.debugLineNum = 46792707;BA.debugLine="If tracks.IsInitialized = False Then Return 0";
if (_tracks.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=46792708;
 //BA.debugLineNum = 46792708;BA.debugLine="Return tracks.Size";
if (true) return _tracks.getSize();
RDebugUtils.currentLine=46792709;
 //BA.debugLineNum = 46792709;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflinedata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _sourcedata,String _playercode,String _deviceid) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflinedata", new Object[] {_sourcedata,_playercode,_deviceid}));}
anywheresoftware.b4a.objects.collections.Map _normalizeddata = null;
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Private Sub NormalizeOfflineData(sourceData As Map";
RDebugUtils.currentLine=46137345;
 //BA.debugLineNum = 46137345;BA.debugLine="Dim normalizedData As Map";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46137346;
 //BA.debugLineNum = 46137346;BA.debugLine="normalizedData.Initialize";
_normalizeddata.Initialize();
RDebugUtils.currentLine=46137347;
 //BA.debugLineNum = 46137347;BA.debugLine="normalizedData.Put(\"ok\", sourceData.GetDefault(\"o";
_normalizeddata.Put((Object)("ok"),_sourcedata.GetDefault((Object)("ok"),(Object)(__c.False)));
RDebugUtils.currentLine=46137348;
 //BA.debugLineNum = 46137348;BA.debugLine="normalizedData.Put(\"type\", sourceData.GetDefault(";
_normalizeddata.Put((Object)("type"),_sourcedata.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=46137349;
 //BA.debugLineNum = 46137349;BA.debugLine="normalizedData.Put(\"updated\", sourceData.GetDefau";
_normalizeddata.Put((Object)("updated"),_sourcedata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=46137350;
 //BA.debugLineNum = 46137350;BA.debugLine="normalizedData.Put(\"saved_at\", DateTime.Now)";
_normalizeddata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=46137351;
 //BA.debugLineNum = 46137351;BA.debugLine="normalizedData.Put(\"player_code\", playerCode)";
_normalizeddata.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=46137352;
 //BA.debugLineNum = 46137352;BA.debugLine="normalizedData.Put(\"device_id\", deviceId)";
_normalizeddata.Put((Object)("device_id"),(Object)(_deviceid));
RDebugUtils.currentLine=46137353;
 //BA.debugLineNum = 46137353;BA.debugLine="If sourceData.ContainsKey(\"player\") Then normaliz";
if (_sourcedata.ContainsKey((Object)("player"))) { 
_normalizeddata.Put((Object)("player"),_sourcedata.Get((Object)("player")));};
RDebugUtils.currentLine=46137354;
 //BA.debugLineNum = 46137354;BA.debugLine="If sourceData.ContainsKey(\"ads\") Then normalizedD";
if (_sourcedata.ContainsKey((Object)("ads"))) { 
_normalizeddata.Put((Object)("ads"),_sourcedata.Get((Object)("ads")));};
RDebugUtils.currentLine=46137355;
 //BA.debugLineNum = 46137355;BA.debugLine="If sourceData.ContainsKey(\"schedules\") Then norma";
if (_sourcedata.ContainsKey((Object)("schedules"))) { 
_normalizeddata.Put((Object)("schedules"),_sourcedata.Get((Object)("schedules")));};
RDebugUtils.currentLine=46137356;
 //BA.debugLineNum = 46137356;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=46137357;
 //BA.debugLineNum = 46137357;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _normalizeofflineplaylistdata(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "normalizeofflineplaylistdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "normalizeofflineplaylistdata", new Object[] {_descriptor,_playlistdata}));}
anywheresoftware.b4a.objects.collections.Map _normalizedplaylistdata = null;
String _key = "";
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Private Sub NormalizeOfflinePlaylistData(descripto";
RDebugUtils.currentLine=46727169;
 //BA.debugLineNum = 46727169;BA.debugLine="Dim normalizedPlaylistData As Map";
_normalizedplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="normalizedPlaylistData.Initialize";
_normalizedplaylistdata.Initialize();
RDebugUtils.currentLine=46727171;
 //BA.debugLineNum = 46727171;BA.debugLine="For Each key As String In playlistData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _playlistdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=46727172;
 //BA.debugLineNum = 46727172;BA.debugLine="normalizedPlaylistData.Put(key, playlistData.Get";
_normalizedplaylistdata.Put((Object)(_key),_playlistdata.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=46727174;
 //BA.debugLineNum = 46727174;BA.debugLine="normalizedPlaylistData.Put(\"id\", descriptor.GetDe";
_normalizedplaylistdata.Put((Object)("id"),_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=46727175;
 //BA.debugLineNum = 46727175;BA.debugLine="normalizedPlaylistData.Put(\"required_updated\", de";
_normalizedplaylistdata.Put((Object)("required_updated"),_descriptor.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=46727176;
 //BA.debugLineNum = 46727176;BA.debugLine="normalizedPlaylistData.Put(\"saved_at\", DateTime.N";
_normalizedplaylistdata.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=46727177;
 //BA.debugLineNum = 46727177;BA.debugLine="Return normalizedPlaylistData";
if (true) return _normalizedplaylistdata;
RDebugUtils.currentLine=46727178;
 //BA.debugLineNum = 46727178;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45481984;
 //BA.debugLineNum = 45481984;BA.debugLine="Public Sub SaveOfflineData(sourceData As Map, play";
RDebugUtils.currentLine=45481985;
 //BA.debugLineNum = 45481985;BA.debugLine="Dim normalizedData As Map = NormalizeOfflineData(";
_normalizeddata = new anywheresoftware.b4a.objects.collections.Map();
_normalizeddata = __ref._normalizeofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sourcedata,_playercode,_deviceid);
RDebugUtils.currentLine=45481986;
 //BA.debugLineNum = 45481986;BA.debugLine="Dim offlineDataUpdatedAt As Long = DateTime.Now";
_offlinedataupdatedat = __c.DateTime.getNow();
RDebugUtils.currentLine=45481987;
 //BA.debugLineNum = 45481987;BA.debugLine="storage.Put(\"player_data_updated_at\", offlineData";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"player_data_updated_at",(Object)(_offlinedataupdatedat));
RDebugUtils.currentLine=45481988;
 //BA.debugLineNum = 45481988;BA.debugLine="storage.Put(\"player_data_source_updated\", normali";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"player_data_source_updated",_normalizeddata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=45481989;
 //BA.debugLineNum = 45481989;BA.debugLine="Dim playlistIds As List = GetOfflinePlaylistIds(n";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
_playlistids = __ref._getofflineplaylistids /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=45481990;
 //BA.debugLineNum = 45481990;BA.debugLine="Dim playlistDescriptors As List = BuildOfflinePla";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = __ref._buildofflineplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null,_normalizeddata);
RDebugUtils.currentLine=45481991;
 //BA.debugLineNum = 45481991;BA.debugLine="Dim playlistCacheStatus As Map = CompareOfflinePl";
_playlistcachestatus = new anywheresoftware.b4a.objects.collections.Map();
_playlistcachestatus = __ref._compareofflineplaylistswithcache /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=45481992;
 //BA.debugLineNum = 45481992;BA.debugLine="storage.Put(\"playlist_ids\", playlistIds)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_ids",(Object)(_playlistids.getObject()));
RDebugUtils.currentLine=45481993;
 //BA.debugLineNum = 45481993;BA.debugLine="storage.Put(\"playlist_descriptors\", playlistDescr";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_descriptors",(Object)(_playlistdescriptors.getObject()));
RDebugUtils.currentLine=45481994;
 //BA.debugLineNum = 45481994;BA.debugLine="storage.Put(\"playlist_download_ids\", playlistCach";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_download_ids",_playlistcachestatus.GetDefault((Object)("DownloadIds"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=45481995;
 //BA.debugLineNum = 45481995;BA.debugLine="storage.Put(\"playlist_missing_count\", playlistCac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_missing_count",_playlistcachestatus.GetDefault((Object)("MissingCount"),(Object)(0)));
RDebugUtils.currentLine=45481996;
 //BA.debugLineNum = 45481996;BA.debugLine="storage.Put(\"playlist_outdated_count\", playlistCa";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_outdated_count",_playlistcachestatus.GetDefault((Object)("OutdatedCount"),(Object)(0)));
RDebugUtils.currentLine=45481997;
 //BA.debugLineNum = 45481997;BA.debugLine="storage.Put(\"playlist_actual_count\", playlistCach";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"playlist_actual_count",_playlistcachestatus.GetDefault((Object)("ActualCount"),(Object)(0)));
RDebugUtils.currentLine=45481998;
 //BA.debugLineNum = 45481998;BA.debugLine="storage.Put(\"ad_count\", GetOfflineAdsCount(normal";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"ad_count",(Object)(__ref._getofflineadscount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=45481999;
 //BA.debugLineNum = 45481999;BA.debugLine="storage.Put(\"schedule_count\", GetOfflineSchedules";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"schedule_count",(Object)(__ref._getofflineschedulescount /*int*/ (null,_normalizeddata)));
RDebugUtils.currentLine=45482000;
 //BA.debugLineNum = 45482000;BA.debugLine="CleanupObsoletePlaylistMetadata(playlistDescripto";
__ref._cleanupobsoleteplaylistmetadata /*String*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=45482001;
 //BA.debugLineNum = 45482001;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=45482002;
 //BA.debugLineNum = 45482002;BA.debugLine="generator.Initialize(normalizedData)";
_generator.Initialize(_normalizeddata);
RDebugUtils.currentLine=45482003;
 //BA.debugLineNum = 45482003;BA.debugLine="File.WriteString(storageDir, playerDataFileName,";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._playerdatafilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=45482004;
 //BA.debugLineNum = 45482004;BA.debugLine="WriteOfflinePlaylistRequirementsFile(playlistDesc";
__ref._writeofflineplaylistrequirementsfile /*String*/ (null,_playlistdescriptors,_playercode);
RDebugUtils.currentLine=45482005;
 //BA.debugLineNum = 45482005;BA.debugLine="Return normalizedData";
if (true) return _normalizeddata;
RDebugUtils.currentLine=45482006;
 //BA.debugLineNum = 45482006;BA.debugLine="End Sub";
return null;
}
public String  _writeofflineplaylistrequirementsfile(b4j.example.offlinestore __ref,anywheresoftware.b4a.objects.collections.List _descriptors,String _playercode) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlinestore";
if (Debug.shouldDelegate(ba, "writeofflineplaylistrequirementsfile", false))
	 {return ((String) Debug.delegate(ba, "writeofflineplaylistrequirementsfile", new Object[] {_descriptors,_playercode}));}
anywheresoftware.b4a.objects.collections.Map _payload = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _generator = null;
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Private Sub WriteOfflinePlaylistRequirementsFile(d";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="Dim payload As Map";
_payload = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="payload.Initialize";
_payload.Initialize();
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="payload.Put(\"saved_at\", DateTime.Now)";
_payload.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=46596100;
 //BA.debugLineNum = 46596100;BA.debugLine="payload.Put(\"player_code\", playerCode)";
_payload.Put((Object)("player_code"),(Object)(_playercode));
RDebugUtils.currentLine=46596101;
 //BA.debugLineNum = 46596101;BA.debugLine="payload.Put(\"descriptors\", descriptors)";
_payload.Put((Object)("descriptors"),(Object)(_descriptors.getObject()));
RDebugUtils.currentLine=46596102;
 //BA.debugLineNum = 46596102;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=46596103;
 //BA.debugLineNum = 46596103;BA.debugLine="generator.Initialize(payload)";
_generator.Initialize(_payload);
RDebugUtils.currentLine=46596104;
 //BA.debugLineNum = 46596104;BA.debugLine="File.WriteString(storageDir, playlistRequirements";
__c.File.WriteString(__ref._storagedir /*String*/ ,__ref._playlistrequirementsfilename /*String*/ ,_generator.ToString());
RDebugUtils.currentLine=46596105;
 //BA.debugLineNum = 46596105;BA.debugLine="End Sub";
return "";
}
}