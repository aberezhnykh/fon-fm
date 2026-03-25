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
RDebugUtils.currentLine=76611584;
 //BA.debugLineNum = 76611584;BA.debugLine="Public Sub Initialize (MainForm As Form)";
RDebugUtils.currentLine=76611590;
 //BA.debugLineNum = 76611590;BA.debugLine="IdToB4XPage.Initialize";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=76611591;
 //BA.debugLineNum = 76611591;BA.debugLine="RootB4XToPage.Initialize";
__ref._rootb4xtopage /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=76611592;
 //BA.debugLineNum = 76611592;BA.debugLine="mStackOfPageIds.Initialize";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=76611594;
 //BA.debugLineNum = 76611594;BA.debugLine="mMainForm = MainForm";
__ref._mmainform /*anywheresoftware.b4j.objects.Form*/  = _mainform;
RDebugUtils.currentLine=76611605;
 //BA.debugLineNum = 76611605;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
_b4xpages._internalsetpagesmanager /*String*/ (this);
RDebugUtils.currentLine=76611606;
 //BA.debugLineNum = 76611606;BA.debugLine="MainPage.Initialize";
__ref._mainpage /*b4j.example.b4xmainpage*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=76611607;
 //BA.debugLineNum = 76611607;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=76611608;
 //BA.debugLineNum = 76611608;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)("~~~~~temp~~~~"),(Object)(__ref._createb4xpageinfo /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(Object)(__ref._mainpage /*b4j.example.b4xmainpage*/ ),"",__c.False,(Object)(""))));
RDebugUtils.currentLine=76611609;
 //BA.debugLineNum = 76611609;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=76611610;
 //BA.debugLineNum = 76611610;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)("~~~~~temp~~~~"));
RDebugUtils.currentLine=76611611;
 //BA.debugLineNum = 76611611;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
__ref._addpageandcreate /*String*/ (null,"MainPage",(Object)(__ref._mainpage /*b4j.example.b4xmainpage*/ ));
RDebugUtils.currentLine=76611612;
 //BA.debugLineNum = 76611612;BA.debugLine="If LogEvents = False Then";
if (__ref._logevents /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=76611613;
 //BA.debugLineNum = 76611613;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
__c.LogImpl("976611613","Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events.",0);
 };
RDebugUtils.currentLine=76611615;
 //BA.debugLineNum = 76611615;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
RDebugUtils.currentLine=76611616;
 //BA.debugLineNum = 76611616;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=76611617;
 //BA.debugLineNum = 76611617;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=76611620;
 //BA.debugLineNum = 76611620;BA.debugLine="End Sub";
return "";
}
public String  _addpage(b4j.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
String _idtolower = "";
RDebugUtils.currentLine=76677120;
 //BA.debugLineNum = 76677120;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=76677121;
 //BA.debugLineNum = 76677121;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = _id.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=76677122;
 //BA.debugLineNum = 76677122;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if (__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_idtolower))) { 
RDebugUtils.currentLine=76677123;
 //BA.debugLineNum = 76677123;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
__c.LogImpl("976677123",("Page with this id already exists: "+__c.SmartStringFormatter("",(Object)(_idtolower))+"!"),0);
RDebugUtils.currentLine=76677124;
 //BA.debugLineNum = 76677124;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=76677126;
 //BA.debugLineNum = 76677126;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_idtolower),(Object)(__ref._createb4xpageinfo /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage,_idtolower,__c.False,(Object)(_id))));
RDebugUtils.currentLine=76677127;
 //BA.debugLineNum = 76677127;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if (__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1) { 
__ref._showpage /*String*/ (null,_idtolower);};
RDebugUtils.currentLine=76677128;
 //BA.debugLineNum = 76677128;BA.debugLine="End Sub";
return "";
}
public String  _addpageandcreate(b4j.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=76742656;
 //BA.debugLineNum = 76742656;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=76742657;
 //BA.debugLineNum = 76742657;BA.debugLine="AddPage (Id, B4XPage)";
__ref._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=76742658;
 //BA.debugLineNum = 76742658;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
__ref._createpageifneeded /*String*/ (null,__ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id));
RDebugUtils.currentLine=76742659;
 //BA.debugLineNum = 76742659;BA.debugLine="End Sub";
