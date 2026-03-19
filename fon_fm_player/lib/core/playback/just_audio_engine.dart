import 'dart:async';

import 'package:just_audio/just_audio.dart';
import 'package:just_audio_media_kit/just_audio_media_kit.dart';

import 'audio_engine.dart';

class JustAudioEngine implements AudioEngine {
  JustAudioEngine() {
    JustAudioMediaKit.ensureInitialized(windows: true, android: true);
    _completedSub = _player.playerStateStream.listen((state) {
      if (state.processingState == ProcessingState.completed) {
        _completedController.add(null);
      }
    });
  }

  final AudioPlayer _player = AudioPlayer();
  final StreamController<void> _completedController =
      StreamController<void>.broadcast();
  late final StreamSubscription<PlayerState> _completedSub;

  @override
  Stream<Duration> get positionStream => _player.positionStream;

  @override
  Stream<void> get completedStream => _completedController.stream;

  @override
  Duration? get duration => _player.duration;

  @override
  Duration get position => _player.position;

  @override
  bool get isPlaying => _player.playing;

  @override
  double get volume => _player.volume;

  @override
  Future<void> setSourceUrl(String url) async {
    await _player.setUrl(url);
  }

  @override
  Future<void> play() => _player.play();

  @override
  Future<void> pause() => _player.pause();

  @override
  Future<void> stop() => _player.stop();

  @override
  Future<void> setVolume(double volume) =>
      _player.setVolume(volume.clamp(0, 1).toDouble());

  @override
  Future<void> dispose() async {
    await _completedSub.cancel();
    await _completedController.close();
    await _player.dispose();
  }
}
