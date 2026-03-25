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
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.playbacktraceformatter __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="End Sub";
return "";
}
public String  _addcountpart(b4j.example.playbacktraceformatter __ref,anywheresoftware.b4a.objects.collections.List _parts,String _details,String _key,String _label) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "addcountpart", false))
	 {return ((String) Debug.delegate(ba, "addcountpart", new Object[] {_parts,_details,_key,_label}));}
String _value = "";
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Private Sub AddCountPart(parts As List, details As";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="Dim value As String = ExtractDetailValue(details,";
_value = __ref._extractdetailvalue /*String*/ (null,_details,_key);
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="If value = \"\" Then Return";
if ((_value).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="parts.Add(label & \" \" & value)";
_parts.Add((Object)(_label+" "+_value));
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Private Sub ExtractDetailValue(details As String,";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Dim marker As String = key & \"=\"";
_marker = _key+"=";
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
_startindex = _details.indexOf(_marker);
RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="If startIndex < 0 Then Return \"\"";
if (_startindex<0) { 
if (true) return "";};
RDebugUtils.currentLine=29032452;
 //BA.debugLineNum = 29032452;BA.debugLine="Dim value As String = details.SubString(startInde";
_value = _details.substring((int) (_startindex+_marker.length())).trim();
RDebugUtils.currentLine=29032453;
 //BA.debugLineNum = 29032453;BA.debugLine="Dim nextSpace As Int = value.IndexOf(\" \")";
_nextspace = _value.indexOf(" ");
RDebugUtils.currentLine=29032454;
 //BA.debugLineNum = 29032454;BA.debugLine="If nextSpace >= 0 Then value = value.SubString2(0";
if (_nextspace>=0) { 
_value = _value.substring((int) (0),_nextspace);};
RDebugUtils.currentLine=29032455;
 //BA.debugLineNum = 29032455;BA.debugLine="Return value.Trim";
if (true) return _value.trim();
RDebugUtils.currentLine=29032456;
 //BA.debugLineNum = 29032456;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Private Sub BuildAudioSettingsText(details As Stri";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
_volumetext = __ref._extractdetailvalue /*String*/ (null,_details,"volume");
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
_gaintext = __ref._extractdetailvalue /*String*/ (null,_details,"gainDb");
RDebugUtils.currentLine=28573699;
 //BA.debugLineNum = 28573699;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
_gainstate = __ref._extractdetailvalue /*String*/ (null,_details,"gainApplied");
RDebugUtils.currentLine=28573700;
 //BA.debugLineNum = 28573700;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28573701;
 //BA.debugLineNum = 28573701;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=28573702;
 //BA.debugLineNum = 28573702;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость \" &";
if ((_volumetext).equals("") == false) { 
_parts.Add((Object)("громкость "+_volumetext));};
RDebugUtils.currentLine=28573703;
 //BA.debugLineNum = 28573703;BA.debugLine="If gainText <> \"\" Then";
if ((_gaintext).equals("") == false) { 
RDebugUtils.currentLine=28573704;
 //BA.debugLineNum = 28573704;BA.debugLine="If gainState = \"yes\" Then";
if ((_gainstate).equals("yes")) { 
RDebugUtils.currentLine=28573705;
 //BA.debugLineNum = 28573705;BA.debugLine="parts.Add(\"gain \" & gainText & \" дБ\")";
_parts.Add((Object)("gain "+_gaintext+" дБ"));
 }else {
RDebugUtils.currentLine=28573707;
 //BA.debugLineNum = 28573707;BA.debugLine="parts.Add(\"gain по умолчанию \" & gainText & \" д";
_parts.Add((Object)("gain по умолчанию "+_gaintext+" дБ"));
 };
 };
RDebugUtils.currentLine=28573710;
 //BA.debugLineNum = 28573710;BA.debugLine="If parts.Size = 0 Then Return \"\"";
if (_parts.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=28573711;
 //BA.debugLineNum = 28573711;BA.debugLine="Return \". \" & JoinWords(parts)";
if (true) return ". "+__ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=28573712;
 //BA.debugLineNum = 28573712;BA.debugLine="End Sub";
return "";
}
public String  _joinwords(b4j.example.playbacktraceformatter __ref,anywheresoftware.b4a.objects.collections.List _parts) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "joinwords", false))
	 {return ((String) Debug.delegate(ba, "joinwords", new Object[] {_parts}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Private Sub JoinWords(parts As List) As String";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="For i = 0 To parts.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_parts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=28901380;
 //BA.debugLineNum = 28901380;BA.debugLine="If i > 0 Then sb.Append(\". \")";
if (_i>0) { 
_sb.Append(". ");};
RDebugUtils.currentLine=28901381;
 //BA.debugLineNum = 28901381;BA.debugLine="sb.Append(parts.Get(i))";
_sb.Append(BA.ObjectToString(_parts.Get(_i)));
 }
};
RDebugUtils.currentLine=28901383;
 //BA.debugLineNum = 28901383;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=28901384;
 //BA.debugLineNum = 28901384;BA.debugLine="End Sub";
return "";
}
public String  _buildcountstext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildcountstext", false))
	 {return ((String) Debug.delegate(ba, "buildcountstext", new Object[] {_details}));}
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Private Sub BuildCountsText(details As String) As";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="AddCountPart(parts, details, \"downloaded\", \"загру";
__ref._addcountpart /*String*/ (null,_parts,_details,"downloaded","загружено");
RDebugUtils.currentLine=28770308;
 //BA.debugLineNum = 28770308;BA.debugLine="AddCountPart(parts, details, \"updated\", \"обновлен";
__ref._addcountpart /*String*/ (null,_parts,_details,"updated","обновлено");
RDebugUtils.currentLine=28770309;
 //BA.debugLineNum = 28770309;BA.debugLine="AddCountPart(parts, details, \"failed\", \"ошибок\")";
__ref._addcountpart /*String*/ (null,_parts,_details,"failed","ошибок");
RDebugUtils.currentLine=28770310;
 //BA.debugLineNum = 28770310;BA.debugLine="AddCountPart(parts, details, \"removed\", \"удалено\"";
__ref._addcountpart /*String*/ (null,_parts,_details,"removed","удалено");
RDebugUtils.currentLine=28770311;
 //BA.debugLineNum = 28770311;BA.debugLine="AddCountPart(parts, details, \"actual\", \"осталось\"";
__ref._addcountpart /*String*/ (null,_parts,_details,"actual","осталось");
RDebugUtils.currentLine=28770312;
 //BA.debugLineNum = 28770312;BA.debugLine="AddCountPart(parts, details, \"added\", \"добавлено\"";
__ref._addcountpart /*String*/ (null,_parts,_details,"added","добавлено");
RDebugUtils.currentLine=28770313;
 //BA.debugLineNum = 28770313;BA.debugLine="AddCountPart(parts, details, \"tempDeleted\", \"врем";
__ref._addcountpart /*String*/ (null,_parts,_details,"tempDeleted","временных удалено");
RDebugUtils.currentLine=28770314;
 //BA.debugLineNum = 28770314;BA.debugLine="AddCountPart(parts, details, \"ads\", \"рекламы\")";
__ref._addcountpart /*String*/ (null,_parts,_details,"ads","рекламы");
RDebugUtils.currentLine=28770315;
 //BA.debugLineNum = 28770315;BA.debugLine="AddCountPart(parts, details, \"tracks\", \"треков\")";
__ref._addcountpart /*String*/ (null,_parts,_details,"tracks","треков");
RDebugUtils.currentLine=28770316;
 //BA.debugLineNum = 28770316;BA.debugLine="If parts.Size = 0 Then Return BuildReasonText(det";
if (_parts.getSize()==0) { 
if (true) return __ref._buildreasontext /*String*/ (null,_details);};
RDebugUtils.currentLine=28770317;
 //BA.debugLineNum = 28770317;BA.debugLine="Return JoinWords(parts)";
if (true) return __ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=28770318;
 //BA.debugLineNum = 28770318;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Private Sub BuildReasonText(details As String) As";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="If details = \"\" Then Return \"\"";
if ((_details).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="Dim messageText As String = ExtractDetailTail(det";
_messagetext = __ref._extractdetailtail /*String*/ (null,_details,"message");
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="If messageText <> \"\" Then Return messageText";
if ((_messagetext).equals("") == false) { 
if (true) return _messagetext;};
RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="Dim reasonText As String = ExtractDetailTail(deta";
_reasontext = __ref._extractdetailtail /*String*/ (null,_details,"reason");
RDebugUtils.currentLine=28704773;
 //BA.debugLineNum = 28704773;BA.debugLine="If reasonText <> \"\" Then Return \"Причина: \" & rea";
if ((_reasontext).equals("") == false) { 
if (true) return "Причина: "+_reasontext;};
RDebugUtils.currentLine=28704774;
 //BA.debugLineNum = 28704774;BA.debugLine="Dim kindText As String = ExtractDetailValue(detai";
_kindtext = __ref._extractdetailvalue /*String*/ (null,_details,"kind");
RDebugUtils.currentLine=28704775;
 //BA.debugLineNum = 28704775;BA.debugLine="If kindText <> \"\" Then Return \"Причина: \" & kindT";
if ((_kindtext).equals("") == false) { 
if (true) return "Причина: "+_kindtext;};
RDebugUtils.currentLine=28704776;
 //BA.debugLineNum = 28704776;BA.debugLine="Dim stepText As String = ExtractDetailValue(detai";
_steptext = __ref._extractdetailvalue /*String*/ (null,_details,"step");
RDebugUtils.currentLine=28704777;
 //BA.debugLineNum = 28704777;BA.debugLine="If stepText <> \"\" Then Return \"Шаг: \" & stepText";
if ((_steptext).equals("") == false) { 
if (true) return "Шаг: "+_steptext;};
RDebugUtils.currentLine=28704778;
 //BA.debugLineNum = 28704778;BA.debugLine="Dim resultText As String = ExtractDetailValue(det";
_resulttext = __ref._extractdetailvalue /*String*/ (null,_details,"result");
RDebugUtils.currentLine=28704779;
 //BA.debugLineNum = 28704779;BA.debugLine="If resultText <> \"\" Then Return \"Результат: \" & r";
if ((_resulttext).equals("") == false) { 
if (true) return "Результат: "+_resulttext;};
RDebugUtils.currentLine=28704780;
 //BA.debugLineNum = 28704780;BA.debugLine="Return details";
if (true) return _details;
RDebugUtils.currentLine=28704781;
 //BA.debugLineNum = 28704781;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Private Sub BuildHealthAudioSettingsText(details A";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
_volumetext = __ref._extractdetailvalue /*String*/ (null,_details,"volume");
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
_gaintext = __ref._extractdetailvalue /*String*/ (null,_details,"gainDb");
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
_gainstate = __ref._extractdetailvalue /*String*/ (null,_details,"gainApplied");
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28639237;
 //BA.debugLineNum = 28639237;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=28639238;
 //BA.debugLineNum = 28639238;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость=\" &";
if ((_volumetext).equals("") == false) { 
_parts.Add((Object)("громкость="+_volumetext));};
RDebugUtils.currentLine=28639239;
 //BA.debugLineNum = 28639239;BA.debugLine="If gainText <> \"\" Then";
if ((_gaintext).equals("") == false) { 
RDebugUtils.currentLine=28639240;
 //BA.debugLineNum = 28639240;BA.debugLine="If gainState = \"yes\" Then";
if ((_gainstate).equals("yes")) { 
RDebugUtils.currentLine=28639241;
 //BA.debugLineNum = 28639241;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ\")";
_parts.Add((Object)("gain="+_gaintext+" дБ"));
 }else {
RDebugUtils.currentLine=28639243;
 //BA.debugLineNum = 28639243;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ по умолчани";
_parts.Add((Object)("gain="+_gaintext+" дБ по умолчанию"));
 };
 };
RDebugUtils.currentLine=28639246;
 //BA.debugLineNum = 28639246;BA.debugLine="If parts.Size = 0 Then Return \"\"";
if (_parts.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=28639247;
 //BA.debugLineNum = 28639247;BA.debugLine="Return \", \" & JoinWords(parts)";
if (true) return ", "+__ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=28639248;
 //BA.debugLineNum = 28639248;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Public Sub BuildHumanTraceMessage(category As Stri";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Select category";
switch (BA.switchObjectToInt(_category,"app","network","audio","playback","player","cache","history","health","system")) {
case 0: {
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="If message = \"запуск\" Then";
if ((_message).equals("запуск")) { 
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="Return \"Приложение запущено. \" & BuildVersionP";
if (true) return "Приложение запущено. "+__ref._buildversionplayertext /*String*/ (null,_details);
 };
 break; }
case 1: {
RDebugUtils.currentLine=28377095;
 //BA.debugLineNum = 28377095;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"запрос данных","data загружены","data ошибка","data сообщение","data некорректны","переход в retry","data timeout","метаданные плейлистов обновлены","ошибка метаданных плейлиста","ошибка очереди","media path восстановлен","деградация media path")) {
case 0: {
RDebugUtils.currentLine=28377097;
 //BA.debugLineNum = 28377097;BA.debugLine="Return \"Запрос данных\"";
if (true) return "Запрос данных";
 break; }
case 1: {
RDebugUtils.currentLine=28377099;
 //BA.debugLineNum = 28377099;BA.debugLine="Return \"Данные получены.\"";
if (true) return "Данные получены.";
 break; }
case 2: {
RDebugUtils.currentLine=28377101;
 //BA.debugLineNum = 28377101;BA.debugLine="Return \"Ошибка запроса данных. \" & BuildReaso";
if (true) return "Ошибка запроса данных. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 3: {
RDebugUtils.currentLine=28377103;
 //BA.debugLineNum = 28377103;BA.debugLine="Return \"Сервер вернул сообщение. \" & BuildRea";
if (true) return "Сервер вернул сообщение. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=28377105;
 //BA.debugLineNum = 28377105;BA.debugLine="Return \"Ошибка данных от сервера. \" & BuildRe";
if (true) return "Ошибка данных от сервера. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=28377107;
 //BA.debugLineNum = 28377107;BA.debugLine="Dim delaySec As String = ExtractDetailValue(d";
_delaysec = __ref._extractdetailvalue /*String*/ (null,_details,"delaySec");
RDebugUtils.currentLine=28377108;
 //BA.debugLineNum = 28377108;BA.debugLine="If delaySec = \"\" Then delaySec = ExtractDetai";
if ((_delaysec).equals("")) { 
_delaysec = __ref._extractdetailvalue /*String*/ (null,_details,"delay");};
RDebugUtils.currentLine=28377109;
 //BA.debugLineNum = 28377109;BA.debugLine="If delaySec <> \"\" Then Return \"Повторный запр";
if ((_delaysec).equals("") == false) { 
if (true) return "Повторный запрос данных через "+_delaysec+" секунд";};
RDebugUtils.currentLine=28377110;
 //BA.debugLineNum = 28377110;BA.debugLine="Return \"Повторный запрос данных позже\"";
if (true) return "Повторный запрос данных позже";
 break; }
case 6: {
RDebugUtils.currentLine=28377112;
 //BA.debugLineNum = 28377112;BA.debugLine="Return \"Сервер не ответил вовремя. \" & BuildR";
if (true) return "Сервер не ответил вовремя. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 7: {
RDebugUtils.currentLine=28377114;
 //BA.debugLineNum = 28377114;BA.debugLine="Return \"Метаданные плейлистов обновлены. \" &";
if (true) return "Метаданные плейлистов обновлены. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 8: {
RDebugUtils.currentLine=28377116;
 //BA.debugLineNum = 28377116;BA.debugLine="Return \"Не удалось загрузить метаданные плейл";
if (true) return "Не удалось загрузить метаданные плейлиста. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 9: {
RDebugUtils.currentLine=28377118;
 //BA.debugLineNum = 28377118;BA.debugLine="Return \"Не удалось получить очередь. \" & Buil";
if (true) return "Не удалось получить очередь. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 10: {
RDebugUtils.currentLine=28377120;
 //BA.debugLineNum = 28377120;BA.debugLine="Return \"Доступ к медиа восстановлен.\"";
if (true) return "Доступ к медиа восстановлен.";
 break; }
case 11: {
RDebugUtils.currentLine=28377122;
 //BA.debugLineNum = 28377122;BA.debugLine="Return \"Доступ к медиа ухудшился.\"";
if (true) return "Доступ к медиа ухудшился.";
 break; }
}
;
 break; }
case 2: {
RDebugUtils.currentLine=28377125;
 //BA.debugLineNum = 28377125;BA.debugLine="Dim playerText As String = \"Плеер \" & ExtractDe";
_playertext = "Плеер "+__ref._extractdetailvalue /*String*/ (null,_details,"player");
RDebugUtils.currentLine=28377126;
 //BA.debugLineNum = 28377126;BA.debugLine="Dim itemLabel As String = TraceItemLabelFromDet";
_itemlabel = __ref._traceitemlabelfromdetails /*String*/ (null,_details);
RDebugUtils.currentLine=28377127;
 //BA.debugLineNum = 28377127;BA.debugLine="Dim audioSettingsText As String = BuildAudioSet";
_audiosettingstext = __ref._buildaudiosettingstext /*String*/ (null,_details);
RDebugUtils.currentLine=28377128;
 //BA.debugLineNum = 28377128;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"плеер load","плеер ready","плеер play","плеер complete","плеер error","не удалось запустить трек","таймаут старта трека","таймаут preload")) {
case 0: {
RDebugUtils.currentLine=28377130;
 //BA.debugLineNum = 28377130;BA.debugLine="Return playerText & \": Загружен \" & itemLabel";
if (true) return _playertext+": Загружен "+_itemlabel+_audiosettingstext;
 break; }
case 1: {
RDebugUtils.currentLine=28377132;
 //BA.debugLineNum = 28377132;BA.debugLine="If ExtractDetailValue(details, \"mode\") = \"pre";
if ((__ref._extractdetailvalue /*String*/ (null,_details,"mode")).equals("prepare")) { 
RDebugUtils.currentLine=28377133;
 //BA.debugLineNum = 28377133;BA.debugLine="Return playerText & \": Подготовлен \" & itemL";
if (true) return _playertext+": Подготовлен "+_itemlabel+_audiosettingstext;
 };
RDebugUtils.currentLine=28377135;
 //BA.debugLineNum = 28377135;BA.debugLine="Return playerText & \": Готов к воспроизведени";
if (true) return _playertext+": Готов к воспроизведению "+_itemlabel+_audiosettingstext;
 break; }
case 2: {
RDebugUtils.currentLine=28377137;
 //BA.debugLineNum = 28377137;BA.debugLine="Return playerText & \": Воспроизведение \" & it";
if (true) return _playertext+": Воспроизведение "+_itemlabel+_audiosettingstext;
 break; }
case 3: {
RDebugUtils.currentLine=28377139;
 //BA.debugLineNum = 28377139;BA.debugLine="Return playerText & \": Закончил \" & itemLabel";
if (true) return _playertext+": Закончил "+_itemlabel;
 break; }
case 4: {
RDebugUtils.currentLine=28377141;
 //BA.debugLineNum = 28377141;BA.debugLine="Return playerText & \": Ошибка \" & itemLabel &";
if (true) return _playertext+": Ошибка "+_itemlabel+". "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=28377143;
 //BA.debugLineNum = 28377143;BA.debugLine="Return playerText & \": Не удалось запустить \"";
if (true) return _playertext+": Не удалось запустить "+_itemlabel+". "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 6: {
RDebugUtils.currentLine=28377145;
 //BA.debugLineNum = 28377145;BA.debugLine="Return playerText & \": Не дождались старта \"";
if (true) return _playertext+": Не дождались старта "+_itemlabel;
 break; }
case 7: {
RDebugUtils.currentLine=28377147;
 //BA.debugLineNum = 28377147;BA.debugLine="Return playerText & \": Не дождались подготовк";
if (true) return _playertext+": Не дождались подготовки "+_itemlabel;
 break; }
}
;
 break; }
case 3: {
RDebugUtils.currentLine=28377150;
 //BA.debugLineNum = 28377150;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"первый трек выбран из кэша","populate queue start","populate queue done","populate queue fail","dispatch next","dispatch break","dispatch prepared","dispatch переход","prefetch start","prefetch done","prefetch fail","prefetch skip","crossfade trigger","старт трека","смена трека","watchdog stall","watchdog recovery","break переход начало","break переход итог","break переход fade","break переход пропущен","вставлен break","вставлена реклама","очередь пуста","audio complete пропущен")) {
case 0: {
RDebugUtils.currentLine=28377152;
 //BA.debugLineNum = 28377152;BA.debugLine="Return \"Первый трек выбран из кэша.\"";
if (true) return "Первый трек выбран из кэша.";
 break; }
case 1: {
RDebugUtils.currentLine=28377154;
 //BA.debugLineNum = 28377154;BA.debugLine="Return \"Подготовка очереди.\"";
if (true) return "Подготовка очереди.";
 break; }
case 2: {
RDebugUtils.currentLine=28377156;
 //BA.debugLineNum = 28377156;BA.debugLine="Return \"Очередь подготовлена. Элементов: \" &";
if (true) return "Очередь подготовлена. Элементов: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"queue"),"0");
 break; }
case 3: {
RDebugUtils.currentLine=28377158;
 //BA.debugLineNum = 28377158;BA.debugLine="Return \"Не удалось подготовить очередь. \" & B";
if (true) return "Не удалось подготовить очередь. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=28377160;
 //BA.debugLineNum = 28377160;BA.debugLine="Return \"Следующий элемент: \" & TraceItemLabel";
if (true) return "Следующий элемент: "+__ref._traceitemlabelfromdetails /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=28377162;
 //BA.debugLineNum = 28377162;BA.debugLine="Return \"Начата обработка break.\"";
if (true) return "Начата обработка break.";
 break; }
case 6: {
RDebugUtils.currentLine=28377164;
 //BA.debugLineNum = 28377164;BA.debugLine="Return \"Запущен следующий элемент.\"";
if (true) return "Запущен следующий элемент.";
 break; }
case 7: {
RDebugUtils.currentLine=28377166;
 //BA.debugLineNum = 28377166;BA.debugLine="Return \"Переход к следующему элементу.\"";
if (true) return "Переход к следующему элементу.";
 break; }
case 8: {
RDebugUtils.currentLine=28377168;
 //BA.debugLineNum = 28377168;BA.debugLine="Return \"Подготовка следующего элемента.\"";
if (true) return "Подготовка следующего элемента.";
 break; }
case 9: {
RDebugUtils.currentLine=28377170;
 //BA.debugLineNum = 28377170;BA.debugLine="Return \"Следующий элемент подготовлен.\"";
if (true) return "Следующий элемент подготовлен.";
 break; }
case 10: {
RDebugUtils.currentLine=28377172;
 //BA.debugLineNum = 28377172;BA.debugLine="Return \"Не удалось подготовить следующий элем";
if (true) return "Не удалось подготовить следующий элемент. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 11: {
RDebugUtils.currentLine=28377174;
 //BA.debugLineNum = 28377174;BA.debugLine="Dim skipReason As String = ExtractDetailValue";
_skipreason = __ref._extractdetailvalue /*String*/ (null,_details,"reason");
RDebugUtils.currentLine=28377175;
 //BA.debugLineNum = 28377175;BA.debugLine="If skipReason = \"break_ahead\" Then Return \"Пр";
if ((_skipreason).equals("break_ahead")) { 
if (true) return "Предварительная подготовка отложена: впереди break.";};
RDebugUtils.currentLine=28377176;
 //BA.debugLineNum = 28377176;BA.debugLine="Return \"Предварительная подготовка пропущена.";
if (true) return "Предварительная подготовка пропущена. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 12: {
RDebugUtils.currentLine=28377178;
 //BA.debugLineNum = 28377178;BA.debugLine="Return \"Начат кроссфейд на следующий трек.\"";
if (true) return "Начат кроссфейд на следующий трек.";
 break; }
case 13: {
RDebugUtils.currentLine=28377180;
 //BA.debugLineNum = 28377180;BA.debugLine="Dim sourceText As String = ExtractDetailValue";
_sourcetext = __ref._extractdetailvalue /*String*/ (null,_details,"source");
RDebugUtils.currentLine=28377181;
 //BA.debugLineNum = 28377181;BA.debugLine="If sourceText <> \"\" Then";
if ((_sourcetext).equals("") == false) { 
RDebugUtils.currentLine=28377182;
 //BA.debugLineNum = 28377182;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(d";
if (true) return "Старт трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId")+". Источник: "+_sourcetext;
 };
RDebugUtils.currentLine=28377184;
 //BA.debugLineNum = 28377184;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(de";
if (true) return "Старт трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId");
 break; }
case 14: {
RDebugUtils.currentLine=28377186;
 //BA.debugLineNum = 28377186;BA.debugLine="Return \"Переход после трека \" & ExtractDetail";
if (true) return "Переход после трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId");
 break; }
case 15: {
RDebugUtils.currentLine=28377188;
 //BA.debugLineNum = 28377188;BA.debugLine="Return \"Воспроизведение зависло на треке \" &";
if (true) return "Воспроизведение зависло на треке "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"trackId"),"без идентификатора")+". Запускаю восстановление.";
 break; }
case 16: {
RDebugUtils.currentLine=28377190;
 //BA.debugLineNum = 28377190;BA.debugLine="Return \"Восстановление воспроизведения. \" & B";
if (true) return "Восстановление воспроизведения. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 17: {
RDebugUtils.currentLine=28377192;
 //BA.debugLineNum = 28377192;BA.debugLine="Return \"Начат переход на break.\"";
if (true) return "Начат переход на break.";
 break; }
case 18: {
RDebugUtils.currentLine=28377194;
 //BA.debugLineNum = 28377194;BA.debugLine="Return \"Переход на break завершен. \" & BuildR";
if (true) return "Переход на break завершен. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 19: {
RDebugUtils.currentLine=28377196;
 //BA.debugLineNum = 28377196;BA.debugLine="Return \"Плавное завершение текущего элемента.";
if (true) return "Плавное завершение текущего элемента.";
 break; }
case 20: {
RDebugUtils.currentLine=28377198;
 //BA.debugLineNum = 28377198;BA.debugLine="Return \"Переход на break пропущен. \" & BuildR";
if (true) return "Переход на break пропущен. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 21: {
RDebugUtils.currentLine=28377200;
 //BA.debugLineNum = 28377200;BA.debugLine="Return \"В очередь вставлен break.\"";
if (true) return "В очередь вставлен break.";
 break; }
case 22: {
RDebugUtils.currentLine=28377202;
 //BA.debugLineNum = 28377202;BA.debugLine="Return \"Подготовлен переход на рекламу.\"";
if (true) return "Подготовлен переход на рекламу.";
 break; }
case 23: {
RDebugUtils.currentLine=28377204;
 //BA.debugLineNum = 28377204;BA.debugLine="Return \"Очередь пуста. \" & BuildReasonText(de";
if (true) return "Очередь пуста. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 24: {
RDebugUtils.currentLine=28377206;
 //BA.debugLineNum = 28377206;BA.debugLine="Return \"Событие завершения проигнорировано. \"";
if (true) return "Событие завершения проигнорировано. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
}
;
 break; }
