package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbacktraceformatter_subs_0 {


public static RemoteObject  _addcountpart(RemoteObject __ref,RemoteObject _parts,RemoteObject _details,RemoteObject _key,RemoteObject _label) throws Exception{
try {
		Debug.PushSubsStack("AddCountPart (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("addcountpart")) { return __ref.runUserSub(false, "playbacktraceformatter","addcountpart", __ref, _parts, _details, _key, _label);}
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("parts", _parts);
Debug.locals.put("details", _details);
Debug.locals.put("key", _key);
Debug.locals.put("label", _label);
 BA.debugLineNum = 317;BA.debugLine="Private Sub AddCountPart(parts As List, details As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="Dim value As String = ExtractDetailValue(details,";
Debug.ShouldStop(536870912);
_value = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(_key));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 319;BA.debugLine="If value = \"\" Then Return";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 320;BA.debugLine="parts.Add(label & \" \" & value)";
Debug.ShouldStop(-2147483648);
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(_label,RemoteObject.createImmutable(" "),_value))));
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildaudiosettingstext(RemoteObject __ref,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("BuildAudioSettingsText (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("buildaudiosettingstext")) { return __ref.runUserSub(false, "playbacktraceformatter","buildaudiosettingstext", __ref, _details);}
RemoteObject _volumetext = RemoteObject.createImmutable("");
RemoteObject _gaintext = RemoteObject.createImmutable("");
RemoteObject _gainstate = RemoteObject.createImmutable("");
RemoteObject _parts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("details", _details);
 BA.debugLineNum = 250;BA.debugLine="Private Sub BuildAudioSettingsText(details As Stri";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
Debug.ShouldStop(67108864);
_volumetext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("volume")));Debug.locals.put("volumeText", _volumetext);Debug.locals.put("volumeText", _volumetext);
 BA.debugLineNum = 252;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
Debug.ShouldStop(134217728);
_gaintext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("gainDb")));Debug.locals.put("gainText", _gaintext);Debug.locals.put("gainText", _gaintext);
 BA.debugLineNum = 253;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
Debug.ShouldStop(268435456);
_gainstate = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("gainApplied")));Debug.locals.put("gainState", _gainstate);Debug.locals.put("gainState", _gainstate);
 BA.debugLineNum = 254;BA.debugLine="Dim parts As List";
Debug.ShouldStop(536870912);
_parts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("parts", _parts);
 BA.debugLineNum = 255;BA.debugLine="parts.Initialize";
Debug.ShouldStop(1073741824);
_parts.runVoidMethod ("Initialize");
 BA.debugLineNum = 256;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость \" &";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_volumetext,BA.ObjectToString(""))) { 
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("громкость "),_volumetext))));};
 BA.debugLineNum = 257;BA.debugLine="If gainText <> \"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",_gaintext,BA.ObjectToString(""))) { 
 BA.debugLineNum = 258;BA.debugLine="If gainState = \"yes\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_gainstate,BA.ObjectToString("yes"))) { 
 BA.debugLineNum = 259;BA.debugLine="parts.Add(\"gain \" & gainText & \" дБ\")";
Debug.ShouldStop(4);
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("gain "),_gaintext,RemoteObject.createImmutable(" дБ")))));
 }else {
 BA.debugLineNum = 261;BA.debugLine="parts.Add(\"gain по умолчанию \" & gainText & \" д";
Debug.ShouldStop(16);
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("gain по умолчанию "),_gaintext,RemoteObject.createImmutable(" дБ")))));
 };
 };
 BA.debugLineNum = 264;BA.debugLine="If parts.Size = 0 Then Return \"\"";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_parts.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 265;BA.debugLine="Return \". \" & JoinWords(parts)";
Debug.ShouldStop(256);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(". "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_joinwords" /*RemoteObject*/ ,(Object)(_parts)));
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
public static RemoteObject  _buildcountstext(RemoteObject __ref,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("BuildCountsText (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("buildcountstext")) { return __ref.runUserSub(false, "playbacktraceformatter","buildcountstext", __ref, _details);}
RemoteObject _parts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("details", _details);
 BA.debugLineNum = 301;BA.debugLine="Private Sub BuildCountsText(details As String) As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="Dim parts As List";
Debug.ShouldStop(8192);
_parts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("parts", _parts);
 BA.debugLineNum = 303;BA.debugLine="parts.Initialize";
Debug.ShouldStop(16384);
_parts.runVoidMethod ("Initialize");
 BA.debugLineNum = 304;BA.debugLine="AddCountPart(parts, details, \"downloaded\", \"загру";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_addcountpart" /*RemoteObject*/ ,(Object)(_parts),(Object)(_details),(Object)(BA.ObjectToString("downloaded")),(Object)(RemoteObject.createImmutable("загружено")));
 BA.debugLineNum = 305;BA.debugLine="AddCountPart(parts, details, \"updated\", \"обновлен";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_addcountpart" /*RemoteObject*/ ,(Object)(_parts),(Object)(_details),(Object)(BA.ObjectToString("updated")),(Object)(RemoteObject.createImmutable("обновлено")));
 BA.debugLineNum = 306;BA.debugLine="AddCountPart(parts, details, \"failed\", \"ошибок\")";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_addcountpart" /*RemoteObject*/ ,(Object)(_parts),(Object)(_details),(Object)(BA.ObjectToString("failed")),(Object)(RemoteObject.createImmutable("ошибок")));
 BA.debugLineNum = 307;BA.debugLine="AddCountPart(parts, details, \"removed\", \"удалено\"";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_addcountpart" /*RemoteObject*/ ,(Object)(_parts),(Object)(_details),(Object)(BA.ObjectToString("removed")),(Object)(RemoteObject.createImmutable("удалено")));
 BA.debugLineNum = 308;BA.debugLine="AddCountPart(parts, details, \"actual\", \"осталось\"";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_addcountpart" /*RemoteObject*/ ,(Object)(_parts),(Object)(_details),(Object)(BA.ObjectToString("actual")),(Object)(RemoteObject.createImmutable("осталось")));
 BA.debugLineNum = 309;BA.debugLine="AddCountPart(parts, details, \"added\", \"добавлено\"";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_addcountpart" /*RemoteObject*/ ,(Object)(_parts),(Object)(_details),(Object)(BA.ObjectToString("added")),(Object)(RemoteObject.createImmutable("добавлено")));
 BA.debugLineNum = 310;BA.debugLine="AddCountPart(parts, details, \"tempDeleted\", \"врем";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_addcountpart" /*RemoteObject*/ ,(Object)(_parts),(Object)(_details),(Object)(BA.ObjectToString("tempDeleted")),(Object)(RemoteObject.createImmutable("временных удалено")));
 BA.debugLineNum = 311;BA.debugLine="AddCountPart(parts, details, \"ads\", \"рекламы\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_addcountpart" /*RemoteObject*/ ,(Object)(_parts),(Object)(_details),(Object)(BA.ObjectToString("ads")),(Object)(RemoteObject.createImmutable("рекламы")));
 BA.debugLineNum = 312;BA.debugLine="AddCountPart(parts, details, \"tracks\", \"треков\")";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_addcountpart" /*RemoteObject*/ ,(Object)(_parts),(Object)(_details),(Object)(BA.ObjectToString("tracks")),(Object)(RemoteObject.createImmutable("треков")));
 BA.debugLineNum = 313;BA.debugLine="If parts.Size = 0 Then Return BuildReasonText(det";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_parts.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details));};
 BA.debugLineNum = 314;BA.debugLine="Return JoinWords(parts)";
