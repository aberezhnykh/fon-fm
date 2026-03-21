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
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.collections.Map  _resolvecurrentdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvecurrentdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvecurrentdataslot", new Object[] {_offlinedata}));}
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
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Public Sub ResolveCurrentDataSlot(offlineData As M";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="Dim slotContext As Map";
_slotcontext = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="slotContext.Initialize";
_slotcontext.Initialize();
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=33685508;
 //BA.debugLineNum = 33685508;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=33685509;
 //BA.debugLineNum = 33685509;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=33685510;
 //BA.debugLineNum = 33685510;BA.debugLine="Dim todayKey As String = FormatIsoDate(DateTime.N";
_todaykey = __ref._formatisodate /*String*/ (null,__c.DateTime.getNow());
RDebugUtils.currentLine=33685511;
 //BA.debugLineNum = 33685511;BA.debugLine="Dim nowMinutes As Int = CurrentMinutesOfDay";
_nowminutes = __ref._currentminutesofday /*int*/ (null);
RDebugUtils.currentLine=33685512;
 //BA.debugLineNum = 33685512;BA.debugLine="Dim todayWeekday As String = CurrentIsoWeekday";
_todayweekday = __ref._currentisoweekday /*String*/ (null);
RDebugUtils.currentLine=33685513;
 //BA.debugLineNum = 33685513;BA.debugLine="Dim matchedSlots As List";
_matchedslots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33685514;
 //BA.debugLineNum = 33685514;BA.debugLine="matchedSlots.Initialize";
_matchedslots.Initialize();
RDebugUtils.currentLine=33685515;
 //BA.debugLineNum = 33685515;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group11 = _schedules;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_scheduleobject = group11.Get(index11);
RDebugUtils.currentLine=33685516;
 //BA.debugLineNum = 33685516;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=33685517;
 //BA.debugLineNum = 33685517;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=33685518;
 //BA.debugLineNum = 33685518;BA.debugLine="If ScheduleAppliesToday(schedule, todayKey, tod";
if (__ref._scheduleappliestoday /*boolean*/ (null,_schedule,_todaykey,_todayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=33685519;
 //BA.debugLineNum = 33685519;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=33685520;
 //BA.debugLineNum = 33685520;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=33685521;
 //BA.debugLineNum = 33685521;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=33685522;
 //BA.debugLineNum = 33685522;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group18 = _slots;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_slotobject = group18.Get(index18);
RDebugUtils.currentLine=33685523;
 //BA.debugLineNum = 33685523;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=33685524;
 //BA.debugLineNum = 33685524;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=33685525;
 //BA.debugLineNum = 33685525;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=33685526;
 //BA.debugLineNum = 33685526;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes(";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=33685527;
 //BA.debugLineNum = 33685527;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=33685528;
 //BA.debugLineNum = 33685528;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=33685529;
 //BA.debugLineNum = 33685529;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33685530;
 //BA.debugLineNum = 33685530;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=33685531;
 //BA.debugLineNum = 33685531;BA.debugLine="entry.Put(\"schedule_title\", scheduleTitle)";
_entry.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=33685532;
 //BA.debugLineNum = 33685532;BA.debugLine="entry.Put(\"slot_time\", slotTime)";
_entry.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=33685533;
 //BA.debugLineNum = 33685533;BA.debugLine="entry.Put(\"slot_minutes\", slotMinutes)";
_entry.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=33685534;
 //BA.debugLineNum = 33685534;BA.debugLine="entry.Put(\"stream_id\", streamData.GetDefault(";
_entry.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=33685535;
 //BA.debugLineNum = 33685535;BA.debugLine="entry.Put(\"stream_title\", streamData.GetDefau";
_entry.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=33685536;
 //BA.debugLineNum = 33685536;BA.debugLine="entry.Put(\"playlists\", streamData.GetDefault(";
_entry.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=33685537;
 //BA.debugLineNum = 33685537;BA.debugLine="matchedSlots.Add(entry)";
_matchedslots.Add((Object)(_entry.getObject()));
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=33685542;
 //BA.debugLineNum = 33685542;BA.debugLine="If matchedSlots.Size = 0 Then Return slotContext";
if (_matchedslots.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=33685543;
 //BA.debugLineNum = 33685543;BA.debugLine="Dim selectedSlot As Map";
_selectedslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33685544;
 //BA.debugLineNum = 33685544;BA.debugLine="selectedSlot.Initialize";
_selectedslot.Initialize();
RDebugUtils.currentLine=33685545;
 //BA.debugLineNum = 33685545;BA.debugLine="Dim selectedMinutes As Int = -1";
_selectedminutes = (int) (-1);
RDebugUtils.currentLine=33685546;
 //BA.debugLineNum = 33685546;BA.debugLine="For Each slotEntryObject As Object In matchedSlot";
{
final anywheresoftware.b4a.BA.IterableList group42 = _matchedslots;
final int groupLen42 = group42.getSize()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_slotentryobject = group42.Get(index42);
RDebugUtils.currentLine=33685547;
 //BA.debugLineNum = 33685547;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=33685548;
 //BA.debugLineNum = 33685548;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"s";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=33685549;
 //BA.debugLineNum = 33685549;BA.debugLine="If slotMinutes <= nowMinutes And slotMinutes >=";
if (_slotminutes<=_nowminutes && _slotminutes>=_selectedminutes) { 
RDebugUtils.currentLine=33685550;
 //BA.debugLineNum = 33685550;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=33685551;
 //BA.debugLineNum = 33685551;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
RDebugUtils.currentLine=33685554;
 //BA.debugLineNum = 33685554;BA.debugLine="If selectedSlot.Size = 0 Then";
if (_selectedslot.getSize()==0) { 
RDebugUtils.currentLine=33685555;
 //BA.debugLineNum = 33685555;BA.debugLine="selectedMinutes = 24 * 60 + 1";
_selectedminutes = (int) (24*60+1);
RDebugUtils.currentLine=33685556;
 //BA.debugLineNum = 33685556;BA.debugLine="For Each slotEntryObject As Object In matchedSlo";
{
final anywheresoftware.b4a.BA.IterableList group52 = _matchedslots;
final int groupLen52 = group52.getSize()
;int index52 = 0;
;
for (; index52 < groupLen52;index52++){
_slotentryobject = group52.Get(index52);
RDebugUtils.currentLine=33685557;
 //BA.debugLineNum = 33685557;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=33685558;
 //BA.debugLineNum = 33685558;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=33685559;
 //BA.debugLineNum = 33685559;BA.debugLine="If slotMinutes > nowMinutes And slotMinutes < s";
if (_slotminutes>_nowminutes && _slotminutes<_selectedminutes) { 
RDebugUtils.currentLine=33685560;
 //BA.debugLineNum = 33685560;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=33685561;
 //BA.debugLineNum = 33685561;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
 };
RDebugUtils.currentLine=33685565;
 //BA.debugLineNum = 33685565;BA.debugLine="Return selectedSlot";
if (true) return _selectedslot;
RDebugUtils.currentLine=33685566;
 //BA.debugLineNum = 33685566;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Public Sub ChooseNextPlaylistDescriptor(currentSlo";
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="Dim emptyDescriptor As Map";
_emptydescriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="emptyDescriptor.Initialize";
_emptydescriptor.Initialize();
RDebugUtils.currentLine=33751043;
 //BA.debugLineNum = 33751043;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptydescriptor;};
RDebugUtils.currentLine=33751045;
 //BA.debugLineNum = 33751045;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
_slotkey = __ref._builddataslotkey /*String*/ (null,_currentslot);
RDebugUtils.currentLine=33751046;
 //BA.debugLineNum = 33751046;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
_cursorvalue = (int)(BA.ObjectToNumber(_workingcursors.GetDefault((Object)(_slotkey),__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_slotkey),(Object)(0)))));
RDebugUtils.currentLine=33751047;
 //BA.debugLineNum = 33751047;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
if (_cursorvalue<0) { 
_cursorvalue = (int) (0);};
RDebugUtils.currentLine=33751048;
 //BA.debugLineNum = 33751048;BA.debugLine="Dim playlistIndexForSlot As Int = cursorValue Mod";
_playlistindexforslot = (int) (_cursorvalue%_playlists.getSize());
RDebugUtils.currentLine=33751049;
 //BA.debugLineNum = 33751049;BA.debugLine="workingCursors.Put(slotKey, playlistIndexForSlot";
_workingcursors.Put((Object)(_slotkey),(Object)(_playlistindexforslot+1));
RDebugUtils.currentLine=33751050;
 //BA.debugLineNum = 33751050;BA.debugLine="Trace(\"Курсор playlists. slot=\" & slotKey & \", st";
__ref._trace /*String*/ (null,"Курсор playlists. slot="+_slotkey+", stored="+BA.NumberToString(_cursorvalue)+", previewNextStored="+BA.ObjectToString(_workingcursors.GetDefault((Object)(_slotkey),(Object)(0)))+", playlists="+BA.NumberToString(_playlists.getSize()));
RDebugUtils.currentLine=33751051;
 //BA.debugLineNum = 33751051;BA.debugLine="Dim playlistObject As Object = playlists.Get(play";
_playlistobject = _playlists.Get(_playlistindexforslot);
RDebugUtils.currentLine=33751052;
 //BA.debugLineNum = 33751052;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=33751053;
 //BA.debugLineNum = 33751053;BA.debugLine="Dim playlistSource As Map = playlistObject";
_playlistsource = new anywheresoftware.b4a.objects.collections.Map();
_playlistsource = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=33751054;
 //BA.debugLineNum = 33751054;BA.debugLine="Dim playlist As Map = CloneMap(playlistSource)";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistsource);
RDebugUtils.currentLine=33751055;
 //BA.debugLineNum = 33751055;BA.debugLine="playlist.Put(\"_slot_key\", slotKey)";
_playlist.Put((Object)("_slot_key"),(Object)(_slotkey));
RDebugUtils.currentLine=33751056;
 //BA.debugLineNum = 33751056;BA.debugLine="playlist.Put(\"_playlist_index\", playlistIndexFor";
_playlist.Put((Object)("_playlist_index"),(Object)(_playlistindexforslot));
RDebugUtils.currentLine=33751057;
 //BA.debugLineNum = 33751057;BA.debugLine="Trace(\"Выбран playlist для локального воспроизве";
__ref._trace /*String*/ (null,"Выбран playlist для локального воспроизведения. slot="+_slotkey+", index="+BA.NumberToString(_playlistindexforslot)+", playlistId="+BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")))+", title="+BA.ObjectToString(_playlist.GetDefault((Object)("title"),(Object)(""))));
RDebugUtils.currentLine=33751058;
 //BA.debugLineNum = 33751058;BA.debugLine="Return playlist";
if (true) return _playlist;
 };
RDebugUtils.currentLine=33751060;
 //BA.debugLineNum = 33751060;BA.debugLine="Return emptyDescriptor";
if (true) return _emptydescriptor;
RDebugUtils.currentLine=33751061;
 //BA.debugLineNum = 33751061;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
RDebugUtils.currentLine=33816577;
 //BA.debugLineNum = 33816577;BA.debugLine="Dim playlistData As Map";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="If playlistId = \"\" Then Return playlistData";
if ((_playlistid).equals("")) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=33816580;
 //BA.debugLineNum = 33816580;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistMe";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=33816581;
 //BA.debugLineNum = 33816581;BA.debugLine="Try";
try {RDebugUtils.currentLine=33816582;
 //BA.debugLineNum = 33816582;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=33816583;
 //BA.debugLineNum = 33816583;BA.debugLine="parser.Initialize(File.ReadString(GetOfflinePlay";
_parser.Initialize(__c.File.ReadString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid)));
RDebugUtils.currentLine=33816584;
 //BA.debugLineNum = 33816584;BA.debugLine="Dim parsedData As Map = parser.NextObject";
_parseddata = new anywheresoftware.b4a.objects.collections.Map();
_parseddata = _parser.NextObject();
RDebugUtils.currentLine=33816585;
 //BA.debugLineNum = 33816585;BA.debugLine="If parsedData.IsInitialized Then playlistData =";
if (_parseddata.IsInitialized()) { 
_playlistdata = _parseddata;};
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=33816587;
 //BA.debugLineNum = 33816587;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=33816588;
 //BA.debugLineNum = 33816588;BA.debugLine="Trace(\"Не удалось загрузить playlist metadata из";
__ref._trace /*String*/ (null,"Не удалось загрузить playlist metadata из кэша. id="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=33816590;
 //BA.debugLineNum = 33816590;BA.debugLine="Return playlistData";
if (true) return _playlistdata;
RDebugUtils.currentLine=33816591;
 //BA.debugLineNum = 33816591;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _chooserandomtrackfromplaylist(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata,b4j.example.mediacache _mediacacheservice,boolean _cachedonly) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "chooserandomtrackfromplaylist", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "chooserandomtrackfromplaylist", new Object[] {_playlistdata,_mediacacheservice,_cachedonly}));}
anywheresoftware.b4a.objects.collections.Map _emptytrack = null;
anywheresoftware.b4a.objects.collections.List _tracks = null;
anywheresoftware.b4a.objects.collections.List _filteredtracks = null;
anywheresoftware.b4a.objects.collections.List _cachedtracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.List _sourcetracks = null;
int _randomindex = 0;
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Public Sub ChooseRandomTrackFromPlaylist(playlistD";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="Dim emptyTrack As Map";
_emptytrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="emptyTrack.Initialize";
_emptytrack.Initialize();
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=33882116;
 //BA.debugLineNum = 33882116;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=33882117;
 //BA.debugLineNum = 33882117;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=33882118;
 //BA.debugLineNum = 33882118;BA.debugLine="Dim filteredTracks As List";
_filteredtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33882119;
 //BA.debugLineNum = 33882119;BA.debugLine="filteredTracks.Initialize";
_filteredtracks.Initialize();
RDebugUtils.currentLine=33882120;
 //BA.debugLineNum = 33882120;BA.debugLine="Dim cachedTracks As List";
_cachedtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33882121;
 //BA.debugLineNum = 33882121;BA.debugLine="cachedTracks.Initialize";
_cachedtracks.Initialize();
RDebugUtils.currentLine=33882122;
 //BA.debugLineNum = 33882122;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group10 = _tracks;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_trackobject = group10.Get(index10);
RDebugUtils.currentLine=33882123;
 //BA.debugLineNum = 33882123;BA.debugLine="If trackObject Is Map Then";
if (_trackobject instanceof java.util.Map) { 
RDebugUtils.currentLine=33882124;
 //BA.debugLineNum = 33882124;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=33882125;
 //BA.debugLineNum = 33882125;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=33882126;
 //BA.debugLineNum = 33882126;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=33882127;
 //BA.debugLineNum = 33882127;BA.debugLine="If cachedOnly And mediaCacheService.IsTrackCach";
if (_cachedonly && _mediacacheservice._istrackcached /*boolean*/ (null,_trackid)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=33882128;
 //BA.debugLineNum = 33882128;BA.debugLine="cachedTracks.Add(track)";
_cachedtracks.Add((Object)(_track.getObject()));
RDebugUtils.currentLine=33882129;
 //BA.debugLineNum = 33882129;BA.debugLine="If recentTrackIds.IndexOf(trackId) = -1 Then fi";
if (__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_trackid))==-1) { 
_filteredtracks.Add((Object)(_track.getObject()));};
 };
 }
};
RDebugUtils.currentLine=33882132;
 //BA.debugLineNum = 33882132;BA.debugLine="Dim sourceTracks As List";
_sourcetracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33882133;
 //BA.debugLineNum = 33882133;BA.debugLine="If cachedOnly Then";
if (_cachedonly) { 
RDebugUtils.currentLine=33882134;
 //BA.debugLineNum = 33882134;BA.debugLine="sourceTracks = cachedTracks";
_sourcetracks = _cachedtracks;
RDebugUtils.currentLine=33882135;
 //BA.debugLineNum = 33882135;BA.debugLine="If filteredTracks.Size > 0 Then sourceTracks = f";
if (_filteredtracks.getSize()>0) { 
_sourcetracks = _filteredtracks;};
 }else {
RDebugUtils.currentLine=33882137;
 //BA.debugLineNum = 33882137;BA.debugLine="sourceTracks = tracks";
_sourcetracks = _tracks;
RDebugUtils.currentLine=33882138;
 //BA.debugLineNum = 33882138;BA.debugLine="If filteredTracks.Size > 0 Then sourceTracks = f";
if (_filteredtracks.getSize()>0) { 
_sourcetracks = _filteredtracks;};
 };
RDebugUtils.currentLine=33882140;
 //BA.debugLineNum = 33882140;BA.debugLine="If sourceTracks.IsInitialized = False Or sourceTr";
if (_sourcetracks.IsInitialized()==__c.False || _sourcetracks.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=33882141;
 //BA.debugLineNum = 33882141;BA.debugLine="Dim randomIndex As Int = Rnd(0, sourceTracks.Size";
_randomindex = __c.Rnd((int) (0),_sourcetracks.getSize());
RDebugUtils.currentLine=33882142;
 //BA.debugLineNum = 33882142;BA.debugLine="Dim trackObject As Object = sourceTracks.Get(rand";
_trackobject = _sourcetracks.Get(_randomindex);
RDebugUtils.currentLine=33882143;
 //BA.debugLineNum = 33882143;BA.debugLine="If trackObject Is Map Then Return trackObject";
if (_trackobject instanceof java.util.Map) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));};
RDebugUtils.currentLine=33882144;
 //BA.debugLineNum = 33882144;BA.debugLine="Return emptyTrack";
if (true) return _emptytrack;
RDebugUtils.currentLine=33882145;
 //BA.debugLineNum = 33882145;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createqueuetrackfromplaylist(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _playlistdescriptor,anywheresoftware.b4a.objects.collections.Map _track,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createqueuetrackfromplaylist", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createqueuetrackfromplaylist", new Object[] {_currentslot,_playlistdescriptor,_track,_offlinedata}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Public Sub CreateQueueTrackFromPlaylist(currentSlo";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=33947651;
 //BA.debugLineNum = 33947651;BA.debugLine="item.Put(\"type\", \"track\")";
_item.Put((Object)("type"),(Object)("track"));
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="item.Put(\"id\", track.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=33947653;
 //BA.debugLineNum = 33947653;BA.debugLine="item.Put(\"code\", track.GetDefault(\"code\", \"\"))";
_item.Put((Object)("code"),_track.GetDefault((Object)("code"),(Object)("")));
RDebugUtils.currentLine=33947654;
 //BA.debugLineNum = 33947654;BA.debugLine="item.Put(\"set\", track.GetDefault(\"set\", \"\"))";
_item.Put((Object)("set"),_track.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=33947655;
 //BA.debugLineNum = 33947655;BA.debugLine="item.Put(\"duration\", track.GetDefault(\"duration\",";
_item.Put((Object)("duration"),_track.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=33947656;
 //BA.debugLineNum = 33947656;BA.debugLine="item.Put(\"gain\", track.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_track.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=33947657;
 //BA.debugLineNum = 33947657;BA.debugLine="item.Put(\"stream\", ResolvePlaybackStreamTitle(cur";
_item.Put((Object)("stream"),(Object)(__ref._resolveplaybackstreamtitle /*String*/ (null,_currentslot,_playlistdescriptor,_offlinedata)));
RDebugUtils.currentLine=33947658;
 //BA.debugLineNum = 33947658;BA.debugLine="item.Put(\"playlist_id\", playlistDescriptor.GetDef";
_item.Put((Object)("playlist_id"),_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=33947659;
 //BA.debugLineNum = 33947659;BA.debugLine="item.Put(\"playlist_title\", playlistDescriptor.Get";
_item.Put((Object)("playlist_title"),_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=33947660;
 //BA.debugLineNum = 33947660;BA.debugLine="item.Put(\"slot_key\", playlistDescriptor.GetDefaul";
_item.Put((Object)("slot_key"),_playlistdescriptor.GetDefault((Object)("_slot_key"),(Object)(__ref._builddataslotkey /*String*/ (null,_currentslot))));
RDebugUtils.currentLine=33947661;
 //BA.debugLineNum = 33947661;BA.debugLine="item.Put(\"playlist_index\", playlistDescriptor.Get";
_item.Put((Object)("playlist_index"),_playlistdescriptor.GetDefault((Object)("_playlist_index"),(Object)(0)));
RDebugUtils.currentLine=33947662;
 //BA.debugLineNum = 33947662;BA.debugLine="item.Put(\"schedule_title\", currentSlot.GetDefault";
_item.Put((Object)("schedule_title"),_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=33947663;
 //BA.debugLineNum = 33947663;BA.debugLine="item.Put(\"slot_time\", currentSlot.GetDefault(\"slo";
_item.Put((Object)("slot_time"),_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=33947664;
 //BA.debugLineNum = 33947664;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=33947665;
 //BA.debugLineNum = 33947665;BA.debugLine="End Sub";
return null;
}
public String  _rememberresolvedtrack(b4j.example.dataplaybackresolver __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "rememberresolvedtrack", false))
	 {return ((String) Debug.delegate(ba, "rememberresolvedtrack", new Object[] {_trackid}));}
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Public Sub RememberResolvedTrack(trackId As String";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="recentTrackIds.Add(trackId)";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_trackid));
RDebugUtils.currentLine=34078723;
 //BA.debugLineNum = 34078723;BA.debugLine="Do While recentTrackIds.Size > 20";
while (__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>20) {
RDebugUtils.currentLine=34078724;
 //BA.debugLineNum = 34078724;BA.debugLine="recentTrackIds.RemoveAt(0)";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=34078726;
 //BA.debugLineNum = 34078726;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _cloneplaylistcursors(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cloneplaylistcursors", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "cloneplaylistcursors", null));}
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Public Sub ClonePlaylistCursors As Map";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="Return CloneMap(playlistCursors)";
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,Object _targetmodulevalue,String _tracesubnamevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_targetmodulevalue,_tracesubnamevalue}));}
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Public Sub Initialize(storageDirValue As String, t";
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=33423363;
 //BA.debugLineNum = 33423363;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=33423364;
 //BA.debugLineNum = 33423364;BA.debugLine="playlistCursors.Initialize";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=33423365;
 //BA.debugLineNum = 33423365;BA.debugLine="recentTrackIds.Initialize";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=33423366;
 //BA.debugLineNum = 33423366;BA.debugLine="End Sub";
return "";
}
public String  _loadstate(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "loadstate", false))
	 {return ((String) Debug.delegate(ba, "loadstate", new Object[] {_storage}));}
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Public Sub LoadState(storage As KeyValueStore)";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="playlistCursors = storage.GetDefault(\"data_slot_p";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ (null,"data_slot_playlist_cursors",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="If playlistCursors.IsInitialized = False Then pla";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="End Sub";
return "";
}
public int  _cursorcount(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cursorcount", false))
	 {return ((Integer) Debug.delegate(ba, "cursorcount", null));}
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Public Sub CursorCount As Int";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="If playlistCursors.IsInitialized = False Then Ret";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="Return playlistCursors.Size";
if (true) return __ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=33554435;
 //BA.debugLineNum = 33554435;BA.debugLine="End Sub";
return 0;
}
public String  _commitplaylistcursor(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "commitplaylistcursor", false))
	 {return ((String) Debug.delegate(ba, "commitplaylistcursor", new Object[] {_storage,_item}));}
String _slotkey = "";
int _nextstored = 0;
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Public Sub CommitPlaylistCursor(storage As KeyValu";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return "";};
RDebugUtils.currentLine=34013187;
 //BA.debugLineNum = 34013187;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_key";
_slotkey = BA.ObjectToString(_item.GetDefault((Object)("slot_key"),(Object)("")));
RDebugUtils.currentLine=34013188;
 //BA.debugLineNum = 34013188;BA.debugLine="If slotKey = \"\" Then Return";
if ((_slotkey).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=34013189;
 //BA.debugLineNum = 34013189;BA.debugLine="Dim nextStored As Int = item.GetDefault(\"playlist";
_nextstored = (int) ((double)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_index"),(Object)(0))))+1);
RDebugUtils.currentLine=34013190;
 //BA.debugLineNum = 34013190;BA.debugLine="playlistCursors.Put(slotKey, nextStored)";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_slotkey),(Object)(_nextstored));
RDebugUtils.currentLine=34013191;
 //BA.debugLineNum = 34013191;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ (null,"data_slot_playlist_cursors",(Object)(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=34013192;
 //BA.debugLineNum = 34013192;BA.debugLine="Trace(\"Зафиксирован курсор playlists. slot=\" & sl";
__ref._trace /*String*/ (null,"Зафиксирован курсор playlists. slot="+_slotkey+", committed="+BA.NumberToString(_nextstored));
RDebugUtils.currentLine=34013193;
 //BA.debugLineNum = 34013193;BA.debugLine="End Sub";
return "";
}
public String  _builddataslotkey(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "builddataslotkey", false))
	 {return ((String) Debug.delegate(ba, "builddataslotkey", new Object[] {_currentslot}));}
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.dataplaybackresolver __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=35061763;
 //BA.debugLineNum = 35061763;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=35061764;
 //BA.debugLineNum = 35061764;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=35061765;
 //BA.debugLineNum = 35061765;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=35061767;
 //BA.debugLineNum = 35061767;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=35061768;
 //BA.debugLineNum = 35061768;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=33357827;
 //BA.debugLineNum = 33357827;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=33357828;
 //BA.debugLineNum = 33357828;BA.debugLine="Private playlistCursors As Map";
_playlistcursors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33357829;
 //BA.debugLineNum = 33357829;BA.debugLine="Private recentTrackIds As List";
_recenttrackids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33357830;
 //BA.debugLineNum = 33357830;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=34930691;
 //BA.debugLineNum = 34930691;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=34930692;
 //BA.debugLineNum = 34930692;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=34865153;
 //BA.debugLineNum = 34865153;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=34865155;
 //BA.debugLineNum = 34865155;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=34865156;
 //BA.debugLineNum = 34865156;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Private Sub ResolvePlaybackStreamTitle(currentSlot";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="Dim streamTitle As String = currentSlot.GetDefaul";
_streamtitle = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="Dim resolvedStreamTitle As String = ResolveOfflin";
_resolvedstreamtitle = __ref._resolveofflinestreamtitle /*String*/ (null,_currentslot,_offlinedata);
RDebugUtils.currentLine=34144260;
 //BA.debugLineNum = 34144260;BA.debugLine="If resolvedStreamTitle <> \"\" Then Return resolved";
if ((_resolvedstreamtitle).equals("") == false) { 
if (true) return _resolvedstreamtitle;};
RDebugUtils.currentLine=34144261;
 //BA.debugLineNum = 34144261;BA.debugLine="Dim scheduleTitle As String = currentSlot.GetDefa";
_scheduletitle = BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=34144262;
 //BA.debugLineNum = 34144262;BA.debugLine="Dim descriptorStreamTitle As String = playlistDes";
_descriptorstreamtitle = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=34144263;
 //BA.debugLineNum = 34144263;BA.debugLine="If descriptorStreamTitle <> \"\" Then Return descri";
if ((_descriptorstreamtitle).equals("") == false) { 
if (true) return _descriptorstreamtitle;};
RDebugUtils.currentLine=34144264;
 //BA.debugLineNum = 34144264;BA.debugLine="If scheduleTitle <> \"\" Then Return scheduleTitle";
if ((_scheduletitle).equals("") == false) { 
if (true) return _scheduletitle;};
RDebugUtils.currentLine=34144265;
 //BA.debugLineNum = 34144265;BA.debugLine="Return playlistDescriptor.GetDefault(\"title\", \"\")";
if (true) return BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=34144266;
 //BA.debugLineNum = 34144266;BA.debugLine="End Sub";
return "";
}
public String  _currentisoweekday(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "currentisoweekday", false))
	 {return ((String) Debug.delegate(ba, "currentisoweekday", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _today = null;
anywheresoftware.b4j.object.JavaObject _dayofweek = null;
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Private Sub CurrentIsoWeekday As String";
RDebugUtils.currentLine=34734081;
 //BA.debugLineNum = 34734081;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="jo.InitializeStatic(\"java.time.LocalDate\")";
_jo.InitializeStatic("java.time.LocalDate");
RDebugUtils.currentLine=34734083;
 //BA.debugLineNum = 34734083;BA.debugLine="Dim today As JavaObject = jo.RunMethod(\"now\", Nul";
_today = new anywheresoftware.b4j.object.JavaObject();
_today = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
RDebugUtils.currentLine=34734084;
 //BA.debugLineNum = 34734084;BA.debugLine="Dim dayOfWeek As JavaObject = today.RunMethod(\"ge";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_today.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
RDebugUtils.currentLine=34734085;
 //BA.debugLineNum = 34734085;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
RDebugUtils.currentLine=34734086;
 //BA.debugLineNum = 34734086;BA.debugLine="End Sub";
return "";
}
public int  _currentminutesofday(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "currentminutesofday", false))
	 {return ((Integer) Debug.delegate(ba, "currentminutesofday", null));}
String _previoustimeformat = "";
String _timevalue = "";
String[] _parts = null;
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Private Sub CurrentMinutesOfDay As Int";
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=34668547;
 //BA.debugLineNum = 34668547;BA.debugLine="Dim timeValue As String = DateTime.Time(DateTime.";
_timevalue = __c.DateTime.Time(__c.DateTime.getNow());
RDebugUtils.currentLine=34668548;
 //BA.debugLineNum = 34668548;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=34668549;
 //BA.debugLineNum = 34668549;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=34668550;
 //BA.debugLineNum = 34668550;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=34668551;
 //BA.debugLineNum = 34668551;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
RDebugUtils.currentLine=34668552;
 //BA.debugLineNum = 34668552;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=34275331;
 //BA.debugLineNum = 34275331;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=34275332;
 //BA.debugLineNum = 34275332;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=34275333;
 //BA.debugLineNum = 34275333;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=34275334;
 //BA.debugLineNum = 34275334;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=34275335;
 //BA.debugLineNum = 34275335;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=34275337;
 //BA.debugLineNum = 34275337;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=34275338;
 //BA.debugLineNum = 34275338;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=34275339;
 //BA.debugLineNum = 34275339;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=34275340;
 //BA.debugLineNum = 34275340;BA.debugLine="End Sub";
return null;
}
public String  _formatisodate(b4j.example.dataplaybackresolver __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "formatisodate", false))
	 {return ((String) Debug.delegate(ba, "formatisodate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=34603011;
 //BA.debugLineNum = 34603011;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=34603012;
 //BA.debugLineNum = 34603012;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=34603013;
 //BA.debugLineNum = 34603013;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=34603014;
 //BA.debugLineNum = 34603014;BA.debugLine="End Sub";
return "";
}
public String  _getofflineplaylistsdir(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Private Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="Return File.Combine(storageDir, \"playlists\")";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Private Sub IsoWeekdayFromTicks(ticks As Long) As";
RDebugUtils.currentLine=45678593;
 //BA.debugLineNum = 45678593;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=45678594;
 //BA.debugLineNum = 45678594;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=45678595;
 //BA.debugLineNum = 45678595;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=45678596;
 //BA.debugLineNum = 45678596;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
RDebugUtils.currentLine=45678597;
 //BA.debugLineNum = 45678597;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=45678598;
 //BA.debugLineNum = 45678598;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
RDebugUtils.currentLine=45678599;
 //BA.debugLineNum = 45678599;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
RDebugUtils.currentLine=45678600;
 //BA.debugLineNum = 45678600;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
RDebugUtils.currentLine=45678601;
 //BA.debugLineNum = 45678601;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
RDebugUtils.currentLine=45678602;
 //BA.debugLineNum = 45678602;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
RDebugUtils.currentLine=45678603;
 //BA.debugLineNum = 45678603;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
RDebugUtils.currentLine=45678604;
 //BA.debugLineNum = 45678604;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
RDebugUtils.currentLine=45678605;
 //BA.debugLineNum = 45678605;BA.debugLine="End Sub";
return "";
}
public String  _playlistmetadatafilename(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Private Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="End Sub";
return "";
}
public boolean  _scheduleappliestoday(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _schedule,String _todaykey,String _todayweekday) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "scheduleappliestoday", false))
	 {return ((Boolean) Debug.delegate(ba, "scheduleappliestoday", new Object[] {_schedule,_todaykey,_todayweekday}));}
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Private Sub ScheduleAppliesToday(schedule As Map,";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="Return ScheduleAppliesOnDate(schedule, todayKey,";
if (true) return __ref._scheduleappliesondate /*boolean*/ (null,_schedule,_todaykey,_todayweekday);
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
RDebugUtils.currentLine=34799617;
 //BA.debugLineNum = 34799617;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
RDebugUtils.currentLine=34799619;
 //BA.debugLineNum = 34799619;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=34799620;
 //BA.debugLineNum = 34799620;BA.debugLine="Try";
try {RDebugUtils.currentLine=34799621;
 //BA.debugLineNum = 34799621;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
RDebugUtils.currentLine=34799622;
 //BA.debugLineNum = 34799622;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=34799623;
 //BA.debugLineNum = 34799623;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=34799624;
 //BA.debugLineNum = 34799624;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=34799625;
 //BA.debugLineNum = 34799625;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=34799627;
 //BA.debugLineNum = 34799627;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
RDebugUtils.currentLine=34799629;
 //BA.debugLineNum = 34799629;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvenextdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextdataslot", new Object[] {_offlinedata}));}
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
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Public Sub ResolveNextDataSlot(offlineData As Map)";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="Dim nextSlot As Map";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=45547523;
 //BA.debugLineNum = 45547523;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=45547524;
 //BA.debugLineNum = 45547524;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=45547525;
 //BA.debugLineNum = 45547525;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=45547526;
 //BA.debugLineNum = 45547526;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = __c.DateTime.getNow();
RDebugUtils.currentLine=45547527;
 //BA.debugLineNum = 45547527;BA.debugLine="Dim bestSlotTicks As Long = 0";
_bestslotticks = (long) (0);
RDebugUtils.currentLine=45547528;
 //BA.debugLineNum = 45547528;BA.debugLine="For dayOffset = 0 To 7";
{
final int step8 = 1;
final int limit8 = (int) (7);
_dayoffset = (int) (0) ;
for (;_dayoffset <= limit8 ;_dayoffset = _dayoffset + step8 ) {
RDebugUtils.currentLine=45547529;
 //BA.debugLineNum = 45547529;BA.debugLine="Dim dayTicks As Long = StartOfDayTicks(nowTicks";
_dayticks = __ref._startofdayticks /*long*/ (null,(long) (_nowticks+_dayoffset*__c.DateTime.TicksPerDay));
RDebugUtils.currentLine=45547530;
 //BA.debugLineNum = 45547530;BA.debugLine="Dim dayKey As String = FormatIsoDate(dayTicks)";
_daykey = __ref._formatisodate /*String*/ (null,_dayticks);
RDebugUtils.currentLine=45547531;
 //BA.debugLineNum = 45547531;BA.debugLine="Dim dayWeekday As String = IsoWeekdayFromTicks(d";
_dayweekday = __ref._isoweekdayfromticks /*String*/ (null,_dayticks);
RDebugUtils.currentLine=45547532;
 //BA.debugLineNum = 45547532;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group12 = _schedules;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_scheduleobject = group12.Get(index12);
RDebugUtils.currentLine=45547533;
 //BA.debugLineNum = 45547533;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=45547534;
 //BA.debugLineNum = 45547534;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=45547535;
 //BA.debugLineNum = 45547535;BA.debugLine="If ScheduleAppliesOnDate(schedule, dayKey, day";
if (__ref._scheduleappliesondate /*boolean*/ (null,_schedule,_daykey,_dayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=45547536;
 //BA.debugLineNum = 45547536;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefa";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=45547537;
 //BA.debugLineNum = 45547537;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=45547538;
 //BA.debugLineNum = 45547538;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=45547539;
 //BA.debugLineNum = 45547539;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group19 = _slots;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_slotobject = group19.Get(index19);
RDebugUtils.currentLine=45547540;
 //BA.debugLineNum = 45547540;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=45547541;
 //BA.debugLineNum = 45547541;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=45547542;
 //BA.debugLineNum = 45547542;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"ti";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=45547543;
 //BA.debugLineNum = 45547543;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=45547544;
 //BA.debugLineNum = 45547544;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=45547545;
 //BA.debugLineNum = 45547545;BA.debugLine="Dim slotTicks As Long = dayTicks + slotMinut";
_slotticks = (long) (_dayticks+_slotminutes*__c.DateTime.TicksPerMinute);
RDebugUtils.currentLine=45547546;
 //BA.debugLineNum = 45547546;BA.debugLine="If slotTicks <= nowTicks Then Continue";
if (_slotticks<=_nowticks) { 
if (true) continue;};
RDebugUtils.currentLine=45547547;
 //BA.debugLineNum = 45547547;BA.debugLine="If bestSlotTicks > 0 And slotTicks >= bestSl";
if (_bestslotticks>0 && _slotticks>=_bestslotticks) { 
if (true) continue;};
RDebugUtils.currentLine=45547548;
 //BA.debugLineNum = 45547548;BA.debugLine="Dim streamData As Map = ExtractSlotStreamDat";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=45547549;
 //BA.debugLineNum = 45547549;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=45547550;
 //BA.debugLineNum = 45547550;BA.debugLine="nextSlot.Put(\"schedule_title\", scheduleTitle";
_nextslot.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=45547551;
 //BA.debugLineNum = 45547551;BA.debugLine="nextSlot.Put(\"slot_time\", slotTime)";
_nextslot.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=45547552;
 //BA.debugLineNum = 45547552;BA.debugLine="nextSlot.Put(\"slot_minutes\", slotMinutes)";
_nextslot.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=45547553;
 //BA.debugLineNum = 45547553;BA.debugLine="nextSlot.Put(\"slot_ticks\", slotTicks)";
_nextslot.Put((Object)("slot_ticks"),(Object)(_slotticks));
RDebugUtils.currentLine=45547554;
 //BA.debugLineNum = 45547554;BA.debugLine="nextSlot.Put(\"stream_id\", streamData.GetDefa";
_nextslot.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=45547555;
 //BA.debugLineNum = 45547555;BA.debugLine="nextSlot.Put(\"stream_title\", streamData.GetD";
_nextslot.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=45547556;
 //BA.debugLineNum = 45547556;BA.debugLine="nextSlot.Put(\"playlists\", streamData.GetDefa";
_nextslot.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=45547557;
 //BA.debugLineNum = 45547557;BA.debugLine="bestSlotTicks = slotTicks";
_bestslotticks = _slotticks;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=45547562;
 //BA.debugLineNum = 45547562;BA.debugLine="If nextSlot.IsInitialized And nextSlot.Size > 0";
if (_nextslot.IsInitialized() && _nextslot.getSize()>0) { 
if (true) break;};
 }
};
RDebugUtils.currentLine=45547564;
 //BA.debugLineNum = 45547564;BA.debugLine="Return nextSlot";
if (true) return _nextslot;
RDebugUtils.currentLine=45547565;
 //BA.debugLineNum = 45547565;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45744128;
 //BA.debugLineNum = 45744128;BA.debugLine="Private Sub StartOfDayTicks(ticks As Long) As Long";
RDebugUtils.currentLine=45744129;
 //BA.debugLineNum = 45744129;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=45744130;
 //BA.debugLineNum = 45744130;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=45744131;
 //BA.debugLineNum = 45744131;BA.debugLine="Dim dayKey As String = DateTime.Date(ticks)";
_daykey = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=45744132;
 //BA.debugLineNum = 45744132;BA.debugLine="Dim dayTicks As Long = DateTime.DateParse(dayKey)";
_dayticks = __c.DateTime.DateParse(_daykey);
RDebugUtils.currentLine=45744133;
 //BA.debugLineNum = 45744133;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=45744134;
 //BA.debugLineNum = 45744134;BA.debugLine="Return dayTicks";
if (true) return _dayticks;
RDebugUtils.currentLine=45744135;
 //BA.debugLineNum = 45744135;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Private Sub ScheduleAppliesOnDate(schedule As Map,";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="Dim startDate As String = schedule.GetDefault(\"st";
_startdate = BA.ObjectToString(_schedule.GetDefault((Object)("start"),(Object)("")));
RDebugUtils.currentLine=45613058;
 //BA.debugLineNum = 45613058;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(target";
if ((_startdate).equals("") == false && _startdate.compareTo(_targetdatekey)>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=45613059;
 //BA.debugLineNum = 45613059;BA.debugLine="Dim weekdays As List = schedule.GetDefault(\"weekd";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("weekdays"),__c.Null)));
RDebugUtils.currentLine=45613060;
 //BA.debugLineNum = 45613060;BA.debugLine="If weekdays.IsInitialized = False Or weekdays.Siz";
if (_weekdays.IsInitialized()==__c.False || _weekdays.getSize()==0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=45613061;
 //BA.debugLineNum = 45613061;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group5 = _weekdays;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_weekdayobject = group5.Get(index5);
RDebugUtils.currentLine=45613062;
 //BA.debugLineNum = 45613062;BA.debugLine="If (\"\" & weekdayObject).Trim = targetWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_targetweekday)) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=45613064;
 //BA.debugLineNum = 45613064;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=45613065;
 //BA.debugLineNum = 45613065;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Private Sub ResolveOfflineStreamTitle(currentSlot";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="Dim targetStreamId As String = currentSlot.GetDef";
_targetstreamid = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=34209795;
 //BA.debugLineNum = 34209795;BA.debugLine="Dim targetSlotTime As String = currentSlot.GetDef";
_targetslottime = BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=34209796;
 //BA.debugLineNum = 34209796;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=34209797;
 //BA.debugLineNum = 34209797;BA.debugLine="If schedules.IsInitialized = False Then Return \"\"";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=34209798;
 //BA.debugLineNum = 34209798;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group6 = _schedules;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_scheduleobject = group6.Get(index6);
RDebugUtils.currentLine=34209799;
 //BA.debugLineNum = 34209799;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=34209800;
 //BA.debugLineNum = 34209800;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=34209801;
 //BA.debugLineNum = 34209801;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=34209802;
 //BA.debugLineNum = 34209802;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=34209803;
 //BA.debugLineNum = 34209803;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group11 = _slots;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.Get(index11);
RDebugUtils.currentLine=34209804;
 //BA.debugLineNum = 34209804;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=34209805;
 //BA.debugLineNum = 34209805;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=34209806;
 //BA.debugLineNum = 34209806;BA.debugLine="If targetSlotTime <> \"\" And slot.GetDefault(\"";
if ((_targetslottime).equals("") == false && (_slot.GetDefault((Object)("time"),(Object)(""))).equals((Object)(_targetslottime)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=34209807;
 //BA.debugLineNum = 34209807;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=34209808;
 //BA.debugLineNum = 34209808;BA.debugLine="If targetStreamId <> \"\" And streamData.GetDef";
if ((_targetstreamid).equals("") == false && (_streamdata.GetDefault((Object)("id"),(Object)(""))).equals((Object)(_targetstreamid)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=34209809;
 //BA.debugLineNum = 34209809;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=34209810;
 //BA.debugLineNum = 34209810;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=34209815;
 //BA.debugLineNum = 34209815;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=34209816;
 //BA.debugLineNum = 34209816;BA.debugLine="End Sub";
return "";
}
}