case 4: {
RDebugUtils.currentLine=28377209;
 //BA.debugLineNum = 28377209;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"старт завершен","старт не завершен","автостарт воспроизведение начало","воспроизведение остановлено","плеер заблокирован")) {
case 0: {
RDebugUtils.currentLine=28377211;
 //BA.debugLineNum = 28377211;BA.debugLine="Return \"Старт плеера завершен.\"";
if (true) return "Старт плеера завершен.";
 break; }
case 1: {
RDebugUtils.currentLine=28377213;
 //BA.debugLineNum = 28377213;BA.debugLine="Return \"Старт плеера не завершен. \" & BuildRe";
if (true) return "Старт плеера не завершен. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 2: {
RDebugUtils.currentLine=28377215;
 //BA.debugLineNum = 28377215;BA.debugLine="Return \"Автостарт воспроизведения.\"";
if (true) return "Автостарт воспроизведения.";
 break; }
case 3: {
RDebugUtils.currentLine=28377217;
 //BA.debugLineNum = 28377217;BA.debugLine="Return \"Воспроизведение остановлено. \" & Buil";
if (true) return "Воспроизведение остановлено. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=28377219;
 //BA.debugLineNum = 28377219;BA.debugLine="Return \"Плеер заблокирован.\"";
if (true) return "Плеер заблокирован.";
 break; }
}
;
 break; }
