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
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Public Sub ResolveDataSlotAtTicks(offlineData As M";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Dim slotContext As Map";
_slotcontext = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="slotContext.Initialize";
_slotcontext.Initialize();
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="Dim todayKey As String = FormatIsoDate(targetTick";
_todaykey = __ref._formatisodate /*String*/ (null,_targetticks);
RDebugUtils.currentLine=21430279;
 //BA.debugLineNum = 21430279;BA.debugLine="Dim nowMinutes As Int = MinutesOfDayFromTicks(tar";
_nowminutes = __ref._minutesofdayfromticks /*int*/ (null,_targetticks);
RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="Dim todayWeekday As String = IsoWeekdayFromTicks(";
_todayweekday = __ref._isoweekdayfromticks /*String*/ (null,_targetticks);
RDebugUtils.currentLine=21430281;
 //BA.debugLineNum = 21430281;BA.debugLine="Dim matchedSlots As List";
_matchedslots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21430282;
 //BA.debugLineNum = 21430282;BA.debugLine="matchedSlots.Initialize";
_matchedslots.Initialize();
RDebugUtils.currentLine=21430283;
 //BA.debugLineNum = 21430283;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group11 = _schedules;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_scheduleobject = group11.Get(index11);
RDebugUtils.currentLine=21430284;
 //BA.debugLineNum = 21430284;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=21430285;
 //BA.debugLineNum = 21430285;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=21430286;
 //BA.debugLineNum = 21430286;BA.debugLine="If ScheduleAppliesToday(schedule, todayKey, tod";
if (__ref._scheduleappliestoday /*boolean*/ (null,_schedule,_todaykey,_todayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=21430287;
 //BA.debugLineNum = 21430287;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefau";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=21430288;
 //BA.debugLineNum = 21430288;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=21430289;
 //BA.debugLineNum = 21430289;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=21430290;
 //BA.debugLineNum = 21430290;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group18 = _slots;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_slotobject = group18.Get(index18);
RDebugUtils.currentLine=21430291;
 //BA.debugLineNum = 21430291;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=21430292;
 //BA.debugLineNum = 21430292;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=21430293;
 //BA.debugLineNum = 21430293;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"tim";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=21430294;
 //BA.debugLineNum = 21430294;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes(";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=21430295;
 //BA.debugLineNum = 21430295;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=21430296;
 //BA.debugLineNum = 21430296;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=21430297;
 //BA.debugLineNum = 21430297;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21430298;
 //BA.debugLineNum = 21430298;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=21430299;
 //BA.debugLineNum = 21430299;BA.debugLine="entry.Put(\"schedule_title\", scheduleTitle)";
_entry.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=21430300;
 //BA.debugLineNum = 21430300;BA.debugLine="entry.Put(\"slot_time\", slotTime)";
_entry.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=21430301;
 //BA.debugLineNum = 21430301;BA.debugLine="entry.Put(\"slot_minutes\", slotMinutes)";
_entry.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=21430302;
 //BA.debugLineNum = 21430302;BA.debugLine="entry.Put(\"stream_id\", streamData.GetDefault(";
_entry.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=21430303;
 //BA.debugLineNum = 21430303;BA.debugLine="entry.Put(\"stream_title\", streamData.GetDefau";
_entry.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=21430304;
 //BA.debugLineNum = 21430304;BA.debugLine="entry.Put(\"playlists\", streamData.GetDefault(";
_entry.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=21430305;
 //BA.debugLineNum = 21430305;BA.debugLine="matchedSlots.Add(entry)";
_matchedslots.Add((Object)(_entry.getObject()));
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=21430310;
 //BA.debugLineNum = 21430310;BA.debugLine="If matchedSlots.Size = 0 Then Return slotContext";
if (_matchedslots.getSize()==0) { 
if (true) return _slotcontext;};
RDebugUtils.currentLine=21430311;
 //BA.debugLineNum = 21430311;BA.debugLine="Dim selectedSlot As Map";
_selectedslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21430312;
 //BA.debugLineNum = 21430312;BA.debugLine="selectedSlot.Initialize";
_selectedslot.Initialize();
RDebugUtils.currentLine=21430313;
 //BA.debugLineNum = 21430313;BA.debugLine="Dim selectedMinutes As Int = -1";
_selectedminutes = (int) (-1);
RDebugUtils.currentLine=21430314;
 //BA.debugLineNum = 21430314;BA.debugLine="For Each slotEntryObject As Object In matchedSlot";
{
final anywheresoftware.b4a.BA.IterableList group42 = _matchedslots;
final int groupLen42 = group42.getSize()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_slotentryobject = group42.Get(index42);
RDebugUtils.currentLine=21430315;
 //BA.debugLineNum = 21430315;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=21430316;
 //BA.debugLineNum = 21430316;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"s";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=21430317;
 //BA.debugLineNum = 21430317;BA.debugLine="If slotMinutes <= nowMinutes And slotMinutes >=";
if (_slotminutes<=_nowminutes && _slotminutes>=_selectedminutes) { 
RDebugUtils.currentLine=21430318;
 //BA.debugLineNum = 21430318;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=21430319;
 //BA.debugLineNum = 21430319;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
RDebugUtils.currentLine=21430322;
 //BA.debugLineNum = 21430322;BA.debugLine="If selectedSlot.Size = 0 Then";
if (_selectedslot.getSize()==0) { 
RDebugUtils.currentLine=21430323;
 //BA.debugLineNum = 21430323;BA.debugLine="selectedMinutes = 24 * 60 + 1";
_selectedminutes = (int) (24*60+1);
RDebugUtils.currentLine=21430324;
 //BA.debugLineNum = 21430324;BA.debugLine="For Each slotEntryObject As Object In matchedSlo";
{
final anywheresoftware.b4a.BA.IterableList group52 = _matchedslots;
final int groupLen52 = group52.getSize()
;int index52 = 0;
;
for (; index52 < groupLen52;index52++){
_slotentryobject = group52.Get(index52);
RDebugUtils.currentLine=21430325;
 //BA.debugLineNum = 21430325;BA.debugLine="Dim slotEntry As Map = slotEntryObject";
_slotentry = new anywheresoftware.b4a.objects.collections.Map();
_slotentry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotentryobject));
RDebugUtils.currentLine=21430326;
 //BA.debugLineNum = 21430326;BA.debugLine="Dim slotMinutes As Int = slotEntry.GetDefault(\"";
_slotminutes = (int)(BA.ObjectToNumber(_slotentry.GetDefault((Object)("slot_minutes"),(Object)(-1))));
RDebugUtils.currentLine=21430327;
 //BA.debugLineNum = 21430327;BA.debugLine="If slotMinutes > nowMinutes And slotMinutes < s";
if (_slotminutes>_nowminutes && _slotminutes<_selectedminutes) { 
RDebugUtils.currentLine=21430328;
 //BA.debugLineNum = 21430328;BA.debugLine="selectedSlot = slotEntry";
_selectedslot = _slotentry;
RDebugUtils.currentLine=21430329;
 //BA.debugLineNum = 21430329;BA.debugLine="selectedMinutes = slotMinutes";
_selectedminutes = _slotminutes;
 };
 }
};
 };
RDebugUtils.currentLine=21430333;
 //BA.debugLineNum = 21430333;BA.debugLine="Return selectedSlot";
if (true) return _selectedslot;
RDebugUtils.currentLine=21430334;
 //BA.debugLineNum = 21430334;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub ChooseNextPlaylistDescriptor(currentSlo";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Dim emptyDescriptor As Map";
_emptydescriptor = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="emptyDescriptor.Initialize";
_emptydescriptor.Initialize();
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptydescriptor;};
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
_slotkey = __ref._builddataslotkey /*String*/ (null,_currentslot);
RDebugUtils.currentLine=21626886;
 //BA.debugLineNum = 21626886;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
_cursorvalue = (int)(BA.ObjectToNumber(_workingcursors.GetDefault((Object)(_slotkey),__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_slotkey),(Object)(0)))));
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
if (_cursorvalue<0) { 
_cursorvalue = (int) (0);};
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="Dim playlistIndexForSlot As Int = cursorValue Mod";
_playlistindexforslot = (int) (_cursorvalue%_playlists.getSize());
RDebugUtils.currentLine=21626889;
 //BA.debugLineNum = 21626889;BA.debugLine="workingCursors.Put(slotKey, playlistIndexForSlot";
