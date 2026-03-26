package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbackdatacoordinator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbackdatacoordinator");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbackdatacoordinator.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.playerstatestore _statestore = null;
public b4a.example.networksyncservice _syncservice = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _activatelocalfallback(boolean _markdegraded,String _reason) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Public Sub ActivateLocalFallback(markDegraded As B";
 //BA.debugLineNum = 191;BA.debugLine="stateStore.TraceLog(\"fallback activate mode=local";
_statestore._tracelog /*String*/ ("fallback activate mode=local reason="+_reason+" degraded="+BA.ObjectToString(_markdegraded));
 //BA.debugLineNum = 192;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"switch_l";
_statestore._setplaybackflowstate /*String*/ ("idle","switch_local:"+_reason);
 //BA.debugLineNum = 193;BA.debugLine="stateStore.EnterLocalPlayback";
_statestore._enterlocalplayback /*String*/ ();
 //BA.debugLineNum = 194;BA.debugLine="stateStore.SetMediaPathDegraded(markDegraded)";
_statestore._setmediapathdegraded /*String*/ (_markdegraded);
 //BA.debugLineNum = 195;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
_statestore._refreshconnectionindicatorstate /*String*/ ();
 //BA.debugLineNum = 196;BA.debugLine="stateStore.ClearPlaybackState";
_statestore._clearplaybackstate /*String*/ ();
 //BA.debugLineNum = 197;BA.debugLine="stateStore.HidePin";
_statestore._hidepin /*String*/ ();
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public boolean  _allowregularadsattargetminute(anywheresoftware.b4a.objects.collections.Map _offlinedata,long _targetminutetimestamp) throws Exception{
long _targetticks = 0L;
anywheresoftware.b4a.objects.collections.Map _targetslot = null;
 //BA.debugLineNum = 370;BA.debugLine="Public Sub AllowRegularAdsAtTargetMinute(offlineDa";
 //BA.debugLineNum = 371;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 372;BA.debugLine="Dim targetTicks As Long = targetMinuteTimestamp *";
_targetticks = (long) (_targetminutetimestamp*1000);
 //BA.debugLineNum = 373;BA.debugLine="Dim targetSlot As Map = stateStore.ResolveDataSlo";
_targetslot = new anywheresoftware.b4a.objects.collections.Map();
_targetslot = _statestore._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_offlinedata,_targetticks);
 //BA.debugLineNum = 374;BA.debugLine="Return IsIdleSlot(targetSlot) = False";
if (true) return _isidleslot(_targetslot)==__c.False;
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4a.example.playerstatestore();
 //BA.debugLineNum = 7;BA.debugLine="Private syncService As NetworkSyncService";
_syncservice = new b4a.example.networksyncservice();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public int  _countcachedtracksinplaylist(anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
anywheresoftware.b4a.objects.collections.List _tracks = null;
int _totalcount = 0;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
 //BA.debugLineNum = 328;BA.debugLine="Private Sub CountCachedTracksInPlaylist(playlistDa";
 //BA.debugLineNum = 329;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 330;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 331;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 332;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
 //BA.debugLineNum = 333;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group5 = _tracks;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_trackobject = group5.Get(index5);
 //BA.debugLineNum = 334;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 335;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
 //BA.debugLineNum = 336;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 337;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 338;BA.debugLine="If stateStore.IsTrackCached(trackId) = False The";
if (_statestore._istrackcached /*boolean*/ (_trackid)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 339;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 }
};
 //BA.debugLineNum = 341;BA.debugLine="Return totalCount";
if (true) return _totalcount;
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return 0;
}
public int  _countplayablelocaltracksincurrentslot(anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
int _totalcount = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
 //BA.debugLineNum = 310;BA.debugLine="Public Sub CountPlayableLocalTracksInCurrentSlot(o";
 //BA.debugLineNum = 311;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveDataSl";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = _statestore._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_offlinedata,_effectivenowticks);
 //BA.debugLineNum = 312;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 313;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
 //BA.debugLineNum = 314;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 315;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
 //BA.debugLineNum = 316;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group6 = _playlists;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_playlistobject = group6.Get(index6);
 //BA.debugLineNum = 317;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
 //BA.debugLineNum = 318;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 319;BA.debugLine="Dim playlistId As String = playlistDescriptor.G";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 320;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 321;BA.debugLine="Dim playlistData As Map = stateStore.LoadCached";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = _statestore._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (_playlistid);
 //BA.debugLineNum = 322;BA.debugLine="totalCount = totalCount + CountCachedTracksInPl";
_totalcount = (int) (_totalcount+_countcachedtracksinplaylist(_playlistdata));
 };
 }
};
 //BA.debugLineNum = 325;BA.debugLine="Return totalCount";
if (true) return _totalcount;
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 443;BA.debugLine="Private Sub CreateInitializedMap As Map";
 //BA.debugLineNum = 444;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 445;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 446;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public String  _handleblockedstate() throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Public Sub HandleBlockedState";
 //BA.debugLineNum = 171;BA.debugLine="stateStore.TraceLog(\"состояние blocked\")";
_statestore._tracelog /*String*/ ("состояние blocked");
 //BA.debugLineNum = 172;BA.debugLine="stateStore.EnterPolicyPause(stateStore.MessageVal";
_statestore._enterpolicypause /*String*/ (_statestore._messagevalue /*String*/ ("blocked"),"blocked");
 //BA.debugLineNum = 173;BA.debugLine="stateStore.ScheduleRetry(\"blocked\", 0)";
