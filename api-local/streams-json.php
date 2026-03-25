<?php

// streams-json.php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$lock = lock_open('streams-json');

// Поток хранит только свои поля и список пригодных для runtime playlist ids.
$map = [
    'updated' => 'updated',
    'title' => 'title',
];
$fields = array_merge(array_keys($map), ['status']);

$joinFields = ['playlists_id.id', 'playlists_id.status'];

// Проверяем не служебное поле, а факт: есть ли у playlist хотя бы один active track
// внутри active set. Тогда поток не зависит от заполненности size/count в Directus.
// null = не удалось проверить, и удалять/портить runtime JSON в таком случае нельзя.
function stream_playlist_has_runtime_tracks(array $ENV, string $playlistId): ?bool {
    $query = [
        'filter[set][playlist][_eq]' => $playlistId,
        'filter[set][status][_eq]' => 'active',
        'filter[status][_eq]' => 'active',
        'fields' => 'id',
        'limit' => '1',
    ];

    $res = directus_get($ENV, '/items/tracks', $query);

    if (!$res['ok']) {
        $query = [
            'filter[sets][playlist][_eq]' => $playlistId,
            'filter[sets][status][_eq]' => 'active',
            'filter[status][_eq]' => 'active',
            'fields' => 'id',
            'limit' => '1',
        ];
        $res = directus_get($ENV, '/items/tracks', $query);
    }

    if (!$res['ok']) return null;

    $rows = $res['data']['data'] ?? [];
    return is_array($rows) && $rows !== [];
}

$body = read_json_body();
$ids = [];

if (!empty($_GET['id'])) $ids = [trim((string)$_GET['id'])];
elseif (isset($body['ids']) && is_array($body['ids'])) $ids = array_values(array_filter(array_map('strval', $body['ids'])));

if (!$ids) {
    json_out(['ok' => false, 'error' => 'no_ids'], 400);
}

$outDir = '/var/www/app/data/cdn/data/streams';
$done = [];
$errs = [];

foreach ($ids as $id) {
    $id = trim((string)$id);
    if ($id === '') continue;

    $resStream = directus_get($ENV, '/items/streams/' . rawurlencode($id), [
        'fields' => implode(',', $fields),
    ]);

    if (!$resStream['ok']) {
        if (directus_item_unavailable($resStream)) {
            delete_file($outDir, $id . '.json');
            $done[] = ['id' => $id, 'deleted' => true];
            continue;
        }
        $errs[] = ['id' => $id, 'error' => $resStream['error'], 'status' => $resStream['status'] ?? 0];
        continue;
    }

    $stream = $resStream['data']['data'] ?? null;
    // Неactive stream в runtime не нужен.
    if (!is_array($stream) || (($stream['status'] ?? '') !== 'active')) {
        delete_file($outDir, $id . '.json');
        $done[] = ['id' => $id, 'deleted' => true];
        continue;
    }

    $resJ = directus_get($ENV, '/items/streams_playlists', [
        'filter[streams_id][_eq]' => $id,
        'sort' => 'sort',
        'fields' => implode(',', $joinFields),
        'limit' => '1000',
    ]);

    if (!$resJ['ok']) {
        $errs[] = ['id' => $id, 'error' => $resJ['error'], 'status' => $resJ['status'] ?? 0];
        continue;
    }

    $playlists = [];
    $rows = $resJ['data']['data'] ?? [];

    $playlistCheckFailed = false;
    if (is_array($rows)) {
        foreach ($rows as $row) {
            $pl = $row['playlists_id'] ?? null;
            if (!is_array($pl) || ($pl['status'] ?? '') !== 'active') continue;
            $plId = trim((string)($pl['id'] ?? ''));
            if ($plId === '') continue;

            // В поток включаем только те плейлисты, у которых реально есть runtime-содержимое.
            $hasTracks = stream_playlist_has_runtime_tracks($ENV, $plId);
            if ($hasTracks === null) {
                $playlistCheckFailed = true;
                break;
            }
            if ($hasTracks !== true) continue;

            $playlists[] = $plId;
        }
    }

    if ($playlistCheckFailed) {
        $errs[] = ['id' => $id, 'error' => 'playlist_runtime_check_failed'];
        continue;
    }

    // Если у потока не осталось валидных плейлистов, его JSON удаляем.
    if (!$playlists) {
        delete_file($outDir, $id . '.json');
        $done[] = ['id' => $id, 'deleted' => true];
        continue;
    }

    $json = map_fields($stream, $map);
    $json['playlists'] = $playlists;
    $json = clean_array($json);

    write_json_file($outDir, $id . '.json', $json);
    $done[] = ['id' => $id, 'written' => true, 'playlists' => count($playlists)];
}

json_out(['ok' => true, 'done' => $done, 'errors' => $errs]);
