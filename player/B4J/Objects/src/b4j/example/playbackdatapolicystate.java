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
public boolean _islocalplaybackmode = false;
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
RDebugUtils.currentLine=47579136;
 //BA.debugLineNum = 47579136;BA.debugLine="Public Sub ClearPolicyPause";
RDebugUtils.currentLine=47579137;
 //BA.debugLineNum = 47579137;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=47579138;
 //BA.debugLineNum = 47579138;BA.debugLine="End Sub";
return "";
}
public boolean  _begintrackcacherefresh(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "begintrackcacherefresh", false))
	 {return ((Boolean) Debug.delegate(ba, "begintrackcacherefresh", null));}
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Public Sub BeginTrackCacheRefresh As Boolean";
RDebugUtils.currentLine=47382529;
 //BA.debugLineNum = 47382529;BA.debugLine="If IsTrackCacheRefreshInProgress Then Return Fals";
if (__ref._istrackcacherefreshinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=47382530;
 //BA.debugLineNum = 47382530;BA.debugLine="IsTrackCacheRefreshInProgress = True";
__ref._istrackcacherefreshinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=47382531;
 //BA.debugLineNum = 47382531;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=47382532;
 //BA.debugLineNum = 47382532;BA.debugLine="End Sub";
return false;
}
public String  _endtrackcacherefresh(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "endtrackcacherefresh", false))
	 {return ((String) Debug.delegate(ba, "endtrackcacherefresh", null));}
RDebugUtils.currentLine=47448064;
 //BA.debugLineNum = 47448064;BA.debugLine="Public Sub EndTrackCacheRefresh";
RDebugUtils.currentLine=47448065;
 //BA.debugLineNum = 47448065;BA.debugLine="IsTrackCacheRefreshInProgress = False";
__ref._istrackcacherefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=47448066;
 //BA.debugLineNum = 47448066;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypause(b4j.example.playbackdatapolicystate __ref,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "enterpolicypause", false))
	 {return ((String) Debug.delegate(ba, "enterpolicypause", new Object[] {_connectionmode}));}
RDebugUtils.currentLine=47513600;
 //BA.debugLineNum = 47513600;BA.debugLine="Public Sub EnterPolicyPause(connectionMode As Stri";
RDebugUtils.currentLine=47513601;
 //BA.debugLineNum = 47513601;BA.debugLine="IsPlaybackPausedByPolicy = True";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.True;
RDebugUtils.currentLine=47513602;
 //BA.debugLineNum = 47513602;BA.debugLine="ResumePlaybackWhenServerAllows = True";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.True;
RDebugUtils.currentLine=47513603;
 //BA.debugLineNum = 47513603;BA.debugLine="IsLocalPlaybackMode = (connectionMode = \"offline\"";
__ref._islocalplaybackmode /*boolean*/  = ((_connectionmode).equals("offline"));
RDebugUtils.currentLine=47513604;
 //BA.debugLineNum = 47513604;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypauseandresumerequest(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "clearpolicypauseandresumerequest", false))
	 {return ((String) Debug.delegate(ba, "clearpolicypauseandresumerequest", null));}
RDebugUtils.currentLine=47644672;
 //BA.debugLineNum = 47644672;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
RDebugUtils.currentLine=47644673;
 //BA.debugLineNum = 47644673;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=47644674;
 //BA.debugLineNum = 47644674;BA.debugLine="ResumePlaybackWhenServerAllows = False";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=47644675;
 //BA.debugLineNum = 47644675;BA.debugLine="End Sub";
return "";
}
public String  _setlocalfallbackready(b4j.example.playbackdatapolicystate __ref,boolean _fallbackready) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "setlocalfallbackready", false))
	 {return ((String) Debug.delegate(ba, "setlocalfallbackready", new Object[] {_fallbackready}));}
RDebugUtils.currentLine=47841280;
 //BA.debugLineNum = 47841280;BA.debugLine="Public Sub SetLocalFallbackReady(fallbackReady As";
RDebugUtils.currentLine=47841281;
 //BA.debugLineNum = 47841281;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=47841282;
 //BA.debugLineNum = 47841282;BA.debugLine="IsLocalPlaybackMode = fallbackReady";
__ref._islocalplaybackmode /*boolean*/  = _fallbackready;
RDebugUtils.currentLine=47841283;
 //BA.debugLineNum = 47841283;BA.debugLine="End Sub";
return "";
}
public String  _applytemporarymode(b4j.example.playbackdatapolicystate __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "applytemporarymode", false))
	 {return ((String) Debug.delegate(ba, "applytemporarymode", new Object[] {_mode}));}
RDebugUtils.currentLine=47775744;
 //BA.debugLineNum = 47775744;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
RDebugUtils.currentLine=47775745;
 //BA.debugLineNum = 47775745;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=47775746;
 //BA.debugLineNum = 47775746;BA.debugLine="ResumePlaybackWhenServerAllows = False";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=47775747;
 //BA.debugLineNum = 47775747;BA.debugLine="IsLocalPlaybackMode = (mode = \"offline\")";
