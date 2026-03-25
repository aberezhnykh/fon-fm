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
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Public Sub CommitPlaylistCursor(storage As KeyValu";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return "";};
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_key";
_slotkey = BA.ObjectToString(_item.GetDefault((Object)("slot_key"),(Object)("")));
RDebugUtils.currentLine=32964612;
 //BA.debugLineNum = 32964612;BA.debugLine="Dim playlistId As String = item.GetDefault(\"playl";
_playlistid = BA.ObjectToString(_item.GetDefault((Object)("playlist_id"),(Object)("")));
RDebugUtils.currentLine=32964613;
 //BA.debugLineNum = 32964613;BA.debugLine="Dim playlistTrackIndex As Int = item.GetDefault(\"";
_playlisttrackindex = (int)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_track_index"),(Object)(-1))));
RDebugUtils.currentLine=32964614;
 //BA.debugLineNum = 32964614;BA.debugLine="If playlistId <> \"\" And playlistTrackIndex >= 0 T";
if ((_playlistid).equals("") == false && _playlisttrackindex>=0) { 
RDebugUtils.currentLine=32964615;
 //BA.debugLineNum = 32964615;BA.debugLine="Dim storedCursor As Int = item.GetDefault(\"playl";
_storedcursor = (int)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_cursor"),(Object)(_playlisttrackindex+1))));
RDebugUtils.currentLine=32964616;
 //BA.debugLineNum = 32964616;BA.debugLine="storage.Put(PlaylistTrackIndexKey(playlistId), p";
_storage._put /*String*/ (null,__ref._playlisttrackindexkey /*String*/ (null,_playlistid),(Object)(_playlisttrackindex));
RDebugUtils.currentLine=32964617;
 //BA.debugLineNum = 32964617;BA.debugLine="storage.Put(PlaylistPlaybackCursorKey(playlistId";
_storage._put /*String*/ (null,__ref._playlistplaybackcursorkey /*String*/ (null,_playlistid),(Object)(_storedcursor));
RDebugUtils.currentLine=32964618;
 //BA.debugLineNum = 32964618;BA.debugLine="Trace(\"playlist commit track playlistId=\" & play";
__ref._trace /*String*/ (null,"playlist commit track playlistId="+_playlistid+" trackIndex="+BA.NumberToString(_playlisttrackindex)+" cursor="+BA.NumberToString(_storedcursor)+" trackId="+BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))));
 };
RDebugUtils.currentLine=32964620;
 //BA.debugLineNum = 32964620;BA.debugLine="If slotKey = \"\" Then Return";
if ((_slotkey).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=32964621;
 //BA.debugLineNum = 32964621;BA.debugLine="Dim playlistIndex As Int = item.GetDefault(\"playl";
_playlistindex = (int)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_index"),(Object)(-1))));
RDebugUtils.currentLine=32964622;
 //BA.debugLineNum = 32964622;BA.debugLine="If playlistIndex < 0 Then Return";
if (_playlistindex<0) { 
if (true) return "";};
RDebugUtils.currentLine=32964623;
 //BA.debugLineNum = 32964623;BA.debugLine="playlistCursors.Put(slotKey, playlistIndex + 1)";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_slotkey),(Object)(_playlistindex+1));
RDebugUtils.currentLine=32964624;
 //BA.debugLineNum = 32964624;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ (null,"data_slot_playlist_cursors",(Object)(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=32964625;
 //BA.debugLineNum = 32964625;BA.debugLine="Trace(\"playlist commit slot slotKey=\" & slotKey &";
__ref._trace /*String*/ (null,"playlist commit slot slotKey="+_slotkey+" playlistIndex="+BA.NumberToString(_playlistindex)+" nextPlaylistCursor="+BA.NumberToString((_playlistindex+1)));
RDebugUtils.currentLine=32964626;
 //BA.debugLineNum = 32964626;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Dim playlistData As Map";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="If playlistId = \"\" Then Return playlistData";
if ((_playlistid).equals("")) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistMe";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=32768005;
 //BA.debugLineNum = 32768005;BA.debugLine="Try";
try {RDebugUtils.currentLine=32768006;
 //BA.debugLineNum = 32768006;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=32768007;
 //BA.debugLineNum = 32768007;BA.debugLine="parser.Initialize(File.ReadString(GetOfflinePlay";
_parser.Initialize(__c.File.ReadString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid)));
RDebugUtils.currentLine=32768008;
 //BA.debugLineNum = 32768008;BA.debugLine="Dim parsedData As Map = parser.NextObject";
_parseddata = new anywheresoftware.b4a.objects.collections.Map();
_parseddata = _parser.NextObject();
RDebugUtils.currentLine=32768009;
 //BA.debugLineNum = 32768009;BA.debugLine="If parsedData.IsInitialized Then playlistData =";
if (_parseddata.IsInitialized()) { 
_playlistdata = _parseddata;};
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=32768011;
 //BA.debugLineNum = 32768011;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=32768012;
 //BA.debugLineNum = 32768012;BA.debugLine="Trace(\"Не удалось загрузить playlist metadata из";
