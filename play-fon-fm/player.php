<?php

declare(strict_types=1);

$dataDir = '/var/www/app/data/cdn/data';
$settingsPath = __DIR__ . '/config/settings.json';
require_once __DIR__ . '/config/messages.php';
require_once __DIR__ . '/config/settings.php';
require_once __DIR__ . '/runtime.php';
$player = isset($_GET['player']) ? runtime_normalize_player_code($_GET['player']) : '';

function resolveTimezoneOffsetMinutes(): int {
    $value = $_GET['tz'] ?? null;

    if (!is_numeric($value)) {
        return -180;
    }

    $offset = (int)$value;

    if ($offset < -840 || $offset > 720) {
        return -180;
    }

    return $offset;
}

function localTimestamp(int $offset): int {
    return time() - ($offset * 60);
}

function todayDate(int $offset): string {
    return gmdate('Y-m-d', localTimestamp($offset));
}

function isActiveStatus(mixed $value): bool {
    return $value === 'active';
}

function isExpired(?string $end, int $offset): bool {
    if (!$end) {
        return false;
    }

    return todayDate($offset) > $end;
}

function renderState(string $message = ''): never {
    http_response_code(200);
    header('Content-Type: text/html; charset=utf-8');
    $safeMessage = htmlspecialchars($message, ENT_QUOTES, 'UTF-8');
    echo '<!DOCTYPE html><html lang="ru"><head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1.0, viewport-fit=cover"><meta name="theme-color" content="#0e0f11"><meta name="mobile-web-app-capable" content="yes"><meta name="apple-mobile-web-app-capable" content="yes"><meta name="apple-mobile-web-app-status-bar-style" content="black-translucent"><meta name="apple-mobile-web-app-title" content="FON.FM"><title>fon.fm</title><style>html,body{margin:0;padding:0;min-height:100%;background:#0e0f11;color:#8e949e;font-family:"Segoe UI Variable Display","Segoe UI",Arial,sans-serif}body{display:grid;place-items:center;padding:max(24px,env(safe-area-inset-top,0px)) max(24px,env(safe-area-inset-right,0px)) max(24px,env(safe-area-inset-bottom,0px)) max(24px,env(safe-area-inset-left,0px));text-align:center}.state{max-width:360px}.brand{font-size:11px;line-height:1.5;letter-spacing:.12em;text-transform:uppercase}.message{margin-top:14px;font-size:14px;line-height:1.6;letter-spacing:.02em;text-transform:none;color:#d8dde6}</style></head><body><div class="state"><div class="brand">fon.fm</div>' . ($safeMessage !== '' ? '<div class="message">' . $safeMessage . '</div>' : '') . '</div></body></html>';
    exit;
}

$tzOffset = resolveTimezoneOffsetMinutes();
$context = $player !== '' ? runtime_resolve_player_context($dataDir, $player) : null;
$settings = player_settings($settingsPath);
$appVersion = player_settings_app_version($settingsPath);
$playerFrontendSettings = [
    'messages' => $settings['messages'] ?? [],
    'checks' => $settings['checks'] ?? [],
    'retry' => $settings['retry'] ?? [],
];
$claimYesLabel = trim((string)($settings['messages']['device_confirm_yes'] ?? ''));
$claimNoLabel = trim((string)($settings['messages']['device_confirm_no'] ?? ''));
$setupTitle = trim((string)($settings['messages']['setup_title'] ?? ''));
$setupSubmitLabel = trim((string)($settings['messages']['setup_submit'] ?? ''));
$settingsOpenLabel = trim((string)($settings['messages']['settings_open'] ?? ''));
$settingsCloseLabel = trim((string)($settings['messages']['settings_close'] ?? ''));

if ($player !== '' && (!is_array($context) || !is_array($context['player'] ?? null))) {
    renderState(player_message('player_not_found'));
}

/** @var array<string,mixed>|null $playerData */
$playerData = is_array($context) && is_array($context['player'] ?? null) ? $context['player'] : null;

if (is_array($playerData) && isset($playerData['status']) && !isActiveStatus($playerData['status'])) {
    renderState(player_message('player_inactive'));
}

if (is_array($playerData) && isExpired($playerData['end'] ?? null, $tzOffset)) {
    renderState(player_message('player_expired'));
}

$client = trim((string)($context['client_id'] ?? ''));
if ($player !== '' && $client === '') {
    renderState(player_message('player_client_missing'));
}

