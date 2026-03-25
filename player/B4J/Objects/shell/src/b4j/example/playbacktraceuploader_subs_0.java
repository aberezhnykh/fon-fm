package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbacktraceuploader_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private stateStore As PlayerStateStore";
playbacktraceuploader._statestore = RemoteObject.createNew ("b4j.example.playerstatestore");__ref.setField("_statestore",playbacktraceuploader._statestore);
 //BA.debugLineNum = 7;BA.debugLine="Private traceServiceRef As TraceService";
playbacktraceuploader._traceserviceref = RemoteObject.createNew ("b4j.example.traceservice");__ref.setField("_traceserviceref",playbacktraceuploader._traceserviceref);
 //BA.debugLineNum = 8;BA.debugLine="Private syncServiceRef As NetworkSyncService";
playbacktraceuploader._syncserviceref = RemoteObject.createNew ("b4j.example.networksyncservice");__ref.setField("_syncserviceref",playbacktraceuploader._syncserviceref);
 //BA.debugLineNum = 9;BA.debugLine="Private traceBaseUrl As String";
playbacktraceuploader._tracebaseurl = RemoteObject.createImmutable("");__ref.setField("_tracebaseurl",playbacktraceuploader._tracebaseurl);
 //BA.debugLineNum = 10;BA.debugLine="Private appVersionValue As String";
playbacktraceuploader._appversionvalue = RemoteObject.createImmutable("");__ref.setField("_appversionvalue",playbacktraceuploader._appversionvalue);
 //BA.debugLineNum = 11;BA.debugLine="Private uploadInProgress As Boolean";
