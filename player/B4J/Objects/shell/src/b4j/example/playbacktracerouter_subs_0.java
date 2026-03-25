package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbacktracerouter_subs_0 {


public static RemoteObject  _appendrecentdebugcontext(RemoteObject __ref,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AppendRecentDebugContext (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("appendrecentdebugcontext")) { return __ref.runUserSub(false, "playbacktracerouter","appendrecentdebugcontext", __ref, _title);}
RemoteObject _debuglines = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _debugline = RemoteObject.createImmutable("");
Debug.locals.put("title", _title);
 BA.debugLineNum = 50;BA.debugLine="Private Sub AppendRecentDebugContext(title As Stri";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Dim debugLines As List = traceServiceRef.GetRecen";
Debug.ShouldStop(262144);
_debuglines = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_debuglines = __ref.getField(false,"_traceserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.traceservice.class, "_getrecentdebuglist" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_debugcontextlines" /*RemoteObject*/ )));Debug.locals.put("debugLines", _debuglines);Debug.locals.put("debugLines", _debuglines);
 BA.debugLineNum = 52;BA.debugLine="If debugLines.IsInitialized = False Or debugLines";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_debuglines.runMethod(true,"IsInitialized"),playbacktracerouter.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_debuglines.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 53;BA.debugLine="WriteTraceEntry(\"DEBUG\", \"debug\", title, \"\")";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_writetraceentry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("DEBUG")),(Object)(BA.ObjectToString("debug")),(Object)(_title),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 54;BA.debugLine="For Each debugLine As String In debugLines";
Debug.ShouldStop(2097152);
{
final RemoteObject group4 = _debuglines;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_debugline = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("debugLine", _debugline);
Debug.locals.put("debugLine", _debugline);
 BA.debugLineNum = 55;BA.debugLine="traceServiceRef.Trace(\"DEBUG \" & TrimDebugContex";
Debug.ShouldStop(4194304);
__ref.getField(false,"_traceserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.traceservice.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("DEBUG "),__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_trimdebugcontextline" /*RemoteObject*/ ,(Object)(_debugline)))));
 }
}Debug.locals.put("debugLine", _debugline);
;
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private traceServiceRef As TraceService";
playbacktracerouter._traceserviceref = RemoteObject.createNew ("b4j.example.traceservice");__ref.setField("_traceserviceref",playbacktracerouter._traceserviceref);
 //BA.debugLineNum = 7;BA.debugLine="Private formatterRef As PlaybackTraceFormatter";
playbacktracerouter._formatterref = RemoteObject.createNew ("b4j.example.playbacktraceformatter");__ref.setField("_formatterref",playbacktracerouter._formatterref);
 //BA.debugLineNum = 8;BA.debugLine="Private releaseBuild As Boolean";
playbacktracerouter._releasebuild = RemoteObject.createImmutable(false);__ref.setField("_releasebuild",playbacktracerouter._releasebuild);
 //BA.debugLineNum = 9;BA.debugLine="Private debugContextLines As Int";
playbacktracerouter._debugcontextlines = RemoteObject.createImmutable(0);__ref.setField("_debugcontextlines",playbacktracerouter._debugcontextlines);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _handlediagnostictracemessage(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("HandleDiagnosticTraceMessage (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("handlediagnostictracemessage")) { return __ref.runUserSub(false, "playbacktracerouter","handlediagnostictracemessage", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 72;BA.debugLine="Private Sub HandleDiagnosticTraceMessage(message A";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="If message = \"\" Then Return True";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_message,BA.ObjectToString(""))) { 
if (true) return playbacktracerouter.__c.getField(true,"True");};
 BA.debugLineNum = 74;BA.debugLine="If ShouldSuppressTraceMessage(message) Then";
Debug.ShouldStop(512);
if (__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_shouldsuppresstracemessage" /*RemoteObject*/ ,(Object)(_message)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 75;BA.debugLine="TraceDebug(message)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracedebug" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 76;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 78;BA.debugLine="If message.StartsWith(\"Трек сохранен в кэш.\") The";
Debug.ShouldStop(8192);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Трек сохранен в кэш."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="TraceInfo(\"cache\", \"трек загружен в кэш\", Normal";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(BA.ObjectToString("трек загружен в кэш")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("Трек сохранен в кэш.")))))));
 BA.debugLineNum = 80;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 82;BA.debugLine="If message.StartsWith(\"Не удалось скачать трек.\")";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Не удалось скачать трек.")))) || RemoteObject.solveBoolean(".",_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Не удалось сохранить трек в кэш."))))) { 
 BA.debugLineNum = 83;BA.debugLine="TraceError(\"cache\", \"ошибка загрузки трека\", Nor";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceerror" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(BA.ObjectToString("ошибка загрузки трека")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafterfirstspace" /*RemoteObject*/ ,(Object)(_message))))));
 BA.debugLineNum = 84;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 86;BA.debugLine="If message.StartsWith(\"Синхронизация кэша треков";
