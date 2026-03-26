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
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _setcurrentmedia(b4j.example.playbackmetastate __ref,String _mediaurl,String _mediatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "setcurrentmedia", false))
	 {return ((String) Debug.delegate(ba, "setcurrentmedia", new Object[] {_mediaurl,_mediatype}));}
RDebugUtils.currentLine=52101120;
 //BA.debugLineNum = 52101120;BA.debugLine="Public Sub SetCurrentMedia(mediaUrl As String, med";
RDebugUtils.currentLine=52101121;
 //BA.debugLineNum = 52101121;BA.debugLine="CurrentMediaUrl = mediaUrl";
__ref._currentmediaurl /*String*/  = _mediaurl;
RDebugUtils.currentLine=52101122;
 //BA.debugLineNum = 52101122;BA.debugLine="CurrentMediaType = mediaType";
__ref._currentmediatype /*String*/  = _mediatype;
RDebugUtils.currentLine=52101123;
 //BA.debugLineNum = 52101123;BA.debugLine="End Sub";
return "";
}
public String  _clearhistorystage(b4j.example.playbackmetastate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "clearhistorystage", false))
	 {return ((String) Debug.delegate(ba, "clearhistorystage", null));}
RDebugUtils.currentLine=52297728;
 //BA.debugLineNum = 52297728;BA.debugLine="Public Sub ClearHistoryStage";
RDebugUtils.currentLine=52297729;
 //BA.debugLineNum = 52297729;BA.debugLine="PendingHistoryItem.Initialize";
__ref._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=52297730;
 //BA.debugLineNum = 52297730;BA.debugLine="HistoryStartedAtTicks = 0";
__ref._historystartedatticks /*long*/  = (long) (0);
RDebugUtils.currentLine=52297731;
 //BA.debugLineNum = 52297731;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackmetastate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=52035584;
 //BA.debugLineNum = 52035584;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=52035585;
 //BA.debugLineNum = 52035585;BA.debugLine="CurrentMediaUrl = \"\"";
__ref._currentmediaurl /*String*/  = "";
RDebugUtils.currentLine=52035586;
 //BA.debugLineNum = 52035586;BA.debugLine="CurrentMediaType = \"\"";
__ref._currentmediatype /*String*/  = "";
RDebugUtils.currentLine=52035587;
 //BA.debugLineNum = 52035587;BA.debugLine="CurrentTrackId = \"\"";
__ref._currenttrackid /*String*/  = "";
RDebugUtils.currentLine=52035588;
 //BA.debugLineNum = 52035588;BA.debugLine="HistoryStartedAtTicks = 0";
__ref._historystartedatticks /*long*/  = (long) (0);
RDebugUtils.currentLine=52035589;
 //BA.debugLineNum = 52035589;BA.debugLine="PendingHistoryItem.Initialize";
__ref._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=52035590;
 //BA.debugLineNum = 52035590;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackmetastate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=51970048;
 //BA.debugLineNum = 51970048;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=51970049;
 //BA.debugLineNum = 51970049;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=51970050;
 //BA.debugLineNum = 51970050;BA.debugLine="End Sub";
return "";
}
public String  _stagehistoryitem(b4j.example.playbackmetastate __ref,anywheresoftware.b4a.objects.collections.Map _item,long _startedatticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "stagehistoryitem", false))
	 {return ((String) Debug.delegate(ba, "stagehistoryitem", new Object[] {_item,_startedatticks}));}
RDebugUtils.currentLine=52232192;
 //BA.debugLineNum = 52232192;BA.debugLine="Public Sub StageHistoryItem(item As Map, startedAt";
RDebugUtils.currentLine=52232193;
 //BA.debugLineNum = 52232193;BA.debugLine="PendingHistoryItem = CloneStateMap(item)";
__ref._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=52232194;
 //BA.debugLineNum = 52232194;BA.debugLine="HistoryStartedAtTicks = startedAtTicks";
__ref._historystartedatticks /*long*/  = _startedatticks;
RDebugUtils.currentLine=52232195;
 //BA.debugLineNum = 52232195;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackmetastate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
RDebugUtils.currentLine=51904512;
 //BA.debugLineNum = 51904512;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=51904513;
 //BA.debugLineNum = 51904513;BA.debugLine="Public CurrentMediaUrl As String";
_currentmediaurl = "";
RDebugUtils.currentLine=51904514;
 //BA.debugLineNum = 51904514;BA.debugLine="Public CurrentMediaType As String";
_currentmediatype = "";
RDebugUtils.currentLine=51904515;
 //BA.debugLineNum = 51904515;BA.debugLine="Public CurrentTrackId As String";
_currenttrackid = "";
RDebugUtils.currentLine=51904516;
 //BA.debugLineNum = 51904516;BA.debugLine="Public PendingHistoryItem As Map";
_pendinghistoryitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=51904517;
 //BA.debugLineNum = 51904517;BA.debugLine="Public HistoryStartedAtTicks As Long";
_historystartedatticks = 0L;
RDebugUtils.currentLine=51904518;
 //BA.debugLineNum = 51904518;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(b4j.example.playbackmetastate __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "clonestatemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonestatemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
RDebugUtils.currentLine=52363264;
 //BA.debugLineNum = 52363264;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
RDebugUtils.currentLine=52363265;
 //BA.debugLineNum = 52363265;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=52363266;
 //BA.debugLineNum = 52363266;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
RDebugUtils.currentLine=52363267;
 //BA.debugLineNum = 52363267;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
RDebugUtils.currentLine=52363268;
 //BA.debugLineNum = 52363268;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=52363269;
 //BA.debugLineNum = 52363269;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=52363271;
 //BA.debugLineNum = 52363271;BA.debugLine="Return cloned";
if (true) return _cloned;
RDebugUtils.currentLine=52363272;
 //BA.debugLineNum = 52363272;BA.debugLine="End Sub";
return null;
}
public String  _setcurrenttrack(b4j.example.playbackmetastate __ref,String _trackid) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "setcurrenttrack", false))
	 {return ((String) Debug.delegate(ba, "setcurrenttrack", new Object[] {_trackid}));}
RDebugUtils.currentLine=52166656;
 //BA.debugLineNum = 52166656;BA.debugLine="Public Sub SetCurrentTrack(trackId As String)";
RDebugUtils.currentLine=52166657;
 //BA.debugLineNum = 52166657;BA.debugLine="CurrentTrackId = trackId";
__ref._currenttrackid /*String*/  = _trackid;
RDebugUtils.currentLine=52166658;
 //BA.debugLineNum = 52166658;BA.debugLine="End Sub";
return "";
}
}