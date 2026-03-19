import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

import '../controller/player_controller.dart';
import '../controller/player_state.dart';

const bool _debugLayoutColors = false;

Color? _debugColor(Color color) {
  if (!_debugLayoutColors) {
    return null;
  }
  return color.withValues(alpha: 0.18);
}

class PlayerShell extends StatefulWidget {
  const PlayerShell({
    super.key,
    required this.controller,
  });

  final PlayerController controller;

  @override
  State<PlayerShell> createState() => _PlayerShellState();
}

class _PlayerShellState extends State<PlayerShell> {
  late final TextEditingController _codeController;
  String? _headerTooltip;

  @override
  void initState() {
    super.initState();
    _codeController = TextEditingController();
    widget.controller.addListener(_syncInput);
    _syncInput();
  }

  @override
  void dispose() {
    widget.controller.removeListener(_syncInput);
    _codeController.dispose();
    super.dispose();
  }

  void _syncInput() {
    final next = widget.controller.displayPlayerCode;
    if (_codeController.text == next) {
      return;
    }
    _codeController.value = TextEditingValue(
      text: next,
      selection: TextSelection.collapsed(offset: next.length),
    );
  }

  Future<void> _copyHeaderText() async {
    final text = widget.controller.headerText;
    if (text.isEmpty) {
      return;
    }

    await Clipboard.setData(ClipboardData(text: text));
    if (!mounted) {
      return;
    }

    setState(() {
      _headerTooltip = 'Скопировано';
    });

    Future<void>.delayed(const Duration(milliseconds: 1200), () {
      if (!mounted) {
        return;
      }
      setState(() {
        _headerTooltip = null;
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return AnimatedBuilder(
      animation: widget.controller,
      builder: (context, _) {
        final state = widget.controller.state;
        return Scaffold(
          body: Center(
            child: Padding(
              padding: const EdgeInsets.all(20),
              child: ConstrainedBox(
                constraints: const BoxConstraints(
                  maxWidth: 620,
                  minHeight: 560,
                ),
                child: Container(
                  decoration: BoxDecoration(
                    color: const Color(0xFF1A1B1E),
                    borderRadius: BorderRadius.circular(24),
                    border: Border.all(
                      color: Colors.white.withValues(alpha: 0.08),
                    ),
                  ),
                  child: Padding(
                    padding: const EdgeInsets.symmetric(
                      horizontal: 24,
                      vertical: 8,
                    ),
                    child: Column(
                      children: [
                        _Header(
                          state: state,
                          headerText: widget.controller.headerText,
                          tooltipText: _headerTooltip ?? 'Скопировать',
                          onHeaderTap: _copyHeaderText,
                          onActionTap: () {
                            if (state.screenMode == PlayerScreenMode.player) {
                              widget.controller.openSettings();
                            } else if (state.screenMode ==
                                PlayerScreenMode.settings) {
                              widget.controller.closeSettings();
                            }
                          },
                        ),
                        Expanded(
                          child: AnimatedSwitcher(
                            duration: const Duration(milliseconds: 180),
                            child: switch (state.screenMode) {
                              PlayerScreenMode.setup => _SetupView(
                                  key: const ValueKey('setup'),
                                  state: state,
                                  codeController: _codeController,
                                  onSubmit: () => widget.controller
                                      .submitPlayerCode(_codeController.text),
                                ),
                              PlayerScreenMode.settings => _SettingsView(
                                  key: const ValueKey('settings'),
                                  state: state,
                                  codeController: _codeController,
                                  onLogout: widget.controller.logout,
                                ),
                              PlayerScreenMode.player => _PlayerView(
                                  key: const ValueKey('player'),
                                  state: state,
                                  onTogglePlayback:
                                      widget.controller.togglePlayback,
                                  onClaimYes:
                                      widget.controller.confirmTakeover,
                                  onClaimNo: widget.controller.cancelTakeover,
                                ),
                            },
                          ),
                        ),
                        SizedBox(
                          height: 64,
                          child: Center(
                            child: const Text(
                              'FON.FM APP 1.0.1',
                              style: TextStyle(
                                fontSize: 12,
                                letterSpacing: 1,
                                color: Color(0xFF747B86),
                              ),
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ),
            ),
          ),
        );
      },
    );
  }
}

class _Header extends StatelessWidget {
  const _Header({
    required this.state,
    required this.headerText,
    required this.tooltipText,
    required this.onHeaderTap,
    required this.onActionTap,
  });

  final PlayerState state;
  final String headerText;
  final String tooltipText;
  final VoidCallback onHeaderTap;
  final VoidCallback onActionTap;

  @override
  Widget build(BuildContext context) {
    final canShowAction = state.playerCode.isNotEmpty;
    final inSettings = state.screenMode == PlayerScreenMode.settings;

    return SizedBox(
      height: 64,
      child: ColoredBox(
        color: _debugColor(const Color(0xFFEF4444)) ?? Colors.transparent,
        child: Row(
          children: [
            const SizedBox(width: 32, height: 32),
            Expanded(
              child: Center(
                child: Tooltip(
                  message: tooltipText,
                  waitDuration: const Duration(milliseconds: 250),
                  child: MouseRegion(
                    cursor: headerText.isNotEmpty
                        ? SystemMouseCursors.click
                        : MouseCursor.defer,
                    child: GestureDetector(
                      onTap: headerText.isNotEmpty ? onHeaderTap : null,
                      child: Text(
                        headerText,
                        maxLines: 1,
                        overflow: TextOverflow.ellipsis,
                        textAlign: TextAlign.center,
                        style: const TextStyle(
                          fontSize: 12,
                          height: 1.3,
                          letterSpacing: 1,
                          color: Color(0xFF747B86),
                        ),
                      ),
                    ),
                  ),
                ),
              ),
            ),
            SizedBox(
              width: 32,
              height: 32,
              child: canShowAction
                  ? IconButton(
                      padding: EdgeInsets.zero,
                      splashRadius: 18,
                      onPressed: onActionTap,
                      icon: Icon(
                        inSettings ? Icons.close : Icons.more_horiz,
                        color: const Color(0xFF8E949E),
                        size: 22,
                      ),
                    ),
                    )
                  : null,
            ),
          ],
        ),
      ),
    );
  }
}

class _SetupView extends StatelessWidget {
  const _SetupView({
    super.key,
    required this.state,
    required this.codeController,
    required this.onSubmit,
  });

  final PlayerState state;
  final TextEditingController codeController;
  final VoidCallback onSubmit;

  @override
  Widget build(BuildContext context) {
    return LayoutBuilder(
      builder: (context, constraints) {
        return Column(
          children: [
            Expanded(
              child: ColoredBox(
                color: _debugColor(const Color(0xFF22C55E)) ?? Colors.transparent,
                child: Center(
                  child: SizedBox(
                    width: 168,
                    height: 168,
                    child: TextField(
                      controller: codeController,
                      textAlign: TextAlign.center,
                      maxLength: 5,
                      inputFormatters: [
                        FilteringTextInputFormatter.allow(RegExp(r'[a-zA-Z0-9]')),
                        TextInputFormatter.withFunction((oldValue, newValue) {
                          final text = newValue.text.toUpperCase();
                          return TextEditingValue(
                            text: text,
                            selection:
                                TextSelection.collapsed(offset: text.length),
                          );
                        }),
                      ],
                      style: const TextStyle(
                        color: Color(0xFFE0E4EA),
                        fontSize: 24,
                        fontWeight: FontWeight.w500,
                        letterSpacing: 5,
                      ),
                      decoration: InputDecoration(
                        counterText: '',
                        filled: true,
                        fillColor: const Color(0xFF14171C),
                        contentPadding: EdgeInsets.zero,
                        enabledBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(999),
                          borderSide: BorderSide(
                            color: Colors.white.withValues(alpha: 0.2),
                            width: 4,
                          ),
                        ),
                        focusedBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(999),
                          borderSide: const BorderSide(
                            color: Color(0xFF8E949E),
                            width: 4,
                          ),
                        ),
                      ),
                      onSubmitted: (_) => onSubmit(),
                    ),
                  ),
                ),
              ),
            ),
            SizedBox(
              height: 164,
              child: ColoredBox(
                color: _debugColor(const Color(0xFF3B82F6)) ?? Colors.transparent,
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    _SecondaryButton(
                      text: 'Войти',
                      onPressed: onSubmit,
                    ),
                    const SizedBox(height: 20),
                    Text(
                      state.setupMessage,
                      textAlign: TextAlign.center,
                      style: const TextStyle(
                        color: Color(0xFFBCC3CD),
                        fontSize: 17,
                        height: 1.45,
                      ),
                    ),
                  ],
                ),
              ),
            ),
          ],
        );
      },
    );
  }
}

class _SettingsView extends StatelessWidget {
  const _SettingsView({
    super.key,
    required this.state,
    required this.codeController,
    required this.onLogout,
  });

  final PlayerState state;
  final TextEditingController codeController;
  final Future<void> Function() onLogout;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Expanded(
          child: ColoredBox(
            color: _debugColor(const Color(0xFF22C55E)) ?? Colors.transparent,
            child: Center(
              child: _CodeCircleDisplay(text: codeController.text),
            ),
          ),
        ),
        ColoredBox(
          color: _debugColor(const Color(0xFF3B82F6)) ?? Colors.transparent,
          child: Column(
            children: [
              SizedBox(
                height: 56,
                child: Center(
                  child: _SecondaryButton(
                    text: 'Выйти',
                    onPressed: () => onLogout(),
                  ),
                ),
              ),
              const SizedBox(height: 12),
              SizedBox(
                height: 164,
                child: Center(
                  child: Text(
                    state.setupMessage,
                    textAlign: TextAlign.center,
                    style: const TextStyle(
                      color: Color(0xFFBCC3CD),
                      fontSize: 17,
                      height: 1.45,
                    ),
                  ),
                ),
              ),
            ],
          ),
        ),
      ],
    );
  }
}

class _CodeCircleDisplay extends StatelessWidget {
  const _CodeCircleDisplay({
    required this.text,
  });

  final String text;

  @override
  Widget build(BuildContext context) {
    return Container(
      width: 168,
      height: 168,
      alignment: Alignment.center,
      decoration: BoxDecoration(
        shape: BoxShape.circle,
        color: const Color(0xFF14171C),
        border: Border.all(
          color: Colors.white.withValues(alpha: 0.2),
          width: 4,
        ),
      ),
      child: Text(
        text,
        textAlign: TextAlign.center,
        style: const TextStyle(
          color: Color(0xFFE0E4EA),
          fontSize: 24,
          fontWeight: FontWeight.w500,
          letterSpacing: 5,
        ),
      ),
    );
  }
}

class _PlayerView extends StatelessWidget {
  const _PlayerView({
    super.key,
    required this.state,
    required this.onTogglePlayback,
    required this.onClaimYes,
    required this.onClaimNo,
  });

  final PlayerState state;
  final Future<void> Function() onTogglePlayback;
  final Future<void> Function() onClaimYes;
  final VoidCallback onClaimNo;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Expanded(
          child: ColoredBox(
            color: _debugColor(const Color(0xFF22C55E)) ?? Colors.transparent,
            child: Center(
              child: SizedBox(
                width: 168,
                height: 168,
                child: FilledButton(
                  style: FilledButton.styleFrom(
                    backgroundColor: Colors.transparent,
                    foregroundColor: const Color(0xFFD0FF71),
                    shape: CircleBorder(
                      side: BorderSide(
                        color: Colors.white.withValues(alpha: 0.2),
                        width: 4,
                      ),
                    ),
                  ),
                  onPressed: () => onTogglePlayback(),
                  child: state.isPlaying
                      ? Container(
                          width: 28,
                          height: 28,
                          decoration: BoxDecoration(
                            color: const Color(0xFFD0FF71),
                            borderRadius: BorderRadius.circular(4),
                          ),
                        )
                      : CustomPaint(
                          size: const Size(32, 40),
                          painter: _PlayIconPainter(),
                        ),
                ),
              ),
            ),
          ),
        ),
        ColoredBox(
          color: _debugColor(const Color(0xFF3B82F6)) ?? Colors.transparent,
          child: Column(
            children: [
              SizedBox(
                height: 56,
                child: Center(
                  child: Text(
                    state.streamText,
                    textAlign: TextAlign.center,
                    style: const TextStyle(
                      color: Color(0xFFD0FF71),
                      fontSize: 36,
                      fontWeight: FontWeight.w500,
                      height: 1.1,
                    ),
                  ),
                ),
              ),
              const SizedBox(height: 12),
              SizedBox(
                height: 164,
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Text(
                      state.playbackMode == PlaybackMode.claimRequired
                          ? state.pendingClaimMessage
                          : state.statusText,
                      textAlign: TextAlign.center,
                      style: const TextStyle(
                        color: Color(0xFFBCC3CD),
                        fontSize: 17,
                        height: 1.45,
                      ),
                    ),
                    if (state.playbackMode == PlaybackMode.claimRequired) ...[
                      const SizedBox(height: 20),
                      Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          _SecondaryButton(
                            text: 'Да',
                            onPressed: state.canSubmitClaim
                                ? () => onClaimYes()
                                : null,
                          ),
                          const SizedBox(width: 12),
                          _SecondaryButton(
                            text: 'Нет',
                            onPressed: onClaimNo,
                            isSecondary: true,
                          ),
                        ],
                      ),
                    ],
                  ],
                ),
              ),
            ],
          ),
        ),
      ],
    );
  }
}

