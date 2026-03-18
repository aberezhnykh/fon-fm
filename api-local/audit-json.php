<?php

// audit-json.php

declare(strict_types=1);
require __DIR__ . '/common.php';

// Служебный аудит: сравнивает ожидаемые runtime JSON с тем, что реально лежит на диске.
function value_id($value): string {
    if (is_string($value) || is_int($value)) return trim((string)$value);
    if (is_array($value)) return trim((string)($value['id'] ?? ''));
    return '';
}

function list_json_ids(string $dir): array {
    if (!is_dir($dir)) return [];

    $ids = [];
    foreach (scandir($dir) ?: [] as $name) {
        if (!is_string($name) || substr($name, -5) !== '.json') continue;
        $id = substr($name, 0, -5);
        if ($id === '') continue;
        $ids[] = $id;
    }

    sort($ids);
    return array_values(array_unique($ids));
}

function diff_ids(array $expected, array $actual): array {
    $expected = array_values(array_unique(array_filter(array_map('strval', $expected))));
    $actual = array_values(array_unique(array_filter(array_map('strval', $actual))));

    return [
        'missing' => array_values(array_diff($expected, $actual)),
        'extra' => array_values(array_diff($actual, $expected)),
    ];
}

function call_local_php(array $ENV, string $script, array $ids): array {
    $base = rtrim((string)($ENV['API_LOCAL_URL'] ?? ''), '/');
    $key = (string)($ENV['API_KEY'] ?? '');

    if ($base === '' || $key === '') {
        json_out(['ok' => false, 'error' => 'api_local_env_missing'], 500);
    }

    $res = http_req_json('POST', $base . '/' . $script, [
        'X-Api-Key: ' . $key,
    ], ['ids' => array_values(array_unique($ids))]);

    if ($res['status'] < 200 || $res['status'] >= 300 || !is_array($res['body'])) {
        return ['ok' => false, 'status' => $res['status'], 'raw' => $res['raw']];
    }

    return ['ok' => true, 'body' => $res['body']];
}

function delete_json_ids(string $dir, array $ids): int {
    $count = 0;
    foreach ($ids as $id) {
        $id = trim((string)$id);
        if ($id === '') continue;
        delete_file($dir, $id . '.json');
        $count++;
    }
    return $count;
}

api_key_check($ENV);
$lock = lock_open('audit-json');

$dirs = [
    'clients' => '/var/www/app/data/cdn/data/clients',
    'players' => '/var/www/app/data/cdn/data/players',
    'streams' => '/var/www/app/data/cdn/data/streams',
    'playlists' => '/var/www/app/data/cdn/data/playlists',
];

$scripts = [
    'clients' => 'clients-json.php',
    'players' => 'players-json.php',
    'streams' => 'streams-json.php',
    'playlists' => 'playlists-json.php',
];

$body = read_json_body();
$mode = trim((string)($body['mode'] ?? ($_GET['mode'] ?? 'audit')));
if ($mode === '') $mode = 'audit';
if (!in_array($mode, ['audit', 'fix'], true)) json_out(['ok' => false, 'error' => 'bad_mode'], 400);

$limit = '10000';

$expected = [
    'clients' => [],
    'players' => [],
    'streams' => [],
    'playlists' => [],
];

$errors = [];

$resClients = directus_get($ENV, '/items/clients', [
    'fields' => 'id,status',
    'limit' => $limit,
]);
if (!$resClients['ok']) $errors[] = ['entity' => 'clients', 'error' => $resClients['error'], 'status' => $resClients['status'] ?? 0];
$clientsRows = $resClients['ok'] && is_array($resClients['data']['data'] ?? null) ? $resClients['data']['data'] : [];

foreach ($clientsRows as $row) {
    if (!is_array($row)) continue;
    $id = trim((string)($row['id'] ?? ''));
    if ($id === '') continue;
    $status = trim((string)($row['status'] ?? ''));
    if ($status !== 'archived') $expected['clients'][] = $id;
}

$resPlayers = directus_get($ENV, '/items/players', [
    'fields' => 'id,status,client,stream',
    'limit' => $limit,
]);
if (!$resPlayers['ok']) $errors[] = ['entity' => 'players', 'error' => $resPlayers['error'], 'status' => $resPlayers['status'] ?? 0];
$playersRows = $resPlayers['ok'] && is_array($resPlayers['data']['data'] ?? null) ? $resPlayers['data']['data'] : [];