_workingcursors.Put((Object)(_slotkey),(Object)(_playlistindexforslot+1));
RDebugUtils.currentLine=21626890;
 //BA.debugLineNum = 21626890;BA.debugLine="Trace(\"Курсор playlists. slot=\" & slotKey & \", st";
__ref._trace /*String*/ (null,"Курсор playlists. slot="+_slotkey+", stored="+BA.NumberToString(_cursorvalue)+", previewNextStored="+BA.ObjectToString(_workingcursors.GetDefault((Object)(_slotkey),(Object)(0)))+", playlists="+BA.NumberToString(_playlists.getSize()));
RDebugUtils.currentLine=21626891;
 //BA.debugLineNum = 21626891;BA.debugLine="Dim playlistObject As Object = playlists.Get(play";
_playlistobject = _playlists.Get(_playlistindexforslot);
RDebugUtils.currentLine=21626892;
 //BA.debugLineNum = 21626892;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=21626893;
 //BA.debugLineNum = 21626893;BA.debugLine="Dim playlistSource As Map = playlistObject";
_playlistsource = new anywheresoftware.b4a.objects.collections.Map();
_playlistsource = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=21626894;
 //BA.debugLineNum = 21626894;BA.debugLine="Dim playlist As Map = CloneMap(playlistSource)";
_playlist = new anywheresoftware.b4a.objects.collections.Map();
_playlist = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistsource);
RDebugUtils.currentLine=21626895;
 //BA.debugLineNum = 21626895;BA.debugLine="playlist.Put(\"_slot_key\", slotKey)";
_playlist.Put((Object)("_slot_key"),(Object)(_slotkey));
RDebugUtils.currentLine=21626896;
 //BA.debugLineNum = 21626896;BA.debugLine="playlist.Put(\"_playlist_index\", playlistIndexFor";
_playlist.Put((Object)("_playlist_index"),(Object)(_playlistindexforslot));
RDebugUtils.currentLine=21626897;
 //BA.debugLineNum = 21626897;BA.debugLine="Trace(\"Выбран playlist для локального воспроизве";
__ref._trace /*String*/ (null,"Выбран playlist для локального воспроизведения. slot="+_slotkey+", index="+BA.NumberToString(_playlistindexforslot)+", playlistId="+BA.ObjectToString(_playlist.GetDefault((Object)("id"),(Object)("")))+", title="+BA.ObjectToString(_playlist.GetDefault((Object)("title"),(Object)(""))));
RDebugUtils.currentLine=21626898;
 //BA.debugLineNum = 21626898;BA.debugLine="Return playlist";
if (true) return _playlist;
 };
RDebugUtils.currentLine=21626900;
 //BA.debugLineNum = 21626900;BA.debugLine="Return emptyDescriptor";
if (true) return _emptydescriptor;
RDebugUtils.currentLine=21626901;
 //BA.debugLineNum = 21626901;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Dim playlistData As Map";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="If playlistId = \"\" Then Return playlistData";
