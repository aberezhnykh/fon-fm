package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.httpjob", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _multipartfiledata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response = null;
public Object _tag = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _invalidurl = "";
public String _defaultscheme = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=80740352;
 //BA.debugLineNum = 80740352;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=80740353;
 //BA.debugLineNum = 80740353;BA.debugLine="Return req";
if (true) return __ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ;
RDebugUtils.currentLine=80740354;
 //BA.debugLineNum = 80740354;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=79429632;
 //BA.debugLineNum = 79429632;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=79429633;
 //BA.debugLineNum = 79429633;BA.debugLine="JobName = Name";
__ref._jobname /*String*/  = _name;
RDebugUtils.currentLine=79429634;
 //BA.debugLineNum = 79429634;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=79429642;
 //BA.debugLineNum = 79429642;BA.debugLine="End Sub";
return "";
}
public String  _poststring(b4j.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=79560704;
 //BA.debugLineNum = 79560704;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=79560705;
 //BA.debugLineNum = 79560705;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=79560706;
 //BA.debugLineNum = 79560706;BA.debugLine="End Sub";
return "";
}
public String  _getstring(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=80609280;
 //BA.debugLineNum = 80609280;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=80609281;
 //BA.debugLineNum = 80609281;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2 /*String*/ (null,"UTF8");
RDebugUtils.currentLine=80609282;
 //BA.debugLineNum = 80609282;BA.debugLine="End Sub";
return "";
}
public String  _release(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "release", true))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=80543744;
 //BA.debugLineNum = 80543744;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=80543746;
 //BA.debugLineNum = 80543746;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=80543748;
 //BA.debugLineNum = 80543748;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=80936960;
 //BA.debugLineNum = 80936960;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=80936961;
 //BA.debugLineNum = 80936961;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=80936962;
 //BA.debugLineNum = 80936962;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=80936963;
 //BA.debugLineNum = 80936963;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=80936964;
 //BA.debugLineNum = 80936964;BA.debugLine="End Sub";
return null;
}
public String  _download(b4j.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=80216064;
 //BA.debugLineNum = 80216064;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=80216065;
 //BA.debugLineNum = 80216065;BA.debugLine="Try";
try {RDebugUtils.currentLine=80216066;
 //BA.debugLineNum = 80216066;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=80216067;
 //BA.debugLineNum = 80216067;BA.debugLine="req.InitializeGet(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=80216069;
 //BA.debugLineNum = 80216069;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("980216069",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=80216070;
 //BA.debugLineNum = 80216070;BA.debugLine="req.InitializeGet(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=80216072;
 //BA.debugLineNum = 80216072;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=80216073;
 //BA.debugLineNum = 80216073;BA.debugLine="End Sub";
return "";
}
public String  _complete(b4j.example.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=80805888;
 //BA.debugLineNum = 80805888;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=80805889;
 //BA.debugLineNum = 80805889;BA.debugLine="taskId = id";
__ref._taskid /*String*/  = BA.NumberToString(_id);
RDebugUtils.currentLine=80805890;
 //BA.debugLineNum = 80805890;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target /*Object*/ ,"JobDone",this);
RDebugUtils.currentLine=80805891;
 //BA.debugLineNum = 80805891;BA.debugLine="End Sub";
return "";
}
public String  _addscheme(b4j.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "addscheme", true))
	 {return ((String) Debug.delegate(ba, "addscheme", new Object[] {_link}));}
RDebugUtils.currentLine=79495168;
 //BA.debugLineNum = 79495168;BA.debugLine="Private Sub AddScheme (Link As String) As String";
RDebugUtils.currentLine=79495169;
 //BA.debugLineNum = 79495169;BA.debugLine="If DefaultScheme = \"\" Or Link.Contains(\":\") Then";
if ((__ref._defaultscheme /*String*/ ).equals("") || _link.contains(":")) { 
if (true) return _link;};
RDebugUtils.currentLine=79495170;
 //BA.debugLineNum = 79495170;BA.debugLine="Return DefaultScheme & \"://\" & Link";
