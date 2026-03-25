package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagesmanager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagesmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xpageparent{
public boolean IsInitialized;
public anywheresoftware.b4j.objects.Form NativeType;
public void Initialize() {
IsInitialized = true;
NativeType = new anywheresoftware.b4j.objects.Form();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4xpageinfo{
public boolean IsInitialized;
public Object B4XPage;
public String Id;
public boolean Created;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper Root;
public boolean IsFirst;
public b4j.example.b4xpagesmanager._b4xpageparent Parent;
public void Initialize() {
IsInitialized = true;
B4XPage = new Object();
Id = "";
Created = false;
Title = new Object();
Root = new anywheresoftware.b4a.objects.B4XViewWrapper();
IsFirst = false;
Parent = new b4j.example.b4xpagesmanager._b4xpageparent();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.b4xorderedmap _idtob4xpage = null;
public b4j.example.b4xorderedmap _rootb4xtopage = null;
public b4j.example.b4xset _mstackofpageids = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.Form _mmainform = null;
public boolean _isforeground = false;
public int _transitionanimationduration = 0;
public b4j.example.b4xmainpage _mainpage = null;
public String _stackstring = "";
public boolean _logevents = false;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _mainform) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mainform}));}
boolean _nonmainpagewasadded = false;
RDebugUtils.currentLine=78249984;
 //BA.debugLineNum = 78249984;BA.debugLine="Public Sub Initialize (MainForm As Form)";
RDebugUtils.currentLine=78249990;
 //BA.debugLineNum = 78249990;BA.debugLine="IdToB4XPage.Initialize";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=78249991;
 //BA.debugLineNum = 78249991;BA.debugLine="RootB4XToPage.Initialize";
__ref._rootb4xtopage /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=78249992;
 //BA.debugLineNum = 78249992;BA.debugLine="mStackOfPageIds.Initialize";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=78249994;
 //BA.debugLineNum = 78249994;BA.debugLine="mMainForm = MainForm";
__ref._mmainform /*anywheresoftware.b4j.objects.Form*/  = _mainform;
RDebugUtils.currentLine=78250005;
 //BA.debugLineNum = 78250005;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
_b4xpages._internalsetpagesmanager /*String*/ (this);
RDebugUtils.currentLine=78250006;
 //BA.debugLineNum = 78250006;BA.debugLine="MainPage.Initialize";
__ref._mainpage /*b4j.example.b4xmainpage*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=78250007;
 //BA.debugLineNum = 78250007;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=78250008;
 //BA.debugLineNum = 78250008;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)("~~~~~temp~~~~"),(Object)(__ref._createb4xpageinfo /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(Object)(__ref._mainpage /*b4j.example.b4xmainpage*/ ),"",__c.False,(Object)(""))));
RDebugUtils.currentLine=78250009;
 //BA.debugLineNum = 78250009;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=78250010;
 //BA.debugLineNum = 78250010;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)("~~~~~temp~~~~"));
RDebugUtils.currentLine=78250011;
 //BA.debugLineNum = 78250011;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
__ref._addpageandcreate /*String*/ (null,"MainPage",(Object)(__ref._mainpage /*b4j.example.b4xmainpage*/ ));
RDebugUtils.currentLine=78250012;
 //BA.debugLineNum = 78250012;BA.debugLine="If LogEvents = False Then";
if (__ref._logevents /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=78250013;
 //BA.debugLineNum = 78250013;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
__c.LogImpl("978250013","Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events.",0);
 };
RDebugUtils.currentLine=78250015;
 //BA.debugLineNum = 78250015;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
RDebugUtils.currentLine=78250016;
 //BA.debugLineNum = 78250016;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=78250017;
 //BA.debugLineNum = 78250017;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=78250020;
 //BA.debugLineNum = 78250020;BA.debugLine="End Sub";
return "";
}
public String  _addpage(b4j.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
String _idtolower = "";
RDebugUtils.currentLine=78315520;
 //BA.debugLineNum = 78315520;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=78315521;
 //BA.debugLineNum = 78315521;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = _id.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=78315522;
 //BA.debugLineNum = 78315522;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if (__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_idtolower))) { 
RDebugUtils.currentLine=78315523;
 //BA.debugLineNum = 78315523;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
__c.LogImpl("978315523",("Page with this id already exists: "+__c.SmartStringFormatter("",(Object)(_idtolower))+"!"),0);
RDebugUtils.currentLine=78315524;
 //BA.debugLineNum = 78315524;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=78315526;
 //BA.debugLineNum = 78315526;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_idtolower),(Object)(__ref._createb4xpageinfo /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage,_idtolower,__c.False,(Object)(_id))));
RDebugUtils.currentLine=78315527;
 //BA.debugLineNum = 78315527;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if (__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1) { 
__ref._showpage /*String*/ (null,_idtolower);};
RDebugUtils.currentLine=78315528;
 //BA.debugLineNum = 78315528;BA.debugLine="End Sub";
