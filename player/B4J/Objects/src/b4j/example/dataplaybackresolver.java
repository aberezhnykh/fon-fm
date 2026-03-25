package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class dataplaybackresolver extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.dataplaybackresolver", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.dataplaybackresolver.class).invoke(this, new Object[] {null});
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
public Object _targetmodule = null;
public String _tracesubname = "";
public anywheresoftware.b4a.objects.collections.Map _playlistcursors = null;
public b4j.example.keyvaluestore _storageref = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _commitplaylistcursor(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "commitplaylistcursor", false))
	 {return ((String) Debug.delegate(ba, "commitplaylistcursor", new Object[] {_storage,_item}));}
String _slotkey = "";
String _playlistid = "";
int _playlisttrackindex = 0;
int _storedcursor = 0;
int _playlistindex = 0;
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Public Sub CommitPlaylistCursor(storage As KeyValu";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return "";};
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_key";
_slotkey = BA.ObjectToString(_item.GetDefault((Object)("slot_key"),(Object)("")));
RDebugUtils.currentLine=30867460;
 //BA.debugLineNum = 30867460;BA.debugLine="Dim playlistId As String = item.GetDefault(\"playl";
_playlistid = BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=30867461;
 //BA.debugLineNum = 30867461;BA.debugLine="Dim playlistTrackIndex As Int = item.GetDefault(\"";
_playlisttrackindex = (int)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_track_index"),(Object)(-1))));
RDebugUtils.currentLine=30867462;
 //BA.debugLineNum = 30867462;BA.debugLine="If playlistId <> \"\" And playlistTrackIndex >= 0 T";
if ((_playlistid).equals("") == false && _playlisttrackindex>=0) { 
RDebugUtils.currentLine=30867463;
 //BA.debugLineNum = 30867463;BA.debugLine="Dim storedCursor As Int = item.GetDefault(\"playl";
_storedcursor = (int)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_cursor"),(Object)(_playlisttrackindex+1))));
RDebugUtils.currentLine=30867464;
 //BA.debugLineNum = 30867464;BA.debugLine="storage.Put(PlaylistTrackIndexKey(playlistId), p";
_storage._put /*String*/ (null,__ref._playlisttrackindexkey /*String*/ (null,_playlistid),(Object)(_playlisttrackindex));
RDebugUtils.currentLine=30867465;
 //BA.debugLineNum = 30867465;BA.debugLine="storage.Put(PlaylistPlaybackCursorKey(playlistId";
_storage._put /*String*/ (null,__ref._playlistplaybackcursorkey /*String*/ (null,_playlistid),(Object)(_storedcursor));
RDebugUtils.currentLine=30867466;
 //BA.debugLineNum = 30867466;BA.debugLine="Trace(\"playlist commit track playlistId=\" & play";
__ref._trace /*String*/ (null,"playlist commit track playlistId="+_playlistid+" trackIndex="+BA.NumberToString(_playlisttrackindex)+" cursor="+BA.NumberToString(_storedcursor)+" trackId="+BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))));
 };
RDebugUtils.currentLine=30867468;
 //BA.debugLineNum = 30867468;BA.debugLine="If slotKey = \"\" Then Return";
if ((_slotkey).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=30867469;
 //BA.debugLineNum = 30867469;BA.debugLine="Dim playlistIndex As Int = item.GetDefault(\"playl";
_playlistindex = (int)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_index"),(Object)(-1))));
RDebugUtils.currentLine=30867470;
 //BA.debugLineNum = 30867470;BA.debugLine="If playlistIndex < 0 Then Return";
if (_playlistindex<0) { 
if (true) return "";};
RDebugUtils.currentLine=30867471;
 //BA.debugLineNum = 30867471;BA.debugLine="playlistCursors.Put(slotKey, playlistIndex + 1)";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_slotkey),(Object)(_playlistindex+1));
RDebugUtils.currentLine=30867472;
 //BA.debugLineNum = 30867472;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ (null,"data_slot_playlist_cursors",(Object)(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=30867473;
 //BA.debugLineNum = 30867473;BA.debugLine="Trace(\"playlist commit slot slotKey=\" & slotKey &";
__ref._trace /*String*/ (null,"playlist commit slot slotKey="+_slotkey+" playlistIndex="+BA.NumberToString(_playlistindex)+" nextPlaylistCursor="+BA.NumberToString((_playlistindex+1)));
RDebugUtils.currentLine=30867474;
 //BA.debugLineNum = 30867474;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadcachedplaylistmetadata(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "loadcachedplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadcachedplaylistmetadata", new Object[] {_playlistid}));}
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _parseddata = null;
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="Dim playlistData As Map";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=30081027;
 //BA.debugLineNum = 30081027;BA.debugLine="If playlistId = \"\" Then Return playlistData";
if ((_playlistid).equals("")) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=30081028;
 //BA.debugLineNum = 30081028;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistMe";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=30081029;
 //BA.debugLineNum = 30081029;BA.debugLine="Try";
try {RDebugUtils.currentLine=30081030;
 //BA.debugLineNum = 30081030;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=30081031;
 //BA.debugLineNum = 30081031;BA.debugLine="parser.Initialize(File.ReadString(GetOfflinePlay";
_parser.Initialize(__c.File.ReadString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid)));
RDebugUtils.currentLine=30081032;
 //BA.debugLineNum = 30081032;BA.debugLine="Dim parsedData As Map = parser.NextObject";
_parseddata = new anywheresoftware.b4a.objects.collections.Map();
_parseddata = _parser.NextObject();
RDebugUtils.currentLine=30081033;
 //BA.debugLineNum = 30081033;BA.debugLine="If parsedData.IsInitialized Then playlistData =";
if (_parseddata.IsInitialized()) { 
_playlistdata = _parseddata;};
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=30081035;
 //BA.debugLineNum = 30081035;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=30081036;
 //BA.debugLineNum = 30081036;BA.debugLine="Trace(\"Не удалось загрузить playlist metadata из";