$streamIdsFromPlayers = [];
foreach ($playersRows as $row) {
    if (!is_array($row)) continue;
    $id = trim((string)($row['id'] ?? ''));
    if ($id === '') continue;

    if (($row['status'] ?? '') !== 'archived') $expected['players'][] = $id;

    $streamId = value_id($row['stream'] ?? null);
    if ($streamId !== '') $streamIdsFromPlayers[] = $streamId;
}

$resPlaylists = directus_get($ENV, '/items/playlists', [
    'fields' => 'id,status',
    'filter[status][_eq]' => 'active',
    'limit' => $limit,
]);
if (!$resPlaylists['ok']) $errors[] = ['entity' => 'playlists', 'error' => $resPlaylists['error'], 'status' => $resPlaylists['status'] ?? 0];
$playlistRows = $resPlaylists['ok'] && is_array($resPlaylists['data']['data'] ?? null) ? $resPlaylists['data']['data'] : [];

$activePlaylistIds = [];
foreach ($playlistRows as $row) {
    if (!is_array($row)) continue;
    $id = trim((string)($row['id'] ?? ''));
    if ($id === '') continue;
    $activePlaylistIds[$id] = true;
}

// Playlist существует в runtime только если он active и у него есть активные треки.
$resTracksForPlaylists = directus_get($ENV, '/items/tracks', [
    'fields' => 'set',
    'filter[status][_eq]' => 'active',
    'limit' => $limit,
]);
if (!$resTracksForPlaylists['ok']) $errors[] = ['entity' => 'tracks', 'error' => $resTracksForPlaylists['error'], 'status' => $resTracksForPlaylists['status'] ?? 0];
$trackRows = $resTracksForPlaylists['ok'] && is_array($resTracksForPlaylists['data']['data'] ?? null) ? $resTracksForPlaylists['data']['data'] : [];

$resSets = directus_get($ENV, '/items/sets', [
    'fields' => 'id,playlist,status',
    'limit' => $limit,
]);
if (!$resSets['ok']) $errors[] = ['entity' => 'sets', 'error' => $resSets['error'], 'status' => $resSets['status'] ?? 0];
$setRows = $resSets['ok'] && is_array($resSets['data']['data'] ?? null) ? $resSets['data']['data'] : [];

$playlistBySet = [];
foreach ($setRows as $row) {
    if (!is_array($row)) continue;
    $setId = trim((string)($row['id'] ?? ''));
    $playlistId = value_id($row['playlist'] ?? null);
    if ($setId === '' || $playlistId === '' || ($row['status'] ?? '') !== 'active') continue;
    $playlistBySet[$setId] = $playlistId;
}

$playlistTrackCount = [];
foreach ($trackRows as $row) {
    if (!is_array($row)) continue;
    $setId = value_id($row['set'] ?? null);
    $playlistId = $setId !== '' ? (string)($playlistBySet[$setId] ?? '') : '';
    if ($playlistId === '' || empty($activePlaylistIds[$playlistId])) continue;
    $playlistTrackCount[$playlistId] = (int)($playlistTrackCount[$playlistId] ?? 0) + 1;
}

foreach (array_keys($playlistTrackCount) as $playlistId) {
    if ($playlistTrackCount[$playlistId] > 0) $expected['playlists'][] = $playlistId;
}

$resStreams = directus_get($ENV, '/items/streams', [
    'fields' => 'id,status,client',
    'filter[status][_eq]' => 'active',
    'limit' => $limit,
]);
if (!$resStreams['ok']) $errors[] = ['entity' => 'streams', 'error' => $resStreams['error'], 'status' => $resStreams['status'] ?? 0];
$streamRows = $resStreams['ok'] && is_array($resStreams['data']['data'] ?? null) ? $resStreams['data']['data'] : [];

$streamByClient = [];
$candidateStreams = [];
foreach ($streamRows as $row) {
    if (!is_array($row)) continue;
    $streamId = trim((string)($row['id'] ?? ''));
    if ($streamId === '') continue;
    $candidateStreams[$streamId] = true;

    $clientId = value_id($row['client'] ?? null);
    if ($clientId !== '') {
        if (!isset($streamByClient[$clientId])) $streamByClient[$clientId] = [];
        $streamByClient[$clientId][] = $streamId;
    }
}
foreach ($streamIdsFromPlayers as $streamId) $candidateStreams[$streamId] = true;