case 5: {
RDebugUtils.currentLine=28377222;
 //BA.debugLineNum = 28377222;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"трек загружен в кэш","ошибка загрузки трека","кэш треков обновлен","кэш рекламы обновлен","аудит кэша","очистка кэша","реклама удалена из кэша","ошибка подготовки трека","нет локального файла")) {
case 0: {
RDebugUtils.currentLine=28377224;
 //BA.debugLineNum = 28377224;BA.debugLine="Return \"Кэш: Загружен трек \" & DefaultIfEmpty";
if (true) return "Кэш: Загружен трек "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"id"),"без идентификатора");
 break; }
case 1: {
RDebugUtils.currentLine=28377226;
 //BA.debugLineNum = 28377226;BA.debugLine="Return \"Кэш: Не удалось загрузить трек. \" & B";
if (true) return "Кэш: Не удалось загрузить трек. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 2: {
RDebugUtils.currentLine=28377228;
 //BA.debugLineNum = 28377228;BA.debugLine="Return \"Кэш: Треки проверены. \" & BuildCounts";
if (true) return "Кэш: Треки проверены. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 3: {
RDebugUtils.currentLine=28377230;
 //BA.debugLineNum = 28377230;BA.debugLine="Return \"Кэш: Реклама проверена. \" & BuildCoun";
if (true) return "Кэш: Реклама проверена. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=28377232;
 //BA.debugLineNum = 28377232;BA.debugLine="Return \"Кэш: Проверен. \" & BuildCountsText(de";
if (true) return "Кэш: Проверен. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=28377234;
 //BA.debugLineNum = 28377234;BA.debugLine="Return \"Кэш: Очистка завершена. \" & BuildCoun";
if (true) return "Кэш: Очистка завершена. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 6: {
RDebugUtils.currentLine=28377236;
 //BA.debugLineNum = 28377236;BA.debugLine="Return \"Кэш: Удалена устаревшая реклама \" & E";
if (true) return "Кэш: Удалена устаревшая реклама "+__ref._extractdetailvalue /*String*/ (null,_details,"id");
 break; }
