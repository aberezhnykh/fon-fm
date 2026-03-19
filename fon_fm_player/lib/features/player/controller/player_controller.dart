import 'dart:async';

import 'package:flutter/foundation.dart';

import '../../../core/api/fon_fm_api.dart';
import '../../../core/model/player_snapshot.dart';
import '../../../core/model/queue_item.dart';
import '../../../core/playback/audio_engine.dart';
import '../../../core/storage/app_storage.dart';
import 'player_state.dart';

class PlayerController extends ChangeNotifier {
  PlayerController({
    required FonFmApi api,
    required AppStorage storage,
    required AudioEngine audioEngine,
  })  : _api = api,
        _storage = storage,
        _audio = audioEngine;

  static const String appVersion = '1.0.1';
  static const Duration _historyLogDelay = Duration(seconds: 15);
  static const Duration _stopFade = Duration(seconds: 3);
  static const Duration _prefetchThreshold = Duration(seconds: 10);
  static const Duration _offlineInitialRetry = Duration(seconds: 5);
  static const Duration _offlineMaxRetry = Duration(seconds: 30);
  static const Duration _serverInitialRetry = Duration(seconds: 10);
  static const Duration _serverMaxRetry = Duration(seconds: 60);
  static const Duration _blockedRetry = Duration(seconds: 60);
  static const Duration _idleFallbackRetry = Duration(minutes: 5);

  final FonFmApi _api;
  final AppStorage _storage;
  final AudioEngine _audio;

  PlayerState _state = PlayerState.initial();
  PlayerState get state => _state;

  StreamSubscription<Duration>? _positionSub;
  StreamSubscription<void>? _completedSub;
  Timer? _retryTimer;
  Timer? _historyTimer;
  Timer? _breakTimer;

  String? _nextStartMode;
  int? _playlistIndex;
  int? _scheduledBreakAt;
  QueueItem? _currentItem;
  DateTime? _currentItemStartedAt;
  bool _prefetchDone = false;
  bool _isQueueTransitioning = false;
  bool _isStopping = false;
  Duration _offlineRetryDelay = _offlineInitialRetry;
  Duration _serverRetryDelay = _serverInitialRetry;

  int get _tzOffsetMinutes => -DateTime.now().timeZoneOffset.inMinutes;

  Future<void> initialize() async {
    final snapshot = await _storage.loadSnapshot();
    final deviceId = snapshot.deviceId.isNotEmpty
        ? snapshot.deviceId
        : _createDeviceId();
    final playerCode = _normalizePlayerCode(snapshot.playerCode);

    _positionSub = _audio.positionStream.listen(_onPosition);
    _completedSub = _audio.completedStream.listen((_) async {
      if (!_state.isPlaying) {
        return;
      }
      await _playPreparedOrLoadNext();
    });

    _setState(_state.copyWith(
      isInitialized: true,
      deviceId: deviceId,
      playerCode: playerCode,
      screenMode: playerCode.isEmpty
          ? PlayerScreenMode.setup
          : PlayerScreenMode.player,
    ));

    await _persistSnapshot(shouldRestorePlayback: snapshot.shouldRestorePlayback);

    if (playerCode.isNotEmpty) {
      await refreshMeta();
      _applyStoppedState();
      if (snapshot.shouldRestorePlayback) {
        await startPlayback(mode: 'auto');
      }
    }
  }

  Future<void> refreshMeta() async {
    if (_state.playerCode.isEmpty) {
      return;
    }

    try {
      final meta = await _api.fetchMeta(
        player: _state.playerCode,
        tzOffsetMinutes: _tzOffsetMinutes,
      );
      _setState(_state.copyWith(
        playerMeta: meta,
        clearPlayerMeta: meta == null,
      ));
    } catch (_) {
      _setState(_state.copyWith(clearPlayerMeta: true));
    }
  }