Debug.ShouldStop(33554432);
if (true) return __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_joinwords" /*RemoteObject*/ ,(Object)(_parts));
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildhealthaudiosettingstext(RemoteObject __ref,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("BuildHealthAudioSettingsText (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("buildhealthaudiosettingstext")) { return __ref.runUserSub(false, "playbacktraceformatter","buildhealthaudiosettingstext", __ref, _details);}
RemoteObject _volumetext = RemoteObject.createImmutable("");
RemoteObject _gaintext = RemoteObject.createImmutable("");
RemoteObject _gainstate = RemoteObject.createImmutable("");
RemoteObject _parts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("details", _details);
 BA.debugLineNum = 268;BA.debugLine="Private Sub BuildHealthAudioSettingsText(details A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
Debug.ShouldStop(4096);
_volumetext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("volume")));Debug.locals.put("volumeText", _volumetext);Debug.locals.put("volumeText", _volumetext);
 BA.debugLineNum = 270;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
Debug.ShouldStop(8192);
_gaintext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("gainDb")));Debug.locals.put("gainText", _gaintext);Debug.locals.put("gainText", _gaintext);
 BA.debugLineNum = 271;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
Debug.ShouldStop(16384);
_gainstate = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("gainApplied")));Debug.locals.put("gainState", _gainstate);Debug.locals.put("gainState", _gainstate);
 BA.debugLineNum = 272;BA.debugLine="Dim parts As List";
Debug.ShouldStop(32768);
_parts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("parts", _parts);
 BA.debugLineNum = 273;BA.debugLine="parts.Initialize";
Debug.ShouldStop(65536);
_parts.runVoidMethod ("Initialize");
 BA.debugLineNum = 274;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость=\" &";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_volumetext,BA.ObjectToString(""))) { 
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("громкость="),_volumetext))));};
 BA.debugLineNum = 275;BA.debugLine="If gainText <> \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_gaintext,BA.ObjectToString(""))) { 
 BA.debugLineNum = 276;BA.debugLine="If gainState = \"yes\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_gainstate,BA.ObjectToString("yes"))) { 
 BA.debugLineNum = 277;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ\")";
Debug.ShouldStop(1048576);
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("gain="),_gaintext,RemoteObject.createImmutable(" дБ")))));
 }else {
 BA.debugLineNum = 279;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ по умолчани";
Debug.ShouldStop(4194304);
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("gain="),_gaintext,RemoteObject.createImmutable(" дБ по умолчанию")))));
 };
 };
 BA.debugLineNum = 282;BA.debugLine="If parts.Size = 0 Then Return \"\"";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_parts.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 283;BA.debugLine="Return \", \" & JoinWords(parts)";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(", "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_joinwords" /*RemoteObject*/ ,(Object)(_parts)));
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildhumantracemessage(RemoteObject __ref,RemoteObject _category,RemoteObject _message,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("BuildHumanTraceMessage (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("buildhumantracemessage")) { return __ref.runUserSub(false, "playbacktraceformatter","buildhumantracemessage", __ref, _category, _message, _details);}
RemoteObject _delaysec = RemoteObject.createImmutable("");
RemoteObject _playertext = RemoteObject.createImmutable("");
RemoteObject _itemlabel = RemoteObject.createImmutable("");
RemoteObject _audiosettingstext = RemoteObject.createImmutable("");
RemoteObject _skipreason = RemoteObject.createImmutable("");
RemoteObject _sourcetext = RemoteObject.createImmutable("");
RemoteObject _generictext = RemoteObject.createImmutable("");
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 11;BA.debugLine="Public Sub BuildHumanTraceMessage(category As Stri";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Select category";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(_category,BA.ObjectToString("app"),BA.ObjectToString("network"),BA.ObjectToString("audio"),BA.ObjectToString("playback"),BA.ObjectToString("player"),BA.ObjectToString("cache"),BA.ObjectToString("history"),BA.ObjectToString("health"),BA.ObjectToString("system"))) {
case 0: {
 BA.debugLineNum = 14;BA.debugLine="If message = \"запуск\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_message,BA.ObjectToString("запуск"))) { 
 BA.debugLineNum = 15;BA.debugLine="Return \"Приложение запущено. \" & BuildVersionP";
Debug.ShouldStop(16384);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Приложение запущено. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildversionplayertext" /*RemoteObject*/ ,(Object)(_details)));
 };
 break; }
case 1: {
 BA.debugLineNum = 18;BA.debugLine="Select message";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_message,BA.ObjectToString("запрос данных"),BA.ObjectToString("data загружены"),BA.ObjectToString("data ошибка"),BA.ObjectToString("data сообщение"),BA.ObjectToString("data некорректны"),BA.ObjectToString("переход в retry"),BA.ObjectToString("data timeout"),BA.ObjectToString("метаданные плейлистов обновлены"),BA.ObjectToString("ошибка метаданных плейлиста"),BA.ObjectToString("ошибка очереди"),BA.ObjectToString("media path восстановлен"),BA.ObjectToString("деградация media path"))) {
case 0: {
 BA.debugLineNum = 20;BA.debugLine="Return \"Запрос данных\"";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("Запрос данных");
 break; }
case 1: {
 BA.debugLineNum = 22;BA.debugLine="Return \"Данные получены.\"";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToString("Данные получены.");
 break; }
case 2: {
 BA.debugLineNum = 24;BA.debugLine="Return \"Ошибка запроса данных. \" & BuildReaso";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Ошибка запроса данных. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 3: {
 BA.debugLineNum = 26;BA.debugLine="Return \"Сервер вернул сообщение. \" & BuildRea";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Сервер вернул сообщение. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 4: {
 BA.debugLineNum = 28;BA.debugLine="Return \"Ошибка данных от сервера. \" & BuildRe";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Ошибка данных от сервера. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 5: {
 BA.debugLineNum = 30;BA.debugLine="Dim delaySec As String = ExtractDetailValue(d";
Debug.ShouldStop(536870912);
_delaysec = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("delaySec")));Debug.locals.put("delaySec", _delaysec);Debug.locals.put("delaySec", _delaysec);
 BA.debugLineNum = 31;BA.debugLine="If delaySec = \"\" Then delaySec = ExtractDetai";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_delaysec,BA.ObjectToString(""))) { 
_delaysec = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("delay")));Debug.locals.put("delaySec", _delaysec);};
 BA.debugLineNum = 32;BA.debugLine="If delaySec <> \"\" Then Return \"Повторный запр";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_delaysec,BA.ObjectToString(""))) { 
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Повторный запрос данных через "),_delaysec,RemoteObject.createImmutable(" секунд"));};
 BA.debugLineNum = 33;BA.debugLine="Return \"Повторный запрос данных позже\"";
Debug.ShouldStop(1);
if (true) return BA.ObjectToString("Повторный запрос данных позже");
 break; }
