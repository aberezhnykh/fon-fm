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
RDebugUtils.currentLine=79953920;
 //BA.debugLineNum = 79953920;BA.debugLine="Public Sub BuildParams(params As Map) As String";
RDebugUtils.currentLine=79953921;
 //BA.debugLineNum = 79953921;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=79953922;
 //BA.debugLineNum = 79953922;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=79953923;
 //BA.debugLineNum = 79953923;BA.debugLine="For Each key As String In params.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _params.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=79953924;
 //BA.debugLineNum = 79953924;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
if (_sb.getLength()>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=79953925;
 //BA.debugLineNum = 79953925;BA.debugLine="sb.Append(UrlEncode(key)).Append(\"=\").Append(Url";
_sb.Append(__ref._urlencode /*String*/ (null,(Object)(_key))).Append("=").Append(__ref._urlencode /*String*/ (null,_params.Get((Object)(_key))));
 }
};
RDebugUtils.currentLine=79953927;
 //BA.debugLineNum = 79953927;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=79953928;
 //BA.debugLineNum = 79953928;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=79691777;
 //BA.debugLineNum = 79691777;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=79691778;
 //BA.debugLineNum = 79691778;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=79691779;
 //BA.debugLineNum = 79691779;BA.debugLine="result.Put(\"Success\", False)";
_result.Put((Object)("Success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=79691780;
 //BA.debugLineNum = 79691780;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=79691781;
 //BA.debugLineNum = 79691781;BA.debugLine="result.Put(\"Data\", Null)";
_result.Put((Object)("Data"),parent.__c.Null);
RDebugUtils.currentLine=79691782;
 //BA.debugLineNum = 79691782;BA.debugLine="result.Put(\"ErrorMessage\", \"\")";
_result.Put((Object)("ErrorMessage"),(Object)(""));
RDebugUtils.currentLine=79691783;
 //BA.debugLineNum = 79691783;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=79691784;
 //BA.debugLineNum = 79691784;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=79691785;
 //BA.debugLineNum = 79691785;BA.debugLine="stateStore.TraceLog(\"http get начало timeoutMs=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"http get начало timeoutMs="+BA.NumberToString(_timeoutms)+" url="+_url);
RDebugUtils.currentLine=79691786;
 //BA.debugLineNum = 79691786;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=79691787;
 //BA.debugLineNum = 79691787;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=79691788;
 //BA.debugLineNum = 79691788;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(_timeoutms);
RDebugUtils.currentLine=79691789;
 //BA.debugLineNum = 79691789;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "fetchjsonwithtimeout"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=79691790;
 //BA.debugLineNum = 79691790;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=79691791;
 //BA.debugLineNum = 79691791;BA.debugLine="Try";
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
RDebugUtils.currentLine=79691792;
 //BA.debugLineNum = 79691792;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=79691793;
 //BA.debugLineNum = 79691793;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, True,";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=79691794;
 //BA.debugLineNum = 79691794;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=79691795;
 //BA.debugLineNum = 79691795;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
RDebugUtils.currentLine=79691796;
 //BA.debugLineNum = 79691796;BA.debugLine="result.Put(\"Data\", parser.NextObject)";
_result.Put((Object)("Data"),(Object)(_parser.NextObject().getObject()));
RDebugUtils.currentLine=79691797;
 //BA.debugLineNum = 79691797;BA.debugLine="result.Put(\"Success\", True)";
_result.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=79691798;
 //BA.debugLineNum = 79691798;BA.debugLine="result.Put(\"Kind\", \"\")";
_result.Put((Object)("Kind"),(Object)(""));
RDebugUtils.currentLine=79691799;
 //BA.debugLineNum = 79691799;BA.debugLine="stateStore.TraceLog(\"http get итог success=true";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"http get итог success=true url="+_url);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=79691801;
 //BA.debugLineNum = 79691801;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=79691802;
 //BA.debugLineNum = 79691802;BA.debugLine="result.Put(\"ErrorMessage\", \"bad_json\")";
_result.Put((Object)("ErrorMessage"),(Object)("bad_json"));
RDebugUtils.currentLine=79691803;
 //BA.debugLineNum = 79691803;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"","bad_json");
RDebugUtils.currentLine=79691804;
 //BA.debugLineNum = 79691804;BA.debugLine="stateStore.TraceLog(\"http get ошибка kind=serve";
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
RDebugUtils.currentLine=79691807;
 //BA.debugLineNum = 79691807;BA.debugLine="Dim errorMessage As String = j.ErrorMessage";
_errormessage = _j._errormessage /*String*/ ;
RDebugUtils.currentLine=79691808;
 //BA.debugLineNum = 79691808;BA.debugLine="result.Put(\"ErrorMessage\", errorMessage)";
_result.Put((Object)("ErrorMessage"),(Object)(_errormessage));
RDebugUtils.currentLine=79691809;
 //BA.debugLineNum = 79691809;BA.debugLine="Dim failureKind As String = ClassifyHttpFailure(";
_failurekind = __ref._classifyhttpfailure /*String*/ (null,_errormessage);
RDebugUtils.currentLine=79691810;
 //BA.debugLineNum = 79691810;BA.debugLine="result.Put(\"Kind\", failureKind)";
_result.Put((Object)("Kind"),(Object)(_failurekind));
RDebugUtils.currentLine=79691811;
 //BA.debugLineNum = 79691811;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False,";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"",_errormessage);
RDebugUtils.currentLine=79691812;
 //BA.debugLineNum = 79691812;BA.debugLine="LogHttpFailure(url, failureKind)";
__ref._loghttpfailure /*String*/ (null,_url,_failurekind);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=79691814;
 //BA.debugLineNum = 79691814;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=79691815;
 //BA.debugLineNum = 79691815;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=79691816;
 //BA.debugLineNum = 79691816;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=79364097;
 //BA.debugLineNum = 79364097;BA.debugLine="Dim url As String = stateStore.NextUrlValue & \"?\"";
_url = __ref._statestore /*b4j.example.playerstatestore*/ ._nexturlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,__ref._createnextparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null),_appversion,_startmode,_playlistindex));
RDebugUtils.currentLine=79364098;
 //BA.debugLineNum = 79364098;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "fetchnext"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=79364099;
 //BA.debugLineNum = 79364099;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=79364100;
 //BA.debugLineNum = 79364100;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=79495168;
 //BA.debugLineNum = 79495168;BA.debugLine="Public Sub ClassifyHttpFailure(errorMessage As Str";
