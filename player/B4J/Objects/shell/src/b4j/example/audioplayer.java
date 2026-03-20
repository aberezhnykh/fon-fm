
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class audioplayer {
    public static RemoteObject myClass;
	public audioplayer() {
	}
    public static PCBA staticBA = new PCBA(null, audioplayer.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _state_stopped = RemoteObject.createImmutable(0);
public static RemoteObject _state_loading = RemoteObject.createImmutable(0);
public static RemoteObject _state_ready = RemoteObject.createImmutable(0);
public static RemoteObject _state_playing = RemoteObject.createImmutable(0);
public static RemoteObject _fade_none = RemoteObject.createImmutable(0);
public static RemoteObject _fade_in = RemoteObject.createImmutable(0);
public static RemoteObject _fade_out = RemoteObject.createImmutable(0);
public static RemoteObject _player = RemoteObject.declareNull("anywheresoftware.b4j.objects.MediaPlayerWrapper");
public static RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _eventname = RemoteObject.createImmutable("");
public static RemoteObject _targetmodule = RemoteObject.declareNull("Object");
public static RemoteObject _timeupdatetimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _lastposition = RemoteObject.createImmutable(0L);
public static RemoteObject _checktimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _loadtimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _fadetimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _playerstate = RemoteObject.createImmutable(0);
public static RemoteObject _maxvolume = RemoteObject.createImmutable(0);
public static RemoteObject _fademode = RemoteObject.createImmutable(0);
public static RemoteObject _fadetargetvolume = RemoteObject.createImmutable(0);
public static RemoteObject _fadestepvolume = RemoteObject.createImmutable(0);
public static RemoteObject _currentvolume = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"checkTimer",_ref.getField(false, "_checktimer"),"currentVolume",_ref.getField(false, "_currentvolume"),"eventName",_ref.getField(false, "_eventname"),"FADE_IN",_ref.getField(false, "_fade_in"),"FADE_NONE",_ref.getField(false, "_fade_none"),"FADE_OUT",_ref.getField(false, "_fade_out"),"fadeMode",_ref.getField(false, "_fademode"),"fadeStepVolume",_ref.getField(false, "_fadestepvolume"),"fadeTargetVolume",_ref.getField(false, "_fadetargetvolume"),"fadeTimer",_ref.getField(false, "_fadetimer"),"jo",_ref.getField(false, "_jo"),"lastPosition",_ref.getField(false, "_lastposition"),"loadTimer",_ref.getField(false, "_loadtimer"),"maxVolume",_ref.getField(false, "_maxvolume"),"player",_ref.getField(false, "_player"),"playerState",_ref.getField(false, "_playerstate"),"STATE_LOADING",_ref.getField(false, "_state_loading"),"STATE_PLAYING",_ref.getField(false, "_state_playing"),"STATE_READY",_ref.getField(false, "_state_ready"),"STATE_STOPPED",_ref.getField(false, "_state_stopped"),"targetModule",_ref.getField(false, "_targetmodule"),"timeUpdateTimer",_ref.getField(false, "_timeupdatetimer")};
}
}