case 6: {
 BA.debugLineNum = 35;BA.debugLine="Return \"Сервер не ответил вовремя. \" & BuildR";
Debug.ShouldStop(4);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Сервер не ответил вовремя. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 7: {
 BA.debugLineNum = 37;BA.debugLine="Return \"Метаданные плейлистов обновлены. \" &";
Debug.ShouldStop(16);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Метаданные плейлистов обновлены. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildcountstext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 8: {
 BA.debugLineNum = 39;BA.debugLine="Return \"Не удалось загрузить метаданные плейл";
Debug.ShouldStop(64);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Не удалось загрузить метаданные плейлиста. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 9: {
 BA.debugLineNum = 41;BA.debugLine="Return \"Не удалось получить очередь. \" & Buil";
Debug.ShouldStop(256);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Не удалось получить очередь. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 10: {
 BA.debugLineNum = 43;BA.debugLine="Return \"Доступ к медиа восстановлен.\"";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToString("Доступ к медиа восстановлен.");
 break; }
case 11: {
 BA.debugLineNum = 45;BA.debugLine="Return \"Доступ к медиа ухудшился.\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("Доступ к медиа ухудшился.");
 break; }
}
;
 break; }
case 2: {
 BA.debugLineNum = 48;BA.debugLine="Dim playerText As String = \"Плеер \" & ExtractDe";
Debug.ShouldStop(32768);
_playertext = RemoteObject.concat(RemoteObject.createImmutable("Плеер "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("player"))));Debug.locals.put("playerText", _playertext);Debug.locals.put("playerText", _playertext);
 BA.debugLineNum = 49;BA.debugLine="Dim itemLabel As String = TraceItemLabelFromDet";
Debug.ShouldStop(65536);
_itemlabel = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_traceitemlabelfromdetails" /*RemoteObject*/ ,(Object)(_details));Debug.locals.put("itemLabel", _itemlabel);Debug.locals.put("itemLabel", _itemlabel);
 BA.debugLineNum = 50;BA.debugLine="Dim audioSettingsText As String = BuildAudioSet";
Debug.ShouldStop(131072);
_audiosettingstext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildaudiosettingstext" /*RemoteObject*/ ,(Object)(_details));Debug.locals.put("audioSettingsText", _audiosettingstext);Debug.locals.put("audioSettingsText", _audiosettingstext);
 BA.debugLineNum = 51;BA.debugLine="Select message";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(_message,BA.ObjectToString("плеер load"),BA.ObjectToString("плеер ready"),BA.ObjectToString("плеер play"),BA.ObjectToString("плеер complete"),BA.ObjectToString("плеер error"),BA.ObjectToString("не удалось запустить трек"),BA.ObjectToString("таймаут старта трека"),BA.ObjectToString("таймаут preload"))) {
case 0: {
 BA.debugLineNum = 53;BA.debugLine="Return playerText & \": Загружен \" & itemLabel";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.concat(_playertext,RemoteObject.createImmutable(": Загружен "),_itemlabel,_audiosettingstext);
 break; }
case 1: {
 BA.debugLineNum = 55;BA.debugLine="If ExtractDetailValue(details, \"mode\") = \"pre";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("mode"))),BA.ObjectToString("prepare"))) { 
 BA.debugLineNum = 56;BA.debugLine="Return playerText & \": Подготовлен \" & itemL";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.concat(_playertext,RemoteObject.createImmutable(": Подготовлен "),_itemlabel,_audiosettingstext);
 };
 BA.debugLineNum = 58;BA.debugLine="Return playerText & \": Готов к воспроизведени";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.concat(_playertext,RemoteObject.createImmutable(": Готов к воспроизведению "),_itemlabel,_audiosettingstext);
 break; }
case 2: {
 BA.debugLineNum = 60;BA.debugLine="Return playerText & \": Воспроизведение \" & it";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(_playertext,RemoteObject.createImmutable(": Воспроизведение "),_itemlabel,_audiosettingstext);
 break; }
case 3: {
 BA.debugLineNum = 62;BA.debugLine="Return playerText & \": Закончил \" & itemLabel";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.concat(_playertext,RemoteObject.createImmutable(": Закончил "),_itemlabel);
 break; }
