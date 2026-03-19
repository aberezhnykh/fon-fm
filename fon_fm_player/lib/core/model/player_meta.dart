class PlayerMeta {
  const PlayerMeta({
    required this.player,
    required this.code,
    required this.title,
    required this.level,
  });

  final String player;
  final String code;
  final String title;
  final double level;

  factory PlayerMeta.fromJson(Map<String, dynamic> json) {
    final rawLevel = json['level'];
    final parsedLevel = rawLevel is num
        ? rawLevel.toDouble()
        : double.tryParse('$rawLevel') ?? 100.0;

    return PlayerMeta(
      player: '${json['player'] ?? ''}',
      code: '${json['code'] ?? ''}',
      title: '${json['title'] ?? ''}',
      level: parsedLevel <= 1
          ? parsedLevel.clamp(0, 1).toDouble()
          : (parsedLevel / 100).clamp(0, 1).toDouble(),
    );
  }
}