class _SecondaryButton extends StatelessWidget {
  const _SecondaryButton({
    required this.text,
    required this.onPressed,
    this.isSecondary = false,
  });

  final String text;
  final VoidCallback? onPressed;
  final bool isSecondary;

  @override
  Widget build(BuildContext context) {
    return OutlinedButton(
      style: OutlinedButton.styleFrom(
        minimumSize: const Size(112, 44),
        side: BorderSide(color: Colors.white.withValues(alpha: 0.12)),
        foregroundColor:
            isSecondary ? const Color(0xFF8E949E) : const Color(0xFFE0E4EA),
        textStyle: const TextStyle(
          fontSize: 12,
          fontWeight: FontWeight.w500,
          letterSpacing: 1.5,
        ),
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
      ),
      onPressed: onPressed,
      child: Text(text.toUpperCase()),
    );
  }
}

class _PlayIconPainter extends CustomPainter {
  @override
  void paint(Canvas canvas, Size size) {
    final paint = Paint()..color = const Color(0xFFD0FF71);
    final path = Path()
      ..moveTo(size.width * 0.15, size.height * 0.1)
      ..lineTo(size.width * 0.15, size.height * 0.9)
      ..lineTo(size.width * 0.9, size.height * 0.5)
      ..close();
    canvas.drawPath(path, paint);
  }

  @override
  bool shouldRepaint(covariant CustomPainter oldDelegate) => false;
}