case 4: {
 BA.debugLineNum = 64;BA.debugLine="Return playerText & \": Ошибка \" & itemLabel &";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.concat(_playertext,RemoteObject.createImmutable(": Ошибка "),_itemlabel,RemoteObject.createImmutable(". "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 5: {
 BA.debugLineNum = 66;BA.debugLine="Return playerText & \": Не удалось запустить \"";
Debug.ShouldStop(2);
if (true) return RemoteObject.concat(_playertext,RemoteObject.createImmutable(": Не удалось запустить "),_itemlabel,RemoteObject.createImmutable(". "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 6: {
 BA.debugLineNum = 68;BA.debugLine="Return playerText & \": Не дождались старта \"";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(_playertext,RemoteObject.createImmutable(": Не дождались старта "),_itemlabel);
 break; }
case 7: {
 BA.debugLineNum = 70;BA.debugLine="Return playerText & \": Не дождались подготовк";
Debug.ShouldStop(32);
if (true) return RemoteObject.concat(_playertext,RemoteObject.createImmutable(": Не дождались подготовки "),_itemlabel);
 break; }
}
;
 break; }
case 3: {
 BA.debugLineNum = 73;BA.debugLine="Select message";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(_message,BA.ObjectToString("первый трек выбран из кэша"),BA.ObjectToString("populate queue start"),BA.ObjectToString("populate queue done"),BA.ObjectToString("populate queue fail"),BA.ObjectToString("dispatch next"),BA.ObjectToString("dispatch break"),BA.ObjectToString("dispatch prepared"),BA.ObjectToString("dispatch переход"),BA.ObjectToString("prefetch start"),BA.ObjectToString("prefetch done"),BA.ObjectToString("prefetch fail"),BA.ObjectToString("prefetch skip"),BA.ObjectToString("crossfade trigger"),BA.ObjectToString("старт трека"),BA.ObjectToString("смена трека"),BA.ObjectToString("watchdog stall"),BA.ObjectToString("watchdog recovery"),BA.ObjectToString("break переход начало"),BA.ObjectToString("break переход итог"),BA.ObjectToString("break переход fade"),BA.ObjectToString("break переход пропущен"),BA.ObjectToString("вставлен break"),BA.ObjectToString("вставлена реклама"),BA.ObjectToString("очередь пуста"),BA.ObjectToString("audio complete пропущен"))) {
case 0: {
 BA.debugLineNum = 75;BA.debugLine="Return \"Первый трек выбран из кэша.\"";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToString("Первый трек выбран из кэша.");
 break; }
case 1: {
 BA.debugLineNum = 77;BA.debugLine="Return \"Подготовка очереди.\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("Подготовка очереди.");
 break; }
case 2: {
 BA.debugLineNum = 79;BA.debugLine="Return \"Очередь подготовлена. Элементов: \" &";
Debug.ShouldStop(16384);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Очередь подготовлена. Элементов: "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_defaultifempty" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("queue")))),(Object)(RemoteObject.createImmutable("0"))));
 break; }
case 3: {
 BA.debugLineNum = 81;BA.debugLine="Return \"Не удалось подготовить очередь. \" & B";
Debug.ShouldStop(65536);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Не удалось подготовить очередь. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 4: {
 BA.debugLineNum = 83;BA.debugLine="Return \"Следующий элемент: \" & TraceItemLabel";
Debug.ShouldStop(262144);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Следующий элемент: "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_traceitemlabelfromdetails" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 5: {
 BA.debugLineNum = 85;BA.debugLine="Return \"Начата обработка break.\"";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString("Начата обработка break.");
 break; }
case 6: {
 BA.debugLineNum = 87;BA.debugLine="Return \"Запущен следующий элемент.\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("Запущен следующий элемент.");
 break; }
case 7: {
 BA.debugLineNum = 89;BA.debugLine="Return \"Переход к следующему элементу.\"";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToString("Переход к следующему элементу.");
 break; }
case 8: {
 BA.debugLineNum = 91;BA.debugLine="Return \"Подготовка следующего элемента.\"";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToString("Подготовка следующего элемента.");
 break; }
case 9: {
 BA.debugLineNum = 93;BA.debugLine="Return \"Следующий элемент подготовлен.\"";
Debug.ShouldStop(268435456);
if (true) return BA.ObjectToString("Следующий элемент подготовлен.");
 break; }
case 10: {
 BA.debugLineNum = 95;BA.debugLine="Return \"Не удалось подготовить следующий элем";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Не удалось подготовить следующий элемент. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 11: {
 BA.debugLineNum = 97;BA.debugLine="Dim skipReason As String = ExtractDetailValue";
Debug.ShouldStop(1);
_skipreason = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("reason")));Debug.locals.put("skipReason", _skipreason);Debug.locals.put("skipReason", _skipreason);
 BA.debugLineNum = 98;BA.debugLine="If skipReason = \"break_ahead\" Then Return \"Пр";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_skipreason,BA.ObjectToString("break_ahead"))) { 
if (true) return BA.ObjectToString("Предварительная подготовка отложена: впереди break.");};
 BA.debugLineNum = 99;BA.debugLine="Return \"Предварительная подготовка пропущена.";
Debug.ShouldStop(4);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Предварительная подготовка пропущена. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 12: {
 BA.debugLineNum = 101;BA.debugLine="Return \"Начат кроссфейд на следующий трек.\"";
Debug.ShouldStop(16);
if (true) return BA.ObjectToString("Начат кроссфейд на следующий трек.");
 break; }
case 13: {
 BA.debugLineNum = 103;BA.debugLine="Dim sourceText As String = ExtractDetailValue";
Debug.ShouldStop(64);
_sourcetext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("source")));Debug.locals.put("sourceText", _sourcetext);Debug.locals.put("sourceText", _sourcetext);
 BA.debugLineNum = 104;BA.debugLine="If sourceText <> \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",_sourcetext,BA.ObjectToString(""))) { 
 BA.debugLineNum = 105;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(d";
Debug.ShouldStop(256);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Старт трека "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("trackId"))),RemoteObject.createImmutable(". Источник: "),_sourcetext);
 };
 BA.debugLineNum = 107;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(de";
Debug.ShouldStop(1024);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Старт трека "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("trackId"))));
 break; }
case 14: {
 BA.debugLineNum = 109;BA.debugLine="Return \"Переход после трека \" & ExtractDetail";
Debug.ShouldStop(4096);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Переход после трека "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("trackId"))));
 break; }
case 15: {
 BA.debugLineNum = 111;BA.debugLine="Return \"Воспроизведение зависло на треке \" &";
Debug.ShouldStop(16384);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Воспроизведение зависло на треке "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_defaultifempty" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("trackId")))),(Object)(RemoteObject.createImmutable("без идентификатора"))),RemoteObject.createImmutable(". Запускаю восстановление."));
 break; }
