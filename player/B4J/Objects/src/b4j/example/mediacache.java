package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class mediacache extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.mediacache", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.mediacache.class).invoke(this, new Object[] {null});
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
public String _mediadirname = "";
public String _adsdirname = "";
public String _tracksdirname = "";
public int _cache_audit_batch_size = 0;
public int _ad_download_timeout_ms = 0;
public int _track_download_timeout_ms = 0;
public int _stream_xor_buffer_size = 0;
public long _track_cache_hard_limit_mb = 0L;
public long _track_cache_target_mb = 0L;
public long _min_free_disk_mb = 0L;
public int _min_free_disk_percent = 0;
public String _primary_temp_track_file = "";
public String _secondary_temp_track_file = "";
public anywheresoftware.b4a.objects.collections.Map _cachedadindex = null;
public anywheresoftware.b4a.objects.collections.Map _cachedtrackindex = null;
public boolean _cachedadindexdirty = false;
public boolean _cachedtrackindexdirty = false;
public anywheresoftware.b4a.objects.collections.Map _playbacktemptrackids = null;
public boolean _cacheauditinprogress = false;
public anywheresoftware.b4a.objects.collections.List _cacheauditpendingtypes = null;
public String _cacheauditcurrenttype = "";
public anywheresoftware.b4a.objects.collections.List _cacheauditcurrentfilenames = null;
public int _cacheauditcurrentposition = 0;
public anywheresoftware.b4a.objects.collections.Map _cacheauditseenids = null;
public boolean _cacheauditadindexchanged = false;
public boolean _cacheaudittrackindexchanged = false;
public int _cacheauditaddedcount = 0;
public int _cacheauditremovedcount = 0;
public int _cacheaudittempdeletedcount = 0;
public boolean _recentmedianetworkfailure = false;
public long _prunelastcachebytes = 0L;
public long _prunelastfreebytes = 0L;
public int _cachedtrackcount = 0;
public int _cachedadcount = 0;
public long _cachedtrackbytes = 0L;
public long _cachedadbytes = 0L;
public anywheresoftware.b4a.objects.collections.Map _cachedtrackplayliststats = null;
public boolean _cacheauditlistinginprogress = false;
public String _cacheauditlistingdir = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public boolean  _consumerecentmedianetworkfailure(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "consumerecentmedianetworkfailure", false))
	 {return ((Boolean) Debug.delegate(ba, "consumerecentmedianetworkfailure", null));}
boolean _value = false;
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Public Sub ConsumeRecentMediaNetworkFailure As Boo";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="Dim value As Boolean = recentMediaNetworkFailure";
_value = __ref._recentmedianetworkfailure /*boolean*/ ;
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="recentMediaNetworkFailure = False";
__ref._recentmedianetworkfailure /*boolean*/  = __c.False;
RDebugUtils.currentLine=37748739;
 //BA.debugLineNum = 37748739;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=37748740;
 //BA.debugLineNum = 37748740;BA.debugLine="End Sub";
return false;
}
public boolean  _hastrackfilebyplaylist(b4j.example.mediacache __ref,String _trackid,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "hastrackfilebyplaylist", false))
	 {return ((Boolean) Debug.delegate(ba, "hastrackfilebyplaylist", new Object[] {_trackid,_playlistid}));}
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Public Sub HasTrackFileByPlaylist(trackId As Strin";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="Return IsCachedFileUsable(GetTracksDir, BuildTrac";
if (true) return __ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),__ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid));
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="End Sub";
return false;
}
public boolean  _istrackcached(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "istrackcached", false))
	 {return ((Boolean) Debug.delegate(ba, "istrackcached", new Object[] {_trackid}));}
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) Then Ret";
if (__ref._validateindexedfile /*boolean*/ (null,"track",_trackid)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=36962307;
 //BA.debugLineNum = 36962307;BA.debugLine="BackfillTrackIndexFromFiles";
__ref._backfilltrackindexfromfiles /*String*/ (null);
RDebugUtils.currentLine=36962308;
 //BA.debugLineNum = 36962308;BA.debugLine="Return ValidateIndexedFile(\"track\", trackId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"track",_trackid);
RDebugUtils.currentLine=36962309;
 //BA.debugLineNum = 36962309;BA.debugLine="End Sub";
return false;
}
public boolean  _hasvalidatedlocalmedia(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "hasvalidatedlocalmedia", false))
	 {return ((Boolean) Debug.delegate(ba, "hasvalidatedlocalmedia", new Object[] {_item}));}
String _itemid = "";
String _itemtype = "";
String _preferredrelativename = "";
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Public Sub HasValidatedLocalMedia(item As Map) As";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="If item.IsInitialized = False Then Return False";
if (_item.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=36700163;
 //BA.debugLineNum = 36700163;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36700164;
 //BA.debugLineNum = 36700164;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=36700165;
 //BA.debugLineNum = 36700165;BA.debugLine="If itemType = \"ad\" Then Return ValidateIndexedFil";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._validateindexedfile /*boolean*/ (null,"ad",_itemid);};
RDebugUtils.currentLine=36700166;
 //BA.debugLineNum = 36700166;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=36700167;
 //BA.debugLineNum = 36700167;BA.debugLine="Dim preferredRelativeName As String = ResolveTra";
_preferredrelativename = __ref._resolvetrackrelativefilenamefromitem /*String*/ (null,_item);
RDebugUtils.currentLine=36700168;
 //BA.debugLineNum = 36700168;BA.debugLine="If IsCachedFileUsable(GetTracksDir, preferredRel";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_preferredrelativename)) { 
RDebugUtils.currentLine=36700169;
 //BA.debugLineNum = 36700169;BA.debugLine="EnsureTrackIndexEntry(itemId, item.GetDefault(\"";
__ref._ensuretrackindexentry /*String*/ (null,_itemid,BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)(""))),_preferredrelativename);
RDebugUtils.currentLine=36700170;
 //BA.debugLineNum = 36700170;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=36700172;
 //BA.debugLineNum = 36700172;BA.debugLine="Return ValidateIndexedFile(\"track\", itemId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"track",_itemid);
 };
RDebugUtils.currentLine=36700174;
 //BA.debugLineNum = 36700174;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=36700175;
 //BA.debugLineNum = 36700175;BA.debugLine="End Sub";
return false;
}
public int  _prunetrackcacheifneeded(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _protectedtrackids,anywheresoftware.b4a.objects.collections.List _relevanttrackids) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "prunetrackcacheifneeded", false))
	 {return ((Integer) Debug.delegate(ba, "prunetrackcacheifneeded", new Object[] {_protectedtrackids,_relevanttrackids}));}
anywheresoftware.b4a.objects.collections.Map _protectedids = null;
anywheresoftware.b4a.objects.collections.Map _relevantids = null;
anywheresoftware.b4a.objects.collections.Map _summary = null;
long _cachebytes = 0L;
long _freebytes = 0L;
long _totalbytes = 0L;
long _minfreebytes = 0L;
long _hardlimitbytes = 0L;
long _targetbytes = 0L;
boolean _needprune = false;
int _removedcount = 0;
anywheresoftware.b4a.objects.collections.List _candidates = null;
anywheresoftware.b4a.objects.collections.List _nonrelevantcandidates = null;
anywheresoftware.b4a.objects.collections.List _relevantcandidates = null;
Object _candidateobject = null;
anywheresoftware.b4a.objects.collections.Map _candidate = null;
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Public Sub PruneTrackCacheIfNeeded(protectedTrackI";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="Dim protectedIds As Map = CreateTrackIdSet(protec";
_protectedids = new anywheresoftware.b4a.objects.collections.Map();
_protectedids = __ref._createtrackidset /*anywheresoftware.b4a.objects.collections.Map*/ (null,_protectedtrackids);
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="Dim relevantIds As Map = CreateTrackIdSet(relevan";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
_relevantids = __ref._createtrackidset /*anywheresoftware.b4a.objects.collections.Map*/ (null,_relevanttrackids);
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="Dim summary As Map = BuildTrackCacheSummary(prote";
_summary = new anywheresoftware.b4a.objects.collections.Map();
_summary = __ref._buildtrackcachesummary /*anywheresoftware.b4a.objects.collections.Map*/ (null,_protectedids,_relevantids);
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="Dim cacheBytes As Long = summary.GetDefault(\"cach";
_cachebytes = BA.ObjectToLongNumber(_summary.GetDefault((Object)("cache_bytes"),(Object)(0)));
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="Dim freeBytes As Long = GetDriveUsableSpace(stora";
_freebytes = __ref._getdriveusablespace /*long*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=37879814;
 //BA.debugLineNum = 37879814;BA.debugLine="Dim totalBytes As Long = GetDriveTotalSpace(stora";
_totalbytes = __ref._getdrivetotalspace /*long*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=37879815;
 //BA.debugLineNum = 37879815;BA.debugLine="Dim minFreeBytes As Long = ResolveMinFreeDiskByte";
_minfreebytes = __ref._resolveminfreediskbytes /*long*/ (null,_totalbytes);
RDebugUtils.currentLine=37879816;
 //BA.debugLineNum = 37879816;BA.debugLine="Dim hardLimitBytes As Long = MbToBytes(TRACK_CACH";
_hardlimitbytes = __ref._mbtobytes /*long*/ (null,__ref._track_cache_hard_limit_mb /*long*/ );
RDebugUtils.currentLine=37879817;
 //BA.debugLineNum = 37879817;BA.debugLine="Dim targetBytes As Long = MbToBytes(TRACK_CACHE_T";
_targetbytes = __ref._mbtobytes /*long*/ (null,__ref._track_cache_target_mb /*long*/ );
RDebugUtils.currentLine=37879818;
 //BA.debugLineNum = 37879818;BA.debugLine="Dim needPrune As Boolean = (cacheBytes > hardLimi";
_needprune = (_cachebytes>_hardlimitbytes) || (_freebytes>0 && _freebytes<_minfreebytes);
RDebugUtils.currentLine=37879819;
 //BA.debugLineNum = 37879819;BA.debugLine="If needPrune = False Then";
if (_needprune==__c.False) { 
RDebugUtils.currentLine=37879820;
 //BA.debugLineNum = 37879820;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
RDebugUtils.currentLine=37879822;
 //BA.debugLineNum = 37879822;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
RDebugUtils.currentLine=37879823;
 //BA.debugLineNum = 37879823;BA.debugLine="Dim candidates As List = summary.GetDefault(\"cand";
_candidates = new anywheresoftware.b4a.objects.collections.List();
_candidates = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_summary.GetDefault((Object)("candidates"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=37879824;
 //BA.debugLineNum = 37879824;BA.debugLine="Dim nonRelevantCandidates As List";
_nonrelevantcandidates = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37879825;
 //BA.debugLineNum = 37879825;BA.debugLine="nonRelevantCandidates.Initialize";
_nonrelevantcandidates.Initialize();
RDebugUtils.currentLine=37879826;
 //BA.debugLineNum = 37879826;BA.debugLine="Dim relevantCandidates As List";
_relevantcandidates = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37879827;
 //BA.debugLineNum = 37879827;BA.debugLine="relevantCandidates.Initialize";
_relevantcandidates.Initialize();
RDebugUtils.currentLine=37879828;
 //BA.debugLineNum = 37879828;BA.debugLine="For Each candidateObject As Object In candidates";
{
final anywheresoftware.b4a.BA.IterableList group20 = _candidates;
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_candidateobject = group20.Get(index20);
RDebugUtils.currentLine=37879829;
 //BA.debugLineNum = 37879829;BA.debugLine="If (candidateObject Is Map) = False Then Continu";
if ((_candidateobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=37879830;
 //BA.debugLineNum = 37879830;BA.debugLine="Dim candidate As Map = candidateObject";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
_candidate = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidateobject));
RDebugUtils.currentLine=37879831;
 //BA.debugLineNum = 37879831;BA.debugLine="If candidate.GetDefault(\"is_relevant\", False) Th";
if (BA.ObjectToBoolean(_candidate.GetDefault((Object)("is_relevant"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=37879832;
 //BA.debugLineNum = 37879832;BA.debugLine="relevantCandidates.Add(candidate)";
_relevantcandidates.Add((Object)(_candidate.getObject()));
 }else {
RDebugUtils.currentLine=37879834;
 //BA.debugLineNum = 37879834;BA.debugLine="nonRelevantCandidates.Add(candidate)";
_nonrelevantcandidates.Add((Object)(_candidate.getObject()));
 };
 }
};
RDebugUtils.currentLine=37879837;
 //BA.debugLineNum = 37879837;BA.debugLine="SortTrackPruneCandidates(nonRelevantCandidates)";
__ref._sorttrackprunecandidates /*String*/ (null,_nonrelevantcandidates);
RDebugUtils.currentLine=37879838;
 //BA.debugLineNum = 37879838;BA.debugLine="SortTrackPruneCandidates(relevantCandidates)";
__ref._sorttrackprunecandidates /*String*/ (null,_relevantcandidates);
RDebugUtils.currentLine=37879842;
 //BA.debugLineNum = 37879842;BA.debugLine="removedCount = removedCount + PruneTrackCandidate";
_removedcount = (int) (_removedcount+__ref._prunetrackcandidates /*int*/ (null,_nonrelevantcandidates,_cachebytes,_freebytes,_targetbytes,_minfreebytes));
RDebugUtils.currentLine=37879843;
 //BA.debugLineNum = 37879843;BA.debugLine="cacheBytes = pruneLastCacheBytes";
_cachebytes = __ref._prunelastcachebytes /*long*/ ;
RDebugUtils.currentLine=37879844;
 //BA.debugLineNum = 37879844;BA.debugLine="freeBytes = pruneLastFreeBytes";
_freebytes = __ref._prunelastfreebytes /*long*/ ;
RDebugUtils.currentLine=37879845;
 //BA.debugLineNum = 37879845;BA.debugLine="If cacheBytes > targetBytes Or (freeBytes > 0 And";
if (_cachebytes>_targetbytes || (_freebytes>0 && _freebytes<_minfreebytes)) { 
RDebugUtils.currentLine=37879846;
 //BA.debugLineNum = 37879846;BA.debugLine="removedCount = removedCount + PruneTrackCandidat";
_removedcount = (int) (_removedcount+__ref._prunetrackcandidates /*int*/ (null,_relevantcandidates,_cachebytes,_freebytes,_targetbytes,_minfreebytes));
RDebugUtils.currentLine=37879847;
 //BA.debugLineNum = 37879847;BA.debugLine="cacheBytes = pruneLastCacheBytes";
_cachebytes = __ref._prunelastcachebytes /*long*/ ;
RDebugUtils.currentLine=37879848;
 //BA.debugLineNum = 37879848;BA.debugLine="freeBytes = pruneLastFreeBytes";
_freebytes = __ref._prunelastfreebytes /*long*/ ;
 };
RDebugUtils.currentLine=37879850;
 //BA.debugLineNum = 37879850;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=37879851;
 //BA.debugLineNum = 37879851;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=37879852;
 //BA.debugLineNum = 37879852;BA.debugLine="Trace(\"Очистка кэша треков завершена. removed=\"";
__ref._trace /*String*/ (null,"Очистка кэша треков завершена. removed="+BA.NumberToString(_removedcount)+", cacheMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_cachebytes))+", freeMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_freebytes)));
 }else {
RDebugUtils.currentLine=37879854;
 //BA.debugLineNum = 37879854;BA.debugLine="Trace(\"Очистка кэша треков пропущена: нет подход";
__ref._trace /*String*/ (null,"Очистка кэша треков пропущена: нет подходящих кандидатов. cacheMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_cachebytes))+", freeMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_freebytes)));
 };
RDebugUtils.currentLine=37879856;
 //BA.debugLineNum = 37879856;BA.debugLine="Return removedCount";
if (true) return _removedcount;
RDebugUtils.currentLine=37879857;
 //BA.debugLineNum = 37879857;BA.debugLine="End Sub";
return 0;
}
public String  _ensuretrackcacheready(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuretrackcacheready", false))
	 {return ((String) Debug.delegate(ba, "ensuretrackcacheready", null));}
int _actualtrackfiles = 0;
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Public Sub EnsureTrackCacheReady";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="MigrateLegacyTrackCacheLayout";
__ref._migratelegacytrackcachelayout /*String*/ (null);
RDebugUtils.currentLine=37421059;
 //BA.debugLineNum = 37421059;BA.debugLine="Dim actualTrackFiles As Int = CountTrackFilesOnDi";
_actualtrackfiles = __ref._counttrackfilesondisk /*int*/ (null);
RDebugUtils.currentLine=37421060;
 //BA.debugLineNum = 37421060;BA.debugLine="If actualTrackFiles = 0 Then Return";
if (_actualtrackfiles==0) { 
if (true) return "";};
RDebugUtils.currentLine=37421061;
 //BA.debugLineNum = 37421061;BA.debugLine="If cachedTrackCount = actualTrackFiles And cached";
if (__ref._cachedtrackcount /*int*/ ==_actualtrackfiles && __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==_actualtrackfiles) { 
if (true) return "";};
RDebugUtils.currentLine=37421062;
 //BA.debugLineNum = 37421062;BA.debugLine="BackfillTrackIndexFromFiles";
__ref._backfilltrackindexfromfiles /*String*/ (null);
RDebugUtils.currentLine=37421063;
 //BA.debugLineNum = 37421063;BA.debugLine="RebuildCacheStatsFromIndexes";
__ref._rebuildcachestatsfromindexes /*String*/ (null);
RDebugUtils.currentLine=37421064;
 //BA.debugLineNum = 37421064;BA.debugLine="SaveCacheStatsSnapshot";
__ref._savecachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=37421065;
 //BA.debugLineNum = 37421065;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedtrackplayliststats(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackplayliststats", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedtrackplayliststats", null));}
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _sourceentry = null;
anywheresoftware.b4a.objects.collections.Map _copyentry = null;
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Public Sub GetCachedTrackPlaylistStats As Map";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="EnsureTrackCacheReady";
__ref._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37355523;
 //BA.debugLineNum = 37355523;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="For Each playlistId As String In cachedTrackPlayl";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_playlistid = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="Dim sourceEntry As Map = cachedTrackPlaylistStat";
_sourceentry = new anywheresoftware.b4a.objects.collections.Map();
_sourceentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_playlistid))));
RDebugUtils.currentLine=37355526;
 //BA.debugLineNum = 37355526;BA.debugLine="Dim copyEntry As Map";
_copyentry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37355527;
 //BA.debugLineNum = 37355527;BA.debugLine="copyEntry.Initialize";
_copyentry.Initialize();
RDebugUtils.currentLine=37355528;
 //BA.debugLineNum = 37355528;BA.debugLine="If sourceEntry.IsInitialized Then";
if (_sourceentry.IsInitialized()) { 
RDebugUtils.currentLine=37355529;
 //BA.debugLineNum = 37355529;BA.debugLine="copyEntry.Put(\"count\", sourceEntry.GetDefault(\"";
_copyentry.Put((Object)("count"),_sourceentry.GetDefault((Object)("count"),(Object)(0)));
RDebugUtils.currentLine=37355530;
 //BA.debugLineNum = 37355530;BA.debugLine="copyEntry.Put(\"bytes\", sourceEntry.GetDefault(\"";
_copyentry.Put((Object)("bytes"),_sourceentry.GetDefault((Object)("bytes"),(Object)(0)));
 };
RDebugUtils.currentLine=37355532;
 //BA.debugLineNum = 37355532;BA.debugLine="result.Put(playlistId, copyEntry)";
_result.Put((Object)(_playlistid),(Object)(_copyentry.getObject()));
 }
};
RDebugUtils.currentLine=37355534;
 //BA.debugLineNum = 37355534;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=37355535;
 //BA.debugLineNum = 37355535;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuretrackscached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _trackitems,int _maxcount) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuretrackscached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuretrackscached", new Object[] {_trackitems,_maxcount}));}
