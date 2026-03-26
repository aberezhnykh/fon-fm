package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbacktraceformatter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbacktraceformatter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbacktraceformatter.class).invoke(this, new Object[] {null});
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
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.playbacktraceformatter __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=54919168;
 //BA.debugLineNum = 54919168;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=54919169;
 //BA.debugLineNum = 54919169;BA.debugLine="End Sub";
return "";
}
public String  _addcountpart(b4j.example.playbacktraceformatter __ref,anywheresoftware.b4a.objects.collections.List _parts,String _details,String _key,String _label) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "addcountpart", false))
	 {return ((String) Debug.delegate(ba, "addcountpart", new Object[] {_parts,_details,_key,_label}));}
String _value = "";
RDebugUtils.currentLine=55443456;
 //BA.debugLineNum = 55443456;BA.debugLine="Private Sub AddCountPart(parts As List, details As";
RDebugUtils.currentLine=55443457;
 //BA.debugLineNum = 55443457;BA.debugLine="Dim value As String = ExtractDetailValue(details,";
_value = __ref._extractdetailvalue /*String*/ (null,_details,_key);
RDebugUtils.currentLine=55443458;
 //BA.debugLineNum = 55443458;BA.debugLine="If value = \"\" Then Return";
if ((_value).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=55443459;
 //BA.debugLineNum = 55443459;BA.debugLine="parts.Add(label & \" \" & value)";
_parts.Add((Object)(_label+" "+_value));
RDebugUtils.currentLine=55443460;
 //BA.debugLineNum = 55443460;BA.debugLine="End Sub";
return "";
}
public String  _extractdetailvalue(b4j.example.playbacktraceformatter __ref,String _details,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "extractdetailvalue", false))
	 {return ((String) Debug.delegate(ba, "extractdetailvalue", new Object[] {_details,_key}));}
String _marker = "";
int _startindex = 0;
String _value = "";
int _nextspace = 0;
RDebugUtils.currentLine=55640064;
 //BA.debugLineNum = 55640064;BA.debugLine="Private Sub ExtractDetailValue(details As String,";
RDebugUtils.currentLine=55640065;
 //BA.debugLineNum = 55640065;BA.debugLine="Dim marker As String = key & \"=\"";
_marker = _key+"=";
RDebugUtils.currentLine=55640066;
 //BA.debugLineNum = 55640066;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
_startindex = _details.indexOf(_marker);
RDebugUtils.currentLine=55640067;
 //BA.debugLineNum = 55640067;BA.debugLine="If startIndex < 0 Then Return \"\"";
if (_startindex<0) { 
if (true) return "";};
RDebugUtils.currentLine=55640068;
 //BA.debugLineNum = 55640068;BA.debugLine="Dim value As String = details.SubString(startInde";
_value = _details.substring((int) (_startindex+_marker.length())).trim();
RDebugUtils.currentLine=55640069;
 //BA.debugLineNum = 55640069;BA.debugLine="Dim nextSpace As Int = value.IndexOf(\" \")";
_nextspace = _value.indexOf(" ");
RDebugUtils.currentLine=55640070;
 //BA.debugLineNum = 55640070;BA.debugLine="If nextSpace >= 0 Then value = value.SubString2(0";
if (_nextspace>=0) { 
_value = _value.substring((int) (0),_nextspace);};
RDebugUtils.currentLine=55640071;
 //BA.debugLineNum = 55640071;BA.debugLine="Return value.Trim";
if (true) return _value.trim();
RDebugUtils.currentLine=55640072;
 //BA.debugLineNum = 55640072;BA.debugLine="End Sub";
return "";
}
public String  _buildaudiosettingstext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildaudiosettingstext", false))
	 {return ((String) Debug.delegate(ba, "buildaudiosettingstext", new Object[] {_details}));}
String _volumetext = "";
String _gaintext = "";
String _gainstate = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=55181312;
 //BA.debugLineNum = 55181312;BA.debugLine="Private Sub BuildAudioSettingsText(details As Stri";
RDebugUtils.currentLine=55181313;
 //BA.debugLineNum = 55181313;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
_volumetext = __ref._extractdetailvalue /*String*/ (null,_details,"volume");
RDebugUtils.currentLine=55181314;
 //BA.debugLineNum = 55181314;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
_gaintext = __ref._extractdetailvalue /*String*/ (null,_details,"gainDb");
RDebugUtils.currentLine=55181315;
 //BA.debugLineNum = 55181315;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
_gainstate = __ref._extractdetailvalue /*String*/ (null,_details,"gainApplied");
RDebugUtils.currentLine=55181316;
 //BA.debugLineNum = 55181316;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55181317;
 //BA.debugLineNum = 55181317;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=55181318;
 //BA.debugLineNum = 55181318;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость \" &";
if ((_volumetext).equals("") == false) { 
_parts.Add((Object)("громкость "+_volumetext));};
RDebugUtils.currentLine=55181319;
 //BA.debugLineNum = 55181319;BA.debugLine="If gainText <> \"\" Then";
if ((_gaintext).equals("") == false) { 
RDebugUtils.currentLine=55181320;
 //BA.debugLineNum = 55181320;BA.debugLine="If gainState = \"yes\" Then";
if ((_gainstate).equals("yes")) { 
RDebugUtils.currentLine=55181321;
 //BA.debugLineNum = 55181321;BA.debugLine="parts.Add(\"gain \" & gainText & \" дБ\")";
_parts.Add((Object)("gain "+_gaintext+" дБ"));
 }else {
RDebugUtils.currentLine=55181323;
 //BA.debugLineNum = 55181323;BA.debugLine="parts.Add(\"gain по умолчанию \" & gainText & \" д";
_parts.Add((Object)("gain по умолчанию "+_gaintext+" дБ"));
 };
 };
RDebugUtils.currentLine=55181326;
 //BA.debugLineNum = 55181326;BA.debugLine="If parts.Size = 0 Then Return \"\"";
