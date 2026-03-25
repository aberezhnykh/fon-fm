package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class networksyncservice_subs_0 {


public static RemoteObject  _buildparams(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("BuildParams (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("buildparams")) { return __ref.runUserSub(false, "networksyncservice","buildparams", __ref, _params);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("params", _params);
 BA.debugLineNum = 146;BA.debugLine="Public Sub BuildParams(params As Map) As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(262144);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 148;BA.debugLine="sb.Initialize";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 149;BA.debugLine="For Each key As String In params.Keys";
Debug.ShouldStop(1048576);
{
final RemoteObject group3 = _params.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 150;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&")));};
 BA.debugLineNum = 151;BA.debugLine="sb.Append(UrlEncode(key)).Append(\"=\").Append(Url";
Debug.ShouldStop(4194304);
_sb.runMethod(false,"Append",(Object)(__ref.runClassMethod (b4j.example.networksyncservice.class, "_urlencode" /*RemoteObject*/ ,(Object)((_key))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("="))).runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.networksyncservice.class, "_urlencode" /*RemoteObject*/ ,(Object)(_params.runMethod(false,"Get",(Object)((_key)))))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 153;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(16777216);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkserviceavailability(RemoteObject __ref,RemoteObject _timeoutms) throws Exception{
try {
		Debug.PushSubsStack("CheckServiceAvailability (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("checkserviceavailability")) { return __ref.runUserSub(false, "networksyncservice","checkserviceavailability", __ref, _timeoutms);}
ResumableSub_CheckServiceAvailability rsub = new ResumableSub_CheckServiceAvailability(null,__ref,_timeoutms);
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
public static class ResumableSub_CheckServiceAvailability extends BA.ResumableSub {
public ResumableSub_CheckServiceAvailability(b4j.example.networksyncservice parent,RemoteObject __ref,RemoteObject _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.networksyncservice parent;
RemoteObject _timeoutms;
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ok = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckServiceAvailability (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,41);
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
Debug.locals.put("timeoutMs", _timeoutms);
 BA.debugLineNum = 42;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(512);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 43;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(1024);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 44;BA.debugLine="Dim params As Map = CreateDataParams(stateStore.P";
Debug.ShouldStop(2048);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_params = __ref.runClassMethod (b4j.example.networksyncservice.class, "_createdataparams" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_playercodevalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_deviceidvalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_timezoneoffsetminutesvalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clientosnamevalue" /*RemoteObject*/ )));Debug.locals.put("params", _params);Debug.locals.put("params", _params);
 BA.debugLineNum = 45;BA.debugLine="params.Put(\"t\", DateTime.Now)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("t"))),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 46;BA.debugLine="j.Download(stateStore.ServiceCheckUrlValue & \"?\"";
Debug.ShouldStop(8192);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_servicecheckurlvalue" /*RemoteObject*/ ),RemoteObject.createImmutable("?"),__ref.runClassMethod (b4j.example.networksyncservice.class, "_buildparams" /*RemoteObject*/ ,(Object)(_params)))));
 BA.debugLineNum = 47;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
Debug.ShouldStop(16384);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_applyclientrequestheaders" /*RemoteObject*/ ,(Object)(_j));
 BA.debugLineNum = 48;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
Debug.ShouldStop(32768);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",_timeoutms);
 BA.debugLineNum = 49;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "networksyncservice", "checkserviceavailability"), (_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 50;BA.debugLine="Dim ok As Boolean = j.Success";
Debug.ShouldStop(131072);
_ok = _j.getField(true,"_success" /*RemoteObject*/ );Debug.locals.put("ok", _ok);Debug.locals.put("ok", _ok);
 BA.debugLineNum = 51;BA.debugLine="j.Release";
Debug.ShouldStop(262144);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="Return ok";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ok));return;};
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private stateStore As PlayerStateStore";
networksyncservice._statestore = RemoteObject.createNew ("b4j.example.playerstatestore");__ref.setField("_statestore",networksyncservice._statestore);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _classifyhttpfailure(RemoteObject __ref,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("ClassifyHttpFailure (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("classifyhttpfailure")) { return __ref.runUserSub(false, "networksyncservice","classifyhttpfailure", __ref, _errormessage);}
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 35;BA.debugLine="Public Sub ClassifyHttpFailure(errorMessage As Str";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="If IsNetworkHttpError(errorMessage) Then Return \"";
Debug.ShouldStop(8);
if (__ref.runClassMethod (b4j.example.networksyncservice.class, "_isnetworkhttperror" /*RemoteObject*/ ,(Object)(_errormessage)).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("network");};
 BA.debugLineNum = 37;BA.debugLine="Return \"server\"";
Debug.ShouldStop(16);
if (true) return BA.ObjectToString("server");
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createclaimparams(RemoteObject __ref,RemoteObject _playercode,RemoteObject _deviceid,RemoteObject _timezoneoffsetminutes) throws Exception{
try {
		Debug.PushSubsStack("CreateClaimParams (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("createclaimparams")) { return __ref.runUserSub(false, "networksyncservice","createclaimparams", __ref, _playercode, _deviceid, _timezoneoffsetminutes);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playerCode", _playercode);
Debug.locals.put("deviceId", _deviceid);
Debug.locals.put("timezoneOffsetMinutes", _timezoneoffsetminutes);
 BA.debugLineNum = 125;BA.debugLine="Public Sub CreateClaimParams(playerCode As String,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Dim params As Map";
Debug.ShouldStop(536870912);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 127;BA.debugLine="params.Initialize";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 128;BA.debugLine="params.Put(\"player\", playerCode)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)((_playercode)));
 BA.debugLineNum = 129;BA.debugLine="params.Put(\"device\", deviceId)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device"))),(Object)((_deviceid)));
 BA.debugLineNum = 130;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tz"))),(Object)((_timezoneoffsetminutes)));
 BA.debugLineNum = 131;BA.debugLine="Return params";
Debug.ShouldStop(4);
if (true) return _params;
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdataparams(RemoteObject __ref,RemoteObject _playercode,RemoteObject _deviceid,RemoteObject _timezoneoffsetminutes,RemoteObject _clientosname) throws Exception{
try {
		Debug.PushSubsStack("CreateDataParams (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("createdataparams")) { return __ref.runUserSub(false, "networksyncservice","createdataparams", __ref, _playercode, _deviceid, _timezoneoffsetminutes, _clientosname);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playerCode", _playercode);
Debug.locals.put("deviceId", _deviceid);
Debug.locals.put("timezoneOffsetMinutes", _timezoneoffsetminutes);
Debug.locals.put("clientOsName", _clientosname);
 BA.debugLineNum = 135;BA.debugLine="Public Sub CreateDataParams(playerCode As String,";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim params As Map";
Debug.ShouldStop(128);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 137;BA.debugLine="params.Initialize";
Debug.ShouldStop(256);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 138;BA.debugLine="params.Put(\"player\", playerCode)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)((_playercode)));
 BA.debugLineNum = 139;BA.debugLine="params.Put(\"device\", deviceId)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device"))),(Object)((_deviceid)));
 BA.debugLineNum = 140;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tz"))),(Object)((_timezoneoffsetminutes)));
 BA.debugLineNum = 141;BA.debugLine="params.Put(\"os\", clientOsName)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("os"))),(Object)((_clientosname)));
 BA.debugLineNum = 142;BA.debugLine="Return params";
Debug.ShouldStop(8192);
if (true) return _params;
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnextparams(RemoteObject __ref,RemoteObject _playercode,RemoteObject _deviceid,RemoteObject _timezoneoffsetminutes,RemoteObject _appversion,RemoteObject _startmode,RemoteObject _playlistindex) throws Exception{
try {
		Debug.PushSubsStack("CreateNextParams (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("createnextparams")) { return __ref.runUserSub(false, "networksyncservice","createnextparams", __ref, _playercode, _deviceid, _timezoneoffsetminutes, _appversion, _startmode, _playlistindex);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playerCode", _playercode);
Debug.locals.put("deviceId", _deviceid);
Debug.locals.put("timezoneOffsetMinutes", _timezoneoffsetminutes);
Debug.locals.put("appVersion", _appversion);
Debug.locals.put("startMode", _startmode);
Debug.locals.put("playlistIndex", _playlistindex);
 BA.debugLineNum = 112;BA.debugLine="Public Sub CreateNextParams(playerCode As String,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim params As Map";
Debug.ShouldStop(65536);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 114;BA.debugLine="params.Initialize";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 115;BA.debugLine="params.Put(\"player\", playerCode)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)((_playercode)));
 BA.debugLineNum = 116;BA.debugLine="params.Put(\"device\", deviceId)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device"))),(Object)((_deviceid)));
 BA.debugLineNum = 117;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tz"))),(Object)((_timezoneoffsetminutes)));
 BA.debugLineNum = 118;BA.debugLine="params.Put(\"version\", appVersion)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((_appversion)));
 BA.debugLineNum = 119;BA.debugLine="If startMode = \"manual\" Or startMode = \"auto\" The";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_startmode,BA.ObjectToString("manual")) || RemoteObject.solveBoolean("=",_startmode,BA.ObjectToString("auto"))) { 
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("start"))),(Object)((_startmode)));};
 BA.debugLineNum = 120;BA.debugLine="If playlistIndex >= 0 Then params.Put(\"playlist\",";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("g",_playlistindex,BA.numberCast(double.class, 0))) { 
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist"))),(Object)((_playlistindex)));};
 BA.debugLineNum = 121;BA.debugLine="Return params";
Debug.ShouldStop(16777216);
if (true) return _params;
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fetchdata(RemoteObject __ref,RemoteObject _timeoutms) throws Exception{
try {
		Debug.PushSubsStack("FetchData (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("fetchdata")) { return __ref.runUserSub(false, "networksyncservice","fetchdata", __ref, _timeoutms);}
ResumableSub_FetchData rsub = new ResumableSub_FetchData(null,__ref,_timeoutms);
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
public static class ResumableSub_FetchData extends BA.ResumableSub {
public ResumableSub_FetchData(b4j.example.networksyncservice parent,RemoteObject __ref,RemoteObject _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.networksyncservice parent;
RemoteObject _timeoutms;
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FetchData (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,14);
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
Debug.locals.put("timeoutMs", _timeoutms);
 BA.debugLineNum = 15;BA.debugLine="Dim url As String = stateStore.DataUrlValue & \"?\"";
Debug.ShouldStop(16384);
_url = RemoteObject.concat(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_dataurlvalue" /*RemoteObject*/ ),RemoteObject.createImmutable("?"),__ref.runClassMethod (b4j.example.networksyncservice.class, "_buildparams" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.networksyncservice.class, "_createdataparams" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_playercodevalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_deviceidvalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_timezoneoffsetminutesvalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clientosnamevalue" /*RemoteObject*/ ))))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 16;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "networksyncservice", "fetchdata"), __ref.runClassMethod (b4j.example.networksyncservice.class, "_fetchjsonwithtimeout" /*RemoteObject*/ ,(Object)(_url),(Object)(_timeoutms)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 17;BA.debugLine="Return result";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _fetchjsonwithtimeout(RemoteObject __ref,RemoteObject _url,RemoteObject _timeoutms) throws Exception{
try {
		Debug.PushSubsStack("FetchJsonWithTimeout (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("fetchjsonwithtimeout")) { return __ref.runUserSub(false, "networksyncservice","fetchjsonwithtimeout", __ref, _url, _timeoutms);}
ResumableSub_FetchJsonWithTimeout rsub = new ResumableSub_FetchJsonWithTimeout(null,__ref,_url,_timeoutms);
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
public static class ResumableSub_FetchJsonWithTimeout extends BA.ResumableSub {
public ResumableSub_FetchJsonWithTimeout(b4j.example.networksyncservice parent,RemoteObject __ref,RemoteObject _url,RemoteObject _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._url = _url;
this._timeoutms = _timeoutms;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.networksyncservice parent;
RemoteObject _url;
RemoteObject _timeoutms;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _responsetext = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _errormessage = RemoteObject.createImmutable("");
RemoteObject _failurekind = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FetchJsonWithTimeout (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,69);
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
Debug.locals.put("url", _url);
Debug.locals.put("timeoutMs", _timeoutms);
 BA.debugLineNum = 70;BA.debugLine="Dim result As Map";
Debug.ShouldStop(32);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 71;BA.debugLine="result.Initialize";
Debug.ShouldStop(64);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="result.Put(\"Success\", False)";
Debug.ShouldStop(128);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 73;BA.debugLine="result.Put(\"Kind\", \"server\")";
Debug.ShouldStop(256);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable("server"))));
 BA.debugLineNum = 74;BA.debugLine="result.Put(\"Data\", Null)";
Debug.ShouldStop(512);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Data"))),(Object)(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 75;BA.debugLine="result.Put(\"ErrorMessage\", \"\")";
Debug.ShouldStop(1024);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ErrorMessage"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 76;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(2048);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 77;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(4096);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 78;BA.debugLine="stateStore.TraceLog(\"http get начало timeoutMs=\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http get начало timeoutMs="),_timeoutms,RemoteObject.createImmutable(" url="),_url)));
 BA.debugLineNum = 79;BA.debugLine="j.Download(url)";
Debug.ShouldStop(16384);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 80;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
Debug.ShouldStop(32768);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_applyclientrequestheaders" /*RemoteObject*/ ,(Object)(_j));
 BA.debugLineNum = 81;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
Debug.ShouldStop(65536);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",_timeoutms);
 BA.debugLineNum = 82;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "networksyncservice", "fetchjsonwithtimeout"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 83;BA.debugLine="If j.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 12;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 84;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 BA.debugLineNum = 85;BA.debugLine="Dim responseText As String = j.GetString";
Debug.ShouldStop(1048576);
_responsetext = _j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("responseText", _responsetext);Debug.locals.put("responseText", _responsetext);
 BA.debugLineNum = 86;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, True,";
Debug.ShouldStop(2097152);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_saveserversnapshot" /*RemoteObject*/ ,(Object)(BA.ObjectToString("GET")),(Object)(_url),(Object)(parent.__c.getField(true,"True")),(Object)(_responsetext),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 87;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4194304);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 88;BA.debugLine="parser.Initialize(responseText)";
Debug.ShouldStop(8388608);
_parser.runVoidMethod ("Initialize",(Object)(_responsetext));
 BA.debugLineNum = 89;BA.debugLine="result.Put(\"Data\", parser.NextObject)";
Debug.ShouldStop(16777216);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Data"))),(Object)((_parser.runMethod(false,"NextObject").getObject())));
 BA.debugLineNum = 90;BA.debugLine="result.Put(\"Success\", True)";
Debug.ShouldStop(33554432);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 91;BA.debugLine="result.Put(\"Kind\", \"\")";
Debug.ShouldStop(67108864);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 92;BA.debugLine="stateStore.TraceLog(\"http get итог success=true";
Debug.ShouldStop(134217728);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http get итог success=true url="),_url)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 94;BA.debugLine="result.Put(\"Kind\", \"server\")";
Debug.ShouldStop(536870912);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable("server"))));
 BA.debugLineNum = 95;BA.debugLine="result.Put(\"ErrorMessage\", \"bad_json\")";
Debug.ShouldStop(1073741824);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ErrorMessage"))),(Object)((RemoteObject.createImmutable("bad_json"))));
 BA.debugLineNum = 96;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_saveserversnapshot" /*RemoteObject*/ ,(Object)(BA.ObjectToString("GET")),(Object)(_url),(Object)(parent.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("bad_json")));
 BA.debugLineNum = 97;BA.debugLine="stateStore.TraceLog(\"http get ошибка kind=serve";
Debug.ShouldStop(1);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http get ошибка kind=server url="),_url,RemoteObject.createImmutable(" message=bad_json"))));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 100;BA.debugLine="Dim errorMessage As String = j.ErrorMessage";
Debug.ShouldStop(8);
_errormessage = _j.getField(true,"_errormessage" /*RemoteObject*/ );Debug.locals.put("errorMessage", _errormessage);Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 101;BA.debugLine="result.Put(\"ErrorMessage\", errorMessage)";
Debug.ShouldStop(16);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ErrorMessage"))),(Object)((_errormessage)));
 BA.debugLineNum = 102;BA.debugLine="Dim failureKind As String = ClassifyHttpFailure(";
Debug.ShouldStop(32);
_failurekind = __ref.runClassMethod (b4j.example.networksyncservice.class, "_classifyhttpfailure" /*RemoteObject*/ ,(Object)(_errormessage));Debug.locals.put("failureKind", _failurekind);Debug.locals.put("failureKind", _failurekind);
 BA.debugLineNum = 103;BA.debugLine="result.Put(\"Kind\", failureKind)";
Debug.ShouldStop(64);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((_failurekind)));
 BA.debugLineNum = 104;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False,";
