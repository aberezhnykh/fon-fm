import '../../../core/model/player_meta.dart';
import '../../../core/model/queue_item.dart';

enum PlayerScreenMode { setup, player, settings }

enum PlaybackMode {
  stopped,
  loading,
  playing,
  idle,
  claimRequired,
  blocked,
  temporaryError,
}

class PlayerState {
  const PlayerState({
    required this.isInitialized,
    required this.screenMode,
    required this.playbackMode,
    required this.playerCode,
    required this.deviceId,
    required this.playerMeta,
    required this.setupMessage,
    required this.streamText,
    required this.statusText,
    required this.isPlaying,
    required this.canSubmitClaim,
    required this.pendingClaimMessage,
    required this.queue,
  });

  final bool isInitialized;
  final PlayerScreenMode screenMode;
  final PlaybackMode playbackMode;
  final String playerCode;
  final String deviceId;
  final PlayerMeta? playerMeta;
  final String setupMessage;
  final String streamText;
  final String statusText;
  final bool isPlaying;
  final bool canSubmitClaim;
  final String pendingClaimMessage;
  final List<QueueItem> queue;

  factory PlayerState.initial() {
    return const PlayerState(
      isInitialized: false,
      screenMode: PlayerScreenMode.setup,
      playbackMode: PlaybackMode.stopped,
      playerCode: '',
      deviceId: '',
      playerMeta: null,
      setupMessage: 'Введите код плеера',
      streamText: '',
      statusText: '',
      isPlaying: false,
      canSubmitClaim: true,
      pendingClaimMessage: '',
      queue: <QueueItem>[],
    );
  }

  PlayerState copyWith({
    bool? isInitialized,
    PlayerScreenMode? screenMode,
    PlaybackMode? playbackMode,
    String? playerCode,
    String? deviceId,
    PlayerMeta? playerMeta,
    bool clearPlayerMeta = false,
    String? setupMessage,
    String? streamText,
    String? statusText,
    bool? isPlaying,
    bool? canSubmitClaim,
    String? pendingClaimMessage,
    List<QueueItem>? queue,
  }) {
    return PlayerState(
      isInitialized: isInitialized ?? this.isInitialized,
      screenMode: screenMode ?? this.screenMode,
      playbackMode: playbackMode ?? this.playbackMode,
      playerCode: playerCode ?? this.playerCode,
      deviceId: deviceId ?? this.deviceId,
      playerMeta: clearPlayerMeta ? null : (playerMeta ?? this.playerMeta),
      setupMessage: setupMessage ?? this.setupMessage,
      streamText: streamText ?? this.streamText,
      statusText: statusText ?? this.statusText,
      isPlaying: isPlaying ?? this.isPlaying,
      canSubmitClaim: canSubmitClaim ?? this.canSubmitClaim,
      pendingClaimMessage: pendingClaimMessage ?? this.pendingClaimMessage,
      queue: queue ?? this.queue,
    );
  }
}