if (_parts.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=55181327;
 //BA.debugLineNum = 55181327;BA.debugLine="Return \". \" & JoinWords(parts)";
if (true) return ". "+__ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=55181328;
 //BA.debugLineNum = 55181328;BA.debugLine="End Sub";
return "";
}
public String  _joinwords(b4j.example.playbacktraceformatter __ref,anywheresoftware.b4a.objects.collections.List _parts) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "joinwords", false))
	 {return ((String) Debug.delegate(ba, "joinwords", new Object[] {_parts}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=55508992;
 //BA.debugLineNum = 55508992;BA.debugLine="Private Sub JoinWords(parts As List) As String";
RDebugUtils.currentLine=55508993;
 //BA.debugLineNum = 55508993;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=55508994;
 //BA.debugLineNum = 55508994;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=55508995;
 //BA.debugLineNum = 55508995;BA.debugLine="For i = 0 To parts.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_parts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=55508996;
 //BA.debugLineNum = 55508996;BA.debugLine="If i > 0 Then sb.Append(\". \")";
if (_i>0) { 
_sb.Append(". ");};
RDebugUtils.currentLine=55508997;
 //BA.debugLineNum = 55508997;BA.debugLine="sb.Append(parts.Get(i))";
_sb.Append(BA.ObjectToString(_parts.Get(_i)));
 }
};
RDebugUtils.currentLine=55508999;
 //BA.debugLineNum = 55508999;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=55509000;
 //BA.debugLineNum = 55509000;BA.debugLine="End Sub";
return "";
}
public String  _buildcountstext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildcountstext", false))
	 {return ((String) Debug.delegate(ba, "buildcountstext", new Object[] {_details}));}
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=55377920;
 //BA.debugLineNum = 55377920;BA.debugLine="Private Sub BuildCountsText(details As String) As";
RDebugUtils.currentLine=55377921;
 //BA.debugLineNum = 55377921;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55377922;
 //BA.debugLineNum = 55377922;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=55377923;
 //BA.debugLineNum = 55377923;BA.debugLine="AddCountPart(parts, details, \"downloaded\", \"загру";
__ref._addcountpart /*String*/ (null,_parts,_details,"downloaded","загружено");
RDebugUtils.currentLine=55377924;
 //BA.debugLineNum = 55377924;BA.debugLine="AddCountPart(parts, details, \"updated\", \"обновлен";
__ref._addcountpart /*String*/ (null,_parts,_details,"updated","обновлено");
RDebugUtils.currentLine=55377925;
 //BA.debugLineNum = 55377925;BA.debugLine="AddCountPart(parts, details, \"failed\", \"ошибок\")";
__ref._addcountpart /*String*/ (null,_parts,_details,"failed","ошибок");
RDebugUtils.currentLine=55377926;
 //BA.debugLineNum = 55377926;BA.debugLine="AddCountPart(parts, details, \"removed\", \"удалено\"";
__ref._addcountpart /*String*/ (null,_parts,_details,"removed","удалено");
RDebugUtils.currentLine=55377927;
 //BA.debugLineNum = 55377927;BA.debugLine="AddCountPart(parts, details, \"actual\", \"осталось\"";
__ref._addcountpart /*String*/ (null,_parts,_details,"actual","осталось");
RDebugUtils.currentLine=55377928;
 //BA.debugLineNum = 55377928;BA.debugLine="AddCountPart(parts, details, \"added\", \"добавлено\"";
__ref._addcountpart /*String*/ (null,_parts,_details,"added","добавлено");
RDebugUtils.currentLine=55377929;
 //BA.debugLineNum = 55377929;BA.debugLine="AddCountPart(parts, details, \"tempDeleted\", \"врем";
__ref._addcountpart /*String*/ (null,_parts,_details,"tempDeleted","временных удалено");
RDebugUtils.currentLine=55377930;
 //BA.debugLineNum = 55377930;BA.debugLine="AddCountPart(parts, details, \"ads\", \"рекламы\")";
__ref._addcountpart /*String*/ (null,_parts,_details,"ads","рекламы");
RDebugUtils.currentLine=55377931;
 //BA.debugLineNum = 55377931;BA.debugLine="AddCountPart(parts, details, \"tracks\", \"треков\")";
__ref._addcountpart /*String*/ (null,_parts,_details,"tracks","треков");
RDebugUtils.currentLine=55377932;
 //BA.debugLineNum = 55377932;BA.debugLine="If parts.Size = 0 Then Return BuildReasonText(det";
if (_parts.getSize()==0) { 
if (true) return __ref._buildreasontext /*String*/ (null,_details);};
RDebugUtils.currentLine=55377933;
 //BA.debugLineNum = 55377933;BA.debugLine="Return JoinWords(parts)";
if (true) return __ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=55377934;
 //BA.debugLineNum = 55377934;BA.debugLine="End Sub";
return "";
}
public String  _buildreasontext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildreasontext", false))
	 {return ((String) Debug.delegate(ba, "buildreasontext", new Object[] {_details}));}
String _messagetext = "";
String _reasontext = "";
String _kindtext = "";
String _steptext = "";
String _resulttext = "";
RDebugUtils.currentLine=55312384;
 //BA.debugLineNum = 55312384;BA.debugLine="Private Sub BuildReasonText(details As String) As";
RDebugUtils.currentLine=55312385;
 //BA.debugLineNum = 55312385;BA.debugLine="If details = \"\" Then Return \"\"";
if ((_details).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=55312386;
 //BA.debugLineNum = 55312386;BA.debugLine="Dim messageText As String = ExtractDetailTail(det";
_messagetext = __ref._extractdetailtail /*String*/ (null,_details,"message");
RDebugUtils.currentLine=55312387;
 //BA.debugLineNum = 55312387;BA.debugLine="If messageText <> \"\" Then Return messageText";
if ((_messagetext).equals("") == false) { 
if (true) return _messagetext;};
RDebugUtils.currentLine=55312388;
 //BA.debugLineNum = 55312388;BA.debugLine="Dim reasonText As String = ExtractDetailTail(deta";
_reasontext = __ref._extractdetailtail /*String*/ (null,_details,"reason");
RDebugUtils.currentLine=55312389;
 //BA.debugLineNum = 55312389;BA.debugLine="If reasonText <> \"\" Then Return \"Причина: \" & rea";
if ((_reasontext).equals("") == false) { 
if (true) return "Причина: "+_reasontext;};
RDebugUtils.currentLine=55312390;
 //BA.debugLineNum = 55312390;BA.debugLine="Dim kindText As String = ExtractDetailValue(detai";
_kindtext = __ref._extractdetailvalue /*String*/ (null,_details,"kind");
RDebugUtils.currentLine=55312391;
 //BA.debugLineNum = 55312391;BA.debugLine="If kindText <> \"\" Then Return \"Причина: \" & kindT";
if ((_kindtext).equals("") == false) { 
if (true) return "Причина: "+_kindtext;};
RDebugUtils.currentLine=55312392;
 //BA.debugLineNum = 55312392;BA.debugLine="Dim stepText As String = ExtractDetailValue(detai";
_steptext = __ref._extractdetailvalue /*String*/ (null,_details,"step");
RDebugUtils.currentLine=55312393;
 //BA.debugLineNum = 55312393;BA.debugLine="If stepText <> \"\" Then Return \"Шаг: \" & stepText";
if ((_steptext).equals("") == false) { 
if (true) return "Шаг: "+_steptext;};
RDebugUtils.currentLine=55312394;
 //BA.debugLineNum = 55312394;BA.debugLine="Dim resultText As String = ExtractDetailValue(det";
_resulttext = __ref._extractdetailvalue /*String*/ (null,_details,"result");
RDebugUtils.currentLine=55312395;
 //BA.debugLineNum = 55312395;BA.debugLine="If resultText <> \"\" Then Return \"Результат: \" & r";
if ((_resulttext).equals("") == false) { 
if (true) return "Результат: "+_resulttext;};
RDebugUtils.currentLine=55312396;
 //BA.debugLineNum = 55312396;BA.debugLine="Return details";
if (true) return _details;
RDebugUtils.currentLine=55312397;
 //BA.debugLineNum = 55312397;BA.debugLine="End Sub";
return "";
}
public String  _buildhealthaudiosettingstext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildhealthaudiosettingstext", false))
	 {return ((String) Debug.delegate(ba, "buildhealthaudiosettingstext", new Object[] {_details}));}
