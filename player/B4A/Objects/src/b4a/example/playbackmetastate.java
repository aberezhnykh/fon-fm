package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbackmetastate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbackmetastate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbackmetastate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _currentmediaurl = "";
public String _currentmediatype = "";
public String _currenttrackid = "";
public anywheresoftware.b4a.objects.collections.Map _pendinghistoryitem = null;
public long _historystartedatticks = 0L;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public CurrentMediaUrl As String";
_currentmediaurl = "";
 //BA.debugLineNum = 7;BA.debugLine="Public CurrentMediaType As String";
_currentmediatype = "";
 //BA.debugLineNum = 8;BA.debugLine="Public CurrentTrackId As String";
_currenttrackid = "";
 //BA.debugLineNum = 9;BA.debugLine="Public PendingHistoryItem As Map";
_pendinghistoryitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Public HistoryStartedAtTicks As Long";
_historystartedatticks = 0L;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _clearhistorystage() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub ClearHistoryStage";
 //BA.debugLineNum = 42;BA.debugLine="PendingHistoryItem.Initialize";
_pendinghistoryitem.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="HistoryStartedAtTicks = 0";
_historystartedatticks = (long) (0);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonestatemap(anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
anywheresoftware.b4a.objects.collections.Map _cloned = null;
Object _key = null;
 //BA.debugLineNum = 46;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
 //BA.debugLineNum = 47;BA.debugLine="Dim cloned As Map";
_cloned = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 48;BA.debugLine="cloned.Initialize";
_cloned.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="If source.IsInitialized = False Then Return clone";
if (_source.IsInitialized()==__c.False) { 
if (true) return _cloned;};
 //BA.debugLineNum = 50;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
 //BA.debugLineNum = 51;BA.debugLine="cloned.Put(key, source.Get(key))";
_cloned.Put(_key,_source.Get(_key));
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return cloned";
if (true) return _cloned;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 14;BA.debugLine="Reset";
_reset();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Reset";
 //BA.debugLineNum = 19;BA.debugLine="CurrentMediaUrl = \"\"";
_currentmediaurl = "";
 //BA.debugLineNum = 20;BA.debugLine="CurrentMediaType = \"\"";
_currentmediatype = "";
 //BA.debugLineNum = 21;BA.debugLine="CurrentTrackId = \"\"";
_currenttrackid = "";
 //BA.debugLineNum = 22;BA.debugLine="HistoryStartedAtTicks = 0";
_historystartedatticks = (long) (0);
 //BA.debugLineNum = 23;BA.debugLine="PendingHistoryItem.Initialize";
_pendinghistoryitem.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentmedia(String _mediaurl,String _mediatype) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub SetCurrentMedia(mediaUrl As String, med";
 //BA.debugLineNum = 27;BA.debugLine="CurrentMediaUrl = mediaUrl";
_currentmediaurl = _mediaurl;
 //BA.debugLineNum = 28;BA.debugLine="CurrentMediaType = mediaType";
_currentmediatype = _mediatype;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _setcurrenttrack(String _trackid) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub SetCurrentTrack(trackId As String)";
 //BA.debugLineNum = 32;BA.debugLine="CurrentTrackId = trackId";
_currenttrackid = _trackid;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _stagehistoryitem(anywheresoftware.b4a.objects.collections.Map _item,long _startedatticks) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub StageHistoryItem(item As Map, startedAt";
 //BA.debugLineNum = 37;BA.debugLine="PendingHistoryItem = CloneStateMap(item)";
_pendinghistoryitem = _clonestatemap(_item);
 //BA.debugLineNum = 38;BA.debugLine="HistoryStartedAtTicks = startedAtTicks";
_historystartedatticks = _startedatticks;
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