return "";
}
public String  _addpageandcreate(b4j.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=78381056;
 //BA.debugLineNum = 78381056;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=78381057;
 //BA.debugLineNum = 78381057;BA.debugLine="AddPage (Id, B4XPage)";
__ref._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=78381058;
 //BA.debugLineNum = 78381058;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
__ref._createpageifneeded /*String*/ (null,__ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id));
RDebugUtils.currentLine=78381059;
 //BA.debugLineNum = 78381059;BA.debugLine="End Sub";
return "";
}
public String  _closepage(b4j.example.b4xpagesmanager __ref,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
boolean _isclosingtoppage = false;
RDebugUtils.currentLine=78577664;
 //BA.debugLineNum = 78577664;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=78577665;
 //BA.debugLineNum = 78577665;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=78577666;
 //BA.debugLineNum = 78577666;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_pi.Id /*String*/ ))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=78577667;
 //BA.debugLineNum = 78577667;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && (__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi) == false) { 
RDebugUtils.currentLine=78577668;
 //BA.debugLineNum = 78577668;BA.debugLine="Log(\"Only top page can be closed\")";
__c.LogImpl("978577668","Only top page can be closed",0);
RDebugUtils.currentLine=78577669;
 //BA.debugLineNum = 78577669;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=78577670;
 //BA.debugLineNum = 78577670;BA.debugLine="Else If xui.IsB4i And mStackOfPageIds.Size = 1 Th";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && __ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=78577671;
 //BA.debugLineNum = 78577671;BA.debugLine="Log(\"First page cannot be closed\")";
__c.LogImpl("978577671","First page cannot be closed",0);
RDebugUtils.currentLine=78577672;
 //BA.debugLineNum = 78577672;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=78577674;
 //BA.debugLineNum = 78577674;BA.debugLine="Dim IsClosingTopPage As Boolean = GetTopPage = pi";
_isclosingtoppage = (__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi);
RDebugUtils.currentLine=78577675;
 //BA.debugLineNum = 78577675;BA.debugLine="ClosePageImpl(pi)";
__ref._closepageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=78577676;
 //BA.debugLineNum = 78577676;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=78577677;
 //BA.debugLineNum = 78577677;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
 };
RDebugUtils.currentLine=78577679;
 //BA.debugLineNum = 78577679;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
if (true) return "";};
RDebugUtils.currentLine=78577680;
 //BA.debugLineNum = 78577680;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=78577681;
 //BA.debugLineNum = 78577681;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=78577682;
 //BA.debugLineNum = 78577682;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._showpageimpl /*String*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null));};
RDebugUtils.currentLine=78577683;
 //BA.debugLineNum = 78577683;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
 };
RDebugUtils.currentLine=78577685;
 //BA.debugLineNum = 78577685;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _findpifromb4xpage(b4j.example.b4xpagesmanager __ref,Object _page) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "findpifromb4xpage", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "findpifromb4xpage", new Object[] {_page}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=78774272;
 //BA.debugLineNum = 78774272;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
RDebugUtils.currentLine=78774273;
 //BA.debugLineNum = 78774273;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4j.example.b4xpagesmanager._b4xpageinfo)(group1.Get(index1));
RDebugUtils.currentLine=78774274;
 //BA.debugLineNum = 78774274;BA.debugLine="If pi.B4XPage = Page Then";
if ((_pi.B4XPage /*Object*/ ).equals(_page)) { 
RDebugUtils.currentLine=78774275;
 //BA.debugLineNum = 78774275;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
RDebugUtils.currentLine=78774278;
 //BA.debugLineNum = 78774278;BA.debugLine="Return Null";
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__c.Null);
RDebugUtils.currentLine=78774279;
 //BA.debugLineNum = 78774279;BA.debugLine="End Sub";
return null;
}
public Object  _getpage(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=79167488;
 //BA.debugLineNum = 79167488;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=79167489;
 //BA.debugLineNum = 79167489;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id).B4XPage /*Object*/ ;
RDebugUtils.currentLine=79167490;
 //BA.debugLineNum = 79167490;BA.debugLine="End Sub";
return null;
}
public String  _settitle(b4j.example.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=79036416;
 //BA.debugLineNum = 79036416;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=79036417;
 //BA.debugLineNum = 79036417;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=79036418;
 //BA.debugLineNum = 79036418;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=79036419;
 //BA.debugLineNum = 79036419;BA.debugLine="pi.Parent.NativeType.Title = Title";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_title));
RDebugUtils.currentLine=79036420;
 //BA.debugLineNum = 79036420;BA.debugLine="End Sub";
return "";
}
public String  _showpage(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=78446592;
 //BA.debugLineNum = 78446592;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=78446593;
 //BA.debugLineNum = 78446593;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=78446594;
 //BA.debugLineNum = 78446594;BA.debugLine="If pi = GetTopPage Then Return";
if ((_pi).equals(__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null))) { 
if (true) return "";};
RDebugUtils.currentLine=78446595;
 //BA.debugLineNum = 78446595;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=78446596;
 //BA.debugLineNum = 78446596;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=78446610;
 //BA.debugLineNum = 78446610;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=78446611;
 //BA.debugLineNum = 78446611;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=78446612;
 //BA.debugLineNum = 78446612;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=78446613;
 //BA.debugLineNum = 78446613;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=78446614;
 //BA.debugLineNum = 78446614;BA.debugLine="End Sub";
