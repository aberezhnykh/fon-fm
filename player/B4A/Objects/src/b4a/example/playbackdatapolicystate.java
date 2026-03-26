package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbackdatapolicystate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbackdatapolicystate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbackdatapolicystate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public boolean _isofflinedatarefreshinprogress = false;
public boolean _istrackcacherefreshinprogress = false;
public boolean _haslocalmediafallback = false;
public boolean _isplaybackpausedbypolicy = false;
public boolean _resumeplaybackwhenserverallows = false;
public String _lastofflinedatarefreshstate = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _applytemporarymode(String _mode) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
 //BA.debugLineNum = 71;BA.debugLine="IsPlaybackPausedByPolicy = False";
_isplaybackpausedbypolicy = __c.False;
 //BA.debugLineNum = 72;BA.debugLine="ResumePlaybackWhenServerAllows = False";
_resumeplaybackwhenserverallows = __c.False;
 //BA.debugLineNum = 73;BA.debugLine="HasLocalMediaFallback = False";
_haslocalmediafallback = __c.False;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public boolean  _beginofflinedatarefresh() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
 //BA.debugLineNum = 28;BA.debugLine="If IsOfflineDataRefreshInProgress Then Return Fal";
if (_isofflinedatarefreshinprogress) { 
if (true) return __c.False;};
 //BA.debugLineNum = 29;BA.debugLine="IsOfflineDataRefreshInProgress = True";
_isofflinedatarefreshinprogress = __c.True;
 //BA.debugLineNum = 30;BA.debugLine="LastOfflineDataRefreshState = \"\"";
_lastofflinedatarefreshstate = "";
 //BA.debugLineNum = 31;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return false;
}
public boolean  _begintrackcacherefresh() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub BeginTrackCacheRefresh As Boolean";
 //BA.debugLineNum = 40;BA.debugLine="If IsTrackCacheRefreshInProgress Then Return Fals";
if (_istrackcacherefreshinprogress) { 
if (true) return __c.False;};
 //BA.debugLineNum = 41;BA.debugLine="IsTrackCacheRefreshInProgress = True";
_istrackcacherefreshinprogress = __c.True;
 //BA.debugLineNum = 42;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public IsOfflineDataRefreshInProgress As Boolean";
_isofflinedatarefreshinprogress = false;
 //BA.debugLineNum = 6;BA.debugLine="Public IsTrackCacheRefreshInProgress As Boolean";
_istrackcacherefreshinprogress = false;
 //BA.debugLineNum = 7;BA.debugLine="Public HasLocalMediaFallback As Boolean";
_haslocalmediafallback = false;
 //BA.debugLineNum = 8;BA.debugLine="Public IsPlaybackPausedByPolicy As Boolean";
_isplaybackpausedbypolicy = false;
 //BA.debugLineNum = 9;BA.debugLine="Public ResumePlaybackWhenServerAllows As Boolean";
_resumeplaybackwhenserverallows = false;
 //BA.debugLineNum = 10;BA.debugLine="Public LastOfflineDataRefreshState As String";
_lastofflinedatarefreshstate = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypause() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub ClearPolicyPause";
 //BA.debugLineNum = 57;BA.debugLine="IsPlaybackPausedByPolicy = False";
_isplaybackpausedbypolicy = __c.False;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypauseandresumerequest() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
 //BA.debugLineNum = 61;BA.debugLine="IsPlaybackPausedByPolicy = False";
_isplaybackpausedbypolicy = __c.False;
 //BA.debugLineNum = 62;BA.debugLine="ResumePlaybackWhenServerAllows = False";
_resumeplaybackwhenserverallows = __c.False;
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _endofflinedatarefresh(String _refreshstate) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub EndOfflineDataRefresh(refreshState As S";
 //BA.debugLineNum = 35;BA.debugLine="LastOfflineDataRefreshState = refreshState";
_lastofflinedatarefreshstate = _refreshstate;
 //BA.debugLineNum = 36;BA.debugLine="IsOfflineDataRefreshInProgress = False";
_isofflinedatarefreshinprogress = __c.False;
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _endtrackcacherefresh() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub EndTrackCacheRefresh";
 //BA.debugLineNum = 46;BA.debugLine="IsTrackCacheRefreshInProgress = False";
_istrackcacherefreshinprogress = __c.False;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _enterlocalplayback() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub EnterLocalPlayback";
 //BA.debugLineNum = 66;BA.debugLine="IsPlaybackPausedByPolicy = False";
_isplaybackpausedbypolicy = __c.False;
 //BA.debugLineNum = 67;BA.debugLine="HasLocalMediaFallback = True";
_haslocalmediafallback = __c.True;
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypause(String _connectionmode) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub EnterPolicyPause(connectionMode As Stri";
 //BA.debugLineNum = 51;BA.debugLine="IsPlaybackPausedByPolicy = True";
_isplaybackpausedbypolicy = __c.True;
 //BA.debugLineNum = 52;BA.debugLine="ResumePlaybackWhenServerAllows = True";
_resumeplaybackwhenserverallows = __c.True;
 //BA.debugLineNum = 53;BA.debugLine="HasLocalMediaFallback = False";
_haslocalmediafallback = __c.False;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
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
 //BA.debugLineNum = 19;BA.debugLine="IsOfflineDataRefreshInProgress = False";
_isofflinedatarefreshinprogress = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="IsTrackCacheRefreshInProgress = False";
_istrackcacherefreshinprogress = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="HasLocalMediaFallback = False";
_haslocalmediafallback = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="IsPlaybackPausedByPolicy = False";
_isplaybackpausedbypolicy = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="ResumePlaybackWhenServerAllows = False";
_resumeplaybackwhenserverallows = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="LastOfflineDataRefreshState = \"\"";
_lastofflinedatarefreshstate = "";
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _setremotedataready() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub SetRemoteDataReady";
 //BA.debugLineNum = 77;BA.debugLine="HasLocalMediaFallback = False";
_haslocalmediafallback = __c.False;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
