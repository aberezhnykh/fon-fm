import 'dart:async';
import 'dart:convert';
import 'dart:io';

import 'package:http/http.dart' as http;

import '../model/player_meta.dart';
import '../model/queue_item.dart';

class FonFmApiException implements Exception {
  FonFmApiException(this.kind, this.message);

  final String kind;
  final String message;
}

class NextResponse {
  const NextResponse({
    required this.ok,
    required this.type,
    required this.queue,
    this.retryAfter,
  });

  final bool ok;
  final String type;
  final List<QueueItem> queue;
  final int? retryAfter;

  factory NextResponse.fromJson(Map<String, dynamic> json) {
    final rawQueue = json['queue'];
    return NextResponse(
      ok: json['ok'] == true,
      type: '${json['type'] ?? ''}',
      queue: rawQueue is List
          ? rawQueue
              .whereType<Map>()
              .map((item) => QueueItem.fromJson(Map<String, dynamic>.from(item)))
              .toList(growable: false)
          : const <QueueItem>[],
      retryAfter: json['retry_after'] is num
          ? (json['retry_after'] as num).toInt()
          : int.tryParse('${json['retry_after']}'),
    );
  }
}

class FonFmApi {
  FonFmApi({
    http.Client? client,
    this.baseUrl = 'https://play.fon.fm',
    this.fetchTimeout = const Duration(seconds: 8),
  }) : _client = client ?? http.Client();

  final http.Client _client;
  final String baseUrl;
  final Duration fetchTimeout;

  Future<PlayerMeta?> fetchMeta({
    required String player,
    required int tzOffsetMinutes,
  }) async {
    final uri = Uri.parse('$baseUrl/meta').replace(queryParameters: <String, String>{
      'player': player,
      'tz': '$tzOffsetMinutes',
    });

    final json = await _getJson(uri);
    if (json['ok'] != true) {
      return null;
    }

    return PlayerMeta.fromJson(json);
  }

  Future<NextResponse> fetchNext({
    required String player,
    required String device,
    required int tzOffsetMinutes,
    required String version,
    String? startMode,
    int? playlistIndex,
  }) async {
    final query = <String, String>{
      'player': player,
      'device': device,
      'tz': '$tzOffsetMinutes',
      'version': version,
    };

    if (startMode != null && startMode.isNotEmpty) {
      query['start'] = startMode;
    }

    if (playlistIndex != null) {
      query['playlist'] = '$playlistIndex';
    }

    final uri = Uri.parse('$baseUrl/next').replace(queryParameters: query);
    return NextResponse.fromJson(await _getJson(uri));
  }

  Future<void> claim({
    required String player,
    required String device,
    required int tzOffsetMinutes,
  }) async {
    final uri = Uri.parse('$baseUrl/claim').replace(queryParameters: <String, String>{
      'player': player,
      'device': device,
      'tz': '$tzOffsetMinutes',
    });

    final json = await _getJson(uri);
    if (json['ok'] != true) {
      throw FonFmApiException('server', '${json['message'] ?? 'Claim failed'}');
    }
  }

  Future<void> sendHistory({
    required String player,
    required String device,
    required String type,
    required String id,
    required DateTime startedAt,
  }) async {
    final body = <String, String>{
      'player': player,
      'device': device,
      'type': type,
      'id': id,
      'date': _padDate(startedAt),
      'time': _padTime(startedAt),
    };

    try {
      await _client
          .post(
            Uri.parse('$baseUrl/history'),
            headers: const <String, String>{
              'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8',
            },
            body: body,
          )
          .timeout(fetchTimeout);
    } catch (_) {
      // История не должна ломать playback.
    }
  }

  String _padDate(DateTime value) {
    final year = value.year.toString().padLeft(4, '0');
    final month = value.month.toString().padLeft(2, '0');
    final day = value.day.toString().padLeft(2, '0');
    return '$year-$month-$day';
  }

  String _padTime(DateTime value) {
    final hour = value.hour.toString().padLeft(2, '0');
    final minute = value.minute.toString().padLeft(2, '0');
    final second = value.second.toString().padLeft(2, '0');
    return '$hour:$minute:$second';
  }

  Future<Map<String, dynamic>> _getJson(Uri uri) async {
    try {
      final response = await _client.get(uri).timeout(fetchTimeout);
      if (response.statusCode < 200 || response.statusCode >= 300) {
        throw FonFmApiException('server', 'HTTP ${response.statusCode}');
      }

      final decoded = jsonDecode(response.body);
      if (decoded is! Map<String, dynamic>) {
        throw FonFmApiException('server', 'Invalid JSON payload');
      }

      return decoded;
    } on TimeoutException catch (e) {
      throw FonFmApiException('offline', e.message ?? 'Request timed out');
    } on SocketException catch (e) {
      throw FonFmApiException('offline', e.message);
    } on HttpException catch (e) {
      throw FonFmApiException('server', e.message);
    } on FormatException catch (e) {
      throw FonFmApiException('server', e.message);
    }
  }

  void dispose() {
    _client.close();
  }
}
