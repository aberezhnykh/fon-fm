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
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Public Sub BuildParams(params As Map) As String";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=47185923;
 //BA.debugLineNum = 47185923;BA.debugLine="For Each key As String In params.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _params.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=47185924;
 //BA.debugLineNum = 47185924;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
if (_sb.getLength()>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=47185925;
 //BA.debugLineNum = 47185925;BA.debugLine="sb.Append(UrlEncode(key)).Append(\"=\").Append(Url";
_sb.Append(__ref._urlencode /*String*/ (null,(Object)(_key))).Append("=").Append(__ref._urlencode /*String*/ (null,_params.Get((Object)(_key))));
 }
};
RDebugUtils.currentLine=47185927;
 //BA.debugLineNum = 47185927;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=47185928;
 //BA.debugLineNum = 47185928;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=46923779;
 //BA.debugLineNum = 46923779;BA.debugLine="result.Put(\"Success\", False)";
_result.Put((Object)("Success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=46923780;
 //BA.debugLineNum = 46923780;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=46923781;
 //BA.debugLineNum = 46923781;BA.debugLine="result.Put(\"Data\", Null)";
_result.Put((Object)("Data"),parent.__c.Null);
RDebugUtils.currentLine=46923782;
 //BA.debugLineNum = 46923782;BA.debugLine="result.Put(\"ErrorMessage\", \"\")";
_result.Put((Object)("ErrorMessage"),(Object)(""));
RDebugUtils.currentLine=46923783;
 //BA.debugLineNum = 46923783;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=46923784;
 //BA.debugLineNum = 46923784;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=46923785;
 //BA.debugLineNum = 46923785;BA.debugLine="stateStore.TraceLog(\"http get начало timeoutMs=\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"http get начало timeoutMs="+BA.NumberToString(_timeoutms)+" url="+_url);
RDebugUtils.currentLine=46923786;
 //BA.debugLineNum = 46923786;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=46923787;
 //BA.debugLineNum = 46923787;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=46923788;
 //BA.debugLineNum = 46923788;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(_timeoutms);
RDebugUtils.currentLine=46923789;
 //BA.debugLineNum = 46923789;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "fetchjsonwithtimeout"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=46923790;
 //BA.debugLineNum = 46923790;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=46923791;
 //BA.debugLineNum = 46923791;BA.debugLine="Try";
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
RDebugUtils.currentLine=46923792;
 //BA.debugLineNum = 46923792;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=46923793;
 //BA.debugLineNum = 46923793;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, True,";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=46923794;
 //BA.debugLineNum = 46923794;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=46923795;
 //BA.debugLineNum = 46923795;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
RDebugUtils.currentLine=46923796;
 //BA.debugLineNum = 46923796;BA.debugLine="result.Put(\"Data\", parser.NextObject)";
_result.Put((Object)("Data"),(Object)(_parser.NextObject().getObject()));
RDebugUtils.currentLine=46923797;
 //BA.debugLineNum = 46923797;BA.debugLine="result.Put(\"Success\", True)";
_result.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=46923798;
 //BA.debugLineNum = 46923798;BA.debugLine="result.Put(\"Kind\", \"\")";
_result.Put((Object)("Kind"),(Object)(""));
RDebugUtils.currentLine=46923799;
 //BA.debugLineNum = 46923799;BA.debugLine="stateStore.TraceLog(\"http get итог success=true";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracelog /*String*/ (null,"http get итог success=true url="+_url);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=46923801;
 //BA.debugLineNum = 46923801;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=46923802;
 //BA.debugLineNum = 46923802;BA.debugLine="result.Put(\"ErrorMessage\", \"bad_json\")";
_result.Put((Object)("ErrorMessage"),(Object)("bad_json"));
RDebugUtils.currentLine=46923803;
 //BA.debugLineNum = 46923803;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"","bad_json");
RDebugUtils.currentLine=46923804;
 //BA.debugLineNum = 46923804;BA.debugLine="stateStore.TraceLog(\"http get ошибка kind=serve";
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
RDebugUtils.currentLine=46923807;
 //BA.debugLineNum = 46923807;BA.debugLine="Dim errorMessage As String = j.ErrorMessage";
_errormessage = _j._errormessage /*String*/ ;
RDebugUtils.currentLine=46923808;
 //BA.debugLineNum = 46923808;BA.debugLine="result.Put(\"ErrorMessage\", errorMessage)";
_result.Put((Object)("ErrorMessage"),(Object)(_errormessage));
RDebugUtils.currentLine=46923809;
 //BA.debugLineNum = 46923809;BA.debugLine="Dim failureKind As String = ClassifyHttpFailure(";
_failurekind = __ref._classifyhttpfailure /*String*/ (null,_errormessage);
RDebugUtils.currentLine=46923810;
 //BA.debugLineNum = 46923810;BA.debugLine="result.Put(\"Kind\", failureKind)";
_result.Put((Object)("Kind"),(Object)(_failurekind));
RDebugUtils.currentLine=46923811;
 //BA.debugLineNum = 46923811;BA.debugLine="stateStore.SaveServerSnapshot(\"GET\", url, False,";
__ref._statestore /*b4j.example.playerstatestore*/ ._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"",_errormessage);
RDebugUtils.currentLine=46923812;
 //BA.debugLineNum = 46923812;BA.debugLine="LogHttpFailure(url, failureKind)";
__ref._loghttpfailure /*String*/ (null,_url,_failurekind);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=46923814;
 //BA.debugLineNum = 46923814;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=46923815;
 //BA.debugLineNum = 46923815;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=46923816;
 //BA.debugLineNum = 46923816;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="Dim url As String = stateStore.NextUrlValue & \"?\"";
_url = __ref._statestore /*b4j.example.playerstatestore*/ ._nexturlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,__ref._createnextparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null),_appversion,_startmode,_playlistindex));
RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "fetchnext"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=46596100;
 //BA.debugLineNum = 46596100;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Public Sub ClassifyHttpFailure(errorMessage As Str";