  Future<void> submitPlayerCode(String value) async {
    final normalized = _normalizePlayerCode(value);
    if (normalized.isEmpty) {
      _setState(_state.copyWith(
        screenMode: PlayerScreenMode.setup,
        setupMessage: 'Введите код из 5 символов',
      ));
      return;
    }

    _clearRuntimeOnlyState();
    _setState(_state.copyWith(
      playerCode: normalized,
      clearPlayerMeta: true,
      screenMode: PlayerScreenMode.player,
      playbackMode: PlaybackMode.stopped,
      setupMessage: 'Введите код плеера',
    ));
    await _persistSnapshot();
    await refreshMeta();
    _applyStoppedState();
  }

  void openSettings() {
    if (_state.playerCode.isEmpty) {
      showSetup();
      return;
    }

    _setState(_state.copyWith(
      screenMode: PlayerScreenMode.settings,
      setupMessage: 'Спасибо!',
    ));
  }

  void closeSettings() {
    _setState(_state.copyWith(screenMode: PlayerScreenMode.player));
  }

  void showSetup() {
    _setState(_state.copyWith(
      screenMode: PlayerScreenMode.setup,
      setupMessage: 'Введите код плеера',
    ));
  }

  Future<void> logout() async {
    await stopPlayback(useFade: false);
    _clearRuntimeOnlyState();
    _setState(_state.copyWith(
      playerCode: '',
      clearPlayerMeta: true,
      screenMode: PlayerScreenMode.setup,
      playbackMode: PlaybackMode.stopped,
      setupMessage: 'Введите код плеера',
      streamText: '',
      statusText: '',
      pendingClaimMessage: '',
      queue: const <QueueItem>[],
    ));
    await _persistSnapshot(shouldRestorePlayback: false);
  }

  Future<void> togglePlayback() async {
    if (_state.playerCode.isEmpty || _isStopping) {
      return;
    }

    if (_state.isPlaying) {
      await stopPlayback();
      return;
    }

    await startPlayback(mode: 'manual');
  }

  Future<void> startPlayback({String mode = 'manual'}) async {
    if (_state.playerCode.isEmpty || _isStopping) {
      return;
    }

    _nextStartMode = mode;
    _resetRetryDelays();
    _prefetchDone = false;

    _setState(_state.copyWith(
      screenMode: PlayerScreenMode.player,
      playbackMode: PlaybackMode.loading,
      isPlaying: true,
      statusText: '',
      pendingClaimMessage: '',
    ));
    await _persistSnapshot(shouldRestorePlayback: true);
    await _loadNextAndPlay();
  }

  Future<void> stopPlayback({bool useFade = true}) async {
    if (_isStopping) {
      return;
    }

    _isStopping = true;
    _cancelRetry();
    _cancelHistory();
    _cancelBreakWatch();

    if (useFade) {
      await _fadeOutAudio(_stopFade);
    } else {
      await _audio.stop();
    }

    await _audio.stop();
    _clearRuntimeOnlyState();
    _applyStoppedState();
    await _persistSnapshot(shouldRestorePlayback: false);
    _isStopping = false;
  }

  Future<void> confirmTakeover() async {
    if (_state.playerCode.isEmpty) {
      return;
    }

    _setState(_state.copyWith(canSubmitClaim: false));
    try {
      await _api.claim(
        player: _state.playerCode,
        device: _state.deviceId,
        tzOffsetMinutes: _tzOffsetMinutes,
      );
      _setState(_state.copyWith(canSubmitClaim: true));
      await startPlayback(mode: 'manual');
    } on FonFmApiException catch (e) {
      _showClaimPrompt(e.message);
      _setState(_state.copyWith(canSubmitClaim: true));
    } catch (_) {
      _showClaimPrompt('Плеер играет на другом устройстве. Играть здесь?');
      _setState(_state.copyWith(canSubmitClaim: true));
    }
  }

  void cancelTakeover() {
    _applyStoppedState();
  }

  String get displayPlayerCode => _state.playerCode.toUpperCase();