return "";
}
public String  _showpageandremovepreviouspages(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pagetoremove = null;
RDebugUtils.currentLine=78512128;
 //BA.debugLineNum = 78512128;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=78512129;
 //BA.debugLineNum = 78512129;BA.debugLine="If GetTopPage = Null Then";
if (__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null)== null) { 
RDebugUtils.currentLine=78512130;
 //BA.debugLineNum = 78512130;BA.debugLine="ShowPage(Id)";
__ref._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=78512131;
 //BA.debugLineNum = 78512131;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=78512133;
 //BA.debugLineNum = 78512133;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=78512134;
 //BA.debugLineNum = 78512134;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=78512135;
 //BA.debugLineNum = 78512135;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=78512139;
 //BA.debugLineNum = 78512139;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._mstackofpageids /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=78512140;
 //BA.debugLineNum = 78512140;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
_pagetoremove = __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=78512144;
 //BA.debugLineNum = 78512144;BA.debugLine="If PageToRemove.Id = pi.Id Then Continue";
if ((_pagetoremove.Id /*String*/ ).equals(_pi.Id /*String*/ )) { 
if (true) continue;};
RDebugUtils.currentLine=78512145;
 //BA.debugLineNum = 78512145;BA.debugLine="PageToRemove.Parent.NativeType.Close";
_pagetoremove.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Close();
 }
};
RDebugUtils.currentLine=78512149;
 //BA.debugLineNum = 78512149;BA.debugLine="mStackOfPageIds.Clear";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=78512150;
 //BA.debugLineNum = 78512150;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=78512151;
 //BA.debugLineNum = 78512151;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=78512152;
 //BA.debugLineNum = 78512152;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=78512154;
 //BA.debugLineNum = 78512154;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=78512155;
 //BA.debugLineNum = 78512155;BA.debugLine="End Sub";