String _volumetext = "";
String _gaintext = "";
String _gainstate = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=55246848;
 //BA.debugLineNum = 55246848;BA.debugLine="Private Sub BuildHealthAudioSettingsText(details A";
RDebugUtils.currentLine=55246849;
 //BA.debugLineNum = 55246849;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
_volumetext = __ref._extractdetailvalue /*String*/ (null,_details,"volume");
RDebugUtils.currentLine=55246850;
 //BA.debugLineNum = 55246850;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
_gaintext = __ref._extractdetailvalue /*String*/ (null,_details,"gainDb");
RDebugUtils.currentLine=55246851;
 //BA.debugLineNum = 55246851;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
_gainstate = __ref._extractdetailvalue /*String*/ (null,_details,"gainApplied");
RDebugUtils.currentLine=55246852;
 //BA.debugLineNum = 55246852;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55246853;
 //BA.debugLineNum = 55246853;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=55246854;
 //BA.debugLineNum = 55246854;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость=\" &";
if ((_volumetext).equals("") == false) { 
_parts.Add((Object)("громкость="+_volumetext));};
RDebugUtils.currentLine=55246855;
 //BA.debugLineNum = 55246855;BA.debugLine="If gainText <> \"\" Then";
if ((_gaintext).equals("") == false) { 
RDebugUtils.currentLine=55246856;
 //BA.debugLineNum = 55246856;BA.debugLine="If gainState = \"yes\" Then";
if ((_gainstate).equals("yes")) { 
RDebugUtils.currentLine=55246857;
 //BA.debugLineNum = 55246857;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ\")";
_parts.Add((Object)("gain="+_gaintext+" дБ"));
 }else {
RDebugUtils.currentLine=55246859;
 //BA.debugLineNum = 55246859;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ по умолчани";
_parts.Add((Object)("gain="+_gaintext+" дБ по умолчанию"));
 };
 };
RDebugUtils.currentLine=55246862;
 //BA.debugLineNum = 55246862;BA.debugLine="If parts.Size = 0 Then Return \"\"";
