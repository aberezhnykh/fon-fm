<?php

declare(strict_types=1);

/**
 * fon.fm /next
 * Работает только по готовым JSON.
 * Никаких зависимостей от Directus.
 */

$dataDir = '/var/www/app/data/cdn/data';
$settingsPath = __DIR__ . '/config/settings.json';
require_once __DIR__ . '/config/messages.php';
require_once __DIR__ . '/config/settings.php';
require_once __DIR__ . '/runtime.php';
const AD_WINDOW_SECONDS = 300;
const MIN_QUEUE_SECONDS = 300;
const MAX_IDLE_RETRY_SECONDS = 300;
$CURRENT_PLAYER_LEVEL = null;

function normalizePlayerLevel(mixed $value): ?float {
    if ($value === null || $value === '') {
        return null;
    }

    if (!is_numeric($value)) {
        return null;
    }

    $level = (float)$value;
    if ($level < 0) {
        $level = 0;
    }
    if ($level > 100) {
        $level = 100;
    }

    return $level;
}

function normalizedDb(mixed $gain, float $fallback = -3.0): float {
    if ($gain === null || $gain === '' || !is_numeric($gain)) {
        return $fallback;
    }

    $db = (float)$gain;
    if (!is_finite($db)) {
        $db = $fallback;
    }

    if ($db > 0) {
        $db = 0;
    }
    if ($db < -24) {
        $db = -24;
    }

    return $db;
}

function dbToFactor(float $db): float {
    return $db < 0 ? pow(10, $db / 20) : 1.0;
}

function queueVolume(string $type, mixed $gain): float {
    global $CURRENT_PLAYER_LEVEL;

    $basePercent = $type === 'track'
        ? ($CURRENT_PLAYER_LEVEL ?? 100.0)
        : 100.0;

    $base = max(0.0, min(1.0, $basePercent / 100.0));
    $factor = dbToFactor(normalizedDb($gain, -3.0));
    $volume = $base * $factor;

    return max(0.0, min(1.0, $volume));
}

