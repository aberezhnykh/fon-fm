<?php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$body = read_json_body();
$setId = trim((string)($body['set_id'] ?? ''));

if ($setId === '') json_out(['ok' => false, 'error' => 'no_set_id'], 400);

$lock = lock_open('tracks-media-' . $setId);
$rootDir = '/var/www/app/data/cdn/media/tracks';
$itemPath = '/items/tracks/';
$setPath = '/items/sets/' . rawurlencode($setId);

function upload_get_pending_tracks(array $ENV, string $setId): array {
    $res = directus_get($ENV, '/items/tracks', [
        'fields' => 'id,state',
        'filter' => [
            '_and' => [
                ['set' => ['_eq' => $setId]],
                ['_or' => [
                    ['state' => ['_eq' => 'pending']],
                    ['state' => ['_eq' => 'error']],
                ]],
            ],
        ],
        'limit' => -1,
        'sort' => 'added',
    ]);

    if (!$res['ok']) return [];
    $rows = $res['data']['data'] ?? [];
    return is_array($rows) ? $rows : [];
}

function upload_get_set_track_states(array $ENV, string $setId): array {
    $res = directus_get($ENV, '/items/tracks', [
        'fields' => 'id,state',
        'filter' => ['set' => ['_eq' => $setId]],
        'limit' => -1,
    ]);

    if (!$res['ok']) return [];
    $rows = $res['data']['data'] ?? [];
    return is_array($rows) ? $rows : [];
}

function upload_finish_set(array $ENV, string $setPath, array $states): void {
    $hasPending = false;
    $hasProcessing = false;
    $hasError = false;

    foreach ($states as $row) {
        $state = trim((string)($row['state'] ?? ''));
        if ($state === 'pending') $hasPending = true;
        if ($state === 'processing') $hasProcessing = true;
        if ($state === 'error') $hasError = true;
    }

    if ($hasPending || $hasProcessing) {
        directus_patch($ENV, $setPath, ['state' => 'processing']);
        return;
    }

    if ($hasError) {
        directus_patch($ENV, $setPath, [
            'state' => 'error',
            'error' => 'Есть треки с ошибками',
        ]);
        return;
    }

    directus_patch($ENV, $setPath, [
        'state' => 'done',
        'error' => null,
    ]);
}

$done = [];
$errs = [];

directus_patch($ENV, $setPath, [
    'state' => 'processing',
    'start' => gmdate('Y-m-d H:i:s'),
    'error' => null,
]);

while (true) {
    $tracks = upload_get_pending_tracks($ENV, $setId);
    if (!$tracks) break;

    foreach ($tracks as $row) {
        $id = trim((string)($row['id'] ?? ''));
        if ($id === '') continue;

        $bucket = strtolower(substr($id, 0, 1));
        if ($bucket === '') {
            $errs[] = ['id' => $id, 'error' => 'bad_id'];
            continue;
        }

        $file = $rootDir . '/' . $bucket . '/' . $id . '.mp3';
        $directusItemPath = $itemPath . rawurlencode($id);

        if (!is_file($file)) {
            $p = directus_patch($ENV, $directusItemPath, [
                'state' => 'error',
                'error' => 'file_not_found',
                'duration' => null,
                'gain' => null,
            ]);
            if (!$p['ok']) $errs[] = ['id' => $id, 'error' => 'patch_failed', 'status' => $p['status'] ?? 0];
            else $done[] = ['id' => $id, 'error' => 'file_not_found'];
            continue;
        }

        try {
            directus_patch($ENV, $directusItemPath, [
                'state' => 'processing',
                'error' => null,
            ]);

            $dur = media_duration_seconds($file);
            $gain = media_gain_db($file);

            $p = directus_patch($ENV, $directusItemPath, [
                'state' => 'done',
                'duration' => $dur,
                'gain' => $gain,
                'error' => null,
            ]);

            if (!$p['ok']) $errs[] = ['id' => $id, 'error' => 'patch_failed', 'status' => $p['status'] ?? 0];
            else $done[] = ['id' => $id, 'duration' => $dur, 'gain' => $gain];
        } catch (Throwable $e) {
            $msg = $e->getMessage() ?: 'processing_failed';
            $p = directus_patch($ENV, $directusItemPath, [
                'state' => 'error',
                'error' => $msg,
                'duration' => null,
                'gain' => null,
            ]);

            if (!$p['ok']) $errs[] = ['id' => $id, 'error' => 'patch_failed', 'status' => $p['status'] ?? 0];
            else $done[] = ['id' => $id, 'error' => $msg];
        }
    }
}

upload_finish_set($ENV, $setPath, upload_get_set_track_states($ENV, $setId));

json_out(['ok' => true, 'done' => $done, 'errors' => $errs, 'set_id' => $setId]);
