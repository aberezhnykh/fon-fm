package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class httputils2service extends Object{
public static httputils2service mostCurrent = new httputils2service();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.httputils2service", null);
		ba.loadHtSubs(httputils2service.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.httputils2service", ba);
		}
	}
    public static Class<?> getObject() {
		return httputils2service.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "completejob", true))
	 {return ((String) Debug.delegate(ba, "completejob", new Object[] {_taskid,_success,_errormessage}));}
b4j.example.httpjob _job = null;
RDebugUtils.currentLine=80936960;
 //BA.debugLineNum = 80936960;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
RDebugUtils.currentLine=80936964;
 //BA.debugLineNum = 80936964;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=80936965;
 //BA.debugLineNum = 80936965;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=80936966;
 //BA.debugLineNum = 80936966;BA.debugLine="Log(\"HttpUtils2Service: job completed multiple t";
anywheresoftware.b4a.keywords.Common.LogImpl("980936966","HttpUtils2Service: job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=80936967;
 //BA.debugLineNum = 80936967;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=80936969;
 //BA.debugLineNum = 80936969;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
RDebugUtils.currentLine=80936970;
 //BA.debugLineNum = 80936970;BA.debugLine="job.success = success";
_job._success /*boolean*/  = _success;
RDebugUtils.currentLine=80936971;
 //BA.debugLineNum = 80936971;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage /*String*/  = _errormessage;
RDebugUtils.currentLine=80936973;
 //BA.debugLineNum = 80936973;BA.debugLine="job.Complete(TaskId)";
_job._complete /*String*/ (null,_taskid);
RDebugUtils.currentLine=80936977;
 //BA.debugLineNum = 80936977;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "hc_responseerror", true))
	 {return ((String) Debug.delegate(ba, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
b4j.example.httpjob _job = null;
RDebugUtils.currentLine=80871424;
 //BA.debugLineNum = 80871424;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=80871426;
 //BA.debugLineNum = 80871426;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.LogImpl("980871426",("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""),0);
RDebugUtils.currentLine=80871428;
 //BA.debugLineNum = 80871428;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=80871429;
 //BA.debugLineNum = 80871429;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=80871430;
 //BA.debugLineNum = 80871430;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=80871431;
 //BA.debugLineNum = 80871431;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseError): job c";
anywheresoftware.b4a.keywords.Common.LogImpl("980871431","HttpUtils2Service (hc_ResponseError): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=80871432;
 //BA.debugLineNum = 80871432;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=80871434;
 //BA.debugLineNum = 80871434;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=80871435;
 //BA.debugLineNum = 80871435;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
RDebugUtils.currentLine=80871436;
 //BA.debugLineNum = 80871436;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
RDebugUtils.currentLine=80871438;
 //BA.debugLineNum = 80871438;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
RDebugUtils.currentLine=80871440;
 //BA.debugLineNum = 80871440;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "hc_responsesuccess", true))
	 {return ((String) Debug.delegate(ba, "hc_responsesuccess", new Object[] {_response,_taskid}));}
b4j.example.httpjob _job = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=80740352;
 //BA.debugLineNum = 80740352;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=80740353;
 //BA.debugLineNum = 80740353;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=80740354;
 //BA.debugLineNum = 80740354;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=80740355;
 //BA.debugLineNum = 80740355;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseSuccess): job";
anywheresoftware.b4a.keywords.Common.LogImpl("980740355","HttpUtils2Service (hc_ResponseSuccess): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=80740356;
 //BA.debugLineNum = 80740356;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=80740358;
 //BA.debugLineNum = 80740358;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=80740359;
 //BA.debugLineNum = 80740359;BA.debugLine="Dim out As OutputStream = File.OpenOutput(TempFol";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=80740363;
 //BA.debugLineNum = 80740363;BA.debugLine="Response.GetAsynchronously(\"response\", out , _";
_response.GetAsynchronously(ba,"response",(java.io.OutputStream)(_out.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=80740365;
 //BA.debugLineNum = 80740365;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "response_streamfinish", true))
	 {return ((String) Debug.delegate(ba, "response_streamfinish", new Object[] {_success,_taskid}));}
RDebugUtils.currentLine=80805888;
 //BA.debugLineNum = 80805888;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
RDebugUtils.currentLine=80805889;
 //BA.debugLineNum = 80805889;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=80805890;
 //BA.debugLineNum = 80805890;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
RDebugUtils.currentLine=80805892;
 //BA.debugLineNum = 80805892;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=80805894;
 //BA.debugLineNum = 80805894;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "service_create", true))
	 {return ((String) Debug.delegate(ba, "service_create", null));}
RDebugUtils.currentLine=80609280;
 //BA.debugLineNum = 80609280;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=80609292;
 //BA.debugLineNum = 80609292;BA.debugLine="TempFolder = File.DirTemp";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirTemp();
RDebugUtils.currentLine=80609294;
 //BA.debugLineNum = 80609294;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=80609299;
 //BA.debugLineNum = 80609299;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 };
RDebugUtils.currentLine=80609307;
 //BA.debugLineNum = 80609307;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
RDebugUtils.currentLine=80609309;
 //BA.debugLineNum = 80609309;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(b4j.example.httpjob _job) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "submitjob", true))
	 {return ((String) Debug.delegate(ba, "submitjob", new Object[] {_job}));}
int _taskid = 0;
RDebugUtils.currentLine=80674816;
 //BA.debugLineNum = 80674816;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
RDebugUtils.currentLine=80674817;
 //BA.debugLineNum = 80674817;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
if (_taskidtojob.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
RDebugUtils.currentLine=80674821;
 //BA.debugLineNum = 80674821;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
RDebugUtils.currentLine=80674822;
 //BA.debugLineNum = 80674822;BA.debugLine="Dim TaskId As Int = taskCounter";
_taskid = _taskcounter;
RDebugUtils.currentLine=80674824;
 //BA.debugLineNum = 80674824;BA.debugLine="TaskIdToJob.Put(TaskId, job)";
_taskidtojob.Put((Object)(_taskid),(Object)(_job));
RDebugUtils.currentLine=80674825;
 //BA.debugLineNum = 80674825;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username /*String*/ ).equals("") == false && (_job._password /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=80674826;
 //BA.debugLineNum = 80674826;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, TaskId, jo";
_hc.ExecuteCredentials(ba,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid,_job._username /*String*/ ,_job._password /*String*/ );
 }else {
RDebugUtils.currentLine=80674828;
 //BA.debugLineNum = 80674828;BA.debugLine="hc.Execute(job.GetRequest, TaskId)";
_hc.Execute(ba,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid);
 };
RDebugUtils.currentLine=80674830;
 //BA.debugLineNum = 80674830;BA.debugLine="End Sub";
return "";
}
}