case 7: {
RDebugUtils.currentLine=28377238;
 //BA.debugLineNum = 28377238;BA.debugLine="Return \"Кэш: Ошибка подготовки трека. \" & Bui";
if (true) return "Кэш: Ошибка подготовки трека. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 8: {
RDebugUtils.currentLine=28377240;
 //BA.debugLineNum = 28377240;BA.debugLine="Return \"Кэш: Локальный файл не найден для тре";
if (true) return "Кэш: Локальный файл не найден для трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId");
 break; }
}
;
 break; }
case 6: {
RDebugUtils.currentLine=28377243;
 //BA.debugLineNum = 28377243;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"история отправлена","история не отправлена","ошибка отправки","ошибка истории","не удалось прочитать файл истории")) {
case 0: {
RDebugUtils.currentLine=28377245;
 //BA.debugLineNum = 28377245;BA.debugLine="Return \"История отправлена. Записей: \" & Defa";
if (true) return "История отправлена. Записей: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"records"),"0");
 break; }
case 1: {
RDebugUtils.currentLine=28377247;
 //BA.debugLineNum = 28377247;BA.debugLine="Return \"История не отправлена. Записей: \" & D";
if (true) return "История не отправлена. Записей: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"records"),"0");
 break; }
case 2: {
RDebugUtils.currentLine=28377249;
 //BA.debugLineNum = 28377249;BA.debugLine="Return \"Ошибка отправки истории. \" & BuildRea";
if (true) return "Ошибка отправки истории. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 3: {
RDebugUtils.currentLine=28377251;
 //BA.debugLineNum = 28377251;BA.debugLine="Return \"Ошибка чтения истории.\"";
if (true) return "Ошибка чтения истории.";
 break; }
case 4: {
RDebugUtils.currentLine=28377253;
 //BA.debugLineNum = 28377253;BA.debugLine="Return \"Не удалось прочитать файл истории \" &";
if (true) return "Не удалось прочитать файл истории "+__ref._extractdetailvalue /*String*/ (null,_details,"file");
 break; }
}
;
 break; }