Debug.ShouldStop(2097152);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Синхронизация кэша треков завершена."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 87;BA.debugLine="TraceInfo(\"cache\", \"кэш треков обновлен\", Normal";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(BA.ObjectToString("кэш треков обновлен")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("Синхронизация кэша треков завершена.")))))));
 BA.debugLineNum = 88;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 90;BA.debugLine="If message.StartsWith(\"ad cache sync done\") Then";
Debug.ShouldStop(33554432);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ad cache sync done"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 91;BA.debugLine="TraceInfo(\"cache\", \"кэш рекламы обновлен\", Norma";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(BA.ObjectToString("кэш рекламы обновлен")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("ad cache sync done")))))));
 BA.debugLineNum = 92;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 94;BA.debugLine="If message.StartsWith(\"Аудит кэша завершен.\") The";
Debug.ShouldStop(536870912);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Аудит кэша завершен."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 95;BA.debugLine="TraceInfo(\"cache\", \"аудит кэша\", NormalizeLegacy";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(BA.ObjectToString("аудит кэша")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("Аудит кэша завершен.")))))));
 BA.debugLineNum = 96;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 98;BA.debugLine="If message.StartsWith(\"Очистка кэша треков заверш";
Debug.ShouldStop(2);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Очистка кэша треков завершена."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 99;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(BA.ObjectToString("очистка кэша")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("Очистка кэша треков завершена.")))))));
 BA.debugLineNum = 100;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 102;BA.debugLine="If message.StartsWith(\"кэш треков очистка итог\")";
Debug.ShouldStop(32);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("кэш треков очистка итог"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 103;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(BA.ObjectToString("очистка кэша")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("кэш треков очистка итог")))))));
 BA.debugLineNum = 104;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 106;BA.debugLine="If message.StartsWith(\"Удален cached ad, отсутств";
Debug.ShouldStop(512);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Удален cached ad, отсутствующий в актуальном data."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 107;BA.debugLine="TraceInfo(\"cache\", \"реклама удалена из кэша\", No";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(BA.ObjectToString("реклама удалена из кэша")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("Удален cached ad, отсутствующий в актуальном data.")))))));
 BA.debugLineNum = 108;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 110;BA.debugLine="If message.StartsWith(\"подготовка data playback о";
Debug.ShouldStop(8192);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("подготовка data playback ошибка"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 111;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", \"\")";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playback")),(Object)(BA.ObjectToString("очередь пуста")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 112;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 114;BA.debugLine="If message.StartsWith(\"очередь запрос ошибка\") Th";
Debug.ShouldStop(131072);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("очередь запрос ошибка"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 115;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playback")),(Object)(BA.ObjectToString("очередь пуста")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("очередь запрос ошибка")))))));
 BA.debugLineNum = 116;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 118;BA.debugLine="If message.StartsWith(\"очередь next ошибка\") Then";
Debug.ShouldStop(2097152);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("очередь next ошибка"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 119;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playback")),(Object)(BA.ObjectToString("очередь пуста")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("очередь next ошибка")))))));
 BA.debugLineNum = 120;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 122;BA.debugLine="If message.StartsWith(\"очередь fetch ошибка\") The";
Debug.ShouldStop(33554432);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("очередь fetch ошибка"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 123;BA.debugLine="TraceWarn(\"network\", \"ошибка очереди\", Normalize";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("ошибка очереди")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("очередь fetch ошибка")))))));
 BA.debugLineNum = 124;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 126;BA.debugLine="If message.StartsWith(\"состояние blocked\") Then";