Debug.ShouldStop(128);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_saveserversnapshot" /*RemoteObject*/ ,(Object)(BA.ObjectToString("GET")),(Object)(_url),(Object)(parent.__c.getField(true,"False")),(Object)(BA.ObjectToString("")),(Object)(_errormessage));
 BA.debugLineNum = 105;BA.debugLine="LogHttpFailure(url, failureKind)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.networksyncservice.class, "_loghttpfailure" /*RemoteObject*/ ,(Object)(_url),(Object)(_failurekind));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 107;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="Return result";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static RemoteObject  _fetchnext(RemoteObject __ref,RemoteObject _timeoutms,RemoteObject _appversion,RemoteObject _startmode,RemoteObject _playlistindex) throws Exception{
try {
		Debug.PushSubsStack("FetchNext (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("fetchnext")) { return __ref.runUserSub(false, "networksyncservice","fetchnext", __ref, _timeoutms, _appversion, _startmode, _playlistindex);}
ResumableSub_FetchNext rsub = new ResumableSub_FetchNext(null,__ref,_timeoutms,_appversion,_startmode,_playlistindex);
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
public static class ResumableSub_FetchNext extends BA.ResumableSub {
public ResumableSub_FetchNext(b4j.example.networksyncservice parent,RemoteObject __ref,RemoteObject _timeoutms,RemoteObject _appversion,RemoteObject _startmode,RemoteObject _playlistindex) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
this._appversion = _appversion;
this._startmode = _startmode;
this._playlistindex = _playlistindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.networksyncservice parent;
RemoteObject _timeoutms;
RemoteObject _appversion;
RemoteObject _startmode;
RemoteObject _playlistindex;
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FetchNext (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,21);
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
Debug.locals.put("timeoutMs", _timeoutms);
Debug.locals.put("appVersion", _appversion);
Debug.locals.put("startMode", _startmode);
Debug.locals.put("playlistIndex", _playlistindex);
 BA.debugLineNum = 22;BA.debugLine="Dim url As String = stateStore.NextUrlValue & \"?\"";
Debug.ShouldStop(2097152);
_url = RemoteObject.concat(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_nexturlvalue" /*RemoteObject*/ ),RemoteObject.createImmutable("?"),__ref.runClassMethod (b4j.example.networksyncservice.class, "_buildparams" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.networksyncservice.class, "_createnextparams" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_playercodevalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_deviceidvalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_timezoneoffsetminutesvalue" /*RemoteObject*/ )),(Object)(_appversion),(Object)(_startmode),(Object)(_playlistindex)))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 23;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "networksyncservice", "fetchnext"), __ref.runClassMethod (b4j.example.networksyncservice.class, "_fetchjsonwithtimeout" /*RemoteObject*/ ,(Object)(_url),(Object)(_timeoutms)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 24;BA.debugLine="Return result";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _store) throws Exception{
try {
		Debug.PushSubsStack("Initialize (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "networksyncservice","initialize", __ref, _ba, _store);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("store", _store);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(store As PlayerStateStore)";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="stateStore = store";
Debug.ShouldStop(512);
__ref.setField ("_statestore" /*RemoteObject*/ ,_store);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnetworkhttperror(RemoteObject __ref,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("IsNetworkHttpError (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("isnetworkhttperror")) { return __ref.runUserSub(false, "networksyncservice","isnetworkhttperror", __ref, _errormessage);}
RemoteObject _messagelower = RemoteObject.createImmutable("");
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 156;BA.debugLine="Private Sub IsNetworkHttpError(errorMessage As Str";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="Dim messageLower As String = errorMessage.ToLower";
Debug.ShouldStop(268435456);
_messagelower = _errormessage.runMethod(true,"toLowerCase");Debug.locals.put("messageLower", _messagelower);Debug.locals.put("messageLower", _messagelower);
 BA.debugLineNum = 158;BA.debugLine="Return messageLower.Contains(\"timed out\") Or mess";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_messagelower.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("timed out")))) || RemoteObject.solveBoolean(".",_messagelower.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("timeout")))) || RemoteObject.solveBoolean(".",_messagelower.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("unknownhost")))) || RemoteObject.solveBoolean(".",_messagelower.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("unreachable")))) || RemoteObject.solveBoolean(".",_messagelower.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("refused")))) || RemoteObject.solveBoolean(".",_messagelower.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("reset")))) || RemoteObject.solveBoolean(".",_messagelower.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("failed to connect")))) || RemoteObject.solveBoolean(".",_messagelower.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("no route")))));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loghttpfailure(RemoteObject __ref,RemoteObject _url,RemoteObject _kind) throws Exception{
try {
		Debug.PushSubsStack("LogHttpFailure (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("loghttpfailure")) { return __ref.runUserSub(false, "networksyncservice","loghttpfailure", __ref, _url, _kind);}
RemoteObject _consecutiveerrors = RemoteObject.createImmutable(0);
Debug.locals.put("url", _url);
Debug.locals.put("kind", _kind);
 BA.debugLineNum = 56;BA.debugLine="Public Sub LogHttpFailure(url As String, kind As S";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="stateStore.IncrementNetworkErrorCount";
Debug.ShouldStop(16777216);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_incrementnetworkerrorcount" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="Dim consecutiveErrors As Int = stateStore.GetCons";
Debug.ShouldStop(33554432);
_consecutiveerrors = __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_getconsecutivenetworkerrors" /*RemoteObject*/ );Debug.locals.put("consecutiveErrors", _consecutiveerrors);Debug.locals.put("consecutiveErrors", _consecutiveerrors);
 BA.debugLineNum = 59;BA.debugLine="If url.Contains(\"/data\") Then";
Debug.ShouldStop(67108864);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("/data"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 60;BA.debugLine="stateStore.TraceWarn(\"network\", \"data timeout\",";
Debug.ShouldStop(134217728);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("data timeout")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("retry="),_consecutiveerrors,RemoteObject.createImmutable(" lastDataOkAgoSec="),__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_secondsagotext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_getlastdataokat" /*RemoteObject*/ ))))));
 }else 
{ BA.debugLineNum = 61;BA.debugLine="Else If url.Contains(\"/history\") Then";
Debug.ShouldStop(268435456);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("/history"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 62;BA.debugLine="stateStore.TraceWarn(\"history\", \"ошибка отправки";
Debug.ShouldStop(536870912);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("history")),(Object)(BA.ObjectToString("ошибка отправки")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("kind="),_kind)));
 }else 
{ BA.debugLineNum = 63;BA.debugLine="Else If url.Contains(\"/next\") Then";
Debug.ShouldStop(1073741824);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("/next"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 64;BA.debugLine="stateStore.TraceWarn(\"network\", \"ошибка очереди\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("ошибка очереди")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("kind="),_kind)));
 }}}
