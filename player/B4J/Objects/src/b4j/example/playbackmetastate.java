package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackmetastate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackmetastate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackmetastate.class).invoke(this, new Object[] {null});
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
public String _currentmediaurl = "";
public String _currentmediatype = "";
public String _currenttrackid = "";
public anywheresoftware.b4a.objects.collections.Map _pendinghistoryitem = null;
public long _historystartedatticks = 0L;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _setcurrentmedia(b4j.example.playbackmetastate __ref,String _mediaurl,String _mediatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "setcurrentmedia", false))
	 {return ((String) Debug.delegate(ba, "setcurrentmedia", new Object[] {_mediaurl,_mediatype}));}
RDebugUtils.currentLine=52494336;
 //BA.debugLineNum = 52494336;BA.debugLine="Public Sub SetCurrentMedia(mediaUrl As String, med";
RDebugUtils.currentLine=52494337;
 //BA.debugLineNum = 52494337;BA.debugLine="CurrentMediaUrl = mediaUrl";
__ref._currentmediaurl /*String*/  = _mediaurl;
RDebugUtils.currentLine=52494338;
 //BA.debugLineNum = 52494338;BA.debugLine="CurrentMediaType = mediaType";
__ref._currentmediatype /*String*/  = _mediatype;
RDebugUtils.currentLine=52494339;
 //BA.debugLineNum = 52494339;BA.debugLine="End Sub";
return "";
}
public String  _clearhistorystage(b4j.example.playbackmetastate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "clearhistorystage", false))
	 {return ((String) Debug.delegate(ba, "clearhistorystage", null));}
RDebugUtils.currentLine=52690944;
 //BA.debugLineNum = 52690944;BA.debugLine="Public Sub ClearHistoryStage";
RDebugUtils.currentLine=52690945;
 //BA.debugLineNum = 52690945;BA.debugLine="PendingHistoryItem.Initialize";
__ref._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=52690946;
 //BA.debugLineNum = 52690946;BA.debugLine="HistoryStartedAtTicks = 0";
__ref._historystartedatticks /*long*/  = (long) (0);
RDebugUtils.currentLine=52690947;
 //BA.debugLineNum = 52690947;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackmetastate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=52428800;
 //BA.debugLineNum = 52428800;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=52428801;
 //BA.debugLineNum = 52428801;BA.debugLine="CurrentMediaUrl = \"\"";
__ref._currentmediaurl /*String*/  = "";
RDebugUtils.currentLine=52428802;
 //BA.debugLineNum = 52428802;BA.debugLine="CurrentMediaType = \"\"";
__ref._currentmediatype /*String*/  = "";
RDebugUtils.currentLine=52428803;
 //BA.debugLineNum = 52428803;BA.debugLine="CurrentTrackId = \"\"";
__ref._currenttrackid /*String*/  = "";
RDebugUtils.currentLine=52428804;
 //BA.debugLineNum = 52428804;BA.debugLine="HistoryStartedAtTicks = 0";
__ref._historystartedatticks /*long*/  = (long) (0);
RDebugUtils.currentLine=52428805;
 //BA.debugLineNum = 52428805;BA.debugLine="PendingHistoryItem.Initialize";
__ref._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=52428806;
 //BA.debugLineNum = 52428806;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackmetastate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=52363264;
 //BA.debugLineNum = 52363264;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=52363265;
 //BA.debugLineNum = 52363265;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=52363266;
 //BA.debugLineNum = 52363266;BA.debugLine="End Sub";
return "";
}
public String  _stagehistoryitem(b4j.example.playbackmetastate __ref,anywheresoftware.b4a.objects.collections.Map _item,long _startedatticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "stagehistoryitem", false))
	 {return ((String) Debug.delegate(ba, "stagehistoryitem", new Object[] {_item,_startedatticks}));}
RDebugUtils.currentLine=52625408;
 //BA.debugLineNum = 52625408;BA.debugLine="Public Sub StageHistoryItem(item As Map, startedAt";
RDebugUtils.currentLine=52625409;
 //BA.debugLineNum = 52625409;BA.debugLine="PendingHistoryItem = CloneStateMap(item)";
__ref._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=52625410;
 //BA.debugLineNum = 52625410;BA.debugLine="HistoryStartedAtTicks = startedAtTicks";
__ref._historystartedatticks /*long*/  = _startedatticks;
RDebugUtils.currentLine=52625411;
 //BA.debugLineNum = 52625411;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackmetastate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
RDebugUtils.currentLine=52297728;
 //BA.debugLineNum = 52297728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=52297729;
 //BA.debugLineNum = 52297729;BA.debugLine="Public CurrentMediaUrl As String";
_currentmediaurl = "";
RDebugUtils.currentLine=52297730;
 //BA.debugLineNum = 52297730;BA.debugLine="Public CurrentMediaType As String";
_currentmediatype = "";
RDebugUtils.currentLine=52297731;
 //BA.debugLineNum = 52297731;BA.debugLine="Public CurrentTrackId As String";
_currenttrackid = "";
RDebugUtils.currentLine=52297732;
 //BA.debugLineNum = 52297732;BA.debugLine="Public PendingHistoryItem As Map";
_pendinghistoryitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52297733;
 //BA.debugLineNum = 52297733;BA.debugLine="Public HistoryStartedAtTicks As Long";
_historystartedatticks = 0L;
RDebugUtils.currentLine=52297734;
 //BA.debugLineNum = 52297734;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(b4j.example.playbackmetastate __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "clonestatemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonestatemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
RDebugUtils.currentLine=52756480;
 //BA.debugLineNum = 52756480;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
RDebugUtils.currentLine=52756481;
 //BA.debugLineNum = 52756481;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52756482;
 //BA.debugLineNum = 52756482;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
RDebugUtils.currentLine=52756483;
 //BA.debugLineNum = 52756483;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
RDebugUtils.currentLine=52756484;
 //BA.debugLineNum = 52756484;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=52756485;
 //BA.debugLineNum = 52756485;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=52756487;
 //BA.debugLineNum = 52756487;BA.debugLine="Return cloned";
if (true) return _cloned;
RDebugUtils.currentLine=52756488;
 //BA.debugLineNum = 52756488;BA.debugLine="End Sub";
return null;
}
public String  _setcurrenttrack(b4j.example.playbackmetastate __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "setcurrenttrack", false))
	 {return ((String) Debug.delegate(ba, "setcurrenttrack", new Object[] {_trackid}));}
RDebugUtils.currentLine=52559872;
 //BA.debugLineNum = 52559872;BA.debugLine="Public Sub SetCurrentTrack(trackId As String)";
RDebugUtils.currentLine=52559873;
 //BA.debugLineNum = 52559873;BA.debugLine="CurrentTrackId = trackId";
__ref._currenttrackid /*String*/  = _trackid;
RDebugUtils.currentLine=52559874;
 //BA.debugLineNum = 52559874;BA.debugLine="End Sub";
return "";
}
}