case 16: {
 BA.debugLineNum = 113;BA.debugLine="Return \"Восстановление воспроизведения. \" & B";
Debug.ShouldStop(65536);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Восстановление воспроизведения. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 17: {
 BA.debugLineNum = 115;BA.debugLine="Return \"Начат переход на break.\"";
Debug.ShouldStop(262144);
if (true) return BA.ObjectToString("Начат переход на break.");
 break; }
case 18: {
 BA.debugLineNum = 117;BA.debugLine="Return \"Переход на break завершен. \" & BuildR";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Переход на break завершен. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 19: {
 BA.debugLineNum = 119;BA.debugLine="Return \"Плавное завершение текущего элемента.";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("Плавное завершение текущего элемента.");
 break; }
case 20: {
 BA.debugLineNum = 121;BA.debugLine="Return \"Переход на break пропущен. \" & BuildR";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Переход на break пропущен. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 21: {
 BA.debugLineNum = 123;BA.debugLine="Return \"В очередь вставлен break.\"";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToString("В очередь вставлен break.");
 break; }
case 22: {
 BA.debugLineNum = 125;BA.debugLine="Return \"Подготовлен переход на рекламу.\"";
Debug.ShouldStop(268435456);
if (true) return BA.ObjectToString("Подготовлен переход на рекламу.");
 break; }
case 23: {
 BA.debugLineNum = 127;BA.debugLine="Return \"Очередь пуста. \" & BuildReasonText(de";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Очередь пуста. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 24: {
 BA.debugLineNum = 129;BA.debugLine="Return \"Событие завершения проигнорировано. \"";
Debug.ShouldStop(1);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Событие завершения проигнорировано. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
}
;
 break; }
case 4: {
 BA.debugLineNum = 132;BA.debugLine="Select message";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_message,BA.ObjectToString("старт завершен"),BA.ObjectToString("старт не завершен"),BA.ObjectToString("автостарт воспроизведение начало"),BA.ObjectToString("воспроизведение остановлено"),BA.ObjectToString("плеер заблокирован"))) {
case 0: {
 BA.debugLineNum = 134;BA.debugLine="Return \"Старт плеера завершен.\"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToString("Старт плеера завершен.");
 break; }
case 1: {
 BA.debugLineNum = 136;BA.debugLine="Return \"Старт плеера не завершен. \" & BuildRe";
Debug.ShouldStop(128);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Старт плеера не завершен. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 2: {
 BA.debugLineNum = 138;BA.debugLine="Return \"Автостарт воспроизведения.\"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString("Автостарт воспроизведения.");
 break; }
case 3: {
 BA.debugLineNum = 140;BA.debugLine="Return \"Воспроизведение остановлено. \" & Buil";
Debug.ShouldStop(2048);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Воспроизведение остановлено. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 4: {
 BA.debugLineNum = 142;BA.debugLine="Return \"Плеер заблокирован.\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("Плеер заблокирован.");
 break; }
}
;
 break; }
case 5: {
 BA.debugLineNum = 145;BA.debugLine="Select message";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_message,BA.ObjectToString("трек загружен в кэш"),BA.ObjectToString("ошибка загрузки трека"),BA.ObjectToString("кэш треков обновлен"),BA.ObjectToString("кэш рекламы обновлен"),BA.ObjectToString("аудит кэша"),BA.ObjectToString("очистка кэша"),BA.ObjectToString("реклама удалена из кэша"),BA.ObjectToString("ошибка подготовки трека"),BA.ObjectToString("нет локального файла"))) {
case 0: {
 BA.debugLineNum = 147;BA.debugLine="Return \"Кэш: Загружен трек \" & DefaultIfEmpty";
Debug.ShouldStop(262144);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: Загружен трек "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_defaultifempty" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("id")))),(Object)(RemoteObject.createImmutable("без идентификатора"))));
 break; }