Debug.ShouldStop(536870912);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("состояние blocked"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 127;BA.debugLine="TraceWarn(\"player\", \"плеер заблокирован\", \"\")";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("player")),(Object)(BA.ObjectToString("плеер заблокирован")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 128;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 130;BA.debugLine="If message.StartsWith(\"состояние stop\") Or messag";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("состояние stop")))) || RemoteObject.solveBoolean(".",_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("message shutdown"))))) { 
 BA.debugLineNum = 131;BA.debugLine="TraceWarn(\"player\", \"воспроизведение остановлено";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("player")),(Object)(BA.ObjectToString("воспроизведение остановлено")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafterfirstspace" /*RemoteObject*/ ,(Object)(_message))))));
 BA.debugLineNum = 132;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 134;BA.debugLine="If message.StartsWith(\"fallback activate\") Then";
Debug.ShouldStop(32);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("fallback activate"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 135;BA.debugLine="TraceWarn(\"playback\", \"включен локальный fallbac";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playback")),(Object)(BA.ObjectToString("включен локальный fallback")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("fallback activate")))))));
 BA.debugLineNum = 136;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 138;BA.debugLine="If message.StartsWith(\"degraded path вход\") Then";
Debug.ShouldStop(512);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("degraded path вход"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 139;BA.debugLine="TraceWarn(\"network\", \"деградация media path\", \"\"";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("деградация media path")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 140;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 142;BA.debugLine="If message.StartsWith(\"degraded path восстановлен";
Debug.ShouldStop(8192);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("degraded path восстановлен"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 143;BA.debugLine="TraceInfo(\"network\", \"media path восстановлен\",";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("media path восстановлен")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 144;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 146;BA.debugLine="If message.StartsWith(\"история чтение ошибка\") Or";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("история чтение ошибка")))) || RemoteObject.solveBoolean(".",_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("история response parse ошибка"))))) { 
 BA.debugLineNum = 147;BA.debugLine="TraceWarn(\"history\", \"ошибка истории\", \"\")";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("history")),(Object)(BA.ObjectToString("ошибка истории")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 148;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 150;BA.debugLine="If message.StartsWith(\"метаданные плейлистов sync";
Debug.ShouldStop(2097152);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("метаданные плейлистов sync итог"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 151;BA.debugLine="TraceInfo(\"network\", \"метаданные плейлистов обно";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("метаданные плейлистов обновлены")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("метаданные плейлистов sync итог")))))));
 BA.debugLineNum = 152;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 154;BA.debugLine="If message.StartsWith(\"метаданные плейлиста fetch";
Debug.ShouldStop(33554432);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("метаданные плейлиста fetch ошибка"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 155;BA.debugLine="TraceWarn(\"network\", \"ошибка метаданных плейлист";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("ошибка метаданных плейлиста")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("метаданные плейлиста fetch ошибка")))))));
 BA.debugLineNum = 156;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 158;BA.debugLine="If message.StartsWith(\"Не удалось подготовить вре";
Debug.ShouldStop(536870912);
if (_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Не удалось подготовить временный файл трека."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 159;BA.debugLine="TraceError(\"cache\", \"ошибка подготовки трека\", N";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_traceerror" /*RemoteObject*/ ,(Object)(BA.ObjectToString("cache")),(Object)(BA.ObjectToString("ошибка подготовки трека")),(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_normalizelegacydetails" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tailafter" /*RemoteObject*/ ,(Object)(_message),(Object)(RemoteObject.createImmutable("Не удалось подготовить временный файл трека.")))))));
 BA.debugLineNum = 160;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 BA.debugLineNum = 162;BA.debugLine="TraceDebug(message)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracedebug" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 163;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return playbacktracerouter.__c.getField(true,"True");
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _tracesvc,RemoteObject _formattervalue,RemoteObject _isreleasebuild,RemoteObject _debugcontextlinecount) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbacktracerouter","initialize", __ref, _ba, _tracesvc, _formattervalue, _isreleasebuild, _debugcontextlinecount);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("traceSvc", _tracesvc);
Debug.locals.put("formatterValue", _formattervalue);
Debug.locals.put("isReleaseBuild", _isreleasebuild);
Debug.locals.put("debugContextLineCount", _debugcontextlinecount);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(traceSvc As TraceService, fo";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="traceServiceRef = traceSvc";
Debug.ShouldStop(4096);
__ref.setField ("_traceserviceref" /*RemoteObject*/ ,_tracesvc);
 BA.debugLineNum = 14;BA.debugLine="formatterRef = formatterValue";
Debug.ShouldStop(8192);
__ref.setField ("_formatterref" /*RemoteObject*/ ,_formattervalue);
 BA.debugLineNum = 15;BA.debugLine="releaseBuild = isReleaseBuild";
Debug.ShouldStop(16384);
__ref.setField ("_releasebuild" /*RemoteObject*/ ,_isreleasebuild);
 BA.debugLineNum = 16;BA.debugLine="debugContextLines = debugContextLineCount";
Debug.ShouldStop(32768);
__ref.setField ("_debugcontextlines" /*RemoteObject*/ ,_debugcontextlinecount);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizelegacydetails(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("NormalizeLegacyDetails (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("normalizelegacydetails")) { return __ref.runUserSub(false, "playbacktracerouter","normalizelegacydetails", __ref, _text);}
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("text", _text);
 BA.debugLineNum = 250;BA.debugLine="Private Sub NormalizeLegacyDetails(text As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim value As String = text.Trim";
Debug.ShouldStop(67108864);
_value = _text.runMethod(true,"trim");Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 252;BA.debugLine="If value.StartsWith(\".\") Or value.StartsWith(\":\")";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(".",_value.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable(".")))) || RemoteObject.solveBoolean(".",_value.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable(":"))))) { 
_value = _value.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"trim");Debug.locals.put("value", _value);};
 BA.debugLineNum = 253;BA.debugLine="value = value.Replace(\",\", \"\")";