RDebugUtils.currentLine=46727169;
 //BA.debugLineNum = 46727169;BA.debugLine="If IsNetworkHttpError(errorMessage) Then Return \"";
if (__ref._isnetworkhttperror /*boolean*/ (null,_errormessage)) { 
if (true) return "network";};
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="Return \"server\"";
if (true) return "server";
RDebugUtils.currentLine=46727171;
 //BA.debugLineNum = 46727171;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.networksyncservice __ref,anywheresoftware.b4a.BA _ba,b4j.example.playerstatestore _store) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_store}));}
RDebugUtils.currentLine=46465024;
 //BA.debugLineNum = 46465024;BA.debugLine="Public Sub Initialize(store As PlayerStateStore)";
RDebugUtils.currentLine=46465025;
 //BA.debugLineNum = 46465025;BA.debugLine="stateStore = store";
__ref._statestore /*b4j.example.playerstatestore*/  = _store;
RDebugUtils.currentLine=46465026;
 //BA.debugLineNum = 46465026;BA.debugLine="End Sub";
return "";
}
public String  _loghttpfailure(b4j.example.networksyncservice __ref,String _url,String _kind) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "loghttpfailure", false))
	 {return ((String) Debug.delegate(ba, "loghttpfailure", new Object[] {_url,_kind}));}