case 1: {
 BA.debugLineNum = 149;BA.debugLine="Return \"Кэш: Не удалось загрузить трек. \" & B";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: Не удалось загрузить трек. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 2: {
 BA.debugLineNum = 151;BA.debugLine="Return \"Кэш: Треки проверены. \" & BuildCounts";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: Треки проверены. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildcountstext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 3: {
 BA.debugLineNum = 153;BA.debugLine="Return \"Кэш: Реклама проверена. \" & BuildCoun";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: Реклама проверена. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildcountstext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 4: {
 BA.debugLineNum = 155;BA.debugLine="Return \"Кэш: Проверен. \" & BuildCountsText(de";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: Проверен. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildcountstext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 5: {
 BA.debugLineNum = 157;BA.debugLine="Return \"Кэш: Очистка завершена. \" & BuildCoun";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: Очистка завершена. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildcountstext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 6: {
 BA.debugLineNum = 159;BA.debugLine="Return \"Кэш: Удалена устаревшая реклама \" & E";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: Удалена устаревшая реклама "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("id"))));
 break; }
case 7: {
 BA.debugLineNum = 161;BA.debugLine="Return \"Кэш: Ошибка подготовки трека. \" & Bui";
Debug.ShouldStop(1);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: Ошибка подготовки трека. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 8: {
 BA.debugLineNum = 163;BA.debugLine="Return \"Кэш: Локальный файл не найден для тре";
Debug.ShouldStop(4);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: Локальный файл не найден для трека "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("trackId"))));
 break; }
}
;
 break; }
case 6: {
 BA.debugLineNum = 166;BA.debugLine="Select message";
Debug.ShouldStop(32);
switch (BA.switchObjectToInt(_message,BA.ObjectToString("история отправлена"),BA.ObjectToString("история не отправлена"),BA.ObjectToString("ошибка отправки"),BA.ObjectToString("ошибка истории"),BA.ObjectToString("не удалось прочитать файл истории"))) {
case 0: {
 BA.debugLineNum = 168;BA.debugLine="Return \"История отправлена. Записей: \" & Defa";
Debug.ShouldStop(128);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("История отправлена. Записей: "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_defaultifempty" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("records")))),(Object)(RemoteObject.createImmutable("0"))));
 break; }
case 1: {
 BA.debugLineNum = 170;BA.debugLine="Return \"История не отправлена. Записей: \" & D";
Debug.ShouldStop(512);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("История не отправлена. Записей: "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_defaultifempty" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("records")))),(Object)(RemoteObject.createImmutable("0"))));
 break; }
case 2: {
 BA.debugLineNum = 172;BA.debugLine="Return \"Ошибка отправки истории. \" & BuildRea";
Debug.ShouldStop(2048);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Ошибка отправки истории. "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildreasontext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 3: {
 BA.debugLineNum = 174;BA.debugLine="Return \"Ошибка чтения истории.\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("Ошибка чтения истории.");
 break; }
case 4: {
 BA.debugLineNum = 176;BA.debugLine="Return \"Не удалось прочитать файл истории \" &";
Debug.ShouldStop(32768);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Не удалось прочитать файл истории "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("file"))));
 break; }
}
;
 break; }
case 7: {
 BA.debugLineNum = 179;BA.debugLine="Select message";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(_message,BA.ObjectToString("воспроизведение"),BA.ObjectToString("кэш"),BA.ObjectToString("устройство"),BA.ObjectToString("ресурсы"),BA.ObjectToString("сеть"))) {
case 0: {
 BA.debugLineNum = 181;BA.debugLine="Return \"Воспроизведение: этап=\" & ExtractDeta";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Воспроизведение: этап="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("stage"))),RemoteObject.createImmutable(", играет="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("playing"))),RemoteObject.createImmutable(", трек="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("currentTrackId"))),RemoteObject.createImmutable(", очередь="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("queue"))),RemoteObject.createImmutable(", запас="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("reserve"))),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_buildhealthaudiosettingstext" /*RemoteObject*/ ,(Object)(_details)));
 break; }
case 1: {
 BA.debugLineNum = 188;BA.debugLine="Return \"Кэш: \" & DefaultIfEmpty(ExtractDetail";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_defaultifempty" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("status")))),(Object)(RemoteObject.createImmutable("неизвестно"))));
 break; }
case 2: {
 BA.debugLineNum = 190;BA.debugLine="Return \"Устройство: \" & ExtractDetailValue(de";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Устройство: "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("device"))),RemoteObject.createImmutable(", id="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("deviceId"))),RemoteObject.createImmutable(", ОС="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailtail" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("os"))));
 break; }
case 3: {
 BA.debugLineNum = 194;BA.debugLine="Return \"Система: RAM=\" & ExtractDetailValue(d";
Debug.ShouldStop(2);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Система: RAM="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("ramFreeMb"))),RemoteObject.createImmutable(" МБ"),RemoteObject.createImmutable(", диск="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("diskFreeMb"))),RemoteObject.createImmutable("/"),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("diskTotalMb"))),RemoteObject.createImmutable(" МБ"));
 break; }
case 4: {
 BA.debugLineNum = 197;BA.debugLine="Return \"Сеть: ошибок=\" & ExtractDetailValue(d";
Debug.ShouldStop(16);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Сеть: ошибок="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("netErrors"))),RemoteObject.createImmutable(", данные ок "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("lastDataOkAgoSec"))),RemoteObject.createImmutable(" сек назад"),RemoteObject.createImmutable(", история ок "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("lastHistoryOkAgoSec"))),RemoteObject.createImmutable(" сек назад"));
 break; }
}
;
 break; }
case 8: {
 BA.debugLineNum = 202;BA.debugLine="Select message";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(_message,BA.ObjectToString("источник"),BA.ObjectToString("устройство"),BA.ObjectToString("платформа"),BA.ObjectToString("память"),BA.ObjectToString("память доступно"),BA.ObjectToString("диск"),BA.ObjectToString("кэш треков"),BA.ObjectToString("кэш рекламы"),BA.ObjectToString("история"))) {
case 0: {
 BA.debugLineNum = 204;BA.debugLine="Return \"Система: источник=\" & details";
Debug.ShouldStop(2048);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Система: источник="),_details);
 break; }
case 1: {
 BA.debugLineNum = 206;BA.debugLine="Return \"Устройство: \" & ExtractDetailValue(de";
Debug.ShouldStop(8192);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Устройство: "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("name"))),RemoteObject.createImmutable(", id="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("id"))));
 break; }
case 2: {
 BA.debugLineNum = 208;BA.debugLine="Return \"Система: \" & ExtractDetailTail(detail";
Debug.ShouldStop(32768);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Система: "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailtail" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("os"))));
 break; }
case 3: {
 BA.debugLineNum = 210;BA.debugLine="Return \"RAM: свободно \" & ExtractDetailValue(";
Debug.ShouldStop(131072);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("RAM: свободно "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("ramFreeMb"))),RemoteObject.createImmutable(" МБ"));
 break; }
case 4: {
 BA.debugLineNum = 212;BA.debugLine="Return \"RAM: приложению \" & ExtractDetailValu";
Debug.ShouldStop(524288);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("RAM: приложению "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("ramTotalMb"))),RemoteObject.createImmutable(" МБ"));
 break; }
case 5: {
 BA.debugLineNum = 214;BA.debugLine="Return \"Диск: свободно \" & ExtractDetailValue";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Диск: свободно "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("diskFreeMb"))),RemoteObject.createImmutable(" МБ из "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("diskTotalMb"))),RemoteObject.createImmutable(" МБ"));
 break; }
case 6: {
 BA.debugLineNum = 216;BA.debugLine="Return \"Кэш: треков=\" & ExtractDetailValue(de";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: треков="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("trackCount"))),RemoteObject.createImmutable(", "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("trackMb"))),RemoteObject.createImmutable(" МБ, индекс="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("trackIndex"))));
 break; }
case 7: {
 BA.debugLineNum = 218;BA.debugLine="Return \"Кэш: рекламы=\" & ExtractDetailValue(d";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Кэш: рекламы="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("adCount"))),RemoteObject.createImmutable(", "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("adMb"))),RemoteObject.createImmutable(" МБ, индекс="),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("adIndex"))));
 break; }
case 8: {
 BA.debugLineNum = 220;BA.debugLine="Return \"История: ожидает отправки \" & Extract";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("История: ожидает отправки "),__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("pendingHistory"))),RemoteObject.createImmutable(" записей"));
 break; }
}
;
 break; }
}
;
 BA.debugLineNum = 223;BA.debugLine="Dim genericText As String = message";
Debug.ShouldStop(1073741824);
_generictext = _message;Debug.locals.put("genericText", _generictext);Debug.locals.put("genericText", _generictext);
 BA.debugLineNum = 224;BA.debugLine="If details <> \"\" Then genericText = genericText &";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_details,BA.ObjectToString(""))) { 
_generictext = RemoteObject.concat(_generictext,RemoteObject.createImmutable(". "),_details);Debug.locals.put("genericText", _generictext);};
 BA.debugLineNum = 225;BA.debugLine="Return genericText";
