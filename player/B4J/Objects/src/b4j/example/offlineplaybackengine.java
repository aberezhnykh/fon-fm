package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class offlineplaybackengine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.offlineplaybackengine", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.offlineplaybackengine.class).invoke(this, new Object[] {null});
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
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.collections.Map  _resolvenextmusicitem(b4j.example.offlineplaybackengine __ref,b4j.example.playerstatestore _statestore) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlineplaybackengine";
if (Debug.shouldDelegate(ba, "resolvenextmusicitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextmusicitem", new Object[] {_statestore}));}
RDebugUtils.currentLine=85458944;
 //BA.debugLineNum = 85458944;BA.debugLine="Public Sub ResolveNextMusicItem(stateStore As Play";
RDebugUtils.currentLine=85458945;
 //BA.debugLineNum = 85458945;BA.debugLine="Return stateStore.ResolveNextLocalTrackItem";
if (true) return _statestore._resolvenextlocaltrackitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=85458946;
 //BA.debugLineNum = 85458946;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.offlineplaybackengine __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="offlineplaybackengine";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=85327872;
 //BA.debugLineNum = 85327872;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=85327873;
 //BA.debugLineNum = 85327873;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolveadvancedecision(b4j.example.offlineplaybackengine __ref,boolean _shouldprioritizeservicequeue,boolean _canuseprepareditem,boolean _hasdispatchableserviceitem,boolean _haslocalreserve,boolean _allowload) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlineplaybackengine";
if (Debug.shouldDelegate(ba, "resolveadvancedecision", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolveadvancedecision", new Object[] {_shouldprioritizeservicequeue,_canuseprepareditem,_hasdispatchableserviceitem,_haslocalreserve,_allowload}));}
anywheresoftware.b4a.objects.collections.Map _result = null;
RDebugUtils.currentLine=85393408;
 //BA.debugLineNum = 85393408;BA.debugLine="Public Sub ResolveAdvanceDecision(shouldPrioritize";
RDebugUtils.currentLine=85393409;
 //BA.debugLineNum = 85393409;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=85393410;
 //BA.debugLineNum = 85393410;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=85393411;
 //BA.debugLineNum = 85393411;BA.debugLine="result.Put(\"action\", \"\")";
_result.Put((Object)("action"),(Object)(""));
RDebugUtils.currentLine=85393412;
 //BA.debugLineNum = 85393412;BA.debugLine="If shouldPrioritizeServiceQueue Then";
if (_shouldprioritizeservicequeue) { 
RDebugUtils.currentLine=85393413;
 //BA.debugLineNum = 85393413;BA.debugLine="result.Put(\"action\", \"play_queue_item\")";
_result.Put((Object)("action"),(Object)("play_queue_item"));
RDebugUtils.currentLine=85393414;
 //BA.debugLineNum = 85393414;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=85393416;
 //BA.debugLineNum = 85393416;BA.debugLine="If canUsePreparedItem Then";
if (_canuseprepareditem) { 
RDebugUtils.currentLine=85393417;
 //BA.debugLineNum = 85393417;BA.debugLine="result.Put(\"action\", \"use_prepared\")";
_result.Put((Object)("action"),(Object)("use_prepared"));
RDebugUtils.currentLine=85393418;
 //BA.debugLineNum = 85393418;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=85393420;
 //BA.debugLineNum = 85393420;BA.debugLine="If hasDispatchableServiceItem Then";
if (_hasdispatchableserviceitem) { 
RDebugUtils.currentLine=85393421;
 //BA.debugLineNum = 85393421;BA.debugLine="result.Put(\"action\", \"play_queue_item\")";
_result.Put((Object)("action"),(Object)("play_queue_item"));
RDebugUtils.currentLine=85393422;
 //BA.debugLineNum = 85393422;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=85393424;
 //BA.debugLineNum = 85393424;BA.debugLine="If hasLocalReserve Then";
if (_haslocalreserve) { 
RDebugUtils.currentLine=85393425;
 //BA.debugLineNum = 85393425;BA.debugLine="result.Put(\"action\", \"play_direct_local\")";
_result.Put((Object)("action"),(Object)("play_direct_local"));
RDebugUtils.currentLine=85393426;
 //BA.debugLineNum = 85393426;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=85393428;
 //BA.debugLineNum = 85393428;BA.debugLine="If allowLoad Then result.Put(\"action\", \"populate_";
if (_allowload) { 
_result.Put((Object)("action"),(Object)("populate_queue"));};
RDebugUtils.currentLine=85393429;
 //BA.debugLineNum = 85393429;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=85393430;
 //BA.debugLineNum = 85393430;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.offlineplaybackengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="offlineplaybackengine";
RDebugUtils.currentLine=85262336;
 //BA.debugLineNum = 85262336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=85262337;
 //BA.debugLineNum = 85262337;BA.debugLine="End Sub";
return "";
}
}