_statestore._scheduleretry /*String*/ ("blocked",(int) (0));
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handlefetchfailure(anywheresoftware.b4a.objects.collections.Map _result) throws Exception{
ResumableSub_HandleFetchFailure rsub = new ResumableSub_HandleFetchFailure(this,_result);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleFetchFailure extends BA.ResumableSub {
public ResumableSub_HandleFetchFailure(b4a.example.playbackdatacoordinator parent,anywheresoftware.b4a.objects.collections.Map _result) {
this.parent = parent;
this._result = _result;
}
b4a.example.playbackdatacoordinator parent;
anywheresoftware.b4a.objects.collections.Map _result;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 238;BA.debugLine="stateStore.TraceLog(\"очередь fetch ошибка kind=\"";
parent._statestore._tracelog /*String*/ ("очередь fetch ошибка kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
 //BA.debugLineNum = 239;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"network\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_result.GetDefault((Object)("Kind"),(Object)(""))).equals((Object)("network"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 240;BA.debugLine="HandleLocalTemporaryState(\"\")";
parent._handlelocaltemporarystate("");
 //BA.debugLineNum = 241;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 243;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";

case 4:
//if
this.state = 7;
if (parent._statestore._haslocalplaybackfallback /*boolean*/ ()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 244;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
parent._statestore._tracelog /*String*/ ("fallback выбор mode=local reason=data_fetch_error");
 //BA.debugLineNum = 245;BA.debugLine="HandleLocalTemporaryState(\"\")";
parent._handlelocaltemporarystate("");
 //BA.debugLineNum = 246;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 248;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
parent._handletemporarystate("server","");
 //BA.debugLineNum = 249;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handlelocaltemporarystate(String _text) throws Exception{
boolean _fallbackready = false;
 //BA.debugLineNum = 201;BA.debugLine="Public Sub HandleLocalTemporaryState(text As Strin";
 //BA.debugLineNum = 202;BA.debugLine="Dim fallbackReady As Boolean = stateStore.HasLoca";
_fallbackready = _statestore._haslocalplaybackfallback /*boolean*/ ();
 //BA.debugLineNum = 203;BA.debugLine="stateStore.TraceLog(\"состояние local_empty fallba";
_statestore._tracelog /*String*/ ("состояние local_empty fallbackReady="+BA.ObjectToString(_fallbackready)+" text="+_text);
 //BA.debugLineNum = 204;BA.debugLine="If fallbackReady Then stateStore.TraceLog(\"fallba";
if (_fallbackready) { 
_statestore._tracelog /*String*/ ("fallback выбор mode=local_ready reason=playable_local_fallback");};
 //BA.debugLineNum = 205;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"local_me";
_statestore._setplaybackflowstate /*String*/ ("idle","local_media_unavailable");
 //BA.debugLineNum = 206;BA.debugLine="If fallbackReady Then";
if (_fallbackready) { 
 //BA.debugLineNum = 207;BA.debugLine="stateStore.EnterLocalPlayback";
_statestore._enterlocalplayback /*String*/ ();
 }else {
 //BA.debugLineNum = 209;BA.debugLine="stateStore.ApplyTemporaryMode(\"local_empty\")";
_statestore._applytemporarymode /*String*/ ("local_empty");
 };
 //BA.debugLineNum = 211;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
_statestore._refreshconnectionindicatorstate /*String*/ ();
 //BA.debugLineNum = 212;BA.debugLine="stateStore.ClearPlaybackState";
_statestore._clearplaybackstate /*String*/ ();
 //BA.debugLineNum = 213;BA.debugLine="stateStore.HidePin";
_statestore._hidepin /*String*/ ();
 //BA.debugLineNum = 214;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
 //BA.debugLineNum = 215;BA.debugLine="stateStore.ShowMessage(text)";
_statestore._showmessage /*String*/ (_text);
 }else {
 //BA.debugLineNum = 217;BA.debugLine="stateStore.ShowMessage(\"Нет локальных треков\")";
_statestore._showmessage /*String*/ ("Нет локальных треков");
 };
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handlemediaerror() throws Exception{
ResumableSub_HandleMediaError rsub = new ResumableSub_HandleMediaError(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleMediaError extends BA.ResumableSub {
public ResumableSub_HandleMediaError(b4a.example.playbackdatacoordinator parent) {
this.parent = parent;
}
b4a.example.playbackdatacoordinator parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 275;BA.debugLine="stateStore.SetPlaybackFlowState(\"error\", \"media_e";
parent._statestore._setplaybackflowstate /*String*/ ("error","media_error");
 //BA.debugLineNum = 276;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._statestore._haslocalplaybackfallback /*boolean*/ ()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 277;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
parent._statestore._tracelog /*String*/ ("fallback выбор mode=local reason=media_error");
 //BA.debugLineNum = 278;BA.debugLine="ActivateLocalFallback(True, \"media_failure\")";
parent._activatelocalfallback(parent.__c.True,"media_failure");
 //BA.debugLineNum = 279;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 281;BA.debugLine="HandleLocalTemporaryState(\"Нет локальных треков\")";
parent._handlelocaltemporarystate("Нет локальных треков");
 //BA.debugLineNum = 282;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handleshutdownmessage(String _text) throws Exception{
String _safetext = "";
 //BA.debugLineNum = 222;BA.debugLine="Public Sub HandleShutdownMessage(text As String)";
 //BA.debugLineNum = 223;BA.debugLine="Dim safeText As String = text";
_safetext = _text;
 //BA.debugLineNum = 224;BA.debugLine="If safeText = \"\" Then safeText = stateStore.Messa";
if ((_safetext).equals("")) { 
_safetext = _statestore._messagevalue /*String*/ ("server_wait");};
 //BA.debugLineNum = 225;BA.debugLine="stateStore.TraceLog(\"message shutdown text=\" & sa";
_statestore._tracelog /*String*/ ("message shutdown text="+_safetext);
 //BA.debugLineNum = 226;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"shutdown";
_statestore._setplaybackflowstate /*String*/ ("idle","shutdown");
 //BA.debugLineNum = 227;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
_statestore._clearpolicypauseandresumerequest /*String*/ ();
 //BA.debugLineNum = 228;BA.debugLine="stateStore.ClearPlaybackState";
_statestore._clearplaybackstate /*String*/ ();
 //BA.debugLineNum = 229;BA.debugLine="stateStore.HidePin";
_statestore._hidepin /*String*/ ();
 //BA.debugLineNum = 230;BA.debugLine="stateStore.EnterUserStoppedState";
_statestore._enteruserstoppedstate /*String*/ ();
 //BA.debugLineNum = 231;BA.debugLine="stateStore.SetPlayIcon";
_statestore._setplayicon /*String*/ ();
 //BA.debugLineNum = 232;BA.debugLine="stateStore.ShowMessage(safeText)";
_statestore._showmessage /*String*/ (_safetext);
 //BA.debugLineNum = 233;BA.debugLine="stateStore.DisableBackgroundRefreshTimers";
_statestore._disablebackgroundrefreshtimers /*String*/ ();
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public String  _handletemporarystate(String _mode,String _text) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub HandleTemporaryState(mode As String, te";
 //BA.debugLineNum = 154;BA.debugLine="stateStore.TraceLog(\"состояние temporary mode=\" &";
_statestore._tracelog /*String*/ ("состояние temporary mode="+_mode+" text="+_text);
 //BA.debugLineNum = 155;BA.debugLine="stateStore.ApplyTemporaryMode(mode)";
_statestore._applytemporarymode /*String*/ (_mode);
 //BA.debugLineNum = 156;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
_statestore._refreshconnectionindicatorstate /*String*/ ();
 //BA.debugLineNum = 157;BA.debugLine="stateStore.ClearPlaybackState";
_statestore._clearplaybackstate /*String*/ ();
 //BA.debugLineNum = 158;BA.debugLine="stateStore.HidePin";
_statestore._hidepin /*String*/ ();
 //BA.debugLineNum = 159;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
 //BA.debugLineNum = 160;BA.debugLine="stateStore.ShowMessage(text)";
_statestore._showmessage /*String*/ (_text);
 }else if((_mode).equals("network")) { 
 //BA.debugLineNum = 162;BA.debugLine="stateStore.ShowMessage(\"Проверьте интернет\")";
_statestore._showmessage /*String*/ ("Проверьте интернет");
 }else {
 //BA.debugLineNum = 164;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
_statestore._showmessage /*String*/ (_statestore._messagevalue /*String*/ ("server_wait"));
 };
 //BA.debugLineNum = 166;BA.debugLine="stateStore.ScheduleRetry(mode, 0)";
_statestore._scheduleretry /*String*/ (_mode,(int) (0));
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public boolean  _hasanycachedtrackinplaylist(anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
 //BA.debugLineNum = 344;BA.debugLine="Private Sub HasAnyCachedTrackInPlaylist(playlistDa";
 //BA.debugLineNum = 345;BA.debugLine="If playlistData.IsInitialized = False Then Return";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 346;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 347;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 348;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group4 = _tracks;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_trackobject = group4.Get(index4);
 //BA.debugLineNum = 349;BA.debugLine="If (trackObject Is Map) = False Then Continue";
if ((_trackobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 350;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
 //BA.debugLineNum = 351;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\", \"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 352;BA.debugLine="If trackId = \"\" Then Continue";
if ((_trackid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 353;BA.debugLine="If stateStore.IsTrackCached(trackId) Then Return";
if (_statestore._istrackcached /*boolean*/ (_trackid)) { 
if (true) return __c.True;};
 }
};
 //BA.debugLineNum = 355;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return false;
}
public boolean  _hasplayablelocaltrackincurrentslot(anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
 //BA.debugLineNum = 294;BA.debugLine="Public Sub HasPlayableLocalTrackInCurrentSlot(offl";
 //BA.debugLineNum = 295;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveDataSl";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = _statestore._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_offlinedata,_effectivenowticks);
 //BA.debugLineNum = 296;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 297;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
 //BA.debugLineNum = 298;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 299;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group5 = _playlists;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_playlistobject = group5.Get(index5);
 //BA.debugLineNum = 300;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 301;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 302;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 303;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 304;BA.debugLine="Dim playlistData As Map = stateStore.LoadCachedP";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = _statestore._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (_playlistid);
 //BA.debugLineNum = 305;BA.debugLine="If HasAnyCachedTrackInPlaylist(playlistData) The";
if (_hasanycachedtrackinplaylist(_playlistdata)) { 
if (true) return __c.True;};
 }
};
 //BA.debugLineNum = 307;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.example.playerstatestore _store,b4a.example.networksyncservice _syncworker) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(store As PlayerStateStore, s";
 //BA.debugLineNum = 11;BA.debugLine="stateStore = store";
_statestore = _store;
 //BA.debugLineNum = 12;BA.debugLine="syncService = syncWorker";
_syncservice = _syncworker;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public boolean  _isidleslot(anywheresoftware.b4a.objects.collections.Map _slotcontext) throws Exception{
anywheresoftware.b4a.objects.collections.List _playlists = null;
String _streamid = "";
String _streamtitle = "";
 //BA.debugLineNum = 449;BA.debugLine="Private Sub IsIdleSlot(slotContext As Map) As Bool";
 //BA.debugLineNum = 450;BA.debugLine="If slotContext.IsInitialized = False Or slotConte";
if (_slotcontext.IsInitialized()==__c.False || _slotcontext.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 451;BA.debugLine="Dim playlists As List = slotContext.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slotcontext.GetDefault((Object)("playlists"),__c.Null)));
 //BA.debugLineNum = 452;BA.debugLine="If playlists.IsInitialized And playlists.Size > 0";
if (_playlists.IsInitialized() && _playlists.getSize()>0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 453;BA.debugLine="Dim streamId As String = slotContext.GetDefault(\"";
_streamid = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_id"),(Object)("")));
 //BA.debugLineNum = 454;BA.debugLine="Dim streamTitle As String = slotContext.GetDefaul";
_streamtitle = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_title"),(Object)("")));
 //BA.debugLineNum = 455;BA.debugLine="Return streamId = \"\" And streamTitle = \"\"";
if (true) return (_streamid).equals("") && (_streamtitle).equals("");
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackallowed(anywheresoftware.b4a.objects.collections.Map _data,long _effectivenowticks) throws Exception{
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _endtimestamp = 0L;
 //BA.debugLineNum = 16;BA.debugLine="Public Sub IsPlaybackAllowed(data As Map, effectiv";
 //BA.debugLineNum = 17;BA.debugLine="If data.IsInitialized = False Then Return True";
if (_data.IsInitialized()==__c.False) { 
if (true) return __c.True;};
 //BA.debugLineNum = 18;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(_createinitializedmap().getObject()))));
 //BA.debugLineNum = 19;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
 //BA.debugLineNum = 20;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 };
 //BA.debugLineNum = 22;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = _resolveplaybackendtimestamp(_data);
 //BA.debugLineNum = 23;BA.debugLine="If endTimestamp <= 0 Then Return True";
if (_endtimestamp<=0) { 
if (true) return __c.True;};
 //BA.debugLineNum = 24;BA.debugLine="Return effectiveNowTicks < (endTimestamp * 1000)";
if (true) return _effectivenowticks<(_endtimestamp*1000);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return false;
}
public long  _parsedateonlyendtimestamp(String _textvalue) throws Exception{
String _previousdateformat = "";
long _daystartticks = 0L;
 //BA.debugLineNum = 429;BA.debugLine="Private Sub ParseDateOnlyEndTimestamp(textValue As";
 //BA.debugLineNum = 430;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 431;BA.debugLine="Try";
try { //BA.debugLineNum = 432;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 433;BA.debugLine="Dim dayStartTicks As Long = DateTime.DateParse(t";
_daystartticks = __c.DateTime.DateParse(_textvalue);
 //BA.debugLineNum = 434;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
 //BA.debugLineNum = 435;BA.debugLine="Return Floor((dayStartTicks + DateTime.TicksPerD";
if (true) return (long) (__c.Floor((_daystartticks+__c.DateTime.TicksPerDay)/(double)1000));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 437;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
 //BA.debugLineNum = 438;BA.debugLine="stateStore.ConsumeLastException";
_statestore._consumelastexception /*String*/ ();
 //BA.debugLineNum = 439;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return 0L;
}
public long  _parseendvaluetotimestamp(Object _value) throws Exception{
String _textvalue = "";
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetime = null;
 //BA.debugLineNum = 377;BA.debugLine="Private Sub ParseEndValueToTimestamp(value As Obje";
 //BA.debugLineNum = 378;BA.debugLine="If value = Null Then Return 0";
if (_value== null) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 379;BA.debugLine="Dim textValue As String = (\"\" & value).Trim";
_textvalue = (""+BA.ObjectToString(_value)).trim();
 //BA.debugLineNum = 380;BA.debugLine="If textValue = \"\" Then Return 0";
if ((_textvalue).equals("")) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 381;BA.debugLine="If Regex.IsMatch(\"^\\d+$\", textValue) Then Return";
if (__c.Regex.IsMatch("^\\d+$",_textvalue)) { 
if (true) return (long) (__c.Floor((double)(Double.parseDouble(_textvalue))));};
 //BA.debugLineNum = 382;BA.debugLine="If Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}$\", textValue";
if (__c.Regex.IsMatch("^\\d{4}-\\d{2}-\\d{2}$",_textvalue)) { 
 //BA.debugLineNum = 383;BA.debugLine="Return ParseDateOnlyEndTimestamp(textValue)";
if (true) return _parsedateonlyendtimestamp(_textvalue);
 };
 //BA.debugLineNum = 385;BA.debugLine="Try";
try { //BA.debugLineNum = 386;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 387;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
 //BA.debugLineNum = 388;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
 //BA.debugLineNum = 389;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 391;BA.debugLine="stateStore.ConsumeLastException";
_statestore._consumelastexception /*String*/ ();
 };
 //BA.debugLineNum = 393;BA.debugLine="Try";
try { //BA.debugLineNum = 394;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 395;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time.";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
 //BA.debugLineNum = 396;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTim";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
 //BA.debugLineNum = 397;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunMe";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
 //BA.debugLineNum = 398;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e23) {
			ba.setLastException(e23); //BA.debugLineNum = 400;BA.debugLine="stateStore.ConsumeLastException";
_statestore._consumelastexception /*String*/ ();
 };
 //BA.debugLineNum = 402;BA.debugLine="stateStore.TraceLog(\"player end parse fail value=";
_statestore._tracelog /*String*/ ("player end parse fail value="+_textvalue);
 //BA.debugLineNum = 403;BA.debugLine="Return 0";
if (true) return (long) (0);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return 0L;
}
public long  _parsetrustedonlineticks(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
String _updatedtext = "";
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetime = null;
 //BA.debugLineNum = 406;BA.debugLine="Private Sub ParseTrustedOnlineTicks(data As Map) A";
 //BA.debugLineNum = 407;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 408;BA.debugLine="Dim updatedText As String = (\"\" & data.GetDefault";
_updatedtext = (""+BA.ObjectToString(_data.GetDefault((Object)("updated"),(Object)("")))).trim();
 //BA.debugLineNum = 409;BA.debugLine="If updatedText = \"\" Then Return 0";
if ((_updatedtext).equals("")) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 410;BA.debugLine="Try";
try { //BA.debugLineNum = 411;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 412;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
 //BA.debugLineNum = 413;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
 //BA.debugLineNum = 414;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 416;BA.debugLine="Try";
try { //BA.debugLineNum = 417;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 418;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
 //BA.debugLineNum = 419;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTi";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
 //BA.debugLineNum = 420;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunM";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
 //BA.debugLineNum = 421;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 423;BA.debugLine="stateStore.ConsumeLastException";
_statestore._consumelastexception /*String*/ ();
 };
 };
 //BA.debugLineNum = 426;BA.debugLine="Return 0";
if (true) return (long) (0);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return 0L;
}
public String  _pauseplaybackbypolicy(String _reason,String _connectionmode) throws Exception{
String _safereason = "";
 //BA.debugLineNum = 286;BA.debugLine="Public Sub PausePlaybackByPolicy(reason As String,";
 //BA.debugLineNum = 287;BA.debugLine="Dim safeReason As String = reason";
_safereason = _reason;
 //BA.debugLineNum = 288;BA.debugLine="If safeReason = \"\" Then safeReason = stateStore.M";
if ((_safereason).equals("")) { 
_safereason = _statestore._messagevalue /*String*/ ("playback_paused");};
 //BA.debugLineNum = 289;BA.debugLine="stateStore.EnterPolicyPause(safeReason, connectio";
_statestore._enterpolicypause /*String*/ (_safereason,_connectionmode);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _refreshofflinedatanow(int _fetchtimeoutms) throws Exception{
ResumableSub_RefreshOfflineDataNow rsub = new ResumableSub_RefreshOfflineDataNow(this,_fetchtimeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RefreshOfflineDataNow extends BA.ResumableSub {
public ResumableSub_RefreshOfflineDataNow(b4a.example.playbackdatacoordinator parent,int _fetchtimeoutms) {
this.parent = parent;
this._fetchtimeoutms = _fetchtimeoutms;
}
b4a.example.playbackdatacoordinator parent;
int _fetchtimeoutms;
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 73;BA.debugLine="If stateStore.PlayerCodeValue = \"\" Then Return Fa";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._statestore._playercodevalue /*String*/ ()).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 74;BA.debugLine="If stateStore.BeginOfflineDataRefresh = False The";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._statestore._beginofflinedatarefresh /*boolean*/ ()==parent.__c.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 75;BA.debugLine="stateStore.TraceInfo(\"network\", \"запрос данных\",";
parent._statestore._traceinfo /*String*/ ("network","запрос данных","");
 //BA.debugLineNum = 76;BA.debugLine="Wait For (syncService.FetchData(fetchTimeoutMs))";
parent.__c.WaitFor("complete", ba, this, parent._syncservice._fetchdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_fetchtimeoutms));
this.state = 55;
return;
case 55:
//C
this.state = 13;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 77;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
if (true) break;

case 13:
//if
this.state = 16;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 78;BA.debugLine="stateStore.IncrementNetworkErrorCount";
parent._statestore._incrementnetworkerrorcount /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="stateStore.TraceWarn(\"network\", \"data ошибка\", \"";
parent._statestore._tracewarn /*String*/ ("network","data ошибка","kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" lastDataOkAgoSec="+parent._statestore._secondsagotext /*String*/ (parent._statestore._getlastdataokat /*long*/ ()));
 //BA.debugLineNum = 80;BA.debugLine="stateStore.EndOfflineDataRefresh(\"http_failed\")";
parent._statestore._endofflinedatarefresh /*String*/ ("http_failed");
 //BA.debugLineNum = 81;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
parent._statestore._writehealthsnapshot /*String*/ ("ошибка_data");
 //BA.debugLineNum = 82;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 84;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
 //BA.debugLineNum = 85;BA.debugLine="If resultData Is Map Then";
if (true) break;

case 17:
//if
this.state = 54;
if (_resultdata instanceof java.util.Map) { 
this.state = 19;
}else {
this.state = 53;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 86;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
 //BA.debugLineNum = 87;BA.debugLine="If data.GetDefault(\"ok\", False) = True And data.";
if (true) break;

case 20:
//if
this.state = 48;
if ((_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) && (_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("data"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 88;BA.debugLine="stateStore.SetLastDataOkNow";
parent._statestore._setlastdataoknow /*String*/ ();
 //BA.debugLineNum = 89;BA.debugLine="stateStore.ResetConsecutiveNetworkErrors";
parent._statestore._resetconsecutivenetworkerrors /*String*/ ();
 //BA.debugLineNum = 90;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"data";
parent._statestore._setlastofflinedatarefreshstate /*String*/ ("data");
 //BA.debugLineNum = 91;BA.debugLine="UpdateTrustedOnlineTimeFromData(data, stateStor";
parent._updatetrustedonlinetimefromdata(_data,parent._statestore._storage /*b4a.example.keyvaluestore*/ (),parent._statestore._trustedsynctimekey /*String*/ ());
 //BA.debugLineNum = 92;BA.debugLine="stateStore.SaveOfflineData(data)";
parent._statestore._saveofflinedata /*String*/ (_data);
 //BA.debugLineNum = 93;BA.debugLine="stateStore.CheckForAppUpdate(data)";
parent._statestore._checkforappupdate /*String*/ (_data);
 //BA.debugLineNum = 94;BA.debugLine="If stateStore.IsTraceUploadEnabled Then stateSt";
if (true) break;

case 23:
//if
this.state = 28;
if (parent._statestore._istraceuploadenabled /*boolean*/ ()) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
parent._statestore._flushtracebufferasync /*String*/ ();
if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 95;BA.debugLine="stateStore.InvalidateRelevantTrackIdsCache";
parent._statestore._invalidaterelevanttrackidscache /*String*/ ();
 //BA.debugLineNum = 96;BA.debugLine="stateStore.SetRemoteDataReady";
parent._statestore._setremotedataready /*String*/ ();
 //BA.debugLineNum = 97;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
parent._statestore._refreshconnectionindicatorstate /*String*/ ();
 //BA.debugLineNum = 98;BA.debugLine="stateStore.TraceInfo(\"network\", \"data загружены";
parent._statestore._traceinfo /*String*/ ("network","data загружены","trace="+BA.ObjectToString(parent._statestore._istraceuploadenabled /*boolean*/ ()));
 //BA.debugLineNum = 99;BA.debugLine="stateStore.WriteHealthSnapshot(\"data\")";
parent._statestore._writehealthsnapshot /*String*/ ("data");
 //BA.debugLineNum = 100;BA.debugLine="Wait For (stateStore.SyncOfflinePlaylistMetadat";
parent.__c.WaitFor("complete", ba, this, parent._statestore._syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 56;
return;
case 56:
//C
this.state = 29;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 101;BA.debugLine="If stateStore.IsStartupSequenceInProgress Then";
if (true) break;

case 29:
//if
this.state = 34;
if (parent._statestore._isstartupsequenceinprogress /*boolean*/ ()) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
 //BA.debugLineNum = 102;BA.debugLine="stateStore.DeferAdWarmupAfterStartup";
parent._statestore._deferadwarmupafterstartup /*String*/ ();
 if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 104;BA.debugLine="stateStore.EnsureAdCacheSyncAsync";
parent._statestore._ensureadcachesyncasync /*String*/ ();
 if (true) break;
;
 //BA.debugLineNum = 106;BA.debugLine="If IsPlaybackAllowed(stateStore.OfflineData, st";

case 34:
//if
this.state = 37;
if (parent._isplaybackallowed(parent._statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (),parent._statestore._effectivenowticks /*long*/ ())==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 107;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReas";
parent._pauseplaybackbypolicy(parent._resolveplaybackblockreason(parent._statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (),parent._statestore._effectivenowticks /*long*/ ()),"server");
 //BA.debugLineNum = 108;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
parent._statestore._endofflinedatarefresh /*String*/ ("data");
 //BA.debugLineNum = 109;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 111;BA.debugLine="If stateStore.ResumePlaybackWhenServerAllows An";

case 37:
//if
this.state = 40;
if (parent._statestore._resumeplaybackwhenserverallows /*boolean*/ () && parent._statestore._shouldresumewithnewstart /*boolean*/ ()==parent.__c.False && parent._statestore._isuserstoppedstate /*boolean*/ ()==parent.__c.False && parent._statestore._isstopping /*boolean*/ ()==parent.__c.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 112;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=s";
parent._statestore._tracelog /*String*/ ("policy resume авто mode=server_allow");
 //BA.debugLineNum = 113;BA.debugLine="stateStore.ClearResumePlaybackWhenServerAllows";
parent._statestore._clearresumeplaybackwhenserverallows /*String*/ ();
 //BA.debugLineNum = 114;BA.debugLine="stateStore.EnterStartedState";
parent._statestore._enterstartedstate /*String*/ ();
 //BA.debugLineNum = 115;BA.debugLine="stateStore.SetStopIcon";
parent._statestore._setstopicon /*String*/ ();
 //BA.debugLineNum = 116;BA.debugLine="stateStore.HideContentBlocks";
parent._statestore._hidecontentblocks /*String*/ ();
 //BA.debugLineNum = 117;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsync";
parent._statestore._resumeplaybackafterpolicypauseasync /*String*/ ();
 if (true) break;
;
 //BA.debugLineNum = 119;BA.debugLine="If stateStore.IsPolicyPauseState Then";

case 40:
//if
this.state = 47;
if (parent._statestore._ispolicypausestate /*boolean*/ ()) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 //BA.debugLineNum = 120;BA.debugLine="stateStore.ClearPolicyPause";
parent._statestore._clearpolicypause /*String*/ ();
 //BA.debugLineNum = 121;BA.debugLine="If stateStore.IsUserStoppedState = False And s";
if (true) break;

case 43:
//if
this.state = 46;
if (parent._statestore._isuserstoppedstate /*boolean*/ ()==parent.__c.False && parent._statestore._isplaybackstarted /*boolean*/ ()==parent.__c.False && parent._statestore._isstopping /*boolean*/ ()==parent.__c.False) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 122;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=";
parent._statestore._tracelog /*String*/ ("policy resume авто mode=policy_pause_clear");
 //BA.debugLineNum = 123;BA.debugLine="stateStore.EnterStartedState";
parent._statestore._enterstartedstate /*String*/ ();
 //BA.debugLineNum = 124;BA.debugLine="stateStore.SetStopIcon";
parent._statestore._setstopicon /*String*/ ();
 //BA.debugLineNum = 125;BA.debugLine="stateStore.HideContentBlocks";
parent._statestore._hidecontentblocks /*String*/ ();
 //BA.debugLineNum = 126;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsyn";
parent._statestore._resumeplaybackafterpolicypauseasync /*String*/ ();
 if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
 //BA.debugLineNum = 129;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
parent._statestore._endofflinedatarefresh /*String*/ ("data");
 //BA.debugLineNum = 130;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 132;BA.debugLine="If data.GetDefault(\"type\", \"\") = \"message\" Then";

case 48:
//if
this.state = 51;
if ((_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("message"))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 //BA.debugLineNum = 133;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"mess";
parent._statestore._setlastofflinedatarefreshstate /*String*/ ("message");
 //BA.debugLineNum = 134;BA.debugLine="stateStore.TraceWarn(\"network\", \"data сообщение";
parent._statestore._tracewarn /*String*/ ("network","data сообщение","action="+BA.ObjectToString(_data.GetDefault((Object)("action"),(Object)("")))+" reason="+BA.ObjectToString(_data.GetDefault((Object)("reason"),(Object)(""))));
 //BA.debugLineNum = 135;BA.debugLine="stateStore.HandleMessageItem(data)";
parent._statestore._handlemessageitem /*String*/ (_data);
 //BA.debugLineNum = 136;BA.debugLine="stateStore.EndOfflineDataRefresh(\"message\")";
parent._statestore._endofflinedatarefresh /*String*/ ("message");
 //BA.debugLineNum = 137;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 51:
//C
this.state = 54;
;
 //BA.debugLineNum = 139;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
parent._statestore._setlastofflinedatarefreshstate /*String*/ ("invalid_data");
 //BA.debugLineNum = 140;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
parent._statestore._tracewarn /*String*/ ("network","data некорректны","type="+BA.ObjectToString(_data.GetDefault((Object)("type"),(Object)("")))+" ok="+BA.ObjectToString(_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))));
 //BA.debugLineNum = 141;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
parent._pauseplaybackbypolicy(parent._statestore._messagevalue /*String*/ ("invalid_data_response"),"server");
 if (true) break;

case 53:
//C
this.state = 54;
 //BA.debugLineNum = 143;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
parent._statestore._setlastofflinedatarefreshstate /*String*/ ("invalid_payload");
 //BA.debugLineNum = 144;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
parent._statestore._tracewarn /*String*/ ("network","data некорректны","payload=not_map");
 //BA.debugLineNum = 145;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
parent._pauseplaybackbypolicy(parent._statestore._messagevalue /*String*/ ("invalid_data_response"),"server");
 if (true) break;

case 54:
//C
this.state = -1;
;
 //BA.debugLineNum = 147;BA.debugLine="stateStore.EndOfflineDataRefresh(stateStore.LastO";
parent._statestore._endofflinedatarefresh /*String*/ (parent._statestore._lastofflinedatarefreshstate /*String*/ ());
 //BA.debugLineNum = 148;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
parent._statestore._writehealthsnapshot /*String*/ ("ошибка_data");
 //BA.debugLineNum = 149;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4a.objects.collections.Map _result) throws Exception{
}
public String  _resetretrydelay(int _localretryinitial,int _serverretryinitial) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Public Sub ResetRetryDelay(localRetryInitial As In";
 //BA.debugLineNum = 270;BA.debugLine="stateStore.ResetRetryDelayState(localRetryInitial";
_statestore._resetretrydelaystate /*String*/ (_localretryinitial,_serverretryinitial);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public String  _resolveidleuntilmessage(anywheresoftware.b4a.objects.collections.Map _offlinedata,long _effectivenowticks) throws Exception{
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.Map _nextslot = null;
String _nexttime = "";
 //BA.debugLineNum = 359;BA.debugLine="Public Sub ResolveIdleUntilMessage(offlineData As";
 //BA.debugLineNum = 360;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 361;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveCurren";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = _statestore._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (_offlinedata);
 //BA.debugLineNum = 362;BA.debugLine="If IsIdleSlot(currentSlot) = False Then Return \"\"";
if (_isidleslot(_currentslot)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 363;BA.debugLine="Dim nextSlot As Map = stateStore.ResolveNextDataS";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = _statestore._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_offlinedata,_effectivenowticks);
 //BA.debugLineNum = 364;BA.debugLine="Dim nextTime As String = nextSlot.GetDefault(\"slo";
_nexttime = BA.ObjectToString(_nextslot.GetDefault((Object)("slot_time"),(Object)("")));
 //BA.debugLineNum = 365;BA.debugLine="If nextTime = \"\" Then Return stateStore.MessageVa";
if ((_nexttime).equals("")) { 
if (true) return _statestore._messagevalue /*String*/ ("idle");};
 //BA.debugLineNum = 366;BA.debugLine="Return stateStore.MessageValue(\"idle_until\").Repl";
if (true) return _statestore._messagevalue /*String*/ ("idle_until").replace("{time}",_nexttime);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaybackblockreason(anywheresoftware.b4a.objects.collections.Map _data,long _effectivenowticks) throws Exception{
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
String _pausereason = "";
long _endtimestamp = 0L;
 //BA.debugLineNum = 28;BA.debugLine="Public Sub ResolvePlaybackBlockReason(data As Map,";
 //BA.debugLineNum = 29;BA.debugLine="If data.IsInitialized = False Then Return stateSt";
if (_data.IsInitialized()==__c.False) { 
if (true) return _statestore._messagevalue /*String*/ ("playback_paused");};
 //BA.debugLineNum = 30;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(_createinitializedmap().getObject()))));
 //BA.debugLineNum = 31;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
 //BA.debugLineNum = 32;BA.debugLine="Dim pauseReason As String = playerData.GetDefaul";
_pausereason = BA.ObjectToString(_playerdata.GetDefault((Object)("pause_reason"),(Object)("")));
 //BA.debugLineNum = 33;BA.debugLine="If pauseReason <> \"\" Then Return pauseReason";
if ((_pausereason).equals("") == false) { 
if (true) return _pausereason;};
 };
 //BA.debugLineNum = 35;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = _resolveplaybackendtimestamp(_data);
 //BA.debugLineNum = 36;BA.debugLine="If endTimestamp > 0 And effectiveNowTicks >= (end";
if (_endtimestamp>0 && _effectivenowticks>=(_endtimestamp*1000)) { 
if (true) return _statestore._messagevalue /*String*/ ("subscription_expired");};
 //BA.debugLineNum = 37;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
 //BA.debugLineNum = 38;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return _statestore._messagevalue /*String*/ ("playback_paused");};
 };
 //BA.debugLineNum = 40;BA.debugLine="Return stateStore.MessageValue(\"playback_paused\")";
if (true) return _statestore._messagevalue /*String*/ ("playback_paused");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public long  _resolveplaybackendtimestamp(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _playerend = 0L;
 //BA.debugLineNum = 44;BA.debugLine="Public Sub ResolvePlaybackEndTimestamp(data As Map";
 //BA.debugLineNum = 45;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 46;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(_createinitializedmap().getObject()))));
 //BA.debugLineNum = 47;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
 //BA.debugLineNum = 48;BA.debugLine="Dim playerEnd As Long = ParseEndValueToTimestamp";
_playerend = _parseendvaluetotimestamp(_playerdata.Get((Object)("end")));
 //BA.debugLineNum = 49;BA.debugLine="If playerEnd > 0 Then Return playerEnd";
if (_playerend>0) { 
if (true) return _playerend;};
 };
 //BA.debugLineNum = 51;BA.debugLine="Return ParseEndValueToTimestamp(data.Get(\"end\"))";
if (true) return _parseendvaluetotimestamp(_data.Get((Object)("end")));
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return 0L;
}
public int  _resolveretrydelay(String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
 //BA.debugLineNum = 254;BA.debugLine="Return stateStore.ResolveRetryDelay(mode, delayMs";
if (true) return _statestore._resolveretrydelay /*int*/ (_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return 0;
}
public String  _scheduleretry(String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
 //BA.debugLineNum = 259;BA.debugLine="stateStore.ClearRetryTimer";
_statestore._clearretrytimer /*String*/ ();
 //BA.debugLineNum = 260;BA.debugLine="stateStore.SetLastRetryMode(mode)";
_statestore._setlastretrymode /*String*/ (_mode);
 //BA.debugLineNum = 261;BA.debugLine="stateStore.SetRetryInterval(ResolveRetryDelay(mod";
_statestore._setretryinterval /*String*/ (_resolveretrydelay(_mode,_delayms,_localretrymax,_serverretrymax,_blockedretrydelay));
 //BA.debugLineNum = 262;BA.debugLine="If stateStore.IsPlaybackStarted = False Or stateS";
if (_statestore._isplaybackstarted /*boolean*/ ()==__c.False || _statestore._isstoppedbyuser /*boolean*/ ()) { 
if (true) return "";};
 //BA.debugLineNum = 263;BA.debugLine="If stateStore.IsPlaybackPausedByPolicy And mode <";
if (_statestore._isplaybackpausedbypolicy /*boolean*/ () && (_mode).equals("blocked") == false && (_mode).equals("audio_device") == false) { 
if (true) return "";};
 //BA.debugLineNum = 264;BA.debugLine="stateStore.TraceWarn(\"network\", \"переход в retry\"";
_statestore._tracewarn /*String*/ ("network","переход в retry","mode="+_mode+" delaySec="+BA.NumberToString(__c.Floor(_statestore._getretryinterval /*int*/ ()/(double)1000)));
 //BA.debugLineNum = 265;BA.debugLine="stateStore.WriteHealthSnapshot(\"retry\")";
_statestore._writehealthsnapshot /*String*/ ("retry");
 //BA.debugLineNum = 266;BA.debugLine="stateStore.EnableRetryTimer";
_statestore._enableretrytimer /*String*/ ();
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public String  _stopformissingdata(String _text) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub StopForMissingData(text As String)";
 //BA.debugLineNum = 178;BA.debugLine="stateStore.TraceLog(\"состояние stop reason=missin";
_statestore._tracelog /*String*/ ("состояние stop reason=missing_data text="+_text);
 //BA.debugLineNum = 179;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"missing_";
_statestore._setplaybackflowstate /*String*/ ("idle","missing_data");
 //BA.debugLineNum = 180;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
_statestore._clearpolicypauseandresumerequest /*String*/ ();
 //BA.debugLineNum = 181;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
_statestore._refreshconnectionindicatorstate /*String*/ ();
 //BA.debugLineNum = 182;BA.debugLine="stateStore.ClearPlaybackState";
_statestore._clearplaybackstate /*String*/ ();
 //BA.debugLineNum = 183;BA.debugLine="stateStore.HidePin";
_statestore._hidepin /*String*/ ();
 //BA.debugLineNum = 184;BA.debugLine="stateStore.EnterUserStoppedState";
_statestore._enteruserstoppedstate /*String*/ ();
 //BA.debugLineNum = 185;BA.debugLine="stateStore.SetPlayIcon";
_statestore._setplayicon /*String*/ ();
 //BA.debugLineNum = 186;BA.debugLine="stateStore.ShowMessage(text)";
_statestore._showmessage /*String*/ (_text);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _updatetrustedonlinetimefromdata(anywheresoftware.b4a.objects.collections.Map _data,b4a.example.keyvaluestore _storage,String _storagekey) throws Exception{
long _candidateticks = 0L;
 //BA.debugLineNum = 55;BA.debugLine="Public Sub UpdateTrustedOnlineTimeFromData(data As";
 //BA.debugLineNum = 56;BA.debugLine="Dim candidateTicks As Long = ParseTrustedOnlineTi";
_candidateticks = _parsetrustedonlineticks(_data);
 //BA.debugLineNum = 57;BA.debugLine="If candidateTicks <= 0 Then candidateTicks = Date";
if (_candidateticks<=0) { 
_candidateticks = __c.DateTime.getNow();};
 //BA.debugLineNum = 58;BA.debugLine="UpdateTrustedOnlineTimeTicks(candidateTicks, stor";
_updatetrustedonlinetimeticks(_candidateticks,_storage,_storagekey);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _updatetrustedonlinetimeticks(long _candidateticks,b4a.example.keyvaluestore _storage,String _storagekey) throws Exception{
long _storedticks = 0L;
long _localsyncticks = 0L;
 //BA.debugLineNum = 61;BA.debugLine="Public Sub UpdateTrustedOnlineTimeTicks(candidateT";
 //BA.debugLineNum = 62;BA.debugLine="If candidateTicks <= 0 Then Return";
if (_candidateticks<=0) { 
if (true) return "";};
 //BA.debugLineNum = 63;BA.debugLine="Dim storedTicks As Long = storage.GetDefault(stor";
_storedticks = BA.ObjectToLongNumber(_storage._getdefault /*Object*/ (_storagekey,(Object)(0)));
 //BA.debugLineNum = 64;BA.debugLine="If candidateTicks <= storedTicks Then Return";
if (_candidateticks<=_storedticks) { 
if (true) return "";};
 //BA.debugLineNum = 65;BA.debugLine="Dim localSyncTicks As Long = DateTime.Now";
_localsyncticks = __c.DateTime.getNow();
 //BA.debugLineNum = 66;BA.debugLine="storage.Put(storageKey, candidateTicks)";
_storage._put /*String*/ (_storagekey,(Object)(_candidateticks));
 //BA.debugLineNum = 67;BA.debugLine="storage.Put(storageKey & \"_local\", localSyncTicks";
_storage._put /*String*/ (_storagekey+"_local",(Object)(_localsyncticks));
 //BA.debugLineNum = 68;BA.debugLine="stateStore.TraceLog(\"trusted time update ticks=\"";
_statestore._tracelog /*String*/ ("trusted time update ticks="+BA.NumberToString(_candidateticks));
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
