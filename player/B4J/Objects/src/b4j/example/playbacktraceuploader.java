package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbacktraceuploader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbacktraceuploader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbacktraceuploader.class).invoke(this, new Object[] {null});
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
public b4j.example.playerstatestore _statestore = null;
public b4j.example.traceservice _traceserviceref = null;
public b4j.example.networksyncservice _syncserviceref = null;
public String _tracebaseurl = "";
public String _appversionvalue = "";
public boolean _uploadinprogress = false;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public void  _flushtracebufferasync(b4j.example.playbacktraceuploader __ref) throws Exception{
RDebugUtils.currentModule="playbacktraceuploader";
if (Debug.shouldDelegate(ba, "flushtracebufferasync", false))
	 {Debug.delegate(ba, "flushtracebufferasync", null); return;}
ResumableSub_FlushTraceBufferAsync rsub = new ResumableSub_FlushTraceBufferAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_FlushTraceBufferAsync extends BA.ResumableSub {
public ResumableSub_FlushTraceBufferAsync(b4j.example.playbacktraceuploader parent,b4j.example.playbacktraceuploader __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.playbacktraceuploader __ref;
b4j.example.playbacktraceuploader parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbacktraceuploader";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=55508993;
 //BA.debugLineNum = 55508993;BA.debugLine="Wait For (FlushTraceBuffer) Complete (unused As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbacktraceuploader", "flushtracebufferasync"), __ref._flushtracebuffer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=55508994;
 //BA.debugLineNum = 55508994;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.playbacktraceuploader __ref,anywheresoftware.b4a.BA _ba,b4j.example.playerstatestore _store,b4j.example.traceservice _tracesvc,b4j.example.networksyncservice _syncworker,String _baseurl,String _appversion) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktraceuploader";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_store,_tracesvc,_syncworker,_baseurl,_appversion}));}
RDebugUtils.currentLine=55312384;
 //BA.debugLineNum = 55312384;BA.debugLine="Public Sub Initialize(store As PlayerStateStore, t";
RDebugUtils.currentLine=55312385;
 //BA.debugLineNum = 55312385;BA.debugLine="stateStore = store";
__ref._statestore /*b4j.example.playerstatestore*/  = _store;
RDebugUtils.currentLine=55312386;
 //BA.debugLineNum = 55312386;BA.debugLine="traceServiceRef = traceSvc";
__ref._traceserviceref /*b4j.example.traceservice*/  = _tracesvc;
RDebugUtils.currentLine=55312387;
 //BA.debugLineNum = 55312387;BA.debugLine="syncServiceRef = syncWorker";
__ref._syncserviceref /*b4j.example.networksyncservice*/  = _syncworker;
RDebugUtils.currentLine=55312388;
 //BA.debugLineNum = 55312388;BA.debugLine="traceBaseUrl = baseUrl";
__ref._tracebaseurl /*String*/  = _baseurl;
RDebugUtils.currentLine=55312389;
 //BA.debugLineNum = 55312389;BA.debugLine="appVersionValue = appVersion";
__ref._appversionvalue /*String*/  = _appversion;
RDebugUtils.currentLine=55312390;
 //BA.debugLineNum = 55312390;BA.debugLine="End Sub";
return "";
}
public boolean  _isuploadinprogress(b4j.example.playbacktraceuploader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceuploader";
if (Debug.shouldDelegate(ba, "isuploadinprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "isuploadinprogress", null));}
RDebugUtils.currentLine=55443456;
 //BA.debugLineNum = 55443456;BA.debugLine="Public Sub IsUploadInProgress As Boolean";
RDebugUtils.currentLine=55443457;
 //BA.debugLineNum = 55443457;BA.debugLine="Return uploadInProgress";
if (true) return __ref._uploadinprogress /*boolean*/ ;
RDebugUtils.currentLine=55443458;
 //BA.debugLineNum = 55443458;BA.debugLine="End Sub";
return false;
}
public boolean  _istraceuploadenabled(b4j.example.playbacktraceuploader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceuploader";
if (Debug.shouldDelegate(ba, "istraceuploadenabled", false))
	 {return ((Boolean) Debug.delegate(ba, "istraceuploadenabled", null));}
RDebugUtils.currentLine=55377920;
 //BA.debugLineNum = 55377920;BA.debugLine="Public Sub IsTraceUploadEnabled As Boolean";
RDebugUtils.currentLine=55377921;
 //BA.debugLineNum = 55377921;BA.debugLine="Return stateStore.IsTraceUploadEnabled";
if (true) return __ref._statestore /*b4j.example.playerstatestore*/ ._istraceuploadenabled /*boolean*/ (null);
RDebugUtils.currentLine=55377922;
 //BA.debugLineNum = 55377922;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.playbacktraceuploader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceuploader";
RDebugUtils.currentLine=55246848;
 //BA.debugLineNum = 55246848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=55246849;
 //BA.debugLineNum = 55246849;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4j.example.playerstatestore();
RDebugUtils.currentLine=55246850;
 //BA.debugLineNum = 55246850;BA.debugLine="Private traceServiceRef As TraceService";
_traceserviceref = new b4j.example.traceservice();
RDebugUtils.currentLine=55246851;
 //BA.debugLineNum = 55246851;BA.debugLine="Private syncServiceRef As NetworkSyncService";
_syncserviceref = new b4j.example.networksyncservice();
RDebugUtils.currentLine=55246852;
 //BA.debugLineNum = 55246852;BA.debugLine="Private traceBaseUrl As String";
_tracebaseurl = "";
RDebugUtils.currentLine=55246853;
 //BA.debugLineNum = 55246853;BA.debugLine="Private appVersionValue As String";
_appversionvalue = "";
RDebugUtils.currentLine=55246854;
 //BA.debugLineNum = 55246854;BA.debugLine="Private uploadInProgress As Boolean";
_uploadinprogress = false;
RDebugUtils.currentLine=55246855;
 //BA.debugLineNum = 55246855;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _flushtracebuffer(b4j.example.playbacktraceuploader __ref) throws Exception{
RDebugUtils.currentModule="playbacktraceuploader";
if (Debug.shouldDelegate(ba, "flushtracebuffer", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "flushtracebuffer", null));}
ResumableSub_FlushTraceBuffer rsub = new ResumableSub_FlushTraceBuffer(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FlushTraceBuffer extends BA.ResumableSub {
public ResumableSub_FlushTraceBuffer(b4j.example.playbacktraceuploader parent,b4j.example.playbacktraceuploader __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.playbacktraceuploader __ref;
b4j.example.playbacktraceuploader parent;
anywheresoftware.b4a.objects.collections.List _tracelines = null;
String _payload = "";
anywheresoftware.b4a.objects.collections.Map _queryparams = null;
String _requesturl = "";
b4j.example.httpjob _j = null;
boolean _success = false;
String _responsetext = "";
int _statuscode = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="playbacktraceuploader";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55574529;
 //BA.debugLineNum = 55574529;BA.debugLine="If stateStore.PlayerCodeValue = \"\" Or stateStore.";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null)).equals("") || (__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null)).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=55574530;
 //BA.debugLineNum = 55574530;BA.debugLine="If uploadInProgress Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._uploadinprogress /*boolean*/ ) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=55574531;
 //BA.debugLineNum = 55574531;BA.debugLine="If IsTraceUploadEnabled = False Then Return False";
if (true) break;

case 13:
//if
this.state = 18;
if (__ref._istraceuploadenabled /*boolean*/ (null)==parent.__c.False) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=55574532;
 //BA.debugLineNum = 55574532;BA.debugLine="Dim traceLines As List = traceServiceRef.BeginPen";
_tracelines = new anywheresoftware.b4a.objects.collections.List();
_tracelines = __ref._traceserviceref /*b4j.example.traceservice*/ ._beginpendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=55574533;
 //BA.debugLineNum = 55574533;BA.debugLine="If traceLines.IsInitialized = False Or traceLines";
if (true) break;

case 19:
//if
this.state = 24;
if (_tracelines.IsInitialized()==parent.__c.False || _tracelines.getSize()==0) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=55574534;
 //BA.debugLineNum = 55574534;BA.debugLine="Dim payload As String = JoinList(traceLines, CRLF";
_payload = __ref._joinlist /*String*/ (null,_tracelines,parent.__c.CRLF);
RDebugUtils.currentLine=55574535;
 //BA.debugLineNum = 55574535;BA.debugLine="If payload.Trim = \"\" Then";
if (true) break;

case 25:
//if
this.state = 28;
if ((_payload.trim()).equals("")) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=55574536;
 //BA.debugLineNum = 55574536;BA.debugLine="traceServiceRef.CancelPendingTraceBatch";
__ref._traceserviceref /*b4j.example.traceservice*/ ._cancelpendingtracebatch /*String*/ (null);
RDebugUtils.currentLine=55574537;
 //BA.debugLineNum = 55574537;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=55574539;
 //BA.debugLineNum = 55574539;BA.debugLine="uploadInProgress = True";
__ref._uploadinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=55574540;
 //BA.debugLineNum = 55574540;BA.debugLine="Dim queryParams As Map";
_queryparams = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=55574541;
 //BA.debugLineNum = 55574541;BA.debugLine="queryParams.Initialize";
_queryparams.Initialize();
RDebugUtils.currentLine=55574542;
 //BA.debugLineNum = 55574542;BA.debugLine="queryParams.Put(\"player\", stateStore.PlayerCodeVa";
_queryparams.Put((Object)("player"),(Object)(__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null)));
RDebugUtils.currentLine=55574543;
 //BA.debugLineNum = 55574543;BA.debugLine="queryParams.Put(\"device\", stateStore.DeviceIdValu";
_queryparams.Put((Object)("device"),(Object)(__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null)));
RDebugUtils.currentLine=55574544;
 //BA.debugLineNum = 55574544;BA.debugLine="queryParams.Put(\"tz\", stateStore.TimezoneOffsetMi";
_queryparams.Put((Object)("tz"),(Object)(__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null)));
RDebugUtils.currentLine=55574545;
 //BA.debugLineNum = 55574545;BA.debugLine="queryParams.Put(\"version\", appVersionValue)";
_queryparams.Put((Object)("version"),(Object)(__ref._appversionvalue /*String*/ ));
RDebugUtils.currentLine=55574546;
 //BA.debugLineNum = 55574546;BA.debugLine="Dim requestUrl As String = traceBaseUrl & \"?\" & s";
_requesturl = __ref._tracebaseurl /*String*/ +"?"+__ref._syncserviceref /*b4j.example.networksyncservice*/ ._buildparams /*String*/ (null,_queryparams);
RDebugUtils.currentLine=55574547;
 //BA.debugLineNum = 55574547;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=55574548;
 //BA.debugLineNum = 55574548;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=55574549;
 //BA.debugLineNum = 55574549;BA.debugLine="j.PostString(requestUrl, payload)";
_j._poststring /*String*/ (null,_requesturl,_payload);
RDebugUtils.currentLine=55574550;
 //BA.debugLineNum = 55574550;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=55574551;
 //BA.debugLineNum = 55574551;BA.debugLine="j.GetRequest.Timeout = 5000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (5000));
RDebugUtils.currentLine=55574552;
 //BA.debugLineNum = 55574552;BA.debugLine="j.GetRequest.SetContentType(\"text/plain; charset=";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/plain; charset=utf-8");
RDebugUtils.currentLine=55574553;
 //BA.debugLineNum = 55574553;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "playbacktraceuploader", "flushtracebuffer"), (Object)(_j));
this.state = 57;
return;
case 57:
//C
this.state = 29;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=55574554;
 //BA.debugLineNum = 55574554;BA.debugLine="Dim success As Boolean = False";
_success = parent.__c.False;
RDebugUtils.currentLine=55574555;
 //BA.debugLineNum = 55574555;BA.debugLine="If j.Success Then";
if (true) break;

case 29:
//if
this.state = 51;
if (_j._success /*boolean*/ ) { 
this.state = 31;
}else {
this.state = 39;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=55574556;
 //BA.debugLineNum = 55574556;BA.debugLine="Dim responseText As String = \"\"";
_responsetext = "";
RDebugUtils.currentLine=55574557;
 //BA.debugLineNum = 55574557;BA.debugLine="Try";
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
RDebugUtils.currentLine=55574558;
 //BA.debugLineNum = 55574558;BA.debugLine="responseText = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
 if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
RDebugUtils.currentLine=55574560;
 //BA.debugLineNum = 55574560;BA.debugLine="responseText = \"\"";
_responsetext = "";
 if (true) break;
if (true) break;

case 37:
//C
this.state = 51;
this.catchState = 0;
;
RDebugUtils.currentLine=55574562;
 //BA.debugLineNum = 55574562;BA.debugLine="stateStore.SaveServerSnapshot(\"POST\", requestUrl";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=55574563;
 //BA.debugLineNum = 55574563;BA.debugLine="success = True";
_success = parent.__c.True;
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=55574565;
 //BA.debugLineNum = 55574565;BA.debugLine="Dim statusCode As Int = 0";
_statuscode = (int) (0);
RDebugUtils.currentLine=55574566;
 //BA.debugLineNum = 55574566;BA.debugLine="Try";
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
RDebugUtils.currentLine=55574567;
 //BA.debugLineNum = 55574567;BA.debugLine="statusCode = j.Response.StatusCode";
_statuscode = _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
RDebugUtils.currentLine=55574569;
 //BA.debugLineNum = 55574569;BA.debugLine="statusCode = 0";
_statuscode = (int) (0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=55574571;
 //BA.debugLineNum = 55574571;BA.debugLine="If statusCode = 204 Then";

case 45:
//if
this.state = 50;
this.catchState = 0;
if (_statuscode==204) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
RDebugUtils.currentLine=55574572;
 //BA.debugLineNum = 55574572;BA.debugLine="stateStore.SaveServerSnapshot(\"POST\", requestUr";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.True,"","");
RDebugUtils.currentLine=55574573;
 //BA.debugLineNum = 55574573;BA.debugLine="success = True";
_success = parent.__c.True;
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=55574575;
 //BA.debugLineNum = 55574575;BA.debugLine="stateStore.SaveServerSnapshot(\"POST\", requestUr";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.False,"",_j._errormessage /*String*/ );
RDebugUtils.currentLine=55574576;
 //BA.debugLineNum = 55574576;BA.debugLine="stateStore.TraceWarn(\"network\", \"ошибка trace u";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","ошибка trace upload","reason="+__ref._syncserviceref /*b4j.example.networksyncservice*/ ._classifyhttpfailure /*String*/ (null,_j._errormessage /*String*/ ));
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;
;
RDebugUtils.currentLine=55574579;
 //BA.debugLineNum = 55574579;BA.debugLine="If success Then";

case 51:
//if
this.state = 56;
if (_success) { 
this.state = 53;
}else {
this.state = 55;
}if (true) break;

case 53:
//C
this.state = 56;
RDebugUtils.currentLine=55574580;
 //BA.debugLineNum = 55574580;BA.debugLine="traceServiceRef.ConfirmPendingTraceBatchSent";
__ref._traceserviceref /*b4j.example.traceservice*/ ._confirmpendingtracebatchsent /*String*/ (null);
 if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=55574582;
 //BA.debugLineNum = 55574582;BA.debugLine="traceServiceRef.CancelPendingTraceBatch";
__ref._traceserviceref /*b4j.example.traceservice*/ ._cancelpendingtracebatch /*String*/ (null);
 if (true) break;

case 56:
//C
this.state = -1;
;
RDebugUtils.currentLine=55574584;
 //BA.debugLineNum = 55574584;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=55574585;
 //BA.debugLineNum = 55574585;BA.debugLine="uploadInProgress = False";
__ref._uploadinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=55574586;
 //BA.debugLineNum = 55574586;BA.debugLine="Return success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=55574587;
 //BA.debugLineNum = 55574587;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _joinlist(b4j.example.playbacktraceuploader __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceuploader";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=55640064;
 //BA.debugLineNum = 55640064;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=55640065;
 //BA.debugLineNum = 55640065;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=55640066;
 //BA.debugLineNum = 55640066;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=55640067;
 //BA.debugLineNum = 55640067;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=55640068;
 //BA.debugLineNum = 55640068;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=55640069;
 //BA.debugLineNum = 55640069;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=55640071;
 //BA.debugLineNum = 55640071;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=55640072;
 //BA.debugLineNum = 55640072;BA.debugLine="End Sub";
return "";
}
}