<?php

declare(strict_types=1);

/**
 * fon.fm /data
 * Отдает автономную инструкцию для конкретного плеера по готовым JSON.
 * Никаких зависимостей от Directus.
 */

$dataDir = '/var/www/app/data/cdn/data';
$settingsPath = __DIR__ . '/config/settings.json';
require_once __DIR__ . '/config/messages.php';
require_once __DIR__ . '/config/settings.php';
require_once __DIR__ . '/runtime.php';

function respond(array $data, int $status = 200): never {
    http_response_code($status);
    header('Content-Type: application/json; charset=utf-8');
    echo json_encode($data, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    exit;
}

function okUpdate(string $message = ''): never {
    if ($message === '') {
        $message = player_message('player_update_required');
    }

    respond([
        'ok' => false,
        'type' => 'update',
        'action' => 'reload',
        'message' => $message,
    ]);
}

function message(string $code): never {
    respond([
        'ok' => false,
        'type' => 'message',
        'reason' => $code,
        'action' => player_message_action($code),
        'message' => player_message($code),
    ]);
}

function writeJsonFile(string $path, array $data): bool {
    $dir = dirname($path);

    if (!is_dir($dir) && !mkdir($dir, 0775, true) && !is_dir($dir)) {
        return false;
    }

    $json = json_encode($data, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    if ($json === false) {
        return false;
    }

    return file_put_contents($path, $json . PHP_EOL, LOCK_EX) !== false;
}

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

function todayDate(int $offset): string {
    return gmdate('Y-m-d', time() - ($offset * 60));
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

function normalizeDevice(mixed $value): string {
    return trim((string)$value);
}

function playerInSchedule(array $schedule, string $playerId): bool {
    $players = $schedule['players'] ?? null;
    if (!is_array($players) || !$players) {
        return false;
    }

    return in_array($playerId, array_map('strval', $players), true);
}

function normalizeAd(array $ad): array {
    $out = $ad;
    unset($out['players']);
    $out['type'] = 'ad';
    return $out;
}

function cleanArray(array $data): array {
    $out = [];
    $isList = array_keys($data) === range(0, count($data) - 1);

    foreach ($data as $key => $value) {
        if (is_array($value)) {
            $value = cleanArray($value);
        }

        if ($value === null || $value === '' || (is_array($value) && $value === [])) {
            continue;
        }

        if ($isList) {
            $out[] = $value;
        } else {
            $out[$key] = $value;
        }
    }

    return $out;
}

function streamPath(string $base, string $stream): string {
    return $base . '/streams/' . $stream . '.json';
}

function playlistPath(string $base, string $playlist): string {
    return $base . '/playlists/' . $playlist . '.json';
}

function normalizePlaylistInstruction(string $dataDir, string $playlistId): ?array {
    $playlistId = trim($playlistId);
    if ($playlistId === '') {
        return null;
    }

    $playlistData = runtime_read_json(playlistPath($dataDir, $playlistId));
    if (!is_array($playlistData)) {
        return null;
    }

    unset($playlistData['tracks']);
    $playlistData['id'] = $playlistId;

    $playlistData = cleanArray($playlistData);
    return $playlistData !== [] ? $playlistData : null;
}

function normalizeStreamInstruction(string $dataDir, string $streamId): ?array {
    $streamId = trim($streamId);
    if ($streamId === '') {
        return null;
    }

    $streamData = runtime_read_json(streamPath($dataDir, $streamId));
    if (!is_array($streamData)) {
        return null;
    }

    $streamData['id'] = $streamId;
    $streamData = cleanArray($streamData);

    return $streamData !== [] ? $streamData : null;
}

function buildStreamPlaylists(string $dataDir, string $streamId, int $limit = 3): array {
    if ($streamId === '' || $limit <= 0) {
        return [];
    }

    $streamData = runtime_read_json(streamPath($dataDir, $streamId));
    if (!is_array($streamData)) {
        return [];
    }

    $playlists = $streamData['playlists'] ?? null;
    if (!is_array($playlists) || !$playlists) {
        return [];
    }

    $out = [];

    foreach (array_slice($playlists, 0, $limit) as $playlistId) {
        $playlistJson = normalizePlaylistInstruction($dataDir, (string)$playlistId);
        if ($playlistJson === null) {
            continue;
        }
        $out[] = $playlistJson;
    }

    return $out;
}

function buildSchedulesInstruction(string $dataDir, array $clientData, string $playerId): ?array {
    $schedules = $clientData['schedules'] ?? null;
    if (!is_array($schedules)) {
        return [];
    }

    $out = [];

    foreach ($schedules as $schedule) {
        if (!is_array($schedule) || !playerInSchedule($schedule, $playerId)) {
            continue;
        }

        $slots = $schedule['slots'] ?? null;
        if (!is_array($slots)) {
            continue;
        }

        $slotsOut = [];
        foreach ($slots as $slot) {
            if (!is_array($slot)) {
                continue;
            }

            $streamId = trim((string)($slot['stream'] ?? ''));
            $streamJson = normalizeStreamInstruction($dataDir, $streamId);
            if (is_array($streamJson)) {
                $streamJson['playlists'] = buildStreamPlaylists($dataDir, $streamId, 3);
                $streamJson = cleanArray($streamJson);
            }
            $slotsOut[] = cleanArray([
                'time' => $slot['time'] ?? '',
                'stream' => $streamJson,
            ]);
        }

        $out[] = cleanArray([
            'id' => $schedule['id'] ?? null,
            'status' => $schedule['status'] ?? null,
            'updated' => $schedule['updated'] ?? null,
            'title' => $schedule['title'] ?? '',
            'start' => $schedule['start'] ?? '',
            'weekdays' => $schedule['weekdays'] ?? null,
            'slots' => $slotsOut,
        ]);
    }

    return $out;
}

$player = isset($_GET['player']) ? runtime_normalize_player_code($_GET['player']) : '';
$device = isset($_GET['device']) ? normalizeDevice($_GET['device']) : '';
$tzOffset = resolveTimezoneOffsetMinutes();
$clientVersion = isset($_GET['version']) ? trim((string)$_GET['version']) : '';
$serverVersion = player_settings_app_version($settingsPath);

if ($serverVersion !== '' && $clientVersion !== '' && $clientVersion !== $serverVersion) {
    okUpdate();
}

if ($player === '') {
    message('player_required');
}

if ($device === '') {
    message('device_required');
}

$context = runtime_resolve_player_context($dataDir, $player);
if (!is_array($context)) {
    message('player_not_found');
}

/** @var mixed $clientData */
$clientData = $context['client'] ?? null;
if (!is_array($clientData)) {
    message('config_error');
}

if (!is_array($context['player'] ?? null)) {
    message('player_not_found');
}

/** @var array<string,mixed> $playerData */
$playerData = $context['player'];
$playerId = trim((string)($context['player_id'] ?? ''));
if ($playerId === '') {
    message('config_error');
}

if (isset($playerData['status']) && !isActiveStatus($playerData['status'])) {
    message('player_inactive');
}

if (isExpired($playerData['end'] ?? null, $tzOffset)) {
    message('player_expired');
}

$deviceFile = runtime_device_path($dataDir, $playerId);
$deviceData = runtime_read_json($deviceFile);
$storedDevice = '';

if (is_array($deviceData) && isset($deviceData['device'])) {
    $storedDevice = normalizeDevice($deviceData['device']);
}

if ($storedDevice === '') {
    $ok = writeJsonFile($deviceFile, [
        'device' => $device,
    ]);

    if (!$ok) {
        message('config_error');
    }
} elseif ($storedDevice !== $device) {
    message('device_busy');
}

$clientId = trim((string)($context['client_id'] ?? ''));
if ($clientId === '') {
    message('config_error');
}

if (isset($clientData['status']) && !isActiveStatus($clientData['status'])) {
    message('client_inactive');
}

if (isExpired($clientData['end'] ?? null, $tzOffset)) {
    message('client_inactive');
}

$ads = isset($clientData['ads']) && is_array($clientData['ads']) ? $clientData['ads'] : [];
$adsOut = [];
foreach ($ads as $ad) {
    if (!is_array($ad)) {
        continue;
    }
    $adsOut[] = normalizeAd($ad);
}

$schedulesOut = buildSchedulesInstruction($dataDir, $clientData, $playerId);
if ($schedulesOut === null) {
    message('config_error');
}

respond(cleanArray([
    'ok' => true,
    'type' => 'data',
    'updated' => gmdate('Y-m-d\TH:i:s\Z'),
    'player' => [
        'id' => $playerId,
        'code' => $playerData['code'] ?? $player,
        'title' => $playerData['title'] ?? '',
        'status' => $playerData['status'] ?? '',
        'end' => $playerData['end'] ?? '',
        'level' => $playerData['level'] ?? null,
    ],
    'ads' => $adsOut,
    'schedules' => $schedulesOut,
]));