if ((_playlistid).equals("")) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="If File.Exists(GetOfflinePlaylistsDir, PlaylistMe";
if (__c.File.Exists(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid))==__c.False) { 
if (true) return _playlistdata;};
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="Try";
try {RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="parser.Initialize(File.ReadString(GetOfflinePlay";
_parser.Initialize(__c.File.ReadString(__ref._getofflineplaylistsdir /*String*/ (null),__ref._playlistmetadatafilename /*String*/ (null,_playlistid)));
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="Dim parsedData As Map = parser.NextObject";
_parseddata = new anywheresoftware.b4a.objects.collections.Map();
_parseddata = _parser.NextObject();
RDebugUtils.currentLine=21692425;
 //BA.debugLineNum = 21692425;BA.debugLine="If parsedData.IsInitialized Then playlistData =";
if (_parseddata.IsInitialized()) { 
_playlistdata = _parseddata;};
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=21692427;
 //BA.debugLineNum = 21692427;BA.debugLine="playlistData.Initialize";
_playlistdata.Initialize();
RDebugUtils.currentLine=21692428;
 //BA.debugLineNum = 21692428;BA.debugLine="Trace(\"Не удалось загрузить playlist metadata из";
__ref._trace /*String*/ (null,"Не удалось загрузить playlist metadata из кэша. id="+_playlistid+", message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=21692430;
 //BA.debugLineNum = 21692430;BA.debugLine="Return playlistData";
if (true) return _playlistdata;
RDebugUtils.currentLine=21692431;
 //BA.debugLineNum = 21692431;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.List _filteredtracks = null;
anywheresoftware.b4a.objects.collections.List _cachedtracks = null;
anywheresoftware.b4a.objects.collections.List _nonrepeatedtracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
anywheresoftware.b4a.objects.collections.List _sourcetracks = null;
anywheresoftware.b4a.objects.collections.List _nonrepeatedcachedtracks = null;
Object _cachedtrackobject = null;
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
int _randomindex = 0;
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Public Sub ChooseRandomTrackFromPlaylist(playlistD";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Dim emptyTrack As Map";
_emptytrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="emptyTrack.Initialize";
_emptytrack.Initialize();
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="Dim playlistId As String = playlistData.GetDefaul";
_playlistid = BA.ObjectToString(_playlistdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="Dim lastTrackId As String = \"\"";
_lasttrackid = "";
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="If playlistId <> \"\" Then lastTrackId = lastTrackB";
if ((_playlistid).equals("") == false) { 
_lasttrackid = BA.ObjectToString(__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_playlistid),(Object)("")));};
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=21757960;
 //BA.debugLineNum = 21757960;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=21757961;
 //BA.debugLineNum = 21757961;BA.debugLine="Dim filteredTracks As List";
_filteredtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21757962;
 //BA.debugLineNum = 21757962;BA.debugLine="filteredTracks.Initialize";
_filteredtracks.Initialize();
RDebugUtils.currentLine=21757963;
 //BA.debugLineNum = 21757963;BA.debugLine="Dim cachedTracks As List";
_cachedtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21757964;
 //BA.debugLineNum = 21757964;BA.debugLine="cachedTracks.Initialize";
_cachedtracks.Initialize();
RDebugUtils.currentLine=21757965;
 //BA.debugLineNum = 21757965;BA.debugLine="Dim nonRepeatedTracks As List";
_nonrepeatedtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21757966;
 //BA.debugLineNum = 21757966;BA.debugLine="nonRepeatedTracks.Initialize";
_nonrepeatedtracks.Initialize();
RDebugUtils.currentLine=21757967;
 //BA.debugLineNum = 21757967;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group15 = _tracks;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_trackobject = group15.Get(index15);
RDebugUtils.currentLine=21757968;
 //BA.debugLineNum = 21757968;BA.debugLine="If trackObject Is Map Then";
if (_trackobject instanceof java.util.Map) { 
RDebugUtils.currentLine=21757969;
 //BA.debugLineNum = 21757969;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=21757970;
 //BA.debugLineNum = 21757970;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=21757971;
 //BA.debugLineNum = 21757971;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=21757972;
 //BA.debugLineNum = 21757972;BA.debugLine="If cachedOnly And mediaCacheService.IsTrackCach";
if (_cachedonly && _mediacacheservice._istrackcached /*boolean*/ (null,_trackid)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=21757973;
 //BA.debugLineNum = 21757973;BA.debugLine="cachedTracks.Add(track)";
_cachedtracks.Add((Object)(_track.getObject()));
RDebugUtils.currentLine=21757974;
 //BA.debugLineNum = 21757974;BA.debugLine="If trackId <> lastTrackId Then nonRepeatedTrack";
if ((_trackid).equals(_lasttrackid) == false) { 
_nonrepeatedtracks.Add((Object)(_track.getObject()));};
RDebugUtils.currentLine=21757975;
 //BA.debugLineNum = 21757975;BA.debugLine="If recentTrackIds.IndexOf(trackId) = -1 Then fi";
if (__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_trackid))==-1) { 
_filteredtracks.Add((Object)(_track.getObject()));};
 };
 }
};
RDebugUtils.currentLine=21757978;
 //BA.debugLineNum = 21757978;BA.debugLine="Dim sourceTracks As List";
_sourcetracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21757979;
 //BA.debugLineNum = 21757979;BA.debugLine="If cachedOnly Then";
if (_cachedonly) { 
RDebugUtils.currentLine=21757980;
 //BA.debugLineNum = 21757980;BA.debugLine="sourceTracks = cachedTracks";
_sourcetracks = _cachedtracks;
RDebugUtils.currentLine=21757981;
 //BA.debugLineNum = 21757981;BA.debugLine="If filteredTracks.Size > 0 Then sourceTracks = f";
if (_filteredtracks.getSize()>0) { 
_sourcetracks = _filteredtracks;};
RDebugUtils.currentLine=21757982;
 //BA.debugLineNum = 21757982;BA.debugLine="If sourceTracks.Size > 1 And lastTrackId <> \"\" T";
if (_sourcetracks.getSize()>1 && (_lasttrackid).equals("") == false) { 
RDebugUtils.currentLine=21757983;
 //BA.debugLineNum = 21757983;BA.debugLine="Dim nonRepeatedCachedTracks As List";
_nonrepeatedcachedtracks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21757984;
 //BA.debugLineNum = 21757984;BA.debugLine="nonRepeatedCachedTracks.Initialize";
_nonrepeatedcachedtracks.Initialize();
RDebugUtils.currentLine=21757985;
 //BA.debugLineNum = 21757985;BA.debugLine="For Each cachedTrackObject As Object In sourceT";
{
final anywheresoftware.b4a.BA.IterableList group33 = _sourcetracks;
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_cachedtrackobject = group33.Get(index33);
RDebugUtils.currentLine=21757986;
 //BA.debugLineNum = 21757986;BA.debugLine="If cachedTrackObject Is Map Then";
if (_cachedtrackobject instanceof java.util.Map) { 
RDebugUtils.currentLine=21757987;
 //BA.debugLineNum = 21757987;BA.debugLine="Dim cachedTrack As Map = cachedTrackObject";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_cachedtrackobject));
RDebugUtils.currentLine=21757988;
 //BA.debugLineNum = 21757988;BA.debugLine="If cachedTrack.GetDefault(\"id\", \"\") <> lastTr";
if ((_cachedtrack.GetDefault((Object)("id"),(Object)(""))).equals((Object)(_lasttrackid)) == false) { 
_nonrepeatedcachedtracks.Add((Object)(_cachedtrack.getObject()));};
 };
 }
};
RDebugUtils.currentLine=21757991;
 //BA.debugLineNum = 21757991;BA.debugLine="If nonRepeatedCachedTracks.Size > 0 Then source";
if (_nonrepeatedcachedtracks.getSize()>0) { 
_sourcetracks = _nonrepeatedcachedtracks;};
 };
 }else {
RDebugUtils.currentLine=21757994;
 //BA.debugLineNum = 21757994;BA.debugLine="sourceTracks = tracks";
_sourcetracks = _tracks;
RDebugUtils.currentLine=21757995;
 //BA.debugLineNum = 21757995;BA.debugLine="If filteredTracks.Size > 0 Then sourceTracks = f";
if (_filteredtracks.getSize()>0) { 
_sourcetracks = _filteredtracks;};
RDebugUtils.currentLine=21757996;
 //BA.debugLineNum = 21757996;BA.debugLine="If sourceTracks.Size > 1 And nonRepeatedTracks.S";
if (_sourcetracks.getSize()>1 && _nonrepeatedtracks.getSize()>0) { 
_sourcetracks = _nonrepeatedtracks;};
 };
RDebugUtils.currentLine=21757998;
 //BA.debugLineNum = 21757998;BA.debugLine="If sourceTracks.IsInitialized = False Or sourceTr";
