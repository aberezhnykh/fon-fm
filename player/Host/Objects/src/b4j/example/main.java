package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _player_jar = "";
public static String _staged_player_jar = "";
public static String _player_backup_jar = "";
public static String _player_argument = "";
public static String _host_log_file = "";
public static int _exit_stop = 0;
public static int _exit_apply_update = 0;
public static int _exit_restart = 0;
public static int _fast_restart_delay_ms = 0;
public static int _slow_restart_delay_ms = 0;
public static anywheresoftware.b4j.objects.Shell _vv6 = null;
public static int _vv4 = 0;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 152;BA.debugLine="TraceLog(\"application error=\" & Error.Message)";
_v5("application error="+_error.getMessage());
 //BA.debugLineNum = 153;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return false;
}
public static boolean  _v6() throws Exception{
long _stagedsize = 0L;
 //BA.debugLineNum = 83;BA.debugLine="Private Sub ApplyPendingUpdateIfNeeded As Boolean";
 //BA.debugLineNum = 84;BA.debugLine="If File.Exists(File.DirApp, STAGED_PLAYER_JAR) =";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_staged_player_jar)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 //BA.debugLineNum = 85;BA.debugLine="Dim stagedSize As Long = File.Size(File.DirApp, S";
_stagedsize = anywheresoftware.b4a.keywords.Common.File.Size(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_staged_player_jar);
 //BA.debugLineNum = 86;BA.debugLine="If stagedSize <= 0 Then";
if (_stagedsize<=0) { 
 //BA.debugLineNum = 87;BA.debugLine="TraceLog(\"ignoring empty staged update file=\" &";
_v5("ignoring empty staged update file="+_staged_player_jar);
 //BA.debugLineNum = 88;BA.debugLine="File.Delete(File.DirApp, STAGED_PLAYER_JAR)";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_staged_player_jar);
 //BA.debugLineNum = 89;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 91;BA.debugLine="Try";
try { //BA.debugLineNum = 92;BA.debugLine="If File.Exists(File.DirApp, PLAYER_BACKUP_JAR) T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_backup_jar)) { 
 //BA.debugLineNum = 93;BA.debugLine="File.Delete(File.DirApp, PLAYER_BACKUP_JAR)";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_backup_jar);
 };
 //BA.debugLineNum = 95;BA.debugLine="If File.Exists(File.DirApp, PLAYER_JAR) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar)) { 
 //BA.debugLineNum = 96;BA.debugLine="File.Copy(File.DirApp, PLAYER_JAR, File.DirApp,";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar,anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_backup_jar);
 //BA.debugLineNum = 97;BA.debugLine="File.Delete(File.DirApp, PLAYER_JAR)";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar);
 };
 //BA.debugLineNum = 99;BA.debugLine="File.Copy(File.DirApp, STAGED_PLAYER_JAR, File.D";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_staged_player_jar,anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar);
 //BA.debugLineNum = 100;BA.debugLine="If File.Exists(File.DirApp, PLAYER_JAR) = False";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar)==anywheresoftware.b4a.keywords.Common.False || anywheresoftware.b4a.keywords.Common.File.Size(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar)!=_stagedsize) { 
 //BA.debugLineNum = 101;BA.debugLine="TraceLog(\"update apply failed size mismatch sta";
_v5("update apply failed size mismatch staged="+BA.NumberToString(_stagedsize)+" player="+BA.NumberToString(_v7(_player_jar)));
 //BA.debugLineNum = 102;BA.debugLine="RestoreBackupIfNeeded";
_v0();
 //BA.debugLineNum = 103;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 105;BA.debugLine="File.Delete(File.DirApp, STAGED_PLAYER_JAR)";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_staged_player_jar);
 //BA.debugLineNum = 106;BA.debugLine="TraceLog(\"update applied size=\" & stagedSize)";
_v5("update applied size="+BA.NumberToString(_stagedsize));
 //BA.debugLineNum = 107;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e26) {
			ba.setLastException(e26); //BA.debugLineNum = 109;BA.debugLine="TraceLog(\"update apply error=\" & LastException.M";
_v5("update apply error="+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 //BA.debugLineNum = 110;BA.debugLine="RestoreBackupIfNeeded";
_v0();
 //BA.debugLineNum = 111;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(String[] _args) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub AppStart (Args() As String)";
 //BA.debugLineNum = 23;BA.debugLine="TraceLog(\"host start dir=\" & File.DirApp)";
_v5("host start dir="+anywheresoftware.b4a.keywords.Common.File.getDirApp());
 //BA.debugLineNum = 24;BA.debugLine="ApplyPendingUpdateIfNeeded";
_v6();
 //BA.debugLineNum = 25;BA.debugLine="StartPlayer";
_vv1();
 //BA.debugLineNum = 26;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vv2(boolean _success,int _exitcode,String _stderr) throws Exception{
ResumableSub_HandlePlayerExitAsync rsub = new ResumableSub_HandlePlayerExitAsync(null,_success,_exitcode,_stderr);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandlePlayerExitAsync extends BA.ResumableSub {
public ResumableSub_HandlePlayerExitAsync(b4j.example.main parent,boolean _success,int _exitcode,String _stderr) {
this.parent = parent;
this._success = _success;
this._exitcode = _exitcode;
this._stderr = _stderr;
}
b4j.example.main parent;
boolean _success;
int _exitcode;
String _stderr;
boolean _unused = false;
int _restartdelayms = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 53;BA.debugLine="TraceLog(\"player exit code=\" & exitCode & \" succe";
_v5("player exit code="+BA.NumberToString(_exitcode)+" success="+BA.ObjectToString(_success)+" stderr="+_vv3(_stderr));
 //BA.debugLineNum = 54;BA.debugLine="Select exitCode";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_exitcode,parent._exit_stop,parent._exit_apply_update,parent._exit_restart)) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
default: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 10;
 //BA.debugLineNum = 56;BA.debugLine="TraceLog(\"host stop requested\")";
_v5("host stop requested");
 //BA.debugLineNum = 57;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 5:
//C
this.state = 10;
 //BA.debugLineNum = 59;BA.debugLine="consecutiveUnexpectedExitCount = 0";
parent._vv4 = (int) (0);
 //BA.debugLineNum = 60;BA.debugLine="ApplyPendingUpdateIfNeeded";
_v6();
 //BA.debugLineNum = 61;BA.debugLine="Wait For (RestartAfterDelay(FAST_RESTART_DELAY_";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _vv5(parent._fast_restart_delay_ms,"apply_update"));
this.state = 11;
return;
case 11:
//C
this.state = 10;
_unused = (boolean) result[0];
;
 if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 63;BA.debugLine="consecutiveUnexpectedExitCount = 0";
parent._vv4 = (int) (0);
 //BA.debugLineNum = 64;BA.debugLine="Wait For (RestartAfterDelay(FAST_RESTART_DELAY_";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _vv5(parent._fast_restart_delay_ms,"restart"));
this.state = 12;
return;
case 12:
//C
this.state = 10;
_unused = (boolean) result[0];
;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 66;BA.debugLine="consecutiveUnexpectedExitCount = consecutiveUne";
parent._vv4 = (int) (parent._vv4+1);
 //BA.debugLineNum = 67;BA.debugLine="Dim restartDelayMs As Int = IIf(consecutiveUnex";
_restartdelayms = (int)(BA.ObjectToNumber(((parent._vv4<5) ? ((Object)(parent._fast_restart_delay_ms)) : ((Object)(parent._slow_restart_delay_ms)))));
 //BA.debugLineNum = 68;BA.debugLine="Wait For (RestartAfterDelay(restartDelayMs, \"un";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _vv5(_restartdelayms,"unexpected_exit"));
this.state = 13;
return;
case 13:
//C
this.state = 10;
_unused = (boolean) result[0];
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 70;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(boolean _unused) throws Exception{
}
public static String  _playershell_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub PlayerShell_ProcessCompleted (Success";
 //BA.debugLineNum = 49;BA.debugLine="HandlePlayerExitAsync(Success, ExitCode, StdErr)";
_vv2(_success,_exitcode,_stderr);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}

private static byte[][] bb;

public static String vvv13(final byte[] _b, final int i) throws Exception {
Runnable r = new Runnable() {
{

int value = i / 5 + 929304;
if (bb == null) {
		
                    bb = new byte[3][];
					bb[0] = BA.packageName.getBytes("UTF8");
                    bb[1] = "/.,mndqw".getBytes("UTF8");			
        }
        bb[2] = new byte[] {
                    (byte) (value >>> 24),
						(byte) (value >>> 16),
						(byte) (value >>> 8),
						(byte) value};
				try {
					for (int __b = 0;__b < (2 + 1);__b ++) {
						for (int b = 0;b<_b.length;b++) {
							_b[b] ^= bb[__b][b % bb[__b].length];
						}
					}

				} catch (Exception e) {
					throw new RuntimeException(e);
				}
                

            
}
public void run() {
}
};
return new String(_b, "UTF8");
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private Const PLAYER_JAR As String = \"fonfm.jar\"";
_player_jar = main.vvv13 (new byte[] {43,101,-42,-6,102,34,-124,-92,45}, 922597);
 //BA.debugLineNum = 9;BA.debugLine="Private Const STAGED_PLAYER_JAR As String = \"_fon";
_staged_player_jar = main.vvv13 (new byte[] {18,115,-6,63,109,126,-19,98,62,63}, 538850);
 //BA.debugLineNum = 10;BA.debugLine="Private Const PLAYER_BACKUP_JAR As String = \"fonf";
_player_backup_jar = main.vvv13 (new byte[] {43,101,42,-76,102,34,120,-22,45,124,41,-1,49}, 599649);
 //BA.debugLineNum = 11;BA.debugLine="Private Const PLAYER_ARGUMENT As String = \"host\"";
_player_argument = main.vvv13 (new byte[] {37,101,-86,-117}, 800823);
 //BA.debugLineNum = 12;BA.debugLine="Private Const HOST_LOG_FILE As String = \"host.log";
_host_log_file = main.vvv13 (new byte[] {37,123,-121,58,37,126,-51,112}, 168907);
 //BA.debugLineNum = 13;BA.debugLine="Private Const EXIT_STOP As Int = 100";
_exit_stop = (int) (100);
 //BA.debugLineNum = 14;BA.debugLine="Private Const EXIT_APPLY_UPDATE As Int = 200";
_exit_apply_update = (int) (200);
 //BA.debugLineNum = 15;BA.debugLine="Private Const EXIT_RESTART As Int = 201";
_exit_restart = (int) (201);
 //BA.debugLineNum = 16;BA.debugLine="Private Const FAST_RESTART_DELAY_MS As Int = 1000";
_fast_restart_delay_ms = (int) (1000);
 //BA.debugLineNum = 17;BA.debugLine="Private Const SLOW_RESTART_DELAY_MS As Int = 6000";
_slow_restart_delay_ms = (int) (60000);
 //BA.debugLineNum = 18;BA.debugLine="Private playerShell As Shell";
_vv6 = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 19;BA.debugLine="Private consecutiveUnexpectedExitCount As Int";
_vv4 = 0;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vv5(int _delayms,String _reason) throws Exception{
ResumableSub_RestartAfterDelay rsub = new ResumableSub_RestartAfterDelay(null,_delayms,_reason);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RestartAfterDelay extends BA.ResumableSub {
public ResumableSub_RestartAfterDelay(b4j.example.main parent,int _delayms,String _reason) {
this.parent = parent;
this._delayms = _delayms;
this._reason = _reason;
}
b4j.example.main parent;
int _delayms;
String _reason;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 74;BA.debugLine="TraceLog(\"restart scheduled reason=\" & reason & \"";
_v5("restart scheduled reason="+_reason+" delayMs="+BA.NumberToString(_delayms));
 //BA.debugLineNum = 75;BA.debugLine="Sleep(delayMs)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,_delayms);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 76;BA.debugLine="ApplyPendingUpdateIfNeeded";
_v6();
 //BA.debugLineNum = 77;BA.debugLine="StartPlayer";
_vv1();
 //BA.debugLineNum = 78;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _v0() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Private Sub RestoreBackupIfNeeded";
 //BA.debugLineNum = 116;BA.debugLine="If File.Exists(File.DirApp, PLAYER_BACKUP_JAR) =";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_backup_jar)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
 //BA.debugLineNum = 117;BA.debugLine="Try";
try { //BA.debugLineNum = 118;BA.debugLine="If File.Exists(File.DirApp, PLAYER_JAR) Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar)) { 
 //BA.debugLineNum = 119;BA.debugLine="File.Delete(File.DirApp, PLAYER_JAR)";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar);
 };
 //BA.debugLineNum = 121;BA.debugLine="File.Copy(File.DirApp, PLAYER_BACKUP_JAR, File.D";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_backup_jar,anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar);
 //BA.debugLineNum = 122;BA.debugLine="TraceLog(\"backup restored\")";
_v5("backup restored");
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 124;BA.debugLine="TraceLog(\"backup restore error=\" & LastException";
_v5("backup restore error="+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public static long  _v7(String _filename) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Private Sub SafeFileSize(fileName As String) As Lo";
 //BA.debugLineNum = 129;BA.debugLine="If File.Exists(File.DirApp, fileName) = False The";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_filename)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return (long) (-1);};
 //BA.debugLineNum = 130;BA.debugLine="Return File.Size(File.DirApp, fileName)";
if (true) return anywheresoftware.b4a.keywords.Common.File.Size(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_filename);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return 0L;
}
public static String  _vv3(String _value) throws Exception{
String _text = "";
 //BA.debugLineNum = 133;BA.debugLine="Private Sub SanitizeForLog(value As String) As Str";
 //BA.debugLineNum = 134;BA.debugLine="Dim text As String = value";
_text = _value;
 //BA.debugLineNum = 135;BA.debugLine="If text = Null Then text = \"\"";
if (_text== null) { 
_text = "";};
 //BA.debugLineNum = 136;BA.debugLine="text = text.Replace(CRLF, \" | \").Replace(Chr(10),";
_text = _text.replace(anywheresoftware.b4a.keywords.Common.CRLF," | ").replace(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (10)))," | ").replace(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (13)))," | ").trim();
 //BA.debugLineNum = 137;BA.debugLine="If text.Length > 500 Then text = text.SubString2(";
if (_text.length()>500) { 
_text = _text.substring((int) (0),(int) (500));};
 //BA.debugLineNum = 138;BA.debugLine="Return text";
if (true) return _text;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public static String  _vv1() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Private Sub StartPlayer";
 //BA.debugLineNum = 30;BA.debugLine="If File.Exists(File.DirApp, PLAYER_JAR) = False T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_player_jar)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 31;BA.debugLine="TraceLog(\"player not found file=\" & PLAYER_JAR)";
_v5("player not found file="+_player_jar);
 //BA.debugLineNum = 32;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 33;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 35;BA.debugLine="If playerShell.IsInitialized Then";
if (_vv6.IsInitialized()) { 
 //BA.debugLineNum = 36;BA.debugLine="Try";
try { //BA.debugLineNum = 37;BA.debugLine="playerShell.KillProcess";
_vv6.KillProcess();
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 39;BA.debugLine="TraceLog(\"kill previous player ignored error=\"";
_v5("kill previous player ignored error="+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
 };
 //BA.debugLineNum = 42;BA.debugLine="playerShell.Initialize(\"PlayerShell\", \"java\", Arr";
_vv6.Initialize("PlayerShell","java",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"-jar",_player_jar,_player_argument}));
 //BA.debugLineNum = 43;BA.debugLine="playerShell.WorkingDirectory = File.DirApp";
_vv6.setWorkingDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
 //BA.debugLineNum = 44;BA.debugLine="playerShell.Run(-1)";
_vv6.Run(ba,(long) (-1));
 //BA.debugLineNum = 45;BA.debugLine="TraceLog(\"player start file=\" & PLAYER_JAR)";
_v5("player start file="+_player_jar);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _v5(String _text) throws Exception{
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _tw = null;
 //BA.debugLineNum = 141;BA.debugLine="Private Sub TraceLog(text As String)";
 //BA.debugLineNum = 142;BA.debugLine="If text = \"\" Then Return";
if ((_text).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 143;BA.debugLine="Dim tw As TextWriter";
_tw = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 144;BA.debugLine="tw.Initialize(File.OpenOutput(File.DirApp, HOST_L";
_tw.Initialize((java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_host_log_file,anywheresoftware.b4a.keywords.Common.True).getObject()));
 //BA.debugLineNum = 145;BA.debugLine="tw.Write(DateTime.Date(DateTime.Now) & \" \" & Date";
_tw.Write(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+" "+anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+" "+_text+anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 146;BA.debugLine="tw.Close";
_tw.Close();
 //BA.debugLineNum = 147;BA.debugLine="Log(text)";
anywheresoftware.b4a.keywords.Common.LogImpl("1655366",_text,0);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
}
