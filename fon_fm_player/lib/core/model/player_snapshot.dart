import 'dart:convert';

class PlayerSnapshot {
  const PlayerSnapshot({
    required this.playerCode,
    required this.deviceId,
    required this.shouldRestorePlayback,
  });

  final String playerCode;
  final String deviceId;
  final bool shouldRestorePlayback;

  factory PlayerSnapshot.initial() {
    return const PlayerSnapshot(
      playerCode: '',
      deviceId: '',
      shouldRestorePlayback: false,
    );
  }

  Map<String, dynamic> toJson() {
    return <String, dynamic>{
      'playerCode': playerCode,
      'deviceId': deviceId,
      'shouldRestorePlayback': shouldRestorePlayback,
    };
  }

  String encode() => jsonEncode(toJson());

  factory PlayerSnapshot.decode(String raw) {
    final map = jsonDecode(raw) as Map<String, dynamic>;
    return PlayerSnapshot(
      playerCode: '${map['playerCode'] ?? ''}',
      deviceId: '${map['deviceId'] ?? ''}',
      shouldRestorePlayback: map['shouldRestorePlayback'] == true,
    );
  }
}
