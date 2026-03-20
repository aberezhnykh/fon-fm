<?php

// playlists-json.php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$lock = lock_open('playlists-json');

function playlist_json_normalize_track(array $track): array {
    if (array_key_exists('duration', $track)) $track['duration'] = json_number($track['duration']);
    if (array_key_exists('gain', $track)) $track['gain'] = json_number($track['gain']);
    return $track;
}

function playlist_json_normalize_playlist(array $playlist): array {
    if (array_key_exists('duration', $playlist)) $playlist['duration'] = json_number($playlist['duration']);
    return $playlist;
}

// Явная схема: что берем из Directus и как это называется в runtime JSON.
$map = [
    'title' => 'title',
    'duration' => 'duration',
    'updated' => 'updated',
];
$fields = array_merge(array_keys($map), ['status']);

$rowMap = [
    'id' => 'id',
    'code' => 'code',
    'set.title' => 'set',
    'duration' => 'duration',
    'gain' => 'gain',
];
$rowFields = array_keys($rowMap);

$body = read_json_body();
$ids = [];

if (!empty($_GET['id'])) {
    $ids = [trim((string)$_GET['id'])];
} elseif (isset($body['ids']) && is_array($body['ids'])) {
    $ids = array_values(array_filter(array_map('strval', $body['ids'])));
}

if (!$ids) {
    json_out(['ok' => false, 'error' => 'no_ids'], 400);
}

$outDir = '/var/www/app/data/cdn/data/playlists';
$done = [];
$errs = [];

foreach ($ids as $id) {
    $id = trim((string)$id);
    if ($id === '') continue;

    $resPlaylist = directus_get($ENV, '/items/playlists/' . rawurlencode($id), [
        'fields' => implode(',', $fields),
    ]);

    if (!$resPlaylist['ok']) {
        if (directus_item_unavailable($resPlaylist)) {
            delete_file($outDir, $id . '.json');
            $done[] = ['id' => $id, 'deleted' => true];
            continue;
        }
        $errs[] = ['id' => $id, 'error' => $resPlaylist['error'], 'status' => $resPlaylist['status'] ?? 0];
        continue;
    }

    $playlist = $resPlaylist['data']['data'] ?? null;
    // Неactive playlist в runtime не нужен.
    if (!is_array($playlist) || (($playlist['status'] ?? '') !== 'active')) {
        delete_file($outDir, $id . '.json');
        $done[] = ['id' => $id, 'deleted' => true];
        continue;
    }

    $trackQuery = [
        'filter[set][playlist][_eq]' => $id,
        'filter[set][status][_eq]' => 'active',
        'filter[status][_eq]' => 'active',
        'fields' => implode(',', $rowFields),
        'sort' => 'id',
        'limit' => '1000',
    ];
    $resTracks = directus_get($ENV, '/items/tracks', $trackQuery);

    if (!$resTracks['ok']) {
        $trackQuery = [
            'filter[sets][playlist][_eq]' => $id,
            'filter[sets][status][_eq]' => 'active',
            'filter[status][_eq]' => 'active',
            'fields' => implode(',', $rowFields),
            'sort' => 'id',
            'limit' => '1000',
        ];
        $resTracks = directus_get($ENV, '/items/tracks', $trackQuery);
    }

    if (!$resTracks['ok']) {
        $errs[] = ['id' => $id, 'error' => $resTracks['error'], 'status' => $resTracks['status'] ?? 0];
        continue;
    }

    $tracks = [];
    $rows = $resTracks['data']['data'] ?? [];

    if (is_array($rows)) {
        foreach ($rows as $t) {
            if (!is_array($t)) continue;
            $trackId = trim((string)($t['id'] ?? ''));
            if ($trackId === '') continue;

            $track = playlist_json_normalize_track(map_fields($t, $rowMap));
            $track = clean_array($track);
            if ($track !== []) $tracks[] = $track;
        }
    }

    // Пустой playlist для runtime не храним и удаляем его JSON.
    if (!$tracks) {
        delete_file($outDir, $id . '.json');
        $done[] = ['id' => $id, 'deleted' => true];
        continue;
    }

    $json = playlist_json_normalize_playlist(map_fields($playlist, $map));
    $json['tracks'] = $tracks;
    // count — runtime-поле, чтобы плееру не приходилось считать длину массива самому.
    $json['count'] = count($tracks);
    $json = clean_array($json);

    write_json_file($outDir, $id . '.json', $json);
    $done[] = ['id' => $id, 'written' => true, 'tracks' => count($tracks)];
}

json_out(['ok' => true, 'done' => $done, 'errors' => $errs]);
