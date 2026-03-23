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
public anywheresoftware.b4a.objects.collections.List _recenttrackids = null;
public b4j.example.keyvaluestore _storageref = null;
public anywheresoftware.b4a.objects.collections.Map _lasttrackbyplaylist = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
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
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Public Sub ResolveDataSlotAtTicks(offlineData As M";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Dim slotContext As Map";
_slotcontext = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="slotContext.Initialize";
_slotcontext.Initialize();
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=22085637;
 //BA.debugLineNum = 22085637;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=22085638;
 //BA.debugLineNum = 22085638;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
_todaykey = __ref._formatisodate /*String*/ (null,_targetticks);
RDebugUtils.currentLine=22085639;
 //BA.debugLineNum = 22085639;BA.debugLine="Dim nowMinutes As Int = MinutesOfDayFromTicks(tar";
_nowminutes = __ref._minutesofdayfromticks /*int*/ (null,_targetticks);
RDebugUtils.currentLine=22085640;
 //BA.debugLineNum = 22085640;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTicks(";
_todayweekday = __ref._isoweekdayfromticks /*String*/ (null,_targetticks);
RDebugUtils.currentLine=22085641;
 //BA.debugLineNum = 22085641;BA.debugLine="Dim matchedSlots As List";
_matchedslots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22085642;
 //BA.debugLineNum = 22085642;BA.debugLine="matchedSlots.Initialize";
_matchedslots.Initialize();
RDebugUtils.currentLine=22085643;
 //BA.debugLineNum = 22085643;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group11 = _schedules;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_scheduleobject = group11.Get(index11);
RDebugUtils.currentLine=22085644;
 //BA.debugLineNum = 22085644;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22085645;
 //BA.debugLineNum = 22085645;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=22085646;
 //BA.debugLineNum = 22085646;BA.debugLine="If ScheduleAppliesToday(schedule, todayKey, tod";
if (__ref._scheduleappliestoday /*boolean*/ (null,_schedule,_todaykey,_todayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=22085647;
 //BA.debugLineNum = 22085647;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=22085648;
 //BA.debugLineNum = 22085648;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=22085649;
 //BA.debugLineNum = 22085649;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=22085650;
 //BA.debugLineNum = 22085650;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group18 = _slots;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_slotobject = group18.Get(index18);
RDebugUtils.currentLine=22085651;
 //BA.debugLineNum = 22085651;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22085652;
 //BA.debugLineNum = 22085652;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=22085653;
 //BA.debugLineNum = 22085653;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=22085654;
 //BA.debugLineNum = 22085654;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes(";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=22085655;
 //BA.debugLineNum = 22085655;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=22085656;
 //BA.debugLineNum = 22085656;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=22085657;
 //BA.debugLineNum = 22085657;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22085658;
 //BA.debugLineNum = 22085658;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=22085659;
 //BA.debugLineNum = 22085659;BA.debugLine="entry.Put(\"schedule_title\", scheduleTitle)";
_entry.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=22085660;
 //BA.debugLineNum = 22085660;BA.debugLine="entry.Put(\"slot_time\", slotTime)";
_entry.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=22085661;
 //BA.debugLineNum = 22085661;BA.debugLine="entry.Put(\"slot_minutes\", slotMinutes)";
_entry.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=22085662;
 //BA.debugLineNum = 22085662;BA.debugLine="entry.Put(\"stream_id\", streamData.GetDefault(";
_entry.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=22085663;
 //BA.debugLineNum = 22085663;BA.debugLine="entry.Put(\"stream_title\", streamData.GetDefau";
_entry.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=22085664;
 //BA.debugLineNum = 22085664;BA.debugLine="entry.Put(\"playlists\", streamData.GetDefault(";
_entry.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=22085665;
 //BA.debugLineNum = 22085665;BA.debugLine="matchedSlots.Add(entry)";
_matchedslots.Add((Object)(_entry.getObject()));
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=22085670;
 //BA.debugLineNum = 22085670;BA.debugLine="If matchedSlots.Size = 0 Then Return slotContext";
if (_matchedslots.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=22085671;
 //BA.debugLineNum = 22085671;BA.debugLine="Dim selectedSlot As Map";
_selectedslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22085672;
 //BA.debugLineNum = 22085672;BA.debugLine="selectedSlot.Initialize";
_selectedslot.Initialize();
RDebugUtils.currentLine=22085673;
 //BA.debugLineNum = 22085673;BA.debugLine="Dim selectedMinutes As Int = -1";
_selectedminutes = (int) (-1);
RDebugUtils.currentLine=22085674;
 //BA.debugLineNum = 22085674;BA.debugLine="For Each slotEntryObject As Object In matchedSlot";
{
final anywheresoftware.b4a.BA.IterableList group42 = _matchedslots;
final int groupLen42 = group42.getSize()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_slotentryobject = group42.Get(index42);
RDebugUtils.currentLine=22085675;
 //BA.debugLineNum = 22085675;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=22085676;
 //BA.debugLineNum = 22085676;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"s";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=22085677;
 //BA.debugLineNum = 22085677;BA.debugLine="If slotMinutes <= nowMinutes And slotMinutes >=";
if (_slotminutes<=_nowminutes && _slotminutes>=_selectedminutes) { 
RDebugUtils.currentLine=22085678;
 //BA.debugLineNum = 22085678;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=22085679;
 //BA.debugLineNum = 22085679;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
RDebugUtils.currentLine=22085682;
 //BA.debugLineNum = 22085682;BA.debugLine="If selectedSlot.Size = 0 Then";
if (_selectedslot.getSize()==0) { 
RDebugUtils.currentLine=22085683;
 //BA.debugLineNum = 22085683;BA.debugLine="selectedMinutes = 24 * 60 + 1";
_selectedminutes = (int) (24*60+1);
RDebugUtils.currentLine=22085684;
 //BA.debugLineNum = 22085684;BA.debugLine="For Each slotEntryObject As Object In matchedSlo";
{
final anywheresoftware.b4a.BA.IterableList group52 = _matchedslots;
final int groupLen52 = group52.getSize()
;int index52 = 0;
;
for (; index52 < groupLen52;index52++){
_slotentryobject = group52.Get(index52);
RDebugUtils.currentLine=22085685;
 //BA.debugLineNum = 22085685;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=22085686;
 //BA.debugLineNum = 22085686;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=22085687;
 //BA.debugLineNum = 22085687;BA.debugLine="If slotMinutes > nowMinutes And slotMinutes < s";
if (_slotminutes>_nowminutes && _slotminutes<_selectedminutes) { 
RDebugUtils.currentLine=22085688;
 //BA.debugLineNum = 22085688;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=22085689;
 //BA.debugLineNum = 22085689;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
 };
RDebugUtils.currentLine=22085693;
 //BA.debugLineNum = 22085693;BA.debugLine="Return selectedSlot";
if (true) return _selectedslot;
RDebugUtils.currentLine=22085694;
 //BA.debugLineNum = 22085694;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _loadcachedplaylistmetadata(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "loadcachedplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadcachedplaylistmetadata", new Object[] {_playlistid}));}
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _parseddata = null;
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Dim playlistData As Map";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="If playlistId = \"\" Then Return playlistData";
if ((_playlistid).equals("")) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistMe";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=22347781;
 //BA.debugLineNum = 22347781;BA.debugLine="Try";
try {RDebugUtils.currentLine=22347782;
 //BA.debugLineNum = 22347782;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=22347783;
 //BA.debugLineNum = 22347783;BA.debugLine="parser.Initialize(File.ReadString(GetOfflinePlay";
_parser.Initialize(__c.File.ReadString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid)));
RDebugUtils.currentLine=22347784;
 //BA.debugLineNum = 22347784;BA.debugLine="Dim parsedData As Map = parser.NextObject";
_parseddata = new anywheresoftware.b4a.objects.collections.Map();
_parseddata = _parser.NextObject();
RDebugUtils.currentLine=22347785;
 //BA.debugLineNum = 22347785;BA.debugLine="If parsedData.IsInitialized Then playlistData =";
if (_parseddata.IsInitialized()) { 
_playlistdata = _parseddata;};
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=22347787;
 //BA.debugLineNum = 22347787;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=22347788;
 //BA.debugLineNum = 22347788;BA.debugLine="Trace(\"Не удалось загрузить playlist metadata из";
__ref._trace /*String*/ (null,"Не удалось загрузить playlist metadata из кэша. id="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=22347790;
 //BA.debugLineNum = 22347790;BA.debugLine="Return playlistData";
if (true) return _playlistdata;
RDebugUtils.currentLine=22347791;
 //BA.debugLineNum = 22347791;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,Object _targetmodulevalue,String _tracesubnamevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_targetmodulevalue,_tracesubnamevalue}));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Public Sub Initialize(storageDirValue As String, t";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="playlistCursors.Initialize";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="recentTrackIds.Initialize";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="lastTrackByPlaylist.Initialize";
__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="End Sub";
return "";
}
public String  _loadstate(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "loadstate", false))
	 {return ((String) Debug.delegate(ba, "loadstate", new Object[] {_storage}));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub LoadState(storage As KeyValueStore)";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="storageRef = storage";
__ref._storageref /*b4j.example.keyvaluestore*/  = _storage;
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="playlistCursors = storage.GetDefault(\"data_slot_p";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ (null,"data_slot_playlist_cursors",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="If playlistCursors.IsInitialized = False Then pla";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="recentTrackIds = storage.GetDefault(\"data_recent_";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_storage._getdefault /*Object*/ (null,"data_recent_track_ids",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="If recentTrackIds.IsInitialized = False Then rece";
if (__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="lastTrackByPlaylist = storage.GetDefault(\"data_la";
__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ (null,"data_last_track_by_playlist",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="If lastTrackByPlaylist.IsInitialized = False Then";
if (__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=21823496;
 //BA.debugLineNum = 21823496;BA.debugLine="End Sub";
return "";
}
public int  _cursorcount(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cursorcount", false))
	 {return ((Integer) Debug.delegate(ba, "cursorcount", null));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Public Sub CursorCount As Int";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="If playlistCursors.IsInitialized = False Then Ret";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="Return playlistCursors.Size";
if (true) return __ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="End Sub";
return 0;
}
public String  _commitplaylistcursor(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "commitplaylistcursor", false))
	 {return ((String) Debug.delegate(ba, "commitplaylistcursor", new Object[] {_storage,_item}));}
String _slotkey = "";
int _nextstored = 0;
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub CommitPlaylistCursor(storage As KeyValu";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return "";};
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_key";
_slotkey = BA.ObjectToString(_item.GetDefault((Object)("slot_key"),(Object)("")));
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="If slotKey = \"\" Then Return";
if ((_slotkey).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="Dim nextStored As Int = item.GetDefault(\"playlist";
_nextstored = (int) ((double)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_index"),(Object)(0))))+1);
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="playlistCursors.Put(slotKey, nextStored)";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_slotkey),(Object)(_nextstored));
RDebugUtils.currentLine=22544391;
 //BA.debugLineNum = 22544391;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ (null,"data_slot_playlist_cursors",(Object)(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=22544392;
 //BA.debugLineNum = 22544392;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolvecurrentdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvecurrentdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvecurrentdataslot", new Object[] {_offlinedata}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Public Sub ResolveCurrentDataSlot(offlineData As M";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Return ResolveDataSlotAtTicks(offlineData, DateTi";
if (true) return __ref._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,__c.DateTime.getNow());
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(offlineData";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="Dim nextSlot As Map";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=22216709;
 //BA.debugLineNum = 22216709;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="Dim nowTicks As Long = referenceTicks";
_nowticks = _referenceticks;
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="Dim bestSlotTicks As Long = 0";
_bestslotticks = (long) (0);
RDebugUtils.currentLine=22216712;
 //BA.debugLineNum = 22216712;BA.debugLine="For dayOffset = 0 To 7";
{
final int step8 = 1;
final int limit8 = (int) (7);
_dayoffset = (int) (0) ;
for (;_dayoffset <= limit8 ;_dayoffset = _dayoffset + step8 ) {
RDebugUtils.currentLine=22216713;
 //BA.debugLineNum = 22216713;BA.debugLine="Dim dayTicks As Long = StartOfDayTicks(nowTicks";
_dayticks = __ref._startofdayticks /*long*/ (null,(long) (_nowticks+_dayoffset*__c.DateTime.TicksPerDay));
RDebugUtils.currentLine=22216714;
 //BA.debugLineNum = 22216714;BA.debugLine="Dim dayKey As String = FormatIsoDate(dayTicks)";
_daykey = __ref._formatisodate /*String*/ (null,_dayticks);
RDebugUtils.currentLine=22216715;
 //BA.debugLineNum = 22216715;BA.debugLine="Dim dayWeekday As String = IsoWeekdayFromTicks(d";
_dayweekday = __ref._isoweekdayfromticks /*String*/ (null,_dayticks);
RDebugUtils.currentLine=22216716;
 //BA.debugLineNum = 22216716;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group12 = _schedules;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_scheduleobject = group12.Get(index12);
RDebugUtils.currentLine=22216717;
 //BA.debugLineNum = 22216717;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22216718;
 //BA.debugLineNum = 22216718;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=22216719;
 //BA.debugLineNum = 22216719;BA.debugLine="If ScheduleAppliesOnDate(schedule, dayKey, day";
if (__ref._scheduleappliesondate /*boolean*/ (null,_schedule,_daykey,_dayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=22216720;
 //BA.debugLineNum = 22216720;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefa";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=22216721;
 //BA.debugLineNum = 22216721;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=22216722;
 //BA.debugLineNum = 22216722;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=22216723;
 //BA.debugLineNum = 22216723;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group19 = _slots;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_slotobject = group19.Get(index19);
RDebugUtils.currentLine=22216724;
 //BA.debugLineNum = 22216724;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22216725;
 //BA.debugLineNum = 22216725;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=22216726;
 //BA.debugLineNum = 22216726;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"ti";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=22216727;
 //BA.debugLineNum = 22216727;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=22216728;
 //BA.debugLineNum = 22216728;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=22216729;
 //BA.debugLineNum = 22216729;BA.debugLine="Dim slotTicks As Long = dayTicks + slotMinut";
_slotticks = (long) (_dayticks+_slotminutes*__c.DateTime.TicksPerMinute);
RDebugUtils.currentLine=22216730;
 //BA.debugLineNum = 22216730;BA.debugLine="If slotTicks <= nowTicks Then Continue";
if (_slotticks<=_nowticks) { 
if (true) continue;};
RDebugUtils.currentLine=22216731;
 //BA.debugLineNum = 22216731;BA.debugLine="If bestSlotTicks > 0 And slotTicks >= bestSl";
if (_bestslotticks>0 && _slotticks>=_bestslotticks) { 
if (true) continue;};
RDebugUtils.currentLine=22216732;
 //BA.debugLineNum = 22216732;BA.debugLine="Dim streamData As Map = ExtractSlotStreamDat";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=22216733;
 //BA.debugLineNum = 22216733;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=22216734;
 //BA.debugLineNum = 22216734;BA.debugLine="nextSlot.Put(\"schedule_title\", scheduleTitle";
_nextslot.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=22216735;
 //BA.debugLineNum = 22216735;BA.debugLine="nextSlot.Put(\"slot_time\", slotTime)";
_nextslot.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=22216736;
 //BA.debugLineNum = 22216736;BA.debugLine="nextSlot.Put(\"slot_minutes\", slotMinutes)";
_nextslot.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=22216737;
 //BA.debugLineNum = 22216737;BA.debugLine="nextSlot.Put(\"slot_ticks\", slotTicks)";
_nextslot.Put((Object)("slot_ticks"),(Object)(_slotticks));
RDebugUtils.currentLine=22216738;
 //BA.debugLineNum = 22216738;BA.debugLine="nextSlot.Put(\"stream_id\", streamData.GetDefa";
_nextslot.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=22216739;
 //BA.debugLineNum = 22216739;BA.debugLine="nextSlot.Put(\"stream_title\", streamData.GetD";
_nextslot.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=22216740;
 //BA.debugLineNum = 22216740;BA.debugLine="nextSlot.Put(\"playlists\", streamData.GetDefa";
_nextslot.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=22216741;
 //BA.debugLineNum = 22216741;BA.debugLine="bestSlotTicks = slotTicks";
_bestslotticks = _slotticks;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=22216746;
 //BA.debugLineNum = 22216746;BA.debugLine="If nextSlot.IsInitialized And nextSlot.Size > 0";
if (_nextslot.IsInitialized() && _nextslot.getSize()>0) { 
if (true) break;};
 }
};
RDebugUtils.currentLine=22216748;
 //BA.debugLineNum = 22216748;BA.debugLine="Return nextSlot";
if (true) return _nextslot;
RDebugUtils.currentLine=22216749;
 //BA.debugLineNum = 22216749;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _cloneplaylistcursors(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cloneplaylistcursors", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "cloneplaylistcursors", null));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub ClonePlaylistCursors As Map";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="Return CloneMap(playlistCursors)";
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Public Sub ChooseNextPlaylistDescriptor(currentSlo";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Dim emptyDescriptor As Map";
_emptydescriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="emptyDescriptor.Initialize";
_emptydescriptor.Initialize();
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptydescriptor;};
RDebugUtils.currentLine=22282245;
 //BA.debugLineNum = 22282245;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
_slotkey = __ref._builddataslotkey /*String*/ (null,_currentslot);
RDebugUtils.currentLine=22282246;
 //BA.debugLineNum = 22282246;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
_cursorvalue = (int)(BA.ObjectToNumber(_workingcursors.GetDefault((Object)(_slotkey),__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_slotkey),(Object)(0)))));
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
if (_cursorvalue<0) { 
_cursorvalue = (int) (0);};
RDebugUtils.currentLine=22282248;
 //BA.debugLineNum = 22282248;BA.debugLine="Dim playlistIndexForSlot As Int = cursorValue Mod";
_playlistindexforslot = (int) (_cursorvalue%_playlists.getSize());
RDebugUtils.currentLine=22282249;
 //BA.debugLineNum = 22282249;BA.debugLine="workingCursors.Put(slotKey, playlistIndexForSlot";
_workingcursors.Put((Object)(_slotkey),(Object)(_playlistindexforslot+1));
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="Dim playlistObject As Object = playlists.Get(play";
_playlistobject = _playlists.Get(_playlistindexforslot);
RDebugUtils.currentLine=22282251;
 //BA.debugLineNum = 22282251;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22282252;
 //BA.debugLineNum = 22282252;BA.debugLine="Dim playlistSource As Map = playlistObject";
_playlistsource = new anywheresoftware.b4a.objects.collections.Map();
_playlistsource = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=22282253;
 //BA.debugLineNum = 22282253;BA.debugLine="Dim playlist As Map = CloneMap(playlistSource)";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistsource);
RDebugUtils.currentLine=22282254;
 //BA.debugLineNum = 22282254;BA.debugLine="playlist.Put(\"_slot_key\", slotKey)";
_playlist.Put((Object)("_slot_key"),(Object)(_slotkey));
RDebugUtils.currentLine=22282255;
 //BA.debugLineNum = 22282255;BA.debugLine="playlist.Put(\"_playlist_index\", playlistIndexFor";
_playlist.Put((Object)("_playlist_index"),(Object)(_playlistindexforslot));
RDebugUtils.currentLine=22282256;
 //BA.debugLineNum = 22282256;BA.debugLine="Return playlist";
if (true) return _playlist;
 };
RDebugUtils.currentLine=22282258;
 //BA.debugLineNum = 22282258;BA.debugLine="Return emptyDescriptor";
if (true) return _emptydescriptor;
RDebugUtils.currentLine=22282259;
 //BA.debugLineNum = 22282259;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _chooserandomtrackfromplaylist(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata,b4j.example.mediacache _mediacacheservice,boolean _cachedonly) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "chooserandomtrackfromplaylist", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "chooserandomtrackfromplaylist", new Object[] {_playlistdata,_mediacacheservice,_cachedonly}));}
anywheresoftware.b4a.objects.collections.Map _emptytrack = null;
String _playlistid = "";
String _lasttrackid = "";
anywheresoftware.b4a.objects.collections.List _tracks = null;
anywheresoftware.b4a.objects.collections.List _cachedtracks = null;
anywheresoftware.b4a.objects.collections.List _filteredcachedtracks = null;
anywheresoftware.b4a.objects.collections.List _nonrepeatedcachedtracks = null;
anywheresoftware.b4a.objects.collections.List _filteredtracks = null;
anywheresoftware.b4a.objects.collections.List _nonrepeatedtracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
boolean _trackiscached = false;
anywheresoftware.b4a.objects.collections.List _sourcetracks = null;
int _randomindex = 0;
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Public Sub ChooseRandomTrackFromPlaylist(playlistD";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Dim emptyTrack As Map";
_emptytrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="emptyTrack.Initialize";
_emptytrack.Initialize();
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="Dim playlistId As String = playlistData.GetDefaul";
_playlistid = BA.ObjectToString(_playlistdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=22413317;
 //BA.debugLineNum = 22413317;BA.debugLine="Dim lastTrackId As String = \"\"";
_lasttrackid = "";
RDebugUtils.currentLine=22413318;
 //BA.debugLineNum = 22413318;BA.debugLine="If playlistId <> \"\" Then lastTrackId = lastTrackB";
if ((_playlistid).equals("") == false) { 
_lasttrackid = BA.ObjectToString(__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_playlistid),(Object)("")));};
RDebugUtils.currentLine=22413319;
 //BA.debugLineNum = 22413319;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=22413321;
 //BA.debugLineNum = 22413321;BA.debugLine="Dim cachedTracks As List";
_cachedtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22413322;
 //BA.debugLineNum = 22413322;BA.debugLine="cachedTracks.Initialize";
_cachedtracks.Initialize();
RDebugUtils.currentLine=22413323;
 //BA.debugLineNum = 22413323;BA.debugLine="Dim filteredCachedTracks As List";
_filteredcachedtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22413324;
 //BA.debugLineNum = 22413324;BA.debugLine="filteredCachedTracks.Initialize";
_filteredcachedtracks.Initialize();
RDebugUtils.currentLine=22413325;
 //BA.debugLineNum = 22413325;BA.debugLine="Dim nonRepeatedCachedTracks As List";
_nonrepeatedcachedtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22413326;
 //BA.debugLineNum = 22413326;BA.debugLine="nonRepeatedCachedTracks.Initialize";
_nonrepeatedcachedtracks.Initialize();
RDebugUtils.currentLine=22413327;
 //BA.debugLineNum = 22413327;BA.debugLine="Dim filteredTracks As List";
_filteredtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22413328;
 //BA.debugLineNum = 22413328;BA.debugLine="filteredTracks.Initialize";
_filteredtracks.Initialize();
RDebugUtils.currentLine=22413329;
 //BA.debugLineNum = 22413329;BA.debugLine="Dim nonRepeatedTracks As List";
_nonrepeatedtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22413330;
 //BA.debugLineNum = 22413330;BA.debugLine="nonRepeatedTracks.Initialize";
_nonrepeatedtracks.Initialize();
RDebugUtils.currentLine=22413331;
 //BA.debugLineNum = 22413331;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group19 = _tracks;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_trackobject = group19.Get(index19);
RDebugUtils.currentLine=22413332;
 //BA.debugLineNum = 22413332;BA.debugLine="If trackObject Is Map Then";
if (_trackobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22413333;
 //BA.debugLineNum = 22413333;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=22413334;
 //BA.debugLineNum = 22413334;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=22413335;
 //BA.debugLineNum = 22413335;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=22413336;
 //BA.debugLineNum = 22413336;BA.debugLine="Dim trackIsCached As Boolean = mediaCacheServic";
_trackiscached = _mediacacheservice._istrackcached /*boolean*/ (null,_trackid);
RDebugUtils.currentLine=22413337;
 //BA.debugLineNum = 22413337;BA.debugLine="If cachedOnly And trackIsCached = False Then Co";
if (_cachedonly && _trackiscached==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=22413338;
 //BA.debugLineNum = 22413338;BA.debugLine="If trackIsCached Then";
if (_trackiscached) { 
RDebugUtils.currentLine=22413339;
 //BA.debugLineNum = 22413339;BA.debugLine="cachedTracks.Add(track)";
_cachedtracks.Add((Object)(_track.getObject()));
RDebugUtils.currentLine=22413340;
 //BA.debugLineNum = 22413340;BA.debugLine="If recentTrackIds.IndexOf(trackId) = -1 Then f";
if (__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_trackid))==-1) { 
_filteredcachedtracks.Add((Object)(_track.getObject()));};
RDebugUtils.currentLine=22413341;
 //BA.debugLineNum = 22413341;BA.debugLine="If trackId <> lastTrackId Then nonRepeatedCach";
if ((_trackid).equals(_lasttrackid) == false) { 
_nonrepeatedcachedtracks.Add((Object)(_track.getObject()));};
 };
RDebugUtils.currentLine=22413343;
 //BA.debugLineNum = 22413343;BA.debugLine="If recentTrackIds.IndexOf(trackId) = -1 Then fi";
if (__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_trackid))==-1) { 
_filteredtracks.Add((Object)(_track.getObject()));};
RDebugUtils.currentLine=22413344;
 //BA.debugLineNum = 22413344;BA.debugLine="If trackId <> lastTrackId Then nonRepeatedTrack";
if ((_trackid).equals(_lasttrackid) == false) { 
_nonrepeatedtracks.Add((Object)(_track.getObject()));};
 };
 }
};
RDebugUtils.currentLine=22413347;
 //BA.debugLineNum = 22413347;BA.debugLine="Dim sourceTracks As List";
_sourcetracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22413348;
 //BA.debugLineNum = 22413348;BA.debugLine="If cachedOnly Then";
if (_cachedonly) { 
RDebugUtils.currentLine=22413349;
 //BA.debugLineNum = 22413349;BA.debugLine="sourceTracks = cachedTracks";
_sourcetracks = _cachedtracks;
RDebugUtils.currentLine=22413350;
 //BA.debugLineNum = 22413350;BA.debugLine="If filteredCachedTracks.Size > 0 Then sourceTrac";
if (_filteredcachedtracks.getSize()>0) { 
_sourcetracks = _filteredcachedtracks;};
RDebugUtils.currentLine=22413351;
 //BA.debugLineNum = 22413351;BA.debugLine="If sourceTracks.Size > 1 And nonRepeatedCachedTr";
if (_sourcetracks.getSize()>1 && _nonrepeatedcachedtracks.getSize()>0) { 
_sourcetracks = _nonrepeatedcachedtracks;};
 }else {
RDebugUtils.currentLine=22413353;
 //BA.debugLineNum = 22413353;BA.debugLine="sourceTracks = tracks";
_sourcetracks = _tracks;
RDebugUtils.currentLine=22413354;
 //BA.debugLineNum = 22413354;BA.debugLine="If filteredTracks.Size > 0 Then sourceTracks = f";
if (_filteredtracks.getSize()>0) { 
_sourcetracks = _filteredtracks;};
RDebugUtils.currentLine=22413355;
 //BA.debugLineNum = 22413355;BA.debugLine="If sourceTracks.Size > 1 And nonRepeatedTracks.S";
if (_sourcetracks.getSize()>1 && _nonrepeatedtracks.getSize()>0) { 
_sourcetracks = _nonrepeatedtracks;};
 };
RDebugUtils.currentLine=22413357;
 //BA.debugLineNum = 22413357;BA.debugLine="If sourceTracks.IsInitialized = False Or sourceTr";
if (_sourcetracks.IsInitialized()==__c.False || _sourcetracks.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=22413358;
 //BA.debugLineNum = 22413358;BA.debugLine="Dim randomIndex As Int = Rnd(0, sourceTracks.Size";
_randomindex = __c.Rnd((int) (0),_sourcetracks.getSize());
RDebugUtils.currentLine=22413359;
 //BA.debugLineNum = 22413359;BA.debugLine="Dim trackObject As Object = sourceTracks.Get(rand";
_trackobject = _sourcetracks.Get(_randomindex);
RDebugUtils.currentLine=22413360;
 //BA.debugLineNum = 22413360;BA.debugLine="If trackObject Is Map Then Return trackObject";
if (_trackobject instanceof java.util.Map) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));};
RDebugUtils.currentLine=22413361;
 //BA.debugLineNum = 22413361;BA.debugLine="Return emptyTrack";
if (true) return _emptytrack;
RDebugUtils.currentLine=22413362;
 //BA.debugLineNum = 22413362;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createqueuetrackfromplaylist(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _playlistdescriptor,anywheresoftware.b4a.objects.collections.Map _track,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createqueuetrackfromplaylist", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createqueuetrackfromplaylist", new Object[] {_currentslot,_playlistdescriptor,_track,_offlinedata}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Public Sub CreateQueueTrackFromPlaylist(currentSlo";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="item.Put(\"type\", \"track\")";
_item.Put((Object)("type"),(Object)("track"));
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="item.Put(\"id\", track.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="item.Put(\"code\", track.GetDefault(\"code\", \"\"))";
_item.Put((Object)("code"),_track.GetDefault((Object)("code"),(Object)("")));
RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="item.Put(\"set\", track.GetDefault(\"set\", \"\"))";
_item.Put((Object)("set"),_track.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=22478855;
 //BA.debugLineNum = 22478855;BA.debugLine="item.Put(\"duration\", track.GetDefault(\"duration\",";
_item.Put((Object)("duration"),_track.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=22478856;
 //BA.debugLineNum = 22478856;BA.debugLine="item.Put(\"gain\", track.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_track.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=22478857;
 //BA.debugLineNum = 22478857;BA.debugLine="item.Put(\"stream\", ResolvePlaybackStreamTitle(cur";
_item.Put((Object)("stream"),(Object)(__ref._resolveplaybackstreamtitle /*String*/ (null,_currentslot,_playlistdescriptor,_offlinedata)));
RDebugUtils.currentLine=22478858;
 //BA.debugLineNum = 22478858;BA.debugLine="item.Put(\"playlist_id\", playlistDescriptor.GetDef";
_item.Put((Object)("playlist_id"),_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=22478859;
 //BA.debugLineNum = 22478859;BA.debugLine="item.Put(\"playlist_title\", playlistDescriptor.Get";
_item.Put((Object)("playlist_title"),_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=22478860;
 //BA.debugLineNum = 22478860;BA.debugLine="item.Put(\"slot_key\", playlistDescriptor.GetDefaul";
_item.Put((Object)("slot_key"),_playlistdescriptor.GetDefault((Object)("_slot_key"),(Object)(__ref._builddataslotkey /*String*/ (null,_currentslot))));
RDebugUtils.currentLine=22478861;
 //BA.debugLineNum = 22478861;BA.debugLine="item.Put(\"playlist_index\", playlistDescriptor.Get";
_item.Put((Object)("playlist_index"),_playlistdescriptor.GetDefault((Object)("_playlist_index"),(Object)(0)));
RDebugUtils.currentLine=22478862;
 //BA.debugLineNum = 22478862;BA.debugLine="item.Put(\"schedule_title\", currentSlot.GetDefault";
_item.Put((Object)("schedule_title"),_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=22478863;
 //BA.debugLineNum = 22478863;BA.debugLine="item.Put(\"slot_time\", currentSlot.GetDefault(\"slo";
_item.Put((Object)("slot_time"),_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=22478864;
 //BA.debugLineNum = 22478864;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=22478865;
 //BA.debugLineNum = 22478865;BA.debugLine="End Sub";
return null;
}
public String  _savepreviewplaylistcursors(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _workingcursors) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "savepreviewplaylistcursors", false))
	 {return ((String) Debug.delegate(ba, "savepreviewplaylistcursors", new Object[] {_storage,_workingcursors}));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Public Sub SavePreviewPlaylistCursors(storage As K";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="If workingCursors.IsInitialized = False Or workin";
if (_workingcursors.IsInitialized()==__c.False || _workingcursors.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="playlistCursors = CloneMap(workingCursors)";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_workingcursors);
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ (null,"data_slot_playlist_cursors",(Object)(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="End Sub";
return "";
}
public String  _rememberresolvedtrack(b4j.example.dataplaybackresolver __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "rememberresolvedtrack", false))
	 {return ((String) Debug.delegate(ba, "rememberresolvedtrack", new Object[] {_trackid}));}
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Public Sub RememberResolvedTrack(trackId As String";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="recentTrackIds.Add(trackId)";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_trackid));
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="Do While recentTrackIds.Size > 20";
while (__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>20) {
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="recentTrackIds.RemoveAt(0)";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=22675462;
 //BA.debugLineNum = 22675462;BA.debugLine="If storageRef.IsInitialized Then storageRef.Put(\"";
if (__ref._storageref /*b4j.example.keyvaluestore*/ .IsInitialized /*boolean*/ ()) { 
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"data_recent_track_ids",(Object)(__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));};
RDebugUtils.currentLine=22675463;
 //BA.debugLineNum = 22675463;BA.debugLine="End Sub";
return "";
}
public String  _rememberresolvedtrackforplaylist(b4j.example.dataplaybackresolver __ref,String _playlistid,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "rememberresolvedtrackforplaylist", false))
	 {return ((String) Debug.delegate(ba, "rememberresolvedtrackforplaylist", new Object[] {_playlistid,_trackid}));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Public Sub RememberResolvedTrackForPlaylist(playli";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="If playlistId = \"\" Or trackId = \"\" Then Return";
if ((_playlistid).equals("") || (_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="lastTrackByPlaylist.Put(playlistId, trackId)";
__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_playlistid),(Object)(_trackid));
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="If storageRef.IsInitialized Then storageRef.Put(\"";
if (__ref._storageref /*b4j.example.keyvaluestore*/ .IsInitialized /*boolean*/ ()) { 
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"data_last_track_by_playlist",(Object)(__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="End Sub";
return "";
}
public String  _builddataslotkey(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "builddataslotkey", false))
	 {return ((String) Debug.delegate(ba, "builddataslotkey", new Object[] {_currentslot}));}
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=23724037;
 //BA.debugLineNum = 23724037;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=23724039;
 //BA.debugLineNum = 23724039;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=23724040;
 //BA.debugLineNum = 23724040;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="Private playlistCursors As Map";
_playlistcursors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="Private recentTrackIds As List";
_recenttrackids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="Private storageRef As KeyValueStore";
_storageref = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="Private lastTrackByPlaylist As Map";
_lasttrackbyplaylist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Private Sub ResolvePlaybackStreamTitle(currentSlot";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="Dim streamTitle As String = currentSlot.GetDefaul";
_streamtitle = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="Dim resolvedStreamTitle As String = ResolveOfflin";
_resolvedstreamtitle = __ref._resolveofflinestreamtitle /*String*/ (null,_currentslot,_offlinedata);
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="If resolvedStreamTitle <> \"\" Then Return resolved";
if ((_resolvedstreamtitle).equals("") == false) { 
if (true) return _resolvedstreamtitle;};
RDebugUtils.currentLine=22806533;
 //BA.debugLineNum = 22806533;BA.debugLine="Dim scheduleTitle As String = currentSlot.GetDefa";
_scheduletitle = BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=22806534;
 //BA.debugLineNum = 22806534;BA.debugLine="Dim descriptorStreamTitle As String = playlistDes";
_descriptorstreamtitle = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=22806535;
 //BA.debugLineNum = 22806535;BA.debugLine="If descriptorStreamTitle <> \"\" Then Return descri";
if ((_descriptorstreamtitle).equals("") == false) { 
if (true) return _descriptorstreamtitle;};
RDebugUtils.currentLine=22806536;
 //BA.debugLineNum = 22806536;BA.debugLine="If scheduleTitle <> \"\" Then Return scheduleTitle";
if ((_scheduletitle).equals("") == false) { 
if (true) return _scheduletitle;};
RDebugUtils.currentLine=22806537;
 //BA.debugLineNum = 22806537;BA.debugLine="Return playlistDescriptor.GetDefault(\"title\", \"\")";
if (true) return BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=22806538;
 //BA.debugLineNum = 22806538;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=22937607;
 //BA.debugLineNum = 22937607;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=22937610;
 //BA.debugLineNum = 22937610;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=22937611;
 //BA.debugLineNum = 22937611;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=22937612;
 //BA.debugLineNum = 22937612;BA.debugLine="End Sub";
return null;
}
public String  _formatisodate(b4j.example.dataplaybackresolver __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "formatisodate", false))
	 {return ((String) Debug.delegate(ba, "formatisodate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="End Sub";
return "";
}
public String  _getofflineplaylistsdir(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Private Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="Return File.Combine(storageDir, \"playlists\")";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Private Sub IsoWeekdayFromTicks(ticks As Long) As";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
RDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=23461894;
 //BA.debugLineNum = 23461894;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
RDebugUtils.currentLine=23461895;
 //BA.debugLineNum = 23461895;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
RDebugUtils.currentLine=23461896;
 //BA.debugLineNum = 23461896;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
RDebugUtils.currentLine=23461897;
 //BA.debugLineNum = 23461897;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
RDebugUtils.currentLine=23461898;
 //BA.debugLineNum = 23461898;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
RDebugUtils.currentLine=23461899;
 //BA.debugLineNum = 23461899;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
RDebugUtils.currentLine=23461900;
 //BA.debugLineNum = 23461900;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
RDebugUtils.currentLine=23461901;
 //BA.debugLineNum = 23461901;BA.debugLine="End Sub";
return "";
}
public String  _playlistmetadatafilename(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Private Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.dataplaybackresolver __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Private Sub MinutesOfDayFromTicks(ticks As Long) A";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
_timevalue = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=23396359;
 //BA.debugLineNum = 23396359;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
RDebugUtils.currentLine=23396360;
 //BA.debugLineNum = 23396360;BA.debugLine="End Sub";
return 0;
}
public boolean  _scheduleappliestoday(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _schedule,String _todaykey,String _todayweekday) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "scheduleappliestoday", false))
	 {return ((Boolean) Debug.delegate(ba, "scheduleappliestoday", new Object[] {_schedule,_todaykey,_todayweekday}));}
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Private Sub ScheduleAppliesToday(schedule As Map,";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="Return ScheduleAppliesOnDate(schedule, todayKey,";
if (true) return __ref._scheduleappliesondate /*boolean*/ (null,_schedule,_todaykey,_todayweekday);
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="Try";
try {RDebugUtils.currentLine=23527429;
 //BA.debugLineNum = 23527429;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
RDebugUtils.currentLine=23527430;
 //BA.debugLineNum = 23527430;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=23527431;
 //BA.debugLineNum = 23527431;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=23527432;
 //BA.debugLineNum = 23527432;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=23527433;
 //BA.debugLineNum = 23527433;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=23527435;
 //BA.debugLineNum = 23527435;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
RDebugUtils.currentLine=23527437;
 //BA.debugLineNum = 23527437;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvenextdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextdataslot", new Object[] {_offlinedata}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Public Sub ResolveNextDataSlot(offlineData As Map)";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Return ResolveNextDataSlotAtTicks(offlineData, Da";
if (true) return __ref._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,__c.DateTime.getNow());
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Private Sub StartOfDayTicks(ticks As Long) As Long";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="Dim dayKey As String = DateTime.Date(ticks)";
_daykey = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="Dim dayTicks As Long = DateTime.DateParse(dayKey)";
_dayticks = __c.DateTime.DateParse(_daykey);
RDebugUtils.currentLine=23592965;
 //BA.debugLineNum = 23592965;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="Return dayTicks";
if (true) return _dayticks;
RDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Private Sub ScheduleAppliesOnDate(schedule As Map,";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Dim startDate As String = schedule.GetDefault(\"st";
_startdate = BA.ObjectToString(_schedule.GetDefault((Object)("start"),(Object)("")));
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(target";
if ((_startdate).equals("") == false && _startdate.compareTo(_targetdatekey)>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="Dim weekdays As List = schedule.GetDefault(\"weekd";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("weekdays"),__c.Null)));
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="If weekdays.IsInitialized = False Or weekdays.Siz";
if (_weekdays.IsInitialized()==__c.False || _weekdays.getSize()==0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group5 = _weekdays;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_weekdayobject = group5.Get(index5);
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="If (\"\" & weekdayObject).Trim = targetWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_targetweekday)) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=23068681;
 //BA.debugLineNum = 23068681;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Private Sub ResolveOfflineStreamTitle(currentSlot";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="Dim targetStreamId As String = currentSlot.GetDef";
_targetstreamid = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="Dim targetSlotTime As String = currentSlot.GetDef";
_targetslottime = BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=22872069;
 //BA.debugLineNum = 22872069;BA.debugLine="If schedules.IsInitialized = False Then Return \"\"";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22872070;
 //BA.debugLineNum = 22872070;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group6 = _schedules;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_scheduleobject = group6.Get(index6);
RDebugUtils.currentLine=22872071;
 //BA.debugLineNum = 22872071;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22872072;
 //BA.debugLineNum = 22872072;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=22872073;
 //BA.debugLineNum = 22872073;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=22872074;
 //BA.debugLineNum = 22872074;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=22872075;
 //BA.debugLineNum = 22872075;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group11 = _slots;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.Get(index11);
RDebugUtils.currentLine=22872076;
 //BA.debugLineNum = 22872076;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22872077;
 //BA.debugLineNum = 22872077;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=22872078;
 //BA.debugLineNum = 22872078;BA.debugLine="If targetSlotTime <> \"\" And slot.GetDefault(\"";
if ((_targetslottime).equals("") == false && (_slot.GetDefault((Object)("time"),(Object)(""))).equals((Object)(_targetslottime)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=22872079;
 //BA.debugLineNum = 22872079;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=22872080;
 //BA.debugLineNum = 22872080;BA.debugLine="If targetStreamId <> \"\" And streamData.GetDef";
if ((_targetstreamid).equals("") == false && (_streamdata.GetDefault((Object)("id"),(Object)(""))).equals((Object)(_targetstreamid)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=22872081;
 //BA.debugLineNum = 22872081;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=22872082;
 //BA.debugLineNum = 22872082;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=22872087;
 //BA.debugLineNum = 22872087;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=22872088;
 //BA.debugLineNum = 22872088;BA.debugLine="End Sub";
return "";
}
}