/** @var mixed $clientData */
$clientData = $context['client'] ?? null;
if ($player !== '' && !is_array($clientData)) {
    renderState(player_message('client_not_found'));
}

if (is_array($clientData) && isset($clientData['status']) && !isActiveStatus($clientData['status'])) {
    renderState(player_message('client_inactive'));
}
?>
<!DOCTYPE html>
<html lang="ru">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, viewport-fit=cover" />
  <meta name="theme-color" content="#0e0f11" />
  <meta name="mobile-web-app-capable" content="yes" />
  <meta name="apple-mobile-web-app-capable" content="yes" />
  <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />
  <meta name="apple-mobile-web-app-title" content="FON.FM" />
  <title>fon.fm</title>
  <link id="manifestLink" rel="manifest" href="/manifest<?= $player !== '' ? '?player=' . rawurlencode($player) : '' ?>" />
  <link rel="icon" href="/app-icon-192.png" sizes="192x192" type="image/png" />
  <link rel="icon" href="/app-icon-512.png" sizes="512x512" type="image/png" />
  <link rel="icon" href="/app-icon.svg" type="image/svg+xml" />
  <link rel="apple-touch-icon" href="/app-icon-192.png" />

  <style>
<?php require __DIR__ . '/player.css.php'; ?>
  </style>
</head>

<body>
  <div class="page">
    <div id="playerShell" class="app-shell">
      <div class="app-bar">
        <div class="app-bar-spacer" aria-hidden="true"></div>
        <div class="app-bar-action">
          <div class="app-bar-actions">
            <button id="headerActionButton" class="icon-btn" type="button" aria-label="<?= htmlspecialchars($settingsOpenLabel, ENT_QUOTES, 'UTF-8') ?>" title="<?= htmlspecialchars($settingsOpenLabel, ENT_QUOTES, 'UTF-8') ?>"<?= $player === '' ? ' hidden' : '' ?>>
              <span id="headerActionGlyph" class="icon-btn-glyph" aria-hidden="true">⋯</span>
            </button>
          </div>
        </div>
        <div id="playerHead" class="app-title<?= $player === '' ? ' app-title-static' : '' ?>"></div>
      </div>

      <div id="setupMain" class="app-view app-view-setup"<?= $player === '' ? '' : ' hidden' ?>>
        <div class="hero-stage">
          <input id="setupInput" class="access-code-input" type="text" inputmode="text" autocomplete="off" autocapitalize="off" spellcheck="false" maxlength="5">
        </div>

        <div class="detail-panel">
          <div class="detail-primary">
            <button id="setupSubmit" class="ui-btn access-action" type="button"><?= htmlspecialchars($setupSubmitLabel, ENT_QUOTES, 'UTF-8') ?></button>
          </div>

          <div class="status-panel">
            <div id="setupMessage" class="status-text"><?= htmlspecialchars($setupTitle, ENT_QUOTES, 'UTF-8') ?></div>
          </div>
        </div>
      </div>

      <div id="playerMain" class="app-view app-view-player"<?= $player === '' ? ' hidden' : '' ?>>
        <div class="hero-stage">
          <button id="playButton" class="primary-control" type="button" aria-label="Play / Stop">
            <span class="control-orbit" aria-hidden="true"></span>
            <div id="icon" class="icon play"></div>
          </button>
        </div>

        <div id="contentArea" class="detail-panel">
          <div class="detail-primary">
            <div id="stream" class="primary-status"></div>
          </div>

          <div id="infoWrap" class="status-panel">
            <div id="info" class="status-text"></div>

            <div id="pinWrap" class="confirm-panel">
              <div class="confirm-actions">
                <button id="pinSubmit" class="ui-btn confirm-action" type="button"><?= htmlspecialchars($claimYesLabel, ENT_QUOTES, 'UTF-8') ?></button>
                <button id="pinCancel" class="ui-btn confirm-action confirm-action-secondary" type="button"><?= htmlspecialchars($claimNoLabel, ENT_QUOTES, 'UTF-8') ?></button>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="app-footer">
        <div class="app-footer-brand"><a href="https://fon.fm/" target="_blank" rel="noopener noreferrer">FON.FM APP <?= htmlspecialchars($appVersion, ENT_QUOTES, 'UTF-8') ?></a></div>
      </div>
    </div>
  </div>

  <audio id="audio" preload="auto" playsinline></audio>

  <script>
<?php require __DIR__ . '/player.js.php'; ?>
  </script>
</body>

</html>