if (true) return __ref._defaultscheme /*String*/ +"://"+_link;
RDebugUtils.currentLine=79495171;
 //BA.debugLineNum = 79495171;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=79364096;
 //BA.debugLineNum = 79364096;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=79364097;
 //BA.debugLineNum = 79364097;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=79364098;
 //BA.debugLineNum = 79364098;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=79364099;
 //BA.debugLineNum = 79364099;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=79364100;
 //BA.debugLineNum = 79364100;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=79364101;
 //BA.debugLineNum = 79364101;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=79364107;
 //BA.debugLineNum = 79364107;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=79364109;
 //BA.debugLineNum = 79364109;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=79364110;
 //BA.debugLineNum = 79364110;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=79364119;
 //BA.debugLineNum = 79364119;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=79364120;
 //BA.debugLineNum = 79364120;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=79364122;
 //BA.debugLineNum = 79364122;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=79364124;
 //BA.debugLineNum = 79364124;BA.debugLine="Private Const InvalidURL As String = \"https://inv";
_invalidurl = "https://invalid-url/";
RDebugUtils.currentLine=79364125;
 //BA.debugLineNum = 79364125;BA.debugLine="Public DefaultScheme As String = \"https\"";
_defaultscheme = "https";
RDebugUtils.currentLine=79364126;
 //BA.debugLineNum = 79364126;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4j.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=80412672;
 //BA.debugLineNum = 80412672;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=80412673;
 //BA.debugLineNum = 80412673;BA.debugLine="Try";