  String get headerText {
    final meta = _state.playerMeta;
    if (meta == null) {
      return displayPlayerCode;
    }
    if (meta.title.trim().isEmpty) {
      return meta.code.toUpperCase();
    }
    return '${meta.code.toUpperCase()} • ${meta.title.toUpperCase()}';
  }

  Future<void> _loadNextAndPlay() async {
    _cancelRetry();
    try {
      final response = await _api.fetchNext(
        player: _state.playerCode,
        device: _state.deviceId,
        tzOffsetMinutes: _tzOffsetMinutes,
        version: appVersion,
        startMode: _nextStartMode,
        playlistIndex: _playlistIndex,
      );
      _nextStartMode = null;
      _resetRetryDelays();

      if (response.queue.isEmpty) {
        _handleTemporaryState('Временная остановка', mode: 'server');
        return;
      }

      _setState(_state.copyWith(queue: List<QueueItem>.from(response.queue)));
      await _playQueueItem(_shiftQueueItem(), retryAfter: response.retryAfter);
    } on FonFmApiException catch (e) {
      _handleFetchFailure(e);
    } catch (_) {
      _handleTemporaryState('Временная остановка', mode: 'server');
    }
  }

  Future<void> _playPreparedOrLoadNext() async {
    if (_state.queue.isNotEmpty) {
      await _playQueueItem(_shiftQueueItem());
      return;
    }
    await _loadNextAndPlay();
  }

  Future<void> _playQueueItem(QueueItem? item, {int? retryAfter}) async {
    _cancelHistory();
    _cancelBreakWatch();
    _scheduledBreakAt = null;
    _currentItem = null;
    _currentItemStartedAt = null;

    if (item == null) {
      _handleTemporaryState('Временная остановка', mode: 'server');
      return;
    }

    switch (item.type) {
      case QueueItemType.message:
        if (item.action == 'claim') {
          _showClaimPrompt(
            item.message ?? 'Плеер играет на другом устройстве. Играть здесь?',
          );
        } else if (item.action == 'blocked') {
          _showBlockedState(item.message ?? 'Плеер заблокирован');
        } else if (item.action == 'not_found') {
          _stopForMissingData(item.message ?? 'Плеер не найден');
        } else {
          _handleTemporaryState(
            item.message ?? 'Временная остановка',
            mode: 'server',
          );
        }
        return;
      case QueueItemType.update:
        _handleTemporaryState(item.message ?? 'Требуется обновление', mode: 'server');
        return;
      case QueueItemType.idle:
        await _audio.stop();
        _clearPlaybackOnlyState();
        _setState(_state.copyWith(
          playbackMode: PlaybackMode.idle,
          isPlaying: true,
          streamText: '',
          statusText: item.message ?? 'Перерыв...',
        ));
        _scheduleRetry(
          _retryAfterToDuration(retryAfter) ?? _idleFallbackRetry,
          mode: 'server',
        );
        return;
      case QueueItemType.breakItem:
        if (item.items.isEmpty) {
          await _playPreparedOrLoadNext();
          return;
        }
        final queue = <QueueItem>[...item.items, ..._state.queue];
        _setState(_state.copyWith(queue: queue));
        await _playPreparedOrLoadNext();
        return;
      case QueueItemType.track:
      case QueueItemType.ad:
        break;
      case QueueItemType.unknown:
        _handleTemporaryState('Временная остановка', mode: 'server');
        return;
    }

    final url = _mediaUrl(item);
    if (url.isEmpty) {
      _handleTemporaryState('Временная остановка', mode: 'server');
      return;
    }

    if (item.playlist != null) {
      _playlistIndex = item.playlist;
    }

    _currentItem = item;
    _currentItemStartedAt = DateTime.now();
    _prefetchDone = false;

    _setState(_state.copyWith(
      playbackMode: PlaybackMode.playing,
      isPlaying: true,
      streamText: item.type == QueueItemType.ad ? 'Реклама' : (item.stream ?? ''),
      statusText: item.type == QueueItemType.ad
          ? (item.title ?? '')
          : _joinTrackMeta(item),
      pendingClaimMessage: '',
    ));

    if (item.type == QueueItemType.track) {
      _syncExactBreakState();
    }

    try {
      await _audio.setVolume(_resolveVolume(item));
      await _audio.setSourceUrl(url);
      await _audio.play();
      _scheduleHistory(item);
    } catch (_) {
      _handleTemporaryState('Временная остановка', mode: 'server');
    }
  }