__ref._trace /*String*/ (null,"Не удалось загрузить playlist metadata из кэша. id="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=32768014;
 //BA.debugLineNum = 32768014;BA.debugLine="Return playlistData";
if (true) return _playlistdata;
RDebugUtils.currentLine=32768015;
 //BA.debugLineNum = 32768015;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,Object _targetmodulevalue,String _tracesubnamevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_targetmodulevalue,_tracesubnamevalue}));}
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Public Sub Initialize(storageDirValue As String, t";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=32178179;
 //BA.debugLineNum = 32178179;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=32178180;
 //BA.debugLineNum = 32178180;BA.debugLine="playlistCursors.Initialize";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=32178181;
 //BA.debugLineNum = 32178181;BA.debugLine="End Sub";
return "";
}
public String  _loadstate(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "loadstate", false))
	 {return ((String) Debug.delegate(ba, "loadstate", new Object[] {_storage}));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Public Sub LoadState(storage As KeyValueStore)";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="storageRef = storage";
__ref._storageref /*b4j.example.keyvaluestore*/  = _storage;
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="playlistCursors = storage.GetDefault(\"data_slot_p";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ (null,"data_slot_playlist_cursors",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=32243715;
 //BA.debugLineNum = 32243715;BA.debugLine="If playlistCursors.IsInitialized = False Then pla";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=32243716;
 //BA.debugLineNum = 32243716;BA.debugLine="End Sub";
return "";
}
public int  _cursorcount(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cursorcount", false))
	 {return ((Integer) Debug.delegate(ba, "cursorcount", null));}
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Public Sub CursorCount As Int";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="If playlistCursors.IsInitialized = False Then Ret";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="Return playlistCursors.Size";
if (true) return __ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="End Sub";
return 0;
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
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Public Sub ResolveDataSlotAtTicks(offlineData As M";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="Dim slotContext As Map";
_slotcontext = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="slotContext.Initialize";
_slotcontext.Initialize();
RDebugUtils.currentLine=32505859;
 //BA.debugLineNum = 32505859;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=32505861;
 //BA.debugLineNum = 32505861;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=32505862;
 //BA.debugLineNum = 32505862;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
_todaykey = __ref._formatisodate /*String*/ (null,_targetticks);
RDebugUtils.currentLine=32505863;
 //BA.debugLineNum = 32505863;BA.debugLine="Dim nowMinutes As Int = MinutesOfDayFromTicks(tar";
_nowminutes = __ref._minutesofdayfromticks /*int*/ (null,_targetticks);
RDebugUtils.currentLine=32505864;
 //BA.debugLineNum = 32505864;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTicks(";
_todayweekday = __ref._isoweekdayfromticks /*String*/ (null,_targetticks);
RDebugUtils.currentLine=32505865;
 //BA.debugLineNum = 32505865;BA.debugLine="Dim matchedSlots As List";
_matchedslots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=32505866;
 //BA.debugLineNum = 32505866;BA.debugLine="matchedSlots.Initialize";
_matchedslots.Initialize();
RDebugUtils.currentLine=32505867;
 //BA.debugLineNum = 32505867;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group11 = _schedules;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_scheduleobject = group11.Get(index11);
RDebugUtils.currentLine=32505868;
 //BA.debugLineNum = 32505868;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=32505869;
 //BA.debugLineNum = 32505869;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=32505870;
 //BA.debugLineNum = 32505870;BA.debugLine="If ScheduleAppliesToday(schedule, todayKey, tod";
if (__ref._scheduleappliestoday /*boolean*/ (null,_schedule,_todaykey,_todayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32505871;
 //BA.debugLineNum = 32505871;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=32505872;
 //BA.debugLineNum = 32505872;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=32505873;
 //BA.debugLineNum = 32505873;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32505874;
 //BA.debugLineNum = 32505874;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group18 = _slots;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_slotobject = group18.Get(index18);
RDebugUtils.currentLine=32505875;
 //BA.debugLineNum = 32505875;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=32505876;
 //BA.debugLineNum = 32505876;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=32505877;
 //BA.debugLineNum = 32505877;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=32505878;
 //BA.debugLineNum = 32505878;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes(";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=32505879;
 //BA.debugLineNum = 32505879;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=32505880;
 //BA.debugLineNum = 32505880;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=32505881;
 //BA.debugLineNum = 32505881;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32505882;
 //BA.debugLineNum = 32505882;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=32505883;
 //BA.debugLineNum = 32505883;BA.debugLine="entry.Put(\"schedule_title\", scheduleTitle)";
_entry.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=32505884;
 //BA.debugLineNum = 32505884;BA.debugLine="entry.Put(\"slot_time\", slotTime)";
_entry.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=32505885;
 //BA.debugLineNum = 32505885;BA.debugLine="entry.Put(\"slot_minutes\", slotMinutes)";
_entry.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=32505886;
 //BA.debugLineNum = 32505886;BA.debugLine="entry.Put(\"stream_id\", streamData.GetDefault(";
_entry.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=32505887;
 //BA.debugLineNum = 32505887;BA.debugLine="entry.Put(\"stream_title\", streamData.GetDefau";
_entry.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=32505888;
 //BA.debugLineNum = 32505888;BA.debugLine="entry.Put(\"playlists\", streamData.GetDefault(";
_entry.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=32505889;
 //BA.debugLineNum = 32505889;BA.debugLine="matchedSlots.Add(entry)";
_matchedslots.Add((Object)(_entry.getObject()));
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=32505894;
 //BA.debugLineNum = 32505894;BA.debugLine="If matchedSlots.Size = 0 Then Return slotContext";
if (_matchedslots.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=32505895;
 //BA.debugLineNum = 32505895;BA.debugLine="Dim selectedSlot As Map";
_selectedslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32505896;
 //BA.debugLineNum = 32505896;BA.debugLine="selectedSlot.Initialize";
_selectedslot.Initialize();
RDebugUtils.currentLine=32505897;
 //BA.debugLineNum = 32505897;BA.debugLine="Dim selectedMinutes As Int = -1";
_selectedminutes = (int) (-1);
RDebugUtils.currentLine=32505898;
 //BA.debugLineNum = 32505898;BA.debugLine="For Each slotEntryObject As Object In matchedSlot";
{
final anywheresoftware.b4a.BA.IterableList group42 = _matchedslots;
final int groupLen42 = group42.getSize()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_slotentryobject = group42.Get(index42);
RDebugUtils.currentLine=32505899;
 //BA.debugLineNum = 32505899;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=32505900;
 //BA.debugLineNum = 32505900;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"s";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=32505901;
 //BA.debugLineNum = 32505901;BA.debugLine="If slotMinutes <= nowMinutes And slotMinutes >=";
if (_slotminutes<=_nowminutes && _slotminutes>=_selectedminutes) { 
RDebugUtils.currentLine=32505902;
 //BA.debugLineNum = 32505902;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=32505903;
 //BA.debugLineNum = 32505903;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
RDebugUtils.currentLine=32505906;
 //BA.debugLineNum = 32505906;BA.debugLine="If selectedSlot.Size = 0 Then";
if (_selectedslot.getSize()==0) { 
RDebugUtils.currentLine=32505907;
 //BA.debugLineNum = 32505907;BA.debugLine="selectedMinutes = 24 * 60 + 1";
_selectedminutes = (int) (24*60+1);
RDebugUtils.currentLine=32505908;
 //BA.debugLineNum = 32505908;BA.debugLine="For Each slotEntryObject As Object In matchedSlo";
{
final anywheresoftware.b4a.BA.IterableList group52 = _matchedslots;
final int groupLen52 = group52.getSize()
;int index52 = 0;
;
for (; index52 < groupLen52;index52++){
_slotentryobject = group52.Get(index52);
RDebugUtils.currentLine=32505909;
 //BA.debugLineNum = 32505909;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=32505910;
 //BA.debugLineNum = 32505910;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=32505911;
 //BA.debugLineNum = 32505911;BA.debugLine="If slotMinutes > nowMinutes And slotMinutes < s";
if (_slotminutes>_nowminutes && _slotminutes<_selectedminutes) { 
RDebugUtils.currentLine=32505912;
 //BA.debugLineNum = 32505912;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=32505913;
 //BA.debugLineNum = 32505913;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
 };
RDebugUtils.currentLine=32505917;
 //BA.debugLineNum = 32505917;BA.debugLine="Return selectedSlot";
if (true) return _selectedslot;
RDebugUtils.currentLine=32505918;
 //BA.debugLineNum = 32505918;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=87425024;
 //BA.debugLineNum = 87425024;BA.debugLine="Public Sub ResolveOrderedCachedTrackFromPlaylistBy";
RDebugUtils.currentLine=87425025;
 //BA.debugLineNum = 87425025;BA.debugLine="Dim emptyTrack As Map";
_emptytrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87425026;
 //BA.debugLineNum = 87425026;BA.debugLine="emptyTrack.Initialize";
_emptytrack.Initialize();
RDebugUtils.currentLine=87425027;
 //BA.debugLineNum = 87425027;BA.debugLine="If storageRef.IsInitialized = False Then Return e";
if (__ref._storageref /*b4j.example.keyvaluestore*/ .IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=87425028;
 //BA.debugLineNum = 87425028;BA.debugLine="If playlistId = \"\" Then Return emptyTrack";
if ((_playlistid).equals("")) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=87425029;
 //BA.debugLineNum = 87425029;BA.debugLine="Dim manifest As Map = LoadOrBuildPlaylistPlayback";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
_manifest = __ref._loadorbuildplaylistplaybackmanifestbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=87425030;
 //BA.debugLineNum = 87425030;BA.debugLine="If manifest.IsInitialized = False Or manifest.Siz";
if (_manifest.IsInitialized()==__c.False || _manifest.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=87425031;
 //BA.debugLineNum = 87425031;BA.debugLine="Dim playlistTitle As String = manifest.GetDefault";
_playlisttitle = BA.ObjectToString(_manifest.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=87425032;
 //BA.debugLineNum = 87425032;BA.debugLine="Dim order As List = manifest.GetDefault(\"order\",";
_order = new anywheresoftware.b4a.objects.collections.List();
_order = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_manifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=87425033;
 //BA.debugLineNum = 87425033;BA.debugLine="If order.IsInitialized = False Or order.Size = 0";
if (_order.IsInitialized()==__c.False || _order.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=87425034;
 //BA.debugLineNum = 87425034;BA.debugLine="Dim trackMap As Map = manifest.GetDefault(\"tracks";
_trackmap = new anywheresoftware.b4a.objects.collections.Map();
_trackmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_manifest.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=87425035;
 //BA.debugLineNum = 87425035;BA.debugLine="If trackMap.IsInitialized = False Or trackMap.Siz";
if (_trackmap.IsInitialized()==__c.False || _trackmap.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=87425036;
 //BA.debugLineNum = 87425036;BA.debugLine="Dim cursorKey As String = PlaylistPlaybackCursorK";
_cursorkey = __ref._playlistplaybackcursorkey /*String*/ (null,_playlistid);
RDebugUtils.currentLine=87425037;
 //BA.debugLineNum = 87425037;BA.debugLine="Dim storedCursor As Int = storageRef.GetDefault(c";
_storedcursor = (int)(BA.ObjectToNumber(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,_cursorkey,(Object)(-1))));
RDebugUtils.currentLine=87425038;
 //BA.debugLineNum = 87425038;BA.debugLine="Dim trackIndexKey As String = PlaylistTrackIndexK";
_trackindexkey = __ref._playlisttrackindexkey /*String*/ (null,_playlistid);
RDebugUtils.currentLine=87425039;
 //BA.debugLineNum = 87425039;BA.debugLine="Dim storedTrackIndexValue As Int = storageRef.Get";
_storedtrackindexvalue = (int)(BA.ObjectToNumber(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,_trackindexkey,(Object)(-1))));
RDebugUtils.currentLine=87425040;
 //BA.debugLineNum = 87425040;BA.debugLine="If storedCursor < 0 Then";
if (_storedcursor<0) { 
RDebugUtils.currentLine=87425041;
 //BA.debugLineNum = 87425041;BA.debugLine="If storedTrackIndexValue >= 0 Then storedCursor";
if (_storedtrackindexvalue>=0) { 
_storedcursor = (int) (_storedtrackindexvalue+1);};
 };
RDebugUtils.currentLine=87425043;
 //BA.debugLineNum = 87425043;BA.debugLine="Dim storedTrackIndex As Int = storedCursor - 1";
_storedtrackindex = (int) (_storedcursor-1);
RDebugUtils.currentLine=87425044;
 //BA.debugLineNum = 87425044;BA.debugLine="If storedTrackIndex >= order.Size Then storedTrac";
if (_storedtrackindex>=_order.getSize()) { 
_storedtrackindex = (int) (_storedtrackindex%_order.getSize());};
RDebugUtils.currentLine=87425045;
 //BA.debugLineNum = 87425045;BA.debugLine="Trace(\"playlist resolve start playlistId=\" & play";
__ref._trace /*String*/ (null,"playlist resolve start playlistId="+_playlistid+" orderSize="+BA.NumberToString(_order.getSize())+" storedCursor="+BA.NumberToString(_storedcursor)+" storedTrackIndexKey="+BA.NumberToString(_storedtrackindexvalue)+" effectiveStoredTrackIndex="+BA.NumberToString(_storedtrackindex));
RDebugUtils.currentLine=87425046;
 //BA.debugLineNum = 87425046;BA.debugLine="Dim selectedTrack As Map";
_selectedtrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87425047;
 //BA.debugLineNum = 87425047;BA.debugLine="selectedTrack.Initialize";
_selectedtrack.Initialize();
RDebugUtils.currentLine=87425048;
 //BA.debugLineNum = 87425048;BA.debugLine="Dim startIndex As Int = storedTrackIndex + 1";
_startindex = (int) (_storedtrackindex+1);
RDebugUtils.currentLine=87425049;
 //BA.debugLineNum = 87425049;BA.debugLine="If startIndex < 0 Then startIndex = 0";
if (_startindex<0) { 
_startindex = (int) (0);};
RDebugUtils.currentLine=87425050;
 //BA.debugLineNum = 87425050;BA.debugLine="If startIndex >= order.Size Then startIndex = sta";
if (_startindex>=_order.getSize()) { 
_startindex = (int) (_startindex%_order.getSize());};
RDebugUtils.currentLine=87425051;
 //BA.debugLineNum = 87425051;BA.debugLine="For offset = 0 To order.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_order.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit27 ;_offset = _offset + step27 ) {
RDebugUtils.currentLine=87425052;
 //BA.debugLineNum = 87425052;BA.debugLine="Dim orderIndex As Int = (startIndex + offset) Mo";
_orderindex = (int) ((_startindex+_offset)%_order.getSize());
RDebugUtils.currentLine=87425053;
 //BA.debugLineNum = 87425053;BA.debugLine="Dim trackId As String = order.Get(orderIndex)";
_trackid = BA.ObjectToString(_order.Get(_orderindex));
RDebugUtils.currentLine=87425054;
 //BA.debugLineNum = 87425054;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=87425055;
 //BA.debugLineNum = 87425055;BA.debugLine="If storedTrackIndex >= 0 And order.Size > 1 And";
if (_storedtrackindex>=0 && _order.getSize()>1 && _orderindex==_storedtrackindex) { 
RDebugUtils.currentLine=87425056;
 //BA.debugLineNum = 87425056;BA.debugLine="Trace(\"playlist resolve skip_current playlistId";
__ref._trace /*String*/ (null,"playlist resolve skip_current playlistId="+_playlistid+" orderIndex="+BA.NumberToString(_orderindex)+" trackId="+_trackid);
RDebugUtils.currentLine=87425057;
 //BA.debugLineNum = 87425057;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=87425059;
 //BA.debugLineNum = 87425059;BA.debugLine="Dim trackObject As Object = trackMap.GetDefault(";
_trackobject = _trackmap.GetDefault((Object)(_trackid),__c.Null);
RDebugUtils.currentLine=87425060;
 //BA.debugLineNum = 87425060;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=87425061;
 //BA.debugLineNum = 87425061;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=87425062;
 //BA.debugLineNum = 87425062;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(trac";
if (_mediacacheservice._hasvalidatedlocalmedia /*boolean*/ (null,_track)) { 
RDebugUtils.currentLine=87425063;
 //BA.debugLineNum = 87425063;BA.debugLine="storageRef.Put(trackIndexKey, orderIndex)";
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_trackindexkey,(Object)(_orderindex));
RDebugUtils.currentLine=87425064;
 //BA.debugLineNum = 87425064;BA.debugLine="storageRef.Put(cursorKey, orderIndex + 1)";
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_cursorkey,(Object)(_orderindex+1));
RDebugUtils.currentLine=87425065;
 //BA.debugLineNum = 87425065;BA.debugLine="selectedTrack = CloneMap(track)";
_selectedtrack = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_track);
RDebugUtils.currentLine=87425066;
 //BA.debugLineNum = 87425066;BA.debugLine="selectedTrack.Put(\"playlist_track_index\", order";
_selectedtrack.Put((Object)("playlist_track_index"),(Object)(_orderindex));
RDebugUtils.currentLine=87425067;
 //BA.debugLineNum = 87425067;BA.debugLine="selectedTrack.Put(\"playlist_cursor\", orderIndex";
_selectedtrack.Put((Object)("playlist_cursor"),(Object)(_orderindex+1));
RDebugUtils.currentLine=87425068;
 //BA.debugLineNum = 87425068;BA.debugLine="selectedTrack.Put(\"playlist_title\", playlistTit";
_selectedtrack.Put((Object)("playlist_title"),(Object)(_playlisttitle));
RDebugUtils.currentLine=87425069;
 //BA.debugLineNum = 87425069;BA.debugLine="Trace(\"playlist resolve selected playlistId=\" &";
__ref._trace /*String*/ (null,"playlist resolve selected playlistId="+_playlistid+" orderIndex="+BA.NumberToString(_orderindex)+" nextCursor="+BA.NumberToString((_orderindex+1))+" trackId="+_trackid);
RDebugUtils.currentLine=87425070;
 //BA.debugLineNum = 87425070;BA.debugLine="Exit";
if (true) break;
 }else {
 };
 }
};
RDebugUtils.currentLine=87425075;
 //BA.debugLineNum = 87425075;BA.debugLine="If selectedTrack.IsInitialized = False Or selecte";
if (_selectedtrack.IsInitialized()==__c.False || _selectedtrack.getSize()==0) { 
RDebugUtils.currentLine=87425076;
 //BA.debugLineNum = 87425076;BA.debugLine="Trace(\"playlist resolve empty playlistId=\" & pla";
__ref._trace /*String*/ (null,"playlist resolve empty playlistId="+_playlistid+" orderSize="+BA.NumberToString(_order.getSize()));
 };
RDebugUtils.currentLine=87425078;
 //BA.debugLineNum = 87425078;BA.debugLine="If selectedTrack.IsInitialized And selectedTrack.";
if (_selectedtrack.IsInitialized() && _selectedtrack.getSize()>0) { 
if (true) return _selectedtrack;};
RDebugUtils.currentLine=87425079;
 //BA.debugLineNum = 87425079;BA.debugLine="Return emptyTrack";
if (true) return _emptytrack;
RDebugUtils.currentLine=87425080;
 //BA.debugLineNum = 87425080;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createqueuetrackfromplaylist(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _playlistdescriptor,anywheresoftware.b4a.objects.collections.Map _track,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createqueuetrackfromplaylist", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createqueuetrackfromplaylist", new Object[] {_currentslot,_playlistdescriptor,_track,_offlinedata}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Public Sub CreateQueueTrackFromPlaylist(currentSlo";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="item.Put(\"type\", \"track\")";
_item.Put((Object)("type"),(Object)("track"));
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="item.Put(\"id\", track.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=32899077;
 //BA.debugLineNum = 32899077;BA.debugLine="item.Put(\"code\", track.GetDefault(\"code\", \"\"))";
_item.Put((Object)("code"),_track.GetDefault((Object)("code"),(Object)("")));
RDebugUtils.currentLine=32899078;
 //BA.debugLineNum = 32899078;BA.debugLine="item.Put(\"set\", track.GetDefault(\"set\", \"\"))";
_item.Put((Object)("set"),_track.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=32899079;
 //BA.debugLineNum = 32899079;BA.debugLine="item.Put(\"duration\", track.GetDefault(\"duration\",";
_item.Put((Object)("duration"),_track.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=32899080;
 //BA.debugLineNum = 32899080;BA.debugLine="item.Put(\"gain\", track.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_track.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=32899081;
 //BA.debugLineNum = 32899081;BA.debugLine="item.Put(\"stream\", ResolvePlaybackStreamTitle(cur";
_item.Put((Object)("stream"),(Object)(__ref._resolveplaybackstreamtitle /*String*/ (null,_currentslot,_playlistdescriptor,_offlinedata)));
RDebugUtils.currentLine=32899082;
 //BA.debugLineNum = 32899082;BA.debugLine="item.Put(\"playlist_id\", playlistDescriptor.GetDef";
_item.Put((Object)("playlist_id"),_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=32899083;
 //BA.debugLineNum = 32899083;BA.debugLine="item.Put(\"playlist_title\", playlistDescriptor.Get";
_item.Put((Object)("playlist_title"),_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=32899084;
 //BA.debugLineNum = 32899084;BA.debugLine="item.Put(\"slot_key\", playlistDescriptor.GetDefaul";
_item.Put((Object)("slot_key"),_playlistdescriptor.GetDefault((Object)("_slot_key"),(Object)(__ref._builddataslotkey /*String*/ (null,_currentslot))));
RDebugUtils.currentLine=32899085;
 //BA.debugLineNum = 32899085;BA.debugLine="item.Put(\"playlist_index\", playlistDescriptor.Get";
_item.Put((Object)("playlist_index"),_playlistdescriptor.GetDefault((Object)("_playlist_index"),(Object)(0)));
RDebugUtils.currentLine=32899086;
 //BA.debugLineNum = 32899086;BA.debugLine="item.Put(\"playlist_track_index\", track.GetDefault";
_item.Put((Object)("playlist_track_index"),_track.GetDefault((Object)("playlist_track_index"),(Object)(-1)));
RDebugUtils.currentLine=32899087;
 //BA.debugLineNum = 32899087;BA.debugLine="item.Put(\"playlist_cursor\", track.GetDefault(\"pla";
_item.Put((Object)("playlist_cursor"),_track.GetDefault((Object)("playlist_cursor"),(Object)(-1)));
RDebugUtils.currentLine=32899088;
 //BA.debugLineNum = 32899088;BA.debugLine="item.Put(\"schedule_title\", currentSlot.GetDefault";
_item.Put((Object)("schedule_title"),_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=32899089;
 //BA.debugLineNum = 32899089;BA.debugLine="item.Put(\"slot_time\", currentSlot.GetDefault(\"slo";
_item.Put((Object)("slot_time"),_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=32899090;
 //BA.debugLineNum = 32899090;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=32899091;
 //BA.debugLineNum = 32899091;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvecurrentdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvecurrentdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvecurrentdataslot", new Object[] {_offlinedata}));}
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Public Sub ResolveCurrentDataSlot(offlineData As M";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="Return ResolveDataSlotAtTicks(offlineData, DateTi";
if (true) return __ref._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,__c.DateTime.getNow());
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(offlineData";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="Dim nextSlot As Map";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=32636932;
 //BA.debugLineNum = 32636932;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=32636933;
 //BA.debugLineNum = 32636933;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=32636934;
 //BA.debugLineNum = 32636934;BA.debugLine="Dim nowTicks As Long = referenceTicks";
_nowticks = _referenceticks;
RDebugUtils.currentLine=32636935;
 //BA.debugLineNum = 32636935;BA.debugLine="Dim bestSlotTicks As Long = 0";
_bestslotticks = (long) (0);
RDebugUtils.currentLine=32636936;
 //BA.debugLineNum = 32636936;BA.debugLine="For dayOffset = 0 To 7";
{
final int step8 = 1;
final int limit8 = (int) (7);
_dayoffset = (int) (0) ;
for (;_dayoffset <= limit8 ;_dayoffset = _dayoffset + step8 ) {
RDebugUtils.currentLine=32636937;
 //BA.debugLineNum = 32636937;BA.debugLine="Dim dayTicks As Long = StartOfDayTicks(nowTicks";
_dayticks = __ref._startofdayticks /*long*/ (null,(long) (_nowticks+_dayoffset*__c.DateTime.TicksPerDay));
RDebugUtils.currentLine=32636938;
 //BA.debugLineNum = 32636938;BA.debugLine="Dim dayKey As String = FormatIsoDate(dayTicks)";
_daykey = __ref._formatisodate /*String*/ (null,_dayticks);
RDebugUtils.currentLine=32636939;
 //BA.debugLineNum = 32636939;BA.debugLine="Dim dayWeekday As String = IsoWeekdayFromTicks(d";
_dayweekday = __ref._isoweekdayfromticks /*String*/ (null,_dayticks);
RDebugUtils.currentLine=32636940;
 //BA.debugLineNum = 32636940;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group12 = _schedules;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_scheduleobject = group12.Get(index12);
RDebugUtils.currentLine=32636941;
 //BA.debugLineNum = 32636941;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=32636942;
 //BA.debugLineNum = 32636942;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=32636943;
 //BA.debugLineNum = 32636943;BA.debugLine="If ScheduleAppliesOnDate(schedule, dayKey, day";
if (__ref._scheduleappliesondate /*boolean*/ (null,_schedule,_daykey,_dayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32636944;
 //BA.debugLineNum = 32636944;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefa";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=32636945;
 //BA.debugLineNum = 32636945;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=32636946;
 //BA.debugLineNum = 32636946;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=32636947;
 //BA.debugLineNum = 32636947;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group19 = _slots;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_slotobject = group19.Get(index19);
RDebugUtils.currentLine=32636948;
 //BA.debugLineNum = 32636948;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=32636949;
 //BA.debugLineNum = 32636949;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=32636950;
 //BA.debugLineNum = 32636950;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"ti";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=32636951;
 //BA.debugLineNum = 32636951;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=32636952;
 //BA.debugLineNum = 32636952;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=32636953;
 //BA.debugLineNum = 32636953;BA.debugLine="Dim slotTicks As Long = dayTicks + slotMinut";
_slotticks = (long) (_dayticks+_slotminutes*__c.DateTime.TicksPerMinute);
RDebugUtils.currentLine=32636954;
 //BA.debugLineNum = 32636954;BA.debugLine="If slotTicks <= nowTicks Then Continue";
if (_slotticks<=_nowticks) { 
if (true) continue;};
RDebugUtils.currentLine=32636955;
 //BA.debugLineNum = 32636955;BA.debugLine="If bestSlotTicks > 0 And slotTicks >= bestSl";
if (_bestslotticks>0 && _slotticks>=_bestslotticks) { 
if (true) continue;};
RDebugUtils.currentLine=32636956;
 //BA.debugLineNum = 32636956;BA.debugLine="Dim streamData As Map = ExtractSlotStreamDat";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=32636957;
 //BA.debugLineNum = 32636957;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=32636958;
 //BA.debugLineNum = 32636958;BA.debugLine="nextSlot.Put(\"schedule_title\", scheduleTitle";
_nextslot.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=32636959;
 //BA.debugLineNum = 32636959;BA.debugLine="nextSlot.Put(\"slot_time\", slotTime)";
_nextslot.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=32636960;
 //BA.debugLineNum = 32636960;BA.debugLine="nextSlot.Put(\"slot_minutes\", slotMinutes)";
_nextslot.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=32636961;
 //BA.debugLineNum = 32636961;BA.debugLine="nextSlot.Put(\"slot_ticks\", slotTicks)";
_nextslot.Put((Object)("slot_ticks"),(Object)(_slotticks));
RDebugUtils.currentLine=32636962;
 //BA.debugLineNum = 32636962;BA.debugLine="nextSlot.Put(\"stream_id\", streamData.GetDefa";
_nextslot.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=32636963;
 //BA.debugLineNum = 32636963;BA.debugLine="nextSlot.Put(\"stream_title\", streamData.GetD";
_nextslot.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=32636964;
 //BA.debugLineNum = 32636964;BA.debugLine="nextSlot.Put(\"playlists\", streamData.GetDefa";
_nextslot.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=32636965;
 //BA.debugLineNum = 32636965;BA.debugLine="bestSlotTicks = slotTicks";
_bestslotticks = _slotticks;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=32636970;
 //BA.debugLineNum = 32636970;BA.debugLine="If nextSlot.IsInitialized And nextSlot.Size > 0";
if (_nextslot.IsInitialized() && _nextslot.getSize()>0) { 
if (true) break;};
 }
};
RDebugUtils.currentLine=32636972;
 //BA.debugLineNum = 32636972;BA.debugLine="Return nextSlot";
if (true) return _nextslot;
RDebugUtils.currentLine=32636973;
 //BA.debugLineNum = 32636973;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _cloneplaylistcursors(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cloneplaylistcursors", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "cloneplaylistcursors", null));}
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Public Sub ClonePlaylistCursors As Map";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="Return CloneMap(playlistCursors)";
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="End Sub";
return null;
}
public String  _savepreviewplaylistcursors(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _workingcursors) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "savepreviewplaylistcursors", false))
	 {return ((String) Debug.delegate(ba, "savepreviewplaylistcursors", new Object[] {_storage,_workingcursors}));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub SavePreviewPlaylistCursors(storage As K";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="If workingCursors.IsInitialized = False Or workin";
if (_workingcursors.IsInitialized()==__c.False || _workingcursors.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="playlistCursors = CloneMap(workingCursors)";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_workingcursors);
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ (null,"data_slot_playlist_cursors",(Object)(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=33030148;
 //BA.debugLineNum = 33030148;BA.debugLine="End Sub";
return "";
}
public String  _builddataslotkey(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "builddataslotkey", false))
	 {return ((String) Debug.delegate(ba, "builddataslotkey", new Object[] {_currentslot}));}
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=86966272;
 //BA.debugLineNum = 86966272;BA.debugLine="Private Sub BuildPlaylistPlaybackManifest(playlist";
RDebugUtils.currentLine=86966273;
 //BA.debugLineNum = 86966273;BA.debugLine="Dim manifest As Map";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=86966274;
 //BA.debugLineNum = 86966274;BA.debugLine="manifest.Initialize";
_manifest.Initialize();
RDebugUtils.currentLine=86966275;
 //BA.debugLineNum = 86966275;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return _manifest;};
RDebugUtils.currentLine=86966276;
 //BA.debugLineNum = 86966276;BA.debugLine="Dim playlistId As String = playlistData.GetDefaul";
_playlistid = BA.ObjectToString(_playlistdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=86966277;
 //BA.debugLineNum = 86966277;BA.debugLine="If playlistId = \"\" Then Return manifest";
if ((_playlistid).equals("")) { 
if (true) return _manifest;};
RDebugUtils.currentLine=86966278;
 //BA.debugLineNum = 86966278;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=86966279;
 //BA.debugLineNum = 86966279;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return _manifest;};
RDebugUtils.currentLine=86966280;
 //BA.debugLineNum = 86966280;BA.debugLine="Dim trackEntries As Map";
_trackentries = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=86966281;
 //BA.debugLineNum = 86966281;BA.debugLine="trackEntries.Initialize";
_trackentries.Initialize();
RDebugUtils.currentLine=86966282;
 //BA.debugLineNum = 86966282;BA.debugLine="Dim order As List";
_order = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=86966283;
 //BA.debugLineNum = 86966283;BA.debugLine="order.Initialize";
_order.Initialize();
RDebugUtils.currentLine=86966284;
 //BA.debugLineNum = 86966284;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group12 = _tracks;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_trackobject = group12.Get(index12);
RDebugUtils.currentLine=86966285;
 //BA.debugLineNum = 86966285;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=86966286;
 //BA.debugLineNum = 86966286;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=86966287;
 //BA.debugLineNum = 86966287;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=86966288;
 //BA.debugLineNum = 86966288;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=86966289;
 //BA.debugLineNum = 86966289;BA.debugLine="If trackEntries.ContainsKey(trackId) Then Contin";
if (_trackentries.ContainsKey((Object)(_trackid))) { 
if (true) continue;};
RDebugUtils.currentLine=86966290;
 //BA.debugLineNum = 86966290;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=86966291;
 //BA.debugLineNum = 86966291;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=86966292;
 //BA.debugLineNum = 86966292;BA.debugLine="entry.Put(\"type\", \"track\")";
_entry.Put((Object)("type"),(Object)("track"));
RDebugUtils.currentLine=86966293;
 //BA.debugLineNum = 86966293;BA.debugLine="entry.Put(\"id\", trackId)";
_entry.Put((Object)("id"),(Object)(_trackid));
RDebugUtils.currentLine=86966294;
 //BA.debugLineNum = 86966294;BA.debugLine="entry.Put(\"code\", track.GetDefault(\"code\", \"\"))";
_entry.Put((Object)("code"),_track.GetDefault((Object)("code"),(Object)("")));
RDebugUtils.currentLine=86966295;
 //BA.debugLineNum = 86966295;BA.debugLine="entry.Put(\"set\", track.GetDefault(\"set\", \"\"))";
_entry.Put((Object)("set"),_track.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=86966296;
 //BA.debugLineNum = 86966296;BA.debugLine="entry.Put(\"duration\", track.GetDefault(\"duration";
_entry.Put((Object)("duration"),_track.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=86966297;
 //BA.debugLineNum = 86966297;BA.debugLine="entry.Put(\"gain\", track.GetDefault(\"gain\", -3))";
_entry.Put((Object)("gain"),_track.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=86966298;
 //BA.debugLineNum = 86966298;BA.debugLine="entry.Put(\"title\", track.GetDefault(\"title\", \"\")";
_entry.Put((Object)("title"),_track.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=86966299;
 //BA.debugLineNum = 86966299;BA.debugLine="entry.Put(\"playlist_id\", playlistId)";
_entry.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=86966300;
 //BA.debugLineNum = 86966300;BA.debugLine="trackEntries.Put(trackId, entry)";
_trackentries.Put((Object)(_trackid),(Object)(_entry.getObject()));
RDebugUtils.currentLine=86966301;
 //BA.debugLineNum = 86966301;BA.debugLine="order.Add(trackId)";
_order.Add((Object)(_trackid));
 }
};
RDebugUtils.currentLine=86966303;
 //BA.debugLineNum = 86966303;BA.debugLine="If order.Size = 0 Then Return manifest";
if (_order.getSize()==0) { 
if (true) return _manifest;};
RDebugUtils.currentLine=86966304;
 //BA.debugLineNum = 86966304;BA.debugLine="ShuffleListInPlace(order)";
__ref._shufflelistinplace /*String*/ (null,_order);
RDebugUtils.currentLine=86966305;
 //BA.debugLineNum = 86966305;BA.debugLine="manifest.Put(\"version\", PlaylistPlaybackManifestV";
_manifest.Put((Object)("version"),(Object)(__ref._playlistplaybackmanifestversion /*String*/ (null,_playlistdata)));
RDebugUtils.currentLine=86966306;
 //BA.debugLineNum = 86966306;BA.debugLine="manifest.Put(\"playlist_id\", playlistId)";
_manifest.Put((Object)("playlist_id"),(Object)(_playlistid));
RDebugUtils.currentLine=86966307;
 //BA.debugLineNum = 86966307;BA.debugLine="manifest.Put(\"title\", playlistData.GetDefault(\"ti";
_manifest.Put((Object)("title"),_playlistdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=86966308;
 //BA.debugLineNum = 86966308;BA.debugLine="manifest.Put(\"updated\", playlistData.GetDefault(\"";
_manifest.Put((Object)("updated"),_playlistdata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=86966309;
 //BA.debugLineNum = 86966309;BA.debugLine="manifest.Put(\"track_count\", order.Size)";
_manifest.Put((Object)("track_count"),(Object)(_order.getSize()));
RDebugUtils.currentLine=86966310;
 //BA.debugLineNum = 86966310;BA.debugLine="manifest.Put(\"order\", order)";
_manifest.Put((Object)("order"),(Object)(_order.getObject()));
RDebugUtils.currentLine=86966311;
 //BA.debugLineNum = 86966311;BA.debugLine="manifest.Put(\"tracks\", trackEntries)";
_manifest.Put((Object)("tracks"),(Object)(_trackentries.getObject()));
RDebugUtils.currentLine=86966312;
 //BA.debugLineNum = 86966312;BA.debugLine="Return manifest";
if (true) return _manifest;
RDebugUtils.currentLine=86966313;
 //BA.debugLineNum = 86966313;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=87228416;
 //BA.debugLineNum = 87228416;BA.debugLine="Private Sub ShuffleListInPlace(items As List)";
RDebugUtils.currentLine=87228417;
 //BA.debugLineNum = 87228417;BA.debugLine="If items.IsInitialized = False Or items.Size < 2";
if (_items.IsInitialized()==__c.False || _items.getSize()<2) { 
if (true) return "";};
RDebugUtils.currentLine=87228418;
 //BA.debugLineNum = 87228418;BA.debugLine="For i = items.Size - 1 To 1 Step -1";
{
final int step2 = -1;
final int limit2 = (int) (1);
_i = (int) (_items.getSize()-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=87228419;
 //BA.debugLineNum = 87228419;BA.debugLine="Dim j As Int = Rnd(0, i + 1)";
_j = __c.Rnd((int) (0),(int) (_i+1));
RDebugUtils.currentLine=87228420;
 //BA.debugLineNum = 87228420;BA.debugLine="If j = i Then Continue";
if (_j==_i) { 
if (true) continue;};
RDebugUtils.currentLine=87228421;
 //BA.debugLineNum = 87228421;BA.debugLine="Dim temp As Object = items.Get(i)";
_temp = _items.Get(_i);
RDebugUtils.currentLine=87228422;
 //BA.debugLineNum = 87228422;BA.debugLine="items.Set(i, items.Get(j))";
_items.Set(_i,_items.Get(_j));
RDebugUtils.currentLine=87228423;
 //BA.debugLineNum = 87228423;BA.debugLine="items.Set(j, temp)";
_items.Set(_j,_temp);
 }
};
RDebugUtils.currentLine=87228425;
 //BA.debugLineNum = 87228425;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=87031808;
 //BA.debugLineNum = 87031808;BA.debugLine="Private Sub PlaylistPlaybackManifestVersion(playli";
RDebugUtils.currentLine=87031809;
 //BA.debugLineNum = 87031809;BA.debugLine="Dim updatedValue As String = playlistData.GetDefa";
_updatedvalue = BA.ObjectToString(_playlistdata.GetDefault((Object)("updated"),(Object)("")));
RDebugUtils.currentLine=87031810;
 //BA.debugLineNum = 87031810;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=87031811;
 //BA.debugLineNum = 87031811;BA.debugLine="Dim trackCount As Int = 0";
_trackcount = (int) (0);
RDebugUtils.currentLine=87031812;
 //BA.debugLineNum = 87031812;BA.debugLine="If tracks.IsInitialized Then trackCount = tracks.";
if (_tracks.IsInitialized()) { 
_trackcount = _tracks.getSize();};
RDebugUtils.currentLine=87031813;
 //BA.debugLineNum = 87031813;BA.debugLine="Return updatedValue & \"|\" & trackCount";
if (true) return _updatedvalue+"|"+BA.NumberToString(_trackcount);
RDebugUtils.currentLine=87031814;
 //BA.debugLineNum = 87031814;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _buildslotfallbackresult(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedtrack,boolean _ispreferredplaylist) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "buildslotfallbackresult", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "buildslotfallbackresult", new Object[] {_descriptor,_cachedtrack,_ispreferredplaylist}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
RDebugUtils.currentLine=84672512;
 //BA.debugLineNum = 84672512;BA.debugLine="Private Sub BuildSlotFallbackResult(descriptor As";
RDebugUtils.currentLine=84672513;
 //BA.debugLineNum = 84672513;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=84672514;
 //BA.debugLineNum = 84672514;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=84672515;
 //BA.debugLineNum = 84672515;BA.debugLine="result.Put(\"playlist\", descriptor)";
_result.Put((Object)("playlist"),(Object)(_descriptor.getObject()));
RDebugUtils.currentLine=84672516;
 //BA.debugLineNum = 84672516;BA.debugLine="result.Put(\"track\", cachedTrack)";
_result.Put((Object)("track"),(Object)(_cachedtrack.getObject()));
RDebugUtils.currentLine=84672517;
 //BA.debugLineNum = 84672517;BA.debugLine="If isPreferredPlaylist Then";
if (_ispreferredplaylist) { 
RDebugUtils.currentLine=84672518;
 //BA.debugLineNum = 84672518;BA.debugLine="result.Put(\"source\", \"fallback_same_playlist\")";
_result.Put((Object)("source"),(Object)("fallback_same_playlist"));
 }else {
RDebugUtils.currentLine=84672520;
 //BA.debugLineNum = 84672520;BA.debugLine="result.Put(\"source\", \"fallback_other_playlist\")";
_result.Put((Object)("source"),(Object)("fallback_other_playlist"));
 };
RDebugUtils.currentLine=84672522;
 //BA.debugLineNum = 84672522;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=84672523;
 //BA.debugLineNum = 84672523;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=83951616;
 //BA.debugLineNum = 83951616;BA.debugLine="Public Sub ChooseCachedTrackFromSlot(currentSlot A";
RDebugUtils.currentLine=83951617;
 //BA.debugLineNum = 83951617;BA.debugLine="Dim emptyResult As Map";
_emptyresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83951618;
 //BA.debugLineNum = 83951618;BA.debugLine="emptyResult.Initialize";
_emptyresult.Initialize();
RDebugUtils.currentLine=83951619;
 //BA.debugLineNum = 83951619;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return _emptyresult;};
RDebugUtils.currentLine=83951620;
 //BA.debugLineNum = 83951620;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=83951621;
 //BA.debugLineNum = 83951621;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptyresult;};
RDebugUtils.currentLine=83951622;
 //BA.debugLineNum = 83951622;BA.debugLine="Dim preferredDescriptor As Map";
_preferreddescriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83951623;
 //BA.debugLineNum = 83951623;BA.debugLine="preferredDescriptor.Initialize";
_preferreddescriptor.Initialize();
RDebugUtils.currentLine=83951624;
 //BA.debugLineNum = 83951624;BA.debugLine="Dim fallbackDescriptors As List";
_fallbackdescriptors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=83951625;
 //BA.debugLineNum = 83951625;BA.debugLine="fallbackDescriptors.Initialize";
_fallbackdescriptors.Initialize();
RDebugUtils.currentLine=83951626;
 //BA.debugLineNum = 83951626;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group10 = _playlists;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_playlistobject = group10.Get(index10);
RDebugUtils.currentLine=83951627;
 //BA.debugLineNum = 83951627;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=83951628;
 //BA.debugLineNum = 83951628;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=83951629;
 //BA.debugLineNum = 83951629;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=83951630;
 //BA.debugLineNum = 83951630;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=83951631;
 //BA.debugLineNum = 83951631;BA.debugLine="If playlistId = preferredPlaylistId Then";
if ((_playlistid).equals(_preferredplaylistid)) { 
RDebugUtils.currentLine=83951632;
 //BA.debugLineNum = 83951632;BA.debugLine="preferredDescriptor = CloneMap(playlistDescript";
_preferreddescriptor = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptor);
 }else {
RDebugUtils.currentLine=83951634;
 //BA.debugLineNum = 83951634;BA.debugLine="fallbackDescriptors.Add(CloneMap(playlistDescri";
_fallbackdescriptors.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdescriptor).getObject()));
 };
 }
};
RDebugUtils.currentLine=83951637;
 //BA.debugLineNum = 83951637;BA.debugLine="Dim orderedDescriptors As List";
_ordereddescriptors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=83951638;
 //BA.debugLineNum = 83951638;BA.debugLine="orderedDescriptors.Initialize";
_ordereddescriptors.Initialize();
RDebugUtils.currentLine=83951639;
 //BA.debugLineNum = 83951639;BA.debugLine="If preferredDescriptor.IsInitialized And preferre";
if (_preferreddescriptor.IsInitialized() && _preferreddescriptor.getSize()>0) { 
_ordereddescriptors.Add((Object)(_preferreddescriptor.getObject()));};
RDebugUtils.currentLine=83951640;
 //BA.debugLineNum = 83951640;BA.debugLine="For Each descriptorObject As Object In fallbackDe";
{
final anywheresoftware.b4a.BA.IterableList group24 = _fallbackdescriptors;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_descriptorobject = group24.Get(index24);
RDebugUtils.currentLine=83951641;
 //BA.debugLineNum = 83951641;BA.debugLine="orderedDescriptors.Add(descriptorObject)";
_ordereddescriptors.Add(_descriptorobject);
 }
};
RDebugUtils.currentLine=83951643;
 //BA.debugLineNum = 83951643;BA.debugLine="Dim selectedResult As Map";
_selectedresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83951644;
 //BA.debugLineNum = 83951644;BA.debugLine="selectedResult.Initialize";
_selectedresult.Initialize();
RDebugUtils.currentLine=83951645;
 //BA.debugLineNum = 83951645;BA.debugLine="For Each descriptorObject As Object In orderedDes";
{
final anywheresoftware.b4a.BA.IterableList group29 = _ordereddescriptors;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_descriptorobject = group29.Get(index29);
RDebugUtils.currentLine=83951646;
 //BA.debugLineNum = 83951646;BA.debugLine="If (descriptorObject Is Map) = False Then Contin";
if ((_descriptorobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=83951647;
 //BA.debugLineNum = 83951647;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=83951648;
 //BA.debugLineNum = 83951648;BA.debugLine="Dim playlistId As String = descriptor.GetDefault";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=83951649;
 //BA.debugLineNum = 83951649;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=83951650;
 //BA.debugLineNum = 83951650;BA.debugLine="Dim cachedTrack As Map = ResolveOrderedCachedTra";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = __ref._resolveorderedcachedtrackfromplaylistbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid,_mediacacheservice);
RDebugUtils.currentLine=83951651;
 //BA.debugLineNum = 83951651;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
if (_cachedtrack.IsInitialized()==__c.False || _cachedtrack.getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=83951652;
 //BA.debugLineNum = 83951652;BA.debugLine="selectedResult = BuildSlotFallbackResult(descrip";
_selectedresult = __ref._buildslotfallbackresult /*anywheresoftware.b4a.objects.collections.Map*/ (null,_descriptor,_cachedtrack,(_playlistid).equals(_preferredplaylistid));
RDebugUtils.currentLine=83951653;
 //BA.debugLineNum = 83951653;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=83951655;
 //BA.debugLineNum = 83951655;BA.debugLine="If selectedResult.IsInitialized And selectedResul";
if (_selectedresult.IsInitialized() && _selectedresult.getSize()>0) { 
if (true) return _selectedresult;};
RDebugUtils.currentLine=83951656;
 //BA.debugLineNum = 83951656;BA.debugLine="Return emptyResult";
if (true) return _emptyresult;
RDebugUtils.currentLine=83951657;
 //BA.debugLineNum = 83951657;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=34144260;
 //BA.debugLineNum = 34144260;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=34144261;
 //BA.debugLineNum = 34144261;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=34144263;
 //BA.debugLineNum = 34144263;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=34144264;
 //BA.debugLineNum = 34144264;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Public Sub ChooseNextPlaylistDescriptor(currentSlo";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="Dim emptyDescriptor As Map";
_emptydescriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="emptyDescriptor.Initialize";
_emptydescriptor.Initialize();
RDebugUtils.currentLine=32702467;
 //BA.debugLineNum = 32702467;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=32702468;
 //BA.debugLineNum = 32702468;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptydescriptor;};
RDebugUtils.currentLine=32702469;
 //BA.debugLineNum = 32702469;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
_slotkey = __ref._builddataslotkey /*String*/ (null,_currentslot);
RDebugUtils.currentLine=32702470;
 //BA.debugLineNum = 32702470;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
_cursorvalue = (int)(BA.ObjectToNumber(_workingcursors.GetDefault((Object)(_slotkey),__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_slotkey),(Object)(0)))));
RDebugUtils.currentLine=32702471;
 //BA.debugLineNum = 32702471;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
if (_cursorvalue<0) { 
_cursorvalue = (int) (0);};
RDebugUtils.currentLine=32702472;
 //BA.debugLineNum = 32702472;BA.debugLine="Dim playlistIndexForSlot As Int = cursorValue Mod";
_playlistindexforslot = (int) (_cursorvalue%_playlists.getSize());
RDebugUtils.currentLine=32702473;
 //BA.debugLineNum = 32702473;BA.debugLine="workingCursors.Put(slotKey, playlistIndexForSlot";
_workingcursors.Put((Object)(_slotkey),(Object)(_playlistindexforslot+1));
RDebugUtils.currentLine=32702474;
 //BA.debugLineNum = 32702474;BA.debugLine="Dim playlistObject As Object = playlists.Get(play";
_playlistobject = _playlists.Get(_playlistindexforslot);
RDebugUtils.currentLine=32702475;
 //BA.debugLineNum = 32702475;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=32702476;
 //BA.debugLineNum = 32702476;BA.debugLine="Dim playlistSource As Map = playlistObject";
_playlistsource = new anywheresoftware.b4a.objects.collections.Map();
_playlistsource = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=32702477;
 //BA.debugLineNum = 32702477;BA.debugLine="Dim playlist As Map = CloneMap(playlistSource)";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistsource);
RDebugUtils.currentLine=32702478;
 //BA.debugLineNum = 32702478;BA.debugLine="playlist.Put(\"_slot_key\", slotKey)";
_playlist.Put((Object)("_slot_key"),(Object)(_slotkey));
RDebugUtils.currentLine=32702479;
 //BA.debugLineNum = 32702479;BA.debugLine="playlist.Put(\"_playlist_index\", playlistIndexFor";
_playlist.Put((Object)("_playlist_index"),(Object)(_playlistindexforslot));
RDebugUtils.currentLine=32702480;
 //BA.debugLineNum = 32702480;BA.debugLine="Return playlist";
if (true) return _playlist;
 };
RDebugUtils.currentLine=32702482;
 //BA.debugLineNum = 32702482;BA.debugLine="Return emptyDescriptor";
if (true) return _emptydescriptor;
RDebugUtils.currentLine=32702483;
 //BA.debugLineNum = 32702483;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=32112643;
 //BA.debugLineNum = 32112643;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=32112644;
 //BA.debugLineNum = 32112644;BA.debugLine="Private playlistCursors As Map";
_playlistcursors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32112645;
 //BA.debugLineNum = 32112645;BA.debugLine="Private storageRef As KeyValueStore";
_storageref = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=32112646;
 //BA.debugLineNum = 32112646;BA.debugLine="End Sub";
return "";
}
public String  _playlisttrackindexkey(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlisttrackindexkey", false))
	 {return ((String) Debug.delegate(ba, "playlisttrackindexkey", new Object[] {_playlistid}));}
RDebugUtils.currentLine=87883776;
 //BA.debugLineNum = 87883776;BA.debugLine="Private Sub PlaylistTrackIndexKey(playlistId As St";
RDebugUtils.currentLine=87883777;
 //BA.debugLineNum = 87883777;BA.debugLine="Return \"playlist_track_index_\" & playlistId";
if (true) return "playlist_track_index_"+_playlistid;
RDebugUtils.currentLine=87883778;
 //BA.debugLineNum = 87883778;BA.debugLine="End Sub";
return "";
}
public String  _playlistplaybackcursorkey(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistplaybackcursorkey", false))
	 {return ((String) Debug.delegate(ba, "playlistplaybackcursorkey", new Object[] {_playlistid}));}
RDebugUtils.currentLine=87162880;
 //BA.debugLineNum = 87162880;BA.debugLine="Private Sub PlaylistPlaybackCursorKey(playlistId A";
RDebugUtils.currentLine=87162881;
 //BA.debugLineNum = 87162881;BA.debugLine="Return \"playlist_playback_cursor_\" & playlistId";
if (true) return "playlist_playback_cursor_"+_playlistid;
RDebugUtils.currentLine=87162882;
 //BA.debugLineNum = 87162882;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.dataplaybackresolver __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=34275332;
 //BA.debugLineNum = 34275332;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=34209795;
 //BA.debugLineNum = 34209795;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=34209796;
 //BA.debugLineNum = 34209796;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=34078723;
 //BA.debugLineNum = 34078723;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=34078724;
 //BA.debugLineNum = 34078724;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Private Sub ResolvePlaybackStreamTitle(currentSlot";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="Dim streamTitle As String = currentSlot.GetDefaul";
_streamtitle = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
RDebugUtils.currentLine=33226755;
 //BA.debugLineNum = 33226755;BA.debugLine="Dim resolvedStreamTitle As String = ResolveOfflin";
_resolvedstreamtitle = __ref._resolveofflinestreamtitle /*String*/ (null,_currentslot,_offlinedata);
RDebugUtils.currentLine=33226756;
 //BA.debugLineNum = 33226756;BA.debugLine="If resolvedStreamTitle <> \"\" Then Return resolved";
if ((_resolvedstreamtitle).equals("") == false) { 
if (true) return _resolvedstreamtitle;};
RDebugUtils.currentLine=33226757;
 //BA.debugLineNum = 33226757;BA.debugLine="Dim scheduleTitle As String = currentSlot.GetDefa";
_scheduletitle = BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=33226758;
 //BA.debugLineNum = 33226758;BA.debugLine="Dim descriptorStreamTitle As String = playlistDes";
_descriptorstreamtitle = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=33226759;
 //BA.debugLineNum = 33226759;BA.debugLine="If descriptorStreamTitle <> \"\" Then Return descri";
if ((_descriptorstreamtitle).equals("") == false) { 
if (true) return _descriptorstreamtitle;};
RDebugUtils.currentLine=33226760;
 //BA.debugLineNum = 33226760;BA.debugLine="If scheduleTitle <> \"\" Then Return scheduleTitle";
if ((_scheduletitle).equals("") == false) { 
if (true) return _scheduletitle;};
RDebugUtils.currentLine=33226761;
 //BA.debugLineNum = 33226761;BA.debugLine="Return playlistDescriptor.GetDefault(\"title\", \"\")";
if (true) return BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=33226762;
 //BA.debugLineNum = 33226762;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=33357827;
 //BA.debugLineNum = 33357827;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=33357828;
 //BA.debugLineNum = 33357828;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=33357829;
 //BA.debugLineNum = 33357829;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=33357830;
 //BA.debugLineNum = 33357830;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=33357831;
 //BA.debugLineNum = 33357831;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=33357833;
 //BA.debugLineNum = 33357833;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=33357834;
 //BA.debugLineNum = 33357834;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=33357835;
 //BA.debugLineNum = 33357835;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=33357836;
 //BA.debugLineNum = 33357836;BA.debugLine="End Sub";
return null;
}
public String  _formatisodate(b4j.example.dataplaybackresolver __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "formatisodate", false))
	 {return ((String) Debug.delegate(ba, "formatisodate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=33751043;
 //BA.debugLineNum = 33751043;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=33751045;
 //BA.debugLineNum = 33751045;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=33751046;
 //BA.debugLineNum = 33751046;BA.debugLine="End Sub";
return "";
}
public String  _getofflineplaylistsdir(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Private Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="Return File.Combine(storageDir, \"playlists\")";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getplaylistplaybackmanifestbyid(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "getplaylistplaybackmanifestbyid", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getplaylistplaybackmanifestbyid", new Object[] {_playlistid}));}
RDebugUtils.currentLine=90046464;
 //BA.debugLineNum = 90046464;BA.debugLine="Public Sub GetPlaylistPlaybackManifestById(playlis";
RDebugUtils.currentLine=90046465;
 //BA.debugLineNum = 90046465;BA.debugLine="Return LoadOrBuildPlaylistPlaybackManifestById(pl";
if (true) return __ref._loadorbuildplaylistplaybackmanifestbyid /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=90046466;
 //BA.debugLineNum = 90046466;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=87359488;
 //BA.debugLineNum = 87359488;BA.debugLine="Private Sub LoadOrBuildPlaylistPlaybackManifestByI";
RDebugUtils.currentLine=87359489;
 //BA.debugLineNum = 87359489;BA.debugLine="Dim manifest As Map";
_manifest = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87359490;
 //BA.debugLineNum = 87359490;BA.debugLine="manifest.Initialize";
_manifest.Initialize();
RDebugUtils.currentLine=87359491;
 //BA.debugLineNum = 87359491;BA.debugLine="If playlistId = \"\" Then Return manifest";
if ((_playlistid).equals("")) { 
if (true) return _manifest;};
RDebugUtils.currentLine=87359492;
 //BA.debugLineNum = 87359492;BA.debugLine="Dim storedManifest As Map = storageRef.GetDefault";
_storedmanifest = new anywheresoftware.b4a.objects.collections.Map();
_storedmanifest = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._storageref /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._playlistplaybackmanifestkey /*String*/ (null,_playlistid),__c.Null)));
RDebugUtils.currentLine=87359493;
 //BA.debugLineNum = 87359493;BA.debugLine="If storedManifest.IsInitialized Then";
if (_storedmanifest.IsInitialized()) { 
RDebugUtils.currentLine=87359494;
 //BA.debugLineNum = 87359494;BA.debugLine="Dim storedOrder As List = storedManifest.GetDefa";
_storedorder = new anywheresoftware.b4a.objects.collections.List();
_storedorder = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_storedmanifest.GetDefault((Object)("order"),__c.Null)));
RDebugUtils.currentLine=87359495;
 //BA.debugLineNum = 87359495;BA.debugLine="Dim storedTracks As Map = storedManifest.GetDefa";
_storedtracks = new anywheresoftware.b4a.objects.collections.Map();
_storedtracks = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storedmanifest.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=87359496;
 //BA.debugLineNum = 87359496;BA.debugLine="If storedOrder.IsInitialized And storedOrder.Siz";
if (_storedorder.IsInitialized() && _storedorder.getSize()>0 && _storedtracks.IsInitialized() && _storedtracks.getSize()>0) { 
RDebugUtils.currentLine=87359497;
 //BA.debugLineNum = 87359497;BA.debugLine="Return storedManifest";
if (true) return _storedmanifest;
 };
 };
RDebugUtils.currentLine=87359500;
 //BA.debugLineNum = 87359500;BA.debugLine="Dim sourcePlaylistData As Map = LoadCachedPlaylis";
_sourceplaylistdata = new anywheresoftware.b4a.objects.collections.Map();
_sourceplaylistdata = __ref._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=87359501;
 //BA.debugLineNum = 87359501;BA.debugLine="If sourcePlaylistData.IsInitialized = False Or so";
if (_sourceplaylistdata.IsInitialized()==__c.False || _sourceplaylistdata.getSize()==0) { 
if (true) return _manifest;};
RDebugUtils.currentLine=87359502;
 //BA.debugLineNum = 87359502;BA.debugLine="manifest = BuildPlaylistPlaybackManifest(sourcePl";
_manifest = __ref._buildplaylistplaybackmanifest /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sourceplaylistdata);
RDebugUtils.currentLine=87359503;
 //BA.debugLineNum = 87359503;BA.debugLine="If manifest.IsInitialized And manifest.Size > 0 T";
if (_manifest.IsInitialized() && _manifest.getSize()>0) { 
RDebugUtils.currentLine=87359504;
 //BA.debugLineNum = 87359504;BA.debugLine="storageRef.Put(PlaylistPlaybackManifestKey(playl";
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,__ref._playlistplaybackmanifestkey /*String*/ (null,_playlistid),(Object)(_manifest.getObject()));
 };
RDebugUtils.currentLine=87359506;
 //BA.debugLineNum = 87359506;BA.debugLine="Return manifest";
if (true) return _manifest;
RDebugUtils.currentLine=87359507;
 //BA.debugLineNum = 87359507;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Private Sub IsoWeekdayFromTicks(ticks As Long) As";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33882116;
 //BA.debugLineNum = 33882116;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
RDebugUtils.currentLine=33882117;
 //BA.debugLineNum = 33882117;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33882118;
 //BA.debugLineNum = 33882118;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
RDebugUtils.currentLine=33882119;
 //BA.debugLineNum = 33882119;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
RDebugUtils.currentLine=33882120;
 //BA.debugLineNum = 33882120;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
RDebugUtils.currentLine=33882121;
 //BA.debugLineNum = 33882121;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
RDebugUtils.currentLine=33882122;
 //BA.debugLineNum = 33882122;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
RDebugUtils.currentLine=33882123;
 //BA.debugLineNum = 33882123;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
RDebugUtils.currentLine=33882124;
 //BA.debugLineNum = 33882124;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
RDebugUtils.currentLine=33882125;
 //BA.debugLineNum = 33882125;BA.debugLine="End Sub";
return "";
}
public String  _playlistmetadatafilename(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Private Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="End Sub";
return "";
}
public String  _playlistplaybackmanifestkey(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistplaybackmanifestkey", false))
	 {return ((String) Debug.delegate(ba, "playlistplaybackmanifestkey", new Object[] {_playlistid}));}
RDebugUtils.currentLine=87097344;
 //BA.debugLineNum = 87097344;BA.debugLine="Private Sub PlaylistPlaybackManifestKey(playlistId";
RDebugUtils.currentLine=87097345;
 //BA.debugLineNum = 87097345;BA.debugLine="Return \"playlist_playback_manifest_\" & playlistId";
if (true) return "playlist_playback_manifest_"+_playlistid;
RDebugUtils.currentLine=87097346;
 //BA.debugLineNum = 87097346;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Private Sub MinutesOfDayFromTicks(ticks As Long) A";
RDebugUtils.currentLine=33816577;
 //BA.debugLineNum = 33816577;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
_timevalue = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=33816580;
 //BA.debugLineNum = 33816580;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=33816581;
 //BA.debugLineNum = 33816581;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=33816582;
 //BA.debugLineNum = 33816582;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=33816583;
 //BA.debugLineNum = 33816583;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
RDebugUtils.currentLine=33816584;
 //BA.debugLineNum = 33816584;BA.debugLine="End Sub";
return 0;
}
public boolean  _scheduleappliestoday(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _schedule,String _todaykey,String _todayweekday) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "scheduleappliestoday", false))
	 {return ((Boolean) Debug.delegate(ba, "scheduleappliestoday", new Object[] {_schedule,_todaykey,_todayweekday}));}
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Private Sub ScheduleAppliesToday(schedule As Map,";
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="Return ScheduleAppliesOnDate(schedule, todayKey,";
if (true) return __ref._scheduleappliesondate /*boolean*/ (null,_schedule,_todaykey,_todayweekday);
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
RDebugUtils.currentLine=33947651;
 //BA.debugLineNum = 33947651;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="Try";
try {RDebugUtils.currentLine=33947653;
 //BA.debugLineNum = 33947653;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
RDebugUtils.currentLine=33947654;
 //BA.debugLineNum = 33947654;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=33947655;
 //BA.debugLineNum = 33947655;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=33947656;
 //BA.debugLineNum = 33947656;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=33947657;
 //BA.debugLineNum = 33947657;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=33947659;
 //BA.debugLineNum = 33947659;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
RDebugUtils.currentLine=33947661;
 //BA.debugLineNum = 33947661;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvenextdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextdataslot", new Object[] {_offlinedata}));}
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub ResolveNextDataSlot(offlineData As Map)";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="Return ResolveNextDataSlotAtTicks(offlineData, Da";
if (true) return __ref._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,__c.DateTime.getNow());
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Private Sub StartOfDayTicks(ticks As Long) As Long";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=34013187;
 //BA.debugLineNum = 34013187;BA.debugLine="Dim dayKey As String = DateTime.Date(ticks)";
_daykey = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=34013188;
 //BA.debugLineNum = 34013188;BA.debugLine="Dim dayTicks As Long = DateTime.DateParse(dayKey)";
_dayticks = __c.DateTime.DateParse(_daykey);
RDebugUtils.currentLine=34013189;
 //BA.debugLineNum = 34013189;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=34013190;
 //BA.debugLineNum = 34013190;BA.debugLine="Return dayTicks";
if (true) return _dayticks;
RDebugUtils.currentLine=34013191;
 //BA.debugLineNum = 34013191;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Private Sub ScheduleAppliesOnDate(schedule As Map,";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="Dim startDate As String = schedule.GetDefault(\"st";
_startdate = BA.ObjectToString(_schedule.GetDefault((Object)("start"),(Object)("")));
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(target";
if ((_startdate).equals("") == false && _startdate.compareTo(_targetdatekey)>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="Dim weekdays As List = schedule.GetDefault(\"weekd";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("weekdays"),__c.Null)));
RDebugUtils.currentLine=33488900;
 //BA.debugLineNum = 33488900;BA.debugLine="If weekdays.IsInitialized = False Or weekdays.Siz";
if (_weekdays.IsInitialized()==__c.False || _weekdays.getSize()==0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=33488901;
 //BA.debugLineNum = 33488901;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group5 = _weekdays;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_weekdayobject = group5.Get(index5);
RDebugUtils.currentLine=33488902;
 //BA.debugLineNum = 33488902;BA.debugLine="If (\"\" & weekdayObject).Trim = targetWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_targetweekday)) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=33488904;
 //BA.debugLineNum = 33488904;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=33488905;
 //BA.debugLineNum = 33488905;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Private Sub ResolveOfflineStreamTitle(currentSlot";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="Dim targetStreamId As String = currentSlot.GetDef";
_targetstreamid = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=33292291;
 //BA.debugLineNum = 33292291;BA.debugLine="Dim targetSlotTime As String = currentSlot.GetDef";
_targetslottime = BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=33292292;
 //BA.debugLineNum = 33292292;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=33292293;
 //BA.debugLineNum = 33292293;BA.debugLine="If schedules.IsInitialized = False Then Return \"\"";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=33292294;
 //BA.debugLineNum = 33292294;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group6 = _schedules;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_scheduleobject = group6.Get(index6);
RDebugUtils.currentLine=33292295;
 //BA.debugLineNum = 33292295;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=33292296;
 //BA.debugLineNum = 33292296;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=33292297;
 //BA.debugLineNum = 33292297;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=33292298;
 //BA.debugLineNum = 33292298;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=33292299;
 //BA.debugLineNum = 33292299;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group11 = _slots;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.Get(index11);
RDebugUtils.currentLine=33292300;
 //BA.debugLineNum = 33292300;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=33292301;
 //BA.debugLineNum = 33292301;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=33292302;
 //BA.debugLineNum = 33292302;BA.debugLine="If targetSlotTime <> \"\" And slot.GetDefault(\"";
if ((_targetslottime).equals("") == false && (_slot.GetDefault((Object)("time"),(Object)(""))).equals((Object)(_targetslottime)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=33292303;
 //BA.debugLineNum = 33292303;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=33292304;
 //BA.debugLineNum = 33292304;BA.debugLine="If targetStreamId <> \"\" And streamData.GetDef";
if ((_targetstreamid).equals("") == false && (_streamdata.GetDefault((Object)("id"),(Object)(""))).equals((Object)(_targetstreamid)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=33292305;
 //BA.debugLineNum = 33292305;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=33292306;
 //BA.debugLineNum = 33292306;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=33292311;
 //BA.debugLineNum = 33292311;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=33292312;
 //BA.debugLineNum = 33292312;BA.debugLine="End Sub";
return "";
}
}