Debug.ShouldStop(268435456);
_value = _value.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("value", _value);
 BA.debugLineNum = 254;BA.debugLine="Return value";
Debug.ShouldStop(536870912);
if (true) return _value;
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shouldsuppresstracemessage(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("ShouldSuppressTraceMessage (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("shouldsuppresstracemessage")) { return __ref.runUserSub(false, "playbacktracerouter","shouldsuppresstracemessage", __ref, _message);}
RemoteObject _noisyprefixes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _prefix = RemoteObject.createImmutable("");
Debug.locals.put("message", _message);
 BA.debugLineNum = 166;BA.debugLine="Private Sub ShouldSuppressTraceMessage(message As";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="If message.StartsWith(\"guard переход\") Or message";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(".",_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("guard переход")))) || RemoteObject.solveBoolean(".",_message.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("переход dispatch"))))) { 
 BA.debugLineNum = 168;BA.debugLine="If releaseBuild Then";
Debug.ShouldStop(128);
if (__ref.getField(true,"_releasebuild" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 169;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) return playbacktracerouter.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 171;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return playbacktracerouter.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 174;BA.debugLine="Dim noisyPrefixes As List";
Debug.ShouldStop(8192);
_noisyprefixes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("noisyPrefixes", _noisyprefixes);
 BA.debugLineNum = 175;BA.debugLine="noisyPrefixes.Initialize";
Debug.ShouldStop(16384);
_noisyprefixes.runVoidMethod ("Initialize");
 BA.debugLineNum = 176;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов load\")";
Debug.ShouldStop(32768);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("курсор плейлистов load"))));
 BA.debugLineNum = 177;BA.debugLine="noisyPrefixes.Add(\"состояние init\")";
Debug.ShouldStop(65536);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("состояние init"))));
 BA.debugLineNum = 178;BA.debugLine="noisyPrefixes.Add(\"старт skip\")";
Debug.ShouldStop(131072);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("старт skip"))));
 BA.debugLineNum = 179;BA.debugLine="noisyPrefixes.Add(\"старт вход\")";
Debug.ShouldStop(262144);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("старт вход"))));
 BA.debugLineNum = 180;BA.debugLine="noisyPrefixes.Add(\"отложенный старт\")";
Debug.ShouldStop(524288);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("отложенный старт"))));
 BA.debugLineNum = 181;BA.debugLine="noisyPrefixes.Add(\"сценарий \")";
Debug.ShouldStop(1048576);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("сценарий "))));
 BA.debugLineNum = 182;BA.debugLine="noisyPrefixes.Add(\"flow переход\")";
Debug.ShouldStop(2097152);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("flow переход"))));
 BA.debugLineNum = 183;BA.debugLine="noisyPrefixes.Add(\"guard переход\")";
Debug.ShouldStop(4194304);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("guard переход"))));
 BA.debugLineNum = 184;BA.debugLine="noisyPrefixes.Add(\"guard подготовка\")";
Debug.ShouldStop(8388608);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("guard подготовка"))));
 BA.debugLineNum = 185;BA.debugLine="noisyPrefixes.Add(\"guard prefetch\")";
Debug.ShouldStop(16777216);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("guard prefetch"))));
 BA.debugLineNum = 186;BA.debugLine="noisyPrefixes.Add(\"guard fade\")";
Debug.ShouldStop(33554432);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("guard fade"))));
 BA.debugLineNum = 187;BA.debugLine="noisyPrefixes.Add(\"переход dispatch\")";
Debug.ShouldStop(67108864);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("переход dispatch"))));
 BA.debugLineNum = 188;BA.debugLine="noisyPrefixes.Add(\"воспроизведение activate\")";
Debug.ShouldStop(134217728);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("воспроизведение activate"))));
 BA.debugLineNum = 189;BA.debugLine="noisyPrefixes.Add(\"очередь добор\")";
Debug.ShouldStop(268435456);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("очередь добор"))));
 BA.debugLineNum = 190;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
Debug.ShouldStop(536870912);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("очередь next итог"))));
 BA.debugLineNum = 191;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
Debug.ShouldStop(1073741824);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("очередь playlist skip"))));
 BA.debugLineNum = 192;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
