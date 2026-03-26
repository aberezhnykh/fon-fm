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
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _clearpolicypause(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "clearpolicypause", false))
	 {return ((String) Debug.delegate(ba, "clearpolicypause", null));}
RDebugUtils.currentLine=49676288;
 //BA.debugLineNum = 49676288;BA.debugLine="Public Sub ClearPolicyPause";
RDebugUtils.currentLine=49676289;
 //BA.debugLineNum = 49676289;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=49676290;
 //BA.debugLineNum = 49676290;BA.debugLine="End Sub";
return "";
}
public String  _applytemporarymode(b4j.example.playbackdatapolicystate __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "applytemporarymode", false))
	 {return ((String) Debug.delegate(ba, "applytemporarymode", new Object[] {_mode}));}
RDebugUtils.currentLine=49872896;
 //BA.debugLineNum = 49872896;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
RDebugUtils.currentLine=49872897;
 //BA.debugLineNum = 49872897;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=49872898;
 //BA.debugLineNum = 49872898;BA.debugLine="ResumePlaybackWhenServerAllows = False";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=49872899;
 //BA.debugLineNum = 49872899;BA.debugLine="HasLocalMediaFallback = False";
__ref._haslocalmediafallback /*boolean*/  = __c.False;
RDebugUtils.currentLine=49872900;
 //BA.debugLineNum = 49872900;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypauseandresumerequest(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "clearpolicypauseandresumerequest", false))
	 {return ((String) Debug.delegate(ba, "clearpolicypauseandresumerequest", null));}
RDebugUtils.currentLine=49741824;
 //BA.debugLineNum = 49741824;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
RDebugUtils.currentLine=49741825;
 //BA.debugLineNum = 49741825;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=49741826;
 //BA.debugLineNum = 49741826;BA.debugLine="ResumePlaybackWhenServerAllows = False";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=49741827;
 //BA.debugLineNum = 49741827;BA.debugLine="End Sub";
return "";
}
public String  _enterlocalplayback(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "enterlocalplayback", false))
	 {return ((String) Debug.delegate(ba, "enterlocalplayback", null));}
RDebugUtils.currentLine=49807360;
 //BA.debugLineNum = 49807360;BA.debugLine="Public Sub EnterLocalPlayback";
RDebugUtils.currentLine=49807361;
 //BA.debugLineNum = 49807361;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=49807362;
 //BA.debugLineNum = 49807362;BA.debugLine="HasLocalMediaFallback = True";
__ref._haslocalmediafallback /*boolean*/  = __c.True;
RDebugUtils.currentLine=49807363;
 //BA.debugLineNum = 49807363;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypause(b4j.example.playbackdatapolicystate __ref,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "enterpolicypause", false))
	 {return ((String) Debug.delegate(ba, "enterpolicypause", new Object[] {_connectionmode}));}
RDebugUtils.currentLine=49610752;
 //BA.debugLineNum = 49610752;BA.debugLine="Public Sub EnterPolicyPause(connectionMode As Stri";
RDebugUtils.currentLine=49610753;
 //BA.debugLineNum = 49610753;BA.debugLine="IsPlaybackPausedByPolicy = True";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.True;
RDebugUtils.currentLine=49610754;
 //BA.debugLineNum = 49610754;BA.debugLine="ResumePlaybackWhenServerAllows = True";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.True;
RDebugUtils.currentLine=49610755;
 //BA.debugLineNum = 49610755;BA.debugLine="HasLocalMediaFallback = False";
__ref._haslocalmediafallback /*boolean*/  = __c.False;
RDebugUtils.currentLine=49610756;
 //BA.debugLineNum = 49610756;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.playbackdatapolicystate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=49217536;
 //BA.debugLineNum = 49217536;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="Reset";
__ref._reset /*String*/ (null);
RDebugUtils.currentLine=49217538;
 //BA.debugLineNum = 49217538;BA.debugLine="End Sub";
return "";
}
public boolean  _beginofflinedatarefresh(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "beginofflinedatarefresh", false))
	 {return ((Boolean) Debug.delegate(ba, "beginofflinedatarefresh", null));}
RDebugUtils.currentLine=49348608;
 //BA.debugLineNum = 49348608;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="If IsOfflineDataRefreshInProgress Then Return Fal";
if (__ref._isofflinedatarefreshinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=49348610;
 //BA.debugLineNum = 49348610;BA.debugLine="IsOfflineDataRefreshInProgress = True";
__ref._isofflinedatarefreshinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=49348611;
 //BA.debugLineNum = 49348611;BA.debugLine="LastOfflineDataRefreshState = \"\"";
__ref._lastofflinedatarefreshstate /*String*/  = "";
RDebugUtils.currentLine=49348612;
 //BA.debugLineNum = 49348612;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=49348613;
 //BA.debugLineNum = 49348613;BA.debugLine="End Sub";
return false;
}
public boolean  _begintrackcacherefresh(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "begintrackcacherefresh", false))
	 {return ((Boolean) Debug.delegate(ba, "begintrackcacherefresh", null));}
RDebugUtils.currentLine=49479680;
 //BA.debugLineNum = 49479680;BA.debugLine="Public Sub BeginTrackCacheRefresh As Boolean";
RDebugUtils.currentLine=49479681;
 //BA.debugLineNum = 49479681;BA.debugLine="If IsTrackCacheRefreshInProgress Then Return Fals";