ResumableSub_EnsureTracksCached rsub = new ResumableSub_EnsureTracksCached(this,__ref,_trackitems,_maxcount);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureTracksCached extends BA.ResumableSub {
public ResumableSub_EnsureTracksCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _trackitems,int _maxcount) {
this.parent = parent;
this.__ref = __ref;
this._trackitems = _trackitems;
this._maxcount = _maxcount;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.List _trackitems;
int _maxcount;
anywheresoftware.b4a.objects.collections.Map _seentrackids = null;
int _downloadedcount = 0;
int _failedcount = 0;
int _processedcount = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _trackid = "";
boolean _downloaded = false;
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mediacache";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="FlushPendingIndexSaves";
__ref._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="If trackItems.IsInitialized = False Or trackItems";
if (true) break;

case 1:
//if
this.state = 6;
if (_trackitems.IsInitialized()==parent.__c.False || _trackitems.getSize()==0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=37683203;
 //BA.debugLineNum = 37683203;BA.debugLine="Dim cachedTrackIndex As Map = GetCachedTrackIndex";
parent._cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedtrackindex = __ref._getcachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=37683204;
 //BA.debugLineNum = 37683204;BA.debugLine="Dim seenTrackIds As Map";
_seentrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37683205;
 //BA.debugLineNum = 37683205;BA.debugLine="seenTrackIds.Initialize";
_seentrackids.Initialize();
RDebugUtils.currentLine=37683206;
 //BA.debugLineNum = 37683206;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=37683207;
 //BA.debugLineNum = 37683207;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=37683208;
 //BA.debugLineNum = 37683208;BA.debugLine="Dim processedCount As Int = 0";
_processedcount = (int) (0);
RDebugUtils.currentLine=37683209;
 //BA.debugLineNum = 37683209;BA.debugLine="For Each itemObject As Object In trackItems";
if (true) break;

case 7:
//for
this.state = 44;
group9 = _trackitems;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 45;
if (true) break;

case 45:
//C
this.state = 44;
if (index9 < groupLen9) {
this.state = 9;
_itemobject = group9.Get(index9);}
if (true) break;

case 46:
//C
this.state = 45;
index9++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=37683210;
 //BA.debugLineNum = 37683210;BA.debugLine="If processedCount >= maxCount Then Exit";
if (true) break;

case 10:
//if
this.state = 15;
if (_processedcount>=_maxcount) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
this.state = 44;
if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=37683211;
 //BA.debugLineNum = 37683211;BA.debugLine="If itemObject Is Map Then";
if (true) break;

case 16:
//if
this.state = 43;
if (_itemobject instanceof java.util.Map) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=37683212;
 //BA.debugLineNum = 37683212;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=37683213;
 //BA.debugLineNum = 37683213;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then";
if (true) break;

case 19:
//if
this.state = 24;
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
this.state = 46;
if (true) break;;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=37683214;
 //BA.debugLineNum = 37683214;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=37683215;
 //BA.debugLineNum = 37683215;BA.debugLine="If trackId = \"\" Then Continue";
if (true) break;

case 25:
//if
this.state = 30;
if ((_trackid).equals("")) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
this.state = 46;
if (true) break;;
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=37683216;
 //BA.debugLineNum = 37683216;BA.debugLine="If seenTrackIds.ContainsKey(trackId) Then Conti";
if (true) break;

case 31:
//if
this.state = 36;
if (_seentrackids.ContainsKey((Object)(_trackid))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
this.state = 46;
if (true) break;;
if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=37683217;
 //BA.debugLineNum = 37683217;BA.debugLine="seenTrackIds.Put(trackId, True)";
_seentrackids.Put((Object)(_trackid),(Object)(parent.__c.True));
RDebugUtils.currentLine=37683218;
 //BA.debugLineNum = 37683218;BA.debugLine="processedCount = processedCount + 1";
_processedcount = (int) (_processedcount+1);
RDebugUtils.currentLine=37683219;
 //BA.debugLineNum = 37683219;BA.debugLine="Wait For (EnsureSingleTrackCached(item, cachedT";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuretrackscached"), __ref._ensuresingletrackcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_item,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 47;
return;
case 47:
//C
this.state = 37;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=37683220;
 //BA.debugLineNum = 37683220;BA.debugLine="If downloaded Then";
if (true) break;

case 37:
//if
this.state = 42;
if (_downloaded) { 
this.state = 39;
}else 
{RDebugUtils.currentLine=37683222;
 //BA.debugLineNum = 37683222;BA.debugLine="Else If IsTrackCached(trackId) = False Then";
if (__ref._istrackcached /*boolean*/ (null,_trackid)==parent.__c.False) { 
this.state = 41;
}}
if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=37683221;
 //BA.debugLineNum = 37683221;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=37683223;
 //BA.debugLineNum = 37683223;BA.debugLine="failedCount = failedCount + 1";
_failedcount = (int) (_failedcount+1);
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 46;
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = -1;
;
RDebugUtils.currentLine=37683227;
 //BA.debugLineNum = 37683227;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=37683228;
 //BA.debugLineNum = 37683228;BA.debugLine="Trace(\"Синхронизация кэша треков завершена. downl";
__ref._trace /*String*/ (null,"Синхронизация кэша треков завершена. downloaded="+BA.NumberToString(_downloadedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=37683229;
 //BA.debugLineNum = 37683229;BA.debugLine="Return downloadedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0));return;};
RDebugUtils.currentLine=37683230;
 //BA.debugLineNum = 37683230;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _touchcacheditem(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "touchcacheditem", false))
	 {return ((String) Debug.delegate(ba, "touchcacheditem", new Object[] {_item}));}
String _itemid = "";
String _itemtype = "";
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Public Sub TouchCachedItem(item As Map)";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="If itemId = \"\" Then Return";
if ((_itemid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=38600709;
 //BA.debugLineNum = 38600709;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=38600710;
 //BA.debugLineNum = 38600710;BA.debugLine="If cachedAdIndex.ContainsKey(itemId) = False The";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="UpdateAdIndex(item, cachedAdIndex)";
__ref._updateadindex /*String*/ (null,_item,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=38600712;
 //BA.debugLineNum = 38600712;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38600714;
 //BA.debugLineNum = 38600714;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=38600715;
 //BA.debugLineNum = 38600715;BA.debugLine="If cachedTrackIndex.ContainsKey(itemId) = False";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_itemid))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38600716;
 //BA.debugLineNum = 38600716;BA.debugLine="UpdateTrackIndex(item, cachedTrackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=38600718;
 //BA.debugLineNum = 38600718;BA.debugLine="End Sub";
return "";
}
public boolean  _iscacheauditinprogress(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "iscacheauditinprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "iscacheauditinprogress", null));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Public Sub IsCacheAuditInProgress As Boolean";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="Return cacheAuditInProgress";
if (true) return __ref._cacheauditinprogress /*boolean*/ ;
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="End Sub";
return false;
}
public String  _startcacheaudit(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "startcacheaudit", false))
	 {return ((String) Debug.delegate(ba, "startcacheaudit", null));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Public Sub StartCacheAudit";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="If cacheAuditInProgress Then Return";
if (__ref._cacheauditinprogress /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="cacheAuditPendingTypes.Initialize";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=36306947;
 //BA.debugLineNum = 36306947;BA.debugLine="cacheAuditPendingTypes.Add(\"ads\")";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("ads"));
RDebugUtils.currentLine=36306948;
 //BA.debugLineNum = 36306948;BA.debugLine="cacheAuditPendingTypes.Add(\"tracks\")";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("tracks"));
RDebugUtils.currentLine=36306949;
 //BA.debugLineNum = 36306949;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=36306950;
 //BA.debugLineNum = 36306950;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=36306951;
 //BA.debugLineNum = 36306951;BA.debugLine="cacheAuditCurrentPosition = 0";
__ref._cacheauditcurrentposition /*int*/  = (int) (0);
RDebugUtils.currentLine=36306952;
 //BA.debugLineNum = 36306952;BA.debugLine="cacheAuditSeenIds.Initialize";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=36306953;
 //BA.debugLineNum = 36306953;BA.debugLine="cacheAuditAdIndexChanged = False";
__ref._cacheauditadindexchanged /*boolean*/  = __c.False;
RDebugUtils.currentLine=36306954;
 //BA.debugLineNum = 36306954;BA.debugLine="cacheAuditTrackIndexChanged = False";
__ref._cacheaudittrackindexchanged /*boolean*/  = __c.False;
RDebugUtils.currentLine=36306955;
 //BA.debugLineNum = 36306955;BA.debugLine="cacheAuditAddedCount = 0";
__ref._cacheauditaddedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=36306956;
 //BA.debugLineNum = 36306956;BA.debugLine="cacheAuditRemovedCount = 0";
__ref._cacheauditremovedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=36306957;
 //BA.debugLineNum = 36306957;BA.debugLine="cacheAuditTempDeletedCount = 0";
__ref._cacheaudittempdeletedcount /*int*/  = (int) (0);
RDebugUtils.currentLine=36306958;
 //BA.debugLineNum = 36306958;BA.debugLine="cacheAuditListingInProgress = False";
__ref._cacheauditlistinginprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=36306959;
 //BA.debugLineNum = 36306959;BA.debugLine="cacheAuditListingDir = \"\"";
__ref._cacheauditlistingdir /*String*/  = "";
RDebugUtils.currentLine=36306960;
 //BA.debugLineNum = 36306960;BA.debugLine="cacheAuditInProgress = True";
__ref._cacheauditinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=36306961;
 //BA.debugLineNum = 36306961;BA.debugLine="End Sub";
return "";
}
public boolean  _runcacheauditstep(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "runcacheauditstep", false))
	 {return ((Boolean) Debug.delegate(ba, "runcacheauditstep", null));}
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Public Sub RunCacheAuditStep As Boolean";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="If cacheAuditInProgress = False Then Return False";
if (__ref._cacheauditinprogress /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="If cacheAuditCurrentType = \"\" Then";
if ((__ref._cacheauditcurrenttype /*String*/ ).equals("")) { 
RDebugUtils.currentLine=36372483;
 //BA.debugLineNum = 36372483;BA.debugLine="If PrepareNextCacheAuditType = False Then";
if (__ref._preparenextcacheaudittype /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="FinishCacheAudit";
__ref._finishcacheaudit /*String*/ (null);
RDebugUtils.currentLine=36372485;
 //BA.debugLineNum = 36372485;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=36372488;
 //BA.debugLineNum = 36372488;BA.debugLine="If cacheAuditListingInProgress Then Return True";
if (__ref._cacheauditlistinginprogress /*boolean*/ ) { 
if (true) return __c.True;};
RDebugUtils.currentLine=36372489;
 //BA.debugLineNum = 36372489;BA.debugLine="ProcessCurrentCacheAuditBatch";
__ref._processcurrentcacheauditbatch /*String*/ (null);
RDebugUtils.currentLine=36372490;
 //BA.debugLineNum = 36372490;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurrent";
if (__ref._cacheauditcurrentposition /*int*/ >=__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=36372491;
 //BA.debugLineNum = 36372491;BA.debugLine="FinalizeCurrentCacheAuditType";
__ref._finalizecurrentcacheaudittype /*String*/ (null);
RDebugUtils.currentLine=36372492;
 //BA.debugLineNum = 36372492;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=36372493;
 //BA.debugLineNum = 36372493;BA.debugLine="If cacheAuditPendingTypes.Size = 0 Then";
if (__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=36372494;
 //BA.debugLineNum = 36372494;BA.debugLine="FinishCacheAudit";
__ref._finishcacheaudit /*String*/ (null);
RDebugUtils.currentLine=36372495;
 //BA.debugLineNum = 36372495;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=36372498;
 //BA.debugLineNum = 36372498;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=36372499;
 //BA.debugLineNum = 36372499;BA.debugLine="End Sub";
return false;
}
public String  _flushpendingindexsaves(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "flushpendingindexsaves", false))
	 {return ((String) Debug.delegate(ba, "flushpendingindexsaves", null));}
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Public Sub FlushPendingIndexSaves";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="If cachedAdIndexDirty Then SaveAdIndex";
if (__ref._cachedadindexdirty /*boolean*/ ) { 
__ref._saveadindex /*String*/ (null);};
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="If cachedTrackIndexDirty Then SaveTrackIndex";
if (__ref._cachedtrackindexdirty /*boolean*/ ) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="End Sub";
return "";
}
public String  _cleanupplaybacktempfiles(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "cleanupplaybacktempfiles", false))
	 {return ((String) Debug.delegate(ba, "cleanupplaybacktempfiles", null));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Public Sub CleanupPlaybackTempFiles";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="DeleteFileIfExists(File.DirTemp, PRIMARY_TEMP_TRA";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),__ref._primary_temp_track_file /*String*/ );
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="DeleteFileIfExists(File.DirTemp, SECONDARY_TEMP_T";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),__ref._secondary_temp_track_file /*String*/ );
RDebugUtils.currentLine=36634627;
 //BA.debugLineNum = 36634627;BA.debugLine="playbackTempTrackIds.Clear";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=36634628;
 //BA.debugLineNum = 36634628;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensureadscached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensureadscached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensureadscached", new Object[] {_offlinedata}));}
ResumableSub_EnsureAdsCached rsub = new ResumableSub_EnsureAdsCached(this,__ref,_offlinedata);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureAdsCached extends BA.ResumableSub {
public ResumableSub_EnsureAdsCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) {
this.parent = parent;
this.__ref = __ref;
this._offlinedata = _offlinedata;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _offlinedata;
anywheresoftware.b4a.objects.collections.List _ads = null;
anywheresoftware.b4a.objects.collections.Map _actualadids = null;
int _downloadedcount = 0;
int _failedcount = 0;
Object _adobject = null;
anywheresoftware.b4a.objects.collections.Map _ad = null;
String _adid = "";
boolean _downloaded = false;
int _removedcount = 0;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mediacache";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="FlushPendingIndexSaves";
__ref._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_offlinedata.IsInitialized()==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=36438019;
 //BA.debugLineNum = 36438019;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if (true) break;

case 7:
//if
this.state = 12;
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) == false) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=36438020;
 //BA.debugLineNum = 36438020;BA.debugLine="Dim ads As List = offlineData.GetDefault(\"ads\", N";
_ads = new anywheresoftware.b4a.objects.collections.List();
_ads = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("ads"),parent.__c.Null)));
RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="Dim cachedAdIndex As Map = GetCachedAdIndex";
parent._cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
parent._cachedadindex = __ref._getcachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=36438022;
 //BA.debugLineNum = 36438022;BA.debugLine="Dim actualAdIds As Map";
_actualadids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36438023;
 //BA.debugLineNum = 36438023;BA.debugLine="actualAdIds.Initialize";
_actualadids.Initialize();
RDebugUtils.currentLine=36438024;
 //BA.debugLineNum = 36438024;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=36438025;
 //BA.debugLineNum = 36438025;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=36438026;
 //BA.debugLineNum = 36438026;BA.debugLine="If ads.IsInitialized Then";
if (true) break;

case 13:
//if
this.state = 36;
if (_ads.IsInitialized()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=36438027;
 //BA.debugLineNum = 36438027;BA.debugLine="For Each adObject As Object In ads";
if (true) break;

case 16:
//for
this.state = 35;
group11 = _ads;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 35;
if (index11 < groupLen11) {
this.state = 18;
_adobject = group11.Get(index11);}
if (true) break;

case 38:
//C
this.state = 37;
index11++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=36438028;
 //BA.debugLineNum = 36438028;BA.debugLine="If adObject Is Map Then";
if (true) break;

case 19:
//if
this.state = 34;
if (_adobject instanceof java.util.Map) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=36438029;
 //BA.debugLineNum = 36438029;BA.debugLine="Dim ad As Map = adObject";
_ad = new anywheresoftware.b4a.objects.collections.Map();
_ad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adobject));
RDebugUtils.currentLine=36438030;
 //BA.debugLineNum = 36438030;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=36438031;
 //BA.debugLineNum = 36438031;BA.debugLine="If adId = \"\" Then Continue";
if (true) break;

case 22:
//if
this.state = 27;
if ((_adid).equals("")) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
this.state = 38;
if (true) break;;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=36438032;
 //BA.debugLineNum = 36438032;BA.debugLine="actualAdIds.Put(adId, True)";
_actualadids.Put((Object)(_adid),(Object)(parent.__c.True));
RDebugUtils.currentLine=36438033;
 //BA.debugLineNum = 36438033;BA.debugLine="Wait For (EnsureSingleAdCached(ad, cachedAdInd";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensureadscached"), __ref._ensuresingleadcached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_ad,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 39;
return;
case 39:
//C
this.state = 28;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=36438034;
 //BA.debugLineNum = 36438034;BA.debugLine="If downloaded Then";
if (true) break;

case 28:
//if
this.state = 33;
if (_downloaded) { 
this.state = 30;
}else 
{RDebugUtils.currentLine=36438036;
 //BA.debugLineNum = 36438036;BA.debugLine="Else If IsAdCached(adId) = False Then";
if (__ref._isadcached /*boolean*/ (null,_adid)==parent.__c.False) { 
this.state = 32;
}}
if (true) break;

case 30:
//C
this.state = 33;
RDebugUtils.currentLine=36438035;
 //BA.debugLineNum = 36438035;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=36438037;
 //BA.debugLineNum = 36438037;BA.debugLine="failedCount = failedCount + 1";
_failedcount = (int) (_failedcount+1);
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = 38;
;
 if (true) break;
if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=36438042;
 //BA.debugLineNum = 36438042;BA.debugLine="Dim removedCount As Int = PruneMissingAds(cachedA";
_removedcount = __ref._prunemissingads /*int*/ (null,__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ,_actualadids);
RDebugUtils.currentLine=36438043;
 //BA.debugLineNum = 36438043;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=36438044;
 //BA.debugLineNum = 36438044;BA.debugLine="Trace(\"ad cache sync done downloaded=\" & download";
__ref._trace /*String*/ (null,"ad cache sync done downloaded="+BA.NumberToString(_downloadedcount)+" failed="+BA.NumberToString(_failedcount)+" removed="+BA.NumberToString(_removedcount)+" actual="+BA.NumberToString(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=36438045;
 //BA.debugLineNum = 36438045;BA.debugLine="Return downloadedCount > 0 Or removedCount > 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloadedcount>0 || _removedcount>0));return;};
RDebugUtils.currentLine=36438046;
 //BA.debugLineNum = 36438046;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _isadcached(b4j.example.mediacache __ref,String _adid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "isadcached", false))
	 {return ((Boolean) Debug.delegate(ba, "isadcached", new Object[] {_adid}));}
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Public Sub IsAdCached(adId As String) As Boolean";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="If adId = \"\" Then Return False";
if ((_adid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="Return ValidateIndexedFile(\"ad\", adId)";
if (true) return __ref._validateindexedfile /*boolean*/ (null,"ad",_adid);
RDebugUtils.currentLine=36765699;
 //BA.debugLineNum = 36765699;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.mediacache __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,b4j.example.keyvaluestore _storagevalue,Object _targetmodulevalue,String _tracesubnamevalue,String _deviceidvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_storagevalue,_targetmodulevalue,_tracesubnamevalue,_deviceidvalue}));}
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Public Sub Initialize(storageDirValue As String, s";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="storage = storageValue";
__ref._storage /*b4j.example.keyvaluestore*/  = _storagevalue;
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="playbackTempTrackIds.Initialize";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=36175878;
 //BA.debugLineNum = 36175878;BA.debugLine="cachedTrackPlaylistStats.Initialize";
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=36175879;
 //BA.debugLineNum = 36175879;BA.debugLine="cachedAdIndexDirty = False";
__ref._cachedadindexdirty /*boolean*/  = __c.False;
RDebugUtils.currentLine=36175880;
 //BA.debugLineNum = 36175880;BA.debugLine="cachedTrackIndexDirty = False";
__ref._cachedtrackindexdirty /*boolean*/  = __c.False;
RDebugUtils.currentLine=36175881;
 //BA.debugLineNum = 36175881;BA.debugLine="EnsureDirectory(GetAdsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getadsdir /*String*/ (null));
RDebugUtils.currentLine=36175882;
 //BA.debugLineNum = 36175882;BA.debugLine="EnsureDirectory(GetTracksDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gettracksdir /*String*/ (null));
RDebugUtils.currentLine=36175883;
 //BA.debugLineNum = 36175883;BA.debugLine="LoadIndexesFromStorage";
__ref._loadindexesfromstorage /*String*/ (null);
RDebugUtils.currentLine=36175884;
 //BA.debugLineNum = 36175884;BA.debugLine="End Sub";
return "";
}
public String  _resolvelocalmediauri(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvelocalmediauri", false))
	 {return ((String) Debug.delegate(ba, "resolvelocalmediauri", new Object[] {_item}));}
String _itemtype = "";
String _itemid = "";
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Public Sub ResolveLocalMediaUri(item As Map) As St";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=36503555;
 //BA.debugLineNum = 36503555;BA.debugLine="Dim itemId As String = item.GetDefault(\"id\", \"\")";
_itemid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=36503556;
 //BA.debugLineNum = 36503556;BA.debugLine="If itemId = \"\" Then Return \"\"";
if ((_itemid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=36503557;
 //BA.debugLineNum = 36503557;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=36503558;
 //BA.debugLineNum = 36503558;BA.debugLine="If itemType = \"ad\" Then Return File.GetUri(GetAds";
if ((_itemtype).equals("ad")) { 
if (true) return __c.File.GetUri(__ref._getadsdir /*String*/ (null),_itemid);};
RDebugUtils.currentLine=36503559;
 //BA.debugLineNum = 36503559;BA.debugLine="If itemType = \"track\" Then Return ResolveRelative";
if ((_itemtype).equals("track")) { 
if (true) return __ref._resolverelativefileuri /*String*/ (null,__ref._gettracksdir /*String*/ (null),__ref._resolvetrackrelativefilenamefromitem /*String*/ (null,_item));};
RDebugUtils.currentLine=36503560;
 //BA.debugLineNum = 36503560;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=36503561;
 //BA.debugLineNum = 36503561;BA.debugLine="End Sub";
return "";
}
public int  _getcachedadcount(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedadcount", false))
	 {return ((Integer) Debug.delegate(ba, "getcachedadcount", null));}
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Public Sub GetCachedAdCount As Int";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="Return cachedAdCount";
if (true) return __ref._cachedadcount /*int*/ ;
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="End Sub";
return 0;
}
public long  _getcachedadbytes(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedadbytes", false))
	 {return ((Long) Debug.delegate(ba, "getcachedadbytes", null));}
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Public Sub GetCachedAdBytes As Long";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="Return cachedAdBytes";
if (true) return __ref._cachedadbytes /*long*/ ;
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="End Sub";
return 0L;
}
public String  _resolveplaybackmediauri(b4j.example.mediacache __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveplaybackmediauri", false))
	 {return ((String) Debug.delegate(ba, "resolveplaybackmediauri", new Object[] {_audiokey,_item}));}
String _itemtype = "";
String _trackid = "";
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Public Sub ResolvePlaybackMediaUri(audioKey As Str";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=36569091;
 //BA.debugLineNum = 36569091;BA.debugLine="If itemType = \"ad\" Then Return ResolveLocalMediaU";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._resolvelocalmediauri /*String*/ (null,_item);};
RDebugUtils.currentLine=36569092;
 //BA.debugLineNum = 36569092;BA.debugLine="If itemType <> \"track\" Then Return \"\"";
if ((_itemtype).equals("track") == false) { 
if (true) return "";};
RDebugUtils.currentLine=36569093;
 //BA.debugLineNum = 36569093;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=36569094;
 //BA.debugLineNum = 36569094;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=36569095;
 //BA.debugLineNum = 36569095;BA.debugLine="If HasValidatedLocalMedia(item) = False Then Retu";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=36569096;
 //BA.debugLineNum = 36569096;BA.debugLine="If EnsureTrackPlaybackTemp(audioKey, item) = Fals";
if (__ref._ensuretrackplaybacktemp /*boolean*/ (null,_audiokey,_item)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=36569097;
 //BA.debugLineNum = 36569097;BA.debugLine="Return File.GetUri(File.DirTemp, BuildPlaybackTem";
if (true) return __c.File.GetUri(__c.File.getDirTemp(),__ref._buildplaybacktemptrackfilename /*String*/ (null,_audiokey));
RDebugUtils.currentLine=36569098;
 //BA.debugLineNum = 36569098;BA.debugLine="End Sub";
return "";
}
public int  _getcachedtrackcount(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackcount", false))
	 {return ((Integer) Debug.delegate(ba, "getcachedtrackcount", null));}
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Public Sub GetCachedTrackCount As Int";
RDebugUtils.currentLine=37093377;
 //BA.debugLineNum = 37093377;BA.debugLine="Return cachedTrackCount";
if (true) return __ref._cachedtrackcount /*int*/ ;
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="End Sub";
return 0;
}
public long  _getcachedtrackbytes(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackbytes", false))
	 {return ((Long) Debug.delegate(ba, "getcachedtrackbytes", null));}
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Public Sub GetCachedTrackBytes As Long";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="Return cachedTrackBytes";
if (true) return __ref._cachedtrackbytes /*long*/ ;
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="End Sub";
return 0L;
}
public String  _resolvemediasource(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvemediasource", false))
	 {return ((String) Debug.delegate(ba, "resolvemediasource", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Public Sub ResolveMediaSource(item As Map) As Stri";
RDebugUtils.currentLine=40304641;
 //BA.debugLineNum = 40304641;BA.debugLine="If item.IsInitialized = False Then Return \"none\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "none";};
RDebugUtils.currentLine=40304642;
 //BA.debugLineNum = 40304642;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=40304643;
 //BA.debugLineNum = 40304643;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=40304644;
 //BA.debugLineNum = 40304644;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)) { 
if (true) return "cache";};
RDebugUtils.currentLine=40304645;
 //BA.debugLineNum = 40304645;BA.debugLine="Return \"missing\"";
if (true) return "missing";
 };
RDebugUtils.currentLine=40304647;
 //BA.debugLineNum = 40304647;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=40304648;
 //BA.debugLineNum = 40304648;BA.debugLine="If HasValidatedLocalMedia(item) Then Return \"cac";
if (__ref._hasvalidatedlocalmedia /*boolean*/ (null,_item)) { 
if (true) return "cache";};
RDebugUtils.currentLine=40304649;
 //BA.debugLineNum = 40304649;BA.debugLine="Return \"missing\"";
if (true) return "missing";
 };
RDebugUtils.currentLine=40304651;
 //BA.debugLineNum = 40304651;BA.debugLine="Return \"none\"";
if (true) return "none";
RDebugUtils.currentLine=40304652;
 //BA.debugLineNum = 40304652;BA.debugLine="End Sub";
return "";
}
public String  _accumulatetrackplayliststat(b4j.example.mediacache __ref,String _playlistid,long _trackbytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "accumulatetrackplayliststat", false))
	 {return ((String) Debug.delegate(ba, "accumulatetrackplayliststat", new Object[] {_playlistid,_trackbytes}));}
String _statskey = "";
anywheresoftware.b4a.objects.collections.Map _playlistentry = null;
RDebugUtils.currentLine=43515904;
 //BA.debugLineNum = 43515904;BA.debugLine="Private Sub AccumulateTrackPlaylistStat(playlistId";
RDebugUtils.currentLine=43515905;
 //BA.debugLineNum = 43515905;BA.debugLine="Dim statsKey As String = playlistId";
_statskey = _playlistid;
RDebugUtils.currentLine=43515906;
 //BA.debugLineNum = 43515906;BA.debugLine="If statsKey = \"\" Then statsKey = \"_unknown\"";
if ((_statskey).equals("")) { 
_statskey = "_unknown";};
RDebugUtils.currentLine=43515907;
 //BA.debugLineNum = 43515907;BA.debugLine="Dim playlistEntry As Map = cachedTrackPlaylistSta";
_playlistentry = new anywheresoftware.b4a.objects.collections.Map();
_playlistentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_statskey),__c.Null)));
RDebugUtils.currentLine=43515908;
 //BA.debugLineNum = 43515908;BA.debugLine="If playlistEntry.IsInitialized = False Then";
if (_playlistentry.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=43515909;
 //BA.debugLineNum = 43515909;BA.debugLine="playlistEntry.Initialize";
_playlistentry.Initialize();
RDebugUtils.currentLine=43515910;
 //BA.debugLineNum = 43515910;BA.debugLine="playlistEntry.Put(\"count\", 0)";
_playlistentry.Put((Object)("count"),(Object)(0));
RDebugUtils.currentLine=43515911;
 //BA.debugLineNum = 43515911;BA.debugLine="playlistEntry.Put(\"bytes\", 0)";
_playlistentry.Put((Object)("bytes"),(Object)(0));
 };
RDebugUtils.currentLine=43515913;
 //BA.debugLineNum = 43515913;BA.debugLine="playlistEntry.Put(\"count\", playlistEntry.GetDefau";
_playlistentry.Put((Object)("count"),(Object)((double)(BA.ObjectToNumber(_playlistentry.GetDefault((Object)("count"),(Object)(0))))+1));
RDebugUtils.currentLine=43515914;
 //BA.debugLineNum = 43515914;BA.debugLine="playlistEntry.Put(\"bytes\", ToLongDefault(playlist";
_playlistentry.Put((Object)("bytes"),(Object)(__ref._tolongdefault /*long*/ (null,_playlistentry.GetDefault((Object)("bytes"),(Object)(0)),(long) (0))+_trackbytes));
RDebugUtils.currentLine=43515915;
 //BA.debugLineNum = 43515915;BA.debugLine="cachedTrackPlaylistStats.Put(statsKey, playlistEn";
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_statskey),(Object)(_playlistentry.getObject()));
RDebugUtils.currentLine=43515916;
 //BA.debugLineNum = 43515916;BA.debugLine="End Sub";
return "";
}
public long  _tolongdefault(b4j.example.mediacache __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=43253760;
 //BA.debugLineNum = 43253760;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="Try";
try {RDebugUtils.currentLine=43253762;
 //BA.debugLineNum = 43253762;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=43253763;
 //BA.debugLineNum = 43253763;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=43253765;
 //BA.debugLineNum = 43253765;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
RDebugUtils.currentLine=43253767;
 //BA.debugLineNum = 43253767;BA.debugLine="End Sub";
return 0L;
}
public String  _addindexedfilefromaudit(b4j.example.mediacache __ref,String _itemtype,String _filename,anywheresoftware.b4a.objects.collections.Map _auditindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "addindexedfilefromaudit", false))
	 {return ((String) Debug.delegate(ba, "addindexedfilefromaudit", new Object[] {_itemtype,_filename,_auditindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _existingentry = null;
String _playlistid = "";
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Private Sub AddIndexedFileFromAudit(itemType As St";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=41746435;
 //BA.debugLineNum = 41746435;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=41746436;
 //BA.debugLineNum = 41746436;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=41746437;
 //BA.debugLineNum = 41746437;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
RDebugUtils.currentLine=41746438;
 //BA.debugLineNum = 41746438;BA.debugLine="entry.Put(\"id\", fileName)";
_entry.Put((Object)("id"),(Object)(_filename));
RDebugUtils.currentLine=41746439;
 //BA.debugLineNum = 41746439;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
RDebugUtils.currentLine=41746440;
 //BA.debugLineNum = 41746440;BA.debugLine="entry.Put(\"duration\", 0)";
_entry.Put((Object)("duration"),(Object)(0));
RDebugUtils.currentLine=41746441;
 //BA.debugLineNum = 41746441;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
RDebugUtils.currentLine=41746442;
 //BA.debugLineNum = 41746442;BA.debugLine="auditIndex.Put(fileName, entry)";
_auditindex.Put((Object)(_filename),(Object)(_entry.getObject()));
 }else {
RDebugUtils.currentLine=41746444;
 //BA.debugLineNum = 41746444;BA.debugLine="Dim trackId As String = FindTrackIdByFileName(fi";
_trackid = __ref._findtrackidbyfilename /*String*/ (null,_filename,_auditindex);
RDebugUtils.currentLine=41746445;
 //BA.debugLineNum = 41746445;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=41746446;
 //BA.debugLineNum = 41746446;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=41746447;
 //BA.debugLineNum = 41746447;BA.debugLine="entry.Put(\"title\", \"\")";
_entry.Put((Object)("title"),(Object)(""));
RDebugUtils.currentLine=41746448;
 //BA.debugLineNum = 41746448;BA.debugLine="entry.Put(\"set\", \"\")";
_entry.Put((Object)("set"),(Object)(""));
RDebugUtils.currentLine=41746449;
 //BA.debugLineNum = 41746449;BA.debugLine="entry.Put(\"stream\", \"\")";
_entry.Put((Object)("stream"),(Object)(""));
RDebugUtils.currentLine=41746450;
 //BA.debugLineNum = 41746450;BA.debugLine="entry.Put(\"gain\", 0)";
_entry.Put((Object)("gain"),(Object)(0));
RDebugUtils.currentLine=41746451;
 //BA.debugLineNum = 41746451;BA.debugLine="Dim existingEntry As Map = auditIndex.GetDefault";
_existingentry = new anywheresoftware.b4a.objects.collections.Map();
_existingentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_auditindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=41746452;
 //BA.debugLineNum = 41746452;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFrom";
_playlistid = __ref._extractplaylistidfromtrackrelativepath /*String*/ (null,_filename);
RDebugUtils.currentLine=41746453;
 //BA.debugLineNum = 41746453;BA.debugLine="If playlistId = \"\" And existingEntry.IsInitializ";
if ((_playlistid).equals("") && _existingentry.IsInitialized()) { 
_playlistid = BA.ObjectToString(_existingentry.GetDefault((Object)("playlist_id"),(Object)("")));};
RDebugUtils.currentLine=41746454;
 //BA.debugLineNum = 41746454;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=41746455;
 //BA.debugLineNum = 41746455;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=41746456;
 //BA.debugLineNum = 41746456;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTrack";
_entry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_filename)));
RDebugUtils.currentLine=41746457;
 //BA.debugLineNum = 41746457;BA.debugLine="auditIndex.Put(trackId, entry)";
_auditindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
 };
RDebugUtils.currentLine=41746459;
 //BA.debugLineNum = 41746459;BA.debugLine="MarkAuditIndexChanged(itemType)";
__ref._markauditindexchanged /*String*/ (null,_itemtype);
RDebugUtils.currentLine=41746460;
 //BA.debugLineNum = 41746460;BA.debugLine="End Sub";
return "";
}
public String  _findtrackidbyfilename(b4j.example.mediacache __ref,String _filename,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "findtrackidbyfilename", false))
	 {return ((String) Debug.delegate(ba, "findtrackidbyfilename", new Object[] {_filename,_trackindex}));}
String _key = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _storedfilename = "";
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Private Sub FindTrackIdByFileName(fileName As Stri";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="For Each key As String In trackIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _trackindex.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_key = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(key, Nu";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_key),__c.Null)));
RDebugUtils.currentLine=41877507;
 //BA.debugLineNum = 41877507;BA.debugLine="If entry.IsInitialized Then";
if (_entry.IsInitialized()) { 
RDebugUtils.currentLine=41877508;
 //BA.debugLineNum = 41877508;BA.debugLine="Dim storedFileName As String = entry.GetDefault";
_storedfilename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=41877509;
 //BA.debugLineNum = 41877509;BA.debugLine="If storedFileName = fileName Then Return key";
if ((_storedfilename).equals(_filename)) { 
if (true) return _key;};
 };
RDebugUtils.currentLine=41877511;
 //BA.debugLineNum = 41877511;BA.debugLine="If File.GetName(fileName) = BuildTrackCacheFileN";
if ((__c.File.GetName(_filename)).equals(__ref._buildtrackcachefilename /*String*/ (null,_key))) { 
if (true) return _key;};
 }
};
RDebugUtils.currentLine=41877513;
 //BA.debugLineNum = 41877513;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=41877514;
 //BA.debugLineNum = 41877514;BA.debugLine="End Sub";
return "";
}
public String  _extractplaylistidfromtrackrelativepath(b4j.example.mediacache __ref,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "extractplaylistidfromtrackrelativepath", false))
	 {return ((String) Debug.delegate(ba, "extractplaylistidfromtrackrelativepath", new Object[] {_relativefilename}));}
String _normalized = "";
int _slashindex = 0;
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Private Sub ExtractPlaylistIdFromTrackRelativePath";
RDebugUtils.currentLine=42532865;
 //BA.debugLineNum = 42532865;BA.debugLine="If relativeFileName = \"\" Then Return \"\"";
if ((_relativefilename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="Dim normalized As String = relativeFileName.Repla";
_normalized = _relativefilename.replace("\\\\","/");
RDebugUtils.currentLine=42532867;
 //BA.debugLineNum = 42532867;BA.debugLine="Dim slashIndex As Int = normalized.IndexOf(\"/\")";
_slashindex = _normalized.indexOf("/");
RDebugUtils.currentLine=42532868;
 //BA.debugLineNum = 42532868;BA.debugLine="If slashIndex <= 0 Then Return \"\"";
if (_slashindex<=0) { 
if (true) return "";};
RDebugUtils.currentLine=42532869;
 //BA.debugLineNum = 42532869;BA.debugLine="Return normalized.SubString2(0, slashIndex)";
if (true) return _normalized.substring((int) (0),_slashindex);
RDebugUtils.currentLine=42532870;
 //BA.debugLineNum = 42532870;BA.debugLine="End Sub";
return "";
}
public long  _getfilesizesafe(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getfilesizesafe", false))
	 {return ((Long) Debug.delegate(ba, "getfilesizesafe", new Object[] {_dir,_filename}));}
String _filedir = "";
String _leafname = "";
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Private Sub GetFileSizeSafe(dir As String, fileNam";
RDebugUtils.currentLine=42991617;
 //BA.debugLineNum = 42991617;BA.debugLine="Try";
try {RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir";
_filedir = __ref._resolverelativeparentdir /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=42991619;
 //BA.debugLineNum = 42991619;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName";
_leafname = __ref._resolverelativeleafname /*String*/ (null,_filename);
RDebugUtils.currentLine=42991620;
 //BA.debugLineNum = 42991620;BA.debugLine="Return File.Size(fileDir, leafName)";
if (true) return __c.File.Size(_filedir,_leafname);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=42991622;
 //BA.debugLineNum = 42991622;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=42991624;
 //BA.debugLineNum = 42991624;BA.debugLine="End Sub";
return 0L;
}
public String  _gettracksdir(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "gettracksdir", false))
	 {return ((String) Debug.delegate(ba, "gettracksdir", null));}
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Public Sub GetTracksDir As String";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(__ref._storagedir /*String*/ ,__ref._mediadirname /*String*/ ),__ref._tracksdirname /*String*/ );
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="End Sub";
return "";
}
public String  _markauditindexchanged(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "markauditindexchanged", false))
	 {return ((String) Debug.delegate(ba, "markauditindexchanged", new Object[] {_itemtype}));}
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Private Sub MarkAuditIndexChanged(itemType As Stri";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="If itemType = \"ads\" Then";
if ((_itemtype).equals("ads")) { 
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="cacheAuditAdIndexChanged = True";
__ref._cacheauditadindexchanged /*boolean*/  = __c.True;
RDebugUtils.currentLine=41680899;
 //BA.debugLineNum = 41680899;BA.debugLine="cachedAdIndexDirty = True";
__ref._cachedadindexdirty /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=41680901;
 //BA.debugLineNum = 41680901;BA.debugLine="cacheAuditTrackIndexChanged = True";
__ref._cacheaudittrackindexchanged /*boolean*/  = __c.True;
RDebugUtils.currentLine=41680902;
 //BA.debugLineNum = 41680902;BA.debugLine="cachedTrackIndexDirty = True";
__ref._cachedtrackindexdirty /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=41680904;
 //BA.debugLineNum = 41680904;BA.debugLine="End Sub";
return "";
}
public String  _applyxortobuffer(b4j.example.mediacache __ref,byte[] _buffer,int _count,byte[] _keybytes,long _keyoffset) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "applyxortobuffer", false))
	 {return ((String) Debug.delegate(ba, "applyxortobuffer", new Object[] {_buffer,_count,_keybytes,_keyoffset}));}
int _i = 0;
int _keyindex = 0;
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Private Sub ApplyXorToBuffer(buffer() As Byte, cou";
RDebugUtils.currentLine=40173569;
 //BA.debugLineNum = 40173569;BA.debugLine="If count <= 0 Or keyBytes.Length = 0 Then Return";
if (_count<=0 || _keybytes.length==0) { 
if (true) return "";};
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="For i = 0 To count - 1";
{
final int step2 = 1;
final int limit2 = (int) (_count-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=40173571;
 //BA.debugLineNum = 40173571;BA.debugLine="Dim keyIndex As Int = (keyOffset + i) Mod keyByt";
_keyindex = (int) ((_keyoffset+_i)%_keybytes.length);
RDebugUtils.currentLine=40173572;
 //BA.debugLineNum = 40173572;BA.debugLine="buffer(i) = Bit.Xor(buffer(i), keyBytes(keyIndex";
_buffer[_i] = (byte) (__c.Bit.Xor((int) (_buffer[_i]),(int) (_keybytes[_keyindex])));
 }
};
RDebugUtils.currentLine=40173574;
 //BA.debugLineNum = 40173574;BA.debugLine="End Sub";
return "";
}
public String  _backfilltrackindexfromfiles(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "backfilltrackindexfromfiles", false))
	 {return ((String) Debug.delegate(ba, "backfilltrackindexfromfiles", null));}
boolean _changed = false;
anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps = null;
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
String _filename = "";
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _storedfilename = "";
String _playlistid = "";
long _filesize = 0L;
long _storedsize = 0L;
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Private Sub BackfillTrackIndexFromFiles";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
RDebugUtils.currentLine=42139651;
 //BA.debugLineNum = 42139651;BA.debugLine="Dim playlistTrackMaps As Map";
_playlisttrackmaps = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42139652;
 //BA.debugLineNum = 42139652;BA.debugLine="playlistTrackMaps.Initialize";
_playlisttrackmaps.Initialize();
RDebugUtils.currentLine=42139653;
 //BA.debugLineNum = 42139653;BA.debugLine="Try";
try {RDebugUtils.currentLine=42139654;
 //BA.debugLineNum = 42139654;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Re";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42139655;
 //BA.debugLineNum = 42139655;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __ref._listtrackcachefilesrecursive /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=42139656;
 //BA.debugLineNum = 42139656;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42139657;
 //BA.debugLineNum = 42139657;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group9 = _listedfiles;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_filename = BA.ObjectToString(group9.Get(index9));
RDebugUtils.currentLine=42139658;
 //BA.debugLineNum = 42139658;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=42139659;
 //BA.debugLineNum = 42139659;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
RDebugUtils.currentLine=42139660;
 //BA.debugLineNum = 42139660;BA.debugLine="Dim trackId As String = FindTrackIdByFileNameWi";
_trackid = __ref._findtrackidbyfilenamewithmetadata /*String*/ (null,_filename,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ,_playlisttrackmaps);
RDebugUtils.currentLine=42139661;
 //BA.debugLineNum = 42139661;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=42139662;
 //BA.debugLineNum = 42139662;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=42139663;
 //BA.debugLineNum = 42139663;BA.debugLine="If entry.IsInitialized = False Then entry.Initi";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=42139664;
 //BA.debugLineNum = 42139664;BA.debugLine="Dim storedFileName As String = \"\" & entry.GetDe";
_storedfilename = ""+BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=42139665;
 //BA.debugLineNum = 42139665;BA.debugLine="If storedFileName <> fileName Then";
if ((_storedfilename).equals(_filename) == false) { 
RDebugUtils.currentLine=42139666;
 //BA.debugLineNum = 42139666;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=42139667;
 //BA.debugLineNum = 42139667;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=42139669;
 //BA.debugLineNum = 42139669;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFro";
_playlistid = __ref._extractplaylistidfromtrackrelativepath /*String*/ (null,_filename);
RDebugUtils.currentLine=42139670;
 //BA.debugLineNum = 42139670;BA.debugLine="If playlistId = \"\" Then playlistId = ResolvePla";
if ((_playlistid).equals("")) { 
_playlistid = __ref._resolveplaylistidfortrackid /*String*/ (null,_trackid,BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)(""))),_playlisttrackmaps);};
RDebugUtils.currentLine=42139671;
 //BA.debugLineNum = 42139671;BA.debugLine="If playlistId <> \"\" And entry.GetDefault(\"playl";
