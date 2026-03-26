package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbackservicebridge extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbackservicebridge");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbackservicebridge.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _attachpage(Object _page) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Public Sub AttachPage(page As Object)";
 //BA.debugLineNum = 9;BA.debugLine="Starter.AttachPlaybackPage(page)";
_starter._attachplaybackpage /*String*/ (_page);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _cancelcacheaudit() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub CancelCacheAudit";
 //BA.debugLineNum = 61;BA.debugLine="Starter.CancelPlaybackCacheAudit";
_starter._cancelplaybackcacheaudit /*String*/ ();
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _cancelplaybackbreak() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub CancelPlaybackBreak";
 //BA.debugLineNum = 53;BA.debugLine="Starter.CancelPlaybackBreak";
_starter._cancelplaybackbreak /*String*/ ();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public String  _configurebackgroundtimers(boolean _enablenetworktimers) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub ConfigureBackgroundTimers(enableNetwork";
 //BA.debugLineNum = 41;BA.debugLine="Starter.ConfigurePlaybackBackgroundTimers(enableN";
_starter._configureplaybackbackgroundtimers /*String*/ (_enablenetworktimers);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _detachpage(Object _page) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub DetachPage(page As Object)";
 //BA.debugLineNum = 13;BA.debugLine="Starter.DetachPlaybackPage(page)";
_starter._detachplaybackpage /*String*/ (_page);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getpublishedstate() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub GetPublishedState As Map";
 //BA.debugLineNum = 69;BA.debugLine="Return Starter.GetPublishedPlaybackState";
if (true) return _starter._getpublishedplaybackstate /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public boolean  _hasattachedpage() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub HasAttachedPage As Boolean";
 //BA.debugLineNum = 25;BA.debugLine="Return Starter.HasPlaybackPage";
if (true) return _starter._hasplaybackpage /*boolean*/ ();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _onpageappear(Object _page) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub OnPageAppear(page As Object)";
 //BA.debugLineNum = 17;BA.debugLine="AttachPage(page)";
_attachpage(_page);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _onpagedisappear(Object _page) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub OnPageDisappear(page As Object)";
 //BA.debugLineNum = 21;BA.debugLine="DetachPage(page)";
_detachpage(_page);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _publishstate(anywheresoftware.b4a.objects.collections.Map _publishedstate) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub PublishState(publishedState As Map)";
 //BA.debugLineNum = 65;BA.debugLine="Starter.UpdatePublishedPlaybackState(publishedSta";
_starter._updatepublishedplaybackstate /*String*/ (_publishedstate);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _requestplaybackautostart() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub RequestPlaybackAutoStart";
 //BA.debugLineNum = 29;BA.debugLine="Starter.RequestPlaybackAutoStart";
_starter._requestplaybackautostart /*String*/ ();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _requestplaybackmanualstart() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub RequestPlaybackManualStart";
 //BA.debugLineNum = 33;BA.debugLine="Starter.RequestPlaybackManualStart";
_starter._requestplaybackmanualstart /*String*/ ();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _requestplaybackstop() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub RequestPlaybackStop";
 //BA.debugLineNum = 37;BA.debugLine="Starter.RequestPlaybackStop";
_starter._requestplaybackstop /*String*/ ();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _schedulecacheaudit(int _delayms) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub ScheduleCacheAudit(delayMs As Int)";
 //BA.debugLineNum = 57;BA.debugLine="Starter.SchedulePlaybackCacheAudit(delayMs)";
_starter._scheduleplaybackcacheaudit /*String*/ (_delayms);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _scheduleplaybackbreak(long _delayms) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub SchedulePlaybackBreak(delayMs As Long)";
 //BA.debugLineNum = 49;BA.debugLine="Starter.SchedulePlaybackBreak(delayMs)";
_starter._scheduleplaybackbreak /*String*/ (_delayms);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _stopbackgroundtimers() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Public Sub StopBackgroundTimers";
 //BA.debugLineNum = 45;BA.debugLine="Starter.StopPlaybackBackgroundTimers";
_starter._stopplaybackbackgroundtimers /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