if (__ref._istrackcacherefreshinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=49479682;
 //BA.debugLineNum = 49479682;BA.debugLine="IsTrackCacheRefreshInProgress = True";
__ref._istrackcacherefreshinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=49479683;
 //BA.debugLineNum = 49479683;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=49479684;
 //BA.debugLineNum = 49479684;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
RDebugUtils.currentLine=49152000;
 //BA.debugLineNum = 49152000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=49152001;
 //BA.debugLineNum = 49152001;BA.debugLine="Public IsOfflineDataRefreshInProgress As Boolean";
_isofflinedatarefreshinprogress = false;
RDebugUtils.currentLine=49152002;
 //BA.debugLineNum = 49152002;BA.debugLine="Public IsTrackCacheRefreshInProgress As Boolean";
_istrackcacherefreshinprogress = false;
RDebugUtils.currentLine=49152003;
 //BA.debugLineNum = 49152003;BA.debugLine="Public HasLocalMediaFallback As Boolean";
_haslocalmediafallback = false;
RDebugUtils.currentLine=49152004;
 //BA.debugLineNum = 49152004;BA.debugLine="Public IsPlaybackPausedByPolicy As Boolean";
_isplaybackpausedbypolicy = false;
RDebugUtils.currentLine=49152005;
 //BA.debugLineNum = 49152005;BA.debugLine="Public ResumePlaybackWhenServerAllows As Boolean";
_resumeplaybackwhenserverallows = false;
RDebugUtils.currentLine=49152006;
 //BA.debugLineNum = 49152006;BA.debugLine="Public LastOfflineDataRefreshState As String";
_lastofflinedatarefreshstate = "";
RDebugUtils.currentLine=49152007;
 //BA.debugLineNum = 49152007;BA.debugLine="End Sub";
return "";
}
public String  _endofflinedatarefresh(b4j.example.playbackdatapolicystate __ref,String _refreshstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "endofflinedatarefresh", false))
	 {return ((String) Debug.delegate(ba, "endofflinedatarefresh", new Object[] {_refreshstate}));}
RDebugUtils.currentLine=49414144;
 //BA.debugLineNum = 49414144;BA.debugLine="Public Sub EndOfflineDataRefresh(refreshState As S";
RDebugUtils.currentLine=49414145;
 //BA.debugLineNum = 49414145;BA.debugLine="LastOfflineDataRefreshState = refreshState";
__ref._lastofflinedatarefreshstate /*String*/  = _refreshstate;
RDebugUtils.currentLine=49414146;
 //BA.debugLineNum = 49414146;BA.debugLine="IsOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=49414147;
 //BA.debugLineNum = 49414147;BA.debugLine="End Sub";
return "";
}
public String  _endtrackcacherefresh(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "endtrackcacherefresh", false))
	 {return ((String) Debug.delegate(ba, "endtrackcacherefresh", null));}
RDebugUtils.currentLine=49545216;
 //BA.debugLineNum = 49545216;BA.debugLine="Public Sub EndTrackCacheRefresh";
RDebugUtils.currentLine=49545217;
 //BA.debugLineNum = 49545217;BA.debugLine="IsTrackCacheRefreshInProgress = False";
__ref._istrackcacherefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=49545218;
 //BA.debugLineNum = 49545218;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "reset", false))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=49283072;
 //BA.debugLineNum = 49283072;BA.debugLine="Public Sub Reset";
RDebugUtils.currentLine=49283073;
 //BA.debugLineNum = 49283073;BA.debugLine="IsOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=49283074;
 //BA.debugLineNum = 49283074;BA.debugLine="IsTrackCacheRefreshInProgress = False";
__ref._istrackcacherefreshinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=49283075;
 //BA.debugLineNum = 49283075;BA.debugLine="HasLocalMediaFallback = False";
__ref._haslocalmediafallback /*boolean*/  = __c.False;
RDebugUtils.currentLine=49283076;
 //BA.debugLineNum = 49283076;BA.debugLine="IsPlaybackPausedByPolicy = False";
__ref._isplaybackpausedbypolicy /*boolean*/  = __c.False;
RDebugUtils.currentLine=49283077;
 //BA.debugLineNum = 49283077;BA.debugLine="ResumePlaybackWhenServerAllows = False";
__ref._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
RDebugUtils.currentLine=49283078;
 //BA.debugLineNum = 49283078;BA.debugLine="LastOfflineDataRefreshState = \"\"";
__ref._lastofflinedatarefreshstate /*String*/  = "";
RDebugUtils.currentLine=49283079;
 //BA.debugLineNum = 49283079;BA.debugLine="End Sub";
return "";
}
public String  _setremotedataready(b4j.example.playbackdatapolicystate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackdatapolicystate";
if (Debug.shouldDelegate(ba, "setremotedataready", false))
	 {return ((String) Debug.delegate(ba, "setremotedataready", null));}
RDebugUtils.currentLine=49938432;
 //BA.debugLineNum = 49938432;BA.debugLine="Public Sub SetRemoteDataReady";
RDebugUtils.currentLine=49938433;
 //BA.debugLineNum = 49938433;BA.debugLine="HasLocalMediaFallback = False";
__ref._haslocalmediafallback /*boolean*/  = __c.False;
RDebugUtils.currentLine=49938434;
 //BA.debugLineNum = 49938434;BA.debugLine="End Sub";
return "";
}
}