case 7: {
RDebugUtils.currentLine=28377256;
 //BA.debugLineNum = 28377256;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"воспроизведение","кэш","устройство","ресурсы","сеть")) {
case 0: {
RDebugUtils.currentLine=28377258;
 //BA.debugLineNum = 28377258;BA.debugLine="Return \"Воспроизведение: этап=\" & ExtractDeta";
if (true) return "Воспроизведение: этап="+__ref._extractdetailvalue /*String*/ (null,_details,"stage")+", играет="+__ref._extractdetailvalue /*String*/ (null,_details,"playing")+", трек="+__ref._extractdetailvalue /*String*/ (null,_details,"currentTrackId")+", очередь="+__ref._extractdetailvalue /*String*/ (null,_details,"queue")+", запас="+__ref._extractdetailvalue /*String*/ (null,_details,"reserve")+__ref._buildhealthaudiosettingstext /*String*/ (null,_details);
 break; }
case 1: {
RDebugUtils.currentLine=28377265;
 //BA.debugLineNum = 28377265;BA.debugLine="Return \"Кэш: \" & DefaultIfEmpty(ExtractDetail";
if (true) return "Кэш: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"status"),"неизвестно");
 break; }
case 2: {
RDebugUtils.currentLine=28377267;
 //BA.debugLineNum = 28377267;BA.debugLine="Return \"Устройство: \" & ExtractDetailValue(de";
if (true) return "Устройство: "+__ref._extractdetailvalue /*String*/ (null,_details,"device")+", id="+__ref._extractdetailvalue /*String*/ (null,_details,"deviceId")+", ОС="+__ref._extractdetailtail /*String*/ (null,_details,"os");
 break; }
case 3: {
RDebugUtils.currentLine=28377271;
 //BA.debugLineNum = 28377271;BA.debugLine="Return \"Система: RAM=\" & ExtractDetailValue(d";
if (true) return "Система: RAM="+__ref._extractdetailvalue /*String*/ (null,_details,"ramFreeMb")+" МБ"+", диск="+__ref._extractdetailvalue /*String*/ (null,_details,"diskFreeMb")+"/"+__ref._extractdetailvalue /*String*/ (null,_details,"diskTotalMb")+" МБ";
 break; }
case 4: {
RDebugUtils.currentLine=28377274;
 //BA.debugLineNum = 28377274;BA.debugLine="Return \"Сеть: ошибок=\" & ExtractDetailValue(d";
if (true) return "Сеть: ошибок="+__ref._extractdetailvalue /*String*/ (null,_details,"netErrors")+", данные ок "+__ref._extractdetailvalue /*String*/ (null,_details,"lastDataOkAgoSec")+" сек назад"+", история ок "+__ref._extractdetailvalue /*String*/ (null,_details,"lastHistoryOkAgoSec")+" сек назад";
 break; }
}
;
 break; }