if (_parts.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=55246863;
 //BA.debugLineNum = 55246863;BA.debugLine="Return \", \" & JoinWords(parts)";
if (true) return ", "+__ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=55246864;
 //BA.debugLineNum = 55246864;BA.debugLine="End Sub";
return "";
}
public String  _buildhumantracemessage(b4j.example.playbacktraceformatter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildhumantracemessage", false))
	 {return ((String) Debug.delegate(ba, "buildhumantracemessage", new Object[] {_category,_message,_details}));}
String _delaysec = "";
String _playertext = "";
String _itemlabel = "";
String _audiosettingstext = "";
String _skipreason = "";
String _sourcetext = "";
String _generictext = "";
RDebugUtils.currentLine=54984704;
 //BA.debugLineNum = 54984704;BA.debugLine="Public Sub BuildHumanTraceMessage(category As Stri";
RDebugUtils.currentLine=54984705;
 //BA.debugLineNum = 54984705;BA.debugLine="Select category";
switch (BA.switchObjectToInt(_category,"app","network","audio","playback","player","cache","history","health","system")) {
case 0: {
RDebugUtils.currentLine=54984707;
 //BA.debugLineNum = 54984707;BA.debugLine="If message = \"запуск\" Then";
if ((_message).equals("запуск")) { 
RDebugUtils.currentLine=54984708;
 //BA.debugLineNum = 54984708;BA.debugLine="Return \"Приложение запущено. \" & BuildVersionP";
if (true) return "Приложение запущено. "+__ref._buildversionplayertext /*String*/ (null,_details);
 };
 break; }
case 1: {
RDebugUtils.currentLine=54984711;
 //BA.debugLineNum = 54984711;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"запрос данных","data загружены","data ошибка","data сообщение","data некорректны","переход в retry","data timeout","метаданные плейлистов обновлены","ошибка метаданных плейлиста","ошибка очереди","media path восстановлен","деградация media path")) {
case 0: {
RDebugUtils.currentLine=54984713;
 //BA.debugLineNum = 54984713;BA.debugLine="Return \"Запрос данных\"";
if (true) return "Запрос данных";
 break; }
case 1: {
RDebugUtils.currentLine=54984715;
 //BA.debugLineNum = 54984715;BA.debugLine="Return \"Данные получены.\"";
if (true) return "Данные получены.";
 break; }
case 2: {
RDebugUtils.currentLine=54984717;
 //BA.debugLineNum = 54984717;BA.debugLine="Return \"Ошибка запроса данных. \" & BuildReaso";
if (true) return "Ошибка запроса данных. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 3: {
RDebugUtils.currentLine=54984719;
 //BA.debugLineNum = 54984719;BA.debugLine="Return \"Сервер вернул сообщение. \" & BuildRea";
if (true) return "Сервер вернул сообщение. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=54984721;
 //BA.debugLineNum = 54984721;BA.debugLine="Return \"Ошибка данных от сервера. \" & BuildRe";
if (true) return "Ошибка данных от сервера. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=54984723;
 //BA.debugLineNum = 54984723;BA.debugLine="Dim delaySec As String = ExtractDetailValue(d";
_delaysec = __ref._extractdetailvalue /*String*/ (null,_details,"delaySec");
RDebugUtils.currentLine=54984724;
 //BA.debugLineNum = 54984724;BA.debugLine="If delaySec = \"\" Then delaySec = ExtractDetai";
if ((_delaysec).equals("")) { 
_delaysec = __ref._extractdetailvalue /*String*/ (null,_details,"delay");};
RDebugUtils.currentLine=54984725;
 //BA.debugLineNum = 54984725;BA.debugLine="If delaySec <> \"\" Then Return \"Повторный запр";
if ((_delaysec).equals("") == false) { 
if (true) return "Повторный запрос данных через "+_delaysec+" секунд";};
RDebugUtils.currentLine=54984726;
 //BA.debugLineNum = 54984726;BA.debugLine="Return \"Повторный запрос данных позже\"";
if (true) return "Повторный запрос данных позже";
 break; }
case 6: {
RDebugUtils.currentLine=54984728;
 //BA.debugLineNum = 54984728;BA.debugLine="Return \"Сервер не ответил вовремя. \" & BuildR";
if (true) return "Сервер не ответил вовремя. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 7: {
RDebugUtils.currentLine=54984730;
 //BA.debugLineNum = 54984730;BA.debugLine="Return \"Метаданные плейлистов обновлены. \" &";
if (true) return "Метаданные плейлистов обновлены. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 8: {
RDebugUtils.currentLine=54984732;
 //BA.debugLineNum = 54984732;BA.debugLine="Return \"Не удалось загрузить метаданные плейл";
if (true) return "Не удалось загрузить метаданные плейлиста. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 9: {
RDebugUtils.currentLine=54984734;
 //BA.debugLineNum = 54984734;BA.debugLine="Return \"Не удалось получить очередь. \" & Buil";
if (true) return "Не удалось получить очередь. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 10: {
RDebugUtils.currentLine=54984736;
 //BA.debugLineNum = 54984736;BA.debugLine="Return \"Доступ к медиа восстановлен.\"";
if (true) return "Доступ к медиа восстановлен.";
 break; }
case 11: {
RDebugUtils.currentLine=54984738;
 //BA.debugLineNum = 54984738;BA.debugLine="Return \"Доступ к медиа ухудшился.\"";
if (true) return "Доступ к медиа ухудшился.";
 break; }
}
;
 break; }
case 2: {
RDebugUtils.currentLine=54984741;
 //BA.debugLineNum = 54984741;BA.debugLine="Dim playerText As String = \"Плеер \" & ExtractDe";
_playertext = "Плеер "+__ref._extractdetailvalue /*String*/ (null,_details,"player");
RDebugUtils.currentLine=54984742;
 //BA.debugLineNum = 54984742;BA.debugLine="Dim itemLabel As String = TraceItemLabelFromDet";
_itemlabel = __ref._traceitemlabelfromdetails /*String*/ (null,_details);
RDebugUtils.currentLine=54984743;
 //BA.debugLineNum = 54984743;BA.debugLine="Dim audioSettingsText As String = BuildAudioSet";
_audiosettingstext = __ref._buildaudiosettingstext /*String*/ (null,_details);
RDebugUtils.currentLine=54984744;
 //BA.debugLineNum = 54984744;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"плеер load","плеер ready","плеер play","плеер complete","плеер error","не удалось запустить трек","таймаут старта трека","таймаут preload")) {
case 0: {
RDebugUtils.currentLine=54984746;
 //BA.debugLineNum = 54984746;BA.debugLine="Return playerText & \": Загружен \" & itemLabel";
if (true) return _playertext+": Загружен "+_itemlabel+_audiosettingstext;
 break; }
case 1: {
RDebugUtils.currentLine=54984748;
 //BA.debugLineNum = 54984748;BA.debugLine="If ExtractDetailValue(details, \"mode\") = \"pre";
if ((__ref._extractdetailvalue /*String*/ (null,_details,"mode")).equals("prepare")) { 
RDebugUtils.currentLine=54984749;
 //BA.debugLineNum = 54984749;BA.debugLine="Return playerText & \": Подготовлен \" & itemL";
if (true) return _playertext+": Подготовлен "+_itemlabel+_audiosettingstext;
 };
RDebugUtils.currentLine=54984751;
 //BA.debugLineNum = 54984751;BA.debugLine="Return playerText & \": Готов к воспроизведени";
if (true) return _playertext+": Готов к воспроизведению "+_itemlabel+_audiosettingstext;
 break; }
case 2: {
RDebugUtils.currentLine=54984753;
 //BA.debugLineNum = 54984753;BA.debugLine="Return playerText & \": Воспроизведение \" & it";
if (true) return _playertext+": Воспроизведение "+_itemlabel+_audiosettingstext;
 break; }
case 3: {
RDebugUtils.currentLine=54984755;
 //BA.debugLineNum = 54984755;BA.debugLine="Return playerText & \": Закончил \" & itemLabel";
if (true) return _playertext+": Закончил "+_itemlabel;
 break; }
case 4: {
RDebugUtils.currentLine=54984757;
 //BA.debugLineNum = 54984757;BA.debugLine="Return playerText & \": Ошибка \" & itemLabel &";
if (true) return _playertext+": Ошибка "+_itemlabel+". "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=54984759;
 //BA.debugLineNum = 54984759;BA.debugLine="Return playerText & \": Не удалось запустить \"";
if (true) return _playertext+": Не удалось запустить "+_itemlabel+". "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 6: {
RDebugUtils.currentLine=54984761;
 //BA.debugLineNum = 54984761;BA.debugLine="Return playerText & \": Не дождались старта \"";
if (true) return _playertext+": Не дождались старта "+_itemlabel;
 break; }
case 7: {
RDebugUtils.currentLine=54984763;
 //BA.debugLineNum = 54984763;BA.debugLine="Return playerText & \": Не дождались подготовк";
if (true) return _playertext+": Не дождались подготовки "+_itemlabel;
 break; }
}
;
 break; }
case 3: {
RDebugUtils.currentLine=54984766;
 //BA.debugLineNum = 54984766;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"первый трек выбран из кэша","populate queue start","populate queue done","populate queue fail","dispatch next","dispatch break","dispatch prepared","dispatch переход","prefetch start","prefetch done","prefetch fail","prefetch skip","crossfade trigger","старт трека","смена трека","watchdog stall","watchdog recovery","break переход начало","break переход итог","break переход fade","break переход пропущен","вставлен break","вставлена реклама","очередь пуста","audio complete пропущен")) {
case 0: {
RDebugUtils.currentLine=54984768;
 //BA.debugLineNum = 54984768;BA.debugLine="Return \"Первый трек выбран из кэша.\"";
if (true) return "Первый трек выбран из кэша.";
 break; }
case 1: {
RDebugUtils.currentLine=54984770;
 //BA.debugLineNum = 54984770;BA.debugLine="Return \"Подготовка очереди.\"";
if (true) return "Подготовка очереди.";
 break; }
case 2: {
RDebugUtils.currentLine=54984772;
 //BA.debugLineNum = 54984772;BA.debugLine="Return \"Очередь подготовлена. Элементов: \" &";
if (true) return "Очередь подготовлена. Элементов: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"queue"),"0");
 break; }
case 3: {
RDebugUtils.currentLine=54984774;
 //BA.debugLineNum = 54984774;BA.debugLine="Return \"Не удалось подготовить очередь. \" & B";
if (true) return "Не удалось подготовить очередь. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=54984776;
 //BA.debugLineNum = 54984776;BA.debugLine="Return \"Следующий элемент: \" & TraceItemLabel";
if (true) return "Следующий элемент: "+__ref._traceitemlabelfromdetails /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=54984778;
 //BA.debugLineNum = 54984778;BA.debugLine="Return \"Начата обработка break.\"";
if (true) return "Начата обработка break.";
 break; }
case 6: {
RDebugUtils.currentLine=54984780;
 //BA.debugLineNum = 54984780;BA.debugLine="Return \"Запущен следующий элемент.\"";
if (true) return "Запущен следующий элемент.";
 break; }
case 7: {
RDebugUtils.currentLine=54984782;
 //BA.debugLineNum = 54984782;BA.debugLine="Return \"Переход к следующему элементу.\"";
if (true) return "Переход к следующему элементу.";
 break; }
case 8: {
RDebugUtils.currentLine=54984784;
 //BA.debugLineNum = 54984784;BA.debugLine="Return \"Подготовка следующего элемента.\"";
if (true) return "Подготовка следующего элемента.";
 break; }
case 9: {
RDebugUtils.currentLine=54984786;
 //BA.debugLineNum = 54984786;BA.debugLine="Return \"Следующий элемент подготовлен.\"";
if (true) return "Следующий элемент подготовлен.";
 break; }
case 10: {
RDebugUtils.currentLine=54984788;
 //BA.debugLineNum = 54984788;BA.debugLine="Return \"Не удалось подготовить следующий элем";
if (true) return "Не удалось подготовить следующий элемент. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 11: {
RDebugUtils.currentLine=54984790;
 //BA.debugLineNum = 54984790;BA.debugLine="Dim skipReason As String = ExtractDetailValue";
_skipreason = __ref._extractdetailvalue /*String*/ (null,_details,"reason");
RDebugUtils.currentLine=54984791;
 //BA.debugLineNum = 54984791;BA.debugLine="If skipReason = \"break_ahead\" Then Return \"Пр";
if ((_skipreason).equals("break_ahead")) { 
if (true) return "Предварительная подготовка отложена: впереди break.";};
RDebugUtils.currentLine=54984792;
 //BA.debugLineNum = 54984792;BA.debugLine="Return \"Предварительная подготовка пропущена.";
if (true) return "Предварительная подготовка пропущена. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 12: {
RDebugUtils.currentLine=54984794;
 //BA.debugLineNum = 54984794;BA.debugLine="Return \"Начат кроссфейд на следующий трек.\"";
if (true) return "Начат кроссфейд на следующий трек.";
 break; }
case 13: {
RDebugUtils.currentLine=54984796;
 //BA.debugLineNum = 54984796;BA.debugLine="Dim sourceText As String = ExtractDetailValue";
_sourcetext = __ref._extractdetailvalue /*String*/ (null,_details,"source");
RDebugUtils.currentLine=54984797;
 //BA.debugLineNum = 54984797;BA.debugLine="If sourceText <> \"\" Then";
if ((_sourcetext).equals("") == false) { 
RDebugUtils.currentLine=54984798;
 //BA.debugLineNum = 54984798;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(d";
if (true) return "Старт трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId")+". Источник: "+_sourcetext;
 };
RDebugUtils.currentLine=54984800;
 //BA.debugLineNum = 54984800;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(de";
if (true) return "Старт трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId");
 break; }
