enum QueueItemType {
  track,
  ad,
  idle,
  message,
  update,
  breakItem,
  unknown,
}

class QueueItem {
  const QueueItem({
    required this.type,
    this.action,
    this.reason,
    this.message,
    this.stream,
    this.title,
    this.set,
    this.code,
    this.id,
    this.duration,
    this.volume,
    this.playlist,
    this.exactly,
    this.at,
    this.items = const <QueueItem>[],
  });

  final QueueItemType type;
  final String? action;
  final String? reason;
  final String? message;
  final String? stream;
  final String? title;
  final String? set;
  final String? code;
  final String? id;
  final int? duration;
  final double? volume;
  final int? playlist;
  final bool? exactly;
  final int? at;
  final List<QueueItem> items;

  bool get isTrackLike => type == QueueItemType.track || type == QueueItemType.ad;

  factory QueueItem.fromJson(Map<String, dynamic> json) {
    QueueItemType parseType(Object? value) {
      switch ('$value') {
        case 'track':
          return QueueItemType.track;
        case 'ad':
          return QueueItemType.ad;
        case 'idle':
          return QueueItemType.idle;
        case 'message':
          return QueueItemType.message;
        case 'update':
          return QueueItemType.update;
        case 'break':
          return QueueItemType.breakItem;
        default:
          return QueueItemType.unknown;
      }
    }

    final rawItems = json['items'];
    final items = rawItems is List
        ? rawItems
            .whereType<Map>()
            .map((item) => QueueItem.fromJson(Map<String, dynamic>.from(item)))
            .toList(growable: false)
        : const <QueueItem>[];

    final rawVolume = json['volume'];
    final parsedVolume = rawVolume is num
        ? rawVolume.toDouble()
        : double.tryParse('$rawVolume');

    return QueueItem(
      type: parseType(json['type']),
      action: json['action'] == null ? null : '${json['action']}',
      reason: json['reason'] == null ? null : '${json['reason']}',
      message: json['message'] == null ? null : '${json['message']}',
      stream: json['stream'] == null ? null : '${json['stream']}',
      title: json['title'] == null ? null : '${json['title']}',
      set: json['set'] == null ? null : '${json['set']}',
      code: json['code'] == null ? null : '${json['code']}',
      id: json['id'] == null ? null : '${json['id']}',
      duration: json['duration'] is num
          ? (json['duration'] as num).toInt()
          : int.tryParse('${json['duration']}'),
      volume: parsedVolume,
      playlist: json['playlist'] is num
          ? (json['playlist'] as num).toInt()
          : int.tryParse('${json['playlist']}'),
      exactly: json['exactly'] is bool ? json['exactly'] as bool : null,
      at: json['at'] is num ? (json['at'] as num).toInt() : int.tryParse('${json['at']}'),
      items: items,
    );
  }
}