  QueueItem? _shiftQueueItem() {
    if (_state.queue.isEmpty) {
      return null;
    }
    final queue = List<QueueItem>.from(_state.queue);
    final item = queue.removeAt(0);
    _setState(_state.copyWith(queue: queue));
    return item;
  }

  void _onPosition(Duration position) {
    if (!_state.isPlaying || _currentItem == null) {
      return;
    }

    if (_shouldTriggerBreakNow()) {
      unawaited(_fadeOutAndContinue());
      return;
    }

    if (_prefetchDone || _currentItem?.type != QueueItemType.track) {
      return;
    }

    final duration = _audio.duration;
    if (duration == null || duration <= Duration.zero) {
      return;
    }

    final remain = duration - position;
    if (remain <= _prefetchThreshold) {
      _prefetchDone = true;
      unawaited(_prefetchNext());
    }
  }

  Future<void> _prefetchNext() async {
    if (_state.queue.isNotEmpty || _hasPendingExactBreak()) {
      return;
    }

    try {
      final response = await _api.fetchNext(
        player: _state.playerCode,
        device: _state.deviceId,
        tzOffsetMinutes: _tzOffsetMinutes,
        version: appVersion,
        playlistIndex: _playlistIndex,
      );

      if (!_state.isPlaying || response.queue.isEmpty) {
        return;
      }

      _setState(_state.copyWith(queue: response.queue));
    } catch (_) {
      // best effort
    }
  }

  void _scheduleHistory(QueueItem item) {
    if (!item.isTrackLike || item.id == null || item.id!.isEmpty) {
      return;
    }

    final currentId = item.id!;
    final currentType = item.type == QueueItemType.ad ? 'ad' : 'track';
    final startedAt = _currentItemStartedAt ?? DateTime.now();

    _historyTimer = Timer(_historyLogDelay, () async {
      if (!_state.isPlaying) {
        return;
      }
      if (_currentItem?.id != currentId || _currentItem?.type != item.type) {
        return;
      }
      await _api.sendHistory(
        player: _state.playerCode,
        device: _state.deviceId,
        type: currentType,
        id: currentId,
        startedAt: startedAt,
      );
    });
  }

  void _syncExactBreakState() {
    QueueItem? breakItem;
    for (final item in _state.queue) {
      if (item.type == QueueItemType.breakItem &&
          item.exactly == true &&
          (item.at ?? 0) > 0) {
        breakItem = item;
        break;
      }
    }

    _scheduledBreakAt = breakItem?.at;
    _scheduleBreakWatch();
  }

  void _scheduleBreakWatch() {
    _cancelBreakWatch();
    if (!_hasPendingExactBreak()) {
      return;
    }

    final delaySeconds =
        (_scheduledBreakAt! - _localNowTimestamp()).clamp(0, 1 << 30);
    final delay = Duration(milliseconds: (delaySeconds * 1000) - 250);
    _breakTimer = Timer(delay.isNegative ? Duration.zero : delay, () {
      if (_shouldTriggerBreakNow()) {
        unawaited(_fadeOutAndContinue());
      }
    });
  }

  Future<void> _fadeOutAndContinue() async {
    if (_isQueueTransitioning) {
      return;
    }

    _isQueueTransitioning = true;
    _scheduledBreakAt = null;
    _cancelBreakWatch();

    try {
      await _fadeOutAudio(
        _currentItem?.type == QueueItemType.track ? _stopFade : Duration.zero,
      );
      await _playPreparedOrLoadNext();
    } finally {
      _isQueueTransitioning = false;
    }
  }