if ((_playlistid).equals("") == false && (_entry.GetDefault((Object)("playlist_id"),(Object)(""))).equals((Object)(_playlistid)) == false) { 
RDebugUtils.currentLine=42139672;
 //BA.debugLineNum = 42139672;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=42139673;
 //BA.debugLineNum = 42139673;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=42139675;
 //BA.debugLineNum = 42139675;BA.debugLine="If entry.ContainsKey(\"id\") = False Then";
if (_entry.ContainsKey((Object)("id"))==__c.False) { 
RDebugUtils.currentLine=42139676;
 //BA.debugLineNum = 42139676;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=42139677;
 //BA.debugLineNum = 42139677;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=42139679;
 //BA.debugLineNum = 42139679;BA.debugLine="Dim fileSize As Long = GetFileSizeSafe(GetTrack";
_filesize = __ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_filename);
RDebugUtils.currentLine=42139680;
 //BA.debugLineNum = 42139680;BA.debugLine="Dim storedSize As Long = ToLongDefault(entry.Ge";
_storedsize = __ref._tolongdefault /*long*/ (null,_entry.GetDefault((Object)("size_bytes"),(Object)(-1)),(long) (-1));
RDebugUtils.currentLine=42139681;
 //BA.debugLineNum = 42139681;BA.debugLine="If storedSize <> fileSize Then";
if (_storedsize!=_filesize) { 
RDebugUtils.currentLine=42139682;
 //BA.debugLineNum = 42139682;BA.debugLine="entry.Put(\"size_bytes\", fileSize)";
_entry.Put((Object)("size_bytes"),(Object)(_filesize));
RDebugUtils.currentLine=42139683;
 //BA.debugLineNum = 42139683;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=42139685;
 //BA.debugLineNum = 42139685;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
RDebugUtils.currentLine=42139686;
 //BA.debugLineNum = 42139686;BA.debugLine="entry.Put(\"saved_at\", DateTime.Now)";
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=42139687;
 //BA.debugLineNum = 42139687;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=42139689;
 //BA.debugLineNum = 42139689;BA.debugLine="If entry.ContainsKey(\"last_used_at\") = False Th";
if (_entry.ContainsKey((Object)("last_used_at"))==__c.False) { 
RDebugUtils.currentLine=42139690;
 //BA.debugLineNum = 42139690;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=42139691;
 //BA.debugLineNum = 42139691;BA.debugLine="changed = True";
_changed = __c.True;
 };
RDebugUtils.currentLine=42139693;
 //BA.debugLineNum = 42139693;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_trackid),(Object)(_entry.getObject()));
 }
};
 } 
       catch (Exception e48) {
			ba.setLastException(e48);RDebugUtils.currentLine=42139696;
 //BA.debugLineNum = 42139696;BA.debugLine="Trace(\"Не удалось выполнить стартовую переиндекс";
__ref._trace /*String*/ (null,"Не удалось выполнить стартовую переиндексацию кэша треков. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=42139698;
 //BA.debugLineNum = 42139698;BA.debugLine="If changed Then SaveTrackIndex";
if (_changed) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=42139699;
 //BA.debugLineNum = 42139699;BA.debugLine="End Sub";
return "";
}
public boolean  _directoryexists(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "directoryexists", false))
	 {return ((Boolean) Debug.delegate(ba, "directoryexists", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Private Sub DirectoryExists(path As String) As Boo";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="If path = \"\" Then Return False";
if ((_path).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="Try";
try {RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=41156612;
 //BA.debugLineNum = 41156612;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=41156613;
 //BA.debugLineNum = 41156613;BA.debugLine="If fileObject.RunMethod(\"exists\", Null) = False";
if ((_fileobject.RunMethod("exists",(Object[])(__c.Null))).equals((Object)(__c.False))) { 
if (true) return __c.False;};
RDebugUtils.currentLine=41156614;
 //BA.debugLineNum = 41156614;BA.debugLine="Return fileObject.RunMethod(\"isDirectory\", Null)";
if (true) return BA.ObjectToBoolean(_fileobject.RunMethod("isDirectory",(Object[])(__c.Null)));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=41156616;
 //BA.debugLineNum = 41156616;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=41156618;
 //BA.debugLineNum = 41156618;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _listtrackcachefilesrecursive(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "listtrackcachefilesrecursive", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listtrackcachefilesrecursive", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Private Sub ListTrackCacheFilesRecursive As List";
RDebugUtils.currentLine=42598401;
 //BA.debugLineNum = 42598401;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=42598403;
 //BA.debugLineNum = 42598403;BA.debugLine="ListTrackCacheFilesInto(GetTracksDir, \"\", result)";
__ref._listtrackcachefilesinto /*String*/ (null,__ref._gettracksdir /*String*/ (null),"",_result);
RDebugUtils.currentLine=42598404;
 //BA.debugLineNum = 42598404;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=42598405;
 //BA.debugLineNum = 42598405;BA.debugLine="End Sub";
return null;
}
public String  _findtrackidbyfilenamewithmetadata(b4j.example.mediacache __ref,String _filename,anywheresoftware.b4a.objects.collections.Map _trackindex,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "findtrackidbyfilenamewithmetadata", false))
	 {return ((String) Debug.delegate(ba, "findtrackidbyfilenamewithmetadata", new Object[] {_filename,_trackindex,_playlisttrackmaps}));}
String _resolvedtrackid = "";
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _globaltrackmap = null;
anywheresoftware.b4a.objects.collections.Map _playlisttrackmap = null;
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Private Sub FindTrackIdByFileNameWithMetadata(file";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="Dim resolvedTrackId As String = FindTrackIdByFile";
_resolvedtrackid = __ref._findtrackidbyfilename /*String*/ (null,_filename,_trackindex);
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="If resolvedTrackId <> \"\" Then Return resolvedTrac";
if ((_resolvedtrackid).equals("") == false) { 
if (true) return _resolvedtrackid;};
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFromT";
_playlistid = __ref._extractplaylistidfromtrackrelativepath /*String*/ (null,_filename);
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="If playlistId = \"\" Then";
if ((_playlistid).equals("")) { 
RDebugUtils.currentLine=41943045;
 //BA.debugLineNum = 41943045;BA.debugLine="Dim globalTrackMap As Map = LoadGlobalTrackFileM";
_globaltrackmap = new anywheresoftware.b4a.objects.collections.Map();
_globaltrackmap = __ref._loadglobaltrackfilemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlisttrackmaps);
RDebugUtils.currentLine=41943046;
 //BA.debugLineNum = 41943046;BA.debugLine="If globalTrackMap.IsInitialized = False Then Ret";
if (_globaltrackmap.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=41943047;
 //BA.debugLineNum = 41943047;BA.debugLine="Return globalTrackMap.GetDefault(File.GetName(fi";
if (true) return BA.ObjectToString(_globaltrackmap.GetDefault((Object)(__c.File.GetName(_filename)),(Object)("")));
 };
RDebugUtils.currentLine=41943049;
 //BA.debugLineNum = 41943049;BA.debugLine="Dim playlistTrackMap As Map = LoadPlaylistTrackFi";
_playlisttrackmap = new anywheresoftware.b4a.objects.collections.Map();
_playlisttrackmap = __ref._loadplaylisttrackfilemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid,_playlisttrackmaps);
RDebugUtils.currentLine=41943050;
 //BA.debugLineNum = 41943050;BA.debugLine="If playlistTrackMap.IsInitialized = False Then Re";
if (_playlisttrackmap.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=41943051;
 //BA.debugLineNum = 41943051;BA.debugLine="Return playlistTrackMap.GetDefault(fileName, \"\")";
if (true) return BA.ObjectToString(_playlisttrackmap.GetDefault((Object)(_filename),(Object)("")));
RDebugUtils.currentLine=41943052;
 //BA.debugLineNum = 41943052;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaylistidfortrackid(b4j.example.mediacache __ref,String _trackid,String _preferredplaylistid,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveplaylistidfortrackid", false))
	 {return ((String) Debug.delegate(ba, "resolveplaylistidfortrackid", new Object[] {_trackid,_preferredplaylistid,_playlisttrackmaps}));}
String _playlistsdir = "";
anywheresoftware.b4a.objects.collections.List _listed = null;
String _filename = "";
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlisttrackids = null;
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Private Sub ResolvePlaylistIdForTrackId(trackId As";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="If preferredPlaylistId <> \"\" Then Return preferre";
if ((_preferredplaylistid).equals("") == false) { 
if (true) return _preferredplaylistid;};
RDebugUtils.currentLine=42205187;
 //BA.debugLineNum = 42205187;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
_playlistsdir = __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=42205188;
 //BA.debugLineNum = 42205188;BA.debugLine="If DirectoryExists(playlistsDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,_playlistsdir)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42205189;
 //BA.debugLineNum = 42205189;BA.debugLine="Try";
try {RDebugUtils.currentLine=42205190;
 //BA.debugLineNum = 42205190;BA.debugLine="Dim listed As List = File.ListFiles(playlistsDir";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_playlistsdir);
RDebugUtils.currentLine=42205191;
 //BA.debugLineNum = 42205191;BA.debugLine="If listed.IsInitialized = False Then Return \"\"";
if (_listed.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42205192;
 //BA.debugLineNum = 42205192;BA.debugLine="For Each fileName As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group8 = _listed;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_filename = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=42205193;
 //BA.debugLineNum = 42205193;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=42205194;
 //BA.debugLineNum = 42205194;BA.debugLine="If fileName.ToLowerCase.EndsWith(\".json\") = Fal";
if (_filename.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).endsWith(".json")==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=42205195;
 //BA.debugLineNum = 42205195;BA.debugLine="Dim playlistId As String = fileName.SubString2(";
_playlistid = _filename.substring((int) (0),(int) (_filename.length()-5));
RDebugUtils.currentLine=42205196;
 //BA.debugLineNum = 42205196;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=42205197;
 //BA.debugLineNum = 42205197;BA.debugLine="Dim playlistTrackIds As Map = LoadPlaylistTrack";
_playlisttrackids = new anywheresoftware.b4a.objects.collections.Map();
_playlisttrackids = __ref._loadplaylisttrackidmap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid,_playlisttrackmaps);
RDebugUtils.currentLine=42205198;
 //BA.debugLineNum = 42205198;BA.debugLine="If playlistTrackIds.IsInitialized = False Then";
if (_playlisttrackids.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=42205199;
 //BA.debugLineNum = 42205199;BA.debugLine="If playlistTrackIds.ContainsKey(trackId) Then R";
if (_playlisttrackids.ContainsKey((Object)(_trackid))) { 
if (true) return _playlistid;};
 }
};
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=42205202;
 //BA.debugLineNum = 42205202;BA.debugLine="Trace(\"Не удалось определить playlist_id для cac";
__ref._trace /*String*/ (null,"Не удалось определить playlist_id для cached track. trackId="+_trackid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=42205204;
 //BA.debugLineNum = 42205204;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=42205205;
 //BA.debugLineNum = 42205205;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.mediacache __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=43974657;
 //BA.debugLineNum = 43974657;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=43974660;
 //BA.debugLineNum = 43974660;BA.debugLine="End Sub";
return "";
}
public String  _savetrackindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "savetrackindex", false))
	 {return ((String) Debug.delegate(ba, "savetrackindex", null));}
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Private Sub SaveTrackIndex";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="RebuildCacheStatsFromIndexes";
__ref._rebuildcachestatsfromindexes /*String*/ (null);
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="storage.Put(\"cached_track_index\", cachedTrackInde";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_index",(Object)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=38797315;
 //BA.debugLineNum = 38797315;BA.debugLine="storage.Put(\"cached_track_count\", cachedTrackCoun";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_track_count",(Object)(__ref._cachedtrackcount /*int*/ ));
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="SaveCacheStatsSnapshot";
__ref._savecachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=38797317;
 //BA.debugLineNum = 38797317;BA.debugLine="cachedTrackIndexDirty = False";
__ref._cachedtrackindexdirty /*boolean*/  = __c.False;
RDebugUtils.currentLine=38797318;
 //BA.debugLineNum = 38797318;BA.debugLine="End Sub";
return "";
}
public String  _buildadurl(b4j.example.mediacache __ref,String _adid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildadurl", false))
	 {return ((String) Debug.delegate(ba, "buildadurl", new Object[] {_adid}));}
String _first = "";
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Private Sub BuildAdUrl(adId As String) As String";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="If adId = \"\" Then Return \"\"";
if ((_adid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="Dim first As String = adId.SubString2(0, 1)";
_first = _adid.substring((int) (0),(int) (1));
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="Return \"https://cdn.fon.fm/media/ads/\" & first &";
if (true) return "https://cdn.fon.fm/media/ads/"+_first+"/"+_adid+".mp3";
RDebugUtils.currentLine=38862852;
 //BA.debugLineNum = 38862852;BA.debugLine="End Sub";
return "";
}
public String  _buildplaybacktemptrackfilename(b4j.example.mediacache __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildplaybacktemptrackfilename", false))
	 {return ((String) Debug.delegate(ba, "buildplaybacktemptrackfilename", new Object[] {_audiokey}));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Private Sub BuildPlaybackTempTrackFileName(audioKe";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="If audioKey = \"secondary\" Then Return SECONDARY_T";
if ((_audiokey).equals("secondary")) { 
if (true) return __ref._secondary_temp_track_file /*String*/ ;};
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="Return PRIMARY_TEMP_TRACK_FILE";
if (true) return __ref._primary_temp_track_file /*String*/ ;
RDebugUtils.currentLine=39321603;
 //BA.debugLineNum = 39321603;BA.debugLine="End Sub";
return "";
}
public String  _buildtempcachefilename(b4j.example.mediacache __ref,String _itemid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtempcachefilename", false))
	 {return ((String) Debug.delegate(ba, "buildtempcachefilename", new Object[] {_itemid}));}
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Private Sub BuildTempCacheFileName(itemId As Strin";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="Return itemId & \".tmp\"";
if (true) return _itemid+".tmp";
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="End Sub";
return "";
}
public String  _buildtrackcachefilename(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackcachefilename", false))
	 {return ((String) Debug.delegate(ba, "buildtrackcachefilename", new Object[] {_trackid}));}
byte[] _sourcebytes = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _uuid = null;
String _filename = "";
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Private Sub BuildTrackCacheFileName(trackId As Str";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Dim sourceBytes() As Byte = GetBytesFromString(Bu";
_sourcebytes = __ref._getbytesfromstring /*byte[]*/ (null,__ref._buildtrackobfuscationseed /*String*/ (null,"cache",_trackid));
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
_jo.InitializeStatic("java.util.UUID");
RDebugUtils.currentLine=38993924;
 //BA.debugLineNum = 38993924;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"nameUUIDFr";
_uuid = new anywheresoftware.b4j.object.JavaObject();
_uuid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("nameUUIDFromBytes",new Object[]{(Object)(_sourcebytes)})));
RDebugUtils.currentLine=38993925;
 //BA.debugLineNum = 38993925;BA.debugLine="Dim fileName As String = uuid.RunMethod(\"toString";
_filename = BA.ObjectToString(_uuid.RunMethod("toString",(Object[])(__c.Null)));
RDebugUtils.currentLine=38993926;
 //BA.debugLineNum = 38993926;BA.debugLine="Return fileName.Replace(\"-\", \"\")";
if (true) return _filename.replace("-","");
RDebugUtils.currentLine=38993927;
 //BA.debugLineNum = 38993927;BA.debugLine="End Sub";
return "";
}
public byte[]  _getbytesfromstring(b4j.example.mediacache __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getbytesfromstring", false))
	 {return ((byte[]) Debug.delegate(ba, "getbytesfromstring", new Object[] {_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Private Sub GetBytesFromString(value As String) As";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="jo.InitializeNewInstance(\"java.lang.String\", Arra";
_jo.InitializeNewInstance("java.lang.String",new Object[]{(Object)(_value)});
RDebugUtils.currentLine=40042499;
 //BA.debugLineNum = 40042499;BA.debugLine="Return jo.RunMethod(\"getBytes\", Array As Object(\"";
if (true) return (byte[])(_jo.RunMethod("getBytes",new Object[]{(Object)("UTF-8")}));
RDebugUtils.currentLine=40042500;
 //BA.debugLineNum = 40042500;BA.debugLine="End Sub";
return null;
}
public String  _buildtrackobfuscationseed(b4j.example.mediacache __ref,String _purpose,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackobfuscationseed", false))
	 {return ((String) Debug.delegate(ba, "buildtrackobfuscationseed", new Object[] {_purpose,_trackid}));}
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Private Sub BuildTrackObfuscationSeed(purpose As S";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="Return \"fonfm|\" & purpose & \"|\" & trackId";
if (true) return "fonfm|"+_purpose+"|"+_trackid;
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="End Sub";
return "";
}
public String  _buildtrackcacherelativefilename(b4j.example.mediacache __ref,String _trackid,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackcacherelativefilename", false))
	 {return ((String) Debug.delegate(ba, "buildtrackcacherelativefilename", new Object[] {_trackid,_playlistid}));}
String _unusedplaylistid = "";
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Private Sub BuildTrackCacheRelativeFileName(trackI";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Dim unusedPlaylistId As String = playlistId";
_unusedplaylistid = _playlistid;
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="If unusedPlaylistId = \"\" Then";
if ((_unusedplaylistid).equals("")) { 
 };
RDebugUtils.currentLine=39059460;
 //BA.debugLineNum = 39059460;BA.debugLine="Return BuildTrackCacheFileName(trackId)";
if (true) return __ref._buildtrackcachefilename /*String*/ (null,_trackid);
RDebugUtils.currentLine=39059461;
 //BA.debugLineNum = 39059461;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _buildtrackcachesummary(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _protectedids,anywheresoftware.b4a.objects.collections.Map _relevantids) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackcachesummary", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "buildtrackcachesummary", new Object[] {_protectedids,_relevantids}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.List _candidates = null;
anywheresoftware.b4a.objects.collections.List _keystoremove = null;
long _cachebytes = 0L;
String _trackid = "";
String _filename = "";
long _filebytes = 0L;
anywheresoftware.b4a.objects.collections.Map _entry = null;
anywheresoftware.b4a.objects.collections.Map _candidate = null;
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Private Sub BuildTrackCacheSummary(protectedIds As";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=42401795;
 //BA.debugLineNum = 42401795;BA.debugLine="Dim candidates As List";
_candidates = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=42401796;
 //BA.debugLineNum = 42401796;BA.debugLine="candidates.Initialize";
_candidates.Initialize();
RDebugUtils.currentLine=42401797;
 //BA.debugLineNum = 42401797;BA.debugLine="Dim keysToRemove As List";
_keystoremove = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=42401798;
 //BA.debugLineNum = 42401798;BA.debugLine="keysToRemove.Initialize";
_keystoremove.Initialize();
RDebugUtils.currentLine=42401799;
 //BA.debugLineNum = 42401799;BA.debugLine="Dim cacheBytes As Long = 0";
_cachebytes = (long) (0);
RDebugUtils.currentLine=42401800;
 //BA.debugLineNum = 42401800;BA.debugLine="For Each trackId As String In cachedTrackIndex.Ke";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_trackid = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=42401801;
 //BA.debugLineNum = 42401801;BA.debugLine="Dim fileName As String = ResolveTrackCacheFileNa";
_filename = __ref._resolvetrackcachefilename /*String*/ (null,_trackid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=42401802;
 //BA.debugLineNum = 42401802;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) =";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_filename)==__c.False) { 
RDebugUtils.currentLine=42401803;
 //BA.debugLineNum = 42401803;BA.debugLine="keysToRemove.Add(trackId)";
_keystoremove.Add((Object)(_trackid));
RDebugUtils.currentLine=42401804;
 //BA.debugLineNum = 42401804;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=42401806;
 //BA.debugLineNum = 42401806;BA.debugLine="Dim fileBytes As Long = GetFileSizeSafe(GetTrack";
_filebytes = __ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_filename);
RDebugUtils.currentLine=42401807;
 //BA.debugLineNum = 42401807;BA.debugLine="cacheBytes = cacheBytes + fileBytes";
_cachebytes = (long) (_cachebytes+_filebytes);
RDebugUtils.currentLine=42401808;
 //BA.debugLineNum = 42401808;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(t";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=42401809;
 //BA.debugLineNum = 42401809;BA.debugLine="If entry.IsInitialized = False Then entry.Initia";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=42401810;
 //BA.debugLineNum = 42401810;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=42401811;
 //BA.debugLineNum = 42401811;BA.debugLine="entry.Put(\"size_bytes\", fileBytes)";
_entry.Put((Object)("size_bytes"),(Object)(_filebytes));
RDebugUtils.currentLine=42401812;
 //BA.debugLineNum = 42401812;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=42401813;
 //BA.debugLineNum = 42401813;BA.debugLine="If protectedIds.ContainsKey(trackId) Then Contin";
if (_protectedids.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=42401814;
 //BA.debugLineNum = 42401814;BA.debugLine="Dim candidate As Map";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42401815;
 //BA.debugLineNum = 42401815;BA.debugLine="candidate.Initialize";
_candidate.Initialize();
RDebugUtils.currentLine=42401816;
 //BA.debugLineNum = 42401816;BA.debugLine="candidate.Put(\"id\", trackId)";
_candidate.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=42401817;
 //BA.debugLineNum = 42401817;BA.debugLine="candidate.Put(\"file_name\", fileName)";
_candidate.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=42401818;
 //BA.debugLineNum = 42401818;BA.debugLine="candidate.Put(\"size_bytes\", fileBytes)";
_candidate.Put((Object)("size_bytes"),(Object)(_filebytes));
RDebugUtils.currentLine=42401819;
 //BA.debugLineNum = 42401819;BA.debugLine="candidate.Put(\"last_used_at\", entry.GetDefault(\"";
_candidate.Put((Object)("last_used_at"),_entry.GetDefault((Object)("last_used_at"),(Object)(0)));
RDebugUtils.currentLine=42401820;
 //BA.debugLineNum = 42401820;BA.debugLine="candidate.Put(\"saved_at\", entry.GetDefault(\"save";
_candidate.Put((Object)("saved_at"),_entry.GetDefault((Object)("saved_at"),(Object)(0)));
RDebugUtils.currentLine=42401821;
 //BA.debugLineNum = 42401821;BA.debugLine="candidate.Put(\"is_relevant\", relevantIds.Contain";
_candidate.Put((Object)("is_relevant"),(Object)(_relevantids.ContainsKey((Object)(_trackid))));
RDebugUtils.currentLine=42401822;
 //BA.debugLineNum = 42401822;BA.debugLine="candidates.Add(candidate)";
_candidates.Add((Object)(_candidate.getObject()));
 }
};
RDebugUtils.currentLine=42401824;
 //BA.debugLineNum = 42401824;BA.debugLine="For Each trackId As String In keysToRemove";
{
final anywheresoftware.b4a.BA.IterableList group32 = _keystoremove;
final int groupLen32 = group32.getSize()
;int index32 = 0;
;
for (; index32 < groupLen32;index32++){
_trackid = BA.ObjectToString(group32.Get(index32));
RDebugUtils.currentLine=42401825;
 //BA.debugLineNum = 42401825;BA.debugLine="cachedTrackIndex.Remove(trackId)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_trackid));
 }
};
RDebugUtils.currentLine=42401827;
 //BA.debugLineNum = 42401827;BA.debugLine="If keysToRemove.Size > 0 Then SaveTrackIndex";
if (_keystoremove.getSize()>0) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=42401828;
 //BA.debugLineNum = 42401828;BA.debugLine="result.Put(\"cache_bytes\", cacheBytes)";
_result.Put((Object)("cache_bytes"),(Object)(_cachebytes));
RDebugUtils.currentLine=42401829;
 //BA.debugLineNum = 42401829;BA.debugLine="result.Put(\"candidates\", candidates)";
_result.Put((Object)("candidates"),(Object)(_candidates.getObject()));
RDebugUtils.currentLine=42401830;
 //BA.debugLineNum = 42401830;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=42401831;
 //BA.debugLineNum = 42401831;BA.debugLine="End Sub";
return null;
}
public String  _resolvetrackcachefilename(b4j.example.mediacache __ref,String _trackid,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvetrackcachefilename", false))
	 {return ((String) Debug.delegate(ba, "resolvetrackcachefilename", new Object[] {_trackid,_trackindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _filename = "";
String _playlistid = "";
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Private Sub ResolveTrackCacheFileName(trackId As S";
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="If entry.IsInitialized Then";
if (_entry.IsInitialized()) { 
RDebugUtils.currentLine=40894467;
 //BA.debugLineNum = 40894467;BA.debugLine="Dim fileName As String = entry.GetDefault(\"file_";
_filename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=40894468;
 //BA.debugLineNum = 40894468;BA.debugLine="If fileName <> \"\" Then Return fileName";
if ((_filename).equals("") == false) { 
if (true) return _filename;};
 };
RDebugUtils.currentLine=40894470;
 //BA.debugLineNum = 40894470;BA.debugLine="Dim playlistId As String = \"\"";
_playlistid = "";
RDebugUtils.currentLine=40894471;
 //BA.debugLineNum = 40894471;BA.debugLine="If entry.IsInitialized Then playlistId = entry.Ge";
if (_entry.IsInitialized()) { 
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));};
RDebugUtils.currentLine=40894472;
 //BA.debugLineNum = 40894472;BA.debugLine="Return BuildTrackCacheRelativeFileName(trackId, p";
if (true) return __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid);
RDebugUtils.currentLine=40894473;
 //BA.debugLineNum = 40894473;BA.debugLine="End Sub";
return "";
}
public boolean  _iscachedfileusable(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "iscachedfileusable", false))
	 {return ((Boolean) Debug.delegate(ba, "iscachedfileusable", new Object[] {_dir,_filename}));}
String _filedir = "";
String _leafname = "";
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Private Sub IsCachedFileUsable(dir As String, file";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="If fileName = \"\" Then Return False";
if ((_filename).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir(";
_filedir = __ref._resolverelativeparentdir /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=39190531;
 //BA.debugLineNum = 39190531;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName(";
_leafname = __ref._resolverelativeleafname /*String*/ (null,_filename);
RDebugUtils.currentLine=39190532;
 //BA.debugLineNum = 39190532;BA.debugLine="If File.Exists(fileDir, leafName) = False Then Re";
if (__c.File.Exists(_filedir,_leafname)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=39190533;
 //BA.debugLineNum = 39190533;BA.debugLine="Try";
try {RDebugUtils.currentLine=39190534;
 //BA.debugLineNum = 39190534;BA.debugLine="If File.Size(fileDir, leafName) > 0 Then Return";
if (__c.File.Size(_filedir,_leafname)>0) { 
if (true) return __c.True;};
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=39190536;
 //BA.debugLineNum = 39190536;BA.debugLine="Trace(\"ошибка кэша context=file_size message=\" &";
__ref._trace /*String*/ (null,"ошибка кэша context=file_size message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=39190538;
 //BA.debugLineNum = 39190538;BA.debugLine="DeleteFileIfExists(dir, fileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=39190539;
 //BA.debugLineNum = 39190539;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=39190540;
 //BA.debugLineNum = 39190540;BA.debugLine="End Sub";
return false;
}
public byte[]  _buildtrackobfuscationkey(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackobfuscationkey", false))
	 {return ((byte[]) Debug.delegate(ba, "buildtrackobfuscationkey", new Object[] {_trackid}));}
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Private Sub BuildTrackObfuscationKey(trackId As St";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="Return GetBytesFromString(BuildTrackObfuscationSe";
if (true) return __ref._getbytesfromstring /*byte[]*/ (null,__ref._buildtrackobfuscationseed /*String*/ (null,"key",_trackid));
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="End Sub";
return null;
}
public String  _buildtrackurl(b4j.example.mediacache __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "buildtrackurl", false))
	 {return ((String) Debug.delegate(ba, "buildtrackurl", new Object[] {_trackid}));}
String _first = "";
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Private Sub BuildTrackUrl(trackId As String) As St";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="Dim first As String = trackId.SubString2(0, 1)";
_first = _trackid.substring((int) (0),(int) (1));
RDebugUtils.currentLine=38928387;
 //BA.debugLineNum = 38928387;BA.debugLine="Return \"https://cdn.fon.fm/media/tracks/\" & first";
if (true) return "https://cdn.fon.fm/media/tracks/"+_first+"/"+_trackid+".mp3";
RDebugUtils.currentLine=38928388;
 //BA.debugLineNum = 38928388;BA.debugLine="End Sub";
return "";
}
public long  _bytestomb(b4j.example.mediacache __ref,long _valuebytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "bytestomb", false))
	 {return ((Long) Debug.delegate(ba, "bytestomb", new Object[] {_valuebytes}));}
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Private Sub BytesToMb(valueBytes As Long) As Long";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="Return Floor(valueBytes / 1024 / 1024)";
if (true) return (long) (__c.Floor(_valuebytes/(double)1024/(double)1024));
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="End Sub";
return 0L;
}
public String  _class_globals(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=36110341;
 //BA.debugLineNum = 36110341;BA.debugLine="Private mediaDirName As String = \"media\"";
_mediadirname = "media";
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="Private adsDirName As String = \"ads\"";
_adsdirname = "ads";
RDebugUtils.currentLine=36110343;
 //BA.debugLineNum = 36110343;BA.debugLine="Private tracksDirName As String = \"tracks\"";
_tracksdirname = "tracks";
RDebugUtils.currentLine=36110344;
 //BA.debugLineNum = 36110344;BA.debugLine="Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8";
_cache_audit_batch_size = (int) (8);
RDebugUtils.currentLine=36110345;
 //BA.debugLineNum = 36110345;BA.debugLine="Private Const AD_DOWNLOAD_TIMEOUT_MS As Int = 150";
_ad_download_timeout_ms = (int) (15000);
RDebugUtils.currentLine=36110346;
 //BA.debugLineNum = 36110346;BA.debugLine="Private Const TRACK_DOWNLOAD_TIMEOUT_MS As Int =";
_track_download_timeout_ms = (int) (10000);
RDebugUtils.currentLine=36110347;
 //BA.debugLineNum = 36110347;BA.debugLine="Private Const STREAM_XOR_BUFFER_SIZE As Int = 327";
_stream_xor_buffer_size = (int) (32768);
RDebugUtils.currentLine=36110348;
 //BA.debugLineNum = 36110348;BA.debugLine="Private Const TRACK_CACHE_HARD_LIMIT_MB As Long =";
_track_cache_hard_limit_mb = (long) (1536);
RDebugUtils.currentLine=36110349;
 //BA.debugLineNum = 36110349;BA.debugLine="Private Const TRACK_CACHE_TARGET_MB As Long = 768";
_track_cache_target_mb = (long) (768);
RDebugUtils.currentLine=36110350;
 //BA.debugLineNum = 36110350;BA.debugLine="Private Const MIN_FREE_DISK_MB As Long = 1536";
_min_free_disk_mb = (long) (1536);
RDebugUtils.currentLine=36110351;
 //BA.debugLineNum = 36110351;BA.debugLine="Private Const MIN_FREE_DISK_PERCENT As Int = 5";
_min_free_disk_percent = (int) (5);
RDebugUtils.currentLine=36110352;
 //BA.debugLineNum = 36110352;BA.debugLine="Private Const PRIMARY_TEMP_TRACK_FILE As String =";
_primary_temp_track_file = "2f7f5f2f-91a0-4f4c-9f5f-70d7b94fd101.tmp";
RDebugUtils.currentLine=36110353;
 //BA.debugLineNum = 36110353;BA.debugLine="Private Const SECONDARY_TEMP_TRACK_FILE As String";
_secondary_temp_track_file = "92c2df6a-7f22-4b75-8c09-d5a6f4f40a21.tmp";
RDebugUtils.currentLine=36110354;
 //BA.debugLineNum = 36110354;BA.debugLine="Private cachedAdIndex As Map";
_cachedadindex = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36110355;
 //BA.debugLineNum = 36110355;BA.debugLine="Private cachedTrackIndex As Map";
_cachedtrackindex = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36110356;
 //BA.debugLineNum = 36110356;BA.debugLine="Private cachedAdIndexDirty As Boolean";
_cachedadindexdirty = false;
RDebugUtils.currentLine=36110357;
 //BA.debugLineNum = 36110357;BA.debugLine="Private cachedTrackIndexDirty As Boolean";
_cachedtrackindexdirty = false;
RDebugUtils.currentLine=36110358;
 //BA.debugLineNum = 36110358;BA.debugLine="Private playbackTempTrackIds As Map";
_playbacktemptrackids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36110359;
 //BA.debugLineNum = 36110359;BA.debugLine="Private cacheAuditInProgress As Boolean";
_cacheauditinprogress = false;
RDebugUtils.currentLine=36110360;
 //BA.debugLineNum = 36110360;BA.debugLine="Private cacheAuditPendingTypes As List";
_cacheauditpendingtypes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36110361;
 //BA.debugLineNum = 36110361;BA.debugLine="Private cacheAuditCurrentType As String";
_cacheauditcurrenttype = "";
RDebugUtils.currentLine=36110362;
 //BA.debugLineNum = 36110362;BA.debugLine="Private cacheAuditCurrentFileNames As List";
_cacheauditcurrentfilenames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36110363;
 //BA.debugLineNum = 36110363;BA.debugLine="Private cacheAuditCurrentPosition As Int";
_cacheauditcurrentposition = 0;
RDebugUtils.currentLine=36110364;
 //BA.debugLineNum = 36110364;BA.debugLine="Private cacheAuditSeenIds As Map";
_cacheauditseenids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36110365;
 //BA.debugLineNum = 36110365;BA.debugLine="Private cacheAuditAdIndexChanged As Boolean";
_cacheauditadindexchanged = false;
RDebugUtils.currentLine=36110366;
 //BA.debugLineNum = 36110366;BA.debugLine="Private cacheAuditTrackIndexChanged As Boolean";
_cacheaudittrackindexchanged = false;
RDebugUtils.currentLine=36110367;
 //BA.debugLineNum = 36110367;BA.debugLine="Private cacheAuditAddedCount As Int";
_cacheauditaddedcount = 0;
RDebugUtils.currentLine=36110368;
 //BA.debugLineNum = 36110368;BA.debugLine="Private cacheAuditRemovedCount As Int";
_cacheauditremovedcount = 0;
RDebugUtils.currentLine=36110369;
 //BA.debugLineNum = 36110369;BA.debugLine="Private cacheAuditTempDeletedCount As Int";
_cacheaudittempdeletedcount = 0;
RDebugUtils.currentLine=36110370;
 //BA.debugLineNum = 36110370;BA.debugLine="Private recentMediaNetworkFailure As Boolean";
_recentmedianetworkfailure = false;
RDebugUtils.currentLine=36110371;
 //BA.debugLineNum = 36110371;BA.debugLine="Private pruneLastCacheBytes As Long";
_prunelastcachebytes = 0L;
RDebugUtils.currentLine=36110372;
 //BA.debugLineNum = 36110372;BA.debugLine="Private pruneLastFreeBytes As Long";
_prunelastfreebytes = 0L;
RDebugUtils.currentLine=36110373;
 //BA.debugLineNum = 36110373;BA.debugLine="Private cachedTrackCount As Int";
_cachedtrackcount = 0;
RDebugUtils.currentLine=36110374;
 //BA.debugLineNum = 36110374;BA.debugLine="Private cachedAdCount As Int";
_cachedadcount = 0;
RDebugUtils.currentLine=36110375;
 //BA.debugLineNum = 36110375;BA.debugLine="Private cachedTrackBytes As Long";
_cachedtrackbytes = 0L;
RDebugUtils.currentLine=36110376;
 //BA.debugLineNum = 36110376;BA.debugLine="Private cachedAdBytes As Long";
_cachedadbytes = 0L;
RDebugUtils.currentLine=36110377;
 //BA.debugLineNum = 36110377;BA.debugLine="Private cachedTrackPlaylistStats As Map";
_cachedtrackplayliststats = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36110378;
 //BA.debugLineNum = 36110378;BA.debugLine="Private cacheAuditListingInProgress As Boolean";
_cacheauditlistinginprogress = false;
RDebugUtils.currentLine=36110379;
 //BA.debugLineNum = 36110379;BA.debugLine="Private cacheAuditListingDir As String";
_cacheauditlistingdir = "";
RDebugUtils.currentLine=36110380;
 //BA.debugLineNum = 36110380;BA.debugLine="End Sub";
return "";
}
public String  _cleanupemptytrackplaylistdir(b4j.example.mediacache __ref,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "cleanupemptytrackplaylistdir", false))
	 {return ((String) Debug.delegate(ba, "cleanupemptytrackplaylistdir", new Object[] {_relativefilename}));}
String _playlistid = "";
String _playlistdir = "";
anywheresoftware.b4a.objects.collections.List _listed = null;
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Private Sub CleanupEmptyTrackPlaylistDir(relativeF";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="Dim playlistId As String = ExtractPlaylistIdFromT";
_playlistid = __ref._extractplaylistidfromtrackrelativepath /*String*/ (null,_relativefilename);
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="If playlistId = \"\" Then Return";
if ((_playlistid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=42729475;
 //BA.debugLineNum = 42729475;BA.debugLine="Try";
try {RDebugUtils.currentLine=42729476;
 //BA.debugLineNum = 42729476;BA.debugLine="Dim playlistDir As String = File.Combine(GetTrac";
_playlistdir = __c.File.Combine(__ref._gettracksdir /*String*/ (null),_playlistid);
RDebugUtils.currentLine=42729477;
 //BA.debugLineNum = 42729477;BA.debugLine="If DirectoryExists(playlistDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,_playlistdir)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42729478;
 //BA.debugLineNum = 42729478;BA.debugLine="Dim listed As List = File.ListFiles(playlistDir)";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_playlistdir);
RDebugUtils.currentLine=42729479;
 //BA.debugLineNum = 42729479;BA.debugLine="If listed.IsInitialized = False Or listed.Size =";
if (_listed.IsInitialized()==__c.False || _listed.getSize()==0) { 
RDebugUtils.currentLine=42729480;
 //BA.debugLineNum = 42729480;BA.debugLine="File.Delete(playlistDir, \"\")";
__c.File.Delete(_playlistdir,"");
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=42729483;
 //BA.debugLineNum = 42729483;BA.debugLine="Trace(\"Не удалось очистить пустую папку плейлист";
__ref._trace /*String*/ (null,"Не удалось очистить пустую папку плейлиста. playlistId="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=42729485;
 //BA.debugLineNum = 42729485;BA.debugLine="End Sub";
return "";
}
public String  _cleanuplegacytracksubdirs(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "cleanuplegacytracksubdirs", false))
	 {return ((String) Debug.delegate(ba, "cleanuplegacytracksubdirs", null));}
anywheresoftware.b4a.objects.collections.List _listed = null;
String _name = "";
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Private Sub CleanupLegacyTrackSubdirs";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="Try";
try {RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="Dim listed As List = File.ListFiles(GetTracksDir";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(__ref._gettracksdir /*String*/ (null));
RDebugUtils.currentLine=39780355;
 //BA.debugLineNum = 39780355;BA.debugLine="If listed.IsInitialized = False Then Return";
if (_listed.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=39780356;
 //BA.debugLineNum = 39780356;BA.debugLine="For Each name As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group4 = _listed;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_name = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=39780357;
 //BA.debugLineNum = 39780357;BA.debugLine="If name = \"\" Then Continue";
if ((_name).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=39780358;
 //BA.debugLineNum = 39780358;BA.debugLine="If File.IsDirectory(GetTracksDir, name) = False";
if (__c.File.IsDirectory(__ref._gettracksdir /*String*/ (null),_name)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=39780359;
 //BA.debugLineNum = 39780359;BA.debugLine="DeleteTrackSubdirRecursive(File.Combine(GetTrac";
__ref._deletetracksubdirrecursive /*String*/ (null,__c.File.Combine(__ref._gettracksdir /*String*/ (null),_name));
 }
};
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=39780362;
 //BA.debugLineNum = 39780362;BA.debugLine="Trace(\"Не удалось очистить legacy папки кэша тре";
__ref._trace /*String*/ (null,"Не удалось очистить legacy папки кэша треков. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=39780364;
 //BA.debugLineNum = 39780364;BA.debugLine="End Sub";
return "";
}
public String  _deletetracksubdirrecursive(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "deletetracksubdirrecursive", false))
	 {return ((String) Debug.delegate(ba, "deletetracksubdirrecursive", new Object[] {_path}));}
anywheresoftware.b4a.objects.collections.List _listed = null;
String _name = "";
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Private Sub DeleteTrackSubdirRecursive(path As Str";
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="Try";
try {RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="If DirectoryExists(path) = False Then Return";
if (__ref._directoryexists /*boolean*/ (null,_path)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=39845891;
 //BA.debugLineNum = 39845891;BA.debugLine="Dim listed As List = File.ListFiles(path)";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_path);
RDebugUtils.currentLine=39845892;
 //BA.debugLineNum = 39845892;BA.debugLine="If listed.IsInitialized Then";
if (_listed.IsInitialized()) { 
RDebugUtils.currentLine=39845893;
 //BA.debugLineNum = 39845893;BA.debugLine="For Each name As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listed;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=39845894;
 //BA.debugLineNum = 39845894;BA.debugLine="If name = \"\" Then Continue";
if ((_name).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=39845895;
 //BA.debugLineNum = 39845895;BA.debugLine="If File.IsDirectory(path, name) Then";
if (__c.File.IsDirectory(_path,_name)) { 
RDebugUtils.currentLine=39845896;
 //BA.debugLineNum = 39845896;BA.debugLine="DeleteTrackSubdirRecursive(File.Combine(path,";
__ref._deletetracksubdirrecursive /*String*/ (null,__c.File.Combine(_path,_name));
 }else {
RDebugUtils.currentLine=39845898;
 //BA.debugLineNum = 39845898;BA.debugLine="File.Delete(path, name)";
__c.File.Delete(_path,_name);
 };
 }
};
 };
RDebugUtils.currentLine=39845902;
 //BA.debugLineNum = 39845902;BA.debugLine="File.Delete(path, \"\")";
__c.File.Delete(_path,"");
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=39845904;
 //BA.debugLineNum = 39845904;BA.debugLine="Trace(\"Не удалось удалить legacy папку кэша трек";
__ref._trace /*String*/ (null,"Не удалось удалить legacy папку кэша треков. dir="+_path+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=39845906;
 //BA.debugLineNum = 39845906;BA.debugLine="End Sub";
return "";
}
public String  _deletefileifexists(b4j.example.mediacache __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "deletefileifexists", false))
	 {return ((String) Debug.delegate(ba, "deletefileifexists", new Object[] {_dir,_filename}));}
String _filedir = "";
String _leafname = "";
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Private Sub DeleteFileIfExists(dir As String, file";
RDebugUtils.currentLine=40239105;
 //BA.debugLineNum = 40239105;BA.debugLine="If fileName = \"\" Then Return";
if ((_filename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="Try";
try {RDebugUtils.currentLine=40239107;
 //BA.debugLineNum = 40239107;BA.debugLine="Dim fileDir As String = ResolveRelativeParentDir";
_filedir = __ref._resolverelativeparentdir /*String*/ (null,_dir,_filename);
RDebugUtils.currentLine=40239108;
 //BA.debugLineNum = 40239108;BA.debugLine="Dim leafName As String = ResolveRelativeLeafName";
_leafname = __ref._resolverelativeleafname /*String*/ (null,_filename);
RDebugUtils.currentLine=40239109;
 //BA.debugLineNum = 40239109;BA.debugLine="If File.Exists(fileDir, leafName) Then File.Dele";
if (__c.File.Exists(_filedir,_leafname)) { 
__c.File.Delete(_filedir,_leafname);};
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=40239111;
 //BA.debugLineNum = 40239111;BA.debugLine="Trace(\"ошибка кэша context=file_delete message=\"";
__ref._trace /*String*/ (null,"ошибка кэша context=file_delete message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=40239113;
 //BA.debugLineNum = 40239113;BA.debugLine="End Sub";
return "";
}
public int  _comparetrackprunecandidates(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _leftitem,anywheresoftware.b4a.objects.collections.Map _rightitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "comparetrackprunecandidates", false))
	 {return ((Integer) Debug.delegate(ba, "comparetrackprunecandidates", new Object[] {_leftitem,_rightitem}));}
boolean _leftrelevant = false;
boolean _rightrelevant = false;
long _leftlastused = 0L;
long _rightlastused = 0L;
long _leftsaved = 0L;
long _rightsaved = 0L;
RDebugUtils.currentLine=42860544;
 //BA.debugLineNum = 42860544;BA.debugLine="Private Sub CompareTrackPruneCandidates(leftItem A";
RDebugUtils.currentLine=42860545;
 //BA.debugLineNum = 42860545;BA.debugLine="Dim leftRelevant As Boolean = leftItem.GetDefault";
_leftrelevant = BA.ObjectToBoolean(_leftitem.GetDefault((Object)("is_relevant"),(Object)(__c.False)));
RDebugUtils.currentLine=42860546;
 //BA.debugLineNum = 42860546;BA.debugLine="Dim rightRelevant As Boolean = rightItem.GetDefau";
_rightrelevant = BA.ObjectToBoolean(_rightitem.GetDefault((Object)("is_relevant"),(Object)(__c.False)));
RDebugUtils.currentLine=42860547;
 //BA.debugLineNum = 42860547;BA.debugLine="If leftRelevant <> rightRelevant Then";
if (_leftrelevant!=_rightrelevant) { 
RDebugUtils.currentLine=42860548;
 //BA.debugLineNum = 42860548;BA.debugLine="If leftRelevant = False Then Return -1 Else Retu";
if (_leftrelevant==__c.False) { 
if (true) return (int) (-1);}
else {
if (true) return (int) (1);};
 };
RDebugUtils.currentLine=42860550;
 //BA.debugLineNum = 42860550;BA.debugLine="Dim leftLastUsed As Long = leftItem.GetDefault(\"l";
_leftlastused = BA.ObjectToLongNumber(_leftitem.GetDefault((Object)("last_used_at"),(Object)(0)));
RDebugUtils.currentLine=42860551;
 //BA.debugLineNum = 42860551;BA.debugLine="Dim rightLastUsed As Long = rightItem.GetDefault(";
_rightlastused = BA.ObjectToLongNumber(_rightitem.GetDefault((Object)("last_used_at"),(Object)(0)));
RDebugUtils.currentLine=42860552;
 //BA.debugLineNum = 42860552;BA.debugLine="If leftLastUsed <> rightLastUsed Then";
if (_leftlastused!=_rightlastused) { 
RDebugUtils.currentLine=42860553;
 //BA.debugLineNum = 42860553;BA.debugLine="If leftLastUsed < rightLastUsed Then Return -1 E";
if (_leftlastused<_rightlastused) { 
if (true) return (int) (-1);}
else {
if (true) return (int) (1);};
 };
RDebugUtils.currentLine=42860555;
 //BA.debugLineNum = 42860555;BA.debugLine="Dim leftSaved As Long = leftItem.GetDefault(\"save";
_leftsaved = BA.ObjectToLongNumber(_leftitem.GetDefault((Object)("saved_at"),(Object)(0)));
RDebugUtils.currentLine=42860556;
 //BA.debugLineNum = 42860556;BA.debugLine="Dim rightSaved As Long = rightItem.GetDefault(\"sa";
_rightsaved = BA.ObjectToLongNumber(_rightitem.GetDefault((Object)("saved_at"),(Object)(0)));
RDebugUtils.currentLine=42860557;
 //BA.debugLineNum = 42860557;BA.debugLine="If leftSaved <> rightSaved Then";
if (_leftsaved!=_rightsaved) { 
RDebugUtils.currentLine=42860558;
 //BA.debugLineNum = 42860558;BA.debugLine="If leftSaved < rightSaved Then Return -1 Else Re";
if (_leftsaved<_rightsaved) { 
if (true) return (int) (-1);}
else {
if (true) return (int) (1);};
 };
RDebugUtils.currentLine=42860560;
 //BA.debugLineNum = 42860560;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=42860561;
 //BA.debugLineNum = 42860561;BA.debugLine="End Sub";
return 0;
}
public int  _counttrackfilesondisk(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "counttrackfilesondisk", false))
	 {return ((Integer) Debug.delegate(ba, "counttrackfilesondisk", null));}
int _count = 0;
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
String _filename = "";
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Private Sub CountTrackFilesOnDisk As Int";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="Try";
try {RDebugUtils.currentLine=37486596;
 //BA.debugLineNum = 37486596;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __ref._listtrackcachefilesrecursive /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=37486597;
 //BA.debugLineNum = 37486597;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=37486598;
 //BA.debugLineNum = 37486598;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=37486599;
 //BA.debugLineNum = 37486599;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=37486600;
 //BA.debugLineNum = 37486600;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
RDebugUtils.currentLine=37486601;
 //BA.debugLineNum = 37486601;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
};
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=37486604;
 //BA.debugLineNum = 37486604;BA.debugLine="Trace(\"Не удалось посчитать track файлы на диске";
__ref._trace /*String*/ (null,"Не удалось посчитать track файлы на диске. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=37486606;
 //BA.debugLineNum = 37486606;BA.debugLine="Return count";
if (true) return _count;
RDebugUtils.currentLine=37486607;
 //BA.debugLineNum = 37486607;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=43909120;
 //BA.debugLineNum = 43909120;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=43909123;
 //BA.debugLineNum = 43909123;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=43909124;
 //BA.debugLineNum = 43909124;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createtrackidset(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _trackids) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "createtrackidset", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createtrackidset", new Object[] {_trackids}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
String _trackid = "";
RDebugUtils.currentLine=42926080;
 //BA.debugLineNum = 42926080;BA.debugLine="Private Sub CreateTrackIdSet(trackIds As List) As";
RDebugUtils.currentLine=42926081;
 //BA.debugLineNum = 42926081;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42926082;
 //BA.debugLineNum = 42926082;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=42926083;
 //BA.debugLineNum = 42926083;BA.debugLine="If trackIds.IsInitialized = False Then Return res";
if (_trackids.IsInitialized()==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=42926084;
 //BA.debugLineNum = 42926084;BA.debugLine="For Each trackId As String In trackIds";
{
final anywheresoftware.b4a.BA.IterableList group4 = _trackids;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_trackid = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=42926085;
 //BA.debugLineNum = 42926085;BA.debugLine="If trackId <> \"\" Then result.Put(trackId, True)";
if ((_trackid).equals("") == false) { 
_result.Put((Object)(_trackid),(Object)(__c.True));};
 }
};
RDebugUtils.currentLine=42926087;
 //BA.debugLineNum = 42926087;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=42926088;
 //BA.debugLineNum = 42926088;BA.debugLine="End Sub";
return null;
}
public String  _resolverelativeparentdir(b4j.example.mediacache __ref,String _basedir,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolverelativeparentdir", false))
	 {return ((String) Debug.delegate(ba, "resolverelativeparentdir", new Object[] {_basedir,_relativefilename}));}
String _normalizedname = "";
int _slashindex = 0;
String _parentrelative = "";
RDebugUtils.currentLine=43057152;
 //BA.debugLineNum = 43057152;BA.debugLine="Private Sub ResolveRelativeParentDir(baseDir As St";
RDebugUtils.currentLine=43057153;
 //BA.debugLineNum = 43057153;BA.debugLine="Dim normalizedName As String = relativeFileName.R";
_normalizedname = _relativefilename.replace("\\\\","/");
RDebugUtils.currentLine=43057154;
 //BA.debugLineNum = 43057154;BA.debugLine="Dim slashIndex As Int = normalizedName.LastIndexO";
_slashindex = _normalizedname.lastIndexOf("/");
RDebugUtils.currentLine=43057155;
 //BA.debugLineNum = 43057155;BA.debugLine="If slashIndex < 0 Then Return baseDir";
if (_slashindex<0) { 
if (true) return _basedir;};
RDebugUtils.currentLine=43057156;
 //BA.debugLineNum = 43057156;BA.debugLine="Dim parentRelative As String = normalizedName.Sub";
_parentrelative = _normalizedname.substring((int) (0),_slashindex);
RDebugUtils.currentLine=43057157;
 //BA.debugLineNum = 43057157;BA.debugLine="If parentRelative = \"\" Then Return baseDir";
if ((_parentrelative).equals("")) { 
if (true) return _basedir;};
RDebugUtils.currentLine=43057158;
 //BA.debugLineNum = 43057158;BA.debugLine="Return File.Combine(baseDir, parentRelative)";
if (true) return __c.File.Combine(_basedir,_parentrelative);
RDebugUtils.currentLine=43057159;
 //BA.debugLineNum = 43057159;BA.debugLine="End Sub";
return "";
}
public String  _resolverelativeleafname(b4j.example.mediacache __ref,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolverelativeleafname", false))
	 {return ((String) Debug.delegate(ba, "resolverelativeleafname", new Object[] {_relativefilename}));}
String _normalizedname = "";
int _slashindex = 0;
RDebugUtils.currentLine=43122688;
 //BA.debugLineNum = 43122688;BA.debugLine="Private Sub ResolveRelativeLeafName(relativeFileNa";
RDebugUtils.currentLine=43122689;
 //BA.debugLineNum = 43122689;BA.debugLine="Dim normalizedName As String = relativeFileName.R";
_normalizedname = _relativefilename.replace("\\\\","/");
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="Dim slashIndex As Int = normalizedName.LastIndexO";
_slashindex = _normalizedname.lastIndexOf("/");
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="If slashIndex < 0 Then Return normalizedName";
if (_slashindex<0) { 
if (true) return _normalizedname;};
RDebugUtils.currentLine=43122692;
 //BA.debugLineNum = 43122692;BA.debugLine="Return normalizedName.SubString(slashIndex + 1)";
if (true) return _normalizedname.substring((int) (_slashindex+1));
RDebugUtils.currentLine=43122693;
 //BA.debugLineNum = 43122693;BA.debugLine="End Sub";
return "";
}
public long  _elapsedms(b4j.example.mediacache __ref,long _startedat) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "elapsedms", false))
	 {return ((Long) Debug.delegate(ba, "elapsedms", new Object[] {_startedat}));}
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Private Sub ElapsedMs(startedAt As Long) As Long";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="Return Max(0, DateTime.Now - startedAt)";
if (true) return (long) (__c.Max(0,__c.DateTime.getNow()-_startedat));
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedadindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedadindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedadindex", null));}
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Private Sub GetCachedAdIndex As Map";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="If cachedAdIndex.IsInitialized = False Then";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="cachedAdIndex.Initialize";
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=38404100;
 //BA.debugLineNum = 38404100;BA.debugLine="Return cachedAdIndex";
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=38404101;
 //BA.debugLineNum = 38404101;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuresingleadcached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuresingleadcached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuresingleadcached", new Object[] {_ad,_adindex}));}
ResumableSub_EnsureSingleAdCached rsub = new ResumableSub_EnsureSingleAdCached(this,__ref,_ad,_adindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureSingleAdCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleAdCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) {
this.parent = parent;
this.__ref = __ref;
this._ad = _ad;
this._adindex = _adindex;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _ad;
anywheresoftware.b4a.objects.collections.Map _adindex;
String _adid = "";
String _adurl = "";
long _downloadstartedat = 0L;
b4j.example.httpjob _j = null;
String _tempfilename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mediacache";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="If adId = \"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((_adid).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=38010883;
 //BA.debugLineNum = 38010883;BA.debugLine="If TryRestoreExistingCachedMedia(\"ad\", adId, ad,";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._tryrestoreexistingcachedmedia /*boolean*/ (null,"ad",_adid,_ad,_adindex)) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=38010884;
 //BA.debugLineNum = 38010884;BA.debugLine="If IsAdCached(adId) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (__ref._isadcached /*boolean*/ (null,_adid)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=38010885;
 //BA.debugLineNum = 38010885;BA.debugLine="UpdateAdIndex(ad, adIndex)";
__ref._updateadindex /*String*/ (null,_ad,_adindex);
RDebugUtils.currentLine=38010886;
 //BA.debugLineNum = 38010886;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=38010888;
 //BA.debugLineNum = 38010888;BA.debugLine="Dim adUrl As String = BuildAdUrl(adId)";
_adurl = __ref._buildadurl /*String*/ (null,_adid);
RDebugUtils.currentLine=38010889;
 //BA.debugLineNum = 38010889;BA.debugLine="If adUrl = \"\" Then Return False";
if (true) break;

case 17:
//if
this.state = 22;
if ((_adurl).equals("")) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=38010890;
 //BA.debugLineNum = 38010890;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
_downloadstartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=38010891;
 //BA.debugLineNum = 38010891;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=38010892;
 //BA.debugLineNum = 38010892;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38010893;
 //BA.debugLineNum = 38010893;BA.debugLine="Trace(\"Скачивание рекламы в кэш. id=\" & adId & \",";
__ref._trace /*String*/ (null,"Скачивание рекламы в кэш. id="+_adid+", url="+_adurl);
RDebugUtils.currentLine=38010894;
 //BA.debugLineNum = 38010894;BA.debugLine="j.Download(adUrl)";
_j._download /*String*/ (null,_adurl);
RDebugUtils.currentLine=38010895;
 //BA.debugLineNum = 38010895;BA.debugLine="j.GetRequest.Timeout = AD_DOWNLOAD_TIMEOUT_MS";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._ad_download_timeout_ms /*int*/ );
RDebugUtils.currentLine=38010896;
 //BA.debugLineNum = 38010896;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuresingleadcached"), (Object)(_j));
this.state = 48;
return;
case 48:
//C
this.state = 23;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=38010897;
 //BA.debugLineNum = 38010897;BA.debugLine="If j.Success Then";
if (true) break;

case 23:
//if
this.state = 47;
if (_j._success /*boolean*/ ) { 
this.state = 25;
}else {
this.state = 40;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=38010898;
 //BA.debugLineNum = 38010898;BA.debugLine="Try";
if (true) break;

case 26:
//try
this.state = 38;
this.catchState = 37;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 37;
RDebugUtils.currentLine=38010899;
 //BA.debugLineNum = 38010899;BA.debugLine="EnsureDirectory(GetAdsDir)";
__ref._ensuredirectory /*String*/ (null,__ref._getadsdir /*String*/ (null));
RDebugUtils.currentLine=38010900;
 //BA.debugLineNum = 38010900;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
_tempfilename = __ref._buildtempcachefilename /*String*/ (null,_adid);
RDebugUtils.currentLine=38010901;
 //BA.debugLineNum = 38010901;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=38010902;
 //BA.debugLineNum = 38010902;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(__ref._getadsdir /*String*/ (null),_tempfilename,parent.__c.False);
RDebugUtils.currentLine=38010903;
 //BA.debugLineNum = 38010903;BA.debugLine="File.Copy2(j.GetInputStream, outStream)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_outstream.getObject()));
RDebugUtils.currentLine=38010904;
 //BA.debugLineNum = 38010904;BA.debugLine="outStream.Close";
_outstream.Close();
RDebugUtils.currentLine=38010905;
 //BA.debugLineNum = 38010905;BA.debugLine="If IsCachedFileUsable(GetAdsDir, tempFileName)";
if (true) break;

case 29:
//if
this.state = 32;
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename)==parent.__c.False) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=38010906;
 //BA.debugLineNum = 38010906;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=38010907;
 //BA.debugLineNum = 38010907;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message=empty temp file");
RDebugUtils.currentLine=38010908;
 //BA.debugLineNum = 38010908;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38010909;
 //BA.debugLineNum = 38010909;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=38010911;
 //BA.debugLineNum = 38010911;BA.debugLine="If ReplaceCacheFile(GetAdsDir, tempFileName, ad";

case 32:
//if
this.state = 35;
if (__ref._replacecachefile /*boolean*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename,_adid)==parent.__c.False) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=38010912;
 //BA.debugLineNum = 38010912;BA.debugLine="DeleteFileIfExists(GetAdsDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_tempfilename);
RDebugUtils.currentLine=38010913;
 //BA.debugLineNum = 38010913;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message=rename failed");
RDebugUtils.currentLine=38010914;
 //BA.debugLineNum = 38010914;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38010915;
 //BA.debugLineNum = 38010915;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 35:
//C
this.state = 38;
;
RDebugUtils.currentLine=38010917;
 //BA.debugLineNum = 38010917;BA.debugLine="UpdateAdIndex(ad, adIndex)";
__ref._updateadindex /*String*/ (null,_ad,_adindex);
RDebugUtils.currentLine=38010918;
 //BA.debugLineNum = 38010918;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=38010919;
 //BA.debugLineNum = 38010919;BA.debugLine="recentMediaNetworkFailure = False";
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=38010920;
 //BA.debugLineNum = 38010920;BA.debugLine="Trace(\"Реклама сохранена в кэш. id=\" & adId & \"";
__ref._trace /*String*/ (null,"Реклама сохранена в кэш. id="+_adid+", totalElapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_downloadstartedat)));
RDebugUtils.currentLine=38010921;
 //BA.debugLineNum = 38010921;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38010922;
 //BA.debugLineNum = 38010922;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
RDebugUtils.currentLine=38010924;
 //BA.debugLineNum = 38010924;BA.debugLine="DeleteFileIfExists(GetAdsDir, BuildTempCacheFil";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),__ref._buildtempcachefilename /*String*/ (null,_adid));
RDebugUtils.currentLine=38010925;
 //BA.debugLineNum = 38010925;BA.debugLine="Trace(\"Не удалось сохранить рекламу в кэш. id=\"";
__ref._trace /*String*/ (null,"Не удалось сохранить рекламу в кэш. id="+_adid+", message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 38:
//C
this.state = 47;
this.catchState = 0;
;
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=38010928;
 //BA.debugLineNum = 38010928;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
if (true) break;

case 41:
//if
this.state = 46;
if (__ref._ismedianetworkfailure /*boolean*/ (null,_j._errormessage /*String*/ )) { 
this.state = 43;
;}if (true) break;

case 43:
//C
this.state = 46;
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.True;
if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=38010929;
 //BA.debugLineNum = 38010929;BA.debugLine="Trace(\"Не удалось скачать рекламу. id=\" & adId &";
__ref._trace /*String*/ (null,"Не удалось скачать рекламу. id="+_adid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 47:
//C
this.state = -1;
;
RDebugUtils.currentLine=38010931;
 //BA.debugLineNum = 38010931;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38010932;
 //BA.debugLineNum = 38010932;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=38010933;
 //BA.debugLineNum = 38010933;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public int  _prunemissingads(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _adindex,anywheresoftware.b4a.objects.collections.Map _actualadids) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "prunemissingads", false))
	 {return ((Integer) Debug.delegate(ba, "prunemissingads", new Object[] {_adindex,_actualadids}));}
int _removedcount = 0;
anywheresoftware.b4a.objects.collections.List _idstoremove = null;
String _adid = "";
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub PruneMissingAds(adIndex As Map, actual";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Dim idsToRemove As List";
_idstoremove = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="idsToRemove.Initialize";
_idstoremove.Initialize();
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="For Each adId As String In adIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _adindex.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_adid = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=38273029;
 //BA.debugLineNum = 38273029;BA.debugLine="If actualAdIds.ContainsKey(adId) = False Then id";
if (_actualadids.ContainsKey((Object)(_adid))==__c.False) { 
_idstoremove.Add((Object)(_adid));};
 }
};
RDebugUtils.currentLine=38273031;
 //BA.debugLineNum = 38273031;BA.debugLine="For Each adId As String In idsToRemove";
{
final anywheresoftware.b4a.BA.IterableList group7 = _idstoremove;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_adid = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=38273032;
 //BA.debugLineNum = 38273032;BA.debugLine="DeleteFileIfExists(GetAdsDir, adId)";
__ref._deletefileifexists /*String*/ (null,__ref._getadsdir /*String*/ (null),_adid);
RDebugUtils.currentLine=38273033;
 //BA.debugLineNum = 38273033;BA.debugLine="adIndex.Remove(adId)";
_adindex.Remove((Object)(_adid));
RDebugUtils.currentLine=38273034;
 //BA.debugLineNum = 38273034;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
RDebugUtils.currentLine=38273035;
 //BA.debugLineNum = 38273035;BA.debugLine="cachedAdIndexDirty = True";
__ref._cachedadindexdirty /*boolean*/  = __c.True;
RDebugUtils.currentLine=38273036;
 //BA.debugLineNum = 38273036;BA.debugLine="Trace(\"Удален cached ad, отсутствующий в актуаль";
__ref._trace /*String*/ (null,"Удален cached ad, отсутствующий в актуальном data. id="+_adid);
 }
};
RDebugUtils.currentLine=38273038;
 //BA.debugLineNum = 38273038;BA.debugLine="Return removedCount";
if (true) return _removedcount;
RDebugUtils.currentLine=38273039;
 //BA.debugLineNum = 38273039;BA.debugLine="End Sub";
return 0;
}
public String  _saveadindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "saveadindex", false))
	 {return ((String) Debug.delegate(ba, "saveadindex", null));}
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub SaveAdIndex";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="RebuildCacheStatsFromIndexes";
__ref._rebuildcachestatsfromindexes /*String*/ (null);
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="storage.Put(\"cached_ad_index\", cachedAdIndex)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_index",(Object)(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="storage.Put(\"cached_ad_count\", cachedAdCount)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cached_ad_count",(Object)(__ref._cachedadcount /*int*/ ));
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="SaveCacheStatsSnapshot";
__ref._savecachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="cachedAdIndexDirty = False";
__ref._cachedadindexdirty /*boolean*/  = __c.False;
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="End Sub";
return "";
}
public String  _ensuredirectory(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=41091075;
 //BA.debugLineNum = 41091075;BA.debugLine="fileObject.RunMethod(\"mkdirs\", Null)";
_fileobject.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=41091076;
 //BA.debugLineNum = 41091076;BA.debugLine="End Sub";
return "";
}
public boolean  _tryrestoreexistingcachedmedia(b4j.example.mediacache __ref,String _itemtype,String _itemid,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "tryrestoreexistingcachedmedia", false))
	 {return ((Boolean) Debug.delegate(ba, "tryrestoreexistingcachedmedia", new Object[] {_itemtype,_itemid,_item,_itemindex}));}
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Private Sub TryRestoreExistingCachedMedia(itemType";
RDebugUtils.currentLine=40566785;
 //BA.debugLineNum = 40566785;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="If IsCachedFileUsable(GetDirByItemType(itemType),";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._getdirbyitemtype /*String*/ (null,_itemtype),__ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_itemindex))==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=40566787;
 //BA.debugLineNum = 40566787;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=40566788;
 //BA.debugLineNum = 40566788;BA.debugLine="UpdateAdIndex(item, itemIndex)";
__ref._updateadindex /*String*/ (null,_item,_itemindex);
RDebugUtils.currentLine=40566789;
 //BA.debugLineNum = 40566789;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
RDebugUtils.currentLine=40566790;
 //BA.debugLineNum = 40566790;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=40566792;
 //BA.debugLineNum = 40566792;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=40566793;
 //BA.debugLineNum = 40566793;BA.debugLine="UpdateTrackIndex(item, itemIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_itemindex);
RDebugUtils.currentLine=40566794;
 //BA.debugLineNum = 40566794;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=40566795;
 //BA.debugLineNum = 40566795;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=40566797;
 //BA.debugLineNum = 40566797;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=40566798;
 //BA.debugLineNum = 40566798;BA.debugLine="End Sub";
return false;
}
public String  _updateadindex(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _ad,anywheresoftware.b4a.objects.collections.Map _adindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "updateadindex", false))
	 {return ((String) Debug.delegate(ba, "updateadindex", new Object[] {_ad,_adindex}));}
String _adid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Private Sub UpdateAdIndex(ad As Map, adIndex As Ma";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="Dim adId As String = ad.GetDefault(\"id\", \"\")";
_adid = BA.ObjectToString(_ad.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="If adId = \"\" Then Return";
if ((_adid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="Dim entry As Map = adIndex.GetDefault(adId, Null)";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_adindex.GetDefault((Object)(_adid),__c.Null)));
RDebugUtils.currentLine=38207492;
 //BA.debugLineNum = 38207492;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=38207493;
 //BA.debugLineNum = 38207493;BA.debugLine="entry.Put(\"id\", adId)";
_entry.Put((Object)("id"),(Object)(_adid));
RDebugUtils.currentLine=38207494;
 //BA.debugLineNum = 38207494;BA.debugLine="entry.Put(\"title\", ad.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_ad.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=38207495;
 //BA.debugLineNum = 38207495;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=38207496;
 //BA.debugLineNum = 38207496;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=38207497;
 //BA.debugLineNum = 38207497;BA.debugLine="entry.Put(\"duration\", ad.GetDefault(\"duration\", 0";
_entry.Put((Object)("duration"),_ad.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=38207498;
 //BA.debugLineNum = 38207498;BA.debugLine="entry.Put(\"gain\", ad.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_ad.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=38207499;
 //BA.debugLineNum = 38207499;BA.debugLine="adIndex.Put(adId, entry)";
_adindex.Put((Object)(_adid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=38207500;
 //BA.debugLineNum = 38207500;BA.debugLine="cachedAdIndexDirty = True";
__ref._cachedadindexdirty /*boolean*/  = __c.True;
RDebugUtils.currentLine=38207501;
 //BA.debugLineNum = 38207501;BA.debugLine="End Sub";
return "";
}
public String  _getadsdir(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getadsdir", false))
	 {return ((String) Debug.delegate(ba, "getadsdir", null));}
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Public Sub GetAdsDir As String";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="Return File.Combine(File.Combine(storageDir, medi";
if (true) return __c.File.Combine(__c.File.Combine(__ref._storagedir /*String*/ ,__ref._mediadirname /*String*/ ),__ref._adsdirname /*String*/ );
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="End Sub";
return "";
}
public boolean  _replacecachefile(b4j.example.mediacache __ref,String _dir,String _tempfilename,String _finalfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "replacecachefile", false))
	 {return ((Boolean) Debug.delegate(ba, "replacecachefile", new Object[] {_dir,_tempfilename,_finalfilename}));}
anywheresoftware.b4j.object.JavaObject _tempfile = null;
anywheresoftware.b4j.object.JavaObject _finalfile = null;
boolean _renamed = false;
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Private Sub ReplaceCacheFile(dir As String, tempFi";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="If IsCachedFileUsable(dir, tempFileName) = False";
if (__ref._iscachedfileusable /*boolean*/ (null,_dir,_tempfilename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="If IsCachedFileUsable(dir, finalFileName) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_dir,_finalfilename)) { 
RDebugUtils.currentLine=39387139;
 //BA.debugLineNum = 39387139;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_tempfilename);
RDebugUtils.currentLine=39387140;
 //BA.debugLineNum = 39387140;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=39387142;
 //BA.debugLineNum = 39387142;BA.debugLine="DeleteFileIfExists(dir, finalFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_finalfilename);
RDebugUtils.currentLine=39387143;
 //BA.debugLineNum = 39387143;BA.debugLine="Dim tempFile As JavaObject";
_tempfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=39387144;
 //BA.debugLineNum = 39387144;BA.debugLine="tempFile.InitializeNewInstance(\"java.io.File\", Ar";
_tempfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_tempfilename))});
RDebugUtils.currentLine=39387145;
 //BA.debugLineNum = 39387145;BA.debugLine="Dim finalFile As JavaObject";
_finalfile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=39387146;
 //BA.debugLineNum = 39387146;BA.debugLine="finalFile.InitializeNewInstance(\"java.io.File\", A";
_finalfile.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_dir,_finalfilename))});
RDebugUtils.currentLine=39387147;
 //BA.debugLineNum = 39387147;BA.debugLine="Dim renamed As Boolean = tempFile.RunMethod(\"rena";
_renamed = BA.ObjectToBoolean(_tempfile.RunMethod("renameTo",new Object[]{(Object)(_finalfile.getObject())}));
RDebugUtils.currentLine=39387148;
 //BA.debugLineNum = 39387148;BA.debugLine="If renamed = False And IsCachedFileUsable(dir, fi";
if (_renamed==__c.False && __ref._iscachedfileusable /*boolean*/ (null,_dir,_finalfilename)) { 
RDebugUtils.currentLine=39387149;
 //BA.debugLineNum = 39387149;BA.debugLine="DeleteFileIfExists(dir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_dir,_tempfilename);
RDebugUtils.currentLine=39387150;
 //BA.debugLineNum = 39387150;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=39387152;
 //BA.debugLineNum = 39387152;BA.debugLine="Return renamed";
if (true) return _renamed;
RDebugUtils.currentLine=39387153;
 //BA.debugLineNum = 39387153;BA.debugLine="End Sub";
return false;
}
public boolean  _ismedianetworkfailure(b4j.example.mediacache __ref,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ismedianetworkfailure", false))
	 {return ((Boolean) Debug.delegate(ba, "ismedianetworkfailure", new Object[] {_errormessage}));}
String _text = "";
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Private Sub IsMediaNetworkFailure(errorMessage As";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="Dim text As String = errorMessage.ToLowerCase";
_text = _errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="If text.Contains(\"timed out\") Then Return True";
if (_text.contains("timed out")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40960003;
 //BA.debugLineNum = 40960003;BA.debugLine="If text.Contains(\"unknownhost\") Then Return True";
if (_text.contains("unknownhost")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40960004;
 //BA.debugLineNum = 40960004;BA.debugLine="If text.Contains(\"refused\") Then Return True";
if (_text.contains("refused")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40960005;
 //BA.debugLineNum = 40960005;BA.debugLine="If text.Contains(\"sslhandshakeexception\") Then Re";
if (_text.contains("sslhandshakeexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40960006;
 //BA.debugLineNum = 40960006;BA.debugLine="If text.Contains(\"pkix path building failed\") The";
if (_text.contains("pkix path building failed")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40960007;
 //BA.debugLineNum = 40960007;BA.debugLine="If text.Contains(\"unable to find valid certificat";
if (_text.contains("unable to find valid certification path")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40960008;
 //BA.debugLineNum = 40960008;BA.debugLine="If text.Contains(\"connectexception\") Then Return";
if (_text.contains("connectexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40960009;
 //BA.debugLineNum = 40960009;BA.debugLine="If text.Contains(\"socketexception\") Then Return T";
if (_text.contains("socketexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40960010;
 //BA.debugLineNum = 40960010;BA.debugLine="If text.Contains(\"sockettimeoutexception\") Then R";
if (_text.contains("sockettimeoutexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40960011;
 //BA.debugLineNum = 40960011;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=40960012;
 //BA.debugLineNum = 40960012;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuresingletrackcached(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuresingletrackcached", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuresingletrackcached", new Object[] {_item,_trackindex}));}
ResumableSub_EnsureSingleTrackCached rsub = new ResumableSub_EnsureSingleTrackCached(this,__ref,_item,_trackindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureSingleTrackCached extends BA.ResumableSub {
public ResumableSub_EnsureSingleTrackCached(b4j.example.mediacache parent,b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) {
this.parent = parent;
this.__ref = __ref;
this._item = _item;
this._trackindex = _trackindex;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.Map _item;
anywheresoftware.b4a.objects.collections.Map _trackindex;
String _trackid = "";
String _playlistid = "";
String _trackurl = "";
long _downloadstartedat = 0L;
b4j.example.httpjob _j = null;
String _trackdir = "";
String _tempfilename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;
String _failedplaylistid = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mediacache";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="If trackId = \"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((_trackid).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="Dim playlistId As String = ResolveTrackPlaylistId";
_playlistid = __ref._resolvetrackplaylistid /*String*/ (null,_item,_trackindex,_trackid);
RDebugUtils.currentLine=38076420;
 //BA.debugLineNum = 38076420;BA.debugLine="If TryRestoreTrackByExpectedPath(trackId, playlis";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._tryrestoretrackbyexpectedpath /*boolean*/ (null,_trackid,_playlistid,_item,_trackindex)) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=38076421;
 //BA.debugLineNum = 38076421;BA.debugLine="If TryRestoreExistingCachedMedia(\"track\", trackId";
if (true) break;

case 13:
//if
this.state = 18;
if (__ref._tryrestoreexistingcachedmedia /*boolean*/ (null,"track",_trackid,_item,_trackindex)) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=38076422;
 //BA.debugLineNum = 38076422;BA.debugLine="If IsTrackCached(trackId) Then";
if (true) break;

case 19:
//if
this.state = 22;
if (__ref._istrackcached /*boolean*/ (null,_trackid)) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=38076423;
 //BA.debugLineNum = 38076423;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=38076424;
 //BA.debugLineNum = 38076424;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=38076426;
 //BA.debugLineNum = 38076426;BA.debugLine="Dim trackUrl As String = BuildTrackUrl(trackId)";
_trackurl = __ref._buildtrackurl /*String*/ (null,_trackid);
RDebugUtils.currentLine=38076427;
 //BA.debugLineNum = 38076427;BA.debugLine="If trackUrl = \"\" Then Return False";
if (true) break;

case 23:
//if
this.state = 28;
if ((_trackurl).equals("")) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=38076428;
 //BA.debugLineNum = 38076428;BA.debugLine="Dim downloadStartedAt As Long = DateTime.Now";
_downloadstartedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=38076429;
 //BA.debugLineNum = 38076429;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=38076430;
 //BA.debugLineNum = 38076430;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38076431;
 //BA.debugLineNum = 38076431;BA.debugLine="Trace(\"Скачивание трека в кэш. id=\" & trackId & \"";
__ref._trace /*String*/ (null,"Скачивание трека в кэш. id="+_trackid+", url="+_trackurl);
RDebugUtils.currentLine=38076432;
 //BA.debugLineNum = 38076432;BA.debugLine="j.Download(trackUrl)";
_j._download /*String*/ (null,_trackurl);
RDebugUtils.currentLine=38076433;
 //BA.debugLineNum = 38076433;BA.debugLine="j.GetRequest.Timeout = TRACK_DOWNLOAD_TIMEOUT_MS";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._track_download_timeout_ms /*int*/ );
RDebugUtils.currentLine=38076434;
 //BA.debugLineNum = 38076434;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "ensuresingletrackcached"), (Object)(_j));
this.state = 68;
return;
case 68:
//C
this.state = 29;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=38076435;
 //BA.debugLineNum = 38076435;BA.debugLine="If j.Success Then";
if (true) break;

case 29:
//if
this.state = 67;
if (_j._success /*boolean*/ ) { 
this.state = 31;
}else {
this.state = 60;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=38076436;
 //BA.debugLineNum = 38076436;BA.debugLine="Try";
if (true) break;

case 32:
//try
this.state = 58;
this.catchState = 51;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 51;
RDebugUtils.currentLine=38076437;
 //BA.debugLineNum = 38076437;BA.debugLine="Dim trackDir As String = GetTracksDir";
_trackdir = __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=38076438;
 //BA.debugLineNum = 38076438;BA.debugLine="EnsureDirectory(trackDir)";
__ref._ensuredirectory /*String*/ (null,_trackdir);
RDebugUtils.currentLine=38076439;
 //BA.debugLineNum = 38076439;BA.debugLine="Dim tempFileName As String = BuildTempCacheFile";
_tempfilename = __ref._buildtempcachefilename /*String*/ (null,_trackid);
RDebugUtils.currentLine=38076440;
 //BA.debugLineNum = 38076440;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_trackdir,_tempfilename);
RDebugUtils.currentLine=38076441;
 //BA.debugLineNum = 38076441;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = parent.__c.File.OpenOutput(_trackdir,_tempfilename,parent.__c.False);
RDebugUtils.currentLine=38076442;
 //BA.debugLineNum = 38076442;BA.debugLine="TransformStreamWithXor(j.GetInputStream, outStr";
__ref._transformstreamwithxor /*String*/ (null,_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null),_outstream,__ref._buildtrackobfuscationkey /*byte[]*/ (null,_trackid));
RDebugUtils.currentLine=38076443;
 //BA.debugLineNum = 38076443;BA.debugLine="outStream.Close";
_outstream.Close();
RDebugUtils.currentLine=38076444;
 //BA.debugLineNum = 38076444;BA.debugLine="If IsCachedFileUsable(trackDir, tempFileName) =";
if (true) break;

case 35:
//if
this.state = 38;
if (__ref._iscachedfileusable /*boolean*/ (null,_trackdir,_tempfilename)==parent.__c.False) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=38076445;
 //BA.debugLineNum = 38076445;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_trackdir,_tempfilename);
RDebugUtils.currentLine=38076446;
 //BA.debugLineNum = 38076446;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message=empty temp file");
RDebugUtils.currentLine=38076447;
 //BA.debugLineNum = 38076447;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38076448;
 //BA.debugLineNum = 38076448;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=38076450;
 //BA.debugLineNum = 38076450;BA.debugLine="If ReplaceCacheFile(trackDir, tempFileName, Bui";

case 38:
//if
this.state = 41;
if (__ref._replacecachefile /*boolean*/ (null,_trackdir,_tempfilename,__ref._buildtrackcachefilename /*String*/ (null,_trackid))==parent.__c.False) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=38076451;
 //BA.debugLineNum = 38076451;BA.debugLine="DeleteFileIfExists(trackDir, tempFileName)";
__ref._deletefileifexists /*String*/ (null,_trackdir,_tempfilename);
RDebugUtils.currentLine=38076452;
 //BA.debugLineNum = 38076452;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message=rename failed");
RDebugUtils.currentLine=38076453;
 //BA.debugLineNum = 38076453;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38076454;
 //BA.debugLineNum = 38076454;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=38076456;
 //BA.debugLineNum = 38076456;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=38076457;
 //BA.debugLineNum = 38076457;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) = Fals";
if (true) break;

case 42:
//if
this.state = 49;
if (__ref._validateindexedfile /*boolean*/ (null,"track",_trackid)==parent.__c.False) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=38076458;
 //BA.debugLineNum = 38076458;BA.debugLine="BackfillTrackIndexFromFiles";
__ref._backfilltrackindexfromfiles /*String*/ (null);
RDebugUtils.currentLine=38076459;
 //BA.debugLineNum = 38076459;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=38076460;
 //BA.debugLineNum = 38076460;BA.debugLine="If ValidateIndexedFile(\"track\", trackId) = Fal";
if (true) break;

case 45:
//if
this.state = 48;
if (__ref._validateindexedfile /*boolean*/ (null,"track",_trackid)==parent.__c.False) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=38076461;
 //BA.debugLineNum = 38076461;BA.debugLine="Trace(\"Не удалось валидировать трек после сох";
__ref._trace /*String*/ (null,"Не удалось валидировать трек после сохранения. id="+_trackid);
RDebugUtils.currentLine=38076462;
 //BA.debugLineNum = 38076462;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38076463;
 //BA.debugLineNum = 38076463;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 58;
;
RDebugUtils.currentLine=38076466;
 //BA.debugLineNum = 38076466;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=38076467;
 //BA.debugLineNum = 38076467;BA.debugLine="recentMediaNetworkFailure = False";
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=38076468;
 //BA.debugLineNum = 38076468;BA.debugLine="Trace(\"Трек сохранен в кэш. id=\" & trackId & \",";
__ref._trace /*String*/ (null,"Трек сохранен в кэш. id="+_trackid+", totalElapsedMs="+BA.NumberToString(__ref._elapsedms /*long*/ (null,_downloadstartedat)));
RDebugUtils.currentLine=38076469;
 //BA.debugLineNum = 38076469;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38076470;
 //BA.debugLineNum = 38076470;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
RDebugUtils.currentLine=38076472;
 //BA.debugLineNum = 38076472;BA.debugLine="Dim failedPlaylistId As String = ResolveTrackPl";
_failedplaylistid = __ref._resolvetrackplaylistid /*String*/ (null,_item,_trackindex,_trackid);
RDebugUtils.currentLine=38076473;
 //BA.debugLineNum = 38076473;BA.debugLine="DeleteFileIfExists(GetTracksDir, BuildTempCache";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),__ref._buildtempcachefilename /*String*/ (null,_trackid));
RDebugUtils.currentLine=38076474;
 //BA.debugLineNum = 38076474;BA.debugLine="If failedPlaylistId <> \"\" Then DeleteFileIfExis";
if (true) break;

case 52:
//if
this.state = 57;
if ((_failedplaylistid).equals("") == false) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
__ref._deletefileifexists /*String*/ (null,__ref._gettrackplaylistdir /*String*/ (null,_failedplaylistid),__ref._buildtempcachefilename /*String*/ (null,_trackid));
if (true) break;

case 57:
//C
this.state = 58;
;
RDebugUtils.currentLine=38076475;
 //BA.debugLineNum = 38076475;BA.debugLine="Trace(\"Не удалось сохранить трек в кэш. id=\" &";
__ref._trace /*String*/ (null,"Не удалось сохранить трек в кэш. id="+_trackid+", message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 58:
//C
this.state = 67;
this.catchState = 0;
;
 if (true) break;

case 60:
//C
this.state = 61;
RDebugUtils.currentLine=38076478;
 //BA.debugLineNum = 38076478;BA.debugLine="If IsMediaNetworkFailure(j.ErrorMessage) Then re";
if (true) break;

case 61:
//if
this.state = 66;
if (__ref._ismedianetworkfailure /*boolean*/ (null,_j._errormessage /*String*/ )) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
__ref._recentmedianetworkfailure /*boolean*/  = parent.__c.True;
if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=38076479;
 //BA.debugLineNum = 38076479;BA.debugLine="Trace(\"Не удалось скачать трек. id=\" & trackId &";
__ref._trace /*String*/ (null,"Не удалось скачать трек. id="+_trackid+", message="+_j._errormessage /*String*/ );
 if (true) break;

case 67:
//C
this.state = -1;
;
RDebugUtils.currentLine=38076481;
 //BA.debugLineNum = 38076481;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=38076482;
 //BA.debugLineNum = 38076482;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=38076483;
 //BA.debugLineNum = 38076483;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _resolvetrackplaylistid(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvetrackplaylistid", false))
	 {return ((String) Debug.delegate(ba, "resolvetrackplaylistid", new Object[] {_item,_trackindex,_trackid}));}
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=42467328;
 //BA.debugLineNum = 42467328;BA.debugLine="Private Sub ResolveTrackPlaylistId(item As Map, tr";
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="If item.IsInitialized Then";
if (_item.IsInitialized()) { 
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="Dim playlistId As String = item.GetDefault(\"play";
_playlistid = BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=42467331;
 //BA.debugLineNum = 42467331;BA.debugLine="If playlistId <> \"\" Then Return playlistId";
if ((_playlistid).equals("") == false) { 
if (true) return _playlistid;};
 };
RDebugUtils.currentLine=42467333;
 //BA.debugLineNum = 42467333;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=42467334;
 //BA.debugLineNum = 42467334;BA.debugLine="If entry.IsInitialized Then Return entry.GetDefau";
if (_entry.IsInitialized()) { 
if (true) return BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));};
RDebugUtils.currentLine=42467335;
 //BA.debugLineNum = 42467335;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=42467336;
 //BA.debugLineNum = 42467336;BA.debugLine="End Sub";
return "";
}
public boolean  _tryrestoretrackbyexpectedpath(b4j.example.mediacache __ref,String _trackid,String _playlistid,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "tryrestoretrackbyexpectedpath", false))
	 {return ((Boolean) Debug.delegate(ba, "tryrestoretrackbyexpectedpath", new Object[] {_trackid,_playlistid,_item,_trackindex}));}
String _relativefilename = "";
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Private Sub TryRestoreTrackByExpectedPath(trackId";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="Dim relativeFileName As String = BuildTrackCacheR";
_relativefilename = __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid);
RDebugUtils.currentLine=38141955;
 //BA.debugLineNum = 38141955;BA.debugLine="If IsCachedFileUsable(GetTracksDir, relativeFileN";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_relativefilename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=38141956;
 //BA.debugLineNum = 38141956;BA.debugLine="EnsureTrackIndexEntry(trackId, playlistId, relati";
__ref._ensuretrackindexentry /*String*/ (null,_trackid,_playlistid,_relativefilename);
RDebugUtils.currentLine=38141957;
 //BA.debugLineNum = 38141957;BA.debugLine="UpdateTrackIndex(item, trackIndex)";
__ref._updatetrackindex /*String*/ (null,_item,_trackindex);
RDebugUtils.currentLine=38141958;
 //BA.debugLineNum = 38141958;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=38141959;
 //BA.debugLineNum = 38141959;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=38141960;
 //BA.debugLineNum = 38141960;BA.debugLine="End Sub";
return false;
}
public String  _updatetrackindex(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "updatetrackindex", false))
	 {return ((String) Debug.delegate(ba, "updatetrackindex", new Object[] {_item,_trackindex}));}
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
String _filename = "";
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub UpdateTrackIndex(item As Map, trackInd";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId,";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="Dim playlistId As String = ResolveTrackPlaylistId";
_playlistid = __ref._resolvetrackplaylistid /*String*/ (null,_item,_trackindex,_trackid);
RDebugUtils.currentLine=38338566;
 //BA.debugLineNum = 38338566;BA.debugLine="Dim fileName As String = BuildTrackCacheRelativeF";
_filename = __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid);
RDebugUtils.currentLine=38338567;
 //BA.debugLineNum = 38338567;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=38338568;
 //BA.debugLineNum = 38338568;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=38338569;
 //BA.debugLineNum = 38338569;BA.debugLine="entry.Put(\"file_name\", fileName)";
_entry.Put((Object)("file_name"),(Object)(_filename));
RDebugUtils.currentLine=38338570;
 //BA.debugLineNum = 38338570;BA.debugLine="entry.Put(\"title\", item.GetDefault(\"title\", \"\"))";
_entry.Put((Object)("title"),_item.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=38338571;
 //BA.debugLineNum = 38338571;BA.debugLine="entry.Put(\"set\", item.GetDefault(\"set\", \"\"))";
_entry.Put((Object)("set"),_item.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=38338572;
 //BA.debugLineNum = 38338572;BA.debugLine="entry.Put(\"stream\", item.GetDefault(\"stream\", \"\")";
_entry.Put((Object)("stream"),_item.GetDefault((Object)("stream"),(Object)("")));
RDebugUtils.currentLine=38338573;
 //BA.debugLineNum = 38338573;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=38338574;
 //BA.debugLineNum = 38338574;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=38338575;
 //BA.debugLineNum = 38338575;BA.debugLine="entry.Put(\"gain\", item.GetDefault(\"gain\", 0))";
_entry.Put((Object)("gain"),_item.GetDefault((Object)("gain"),(Object)(0)));
RDebugUtils.currentLine=38338576;
 //BA.debugLineNum = 38338576;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) The";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_filename)) { 
_entry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_filename)));};
RDebugUtils.currentLine=38338577;
 //BA.debugLineNum = 38338577;BA.debugLine="trackIndex.Put(trackId, entry)";
_trackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=38338578;
 //BA.debugLineNum = 38338578;BA.debugLine="cachedTrackIndexDirty = True";
__ref._cachedtrackindexdirty /*boolean*/  = __c.True;
RDebugUtils.currentLine=38338579;
 //BA.debugLineNum = 38338579;BA.debugLine="End Sub";
return "";
}
public String  _transformstreamwithxor(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream,byte[] _keybytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "transformstreamwithxor", false))
	 {return ((String) Debug.delegate(ba, "transformstreamwithxor", new Object[] {_inputstream,_outputstream,_keybytes}));}
byte[] _buffer = null;
long _totalprocessed = 0L;
int _count = 0;
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Private Sub TransformStreamWithXor(inputStream As";
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="If keyBytes.Length = 0 Then";
if (_keybytes.length==0) { 
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="File.Copy2(inputStream, outputStream)";
__c.File.Copy2((java.io.InputStream)(_inputstream.getObject()),(java.io.OutputStream)(_outputstream.getObject()));
RDebugUtils.currentLine=40108035;
 //BA.debugLineNum = 40108035;BA.debugLine="outputStream.Flush";
_outputstream.Flush();
RDebugUtils.currentLine=40108036;
 //BA.debugLineNum = 40108036;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=40108038;
 //BA.debugLineNum = 40108038;BA.debugLine="Dim buffer(STREAM_XOR_BUFFER_SIZE) As Byte";
_buffer = new byte[__ref._stream_xor_buffer_size /*int*/ ];
;
RDebugUtils.currentLine=40108039;
 //BA.debugLineNum = 40108039;BA.debugLine="Dim totalProcessed As Long = 0";
_totalprocessed = (long) (0);
RDebugUtils.currentLine=40108040;
 //BA.debugLineNum = 40108040;BA.debugLine="Do While True";
while (__c.True) {
RDebugUtils.currentLine=40108041;
 //BA.debugLineNum = 40108041;BA.debugLine="Dim count As Int = inputStream.ReadBytes(buffer,";
_count = _inputstream.ReadBytes(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=40108042;
 //BA.debugLineNum = 40108042;BA.debugLine="If count <= 0 Then Exit";
if (_count<=0) { 
if (true) break;};
RDebugUtils.currentLine=40108043;
 //BA.debugLineNum = 40108043;BA.debugLine="ApplyXorToBuffer(buffer, count, keyBytes, totalP";
__ref._applyxortobuffer /*String*/ (null,_buffer,_count,_keybytes,_totalprocessed);
RDebugUtils.currentLine=40108044;
 //BA.debugLineNum = 40108044;BA.debugLine="outputStream.WriteBytes(buffer, 0, count)";
_outputstream.WriteBytes(_buffer,(int) (0),_count);
RDebugUtils.currentLine=40108045;
 //BA.debugLineNum = 40108045;BA.debugLine="totalProcessed = totalProcessed + count";
_totalprocessed = (long) (_totalprocessed+_count);
 }
;
RDebugUtils.currentLine=40108047;
 //BA.debugLineNum = 40108047;BA.debugLine="outputStream.Flush";
_outputstream.Flush();
RDebugUtils.currentLine=40108048;
 //BA.debugLineNum = 40108048;BA.debugLine="End Sub";
return "";
}
public boolean  _validateindexedfile(b4j.example.mediacache __ref,String _itemtype,String _itemid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "validateindexedfile", false))
	 {return ((Boolean) Debug.delegate(ba, "validateindexedfile", new Object[] {_itemtype,_itemid}));}
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
String _auditdir = "";
String _filename = "";
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Private Sub ValidateIndexedFile(itemType As String";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="If itemId = \"\" Then Return False";
if ((_itemid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="Dim auditIndex As Map = GetIndexByItemType(itemTy";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getindexbyitemtype /*anywheresoftware.b4a.objects.collections.Map*/ (null,_itemtype);
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="Dim auditDir As String = GetDirByItemType(itemTyp";
_auditdir = __ref._getdirbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="Dim fileName As String = ResolveIndexedFileName(i";
_filename = __ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_auditindex);
RDebugUtils.currentLine=40370181;
 //BA.debugLineNum = 40370181;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=40370182;
 //BA.debugLineNum = 40370182;BA.debugLine="If TryHealTrackIndexEntry(itemId, auditIndex, au";
if (__ref._tryhealtrackindexentry /*boolean*/ (null,_itemid,_auditindex,_auditdir,_filename)) { 
RDebugUtils.currentLine=40370183;
 //BA.debugLineNum = 40370183;BA.debugLine="fileName = ResolveIndexedFileName(itemType, ite";
_filename = __ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_auditindex);
 };
 };
RDebugUtils.currentLine=40370186;
 //BA.debugLineNum = 40370186;BA.debugLine="If auditIndex.ContainsKey(itemId) = False Then";
if (_auditindex.ContainsKey((Object)(_itemid))==__c.False) { 
RDebugUtils.currentLine=40370187;
 //BA.debugLineNum = 40370187;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=40370188;
 //BA.debugLineNum = 40370188;BA.debugLine="RestoreIndexedFileById(itemId, auditIndex)";
__ref._restoreindexedfilebyid /*String*/ (null,_itemid,_auditindex);
RDebugUtils.currentLine=40370189;
 //BA.debugLineNum = 40370189;BA.debugLine="SaveIndexByItemType(itemType)";
__ref._saveindexbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=40370190;
 //BA.debugLineNum = 40370190;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=40370192;
 //BA.debugLineNum = 40370192;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then Re";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40370193;
 //BA.debugLineNum = 40370193;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=40370194;
 //BA.debugLineNum = 40370194;BA.debugLine="If TryHealTrackIndexEntry(itemId, auditIndex, au";
if (__ref._tryhealtrackindexentry /*boolean*/ (null,_itemid,_auditindex,_auditdir,_filename)) { 
RDebugUtils.currentLine=40370195;
 //BA.debugLineNum = 40370195;BA.debugLine="fileName = ResolveIndexedFileName(itemType, ite";
_filename = __ref._resolveindexedfilename /*String*/ (null,_itemtype,_itemid,_auditindex);
RDebugUtils.currentLine=40370196;
 //BA.debugLineNum = 40370196;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)) { 
if (true) return __c.True;};
 };
 };
RDebugUtils.currentLine=40370199;
 //BA.debugLineNum = 40370199;BA.debugLine="auditIndex.Remove(itemId)";
_auditindex.Remove((Object)(_itemid));
RDebugUtils.currentLine=40370200;
 //BA.debugLineNum = 40370200;BA.debugLine="SaveIndexByItemType(itemType)";
__ref._saveindexbyitemtype /*String*/ (null,_itemtype);
RDebugUtils.currentLine=40370201;
 //BA.debugLineNum = 40370201;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=40370202;
 //BA.debugLineNum = 40370202;BA.debugLine="End Sub";
return false;
}
public String  _gettrackplaylistdir(b4j.example.mediacache __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "gettrackplaylistdir", false))
	 {return ((String) Debug.delegate(ba, "gettrackplaylistdir", new Object[] {_playlistid}));}
String _unusedplaylistid = "";
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Private Sub GetTrackPlaylistDir(playlistId As Stri";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Dim unusedPlaylistId As String = playlistId";
_unusedplaylistid = _playlistid;
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="If unusedPlaylistId = \"\" Then";
if ((_unusedplaylistid).equals("")) { 
 };
RDebugUtils.currentLine=39124996;
 //BA.debugLineNum = 39124996;BA.debugLine="Return GetTracksDir";
if (true) return __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=39124997;
 //BA.debugLineNum = 39124997;BA.debugLine="End Sub";
return "";
}
public String  _migratelegacytrackcachelayout(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "migratelegacytrackcachelayout", false))
	 {return ((String) Debug.delegate(ba, "migratelegacytrackcachelayout", null));}
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
int _migratedcount = 0;
String _relativefilename = "";
String _flatfilename = "";
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Private Sub MigrateLegacyTrackCacheLayout";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRecu";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __ref._listtrackcachefilesrecursive /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=39649283;
 //BA.debugLineNum = 39649283;BA.debugLine="If listedFiles.IsInitialized = False Or listedFil";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=39649284;
 //BA.debugLineNum = 39649284;BA.debugLine="Dim migratedCount As Int = 0";
_migratedcount = (int) (0);
RDebugUtils.currentLine=39649285;
 //BA.debugLineNum = 39649285;BA.debugLine="For Each relativeFileName As String In listedFile";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listedfiles;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_relativefilename = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=39649286;
 //BA.debugLineNum = 39649286;BA.debugLine="If relativeFileName = \"\" Or relativeFileName.End";
if ((_relativefilename).equals("") || _relativefilename.endsWith(".tmp")) { 
if (true) continue;};
RDebugUtils.currentLine=39649287;
 //BA.debugLineNum = 39649287;BA.debugLine="If relativeFileName.Contains(\"/\") = False And re";
if (_relativefilename.contains("/")==__c.False && _relativefilename.contains("\\")==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=39649288;
 //BA.debugLineNum = 39649288;BA.debugLine="Dim flatFileName As String = ResolveRelativeLeaf";
_flatfilename = __ref._resolverelativeleafname /*String*/ (null,_relativefilename);
RDebugUtils.currentLine=39649289;
 //BA.debugLineNum = 39649289;BA.debugLine="If flatFileName = \"\" Then Continue";
if ((_flatfilename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=39649290;
 //BA.debugLineNum = 39649290;BA.debugLine="If MoveLegacyTrackFileToFlat(relativeFileName, f";
if (__ref._movelegacytrackfiletoflat /*boolean*/ (null,_relativefilename,_flatfilename)) { 
_migratedcount = (int) (_migratedcount+1);};
 }
};
RDebugUtils.currentLine=39649292;
 //BA.debugLineNum = 39649292;BA.debugLine="If migratedCount > 0 Then";
if (_migratedcount>0) { 
RDebugUtils.currentLine=39649293;
 //BA.debugLineNum = 39649293;BA.debugLine="Trace(\"Миграция кэша треков в плоскую структуру";
__ref._trace /*String*/ (null,"Миграция кэша треков в плоскую структуру завершена. moved="+BA.NumberToString(_migratedcount));
 };
RDebugUtils.currentLine=39649295;
 //BA.debugLineNum = 39649295;BA.debugLine="CleanupLegacyTrackSubdirs";
__ref._cleanuplegacytracksubdirs /*String*/ (null);
RDebugUtils.currentLine=39649296;
 //BA.debugLineNum = 39649296;BA.debugLine="End Sub";
return "";
}
public String  _rebuildcachestatsfromindexes(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "rebuildcachestatsfromindexes", false))
	 {return ((String) Debug.delegate(ba, "rebuildcachestatsfromindexes", null));}
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _trackentry = null;
long _trackbytes = 0L;
String _adid = "";
anywheresoftware.b4a.objects.collections.Map _adentry = null;
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Private Sub RebuildCacheStatsFromIndexes";
RDebugUtils.currentLine=43450369;
 //BA.debugLineNum = 43450369;BA.debugLine="cachedTrackCount = 0";
__ref._cachedtrackcount /*int*/  = (int) (0);
RDebugUtils.currentLine=43450370;
 //BA.debugLineNum = 43450370;BA.debugLine="cachedAdCount = 0";
__ref._cachedadcount /*int*/  = (int) (0);
RDebugUtils.currentLine=43450371;
 //BA.debugLineNum = 43450371;BA.debugLine="cachedTrackBytes = 0";
__ref._cachedtrackbytes /*long*/  = (long) (0);
RDebugUtils.currentLine=43450372;
 //BA.debugLineNum = 43450372;BA.debugLine="cachedAdBytes = 0";
__ref._cachedadbytes /*long*/  = (long) (0);
RDebugUtils.currentLine=43450373;
 //BA.debugLineNum = 43450373;BA.debugLine="cachedTrackPlaylistStats.Initialize";
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=43450374;
 //BA.debugLineNum = 43450374;BA.debugLine="If cachedTrackIndex.IsInitialized Then";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=43450375;
 //BA.debugLineNum = 43450375;BA.debugLine="For Each trackId As String In cachedTrackIndex.K";
{
final anywheresoftware.b4a.BA.IterableList group7 = __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=43450376;
 //BA.debugLineNum = 43450376;BA.debugLine="Dim trackEntry As Map = cachedTrackIndex.Get(tr";
_trackentry = new anywheresoftware.b4a.objects.collections.Map();
_trackentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_trackid))));
RDebugUtils.currentLine=43450377;
 //BA.debugLineNum = 43450377;BA.debugLine="If trackEntry.IsInitialized = False Then Contin";
if (_trackentry.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=43450378;
 //BA.debugLineNum = 43450378;BA.debugLine="cachedTrackCount = cachedTrackCount + 1";
__ref._cachedtrackcount /*int*/  = (int) (__ref._cachedtrackcount /*int*/ +1);
RDebugUtils.currentLine=43450379;
 //BA.debugLineNum = 43450379;BA.debugLine="Dim trackBytes As Long = ToLongDefault(trackEnt";
_trackbytes = __ref._tolongdefault /*long*/ (null,_trackentry.GetDefault((Object)("size_bytes"),(Object)(0)),(long) (0));
RDebugUtils.currentLine=43450380;
 //BA.debugLineNum = 43450380;BA.debugLine="cachedTrackBytes = cachedTrackBytes + trackByte";
__ref._cachedtrackbytes /*long*/  = (long) (__ref._cachedtrackbytes /*long*/ +_trackbytes);
RDebugUtils.currentLine=43450381;
 //BA.debugLineNum = 43450381;BA.debugLine="AccumulateTrackPlaylistStat(trackEntry.GetDefau";
__ref._accumulatetrackplayliststat /*String*/ (null,BA.ObjectToString(_trackentry.GetDefault((Object)("playlist_id"),(Object)(""))),_trackbytes);
 }
};
 };
RDebugUtils.currentLine=43450384;
 //BA.debugLineNum = 43450384;BA.debugLine="If cachedAdIndex.IsInitialized Then";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=43450385;
 //BA.debugLineNum = 43450385;BA.debugLine="For Each adId As String In cachedAdIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_adid = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=43450386;
 //BA.debugLineNum = 43450386;BA.debugLine="Dim adEntry As Map = cachedAdIndex.Get(adId)";
_adentry = new anywheresoftware.b4a.objects.collections.Map();
_adentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_adid))));
RDebugUtils.currentLine=43450387;
 //BA.debugLineNum = 43450387;BA.debugLine="If adEntry.IsInitialized = False Then Continue";
if (_adentry.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=43450388;
 //BA.debugLineNum = 43450388;BA.debugLine="cachedAdCount = cachedAdCount + 1";
__ref._cachedadcount /*int*/  = (int) (__ref._cachedadcount /*int*/ +1);
RDebugUtils.currentLine=43450389;
 //BA.debugLineNum = 43450389;BA.debugLine="cachedAdBytes = cachedAdBytes + ToLongDefault(a";
__ref._cachedadbytes /*long*/  = (long) (__ref._cachedadbytes /*long*/ +__ref._tolongdefault /*long*/ (null,_adentry.GetDefault((Object)("size_bytes"),(Object)(0)),(long) (0)));
 }
};
 };
RDebugUtils.currentLine=43450392;
 //BA.debugLineNum = 43450392;BA.debugLine="End Sub";
return "";
}
public String  _savecachestatssnapshot(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "savecachestatssnapshot", false))
	 {return ((String) Debug.delegate(ba, "savecachestatssnapshot", null));}
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Private Sub SaveCacheStatsSnapshot";
RDebugUtils.currentLine=43384833;
 //BA.debugLineNum = 43384833;BA.debugLine="storage.Put(\"cache_stats_track_count\", cachedTrac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_track_count",(Object)(__ref._cachedtrackcount /*int*/ ));
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="storage.Put(\"cache_stats_ad_count\", cachedAdCount";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_ad_count",(Object)(__ref._cachedadcount /*int*/ ));
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="storage.Put(\"cache_stats_track_bytes\", cachedTrac";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_track_bytes",(Object)(__ref._cachedtrackbytes /*long*/ ));
RDebugUtils.currentLine=43384836;
 //BA.debugLineNum = 43384836;BA.debugLine="storage.Put(\"cache_stats_ad_bytes\", cachedAdBytes";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_ad_bytes",(Object)(__ref._cachedadbytes /*long*/ ));
RDebugUtils.currentLine=43384837;
 //BA.debugLineNum = 43384837;BA.debugLine="storage.Put(\"cache_stats_track_playlist\", cachedT";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"cache_stats_track_playlist",(Object)(__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=43384838;
 //BA.debugLineNum = 43384838;BA.debugLine="End Sub";
return "";
}
public String  _ensuretrackindexentry(b4j.example.mediacache __ref,String _trackid,String _playlistid,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuretrackindexentry", false))
	 {return ((String) Debug.delegate(ba, "ensuretrackindexentry", new Object[] {_trackid,_playlistid,_relativefilename}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Private Sub EnsureTrackIndexEntry(trackId As Strin";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="If trackId = \"\" Or relativeFileName = \"\" Then Ret";
if ((_trackid).equals("") || (_relativefilename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=39583747;
 //BA.debugLineNum = 39583747;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(tr";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=39583748;
 //BA.debugLineNum = 39583748;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=39583749;
 //BA.debugLineNum = 39583749;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=39583750;
 //BA.debugLineNum = 39583750;BA.debugLine="If playlistId <> \"\" Then entry.Put(\"playlist_id\",";
if ((_playlistid).equals("") == false) { 
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));};
RDebugUtils.currentLine=39583751;
 //BA.debugLineNum = 39583751;BA.debugLine="entry.Put(\"file_name\", relativeFileName)";
_entry.Put((Object)("file_name"),(Object)(_relativefilename));
RDebugUtils.currentLine=39583752;
 //BA.debugLineNum = 39583752;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTracks";
_entry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_relativefilename)));
RDebugUtils.currentLine=39583753;
 //BA.debugLineNum = 39583753;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=39583754;
 //BA.debugLineNum = 39583754;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=39583755;
 //BA.debugLineNum = 39583755;BA.debugLine="cachedTrackIndex.Put(trackId, entry)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=39583756;
 //BA.debugLineNum = 39583756;BA.debugLine="cachedTrackIndexDirty = True";
__ref._cachedtrackindexdirty /*boolean*/  = __c.True;
RDebugUtils.currentLine=39583757;
 //BA.debugLineNum = 39583757;BA.debugLine="End Sub";
return "";
}
public boolean  _ensuretrackplaybacktemp(b4j.example.mediacache __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "ensuretrackplaybacktemp", false))
	 {return ((Boolean) Debug.delegate(ba, "ensuretrackplaybacktemp", new Object[] {_audiokey,_item}));}
String _trackid = "";
String _tempfilename = "";
String _sourcerelativename = "";
String _sourcedir = "";
String _sourceleafname = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream = null;
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Private Sub EnsureTrackPlaybackTemp(audioKey As St";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=39452675;
 //BA.debugLineNum = 39452675;BA.debugLine="Dim tempFileName As String = BuildPlaybackTempTra";
_tempfilename = __ref._buildplaybacktemptrackfilename /*String*/ (null,_audiokey);
RDebugUtils.currentLine=39452676;
 //BA.debugLineNum = 39452676;BA.debugLine="If playbackTempTrackIds.GetDefault(audioKey, \"\")";
if ((__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_audiokey),(Object)(""))).equals((Object)(_trackid)) && __ref._iscachedfileusable /*boolean*/ (null,__c.File.getDirTemp(),_tempfilename)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=39452677;
 //BA.debugLineNum = 39452677;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),_tempfilename);
RDebugUtils.currentLine=39452678;
 //BA.debugLineNum = 39452678;BA.debugLine="Try";
try {RDebugUtils.currentLine=39452679;
 //BA.debugLineNum = 39452679;BA.debugLine="Dim sourceRelativeName As String = ResolveTrackR";
_sourcerelativename = __ref._resolvetrackrelativefilenamefromitem /*String*/ (null,_item);
RDebugUtils.currentLine=39452680;
 //BA.debugLineNum = 39452680;BA.debugLine="Dim sourceDir As String = ResolveRelativeParentD";
_sourcedir = __ref._resolverelativeparentdir /*String*/ (null,__ref._gettracksdir /*String*/ (null),_sourcerelativename);
RDebugUtils.currentLine=39452681;
 //BA.debugLineNum = 39452681;BA.debugLine="Dim sourceLeafName As String = ResolveRelativeLe";
_sourceleafname = __ref._resolverelativeleafname /*String*/ (null,_sourcerelativename);
RDebugUtils.currentLine=39452682;
 //BA.debugLineNum = 39452682;BA.debugLine="Dim inputStream As InputStream = File.OpenInput(";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_inputstream = __c.File.OpenInput(_sourcedir,_sourceleafname);
RDebugUtils.currentLine=39452683;
 //BA.debugLineNum = 39452683;BA.debugLine="Dim outputStream As OutputStream = File.OpenOutp";
_outputstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outputstream = __c.File.OpenOutput(__c.File.getDirTemp(),_tempfilename,__c.False);
RDebugUtils.currentLine=39452684;
 //BA.debugLineNum = 39452684;BA.debugLine="TransformStreamWithXor(inputStream, outputStream";
__ref._transformstreamwithxor /*String*/ (null,_inputstream,_outputstream,__ref._buildtrackobfuscationkey /*byte[]*/ (null,_trackid));
RDebugUtils.currentLine=39452685;
 //BA.debugLineNum = 39452685;BA.debugLine="outputStream.Close";
_outputstream.Close();
RDebugUtils.currentLine=39452686;
 //BA.debugLineNum = 39452686;BA.debugLine="inputStream.Close";
_inputstream.Close();
RDebugUtils.currentLine=39452687;
 //BA.debugLineNum = 39452687;BA.debugLine="playbackTempTrackIds.Put(audioKey, trackId)";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_audiokey),(Object)(_trackid));
RDebugUtils.currentLine=39452688;
 //BA.debugLineNum = 39452688;BA.debugLine="Return IsCachedFileUsable(File.DirTemp, tempFile";
if (true) return __ref._iscachedfileusable /*boolean*/ (null,__c.File.getDirTemp(),_tempfilename);
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=39452690;
 //BA.debugLineNum = 39452690;BA.debugLine="DeleteFileIfExists(File.DirTemp, tempFileName)";
__ref._deletefileifexists /*String*/ (null,__c.File.getDirTemp(),_tempfilename);
RDebugUtils.currentLine=39452691;
 //BA.debugLineNum = 39452691;BA.debugLine="Trace(\"Не удалось подготовить временный файл тре";
__ref._trace /*String*/ (null,"Не удалось подготовить временный файл трека. id="+_trackid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=39452693;
 //BA.debugLineNum = 39452693;BA.debugLine="playbackTempTrackIds.Remove(audioKey)";
__ref._playbacktemptrackids /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_audiokey));
RDebugUtils.currentLine=39452694;
 //BA.debugLineNum = 39452694;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=39452695;
 //BA.debugLineNum = 39452695;BA.debugLine="End Sub";
return false;
}
public String  _resolvetrackrelativefilenamefromitem(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolvetrackrelativefilenamefromitem", false))
	 {return ((String) Debug.delegate(ba, "resolvetrackrelativefilenamefromitem", new Object[] {_item}));}
String _trackid = "";
String _playlistid = "";
String _preferredrelativename = "";
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Private Sub ResolveTrackRelativeFileNameFromItem(i";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="If trackId = \"\" Then Return \"\"";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=39518211;
 //BA.debugLineNum = 39518211;BA.debugLine="Dim playlistId As String = item.GetDefault(\"playl";
_playlistid = BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=39518212;
 //BA.debugLineNum = 39518212;BA.debugLine="Dim preferredRelativeName As String = BuildTrackC";
_preferredrelativename = __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid);
RDebugUtils.currentLine=39518213;
 //BA.debugLineNum = 39518213;BA.debugLine="If IsCachedFileUsable(GetTracksDir, preferredRela";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_preferredrelativename)) { 
if (true) return _preferredrelativename;};
RDebugUtils.currentLine=39518214;
 //BA.debugLineNum = 39518214;BA.debugLine="Return ResolveTrackCacheFileName(trackId, cachedT";
if (true) return __ref._resolvetrackcachefilename /*String*/ (null,_trackid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=39518215;
 //BA.debugLineNum = 39518215;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcachedtrackindex(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcachedtrackindex", null));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Private Sub GetCachedTrackIndex As Map";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="cachedTrackIndex.Initialize";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=38469636;
 //BA.debugLineNum = 38469636;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=38469637;
 //BA.debugLineNum = 38469637;BA.debugLine="End Sub";
return null;
}
public String  _finalizecurrentcacheaudittype(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "finalizecurrentcacheaudittype", false))
	 {return ((String) Debug.delegate(ba, "finalizecurrentcacheaudittype", null));}
String _auditdir = "";
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
anywheresoftware.b4a.objects.collections.List _keyscopy = null;
String _key = "";
String _filename = "";
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Private Sub FinalizeCurrentCacheAuditType";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getauditindexbytype /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=41418755;
 //BA.debugLineNum = 41418755;BA.debugLine="Dim keysCopy As List";
_keyscopy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=41418756;
 //BA.debugLineNum = 41418756;BA.debugLine="keysCopy.Initialize";
_keyscopy.Initialize();
RDebugUtils.currentLine=41418757;
 //BA.debugLineNum = 41418757;BA.debugLine="For Each key As String In auditIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _auditindex.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=41418758;
 //BA.debugLineNum = 41418758;BA.debugLine="keysCopy.Add(key)";
_keyscopy.Add((Object)(_key));
 }
};
RDebugUtils.currentLine=41418760;
 //BA.debugLineNum = 41418760;BA.debugLine="For Each key As String In keysCopy";
{
final anywheresoftware.b4a.BA.IterableList group8 = _keyscopy;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=41418761;
 //BA.debugLineNum = 41418761;BA.debugLine="If cacheAuditSeenIds.ContainsKey(key) = False Th";
if (__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
RDebugUtils.currentLine=41418762;
 //BA.debugLineNum = 41418762;BA.debugLine="Dim fileName As String = ResolveIndexedAuditFil";
_filename = __ref._resolveindexedauditfilename /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ ,_key,_auditindex);
RDebugUtils.currentLine=41418763;
 //BA.debugLineNum = 41418763;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) Then";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)) { 
RDebugUtils.currentLine=41418764;
 //BA.debugLineNum = 41418764;BA.debugLine="cacheAuditSeenIds.Put(key, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(__c.True));
RDebugUtils.currentLine=41418765;
 //BA.debugLineNum = 41418765;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=41418767;
 //BA.debugLineNum = 41418767;BA.debugLine="auditIndex.Remove(key)";
_auditindex.Remove((Object)(_key));
RDebugUtils.currentLine=41418768;
 //BA.debugLineNum = 41418768;BA.debugLine="cacheAuditRemovedCount = cacheAuditRemovedCount";
__ref._cacheauditremovedcount /*int*/  = (int) (__ref._cacheauditremovedcount /*int*/ +1);
RDebugUtils.currentLine=41418769;
 //BA.debugLineNum = 41418769;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
__ref._markauditindexchanged /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
 };
 }
};
RDebugUtils.currentLine=41418772;
 //BA.debugLineNum = 41418772;BA.debugLine="End Sub";
return "";
}
public String  _getauditdirbytype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getauditdirbytype", false))
	 {return ((String) Debug.delegate(ba, "getauditdirbytype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Private Sub GetAuditDirByType(itemType As String)";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="If itemType = \"ads\" Then Return GetAdsDir";
if ((_itemtype).equals("ads")) { 
if (true) return __ref._getadsdir /*String*/ (null);};
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="Return GetTracksDir";
if (true) return __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getauditindexbytype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getauditindexbytype", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getauditindexbytype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Private Sub GetAuditIndexByType(itemType As String";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="If itemType = \"ads\" Then Return cachedAdIndex";
if ((_itemtype).equals("ads")) { 
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=41615363;
 //BA.debugLineNum = 41615363;BA.debugLine="End Sub";
return null;
}
public String  _resolveindexedauditfilename(b4j.example.mediacache __ref,String _audittype,String _itemid,anywheresoftware.b4a.objects.collections.Map _auditindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveindexedauditfilename", false))
	 {return ((String) Debug.delegate(ba, "resolveindexedauditfilename", new Object[] {_audittype,_itemid,_auditindex}));}
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Private Sub ResolveIndexedAuditFileName(auditType";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="If auditType = \"ads\" Then Return itemId";
if ((_audittype).equals("ads")) { 
if (true) return _itemid;};
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="Return ResolveTrackCacheFileName(itemId, auditInd";
if (true) return __ref._resolvetrackcachefilename /*String*/ (null,_itemid,_auditindex);
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadglobaltrackfilemap(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadglobaltrackfilemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadglobaltrackfilemap", new Object[] {_playlisttrackmaps}));}
anywheresoftware.b4a.objects.collections.Map _emptymap = null;
String _cachekey = "";
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistsdir = "";
anywheresoftware.b4a.objects.collections.List _listed = null;
String _filename = "";
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlisttrackmap = null;
String _relativename = "";
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Private Sub LoadGlobalTrackFileMap(playlistTrackMa";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="Dim emptyMap As Map";
_emptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="emptyMap.Initialize";
_emptymap.Initialize();
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="Dim cacheKey As String = \"__global_track_file_map";
_cachekey = "__global_track_file_map__";
RDebugUtils.currentLine=42008580;
 //BA.debugLineNum = 42008580;BA.debugLine="If playlistTrackMaps.ContainsKey(cacheKey) Then R";
if (_playlisttrackmaps.ContainsKey((Object)(_cachekey))) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlisttrackmaps.Get((Object)(_cachekey))));};
RDebugUtils.currentLine=42008581;
 //BA.debugLineNum = 42008581;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42008582;
 //BA.debugLineNum = 42008582;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=42008583;
 //BA.debugLineNum = 42008583;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
_playlistsdir = __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=42008584;
 //BA.debugLineNum = 42008584;BA.debugLine="If DirectoryExists(playlistsDir) = False Then";
if (__ref._directoryexists /*boolean*/ (null,_playlistsdir)==__c.False) { 
RDebugUtils.currentLine=42008585;
 //BA.debugLineNum = 42008585;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
_playlisttrackmaps.Put((Object)(_cachekey),(Object)(_result.getObject()));
RDebugUtils.currentLine=42008586;
 //BA.debugLineNum = 42008586;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=42008588;
 //BA.debugLineNum = 42008588;BA.debugLine="Try";
try {RDebugUtils.currentLine=42008589;
 //BA.debugLineNum = 42008589;BA.debugLine="Dim listed As List = File.ListFiles(playlistsDir";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_playlistsdir);
RDebugUtils.currentLine=42008590;
 //BA.debugLineNum = 42008590;BA.debugLine="If listed.IsInitialized Then";
if (_listed.IsInitialized()) { 
RDebugUtils.currentLine=42008591;
 //BA.debugLineNum = 42008591;BA.debugLine="For Each fileName As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group15 = _listed;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_filename = BA.ObjectToString(group15.Get(index15));
RDebugUtils.currentLine=42008592;
 //BA.debugLineNum = 42008592;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=42008593;
 //BA.debugLineNum = 42008593;BA.debugLine="If fileName.ToLowerCase.EndsWith(\".json\") = Fa";
if (_filename.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).endsWith(".json")==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=42008594;
 //BA.debugLineNum = 42008594;BA.debugLine="Dim playlistId As String = fileName.SubString2";
_playlistid = _filename.substring((int) (0),(int) (_filename.length()-5));
RDebugUtils.currentLine=42008595;
 //BA.debugLineNum = 42008595;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=42008596;
 //BA.debugLineNum = 42008596;BA.debugLine="Dim playlistTrackMap As Map = LoadPlaylistTrac";
_playlisttrackmap = new anywheresoftware.b4a.objects.collections.Map();
_playlisttrackmap = __ref._loadplaylisttrackfilemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid,_playlisttrackmaps);
RDebugUtils.currentLine=42008597;
 //BA.debugLineNum = 42008597;BA.debugLine="If playlistTrackMap.IsInitialized = False Then";
if (_playlisttrackmap.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=42008598;
 //BA.debugLineNum = 42008598;BA.debugLine="For Each relativeName As String In playlistTra";
{
final anywheresoftware.b4a.BA.IterableList group22 = _playlisttrackmap.Keys();
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_relativename = BA.ObjectToString(group22.Get(index22));
RDebugUtils.currentLine=42008599;
 //BA.debugLineNum = 42008599;BA.debugLine="If result.ContainsKey(relativeName) Then Cont";
if (_result.ContainsKey((Object)(_relativename))) { 
if (true) continue;};
RDebugUtils.currentLine=42008600;
 //BA.debugLineNum = 42008600;BA.debugLine="result.Put(relativeName, playlistTrackMap.Get";
_result.Put((Object)(_relativename),_playlisttrackmap.Get((Object)(_relativename)));
 }
};
 }
};
 };
 } 
       catch (Exception e29) {
			ba.setLastException(e29);RDebugUtils.currentLine=42008605;
 //BA.debugLineNum = 42008605;BA.debugLine="Trace(\"Не удалось восстановить глобальную track";
__ref._trace /*String*/ (null,"Не удалось восстановить глобальную track map по playlist metadata. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=42008607;
 //BA.debugLineNum = 42008607;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
_playlisttrackmaps.Put((Object)(_cachekey),(Object)(_result.getObject()));
RDebugUtils.currentLine=42008608;
 //BA.debugLineNum = 42008608;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=42008609;
 //BA.debugLineNum = 42008609;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _loadplaylisttrackfilemap(b4j.example.mediacache __ref,String _playlistid,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadplaylisttrackfilemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadplaylisttrackfilemap", new Object[] {_playlistid,_playlisttrackmaps}));}
anywheresoftware.b4a.objects.collections.Map _emptymap = null;
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistsdir = "";
String _metadatafilename = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Private Sub LoadPlaylistTrackFileMap(playlistId As";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="Dim emptyMap As Map";
_emptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="emptyMap.Initialize";
_emptymap.Initialize();
RDebugUtils.currentLine=42336259;
 //BA.debugLineNum = 42336259;BA.debugLine="If playlistId = \"\" Then Return emptyMap";
if ((_playlistid).equals("")) { 
if (true) return _emptymap;};
RDebugUtils.currentLine=42336260;
 //BA.debugLineNum = 42336260;BA.debugLine="If playlistTrackMaps.ContainsKey(playlistId) Then";
if (_playlisttrackmaps.ContainsKey((Object)(_playlistid))) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlisttrackmaps.Get((Object)(_playlistid))));};
RDebugUtils.currentLine=42336261;
 //BA.debugLineNum = 42336261;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42336262;
 //BA.debugLineNum = 42336262;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=42336263;
 //BA.debugLineNum = 42336263;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
_playlistsdir = __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=42336264;
 //BA.debugLineNum = 42336264;BA.debugLine="Dim metadataFileName As String = playlistId & \".j";
_metadatafilename = _playlistid+".json";
RDebugUtils.currentLine=42336265;
 //BA.debugLineNum = 42336265;BA.debugLine="If File.Exists(playlistsDir, metadataFileName) =";
if (__c.File.Exists(_playlistsdir,_metadatafilename)==__c.False) { 
RDebugUtils.currentLine=42336266;
 //BA.debugLineNum = 42336266;BA.debugLine="playlistTrackMaps.Put(playlistId, result)";
_playlisttrackmaps.Put((Object)(_playlistid),(Object)(_result.getObject()));
RDebugUtils.currentLine=42336267;
 //BA.debugLineNum = 42336267;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=42336269;
 //BA.debugLineNum = 42336269;BA.debugLine="Try";
try {RDebugUtils.currentLine=42336270;
 //BA.debugLineNum = 42336270;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=42336271;
 //BA.debugLineNum = 42336271;BA.debugLine="parser.Initialize(File.ReadString(playlistsDir,";
_parser.Initialize(__c.File.ReadString(_playlistsdir,_metadatafilename));
RDebugUtils.currentLine=42336272;
 //BA.debugLineNum = 42336272;BA.debugLine="Dim playlistData As Map = parser.NextObject";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = _parser.NextObject();
RDebugUtils.currentLine=42336273;
 //BA.debugLineNum = 42336273;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tr";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=42336274;
 //BA.debugLineNum = 42336274;BA.debugLine="If tracks.IsInitialized Then";
if (_tracks.IsInitialized()) { 
RDebugUtils.currentLine=42336275;
 //BA.debugLineNum = 42336275;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group19 = _tracks;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_trackobject = group19.Get(index19);
RDebugUtils.currentLine=42336276;
 //BA.debugLineNum = 42336276;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=42336277;
 //BA.debugLineNum = 42336277;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=42336278;
 //BA.debugLineNum = 42336278;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=42336279;
 //BA.debugLineNum = 42336279;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=42336280;
 //BA.debugLineNum = 42336280;BA.debugLine="result.Put(BuildTrackCacheRelativeFileName(tra";
_result.Put((Object)(__ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid)),(Object)(_trackid));
 }
};
 };
 } 
       catch (Exception e28) {
			ba.setLastException(e28);RDebugUtils.currentLine=42336284;
 //BA.debugLineNum = 42336284;BA.debugLine="Trace(\"Не удалось восстановить track map по play";
__ref._trace /*String*/ (null,"Не удалось восстановить track map по playlist metadata. playlistId="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=42336286;
 //BA.debugLineNum = 42336286;BA.debugLine="playlistTrackMaps.Put(playlistId, result)";
_playlisttrackmaps.Put((Object)(_playlistid),(Object)(_result.getObject()));
RDebugUtils.currentLine=42336287;
 //BA.debugLineNum = 42336287;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=42336288;
 //BA.debugLineNum = 42336288;BA.debugLine="End Sub";
return null;
}
public String  _finishcacheaudit(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "finishcacheaudit", false))
	 {return ((String) Debug.delegate(ba, "finishcacheaudit", null));}
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Private Sub FinishCacheAudit";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="If cacheAuditAdIndexChanged Then SaveAdIndex";
if (__ref._cacheauditadindexchanged /*boolean*/ ) { 
__ref._saveadindex /*String*/ (null);};
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="If cacheAuditTrackIndexChanged Then SaveTrackInde";
if (__ref._cacheaudittrackindexchanged /*boolean*/ ) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=41484291;
 //BA.debugLineNum = 41484291;BA.debugLine="cacheAuditInProgress = False";
__ref._cacheauditinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=41484292;
 //BA.debugLineNum = 41484292;BA.debugLine="cacheAuditCurrentType = \"\"";
__ref._cacheauditcurrenttype /*String*/  = "";
RDebugUtils.currentLine=41484293;
 //BA.debugLineNum = 41484293;BA.debugLine="cacheAuditListingInProgress = False";
__ref._cacheauditlistinginprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=41484294;
 //BA.debugLineNum = 41484294;BA.debugLine="cacheAuditListingDir = \"\"";
__ref._cacheauditlistingdir /*String*/  = "";
RDebugUtils.currentLine=41484295;
 //BA.debugLineNum = 41484295;BA.debugLine="Trace(\"Аудит кэша завершен. added=\" & cacheAuditA";
__ref._trace /*String*/ (null,"Аудит кэша завершен. added="+BA.NumberToString(__ref._cacheauditaddedcount /*int*/ )+", removed="+BA.NumberToString(__ref._cacheauditremovedcount /*int*/ )+", tempDeleted="+BA.NumberToString(__ref._cacheaudittempdeletedcount /*int*/ )+", ads="+BA.NumberToString(__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize())+", tracks="+BA.NumberToString(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=41484296;
 //BA.debugLineNum = 41484296;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getcachedtrackplaylistidsondisk(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getcachedtrackplaylistidsondisk", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getcachedtrackplaylistidsondisk", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _seenids = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Public Sub GetCachedTrackPlaylistIdsOnDisk As List";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=37617667;
 //BA.debugLineNum = 37617667;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="EnsureTrackCacheReady";
__ref._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=37617669;
 //BA.debugLineNum = 37617669;BA.debugLine="Dim seenIds As Map";
_seenids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37617670;
 //BA.debugLineNum = 37617670;BA.debugLine="seenIds.Initialize";
_seenids.Initialize();
RDebugUtils.currentLine=37617671;
 //BA.debugLineNum = 37617671;BA.debugLine="Try";
try {RDebugUtils.currentLine=37617672;
 //BA.debugLineNum = 37617672;BA.debugLine="If cachedTrackIndex.IsInitialized Then";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=37617673;
 //BA.debugLineNum = 37617673;BA.debugLine="For Each trackId As String In cachedTrackIndex.";
{
final anywheresoftware.b4a.BA.IterableList group9 = __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_trackid = BA.ObjectToString(group9.Get(index9));
RDebugUtils.currentLine=37617674;
 //BA.debugLineNum = 37617674;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=37617675;
 //BA.debugLineNum = 37617675;BA.debugLine="If entry.IsInitialized = False Then Continue";
if (_entry.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=37617676;
 //BA.debugLineNum = 37617676;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"p";
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=37617677;
 //BA.debugLineNum = 37617677;BA.debugLine="If playlistId = \"\" Or seenIds.ContainsKey(play";
if ((_playlistid).equals("") || _seenids.ContainsKey((Object)(_playlistid))) { 
if (true) continue;};
RDebugUtils.currentLine=37617678;
 //BA.debugLineNum = 37617678;BA.debugLine="seenIds.Put(playlistId, True)";
_seenids.Put((Object)(_playlistid),(Object)(__c.True));
RDebugUtils.currentLine=37617679;
 //BA.debugLineNum = 37617679;BA.debugLine="result.Add(playlistId)";
_result.Add((Object)(_playlistid));
 }
};
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19);RDebugUtils.currentLine=37617683;
 //BA.debugLineNum = 37617683;BA.debugLine="Trace(\"Не удалось получить список playlist папок";
__ref._trace /*String*/ (null,"Не удалось получить список playlist папок из track cache. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=37617685;
 //BA.debugLineNum = 37617685;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=37617686;
 //BA.debugLineNum = 37617686;BA.debugLine="End Sub";
return null;
}
public String  _getdirbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getdirbyitemtype", false))
	 {return ((String) Debug.delegate(ba, "getdirbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Private Sub GetDirByItemType(itemType As String) A";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="If itemType = \"ad\" Then Return GetAdsDir";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._getadsdir /*String*/ (null);};
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="Return GetTracksDir";
if (true) return __ref._gettracksdir /*String*/ (null);
RDebugUtils.currentLine=40697859;
 //BA.debugLineNum = 40697859;BA.debugLine="End Sub";
return "";
}
public long  _getdrivetotalspace(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getdrivetotalspace", false))
	 {return ((Long) Debug.delegate(ba, "getdrivetotalspace", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Private Sub GetDriveTotalSpace(path As String) As";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="Try";
try {RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=43712515;
 //BA.debugLineNum = 43712515;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=43712516;
 //BA.debugLineNum = 43712516;BA.debugLine="Return fileObject.RunMethod(\"getTotalSpace\", Nul";
if (true) return BA.ObjectToLongNumber(_fileobject.RunMethod("getTotalSpace",(Object[])(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=43712518;
 //BA.debugLineNum = 43712518;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=43712520;
 //BA.debugLineNum = 43712520;BA.debugLine="End Sub";
return 0L;
}
public long  _getdriveusablespace(b4j.example.mediacache __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getdriveusablespace", false))
	 {return ((Long) Debug.delegate(ba, "getdriveusablespace", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=43646976;
 //BA.debugLineNum = 43646976;BA.debugLine="Private Sub GetDriveUsableSpace(path As String) As";
RDebugUtils.currentLine=43646977;
 //BA.debugLineNum = 43646977;BA.debugLine="Try";
try {RDebugUtils.currentLine=43646978;
 //BA.debugLineNum = 43646978;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=43646979;
 //BA.debugLineNum = 43646979;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=43646980;
 //BA.debugLineNum = 43646980;BA.debugLine="Return fileObject.RunMethod(\"getUsableSpace\", Nu";
if (true) return BA.ObjectToLongNumber(_fileobject.RunMethod("getUsableSpace",(Object[])(__c.Null)));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=43646982;
 //BA.debugLineNum = 43646982;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=43646984;
 //BA.debugLineNum = 43646984;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.collections.Map  _getindexbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "getindexbyitemtype", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getindexbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Private Sub GetIndexByItemType(itemType As String)";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="If itemType = \"ad\" Then Return cachedAdIndex";
if ((_itemtype).equals("ad")) { 
if (true) return __ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="Return cachedTrackIndex";
if (true) return __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=40632323;
 //BA.debugLineNum = 40632323;BA.debugLine="End Sub";
return null;
}
public boolean  _hasanytrackfilesondisk(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "hasanytrackfilesondisk", false))
	 {return ((Boolean) Debug.delegate(ba, "hasanytrackfilesondisk", null));}
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
String _filename = "";
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Public Sub HasAnyTrackFilesOnDisk As Boolean";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="If DirectoryExists(GetTracksDir) = False Then Ret";
if (__ref._directoryexists /*boolean*/ (null,__ref._gettracksdir /*String*/ (null))==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="Try";
try {RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="Dim listedFiles As List = ListTrackCacheFilesRec";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __ref._listtrackcachefilesrecursive /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=37552133;
 //BA.debugLineNum = 37552133;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listedfiles;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_filename = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=37552134;
 //BA.debugLineNum = 37552134;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=37552135;
 //BA.debugLineNum = 37552135;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
RDebugUtils.currentLine=37552136;
 //BA.debugLineNum = 37552136;BA.debugLine="Return True";
if (true) return __c.True;
 }
};
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=37552139;
 //BA.debugLineNum = 37552139;BA.debugLine="Trace(\"Не удалось проверить наличие track файлов";
__ref._trace /*String*/ (null,"Не удалось проверить наличие track файлов на диске. message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=37552141;
 //BA.debugLineNum = 37552141;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=37552142;
 //BA.debugLineNum = 37552142;BA.debugLine="End Sub";
return false;
}
public String  _loadindexesfromstorage(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadindexesfromstorage", false))
	 {return ((String) Debug.delegate(ba, "loadindexesfromstorage", null));}
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Private Sub LoadIndexesFromStorage";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="cachedAdIndex = storage.GetDefault(\"cached_ad_ind";
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_ad_index",__c.Null)));
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="If cachedAdIndex.IsInitialized = False Then cache";
if (__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedadindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="cachedTrackIndex = storage.GetDefault(\"cached_tra";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_track_index",__c.Null)));
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then ca";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="LoadCacheStatsSnapshot";
__ref._loadcachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="MigrateLegacyTrackCacheLayout";
__ref._migratelegacytrackcachelayout /*String*/ (null);
RDebugUtils.currentLine=38666247;
 //BA.debugLineNum = 38666247;BA.debugLine="NormalizeTrackIndexFileNames(cachedTrackIndex)";
__ref._normalizetrackindexfilenames /*String*/ (null,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=38666248;
 //BA.debugLineNum = 38666248;BA.debugLine="BackfillTrackIndexFromFiles";
__ref._backfilltrackindexfromfiles /*String*/ (null);
RDebugUtils.currentLine=38666249;
 //BA.debugLineNum = 38666249;BA.debugLine="RebuildCacheStatsFromIndexes";
__ref._rebuildcachestatsfromindexes /*String*/ (null);
RDebugUtils.currentLine=38666250;
 //BA.debugLineNum = 38666250;BA.debugLine="SaveCacheStatsSnapshot";
__ref._savecachestatssnapshot /*String*/ (null);
RDebugUtils.currentLine=38666251;
 //BA.debugLineNum = 38666251;BA.debugLine="End Sub";
return "";
}
public String  _listtrackcachefilesinto(b4j.example.mediacache __ref,String _currentdir,String _relativeprefix,anywheresoftware.b4a.objects.collections.List _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "listtrackcachefilesinto", false))
	 {return ((String) Debug.delegate(ba, "listtrackcachefilesinto", new Object[] {_currentdir,_relativeprefix,_result}));}
anywheresoftware.b4a.objects.collections.List _listed = null;
String _name = "";
String _childrelative = "";
String _childpath = "";
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Private Sub ListTrackCacheFilesInto(currentDir As";
RDebugUtils.currentLine=42663937;
 //BA.debugLineNum = 42663937;BA.debugLine="Try";
try {RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="If DirectoryExists(currentDir) = False Then Retu";
if (__ref._directoryexists /*boolean*/ (null,_currentdir)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="Dim listed As List = File.ListFiles(currentDir)";
_listed = new anywheresoftware.b4a.objects.collections.List();
_listed = __c.File.ListFiles(_currentdir);
RDebugUtils.currentLine=42663940;
 //BA.debugLineNum = 42663940;BA.debugLine="If listed.IsInitialized = False Then Return";
if (_listed.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42663941;
 //BA.debugLineNum = 42663941;BA.debugLine="For Each name As String In listed";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listed;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=42663942;
 //BA.debugLineNum = 42663942;BA.debugLine="Dim childRelative As String";
_childrelative = "";
RDebugUtils.currentLine=42663943;
 //BA.debugLineNum = 42663943;BA.debugLine="If relativePrefix = \"\" Then";
if ((_relativeprefix).equals("")) { 
RDebugUtils.currentLine=42663944;
 //BA.debugLineNum = 42663944;BA.debugLine="childRelative = name";
_childrelative = _name;
 }else {
RDebugUtils.currentLine=42663946;
 //BA.debugLineNum = 42663946;BA.debugLine="childRelative = File.Combine(relativePrefix, n";
_childrelative = __c.File.Combine(_relativeprefix,_name);
 };
RDebugUtils.currentLine=42663948;
 //BA.debugLineNum = 42663948;BA.debugLine="Dim childPath As String = File.Combine(currentD";
_childpath = __c.File.Combine(_currentdir,_name);
RDebugUtils.currentLine=42663949;
 //BA.debugLineNum = 42663949;BA.debugLine="If File.IsDirectory(currentDir, name) Then";
if (__c.File.IsDirectory(_currentdir,_name)) { 
RDebugUtils.currentLine=42663950;
 //BA.debugLineNum = 42663950;BA.debugLine="ListTrackCacheFilesInto(childPath, childRelati";
__ref._listtrackcachefilesinto /*String*/ (null,_childpath,_childrelative,_result);
 }else {
RDebugUtils.currentLine=42663952;
 //BA.debugLineNum = 42663952;BA.debugLine="result.Add(childRelative)";
_result.Add((Object)(_childrelative));
 };
 }
};
 } 
       catch (Exception e20) {
			ba.setLastException(e20);RDebugUtils.currentLine=42663956;
 //BA.debugLineNum = 42663956;BA.debugLine="Trace(\"Не удалось получить список track cache фа";
__ref._trace /*String*/ (null,"Не удалось получить список track cache файлов. dir="+_currentdir+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=42663958;
 //BA.debugLineNum = 42663958;BA.debugLine="End Sub";
return "";
}
public String  _loadcachestatssnapshot(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadcachestatssnapshot", false))
	 {return ((String) Debug.delegate(ba, "loadcachestatssnapshot", null));}
RDebugUtils.currentLine=43319296;
 //BA.debugLineNum = 43319296;BA.debugLine="Private Sub LoadCacheStatsSnapshot";
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="cachedTrackCount = storage.GetDefault(\"cache_stat";
__ref._cachedtrackcount /*int*/  = (int)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_track_count",(Object)(0))));
RDebugUtils.currentLine=43319298;
 //BA.debugLineNum = 43319298;BA.debugLine="cachedAdCount = storage.GetDefault(\"cache_stats_a";
__ref._cachedadcount /*int*/  = (int)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_ad_count",(Object)(0))));
RDebugUtils.currentLine=43319299;
 //BA.debugLineNum = 43319299;BA.debugLine="cachedTrackBytes = ToLongDefault(storage.GetDefau";
__ref._cachedtrackbytes /*long*/  = __ref._tolongdefault /*long*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_track_bytes",(Object)(0)),(long) (0));
RDebugUtils.currentLine=43319300;
 //BA.debugLineNum = 43319300;BA.debugLine="cachedAdBytes = ToLongDefault(storage.GetDefault(";
__ref._cachedadbytes /*long*/  = __ref._tolongdefault /*long*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_ad_bytes",(Object)(0)),(long) (0));
RDebugUtils.currentLine=43319301;
 //BA.debugLineNum = 43319301;BA.debugLine="cachedTrackPlaylistStats = storage.GetDefault(\"ca";
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cache_stats_track_playlist",__c.Null)));
RDebugUtils.currentLine=43319302;
 //BA.debugLineNum = 43319302;BA.debugLine="If cachedTrackPlaylistStats.IsInitialized = False";
if (__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._cachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=43319303;
 //BA.debugLineNum = 43319303;BA.debugLine="End Sub";
return "";
}
public String  _normalizetrackindexfilenames(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.Map _trackindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "normalizetrackindexfilenames", false))
	 {return ((String) Debug.delegate(ba, "normalizetrackindexfilenames", new Object[] {_trackindex}));}
boolean _changed = false;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
String _canonicalfilename = "";
String _storedfilename = "";
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Private Sub NormalizeTrackIndexFileNames(trackInde";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="If trackIndex.IsInitialized = False Then Return";
if (_trackindex.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
RDebugUtils.currentLine=42074115;
 //BA.debugLineNum = 42074115;BA.debugLine="For Each trackId As String In trackIndex.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _trackindex.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_trackid = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=42074116;
 //BA.debugLineNum = 42074116;BA.debugLine="Dim entry As Map = trackIndex.GetDefault(trackId";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=42074117;
 //BA.debugLineNum = 42074117;BA.debugLine="If entry.IsInitialized = False Then Continue";
if (_entry.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=42074118;
 //BA.debugLineNum = 42074118;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"pla";
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=42074119;
 //BA.debugLineNum = 42074119;BA.debugLine="Dim canonicalFileName As String = BuildTrackCach";
_canonicalfilename = __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_playlistid);
RDebugUtils.currentLine=42074120;
 //BA.debugLineNum = 42074120;BA.debugLine="Dim storedFileName As String = entry.GetDefault(";
_storedfilename = BA.ObjectToString(_entry.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=42074121;
 //BA.debugLineNum = 42074121;BA.debugLine="If storedFileName = canonicalFileName Then Conti";
if ((_storedfilename).equals(_canonicalfilename)) { 
if (true) continue;};
RDebugUtils.currentLine=42074122;
 //BA.debugLineNum = 42074122;BA.debugLine="If IsCachedFileUsable(GetTracksDir, canonicalFil";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_canonicalfilename)) { 
RDebugUtils.currentLine=42074123;
 //BA.debugLineNum = 42074123;BA.debugLine="entry.Put(\"file_name\", canonicalFileName)";
_entry.Put((Object)("file_name"),(Object)(_canonicalfilename));
RDebugUtils.currentLine=42074124;
 //BA.debugLineNum = 42074124;BA.debugLine="entry.Put(\"size_bytes\", GetFileSizeSafe(GetTrac";
_entry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,__ref._gettracksdir /*String*/ (null),_canonicalfilename)));
RDebugUtils.currentLine=42074125;
 //BA.debugLineNum = 42074125;BA.debugLine="trackIndex.Put(trackId, entry)";
_trackindex.Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=42074126;
 //BA.debugLineNum = 42074126;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=42074129;
 //BA.debugLineNum = 42074129;BA.debugLine="If changed Then SaveTrackIndex";
if (_changed) { 
__ref._savetrackindex /*String*/ (null);};
RDebugUtils.currentLine=42074130;
 //BA.debugLineNum = 42074130;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadplaylisttrackidmap(b4j.example.mediacache __ref,String _playlistid,anywheresoftware.b4a.objects.collections.Map _playlisttrackmaps) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "loadplaylisttrackidmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadplaylisttrackidmap", new Object[] {_playlistid,_playlisttrackmaps}));}
anywheresoftware.b4a.objects.collections.Map _emptymap = null;
String _cachekey = "";
anywheresoftware.b4a.objects.collections.Map _result = null;
String _playlistsdir = "";
String _metadatafilename = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Private Sub LoadPlaylistTrackIdMap(playlistId As S";
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="Dim emptyMap As Map";
_emptymap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42270722;
 //BA.debugLineNum = 42270722;BA.debugLine="emptyMap.Initialize";
_emptymap.Initialize();
RDebugUtils.currentLine=42270723;
 //BA.debugLineNum = 42270723;BA.debugLine="If playlistId = \"\" Then Return emptyMap";
if ((_playlistid).equals("")) { 
if (true) return _emptymap;};
RDebugUtils.currentLine=42270724;
 //BA.debugLineNum = 42270724;BA.debugLine="Dim cacheKey As String = \"ids:\" & playlistId";
_cachekey = "ids:"+_playlistid;
RDebugUtils.currentLine=42270725;
 //BA.debugLineNum = 42270725;BA.debugLine="If playlistTrackMaps.ContainsKey(cacheKey) Then R";
if (_playlisttrackmaps.ContainsKey((Object)(_cachekey))) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlisttrackmaps.Get((Object)(_cachekey))));};
RDebugUtils.currentLine=42270726;
 //BA.debugLineNum = 42270726;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42270727;
 //BA.debugLineNum = 42270727;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=42270728;
 //BA.debugLineNum = 42270728;BA.debugLine="Dim playlistsDir As String = File.Combine(storage";
_playlistsdir = __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=42270729;
 //BA.debugLineNum = 42270729;BA.debugLine="Dim metadataFileName As String = playlistId & \".j";
_metadatafilename = _playlistid+".json";
RDebugUtils.currentLine=42270730;
 //BA.debugLineNum = 42270730;BA.debugLine="If File.Exists(playlistsDir, metadataFileName) =";
if (__c.File.Exists(_playlistsdir,_metadatafilename)==__c.False) { 
RDebugUtils.currentLine=42270731;
 //BA.debugLineNum = 42270731;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
_playlisttrackmaps.Put((Object)(_cachekey),(Object)(_result.getObject()));
RDebugUtils.currentLine=42270732;
 //BA.debugLineNum = 42270732;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=42270734;
 //BA.debugLineNum = 42270734;BA.debugLine="Try";
try {RDebugUtils.currentLine=42270735;
 //BA.debugLineNum = 42270735;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=42270736;
 //BA.debugLineNum = 42270736;BA.debugLine="parser.Initialize(File.ReadString(playlistsDir,";
_parser.Initialize(__c.File.ReadString(_playlistsdir,_metadatafilename));
RDebugUtils.currentLine=42270737;
 //BA.debugLineNum = 42270737;BA.debugLine="Dim playlistData As Map = parser.NextObject";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = _parser.NextObject();
RDebugUtils.currentLine=42270738;
 //BA.debugLineNum = 42270738;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tr";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=42270739;
 //BA.debugLineNum = 42270739;BA.debugLine="If tracks.IsInitialized Then";
if (_tracks.IsInitialized()) { 
RDebugUtils.currentLine=42270740;
 //BA.debugLineNum = 42270740;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group20 = _tracks;
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_trackobject = group20.Get(index20);
RDebugUtils.currentLine=42270741;
 //BA.debugLineNum = 42270741;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=42270742;
 //BA.debugLineNum = 42270742;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=42270743;
 //BA.debugLineNum = 42270743;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=42270744;
 //BA.debugLineNum = 42270744;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=42270745;
 //BA.debugLineNum = 42270745;BA.debugLine="result.Put(trackId, True)";
_result.Put((Object)(_trackid),(Object)(__c.True));
 }
};
 };
 } 
       catch (Exception e29) {
			ba.setLastException(e29);RDebugUtils.currentLine=42270749;
 //BA.debugLineNum = 42270749;BA.debugLine="Trace(\"Не удалось восстановить track id map по p";
__ref._trace /*String*/ (null,"Не удалось восстановить track id map по playlist metadata. playlistId="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=42270751;
 //BA.debugLineNum = 42270751;BA.debugLine="playlistTrackMaps.Put(cacheKey, result)";
_playlisttrackmaps.Put((Object)(_cachekey),(Object)(_result.getObject()));
RDebugUtils.currentLine=42270752;
 //BA.debugLineNum = 42270752;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=42270753;
 //BA.debugLineNum = 42270753;BA.debugLine="End Sub";
return null;
}
public long  _mbtobytes(b4j.example.mediacache __ref,long _valuemb) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "mbtobytes", false))
	 {return ((Long) Debug.delegate(ba, "mbtobytes", new Object[] {_valuemb}));}
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Private Sub MbToBytes(valueMb As Long) As Long";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="Return valueMb * 1024 * 1024";
if (true) return (long) (_valuemb*1024*1024);
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="End Sub";
return 0L;
}
public boolean  _movelegacytrackfiletoflat(b4j.example.mediacache __ref,String _sourcerelativename,String _flatfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "movelegacytrackfiletoflat", false))
	 {return ((Boolean) Debug.delegate(ba, "movelegacytrackfiletoflat", new Object[] {_sourcerelativename,_flatfilename}));}
String _sourcedir = "";
String _sourceleaf = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream = null;
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Private Sub MoveLegacyTrackFileToFlat(sourceRelati";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="If sourceRelativeName = \"\" Or flatFileName = \"\" T";
if ((_sourcerelativename).equals("") || (_flatfilename).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="If IsCachedFileUsable(GetTracksDir, sourceRelativ";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_sourcerelativename)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=39714819;
 //BA.debugLineNum = 39714819;BA.debugLine="If IsCachedFileUsable(GetTracksDir, flatFileName)";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_flatfilename)) { 
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="DeleteFileIfExists(GetTracksDir, sourceRelativeN";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_sourcerelativename);
RDebugUtils.currentLine=39714821;
 //BA.debugLineNum = 39714821;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=39714823;
 //BA.debugLineNum = 39714823;BA.debugLine="Dim sourceDir As String = ResolveRelativeParentDi";
_sourcedir = __ref._resolverelativeparentdir /*String*/ (null,__ref._gettracksdir /*String*/ (null),_sourcerelativename);
RDebugUtils.currentLine=39714824;
 //BA.debugLineNum = 39714824;BA.debugLine="Dim sourceLeaf As String = ResolveRelativeLeafNam";
_sourceleaf = __ref._resolverelativeleafname /*String*/ (null,_sourcerelativename);
RDebugUtils.currentLine=39714825;
 //BA.debugLineNum = 39714825;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=39714826;
 //BA.debugLineNum = 39714826;BA.debugLine="Dim outputStream As OutputStream";
_outputstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=39714827;
 //BA.debugLineNum = 39714827;BA.debugLine="Try";
try {RDebugUtils.currentLine=39714828;
 //BA.debugLineNum = 39714828;BA.debugLine="inputStream = File.OpenInput(sourceDir, sourceLe";
_inputstream = __c.File.OpenInput(_sourcedir,_sourceleaf);
RDebugUtils.currentLine=39714829;
 //BA.debugLineNum = 39714829;BA.debugLine="outputStream = File.OpenOutput(GetTracksDir, fla";
_outputstream = __c.File.OpenOutput(__ref._gettracksdir /*String*/ (null),_flatfilename,__c.False);
RDebugUtils.currentLine=39714830;
 //BA.debugLineNum = 39714830;BA.debugLine="File.Copy2(inputStream, outputStream)";
__c.File.Copy2((java.io.InputStream)(_inputstream.getObject()),(java.io.OutputStream)(_outputstream.getObject()));
RDebugUtils.currentLine=39714831;
 //BA.debugLineNum = 39714831;BA.debugLine="outputStream.Close";
_outputstream.Close();
RDebugUtils.currentLine=39714832;
 //BA.debugLineNum = 39714832;BA.debugLine="inputStream.Close";
_inputstream.Close();
RDebugUtils.currentLine=39714833;
 //BA.debugLineNum = 39714833;BA.debugLine="If IsCachedFileUsable(GetTracksDir, flatFileName";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_flatfilename)==__c.False) { 
RDebugUtils.currentLine=39714834;
 //BA.debugLineNum = 39714834;BA.debugLine="DeleteFileIfExists(GetTracksDir, flatFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_flatfilename);
RDebugUtils.currentLine=39714835;
 //BA.debugLineNum = 39714835;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=39714837;
 //BA.debugLineNum = 39714837;BA.debugLine="DeleteFileIfExists(GetTracksDir, sourceRelativeN";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_sourcerelativename);
RDebugUtils.currentLine=39714838;
 //BA.debugLineNum = 39714838;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e24) {
			ba.setLastException(e24);RDebugUtils.currentLine=39714840;
 //BA.debugLineNum = 39714840;BA.debugLine="Try";
try {RDebugUtils.currentLine=39714841;
 //BA.debugLineNum = 39714841;BA.debugLine="If outputStream.IsInitialized Then outputStream";
if (_outputstream.IsInitialized()) { 
_outputstream.Close();};
 } 
       catch (Exception e27) {
			ba.setLastException(e27);RDebugUtils.currentLine=39714843;
 //BA.debugLineNum = 39714843;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("239714843",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=39714845;
 //BA.debugLineNum = 39714845;BA.debugLine="Try";
try {RDebugUtils.currentLine=39714846;
 //BA.debugLineNum = 39714846;BA.debugLine="If inputStream.IsInitialized Then inputStream.C";
if (_inputstream.IsInitialized()) { 
_inputstream.Close();};
 } 
       catch (Exception e32) {
			ba.setLastException(e32);RDebugUtils.currentLine=39714848;
 //BA.debugLineNum = 39714848;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("239714848",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=39714850;
 //BA.debugLineNum = 39714850;BA.debugLine="DeleteFileIfExists(GetTracksDir, flatFileName)";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_flatfilename);
RDebugUtils.currentLine=39714851;
 //BA.debugLineNum = 39714851;BA.debugLine="Trace(\"Не удалось переместить legacy track cache";
__ref._trace /*String*/ (null,"Не удалось переместить legacy track cache файл. source="+_sourcerelativename+", message="+__c.LastException(ba).getMessage());
RDebugUtils.currentLine=39714852;
 //BA.debugLineNum = 39714852;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=39714854;
 //BA.debugLineNum = 39714854;BA.debugLine="End Sub";
return false;
}
public boolean  _preparenextcacheaudittype(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "preparenextcacheaudittype", false))
	 {return ((Boolean) Debug.delegate(ba, "preparenextcacheaudittype", null));}
String _auditdir = "";
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Private Sub PrepareNextCacheAuditType As Boolean";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="If cacheAuditPendingTypes.IsInitialized = False O";
if (__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="cacheAuditCurrentType = cacheAuditPendingTypes.Ge";
__ref._cacheauditcurrenttype /*String*/  = BA.ObjectToString(__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=41222147;
 //BA.debugLineNum = 41222147;BA.debugLine="cacheAuditPendingTypes.RemoveAt(0)";
__ref._cacheauditpendingtypes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=41222148;
 //BA.debugLineNum = 41222148;BA.debugLine="cacheAuditCurrentPosition = 0";
__ref._cacheauditcurrentposition /*int*/  = (int) (0);
RDebugUtils.currentLine=41222149;
 //BA.debugLineNum = 41222149;BA.debugLine="cacheAuditSeenIds.Initialize";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=41222150;
 //BA.debugLineNum = 41222150;BA.debugLine="cacheAuditCurrentFileNames.Initialize";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=41222151;
 //BA.debugLineNum = 41222151;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=41222152;
 //BA.debugLineNum = 41222152;BA.debugLine="Try";
try {RDebugUtils.currentLine=41222153;
 //BA.debugLineNum = 41222153;BA.debugLine="If DirectoryExists(auditDir) Then";
if (__ref._directoryexists /*boolean*/ (null,_auditdir)) { 
RDebugUtils.currentLine=41222154;
 //BA.debugLineNum = 41222154;BA.debugLine="cacheAuditListingDir = auditDir";
__ref._cacheauditlistingdir /*String*/  = _auditdir;
RDebugUtils.currentLine=41222155;
 //BA.debugLineNum = 41222155;BA.debugLine="cacheAuditListingInProgress = True";
__ref._cacheauditlistinginprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=41222156;
 //BA.debugLineNum = 41222156;BA.debugLine="StartCacheAuditFileListingAsync";
__ref._startcacheauditfilelistingasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 };
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=41222159;
 //BA.debugLineNum = 41222159;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
__ref._trace /*String*/ (null,"Не удалось получить список файлов для аудита кэша. type="+__ref._cacheauditcurrenttype /*String*/ +", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=41222161;
 //BA.debugLineNum = 41222161;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=41222162;
 //BA.debugLineNum = 41222162;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _startcacheauditfilelistingasync(b4j.example.mediacache __ref) throws Exception{
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "startcacheauditfilelistingasync", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "startcacheauditfilelistingasync", null));}
ResumableSub_StartCacheAuditFileListingAsync rsub = new ResumableSub_StartCacheAuditFileListingAsync(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StartCacheAuditFileListingAsync extends BA.ResumableSub {
public ResumableSub_StartCacheAuditFileListingAsync(b4j.example.mediacache parent,b4j.example.mediacache __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.mediacache __ref;
b4j.example.mediacache parent;
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
boolean _success = false;
anywheresoftware.b4a.objects.collections.List _files = null;
String _filename = "";
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mediacache";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="Dim listedFiles As List";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="listedFiles.Initialize";
_listedfiles.Initialize();
RDebugUtils.currentLine=41287683;
 //BA.debugLineNum = 41287683;BA.debugLine="Wait For (File.ListFilesAsync(cacheAuditListingDi";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mediacache", "startcacheauditfilelistingasync"), parent.__c.File.ListFilesAsync(ba,__ref._cacheauditlistingdir /*String*/ ));
this.state = 16;
return;
case 16:
//C
this.state = 1;
_success = (boolean) result[1];
_files = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=41287684;
 //BA.debugLineNum = 41287684;BA.debugLine="If success And files.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success && _files.IsInitialized()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=41287685;
 //BA.debugLineNum = 41287685;BA.debugLine="listedFiles = files";
_listedfiles = _files;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=41287687;
 //BA.debugLineNum = 41287687;BA.debugLine="Trace(\"Не удалось получить список файлов для ауд";
__ref._trace /*String*/ (null,"Не удалось получить список файлов для аудита кэша async. type="+__ref._cacheauditcurrenttype /*String*/ +", success="+BA.ObjectToString(_success));
 if (true) break;
;
RDebugUtils.currentLine=41287689;
 //BA.debugLineNum = 41287689;BA.debugLine="If cacheAuditCurrentFileNames.IsInitialized = Fal";

case 6:
//if
this.state = 11;
if (__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==parent.__c.False) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=41287690;
 //BA.debugLineNum = 41287690;BA.debugLine="cacheAuditCurrentFileNames.Clear";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=41287691;
 //BA.debugLineNum = 41287691;BA.debugLine="For Each fileName As String In listedFiles";
if (true) break;

case 12:
//for
this.state = 15;
group11 = _listedfiles;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 15;
if (index11 < groupLen11) {
this.state = 14;
_filename = BA.ObjectToString(group11.Get(index11));}
if (true) break;

case 18:
//C
this.state = 17;
index11++;
if (true) break;

case 14:
//C
this.state = 18;
RDebugUtils.currentLine=41287692;
 //BA.debugLineNum = 41287692;BA.debugLine="cacheAuditCurrentFileNames.Add(fileName)";
__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=41287694;
 //BA.debugLineNum = 41287694;BA.debugLine="cacheAuditListingInProgress = False";
__ref._cacheauditlistinginprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=41287695;
 //BA.debugLineNum = 41287695;BA.debugLine="cacheAuditListingDir = \"\"";
__ref._cacheauditlistingdir /*String*/  = "";
RDebugUtils.currentLine=41287696;
 //BA.debugLineNum = 41287696;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=41287697;
 //BA.debugLineNum = 41287697;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _processcurrentcacheauditbatch(b4j.example.mediacache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "processcurrentcacheauditbatch", false))
	 {return ((String) Debug.delegate(ba, "processcurrentcacheauditbatch", null));}
String _auditdir = "";
anywheresoftware.b4a.objects.collections.Map _auditindex = null;
int _i = 0;
String _filename = "";
String _trackid = "";
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Private Sub ProcessCurrentCacheAuditBatch";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="Dim auditDir As String = GetAuditDirByType(cacheA";
_auditdir = __ref._getauditdirbytype /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="Dim auditIndex As Map = GetAuditIndexByType(cache";
_auditindex = new anywheresoftware.b4a.objects.collections.Map();
_auditindex = __ref._getauditindexbytype /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="For i = 1 To CACHE_AUDIT_BATCH_SIZE";
{
final int step3 = 1;
final int limit3 = __ref._cache_audit_batch_size /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=41353220;
 //BA.debugLineNum = 41353220;BA.debugLine="If cacheAuditCurrentPosition >= cacheAuditCurren";
if (__ref._cacheauditcurrentposition /*int*/ >=__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
if (true) break;};
RDebugUtils.currentLine=41353221;
 //BA.debugLineNum = 41353221;BA.debugLine="Dim fileName As String = cacheAuditCurrentFileNa";
_filename = BA.ObjectToString(__ref._cacheauditcurrentfilenames /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._cacheauditcurrentposition /*int*/ ));
RDebugUtils.currentLine=41353222;
 //BA.debugLineNum = 41353222;BA.debugLine="cacheAuditCurrentPosition = cacheAuditCurrentPos";
__ref._cacheauditcurrentposition /*int*/  = (int) (__ref._cacheauditcurrentposition /*int*/ +1);
RDebugUtils.currentLine=41353223;
 //BA.debugLineNum = 41353223;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=41353224;
 //BA.debugLineNum = 41353224;BA.debugLine="If File.IsDirectory(auditDir, fileName) Then Con";
if (__c.File.IsDirectory(_auditdir,_filename)) { 
if (true) continue;};
RDebugUtils.currentLine=41353225;
 //BA.debugLineNum = 41353225;BA.debugLine="If fileName.EndsWith(\".tmp\") Then";
if (_filename.endsWith(".tmp")) { 
RDebugUtils.currentLine=41353226;
 //BA.debugLineNum = 41353226;BA.debugLine="DeleteFileIfExists(auditDir, fileName)";
__ref._deletefileifexists /*String*/ (null,_auditdir,_filename);
RDebugUtils.currentLine=41353227;
 //BA.debugLineNum = 41353227;BA.debugLine="cacheAuditTempDeletedCount = cacheAuditTempDele";
__ref._cacheaudittempdeletedcount /*int*/  = (int) (__ref._cacheaudittempdeletedcount /*int*/ +1);
RDebugUtils.currentLine=41353228;
 //BA.debugLineNum = 41353228;BA.debugLine="MarkAuditIndexChanged(cacheAuditCurrentType)";
__ref._markauditindexchanged /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ );
RDebugUtils.currentLine=41353229;
 //BA.debugLineNum = 41353229;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=41353231;
 //BA.debugLineNum = 41353231;BA.debugLine="If IsCachedFileUsable(auditDir, fileName) = Fals";
if (__ref._iscachedfileusable /*boolean*/ (null,_auditdir,_filename)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=41353232;
 //BA.debugLineNum = 41353232;BA.debugLine="If cacheAuditCurrentType = \"tracks\" Then";
if ((__ref._cacheauditcurrenttype /*String*/ ).equals("tracks")) { 
RDebugUtils.currentLine=41353233;
 //BA.debugLineNum = 41353233;BA.debugLine="Dim trackId As String = FindTrackIdByFileName(f";
_trackid = __ref._findtrackidbyfilename /*String*/ (null,_filename,_auditindex);
RDebugUtils.currentLine=41353234;
 //BA.debugLineNum = 41353234;BA.debugLine="If trackId = \"\" Then";
if ((_trackid).equals("")) { 
RDebugUtils.currentLine=41353237;
 //BA.debugLineNum = 41353237;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=41353239;
 //BA.debugLineNum = 41353239;BA.debugLine="cacheAuditSeenIds.Put(trackId, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_trackid),(Object)(__c.True));
 }else {
RDebugUtils.currentLine=41353241;
 //BA.debugLineNum = 41353241;BA.debugLine="cacheAuditSeenIds.Put(fileName, True)";
__ref._cacheauditseenids /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_filename),(Object)(__c.True));
RDebugUtils.currentLine=41353242;
 //BA.debugLineNum = 41353242;BA.debugLine="If auditIndex.ContainsKey(fileName) = False The";
if (_auditindex.ContainsKey((Object)(_filename))==__c.False) { 
RDebugUtils.currentLine=41353243;
 //BA.debugLineNum = 41353243;BA.debugLine="AddIndexedFileFromAudit(cacheAuditCurrentType,";
__ref._addindexedfilefromaudit /*String*/ (null,__ref._cacheauditcurrenttype /*String*/ ,_filename,_auditindex);
RDebugUtils.currentLine=41353244;
 //BA.debugLineNum = 41353244;BA.debugLine="cacheAuditAddedCount = cacheAuditAddedCount +";
__ref._cacheauditaddedcount /*int*/  = (int) (__ref._cacheauditaddedcount /*int*/ +1);
 };
 };
 }
};
RDebugUtils.currentLine=41353248;
 //BA.debugLineNum = 41353248;BA.debugLine="End Sub";
return "";
}
public long  _resolveminfreediskbytes(b4j.example.mediacache __ref,long _totalbytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveminfreediskbytes", false))
	 {return ((Long) Debug.delegate(ba, "resolveminfreediskbytes", new Object[] {_totalbytes}));}
long _percentbytes = 0L;
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Private Sub ResolveMinFreeDiskBytes(totalBytes As";
RDebugUtils.currentLine=43581441;
 //BA.debugLineNum = 43581441;BA.debugLine="Dim percentBytes As Long = 0";
_percentbytes = (long) (0);
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="If totalBytes > 0 Then percentBytes = Floor(total";
if (_totalbytes>0) { 
_percentbytes = (long) (__c.Floor(_totalbytes*__ref._min_free_disk_percent /*int*/ /(double)100));};
RDebugUtils.currentLine=43581443;
 //BA.debugLineNum = 43581443;BA.debugLine="Return Max(MbToBytes(MIN_FREE_DISK_MB), percentBy";
if (true) return (long) (__c.Max(__ref._mbtobytes /*long*/ (null,__ref._min_free_disk_mb /*long*/ ),_percentbytes));
RDebugUtils.currentLine=43581444;
 //BA.debugLineNum = 43581444;BA.debugLine="End Sub";
return 0L;
}
public String  _sorttrackprunecandidates(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _candidates) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "sorttrackprunecandidates", false))
	 {return ((String) Debug.delegate(ba, "sorttrackprunecandidates", new Object[] {_candidates}));}
int _i = 0;
int _j = 0;
anywheresoftware.b4a.objects.collections.Map _leftitem = null;
anywheresoftware.b4a.objects.collections.Map _rightitem = null;
RDebugUtils.currentLine=42795008;
 //BA.debugLineNum = 42795008;BA.debugLine="Private Sub SortTrackPruneCandidates(candidates As";
RDebugUtils.currentLine=42795009;
 //BA.debugLineNum = 42795009;BA.debugLine="If candidates.IsInitialized = False Or candidates";
if (_candidates.IsInitialized()==__c.False || _candidates.getSize()<2) { 
if (true) return "";};
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="For i = 0 To candidates.Size - 2";
{
final int step2 = 1;
final int limit2 = (int) (_candidates.getSize()-2);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=42795011;
 //BA.debugLineNum = 42795011;BA.debugLine="For j = i + 1 To candidates.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_candidates.getSize()-1);
_j = (int) (_i+1) ;
for (;_j <= limit3 ;_j = _j + step3 ) {
RDebugUtils.currentLine=42795012;
 //BA.debugLineNum = 42795012;BA.debugLine="Dim leftItem As Map = candidates.Get(i)";
_leftitem = new anywheresoftware.b4a.objects.collections.Map();
_leftitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidates.Get(_i)));
RDebugUtils.currentLine=42795013;
 //BA.debugLineNum = 42795013;BA.debugLine="Dim rightItem As Map = candidates.Get(j)";
_rightitem = new anywheresoftware.b4a.objects.collections.Map();
_rightitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidates.Get(_j)));
RDebugUtils.currentLine=42795014;
 //BA.debugLineNum = 42795014;BA.debugLine="If CompareTrackPruneCandidates(leftItem, rightI";
if (__ref._comparetrackprunecandidates /*int*/ (null,_leftitem,_rightitem)>0) { 
RDebugUtils.currentLine=42795015;
 //BA.debugLineNum = 42795015;BA.debugLine="candidates.Set(i, rightItem)";
_candidates.Set(_i,(Object)(_rightitem.getObject()));
RDebugUtils.currentLine=42795016;
 //BA.debugLineNum = 42795016;BA.debugLine="candidates.Set(j, leftItem)";
_candidates.Set(_j,(Object)(_leftitem.getObject()));
 };
 }
};
 }
};
RDebugUtils.currentLine=42795020;
 //BA.debugLineNum = 42795020;BA.debugLine="End Sub";
return "";
}
public int  _prunetrackcandidates(b4j.example.mediacache __ref,anywheresoftware.b4a.objects.collections.List _candidates,long _initialcachebytes,long _initialfreebytes,long _targetbytes,long _minfreebytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "prunetrackcandidates", false))
	 {return ((Integer) Debug.delegate(ba, "prunetrackcandidates", new Object[] {_candidates,_initialcachebytes,_initialfreebytes,_targetbytes,_minfreebytes}));}
int _removedcount = 0;
long _cachebytes = 0L;
long _freebytes = 0L;
Object _candidateobject = null;
anywheresoftware.b4a.objects.collections.Map _candidate = null;
String _trackid = "";
String _filename = "";
long _filebytes = 0L;
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Private Sub PruneTrackCandidates(candidates As Lis";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="Dim removedCount As Int = 0";
_removedcount = (int) (0);
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="Dim cacheBytes As Long = initialCacheBytes";
_cachebytes = _initialcachebytes;
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="Dim freeBytes As Long = initialFreeBytes";
_freebytes = _initialfreebytes;
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="For Each candidateObject As Object In candidates";
{
final anywheresoftware.b4a.BA.IterableList group4 = _candidates;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_candidateobject = group4.Get(index4);
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="If cacheBytes <= targetBytes And (freeBytes <= 0";
if (_cachebytes<=_targetbytes && (_freebytes<=0 || _freebytes>=_minfreebytes)) { 
if (true) break;};
RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="If (candidateObject Is Map) = False Then Continu";
if ((_candidateobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="Dim candidate As Map = candidateObject";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
_candidate = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_candidateobject));
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="Dim trackId As String = candidate.GetDefault(\"id";
_trackid = BA.ObjectToString(_candidate.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=37945353;
 //BA.debugLineNum = 37945353;BA.debugLine="Dim fileName As String = candidate.GetDefault(\"f";
_filename = BA.ObjectToString(_candidate.GetDefault((Object)("file_name"),(Object)("")));
RDebugUtils.currentLine=37945354;
 //BA.debugLineNum = 37945354;BA.debugLine="Dim fileBytes As Long = candidate.GetDefault(\"si";
_filebytes = BA.ObjectToLongNumber(_candidate.GetDefault((Object)("size_bytes"),(Object)(0)));
RDebugUtils.currentLine=37945355;
 //BA.debugLineNum = 37945355;BA.debugLine="If trackId = \"\" Or fileName = \"\" Then Continue";
if ((_trackid).equals("") || (_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=37945356;
 //BA.debugLineNum = 37945356;BA.debugLine="DeleteFileIfExists(GetTracksDir, fileName)";
__ref._deletefileifexists /*String*/ (null,__ref._gettracksdir /*String*/ (null),_filename);
RDebugUtils.currentLine=37945357;
 //BA.debugLineNum = 37945357;BA.debugLine="CleanupEmptyTrackPlaylistDir(fileName)";
__ref._cleanupemptytrackplaylistdir /*String*/ (null,_filename);
RDebugUtils.currentLine=37945358;
 //BA.debugLineNum = 37945358;BA.debugLine="cachedTrackIndex.Remove(trackId)";
__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_trackid));
RDebugUtils.currentLine=37945359;
 //BA.debugLineNum = 37945359;BA.debugLine="cacheBytes = Max(0, cacheBytes - fileBytes)";
_cachebytes = (long) (__c.Max(0,_cachebytes-_filebytes));
RDebugUtils.currentLine=37945360;
 //BA.debugLineNum = 37945360;BA.debugLine="freeBytes = GetDriveUsableSpace(storageDir)";
_freebytes = __ref._getdriveusablespace /*long*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=37945361;
 //BA.debugLineNum = 37945361;BA.debugLine="removedCount = removedCount + 1";
_removedcount = (int) (_removedcount+1);
RDebugUtils.currentLine=37945362;
 //BA.debugLineNum = 37945362;BA.debugLine="Trace(\"Удален cached track при очистке кэша. id=";
__ref._trace /*String*/ (null,"Удален cached track при очистке кэша. id="+_trackid+", sizeMb="+BA.NumberToString(__ref._bytestomb /*long*/ (null,_filebytes)));
 }
};
RDebugUtils.currentLine=37945364;
 //BA.debugLineNum = 37945364;BA.debugLine="pruneLastCacheBytes = cacheBytes";
__ref._prunelastcachebytes /*long*/  = _cachebytes;
RDebugUtils.currentLine=37945365;
 //BA.debugLineNum = 37945365;BA.debugLine="pruneLastFreeBytes = freeBytes";
__ref._prunelastfreebytes /*long*/  = _freebytes;
RDebugUtils.currentLine=37945366;
 //BA.debugLineNum = 37945366;BA.debugLine="Return removedCount";
if (true) return _removedcount;
RDebugUtils.currentLine=37945367;
 //BA.debugLineNum = 37945367;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _resolveanycachedtrackfromindex(b4j.example.mediacache __ref,String _playlistid,String _currenttrackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveanycachedtrackfromindex", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolveanycachedtrackfromindex", new Object[] {_playlistid,_currenttrackid}));}
anywheresoftware.b4a.objects.collections.Map _emptytrack = null;
anywheresoftware.b4a.objects.collections.Map _selectedtrack = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _entryplaylistid = "";
String _filename = "";
anywheresoftware.b4a.objects.collections.Map _copiedtrack = null;
Object _key = null;
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Public Sub ResolveAnyCachedTrackFromIndex(playlist";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="Dim emptyTrack As Map";
_emptytrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="emptyTrack.Initialize";
_emptytrack.Initialize();
RDebugUtils.currentLine=38535171;
 //BA.debugLineNum = 38535171;BA.debugLine="EnsureTrackCacheReady";
__ref._ensuretrackcacheready /*String*/ (null);
RDebugUtils.currentLine=38535172;
 //BA.debugLineNum = 38535172;BA.debugLine="If cachedTrackIndex.IsInitialized = False Then Re";
if (__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=38535173;
 //BA.debugLineNum = 38535173;BA.debugLine="Dim selectedTrack As Map";
_selectedtrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38535174;
 //BA.debugLineNum = 38535174;BA.debugLine="selectedTrack.Initialize";
_selectedtrack.Initialize();
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="For Each trackId As String In cachedTrackIndex.Ke";
{
final anywheresoftware.b4a.BA.IterableList group7 = __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_trackid = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=38535176;
 //BA.debugLineNum = 38535176;BA.debugLine="If currentTrackId <> \"\" And cachedTrackIndex.Siz";
if ((_currenttrackid).equals("") == false && __ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>1 && (_trackid).equals(_currenttrackid)) { 
if (true) continue;};
RDebugUtils.currentLine=38535177;
 //BA.debugLineNum = 38535177;BA.debugLine="Dim entry As Map = cachedTrackIndex.GetDefault(t";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=38535178;
 //BA.debugLineNum = 38535178;BA.debugLine="If entry.IsInitialized = False Then Continue";
if (_entry.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=38535179;
 //BA.debugLineNum = 38535179;BA.debugLine="Dim entryPlaylistId As String = entry.GetDefault";
_entryplaylistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=38535180;
 //BA.debugLineNum = 38535180;BA.debugLine="If playlistId <> \"\" And entryPlaylistId <> playl";
if ((_playlistid).equals("") == false && (_entryplaylistid).equals(_playlistid) == false) { 
if (true) continue;};
RDebugUtils.currentLine=38535181;
 //BA.debugLineNum = 38535181;BA.debugLine="Dim fileName As String = ResolveTrackCacheFileNa";
_filename = __ref._resolvetrackcachefilename /*String*/ (null,_trackid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=38535182;
 //BA.debugLineNum = 38535182;BA.debugLine="If IsCachedFileUsable(GetTracksDir, fileName) =";
if (__ref._iscachedfileusable /*boolean*/ (null,__ref._gettracksdir /*String*/ (null),_filename)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=38535183;
 //BA.debugLineNum = 38535183;BA.debugLine="Dim copiedTrack As Map";
_copiedtrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38535184;
 //BA.debugLineNum = 38535184;BA.debugLine="copiedTrack.Initialize";
_copiedtrack.Initialize();
RDebugUtils.currentLine=38535185;
 //BA.debugLineNum = 38535185;BA.debugLine="For Each key As Object In entry.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _entry.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_key = group17.Get(index17);
RDebugUtils.currentLine=38535186;
 //BA.debugLineNum = 38535186;BA.debugLine="copiedTrack.Put(key, entry.Get(key))";
_copiedtrack.Put(_key,_entry.Get(_key));
 }
};
RDebugUtils.currentLine=38535188;
 //BA.debugLineNum = 38535188;BA.debugLine="selectedTrack = copiedTrack";
_selectedtrack = _copiedtrack;
RDebugUtils.currentLine=38535189;
 //BA.debugLineNum = 38535189;BA.debugLine="If selectedTrack.GetDefault(\"id\", \"\") = \"\" Then";
if ((_selectedtrack.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
_selectedtrack.Put((Object)("id"),(Object)(_trackid));};
RDebugUtils.currentLine=38535190;
 //BA.debugLineNum = 38535190;BA.debugLine="If selectedTrack.GetDefault(\"playlist_id\", \"\") =";
if ((_selectedtrack.GetDefault((Object)("playlist_id"),(Object)(""))).equals((Object)(""))) { 
_selectedtrack.Put((Object)("playlist_id"),(Object)(_entryplaylistid));};
RDebugUtils.currentLine=38535191;
 //BA.debugLineNum = 38535191;BA.debugLine="If selectedTrack.GetDefault(\"playlist_title\", \"\"";
if ((_selectedtrack.GetDefault((Object)("playlist_title"),(Object)(""))).equals((Object)(""))) { 
_selectedtrack.Put((Object)("playlist_title"),_entry.GetDefault((Object)("title"),(Object)("")));};
RDebugUtils.currentLine=38535192;
 //BA.debugLineNum = 38535192;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=38535194;
 //BA.debugLineNum = 38535194;BA.debugLine="If selectedTrack.IsInitialized And selectedTrack.";
if (_selectedtrack.IsInitialized() && _selectedtrack.getSize()>0) { 
if (true) return _selectedtrack;};
RDebugUtils.currentLine=38535195;
 //BA.debugLineNum = 38535195;BA.debugLine="Return emptyTrack";
if (true) return _emptytrack;
RDebugUtils.currentLine=38535196;
 //BA.debugLineNum = 38535196;BA.debugLine="End Sub";
return null;
}
public String  _resolveindexedfilename(b4j.example.mediacache __ref,String _itemtype,String _itemid,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolveindexedfilename", false))
	 {return ((String) Debug.delegate(ba, "resolveindexedfilename", new Object[] {_itemtype,_itemid,_itemindex}));}
RDebugUtils.currentLine=40828928;
 //BA.debugLineNum = 40828928;BA.debugLine="Private Sub ResolveIndexedFileName(itemType As Str";
RDebugUtils.currentLine=40828929;
 //BA.debugLineNum = 40828929;BA.debugLine="If itemType = \"ad\" Then Return itemId";
if ((_itemtype).equals("ad")) { 
if (true) return _itemid;};
RDebugUtils.currentLine=40828930;
 //BA.debugLineNum = 40828930;BA.debugLine="Return ResolveTrackCacheFileName(itemId, itemInde";
if (true) return __ref._resolvetrackcachefilename /*String*/ (null,_itemid,_itemindex);
RDebugUtils.currentLine=40828931;
 //BA.debugLineNum = 40828931;BA.debugLine="End Sub";
return "";
}
public String  _resolverelativefileuri(b4j.example.mediacache __ref,String _basedir,String _relativefilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "resolverelativefileuri", false))
	 {return ((String) Debug.delegate(ba, "resolverelativefileuri", new Object[] {_basedir,_relativefilename}));}
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Private Sub ResolveRelativeFileUri(baseDir As Stri";
RDebugUtils.currentLine=43188225;
 //BA.debugLineNum = 43188225;BA.debugLine="Return File.GetUri(ResolveRelativeParentDir(baseD";
if (true) return __c.File.GetUri(__ref._resolverelativeparentdir /*String*/ (null,_basedir,_relativefilename),__ref._resolverelativeleafname /*String*/ (null,_relativefilename));
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="End Sub";
return "";
}
public String  _restoreindexedfilebyid(b4j.example.mediacache __ref,String _itemid,anywheresoftware.b4a.objects.collections.Map _itemindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "restoreindexedfilebyid", false))
	 {return ((String) Debug.delegate(ba, "restoreindexedfilebyid", new Object[] {_itemid,_itemindex}));}
anywheresoftware.b4a.objects.collections.Map _entry = null;
String _playlistid = "";
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Private Sub RestoreIndexedFileById(itemId As Strin";
RDebugUtils.currentLine=40501249;
 //BA.debugLineNum = 40501249;BA.debugLine="Dim entry As Map = itemIndex.GetDefault(itemId, N";
_entry = new anywheresoftware.b4a.objects.collections.Map();
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemindex.GetDefault((Object)(_itemid),__c.Null)));
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="If entry.IsInitialized = False Then entry.Initial";
if (_entry.IsInitialized()==__c.False) { 
_entry.Initialize();};
RDebugUtils.currentLine=40501251;
 //BA.debugLineNum = 40501251;BA.debugLine="entry.Put(\"id\", itemId)";
_entry.Put((Object)("id"),(Object)(_itemid));
RDebugUtils.currentLine=40501252;
 //BA.debugLineNum = 40501252;BA.debugLine="Dim playlistId As String = entry.GetDefault(\"play";
_playlistid = BA.ObjectToString(_entry.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=40501253;
 //BA.debugLineNum = 40501253;BA.debugLine="entry.Put(\"file_name\", BuildTrackCacheRelativeFil";
_entry.Put((Object)("file_name"),(Object)(__ref._buildtrackcacherelativefilename /*String*/ (null,_itemid,_playlistid)));
RDebugUtils.currentLine=40501254;
 //BA.debugLineNum = 40501254;BA.debugLine="If entry.ContainsKey(\"saved_at\") = False Then ent";
if (_entry.ContainsKey((Object)("saved_at"))==__c.False) { 
_entry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=40501255;
 //BA.debugLineNum = 40501255;BA.debugLine="entry.Put(\"last_used_at\", DateTime.Now)";
_entry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=40501256;
 //BA.debugLineNum = 40501256;BA.debugLine="itemIndex.Put(itemId, entry)";
_itemindex.Put((Object)(_itemid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=40501257;
 //BA.debugLineNum = 40501257;BA.debugLine="End Sub";
return "";
}
public String  _saveindexbyitemtype(b4j.example.mediacache __ref,String _itemtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "saveindexbyitemtype", false))
	 {return ((String) Debug.delegate(ba, "saveindexbyitemtype", new Object[] {_itemtype}));}
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Private Sub SaveIndexByItemType(itemType As String";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="SaveAdIndex";
__ref._saveadindex /*String*/ (null);
 }else {
RDebugUtils.currentLine=40763396;
 //BA.debugLineNum = 40763396;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
 };
RDebugUtils.currentLine=40763398;
 //BA.debugLineNum = 40763398;BA.debugLine="End Sub";
return "";
}
public boolean  _tryhealtrackindexentry(b4j.example.mediacache __ref,String _trackid,anywheresoftware.b4a.objects.collections.Map _trackindex,String _trackdir,String _currentfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="mediacache";
if (Debug.shouldDelegate(ba, "tryhealtrackindexentry", false))
	 {return ((Boolean) Debug.delegate(ba, "tryhealtrackindexentry", new Object[] {_trackid,_trackindex,_trackdir,_currentfilename}));}
String _expectedplaylistid = "";
anywheresoftware.b4a.objects.collections.Map _existingentry = null;
String _expectedfilename = "";
String _healedfilename = "";
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Private Sub TryHealTrackIndexEntry(trackId As Stri";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="If trackId = \"\" Then Return False";
if ((_trackid).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="If IsCachedFileUsable(trackDir, currentFileName)";
if (__ref._iscachedfileusable /*boolean*/ (null,_trackdir,_currentfilename)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=40435715;
 //BA.debugLineNum = 40435715;BA.debugLine="Dim expectedPlaylistId As String = \"\"";
_expectedplaylistid = "";
RDebugUtils.currentLine=40435716;
 //BA.debugLineNum = 40435716;BA.debugLine="Dim existingEntry As Map = trackIndex.GetDefault(";
_existingentry = new anywheresoftware.b4a.objects.collections.Map();
_existingentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackindex.GetDefault((Object)(_trackid),__c.Null)));
RDebugUtils.currentLine=40435717;
 //BA.debugLineNum = 40435717;BA.debugLine="If existingEntry.IsInitialized Then expectedPlayl";
if (_existingentry.IsInitialized()) { 
_expectedplaylistid = BA.ObjectToString(_existingentry.GetDefault((Object)("playlist_id"),(Object)("")));};
RDebugUtils.currentLine=40435718;
 //BA.debugLineNum = 40435718;BA.debugLine="Dim expectedFileName As String = BuildTrackCacheR";
_expectedfilename = __ref._buildtrackcacherelativefilename /*String*/ (null,_trackid,_expectedplaylistid);
RDebugUtils.currentLine=40435719;
 //BA.debugLineNum = 40435719;BA.debugLine="If expectedFileName <> \"\" And expectedFileName <>";
if ((_expectedfilename).equals("") == false && (_expectedfilename).equals(_currentfilename) == false) { 
RDebugUtils.currentLine=40435720;
 //BA.debugLineNum = 40435720;BA.debugLine="If IsCachedFileUsable(trackDir, expectedFileName";
if (__ref._iscachedfileusable /*boolean*/ (null,_trackdir,_expectedfilename)) { 
RDebugUtils.currentLine=40435721;
 //BA.debugLineNum = 40435721;BA.debugLine="If existingEntry.IsInitialized = False Then exi";
if (_existingentry.IsInitialized()==__c.False) { 
_existingentry.Initialize();};
RDebugUtils.currentLine=40435722;
 //BA.debugLineNum = 40435722;BA.debugLine="existingEntry.Put(\"id\", trackId)";
_existingentry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=40435723;
 //BA.debugLineNum = 40435723;BA.debugLine="existingEntry.Put(\"playlist_id\", expectedPlayli";
_existingentry.Put((Object)("playlist_id"),(Object)(_expectedplaylistid));
RDebugUtils.currentLine=40435724;
 //BA.debugLineNum = 40435724;BA.debugLine="existingEntry.Put(\"file_name\", expectedFileName";
_existingentry.Put((Object)("file_name"),(Object)(_expectedfilename));
RDebugUtils.currentLine=40435725;
 //BA.debugLineNum = 40435725;BA.debugLine="existingEntry.Put(\"size_bytes\", GetFileSizeSafe";
_existingentry.Put((Object)("size_bytes"),(Object)(__ref._getfilesizesafe /*long*/ (null,_trackdir,_expectedfilename)));
RDebugUtils.currentLine=40435726;
 //BA.debugLineNum = 40435726;BA.debugLine="If existingEntry.ContainsKey(\"saved_at\") = Fals";
if (_existingentry.ContainsKey((Object)("saved_at"))==__c.False) { 
_existingentry.Put((Object)("saved_at"),(Object)(__c.DateTime.getNow()));};
RDebugUtils.currentLine=40435727;
 //BA.debugLineNum = 40435727;BA.debugLine="existingEntry.Put(\"last_used_at\", DateTime.Now)";
_existingentry.Put((Object)("last_used_at"),(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=40435728;
 //BA.debugLineNum = 40435728;BA.debugLine="trackIndex.Put(trackId, existingEntry)";
_trackindex.Put((Object)(_trackid),(Object)(_existingentry.getObject()));
RDebugUtils.currentLine=40435729;
 //BA.debugLineNum = 40435729;BA.debugLine="cachedTrackIndexDirty = True";
__ref._cachedtrackindexdirty /*boolean*/  = __c.True;
RDebugUtils.currentLine=40435730;
 //BA.debugLineNum = 40435730;BA.debugLine="SaveTrackIndex";
__ref._savetrackindex /*String*/ (null);
RDebugUtils.currentLine=40435731;
 //BA.debugLineNum = 40435731;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=40435734;
 //BA.debugLineNum = 40435734;BA.debugLine="BackfillTrackIndexFromFiles";
__ref._backfilltrackindexfromfiles /*String*/ (null);
RDebugUtils.currentLine=40435735;
 //BA.debugLineNum = 40435735;BA.debugLine="Dim healedFileName As String = ResolveTrackCacheF";
_healedfilename = __ref._resolvetrackcachefilename /*String*/ (null,_trackid,__ref._cachedtrackindex /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=40435736;
 //BA.debugLineNum = 40435736;BA.debugLine="If IsCachedFileUsable(trackDir, healedFileName) T";
if (__ref._iscachedfileusable /*boolean*/ (null,_trackdir,_healedfilename)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=40435737;
 //BA.debugLineNum = 40435737;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=40435738;
 //BA.debugLineNum = 40435738;BA.debugLine="End Sub";
return false;
}
}