package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class networksyncservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.networksyncservice", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.networksyncservice.class).invoke(this, new Object[] {null});
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
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _buildparams(b4j.example.networksyncservice __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "buildparams", false))
	 {return ((String) Debug.delegate(ba, "buildparams", new Object[] {_params}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _key = "";
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Public Sub BuildParams(params As Map) As String";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="For Each key As String In params.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _params.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
if (_sb.getLength()>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=40370181;
 //BA.debugLineNum = 40370181;BA.debugLine="sb.Append(UrlEncode(key)).Append(\"=\").Append(Url";
_sb.Append(__ref._urlencode /*String*/ (null,(Object)(_key))).Append("=").Append(__ref._urlencode /*String*/ (null,_params.Get((Object)(_key))));
 }
};
RDebugUtils.currentLine=40370183;
 //BA.debugLineNum = 40370183;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=40370184;
 //BA.debugLineNum = 40370184;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchjsonwithtimeout(b4j.example.networksyncservice __ref,String _url,int _timeoutms) throws Exception{
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "fetchjsonwithtimeout", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fetchjsonwithtimeout", new Object[] {_url,_timeoutms}));}
ResumableSub_FetchJsonWithTimeout rsub = new ResumableSub_FetchJsonWithTimeout(this,__ref,_url,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchJsonWithTimeout extends BA.ResumableSub {
public ResumableSub_FetchJsonWithTimeout(b4j.example.networksyncservice parent,b4j.example.networksyncservice __ref,String _url,int _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._url = _url;
this._timeoutms = _timeoutms;
this.__ref = parent;
}
b4j.example.networksyncservice __ref;
b4j.example.networksyncservice parent;
String _url;
int _timeoutms;
anywheresoftware.b4a.objects.collections.Map _result = null;
b4j.example.httpjob _j = null;
String _responsetext = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
String _errormessage = "";
String _failurekind = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="networksyncservice";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=40108035;
 //BA.debugLineNum = 40108035;BA.debugLine="result.Put(\"Success\", False)";
_result.Put((Object)("Success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=40108036;
 //BA.debugLineNum = 40108036;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=40108037;
 //BA.debugLineNum = 40108037;BA.debugLine="result.Put(\"Data\", Null)";
_result.Put((Object)("Data"),parent.__c.Null);
RDebugUtils.currentLine=40108038;
 //BA.debugLineNum = 40108038;BA.debugLine="result.Put(\"ErrorMessage\", \"\")";
_result.Put((Object)("ErrorMessage"),(Object)(""));
RDebugUtils.currentLine=40108039;
 //BA.debugLineNum = 40108039;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=40108040;
 //BA.debugLineNum = 40108040;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=40108041;
 //BA.debugLineNum = 40108041;BA.debugLine="stateStore.TraceLog(\"http get начало timeoutMs=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"http get начало timeoutMs="+BA.NumberToString(_timeoutms)+" url="+_url);
RDebugUtils.currentLine=40108042;
 //BA.debugLineNum = 40108042;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=40108043;
 //BA.debugLineNum = 40108043;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=40108044;
 //BA.debugLineNum = 40108044;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(_timeoutms);
RDebugUtils.currentLine=40108045;
 //BA.debugLineNum = 40108045;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "fetchjsonwithtimeout"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=40108046;
 //BA.debugLineNum = 40108046;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=40108047;
 //BA.debugLineNum = 40108047;BA.debugLine="Try";
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
RDebugUtils.currentLine=40108048;
 //BA.debugLineNum = 40108048;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=40108049;
 //BA.debugLineNum = 40108049;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, True,";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=40108050;
 //BA.debugLineNum = 40108050;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=40108051;
 //BA.debugLineNum = 40108051;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
RDebugUtils.currentLine=40108052;
 //BA.debugLineNum = 40108052;BA.debugLine="result.Put(\"Data\", parser.NextObject)";
_result.Put((Object)("Data"),(Object)(_parser.NextObject().getObject()));
RDebugUtils.currentLine=40108053;
 //BA.debugLineNum = 40108053;BA.debugLine="result.Put(\"Success\", True)";
_result.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=40108054;
 //BA.debugLineNum = 40108054;BA.debugLine="result.Put(\"Kind\", \"\")";
_result.Put((Object)("Kind"),(Object)(""));
RDebugUtils.currentLine=40108055;
 //BA.debugLineNum = 40108055;BA.debugLine="stateStore.TraceLog(\"http get итог success=true";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"http get итог success=true url="+_url);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=40108057;
 //BA.debugLineNum = 40108057;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=40108058;
 //BA.debugLineNum = 40108058;BA.debugLine="result.Put(\"ErrorMessage\", \"bad_json\")";
_result.Put((Object)("ErrorMessage"),(Object)("bad_json"));
RDebugUtils.currentLine=40108059;
 //BA.debugLineNum = 40108059;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"","bad_json");
RDebugUtils.currentLine=40108060;
 //BA.debugLineNum = 40108060;BA.debugLine="stateStore.TraceLog(\"http get ошибка kind=serve";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"http get ошибка kind=server url="+_url+" message=bad_json");
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
RDebugUtils.currentLine=40108063;
 //BA.debugLineNum = 40108063;BA.debugLine="Dim errorMessage As String = j.ErrorMessage";
_errormessage = _j._errormessage /*String*/ ;
RDebugUtils.currentLine=40108064;
 //BA.debugLineNum = 40108064;BA.debugLine="result.Put(\"ErrorMessage\", errorMessage)";
_result.Put((Object)("ErrorMessage"),(Object)(_errormessage));
RDebugUtils.currentLine=40108065;
 //BA.debugLineNum = 40108065;BA.debugLine="Dim failureKind As String = ClassifyHttpFailure(";
_failurekind = __ref._classifyhttpfailure /*String*/ (null,_errormessage);
RDebugUtils.currentLine=40108066;
 //BA.debugLineNum = 40108066;BA.debugLine="result.Put(\"Kind\", failureKind)";
_result.Put((Object)("Kind"),(Object)(_failurekind));
RDebugUtils.currentLine=40108067;
 //BA.debugLineNum = 40108067;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False,";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"",_errormessage);
RDebugUtils.currentLine=40108068;
 //BA.debugLineNum = 40108068;BA.debugLine="LogHttpFailure(url, failureKind)";
__ref._loghttpfailure /*String*/ (null,_url,_failurekind);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=40108070;
 //BA.debugLineNum = 40108070;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=40108071;
 //BA.debugLineNum = 40108071;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=40108072;
 //BA.debugLineNum = 40108072;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchnext(b4j.example.networksyncservice __ref,int _timeoutms,String _appversion,String _startmode,int _playlistindex) throws Exception{
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "fetchnext", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fetchnext", new Object[] {_timeoutms,_appversion,_startmode,_playlistindex}));}
ResumableSub_FetchNext rsub = new ResumableSub_FetchNext(this,__ref,_timeoutms,_appversion,_startmode,_playlistindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchNext extends BA.ResumableSub {
public ResumableSub_FetchNext(b4j.example.networksyncservice parent,b4j.example.networksyncservice __ref,int _timeoutms,String _appversion,String _startmode,int _playlistindex) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
this._appversion = _appversion;
this._startmode = _startmode;
this._playlistindex = _playlistindex;
this.__ref = parent;
}
b4j.example.networksyncservice __ref;
b4j.example.networksyncservice parent;
int _timeoutms;
String _appversion;
String _startmode;
int _playlistindex;
String _url = "";
anywheresoftware.b4a.objects.collections.Map _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="networksyncservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="Dim url As String = stateStore.NextUrlValue & \"?\"";
_url = __ref._statestore /*b4j.example.playerstatestore*/ ._nexturlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,__ref._createnextparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null),_appversion,_startmode,_playlistindex));
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "fetchnext"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=39780355;
 //BA.debugLineNum = 39780355;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=39780356;
 //BA.debugLineNum = 39780356;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _classifyhttpfailure(b4j.example.networksyncservice __ref,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "classifyhttpfailure", false))
	 {return ((String) Debug.delegate(ba, "classifyhttpfailure", new Object[] {_errormessage}));}
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Public Sub ClassifyHttpFailure(errorMessage As Str";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="If IsNetworkHttpError(errorMessage) Then Return \"";
if (__ref._isnetworkhttperror /*boolean*/ (null,_errormessage)) { 
if (true) return "network";};
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="Return \"server\"";
if (true) return "server";
RDebugUtils.currentLine=39911427;
 //BA.debugLineNum = 39911427;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.networksyncservice __ref,anywheresoftware.b4a.BA _ba,b4j.example.playerstatestore _store) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_store}));}
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Public Sub Initialize(store As PlayerStateStore)";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="stateStore = store";
__ref._statestore /*b4j.example.playerstatestore*/  = _store;
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="End Sub";
return "";
}
public String  _loghttpfailure(b4j.example.networksyncservice __ref,String _url,String _kind) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "loghttpfailure", false))
	 {return ((String) Debug.delegate(ba, "loghttpfailure", new Object[] {_url,_kind}));}
int _consecutiveerrors = 0;
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Public Sub LogHttpFailure(url As String, kind As S";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="stateStore.IncrementNetworkErrorCount";
__ref._statestore /*b4j.example.playerstatestore*/ ._incrementnetworkerrorcount /*String*/ (null);
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="Dim consecutiveErrors As Int = stateStore.GetCons";
_consecutiveerrors = __ref._statestore /*b4j.example.playerstatestore*/ ._getconsecutivenetworkerrors /*int*/ (null);
RDebugUtils.currentLine=40042499;
 //BA.debugLineNum = 40042499;BA.debugLine="If url.Contains(\"/data\") Then";
if (_url.contains("/data")) { 
RDebugUtils.currentLine=40042500;
 //BA.debugLineNum = 40042500;BA.debugLine="stateStore.TraceWarn(\"network\", \"data timeout\",";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data timeout","retry="+BA.NumberToString(_consecutiveerrors)+" lastDataOkAgoSec="+__ref._statestore /*b4j.example.playerstatestore*/ ._secondsagotext /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._getlastdataokat /*long*/ (null)));
 }else 
{RDebugUtils.currentLine=40042501;
 //BA.debugLineNum = 40042501;BA.debugLine="Else If url.Contains(\"/history\") Then";
if (_url.contains("/history")) { 
RDebugUtils.currentLine=40042502;
 //BA.debugLineNum = 40042502;BA.debugLine="stateStore.TraceWarn(\"history\", \"ошибка отправки";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"history","ошибка отправки","kind="+_kind);
 }else 
{RDebugUtils.currentLine=40042503;
 //BA.debugLineNum = 40042503;BA.debugLine="Else If url.Contains(\"/next\") Then";
if (_url.contains("/next")) { 
RDebugUtils.currentLine=40042504;
 //BA.debugLineNum = 40042504;BA.debugLine="stateStore.TraceWarn(\"network\", \"ошибка очереди\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","ошибка очереди","kind="+_kind);
 }}}
;
RDebugUtils.currentLine=40042506;
 //BA.debugLineNum = 40042506;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _submitclaim(b4j.example.networksyncservice __ref,int _timeoutms) throws Exception{
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "submitclaim", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "submitclaim", new Object[] {_timeoutms}));}
ResumableSub_SubmitClaim rsub = new ResumableSub_SubmitClaim(this,__ref,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SubmitClaim extends BA.ResumableSub {
public ResumableSub_SubmitClaim(b4j.example.networksyncservice parent,b4j.example.networksyncservice __ref,int _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
this.__ref = parent;
}
b4j.example.networksyncservice __ref;
b4j.example.networksyncservice parent;
int _timeoutms;
String _url = "";
anywheresoftware.b4a.objects.collections.Map _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="networksyncservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="Dim url As String = stateStore.ClaimUrlValue & \"?";
_url = __ref._statestore /*b4j.example.playerstatestore*/ ._claimurlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,__ref._createclaimparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null)));
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "submitclaim"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=39845891;
 //BA.debugLineNum = 39845891;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=39845892;
 //BA.debugLineNum = 39845892;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchdata(b4j.example.networksyncservice __ref,int _timeoutms) throws Exception{
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "fetchdata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fetchdata", new Object[] {_timeoutms}));}
ResumableSub_FetchData rsub = new ResumableSub_FetchData(this,__ref,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchData extends BA.ResumableSub {
public ResumableSub_FetchData(b4j.example.networksyncservice parent,b4j.example.networksyncservice __ref,int _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
this.__ref = parent;
}
b4j.example.networksyncservice __ref;
b4j.example.networksyncservice parent;
int _timeoutms;
String _url = "";
anywheresoftware.b4a.objects.collections.Map _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="networksyncservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="Dim url As String = stateStore.DataUrlValue & \"?\"";
_url = __ref._statestore /*b4j.example.playerstatestore*/ ._dataurlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,__ref._createdataparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._clientosnamevalue /*String*/ (null)));
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "fetchdata"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=39714819;
 //BA.debugLineNum = 39714819;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _urlencode(b4j.example.networksyncservice __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "urlencode", false))
	 {return ((String) Debug.delegate(ba, "urlencode", new Object[] {_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Private Sub UrlEncode(value As Object) As String";
RDebugUtils.currentLine=40501249;
 //BA.debugLineNum = 40501249;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="jo.InitializeStatic(\"java.net.URLEncoder\")";
_jo.InitializeStatic("java.net.URLEncoder");
RDebugUtils.currentLine=40501251;
 //BA.debugLineNum = 40501251;BA.debugLine="Return jo.RunMethod(\"encode\", Array As Object(\"\"";
if (true) return BA.ObjectToString(_jo.RunMethod("encode",new Object[]{(Object)(""+BA.ObjectToString(_value)),(Object)("UTF-8")}));
RDebugUtils.currentLine=40501252;
 //BA.debugLineNum = 40501252;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkserviceavailability(b4j.example.networksyncservice __ref,int _timeoutms) throws Exception{
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "checkserviceavailability", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkserviceavailability", new Object[] {_timeoutms}));}
ResumableSub_CheckServiceAvailability rsub = new ResumableSub_CheckServiceAvailability(this,__ref,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckServiceAvailability extends BA.ResumableSub {
public ResumableSub_CheckServiceAvailability(b4j.example.networksyncservice parent,b4j.example.networksyncservice __ref,int _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._timeoutms = _timeoutms;
this.__ref = parent;
}
b4j.example.networksyncservice __ref;
b4j.example.networksyncservice parent;
int _timeoutms;
b4j.example.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
boolean _ok = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="networksyncservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=39976963;
 //BA.debugLineNum = 39976963;BA.debugLine="Dim params As Map = CreateDataParams(stateStore.P";
_params = new anywheresoftware.b4a.objects.collections.Map();
_params = __ref._createdataparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._clientosnamevalue /*String*/ (null));
RDebugUtils.currentLine=39976964;
 //BA.debugLineNum = 39976964;BA.debugLine="params.Put(\"t\", DateTime.Now)";
_params.Put((Object)("t"),(Object)(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=39976965;
 //BA.debugLineNum = 39976965;BA.debugLine="j.Download(stateStore.ServiceCheckUrlValue & \"?\"";
_j._download /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._servicecheckurlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,_params));
RDebugUtils.currentLine=39976966;
 //BA.debugLineNum = 39976966;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=39976967;
 //BA.debugLineNum = 39976967;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(_timeoutms);
RDebugUtils.currentLine=39976968;
 //BA.debugLineNum = 39976968;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "checkserviceavailability"), (Object)(_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=39976969;
 //BA.debugLineNum = 39976969;BA.debugLine="Dim ok As Boolean = j.Success";
_ok = _j._success /*boolean*/ ;
RDebugUtils.currentLine=39976970;
 //BA.debugLineNum = 39976970;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=39976971;
 //BA.debugLineNum = 39976971;BA.debugLine="Return ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ok));return;};
RDebugUtils.currentLine=39976972;
 //BA.debugLineNum = 39976972;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.Map  _createdataparams(b4j.example.networksyncservice __ref,String _playercode,String _deviceid,int _timezoneoffsetminutes,String _clientosname) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "createdataparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createdataparams", new Object[] {_playercode,_deviceid,_timezoneoffsetminutes,_clientosname}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Public Sub CreateDataParams(playerCode As String,";
RDebugUtils.currentLine=40304641;
 //BA.debugLineNum = 40304641;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=40304642;
 //BA.debugLineNum = 40304642;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=40304643;
 //BA.debugLineNum = 40304643;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
RDebugUtils.currentLine=40304644;
 //BA.debugLineNum = 40304644;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
RDebugUtils.currentLine=40304645;
 //BA.debugLineNum = 40304645;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
RDebugUtils.currentLine=40304646;
 //BA.debugLineNum = 40304646;BA.debugLine="params.Put(\"os\", clientOsName)";
_params.Put((Object)("os"),(Object)(_clientosname));
RDebugUtils.currentLine=40304647;
 //BA.debugLineNum = 40304647;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=40304648;
 //BA.debugLineNum = 40304648;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.networksyncservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4j.example.playerstatestore();
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="End Sub";
return "";
}
public boolean  _isnetworkhttperror(b4j.example.networksyncservice __ref,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "isnetworkhttperror", false))
	 {return ((Boolean) Debug.delegate(ba, "isnetworkhttperror", new Object[] {_errormessage}));}
String _messagelower = "";
RDebugUtils.currentLine=86376448;
 //BA.debugLineNum = 86376448;BA.debugLine="Private Sub IsNetworkHttpError(errorMessage As Str";
RDebugUtils.currentLine=86376449;
 //BA.debugLineNum = 86376449;BA.debugLine="Dim messageLower As String = errorMessage.ToLower";
_messagelower = _errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=86376450;
 //BA.debugLineNum = 86376450;BA.debugLine="Return messageLower.Contains(\"timed out\") Or mess";
if (true) return _messagelower.contains("timed out") || _messagelower.contains("timeout") || _messagelower.contains("unknownhost") || _messagelower.contains("unreachable") || _messagelower.contains("refused") || _messagelower.contains("reset") || _messagelower.contains("failed to connect") || _messagelower.contains("no route");
RDebugUtils.currentLine=86376451;
 //BA.debugLineNum = 86376451;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _createclaimparams(b4j.example.networksyncservice __ref,String _playercode,String _deviceid,int _timezoneoffsetminutes) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "createclaimparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createclaimparams", new Object[] {_playercode,_deviceid,_timezoneoffsetminutes}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Public Sub CreateClaimParams(playerCode As String,";
RDebugUtils.currentLine=40239105;
 //BA.debugLineNum = 40239105;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=40239107;
 //BA.debugLineNum = 40239107;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
RDebugUtils.currentLine=40239108;
 //BA.debugLineNum = 40239108;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
RDebugUtils.currentLine=40239109;
 //BA.debugLineNum = 40239109;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
RDebugUtils.currentLine=40239110;
 //BA.debugLineNum = 40239110;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=40239111;
 //BA.debugLineNum = 40239111;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createnextparams(b4j.example.networksyncservice __ref,String _playercode,String _deviceid,int _timezoneoffsetminutes,String _appversion,String _startmode,int _playlistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "createnextparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createnextparams", new Object[] {_playercode,_deviceid,_timezoneoffsetminutes,_appversion,_startmode,_playlistindex}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Public Sub CreateNextParams(playerCode As String,";
RDebugUtils.currentLine=40173569;
 //BA.debugLineNum = 40173569;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=40173571;
 //BA.debugLineNum = 40173571;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
RDebugUtils.currentLine=40173572;
 //BA.debugLineNum = 40173572;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
RDebugUtils.currentLine=40173573;
 //BA.debugLineNum = 40173573;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
RDebugUtils.currentLine=40173574;
 //BA.debugLineNum = 40173574;BA.debugLine="params.Put(\"version\", appVersion)";
_params.Put((Object)("version"),(Object)(_appversion));
RDebugUtils.currentLine=40173575;
 //BA.debugLineNum = 40173575;BA.debugLine="If startMode = \"manual\" Or startMode = \"auto\" The";
if ((_startmode).equals("manual") || (_startmode).equals("auto")) { 
_params.Put((Object)("start"),(Object)(_startmode));};
RDebugUtils.currentLine=40173576;
 //BA.debugLineNum = 40173576;BA.debugLine="If playlistIndex >= 0 Then params.Put(\"playlist\",";
if (_playlistindex>=0) { 
_params.Put((Object)("playlist"),(Object)(_playlistindex));};
RDebugUtils.currentLine=40173577;
 //BA.debugLineNum = 40173577;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=40173578;
 //BA.debugLineNum = 40173578;BA.debugLine="End Sub";
return null;
}
}