  Future<void> _fadeOutAudio(Duration duration) async {
    if (duration <= Duration.zero || !_audio.isPlaying) {
      await _audio.pause();
      return;
    }

    final startVolume = _audio.volume.clamp(0, 1).toDouble();
    if (startVolume <= 0) {
      await _audio.pause();
      return;
    }

    final steps = (duration.inMilliseconds / 50).round().clamp(1, 200);
    final stepDelay =
        Duration(milliseconds: (duration.inMilliseconds / steps).round());

    for (var i = steps; i >= 0; i--) {
      final progress = i / steps;
      final volume = startVolume * progress * progress;
      await _audio.setVolume(volume);
      await Future<void>.delayed(stepDelay);
    }

    await _audio.pause();
  }

  void _handleFetchFailure(FonFmApiException error) {
    if (error.kind == 'offline') {
      _handleTemporaryState('Требуется интернет', mode: 'offline');
      return;
    }
    _handleTemporaryState('Временная остановка', mode: 'server');
  }

  void _handleTemporaryState(String message, {required String mode}) {
    _clearPlaybackOnlyState();
    _setState(_state.copyWith(
      playbackMode: PlaybackMode.temporaryError,
      isPlaying: true,
      streamText: '',
      statusText: message,
      pendingClaimMessage: '',
    ));
    _scheduleRetry(_resolveRetryDelay(mode), mode: mode);
  }

  void _showBlockedState(String message) {
    _clearPlaybackOnlyState();
    _setState(_state.copyWith(
      playbackMode: PlaybackMode.blocked,
      isPlaying: true,
      streamText: '',
      statusText: message,
      pendingClaimMessage: '',
    ));
    _scheduleRetry(_blockedRetry, mode: 'blocked');
  }

  void _stopForMissingData(String message) {
    _clearPlaybackOnlyState();
    _setState(_state.copyWith(
      playbackMode: PlaybackMode.stopped,
      isPlaying: false,
      streamText: 'Запусти поток',
      statusText: message,
      pendingClaimMessage: '',
    ));
    unawaited(_persistSnapshot(shouldRestorePlayback: false));
  }

  void _showClaimPrompt(String message) {
    _clearPlaybackOnlyState();
    _setState(_state.copyWith(
      playbackMode: PlaybackMode.claimRequired,
      isPlaying: false,
      streamText: 'Запусти поток',
      statusText: '',
      pendingClaimMessage: message,
      canSubmitClaim: true,
    ));
    unawaited(_persistSnapshot(shouldRestorePlayback: false));
  }

  void _applyStoppedState() {
    _clearPlaybackOnlyState();
    _setState(_state.copyWith(
      playbackMode: PlaybackMode.stopped,
      isPlaying: false,
      streamText: 'Запусти поток',
      statusText: '',
      pendingClaimMessage: '',
    ));
  }

  void _clearPlaybackOnlyState() {
    _cancelRetry();
    _cancelHistory();
    _cancelBreakWatch();
    unawaited(_audio.stop());
    _currentItem = null;
    _currentItemStartedAt = null;
    _scheduledBreakAt = null;
    _prefetchDone = false;
  }

  void _clearRuntimeOnlyState() {
    _clearPlaybackOnlyState();
    _playlistIndex = null;
    _nextStartMode = null;
    _setState(_state.copyWith(queue: const <QueueItem>[]));
  }

  void _scheduleRetry(Duration delay, {required String mode}) {
    _cancelRetry();
    _retryTimer = Timer(delay, () async {
      if (!_state.isPlaying || _state.playerCode.isEmpty) {
        return;
      }
      await _loadNextAndPlay();
    });
  }