case 14: {
RDebugUtils.currentLine=54984802;
 //BA.debugLineNum = 54984802;BA.debugLine="Return \"Переход после трека \" & ExtractDetail";
if (true) return "Переход после трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId");
 break; }
case 15: {
RDebugUtils.currentLine=54984804;
 //BA.debugLineNum = 54984804;BA.debugLine="Return \"Воспроизведение зависло на треке \" &";
if (true) return "Воспроизведение зависло на треке "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"trackId"),"без идентификатора")+". Запускаю восстановление.";
 break; }
case 16: {
RDebugUtils.currentLine=54984806;
 //BA.debugLineNum = 54984806;BA.debugLine="Return \"Восстановление воспроизведения. \" & B";
if (true) return "Восстановление воспроизведения. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 17: {
RDebugUtils.currentLine=54984808;
 //BA.debugLineNum = 54984808;BA.debugLine="Return \"Начат переход на break.\"";
if (true) return "Начат переход на break.";
 break; }
case 18: {
RDebugUtils.currentLine=54984810;
 //BA.debugLineNum = 54984810;BA.debugLine="Return \"Переход на break завершен. \" & BuildR";
if (true) return "Переход на break завершен. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 19: {
RDebugUtils.currentLine=54984812;
 //BA.debugLineNum = 54984812;BA.debugLine="Return \"Плавное завершение текущего элемента.";
if (true) return "Плавное завершение текущего элемента.";
 break; }
case 20: {
RDebugUtils.currentLine=54984814;
 //BA.debugLineNum = 54984814;BA.debugLine="Return \"Переход на break пропущен. \" & BuildR";
if (true) return "Переход на break пропущен. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 21: {
RDebugUtils.currentLine=54984816;
 //BA.debugLineNum = 54984816;BA.debugLine="Return \"В очередь вставлен break.\"";
if (true) return "В очередь вставлен break.";
 break; }
case 22: {
RDebugUtils.currentLine=54984818;
 //BA.debugLineNum = 54984818;BA.debugLine="Return \"Подготовлен переход на рекламу.\"";
if (true) return "Подготовлен переход на рекламу.";
 break; }
