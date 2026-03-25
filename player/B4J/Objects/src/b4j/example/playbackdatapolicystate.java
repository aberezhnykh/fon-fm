package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackdatapolicystate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackdatapolicystate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackdatapolicystate.class).invoke(this, new Object[] {null});
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
public boolean _isofflinedatarefreshinprogress = false;
public boolean _istrackcacherefreshinprogress = false;
public boolean _haslocalmediafallback = false;
public boolean _isplaybackpausedbypolicy = false;
public boolean _resumeplaybackwhenserverallows = false;
public String _lastofflinedatarefreshstate = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _clearpolicypause(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "clearpolicypause", false))
	 {return ((String) Debug.delegate(ba, "clearpolicypause", null));}
RDebugUtils.currentLine=44761088;
 //BA.debugLineNum = 44761088;BA.debugLine="Public Sub ClearPolicyPause";
RDebugUtils.currentLine=44761089;
 //BA.debugLineNum = 44761089;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=44761090;
 //BA.debugLineNum = 44761090;BA.debugLine="End Sub";
return "";
}
public String  _applytemporarymode(b4j.example.playbackdatapolicystate __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "applytemporarymode", false))
	 {return ((String) Debug.delegate(ba, "applytemporarymode", new Object[] {_mode}));}
RDebugUtils.currentLine=44957696;
 //BA.debugLineNum = 44957696;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
RDebugUtils.currentLine=44957697;
 //BA.debugLineNum = 44957697;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=44957698;
 //BA.debugLineNum = 44957698;BA.debugLine="ResumePlaybackWhenServerAllows = False";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=44957699;
 //BA.debugLineNum = 44957699;BA.debugLine="HasLocalMediaFallback = False";
__ref._haslocalmediafallback /*boolean*/  = __c.False;
RDebugUtils.currentLine=44957700;
 //BA.debugLineNum = 44957700;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypauseandresumerequest(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "clearpolicypauseandresumerequest", false))
	 {return ((String) Debug.delegate(ba, "clearpolicypauseandresumerequest", null));}
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="ResumePlaybackWhenServerAllows = False";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=44826627;
 //BA.debugLineNum = 44826627;BA.debugLine="End Sub";
return "";
}
public String  _enterlocalplayback(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "enterlocalplayback", false))
	 {return ((String) Debug.delegate(ba, "enterlocalplayback", null));}
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Public Sub EnterLocalPlayback";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="HasLocalMediaFallback = True";
__ref._haslocalmediafallback /*boolean*/  = __c.True;
RDebugUtils.currentLine=44892163;
 //BA.debugLineNum = 44892163;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypause(b4j.example.playbackdatapolicystate __ref,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "enterpolicypause", false))
	 {return ((String) Debug.delegate(ba, "enterpolicypause", new Object[] {_connectionmode}));}
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Public Sub EnterPolicyPause(connectionMode As Stri";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="IsPlaybackPausedByPolicy = True";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.True;
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="ResumePlaybackWhenServerAllows = True";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.True;
RDebugUtils.currentLine=44695555;
 //BA.debugLineNum = 44695555;BA.debugLine="HasLocalMediaFallback = False";
__ref._haslocalmediafallback /*boolean*/  = __c.False;
RDebugUtils.currentLine=44695556;
 //BA.debugLineNum = 44695556;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackdatapolicystate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="End Sub";
return "";
}
public boolean  _beginofflinedatarefresh(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "beginofflinedatarefresh", false))
	 {return ((Boolean) Debug.delegate(ba, "beginofflinedatarefresh", null));}
RDebugUtils.currentLine=44433408;
 //BA.debugLineNum = 44433408;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
RDebugUtils.currentLine=44433409;
 //BA.debugLineNum = 44433409;BA.debugLine="If IsOfflineDataRefreshInProgress Then Return Fal";
if (__ref._isofflinedatarefreshinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="IsOfflineDataRefreshInProgress = True";
__ref._isofflinedatarefreshinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=44433411;
 //BA.debugLineNum = 44433411;BA.debugLine="LastOfflineDataRefreshState = \"\"";
__ref._lastofflinedatarefreshstate /*String*/  = "";
RDebugUtils.currentLine=44433412;
 //BA.debugLineNum = 44433412;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=44433413;
 //BA.debugLineNum = 44433413;BA.debugLine="End Sub";
return false;
}
public String  _endofflinedatarefresh(b4j.example.playbackdatapolicystate __ref,String _refreshstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "endofflinedatarefresh", false))
	 {return ((String) Debug.delegate(ba, "endofflinedatarefresh", new Object[] {_refreshstate}));}
RDebugUtils.currentLine=44498944;
 //BA.debugLineNum = 44498944;BA.debugLine="Public Sub EndOfflineDataRefresh(refreshState As S";