int _consecutiveerrors = 0;
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Public Sub LogHttpFailure(url As String, kind As S";
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="stateStore.IncrementNetworkErrorCount";
__ref._statestore /*b4j.example.playerstatestore*/ ._incrementnetworkerrorcount /*String*/ (null);
RDebugUtils.currentLine=46858242;
 //BA.debugLineNum = 46858242;BA.debugLine="Dim consecutiveErrors As Int = stateStore.GetCons";
_consecutiveerrors = __ref._statestore /*b4j.example.playerstatestore*/ ._getconsecutivenetworkerrors /*int*/ (null);
RDebugUtils.currentLine=46858243;
 //BA.debugLineNum = 46858243;BA.debugLine="If url.Contains(\"/data\") Then";
if (_url.contains("/data")) { 
RDebugUtils.currentLine=46858244;
 //BA.debugLineNum = 46858244;BA.debugLine="stateStore.TraceWarn(\"network\", \"data timeout\",";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","data timeout","retry="+BA.NumberToString(_consecutiveerrors)+" lastDataOkAgoSec="+__ref._statestore /*b4j.example.playerstatestore*/ ._secondsagotext /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._getlastdataokat /*long*/ (null)));
 }else 
{RDebugUtils.currentLine=46858245;
 //BA.debugLineNum = 46858245;BA.debugLine="Else If url.Contains(\"/history\") Then";
if (_url.contains("/history")) { 
RDebugUtils.currentLine=46858246;
 //BA.debugLineNum = 46858246;BA.debugLine="stateStore.TraceWarn(\"history\", \"ошибка отправки";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"history","ошибка отправки","kind="+_kind);
 }else 
{RDebugUtils.currentLine=46858247;
 //BA.debugLineNum = 46858247;BA.debugLine="Else If url.Contains(\"/next\") Then";
if (_url.contains("/next")) { 
RDebugUtils.currentLine=46858248;
 //BA.debugLineNum = 46858248;BA.debugLine="stateStore.TraceWarn(\"network\", \"ошибка очереди\"";
__ref._statestore /*b4j.example.playerstatestore*/ ._tracewarn /*String*/ (null,"network","ошибка очереди","kind="+_kind);
 }}}
;
RDebugUtils.currentLine=46858250;
 //BA.debugLineNum = 46858250;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46661633;
 //BA.debugLineNum = 46661633;BA.debugLine="Dim url As String = stateStore.ClaimUrlValue & \"?";
_url = __ref._statestore /*b4j.example.playerstatestore*/ ._claimurlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,__ref._createclaimparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null)));
RDebugUtils.currentLine=46661634;
 //BA.debugLineNum = 46661634;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "submitclaim"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=46661635;
 //BA.debugLineNum = 46661635;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=46661636;
 //BA.debugLineNum = 46661636;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="Dim url As String = stateStore.DataUrlValue & \"?\"";
_url = __ref._statestore /*b4j.example.playerstatestore*/ ._dataurlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,__ref._createdataparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._clientosnamevalue /*String*/ (null)));
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="Wait For (FetchJsonWithTimeout(url, timeoutMs)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "fetchdata"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=46530563;
 //BA.debugLineNum = 46530563;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=46530564;
 //BA.debugLineNum = 46530564;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Private Sub UrlEncode(value As Object) As String";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="jo.InitializeStatic(\"java.net.URLEncoder\")";
_jo.InitializeStatic("java.net.URLEncoder");
RDebugUtils.currentLine=47316995;
 //BA.debugLineNum = 47316995;BA.debugLine="Return jo.RunMethod(\"encode\", Array As Object(\"\"";
if (true) return BA.ObjectToString(_jo.RunMethod("encode",new Object[]{(Object)(""+BA.ObjectToString(_value)),(Object)("UTF-8")}));
RDebugUtils.currentLine=47316996;
 //BA.debugLineNum = 47316996;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=46792707;
 //BA.debugLineNum = 46792707;BA.debugLine="Dim params As Map = CreateDataParams(stateStore.P";
_params = new anywheresoftware.b4a.objects.collections.Map();
_params = __ref._createdataparams /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._playercodevalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._deviceidvalue /*String*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._timezoneoffsetminutesvalue /*int*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._clientosnamevalue /*String*/ (null));
RDebugUtils.currentLine=46792708;
 //BA.debugLineNum = 46792708;BA.debugLine="params.Put(\"t\", DateTime.Now)";