Debug.ShouldStop(-2147483648);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("очередь signature mismatch"))));
 BA.debugLineNum = 193;BA.debugLine="noisyPrefixes.Add(\"автостарт сначала обновление д";
Debug.ShouldStop(1);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("автостарт сначала обновление данных"))));
 BA.debugLineNum = 194;BA.debugLine="noisyPrefixes.Add(\"policy resume авто\")";
Debug.ShouldStop(2);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("policy resume авто"))));
 BA.debugLineNum = 195;BA.debugLine="noisyPrefixes.Add(\"возобновление запрет\")";
Debug.ShouldStop(4);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("возобновление запрет"))));
 BA.debugLineNum = 196;BA.debugLine="noisyPrefixes.Add(\"возобновление итог\")";
Debug.ShouldStop(8);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("возобновление итог"))));
 BA.debugLineNum = 197;BA.debugLine="noisyPrefixes.Add(\"снимок очереди восстановление";
Debug.ShouldStop(16);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("снимок очереди восстановление skip"))));
 BA.debugLineNum = 198;BA.debugLine="noisyPrefixes.Add(\"http get начало\")";
Debug.ShouldStop(32);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("http get начало"))));
 BA.debugLineNum = 199;BA.debugLine="noisyPrefixes.Add(\"http get итог\")";
Debug.ShouldStop(64);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("http get итог"))));
 BA.debugLineNum = 200;BA.debugLine="noisyPrefixes.Add(\"claim начало\")";
Debug.ShouldStop(128);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("claim начало"))));
 BA.debugLineNum = 201;BA.debugLine="noisyPrefixes.Add(\"claim итог\")";
Debug.ShouldStop(256);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("claim итог"))));
 BA.debugLineNum = 202;BA.debugLine="noisyPrefixes.Add(\"элемент очереди play\")";
Debug.ShouldStop(512);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("элемент очереди play"))));
 BA.debugLineNum = 203;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов commit\")";
Debug.ShouldStop(1024);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("курсор плейлистов commit"))));
 BA.debugLineNum = 204;BA.debugLine="noisyPrefixes.Add(\"реклама prescan начало\")";
Debug.ShouldStop(2048);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("реклама prescan начало"))));
 BA.debugLineNum = 205;BA.debugLine="noisyPrefixes.Add(\"брейк exact defer\")";
Debug.ShouldStop(4096);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("брейк exact defer"))));
 BA.debugLineNum = 206;BA.debugLine="noisyPrefixes.Add(\"брейк exact sync\")";
Debug.ShouldStop(8192);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("брейк exact sync"))));
 BA.debugLineNum = 207;BA.debugLine="noisyPrefixes.Add(\"fade начало\")";
Debug.ShouldStop(16384);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("fade начало"))));
 BA.debugLineNum = 208;BA.debugLine="noisyPrefixes.Add(\"история confirm\")";
Debug.ShouldStop(32768);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("история confirm"))));
 BA.debugLineNum = 209;BA.debugLine="noisyPrefixes.Add(\"история stage\")";
Debug.ShouldStop(65536);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("история stage"))));
 BA.debugLineNum = 210;BA.debugLine="noisyPrefixes.Add(\"история буфер add\")";
Debug.ShouldStop(131072);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("история буфер add"))));
 BA.debugLineNum = 211;BA.debugLine="noisyPrefixes.Add(\"история отправка начало\")";
Debug.ShouldStop(262144);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("история отправка начало"))));
 BA.debugLineNum = 212;BA.debugLine="noisyPrefixes.Add(\"история отправка payload\")";
Debug.ShouldStop(524288);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("история отправка payload"))));
 BA.debugLineNum = 213;BA.debugLine="noisyPrefixes.Add(\"история отправка ack\")";
Debug.ShouldStop(1048576);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("история отправка ack"))));
 BA.debugLineNum = 214;BA.debugLine="noisyPrefixes.Add(\"stop запрос\")";
Debug.ShouldStop(2097152);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("stop запрос"))));
 BA.debugLineNum = 215;BA.debugLine="noisyPrefixes.Add(\"резерв очереди save\")";
Debug.ShouldStop(4194304);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("резерв очереди save"))));
 BA.debugLineNum = 216;BA.debugLine="noisyPrefixes.Add(\"снимок очереди clear\")";
Debug.ShouldStop(8388608);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("снимок очереди clear"))));
 BA.debugLineNum = 217;BA.debugLine="noisyPrefixes.Add(\"состояние воспроизведения clea";
Debug.ShouldStop(16777216);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("состояние воспроизведения clear"))));
 BA.debugLineNum = 218;BA.debugLine="noisyPrefixes.Add(\"аудио ready\")";