case 23: {
RDebugUtils.currentLine=54984820;
 //BA.debugLineNum = 54984820;BA.debugLine="Return \"Очередь пуста. \" & BuildReasonText(de";
if (true) return "Очередь пуста. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 24: {
RDebugUtils.currentLine=54984822;
 //BA.debugLineNum = 54984822;BA.debugLine="Return \"Событие завершения проигнорировано. \"";
if (true) return "Событие завершения проигнорировано. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
}
;
 break; }
case 4: {
RDebugUtils.currentLine=54984825;
 //BA.debugLineNum = 54984825;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"старт завершен","старт не завершен","автостарт воспроизведение начало","воспроизведение остановлено","плеер заблокирован")) {
case 0: {
RDebugUtils.currentLine=54984827;
 //BA.debugLineNum = 54984827;BA.debugLine="Return \"Старт плеера завершен.\"";
if (true) return "Старт плеера завершен.";
 break; }
case 1: {
RDebugUtils.currentLine=54984829;
 //BA.debugLineNum = 54984829;BA.debugLine="Return \"Старт плеера не завершен. \" & BuildRe";
if (true) return "Старт плеера не завершен. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 2: {
RDebugUtils.currentLine=54984831;
 //BA.debugLineNum = 54984831;BA.debugLine="Return \"Автостарт воспроизведения.\"";
if (true) return "Автостарт воспроизведения.";
 break; }
case 3: {
RDebugUtils.currentLine=54984833;
 //BA.debugLineNum = 54984833;BA.debugLine="Return \"Воспроизведение остановлено. \" & Buil";
if (true) return "Воспроизведение остановлено. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=54984835;
 //BA.debugLineNum = 54984835;BA.debugLine="Return \"Плеер заблокирован.\"";
if (true) return "Плеер заблокирован.";
 break; }
}
;
 break; }
case 5: {
RDebugUtils.currentLine=54984838;
 //BA.debugLineNum = 54984838;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"трек загружен в кэш","ошибка загрузки трека","кэш треков обновлен","кэш рекламы обновлен","аудит кэша","очистка кэша","реклама удалена из кэша","ошибка подготовки трека","нет локального файла")) {
case 0: {
RDebugUtils.currentLine=54984840;
 //BA.debugLineNum = 54984840;BA.debugLine="Return \"Кэш: Загружен трек \" & DefaultIfEmpty";
if (true) return "Кэш: Загружен трек "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"id"),"без идентификатора");
 break; }
case 1: {
RDebugUtils.currentLine=54984842;
 //BA.debugLineNum = 54984842;BA.debugLine="Return \"Кэш: Не удалось загрузить трек. \" & B";
if (true) return "Кэш: Не удалось загрузить трек. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 2: {
RDebugUtils.currentLine=54984844;
 //BA.debugLineNum = 54984844;BA.debugLine="Return \"Кэш: Треки проверены. \" & BuildCounts";
if (true) return "Кэш: Треки проверены. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 3: {
RDebugUtils.currentLine=54984846;
 //BA.debugLineNum = 54984846;BA.debugLine="Return \"Кэш: Реклама проверена. \" & BuildCoun";
if (true) return "Кэш: Реклама проверена. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=54984848;
 //BA.debugLineNum = 54984848;BA.debugLine="Return \"Кэш: Проверен. \" & BuildCountsText(de";
if (true) return "Кэш: Проверен. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=54984850;
 //BA.debugLineNum = 54984850;BA.debugLine="Return \"Кэш: Очистка завершена. \" & BuildCoun";
if (true) return "Кэш: Очистка завершена. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 6: {
RDebugUtils.currentLine=54984852;
 //BA.debugLineNum = 54984852;BA.debugLine="Return \"Кэш: Удалена устаревшая реклама \" & E";
if (true) return "Кэш: Удалена устаревшая реклама "+__ref._extractdetailvalue /*String*/ (null,_details,"id");
 break; }
case 7: {
RDebugUtils.currentLine=54984854;
 //BA.debugLineNum = 54984854;BA.debugLine="Return \"Кэш: Ошибка подготовки трека. \" & Bui";
if (true) return "Кэш: Ошибка подготовки трека. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 8: {
RDebugUtils.currentLine=54984856;
 //BA.debugLineNum = 54984856;BA.debugLine="Return \"Кэш: Локальный файл не найден для тре";
if (true) return "Кэш: Локальный файл не найден для трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId");
 break; }
}
;
 break; }
case 6: {
RDebugUtils.currentLine=54984859;
 //BA.debugLineNum = 54984859;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"история отправлена","история не отправлена","ошибка отправки","ошибка истории","не удалось прочитать файл истории")) {
case 0: {
RDebugUtils.currentLine=54984861;
 //BA.debugLineNum = 54984861;BA.debugLine="Return \"История отправлена. Записей: \" & Defa";
if (true) return "История отправлена. Записей: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"records"),"0");
 break; }
case 1: {
RDebugUtils.currentLine=54984863;
 //BA.debugLineNum = 54984863;BA.debugLine="Return \"История не отправлена. Записей: \" & D";
if (true) return "История не отправлена. Записей: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"records"),"0");
 break; }
case 2: {
RDebugUtils.currentLine=54984865;
 //BA.debugLineNum = 54984865;BA.debugLine="Return \"Ошибка отправки истории. \" & BuildRea";
if (true) return "Ошибка отправки истории. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 3: {
RDebugUtils.currentLine=54984867;
 //BA.debugLineNum = 54984867;BA.debugLine="Return \"Ошибка чтения истории.\"";
if (true) return "Ошибка чтения истории.";
 break; }
case 4: {
RDebugUtils.currentLine=54984869;
 //BA.debugLineNum = 54984869;BA.debugLine="Return \"Не удалось прочитать файл истории \" &";
if (true) return "Не удалось прочитать файл истории "+__ref._extractdetailvalue /*String*/ (null,_details,"file");
 break; }
}
;
 break; }