case 8: {
RDebugUtils.currentLine=28377279;
 //BA.debugLineNum = 28377279;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"источник","устройство","платформа","память","память доступно","диск","кэш треков","кэш рекламы","история")) {
case 0: {
RDebugUtils.currentLine=28377281;
 //BA.debugLineNum = 28377281;BA.debugLine="Return \"Система: источник=\" & details";
if (true) return "Система: источник="+_details;
 break; }
case 1: {
RDebugUtils.currentLine=28377283;
 //BA.debugLineNum = 28377283;BA.debugLine="Return \"Устройство: \" & ExtractDetailValue(de";
if (true) return "Устройство: "+__ref._extractdetailvalue /*String*/ (null,_details,"name")+", id="+__ref._extractdetailvalue /*String*/ (null,_details,"id");
 break; }
case 2: {
RDebugUtils.currentLine=28377285;
 //BA.debugLineNum = 28377285;BA.debugLine="Return \"Система: \" & ExtractDetailTail(detail";
if (true) return "Система: "+__ref._extractdetailtail /*String*/ (null,_details,"os");
 break; }
case 3: {
RDebugUtils.currentLine=28377287;
 //BA.debugLineNum = 28377287;BA.debugLine="Return \"RAM: свободно \" & ExtractDetailValue(";
if (true) return "RAM: свободно "+__ref._extractdetailvalue /*String*/ (null,_details,"ramFreeMb")+" МБ";
 break; }
case 4: {
RDebugUtils.currentLine=28377289;
 //BA.debugLineNum = 28377289;BA.debugLine="Return \"RAM: приложению \" & ExtractDetailValu";
if (true) return "RAM: приложению "+__ref._extractdetailvalue /*String*/ (null,_details,"ramTotalMb")+" МБ";
 break; }
case 5: {
RDebugUtils.currentLine=28377291;
 //BA.debugLineNum = 28377291;BA.debugLine="Return \"Диск: свободно \" & ExtractDetailValue";
if (true) return "Диск: свободно "+__ref._extractdetailvalue /*String*/ (null,_details,"diskFreeMb")+" МБ из "+__ref._extractdetailvalue /*String*/ (null,_details,"diskTotalMb")+" МБ";
 break; }
case 6: {
RDebugUtils.currentLine=28377293;
 //BA.debugLineNum = 28377293;BA.debugLine="Return \"Кэш: треков=\" & ExtractDetailValue(de";
if (true) return "Кэш: треков="+__ref._extractdetailvalue /*String*/ (null,_details,"trackCount")+", "+__ref._extractdetailvalue /*String*/ (null,_details,"trackMb")+" МБ, индекс="+__ref._extractdetailvalue /*String*/ (null,_details,"trackIndex");
 break; }
case 7: {
RDebugUtils.currentLine=28377295;
 //BA.debugLineNum = 28377295;BA.debugLine="Return \"Кэш: рекламы=\" & ExtractDetailValue(d";
if (true) return "Кэш: рекламы="+__ref._extractdetailvalue /*String*/ (null,_details,"adCount")+", "+__ref._extractdetailvalue /*String*/ (null,_details,"adMb")+" МБ, индекс="+__ref._extractdetailvalue /*String*/ (null,_details,"adIndex");
 break; }
case 8: {
RDebugUtils.currentLine=28377297;
 //BA.debugLineNum = 28377297;BA.debugLine="Return \"История: ожидает отправки \" & Extract";
if (true) return "История: ожидает отправки "+__ref._extractdetailvalue /*String*/ (null,_details,"pendingHistory")+" записей";
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=28377300;
 //BA.debugLineNum = 28377300;BA.debugLine="Dim genericText As String = message";
_generictext = _message;
RDebugUtils.currentLine=28377301;
 //BA.debugLineNum = 28377301;BA.debugLine="If details <> \"\" Then genericText = genericText &";
if ((_details).equals("") == false) { 
_generictext = _generictext+". "+_details;};
RDebugUtils.currentLine=28377302;
 //BA.debugLineNum = 28377302;BA.debugLine="Return genericText";
if (true) return _generictext;
RDebugUtils.currentLine=28377303;
 //BA.debugLineNum = 28377303;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Private Sub BuildVersionPlayerText(details As Stri";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="Dim versionText As String = ExtractDetailValue(de";
_versiontext = __ref._extractdetailvalue /*String*/ (null,_details,"version");
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="Dim playerText As String = ExtractDetailValue(det";
_playertext = __ref._extractdetailvalue /*String*/ (null,_details,"player");
RDebugUtils.currentLine=28442627;
 //BA.debugLineNum = 28442627;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28442628;
 //BA.debugLineNum = 28442628;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=28442629;
 //BA.debugLineNum = 28442629;BA.debugLine="If versionText <> \"\" Then parts.Add(\"Версия \" & v";
if ((_versiontext).equals("") == false) { 
_parts.Add((Object)("Версия "+_versiontext));};
RDebugUtils.currentLine=28442630;
 //BA.debugLineNum = 28442630;BA.debugLine="If playerText <> \"\" Then parts.Add(\"Плеер \" & pla";
if ((_playertext).equals("") == false) { 
_parts.Add((Object)("Плеер "+_playertext));};
RDebugUtils.currentLine=28442631;
 //BA.debugLineNum = 28442631;BA.debugLine="If parts.Size = 0 Then Return \"Запуск\"";
if (_parts.getSize()==0) { 
if (true) return "Запуск";};
RDebugUtils.currentLine=28442632;
 //BA.debugLineNum = 28442632;BA.debugLine="Return JoinWords(parts)";
if (true) return __ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=28442633;
 //BA.debugLineNum = 28442633;BA.debugLine="End Sub";
return "";
}
public String  _traceitemlabelfromdetails(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "traceitemlabelfromdetails", false))
	 {return ((String) Debug.delegate(ba, "traceitemlabelfromdetails", new Object[] {_details}));}