Debug.ShouldStop(33554432);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("аудио ready"))));
 BA.debugLineNum = 219;BA.debugLine="noisyPrefixes.Add(\"аудио complete\")";
Debug.ShouldStop(67108864);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("аудио complete"))));
 BA.debugLineNum = 220;BA.debugLine="noisyPrefixes.Add(\"переход overlap начало\")";
Debug.ShouldStop(134217728);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("переход overlap начало"))));
 BA.debugLineNum = 221;BA.debugLine="noisyPrefixes.Add(\"переход tail начало\")";
Debug.ShouldStop(268435456);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("переход tail начало"))));
 BA.debugLineNum = 222;BA.debugLine="noisyPrefixes.Add(\"переход prefetch начало\")";
Debug.ShouldStop(536870912);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("переход prefetch начало"))));
 BA.debugLineNum = 223;BA.debugLine="noisyPrefixes.Add(\"trusted time update\")";
Debug.ShouldStop(1073741824);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("trusted time update"))));
 BA.debugLineNum = 224;BA.debugLine="noisyPrefixes.Add(\"player end parse fail\")";
Debug.ShouldStop(-2147483648);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("player end parse fail"))));
 BA.debugLineNum = 225;BA.debugLine="noisyPrefixes.Add(\"[AudioPrimary]\")";
Debug.ShouldStop(1);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("[AudioPrimary]"))));
 BA.debugLineNum = 226;BA.debugLine="noisyPrefixes.Add(\"[AudioSecondary]\")";
Debug.ShouldStop(2);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("[AudioSecondary]"))));
 BA.debugLineNum = 227;BA.debugLine="noisyPrefixes.Add(\"machine guid\")";
Debug.ShouldStop(4);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("machine guid"))));
 BA.debugLineNum = 228;BA.debugLine="noisyPrefixes.Add(\"legacy migrate итог\")";
Debug.ShouldStop(8);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("legacy migrate итог"))));
 BA.debugLineNum = 229;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлистов sync ski";
Debug.ShouldStop(16);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("метаданные плейлистов sync skip"))));
 BA.debugLineNum = 230;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлиста fetch нач";
Debug.ShouldStop(32);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("метаданные плейлиста fetch начало"))));
 BA.debugLineNum = 231;BA.debugLine="noisyPrefixes.Add(\"окно save\")";
Debug.ShouldStop(64);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("окно save"))));
 BA.debugLineNum = 232;BA.debugLine="noisyPrefixes.Add(\"окно restore\")";
Debug.ShouldStop(128);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("окно restore"))));
 BA.debugLineNum = 233;BA.debugLine="noisyPrefixes.Add(\"trace отправка\")";
Debug.ShouldStop(256);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("trace отправка"))));
 BA.debugLineNum = 234;BA.debugLine="noisyPrefixes.Add(\"скачивание рекламы в кэш\")";
Debug.ShouldStop(512);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("скачивание рекламы в кэш"))));
 BA.debugLineNum = 235;BA.debugLine="noisyPrefixes.Add(\"скачивание трека в кэш\")";
Debug.ShouldStop(1024);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("скачивание трека в кэш"))));
 BA.debugLineNum = 236;BA.debugLine="noisyPrefixes.Add(\"удален cached track при очистк";
Debug.ShouldStop(2048);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("удален cached track при очистке кэша"))));
 BA.debugLineNum = 237;BA.debugLine="noisyPrefixes.Add(\"очистка кэша треков пропущена\"";
Debug.ShouldStop(4096);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("очистка кэша треков пропущена"))));
 BA.debugLineNum = 238;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
Debug.ShouldStop(8192);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("очередь playlist skip"))));
 BA.debugLineNum = 239;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
Debug.ShouldStop(16384);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("очередь next итог"))));
 BA.debugLineNum = 240;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
Debug.ShouldStop(32768);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("очередь signature mismatch"))));
 BA.debugLineNum = 241;BA.debugLine="noisyPrefixes.Add(\"переход очередь drop\")";
Debug.ShouldStop(65536);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("переход очередь drop"))));
 BA.debugLineNum = 242;BA.debugLine="noisyPrefixes.Add(\"переход preload ошибка\")";
Debug.ShouldStop(131072);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("переход preload ошибка"))));
 BA.debugLineNum = 243;BA.debugLine="noisyPrefixes.Add(\"переход prepared reject\")";
Debug.ShouldStop(262144);
_noisyprefixes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("переход prepared reject"))));
 BA.debugLineNum = 244;BA.debugLine="For Each prefix As String In noisyPrefixes";