$resStreamsPlaylists = directus_get($ENV, '/items/streams_playlists', [
    'fields' => 'streams_id,playlists_id.id,playlists_id.status',
    'limit' => $limit,
]);
if (!$resStreamsPlaylists['ok']) $errors[] = ['entity' => 'streams_playlists', 'error' => $resStreamsPlaylists['error'], 'status' => $resStreamsPlaylists['status'] ?? 0];
$streamsPlaylistsRows = $resStreamsPlaylists['ok'] && is_array($resStreamsPlaylists['data']['data'] ?? null) ? $resStreamsPlaylists['data']['data'] : [];

$streamHasPlaylist = [];
foreach ($streamsPlaylistsRows as $row) {
    if (!is_array($row)) continue;
    $streamId = value_id($row['streams_id'] ?? null);
    $playlist = $row['playlists_id'] ?? null;
    $playlistId = value_id($playlist);
    $playlistStatus = is_array($playlist) ? trim((string)($playlist['status'] ?? '')) : '';
    // Поток существует в runtime только если в нем есть active playlist с count > 0.
    if ($streamId === '' || $playlistId === '' || $playlistStatus !== 'active') continue;
    if (($playlistTrackCount[$playlistId] ?? 0) <= 0) continue;
    $streamHasPlaylist[$streamId] = true;
}
foreach (array_keys($candidateStreams) as $streamId) {
    if (!empty($streamHasPlaylist[$streamId])) $expected['streams'][] = $streamId;
}

$resSchedulesPlayers = directus_get($ENV, '/items/schedules_players', [
    'fields' => 'schedules_id.id,players_id.id',
    'limit' => $limit,
]);
if (!$resSchedulesPlayers['ok']) $errors[] = ['entity' => 'schedules_players', 'error' => $resSchedulesPlayers['error'], 'status' => $resSchedulesPlayers['status'] ?? 0];
$schedulesPlayersRows = $resSchedulesPlayers['ok'] && is_array($resSchedulesPlayers['data']['data'] ?? null) ? $resSchedulesPlayers['data']['data'] : [];

$scheduleIds = [];
foreach ($schedulesPlayersRows as $row) {
    if (!is_array($row)) continue;
    $scheduleId = value_id($row['schedules_id'] ?? null);
    $playerId = value_id($row['players_id'] ?? null);
    if ($scheduleId === '' || $playerId === '') continue;
    if (!in_array($scheduleId, $scheduleIds, true)) $scheduleIds[] = $scheduleId;
}
if ($scheduleIds) {
    $resSchedules = directus_get($ENV, '/items/schedules', [
        'fields' => 'id,status,slots.id,slots.start',
        'filter[id][_in]' => implode(',', $scheduleIds),
        'limit' => $limit,
    ]);
    if (!$resSchedules['ok']) $errors[] = ['entity' => 'schedules', 'error' => $resSchedules['error'], 'status' => $resSchedules['status'] ?? 0];
    $scheduleRows = $resSchedules['ok'] && is_array($resSchedules['data']['data'] ?? null) ? $resSchedules['data']['data'] : [];

    foreach ($scheduleRows as $row) {
        if (!is_array($row) || ($row['status'] ?? '') !== 'active') continue;
        $scheduleId = trim((string)($row['id'] ?? ''));
        if ($scheduleId === '') continue;
        $slots = $row['slots'] ?? [];
        if (!is_array($slots) || $slots === []) continue;
    }
}

foreach ($expected as $key => $ids) {
    $expected[$key] = array_values(array_unique($ids));
    sort($expected[$key]);
}

$result = [];
foreach ($dirs as $key => $dir) {
    $actual = list_json_ids($dir);
    $diff = diff_ids($expected[$key], $actual);
    $result[$key] = [
        'expected' => count($expected[$key]),
        'actual' => count($actual),
        'missing' => $diff['missing'],
        'extra' => $diff['extra'],
    ];
}

$fixed = [
    'written' => [],
    'deleted' => [],
    'errors' => [],
];

if ($mode === 'fix') {
    foreach ($dirs as $key => $dir) {
        $missing = $result[$key]['missing'];
        $extra = $result[$key]['extra'];

        if ($missing) {
            $res = call_local_php($ENV, $scripts[$key], $missing);
            if ($res['ok']) {
                $fixed['written'][$key] = count($missing);
            } else {
                $fixed['errors'][] = ['entity' => $key, 'action' => 'write', 'status' => $res['status'] ?? 0];
            }
        }

        if ($extra) {
            $fixed['deleted'][$key] = delete_json_ids($dir, $extra);
        }
    }
}

json_out([
    'ok' => true,
    'mode' => $mode,
    'result' => $result,
    'fixed' => $fixed,
    'errors' => $errors,
]);