case 7: {
RDebugUtils.currentLine=54984872;
 //BA.debugLineNum = 54984872;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"воспроизведение","кэш","устройство","ресурсы","сеть")) {
case 0: {
RDebugUtils.currentLine=54984874;
 //BA.debugLineNum = 54984874;BA.debugLine="Return \"Воспроизведение: этап=\" & ExtractDeta";
if (true) return "Воспроизведение: этап="+__ref._extractdetailvalue /*String*/ (null,_details,"stage")+", играет="+__ref._extractdetailvalue /*String*/ (null,_details,"playing")+", трек="+__ref._extractdetailvalue /*String*/ (null,_details,"currentTrackId")+", очередь="+__ref._extractdetailvalue /*String*/ (null,_details,"queue")+", запас="+__ref._extractdetailvalue /*String*/ (null,_details,"reserve")+__ref._buildhealthaudiosettingstext /*String*/ (null,_details);
 break; }
case 1: {
RDebugUtils.currentLine=54984881;
 //BA.debugLineNum = 54984881;BA.debugLine="Return \"Кэш: \" & DefaultIfEmpty(ExtractDetail";
if (true) return "Кэш: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"status"),"неизвестно");
 break; }
case 2: {
RDebugUtils.currentLine=54984883;
 //BA.debugLineNum = 54984883;BA.debugLine="Return \"Устройство: \" & ExtractDetailValue(de";
if (true) return "Устройство: "+__ref._extractdetailvalue /*String*/ (null,_details,"device")+", id="+__ref._extractdetailvalue /*String*/ (null,_details,"deviceId")+", ОС="+__ref._extractdetailtail /*String*/ (null,_details,"os");
 break; }
case 3: {
RDebugUtils.currentLine=54984887;
 //BA.debugLineNum = 54984887;BA.debugLine="Return \"Система: RAM=\" & ExtractDetailValue(d";
if (true) return "Система: RAM="+__ref._extractdetailvalue /*String*/ (null,_details,"ramFreeMb")+" МБ"+", диск="+__ref._extractdetailvalue /*String*/ (null,_details,"diskFreeMb")+"/"+__ref._extractdetailvalue /*String*/ (null,_details,"diskTotalMb")+" МБ";
 break; }
case 4: {
RDebugUtils.currentLine=54984890;
 //BA.debugLineNum = 54984890;BA.debugLine="Return \"Сеть: ошибок=\" & ExtractDetailValue(d";
if (true) return "Сеть: ошибок="+__ref._extractdetailvalue /*String*/ (null,_details,"netErrors")+", данные ок "+__ref._extractdetailvalue /*String*/ (null,_details,"lastDataOkAgoSec")+" сек назад"+", история ок "+__ref._extractdetailvalue /*String*/ (null,_details,"lastHistoryOkAgoSec")+" сек назад";
 break; }
}
;
 break; }
case 8: {
RDebugUtils.currentLine=54984895;
 //BA.debugLineNum = 54984895;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"источник","устройство","платформа","память","память доступно","диск","кэш треков","кэш рекламы","история")) {
case 0: {
RDebugUtils.currentLine=54984897;
 //BA.debugLineNum = 54984897;BA.debugLine="Return \"Система: источник=\" & details";
if (true) return "Система: источник="+_details;
 break; }
case 1: {
RDebugUtils.currentLine=54984899;
 //BA.debugLineNum = 54984899;BA.debugLine="Return \"Устройство: \" & ExtractDetailValue(de";
if (true) return "Устройство: "+__ref._extractdetailvalue /*String*/ (null,_details,"name")+", id="+__ref._extractdetailvalue /*String*/ (null,_details,"id");
 break; }
case 2: {
RDebugUtils.currentLine=54984901;
 //BA.debugLineNum = 54984901;BA.debugLine="Return \"Система: \" & ExtractDetailTail(detail";
if (true) return "Система: "+__ref._extractdetailtail /*String*/ (null,_details,"os");
 break; }
case 3: {
RDebugUtils.currentLine=54984903;
 //BA.debugLineNum = 54984903;BA.debugLine="Return \"RAM: свободно \" & ExtractDetailValue(";
if (true) return "RAM: свободно "+__ref._extractdetailvalue /*String*/ (null,_details,"ramFreeMb")+" МБ";
 break; }
case 4: {
RDebugUtils.currentLine=54984905;
 //BA.debugLineNum = 54984905;BA.debugLine="Return \"RAM: приложению \" & ExtractDetailValu";
if (true) return "RAM: приложению "+__ref._extractdetailvalue /*String*/ (null,_details,"ramTotalMb")+" МБ";
 break; }
case 5: {
RDebugUtils.currentLine=54984907;
 //BA.debugLineNum = 54984907;BA.debugLine="Return \"Диск: свободно \" & ExtractDetailValue";
if (true) return "Диск: свободно "+__ref._extractdetailvalue /*String*/ (null,_details,"diskFreeMb")+" МБ из "+__ref._extractdetailvalue /*String*/ (null,_details,"diskTotalMb")+" МБ";
 break; }
case 6: {
RDebugUtils.currentLine=54984909;
 //BA.debugLineNum = 54984909;BA.debugLine="Return \"Кэш: треков=\" & ExtractDetailValue(de";
if (true) return "Кэш: треков="+__ref._extractdetailvalue /*String*/ (null,_details,"trackCount")+", "+__ref._extractdetailvalue /*String*/ (null,_details,"trackMb")+" МБ, индекс="+__ref._extractdetailvalue /*String*/ (null,_details,"trackIndex");
 break; }
case 7: {
RDebugUtils.currentLine=54984911;
 //BA.debugLineNum = 54984911;BA.debugLine="Return \"Кэш: рекламы=\" & ExtractDetailValue(d";
if (true) return "Кэш: рекламы="+__ref._extractdetailvalue /*String*/ (null,_details,"adCount")+", "+__ref._extractdetailvalue /*String*/ (null,_details,"adMb")+" МБ, индекс="+__ref._extractdetailvalue /*String*/ (null,_details,"adIndex");
 break; }
case 8: {
RDebugUtils.currentLine=54984913;
 //BA.debugLineNum = 54984913;BA.debugLine="Return \"История: ожидает отправки \" & Extract";
if (true) return "История: ожидает отправки "+__ref._extractdetailvalue /*String*/ (null,_details,"pendingHistory")+" записей";
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=54984916;
 //BA.debugLineNum = 54984916;BA.debugLine="Dim genericText As String = message";
_generictext = _message;
RDebugUtils.currentLine=54984917;
 //BA.debugLineNum = 54984917;BA.debugLine="If details <> \"\" Then genericText = genericText &";
if ((_details).equals("") == false) { 
_generictext = _generictext+". "+_details;};
RDebugUtils.currentLine=54984918;
 //BA.debugLineNum = 54984918;BA.debugLine="Return genericText";
if (true) return _generictext;
RDebugUtils.currentLine=54984919;
 //BA.debugLineNum = 54984919;BA.debugLine="End Sub";
return "";
}
public String  _buildversionplayertext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildversionplayertext", false))
	 {return ((String) Debug.delegate(ba, "buildversionplayertext", new Object[] {_details}));}
String _versiontext = "";
String _playertext = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=55050240;
 //BA.debugLineNum = 55050240;BA.debugLine="Private Sub BuildVersionPlayerText(details As Stri";
RDebugUtils.currentLine=55050241;
 //BA.debugLineNum = 55050241;BA.debugLine="Dim versionText As String = ExtractDetailValue(de";
_versiontext = __ref._extractdetailvalue /*String*/ (null,_details,"version");
RDebugUtils.currentLine=55050242;
 //BA.debugLineNum = 55050242;BA.debugLine="Dim playerText As String = ExtractDetailValue(det";
_playertext = __ref._extractdetailvalue /*String*/ (null,_details,"player");
RDebugUtils.currentLine=55050243;
 //BA.debugLineNum = 55050243;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55050244;
 //BA.debugLineNum = 55050244;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=55050245;
 //BA.debugLineNum = 55050245;BA.debugLine="If versionText <> \"\" Then parts.Add(\"Версия \" & v";
if ((_versiontext).equals("") == false) { 
_parts.Add((Object)("Версия "+_versiontext));};
RDebugUtils.currentLine=55050246;
 //BA.debugLineNum = 55050246;BA.debugLine="If playerText <> \"\" Then parts.Add(\"Плеер \" & pla";
if ((_playertext).equals("") == false) { 
_parts.Add((Object)("Плеер "+_playertext));};
RDebugUtils.currentLine=55050247;
 //BA.debugLineNum = 55050247;BA.debugLine="If parts.Size = 0 Then Return \"Запуск\"";
if (_parts.getSize()==0) { 
if (true) return "Запуск";};
RDebugUtils.currentLine=55050248;
 //BA.debugLineNum = 55050248;BA.debugLine="Return JoinWords(parts)";
if (true) return __ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=55050249;
 //BA.debugLineNum = 55050249;BA.debugLine="End Sub";
return "";
}
public String  _traceitemlabelfromdetails(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "traceitemlabelfromdetails", false))
	 {return ((String) Debug.delegate(ba, "traceitemlabelfromdetails", new Object[] {_details}));}