Debug.ShouldStop(1);
if (true) return _generictext;
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildreasontext(RemoteObject __ref,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("BuildReasonText (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("buildreasontext")) { return __ref.runUserSub(false, "playbacktraceformatter","buildreasontext", __ref, _details);}
RemoteObject _messagetext = RemoteObject.createImmutable("");
RemoteObject _reasontext = RemoteObject.createImmutable("");
RemoteObject _kindtext = RemoteObject.createImmutable("");
RemoteObject _steptext = RemoteObject.createImmutable("");
RemoteObject _resulttext = RemoteObject.createImmutable("");
Debug.locals.put("details", _details);
 BA.debugLineNum = 286;BA.debugLine="Private Sub BuildReasonText(details As String) As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="If details = \"\" Then Return \"\"";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_details,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 288;BA.debugLine="Dim messageText As String = ExtractDetailTail(det";
Debug.ShouldStop(-2147483648);
_messagetext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailtail" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("message")));Debug.locals.put("messageText", _messagetext);Debug.locals.put("messageText", _messagetext);
 BA.debugLineNum = 289;BA.debugLine="If messageText <> \"\" Then Return messageText";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",_messagetext,BA.ObjectToString(""))) { 
if (true) return _messagetext;};
 BA.debugLineNum = 290;BA.debugLine="Dim reasonText As String = ExtractDetailTail(deta";
Debug.ShouldStop(2);
_reasontext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailtail" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("reason")));Debug.locals.put("reasonText", _reasontext);Debug.locals.put("reasonText", _reasontext);
 BA.debugLineNum = 291;BA.debugLine="If reasonText <> \"\" Then Return \"Причина: \" & rea";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_reasontext,BA.ObjectToString(""))) { 
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Причина: "),_reasontext);};
 BA.debugLineNum = 292;BA.debugLine="Dim kindText As String = ExtractDetailValue(detai";
Debug.ShouldStop(8);
_kindtext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("kind")));Debug.locals.put("kindText", _kindtext);Debug.locals.put("kindText", _kindtext);
 BA.debugLineNum = 293;BA.debugLine="If kindText <> \"\" Then Return \"Причина: \" & kindT";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_kindtext,BA.ObjectToString(""))) { 
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Причина: "),_kindtext);};
 BA.debugLineNum = 294;BA.debugLine="Dim stepText As String = ExtractDetailValue(detai";
Debug.ShouldStop(32);
_steptext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("step")));Debug.locals.put("stepText", _steptext);Debug.locals.put("stepText", _steptext);
 BA.debugLineNum = 295;BA.debugLine="If stepText <> \"\" Then Return \"Шаг: \" & stepText";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_steptext,BA.ObjectToString(""))) { 
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Шаг: "),_steptext);};
 BA.debugLineNum = 296;BA.debugLine="Dim resultText As String = ExtractDetailValue(det";
Debug.ShouldStop(128);
_resulttext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("result")));Debug.locals.put("resultText", _resulttext);Debug.locals.put("resultText", _resulttext);
 BA.debugLineNum = 297;BA.debugLine="If resultText <> \"\" Then Return \"Результат: \" & r";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_resulttext,BA.ObjectToString(""))) { 
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Результат: "),_resulttext);};
 BA.debugLineNum = 298;BA.debugLine="Return details";
Debug.ShouldStop(512);
if (true) return _details;
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildversionplayertext(RemoteObject __ref,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("BuildVersionPlayerText (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("buildversionplayertext")) { return __ref.runUserSub(false, "playbacktraceformatter","buildversionplayertext", __ref, _details);}
RemoteObject _versiontext = RemoteObject.createImmutable("");
RemoteObject _playertext = RemoteObject.createImmutable("");
RemoteObject _parts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("details", _details);
 BA.debugLineNum = 228;BA.debugLine="Private Sub BuildVersionPlayerText(details As Stri";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="Dim versionText As String = ExtractDetailValue(de";
Debug.ShouldStop(16);
_versiontext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("version")));Debug.locals.put("versionText", _versiontext);Debug.locals.put("versionText", _versiontext);
 BA.debugLineNum = 230;BA.debugLine="Dim playerText As String = ExtractDetailValue(det";
Debug.ShouldStop(32);
_playertext = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("player")));Debug.locals.put("playerText", _playertext);Debug.locals.put("playerText", _playertext);
 BA.debugLineNum = 231;BA.debugLine="Dim parts As List";
Debug.ShouldStop(64);
_parts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("parts", _parts);
 BA.debugLineNum = 232;BA.debugLine="parts.Initialize";
Debug.ShouldStop(128);
_parts.runVoidMethod ("Initialize");
 BA.debugLineNum = 233;BA.debugLine="If versionText <> \"\" Then parts.Add(\"Версия \" & v";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_versiontext,BA.ObjectToString(""))) { 
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Версия "),_versiontext))));};
 BA.debugLineNum = 234;BA.debugLine="If playerText <> \"\" Then parts.Add(\"Плеер \" & pla";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_playertext,BA.ObjectToString(""))) { 
_parts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Плеер "),_playertext))));};
 BA.debugLineNum = 235;BA.debugLine="If parts.Size = 0 Then Return \"Запуск\"";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_parts.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("Запуск");};
 BA.debugLineNum = 236;BA.debugLine="Return JoinWords(parts)";