String _itemtype = "";
String _itemid = "";
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Private Sub TraceItemLabelFromDetails(details As S";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="Dim itemType As String = ExtractDetailValue(detai";
_itemtype = __ref._extractdetailvalue /*String*/ (null,_details,"type");
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="Dim itemId As String = DefaultIfEmpty(ExtractDeta";
_itemid = __ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"id"),__ref._extractdetailvalue /*String*/ (null,_details,"trackId"));
RDebugUtils.currentLine=28508163;
 //BA.debugLineNum = 28508163;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=28508164;
 //BA.debugLineNum = 28508164;BA.debugLine="If itemId <> \"\" Then Return \"рекламу \" & itemId";
if ((_itemid).equals("") == false) { 
if (true) return "рекламу "+_itemid;};
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="Return \"рекламу\"";
if (true) return "рекламу";
 };
RDebugUtils.currentLine=28508167;
 //BA.debugLineNum = 28508167;BA.debugLine="If itemId <> \"\" Then Return \"трек \" & itemId";
if ((_itemid).equals("") == false) { 
if (true) return "трек "+_itemid;};
RDebugUtils.currentLine=28508168;
 //BA.debugLineNum = 28508168;BA.debugLine="Return \"трек\"";
if (true) return "трек";
RDebugUtils.currentLine=28508169;
 //BA.debugLineNum = 28508169;BA.debugLine="End Sub";