Debug.ShouldStop(524288);
{
final RemoteObject group78 = _noisyprefixes;
final int groupLen78 = group78.runMethod(true,"getSize").<Integer>get()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_prefix = BA.ObjectToString(group78.runMethod(false,"Get",index78));Debug.locals.put("prefix", _prefix);
Debug.locals.put("prefix", _prefix);
 BA.debugLineNum = 245;BA.debugLine="If message.ToLowerCase.StartsWith(prefix.ToLower";
Debug.ShouldStop(1048576);
if (_message.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(_prefix.runMethod(true,"toLowerCase"))).<Boolean>get().booleanValue()) { 
if (true) return playbacktracerouter.__c.getField(true,"True");};
 }
}Debug.locals.put("prefix", _prefix);
;
 BA.debugLineNum = 247;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return playbacktracerouter.__c.getField(true,"False");
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tailafter(RemoteObject __ref,RemoteObject _text,RemoteObject _prefix) throws Exception{
try {
		Debug.PushSubsStack("TailAfter (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("tailafter")) { return __ref.runUserSub(false, "playbacktracerouter","tailafter", __ref, _text, _prefix);}
Debug.locals.put("text", _text);
Debug.locals.put("prefix", _prefix);
 BA.debugLineNum = 257;BA.debugLine="Private Sub TailAfter(text As String, prefix As St";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="If text.StartsWith(prefix) = False Then Return te";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_text.runMethod(true,"startsWith",(Object)(_prefix)),playbacktracerouter.__c.getField(true,"False"))) { 
if (true) return _text;};
 BA.debugLineNum = 259;BA.debugLine="Return text.SubString(prefix.Length).Trim";
Debug.ShouldStop(4);
if (true) return _text.runMethod(true,"substring",(Object)(_prefix.runMethod(true,"length"))).runMethod(true,"trim");
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tailafterfirstspace(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("TailAfterFirstSpace (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,262);
if (RapidSub.canDelegate("tailafterfirstspace")) { return __ref.runUserSub(false, "playbacktracerouter","tailafterfirstspace", __ref, _text);}
RemoteObject _firstspace = RemoteObject.createImmutable(0);
Debug.locals.put("text", _text);
 BA.debugLineNum = 262;BA.debugLine="Private Sub TailAfterFirstSpace(text As String) As";
Debug.ShouldStop(32);
 BA.debugLineNum = 263;BA.debugLine="Dim firstSpace As Int = text.IndexOf(\" \")";
Debug.ShouldStop(64);
_firstspace = _text.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("firstSpace", _firstspace);Debug.locals.put("firstSpace", _firstspace);
 BA.debugLineNum = 264;BA.debugLine="If firstSpace < 0 Then Return \"\"";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("<",_firstspace,BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 265;BA.debugLine="Return text.SubString(firstSpace + 1).Trim";
Debug.ShouldStop(256);
if (true) return _text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_firstspace,RemoteObject.createImmutable(1)}, "+",1, 1))).runMethod(true,"trim");
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tracedebug(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("TraceDebug (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("tracedebug")) { return __ref.runUserSub(false, "playbacktracerouter","tracedebug", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 46;BA.debugLine="Private Sub TraceDebug(message As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="traceServiceRef.TraceDebug(message)";
Debug.ShouldStop(16384);
__ref.getField(false,"_traceserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.traceservice.class, "_tracedebug" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tracedebugmessage(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("TraceDebugMessage (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("tracedebugmessage")) { return __ref.runUserSub(false, "playbacktracerouter","tracedebugmessage", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 42;BA.debugLine="Public Sub TraceDebugMessage(message As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="TraceDebug(message)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracedebug" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _traceerror(RemoteObject __ref,RemoteObject _category,RemoteObject _message,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("TraceError (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("traceerror")) { return __ref.runUserSub(false, "playbacktracerouter","traceerror", __ref, _category, _message, _details);}
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 33;BA.debugLine="Public Sub TraceError(category As String, message";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="WriteTraceEntry(\"ERROR\", category, message, detai";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_writetraceentry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ERROR")),(Object)(_category),(Object)(_message),(Object)(_details));
 BA.debugLineNum = 35;BA.debugLine="AppendRecentDebugContext(\"Контекст ошибки\")";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_appendrecentdebugcontext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Контекст ошибки")));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _traceinfo(RemoteObject __ref,RemoteObject _category,RemoteObject _message,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("TraceInfo (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("traceinfo")) { return __ref.runUserSub(false, "playbacktracerouter","traceinfo", __ref, _category, _message, _details);}
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 25;BA.debugLine="Public Sub TraceInfo(category As String, message A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="WriteTraceEntry(\"INFO\", category, message, detail";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_writetraceentry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("INFO")),(Object)(_category),(Object)(_message),(Object)(_details));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tracelog(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("TraceLog (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("tracelog")) { return __ref.runUserSub(false, "playbacktracerouter","tracelog", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 19;BA.debugLine="Public Sub TraceLog(message As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="If message = \"\" Then Return";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_message,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 21;BA.debugLine="If HandleDiagnosticTraceMessage(message) Then Ret";
Debug.ShouldStop(1048576);
if (__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_handlediagnostictracemessage" /*RemoteObject*/ ,(Object)(_message)).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 22;BA.debugLine="TraceDebug(message)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_tracedebug" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tracestate(RemoteObject __ref,RemoteObject _category,RemoteObject _message,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("TraceState (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("tracestate")) { return __ref.runUserSub(false, "playbacktracerouter","tracestate", __ref, _category, _message, _details);}
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 38;BA.debugLine="Public Sub TraceState(category As String, message";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="WriteTraceEntry(\"STATE\", category, message, detai";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_writetraceentry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("STATE")),(Object)(_category),(Object)(_message),(Object)(_details));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tracewarn(RemoteObject __ref,RemoteObject _category,RemoteObject _message,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("TraceWarn (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("tracewarn")) { return __ref.runUserSub(false, "playbacktracerouter","tracewarn", __ref, _category, _message, _details);}
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 29;BA.debugLine="Public Sub TraceWarn(category As String, message A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="WriteTraceEntry(\"WARN\", category, message, detail";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.playbacktracerouter.class, "_writetraceentry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("WARN")),(Object)(_category),(Object)(_message),(Object)(_details));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trimdebugcontextline(RemoteObject __ref,RemoteObject _debugline) throws Exception{
try {
		Debug.PushSubsStack("TrimDebugContextLine (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("trimdebugcontextline")) { return __ref.runUserSub(false, "playbacktracerouter","trimdebugcontextline", __ref, _debugline);}
RemoteObject _marker = RemoteObject.createImmutable("");
RemoteObject _markerindex = RemoteObject.createImmutable(0);
Debug.locals.put("debugLine", _debugline);
 BA.debugLineNum = 59;BA.debugLine="Private Sub TrimDebugContextLine(debugLine As Stri";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="If debugLine = \"\" Then Return \"\"";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_debugline,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 61;BA.debugLine="Dim marker As String = \" DEBUG \"";
Debug.ShouldStop(268435456);
_marker = BA.ObjectToString(" DEBUG ");Debug.locals.put("marker", _marker);Debug.locals.put("marker", _marker);
 BA.debugLineNum = 62;BA.debugLine="Dim markerIndex As Int = debugLine.IndexOf(marker";
Debug.ShouldStop(536870912);
_markerindex = _debugline.runMethod(true,"indexOf",(Object)(_marker));Debug.locals.put("markerIndex", _markerindex);Debug.locals.put("markerIndex", _markerindex);
 BA.debugLineNum = 63;BA.debugLine="If markerIndex < 0 Then Return debugLine";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",_markerindex,BA.numberCast(double.class, 0))) { 
if (true) return _debugline;};
 BA.debugLineNum = 64;BA.debugLine="Return debugLine.SubString(markerIndex + marker.L";
Debug.ShouldStop(-2147483648);
if (true) return _debugline.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_markerindex,_marker.runMethod(true,"length")}, "+",1, 1))).runMethod(true,"trim");
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writetraceentry(RemoteObject __ref,RemoteObject _level,RemoteObject _category,RemoteObject _message,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("WriteTraceEntry (playbacktracerouter) ","playbacktracerouter",17,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("writetraceentry")) { return __ref.runUserSub(false, "playbacktracerouter","writetraceentry", __ref, _level, _category, _message, _details);}
RemoteObject _line = RemoteObject.createImmutable("");
Debug.locals.put("level", _level);
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 67;BA.debugLine="Private Sub WriteTraceEntry(level As String, categ";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Dim line As String = level & \" \" & formatterRef.B";
Debug.ShouldStop(8);
_line = RemoteObject.concat(_level,RemoteObject.createImmutable(" "),__ref.getField(false,"_formatterref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbacktraceformatter.class, "_buildhumantracemessage" /*RemoteObject*/ ,(Object)(_category),(Object)(_message),(Object)(_details.runMethod(true,"trim"))));Debug.locals.put("line", _line);Debug.locals.put("line", _line);
 BA.debugLineNum = 69;BA.debugLine="traceServiceRef.Trace(line)";
Debug.ShouldStop(16);
__ref.getField(false,"_traceserviceref" /*RemoteObject*/ ).runClassMethod (b4j.example.traceservice.class, "_trace" /*RemoteObject*/ ,(Object)(_line));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}