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
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Public Sub SetCurrentMedia(mediaUrl As String, med";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="CurrentMediaUrl = mediaUrl";
__ref._currentmediaurl /*String*/  = _mediaurl;
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="CurrentMediaType = mediaType";
__ref._currentmediatype /*String*/  = _mediatype;
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="End Sub";
return "";
}
public String  _clearhistorystage(b4j.example.playbackmetastate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "clearhistorystage", false))
	 {return ((String) Debug.delegate(ba, "clearhistorystage", null));}
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Public Sub ClearHistoryStage";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="PendingHistoryItem.Initialize";
__ref._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="HistoryStartedAtTicks = 0";
__ref._historystartedatticks /*long*/  = (long) (0);
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackmetastate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="CurrentMediaUrl = \"\"";
__ref._currentmediaurl /*String*/  = "";
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="CurrentMediaType = \"\"";
__ref._currentmediatype /*String*/  = "";
RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="HistoryStartedAtTicks = 0";
__ref._historystartedatticks /*long*/  = (long) (0);
RDebugUtils.currentLine=29032452;
 //BA.debugLineNum = 29032452;BA.debugLine="PendingHistoryItem.Initialize";
__ref._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=29032453;
 //BA.debugLineNum = 29032453;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackmetastate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="End Sub";
return "";
}
public String  _stagehistoryitem(b4j.example.playbackmetastate __ref,anywheresoftware.b4a.objects.collections.Map _item,long _startedatticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "stagehistoryitem", false))
	 {return ((String) Debug.delegate(ba, "stagehistoryitem", new Object[] {_item,_startedatticks}));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Public Sub StageHistoryItem(item As Map, startedAt";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="PendingHistoryItem = CloneStateMap(item)";
__ref._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonestatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="HistoryStartedAtTicks = startedAtTicks";
__ref._historystartedatticks /*long*/  = _startedatticks;
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackmetastate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Public CurrentMediaUrl As String";
_currentmediaurl = "";
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="Public CurrentMediaType As String";
_currentmediatype = "";
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="Public PendingHistoryItem As Map";
_pendinghistoryitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=28901380;
 //BA.debugLineNum = 28901380;BA.debugLine="Public HistoryStartedAtTicks As Long";
_historystartedatticks = 0L;
RDebugUtils.currentLine=28901381;
 //BA.debugLineNum = 28901381;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(b4j.example.playbackmetastate __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackmetastate";
if (Debug.shouldDelegate(ba, "clonestatemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonestatemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
RDebugUtils.currentLine=29294595;
 //BA.debugLineNum = 29294595;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
RDebugUtils.currentLine=29294596;
 //BA.debugLineNum = 29294596;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=29294597;
 //BA.debugLineNum = 29294597;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=29294599;
 //BA.debugLineNum = 29294599;BA.debugLine="Return cloned";
if (true) return _cloned;
RDebugUtils.currentLine=29294600;
 //BA.debugLineNum = 29294600;BA.debugLine="End Sub";
return null;
}
}