playbacktraceuploader._uploadinprogress = RemoteObject.createImmutable(false);__ref.setField("_uploadinprogress",playbacktraceuploader._uploadinprogress);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _flushtracebuffer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FlushTraceBuffer (playbacktraceuploader) ","playbacktraceuploader",11,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("flushtracebuffer")) { return __ref.runUserSub(false, "playbacktraceuploader","flushtracebuffer", __ref);}
ResumableSub_FlushTraceBuffer rsub = new ResumableSub_FlushTraceBuffer(null,__ref);
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
public static class ResumableSub_FlushTraceBuffer extends BA.ResumableSub {
public ResumableSub_FlushTraceBuffer(b4j.example.playbacktraceuploader parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbacktraceuploader parent;
RemoteObject _tracelines = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _payload = RemoteObject.createImmutable("");
RemoteObject _queryparams = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _requesturl = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _responsetext = RemoteObject.createImmutable("");
RemoteObject _statuscode = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FlushTraceBuffer (playbacktraceuploader) ","playbacktraceuploader",11,__ref.getField(false, "ba"),__ref,34);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 35;BA.debugLine="If stateStore.PlayerCodeValue = \"\" Or stateStore.";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_playercodevalue" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_deviceidvalue" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 36;BA.debugLine="If uploadInProgress Then Return False";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 12;
if (__ref.getField(true,"_uploadinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 37;BA.debugLine="If IsTraceUploadEnabled = False Then Return False";
Debug.ShouldStop(16);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbacktraceuploader.class, "_istraceuploadenabled" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 38;BA.debugLine="Dim traceLines As List = traceServiceRef.BeginPen";
Debug.ShouldStop(32);
_tracelines = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracelines = __ref.getField(false,"_traceserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.traceservice.class, "_beginpendingtracebatch" /*RemoteObject*/ );Debug.locals.put("traceLines", _tracelines);Debug.locals.put("traceLines", _tracelines);
 BA.debugLineNum = 39;BA.debugLine="If traceLines.IsInitialized = False Or traceLines";
Debug.ShouldStop(64);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_tracelines.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_tracelines.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 40;BA.debugLine="Dim payload As String = JoinList(traceLines, CRLF";
Debug.ShouldStop(128);
_payload = __ref.runClassMethod (b4j.example.playbacktraceuploader.class, "_joinlist" /*RemoteObject*/ ,(Object)(_tracelines),(Object)(parent.__c.getField(true,"CRLF")));Debug.locals.put("payload", _payload);Debug.locals.put("payload", _payload);
 BA.debugLineNum = 41;BA.debugLine="If payload.Trim = \"\" Then";
Debug.ShouldStop(256);
if (true) break;

case 25:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_payload.runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 42;BA.debugLine="traceServiceRef.CancelPendingTraceBatch";
Debug.ShouldStop(512);
__ref.getField(false,"_traceserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.traceservice.class, "_cancelpendingtracebatch" /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 45;BA.debugLine="uploadInProgress = True";
Debug.ShouldStop(4096);
__ref.setField ("_uploadinprogress" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="Dim queryParams As Map";
Debug.ShouldStop(8192);
_queryparams = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("queryParams", _queryparams);
 BA.debugLineNum = 47;BA.debugLine="queryParams.Initialize";
Debug.ShouldStop(16384);
_queryparams.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="queryParams.Put(\"player\", stateStore.PlayerCodeVa";
Debug.ShouldStop(32768);
_queryparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)((__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_playercodevalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 49;BA.debugLine="queryParams.Put(\"device\", stateStore.DeviceIdValu";
Debug.ShouldStop(65536);
_queryparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device"))),(Object)((__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_deviceidvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 50;BA.debugLine="queryParams.Put(\"tz\", stateStore.TimezoneOffsetMi";
Debug.ShouldStop(131072);
_queryparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tz"))),(Object)((__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_timezoneoffsetminutesvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 51;BA.debugLine="queryParams.Put(\"version\", appVersionValue)";
Debug.ShouldStop(262144);
_queryparams.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((__ref.getField(true,"_appversionvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 52;BA.debugLine="Dim requestUrl As String = traceBaseUrl & \"?\" & s";
Debug.ShouldStop(524288);
_requesturl = RemoteObject.concat(__ref.getField(true,"_tracebaseurl" /*RemoteObject*/ ),RemoteObject.createImmutable("?"),__ref.getField(false,"_syncserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.networksyncservice.class, "_buildparams" /*RemoteObject*/ ,(Object)(_queryparams)));Debug.locals.put("requestUrl", _requesturl);Debug.locals.put("requestUrl", _requesturl);
 BA.debugLineNum = 53;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1048576);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 54;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(2097152);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 55;BA.debugLine="j.PostString(requestUrl, payload)";
Debug.ShouldStop(4194304);
_j.runClassMethod (b4j.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_requesturl),(Object)(_payload));
 BA.debugLineNum = 56;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_applyclientrequestheaders" /*RemoteObject*/ ,(Object)(_j));
 BA.debugLineNum = 57;BA.debugLine="j.GetRequest.Timeout = 5000";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 5000));
 BA.debugLineNum = 58;BA.debugLine="j.GetRequest.SetContentType(\"text/plain; charset=";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/plain; charset=utf-8")));
 BA.debugLineNum = 59;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbacktraceuploader", "flushtracebuffer"), (_j));
this.state = 57;
return;
case 57:
//C
this.state = 29;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 60;BA.debugLine="Dim success As Boolean = False";
Debug.ShouldStop(134217728);
_success = parent.__c.getField(true,"False");Debug.locals.put("success", _success);Debug.locals.put("success", _success);
 BA.debugLineNum = 61;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 29:
//if
this.state = 51;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 31;
}else {
this.state = 39;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 62;BA.debugLine="Dim responseText As String = \"\"";
Debug.ShouldStop(536870912);
_responsetext = BA.ObjectToString("");Debug.locals.put("responseText", _responsetext);Debug.locals.put("responseText", _responsetext);
 BA.debugLineNum = 63;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
if (true) break;

case 32:
//try
this.state = 37;
this.catchState = 36;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 37;
this.catchState = 36;
 BA.debugLineNum = 64;BA.debugLine="responseText = j.GetString";
Debug.ShouldStop(-2147483648);
_responsetext = _j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("responseText", _responsetext);
 Debug.CheckDeviceExceptions();
if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
 BA.debugLineNum = 66;BA.debugLine="responseText = \"\"";
Debug.ShouldStop(2);
_responsetext = BA.ObjectToString("");Debug.locals.put("responseText", _responsetext);
 if (true) break;
if (true) break;

case 37:
//C
this.state = 51;
this.catchState = 0;
;
 BA.debugLineNum = 68;BA.debugLine="stateStore.SaveServerSnapshot(\"POST\", requestUrl";
Debug.ShouldStop(8);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_saveserversnapshot" /*RemoteObject*/ ,(Object)(BA.ObjectToString("POST")),(Object)(_requesturl),(Object)(parent.__c.getField(true,"True")),(Object)(_responsetext),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 69;BA.debugLine="success = True";
Debug.ShouldStop(16);
_success = parent.__c.getField(true,"True");Debug.locals.put("success", _success);
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 71;BA.debugLine="Dim statusCode As Int = 0";
Debug.ShouldStop(64);
_statuscode = BA.numberCast(int.class, 0);Debug.locals.put("statusCode", _statuscode);Debug.locals.put("statusCode", _statuscode);
 BA.debugLineNum = 72;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 40:
//try
this.state = 45;
this.catchState = 44;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 45;
this.catchState = 44;
 BA.debugLineNum = 73;BA.debugLine="statusCode = j.Response.StatusCode";
Debug.ShouldStop(256);
_statuscode = _j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode");Debug.locals.put("statusCode", _statuscode);
 Debug.CheckDeviceExceptions();
if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 BA.debugLineNum = 75;BA.debugLine="statusCode = 0";
Debug.ShouldStop(1024);
_statuscode = BA.numberCast(int.class, 0);Debug.locals.put("statusCode", _statuscode);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 77;BA.debugLine="If statusCode = 204 Then";
Debug.ShouldStop(4096);

case 45:
//if
this.state = 50;
this.catchState = 0;
if (RemoteObject.solveBoolean("=",_statuscode,BA.numberCast(double.class, 204))) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
 BA.debugLineNum = 78;BA.debugLine="stateStore.SaveServerSnapshot(\"POST\", requestUr";
Debug.ShouldStop(8192);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_saveserversnapshot" /*RemoteObject*/ ,(Object)(BA.ObjectToString("POST")),(Object)(_requesturl),(Object)(parent.__c.getField(true,"True")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 79;BA.debugLine="success = True";
Debug.ShouldStop(16384);
_success = parent.__c.getField(true,"True");Debug.locals.put("success", _success);
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 81;BA.debugLine="stateStore.SaveServerSnapshot(\"POST\", requestUr";
Debug.ShouldStop(65536);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_saveserversnapshot" /*RemoteObject*/ ,(Object)(BA.ObjectToString("POST")),(Object)(_requesturl),(Object)(parent.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 82;BA.debugLine="stateStore.TraceWarn(\"network\", \"ошибка trace u";
Debug.ShouldStop(131072);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("ошибка trace upload")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("reason="),__ref.getField(false,"_syncserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.networksyncservice.class, "_classifyhttpfailure" /*RemoteObject*/ ,(Object)(_j.getField(true,"_errormessage" /*RemoteObject*/ ))))));
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;
;
 BA.debugLineNum = 85;BA.debugLine="If success Then";
Debug.ShouldStop(1048576);

case 51:
//if
this.state = 56;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 53;
}else {
this.state = 55;
}if (true) break;

case 53:
//C
this.state = 56;
 BA.debugLineNum = 86;BA.debugLine="traceServiceRef.ConfirmPendingTraceBatchSent";
Debug.ShouldStop(2097152);
__ref.getField(false,"_traceserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.traceservice.class, "_confirmpendingtracebatchsent" /*RemoteObject*/ );
 if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 88;BA.debugLine="traceServiceRef.CancelPendingTraceBatch";
Debug.ShouldStop(8388608);
__ref.getField(false,"_traceserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.traceservice.class, "_cancelpendingtracebatch" /*RemoteObject*/ );
 if (true) break;

case 56:
//C
this.state = -1;
;
 BA.debugLineNum = 90;BA.debugLine="j.Release";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 91;BA.debugLine="uploadInProgress = False";
Debug.ShouldStop(67108864);
__ref.setField ("_uploadinprogress" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 92;BA.debugLine="Return success";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static void  _flushtracebufferasync(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FlushTraceBufferAsync (playbacktraceuploader) ","playbacktraceuploader",11,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("flushtracebufferasync")) { __ref.runUserSub(false, "playbacktraceuploader","flushtracebufferasync", __ref); return;}
ResumableSub_FlushTraceBufferAsync rsub = new ResumableSub_FlushTraceBufferAsync(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FlushTraceBufferAsync extends BA.ResumableSub {
public ResumableSub_FlushTraceBufferAsync(b4j.example.playbacktraceuploader parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbacktraceuploader parent;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FlushTraceBufferAsync (playbacktraceuploader) ","playbacktraceuploader",11,__ref.getField(false, "ba"),__ref,30);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 31;BA.debugLine="Wait For (FlushTraceBuffer) Complete (unused As B";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbacktraceuploader", "flushtracebufferasync"), __ref.runClassMethod (b4j.example.playbacktraceuploader.class, "_flushtracebuffer" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _unused) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _store,RemoteObject _tracesvc,RemoteObject _syncworker,RemoteObject _baseurl,RemoteObject _appversion) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbacktraceuploader) ","playbacktraceuploader",11,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbacktraceuploader","initialize", __ref, _ba, _store, _tracesvc, _syncworker, _baseurl, _appversion);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("store", _store);
Debug.locals.put("traceSvc", _tracesvc);
Debug.locals.put("syncWorker", _syncworker);
Debug.locals.put("baseUrl", _baseurl);
Debug.locals.put("appVersion", _appversion);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(store As PlayerStateStore, t";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="stateStore = store";
Debug.ShouldStop(16384);
__ref.setField ("_statestore" /*RemoteObject*/ ,_store);
 BA.debugLineNum = 16;BA.debugLine="traceServiceRef = traceSvc";
Debug.ShouldStop(32768);
__ref.setField ("_traceserviceref" /*RemoteObject*/ ,_tracesvc);
 BA.debugLineNum = 17;BA.debugLine="syncServiceRef = syncWorker";
Debug.ShouldStop(65536);
__ref.setField ("_syncserviceref" /*RemoteObject*/ ,_syncworker);
 BA.debugLineNum = 18;BA.debugLine="traceBaseUrl = baseUrl";
Debug.ShouldStop(131072);
__ref.setField ("_tracebaseurl" /*RemoteObject*/ ,_baseurl);
 BA.debugLineNum = 19;BA.debugLine="appVersionValue = appVersion";
Debug.ShouldStop(262144);
__ref.setField ("_appversionvalue" /*RemoteObject*/ ,_appversion);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istraceuploadenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsTraceUploadEnabled (playbacktraceuploader) ","playbacktraceuploader",11,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("istraceuploadenabled")) { return __ref.runUserSub(false, "playbacktraceuploader","istraceuploadenabled", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Public Sub IsTraceUploadEnabled As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Return stateStore.IsTraceUploadEnabled";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_istraceuploadenabled" /*RemoteObject*/ );
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isuploadinprogress(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsUploadInProgress (playbacktraceuploader) ","playbacktraceuploader",11,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("isuploadinprogress")) { return __ref.runUserSub(false, "playbacktraceuploader","isuploadinprogress", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Public Sub IsUploadInProgress As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Return uploadInProgress";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(true,"_uploadinprogress" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinlist(RemoteObject __ref,RemoteObject _items,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("JoinList (playbacktraceuploader) ","playbacktraceuploader",11,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("joinlist")) { return __ref.runUserSub(false, "playbacktraceuploader","joinlist", __ref, _items, _separator);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("items", _items);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 95;BA.debugLine="Private Sub JoinList(items As List, separator As S";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(-2147483648);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 97;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 98;BA.debugLine="For i = 0 To items.Size - 1";
Debug.ShouldStop(2);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 99;BA.debugLine="If i > 0 Then sb.Append(separator)";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(_separator));};
 BA.debugLineNum = 100;BA.debugLine="sb.Append(items.Get(i))";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 102;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(32);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}