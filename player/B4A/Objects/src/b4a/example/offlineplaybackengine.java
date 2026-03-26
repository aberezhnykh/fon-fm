package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class offlineplaybackengine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.offlineplaybackengine");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.offlineplaybackengine.class).invoke(this, new Object[] {null});
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolveadvancedecision(boolean _shouldprioritizeservicequeue,boolean _canuseprepareditem,boolean _hasdispatchableserviceitem,boolean _haslocalreserve,boolean _allowload) throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
 //BA.debugLineNum = 11;BA.debugLine="Public Sub ResolveAdvanceDecision(shouldPrioritize";
 //BA.debugLineNum = 12;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="result.Put(\"action\", \"\")";
_result.Put((Object)("action"),(Object)(""));
 //BA.debugLineNum = 15;BA.debugLine="If shouldPrioritizeServiceQueue Then";
if (_shouldprioritizeservicequeue) { 
 //BA.debugLineNum = 16;BA.debugLine="result.Put(\"action\", \"play_queue_item\")";
_result.Put((Object)("action"),(Object)("play_queue_item"));
 //BA.debugLineNum = 17;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 19;BA.debugLine="If canUsePreparedItem Then";
if (_canuseprepareditem) { 
 //BA.debugLineNum = 20;BA.debugLine="result.Put(\"action\", \"use_prepared\")";
_result.Put((Object)("action"),(Object)("use_prepared"));
 //BA.debugLineNum = 21;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 23;BA.debugLine="If hasDispatchableServiceItem Then";
if (_hasdispatchableserviceitem) { 
 //BA.debugLineNum = 24;BA.debugLine="result.Put(\"action\", \"play_queue_item\")";
_result.Put((Object)("action"),(Object)("play_queue_item"));
 //BA.debugLineNum = 25;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 27;BA.debugLine="If hasLocalReserve Then";
if (_haslocalreserve) { 
 //BA.debugLineNum = 28;BA.debugLine="result.Put(\"action\", \"play_direct_local\")";
_result.Put((Object)("action"),(Object)("play_direct_local"));
 //BA.debugLineNum = 29;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 31;BA.debugLine="If allowLoad Then result.Put(\"action\", \"populate_";
if (_allowload) { 
_result.Put((Object)("action"),(Object)("populate_queue"));};
 //BA.debugLineNum = 32;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextmusicitem(b4a.example.playerstatestore _statestore) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub ResolveNextMusicItem(stateStore As Play";
 //BA.debugLineNum = 36;BA.debugLine="Return stateStore.ResolveNextLocalTrackItem";
if (true) return _statestore._resolvenextlocaltrackitem /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