String _itemtype = "";
String _itemid = "";
RDebugUtils.currentLine=55115776;
 //BA.debugLineNum = 55115776;BA.debugLine="Private Sub TraceItemLabelFromDetails(details As S";
RDebugUtils.currentLine=55115777;
 //BA.debugLineNum = 55115777;BA.debugLine="Dim itemType As String = ExtractDetailValue(detai";
_itemtype = __ref._extractdetailvalue /*String*/ (null,_details,"type");
RDebugUtils.currentLine=55115778;
 //BA.debugLineNum = 55115778;BA.debugLine="Dim itemId As String = DefaultIfEmpty(ExtractDeta";
_itemid = __ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"id"),__ref._extractdetailvalue /*String*/ (null,_details,"trackId"));
RDebugUtils.currentLine=55115779;
 //BA.debugLineNum = 55115779;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=55115780;
 //BA.debugLineNum = 55115780;BA.debugLine="If itemId <> \"\" Then Return \"рекламу \" & itemId";
if ((_itemid).equals("") == false) { 
if (true) return "рекламу "+_itemid;};
RDebugUtils.currentLine=55115781;
 //BA.debugLineNum = 55115781;BA.debugLine="Return \"рекламу\"";
if (true) return "рекламу";
 };
RDebugUtils.currentLine=55115783;
 //BA.debugLineNum = 55115783;BA.debugLine="If itemId <> \"\" Then Return \"трек \" & itemId";
if ((_itemid).equals("") == false) { 
if (true) return "трек "+_itemid;};
RDebugUtils.currentLine=55115784;
 //BA.debugLineNum = 55115784;BA.debugLine="Return \"трек\"";
if (true) return "трек";
RDebugUtils.currentLine=55115785;
 //BA.debugLineNum = 55115785;BA.debugLine="End Sub";
return "";
}
public String  _defaultifempty(b4j.example.playbacktraceformatter __ref,String _value,String _fallback) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "defaultifempty", false))
	 {return ((String) Debug.delegate(ba, "defaultifempty", new Object[] {_value,_fallback}));}
RDebugUtils.currentLine=55574528;
 //BA.debugLineNum = 55574528;BA.debugLine="Private Sub DefaultIfEmpty(value As String, fallba";
RDebugUtils.currentLine=55574529;
 //BA.debugLineNum = 55574529;BA.debugLine="If value = \"\" Then Return fallback";
if ((_value).equals("")) { 
if (true) return _fallback;};
RDebugUtils.currentLine=55574530;
 //BA.debugLineNum = 55574530;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=55574531;
 //BA.debugLineNum = 55574531;BA.debugLine="End Sub";
return "";
}
public String  _extractdetailtail(b4j.example.playbacktraceformatter __ref,String _details,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "extractdetailtail", false))
	 {return ((String) Debug.delegate(ba, "extractdetailtail", new Object[] {_details,_key}));}
String _marker = "";
int _startindex = 0;
RDebugUtils.currentLine=55705600;
 //BA.debugLineNum = 55705600;BA.debugLine="Private Sub ExtractDetailTail(details As String, k";
RDebugUtils.currentLine=55705601;
 //BA.debugLineNum = 55705601;BA.debugLine="Dim marker As String = key & \"=\"";
_marker = _key+"=";
RDebugUtils.currentLine=55705602;
 //BA.debugLineNum = 55705602;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
_startindex = _details.indexOf(_marker);
RDebugUtils.currentLine=55705603;
 //BA.debugLineNum = 55705603;BA.debugLine="If startIndex < 0 Then Return \"\"";
if (_startindex<0) { 
if (true) return "";};
RDebugUtils.currentLine=55705604;
 //BA.debugLineNum = 55705604;BA.debugLine="Return details.SubString(startIndex + marker.Leng";
if (true) return _details.substring((int) (_startindex+_marker.length())).trim();
RDebugUtils.currentLine=55705605;
 //BA.debugLineNum = 55705605;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbacktraceformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
RDebugUtils.currentLine=54853632;
 //BA.debugLineNum = 54853632;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=54853633;
 //BA.debugLineNum = 54853633;BA.debugLine="End Sub";
return "";
}
}