return "";
}
public String  _defaultifempty(b4j.example.playbacktraceformatter __ref,String _value,String _fallback) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "defaultifempty", false))
	 {return ((String) Debug.delegate(ba, "defaultifempty", new Object[] {_value,_fallback}));}
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Private Sub DefaultIfEmpty(value As String, fallba";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="If value = \"\" Then Return fallback";
if ((_value).equals("")) { 
if (true) return _fallback;};
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="End Sub";
return "";
}
public String  _extractdetailtail(b4j.example.playbacktraceformatter __ref,String _details,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "extractdetailtail", false))
	 {return ((String) Debug.delegate(ba, "extractdetailtail", new Object[] {_details,_key}));}
String _marker = "";
int _startindex = 0;
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Private Sub ExtractDetailTail(details As String, k";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="Dim marker As String = key & \"=\"";
_marker = _key+"=";
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
_startindex = _details.indexOf(_marker);
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="If startIndex < 0 Then Return \"\"";
if (_startindex<0) { 
if (true) return "";};
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="Return details.SubString(startIndex + marker.Leng";
if (true) return _details.substring((int) (_startindex+_marker.length())).trim();
RDebugUtils.currentLine=29097989;
 //BA.debugLineNum = 29097989;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbacktraceformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="End Sub";
return "";
}
}