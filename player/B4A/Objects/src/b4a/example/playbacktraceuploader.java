package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbacktraceuploader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbacktraceuploader");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbacktraceuploader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.playerstatestore _statestore = null;
public b4a.example.traceservice _traceserviceref = null;
public b4a.example.networksyncservice _syncserviceref = null;
public String _tracebaseurl = "";
public String _appversionvalue = "";
public boolean _uploadinprogress = false;
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
 //BA.debugLineNum = 6;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4a.example.playerstatestore();
 //BA.debugLineNum = 7;BA.debugLine="Private traceServiceRef As TraceService";
_traceserviceref = new b4a.example.traceservice();
 //BA.debugLineNum = 8;BA.debugLine="Private syncServiceRef As NetworkSyncService";
_syncserviceref = new b4a.example.networksyncservice();
 //BA.debugLineNum = 9;BA.debugLine="Private traceBaseUrl As String";
_tracebaseurl = "";
 //BA.debugLineNum = 10;BA.debugLine="Private appVersionValue As String";
_appversionvalue = "";
 //BA.debugLineNum = 11;BA.debugLine="Private uploadInProgress As Boolean";
_uploadinprogress = false;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _flushtracebuffer() throws Exception{
ResumableSub_FlushTraceBuffer rsub = new ResumableSub_FlushTraceBuffer(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FlushTraceBuffer extends BA.ResumableSub {
public ResumableSub_FlushTraceBuffer(b4a.example.playbacktraceuploader parent) {
this.parent = parent;
}
b4a.example.playbacktraceuploader parent;
anywheresoftware.b4a.objects.collections.List _tracelines = null;
String _payload = "";
anywheresoftware.b4a.objects.collections.Map _queryparams = null;
String _requesturl = "";
b4a.example.httpjob _j = null;
boolean _success = false;
String _responsetext = "";
int _statuscode = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 35;BA.debugLine="If stateStore.PlayerCodeValue = \"\" Or stateStore.";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._statestore._playercodevalue /*String*/ ()).equals("") || (parent._statestore._deviceidvalue /*String*/ ()).equals("")) { 
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
 //BA.debugLineNum = 36;BA.debugLine="If uploadInProgress Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._uploadinprogress) { 
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
 //BA.debugLineNum = 37;BA.debugLine="If IsTraceUploadEnabled = False Then Return False";
if (true) break;

case 13:
//if
this.state = 18;
if (parent._istraceuploadenabled()==parent.__c.False) { 
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
 //BA.debugLineNum = 38;BA.debugLine="Dim traceLines As List = traceServiceRef.BeginPen";
_tracelines = new anywheresoftware.b4a.objects.collections.List();
_tracelines = parent._traceserviceref._beginpendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 39;BA.debugLine="If traceLines.IsInitialized = False Or traceLines";
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
 //BA.debugLineNum = 40;BA.debugLine="Dim payload As String = JoinList(traceLines, CRLF";
_payload = parent._joinlist(_tracelines,parent.__c.CRLF);
 //BA.debugLineNum = 41;BA.debugLine="If payload.Trim = \"\" Then";
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
 //BA.debugLineNum = 42;BA.debugLine="traceServiceRef.CancelPendingTraceBatch";
parent._traceserviceref._cancelpendingtracebatch /*String*/ ();
 //BA.debugLineNum = 43;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 45;BA.debugLine="uploadInProgress = True";
parent._uploadinprogress = parent.__c.True;
 //BA.debugLineNum = 46;BA.debugLine="Dim queryParams As Map";
_queryparams = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 47;BA.debugLine="queryParams.Initialize";
_queryparams.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="queryParams.Put(\"player\", stateStore.PlayerCodeVa";
_queryparams.Put((Object)("player"),(Object)(parent._statestore._playercodevalue /*String*/ ()));
 //BA.debugLineNum = 49;BA.debugLine="queryParams.Put(\"device\", stateStore.DeviceIdValu";
_queryparams.Put((Object)("device"),(Object)(parent._statestore._deviceidvalue /*String*/ ()));
 //BA.debugLineNum = 50;BA.debugLine="queryParams.Put(\"tz\", stateStore.TimezoneOffsetMi";
_queryparams.Put((Object)("tz"),(Object)(parent._statestore._timezoneoffsetminutesvalue /*int*/ ()));
 //BA.debugLineNum = 51;BA.debugLine="queryParams.Put(\"version\", appVersionValue)";
_queryparams.Put((Object)("version"),(Object)(parent._appversionvalue));
 //BA.debugLineNum = 52;BA.debugLine="Dim requestUrl As String = traceBaseUrl & \"?\" & s";
_requesturl = parent._tracebaseurl+"?"+parent._syncserviceref._buildparams /*String*/ (_queryparams);
 //BA.debugLineNum = 53;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
 //BA.debugLineNum = 54;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 55;BA.debugLine="j.PostString(requestUrl, payload)";
_j._poststring /*String*/ (_requesturl,_payload);
 //BA.debugLineNum = 56;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
parent._statestore._applyclientrequestheaders /*String*/ (_j);
 //BA.debugLineNum = 57;BA.debugLine="j.GetRequest.Timeout = 5000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout((int) (5000));
 //BA.debugLineNum = 58;BA.debugLine="j.GetRequest.SetContentType(\"text/plain; charset=";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/plain; charset=utf-8");
 //BA.debugLineNum = 59;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 57;
return;
case 57:
//C
this.state = 29;
_j = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 60;BA.debugLine="Dim success As Boolean = False";
_success = parent.__c.False;
 //BA.debugLineNum = 61;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 62;BA.debugLine="Dim responseText As String = \"\"";
_responsetext = "";
 //BA.debugLineNum = 63;BA.debugLine="Try";
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
 //BA.debugLineNum = 64;BA.debugLine="responseText = j.GetString";
_responsetext = _j._getstring /*String*/ ();
 if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
 //BA.debugLineNum = 66;BA.debugLine="responseText = \"\"";
_responsetext = "";
 if (true) break;
if (true) break;

case 37:
//C
this.state = 51;
this.catchState = 0;
;
 //BA.debugLineNum = 68;BA.debugLine="stateStore.SaveServerSnapshot(\"POST\", requestUrl";
parent._statestore._saveserversnapshot /*String*/ ("POST",_requesturl,parent.__c.True,_responsetext,"");
 //BA.debugLineNum = 69;BA.debugLine="success = True";
_success = parent.__c.True;
 if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 71;BA.debugLine="Dim statusCode As Int = 0";
_statuscode = (int) (0);
 //BA.debugLineNum = 72;BA.debugLine="Try";
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
 //BA.debugLineNum = 73;BA.debugLine="statusCode = j.Response.StatusCode";
_statuscode = _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 //BA.debugLineNum = 75;BA.debugLine="statusCode = 0";
_statuscode = (int) (0);
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 77;BA.debugLine="If statusCode = 204 Then";

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
 //BA.debugLineNum = 78;BA.debugLine="stateStore.SaveServerSnapshot(\"POST\", requestUr";
parent._statestore._saveserversnapshot /*String*/ ("POST",_requesturl,parent.__c.True,"","");
 //BA.debugLineNum = 79;BA.debugLine="success = True";
_success = parent.__c.True;
 if (true) break;

case 49:
//C
this.state = 50;
 //BA.debugLineNum = 81;BA.debugLine="stateStore.SaveServerSnapshot(\"POST\", requestUr";
parent._statestore._saveserversnapshot /*String*/ ("POST",_requesturl,parent.__c.False,"",_j._errormessage /*String*/ );
 //BA.debugLineNum = 82;BA.debugLine="stateStore.TraceWarn(\"network\", \"ошибка trace u";
parent._statestore._tracewarn /*String*/ ("network","ошибка trace upload","reason="+parent._syncserviceref._classifyhttpfailure /*String*/ (_j._errormessage /*String*/ ));
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;
;
 //BA.debugLineNum = 85;BA.debugLine="If success Then";

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
 //BA.debugLineNum = 86;BA.debugLine="traceServiceRef.ConfirmPendingTraceBatchSent";
parent._traceserviceref._confirmpendingtracebatchsent /*String*/ ();
 if (true) break;

case 55:
//C
this.state = 56;
 //BA.debugLineNum = 88;BA.debugLine="traceServiceRef.CancelPendingTraceBatch";
parent._traceserviceref._cancelpendingtracebatch /*String*/ ();
 if (true) break;

case 56:
//C
this.state = -1;
;
 //BA.debugLineNum = 90;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 91;BA.debugLine="uploadInProgress = False";
parent._uploadinprogress = parent.__c.False;
 //BA.debugLineNum = 92;BA.debugLine="Return success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
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
public void  _jobdone(b4a.example.httpjob _j) throws Exception{
}
public void  _flushtracebufferasync() throws Exception{
ResumableSub_FlushTraceBufferAsync rsub = new ResumableSub_FlushTraceBufferAsync(this);
rsub.resume(ba, null);
}
public static class ResumableSub_FlushTraceBufferAsync extends BA.ResumableSub {
public ResumableSub_FlushTraceBufferAsync(b4a.example.playbacktraceuploader parent) {
this.parent = parent;
}
b4a.example.playbacktraceuploader parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 31;BA.debugLine="Wait For (FlushTraceBuffer) Complete (unused As B";
parent.__c.WaitFor("complete", ba, this, parent._flushtracebuffer());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _unused) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.example.playerstatestore _store,b4a.example.traceservice _tracesvc,b4a.example.networksyncservice _syncworker,String _baseurl,String _appversion) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(store As PlayerStateStore, t";
 //BA.debugLineNum = 15;BA.debugLine="stateStore = store";
_statestore = _store;
 //BA.debugLineNum = 16;BA.debugLine="traceServiceRef = traceSvc";
_traceserviceref = _tracesvc;
 //BA.debugLineNum = 17;BA.debugLine="syncServiceRef = syncWorker";
_syncserviceref = _syncworker;
 //BA.debugLineNum = 18;BA.debugLine="traceBaseUrl = baseUrl";
_tracebaseurl = _baseurl;
 //BA.debugLineNum = 19;BA.debugLine="appVersionValue = appVersion";
_appversionvalue = _appversion;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public boolean  _istraceuploadenabled() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub IsTraceUploadEnabled As Boolean";
 //BA.debugLineNum = 23;BA.debugLine="Return stateStore.IsTraceUploadEnabled";
if (true) return _statestore._istraceuploadenabled /*boolean*/ ();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return false;
}
public boolean  _isuploadinprogress() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub IsUploadInProgress As Boolean";
 //BA.debugLineNum = 27;BA.debugLine="Return uploadInProgress";
if (true) return _uploadinprogress;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return false;
}
public String  _joinlist(anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 95;BA.debugLine="Private Sub JoinList(items As List, separator As S";
 //BA.debugLineNum = 96;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 97;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 98;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 99;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
 //BA.debugLineNum = 100;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
 //BA.debugLineNum = 102;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