RDebugUtils.currentLine=79495169;
 //BA.debugLineNum = 79495169;BA.debugLine="If IsOfflineHttpError(errorMessage) Then Return \"";
if (__ref._isofflinehttperror /*boolean*/ (null,_errormessage)) { 
if (true) return "offline";};
RDebugUtils.currentLine=79495170;
 //BA.debugLineNum = 79495170;BA.debugLine="Return \"server\"";
if (true) return "server";
RDebugUtils.currentLine=79495171;
 //BA.debugLineNum = 79495171;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.networksyncservice __ref,anywheresoftware.b4a.BA _ba,b4j.example.playerstatestore _store) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_store}));}
RDebugUtils.currentLine=79233024;
 //BA.debugLineNum = 79233024;BA.debugLine="Public Sub Initialize(store As PlayerStateStore)";
RDebugUtils.currentLine=79233025;
 //BA.debugLineNum = 79233025;BA.debugLine="stateStore = store";
__ref._statestore /*b4j.example.playerstatestore*/  = _store;
RDebugUtils.currentLine=79233026;
 //BA.debugLineNum = 79233026;BA.debugLine="End Sub";
return "";
}
public String  _loghttpfailure(b4j.example.networksyncservice __ref,String _url,String _kind) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "loghttpfailure", false))
	 {return ((String) Debug.delegate(ba, "loghttpfailure", new Object[] {_url,_kind}));}
int _consecutiveerrors = 0;
RDebugUtils.currentLine=79626240;
 //BA.debugLineNum = 79626240;BA.debugLine="Public Sub LogHttpFailure(url As String, kind As S";
RDebugUtils.currentLine=79626241;
 //BA.debugLineNum = 79626241;BA.debugLine="stateStore.IncrementNetworkErrorCount";
__ref._statestore /*b4j.example.playerstatestore*/ ._incrementnetworkerrorcount /*String*/ (null);
RDebugUtils.currentLine=79626242;
 //BA.debugLineNum = 79626242;BA.debugLine="Dim consecutiveErrors As Int = stateStore.GetCons";
_consecutiveerrors = __ref._statestore /*b4j.example.playerstatestore*/ ._getconsecutivenetworkerrors /*int*/ (null);
RDebugUtils.currentLine=79626243;
 //BA.debugLineNum = 79626243;BA.debugLine="If url.Contains(\"/data\") Then";