_params.Put((Object)("t"),(Object)(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=46792709;
 //BA.debugLineNum = 46792709;BA.debugLine="j.Download(stateStore.ServiceCheckUrlValue & \"?\"";
_j._download /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._servicecheckurlvalue /*String*/ (null)+"?"+__ref._buildparams /*String*/ (null,_params));
RDebugUtils.currentLine=46792710;
 //BA.debugLineNum = 46792710;BA.debugLine="stateStore.ApplyClientRequestHeaders(j)";
__ref._statestore /*b4j.example.playerstatestore*/ ._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=46792711;
 //BA.debugLineNum = 46792711;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(_timeoutms);
RDebugUtils.currentLine=46792712;
 //BA.debugLineNum = 46792712;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "networksyncservice", "checkserviceavailability"), (Object)(_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=46792713;
 //BA.debugLineNum = 46792713;BA.debugLine="Dim ok As Boolean = j.Success";
_ok = _j._success /*boolean*/ ;
RDebugUtils.currentLine=46792714;
 //BA.debugLineNum = 46792714;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=46792715;
 //BA.debugLineNum = 46792715;BA.debugLine="Return ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ok));return;};
RDebugUtils.currentLine=46792716;
 //BA.debugLineNum = 46792716;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Public Sub CreateDataParams(playerCode As String,";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=47120387;
 //BA.debugLineNum = 47120387;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
RDebugUtils.currentLine=47120388;
 //BA.debugLineNum = 47120388;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
RDebugUtils.currentLine=47120389;
 //BA.debugLineNum = 47120389;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
RDebugUtils.currentLine=47120390;
 //BA.debugLineNum = 47120390;BA.debugLine="params.Put(\"os\", clientOsName)";
_params.Put((Object)("os"),(Object)(_clientosname));
RDebugUtils.currentLine=47120391;
 //BA.debugLineNum = 47120391;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=47120392;
 //BA.debugLineNum = 47120392;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.networksyncservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
RDebugUtils.currentLine=46399488;
 //BA.debugLineNum = 46399488;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=46399489;
 //BA.debugLineNum = 46399489;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4j.example.playerstatestore();
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="End Sub";
return "";
}
public boolean  _isnetworkhttperror(b4j.example.networksyncservice __ref,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "isnetworkhttperror", false))
	 {return ((Boolean) Debug.delegate(ba, "isnetworkhttperror", new Object[] {_errormessage}));}
String _messagelower = "";
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Private Sub IsNetworkHttpError(errorMessage As Str";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="Dim messageLower As String = errorMessage.ToLower";
_messagelower = _errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="Return messageLower.Contains(\"timed out\") Or mess";
if (true) return _messagelower.contains("timed out") || _messagelower.contains("timeout") || _messagelower.contains("unknownhost") || _messagelower.contains("unreachable") || _messagelower.contains("refused") || _messagelower.contains("reset") || _messagelower.contains("failed to connect") || _messagelower.contains("no route");
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _createclaimparams(b4j.example.networksyncservice __ref,String _playercode,String _deviceid,int _timezoneoffsetminutes) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "createclaimparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createclaimparams", new Object[] {_playercode,_deviceid,_timezoneoffsetminutes}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Public Sub CreateClaimParams(playerCode As String,";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=47054851;
 //BA.debugLineNum = 47054851;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
RDebugUtils.currentLine=47054852;
 //BA.debugLineNum = 47054852;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
RDebugUtils.currentLine=47054853;
 //BA.debugLineNum = 47054853;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
RDebugUtils.currentLine=47054854;
 //BA.debugLineNum = 47054854;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=47054855;
 //BA.debugLineNum = 47054855;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createnextparams(b4j.example.networksyncservice __ref,String _playercode,String _deviceid,int _timezoneoffsetminutes,String _appversion,String _startmode,int _playlistindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="networksyncservice";
if (Debug.shouldDelegate(ba, "createnextparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createnextparams", new Object[] {_playercode,_deviceid,_timezoneoffsetminutes,_appversion,_startmode,_playlistindex}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Public Sub CreateNextParams(playerCode As String,";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=46989315;
 //BA.debugLineNum = 46989315;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(_playercode));
RDebugUtils.currentLine=46989316;
 //BA.debugLineNum = 46989316;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(_deviceid));
RDebugUtils.currentLine=46989317;
 //BA.debugLineNum = 46989317;BA.debugLine="params.Put(\"tz\", timezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(_timezoneoffsetminutes));
RDebugUtils.currentLine=46989318;
 //BA.debugLineNum = 46989318;BA.debugLine="params.Put(\"version\", appVersion)";
_params.Put((Object)("version"),(Object)(_appversion));
RDebugUtils.currentLine=46989319;
 //BA.debugLineNum = 46989319;BA.debugLine="If startMode = \"manual\" Or startMode = \"auto\" The";
if ((_startmode).equals("manual") || (_startmode).equals("auto")) { 
_params.Put((Object)("start"),(Object)(_startmode));};
RDebugUtils.currentLine=46989320;
 //BA.debugLineNum = 46989320;BA.debugLine="If playlistIndex >= 0 Then params.Put(\"playlist\",";
if (_playlistindex>=0) { 
_params.Put((Object)("playlist"),(Object)(_playlistindex));};
RDebugUtils.currentLine=46989321;
 //BA.debugLineNum = 46989321;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=46989322;
 //BA.debugLineNum = 46989322;BA.debugLine="End Sub";
return null;
}
}