function respond(array $data, int $status = 200): never {
    http_response_code($status);
    header('Content-Type: application/json; charset=utf-8');
    echo json_encode($data, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    exit;
}

function respondQueue(array $queue, string $type = 'queue', bool $ok = true): never {
    respond([
        'ok' => $ok,
        'type' => $type,
        'queue' => array_values($queue),
    ]);
}

function idleMessage(?string $until = null): string {
    $template = trim(player_message_value('idle_until'));
    if ($until !== null && $until !== '') {
        if ($template !== '') {
            return str_replace('{time}', $until, $template);
        }

        $base = trim(player_message_value('idle'));
        return trim($base . ' ' . $until);
    }

    return trim(player_message_value('idle'));
}

function okIdle(string $streamTitle = '', ?int $retryAfter = null, int $offset = -180): never {
    $until = null;
    if ($retryAfter !== null && $retryAfter > 0) {
        $until = gmdate('H:i', localNowTimestamp($offset) + $retryAfter);
    }

    $data = [
        'ok' => true,
        'type' => 'idle',
        'queue' => [
            [
                'type' => 'idle',
                'stream' => $streamTitle,
                'message' => idleMessage($until),
            ],
        ],
    ];

    if ($retryAfter !== null) {
        $data['retry_after'] = max(1, min(MAX_IDLE_RETRY_SECONDS, $retryAfter));
    } else {
        $data['retry_after'] = MAX_IDLE_RETRY_SECONDS;
    }

    respond($data);
}

function okUpdate(string $message = ''): never {
    if ($message === '') {
        $message = player_message('player_update_required');
    }

    respondQueue([
        [
            'type' => 'update',
            'action' => 'reload',
            'message' => $message,
        ],
    ], 'update', false);
}

function message(string $code): never {
    $text = player_message($code);
    $action = player_message_action($code);

    $data = [
        'type' => 'message',
        'reason' => $code,
        'action' => $action,
        'message' => $text,
    ];

    respondQueue([
        $data,
    ], 'message', false);
}

function queueBreak(array $items): array {
    return array_values(array_filter($items, 'is_array'));
}

function adBreak(array $items, bool $exactly = false, ?int $at = null): array {
    $normalized = queueBreak($items);
    return [
        'type' => 'break',
        'exactly' => $exactly,
        'at' => $at,
        'items' => $normalized,
    ];
}

function breakDuration(array $break): int {
    $items = $break['items'] ?? null;
    if (!is_array($items)) {
        return 0;
    }

    $total = 0;

    foreach ($items as $item) {
        if (!is_array($item) || !isset($item['duration']) || !is_numeric($item['duration'])) {
            continue;
        }

        $total += max(0, (int)$item['duration']);
    }

    return $total;
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

function streamPath(string $base, string $stream): string {
    return $base . '/streams/' . $stream . '.json';
}

function playlistPath(string $base, string $playlist): string {
    return $base . '/playlists/' . $playlist . '.json';
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

function localTimestamp(int $offset): int {
    return time() - ($offset * 60);
}

function todayDate(int $offset): string {
    return gmdate('Y-m-d', localTimestamp($offset));
}

function nowTime(int $offset): string {
    return gmdate('H:i:s', localTimestamp($offset));
}

/**
 * 1 = Monday ... 7 = Sunday
 */
function todayDay(int $offset): string {
    return gmdate('N', localTimestamp($offset));
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

function scheduleMatches(array $schedule, string $player, int $offset): bool {
    $today = todayDate($offset);
    $day = todayDay($offset);

    if (!empty($schedule['start']) && $today < (string)$schedule['start']) {
        return false;
    }

    if (!empty($schedule['weekdays']) && is_array($schedule['weekdays'])) {
        $days = array_map('strval', $schedule['weekdays']);
        if (!in_array($day, $days, true)) {
            return false;
        }
    }

    if (empty($schedule['players']) || !is_array($schedule['players'])) {
        return false;
    }

    $players = array_map('strval', $schedule['players']);
    return in_array($player, $players, true);
}

function pickSchedule(array $schedules, string $player, int $offset): ?array {
    $best = null;
    $bestStart = '';

    foreach ($schedules as $schedule) {
        if (!is_array($schedule)) {
            continue;
        }

        if (!scheduleMatches($schedule, $player, $offset)) {
            continue;
        }

        $start = isset($schedule['start']) ? (string)$schedule['start'] : '';

        if ($best === null) {
            $best = $schedule;
            $bestStart = $start;
            continue;
        }

        if ($start > $bestStart) {
            $best = $schedule;
            $bestStart = $start;
            continue;
        }

        if ($start === $bestStart) {
            $best = $schedule;
            $bestStart = $start;
        }
    }

    return $best;
}

function pickSlot(array $slots, int $offset): ?array {
    if (!$slots) {
        return null;
    }

    usort($slots, static function (mixed $a, mixed $b): int {
        $aStart = is_array($a) && isset($a['time']) ? (string)$a['time'] : '';
        $bStart = is_array($b) && isset($b['time']) ? (string)$b['time'] : '';
        return strcmp($aStart, $bStart);
    });

    $now = nowTime($offset);
    $current = null;

    foreach ($slots as $slot) {
        if (!is_array($slot) || empty($slot['time'])) {
            continue;
        }

        if ((string)$slot['time'] <= $now) {
            $current = $slot;
        }
    }

    if ($current !== null) {
        return $current;
    }

    // Если сегодня еще не дошли до первого слота, держим последний слот со вчера.
    for ($i = count($slots) - 1; $i >= 0; $i--) {
        if (is_array($slots[$i]) && !empty($slots[$i]['time'])) {
            return $slots[$i];
        }
    }

    return null;
}

function scheduleAllowsDate(array $schedule, string $date, string $day): bool {
    if (!empty($schedule['start']) && $date < (string)$schedule['start']) {
        return false;
    }

    if (!empty($schedule['weekdays']) && is_array($schedule['weekdays'])) {
        $days = array_map('strval', $schedule['weekdays']);
        if (!in_array($day, $days, true)) {
            return false;
        }
    }

    return true;
}

function nextSlotDelay(array $schedule, int $offset): ?int {
    $slots = $schedule['slots'] ?? null;
    if (!is_array($slots) || !$slots) {
        return null;
    }

    usort($slots, static function (mixed $a, mixed $b): int {
        $aStart = is_array($a) && isset($a['time']) ? (string)$a['time'] : '';
        $bStart = is_array($b) && isset($b['time']) ? (string)$b['time'] : '';
        return strcmp($aStart, $bStart);
    });

    $nowTime = nowTime($offset);
    $nowLocal = localNowTimestamp($offset);
    $todayDate = todayDate($offset);

    for ($dayOffset = 0; $dayOffset <= 7; $dayOffset++) {
        $date = gmdate('Y-m-d', strtotime($todayDate . ' +' . $dayOffset . ' days'));
        $day = gmdate('N', strtotime($date));

        if (!scheduleAllowsDate($schedule, $date, $day)) {
            continue;
        }

        foreach ($slots as $slot) {
            if (!is_array($slot) || empty($slot['time'])) {
                continue;
            }

            $slotStart = (string)$slot['time'];
            if ($dayOffset === 0 && $slotStart <= $nowTime) {
                continue;
            }

            [$hour, $minute, $second] = array_pad(array_map('intval', explode(':', $slotStart)), 3, 0);
            $slotTimestamp = localDateTimeTimestamp($date, $hour, $minute) + $second;
            $delay = $slotTimestamp - $nowLocal;

            if ($delay > 0) {
                return $delay;
            }
        }
    }

    return null;
}

function pickPlaylist(array $playlists, ?int $currentIndex): array {
    $count = count($playlists);

    if ($count === 0) {
        return ['index' => null, 'id' => null];
    }

    if ($count === 1) {
        return ['index' => 0, 'id' => (string)$playlists[0]];
    }

    if ($currentIndex === null || $currentIndex < 0 || $currentIndex >= $count) {
        $index = array_rand($playlists);
        return ['index' => $index, 'id' => (string)$playlists[$index]];
    }

    $index = $currentIndex + 1;

    if ($index >= $count) {
        $index = 0;
    }

    return ['index' => $index, 'id' => (string)$playlists[$index]];
}

function randomValue(array $items): mixed {
    if (!$items) {
        return null;
    }

    return $items[array_rand($items)];
}

function normalizeDevice(mixed $value): string {
    return trim((string)$value);
}

function localDateTimeTimestamp(string $date, int $hour, int $minute): int {
    [$year, $month, $day] = array_map('intval', explode('-', $date));
    return gmmktime($hour, $minute, 0, $month, $day, $year);
}

function localNowTimestamp(int $offset): int {
    return localTimestamp($offset);
}

function adMatchesFilters(array $ad, string $player, int $offset): bool {
    $today = todayDate($offset);
    $day = todayDay($offset);

    if (!empty($ad['start']) && $today < (string)$ad['start']) {
        return false;
    }

    if (!empty($ad['end']) && $today > (string)$ad['end']) {
        return false;
    }

    if (!empty($ad['weekdays']) && is_array($ad['weekdays'])) {
        $days = array_map('strval', $ad['weekdays']);
        if (!in_array($day, $days, true)) {
            return false;
        }
    }

    if (!empty($ad['players']) && is_array($ad['players'])) {
        $players = array_map('strval', $ad['players']);
        if (!in_array($player, $players, true)) {
            return false;
        }
    }

    return !empty($ad['id']);
}

function adSlotsForDate(array $ad, string $date): array {
    if (!isset($ad['time']) || !is_string($ad['time']) || trim($ad['time']) === '') {
        return [];
    }

    [$hour, $minute] = array_pad(array_map('intval', explode(':', (string)$ad['time'])), 2, 0);

    if ($hour < 0 || $hour > 23 || $minute < 0 || $minute > 59) {
        return [];
    }

    $base = localDateTimeTimestamp($date, $hour, $minute);
    $interval = isset($ad['interval']) ? (int)$ad['interval'] : 0;
    $slots = [$base];

    if ($interval <= 0) {
        return $slots;
    }

    $step = $interval * 60;
    $endOfDay = localDateTimeTimestamp($date, 23, 59) + 59;

    for ($ts = $base + $step; $ts <= $endOfDay; $ts += $step) {
        $slots[] = $ts;
    }

    return $slots;
}

function adMedia(array $ad, int $slotTimestamp): array {
    return [
        'type' => 'ad',
        'id' => (string)$ad['id'],
        'title' => isset($ad['title']) ? trim((string)$ad['title']) : player_message_value('ad_label'),
        'duration' => isset($ad['duration']) ? (int)$ad['duration'] : 0,
        'volume' => queueVolume('ad', $ad['gain'] ?? null),
    ];
}

function pickDueBreakNow(array $ads, string $player, int $offset): ?array {
    $today = todayDate($offset);
    $now = localNowTimestamp($offset);
    $pickedSlot = null;
    $pickedItems = [];
    $pickedExactly = false;

    foreach ($ads as $ad) {
        if (!is_array($ad) || !adMatchesFilters($ad, $player, $offset)) {
            continue;
        }

        foreach (adSlotsForDate($ad, $today) as $slotTimestamp) {
            if ($slotTimestamp > $now) {
                continue;
            }

            if ($now >= ($slotTimestamp + AD_WINDOW_SECONDS)) {
                continue;
            }

            if ($pickedSlot === null || $slotTimestamp < $pickedSlot) {
                $pickedSlot = $slotTimestamp;
                $pickedItems = [adMedia($ad, $slotTimestamp)];
                $pickedExactly = !empty($ad['exactly']);
                continue;
            }

            if ($pickedSlot === $slotTimestamp) {
                $pickedItems[] = adMedia($ad, $slotTimestamp);
                $pickedExactly = $pickedExactly || !empty($ad['exactly']);
            }
        }
    }

    if ($pickedSlot === null || !$pickedItems) {
        return null;
    }

    return [
        'slot' => $pickedSlot,
        'break' => adBreak($pickedItems, $pickedExactly, $pickedSlot),
    ];
}

function pickUpcomingBreak(array $ads, string $player, int $offset, int $fromLocal, int $untilLocal): ?array {
    $today = todayDate($offset);
    $pickedSlot = null;
    $pickedItems = [];
    $pickedExactly = false;

    foreach ($ads as $ad) {
        if (!is_array($ad) || !adMatchesFilters($ad, $player, $offset)) {
            continue;
        }

        foreach (adSlotsForDate($ad, $today) as $slotTimestamp) {
            if ($slotTimestamp <= $fromLocal) {
                continue;
            }

            if ($slotTimestamp > $untilLocal) {
                continue;
            }

            if ($pickedSlot === null || $slotTimestamp < $pickedSlot) {
                $pickedSlot = $slotTimestamp;
                $pickedItems = [adMedia($ad, $slotTimestamp)];
                $pickedExactly = !empty($ad['exactly']);
                continue;
            }

            if ($pickedSlot === $slotTimestamp) {
                $pickedItems[] = adMedia($ad, $slotTimestamp);
                $pickedExactly = $pickedExactly || !empty($ad['exactly']);
            }
        }
    }

    if ($pickedSlot === null || !$pickedItems) {
        return null;
    }

    return [
        'slot' => $pickedSlot,
        'break' => adBreak($pickedItems, $pickedExactly, $pickedSlot),
    ];
}

function pickTrackFromPlaylists(string $dataDir, array $playlists, ?int $playlistIndex, string $streamTitle): ?array {
    $playlistPick = pickPlaylist($playlists, $playlistIndex);

    if ($playlistPick['id'] === null || $playlistPick['index'] === null) {
        return null;
    }

    $playlistData = runtime_read_json(playlistPath($dataDir, (string)$playlistPick['id']));
    if (!is_array($playlistData)) {
        return null;
    }

    $tracks = $playlistData['tracks'] ?? null;
    if (!is_array($tracks) || !$tracks) {
        return null;
    }

    $track = randomValue($tracks);
    if (!is_array($track)) {
        return null;
    }

    $track['volume'] = queueVolume('track', $track['gain'] ?? null);
    unset($track['gain']);
    $track['playlist'] = $playlistPick['index'];
    $track['stream'] = $streamTitle;
    $track['type'] = 'track';

    return [
        'track' => $track,
        'playlist_index' => $playlistPick['index'],
    ];
}

function buildQueue(
    string $dataDir,
    array $playlists,
    string $streamTitle,
    array $ads,
    string $player,
    int $offset,
    ?int $playlistIndex,
    int $startLocal
): array {
    // Сервер собирает вперед только безопасный запас контента.
    $queue = [];
    $currentLocal = $startLocal;
    $queueSeconds = 0;
    $currentPlaylistIndex = $playlistIndex;
    $iterations = 0;

    while ($queueSeconds < MIN_QUEUE_SECONDS && $iterations < 24) {
        $iterations++;

        $pick = pickTrackFromPlaylists($dataDir, $playlists, $currentPlaylistIndex, $streamTitle);
        if (!is_array($pick)) {
            break;
        }

        $track = $pick['track'];
        $currentPlaylistIndex = $pick['playlist_index'];

        $trackDuration = isset($track['duration']) && is_numeric($track['duration']) ? max(0, (int)$track['duration']) : 0;
        if ($trackDuration <= 0) {
            $queue[] = $track;
            break;
        }

        $trackEndLocal = $currentLocal + $trackDuration;
        $upcomingBreak = pickUpcomingBreak($ads, $player, $offset, $currentLocal, $trackEndLocal);

        if ($upcomingBreak === null) {
            $queue[] = $track;
            $queueSeconds += $trackDuration;
            $currentLocal += $trackDuration;
            continue;
        }

        $break = $upcomingBreak['break'];
        $breakSlot = $upcomingBreak['slot'];

        // Для exact-блока считаем укороченную длину трека только для сборки очереди.
        if (!empty($break['exactly'])) {
            $playFor = max(1, $breakSlot - $currentLocal);
            if ($playFor < $trackDuration) {
                $track['play_for'] = $playFor;
                $queueSeconds += $playFor;
                $currentLocal += $playFor;
            } else {
                $queueSeconds += $trackDuration;
                $currentLocal += $trackDuration;
            }
        } else {
            $queueSeconds += $trackDuration;
            $currentLocal += $trackDuration;
        }

        $queue[] = $track;
        $queue[] = $break;

        $queueSeconds += breakDuration($break);
        $currentLocal += breakDuration($break);
    }

    return [
        'queue' => $queue,
    ];
}

/**
 * Start
 */

$player = isset($_GET['player']) ? runtime_normalize_player_code($_GET['player']) : '';
$device = isset($_GET['device']) ? normalizeDevice($_GET['device']) : '';
$tzOffset = resolveTimezoneOffsetMinutes();
$clientVersion = isset($_GET['version']) ? trim((string)$_GET['version']) : '';
$startMode = isset($_GET['start']) ? trim((string)$_GET['start']) : '';
$playlistIndex = null;
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

if (isset($_GET['playlist']) && $_GET['playlist'] !== '') {
    $playlistIndex = (int)$_GET['playlist'];
}

$context = runtime_resolve_player_context($dataDir, $player);
if (!is_array($context) || !is_array($context['player'] ?? null)) {
    message('player_not_found');
}

/** @var array<string,mixed> $playerData */
$playerData = $context['player'];
$playerId = trim((string)($context['player_id'] ?? ''));
if ($playerId === '') {
    message('player_not_found');
}

$CURRENT_PLAYER_LEVEL = normalizePlayerLevel($playerData['level'] ?? null);

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

$client = trim((string)($context['client_id'] ?? ''));
if ($client === '') {
    message('player_client_missing');
}

/** @var mixed $clientData */
$clientData = $context['client'] ?? null;
if (!is_array($clientData)) {
    message('client_not_found');
}

if (isset($clientData['status']) && !isActiveStatus($clientData['status'])) {
    message('client_inactive');
}

if (isExpired($clientData['end'] ?? null, $tzOffset)) {
    message('client_inactive');
}

$ads = isset($clientData['ads']) && is_array($clientData['ads']) ? $clientData['ads'] : [];

$schedules = isset($clientData['schedules']) && is_array($clientData['schedules']) ? $clientData['schedules'] : [];
if (!$schedules) {
    okIdle('', null, $tzOffset);
}

$schedule = pickSchedule($schedules, $playerId, $tzOffset);
if ($schedule === null) {
    okIdle('', null, $tzOffset);
}

$slots = $schedule['slots'] ?? null;
if (!is_array($slots) || !$slots) {
    okIdle('', null, $tzOffset);
}

$slot = pickSlot($slots, $tzOffset);
if ($slot === null) {
    okIdle('', nextSlotDelay($schedule, $tzOffset), $tzOffset);
}

$stream = isset($slot['stream']) ? (string)$slot['stream'] : '';
if ($stream === '') {
    okIdle('', nextSlotDelay($schedule, $tzOffset), $tzOffset);
}

$streamData = runtime_read_json(streamPath($dataDir, $stream));
if (!is_array($streamData)) {
    message('stream_not_found');
}

$streamTitle = isset($streamData['title']) ? trim((string)$streamData['title']) : '';

$playlists = $streamData['playlists'] ?? null;
if (!is_array($playlists) || !$playlists) {
    okIdle($streamTitle, null, $tzOffset);
}

$dueBreak = pickDueBreakNow($ads, $playerId, $tzOffset);
if ($startMode !== 'manual' && $startMode !== 'auto' && $dueBreak !== null) {
    $queueBuild = buildQueue(
        $dataDir,
        $playlists,
        $streamTitle,
        $ads,
        $playerId,
        $tzOffset,
        $playlistIndex,
        $dueBreak['slot'] + breakDuration($dueBreak['break'])
    );

    $tailQueue = $queueBuild['queue'] ?? [];
    respondQueue(array_merge([$dueBreak['break']], is_array($tailQueue) ? $tailQueue : []));
}

$queueBuild = buildQueue(
    $dataDir,
    $playlists,
    $streamTitle,
    $ads,
    $playerId,
    $tzOffset,
    $playlistIndex,
    localNowTimestamp($tzOffset)
);

$queue = $queueBuild['queue'] ?? null;
if (!is_array($queue) || !$queue) {
    okIdle($streamTitle, null, $tzOffset);
}

respondQueue($queue);
