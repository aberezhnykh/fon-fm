package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackfacade_subs_0 {


public static RemoteObject  _advanceaftercomplete(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("AdvanceAfterComplete (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("advanceaftercomplete")) { return __ref.runUserSub(false, "playbackfacade","advanceaftercomplete", __ref, _audiokey);}
ResumableSub_AdvanceAfterComplete rsub = new ResumableSub_AdvanceAfterComplete(null,__ref,_audiokey);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AdvanceAfterComplete extends BA.ResumableSub {
public ResumableSub_AdvanceAfterComplete(b4j.example.playbackfacade parent,RemoteObject __ref,RemoteObject _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackfacade parent;
RemoteObject _audiokey;
RemoteObject _advanced = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AdvanceAfterComplete (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,37);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 38;BA.debugLine="Trace(\"сценарий переход запрос initiator=audio_co";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.playbackfacade.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("сценарий переход запрос initiator=audio_complete:"),_audiokey)));
 BA.debugLineNum = 39;BA.debugLine="Wait For (DispatchPlaybackAdvance(\"audio_complete";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackfacade", "advanceaftercomplete"), __ref.runClassMethod (b4j.example.playbackfacade.class, "_dispatchplaybackadvance" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("audio_complete:"),_audiokey)),(Object)(parent.__c.getField(true,"True"))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("advanced", _advanced);
;
 BA.debugLineNum = 40;BA.debugLine="Return advanced";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_advanced));return;};
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _advanced) throws Exception{
}
public static RemoteObject  _advanceaftererror(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("AdvanceAfterError (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("advanceaftererror")) { return __ref.runUserSub(false, "playbackfacade","advanceaftererror", __ref, _audiokey);}
ResumableSub_AdvanceAfterError rsub = new ResumableSub_AdvanceAfterError(null,__ref,_audiokey);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AdvanceAfterError extends BA.ResumableSub {
public ResumableSub_AdvanceAfterError(b4j.example.playbackfacade parent,RemoteObject __ref,RemoteObject _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackfacade parent;
RemoteObject _audiokey;
RemoteObject _advanced = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AdvanceAfterError (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,43);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 44;BA.debugLine="Trace(\"сценарий переход запрос initiator=audio_er";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.playbackfacade.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("сценарий переход запрос initiator=audio_error_recovery:"),_audiokey)));
 BA.debugLineNum = 45;BA.debugLine="Wait For (DispatchPlaybackAdvance(\"audio_error_re";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackfacade", "advanceaftererror"), __ref.runClassMethod (b4j.example.playbackfacade.class, "_dispatchplaybackadvance" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("audio_error_recovery:"),_audiokey)),(Object)(parent.__c.getField(true,"True"))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("advanced", _advanced);
;
 BA.debugLineNum = 46;BA.debugLine="Return advanced";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_advanced));return;};
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mainPage As B4XMainPage";
playbackfacade._mainpage = RemoteObject.createNew ("b4j.example.b4xmainpage");__ref.setField("_mainpage",playbackfacade._mainpage);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _completestartupsequence(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CompleteStartupSequence (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("completestartupsequence")) { return __ref.runUserSub(false, "playbackfacade","completestartupsequence", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub CompleteStartupSequence";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="mainPage.Facade_CompleteStartupSequenceCore";
Debug.ShouldStop(4);
__ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_facade_completestartupsequencecore" /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dispatchplaybackadvance(RemoteObject __ref,RemoteObject _initiator,RemoteObject _allowload) throws Exception{
try {
		Debug.PushSubsStack("DispatchPlaybackAdvance (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("dispatchplaybackadvance")) { return __ref.runUserSub(false, "playbackfacade","dispatchplaybackadvance", __ref, _initiator, _allowload);}
ResumableSub_DispatchPlaybackAdvance rsub = new ResumableSub_DispatchPlaybackAdvance(null,__ref,_initiator,_allowload);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DispatchPlaybackAdvance extends BA.ResumableSub {
public ResumableSub_DispatchPlaybackAdvance(b4j.example.playbackfacade parent,RemoteObject __ref,RemoteObject _initiator,RemoteObject _allowload) {
this.parent = parent;
this.__ref = __ref;
this._initiator = _initiator;
this._allowload = _allowload;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackfacade parent;
RemoteObject _initiator;
RemoteObject _allowload;
RemoteObject _advanced = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DispatchPlaybackAdvance (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,26);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("initiator", _initiator);
Debug.locals.put("allowLoad", _allowload);
 BA.debugLineNum = 27;BA.debugLine="Trace(\"сценарий переход запрос initiator=\" & init";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.playbackfacade.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("сценарий переход запрос initiator="),_initiator,RemoteObject.createImmutable(" allowLoad="),_allowload)));
 BA.debugLineNum = 28;BA.debugLine="Wait For (mainPage.Facade_DispatchPlaybackAdvance";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackfacade", "dispatchplaybackadvance"), __ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_facade_dispatchplaybackadvancecore" /*RemoteObject*/ ,(Object)(_initiator),(Object)(_allowload)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("advanced", _advanced);
;
 BA.debugLineNum = 29;BA.debugLine="Return advanced";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_advanced));return;};
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackfacade","initialize", __ref, _ba, _target);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("target", _target);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize(target As B4XMainPage)";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="mainPage = target";
Debug.ShouldStop(64);
__ref.setField ("_mainpage" /*RemoteObject*/ ,_target);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadnextandplay(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadNextAndPlay (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("loadnextandplay")) { return __ref.runUserSub(false, "playbackfacade","loadnextandplay", __ref);}
ResumableSub_LoadNextAndPlay rsub = new ResumableSub_LoadNextAndPlay(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadNextAndPlay extends BA.ResumableSub {
public ResumableSub_LoadNextAndPlay(b4j.example.playbackfacade parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackfacade parent;
RemoteObject _advanced = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadNextAndPlay (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,20);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 21;BA.debugLine="Trace(\"сценарий переход запрос mode=load_next_and";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.playbackfacade.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("сценарий переход запрос mode=load_next_and_play")));
 BA.debugLineNum = 22;BA.debugLine="Wait For (mainPage.Facade_LoadNextAndPlayCore) Co";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackfacade", "loadnextandplay"), __ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_facade_loadnextandplaycore" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("advanced", _advanced);
;
 BA.debugLineNum = 23;BA.debugLine="Return advanced";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_advanced));return;};
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _pauseplayback(RemoteObject __ref,RemoteObject _reason,RemoteObject _connectionmode) throws Exception{
try {
		Debug.PushSubsStack("PausePlayback (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("pauseplayback")) { return __ref.runUserSub(false, "playbackfacade","pauseplayback", __ref, _reason, _connectionmode);}
Debug.locals.put("reason", _reason);
Debug.locals.put("connectionMode", _connectionmode);
 BA.debugLineNum = 55;BA.debugLine="Public Sub PausePlayback(reason As String, connect";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Trace(\"сценарий pause запрос mode=\" & connectionM";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.playbackfacade.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("сценарий pause запрос mode="),_connectionmode)));
 BA.debugLineNum = 57;BA.debugLine="mainPage.Facade_PausePlaybackCore(reason, connect";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_facade_pauseplaybackcore" /*RemoteObject*/ ,(Object)(_reason),(Object)(_connectionmode));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparenextplayable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PrepareNextPlayable (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("preparenextplayable")) { return __ref.runUserSub(false, "playbackfacade","preparenextplayable", __ref);}
ResumableSub_PrepareNextPlayable rsub = new ResumableSub_PrepareNextPlayable(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PrepareNextPlayable extends BA.ResumableSub {
public ResumableSub_PrepareNextPlayable(b4j.example.playbackfacade parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackfacade parent;
RemoteObject _prepared = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareNextPlayable (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,32);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 33;BA.debugLine="Wait For (mainPage.Facade_PrepareNextPlayableCore";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackfacade", "preparenextplayable"), __ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_facade_preparenextplayablecore" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("prepared", _prepared);
;
 BA.debugLineNum = 34;BA.debugLine="Return prepared";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_prepared));return;};
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _resumeplaybackafterpolicypause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResumePlaybackAfterPolicyPause (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("resumeplaybackafterpolicypause")) { return __ref.runUserSub(false, "playbackfacade","resumeplaybackafterpolicypause", __ref);}
ResumableSub_ResumePlaybackAfterPolicyPause rsub = new ResumableSub_ResumePlaybackAfterPolicyPause(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ResumePlaybackAfterPolicyPause extends BA.ResumableSub {
public ResumableSub_ResumePlaybackAfterPolicyPause(b4j.example.playbackfacade parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackfacade parent;
RemoteObject _resumed = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ResumePlaybackAfterPolicyPause (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,60);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 61;BA.debugLine="Trace(\"сценарий resume запрос reason=policy_pause";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.playbackfacade.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("сценарий resume запрос reason=policy_pause")));
 BA.debugLineNum = 62;BA.debugLine="Wait For (mainPage.Facade_ResumePlaybackAfterPoli";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackfacade", "resumeplaybackafterpolicypause"), __ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_facade_resumeplaybackafterpolicypausecore" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resumed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("resumed", _resumed);
;
 BA.debugLineNum = 63;BA.debugLine="Return resumed";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resumed));return;};
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _startfirsttrack(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("StartFirstTrack (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("startfirsttrack")) { return __ref.runUserSub(false, "playbackfacade","startfirsttrack", __ref, _mode);}
ResumableSub_StartFirstTrack rsub = new ResumableSub_StartFirstTrack(null,__ref,_mode);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartFirstTrack extends BA.ResumableSub {
public ResumableSub_StartFirstTrack(b4j.example.playbackfacade parent,RemoteObject __ref,RemoteObject _mode) {
this.parent = parent;
this.__ref = __ref;
this._mode = _mode;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackfacade parent;
RemoteObject _mode;
RemoteObject _started = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartFirstTrack (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,14);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 15;BA.debugLine="Trace(\"сценарий старт запрос mode=\" & mode)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.playbackfacade.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("сценарий старт запрос mode="),_mode)));
 BA.debugLineNum = 16;BA.debugLine="Wait For (mainPage.Facade_StartFirstTrackCore(mod";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackfacade", "startfirsttrack"), __ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_facade_startfirsttrackcore" /*RemoteObject*/ ,(Object)(_mode)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_started = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("started", _started);
;
 BA.debugLineNum = 17;BA.debugLine="Return started";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_started));return;};
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _stopplayback(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopPlayback (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("stopplayback")) { return __ref.runUserSub(false, "playbackfacade","stopplayback", __ref);}
ResumableSub_StopPlayback rsub = new ResumableSub_StopPlayback(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StopPlayback extends BA.ResumableSub {
public ResumableSub_StopPlayback(b4j.example.playbackfacade parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackfacade parent;
RemoteObject _stopped = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StopPlayback (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,49);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 50;BA.debugLine="Trace(\"сценарий stop запрос\")";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.playbackfacade.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("сценарий stop запрос")));
 BA.debugLineNum = 51;BA.debugLine="Wait For (mainPage.Facade_StopPlayerCore) Complet";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackfacade", "stopplayback"), __ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_facade_stopplayercore" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_stopped = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("stopped", _stopped);
;
 BA.debugLineNum = 52;BA.debugLine="Return stopped";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_stopped));return;};
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _trace(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("Trace (playbackfacade) ","playbackfacade",7,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "playbackfacade","trace", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 10;BA.debugLine="Private Sub Trace(message As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="mainPage.PlaybackFacade_Trace(message)";
Debug.ShouldStop(1024);
__ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_playbackfacade_trace" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}