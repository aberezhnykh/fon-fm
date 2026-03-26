package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class networksyncservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.networksyncservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.networksyncservice.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.playerstatestore _statestore = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _buildparams(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _key = "";
 //BA.debugLineNum = 146;BA.debugLine="Public Sub BuildParams(params As Map) As String";
 //BA.debugLineNum = 147;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 148;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 149;BA.debugLine="For Each key As String In params.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _params.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 150;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
if (_sb.getLength()>0) { 
_sb.Append("&");};
 //BA.debugLineNum = 151;BA.debugLine="sb.Append(UrlEncode(key)).Append(\"=\").Append(Url";
_sb.Append(_urlencode((Object)(_key))).Append("=").Append(_urlencode(_params.Get((Object)(_key))));
 }
};
 //BA.debugLineNum = 153;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkserviceavailability(int _timeoutms) throws Exception{
ResumableSub_CheckServiceAvailability rsub = new ResumableSub_CheckServiceAvailability(this,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckServiceAvailability extends BA.ResumableSub {
public ResumableSub_CheckServiceAvailability(b4a.example.networksyncservice parent,int _timeoutms) {
this.parent = parent;
this._timeoutms = _timeoutms;
}
b4a.example.networksyncservice parent;
int _timeoutms;
b4a.example.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
boolean _ok = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 42;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
 //BA.debugLineNum = 43;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 44;BA.debugLine="Dim params As Map = CreateDataParams(stateStore.P";
_params = new anywheresoftware.b4a.objects.collections.Map();
_params = parent._createdataparams(parent._statestore._playercodevalue /*String*/ (),parent._statestore._deviceidvalue /*String*/ (),parent._statestore._timezoneoffsetminutesvalue /*int*/ (),parent._statestore._clientosnamevalue /*String*/ ());
 //BA.debugLineNum = 45;BA.debugLine="params.Put(\"t\", DateTime.Now)";
_params.Put((Object)("t"),(Object)(parent.__c.DateTime.getNow()));
 //BA.debugLineNum = 46;BA.debugLine="j.Download(stateStore.ServiceCheckUrlValue & \"?\"";
_j._download /*String*/ (parent._statestore._servicecheckurlvalue /*String*/ ()+"?"+parent._buildparams(_params));
 //BA.debugLineNum = 47;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
parent._statestore._applyclientrequestheaders /*String*/ (_j);
 //BA.debugLineNum = 48;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout(_timeoutms);
 //BA.debugLineNum = 49;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 50;BA.debugLine="Dim ok As Boolean = j.Success";
_ok = _j._success /*boolean*/ ;
 //BA.debugLineNum = 51;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 52;BA.debugLine="Return ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ok));return;};
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.httpjob _j) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4a.example.playerstatestore();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _classifyhttpfailure(String _errormessage) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub ClassifyHttpFailure(errorMessage As Str";
 //BA.debugLineNum = 36;BA.debugLine="If IsNetworkHttpError(errorMessage) Then Return \"";
if (_isnetworkhttperror(_errormessage)) { 
if (true) return "network";};
 //BA.debugLineNum = 37;BA.debugLine="Return \"server\"";
if (true) return "server";
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createclaimparams(String _playercode,String _deviceid,int _timezoneoffsetminutes) throws Exception{
anywheresoftware.b4a.objects.collections.Map _params = null;
 //BA.debugLineNum = 125;BA.debugLine="Public Sub CreateClaimParams(playerCode As String,";
 //BA.debugLineNum = 126;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 127;BA.debugLine="params.Initialize";
_params.Initialize();
 //BA.debugLineNum = 128;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
 //BA.debugLineNum = 129;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
 //BA.debugLineNum = 130;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
 //BA.debugLineNum = 131;BA.debugLine="Return params";
if (true) return _params;
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createdataparams(String _playercode,String _deviceid,int _timezoneoffsetminutes,String _clientosname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _params = null;
 //BA.debugLineNum = 135;BA.debugLine="Public Sub CreateDataParams(playerCode As String,";
 //BA.debugLineNum = 136;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 137;BA.debugLine="params.Initialize";
_params.Initialize();
 //BA.debugLineNum = 138;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
 //BA.debugLineNum = 139;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
 //BA.debugLineNum = 140;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
 //BA.debugLineNum = 141;BA.debugLine="params.Put(\"os\", clientOsName)";
_params.Put((Object)("os"),(Object)(_clientosname));
 //BA.debugLineNum = 142;BA.debugLine="Return params";
if (true) return _params;
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createnextparams(String _playercode,String _deviceid,int _timezoneoffsetminutes,String _appversion,String _startmode,int _playlistindex) throws Exception{
anywheresoftware.b4a.objects.collections.Map _params = null;
 //BA.debugLineNum = 112;BA.debugLine="Public Sub CreateNextParams(playerCode As String,";
 //BA.debugLineNum = 113;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 114;BA.debugLine="params.Initialize";
_params.Initialize();
 //BA.debugLineNum = 115;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
 //BA.debugLineNum = 116;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
 //BA.debugLineNum = 117;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
 //BA.debugLineNum = 118;BA.debugLine="params.Put(\"version\", appVersion)";
_params.Put((Object)("version"),(Object)(_appversion));
 //BA.debugLineNum = 119;BA.debugLine="If startMode = \"manual\" Or startMode = \"auto\" The";
if ((_startmode).equals("manual") || (_startmode).equals("auto")) { 
_params.Put((Object)("start"),(Object)(_startmode));};
 //BA.debugLineNum = 120;BA.debugLine="If playlistIndex >= 0 Then params.Put(\"playlist\",";
if (_playlistindex>=0) { 
_params.Put((Object)("playlist"),(Object)(_playlistindex));};
 //BA.debugLineNum = 121;BA.debugLine="Return params";
if (true) return _params;
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchdata(int _timeoutms) throws Exception{
ResumableSub_FetchData rsub = new ResumableSub_FetchData(this,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchData extends BA.ResumableSub {
public ResumableSub_FetchData(b4a.example.networksyncservice parent,int _timeoutms) {
this.parent = parent;
this._timeoutms = _timeoutms;
}
b4a.example.networksyncservice parent;
int _timeoutms;
String _url = "";
anywheresoftware.b4a.objects.collections.Map _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 15;BA.debugLine="Dim url As String = stateStore.DataUrlValue & \"?\"";
_url = parent._statestore._dataurlvalue /*String*/ ()+"?"+parent._buildparams(parent._createdataparams(parent._statestore._playercodevalue /*String*/ (),parent._statestore._deviceidvalue /*String*/ (),parent._statestore._timezoneoffsetminutesvalue /*int*/ (),parent._statestore._clientosnamevalue /*String*/ ()));
 //BA.debugLineNum = 16;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, this, parent._fetchjsonwithtimeout(_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 17;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4a.objects.collections.Map _result) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchjsonwithtimeout(String _url,int _timeoutms) throws Exception{
ResumableSub_FetchJsonWithTimeout rsub = new ResumableSub_FetchJsonWithTimeout(this,_url,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchJsonWithTimeout extends BA.ResumableSub {
public ResumableSub_FetchJsonWithTimeout(b4a.example.networksyncservice parent,String _url,int _timeoutms) {
this.parent = parent;
this._url = _url;
this._timeoutms = _timeoutms;
}
b4a.example.networksyncservice parent;
String _url;
int _timeoutms;
anywheresoftware.b4a.objects.collections.Map _result = null;
b4a.example.httpjob _j = null;
String _responsetext = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
String _errormessage = "";
String _failurekind = "";

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
 //BA.debugLineNum = 70;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 71;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 72;BA.debugLine="result.Put(\"Success\", False)";
_result.Put((Object)("Success"),(Object)(parent.__c.False));
 //BA.debugLineNum = 73;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
 //BA.debugLineNum = 74;BA.debugLine="result.Put(\"Data\", Null)";
_result.Put((Object)("Data"),parent.__c.Null);
 //BA.debugLineNum = 75;BA.debugLine="result.Put(\"ErrorMessage\", \"\")";
_result.Put((Object)("ErrorMessage"),(Object)(""));
 //BA.debugLineNum = 76;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
 //BA.debugLineNum = 77;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 78;BA.debugLine="stateStore.TraceLog(\"http get начало timeoutMs=\"";
parent._statestore._tracelog /*String*/ ("http get начало timeoutMs="+BA.NumberToString(_timeoutms)+" url="+_url);
 //BA.debugLineNum = 79;BA.debugLine="j.Download(url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 80;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
parent._statestore._applyclientrequestheaders /*String*/ (_j);
 //BA.debugLineNum = 81;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout(_timeoutms);
 //BA.debugLineNum = 82;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 83;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 84;BA.debugLine="Try";
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
 //BA.debugLineNum = 85;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, True,";
parent._statestore._saveserversnapshot /*String*/ ("GET",_url,parent.__c.True,_responsetext,"");
 //BA.debugLineNum = 87;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 88;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
 //BA.debugLineNum = 89;BA.debugLine="result.Put(\"Data\", parser.NextObject)";
_result.Put((Object)("Data"),(Object)(_parser.NextObject().getObject()));
 //BA.debugLineNum = 90;BA.debugLine="result.Put(\"Success\", True)";
_result.Put((Object)("Success"),(Object)(parent.__c.True));
 //BA.debugLineNum = 91;BA.debugLine="result.Put(\"Kind\", \"\")";
_result.Put((Object)("Kind"),(Object)(""));
 //BA.debugLineNum = 92;BA.debugLine="stateStore.TraceLog(\"http get итог success=true";
parent._statestore._tracelog /*String*/ ("http get итог success=true url="+_url);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 //BA.debugLineNum = 94;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
 //BA.debugLineNum = 95;BA.debugLine="result.Put(\"ErrorMessage\", \"bad_json\")";
_result.Put((Object)("ErrorMessage"),(Object)("bad_json"));
 //BA.debugLineNum = 96;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False";
parent._statestore._saveserversnapshot /*String*/ ("GET",_url,parent.__c.False,"","bad_json");
 //BA.debugLineNum = 97;BA.debugLine="stateStore.TraceLog(\"http get ошибка kind=serve";
parent._statestore._tracelog /*String*/ ("http get ошибка kind=server url="+_url+" message=bad_json");
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
 //BA.debugLineNum = 100;BA.debugLine="Dim errorMessage As String = j.ErrorMessage";
_errormessage = _j._errormessage /*String*/ ;
 //BA.debugLineNum = 101;BA.debugLine="result.Put(\"ErrorMessage\", errorMessage)";
_result.Put((Object)("ErrorMessage"),(Object)(_errormessage));
 //BA.debugLineNum = 102;BA.debugLine="Dim failureKind As String = ClassifyHttpFailure(";
_failurekind = parent._classifyhttpfailure(_errormessage);
 //BA.debugLineNum = 103;BA.debugLine="result.Put(\"Kind\", failureKind)";
_result.Put((Object)("Kind"),(Object)(_failurekind));
 //BA.debugLineNum = 104;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False,";
parent._statestore._saveserversnapshot /*String*/ ("GET",_url,parent.__c.False,"",_errormessage);
 //BA.debugLineNum = 105;BA.debugLine="LogHttpFailure(url, failureKind)";
parent._loghttpfailure(_url,_failurekind);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 107;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 108;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchnext(int _timeoutms,String _appversion,String _startmode,int _playlistindex) throws Exception{
ResumableSub_FetchNext rsub = new ResumableSub_FetchNext(this,_timeoutms,_appversion,_startmode,_playlistindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchNext extends BA.ResumableSub {
public ResumableSub_FetchNext(b4a.example.networksyncservice parent,int _timeoutms,String _appversion,String _startmode,int _playlistindex) {
this.parent = parent;
this._timeoutms = _timeoutms;
this._appversion = _appversion;
this._startmode = _startmode;
this._playlistindex = _playlistindex;
}
b4a.example.networksyncservice parent;
int _timeoutms;
String _appversion;
String _startmode;
int _playlistindex;
String _url = "";
anywheresoftware.b4a.objects.collections.Map _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 22;BA.debugLine="Dim url As String = stateStore.NextUrlValue & \"?\"";
_url = parent._statestore._nexturlvalue /*String*/ ()+"?"+parent._buildparams(parent._createnextparams(parent._statestore._playercodevalue /*String*/ (),parent._statestore._deviceidvalue /*String*/ (),parent._statestore._timezoneoffsetminutesvalue /*int*/ (),_appversion,_startmode,_playlistindex));
 //BA.debugLineNum = 23;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, this, parent._fetchjsonwithtimeout(_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 24;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.example.playerstatestore _store) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(store As PlayerStateStore)";
 //BA.debugLineNum = 10;BA.debugLine="stateStore = store";
_statestore = _store;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public boolean  _isnetworkhttperror(String _errormessage) throws Exception{
String _messagelower = "";
 //BA.debugLineNum = 156;BA.debugLine="Private Sub IsNetworkHttpError(errorMessage As Str";
 //BA.debugLineNum = 157;BA.debugLine="Dim messageLower As String = errorMessage.ToLower";
_messagelower = _errormessage.toLowerCase();
 //BA.debugLineNum = 158;BA.debugLine="Return messageLower.Contains(\"timed out\") Or mess";
if (true) return _messagelower.contains("timed out") || _messagelower.contains("timeout") || _messagelower.contains("unknownhost") || _messagelower.contains("unreachable") || _messagelower.contains("refused") || _messagelower.contains("reset") || _messagelower.contains("failed to connect") || _messagelower.contains("no route");
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return false;
}
public String  _loghttpfailure(String _url,String _kind) throws Exception{
int _consecutiveerrors = 0;
 //BA.debugLineNum = 56;BA.debugLine="Public Sub LogHttpFailure(url As String, kind As S";
 //BA.debugLineNum = 57;BA.debugLine="stateStore.IncrementNetworkErrorCount";
_statestore._incrementnetworkerrorcount /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="Dim consecutiveErrors As Int = stateStore.GetCons";
_consecutiveerrors = _statestore._getconsecutivenetworkerrors /*int*/ ();
 //BA.debugLineNum = 59;BA.debugLine="If url.Contains(\"/data\") Then";
if (_url.contains("/data")) { 
 //BA.debugLineNum = 60;BA.debugLine="stateStore.TraceWarn(\"network\", \"data timeout\",";
_statestore._tracewarn /*String*/ ("network","data timeout","retry="+BA.NumberToString(_consecutiveerrors)+" lastDataOkAgoSec="+_statestore._secondsagotext /*String*/ (_statestore._getlastdataokat /*long*/ ()));
 }else if(_url.contains("/history")) { 
 //BA.debugLineNum = 62;BA.debugLine="stateStore.TraceWarn(\"history\", \"ошибка отправки";
_statestore._tracewarn /*String*/ ("history","ошибка отправки","kind="+_kind);
 }else if(_url.contains("/next")) { 
 //BA.debugLineNum = 64;BA.debugLine="stateStore.TraceWarn(\"network\", \"ошибка очереди\"";
_statestore._tracewarn /*String*/ ("network","ошибка очереди","kind="+_kind);
 };
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _submitclaim(int _timeoutms) throws Exception{
ResumableSub_SubmitClaim rsub = new ResumableSub_SubmitClaim(this,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SubmitClaim extends BA.ResumableSub {
public ResumableSub_SubmitClaim(b4a.example.networksyncservice parent,int _timeoutms) {
this.parent = parent;
this._timeoutms = _timeoutms;
}
b4a.example.networksyncservice parent;
int _timeoutms;
String _url = "";
anywheresoftware.b4a.objects.collections.Map _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 29;BA.debugLine="Dim url As String = stateStore.ClaimUrlValue & \"?";
_url = parent._statestore._claimurlvalue /*String*/ ()+"?"+parent._buildparams(parent._createclaimparams(parent._statestore._playercodevalue /*String*/ (),parent._statestore._deviceidvalue /*String*/ (),parent._statestore._timezoneoffsetminutesvalue /*int*/ ()));
 //BA.debugLineNum = 30;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, this, parent._fetchjsonwithtimeout(_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 31;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _urlencode(Object _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 161;BA.debugLine="Private Sub UrlEncode(value As Object) As String";
 //BA.debugLineNum = 162;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 163;BA.debugLine="jo.InitializeStatic(\"java.net.URLEncoder\")";
_jo.InitializeStatic("java.net.URLEncoder");
 //BA.debugLineNum = 164;BA.debugLine="Return jo.RunMethod(\"encode\", Array As Object(\"\"";
if (true) return BA.ObjectToString(_jo.RunMethod("encode",new Object[]{(Object)(""+BA.ObjectToString(_value)),(Object)("UTF-8")}));
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