  Duration _resolveRetryDelay(String mode) {
    if (mode == 'offline') {
      final delay = _offlineRetryDelay;
      final nextMs = (_offlineRetryDelay.inMilliseconds * 2).clamp(
        _offlineInitialRetry.inMilliseconds,
        _offlineMaxRetry.inMilliseconds,
      );
      _offlineRetryDelay = Duration(milliseconds: nextMs);
      return delay;
    }

    if (mode == 'blocked') {
      return _blockedRetry;
    }

    final delay = _serverRetryDelay;
    final nextMs = (_serverRetryDelay.inMilliseconds * 2).clamp(
      _serverInitialRetry.inMilliseconds,
      _serverMaxRetry.inMilliseconds,
    );
    _serverRetryDelay = Duration(milliseconds: nextMs);
    return delay;
  }

  void _resetRetryDelays() {
    _offlineRetryDelay = _offlineInitialRetry;
    _serverRetryDelay = _serverInitialRetry;
  }

  Duration? _retryAfterToDuration(int? seconds) {
    if (seconds == null || seconds <= 0) {
      return null;
    }
    return Duration(seconds: seconds);
  }

  bool _hasPendingExactBreak() {
    return _scheduledBreakAt != null && _scheduledBreakAt! > _localNowTimestamp();
  }

  bool _shouldTriggerBreakNow() {
    return _scheduledBreakAt != null && _localNowTimestamp() >= _scheduledBreakAt!;
  }

  int _localNowTimestamp() {
    return DateTime.now().millisecondsSinceEpoch ~/ 1000 -
        (_tzOffsetMinutes * 60);
  }

  String _joinTrackMeta(QueueItem item) {
    final parts = <String>[
      if (item.set != null && item.set!.trim().isNotEmpty) item.set!,
      if (item.code != null && item.code!.trim().isNotEmpty) item.code!,
    ];
    return parts.join(' • ');
  }

  double _resolveVolume(QueueItem item) {
    final volume = item.volume;
    if (volume != null) {
      return volume.clamp(0, 1).toDouble();
    }
    final level = _state.playerMeta?.level ?? 1.0;
    return item.type == QueueItemType.track ? level.clamp(0, 1).toDouble() : 1.0;
  }

  String _mediaUrl(QueueItem item) {
    final id = item.id;
    if (id == null || id.isEmpty) {
      return '';
    }
    final first = id[0];
    final folder = item.type == QueueItemType.ad ? 'ads' : 'tracks';
    return 'https://cdn.fon.fm/media/$folder/$first/$id.mp3';
  }

  String _normalizePlayerCode(String value) {
    final normalized = value.trim().toLowerCase();
    final regExp = RegExp(r'^[a-z0-9]{5}$');
    return regExp.hasMatch(normalized) ? normalized : '';
  }

  String _createDeviceId() {
    final timestamp = DateTime.now().millisecondsSinceEpoch.toRadixString(16);
    final micros = DateTime.now().microsecondsSinceEpoch.toRadixString(16);
    return 'd-$timestamp-$micros';
  }

  Future<void> _persistSnapshot({bool? shouldRestorePlayback}) async {
    await _storage.saveSnapshot(
      PlayerSnapshot(
        playerCode: _state.playerCode,
        deviceId: _state.deviceId,
        shouldRestorePlayback: shouldRestorePlayback ?? _state.isPlaying,
      ),
    );
  }

  void _cancelRetry() {
    _retryTimer?.cancel();
    _retryTimer = null;
  }

  void _cancelHistory() {
    _historyTimer?.cancel();
    _historyTimer = null;
  }

  void _cancelBreakWatch() {
    _breakTimer?.cancel();
    _breakTimer = null;
  }

  void _setState(PlayerState next) {
    _state = next;
    notifyListeners();
  }

  @override
  void dispose() {
    _cancelRetry();
    _cancelHistory();
    _cancelBreakWatch();
    _positionSub?.cancel();
    _completedSub?.cancel();
    _api.dispose();
    _audio.dispose();
    super.dispose();
  }
}