if (_url.contains("/data")) { 
RDebugUtils.currentLine=79626244;
 //BA.debugLineNum = 79626244;BA.debugLine="stateStore.TraceWarn(\"network\", \"data timeout\",";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data timeout","retry="+BA.NumberToString(_consecutiveerrors)+" lastDataOkAgoSec="+__ref._statestore /*b4j.example.playerstatestore*/ ._secondsagotext /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._getlastdataokat /*long*/ (null)));
 }else 
{RDebugUtils.currentLine=79626245;
 //BA.debugLineNum = 79626245;BA.debugLine="Else If url.Contains(\"/history\") Then";
if (_url.contains("/history")) { 
RDebugUtils.currentLine=79626246;
 //BA.debugLineNum = 79626246;BA.debugLine="stateStore.TraceWarn(\"history\", \"ошибка отправки";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"history","ошибка отправки","kind="+_kind);
 }else 
{RDebugUtils.currentLine=79626247;
 //BA.debugLineNum = 79626247;BA.debugLine="Else If url.Contains(\"/next\") Then";
if (_url.contains("/next")) { 
RDebugUtils.currentLine=79626248;
 //BA.debugLineNum = 79626248;BA.debugLine="stateStore.TraceWarn(\"network\", \"ошибка очереди\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","ошибка очереди","kind="+_kind);
 }}}
;
RDebugUtils.currentLine=79626250;
 //BA.debugLineNum = 79626250;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=79429633;
 //BA.debugLineNum = 79429633;BA.debugLine="Dim url As String = stateStore.ClaimUrlValue & \"?";
_url = __ref._statestore /*b4j.example.playerstatestore*/ ._claimurlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,__ref._createclaimparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null)));
RDebugUtils.currentLine=79429634;
 //BA.debugLineNum = 79429634;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "submitclaim"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=79429635;
 //BA.debugLineNum = 79429635;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=79429636;
 //BA.debugLineNum = 79429636;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=80084992;
 //BA.debugLineNum = 80084992;BA.debugLine="Private Sub UrlEncode(value As Object) As String";
RDebugUtils.currentLine=80084993;
 //BA.debugLineNum = 80084993;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=80084994;
 //BA.debugLineNum = 80084994;BA.debugLine="jo.InitializeStatic(\"java.net.URLEncoder\")";
_jo.InitializeStatic("java.net.URLEncoder");
RDebugUtils.currentLine=80084995;
 //BA.debugLineNum = 80084995;BA.debugLine="Return jo.RunMethod(\"encode\", Array As Object(\"\"";
if (true) return BA.ObjectToString(_jo.RunMethod("encode",new Object[]{(Object)(""+BA.ObjectToString(_value)),(Object)("UTF-8")}));
RDebugUtils.currentLine=80084996;
 //BA.debugLineNum = 80084996;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=79560705;
 //BA.debugLineNum = 79560705;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=79560706;
 //BA.debugLineNum = 79560706;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=79560707;
 //BA.debugLineNum = 79560707;BA.debugLine="Dim params As Map = CreateDataParams(stateStore.P";
_params = new anywheresoftware.b4a.objects.collections.Map();
_params = __ref._createdataparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._clientosnamevalue /*String*/ (null));
RDebugUtils.currentLine=79560708;
 //BA.debugLineNum = 79560708;BA.debugLine="params.Put(\"t\", DateTime.Now)";
_params.Put((Object)("t"),(Object)(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=79560709;
 //BA.debugLineNum = 79560709;BA.debugLine="j.Download(stateStore.ServiceCheckUrlValue & \"?\"";
_j._download /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._servicecheckurlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,_params));
RDebugUtils.currentLine=79560710;
 //BA.debugLineNum = 79560710;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=79560711;
 //BA.debugLineNum = 79560711;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(_timeoutms);
RDebugUtils.currentLine=79560712;
 //BA.debugLineNum = 79560712;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "checkserviceavailability"), (Object)(_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=79560713;
 //BA.debugLineNum = 79560713;BA.debugLine="Dim ok As Boolean = j.Success";
_ok = _j._success /*boolean*/ ;
RDebugUtils.currentLine=79560714;
 //BA.debugLineNum = 79560714;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=79560715;
 //BA.debugLineNum = 79560715;BA.debugLine="Return ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ok));return;};
RDebugUtils.currentLine=79560716;
 //BA.debugLineNum = 79560716;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=79888384;
 //BA.debugLineNum = 79888384;BA.debugLine="Public Sub CreateDataParams(playerCode As String,";
RDebugUtils.currentLine=79888385;
 //BA.debugLineNum = 79888385;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=79888386;
 //BA.debugLineNum = 79888386;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=79888387;
 //BA.debugLineNum = 79888387;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
RDebugUtils.currentLine=79888388;
 //BA.debugLineNum = 79888388;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
RDebugUtils.currentLine=79888389;
 //BA.debugLineNum = 79888389;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
RDebugUtils.currentLine=79888390;
 //BA.debugLineNum = 79888390;BA.debugLine="params.Put(\"os\", clientOsName)";
_params.Put((Object)("os"),(Object)(_clientosname));
RDebugUtils.currentLine=79888391;
 //BA.debugLineNum = 79888391;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=79888392;
 //BA.debugLineNum = 79888392;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.networksyncservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
