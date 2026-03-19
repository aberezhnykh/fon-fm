abstract class AudioEngine {
  Stream<Duration> get positionStream;
  Stream<void> get completedStream;

  Duration? get duration;
  Duration get position;
  bool get isPlaying;
  double get volume;

  Future<void> setSourceUrl(String url);
  Future<void> play();
  Future<void> pause();
  Future<void> stop();
  Future<void> setVolume(double volume);
  Future<void> dispose();
}