return "";
}
public String  _closepage(b4j.example.b4xpagesmanager __ref,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
boolean _isclosingtoppage = false;
RDebugUtils.currentLine=76939264;
 //BA.debugLineNum = 76939264;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=76939265;
 //BA.debugLineNum = 76939265;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=76939266;
 //BA.debugLineNum = 76939266;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_pi.Id /*String*/ ))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=76939267;
 //BA.debugLineNum = 76939267;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && (__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi) == false) { 
RDebugUtils.currentLine=76939268;
 //BA.debugLineNum = 76939268;BA.debugLine="Log(\"Only top page can be closed\")";
__c.LogImpl("976939268","Only top page can be closed",0);
RDebugUtils.currentLine=76939269;
 //BA.debugLineNum = 76939269;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=76939270;
 //BA.debugLineNum = 76939270;BA.debugLine="Else If xui.IsB4i And mStackOfPageIds.Size = 1 Th";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && __ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=76939271;
 //BA.debugLineNum = 76939271;BA.debugLine="Log(\"First page cannot be closed\")";
__c.LogImpl("976939271","First page cannot be closed",0);
RDebugUtils.currentLine=76939272;
 //BA.debugLineNum = 76939272;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=76939274;
 //BA.debugLineNum = 76939274;BA.debugLine="Dim IsClosingTopPage As Boolean = GetTopPage = pi";
_isclosingtoppage = (__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi);
RDebugUtils.currentLine=76939275;
 //BA.debugLineNum = 76939275;BA.debugLine="ClosePageImpl(pi)";
__ref._closepageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=76939276;
 //BA.debugLineNum = 76939276;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=76939277;
 //BA.debugLineNum = 76939277;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
 };
RDebugUtils.currentLine=76939279;
 //BA.debugLineNum = 76939279;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
if (true) return "";};
RDebugUtils.currentLine=76939280;
 //BA.debugLineNum = 76939280;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=76939281;
 //BA.debugLineNum = 76939281;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=76939282;
 //BA.debugLineNum = 76939282;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._showpageimpl /*String*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null));};
RDebugUtils.currentLine=76939283;
 //BA.debugLineNum = 76939283;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
 };
RDebugUtils.currentLine=76939285;
 //BA.debugLineNum = 76939285;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _findpifromb4xpage(b4j.example.b4xpagesmanager __ref,Object _page) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "findpifromb4xpage", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "findpifromb4xpage", new Object[] {_page}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=77135872;
 //BA.debugLineNum = 77135872;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
RDebugUtils.currentLine=77135873;
 //BA.debugLineNum = 77135873;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4j.example.b4xpagesmanager._b4xpageinfo)(group1.Get(index1));
RDebugUtils.currentLine=77135874;
 //BA.debugLineNum = 77135874;BA.debugLine="If pi.B4XPage = Page Then";
if ((_pi.B4XPage /*Object*/ ).equals(_page)) { 
RDebugUtils.currentLine=77135875;
 //BA.debugLineNum = 77135875;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
RDebugUtils.currentLine=77135878;
 //BA.debugLineNum = 77135878;BA.debugLine="Return Null";
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__c.Null);
RDebugUtils.currentLine=77135879;
 //BA.debugLineNum = 77135879;BA.debugLine="End Sub";
return null;
}
public Object  _getpage(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=77529088;
 //BA.debugLineNum = 77529088;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=77529089;
 //BA.debugLineNum = 77529089;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id).B4XPage /*Object*/ ;
RDebugUtils.currentLine=77529090;
 //BA.debugLineNum = 77529090;BA.debugLine="End Sub";
return null;
}
public String  _settitle(b4j.example.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=77398016;
 //BA.debugLineNum = 77398016;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=77398017;
 //BA.debugLineNum = 77398017;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=77398018;
 //BA.debugLineNum = 77398018;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=77398019;
 //BA.debugLineNum = 77398019;BA.debugLine="pi.Parent.NativeType.Title = Title";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_title));
RDebugUtils.currentLine=77398020;
 //BA.debugLineNum = 77398020;BA.debugLine="End Sub";
return "";
}
public String  _showpage(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=76808192;
 //BA.debugLineNum = 76808192;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=76808193;
 //BA.debugLineNum = 76808193;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=76808194;
 //BA.debugLineNum = 76808194;BA.debugLine="If pi = GetTopPage Then Return";
if ((_pi).equals(__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null))) { 
if (true) return "";};
RDebugUtils.currentLine=76808195;
 //BA.debugLineNum = 76808195;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=76808196;
 //BA.debugLineNum = 76808196;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=76808210;
 //BA.debugLineNum = 76808210;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=76808211;
 //BA.debugLineNum = 76808211;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=76808212;
 //BA.debugLineNum = 76808212;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=76808213;
 //BA.debugLineNum = 76808213;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=76808214;
 //BA.debugLineNum = 76808214;BA.debugLine="End Sub";
