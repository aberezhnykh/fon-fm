import 'package:shared_preferences/shared_preferences.dart';

import '../model/player_snapshot.dart';

class AppStorage {
  static const _snapshotKey = 'fonfm_snapshot';

  Future<PlayerSnapshot> loadSnapshot() async {
    final prefs = await SharedPreferences.getInstance();
    final raw = prefs.getString(_snapshotKey);
    if (raw == null || raw.isEmpty) {
      return PlayerSnapshot.initial();
    }

    try {
      return PlayerSnapshot.decode(raw);
    } catch (_) {
      return PlayerSnapshot.initial();
    }
  }

  Future<void> saveSnapshot(PlayerSnapshot snapshot) async {
    final prefs = await SharedPreferences.getInstance();
    await prefs.setString(_snapshotKey, snapshot.encode());
  }
}