__ref._islocalplaybackmode /*boolean*/  = ((_mode).equals("offline"));
RDebugUtils.currentLine=47775748;
 //BA.debugLineNum = 47775748;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackdatapolicystate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="End Sub";
return "";
}
public boolean  _beginofflinedatarefresh(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "beginofflinedatarefresh", false))
	 {return ((Boolean) Debug.delegate(ba, "beginofflinedatarefresh", null));}
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="If IsOfflineDataRefreshInProgress Then Return Fal";
if (__ref._isofflinedatarefreshinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="IsOfflineDataRefreshInProgress = True";
__ref._isofflinedatarefreshinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="LastOfflineDataRefreshState = \"\"";
__ref._lastofflinedatarefreshstate /*String*/  = "";
RDebugUtils.currentLine=47251460;
 //BA.debugLineNum = 47251460;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=47251461;
 //BA.debugLineNum = 47251461;BA.debugLine="End Sub";
return false;
}
public String  _endofflinedatarefresh(b4j.example.playbackdatapolicystate __ref,String _refreshstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "endofflinedatarefresh", false))
	 {return ((String) Debug.delegate(ba, "endofflinedatarefresh", new Object[] {_refreshstate}));}
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Public Sub EndOfflineDataRefresh(refreshState As S";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="LastOfflineDataRefreshState = refreshState";
__ref._lastofflinedatarefreshstate /*String*/  = _refreshstate;
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="IsOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=47316995;
 //BA.debugLineNum = 47316995;BA.debugLine="End Sub";
return "";
}
public String  _setremotedataready(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "setremotedataready", false))
	 {return ((String) Debug.delegate(ba, "setremotedataready", null));}
RDebugUtils.currentLine=47906816;
 //BA.debugLineNum = 47906816;BA.debugLine="Public Sub SetRemoteDataReady";
RDebugUtils.currentLine=47906817;
 //BA.debugLineNum = 47906817;BA.debugLine="IsLocalPlaybackMode = False";
__ref._islocalplaybackmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=47906818;
 //BA.debugLineNum = 47906818;BA.debugLine="End Sub";
return "";
}
public String  _enterlocalplayback(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "enterlocalplayback", false))
	 {return ((String) Debug.delegate(ba, "enterlocalplayback", null));}
RDebugUtils.currentLine=47710208;
 //BA.debugLineNum = 47710208;BA.debugLine="Public Sub EnterLocalPlayback";
RDebugUtils.currentLine=47710209;
 //BA.debugLineNum = 47710209;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=47710210;
 //BA.debugLineNum = 47710210;BA.debugLine="IsLocalPlaybackMode = True";
__ref._islocalplaybackmode /*boolean*/  = __c.True;
RDebugUtils.currentLine=47710211;
 //BA.debugLineNum = 47710211;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="Public IsOfflineDataRefreshInProgress As Boolean";
_isofflinedatarefreshinprogress = false;
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="Public IsTrackCacheRefreshInProgress As Boolean";
_istrackcacherefreshinprogress = false;
RDebugUtils.currentLine=47054851;
 //BA.debugLineNum = 47054851;BA.debugLine="Public IsLocalPlaybackMode As Boolean";
_islocalplaybackmode = false;
RDebugUtils.currentLine=47054852;
 //BA.debugLineNum = 47054852;BA.debugLine="Public IsPlaybackPausedByPolicy As Boolean";
_isplaybackpausedbypolicy = false;
RDebugUtils.currentLine=47054853;
 //BA.debugLineNum = 47054853;BA.debugLine="Public ResumePlaybackWhenServerAllows As Boolean";
_resumeplaybackwhenserverallows = false;
RDebugUtils.currentLine=47054854;
 //BA.debugLineNum = 47054854;BA.debugLine="Public LastOfflineDataRefreshState As String";
_lastofflinedatarefreshstate = "";
RDebugUtils.currentLine=47054855;
 //BA.debugLineNum = 47054855;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="IsOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="IsTrackCacheRefreshInProgress = False";
__ref._istrackcacherefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=47185923;
 //BA.debugLineNum = 47185923;BA.debugLine="IsLocalPlaybackMode = False";
__ref._islocalplaybackmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=47185924;
 //BA.debugLineNum = 47185924;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=47185925;
 //BA.debugLineNum = 47185925;BA.debugLine="ResumePlaybackWhenServerAllows = False";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=47185926;
 //BA.debugLineNum = 47185926;BA.debugLine="LastOfflineDataRefreshState = \"\"";
__ref._lastofflinedatarefreshstate /*String*/  = "";
RDebugUtils.currentLine=47185927;
 //BA.debugLineNum = 47185927;BA.debugLine="End Sub";
return "";
}
}