return "";
}
public String  _showpageandremovepreviouspages(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pagetoremove = null;
RDebugUtils.currentLine=76873728;
 //BA.debugLineNum = 76873728;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=76873729;
 //BA.debugLineNum = 76873729;BA.debugLine="If GetTopPage = Null Then";
if (__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null)== null) { 
RDebugUtils.currentLine=76873730;
 //BA.debugLineNum = 76873730;BA.debugLine="ShowPage(Id)";
__ref._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=76873731;
 //BA.debugLineNum = 76873731;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=76873733;
 //BA.debugLineNum = 76873733;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=76873734;
 //BA.debugLineNum = 76873734;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=76873735;
 //BA.debugLineNum = 76873735;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=76873739;
 //BA.debugLineNum = 76873739;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._mstackofpageids /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=76873740;
 //BA.debugLineNum = 76873740;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
_pagetoremove = __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=76873744;
 //BA.debugLineNum = 76873744;BA.debugLine="If PageToRemove.Id = pi.Id Then Continue";
if ((_pagetoremove.Id /*String*/ ).equals(_pi.Id /*String*/ )) { 
if (true) continue;};
RDebugUtils.currentLine=76873745;
 //BA.debugLineNum = 76873745;BA.debugLine="PageToRemove.Parent.NativeType.Close";
_pagetoremove.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Close();
 }
};
RDebugUtils.currentLine=76873749;
 //BA.debugLineNum = 76873749;BA.debugLine="mStackOfPageIds.Clear";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=76873750;
 //BA.debugLineNum = 76873750;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=76873751;
 //BA.debugLineNum = 76873751;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=76873752;
 //BA.debugLineNum = 76873752;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=76873754;
 //BA.debugLineNum = 76873754;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=76873755;
 //BA.debugLineNum = 76873755;BA.debugLine="End Sub";
