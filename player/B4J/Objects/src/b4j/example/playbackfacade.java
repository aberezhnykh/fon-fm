package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbackfacade extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbackfacade", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbackfacade.class).invoke(this, new Object[] {null});
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
public b4j.example.b4xmainpage _mainpage = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _completestartupsequence(b4j.example.playbackfacade __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "completestartupsequence", false))
	 {return ((String) Debug.delegate(ba, "completestartupsequence", null));}
RDebugUtils.currentLine=54591488;
 //BA.debugLineNum = 54591488;BA.debugLine="Public Sub CompleteStartupSequence";
RDebugUtils.currentLine=54591489;
 //BA.debugLineNum = 54591489;BA.debugLine="mainPage.Facade_CompleteStartupSequenceCore";
__ref._mainpage /*b4j.example.b4xmainpage*/ ._facade_completestartupsequencecore /*String*/ (null);
RDebugUtils.currentLine=54591490;
 //BA.debugLineNum = 54591490;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _dispatchplaybackadvance(b4j.example.playbackfacade __ref,String _initiator,boolean _allowload) throws Exception{
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "dispatchplaybackadvance", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "dispatchplaybackadvance", new Object[] {_initiator,_allowload}));}
ResumableSub_DispatchPlaybackAdvance rsub = new ResumableSub_DispatchPlaybackAdvance(this,__ref,_initiator,_allowload);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DispatchPlaybackAdvance extends BA.ResumableSub {
public ResumableSub_DispatchPlaybackAdvance(b4j.example.playbackfacade parent,b4j.example.playbackfacade __ref,String _initiator,boolean _allowload) {
this.parent = parent;
this.__ref = __ref;
this._initiator = _initiator;
this._allowload = _allowload;
this.__ref = parent;
}
b4j.example.playbackfacade __ref;
b4j.example.playbackfacade parent;
String _initiator;
boolean _allowload;
boolean _advanced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackfacade";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=54132737;
 //BA.debugLineNum = 54132737;BA.debugLine="Trace(\"сценарий переход запрос initiator=\" & init";
__ref._trace /*String*/ (null,"сценарий переход запрос initiator="+_initiator+" allowLoad="+BA.ObjectToString(_allowload));
RDebugUtils.currentLine=54132738;
 //BA.debugLineNum = 54132738;BA.debugLine="Wait For (mainPage.Facade_DispatchPlaybackAdvance";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackfacade", "dispatchplaybackadvance"), __ref._mainpage /*b4j.example.b4xmainpage*/ ._facade_dispatchplaybackadvancecore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_initiator,_allowload));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=54132739;
 //BA.debugLineNum = 54132739;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=54132740;
 //BA.debugLineNum = 54132740;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.playbackfacade __ref,anywheresoftware.b4a.BA _ba,b4j.example.b4xmainpage _target) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_target}));}
RDebugUtils.currentLine=53870592;
 //BA.debugLineNum = 53870592;BA.debugLine="Public Sub Initialize(target As B4XMainPage)";
RDebugUtils.currentLine=53870593;
 //BA.debugLineNum = 53870593;BA.debugLine="mainPage = target";
__ref._mainpage /*b4j.example.b4xmainpage*/  = _target;
RDebugUtils.currentLine=53870594;
 //BA.debugLineNum = 53870594;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadnextandplay(b4j.example.playbackfacade __ref) throws Exception{
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "loadnextandplay", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "loadnextandplay", null));}
ResumableSub_LoadNextAndPlay rsub = new ResumableSub_LoadNextAndPlay(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadNextAndPlay extends BA.ResumableSub {
public ResumableSub_LoadNextAndPlay(b4j.example.playbackfacade parent,b4j.example.playbackfacade __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.playbackfacade __ref;
b4j.example.playbackfacade parent;
boolean _advanced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackfacade";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=54067201;
 //BA.debugLineNum = 54067201;BA.debugLine="Trace(\"сценарий переход запрос mode=load_next_and";
__ref._trace /*String*/ (null,"сценарий переход запрос mode=load_next_and_play");
RDebugUtils.currentLine=54067202;
 //BA.debugLineNum = 54067202;BA.debugLine="Wait For (mainPage.Facade_LoadNextAndPlayCore) Co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackfacade", "loadnextandplay"), __ref._mainpage /*b4j.example.b4xmainpage*/ ._facade_loadnextandplaycore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=54067203;
 //BA.debugLineNum = 54067203;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=54067204;
 //BA.debugLineNum = 54067204;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _pauseplayback(b4j.example.playbackfacade __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "pauseplayback", false))
	 {return ((String) Debug.delegate(ba, "pauseplayback", new Object[] {_reason,_connectionmode}));}
RDebugUtils.currentLine=54460416;
 //BA.debugLineNum = 54460416;BA.debugLine="Public Sub PausePlayback(reason As String, connect";
RDebugUtils.currentLine=54460417;
 //BA.debugLineNum = 54460417;BA.debugLine="Trace(\"сценарий pause запрос mode=\" & connectionM";
__ref._trace /*String*/ (null,"сценарий pause запрос mode="+_connectionmode);
RDebugUtils.currentLine=54460418;
 //BA.debugLineNum = 54460418;BA.debugLine="mainPage.Facade_PausePlaybackCore(reason, connect";
__ref._mainpage /*b4j.example.b4xmainpage*/ ._facade_pauseplaybackcore /*String*/ (null,_reason,_connectionmode);
RDebugUtils.currentLine=54460419;
 //BA.debugLineNum = 54460419;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparenextplayable(b4j.example.playbackfacade __ref) throws Exception{
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "preparenextplayable", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "preparenextplayable", null));}
ResumableSub_PrepareNextPlayable rsub = new ResumableSub_PrepareNextPlayable(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareNextPlayable extends BA.ResumableSub {
public ResumableSub_PrepareNextPlayable(b4j.example.playbackfacade parent,b4j.example.playbackfacade __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.playbackfacade __ref;
b4j.example.playbackfacade parent;
boolean _prepared = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackfacade";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=54198273;
 //BA.debugLineNum = 54198273;BA.debugLine="Wait For (mainPage.Facade_PrepareNextPlayableCore";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackfacade", "preparenextplayable"), __ref._mainpage /*b4j.example.b4xmainpage*/ ._facade_preparenextplayablecore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (boolean) result[1];
;
RDebugUtils.currentLine=54198274;
 //BA.debugLineNum = 54198274;BA.debugLine="Return prepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prepared));return;};
RDebugUtils.currentLine=54198275;
 //BA.debugLineNum = 54198275;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _resumeplaybackafterpolicypause(b4j.example.playbackfacade __ref) throws Exception{
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "resumeplaybackafterpolicypause", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "resumeplaybackafterpolicypause", null));}
ResumableSub_ResumePlaybackAfterPolicyPause rsub = new ResumableSub_ResumePlaybackAfterPolicyPause(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ResumePlaybackAfterPolicyPause extends BA.ResumableSub {
public ResumableSub_ResumePlaybackAfterPolicyPause(b4j.example.playbackfacade parent,b4j.example.playbackfacade __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.playbackfacade __ref;
b4j.example.playbackfacade parent;
boolean _resumed = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackfacade";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=54525953;
 //BA.debugLineNum = 54525953;BA.debugLine="Trace(\"сценарий resume запрос reason=policy_pause";
__ref._trace /*String*/ (null,"сценарий resume запрос reason=policy_pause");
RDebugUtils.currentLine=54525954;
 //BA.debugLineNum = 54525954;BA.debugLine="Wait For (mainPage.Facade_ResumePlaybackAfterPoli";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackfacade", "resumeplaybackafterpolicypause"), __ref._mainpage /*b4j.example.b4xmainpage*/ ._facade_resumeplaybackafterpolicypausecore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resumed = (boolean) result[1];
;
RDebugUtils.currentLine=54525955;
 //BA.debugLineNum = 54525955;BA.debugLine="Return resumed";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resumed));return;};
RDebugUtils.currentLine=54525956;
 //BA.debugLineNum = 54525956;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _startfirsttrack(b4j.example.playbackfacade __ref,String _mode) throws Exception{
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "startfirsttrack", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "startfirsttrack", new Object[] {_mode}));}
ResumableSub_StartFirstTrack rsub = new ResumableSub_StartFirstTrack(this,__ref,_mode);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StartFirstTrack extends BA.ResumableSub {
public ResumableSub_StartFirstTrack(b4j.example.playbackfacade parent,b4j.example.playbackfacade __ref,String _mode) {
this.parent = parent;
this.__ref = __ref;
this._mode = _mode;
this.__ref = parent;
}
b4j.example.playbackfacade __ref;
b4j.example.playbackfacade parent;
String _mode;
boolean _started = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackfacade";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=54001665;
 //BA.debugLineNum = 54001665;BA.debugLine="Trace(\"сценарий старт запрос mode=\" & mode)";
__ref._trace /*String*/ (null,"сценарий старт запрос mode="+_mode);
RDebugUtils.currentLine=54001666;
 //BA.debugLineNum = 54001666;BA.debugLine="Wait For (mainPage.Facade_StartFirstTrackCore(mod";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackfacade", "startfirsttrack"), __ref._mainpage /*b4j.example.b4xmainpage*/ ._facade_startfirsttrackcore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mode));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_started = (boolean) result[1];
;
RDebugUtils.currentLine=54001667;
 //BA.debugLineNum = 54001667;BA.debugLine="Return started";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_started));return;};
RDebugUtils.currentLine=54001668;
 //BA.debugLineNum = 54001668;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _stopplayback(b4j.example.playbackfacade __ref) throws Exception{
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "stopplayback", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "stopplayback", null));}
ResumableSub_StopPlayback rsub = new ResumableSub_StopPlayback(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StopPlayback extends BA.ResumableSub {
public ResumableSub_StopPlayback(b4j.example.playbackfacade parent,b4j.example.playbackfacade __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.playbackfacade __ref;
b4j.example.playbackfacade parent;
boolean _stopped = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackfacade";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=54394881;
 //BA.debugLineNum = 54394881;BA.debugLine="Trace(\"сценарий stop запрос\")";
__ref._trace /*String*/ (null,"сценарий stop запрос");
RDebugUtils.currentLine=54394882;
 //BA.debugLineNum = 54394882;BA.debugLine="Wait For (mainPage.Facade_StopPlayerCore) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackfacade", "stopplayback"), __ref._mainpage /*b4j.example.b4xmainpage*/ ._facade_stopplayercore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_stopped = (boolean) result[1];
;
RDebugUtils.currentLine=54394883;
 //BA.debugLineNum = 54394883;BA.debugLine="Return stopped";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_stopped));return;};
RDebugUtils.currentLine=54394884;
 //BA.debugLineNum = 54394884;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _advanceaftercomplete(b4j.example.playbackfacade __ref,String _audiokey) throws Exception{
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "advanceaftercomplete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "advanceaftercomplete", new Object[] {_audiokey}));}
ResumableSub_AdvanceAfterComplete rsub = new ResumableSub_AdvanceAfterComplete(this,__ref,_audiokey);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AdvanceAfterComplete extends BA.ResumableSub {
public ResumableSub_AdvanceAfterComplete(b4j.example.playbackfacade parent,b4j.example.playbackfacade __ref,String _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this.__ref = parent;
}
b4j.example.playbackfacade __ref;
b4j.example.playbackfacade parent;
String _audiokey;
boolean _advanced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackfacade";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=54263809;
 //BA.debugLineNum = 54263809;BA.debugLine="Trace(\"сценарий переход запрос initiator=audio_co";
__ref._trace /*String*/ (null,"сценарий переход запрос initiator=audio_complete:"+_audiokey);
RDebugUtils.currentLine=54263810;
 //BA.debugLineNum = 54263810;BA.debugLine="Wait For (DispatchPlaybackAdvance(\"audio_complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackfacade", "advanceaftercomplete"), __ref._dispatchplaybackadvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"audio_complete:"+_audiokey,parent.__c.True));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=54263811;
 //BA.debugLineNum = 54263811;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=54263812;
 //BA.debugLineNum = 54263812;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _trace(b4j.example.playbackfacade __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
RDebugUtils.currentLine=53936128;
 //BA.debugLineNum = 53936128;BA.debugLine="Private Sub Trace(message As String)";
RDebugUtils.currentLine=53936129;
 //BA.debugLineNum = 53936129;BA.debugLine="mainPage.PlaybackFacade_Trace(message)";
__ref._mainpage /*b4j.example.b4xmainpage*/ ._playbackfacade_trace /*String*/ (null,_message);
RDebugUtils.currentLine=53936130;
 //BA.debugLineNum = 53936130;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _advanceaftererror(b4j.example.playbackfacade __ref,String _audiokey) throws Exception{
RDebugUtils.currentModule="playbackfacade";
if (Debug.shouldDelegate(ba, "advanceaftererror", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "advanceaftererror", new Object[] {_audiokey}));}
ResumableSub_AdvanceAfterError rsub = new ResumableSub_AdvanceAfterError(this,__ref,_audiokey);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AdvanceAfterError extends BA.ResumableSub {
public ResumableSub_AdvanceAfterError(b4j.example.playbackfacade parent,b4j.example.playbackfacade __ref,String _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this.__ref = parent;
}
b4j.example.playbackfacade __ref;
b4j.example.playbackfacade parent;
String _audiokey;
boolean _advanced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbackfacade";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=54329345;
 //BA.debugLineNum = 54329345;BA.debugLine="Trace(\"сценарий переход запрос initiator=audio_er";
__ref._trace /*String*/ (null,"сценарий переход запрос initiator=audio_error_recovery:"+_audiokey);
RDebugUtils.currentLine=54329346;
 //BA.debugLineNum = 54329346;BA.debugLine="Wait For (DispatchPlaybackAdvance(\"audio_error_re";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbackfacade", "advanceaftererror"), __ref._dispatchplaybackadvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"audio_error_recovery:"+_audiokey,parent.__c.True));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=54329347;
 //BA.debugLineNum = 54329347;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=54329348;
 //BA.debugLineNum = 54329348;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.playbackfacade __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbackfacade";
RDebugUtils.currentLine=53805056;
 //BA.debugLineNum = 53805056;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=53805057;
 //BA.debugLineNum = 53805057;BA.debugLine="Private mainPage As B4XMainPage";
_mainpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=53805058;
 //BA.debugLineNum = 53805058;BA.debugLine="End Sub";
return "";
}
}