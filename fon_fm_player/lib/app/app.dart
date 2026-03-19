import 'package:flutter/material.dart';

import '../core/api/fon_fm_api.dart';
import '../core/playback/just_audio_engine.dart';
import '../core/storage/app_storage.dart';
import '../features/player/controller/player_controller.dart';
import '../features/player/view/player_shell.dart';

class FonFmApp extends StatefulWidget {
  const FonFmApp({super.key});

  @override
  State<FonFmApp> createState() => _FonFmAppState();
}

class _FonFmAppState extends State<FonFmApp> {
  late final PlayerController _controller;

  @override
  void initState() {
    super.initState();
    _controller = PlayerController(
      api: FonFmApi(),
      storage: AppStorage(),
      audioEngine: JustAudioEngine(),
    )..initialize();
  }

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'FON.FM',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        useMaterial3: true,
        brightness: Brightness.dark,
        scaffoldBackgroundColor: const Color(0xFF0E0F11),
        colorScheme: const ColorScheme.dark(
          surface: Color(0xFF1A1B1E),
          primary: Color(0xFFD0FF71),
          onPrimary: Color(0xFF0A0B0D),
          secondary: Color(0xFFD0FF71),
        ),
        fontFamily: 'Segoe UI',
      ),
      home: PlayerShell(controller: _controller),
    );
  }
}