;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _submitclaim(RemoteObject __ref,RemoteObject _timeoutms) throws Exception{
try {
		Debug.PushSubsStack("SubmitClaim (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("submitclaim")) { return __ref.runUserSub(false, "networksyncservice","submitclaim", __ref, _timeoutms);}
ResumableSub_SubmitClaim rsub = new ResumableSub_SubmitClaim(null,__ref,_timeoutms);
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
public static class ResumableSub_SubmitClaim extends BA.ResumableSub {
public ResumableSub_SubmitClaim(b4j.example.networksyncservice parent,RemoteObject __ref,RemoteObject _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.networksyncservice parent;
RemoteObject _timeoutms;
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SubmitClaim (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,28);
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
Debug.locals.put("timeoutMs", _timeoutms);
 BA.debugLineNum = 29;BA.debugLine="Dim url As String = stateStore.ClaimUrlValue & \"?";
Debug.ShouldStop(268435456);
_url = RemoteObject.concat(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_claimurlvalue" /*RemoteObject*/ ),RemoteObject.createImmutable("?"),__ref.runClassMethod (b4j.example.networksyncservice.class, "_buildparams" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.networksyncservice.class, "_createclaimparams" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_playercodevalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_deviceidvalue" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_timezoneoffsetminutesvalue" /*RemoteObject*/ ))))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 30;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "networksyncservice", "submitclaim"), __ref.runClassMethod (b4j.example.networksyncservice.class, "_fetchjsonwithtimeout" /*RemoteObject*/ ,(Object)(_url),(Object)(_timeoutms)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 31;BA.debugLine="Return result";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
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
public static RemoteObject  _urlencode(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("UrlEncode (networksyncservice) ","networksyncservice",13,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("urlencode")) { return __ref.runUserSub(false, "networksyncservice","urlencode", __ref, _value);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("value", _value);
 BA.debugLineNum = 161;BA.debugLine="Private Sub UrlEncode(value As Object) As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(2);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 163;BA.debugLine="jo.InitializeStatic(\"java.net.URLEncoder\")";
Debug.ShouldStop(4);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.net.URLEncoder")));
 BA.debugLineNum = 164;BA.debugLine="Return jo.RunMethod(\"encode\", Array As Object(\"\"";
Debug.ShouldStop(8);
if (true) return BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("encode")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(RemoteObject.concat(RemoteObject.createImmutable(""),_value)),(RemoteObject.createImmutable("UTF-8"))}))));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}