if (_sourcetracks.IsInitialized()==__c.False || _sourcetracks.getSize()==0) { 
if (true) return _emptytrack;};
RDebugUtils.currentLine=21757999;
 //BA.debugLineNum = 21757999;BA.debugLine="Dim randomIndex As Int = Rnd(0, sourceTracks.Size";
_randomindex = __c.Rnd((int) (0),_sourcetracks.getSize());
RDebugUtils.currentLine=21758000;
 //BA.debugLineNum = 21758000;BA.debugLine="Dim trackObject As Object = sourceTracks.Get(rand";
_trackobject = _sourcetracks.Get(_randomindex);
RDebugUtils.currentLine=21758001;
 //BA.debugLineNum = 21758001;BA.debugLine="If trackObject Is Map Then Return trackObject";
if (_trackobject instanceof java.util.Map) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));};
RDebugUtils.currentLine=21758002;
 //BA.debugLineNum = 21758002;BA.debugLine="Return emptyTrack";
if (true) return _emptytrack;
RDebugUtils.currentLine=21758003;
 //BA.debugLineNum = 21758003;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createqueuetrackfromplaylist(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.Map _playlistdescriptor,anywheresoftware.b4a.objects.collections.Map _track,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createqueuetrackfromplaylist", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createqueuetrackfromplaylist", new Object[] {_currentslot,_playlistdescriptor,_track,_offlinedata}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub CreateQueueTrackFromPlaylist(currentSlo";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Dim item As Map";