try {RDebugUtils.currentLine=80412674;
 //BA.debugLineNum = 80412674;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=80412675;
 //BA.debugLineNum = 80412675;BA.debugLine="req.InitializeDelete(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=80412677;
 //BA.debugLineNum = 80412677;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("980412677",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=80412678;
 //BA.debugLineNum = 80412678;BA.debugLine="req.InitializeDelete(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=80412680;
 //BA.debugLineNum = 80412680;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=80412681;
 //BA.debugLineNum = 80412681;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4j.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=80478208;
 //BA.debugLineNum = 80478208;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=80478209;
 //BA.debugLineNum = 80478209;BA.debugLine="Try";
try {RDebugUtils.currentLine=80478210;
 //BA.debugLineNum = 80478210;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=80478211;
 //BA.debugLineNum = 80478211;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=80478213;
 //BA.debugLineNum = 80478213;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("980478213",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=80478214;
 //BA.debugLineNum = 80478214;BA.debugLine="req.InitializeDelete(escapeLink(InvalidURL, Para";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=80478216;
 //BA.debugLineNum = 80478216;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=80478217;
 //BA.debugLineNum = 80478217;BA.debugLine="End Sub";
return "";
}
public String  _escapelink(b4j.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "escapelink", true))
	 {return ((String) Debug.delegate(ba, "escapelink", new Object[] {_link,_parameters}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
RDebugUtils.currentLine=80347136;
 //BA.debugLineNum = 80347136;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=80347137;
 //BA.debugLineNum = 80347137;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=80347138;
 //BA.debugLineNum = 80347138;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=80347139;
 //BA.debugLineNum = 80347139;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=80347140;
 //BA.debugLineNum = 80347140;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=80347141;
 //BA.debugLineNum = 80347141;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=80347142;
 //BA.debugLineNum = 80347142;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=80347143;
 //BA.debugLineNum = 80347143;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=80347144;
 //BA.debugLineNum = 80347144;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=80347145;
 //BA.debugLineNum = 80347145;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=80347147;
 //BA.debugLineNum = 80347147;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=80347148;
 //BA.debugLineNum = 80347148;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4j.example.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=80281600;
 //BA.debugLineNum = 80281600;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=80281601;
 //BA.debugLineNum = 80281601;BA.debugLine="Try";
try {RDebugUtils.currentLine=80281602;
 //BA.debugLineNum = 80281602;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=80281603;
 //BA.debugLineNum = 80281603;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=80281605;
 //BA.debugLineNum = 80281605;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("980281605",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=80281606;
 //BA.debugLineNum = 80281606;BA.debugLine="req.InitializeGet(escapeLink(InvalidURL, Paramet";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=80281608;
 //BA.debugLineNum = 80281608;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=80281609;
 //BA.debugLineNum = 80281609;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _getbitmap(b4j.example.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _b = null;
RDebugUtils.currentLine=80871424;
 //BA.debugLineNum = 80871424;BA.debugLine="Public Sub GetBitmap As Image";
RDebugUtils.currentLine=80871425;
 //BA.debugLineNum = 80871425;BA.debugLine="Dim b As Image";
_b = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=80871426;
 //BA.debugLineNum = 80871426;BA.debugLine="b = fx.LoadImage(HttpUtils2Service.TempFolder, ta";
_b = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=80871427;
 //BA.debugLineNum = 80871427;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=80871428;
 //BA.debugLineNum = 80871428;BA.debugLine="End Sub";
return null;
}
public String  _getstring2(b4j.example.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=80674816;
 //BA.debugLineNum = 80674816;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=80674820;
 //BA.debugLineNum = 80674820;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=80674821;
 //BA.debugLineNum = 80674821;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ).getObject()),_encoding);
RDebugUtils.currentLine=80674822;
 //BA.debugLineNum = 80674822;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=80674823;
 //BA.debugLineNum = 80674823;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=80674824;
 //BA.debugLineNum = 80674824;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=80674826;
 //BA.debugLineNum = 80674826;BA.debugLine="End Sub";
return "";
}
public String  _head(b4j.example.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=79953920;
 //BA.debugLineNum = 79953920;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=79953921;
 //BA.debugLineNum = 79953921;BA.debugLine="Try";
try {RDebugUtils.currentLine=79953922;
 //BA.debugLineNum = 79953922;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=79953923;
 //BA.debugLineNum = 79953923;BA.debugLine="req.InitializeHead(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=79953925;
 //BA.debugLineNum = 79953925;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("979953925",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=79953926;
 //BA.debugLineNum = 79953926;BA.debugLine="req.InitializeHead(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=79953928;
 //BA.debugLineNum = 79953928;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=79953929;
 //BA.debugLineNum = 79953929;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4j.example.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=80084992;
 //BA.debugLineNum = 80084992;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=80084993;
 //BA.debugLineNum = 80084993;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=80084994;
 //BA.debugLineNum = 80084994;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=80084996;
 //BA.debugLineNum = 80084996;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=80084998;
 //BA.debugLineNum = 80084998;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=80084999;
 //BA.debugLineNum = 80084999;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4j.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=79888384;
 //BA.debugLineNum = 79888384;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=79888385;
 //BA.debugLineNum = 79888385;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=79888393;
 //BA.debugLineNum = 79888393;BA.debugLine="Try";
try {RDebugUtils.currentLine=79888394;
 //BA.debugLineNum = 79888394;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=79888396;
 //BA.debugLineNum = 79888396;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("979888396",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=79888397;
 //BA.debugLineNum = 79888397;BA.debugLine="req.InitializePatch2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=79888401;
 //BA.debugLineNum = 79888401;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=79888402;
 //BA.debugLineNum = 79888402;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4j.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=79822848;
 //BA.debugLineNum = 79822848;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=79822849;
 //BA.debugLineNum = 79822849;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=79822850;
 //BA.debugLineNum = 79822850;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(b4j.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=79626240;
 //BA.debugLineNum = 79626240;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=79626241;
 //BA.debugLineNum = 79626241;BA.debugLine="Try";
try {RDebugUtils.currentLine=79626242;
 //BA.debugLineNum = 79626242;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=79626243;
 //BA.debugLineNum = 79626243;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=79626245;
 //BA.debugLineNum = 79626245;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("979626245",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=79626246;
 //BA.debugLineNum = 79626246;BA.debugLine="req.InitializePost2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=79626248;
 //BA.debugLineNum = 79626248;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=79626249;
 //BA.debugLineNum = 79626249;BA.debugLine="End Sub";
return "";
}
public String  _postfile(b4j.example.httpjob __ref,String _link,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postfile", true))
	 {return ((String) Debug.delegate(ba, "postfile", new Object[] {_link,_dir,_filename}));}
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=80150528;
 //BA.debugLineNum = 80150528;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=80150529;
 //BA.debugLineNum = 80150529;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=80150534;
 //BA.debugLineNum = 80150534;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=80150535;
 //BA.debugLineNum = 80150535;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=80150536;
 //BA.debugLineNum = 80150536;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("980150536","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=80150537;
 //BA.debugLineNum = 80150537;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=80150539;
 //BA.debugLineNum = 80150539;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=80150540;
 //BA.debugLineNum = 80150540;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=80150541;
 //BA.debugLineNum = 80150541;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=80150542;
 //BA.debugLineNum = 80150542;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=80150545;
 //BA.debugLineNum = 80150545;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=80150546;
 //BA.debugLineNum = 80150546;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=80150547;
 //BA.debugLineNum = 80150547;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=80150548;
 //BA.debugLineNum = 80150548;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=80150550;
 //BA.debugLineNum = 80150550;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=80150551;
 //BA.debugLineNum = 80150551;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=80150554;
 //BA.debugLineNum = 80150554;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(b4j.example.httpjob __ref,String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postmultipart", true))
	 {return ((String) Debug.delegate(ba, "postmultipart", new Object[] {_link,_namevalues,_files}));}
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
byte[] _b = null;
String _eol = "";
boolean _empty = false;
String _key = "";
String _value = "";
String _s = "";
b4j.example.httpjob._multipartfiledata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=80019456;
 //BA.debugLineNum = 80019456;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=80019457;
 //BA.debugLineNum = 80019457;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=80019458;
 //BA.debugLineNum = 80019458;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=80019459;
 //BA.debugLineNum = 80019459;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=80019460;
 //BA.debugLineNum = 80019460;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=80019461;
 //BA.debugLineNum = 80019461;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=80019462;
 //BA.debugLineNum = 80019462;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=80019463;
 //BA.debugLineNum = 80019463;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=80019464;
 //BA.debugLineNum = 80019464;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=80019465;
 //BA.debugLineNum = 80019465;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=80019466;
 //BA.debugLineNum = 80019466;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=80019467;
 //BA.debugLineNum = 80019467;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=80019472;
 //BA.debugLineNum = 80019472;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=80019473;
 //BA.debugLineNum = 80019473;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=80019476;
 //BA.debugLineNum = 80019476;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=80019477;
 //BA.debugLineNum = 80019477;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4j.example.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=80019478;
 //BA.debugLineNum = 80019478;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=80019479;
 //BA.debugLineNum = 80019479;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
RDebugUtils.currentLine=80019485;
 //BA.debugLineNum = 80019485;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=80019486;
 //BA.debugLineNum = 80019486;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=80019487;
 //BA.debugLineNum = 80019487;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
RDebugUtils.currentLine=80019488;
 //BA.debugLineNum = 80019488;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=80019491;
 //BA.debugLineNum = 80019491;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=80019492;
 //BA.debugLineNum = 80019492;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=80019495;
 //BA.debugLineNum = 80019495;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=80019496;
 //BA.debugLineNum = 80019496;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=80019497;
 //BA.debugLineNum = 80019497;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=80019498;
 //BA.debugLineNum = 80019498;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=80019499;
 //BA.debugLineNum = 80019499;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentEncoding("UTF8");
RDebugUtils.currentLine=80019500;
 //BA.debugLineNum = 80019500;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4j.example.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=79757312;
 //BA.debugLineNum = 79757312;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=79757313;
 //BA.debugLineNum = 79757313;BA.debugLine="Try";
try {RDebugUtils.currentLine=79757314;
 //BA.debugLineNum = 79757314;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=79757315;
 //BA.debugLineNum = 79757315;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=79757317;
 //BA.debugLineNum = 79757317;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("979757317",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=79757318;
 //BA.debugLineNum = 79757318;BA.debugLine="req.InitializePut2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=79757320;
 //BA.debugLineNum = 79757320;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=79757321;
 //BA.debugLineNum = 79757321;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4j.example.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=79691776;
 //BA.debugLineNum = 79691776;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=79691777;
 //BA.debugLineNum = 79691777;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=79691778;
 //BA.debugLineNum = 79691778;BA.debugLine="End Sub";
return "";
}
}