RDebugUtils.currentLine=79167488;
 //BA.debugLineNum = 79167488;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=79167489;
 //BA.debugLineNum = 79167489;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4j.example.playerstatestore();
RDebugUtils.currentLine=79167490;
 //BA.debugLineNum = 79167490;BA.debugLine="End Sub";
return "";
}
public boolean  _isofflinehttperror(b4j.example.networksyncservice __ref,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "isofflinehttperror", false))
	 {return ((Boolean) Debug.delegate(ba, "isofflinehttperror", new Object[] {_errormessage}));}
String _messagelower = "";
RDebugUtils.currentLine=80019456;
 //BA.debugLineNum = 80019456;BA.debugLine="Private Sub IsOfflineHttpError(errorMessage As Str";
RDebugUtils.currentLine=80019457;
 //BA.debugLineNum = 80019457;BA.debugLine="Dim messageLower As String = errorMessage.ToLower";
_messagelower = _errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=80019458;
 //BA.debugLineNum = 80019458;BA.debugLine="Return messageLower.Contains(\"timed out\") Or mess";
if (true) return _messagelower.contains("timed out") || _messagelower.contains("timeout") || _messagelower.contains("unknownhost") || _messagelower.contains("unreachable") || _messagelower.contains("refused") || _messagelower.contains("reset") || _messagelower.contains("failed to connect") || _messagelower.contains("no route");
RDebugUtils.currentLine=80019459;
 //BA.debugLineNum = 80019459;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _createclaimparams(b4j.example.networksyncservice __ref,String _playercode,String _deviceid,int _timezoneoffsetminutes) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "createclaimparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createclaimparams", new Object[] {_playercode,_deviceid,_timezoneoffsetminutes}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=79822848;
 //BA.debugLineNum = 79822848;BA.debugLine="Public Sub CreateClaimParams(playerCode As String,";
RDebugUtils.currentLine=79822849;
 //BA.debugLineNum = 79822849;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=79822850;
 //BA.debugLineNum = 79822850;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=79822851;
 //BA.debugLineNum = 79822851;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
RDebugUtils.currentLine=79822852;
 //BA.debugLineNum = 79822852;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
RDebugUtils.currentLine=79822853;
 //BA.debugLineNum = 79822853;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
RDebugUtils.currentLine=79822854;
 //BA.debugLineNum = 79822854;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=79822855;
 //BA.debugLineNum = 79822855;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createnextparams(b4j.example.networksyncservice __ref,String _playercode,String _deviceid,int _timezoneoffsetminutes,String _appversion,String _startmode,int _playlistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "createnextparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createnextparams", new Object[] {_playercode,_deviceid,_timezoneoffsetminutes,_appversion,_startmode,_playlistindex}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=79757312;
 //BA.debugLineNum = 79757312;BA.debugLine="Public Sub CreateNextParams(playerCode As String,";
RDebugUtils.currentLine=79757313;
 //BA.debugLineNum = 79757313;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=79757314;
 //BA.debugLineNum = 79757314;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=79757315;
 //BA.debugLineNum = 79757315;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
RDebugUtils.currentLine=79757316;
 //BA.debugLineNum = 79757316;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
RDebugUtils.currentLine=79757317;
 //BA.debugLineNum = 79757317;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
RDebugUtils.currentLine=79757318;
 //BA.debugLineNum = 79757318;BA.debugLine="params.Put(\"version\", appVersion)";
_params.Put((Object)("version"),(Object)(_appversion));
RDebugUtils.currentLine=79757319;
 //BA.debugLineNum = 79757319;BA.debugLine="If startMode = \"manual\" Or startMode = \"auto\" The";
if ((_startmode).equals("manual") || (_startmode).equals("auto")) { 
_params.Put((Object)("start"),(Object)(_startmode));};
RDebugUtils.currentLine=79757320;
 //BA.debugLineNum = 79757320;BA.debugLine="If playlistIndex >= 0 Then params.Put(\"playlist\",";
if (_playlistindex>=0) { 
_params.Put((Object)("playlist"),(Object)(_playlistindex));};
RDebugUtils.currentLine=79757321;
 //BA.debugLineNum = 79757321;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=79757322;
 //BA.debugLineNum = 79757322;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=79298561;
 //BA.debugLineNum = 79298561;BA.debugLine="Dim url As String = stateStore.DataUrlValue & \"?\"";
_url = __ref._statestore /*b4j.example.playerstatestore*/ ._dataurlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,__ref._createdataparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._clientosnamevalue /*String*/ (null)));
RDebugUtils.currentLine=79298562;
 //BA.debugLineNum = 79298562;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "fetchdata"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=79298563;
 //BA.debugLineNum = 79298563;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=79298564;
 //BA.debugLineNum = 79298564;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}