return "";
}
public String  _activity_pause(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=80347136;
 //BA.debugLineNum = 80347136;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=80347137;
 //BA.debugLineNum = 80347137;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
__ref._raiseeventwithresult /*Object*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=80347138;
 //BA.debugLineNum = 80347138;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=80347139;
 //BA.debugLineNum = 80347139;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
boolean _shouldraise = false;
RDebugUtils.currentLine=80216064;
 //BA.debugLineNum = 80216064;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=80216065;
 //BA.debugLineNum = 80216065;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = __ref._isforeground /*boolean*/ ==__c.False;
RDebugUtils.currentLine=80216066;
 //BA.debugLineNum = 80216066;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=80216067;
 //BA.debugLineNum = 80216067;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
RDebugUtils.currentLine=80216068;
 //BA.debugLineNum = 80216068;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
RDebugUtils.currentLine=80216070;
 //BA.debugLineNum = 80216070;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closed(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_closed", true))
	 {return ((String) Debug.delegate(ba, "mainform_closed", null));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=79560704;
 //BA.debugLineNum = 79560704;BA.debugLine="Public Sub MainForm_Closed";
RDebugUtils.currentLine=79560705;
 //BA.debugLineNum = 79560705;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=79560706;
 //BA.debugLineNum = 79560706;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=79560707;
 //BA.debugLineNum = 79560707;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", Nul";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=79560708;
 //BA.debugLineNum = 79560708;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=79560709;
 //BA.debugLineNum = 79560709;BA.debugLine="If mStackOfPageIds.Size = 0 Then";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==0) { 
RDebugUtils.currentLine=79560710;
 //BA.debugLineNum = 79560710;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=79560712;
 //BA.debugLineNum = 79560712;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=79560713;
 //BA.debugLineNum = 79560713;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closerequest(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_closerequest", true))
	 {return ((String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=79691776;
 //BA.debugLineNum = 79691776;BA.debugLine="Public Sub MainForm_CloseRequest (EventData As Eve";
RDebugUtils.currentLine=79691777;
 //BA.debugLineNum = 79691777;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=79691778;
 //BA.debugLineNum = 79691778;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=79691779;
 //BA.debugLineNum = 79691779;BA.debugLine="If pi <> Null And CloseRequestExists (pi) Then";
if (_pi!= null && __ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=79691780;
 //BA.debugLineNum = 79691780;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=79691781;
 //BA.debugLineNum = 79691781;BA.debugLine="HandleCloseRequest (pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 };
RDebugUtils.currentLine=79691783;
 //BA.debugLineNum = 79691783;BA.debugLine="End Sub";
return "";
}
public String  _mainform_focuschanged(b4j.example.b4xpagesmanager __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "mainform_focuschanged", new Object[] {_hasfocus}));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=79495168;
 //BA.debugLineNum = 79495168;BA.debugLine="Public Sub MainForm_FocusChanged (HasFocus As Bool";
RDebugUtils.currentLine=79495169;
 //BA.debugLineNum = 79495169;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=79495170;
 //BA.debugLineNum = 79495170;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=79495171;
 //BA.debugLineNum = 79495171;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=79495172;
 //BA.debugLineNum = 79495172;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=79495173;
 //BA.debugLineNum = 79495173;BA.debugLine="MovePageToTop(pi)";
__ref._movepagetotop /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=79495175;
 //BA.debugLineNum = 79495175;BA.debugLine="End Sub";
return "";
}
public String  _mainform_iconifiedchanged(b4j.example.b4xpagesmanager __ref,boolean _iconified) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_iconifiedchanged", true))
	 {return ((String) Debug.delegate(ba, "mainform_iconifiedchanged", new Object[] {_iconified}));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=79626240;
 //BA.debugLineNum = 79626240;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
RDebugUtils.currentLine=79626241;
 //BA.debugLineNum = 79626241;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=79626242;
 //BA.debugLineNum = 79626242;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=79626243;
 //BA.debugLineNum = 79626243;BA.debugLine="RaiseEvent(pi, \"B4XPage_IconifiedChanged\", Array(";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_IconifiedChanged",new Object[]{(Object)(_iconified)});
RDebugUtils.currentLine=79626244;
 //BA.debugLineNum = 79626244;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4j.example.b4xpagesmanager __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
int _w = 0;
int _h = 0;
RDebugUtils.currentLine=80019456;
 //BA.debugLineNum = 80019456;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=80019457;
 //BA.debugLineNum = 80019457;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
RDebugUtils.currentLine=80019458;
 //BA.debugLineNum = 80019458;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
RDebugUtils.currentLine=80019459;
 //BA.debugLineNum = 80019459;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
__ref._raiseevent /*String*/ (null,__ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))),"B4XPage_Resize",new Object[]{(Object)(_w),(Object)(_h)});
RDebugUtils.currentLine=80019460;
 //BA.debugLineNum = 80019460;BA.debugLine="End Sub";
return "";
}
public Object  _raiseeventwithresult(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseeventwithresult", true))
	 {return ((Object) Debug.delegate(ba, "raiseeventwithresult", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=79953920;
 //BA.debugLineNum = 79953920;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
RDebugUtils.currentLine=79953921;
 //BA.debugLineNum = 79953921;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== null) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=79953922;
 //BA.debugLineNum = 79953922;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=79953923;
 //BA.debugLineNum = 79953923;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=79953924;
 //BA.debugLineNum = 79953924;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=79953925;
 //BA.debugLineNum = 79953925;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=79953926;
 //BA.debugLineNum = 79953926;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=79953928;
 //BA.debugLineNum = 79953928;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return __c.CallSubNew(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=79953930;
 //BA.debugLineNum = 79953930;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=79953932;
 //BA.debugLineNum = 79953932;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=79953934;
 //BA.debugLineNum = 79953934;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("979953934","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=79953936;
 //BA.debugLineNum = 79953936;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=79953937;
 //BA.debugLineNum = 79953937;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _gettoppage(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "gettoppage", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "gettoppage", null));}
RDebugUtils.currentLine=80084992;
 //BA.debugLineNum = 80084992;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
RDebugUtils.currentLine=80084993;
 //BA.debugLineNum = 80084993;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==0) { 
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__c.Null);};
RDebugUtils.currentLine=80084994;
 //BA.debugLineNum = 80084994;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mstackofpageids /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)-1))));
RDebugUtils.currentLine=80084995;
 //BA.debugLineNum = 80084995;BA.debugLine="End Sub";
return null;
}
public String  _backgroundstatechanged(b4j.example.b4xpagesmanager __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "backgroundstatechanged", true))
	 {return ((String) Debug.delegate(ba, "backgroundstatechanged", new Object[] {_newstate}));}
String _ev = "";
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=80281600;
 //BA.debugLineNum = 80281600;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
RDebugUtils.currentLine=80281601;
 //BA.debugLineNum = 80281601;BA.debugLine="If IsForeground = NewState Then Return";