return "";
}
public String  _activity_pause(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=78708736;
 //BA.debugLineNum = 78708736;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=78708737;
 //BA.debugLineNum = 78708737;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
__ref._raiseeventwithresult /*Object*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=78708738;
 //BA.debugLineNum = 78708738;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=78708739;
 //BA.debugLineNum = 78708739;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
boolean _shouldraise = false;
RDebugUtils.currentLine=78577664;
 //BA.debugLineNum = 78577664;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=78577665;
 //BA.debugLineNum = 78577665;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = __ref._isforeground /*boolean*/ ==__c.False;
RDebugUtils.currentLine=78577666;
 //BA.debugLineNum = 78577666;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=78577667;
 //BA.debugLineNum = 78577667;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
RDebugUtils.currentLine=78577668;
 //BA.debugLineNum = 78577668;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
RDebugUtils.currentLine=78577670;
 //BA.debugLineNum = 78577670;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closed(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_closed", true))
	 {return ((String) Debug.delegate(ba, "mainform_closed", null));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=77922304;
 //BA.debugLineNum = 77922304;BA.debugLine="Public Sub MainForm_Closed";
RDebugUtils.currentLine=77922305;
 //BA.debugLineNum = 77922305;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=77922306;
 //BA.debugLineNum = 77922306;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=77922307;
 //BA.debugLineNum = 77922307;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", Nul";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=77922308;
 //BA.debugLineNum = 77922308;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=77922309;
 //BA.debugLineNum = 77922309;BA.debugLine="If mStackOfPageIds.Size = 0 Then";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==0) { 
RDebugUtils.currentLine=77922310;
 //BA.debugLineNum = 77922310;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=77922312;
 //BA.debugLineNum = 77922312;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=77922313;
 //BA.debugLineNum = 77922313;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closerequest(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_closerequest", true))
	 {return ((String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=78053376;
 //BA.debugLineNum = 78053376;BA.debugLine="Public Sub MainForm_CloseRequest (EventData As Eve";
RDebugUtils.currentLine=78053377;
 //BA.debugLineNum = 78053377;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=78053378;
 //BA.debugLineNum = 78053378;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=78053379;
 //BA.debugLineNum = 78053379;BA.debugLine="If pi <> Null And CloseRequestExists (pi) Then";
if (_pi!= null && __ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=78053380;
 //BA.debugLineNum = 78053380;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=78053381;
 //BA.debugLineNum = 78053381;BA.debugLine="HandleCloseRequest (pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 };
RDebugUtils.currentLine=78053383;
 //BA.debugLineNum = 78053383;BA.debugLine="End Sub";
return "";
}
public String  _mainform_focuschanged(b4j.example.b4xpagesmanager __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "mainform_focuschanged", new Object[] {_hasfocus}));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=77856768;
 //BA.debugLineNum = 77856768;BA.debugLine="Public Sub MainForm_FocusChanged (HasFocus As Bool";
RDebugUtils.currentLine=77856769;
 //BA.debugLineNum = 77856769;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=77856770;
 //BA.debugLineNum = 77856770;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=77856771;
 //BA.debugLineNum = 77856771;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=77856772;
 //BA.debugLineNum = 77856772;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=77856773;
 //BA.debugLineNum = 77856773;BA.debugLine="MovePageToTop(pi)";
__ref._movepagetotop /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=77856775;
 //BA.debugLineNum = 77856775;BA.debugLine="End Sub";
return "";
}
public String  _mainform_iconifiedchanged(b4j.example.b4xpagesmanager __ref,boolean _iconified) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_iconifiedchanged", true))
	 {return ((String) Debug.delegate(ba, "mainform_iconifiedchanged", new Object[] {_iconified}));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=77987840;
 //BA.debugLineNum = 77987840;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
RDebugUtils.currentLine=77987841;
 //BA.debugLineNum = 77987841;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=77987842;
 //BA.debugLineNum = 77987842;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=77987843;
 //BA.debugLineNum = 77987843;BA.debugLine="RaiseEvent(pi, \"B4XPage_IconifiedChanged\", Array(";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_IconifiedChanged",new Object[]{(Object)(_iconified)});
RDebugUtils.currentLine=77987844;
 //BA.debugLineNum = 77987844;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4j.example.b4xpagesmanager __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
int _w = 0;
int _h = 0;
RDebugUtils.currentLine=78381056;
 //BA.debugLineNum = 78381056;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=78381057;
 //BA.debugLineNum = 78381057;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
RDebugUtils.currentLine=78381058;
 //BA.debugLineNum = 78381058;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
RDebugUtils.currentLine=78381059;
 //BA.debugLineNum = 78381059;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
__ref._raiseevent /*String*/ (null,__ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))),"B4XPage_Resize",new Object[]{(Object)(_w),(Object)(_h)});
RDebugUtils.currentLine=78381060;
 //BA.debugLineNum = 78381060;BA.debugLine="End Sub";
return "";
}
public Object  _raiseeventwithresult(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseeventwithresult", true))
	 {return ((Object) Debug.delegate(ba, "raiseeventwithresult", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=78315520;
 //BA.debugLineNum = 78315520;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
RDebugUtils.currentLine=78315521;
 //BA.debugLineNum = 78315521;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== null) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=78315522;
 //BA.debugLineNum = 78315522;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=78315523;
 //BA.debugLineNum = 78315523;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=78315524;
 //BA.debugLineNum = 78315524;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=78315525;
 //BA.debugLineNum = 78315525;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=78315526;
 //BA.debugLineNum = 78315526;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=78315528;
 //BA.debugLineNum = 78315528;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return __c.CallSubNew(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=78315530;
 //BA.debugLineNum = 78315530;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=78315532;
 //BA.debugLineNum = 78315532;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=78315534;
 //BA.debugLineNum = 78315534;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("978315534","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=78315536;
 //BA.debugLineNum = 78315536;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=78315537;
 //BA.debugLineNum = 78315537;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _gettoppage(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "gettoppage", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "gettoppage", null));}
RDebugUtils.currentLine=78446592;
 //BA.debugLineNum = 78446592;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
RDebugUtils.currentLine=78446593;
 //BA.debugLineNum = 78446593;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==0) { 
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__c.Null);};
RDebugUtils.currentLine=78446594;
 //BA.debugLineNum = 78446594;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mstackofpageids /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)-1))));
RDebugUtils.currentLine=78446595;
 //BA.debugLineNum = 78446595;BA.debugLine="End Sub";
return null;
}
public String  _backgroundstatechanged(b4j.example.b4xpagesmanager __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "backgroundstatechanged", true))
	 {return ((String) Debug.delegate(ba, "backgroundstatechanged", new Object[] {_newstate}));}
String _ev = "";
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=78643200;
 //BA.debugLineNum = 78643200;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
RDebugUtils.currentLine=78643201;
 //BA.debugLineNum = 78643201;BA.debugLine="If IsForeground = NewState Then Return";
if (__ref._isforeground /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=78643202;
 //BA.debugLineNum = 78643202;BA.debugLine="IsForeground = NewState";
__ref._isforeground /*boolean*/  = _newstate;
RDebugUtils.currentLine=78643203;
 //BA.debugLineNum = 78643203;BA.debugLine="Dim ev As String";
_ev = "";
RDebugUtils.currentLine=78643204;
 //BA.debugLineNum = 78643204;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (__ref._isforeground /*boolean*/ ) { 
_ev = "B4XPage_Foreground";}
else {
_ev = "B4XPage_Background";};
RDebugUtils.currentLine=78643205;
 //BA.debugLineNum = 78643205;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (b4j.example.b4xpagesmanager._b4xpageinfo)(group5.Get(index5));