_item = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="item.Put(\"type\", \"track\")";
_item.Put((Object)("type"),(Object)("track"));
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="item.Put(\"id\", track.GetDefault(\"id\", \"\"))";
_item.Put((Object)("id"),_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="item.Put(\"code\", track.GetDefault(\"code\", \"\"))";
_item.Put((Object)("code"),_track.GetDefault((Object)("code"),(Object)("")));
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="item.Put(\"set\", track.GetDefault(\"set\", \"\"))";
_item.Put((Object)("set"),_track.GetDefault((Object)("set"),(Object)("")));
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="item.Put(\"duration\", track.GetDefault(\"duration\",";
_item.Put((Object)("duration"),_track.GetDefault((Object)("duration"),(Object)(0)));
RDebugUtils.currentLine=21823496;
 //BA.debugLineNum = 21823496;BA.debugLine="item.Put(\"gain\", track.GetDefault(\"gain\", -3))";
_item.Put((Object)("gain"),_track.GetDefault((Object)("gain"),(Object)(-3)));
RDebugUtils.currentLine=21823497;
 //BA.debugLineNum = 21823497;BA.debugLine="item.Put(\"stream\", ResolvePlaybackStreamTitle(cur";
_item.Put((Object)("stream"),(Object)(__ref._resolveplaybackstreamtitle /*String*/ (null,_currentslot,_playlistdescriptor,_offlinedata)));
RDebugUtils.currentLine=21823498;
 //BA.debugLineNum = 21823498;BA.debugLine="item.Put(\"playlist_id\", playlistDescriptor.GetDef";
_item.Put((Object)("playlist_id"),_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=21823499;
 //BA.debugLineNum = 21823499;BA.debugLine="item.Put(\"playlist_title\", playlistDescriptor.Get";
_item.Put((Object)("playlist_title"),_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=21823500;
 //BA.debugLineNum = 21823500;BA.debugLine="item.Put(\"slot_key\", playlistDescriptor.GetDefaul";
_item.Put((Object)("slot_key"),_playlistdescriptor.GetDefault((Object)("_slot_key"),(Object)(__ref._builddataslotkey /*String*/ (null,_currentslot))));
RDebugUtils.currentLine=21823501;
 //BA.debugLineNum = 21823501;BA.debugLine="item.Put(\"playlist_index\", playlistDescriptor.Get";
_item.Put((Object)("playlist_index"),_playlistdescriptor.GetDefault((Object)("_playlist_index"),(Object)(0)));
RDebugUtils.currentLine=21823502;
 //BA.debugLineNum = 21823502;BA.debugLine="item.Put(\"schedule_title\", currentSlot.GetDefault";
_item.Put((Object)("schedule_title"),_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=21823503;
 //BA.debugLineNum = 21823503;BA.debugLine="item.Put(\"slot_time\", currentSlot.GetDefault(\"slo";
_item.Put((Object)("slot_time"),_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=21823504;
 //BA.debugLineNum = 21823504;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=21823505;
 //BA.debugLineNum = 21823505;BA.debugLine="End Sub";
return null;
}
public String  _rememberresolvedtrack(b4j.example.dataplaybackresolver __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "rememberresolvedtrack", false))
	 {return ((String) Debug.delegate(ba, "rememberresolvedtrack", new Object[] {_trackid}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Public Sub RememberResolvedTrack(trackId As String";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="recentTrackIds.Add(trackId)";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_trackid));
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="Do While recentTrackIds.Size > 20";
while (__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>20) {
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="recentTrackIds.RemoveAt(0)";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="If storageRef.IsInitialized Then storageRef.Put(\"";
if (__ref._storageref /*b4j.example.keyvaluestore*/ .IsInitialized /*boolean*/ ()) { 
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"data_recent_track_ids",(Object)(__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));};
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _cloneplaylistcursors(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cloneplaylistcursors", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "cloneplaylistcursors", null));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub ClonePlaylistCursors As Map";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Return CloneMap(playlistCursors)";
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="End Sub";
return null;
}
public String  _savepreviewplaylistcursors(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _workingcursors) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "savepreviewplaylistcursors", false))
	 {return ((String) Debug.delegate(ba, "savepreviewplaylistcursors", new Object[] {_storage,_workingcursors}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub SavePreviewPlaylistCursors(storage As K";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="If workingCursors.IsInitialized = False Or workin";
if (_workingcursors.IsInitialized()==__c.False || _workingcursors.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="playlistCursors = CloneMap(workingCursors)";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_workingcursors);
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ (null,"data_slot_playlist_cursors",(Object)(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="Trace(\"Сохранен preview курсор playlists. count=\"";
__ref._trace /*String*/ (null,"Сохранен preview курсор playlists. count="+BA.NumberToString(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,Object _targetmodulevalue,String _tracesubnamevalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_targetmodulevalue,_tracesubnamevalue}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Public Sub Initialize(storageDirValue As String, t";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="targetModule = targetModuleValue";
__ref._targetmodule /*Object*/  = _targetmodulevalue;
RDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="traceSubName = traceSubNameValue";
__ref._tracesubname /*String*/  = _tracesubnamevalue;
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="playlistCursors.Initialize";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="recentTrackIds.Initialize";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="lastTrackByPlaylist.Initialize";
__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=21102599;
 //BA.debugLineNum = 21102599;BA.debugLine="End Sub";
return "";
}
public String  _loadstate(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "loadstate", false))
	 {return ((String) Debug.delegate(ba, "loadstate", new Object[] {_storage}));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub LoadState(storage As KeyValueStore)";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="storageRef = storage";
__ref._storageref /*b4j.example.keyvaluestore*/  = _storage;
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="playlistCursors = storage.GetDefault(\"data_slot_p";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ (null,"data_slot_playlist_cursors",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="If playlistCursors.IsInitialized = False Then pla";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="recentTrackIds = storage.GetDefault(\"data_recent_";
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_storage._getdefault /*Object*/ (null,"data_recent_track_ids",(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()))));
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="If recentTrackIds.IsInitialized = False Then rece";
if (__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._recenttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="lastTrackByPlaylist = storage.GetDefault(\"data_la";
__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_storage._getdefault /*Object*/ (null,"data_last_track_by_playlist",(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="If lastTrackByPlaylist.IsInitialized = False Then";
if (__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=21168136;
 //BA.debugLineNum = 21168136;BA.debugLine="End Sub";
return "";
}
public int  _cursorcount(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "cursorcount", false))
	 {return ((Integer) Debug.delegate(ba, "cursorcount", null));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Public Sub CursorCount As Int";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="If playlistCursors.IsInitialized = False Then Ret";
if (__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="Return playlistCursors.Size";
if (true) return __ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="End Sub";
return 0;
}
public String  _commitplaylistcursor(b4j.example.dataplaybackresolver __ref,b4j.example.keyvaluestore _storage,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "commitplaylistcursor", false))
	 {return ((String) Debug.delegate(ba, "commitplaylistcursor", new Object[] {_storage,_item}));}
String _slotkey = "";
int _nextstored = 0;
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Public Sub CommitPlaylistCursor(storage As KeyValu";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return "";};
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="Dim slotKey As String = item.GetDefault(\"slot_key";
_slotkey = BA.ObjectToString(_item.GetDefault((Object)("slot_key"),(Object)("")));
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="If slotKey = \"\" Then Return";
if ((_slotkey).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="Dim nextStored As Int = item.GetDefault(\"playlist";
_nextstored = (int) ((double)(BA.ObjectToNumber(_item.GetDefault((Object)("playlist_index"),(Object)(0))))+1);
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="playlistCursors.Put(slotKey, nextStored)";
__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_slotkey),(Object)(_nextstored));
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="storage.Put(\"data_slot_playlist_cursors\", playlis";
_storage._put /*String*/ (null,"data_slot_playlist_cursors",(Object)(__ref._playlistcursors /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="Trace(\"Зафиксирован курсор playlists. slot=\" & sl";
__ref._trace /*String*/ (null,"Зафиксирован курсор playlists. slot="+_slotkey+", committed="+BA.NumberToString(_nextstored));
RDebugUtils.currentLine=21889033;
 //BA.debugLineNum = 21889033;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolvecurrentdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvecurrentdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvecurrentdataslot", new Object[] {_offlinedata}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub ResolveCurrentDataSlot(offlineData As M";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Return ResolveDataSlotAtTicks(offlineData, DateTi";
if (true) return __ref._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,__c.DateTime.getNow());
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(offlineData";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Dim nextSlot As Map";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return _nextslot;};
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Dim nowTicks As Long = referenceTicks";
_nowticks = _referenceticks;
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="Dim bestSlotTicks As Long = 0";
_bestslotticks = (long) (0);
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="For dayOffset = 0 To 7";
{
final int step8 = 1;
final int limit8 = (int) (7);
_dayoffset = (int) (0) ;
for (;_dayoffset <= limit8 ;_dayoffset = _dayoffset + step8 ) {
RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="Dim dayTicks As Long = StartOfDayTicks(nowTicks";
_dayticks = __ref._startofdayticks /*long*/ (null,(long) (_nowticks+_dayoffset*__c.DateTime.TicksPerDay));
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="Dim dayKey As String = FormatIsoDate(dayTicks)";
_daykey = __ref._formatisodate /*String*/ (null,_dayticks);
RDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="Dim dayWeekday As String = IsoWeekdayFromTicks(d";
_dayweekday = __ref._isoweekdayfromticks /*String*/ (null,_dayticks);
RDebugUtils.currentLine=21561356;
 //BA.debugLineNum = 21561356;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group12 = _schedules;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_scheduleobject = group12.Get(index12);
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=21561358;
 //BA.debugLineNum = 21561358;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="If ScheduleAppliesOnDate(schedule, dayKey, day";
if (__ref._scheduleappliesondate /*boolean*/ (null,_schedule,_daykey,_dayweekday)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=21561360;
 //BA.debugLineNum = 21561360;BA.debugLine="Dim scheduleTitle As String = schedule.GetDefa";
_scheduletitle = BA.ObjectToString(_schedule.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=21561361;
 //BA.debugLineNum = 21561361;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=21561362;
 //BA.debugLineNum = 21561362;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=21561363;
 //BA.debugLineNum = 21561363;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group19 = _slots;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_slotobject = group19.Get(index19);
RDebugUtils.currentLine=21561364;
 //BA.debugLineNum = 21561364;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=21561365;
 //BA.debugLineNum = 21561365;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=21561366;
 //BA.debugLineNum = 21561366;BA.debugLine="Dim slotTime As String = slot.GetDefault(\"ti";
_slottime = BA.ObjectToString(_slot.GetDefault((Object)("time"),(Object)("")));
RDebugUtils.currentLine=21561367;
 //BA.debugLineNum = 21561367;BA.debugLine="Dim slotMinutes As Int = TimeStringToMinutes";
_slotminutes = __ref._timestringtominutes /*int*/ (null,_slottime);
RDebugUtils.currentLine=21561368;
 //BA.debugLineNum = 21561368;BA.debugLine="If slotMinutes < 0 Then Continue";
if (_slotminutes<0) { 
if (true) continue;};
RDebugUtils.currentLine=21561369;
 //BA.debugLineNum = 21561369;BA.debugLine="Dim slotTicks As Long = dayTicks + slotMinut";
_slotticks = (long) (_dayticks+_slotminutes*__c.DateTime.TicksPerMinute);
RDebugUtils.currentLine=21561370;
 //BA.debugLineNum = 21561370;BA.debugLine="If slotTicks <= nowTicks Then Continue";
if (_slotticks<=_nowticks) { 
if (true) continue;};
RDebugUtils.currentLine=21561371;
 //BA.debugLineNum = 21561371;BA.debugLine="If bestSlotTicks > 0 And slotTicks >= bestSl";
if (_bestslotticks>0 && _slotticks>=_bestslotticks) { 
if (true) continue;};
RDebugUtils.currentLine=21561372;
 //BA.debugLineNum = 21561372;BA.debugLine="Dim streamData As Map = ExtractSlotStreamDat";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=21561373;
 //BA.debugLineNum = 21561373;BA.debugLine="nextSlot.Initialize";
_nextslot.Initialize();
RDebugUtils.currentLine=21561374;
 //BA.debugLineNum = 21561374;BA.debugLine="nextSlot.Put(\"schedule_title\", scheduleTitle";
_nextslot.Put((Object)("schedule_title"),(Object)(_scheduletitle));
RDebugUtils.currentLine=21561375;
 //BA.debugLineNum = 21561375;BA.debugLine="nextSlot.Put(\"slot_time\", slotTime)";
_nextslot.Put((Object)("slot_time"),(Object)(_slottime));
RDebugUtils.currentLine=21561376;
 //BA.debugLineNum = 21561376;BA.debugLine="nextSlot.Put(\"slot_minutes\", slotMinutes)";
_nextslot.Put((Object)("slot_minutes"),(Object)(_slotminutes));
RDebugUtils.currentLine=21561377;
 //BA.debugLineNum = 21561377;BA.debugLine="nextSlot.Put(\"slot_ticks\", slotTicks)";
_nextslot.Put((Object)("slot_ticks"),(Object)(_slotticks));
RDebugUtils.currentLine=21561378;
 //BA.debugLineNum = 21561378;BA.debugLine="nextSlot.Put(\"stream_id\", streamData.GetDefa";
_nextslot.Put((Object)("stream_id"),_streamdata.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=21561379;
 //BA.debugLineNum = 21561379;BA.debugLine="nextSlot.Put(\"stream_title\", streamData.GetD";
_nextslot.Put((Object)("stream_title"),_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=21561380;
 //BA.debugLineNum = 21561380;BA.debugLine="nextSlot.Put(\"playlists\", streamData.GetDefa";
_nextslot.Put((Object)("playlists"),_streamdata.GetDefault((Object)("playlists"),(Object)(__ref._createinitializedlist /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject())));
RDebugUtils.currentLine=21561381;
 //BA.debugLineNum = 21561381;BA.debugLine="bestSlotTicks = slotTicks";
_bestslotticks = _slotticks;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=21561386;
 //BA.debugLineNum = 21561386;BA.debugLine="If nextSlot.IsInitialized And nextSlot.Size > 0";
if (_nextslot.IsInitialized() && _nextslot.getSize()>0) { 
if (true) break;};
 }
};
RDebugUtils.currentLine=21561388;
 //BA.debugLineNum = 21561388;BA.debugLine="Return nextSlot";
if (true) return _nextslot;
RDebugUtils.currentLine=21561389;
 //BA.debugLineNum = 21561389;BA.debugLine="End Sub";
return null;
}
public String  _builddataslotkey(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "builddataslotkey", false))
	 {return ((String) Debug.delegate(ba, "builddataslotkey", new Object[] {_currentslot}));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.dataplaybackresolver __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="If SubExists(targetModule, traceSubName) Then";
if (__c.SubExists(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ )) { 
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="CallSub2(targetModule, traceSubName, message)";
__c.CallSubNew2(ba,__ref._targetmodule /*Object*/ ,__ref._tracesubname /*String*/ ,(Object)(_message));
 };
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=23068679;
 //BA.debugLineNum = 23068679;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="Private targetModule As Object";
_targetmodule = new Object();
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="Private traceSubName As String";
_tracesubname = "";
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="Private playlistCursors As Map";
_playlistcursors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21037061;
 //BA.debugLineNum = 21037061;BA.debugLine="Private recentTrackIds As List";
_recenttrackids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="Private storageRef As KeyValueStore";
_storageref = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="Private lastTrackByPlaylist As Map";
_lasttrackbyplaylist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21037064;
 //BA.debugLineNum = 21037064;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createinitializedlist(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createinitializedlist", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Private Sub CreateInitializedList As List";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="Return items";
if (true) return _items;
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub ResolvePlaybackStreamTitle(currentSlot";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Dim streamTitle As String = currentSlot.GetDefaul";
_streamtitle = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="Dim resolvedStreamTitle As String = ResolveOfflin";
_resolvedstreamtitle = __ref._resolveofflinestreamtitle /*String*/ (null,_currentslot,_offlinedata);
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="If resolvedStreamTitle <> \"\" Then Return resolved";
if ((_resolvedstreamtitle).equals("") == false) { 
if (true) return _resolvedstreamtitle;};
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="Dim scheduleTitle As String = currentSlot.GetDefa";
_scheduletitle = BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")));
RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="Dim descriptorStreamTitle As String = playlistDes";
_descriptorstreamtitle = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="If descriptorStreamTitle <> \"\" Then Return descri";
if ((_descriptorstreamtitle).equals("") == false) { 
if (true) return _descriptorstreamtitle;};
RDebugUtils.currentLine=22151176;
 //BA.debugLineNum = 22151176;BA.debugLine="If scheduleTitle <> \"\" Then Return scheduleTitle";
if ((_scheduletitle).equals("") == false) { 
if (true) return _scheduletitle;};
RDebugUtils.currentLine=22151177;
 //BA.debugLineNum = 22151177;BA.debugLine="Return playlistDescriptor.GetDefault(\"title\", \"\")";
if (true) return BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=22151178;
 //BA.debugLineNum = 22151178;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _extractslotstreamdata(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _slot) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "extractslotstreamdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractslotstreamdata", new Object[] {_slot}));}
anywheresoftware.b4a.objects.collections.Map _streamdata = null;
Object _streamobject = null;
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Private Sub ExtractSlotStreamData(slot As Map) As";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Dim streamData As Map";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="streamData.Initialize";
_streamdata.Initialize();
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="If slot.IsInitialized = False Then Return streamD";
if (_slot.IsInitialized()==__c.False) { 
if (true) return _streamdata;};
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="Dim streamObject As Object = slot.Get(\"stream\")";
_streamobject = _slot.Get((Object)("stream"));
RDebugUtils.currentLine=22282245;
 //BA.debugLineNum = 22282245;BA.debugLine="If streamObject Is Map Then";
if (_streamobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22282246;
 //BA.debugLineNum = 22282246;BA.debugLine="streamData = streamObject";
_streamdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_streamobject));
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="Return streamData";
if (true) return _streamdata;
 };
RDebugUtils.currentLine=22282249;
 //BA.debugLineNum = 22282249;BA.debugLine="If streamObject <> Null Then streamData.Put(\"id\",";
if (_streamobject!= null) { 
_streamdata.Put((Object)("id"),(Object)(""+BA.ObjectToString(_streamobject)));};
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="If slot.ContainsKey(\"playlists\") Then streamData.";
if (_slot.ContainsKey((Object)("playlists"))) { 
_streamdata.Put((Object)("playlists"),_slot.Get((Object)("playlists")));};
RDebugUtils.currentLine=22282251;
 //BA.debugLineNum = 22282251;BA.debugLine="Return streamData";
if (true) return _streamdata;
RDebugUtils.currentLine=22282252;
 //BA.debugLineNum = 22282252;BA.debugLine="End Sub";
return null;
}
public String  _formatisodate(b4j.example.dataplaybackresolver __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "formatisodate", false))
	 {return ((String) Debug.delegate(ba, "formatisodate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Private Sub FormatIsoDate(ticks As Long) As String";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=22675462;
 //BA.debugLineNum = 22675462;BA.debugLine="End Sub";
return "";
}
public String  _getofflineplaylistsdir(b4j.example.dataplaybackresolver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "getofflineplaylistsdir", false))
	 {return ((String) Debug.delegate(ba, "getofflineplaylistsdir", null));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Private Sub GetOfflinePlaylistsDir As String";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Return File.Combine(storageDir, \"playlists\")";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,"playlists");
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Private Sub IsoWeekdayFromTicks(ticks As Long) As";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant\"";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="Dim zoneClass As JavaObject";
_zoneclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="zoneClass.InitializeStatic(\"java.time.ZoneId\")";
_zoneclass.InitializeStatic("java.time.ZoneId");
RDebugUtils.currentLine=22806533;
 //BA.debugLineNum = 22806533;BA.debugLine="Dim zonedDateTimeClass As JavaObject";
_zoneddatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=22806534;
 //BA.debugLineNum = 22806534;BA.debugLine="zonedDateTimeClass.InitializeStatic(\"java.time.Zo";
_zoneddatetimeclass.InitializeStatic("java.time.ZonedDateTime");
RDebugUtils.currentLine=22806535;
 //BA.debugLineNum = 22806535;BA.debugLine="Dim instant As JavaObject = instantClass.RunMetho";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("ofEpochMilli",new Object[]{(Object)(_ticks)})));
RDebugUtils.currentLine=22806536;
 //BA.debugLineNum = 22806536;BA.debugLine="Dim zoneId As JavaObject = zoneClass.RunMethod(\"s";
_zoneid = new anywheresoftware.b4j.object.JavaObject();
_zoneid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneclass.RunMethod("systemDefault",(Object[])(__c.Null))));
RDebugUtils.currentLine=22806537;
 //BA.debugLineNum = 22806537;BA.debugLine="Dim zonedDateTime As JavaObject = zonedDateTimeCl";
_zoneddatetime = new anywheresoftware.b4j.object.JavaObject();
_zoneddatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetimeclass.RunMethod("ofInstant",new Object[]{(Object)(_instant.getObject()),(Object)(_zoneid.getObject())})));
RDebugUtils.currentLine=22806538;
 //BA.debugLineNum = 22806538;BA.debugLine="Dim localDate As JavaObject = zonedDateTime.RunMe";
_localdate = new anywheresoftware.b4j.object.JavaObject();
_localdate = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_zoneddatetime.RunMethod("toLocalDate",(Object[])(__c.Null))));
RDebugUtils.currentLine=22806539;
 //BA.debugLineNum = 22806539;BA.debugLine="Dim dayOfWeek As JavaObject = localDate.RunMethod";
_dayofweek = new anywheresoftware.b4j.object.JavaObject();
_dayofweek = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_localdate.RunMethod("getDayOfWeek",(Object[])(__c.Null))));
RDebugUtils.currentLine=22806540;
 //BA.debugLineNum = 22806540;BA.debugLine="Return \"\" & dayOfWeek.RunMethod(\"getValue\", Null)";
if (true) return ""+BA.ObjectToString(_dayofweek.RunMethod("getValue",(Object[])(__c.Null)));
RDebugUtils.currentLine=22806541;
 //BA.debugLineNum = 22806541;BA.debugLine="End Sub";
return "";
}
public String  _playlistmetadatafilename(b4j.example.dataplaybackresolver __ref,String _playlistid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "playlistmetadatafilename", false))
	 {return ((String) Debug.delegate(ba, "playlistmetadatafilename", new Object[] {_playlistid}));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Private Sub PlaylistMetadataFileName(playlistId As";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Return playlistId & \".json\"";
if (true) return _playlistid+".json";
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Private Sub MinutesOfDayFromTicks(ticks As Long) A";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="Dim timeValue As String = DateTime.Time(ticks)";
_timevalue = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=22740997;
 //BA.debugLineNum = 22740997;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=22740998;
 //BA.debugLineNum = 22740998;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=22740999;
 //BA.debugLineNum = 22740999;BA.debugLine="Return parts(0) * 60 + parts(1)";
if (true) return (int) ((double)(Double.parseDouble(_parts[(int) (0)]))*60+(double)(Double.parseDouble(_parts[(int) (1)])));
RDebugUtils.currentLine=22741000;
 //BA.debugLineNum = 22741000;BA.debugLine="End Sub";
return 0;
}
public String  _rememberresolvedtrackforplaylist(b4j.example.dataplaybackresolver __ref,String _playlistid,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "rememberresolvedtrackforplaylist", false))
	 {return ((String) Debug.delegate(ba, "rememberresolvedtrackforplaylist", new Object[] {_playlistid,_trackid}));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Public Sub RememberResolvedTrackForPlaylist(playli";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="If playlistId = \"\" Or trackId = \"\" Then Return";
if ((_playlistid).equals("") || (_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="lastTrackByPlaylist.Put(playlistId, trackId)";
__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_playlistid),(Object)(_trackid));
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="If storageRef.IsInitialized Then storageRef.Put(\"";
if (__ref._storageref /*b4j.example.keyvaluestore*/ .IsInitialized /*boolean*/ ()) { 
__ref._storageref /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"data_last_track_by_playlist",(Object)(__ref._lasttrackbyplaylist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="End Sub";
return "";
}
public boolean  _scheduleappliestoday(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _schedule,String _todaykey,String _todayweekday) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "scheduleappliestoday", false))
	 {return ((Boolean) Debug.delegate(ba, "scheduleappliestoday", new Object[] {_schedule,_todaykey,_todayweekday}));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub ScheduleAppliesToday(schedule As Map,";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Return ScheduleAppliesOnDate(schedule, todayKey,";
if (true) return __ref._scheduleappliesondate /*boolean*/ (null,_schedule,_todaykey,_todayweekday);
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Private Sub TimeStringToMinutes(value As String) A";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="If value = \"\" Then Return -1";
if ((_value).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="Dim parts() As String = Regex.Split(\":\", value)";
_parts = __c.Regex.Split(":",_value);
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="If parts.Length < 2 Then Return -1";
if (_parts.length<2) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="Try";
try {RDebugUtils.currentLine=22872069;
 //BA.debugLineNum = 22872069;BA.debugLine="Dim hours As Int = parts(0)";
_hours = (int)(Double.parseDouble(_parts[(int) (0)]));
RDebugUtils.currentLine=22872070;
 //BA.debugLineNum = 22872070;BA.debugLine="Dim minutes As Int = parts(1)";
_minutes = (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=22872071;
 //BA.debugLineNum = 22872071;BA.debugLine="If hours < 0 Or hours > 23 Then Return -1";
if (_hours<0 || _hours>23) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=22872072;
 //BA.debugLineNum = 22872072;BA.debugLine="If minutes < 0 Or minutes > 59 Then Return -1";
if (_minutes<0 || _minutes>59) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=22872073;
 //BA.debugLineNum = 22872073;BA.debugLine="Return hours * 60 + minutes";
if (true) return (int) (_hours*60+_minutes);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=22872075;
 //BA.debugLineNum = 22872075;BA.debugLine="Return -1";
if (true) return (int) (-1);
 };
RDebugUtils.currentLine=22872077;
 //BA.debugLineNum = 22872077;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslot(b4j.example.dataplaybackresolver __ref,anywheresoftware.b4a.objects.collections.Map _offlinedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="dataplaybackresolver";
if (Debug.shouldDelegate(ba, "resolvenextdataslot", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextdataslot", new Object[] {_offlinedata}));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Public Sub ResolveNextDataSlot(offlineData As Map)";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Return ResolveNextDataSlotAtTicks(offlineData, Da";
if (true) return __ref._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,_offlinedata,__c.DateTime.getNow());
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Private Sub StartOfDayTicks(ticks As Long) As Long";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="Dim dayKey As String = DateTime.Date(ticks)";
_daykey = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="Dim dayTicks As Long = DateTime.DateParse(dayKey)";
_dayticks = __c.DateTime.DateParse(_daykey);
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="Return dayTicks";
if (true) return _dayticks;
RDebugUtils.currentLine=22937607;
 //BA.debugLineNum = 22937607;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub ScheduleAppliesOnDate(schedule As Map,";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Dim startDate As String = schedule.GetDefault(\"st";
_startdate = BA.ObjectToString(_schedule.GetDefault((Object)("start"),(Object)("")));
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="If startDate <> \"\" And startDate.CompareTo(target";
if ((_startdate).equals("") == false && _startdate.compareTo(_targetdatekey)>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="Dim weekdays As List = schedule.GetDefault(\"weekd";
_weekdays = new anywheresoftware.b4a.objects.collections.List();
_weekdays = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("weekdays"),__c.Null)));
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="If weekdays.IsInitialized = False Or weekdays.Siz";
if (_weekdays.IsInitialized()==__c.False || _weekdays.getSize()==0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=22413317;
 //BA.debugLineNum = 22413317;BA.debugLine="For Each weekdayObject As Object In weekdays";
{
final anywheresoftware.b4a.BA.IterableList group5 = _weekdays;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_weekdayobject = group5.Get(index5);
RDebugUtils.currentLine=22413318;
 //BA.debugLineNum = 22413318;BA.debugLine="If (\"\" & weekdayObject).Trim = targetWeekday The";
if (((""+BA.ObjectToString(_weekdayobject)).trim()).equals(_targetweekday)) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=22413321;
 //BA.debugLineNum = 22413321;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Private Sub ResolveOfflineStreamTitle(currentSlot";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="Dim targetStreamId As String = currentSlot.GetDef";
_targetstreamid = BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="Dim targetSlotTime As String = currentSlot.GetDef";
_targetslottime = BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_offlinedata.GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=22216709;
 //BA.debugLineNum = 22216709;BA.debugLine="If schedules.IsInitialized = False Then Return \"\"";
if (_schedules.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="For Each scheduleObject As Object In schedules";
{
final anywheresoftware.b4a.BA.IterableList group6 = _schedules;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_scheduleobject = group6.Get(index6);
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="If scheduleObject Is Map Then";
if (_scheduleobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22216712;
 //BA.debugLineNum = 22216712;BA.debugLine="Dim schedule As Map = scheduleObject";
_schedule = new anywheresoftware.b4a.objects.collections.Map();
_schedule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_scheduleobject));
RDebugUtils.currentLine=22216713;
 //BA.debugLineNum = 22216713;BA.debugLine="Dim slots As List = schedule.GetDefault(\"slots\"";
_slots = new anywheresoftware.b4a.objects.collections.List();
_slots = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_schedule.GetDefault((Object)("slots"),__c.Null)));
RDebugUtils.currentLine=22216714;
 //BA.debugLineNum = 22216714;BA.debugLine="If slots.IsInitialized = False Then Continue";
if (_slots.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=22216715;
 //BA.debugLineNum = 22216715;BA.debugLine="For Each slotObject As Object In slots";
{
final anywheresoftware.b4a.BA.IterableList group11 = _slots;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_slotobject = group11.Get(index11);
RDebugUtils.currentLine=22216716;
 //BA.debugLineNum = 22216716;BA.debugLine="If slotObject Is Map Then";
if (_slotobject instanceof java.util.Map) { 
RDebugUtils.currentLine=22216717;
 //BA.debugLineNum = 22216717;BA.debugLine="Dim slot As Map = slotObject";
_slot = new anywheresoftware.b4a.objects.collections.Map();
_slot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_slotobject));
RDebugUtils.currentLine=22216718;
 //BA.debugLineNum = 22216718;BA.debugLine="If targetSlotTime <> \"\" And slot.GetDefault(\"";
if ((_targetslottime).equals("") == false && (_slot.GetDefault((Object)("time"),(Object)(""))).equals((Object)(_targetslottime)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=22216719;
 //BA.debugLineNum = 22216719;BA.debugLine="Dim streamData As Map = ExtractSlotStreamData";
_streamdata = new anywheresoftware.b4a.objects.collections.Map();
_streamdata = __ref._extractslotstreamdata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_slot);
RDebugUtils.currentLine=22216720;
 //BA.debugLineNum = 22216720;BA.debugLine="If targetStreamId <> \"\" And streamData.GetDef";
if ((_targetstreamid).equals("") == false && (_streamdata.GetDefault((Object)("id"),(Object)(""))).equals((Object)(_targetstreamid)) == false) { 
if (true) continue;};
RDebugUtils.currentLine=22216721;
 //BA.debugLineNum = 22216721;BA.debugLine="Dim streamTitle As String = streamData.GetDef";
_streamtitle = BA.ObjectToString(_streamdata.GetDefault((Object)("title"),(Object)("")));
RDebugUtils.currentLine=22216722;
 //BA.debugLineNum = 22216722;BA.debugLine="If streamTitle <> \"\" Then Return streamTitle";
if ((_streamtitle).equals("") == false) { 
if (true) return _streamtitle;};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=22216727;
 //BA.debugLineNum = 22216727;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=22216728;
 //BA.debugLineNum = 22216728;BA.debugLine="End Sub";
return "";
}
}