if (__ref._isforeground /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=80281602;
 //BA.debugLineNum = 80281602;BA.debugLine="IsForeground = NewState";
__ref._isforeground /*boolean*/  = _newstate;
RDebugUtils.currentLine=80281603;
 //BA.debugLineNum = 80281603;BA.debugLine="Dim ev As String";
_ev = "";
RDebugUtils.currentLine=80281604;
 //BA.debugLineNum = 80281604;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (__ref._isforeground /*boolean*/ ) { 
_ev = "B4XPage_Foreground";}
else {
_ev = "B4XPage_Background";};
RDebugUtils.currentLine=80281605;
 //BA.debugLineNum = 80281605;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (b4j.example.b4xpagesmanager._b4xpageinfo)(group5.Get(index5));
RDebugUtils.currentLine=80281606;
 //BA.debugLineNum = 80281606;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,_ev,(int) (0))) { 
RDebugUtils.currentLine=80281607;
 //BA.debugLineNum = 80281607;BA.debugLine="LogEvent(pi, ev)";
__ref._logevent /*String*/ (null,_pi,_ev);
RDebugUtils.currentLine=80281608;
 //BA.debugLineNum = 80281608;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=80281609;
 //BA.debugLineNum = 80281609;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
__c.CallSubDelayed(ba,_pi.B4XPage /*Object*/ ,_ev);
 }else {
RDebugUtils.currentLine=80281611;
 //BA.debugLineNum = 80281611;BA.debugLine="CallSub(pi.B4XPage, ev)";
__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,_ev);
 };
 };
 }
};
RDebugUtils.currentLine=80281615;
 //BA.debugLineNum = 80281615;BA.debugLine="End Sub";