__ref._trace /*String*/ (null,"Не удалось загрузить playlist metadata из кэша. id="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=30081038;
 //BA.debugLineNum = 30081038;BA.debugLine="Return playlistData";
if (true) return _playlistdata;
RDebugUtils.currentLine=30081039;
 //BA.debugLineNum = 30081039;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,Object _targetmodulevalue,String _tracesubnamevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_targetmodulevalue,_tracesubnamevalue}));}
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Public Sub Initialize(storageDirValue As String, t";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="playlistCursors.Initialize";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=29491205;
 //BA.debugLineNum = 29491205;BA.debugLine="End Sub";
return "";
}
public String  _loadstate(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "loadstate", false))
	 {return ((String) Debug.delegate(ba, "loadstate", new Object[] {_storage}));}
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Public Sub LoadState(storage As KeyValueStore)";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="storageRef = storage";
__ref._storageref /*b4j.example.keyvaluestore*/  = _storage;
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="playlistCursors = storage.GetDefault(\"data_slot_p";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ (null,"data_slot_playlist_cursors",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=29556739;
 //BA.debugLineNum = 29556739;BA.debugLine="If playlistCursors.IsInitialized = False Then pla";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=29556740;
 //BA.debugLineNum = 29556740;BA.debugLine="End Sub";
return "";
}
public int  _cursorcount(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cursorcount", false))
	 {return ((Integer) Debug.delegate(ba, "cursorcount", null));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Public Sub CursorCount As Int";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="If playlistCursors.IsInitialized = False Then Ret";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="Return playlistCursors.Size";
if (true) return __ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getupcomingplaybacktracksbyid(b4j.example.dataplaybackresolver __ref,String _playlistid,int _limitcount,b4j.example.mediacache _mediacacheservice,boolean _includecached) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "getupcomingplaybacktracksbyid", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getupcomingplaybacktracksbyid", new Object[] {_playlistid,_limitcount,_mediacacheservice,_includecached}));}
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _manifest = null;
String _playlisttitle = "";
anywheresoftware.b4a.objects.collections.List _order = null;
anywheresoftware.b4a.objects.collections.Map _trackmap = null;
String _cursorkey = "";
int _storedcursor = 0;
String _trackindexkey = "";
int _storedtrackindexvalue = 0;
int _storedtrackindex = 0;
int _startindex = 0;
int _offset = 0;
int _orderindex = 0;
String _trackid = "";
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
RDebugUtils.currentLine=84017152;
 //BA.debugLineNum = 84017152;BA.debugLine="Public Sub GetUpcomingPlaybackTracksById(playlistI";
RDebugUtils.currentLine=84017153;
 //BA.debugLineNum = 84017153;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=84017154;
 //BA.debugLineNum = 84017154;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=84017155;
 //BA.debugLineNum = 84017155;BA.debugLine="If storageRef.IsInitialized = False Then Return r";
if (__ref._storageref /*b4j.example.keyvaluestore*/ .IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=84017156;
 //BA.debugLineNum = 84017156;BA.debugLine="If playlistId = \"\" Or limitCount <= 0 Then Return";
if ((_playlistid).equals("") || _limitcount<=0) { 
if (true) return _result;};
RDebugUtils.currentLine=84017157;
 //BA.debugLineNum = 84017157;BA.debugLine="Dim manifest As Map = LoadOrBuildPlaylistPlayback";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadorbuildplaylistplaybackmanifestbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=84017158;
 //BA.debugLineNum = 84017158;BA.debugLine="If manifest.IsInitialized = False Or manifest.Siz";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) return _result;};
RDebugUtils.currentLine=84017159;
 //BA.debugLineNum = 84017159;BA.debugLine="Dim playlistTitle As String = manifest.GetDefault";
_playlisttitle = BA.ObjectToString(_manifest.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=84017160;
 //BA.debugLineNum = 84017160;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=84017161;
 //BA.debugLineNum = 84017161;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
if (_order.IsInitialized()==__c.False || _order.getSize()==0) { 
if (true) return _result;};
RDebugUtils.currentLine=84017162;
 //BA.debugLineNum = 84017162;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
_trackmap = new anywheresoftware.b4a.objects.collections.Map();
_trackmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifest.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=84017163;
 //BA.debugLineNum = 84017163;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
if (_trackmap.IsInitialized()==__c.False || _trackmap.getSize()==0) { 
if (true) return _result;};
RDebugUtils.currentLine=84017165;
 //BA.debugLineNum = 84017165;BA.debugLine="Dim cursorKey As String = PlaylistPlaybackCursorK";
_cursorkey = __ref._playlistplaybackcursorkey /*String*/ (null,_playlistid);
RDebugUtils.currentLine=84017166;
 //BA.debugLineNum = 84017166;BA.debugLine="Dim storedCursor As Int = storageRef.GetDefault(c";
_storedcursor = (int)(BA.ObjectToNumber(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,_cursorkey,(Object)(-1))));
RDebugUtils.currentLine=84017167;
 //BA.debugLineNum = 84017167;BA.debugLine="Dim trackIndexKey As String = PlaylistTrackIndexK";
_trackindexkey = __ref._playlisttrackindexkey /*String*/ (null,_playlistid);
RDebugUtils.currentLine=84017168;
 //BA.debugLineNum = 84017168;BA.debugLine="Dim storedTrackIndexValue As Int = storageRef.Get";
_storedtrackindexvalue = (int)(BA.ObjectToNumber(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,_trackindexkey,(Object)(-1))));
RDebugUtils.currentLine=84017169;
 //BA.debugLineNum = 84017169;BA.debugLine="If storedCursor < 0 Then";
if (_storedcursor<0) { 
RDebugUtils.currentLine=84017170;
 //BA.debugLineNum = 84017170;BA.debugLine="If storedTrackIndexValue >= 0 Then storedCursor";
if (_storedtrackindexvalue>=0) { 
_storedcursor = (int) (_storedtrackindexvalue+1);};
 };
RDebugUtils.currentLine=84017172;
 //BA.debugLineNum = 84017172;BA.debugLine="Dim storedTrackIndex As Int = storedCursor - 1";
_storedtrackindex = (int) (_storedcursor-1);
RDebugUtils.currentLine=84017173;
 //BA.debugLineNum = 84017173;BA.debugLine="If storedTrackIndex >= order.Size Then storedTrac";
if (_storedtrackindex>=_order.getSize()) { 
_storedtrackindex = (int) (_storedtrackindex%_order.getSize());};
RDebugUtils.currentLine=84017175;
 //BA.debugLineNum = 84017175;BA.debugLine="Dim startIndex As Int = storedTrackIndex + 1";
_startindex = (int) (_storedtrackindex+1);
RDebugUtils.currentLine=84017176;
 //BA.debugLineNum = 84017176;BA.debugLine="If startIndex < 0 Then startIndex = 0";
if (_startindex<0) { 
_startindex = (int) (0);};
RDebugUtils.currentLine=84017177;
 //BA.debugLineNum = 84017177;BA.debugLine="If startIndex >= order.Size Then startIndex = sta";
if (_startindex>=_order.getSize()) { 
_startindex = (int) (_startindex%_order.getSize());};
RDebugUtils.currentLine=84017179;
 //BA.debugLineNum = 84017179;BA.debugLine="For offset = 0 To order.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_order.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit24 ;_offset = _offset + step24 ) {
RDebugUtils.currentLine=84017180;
 //BA.debugLineNum = 84017180;BA.debugLine="If result.Size >= limitCount Then Exit";
if (_result.getSize()>=_limitcount) { 
if (true) break;};
RDebugUtils.currentLine=84017181;
 //BA.debugLineNum = 84017181;BA.debugLine="Dim orderIndex As Int = (startIndex + offset) Mo";
_orderindex = (int) ((_startindex+_offset)%_order.getSize());
RDebugUtils.currentLine=84017182;
 //BA.debugLineNum = 84017182;BA.debugLine="Dim trackId As String = order.Get(orderIndex)";
_trackid = BA.ObjectToString(_order.Get(_orderindex));
RDebugUtils.currentLine=84017183;
 //BA.debugLineNum = 84017183;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=84017184;
 //BA.debugLineNum = 84017184;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
if (_storedtrackindex>=0 && _order.getSize()>1 && _orderindex==_storedtrackindex) { 
if (true) continue;};
RDebugUtils.currentLine=84017185;
 //BA.debugLineNum = 84017185;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
_trackobject = _trackmap.GetDefault((Object)(_trackid),__c.Null);
RDebugUtils.currentLine=84017186;
 //BA.debugLineNum = 84017186;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=84017187;
 //BA.debugLineNum = 84017187;BA.debugLine="Dim track As Map = CloneMap(trackObject)";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject)));
RDebugUtils.currentLine=84017188;
 //BA.debugLineNum = 84017188;BA.debugLine="track.Put(\"playlist_id\", playlistId)";
_track.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=84017189;
 //BA.debugLineNum = 84017189;BA.debugLine="track.Put(\"playlist_title\", playlistTitle)";
_track.Put((Object)("playlist_title"),(Object)(_playlisttitle));
RDebugUtils.currentLine=84017190;
 //BA.debugLineNum = 84017190;BA.debugLine="track.Put(\"playlist_track_index\", orderIndex)";
_track.Put((Object)("playlist_track_index"),(Object)(_orderindex));
RDebugUtils.currentLine=84017191;
 //BA.debugLineNum = 84017191;BA.debugLine="track.Put(\"playlist_cursor\", orderIndex + 1)";
_track.Put((Object)("playlist_cursor"),(Object)(_orderindex+1));
RDebugUtils.currentLine=84017192;
 //BA.debugLineNum = 84017192;BA.debugLine="If includeCached = False And mediaCacheService.H";
if (_includecached==__c.False && _mediacacheservice._hasvalidatedlocalmedia /*boolean*/ (null,_track)) { 
if (true) continue;};
RDebugUtils.currentLine=84017193;
 //BA.debugLineNum = 84017193;BA.debugLine="result.Add(track)";
_result.Add((Object)(_track.getObject()));
 }
};
RDebugUtils.currentLine=84017196;
 //BA.debugLineNum = 84017196;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=84017197;
 //BA.debugLineNum = 84017197;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getplaylistplaybackmanifestbyid(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "getplaylistplaybackmanifestbyid", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getplaylistplaybackmanifestbyid", new Object[] {_playlistid}));}
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Public Sub GetPlaylistPlaybackManifestById(playlis";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="Return LoadOrBuildPlaylistPlaybackManifestById(pl";
if (true) return __ref._loadorbuildplaylistplaybackmanifestbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvedataslotatticks(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _targetticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvedataslotatticks", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvedataslotatticks", new Object[] {_offlinedata,_targetticks}));}
anywheresoftware.b4a.objects.collections.Map _slotcontext = null;
anywheresoftware.b4a.objects.collections.List _schedules = null;
String _todaykey = "";
int _nowminutes = 0;
String _todayweekday = "";
anywheresoftware.b4a.objects.collections.List _matchedslots = null;
Object _scheduleobject = null;
anywheresoftware.b4a.objects.collections.Map _schedule = null;
String _scheduletitle = "";
anywheresoftware.b4a.objects.collections.List _slots = null;
Object _slotobject = null;
anywheresoftware.b4a.objects.collections.Map _slot = null;
String _slottime = "";
int _slotminutes = 0;
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
anywheresoftware.b4a.objects.collections.Map _selectedslot = null;
int _selectedminutes = 0;
Object _slotentryobject = null;
anywheresoftware.b4a.objects.collections.Map _slotentry = null;
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Public Sub ResolveDataSlotAtTicks(offlineData As M";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="Dim slotContext As Map";
_slotcontext = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="slotContext.Initialize";
_slotcontext.Initialize();
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=29818884;
 //BA.debugLineNum = 29818884;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=29818885;
 //BA.debugLineNum = 29818885;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=29818886;
 //BA.debugLineNum = 29818886;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
_todaykey = __ref._formatisodate /*String*/ (null,_targetticks);
RDebugUtils.currentLine=29818887;
 //BA.debugLineNum = 29818887;BA.debugLine="Dim nowMinutes As Int = MinutesOfDayFromTicks(tar";
_nowminutes = __ref._minutesofdayfromticks /*int*/ (null,_targetticks);
RDebugUtils.currentLine=29818888;
 //BA.debugLineNum = 29818888;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTicks(";
_todayweekday = __ref._isoweekdayfromticks /*String*/ (null,_targetticks);
RDebugUtils.currentLine=29818889;
 //BA.debugLineNum = 29818889;BA.debugLine="Dim matchedSlots As List";
_matchedslots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=29818890;
 //BA.debugLineNum = 29818890;BA.debugLine="matchedSlots.Initialize";
_matchedslots.Initialize();
RDebugUtils.currentLine=29818891;
 //BA.debugLineNum = 29818891;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group11 = _schedules;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_scheduleobject = group11.Get(index11);
RDebugUtils.currentLine=29818892;
 //BA.debugLineNum = 29818892;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=29818893;
 //BA.debugLineNum = 29818893;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=29818894;
 //BA.debugLineNum = 29818894;BA.debugLine="If ScheduleAppliesToday(schedule, todayKey, tod";
if (__ref._scheduleappliestoday /*boolean*/ (null,_schedule,_todaykey,_todayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=29818895;
 //BA.debugLineNum = 29818895;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=29818896;
 //BA.debugLineNum = 29818896;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=29818897;
 //BA.debugLineNum = 29818897;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=29818898;
 //BA.debugLineNum = 29818898;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group18 = _slots;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_slotobject = group18.Get(index18);
RDebugUtils.currentLine=29818899;
 //BA.debugLineNum = 29818899;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=29818900;
 //BA.debugLineNum = 29818900;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=29818901;
 //BA.debugLineNum = 29818901;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=29818902;
 //BA.debugLineNum = 29818902;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes(";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=29818903;
 //BA.debugLineNum = 29818903;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=29818904;
 //BA.debugLineNum = 29818904;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=29818905;
 //BA.debugLineNum = 29818905;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29818906;
 //BA.debugLineNum = 29818906;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=29818907;
 //BA.debugLineNum = 29818907;BA.debugLine="entry.Put(\"schedule_title\", scheduleTitle)";
_entry.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=29818908;
 //BA.debugLineNum = 29818908;BA.debugLine="entry.Put(\"slot_time\", slotTime)";
_entry.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=29818909;
 //BA.debugLineNum = 29818909;BA.debugLine="entry.Put(\"slot_minutes\", slotMinutes)";
_entry.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=29818910;
 //BA.debugLineNum = 29818910;BA.debugLine="entry.Put(\"stream_id\", streamData.GetDefault(";
_entry.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=29818911;
 //BA.debugLineNum = 29818911;BA.debugLine="entry.Put(\"stream_title\", streamData.GetDefau";
_entry.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=29818912;
 //BA.debugLineNum = 29818912;BA.debugLine="entry.Put(\"playlists\", streamData.GetDefault(";
_entry.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=29818913;
 //BA.debugLineNum = 29818913;BA.debugLine="matchedSlots.Add(entry)";
_matchedslots.Add((Object)(_entry.getObject()));
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=29818918;
 //BA.debugLineNum = 29818918;BA.debugLine="If matchedSlots.Size = 0 Then Return slotContext";
if (_matchedslots.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=29818919;
 //BA.debugLineNum = 29818919;BA.debugLine="Dim selectedSlot As Map";
_selectedslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29818920;
 //BA.debugLineNum = 29818920;BA.debugLine="selectedSlot.Initialize";
_selectedslot.Initialize();
RDebugUtils.currentLine=29818921;
 //BA.debugLineNum = 29818921;BA.debugLine="Dim selectedMinutes As Int = -1";
_selectedminutes = (int) (-1);
RDebugUtils.currentLine=29818922;
 //BA.debugLineNum = 29818922;BA.debugLine="For Each slotEntryObject As Object In matchedSlot";
{
final anywheresoftware.b4a.BA.IterableList group42 = _matchedslots;
final int groupLen42 = group42.getSize()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_slotentryobject = group42.Get(index42);
RDebugUtils.currentLine=29818923;
 //BA.debugLineNum = 29818923;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=29818924;
 //BA.debugLineNum = 29818924;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"s";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=29818925;
 //BA.debugLineNum = 29818925;BA.debugLine="If slotMinutes <= nowMinutes And slotMinutes >=";
if (_slotminutes<=_nowminutes && _slotminutes>=_selectedminutes) { 
RDebugUtils.currentLine=29818926;
 //BA.debugLineNum = 29818926;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=29818927;
 //BA.debugLineNum = 29818927;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
RDebugUtils.currentLine=29818930;
 //BA.debugLineNum = 29818930;BA.debugLine="If selectedSlot.Size = 0 Then";
if (_selectedslot.getSize()==0) { 
RDebugUtils.currentLine=29818931;
 //BA.debugLineNum = 29818931;BA.debugLine="selectedMinutes = 24 * 60 + 1";
_selectedminutes = (int) (24*60+1);
RDebugUtils.currentLine=29818932;
 //BA.debugLineNum = 29818932;BA.debugLine="For Each slotEntryObject As Object In matchedSlo";
{
final anywheresoftware.b4a.BA.IterableList group52 = _matchedslots;
final int groupLen52 = group52.getSize()
;int index52 = 0;
;
for (; index52 < groupLen52;index52++){
_slotentryobject = group52.Get(index52);
RDebugUtils.currentLine=29818933;
 //BA.debugLineNum = 29818933;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=29818934;
 //BA.debugLineNum = 29818934;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=29818935;
 //BA.debugLineNum = 29818935;BA.debugLine="If slotMinutes > nowMinutes And slotMinutes < s";
if (_slotminutes>_nowminutes && _slotminutes<_selectedminutes) { 
RDebugUtils.currentLine=29818936;
 //BA.debugLineNum = 29818936;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=29818937;
 //BA.debugLineNum = 29818937;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
 };
RDebugUtils.currentLine=29818941;
 //BA.debugLineNum = 29818941;BA.debugLine="Return selectedSlot";
if (true) return _selectedslot;
RDebugUtils.currentLine=29818942;
 //BA.debugLineNum = 29818942;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslotatticks(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata,long _referenceticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvenextdataslotatticks", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextdataslotatticks", new Object[] {_offlinedata,_referenceticks}));}
anywheresoftware.b4a.objects.collections.Map _nextslot = null;
anywheresoftware.b4a.objects.collections.List _schedules = null;
long _nowticks = 0L;
long _bestslotticks = 0L;
int _dayoffset = 0;
long _dayticks = 0L;
String _daykey = "";
String _dayweekday = "";
Object _scheduleobject = null;
anywheresoftware.b4a.objects.collections.Map _schedule = null;
String _scheduletitle = "";
anywheresoftware.b4a.objects.collections.List _slots = null;
Object _slotobject = null;
anywheresoftware.b4a.objects.collections.Map _slot = null;
String _slottime = "";
int _slotminutes = 0;
long _slotticks = 0L;
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(offlineData";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="Dim nextSlot As Map";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=29949955;
 //BA.debugLineNum = 29949955;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=29949956;
 //BA.debugLineNum = 29949956;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=29949957;
 //BA.debugLineNum = 29949957;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=29949958;
 //BA.debugLineNum = 29949958;BA.debugLine="Dim nowTicks As Long = referenceTicks";
_nowticks = _referenceticks;
RDebugUtils.currentLine=29949959;
 //BA.debugLineNum = 29949959;BA.debugLine="Dim bestSlotTicks As Long = 0";
_bestslotticks = (long) (0);
RDebugUtils.currentLine=29949960;
 //BA.debugLineNum = 29949960;BA.debugLine="For dayOffset = 0 To 7";
{
final int step8 = 1;
final int limit8 = (int) (7);
_dayoffset = (int) (0) ;
for (;_dayoffset <= limit8 ;_dayoffset = _dayoffset + step8 ) {
RDebugUtils.currentLine=29949961;
 //BA.debugLineNum = 29949961;BA.debugLine="Dim dayTicks As Long = StartOfDayTicks(nowTicks";
_dayticks = __ref._startofdayticks /*long*/ (null,(long) (_nowticks+_dayoffset*__c.DateTime.TicksPerDay));
RDebugUtils.currentLine=29949962;
 //BA.debugLineNum = 29949962;BA.debugLine="Dim dayKey As String = FormatIsoDate(dayTicks)";
_daykey = __ref._formatisodate /*String*/ (null,_dayticks);
RDebugUtils.currentLine=29949963;
 //BA.debugLineNum = 29949963;BA.debugLine="Dim dayWeekday As String = IsoWeekdayFromTicks(d";
_dayweekday = __ref._isoweekdayfromticks /*String*/ (null,_dayticks);
RDebugUtils.currentLine=29949964;
 //BA.debugLineNum = 29949964;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group12 = _schedules;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_scheduleobject = group12.Get(index12);
RDebugUtils.currentLine=29949965;
 //BA.debugLineNum = 29949965;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=29949966;
 //BA.debugLineNum = 29949966;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=29949967;
 //BA.debugLineNum = 29949967;BA.debugLine="If ScheduleAppliesOnDate(schedule, dayKey, day";
if (__ref._scheduleappliesondate /*boolean*/ (null,_schedule,_daykey,_dayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=29949968;
 //BA.debugLineNum = 29949968;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefa";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=29949969;
 //BA.debugLineNum = 29949969;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=29949970;
 //BA.debugLineNum = 29949970;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=29949971;
 //BA.debugLineNum = 29949971;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group19 = _slots;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_slotobject = group19.Get(index19);
RDebugUtils.currentLine=29949972;
 //BA.debugLineNum = 29949972;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=29949973;
 //BA.debugLineNum = 29949973;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=29949974;
 //BA.debugLineNum = 29949974;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"ti";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=29949975;
 //BA.debugLineNum = 29949975;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=29949976;
 //BA.debugLineNum = 29949976;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=29949977;
 //BA.debugLineNum = 29949977;BA.debugLine="Dim slotTicks As Long = dayTicks + slotMinut";
_slotticks = (long) (_dayticks+_slotminutes*__c.DateTime.TicksPerMinute);
RDebugUtils.currentLine=29949978;
 //BA.debugLineNum = 29949978;BA.debugLine="If slotTicks <= nowTicks Then Continue";
if (_slotticks<=_nowticks) { 
if (true) continue;};
RDebugUtils.currentLine=29949979;
 //BA.debugLineNum = 29949979;BA.debugLine="If bestSlotTicks > 0 And slotTicks >= bestSl";
if (_bestslotticks>0 && _slotticks>=_bestslotticks) { 
if (true) continue;};
RDebugUtils.currentLine=29949980;
 //BA.debugLineNum = 29949980;BA.debugLine="Dim streamData As Map = ExtractSlotStreamDat";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=29949981;
 //BA.debugLineNum = 29949981;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=29949982;
 //BA.debugLineNum = 29949982;BA.debugLine="nextSlot.Put(\"schedule_title\", scheduleTitle";
_nextslot.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=29949983;
 //BA.debugLineNum = 29949983;BA.debugLine="nextSlot.Put(\"slot_time\", slotTime)";
_nextslot.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=29949984;
 //BA.debugLineNum = 29949984;BA.debugLine="nextSlot.Put(\"slot_minutes\", slotMinutes)";
_nextslot.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=29949985;
 //BA.debugLineNum = 29949985;BA.debugLine="nextSlot.Put(\"slot_ticks\", slotTicks)";
_nextslot.Put((Object)("slot_ticks"),(Object)(_slotticks));
RDebugUtils.currentLine=29949986;
 //BA.debugLineNum = 29949986;BA.debugLine="nextSlot.Put(\"stream_id\", streamData.GetDefa";
_nextslot.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=29949987;
 //BA.debugLineNum = 29949987;BA.debugLine="nextSlot.Put(\"stream_title\", streamData.GetD";
_nextslot.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=29949988;
 //BA.debugLineNum = 29949988;BA.debugLine="nextSlot.Put(\"playlists\", streamData.GetDefa";
_nextslot.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=29949989;
 //BA.debugLineNum = 29949989;BA.debugLine="bestSlotTicks = slotTicks";
_bestslotticks = _slotticks;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=29949994;
 //BA.debugLineNum = 29949994;BA.debugLine="If nextSlot.IsInitialized And nextSlot.Size > 0";
if (_nextslot.IsInitialized() && _nextslot.getSize()>0) { 
if (true) break;};
 }
};
RDebugUtils.currentLine=29949996;
 //BA.debugLineNum = 29949996;BA.debugLine="Return nextSlot";
if (true) return _nextslot;
RDebugUtils.currentLine=29949997;
 //BA.debugLineNum = 29949997;BA.debugLine="End Sub";
return null;
}
public String  _builddataslotkey(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "builddataslotkey", false))
	 {return ((String) Debug.delegate(ba, "builddataslotkey", new Object[] {_currentslot}));}
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _buildplaylistplaybackmanifest(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "buildplaylistplaybackmanifest", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "buildplaylistplaybackmanifest", new Object[] {_playlistdata}));}
anywheresoftware.b4a.objects.collections.Map _manifest = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.List _tracks = null;
anywheresoftware.b4a.objects.collections.Map _trackentries = null;
anywheresoftware.b4a.objects.collections.List _order = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Private Sub BuildPlaylistPlaybackManifest(playlist";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="Dim manifest As Map";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="manifest.Initialize";
_manifest.Initialize();
RDebugUtils.currentLine=30277635;
 //BA.debugLineNum = 30277635;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return _manifest;};
RDebugUtils.currentLine=30277636;
 //BA.debugLineNum = 30277636;BA.debugLine="Dim playlistId As String = playlistData.GetDefaul";
_playlistid = BA.ObjectToString(_playlistdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=30277637;
 //BA.debugLineNum = 30277637;BA.debugLine="If playlistId = \"\" Then Return manifest";
if ((_playlistid).equals("")) { 
if (true) return _manifest;};
RDebugUtils.currentLine=30277638;
 //BA.debugLineNum = 30277638;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=30277639;
 //BA.debugLineNum = 30277639;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return _manifest;};
RDebugUtils.currentLine=30277640;
 //BA.debugLineNum = 30277640;BA.debugLine="Dim trackEntries As Map";
_trackentries = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30277641;
 //BA.debugLineNum = 30277641;BA.debugLine="trackEntries.Initialize";
_trackentries.Initialize();
RDebugUtils.currentLine=30277642;
 //BA.debugLineNum = 30277642;BA.debugLine="Dim order As List";
_order = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30277643;
 //BA.debugLineNum = 30277643;BA.debugLine="order.Initialize";
_order.Initialize();
RDebugUtils.currentLine=30277644;
 //BA.debugLineNum = 30277644;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group12 = _tracks;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_trackobject = group12.Get(index12);
RDebugUtils.currentLine=30277645;
 //BA.debugLineNum = 30277645;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=30277646;
 //BA.debugLineNum = 30277646;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=30277647;
 //BA.debugLineNum = 30277647;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=30277648;
 //BA.debugLineNum = 30277648;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=30277649;
 //BA.debugLineNum = 30277649;BA.debugLine="If trackEntries.ContainsKey(trackId) Then Contin";
if (_trackentries.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=30277650;
 //BA.debugLineNum = 30277650;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30277651;
 //BA.debugLineNum = 30277651;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=30277652;
 //BA.debugLineNum = 30277652;BA.debugLine="entry.Put(\"type\", \"track\")";
_entry.Put((Object)("type"),(Object)("track"));
RDebugUtils.currentLine=30277653;
 //BA.debugLineNum = 30277653;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=30277654;
 //BA.debugLineNum = 30277654;BA.debugLine="entry.Put(\"code\", track.GetDefault(\"code\", \"\"))";
_entry.Put((Object)("code"),_track.GetDefault((Object)("code"),(Object)("")));
RDebugUtils.currentLine=30277655;
 //BA.debugLineNum = 30277655;BA.debugLine="entry.Put(\"set\", track.GetDefault(\"set\", \"\"))";
_entry.Put((Object)("set"),_track.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=30277656;
 //BA.debugLineNum = 30277656;BA.debugLine="entry.Put(\"duration\", track.GetDefault(\"duration";
_entry.Put((Object)("duration"),_track.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=30277657;
 //BA.debugLineNum = 30277657;BA.debugLine="entry.Put(\"gain\", track.GetDefault(\"gain\", -3))";
_entry.Put((Object)("gain"),_track.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=30277658;
 //BA.debugLineNum = 30277658;BA.debugLine="entry.Put(\"title\", track.GetDefault(\"title\", \"\")";
_entry.Put((Object)("title"),_track.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=30277659;
 //BA.debugLineNum = 30277659;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=30277660;
 //BA.debugLineNum = 30277660;BA.debugLine="trackEntries.Put(trackId, entry)";
_trackentries.Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=30277661;
 //BA.debugLineNum = 30277661;BA.debugLine="order.Add(trackId)";
_order.Add((Object)(_trackid));
 }
};
RDebugUtils.currentLine=30277663;
 //BA.debugLineNum = 30277663;BA.debugLine="If order.Size = 0 Then Return manifest";
if (_order.getSize()==0) { 
if (true) return _manifest;};
RDebugUtils.currentLine=30277664;
 //BA.debugLineNum = 30277664;BA.debugLine="ShuffleListInPlace(order)";
__ref._shufflelistinplace /*String*/ (null,_order);
RDebugUtils.currentLine=30277665;
 //BA.debugLineNum = 30277665;BA.debugLine="manifest.Put(\"version\", PlaylistPlaybackManifestV";
_manifest.Put((Object)("version"),(Object)(__ref._playlistplaybackmanifestversion /*String*/ (null,_playlistdata)));
RDebugUtils.currentLine=30277666;
 //BA.debugLineNum = 30277666;BA.debugLine="manifest.Put(\"playlist_id\", playlistId)";
_manifest.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=30277667;
 //BA.debugLineNum = 30277667;BA.debugLine="manifest.Put(\"title\", playlistData.GetDefault(\"ti";
_manifest.Put((Object)("title"),_playlistdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=30277668;
 //BA.debugLineNum = 30277668;BA.debugLine="manifest.Put(\"updated\", playlistData.GetDefault(\"";
_manifest.Put((Object)("updated"),_playlistdata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=30277669;
 //BA.debugLineNum = 30277669;BA.debugLine="manifest.Put(\"track_count\", order.Size)";
_manifest.Put((Object)("track_count"),(Object)(_order.getSize()));
RDebugUtils.currentLine=30277670;
 //BA.debugLineNum = 30277670;BA.debugLine="manifest.Put(\"order\", order)";
_manifest.Put((Object)("order"),(Object)(_order.getObject()));
RDebugUtils.currentLine=30277671;
 //BA.debugLineNum = 30277671;BA.debugLine="manifest.Put(\"tracks\", trackEntries)";
_manifest.Put((Object)("tracks"),(Object)(_trackentries.getObject()));
RDebugUtils.currentLine=30277672;
 //BA.debugLineNum = 30277672;BA.debugLine="Return manifest";
if (true) return _manifest;
RDebugUtils.currentLine=30277673;
 //BA.debugLineNum = 30277673;BA.debugLine="End Sub";
return null;
}
public String  _shufflelistinplace(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "shufflelistinplace", false))
	 {return ((String) Debug.delegate(ba, "shufflelistinplace", new Object[] {_items}));}
int _i = 0;
int _j = 0;
Object _temp = null;
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Private Sub ShuffleListInPlace(items As List)";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="If items.IsInitialized = False Or items.Size < 2";
if (_items.IsInitialized()==__c.False || _items.getSize()<2) { 
if (true) return "";};
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="For i = items.Size - 1 To 1 Step -1";
{
final int step2 = -1;
final int limit2 = (int) (1);
_i = (int) (_items.getSize()-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=30605315;
 //BA.debugLineNum = 30605315;BA.debugLine="Dim j As Int = Rnd(0, i + 1)";
_j = __c.Rnd((int) (0),(int) (_i+1));
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="If j = i Then Continue";
if (_j==_i) { 
if (true) continue;};
RDebugUtils.currentLine=30605317;
 //BA.debugLineNum = 30605317;BA.debugLine="Dim temp As Object = items.Get(i)";
_temp = _items.Get(_i);
RDebugUtils.currentLine=30605318;
 //BA.debugLineNum = 30605318;BA.debugLine="items.Set(i, items.Get(j))";
_items.Set(_i,_items.Get(_j));
RDebugUtils.currentLine=30605319;
 //BA.debugLineNum = 30605319;BA.debugLine="items.Set(j, temp)";
_items.Set(_j,_temp);
 }
};
RDebugUtils.currentLine=30605321;
 //BA.debugLineNum = 30605321;BA.debugLine="End Sub";
return "";
}
public String  _playlistplaybackmanifestversion(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistplaybackmanifestversion", false))
	 {return ((String) Debug.delegate(ba, "playlistplaybackmanifestversion", new Object[] {_playlistdata}));}
String _updatedvalue = "";
anywheresoftware.b4a.objects.collections.List _tracks = null;
int _trackcount = 0;
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Private Sub PlaylistPlaybackManifestVersion(playli";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="Dim updatedValue As String = playlistData.GetDefa";
_updatedvalue = BA.ObjectToString(_playlistdata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="Dim trackCount As Int = 0";
_trackcount = (int) (0);
RDebugUtils.currentLine=30343172;
 //BA.debugLineNum = 30343172;BA.debugLine="If tracks.IsInitialized Then trackCount = tracks.";
if (_tracks.IsInitialized()) { 
_trackcount = _tracks.getSize();};
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="Return updatedValue & \"|\" & trackCount";
if (true) return _updatedvalue+"|"+BA.NumberToString(_trackcount);
RDebugUtils.currentLine=30343174;
 //BA.debugLineNum = 30343174;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _buildslotfallbackresult(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedtrack,boolean _ispreferredplaylist) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "buildslotfallbackresult", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "buildslotfallbackresult", new Object[] {_descriptor,_cachedtrack,_ispreferredplaylist}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Private Sub BuildSlotFallbackResult(descriptor As";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=30736387;
 //BA.debugLineNum = 30736387;BA.debugLine="result.Put(\"playlist\", descriptor)";
_result.Put((Object)("playlist"),(Object)(_descriptor.getObject()));
RDebugUtils.currentLine=30736388;
 //BA.debugLineNum = 30736388;BA.debugLine="result.Put(\"track\", cachedTrack)";
_result.Put((Object)("track"),(Object)(_cachedtrack.getObject()));
RDebugUtils.currentLine=30736389;
 //BA.debugLineNum = 30736389;BA.debugLine="If isPreferredPlaylist Then";
if (_ispreferredplaylist) { 
RDebugUtils.currentLine=30736390;
 //BA.debugLineNum = 30736390;BA.debugLine="result.Put(\"source\", \"fallback_same_playlist\")";
_result.Put((Object)("source"),(Object)("fallback_same_playlist"));
 }else {
RDebugUtils.currentLine=30736392;
 //BA.debugLineNum = 30736392;BA.debugLine="result.Put(\"source\", \"fallback_other_playlist\")";
_result.Put((Object)("source"),(Object)("fallback_other_playlist"));
 };
RDebugUtils.currentLine=30736394;
 //BA.debugLineNum = 30736394;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=30736395;
 //BA.debugLineNum = 30736395;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _choosecachedtrackfromslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,String _preferredplaylistid,b4j.example.mediacache _mediacacheservice) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "choosecachedtrackfromslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "choosecachedtrackfromslot", new Object[] {_currentslot,_preferredplaylistid,_mediacacheservice}));}
anywheresoftware.b4a.objects.collections.Map _emptyresult = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.Map _preferreddescriptor = null;
anywheresoftware.b4a.objects.collections.List _fallbackdescriptors = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.List _ordereddescriptors = null;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _selectedresult = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Public Sub ChooseCachedTrackFromSlot(currentSlot A";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="Dim emptyResult As Map";
_emptyresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="emptyResult.Initialize";
_emptyresult.Initialize();
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return _emptyresult;};
RDebugUtils.currentLine=30670852;
 //BA.debugLineNum = 30670852;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=30670853;
 //BA.debugLineNum = 30670853;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptyresult;};
RDebugUtils.currentLine=30670854;
 //BA.debugLineNum = 30670854;BA.debugLine="Dim preferredDescriptor As Map";
_preferreddescriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30670855;
 //BA.debugLineNum = 30670855;BA.debugLine="preferredDescriptor.Initialize";
_preferreddescriptor.Initialize();
RDebugUtils.currentLine=30670856;
 //BA.debugLineNum = 30670856;BA.debugLine="Dim fallbackDescriptors As List";
_fallbackdescriptors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30670857;
 //BA.debugLineNum = 30670857;BA.debugLine="fallbackDescriptors.Initialize";
_fallbackdescriptors.Initialize();
RDebugUtils.currentLine=30670858;
 //BA.debugLineNum = 30670858;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group10 = _playlists;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_playlistobject = group10.Get(index10);
RDebugUtils.currentLine=30670859;
 //BA.debugLineNum = 30670859;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=30670860;
 //BA.debugLineNum = 30670860;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=30670861;
 //BA.debugLineNum = 30670861;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=30670862;
 //BA.debugLineNum = 30670862;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=30670863;
 //BA.debugLineNum = 30670863;BA.debugLine="If playlistId = preferredPlaylistId Then";
if ((_playlistid).equals(_preferredplaylistid)) { 
RDebugUtils.currentLine=30670864;
 //BA.debugLineNum = 30670864;BA.debugLine="preferredDescriptor = CloneMap(playlistDescript";
_preferreddescriptor = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptor);
 }else {
RDebugUtils.currentLine=30670866;
 //BA.debugLineNum = 30670866;BA.debugLine="fallbackDescriptors.Add(CloneMap(playlistDescri";
_fallbackdescriptors.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptor).getObject()));
 };
 }
};
RDebugUtils.currentLine=30670869;
 //BA.debugLineNum = 30670869;BA.debugLine="Dim orderedDescriptors As List";
_ordereddescriptors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30670870;
 //BA.debugLineNum = 30670870;BA.debugLine="orderedDescriptors.Initialize";
_ordereddescriptors.Initialize();
RDebugUtils.currentLine=30670871;
 //BA.debugLineNum = 30670871;BA.debugLine="If preferredDescriptor.IsInitialized And preferre";
if (_preferreddescriptor.IsInitialized() && _preferreddescriptor.getSize()>0) { 
_ordereddescriptors.Add((Object)(_preferreddescriptor.getObject()));};
RDebugUtils.currentLine=30670872;
 //BA.debugLineNum = 30670872;BA.debugLine="For Each descriptorObject As Object In fallbackDe";
{
final anywheresoftware.b4a.BA.IterableList group24 = _fallbackdescriptors;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_descriptorobject = group24.Get(index24);
RDebugUtils.currentLine=30670873;
 //BA.debugLineNum = 30670873;BA.debugLine="orderedDescriptors.Add(descriptorObject)";
_ordereddescriptors.Add(_descriptorobject);
 }
};
RDebugUtils.currentLine=30670875;
 //BA.debugLineNum = 30670875;BA.debugLine="Dim selectedResult As Map";
_selectedresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30670876;
 //BA.debugLineNum = 30670876;BA.debugLine="selectedResult.Initialize";
_selectedresult.Initialize();
RDebugUtils.currentLine=30670877;
 //BA.debugLineNum = 30670877;BA.debugLine="For Each descriptorObject As Object In orderedDes";
{
final anywheresoftware.b4a.BA.IterableList group29 = _ordereddescriptors;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_descriptorobject = group29.Get(index29);
RDebugUtils.currentLine=30670878;
 //BA.debugLineNum = 30670878;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
if ((_descriptorobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=30670879;
 //BA.debugLineNum = 30670879;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=30670880;
 //BA.debugLineNum = 30670880;BA.debugLine="Dim playlistId As String = descriptor.GetDefault";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=30670881;
 //BA.debugLineNum = 30670881;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=30670882;
 //BA.debugLineNum = 30670882;BA.debugLine="Dim cachedTrack As Map = ResolveOrderedCachedTra";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = __ref._resolveorderedcachedtrackfromplaylistbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid,_mediacacheservice);
RDebugUtils.currentLine=30670883;
 //BA.debugLineNum = 30670883;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
if (_cachedtrack.IsInitialized()==__c.False || _cachedtrack.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=30670884;
 //BA.debugLineNum = 30670884;BA.debugLine="selectedResult = BuildSlotFallbackResult(descrip";
_selectedresult = __ref._buildslotfallbackresult /*anywheresoftware.b4a.objects.collections.Map*/ (null,_descriptor,_cachedtrack,(_playlistid).equals(_preferredplaylistid));
RDebugUtils.currentLine=30670885;
 //BA.debugLineNum = 30670885;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=30670887;
 //BA.debugLineNum = 30670887;BA.debugLine="If selectedResult.IsInitialized And selectedResul";
if (_selectedresult.IsInitialized() && _selectedresult.getSize()>0) { 
if (true) return _selectedresult;};
RDebugUtils.currentLine=30670888;
 //BA.debugLineNum = 30670888;BA.debugLine="Return emptyResult";
if (true) return _emptyresult;
RDebugUtils.currentLine=30670889;
 //BA.debugLineNum = 30670889;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=31916036;
 //BA.debugLineNum = 31916036;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=31916037;
 //BA.debugLineNum = 31916037;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=31916039;
 //BA.debugLineNum = 31916039;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=31916040;
 //BA.debugLineNum = 31916040;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolveorderedcachedtrackfromplaylistbyid(b4j.example.dataplaybackresolver __ref,String _playlistid,b4j.example.mediacache _mediacacheservice) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolveorderedcachedtrackfromplaylistbyid", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolveorderedcachedtrackfromplaylistbyid", new Object[] {_playlistid,_mediacacheservice}));}
anywheresoftware.b4a.objects.collections.Map _emptytrack = null;
anywheresoftware.b4a.objects.collections.Map _manifest = null;
String _playlisttitle = "";
anywheresoftware.b4a.objects.collections.List _order = null;
anywheresoftware.b4a.objects.collections.Map _trackmap = null;
String _cursorkey = "";
int _storedcursor = 0;
String _trackindexkey = "";
int _storedtrackindexvalue = 0;
int _storedtrackindex = 0;
anywheresoftware.b4a.objects.collections.Map _selectedtrack = null;
int _startindex = 0;
int _offset = 0;
int _orderindex = 0;
String _trackid = "";
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
int _fallbackorderindex = 0;
String _fallbacktrackid = "";
Object _fallbacktrackobject = null;
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Public Sub ResolveOrderedCachedTrackFromPlaylistBy";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="Dim emptyTrack As Map";
_emptytrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="emptyTrack.Initialize";
_emptytrack.Initialize();
RDebugUtils.currentLine=30146563;
 //BA.debugLineNum = 30146563;BA.debugLine="If storageRef.IsInitialized = False Then Return e";
if (__ref._storageref /*b4j.example.keyvaluestore*/ .IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=30146564;
 //BA.debugLineNum = 30146564;BA.debugLine="If playlistId = \"\" Then Return emptyTrack";
if ((_playlistid).equals("")) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=30146565;
 //BA.debugLineNum = 30146565;BA.debugLine="Dim manifest As Map = LoadOrBuildPlaylistPlayback";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadorbuildplaylistplaybackmanifestbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=30146566;
 //BA.debugLineNum = 30146566;BA.debugLine="If manifest.IsInitialized = False Or manifest.Siz";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=30146567;
 //BA.debugLineNum = 30146567;BA.debugLine="Dim playlistTitle As String = manifest.GetDefault";
_playlisttitle = BA.ObjectToString(_manifest.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=30146568;
 //BA.debugLineNum = 30146568;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=30146569;
 //BA.debugLineNum = 30146569;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
if (_order.IsInitialized()==__c.False || _order.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=30146570;
 //BA.debugLineNum = 30146570;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
_trackmap = new anywheresoftware.b4a.objects.collections.Map();
_trackmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifest.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=30146571;
 //BA.debugLineNum = 30146571;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
if (_trackmap.IsInitialized()==__c.False || _trackmap.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=30146572;
 //BA.debugLineNum = 30146572;BA.debugLine="Dim cursorKey As String = PlaylistPlaybackCursorK";
_cursorkey = __ref._playlistplaybackcursorkey /*String*/ (null,_playlistid);
RDebugUtils.currentLine=30146573;
 //BA.debugLineNum = 30146573;BA.debugLine="Dim storedCursor As Int = storageRef.GetDefault(c";
_storedcursor = (int)(BA.ObjectToNumber(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,_cursorkey,(Object)(-1))));
RDebugUtils.currentLine=30146574;
 //BA.debugLineNum = 30146574;BA.debugLine="Dim trackIndexKey As String = PlaylistTrackIndexK";
_trackindexkey = __ref._playlisttrackindexkey /*String*/ (null,_playlistid);
RDebugUtils.currentLine=30146575;
 //BA.debugLineNum = 30146575;BA.debugLine="Dim storedTrackIndexValue As Int = storageRef.Get";
_storedtrackindexvalue = (int)(BA.ObjectToNumber(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,_trackindexkey,(Object)(-1))));
RDebugUtils.currentLine=30146576;
 //BA.debugLineNum = 30146576;BA.debugLine="If storedCursor < 0 Then";
if (_storedcursor<0) { 
RDebugUtils.currentLine=30146577;
 //BA.debugLineNum = 30146577;BA.debugLine="If storedTrackIndexValue >= 0 Then storedCursor";
if (_storedtrackindexvalue>=0) { 
_storedcursor = (int) (_storedtrackindexvalue+1);};
 };
RDebugUtils.currentLine=30146579;
 //BA.debugLineNum = 30146579;BA.debugLine="Dim storedTrackIndex As Int = storedCursor - 1";
_storedtrackindex = (int) (_storedcursor-1);
RDebugUtils.currentLine=30146580;
 //BA.debugLineNum = 30146580;BA.debugLine="If storedTrackIndex >= order.Size Then storedTrac";
if (_storedtrackindex>=_order.getSize()) { 
_storedtrackindex = (int) (_storedtrackindex%_order.getSize());};
RDebugUtils.currentLine=30146581;
 //BA.debugLineNum = 30146581;BA.debugLine="Trace(\"playlist resolve start playlistId=\" & play";
__ref._trace /*String*/ (null,"playlist resolve start playlistId="+_playlistid+" orderSize="+BA.NumberToString(_order.getSize())+" storedCursor="+BA.NumberToString(_storedcursor)+" storedTrackIndexKey="+BA.NumberToString(_storedtrackindexvalue)+" effectiveStoredTrackIndex="+BA.NumberToString(_storedtrackindex));
RDebugUtils.currentLine=30146582;
 //BA.debugLineNum = 30146582;BA.debugLine="Dim selectedTrack As Map";
_selectedtrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30146583;
 //BA.debugLineNum = 30146583;BA.debugLine="selectedTrack.Initialize";
_selectedtrack.Initialize();
RDebugUtils.currentLine=30146584;
 //BA.debugLineNum = 30146584;BA.debugLine="Dim startIndex As Int = storedTrackIndex + 1";
_startindex = (int) (_storedtrackindex+1);
RDebugUtils.currentLine=30146585;
 //BA.debugLineNum = 30146585;BA.debugLine="If startIndex < 0 Then startIndex = 0";
if (_startindex<0) { 
_startindex = (int) (0);};
RDebugUtils.currentLine=30146586;
 //BA.debugLineNum = 30146586;BA.debugLine="If startIndex >= order.Size Then startIndex = sta";
if (_startindex>=_order.getSize()) { 
_startindex = (int) (_startindex%_order.getSize());};
RDebugUtils.currentLine=30146587;
 //BA.debugLineNum = 30146587;BA.debugLine="For offset = 0 To order.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_order.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit27 ;_offset = _offset + step27 ) {
RDebugUtils.currentLine=30146588;
 //BA.debugLineNum = 30146588;BA.debugLine="Dim orderIndex As Int = (startIndex + offset) Mo";
_orderindex = (int) ((_startindex+_offset)%_order.getSize());
RDebugUtils.currentLine=30146589;
 //BA.debugLineNum = 30146589;BA.debugLine="Dim trackId As String = order.Get(orderIndex)";
_trackid = BA.ObjectToString(_order.Get(_orderindex));
RDebugUtils.currentLine=30146590;
 //BA.debugLineNum = 30146590;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=30146591;
 //BA.debugLineNum = 30146591;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
if (_storedtrackindex>=0 && _order.getSize()>1 && _orderindex==_storedtrackindex) { 
RDebugUtils.currentLine=30146592;
 //BA.debugLineNum = 30146592;BA.debugLine="Trace(\"playlist resolve skip_current playlistId";
__ref._trace /*String*/ (null,"playlist resolve skip_current playlistId="+_playlistid+" orderIndex="+BA.NumberToString(_orderindex)+" trackId="+_trackid);
RDebugUtils.currentLine=30146593;
 //BA.debugLineNum = 30146593;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=30146595;
 //BA.debugLineNum = 30146595;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
_trackobject = _trackmap.GetDefault((Object)(_trackid),__c.Null);
RDebugUtils.currentLine=30146596;
 //BA.debugLineNum = 30146596;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=30146597;
 //BA.debugLineNum = 30146597;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=30146598;
 //BA.debugLineNum = 30146598;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(trac";
if (_mediacacheservice._hasvalidatedlocalmedia /*boolean*/ (null,_track)) { 
RDebugUtils.currentLine=30146599;
 //BA.debugLineNum = 30146599;BA.debugLine="storageRef.Put(trackIndexKey, orderIndex)";
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_trackindexkey,(Object)(_orderindex));
RDebugUtils.currentLine=30146600;
 //BA.debugLineNum = 30146600;BA.debugLine="storageRef.Put(cursorKey, orderIndex + 1)";
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_cursorkey,(Object)(_orderindex+1));
RDebugUtils.currentLine=30146601;
 //BA.debugLineNum = 30146601;BA.debugLine="selectedTrack = CloneMap(track)";
_selectedtrack = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_track);
RDebugUtils.currentLine=30146602;
 //BA.debugLineNum = 30146602;BA.debugLine="selectedTrack.Put(\"playlist_track_index\", order";
_selectedtrack.Put((Object)("playlist_track_index"),(Object)(_orderindex));
RDebugUtils.currentLine=30146603;
 //BA.debugLineNum = 30146603;BA.debugLine="selectedTrack.Put(\"playlist_cursor\", orderIndex";
_selectedtrack.Put((Object)("playlist_cursor"),(Object)(_orderindex+1));
RDebugUtils.currentLine=30146604;
 //BA.debugLineNum = 30146604;BA.debugLine="selectedTrack.Put(\"playlist_title\", playlistTit";
_selectedtrack.Put((Object)("playlist_title"),(Object)(_playlisttitle));
RDebugUtils.currentLine=30146605;
 //BA.debugLineNum = 30146605;BA.debugLine="Trace(\"playlist resolve selected playlistId=\" &";
__ref._trace /*String*/ (null,"playlist resolve selected playlistId="+_playlistid+" orderIndex="+BA.NumberToString(_orderindex)+" nextCursor="+BA.NumberToString((_orderindex+1))+" trackId="+_trackid);
RDebugUtils.currentLine=30146606;
 //BA.debugLineNum = 30146606;BA.debugLine="Exit";
if (true) break;
 }else {
 };
 }
};
RDebugUtils.currentLine=30146611;
 //BA.debugLineNum = 30146611;BA.debugLine="If selectedTrack.IsInitialized = False Or selecte";
if (_selectedtrack.IsInitialized()==__c.False || _selectedtrack.getSize()==0) { 
RDebugUtils.currentLine=30146612;
 //BA.debugLineNum = 30146612;BA.debugLine="For offset = 0 To order.Size - 1";
{
final int step51 = 1;
final int limit51 = (int) (_order.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit51 ;_offset = _offset + step51 ) {
RDebugUtils.currentLine=30146613;
 //BA.debugLineNum = 30146613;BA.debugLine="Dim fallbackOrderIndex As Int = (startIndex + o";
_fallbackorderindex = (int) ((_startindex+_offset)%_order.getSize());
RDebugUtils.currentLine=30146614;
 //BA.debugLineNum = 30146614;BA.debugLine="Dim fallbackTrackId As String = order.Get(fallb";
_fallbacktrackid = BA.ObjectToString(_order.Get(_fallbackorderindex));
RDebugUtils.currentLine=30146615;
 //BA.debugLineNum = 30146615;BA.debugLine="If fallbackTrackId = \"\" Then Continue";
if ((_fallbacktrackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=30146616;
 //BA.debugLineNum = 30146616;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
if (_storedtrackindex>=0 && _order.getSize()>1 && _fallbackorderindex==_storedtrackindex) { 
if (true) continue;};
RDebugUtils.currentLine=30146617;
 //BA.debugLineNum = 30146617;BA.debugLine="If mediaCacheService.IsTrackCached(fallbackTrac";
if (_mediacacheservice._istrackcached /*boolean*/ (null,_fallbacktrackid)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=30146618;
 //BA.debugLineNum = 30146618;BA.debugLine="Dim fallbackTrackObject As Object = trackMap.Ge";
_fallbacktrackobject = _trackmap.GetDefault((Object)(_fallbacktrackid),__c.Null);
RDebugUtils.currentLine=30146619;
 //BA.debugLineNum = 30146619;BA.debugLine="If (fallbackTrackObject Is Map) = False Then Co";
if ((_fallbacktrackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=30146620;
 //BA.debugLineNum = 30146620;BA.debugLine="selectedTrack = CloneMap(fallbackTrackObject)";
_selectedtrack = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_fallbacktrackobject)));
RDebugUtils.currentLine=30146621;
 //BA.debugLineNum = 30146621;BA.debugLine="selectedTrack.Put(\"playlist_title\", playlistTit";
_selectedtrack.Put((Object)("playlist_title"),(Object)(_playlisttitle));
RDebugUtils.currentLine=30146622;
 //BA.debugLineNum = 30146622;BA.debugLine="storageRef.Put(trackIndexKey, fallbackOrderInde";
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_trackindexkey,(Object)(_fallbackorderindex));
RDebugUtils.currentLine=30146623;
 //BA.debugLineNum = 30146623;BA.debugLine="storageRef.Put(cursorKey, fallbackOrderIndex +";
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_cursorkey,(Object)(_fallbackorderindex+1));
RDebugUtils.currentLine=30146624;
 //BA.debugLineNum = 30146624;BA.debugLine="selectedTrack.Put(\"playlist_track_index\", fallb";
_selectedtrack.Put((Object)("playlist_track_index"),(Object)(_fallbackorderindex));
RDebugUtils.currentLine=30146625;
 //BA.debugLineNum = 30146625;BA.debugLine="selectedTrack.Put(\"playlist_cursor\", fallbackOr";
_selectedtrack.Put((Object)("playlist_cursor"),(Object)(_fallbackorderindex+1));
RDebugUtils.currentLine=30146626;
 //BA.debugLineNum = 30146626;BA.debugLine="Trace(\"playlist resolve fallback_index playlist";
__ref._trace /*String*/ (null,"playlist resolve fallback_index playlistId="+_playlistid+" orderIndex="+BA.NumberToString(_fallbackorderindex)+" trackId="+_fallbacktrackid);
RDebugUtils.currentLine=30146627;
 //BA.debugLineNum = 30146627;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=30146629;
 //BA.debugLineNum = 30146629;BA.debugLine="If selectedTrack.IsInitialized = False Or select";
if (_selectedtrack.IsInitialized()==__c.False || _selectedtrack.getSize()==0) { 
RDebugUtils.currentLine=30146630;
 //BA.debugLineNum = 30146630;BA.debugLine="Trace(\"playlist resolve empty playlistId=\" & pl";
__ref._trace /*String*/ (null,"playlist resolve empty playlistId="+_playlistid+" orderSize="+BA.NumberToString(_order.getSize()));
 };
 };
RDebugUtils.currentLine=30146633;
 //BA.debugLineNum = 30146633;BA.debugLine="If selectedTrack.IsInitialized And selectedTrack.";
if (_selectedtrack.IsInitialized() && _selectedtrack.getSize()>0) { 
if (true) return _selectedtrack;};
RDebugUtils.currentLine=30146634;
 //BA.debugLineNum = 30146634;BA.debugLine="Return emptyTrack";
if (true) return _emptytrack;
RDebugUtils.currentLine=30146635;
 //BA.debugLineNum = 30146635;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _choosenextplaylistdescriptor(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _workingcursors) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "choosenextplaylistdescriptor", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "choosenextplaylistdescriptor", new Object[] {_currentslot,_workingcursors}));}
anywheresoftware.b4a.objects.collections.Map _emptydescriptor = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
String _slotkey = "";
int _cursorvalue = 0;
int _playlistindexforslot = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistsource = null;
anywheresoftware.b4a.objects.collections.Map _playlist = null;
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Public Sub ChooseNextPlaylistDescriptor(currentSlo";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="Dim emptyDescriptor As Map";
_emptydescriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="emptyDescriptor.Initialize";
_emptydescriptor.Initialize();
RDebugUtils.currentLine=30015491;
 //BA.debugLineNum = 30015491;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=30015492;
 //BA.debugLineNum = 30015492;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptydescriptor;};
RDebugUtils.currentLine=30015493;
 //BA.debugLineNum = 30015493;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
_slotkey = __ref._builddataslotkey /*String*/ (null,_currentslot);
RDebugUtils.currentLine=30015494;
 //BA.debugLineNum = 30015494;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
_cursorvalue = (int)(BA.ObjectToNumber(_workingcursors.GetDefault((Object)(_slotkey),__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_slotkey),(Object)(0)))));
RDebugUtils.currentLine=30015495;
 //BA.debugLineNum = 30015495;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
if (_cursorvalue<0) { 
_cursorvalue = (int) (0);};
RDebugUtils.currentLine=30015496;
 //BA.debugLineNum = 30015496;BA.debugLine="Dim playlistIndexForSlot As Int = cursorValue Mod";
_playlistindexforslot = (int) (_cursorvalue%_playlists.getSize());
RDebugUtils.currentLine=30015497;
 //BA.debugLineNum = 30015497;BA.debugLine="workingCursors.Put(slotKey, playlistIndexForSlot";
_workingcursors.Put((Object)(_slotkey),(Object)(_playlistindexforslot+1));
RDebugUtils.currentLine=30015498;
 //BA.debugLineNum = 30015498;BA.debugLine="Dim playlistObject As Object = playlists.Get(play";
_playlistobject = _playlists.Get(_playlistindexforslot);
RDebugUtils.currentLine=30015499;
 //BA.debugLineNum = 30015499;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=30015500;
 //BA.debugLineNum = 30015500;BA.debugLine="Dim playlistSource As Map = playlistObject";
_playlistsource = new anywheresoftware.b4a.objects.collections.Map();
_playlistsource = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=30015501;
 //BA.debugLineNum = 30015501;BA.debugLine="Dim playlist As Map = CloneMap(playlistSource)";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistsource);
RDebugUtils.currentLine=30015502;
 //BA.debugLineNum = 30015502;BA.debugLine="playlist.Put(\"_slot_key\", slotKey)";
_playlist.Put((Object)("_slot_key"),(Object)(_slotkey));
RDebugUtils.currentLine=30015503;
 //BA.debugLineNum = 30015503;BA.debugLine="playlist.Put(\"_playlist_index\", playlistIndexFor";
_playlist.Put((Object)("_playlist_index"),(Object)(_playlistindexforslot));
RDebugUtils.currentLine=30015504;
 //BA.debugLineNum = 30015504;BA.debugLine="Return playlist";
if (true) return _playlist;
 };
RDebugUtils.currentLine=30015506;
 //BA.debugLineNum = 30015506;BA.debugLine="Return emptyDescriptor";
if (true) return _emptydescriptor;
RDebugUtils.currentLine=30015507;
 //BA.debugLineNum = 30015507;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=29425667;
 //BA.debugLineNum = 29425667;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=29425668;
 //BA.debugLineNum = 29425668;BA.debugLine="Private playlistCursors As Map";
_playlistcursors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29425669;
 //BA.debugLineNum = 29425669;BA.debugLine="Private storageRef As KeyValueStore";
_storageref = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=29425670;
 //BA.debugLineNum = 29425670;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _cloneplaylistcursors(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cloneplaylistcursors", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "cloneplaylistcursors", null));}
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Public Sub ClonePlaylistCursors As Map";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="Return CloneMap(playlistCursors)";
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="End Sub";
return null;
}
public String  _playlisttrackindexkey(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlisttrackindexkey", false))
	 {return ((String) Debug.delegate(ba, "playlisttrackindexkey", new Object[] {_playlistid}));}
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Private Sub PlaylistTrackIndexKey(playlistId As St";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="Return \"playlist_track_index_\" & playlistId";
if (true) return "playlist_track_index_"+_playlistid;
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="End Sub";
return "";
}
public String  _playlistplaybackcursorkey(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistplaybackcursorkey", false))
	 {return ((String) Debug.delegate(ba, "playlistplaybackcursorkey", new Object[] {_playlistid}));}
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Private Sub PlaylistPlaybackCursorKey(playlistId A";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="Return \"playlist_playback_cursor_\" & playlistId";
if (true) return "playlist_playback_cursor_"+_playlistid;
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.dataplaybackresolver __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=32047108;
 //BA.debugLineNum = 32047108;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=31981571;
 //BA.debugLineNum = 31981571;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=31981572;
 //BA.debugLineNum = 31981572;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=31850499;
 //BA.debugLineNum = 31850499;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=31850500;
 //BA.debugLineNum = 31850500;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createqueuetrackfromplaylist(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _playlistdescriptor,anywheresoftware.b4a.objects.collections.Map _track,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createqueuetrackfromplaylist", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createqueuetrackfromplaylist", new Object[] {_currentslot,_playlistdescriptor,_track,_offlinedata}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Public Sub CreateQueueTrackFromPlaylist(currentSlo";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=30801923;
 //BA.debugLineNum = 30801923;BA.debugLine="item.Put(\"type\", \"track\")";
_item.Put((Object)("type"),(Object)("track"));
RDebugUtils.currentLine=30801924;
 //BA.debugLineNum = 30801924;BA.debugLine="item.Put(\"id\", track.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=30801925;
 //BA.debugLineNum = 30801925;BA.debugLine="item.Put(\"code\", track.GetDefault(\"code\", \"\"))";
_item.Put((Object)("code"),_track.GetDefault((Object)("code"),(Object)("")));
RDebugUtils.currentLine=30801926;
 //BA.debugLineNum = 30801926;BA.debugLine="item.Put(\"set\", track.GetDefault(\"set\", \"\"))";
_item.Put((Object)("set"),_track.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=30801927;
 //BA.debugLineNum = 30801927;BA.debugLine="item.Put(\"duration\", track.GetDefault(\"duration\",";
_item.Put((Object)("duration"),_track.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=30801928;
 //BA.debugLineNum = 30801928;BA.debugLine="item.Put(\"gain\", track.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_track.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=30801929;
 //BA.debugLineNum = 30801929;BA.debugLine="item.Put(\"stream\", ResolvePlaybackStreamTitle(cur";
_item.Put((Object)("stream"),(Object)(__ref._resolveplaybackstreamtitle /*String*/ (null,_currentslot,_playlistdescriptor,_offlinedata)));
RDebugUtils.currentLine=30801930;
 //BA.debugLineNum = 30801930;BA.debugLine="item.Put(\"playlist_id\", playlistDescriptor.GetDef";
_item.Put((Object)("playlist_id"),_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=30801931;
 //BA.debugLineNum = 30801931;BA.debugLine="item.Put(\"playlist_title\", playlistDescriptor.Get";
_item.Put((Object)("playlist_title"),_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=30801932;
 //BA.debugLineNum = 30801932;BA.debugLine="item.Put(\"slot_key\", playlistDescriptor.GetDefaul";
_item.Put((Object)("slot_key"),_playlistdescriptor.GetDefault((Object)("_slot_key"),(Object)(__ref._builddataslotkey /*String*/ (null,_currentslot))));
RDebugUtils.currentLine=30801933;
 //BA.debugLineNum = 30801933;BA.debugLine="item.Put(\"playlist_index\", playlistDescriptor.Get";
_item.Put((Object)("playlist_index"),_playlistdescriptor.GetDefault((Object)("_playlist_index"),(Object)(0)));
RDebugUtils.currentLine=30801934;
 //BA.debugLineNum = 30801934;BA.debugLine="item.Put(\"playlist_track_index\", track.GetDefault";
_item.Put((Object)("playlist_track_index"),_track.GetDefault((Object)("playlist_track_index"),(Object)(-1)));
RDebugUtils.currentLine=30801935;
 //BA.debugLineNum = 30801935;BA.debugLine="item.Put(\"playlist_cursor\", track.GetDefault(\"pla";
_item.Put((Object)("playlist_cursor"),_track.GetDefault((Object)("playlist_cursor"),(Object)(-1)));
RDebugUtils.currentLine=30801936;
 //BA.debugLineNum = 30801936;BA.debugLine="item.Put(\"schedule_title\", currentSlot.GetDefault";
_item.Put((Object)("schedule_title"),_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=30801937;
 //BA.debugLineNum = 30801937;BA.debugLine="item.Put(\"slot_time\", currentSlot.GetDefault(\"slo";
_item.Put((Object)("slot_time"),_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=30801938;
 //BA.debugLineNum = 30801938;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=30801939;
 //BA.debugLineNum = 30801939;BA.debugLine="End Sub";
return null;
}
public String  _resolveplaybackstreamtitle(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _playlistdescriptor,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolveplaybackstreamtitle", false))
	 {return ((String) Debug.delegate(ba, "resolveplaybackstreamtitle", new Object[] {_currentslot,_playlistdescriptor,_offlinedata}));}
String _streamtitle = "";
String _resolvedstreamtitle = "";
String _scheduletitle = "";
String _descriptorstreamtitle = "";
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Private Sub ResolvePlaybackStreamTitle(currentSlot";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="Dim streamTitle As String = currentSlot.GetDefaul";
_streamtitle = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
RDebugUtils.currentLine=30998531;
 //BA.debugLineNum = 30998531;BA.debugLine="Dim resolvedStreamTitle As String = ResolveOfflin";
_resolvedstreamtitle = __ref._resolveofflinestreamtitle /*String*/ (null,_currentslot,_offlinedata);
RDebugUtils.currentLine=30998532;
 //BA.debugLineNum = 30998532;BA.debugLine="If resolvedStreamTitle <> \"\" Then Return resolved";
if ((_resolvedstreamtitle).equals("") == false) { 
if (true) return _resolvedstreamtitle;};
RDebugUtils.currentLine=30998533;
 //BA.debugLineNum = 30998533;BA.debugLine="Dim scheduleTitle As String = currentSlot.GetDefa";
_scheduletitle = BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=30998534;
 //BA.debugLineNum = 30998534;BA.debugLine="Dim descriptorStreamTitle As String = playlistDes";
_descriptorstreamtitle = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=30998535;
 //BA.debugLineNum = 30998535;BA.debugLine="If descriptorStreamTitle <> \"\" Then Return descri";
if ((_descriptorstreamtitle).equals("") == false) { 
if (true) return _descriptorstreamtitle;};
RDebugUtils.currentLine=30998536;
 //BA.debugLineNum = 30998536;BA.debugLine="If scheduleTitle <> \"\" Then Return scheduleTitle";
if ((_scheduletitle).equals("") == false) { 
if (true) return _scheduletitle;};
RDebugUtils.currentLine=30998537;
 //BA.debugLineNum = 30998537;BA.debugLine="Return playlistDescriptor.GetDefault(\"title\", \"\")";
if (true) return BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=30998538;
 //BA.debugLineNum = 30998538;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=31129604;
 //BA.debugLineNum = 31129604;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=31129605;
 //BA.debugLineNum = 31129605;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=31129606;
 //BA.debugLineNum = 31129606;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=31129607;
 //BA.debugLineNum = 31129607;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=31129609;
 //BA.debugLineNum = 31129609;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=31129610;
 //BA.debugLineNum = 31129610;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=31129611;
 //BA.debugLineNum = 31129611;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=31129612;
 //BA.debugLineNum = 31129612;BA.debugLine="End Sub";
return null;
}
public String  _formatisodate(b4j.example.dataplaybackresolver __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "formatisodate", false))
	 {return ((String) Debug.delegate(ba, "formatisodate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=31522821;
 //BA.debugLineNum = 31522821;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=31522822;
 //BA.debugLineNum = 31522822;BA.debugLine="End Sub";
return "";
}
public String  _getofflineplaylistsdir(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Private Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=31391745;
 //BA.debugLineNum = 31391745;BA.debugLine="Return File.Combine(storageDir, \"playlists\")";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadorbuildplaylistplaybackmanifestbyid(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "loadorbuildplaylistplaybackmanifestbyid", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadorbuildplaylistplaybackmanifestbyid", new Object[] {_playlistid}));}
anywheresoftware.b4a.objects.collections.Map _manifest = null;
anywheresoftware.b4a.objects.collections.Map _storedmanifest = null;
anywheresoftware.b4a.objects.collections.List _storedorder = null;
anywheresoftware.b4a.objects.collections.Map _storedtracks = null;
anywheresoftware.b4a.objects.collections.Map _sourceplaylistdata = null;
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Private Sub LoadOrBuildPlaylistPlaybackManifestByI";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="Dim manifest As Map";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="manifest.Initialize";
_manifest.Initialize();
RDebugUtils.currentLine=30212099;
 //BA.debugLineNum = 30212099;BA.debugLine="If playlistId = \"\" Then Return manifest";
if ((_playlistid).equals("")) { 
if (true) return _manifest;};
RDebugUtils.currentLine=30212100;
 //BA.debugLineNum = 30212100;BA.debugLine="Dim storedManifest As Map = storageRef.GetDefault";
_storedmanifest = new anywheresoftware.b4a.objects.collections.Map();
_storedmanifest = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._playlistplaybackmanifestkey /*String*/ (null,_playlistid),__c.Null)));
RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="If storedManifest.IsInitialized Then";
if (_storedmanifest.IsInitialized()) { 
RDebugUtils.currentLine=30212102;
 //BA.debugLineNum = 30212102;BA.debugLine="Dim storedOrder As List = storedManifest.GetDefa";
_storedorder = new anywheresoftware.b4a.objects.collections.List();
_storedorder = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_storedmanifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=30212103;
 //BA.debugLineNum = 30212103;BA.debugLine="Dim storedTracks As Map = storedManifest.GetDefa";
_storedtracks = new anywheresoftware.b4a.objects.collections.Map();
_storedtracks = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storedmanifest.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=30212104;
 //BA.debugLineNum = 30212104;BA.debugLine="If storedOrder.IsInitialized And storedOrder.Siz";
if (_storedorder.IsInitialized() && _storedorder.getSize()>0 && _storedtracks.IsInitialized() && _storedtracks.getSize()>0) { 
RDebugUtils.currentLine=30212105;
 //BA.debugLineNum = 30212105;BA.debugLine="Return storedManifest";
if (true) return _storedmanifest;
 };
 };
RDebugUtils.currentLine=30212108;
 //BA.debugLineNum = 30212108;BA.debugLine="Dim sourcePlaylistData As Map = LoadCachedPlaylis";
_sourceplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
_sourceplaylistdata = __ref._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=30212109;
 //BA.debugLineNum = 30212109;BA.debugLine="If sourcePlaylistData.IsInitialized = False Or so";
if (_sourceplaylistdata.IsInitialized()==__c.False || _sourceplaylistdata.getSize()==0) { 
if (true) return _manifest;};
RDebugUtils.currentLine=30212110;
 //BA.debugLineNum = 30212110;BA.debugLine="manifest = BuildPlaylistPlaybackManifest(sourcePl";
_manifest = __ref._buildplaylistplaybackmanifest /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sourceplaylistdata);
RDebugUtils.currentLine=30212111;
 //BA.debugLineNum = 30212111;BA.debugLine="If manifest.IsInitialized And manifest.Size > 0 T";
if (_manifest.IsInitialized() && _manifest.getSize()>0) { 
RDebugUtils.currentLine=30212112;
 //BA.debugLineNum = 30212112;BA.debugLine="storageRef.Put(PlaylistPlaybackManifestKey(playl";
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,__ref._playlistplaybackmanifestkey /*String*/ (null,_playlistid),(Object)(_manifest.getObject()));
 };
RDebugUtils.currentLine=30212114;
 //BA.debugLineNum = 30212114;BA.debugLine="Return manifest";
if (true) return _manifest;
RDebugUtils.currentLine=30212115;
 //BA.debugLineNum = 30212115;BA.debugLine="End Sub";
return null;
}
public String  _isoweekdayfromticks(b4j.example.dataplaybackresolver __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "isoweekdayfromticks", false))
	 {return ((String) Debug.delegate(ba, "isoweekdayfromticks", new Object[] {_ticks}));}
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _zoneclass = null;
anywheresoftware.b4j.object.JavaObject _zoneddatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _zoneid = null;
anywheresoftware.b4j.object.JavaObject _zoneddatetime = null;
anywheresoftware.b4j.object.JavaObject _localdate = null;
anywheresoftware.b4j.object.JavaObject _dayofweek = null;
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Private Sub IsoWeekdayFromTicks(ticks As Long) As";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=31653892;
 //BA.debugLineNum = 31653892;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
RDebugUtils.currentLine=31653893;
 //BA.debugLineNum = 31653893;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=31653894;
 //BA.debugLineNum = 31653894;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
RDebugUtils.currentLine=31653895;
 //BA.debugLineNum = 31653895;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
RDebugUtils.currentLine=31653896;
 //BA.debugLineNum = 31653896;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
RDebugUtils.currentLine=31653897;
 //BA.debugLineNum = 31653897;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
RDebugUtils.currentLine=31653898;
 //BA.debugLineNum = 31653898;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
RDebugUtils.currentLine=31653899;
 //BA.debugLineNum = 31653899;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
RDebugUtils.currentLine=31653900;
 //BA.debugLineNum = 31653900;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
RDebugUtils.currentLine=31653901;
 //BA.debugLineNum = 31653901;BA.debugLine="End Sub";
return "";
}
public String  _playlistmetadatafilename(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Private Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="End Sub";
return "";
}
public String  _playlistplaybackmanifestkey(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistplaybackmanifestkey", false))
	 {return ((String) Debug.delegate(ba, "playlistplaybackmanifestkey", new Object[] {_playlistid}));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Private Sub PlaylistPlaybackManifestKey(playlistId";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="Return \"playlist_playback_manifest_\" & playlistId";
if (true) return "playlist_playback_manifest_"+_playlistid;
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="End Sub";
return "";
}
public int  _minutesofdayfromticks(b4j.example.dataplaybackresolver __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "minutesofdayfromticks", false))
	 {return ((Integer) Debug.delegate(ba, "minutesofdayfromticks", new Object[] {_ticks}));}
String _previoustimeformat = "";
String _timevalue = "";
String[] _parts = null;
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Private Sub MinutesOfDayFromTicks(ticks As Long) A";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
_timevalue = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=31588357;
 //BA.debugLineNum = 31588357;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=31588359;
 //BA.debugLineNum = 31588359;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
RDebugUtils.currentLine=31588360;
 //BA.debugLineNum = 31588360;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvecurrentdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvecurrentdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvecurrentdataslot", new Object[] {_offlinedata}));}
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Public Sub ResolveCurrentDataSlot(offlineData As M";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Return ResolveDataSlotAtTicks(offlineData, DateTi";
if (true) return __ref._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,__c.DateTime.getNow());
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="End Sub";
return null;
}
public boolean  _scheduleappliestoday(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _schedule,String _todaykey,String _todayweekday) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "scheduleappliestoday", false))
	 {return ((Boolean) Debug.delegate(ba, "scheduleappliestoday", new Object[] {_schedule,_todaykey,_todayweekday}));}
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Private Sub ScheduleAppliesToday(schedule As Map,";
RDebugUtils.currentLine=31195137;
 //BA.debugLineNum = 31195137;BA.debugLine="Return ScheduleAppliesOnDate(schedule, todayKey,";
if (true) return __ref._scheduleappliesondate /*boolean*/ (null,_schedule,_todaykey,_todayweekday);
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="End Sub";
return false;
}
public int  _timestringtominutes(b4j.example.dataplaybackresolver __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "timestringtominutes", false))
	 {return ((Integer) Debug.delegate(ba, "timestringtominutes", new Object[] {_value}));}
String[] _parts = null;
int _hours = 0;
int _minutes = 0;
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
RDebugUtils.currentLine=31719427;
 //BA.debugLineNum = 31719427;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=31719428;
 //BA.debugLineNum = 31719428;BA.debugLine="Try";
try {RDebugUtils.currentLine=31719429;
 //BA.debugLineNum = 31719429;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
RDebugUtils.currentLine=31719430;
 //BA.debugLineNum = 31719430;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=31719431;
 //BA.debugLineNum = 31719431;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=31719432;
 //BA.debugLineNum = 31719432;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=31719433;
 //BA.debugLineNum = 31719433;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=31719435;
 //BA.debugLineNum = 31719435;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
RDebugUtils.currentLine=31719437;
 //BA.debugLineNum = 31719437;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvenextdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextdataslot", new Object[] {_offlinedata}));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Public Sub ResolveNextDataSlot(offlineData As Map)";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="Return ResolveNextDataSlotAtTicks(offlineData, Da";
if (true) return __ref._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,__c.DateTime.getNow());
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="End Sub";
return null;
}
public long  _startofdayticks(b4j.example.dataplaybackresolver __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "startofdayticks", false))
	 {return ((Long) Debug.delegate(ba, "startofdayticks", new Object[] {_ticks}));}
String _previousdateformat = "";
String _daykey = "";
long _dayticks = 0L;
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Private Sub StartOfDayTicks(ticks As Long) As Long";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=31784963;
 //BA.debugLineNum = 31784963;BA.debugLine="Dim dayKey As String = DateTime.Date(ticks)";
_daykey = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=31784964;
 //BA.debugLineNum = 31784964;BA.debugLine="Dim dayTicks As Long = DateTime.DateParse(dayKey)";
_dayticks = __c.DateTime.DateParse(_daykey);
RDebugUtils.currentLine=31784965;
 //BA.debugLineNum = 31784965;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=31784966;
 //BA.debugLineNum = 31784966;BA.debugLine="Return dayTicks";
if (true) return _dayticks;
RDebugUtils.currentLine=31784967;
 //BA.debugLineNum = 31784967;BA.debugLine="End Sub";
return 0L;
}
public boolean  _scheduleappliesondate(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _schedule,String _targetdatekey,String _targetweekday) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "scheduleappliesondate", false))
	 {return ((Boolean) Debug.delegate(ba, "scheduleappliesondate", new Object[] {_schedule,_targetdatekey,_targetweekday}));}
String _startdate = "";
anywheresoftware.b4a.objects.collections.List _weekdays = null;
Object _weekdayobject = null;
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Private Sub ScheduleAppliesOnDate(schedule As Map,";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="Dim startDate As String = schedule.GetDefault(\"st";
_startdate = BA.ObjectToString(_schedule.GetDefault((Object)("start"),(Object)("")));
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(target";
if ((_startdate).equals("") == false && _startdate.compareTo(_targetdatekey)>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=31260675;
 //BA.debugLineNum = 31260675;BA.debugLine="Dim weekdays As List = schedule.GetDefault(\"weekd";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("weekdays"),__c.Null)));
RDebugUtils.currentLine=31260676;
 //BA.debugLineNum = 31260676;BA.debugLine="If weekdays.IsInitialized = False Or weekdays.Siz";
if (_weekdays.IsInitialized()==__c.False || _weekdays.getSize()==0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=31260677;
 //BA.debugLineNum = 31260677;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group5 = _weekdays;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_weekdayobject = group5.Get(index5);
RDebugUtils.currentLine=31260678;
 //BA.debugLineNum = 31260678;BA.debugLine="If (\"\" & weekdayObject).Trim = targetWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_targetweekday)) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=31260680;
 //BA.debugLineNum = 31260680;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=31260681;
 //BA.debugLineNum = 31260681;BA.debugLine="End Sub";
return false;
}
public String  _resolveofflinestreamtitle(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolveofflinestreamtitle", false))
	 {return ((String) Debug.delegate(ba, "resolveofflinestreamtitle", new Object[] {_currentslot,_offlinedata}));}
String _targetstreamid = "";
String _targetslottime = "";
anywheresoftware.b4a.objects.collections.List _schedules = null;
Object _scheduleobject = null;
anywheresoftware.b4a.objects.collections.Map _schedule = null;
anywheresoftware.b4a.objects.collections.List _slots = null;
Object _slotobject = null;
anywheresoftware.b4a.objects.collections.Map _slot = null;
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
String _streamtitle = "";
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Private Sub ResolveOfflineStreamTitle(currentSlot";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="Dim targetStreamId As String = currentSlot.GetDef";
_targetstreamid = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=31064067;
 //BA.debugLineNum = 31064067;BA.debugLine="Dim targetSlotTime As String = currentSlot.GetDef";
_targetslottime = BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=31064068;
 //BA.debugLineNum = 31064068;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=31064069;
 //BA.debugLineNum = 31064069;BA.debugLine="If schedules.IsInitialized = False Then Return \"\"";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=31064070;
 //BA.debugLineNum = 31064070;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group6 = _schedules;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_scheduleobject = group6.Get(index6);
RDebugUtils.currentLine=31064071;
 //BA.debugLineNum = 31064071;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=31064072;
 //BA.debugLineNum = 31064072;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=31064073;
 //BA.debugLineNum = 31064073;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=31064074;
 //BA.debugLineNum = 31064074;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=31064075;
 //BA.debugLineNum = 31064075;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group11 = _slots;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.Get(index11);
RDebugUtils.currentLine=31064076;
 //BA.debugLineNum = 31064076;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=31064077;
 //BA.debugLineNum = 31064077;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=31064078;
 //BA.debugLineNum = 31064078;BA.debugLine="If targetSlotTime <> \"\" And slot.GetDefault(\"";
if ((_targetslottime).equals("") == false && (_slot.GetDefault((Object)("time"),(Object)(""))).equals((Object)(_targetslottime)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=31064079;
 //BA.debugLineNum = 31064079;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=31064080;
 //BA.debugLineNum = 31064080;BA.debugLine="If targetStreamId <> \"\" And streamData.GetDef";
if ((_targetstreamid).equals("") == false && (_streamdata.GetDefault((Object)("id"),(Object)(""))).equals((Object)(_targetstreamid)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=31064081;
 //BA.debugLineNum = 31064081;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=31064082;
 //BA.debugLineNum = 31064082;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=31064087;
 //BA.debugLineNum = 31064087;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=31064088;
 //BA.debugLineNum = 31064088;BA.debugLine="End Sub";
return "";
}
public String  _savepreviewplaylistcursors(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _workingcursors) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "savepreviewplaylistcursors", false))
	 {return ((String) Debug.delegate(ba, "savepreviewplaylistcursors", new Object[] {_storage,_workingcursors}));}
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Public Sub SavePreviewPlaylistCursors(storage As K";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="If workingCursors.IsInitialized = False Or workin";
if (_workingcursors.IsInitialized()==__c.False || _workingcursors.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="playlistCursors = CloneMap(workingCursors)";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_workingcursors);
RDebugUtils.currentLine=30932995;
 //BA.debugLineNum = 30932995;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ (null,"data_slot_playlist_cursors",(Object)(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=30932996;
 //BA.debugLineNum = 30932996;BA.debugLine="End Sub";
return "";
}
}