RDebugUtils.currentLine=44498945;
 //BA.debugLineNum = 44498945;BA.debugLine="LastOfflineDataRefreshState = refreshState";
__ref._lastofflinedatarefreshstate /*String*/  = _refreshstate;
RDebugUtils.currentLine=44498946;
 //BA.debugLineNum = 44498946;BA.debugLine="IsOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=44498947;
 //BA.debugLineNum = 44498947;BA.debugLine="End Sub";
return "";
}
public String  _setremotedataready(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "setremotedataready", false))
	 {return ((String) Debug.delegate(ba, "setremotedataready", null));}
RDebugUtils.currentLine=45088768;
 //BA.debugLineNum = 45088768;BA.debugLine="Public Sub SetRemoteDataReady";
RDebugUtils.currentLine=45088769;
 //BA.debugLineNum = 45088769;BA.debugLine="HasLocalMediaFallback = False";
__ref._haslocalmediafallback /*boolean*/  = __c.False;
RDebugUtils.currentLine=45088770;
 //BA.debugLineNum = 45088770;BA.debugLine="End Sub";
return "";
}
public boolean  _begintrackcacherefresh(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "begintrackcacherefresh", false))
	 {return ((Boolean) Debug.delegate(ba, "begintrackcacherefresh", null));}
RDebugUtils.currentLine=44564480;
 //BA.debugLineNum = 44564480;BA.debugLine="Public Sub BeginTrackCacheRefresh As Boolean";
RDebugUtils.currentLine=44564481;
 //BA.debugLineNum = 44564481;BA.debugLine="If IsTrackCacheRefreshInProgress Then Return Fals";
if (__ref._istrackcacherefreshinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=44564482;
 //BA.debugLineNum = 44564482;BA.debugLine="IsTrackCacheRefreshInProgress = True";
__ref._istrackcacherefreshinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=44564483;
 //BA.debugLineNum = 44564483;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=44564484;
 //BA.debugLineNum = 44564484;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
RDebugUtils.currentLine=44236800;
 //BA.debugLineNum = 44236800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=44236801;
 //BA.debugLineNum = 44236801;BA.debugLine="Public IsOfflineDataRefreshInProgress As Boolean";
_isofflinedatarefreshinprogress = false;
RDebugUtils.currentLine=44236802;
 //BA.debugLineNum = 44236802;BA.debugLine="Public IsTrackCacheRefreshInProgress As Boolean";
_istrackcacherefreshinprogress = false;
RDebugUtils.currentLine=44236803;
 //BA.debugLineNum = 44236803;BA.debugLine="Public HasLocalMediaFallback As Boolean";
_haslocalmediafallback = false;
RDebugUtils.currentLine=44236804;
 //BA.debugLineNum = 44236804;BA.debugLine="Public IsPlaybackPausedByPolicy As Boolean";
_isplaybackpausedbypolicy = false;
RDebugUtils.currentLine=44236805;
 //BA.debugLineNum = 44236805;BA.debugLine="Public ResumePlaybackWhenServerAllows As Boolean";
_resumeplaybackwhenserverallows = false;
RDebugUtils.currentLine=44236806;
 //BA.debugLineNum = 44236806;BA.debugLine="Public LastOfflineDataRefreshState As String";
_lastofflinedatarefreshstate = "";
RDebugUtils.currentLine=44236807;
 //BA.debugLineNum = 44236807;BA.debugLine="End Sub";
return "";
}
public String  _endtrackcacherefresh(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "endtrackcacherefresh", false))
	 {return ((String) Debug.delegate(ba, "endtrackcacherefresh", null));}
RDebugUtils.currentLine=44630016;
 //BA.debugLineNum = 44630016;BA.debugLine="Public Sub EndTrackCacheRefresh";
RDebugUtils.currentLine=44630017;
 //BA.debugLineNum = 44630017;BA.debugLine="IsTrackCacheRefreshInProgress = False";
__ref._istrackcacherefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=44630018;
 //BA.debugLineNum = 44630018;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=44367872;
 //BA.debugLineNum = 44367872;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="IsOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="IsTrackCacheRefreshInProgress = False";
__ref._istrackcacherefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=44367875;
 //BA.debugLineNum = 44367875;BA.debugLine="HasLocalMediaFallback = False";
__ref._haslocalmediafallback /*boolean*/  = __c.False;
RDebugUtils.currentLine=44367876;
 //BA.debugLineNum = 44367876;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=44367877;
 //BA.debugLineNum = 44367877;BA.debugLine="ResumePlaybackWhenServerAllows = False";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=44367878;
 //BA.debugLineNum = 44367878;BA.debugLine="LastOfflineDataRefreshState = \"\"";
__ref._lastofflinedatarefreshstate /*String*/  = "";
RDebugUtils.currentLine=44367879;
 //BA.debugLineNum = 44367879;BA.debugLine="End Sub";
return "";
}
}