return "";
}
public String  _raiseevent(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {return ((String) Debug.delegate(ba, "raiseevent", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=79888384;
 //BA.debugLineNum = 79888384;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
RDebugUtils.currentLine=79888385;
 //BA.debugLineNum = 79888385;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== null) { 
if (true) return "";};
RDebugUtils.currentLine=79888386;
 //BA.debugLineNum = 79888386;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=79888387;
 //BA.debugLineNum = 79888387;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=79888388;
 //BA.debugLineNum = 79888388;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=79888389;
 //BA.debugLineNum = 79888389;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=79888390;
 //BA.debugLineNum = 79888390;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=79888392;
 //BA.debugLineNum = 79888392;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
__c.CallSubDelayed(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=79888394;
 //BA.debugLineNum = 79888394;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=79888396;
 //BA.debugLineNum = 79888396;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=79888398;
 //BA.debugLineNum = 79888398;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("979888398","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=79888400;
 //BA.debugLineNum = 79888400;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _createb4xpageinfo(b4j.example.b4xpagesmanager __ref,Object _b4xpage,String _id,boolean _created,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageinfo", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "createb4xpageinfo", new Object[] {_b4xpage,_id,_created,_title}));}
b4j.example.b4xpagesmanager._b4xpageinfo _t1 = null;
RDebugUtils.currentLine=79429632;
 //BA.debugLineNum = 79429632;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
RDebugUtils.currentLine=79429633;
 //BA.debugLineNum = 79429633;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = new b4j.example.b4xpagesmanager._b4xpageinfo();
RDebugUtils.currentLine=79429634;
 //BA.debugLineNum = 79429634;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=79429635;
 //BA.debugLineNum = 79429635;BA.debugLine="t1.B4XPage = B4XPage";
_t1.B4XPage /*Object*/  = _b4xpage;
RDebugUtils.currentLine=79429636;
 //BA.debugLineNum = 79429636;BA.debugLine="t1.Id = Id";
_t1.Id /*String*/  = _id;
RDebugUtils.currentLine=79429637;
 //BA.debugLineNum = 79429637;BA.debugLine="t1.Created = Created";
_t1.Created /*boolean*/  = _created;
RDebugUtils.currentLine=79429638;
 //BA.debugLineNum = 79429638;BA.debugLine="t1.Title = Title";
_t1.Title /*Object*/  = _title;
RDebugUtils.currentLine=79429639;
 //BA.debugLineNum = 79429639;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=79429640;
 //BA.debugLineNum = 79429640;BA.debugLine="End Sub";
return null;
}
public String  _createpageifneeded(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageifneeded", true))
	 {return ((String) Debug.delegate(ba, "createpageifneeded", new Object[] {_pi}));}
RDebugUtils.currentLine=78970880;
 //BA.debugLineNum = 78970880;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
RDebugUtils.currentLine=78970881;
 //BA.debugLineNum = 78970881;BA.debugLine="If pi.Created Then Return";
if (_pi.Created /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=78970882;
 //BA.debugLineNum = 78970882;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi.IsFirst /*boolean*/  = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1;
RDebugUtils.currentLine=78970883;
 //BA.debugLineNum = 78970883;BA.debugLine="CreatePageImpl (pi)";
__ref._createpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=78970884;
 //BA.debugLineNum = 78970884;BA.debugLine="pi.Created = True";
_pi.Created /*boolean*/  = __c.True;
RDebugUtils.currentLine=78970885;
 //BA.debugLineNum = 78970885;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
__ref._rootb4xtopage /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_pi));
RDebugUtils.currentLine=78970886;
 //BA.debugLineNum = 78970886;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_Created");
RDebugUtils.currentLine=78970887;
 //BA.debugLineNum = 78970887;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
__c.CallSubDebug2(ba,_pi.B4XPage /*Object*/ ,"B4XPage_Created",(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
RDebugUtils.currentLine=78970889;
 //BA.debugLineNum = 78970889;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _getpagefromid(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpagefromid", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpagefromid", new Object[] {_id}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=79233024;
 //BA.debugLineNum = 79233024;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
RDebugUtils.currentLine=79233025;
 //BA.debugLineNum = 79233025;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (b4j.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_id.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale))));
RDebugUtils.currentLine=79233026;
 //BA.debugLineNum = 79233026;BA.debugLine="If pi = Null Then";
if (_pi== null) { 
RDebugUtils.currentLine=79233027;
 //BA.debugLineNum = 79233027;BA.debugLine="Log(\"Error: page id not found: \" & id)";
__c.LogImpl("979233027","Error: page id not found: "+_id,0);
RDebugUtils.currentLine=79233028;
 //BA.debugLineNum = 79233028;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
__c.LogImpl("979233028","Ids: "+BA.ObjectToString(__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null)),0);
 };
RDebugUtils.currentLine=79233030;
 //BA.debugLineNum = 79233030;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=79233031;
 //BA.debugLineNum = 79233031;BA.debugLine="End Sub";
return null;
}
public String  _logevent(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi,String _ev) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "logevent", true))
	 {return ((String) Debug.delegate(ba, "logevent", new Object[] {_pi,_ev}));}
String _msg = "";
RDebugUtils.currentLine=80412672;
 //BA.debugLineNum = 80412672;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
RDebugUtils.currentLine=80412673;
 //BA.debugLineNum = 80412673;BA.debugLine="If LogEvents Then";
if (__ref._logevents /*boolean*/ ) { 
RDebugUtils.currentLine=80412674;
 //BA.debugLineNum = 80412674;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ("*** "+__c.SmartStringFormatter("",(Object)(_pi.Id /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_ev))+" "+__c.SmartStringFormatter("",(Object)(__ref._stackstring /*String*/ ))+"");
RDebugUtils.currentLine=80412675;
 //BA.debugLineNum = 80412675;BA.debugLine="Log(msg)";
__c.LogImpl("980412675",_msg,0);
 };
RDebugUtils.currentLine=80412677;
 //BA.debugLineNum = 80412677;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=78184448;
 //BA.debugLineNum = 78184448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=78184449;
 //BA.debugLineNum = 78184449;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
_idtob4xpage = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=78184450;
 //BA.debugLineNum = 78184450;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
_rootb4xtopage = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=78184456;
 //BA.debugLineNum = 78184456;BA.debugLine="Type B4XPageParent (NativeType As Form)";
;
RDebugUtils.currentLine=78184460;
 //BA.debugLineNum = 78184460;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
RDebugUtils.currentLine=78184464;
 //BA.debugLineNum = 78184464;BA.debugLine="Public mStackOfPageIds As B4XSet";
_mstackofpageids = new b4j.example.b4xset();
RDebugUtils.currentLine=78184465;
 //BA.debugLineNum = 78184465;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=78184467;
 //BA.debugLineNum = 78184467;BA.debugLine="Private mMainForm As Form";
_mmainform = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=78184475;
 //BA.debugLineNum = 78184475;BA.debugLine="Public IsForeground As Boolean";
_isforeground = false;
RDebugUtils.currentLine=78184476;
 //BA.debugLineNum = 78184476;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
_transitionanimationduration = (int) (100);
RDebugUtils.currentLine=78184477;
 //BA.debugLineNum = 78184477;BA.debugLine="Public MainPage As B4XMainPage";
_mainpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=78184478;
 //BA.debugLineNum = 78184478;BA.debugLine="Private StackString As String";
_stackstring = "";
RDebugUtils.currentLine=78184479;
 //BA.debugLineNum = 78184479;BA.debugLine="Public LogEvents As Boolean = False";
_logevents = __c.False;
RDebugUtils.currentLine=78184480;
 //BA.debugLineNum = 78184480;BA.debugLine="End Sub";
return "";
}
public String  _closepageimpl(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepageimpl", true))
	 {return ((String) Debug.delegate(ba, "closepageimpl", new Object[] {_pi}));}
RDebugUtils.currentLine=78839808;
 //BA.debugLineNum = 78839808;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
RDebugUtils.currentLine=78839820;
 //BA.debugLineNum = 78839820;BA.debugLine="pi.Parent.NativeType.Close";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=78839824;
 //BA.debugLineNum = 78839824;BA.debugLine="End Sub";
return "";
}
public String  _toppagedisappear(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppagedisappear", true))
	 {return ((String) Debug.delegate(ba, "toppagedisappear", null));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=78643200;
 //BA.debugLineNum = 78643200;BA.debugLine="Private Sub TopPageDisappear";
RDebugUtils.currentLine=78643201;
 //BA.debugLineNum = 78643201;BA.debugLine="If xui.IsB4J Then Return";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
if (true) return "";};
RDebugUtils.currentLine=78643202;
 //BA.debugLineNum = 78643202;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=78643203;
 //BA.debugLineNum = 78643203;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=78643204;
 //BA.debugLineNum = 78643204;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=78643205;
 //BA.debugLineNum = 78643205;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=78643206;
 //BA.debugLineNum = 78643206;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=78643209;
 //BA.debugLineNum = 78643209;BA.debugLine="End Sub";
return "";
}
public String  _showpageimpl(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageimpl", true))
	 {return ((String) Debug.delegate(ba, "showpageimpl", new Object[] {_pi}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=78905344;
 //BA.debugLineNum = 78905344;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=78905346;
 //BA.debugLineNum = 78905346;BA.debugLine="pi.Parent.NativeType.Show";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=78905347;
 //BA.debugLineNum = 78905347;BA.debugLine="Dim jo As JavaObject = pi.Parent.NativeType";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=78905348;
 //BA.debugLineNum = 78905348;BA.debugLine="jo.GetFieldJO(\"stage\").RunMethod(\"requestFocus\",";
_jo.GetFieldJO("stage").RunMethod("requestFocus",(Object[])(__c.Null));
RDebugUtils.currentLine=78905361;
 //BA.debugLineNum = 78905361;BA.debugLine="End Sub";
return "";
}
public String  _toppageappear(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppageappear", true))
	 {return ((String) Debug.delegate(ba, "toppageappear", null));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=78708736;
 //BA.debugLineNum = 78708736;BA.debugLine="Private Sub TopPageAppear";
RDebugUtils.currentLine=78708737;
 //BA.debugLineNum = 78708737;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=78708738;
 //BA.debugLineNum = 78708738;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=78708739;
 //BA.debugLineNum = 78708739;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=78708740;
 //BA.debugLineNum = 78708740;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=78708741;
 //BA.debugLineNum = 78708741;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=78708742;
 //BA.debugLineNum = 78708742;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=78708751;
 //BA.debugLineNum = 78708751;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=78708752;
 //BA.debugLineNum = 78708752;BA.debugLine="End Sub";
return "";
}
public boolean  _closerequestexists(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closerequestexists", true))
	 {return ((Boolean) Debug.delegate(ba, "closerequestexists", new Object[] {_pi}));}
RDebugUtils.currentLine=79757312;
 //BA.debugLineNum = 79757312;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
RDebugUtils.currentLine=79757313;
 //BA.debugLineNum = 79757313;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest",(int) (0));
RDebugUtils.currentLine=79757314;
 //BA.debugLineNum = 79757314;BA.debugLine="End Sub";
return false;
}
public b4j.example.b4xpagesmanager._b4xpageparent  _createb4xpageparent(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4j.objects.Form _nativetype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageparent", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageparent) Debug.delegate(ba, "createb4xpageparent", new Object[] {_nativetype}));}
b4j.example.b4xpagesmanager._b4xpageparent _t1 = null;
RDebugUtils.currentLine=80150528;
 //BA.debugLineNum = 80150528;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As For";
RDebugUtils.currentLine=80150532;
 //BA.debugLineNum = 80150532;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = new b4j.example.b4xpagesmanager._b4xpageparent();
RDebugUtils.currentLine=80150533;
 //BA.debugLineNum = 80150533;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=80150534;
 //BA.debugLineNum = 80150534;BA.debugLine="t1.NativeType = NativeType";
_t1.NativeType /*anywheresoftware.b4j.objects.Form*/  = _nativetype;
RDebugUtils.currentLine=80150535;
 //BA.debugLineNum = 80150535;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=80150536;
 //BA.debugLineNum = 80150536;BA.debugLine="End Sub";
return null;
}
public String  _createpageimpl(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageimpl", true))
	 {return ((String) Debug.delegate(ba, "createpageimpl", new Object[] {_pi}));}
anywheresoftware.b4j.objects.Form _f = null;
RDebugUtils.currentLine=79101952;
 //BA.debugLineNum = 79101952;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=79101954;
 //BA.debugLineNum = 79101954;BA.debugLine="If pi.IsFirst Then";
if (_pi.IsFirst /*boolean*/ ) { 
RDebugUtils.currentLine=79101955;
 //BA.debugLineNum = 79101955;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4j.example.b4xpagesmanager._b4xpageparent*/ (null,__ref._mmainform /*anywheresoftware.b4j.objects.Form*/ );
 }else {
RDebugUtils.currentLine=79101957;
 //BA.debugLineNum = 79101957;BA.debugLine="Dim f As Form";
_f = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=79101958;
 //BA.debugLineNum = 79101958;BA.debugLine="f.Initialize(\"MainForm\", mMainForm.RootPane.Widt";
_f.Initialize(ba,"MainForm",__ref._mmainform /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getWidth(),__ref._mmainform /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getHeight());
RDebugUtils.currentLine=79101959;
 //BA.debugLineNum = 79101959;BA.debugLine="pi.Parent = CreateB4XPageParent(f)";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4j.example.b4xpagesmanager._b4xpageparent*/ (null,_f);
 };
RDebugUtils.currentLine=79101961;
 //BA.debugLineNum = 79101961;BA.debugLine="pi.Root = pi.Parent.NativeType.RootPane";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject()));
RDebugUtils.currentLine=79101962;
 //BA.debugLineNum = 79101962;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=79101975;
 //BA.debugLineNum = 79101975;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _getpageinfofromroot(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpageinfofromroot", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpageinfofromroot", new Object[] {_root}));}
RDebugUtils.currentLine=79298560;
 //BA.debugLineNum = 79298560;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
RDebugUtils.currentLine=79298561;
 //BA.debugLineNum = 79298561;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__ref._rootb4xtopage /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_root.getObject())));
RDebugUtils.currentLine=79298562;
 //BA.debugLineNum = 79298562;BA.debugLine="End Sub";
return null;
}
public void  _handlecloserequest(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "handlecloserequest", true))
	 {Debug.delegate(ba, "handlecloserequest", new Object[] {_pi}); return;}
ResumableSub_HandleCloseRequest rsub = new ResumableSub_HandleCloseRequest(this,__ref,_pi);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleCloseRequest extends BA.ResumableSub {
public ResumableSub_HandleCloseRequest(b4j.example.b4xpagesmanager parent,b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) {
this.parent = parent;
this.__ref = __ref;
this._pi = _pi;
this.__ref = parent;
}
b4j.example.b4xpagesmanager __ref;
b4j.example.b4xpagesmanager parent;
b4j.example.b4xpagesmanager._b4xpageinfo _pi;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _shouldclose = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=79822849;
 //BA.debugLineNum = 79822849;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_CloseRequest");
RDebugUtils.currentLine=79822850;
 //BA.debugLineNum = 79822850;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubDebug(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest")));
RDebugUtils.currentLine=79822851;
 //BA.debugLineNum = 79822851;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagesmanager", "handlecloserequest"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (boolean) result[1];
;
RDebugUtils.currentLine=79822852;
 //BA.debugLineNum = 79822852;BA.debugLine="If ShouldClose Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_shouldclose) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=79822853;
 //BA.debugLineNum = 79822853;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=79822855;
 //BA.debugLineNum = 79822855;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _updatestackstring(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatestackstring", true))
	 {return ((String) Debug.delegate(ba, "updatestackstring", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _id = "";
RDebugUtils.currentLine=80478208;
 //BA.debugLineNum = 80478208;BA.debugLine="Public Sub UpdateStackString";
RDebugUtils.currentLine=80478209;
 //BA.debugLineNum = 80478209;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=80478210;
 //BA.debugLineNum = 80478210;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=80478211;
 //BA.debugLineNum = 80478211;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
RDebugUtils.currentLine=80478212;
 //BA.debugLineNum = 80478212;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=80478213;
 //BA.debugLineNum = 80478213;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mstackofpageids /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=80478214;
 //BA.debugLineNum = 80478214;BA.debugLine="sb.Append(id).Append(\", \")";
_sb.Append(_id).Append(", ");
 }
};
RDebugUtils.currentLine=80478216;
 //BA.debugLineNum = 80478216;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
_sb.Remove((int) (_sb.getLength()-2),_sb.getLength());
 };
RDebugUtils.currentLine=80478218;
 //BA.debugLineNum = 80478218;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
RDebugUtils.currentLine=80478219;
 //BA.debugLineNum = 80478219;BA.debugLine="StackString = sb.ToString";
__ref._stackstring /*String*/  = _sb.ToString();
RDebugUtils.currentLine=80478220;
 //BA.debugLineNum = 80478220;BA.debugLine="End Sub";
return "";
}
public String  _movepagetotop(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "movepagetotop", true))
	 {return ((String) Debug.delegate(ba, "movepagetotop", new Object[] {_pi}));}
RDebugUtils.currentLine=79364096;
 //BA.debugLineNum = 79364096;BA.debugLine="Private Sub MovePageToTop (pi As B4XPageInfo)";
RDebugUtils.currentLine=79364097;
 //BA.debugLineNum = 79364097;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=79364098;
 //BA.debugLineNum = 79364098;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=79364099;
 //BA.debugLineNum = 79364099;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=79364100;
 //BA.debugLineNum = 79364100;BA.debugLine="End Sub";
return "";
}
}