RDebugUtils.currentLine=78643206;
 //BA.debugLineNum = 78643206;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,_ev,(int) (0))) { 
RDebugUtils.currentLine=78643207;
 //BA.debugLineNum = 78643207;BA.debugLine="LogEvent(pi, ev)";
__ref._logevent /*String*/ (null,_pi,_ev);
RDebugUtils.currentLine=78643208;
 //BA.debugLineNum = 78643208;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=78643209;
 //BA.debugLineNum = 78643209;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
__c.CallSubDelayed(ba,_pi.B4XPage /*Object*/ ,_ev);
 }else {
RDebugUtils.currentLine=78643211;
 //BA.debugLineNum = 78643211;BA.debugLine="CallSub(pi.B4XPage, ev)";
__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,_ev);
 };
 };
 }
};
RDebugUtils.currentLine=78643215;
 //BA.debugLineNum = 78643215;BA.debugLine="End Sub";
return "";
}
public String  _raiseevent(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {return ((String) Debug.delegate(ba, "raiseevent", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=78249984;
 //BA.debugLineNum = 78249984;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
RDebugUtils.currentLine=78249985;
 //BA.debugLineNum = 78249985;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== null) { 
if (true) return "";};
RDebugUtils.currentLine=78249986;
 //BA.debugLineNum = 78249986;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=78249987;
 //BA.debugLineNum = 78249987;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=78249988;
 //BA.debugLineNum = 78249988;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=78249989;
 //BA.debugLineNum = 78249989;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=78249990;
 //BA.debugLineNum = 78249990;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=78249992;
 //BA.debugLineNum = 78249992;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
__c.CallSubDelayed(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=78249994;
 //BA.debugLineNum = 78249994;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=78249996;
 //BA.debugLineNum = 78249996;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=78249998;
 //BA.debugLineNum = 78249998;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("978249998","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=78250000;
 //BA.debugLineNum = 78250000;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _createb4xpageinfo(b4j.example.b4xpagesmanager __ref,Object _b4xpage,String _id,boolean _created,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageinfo", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "createb4xpageinfo", new Object[] {_b4xpage,_id,_created,_title}));}
b4j.example.b4xpagesmanager._b4xpageinfo _t1 = null;
RDebugUtils.currentLine=77791232;
 //BA.debugLineNum = 77791232;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
RDebugUtils.currentLine=77791233;
 //BA.debugLineNum = 77791233;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = new b4j.example.b4xpagesmanager._b4xpageinfo();
RDebugUtils.currentLine=77791234;
 //BA.debugLineNum = 77791234;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=77791235;
 //BA.debugLineNum = 77791235;BA.debugLine="t1.B4XPage = B4XPage";
_t1.B4XPage /*Object*/  = _b4xpage;
RDebugUtils.currentLine=77791236;
 //BA.debugLineNum = 77791236;BA.debugLine="t1.Id = Id";
_t1.Id /*String*/  = _id;
RDebugUtils.currentLine=77791237;
 //BA.debugLineNum = 77791237;BA.debugLine="t1.Created = Created";
_t1.Created /*boolean*/  = _created;
RDebugUtils.currentLine=77791238;
 //BA.debugLineNum = 77791238;BA.debugLine="t1.Title = Title";
_t1.Title /*Object*/  = _title;
RDebugUtils.currentLine=77791239;
 //BA.debugLineNum = 77791239;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=77791240;
 //BA.debugLineNum = 77791240;BA.debugLine="End Sub";
return null;
}
public String  _createpageifneeded(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageifneeded", true))
	 {return ((String) Debug.delegate(ba, "createpageifneeded", new Object[] {_pi}));}
RDebugUtils.currentLine=77332480;
 //BA.debugLineNum = 77332480;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
RDebugUtils.currentLine=77332481;
 //BA.debugLineNum = 77332481;BA.debugLine="If pi.Created Then Return";
if (_pi.Created /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=77332482;
 //BA.debugLineNum = 77332482;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi.IsFirst /*boolean*/  = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1;
RDebugUtils.currentLine=77332483;
 //BA.debugLineNum = 77332483;BA.debugLine="CreatePageImpl (pi)";
__ref._createpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=77332484;
 //BA.debugLineNum = 77332484;BA.debugLine="pi.Created = True";
_pi.Created /*boolean*/  = __c.True;
RDebugUtils.currentLine=77332485;
 //BA.debugLineNum = 77332485;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
__ref._rootb4xtopage /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_pi));
RDebugUtils.currentLine=77332486;
 //BA.debugLineNum = 77332486;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_Created");
RDebugUtils.currentLine=77332487;
 //BA.debugLineNum = 77332487;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
__c.CallSubDebug2(ba,_pi.B4XPage /*Object*/ ,"B4XPage_Created",(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
RDebugUtils.currentLine=77332489;
 //BA.debugLineNum = 77332489;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _getpagefromid(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpagefromid", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpagefromid", new Object[] {_id}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=77594624;
 //BA.debugLineNum = 77594624;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
RDebugUtils.currentLine=77594625;
 //BA.debugLineNum = 77594625;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (b4j.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_id.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale))));
RDebugUtils.currentLine=77594626;
 //BA.debugLineNum = 77594626;BA.debugLine="If pi = Null Then";
if (_pi== null) { 
RDebugUtils.currentLine=77594627;
 //BA.debugLineNum = 77594627;BA.debugLine="Log(\"Error: page id not found: \" & id)";
__c.LogImpl("977594627","Error: page id not found: "+_id,0);
RDebugUtils.currentLine=77594628;
 //BA.debugLineNum = 77594628;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
__c.LogImpl("977594628","Ids: "+BA.ObjectToString(__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null)),0);
 };
RDebugUtils.currentLine=77594630;
 //BA.debugLineNum = 77594630;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=77594631;
 //BA.debugLineNum = 77594631;BA.debugLine="End Sub";
return null;
}
public String  _logevent(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi,String _ev) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "logevent", true))
	 {return ((String) Debug.delegate(ba, "logevent", new Object[] {_pi,_ev}));}
String _msg = "";
RDebugUtils.currentLine=78774272;
 //BA.debugLineNum = 78774272;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
RDebugUtils.currentLine=78774273;
 //BA.debugLineNum = 78774273;BA.debugLine="If LogEvents Then";
if (__ref._logevents /*boolean*/ ) { 
RDebugUtils.currentLine=78774274;
 //BA.debugLineNum = 78774274;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ("*** "+__c.SmartStringFormatter("",(Object)(_pi.Id /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_ev))+" "+__c.SmartStringFormatter("",(Object)(__ref._stackstring /*String*/ ))+"");
RDebugUtils.currentLine=78774275;
 //BA.debugLineNum = 78774275;BA.debugLine="Log(msg)";
__c.LogImpl("978774275",_msg,0);
 };
RDebugUtils.currentLine=78774277;
 //BA.debugLineNum = 78774277;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=76546048;
 //BA.debugLineNum = 76546048;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=76546049;
 //BA.debugLineNum = 76546049;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
_idtob4xpage = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=76546050;
 //BA.debugLineNum = 76546050;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
_rootb4xtopage = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=76546056;
 //BA.debugLineNum = 76546056;BA.debugLine="Type B4XPageParent (NativeType As Form)";
;
RDebugUtils.currentLine=76546060;
 //BA.debugLineNum = 76546060;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
RDebugUtils.currentLine=76546064;
 //BA.debugLineNum = 76546064;BA.debugLine="Public mStackOfPageIds As B4XSet";
_mstackofpageids = new b4j.example.b4xset();
RDebugUtils.currentLine=76546065;
 //BA.debugLineNum = 76546065;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=76546067;
 //BA.debugLineNum = 76546067;BA.debugLine="Private mMainForm As Form";
_mmainform = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=76546075;
 //BA.debugLineNum = 76546075;BA.debugLine="Public IsForeground As Boolean";
_isforeground = false;
RDebugUtils.currentLine=76546076;
 //BA.debugLineNum = 76546076;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
_transitionanimationduration = (int) (100);
RDebugUtils.currentLine=76546077;
 //BA.debugLineNum = 76546077;BA.debugLine="Public MainPage As B4XMainPage";
_mainpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=76546078;
 //BA.debugLineNum = 76546078;BA.debugLine="Private StackString As String";
_stackstring = "";
RDebugUtils.currentLine=76546079;
 //BA.debugLineNum = 76546079;BA.debugLine="Public LogEvents As Boolean = False";
_logevents = __c.False;
RDebugUtils.currentLine=76546080;
 //BA.debugLineNum = 76546080;BA.debugLine="End Sub";
return "";
}
public String  _closepageimpl(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepageimpl", true))
	 {return ((String) Debug.delegate(ba, "closepageimpl", new Object[] {_pi}));}
RDebugUtils.currentLine=77201408;
 //BA.debugLineNum = 77201408;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
RDebugUtils.currentLine=77201420;
 //BA.debugLineNum = 77201420;BA.debugLine="pi.Parent.NativeType.Close";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=77201424;
 //BA.debugLineNum = 77201424;BA.debugLine="End Sub";
return "";
}
public String  _toppagedisappear(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppagedisappear", true))
	 {return ((String) Debug.delegate(ba, "toppagedisappear", null));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=77004800;
 //BA.debugLineNum = 77004800;BA.debugLine="Private Sub TopPageDisappear";
RDebugUtils.currentLine=77004801;
 //BA.debugLineNum = 77004801;BA.debugLine="If xui.IsB4J Then Return";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
if (true) return "";};
RDebugUtils.currentLine=77004802;
 //BA.debugLineNum = 77004802;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=77004803;
 //BA.debugLineNum = 77004803;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=77004804;
 //BA.debugLineNum = 77004804;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=77004805;
 //BA.debugLineNum = 77004805;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=77004806;
 //BA.debugLineNum = 77004806;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=77004809;
 //BA.debugLineNum = 77004809;BA.debugLine="End Sub";
return "";
}
public String  _showpageimpl(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageimpl", true))
	 {return ((String) Debug.delegate(ba, "showpageimpl", new Object[] {_pi}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=77266944;
 //BA.debugLineNum = 77266944;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=77266946;
 //BA.debugLineNum = 77266946;BA.debugLine="pi.Parent.NativeType.Show";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=77266947;
 //BA.debugLineNum = 77266947;BA.debugLine="Dim jo As JavaObject = pi.Parent.NativeType";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=77266948;
 //BA.debugLineNum = 77266948;BA.debugLine="jo.GetFieldJO(\"stage\").RunMethod(\"requestFocus\",";
_jo.GetFieldJO("stage").RunMethod("requestFocus",(Object[])(__c.Null));
RDebugUtils.currentLine=77266961;
 //BA.debugLineNum = 77266961;BA.debugLine="End Sub";
return "";
}
public String  _toppageappear(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppageappear", true))
	 {return ((String) Debug.delegate(ba, "toppageappear", null));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=77070336;
 //BA.debugLineNum = 77070336;BA.debugLine="Private Sub TopPageAppear";
RDebugUtils.currentLine=77070337;
 //BA.debugLineNum = 77070337;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=77070338;
 //BA.debugLineNum = 77070338;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=77070339;
 //BA.debugLineNum = 77070339;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=77070340;
 //BA.debugLineNum = 77070340;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=77070341;
 //BA.debugLineNum = 77070341;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=77070342;
 //BA.debugLineNum = 77070342;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=77070351;
 //BA.debugLineNum = 77070351;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=77070352;
 //BA.debugLineNum = 77070352;BA.debugLine="End Sub";
return "";
}
public boolean  _closerequestexists(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closerequestexists", true))
	 {return ((Boolean) Debug.delegate(ba, "closerequestexists", new Object[] {_pi}));}
RDebugUtils.currentLine=78118912;
 //BA.debugLineNum = 78118912;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
RDebugUtils.currentLine=78118913;
 //BA.debugLineNum = 78118913;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest",(int) (0));
RDebugUtils.currentLine=78118914;
 //BA.debugLineNum = 78118914;BA.debugLine="End Sub";
return false;
}
public b4j.example.b4xpagesmanager._b4xpageparent  _createb4xpageparent(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4j.objects.Form _nativetype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageparent", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageparent) Debug.delegate(ba, "createb4xpageparent", new Object[] {_nativetype}));}
b4j.example.b4xpagesmanager._b4xpageparent _t1 = null;
RDebugUtils.currentLine=78512128;
 //BA.debugLineNum = 78512128;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As For";
RDebugUtils.currentLine=78512132;
 //BA.debugLineNum = 78512132;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = new b4j.example.b4xpagesmanager._b4xpageparent();
RDebugUtils.currentLine=78512133;
 //BA.debugLineNum = 78512133;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=78512134;
 //BA.debugLineNum = 78512134;BA.debugLine="t1.NativeType = NativeType";
_t1.NativeType /*anywheresoftware.b4j.objects.Form*/  = _nativetype;
RDebugUtils.currentLine=78512135;
 //BA.debugLineNum = 78512135;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=78512136;
 //BA.debugLineNum = 78512136;BA.debugLine="End Sub";
return null;
}
public String  _createpageimpl(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageimpl", true))
	 {return ((String) Debug.delegate(ba, "createpageimpl", new Object[] {_pi}));}
anywheresoftware.b4j.objects.Form _f = null;
RDebugUtils.currentLine=77463552;
 //BA.debugLineNum = 77463552;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=77463554;
 //BA.debugLineNum = 77463554;BA.debugLine="If pi.IsFirst Then";
if (_pi.IsFirst /*boolean*/ ) { 
RDebugUtils.currentLine=77463555;
 //BA.debugLineNum = 77463555;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4j.example.b4xpagesmanager._b4xpageparent*/ (null,__ref._mmainform /*anywheresoftware.b4j.objects.Form*/ );
 }else {
RDebugUtils.currentLine=77463557;
 //BA.debugLineNum = 77463557;BA.debugLine="Dim f As Form";
_f = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=77463558;
 //BA.debugLineNum = 77463558;BA.debugLine="f.Initialize(\"MainForm\", mMainForm.RootPane.Widt";
_f.Initialize(ba,"MainForm",__ref._mmainform /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getWidth(),__ref._mmainform /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getHeight());
RDebugUtils.currentLine=77463559;
 //BA.debugLineNum = 77463559;BA.debugLine="pi.Parent = CreateB4XPageParent(f)";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4j.example.b4xpagesmanager._b4xpageparent*/ (null,_f);
 };
RDebugUtils.currentLine=77463561;
 //BA.debugLineNum = 77463561;BA.debugLine="pi.Root = pi.Parent.NativeType.RootPane";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject()));
RDebugUtils.currentLine=77463562;
 //BA.debugLineNum = 77463562;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=77463575;
 //BA.debugLineNum = 77463575;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _getpageinfofromroot(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpageinfofromroot", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpageinfofromroot", new Object[] {_root}));}
RDebugUtils.currentLine=77660160;
 //BA.debugLineNum = 77660160;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
RDebugUtils.currentLine=77660161;
 //BA.debugLineNum = 77660161;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__ref._rootb4xtopage /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_root.getObject())));
RDebugUtils.currentLine=77660162;
 //BA.debugLineNum = 77660162;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=78184449;
 //BA.debugLineNum = 78184449;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_CloseRequest");
RDebugUtils.currentLine=78184450;
 //BA.debugLineNum = 78184450;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubDebug(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest")));
RDebugUtils.currentLine=78184451;
 //BA.debugLineNum = 78184451;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagesmanager", "handlecloserequest"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (boolean) result[1];
;
RDebugUtils.currentLine=78184452;
 //BA.debugLineNum = 78184452;BA.debugLine="If ShouldClose Then";
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
RDebugUtils.currentLine=78184453;
 //BA.debugLineNum = 78184453;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=78184455;
 //BA.debugLineNum = 78184455;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=78839808;
 //BA.debugLineNum = 78839808;BA.debugLine="Public Sub UpdateStackString";
RDebugUtils.currentLine=78839809;
 //BA.debugLineNum = 78839809;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=78839810;
 //BA.debugLineNum = 78839810;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=78839811;
 //BA.debugLineNum = 78839811;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
RDebugUtils.currentLine=78839812;
 //BA.debugLineNum = 78839812;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=78839813;
 //BA.debugLineNum = 78839813;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mstackofpageids /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=78839814;
 //BA.debugLineNum = 78839814;BA.debugLine="sb.Append(id).Append(\", \")";
_sb.Append(_id).Append(", ");
 }
};
RDebugUtils.currentLine=78839816;
 //BA.debugLineNum = 78839816;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
_sb.Remove((int) (_sb.getLength()-2),_sb.getLength());
 };
RDebugUtils.currentLine=78839818;
 //BA.debugLineNum = 78839818;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
RDebugUtils.currentLine=78839819;
 //BA.debugLineNum = 78839819;BA.debugLine="StackString = sb.ToString";
__ref._stackstring /*String*/  = _sb.ToString();
RDebugUtils.currentLine=78839820;
 //BA.debugLineNum = 78839820;BA.debugLine="End Sub";
return "";
}
public String  _movepagetotop(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "movepagetotop", true))
	 {return ((String) Debug.delegate(ba, "movepagetotop", new Object[] {_pi}));}
RDebugUtils.currentLine=77725696;
 //BA.debugLineNum = 77725696;BA.debugLine="Private Sub MovePageToTop (pi As B4XPageInfo)";
RDebugUtils.currentLine=77725697;
 //BA.debugLineNum = 77725697;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=77725698;
 //BA.debugLineNum = 77725698;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=77725699;
 //BA.debugLineNum = 77725699;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=77725700;
 //BA.debugLineNum = 77725700;BA.debugLine="End Sub";
return "";
}
}