Debug.ShouldStop(2048);
if (true) return __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_joinwords" /*RemoteObject*/ ,(Object)(_parts));
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _defaultifempty(RemoteObject __ref,RemoteObject _value,RemoteObject _fallback) throws Exception{
try {
		Debug.PushSubsStack("DefaultIfEmpty (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("defaultifempty")) { return __ref.runUserSub(false, "playbacktraceformatter","defaultifempty", __ref, _value, _fallback);}
Debug.locals.put("value", _value);
Debug.locals.put("fallback", _fallback);
 BA.debugLineNum = 333;BA.debugLine="Private Sub DefaultIfEmpty(value As String, fallba";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="If value = \"\" Then Return fallback";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_value,BA.ObjectToString(""))) { 
if (true) return _fallback;};
 BA.debugLineNum = 335;BA.debugLine="Return value";
Debug.ShouldStop(16384);
if (true) return _value;
 BA.debugLineNum = 336;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extractdetailtail(RemoteObject __ref,RemoteObject _details,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("ExtractDetailTail (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("extractdetailtail")) { return __ref.runUserSub(false, "playbacktraceformatter","extractdetailtail", __ref, _details, _key);}
RemoteObject _marker = RemoteObject.createImmutable("");
RemoteObject _startindex = RemoteObject.createImmutable(0);
Debug.locals.put("details", _details);
Debug.locals.put("key", _key);
 BA.debugLineNum = 348;BA.debugLine="Private Sub ExtractDetailTail(details As String, k";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="Dim marker As String = key & \"=\"";
Debug.ShouldStop(268435456);
_marker = RemoteObject.concat(_key,RemoteObject.createImmutable("="));Debug.locals.put("marker", _marker);Debug.locals.put("marker", _marker);
 BA.debugLineNum = 350;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
Debug.ShouldStop(536870912);
_startindex = _details.runMethod(true,"indexOf",(Object)(_marker));Debug.locals.put("startIndex", _startindex);Debug.locals.put("startIndex", _startindex);
 BA.debugLineNum = 351;BA.debugLine="If startIndex < 0 Then Return \"\"";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",_startindex,BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 352;BA.debugLine="Return details.SubString(startIndex + marker.Leng";
Debug.ShouldStop(-2147483648);
if (true) return _details.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_startindex,_marker.runMethod(true,"length")}, "+",1, 1))).runMethod(true,"trim");
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extractdetailvalue(RemoteObject __ref,RemoteObject _details,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("ExtractDetailValue (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,338);
if (RapidSub.canDelegate("extractdetailvalue")) { return __ref.runUserSub(false, "playbacktraceformatter","extractdetailvalue", __ref, _details, _key);}
RemoteObject _marker = RemoteObject.createImmutable("");
RemoteObject _startindex = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _nextspace = RemoteObject.createImmutable(0);
Debug.locals.put("details", _details);
Debug.locals.put("key", _key);
 BA.debugLineNum = 338;BA.debugLine="Private Sub ExtractDetailValue(details As String,";
Debug.ShouldStop(131072);
 BA.debugLineNum = 339;BA.debugLine="Dim marker As String = key & \"=\"";
Debug.ShouldStop(262144);
_marker = RemoteObject.concat(_key,RemoteObject.createImmutable("="));Debug.locals.put("marker", _marker);Debug.locals.put("marker", _marker);
 BA.debugLineNum = 340;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
Debug.ShouldStop(524288);
_startindex = _details.runMethod(true,"indexOf",(Object)(_marker));Debug.locals.put("startIndex", _startindex);Debug.locals.put("startIndex", _startindex);
 BA.debugLineNum = 341;BA.debugLine="If startIndex < 0 Then Return \"\"";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("<",_startindex,BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 342;BA.debugLine="Dim value As String = details.SubString(startInde";
Debug.ShouldStop(2097152);
_value = _details.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_startindex,_marker.runMethod(true,"length")}, "+",1, 1))).runMethod(true,"trim");Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 343;BA.debugLine="Dim nextSpace As Int = value.IndexOf(\" \")";
Debug.ShouldStop(4194304);
_nextspace = _value.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("nextSpace", _nextspace);Debug.locals.put("nextSpace", _nextspace);
 BA.debugLineNum = 344;BA.debugLine="If nextSpace >= 0 Then value = value.SubString2(0";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("g",_nextspace,BA.numberCast(double.class, 0))) { 
_value = _value.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_nextspace));Debug.locals.put("value", _value);};
 BA.debugLineNum = 345;BA.debugLine="Return value.Trim";
Debug.ShouldStop(16777216);
if (true) return _value.runMethod(true,"trim");
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbacktraceformatter","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinwords(RemoteObject __ref,RemoteObject _parts) throws Exception{
try {
		Debug.PushSubsStack("JoinWords (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("joinwords")) { return __ref.runUserSub(false, "playbacktraceformatter","joinwords", __ref, _parts);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("parts", _parts);
 BA.debugLineNum = 323;BA.debugLine="Private Sub JoinWords(parts As List) As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 324;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 325;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 326;BA.debugLine="For i = 0 To parts.Size - 1";
Debug.ShouldStop(32);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_parts.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 327;BA.debugLine="If i > 0 Then sb.Append(\". \")";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(". ")));};
 BA.debugLineNum = 328;BA.debugLine="sb.Append(parts.Get(i))";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_parts.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 330;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(512);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _traceitemlabelfromdetails(RemoteObject __ref,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("TraceItemLabelFromDetails (playbacktraceformatter) ","playbacktraceformatter",7,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("traceitemlabelfromdetails")) { return __ref.runUserSub(false, "playbacktraceformatter","traceitemlabelfromdetails", __ref, _details);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _itemid = RemoteObject.createImmutable("");
Debug.locals.put("details", _details);
 BA.debugLineNum = 239;BA.debugLine="Private Sub TraceItemLabelFromDetails(details As S";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Dim itemType As String = ExtractDetailValue(detai";
Debug.ShouldStop(32768);
_itemtype = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("type")));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 241;BA.debugLine="Dim itemId As String = DefaultIfEmpty(ExtractDeta";
Debug.ShouldStop(65536);
_itemid = __ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_defaultifempty" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("id")))),(Object)(__ref.runClassMethod (b4j.example.playbacktraceformatter.class, "_extractdetailvalue" /*RemoteObject*/ ,(Object)(_details),(Object)(RemoteObject.createImmutable("trackId")))));Debug.locals.put("itemId", _itemid);Debug.locals.put("itemId", _itemid);
 BA.debugLineNum = 242;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 243;BA.debugLine="If itemId <> \"\" Then Return \"рекламу \" & itemId";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_itemid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.concat(RemoteObject.createImmutable("рекламу "),_itemid);};
 BA.debugLineNum = 244;BA.debugLine="Return \"рекламу\"";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("рекламу");
 };
 BA.debugLineNum = 246;BA.debugLine="If itemId <> \"\" Then Return \"трек \" & itemId";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_itemid,BA.ObjectToString(""))) { 
if (true) return RemoteObject.concat(RemoteObject.createImmutable("трек "),_itemid);};
 BA.debugLineNum = 247;BA.debugLine="Return \"трек\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("трек");
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}