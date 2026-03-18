<?php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$body = read_json_body();
$setId = trim((string)($body['set_id'] ?? ''));

if ($setId === '') json_out(['ok' => false, 'error' => 'no_set_id'], 400);

$lock = lock_open('tracks-radiosparx-media-' . $setId);
$rootDir = '/var/www/app/data/cdn/media/tracks';
$itemPath = '/items/tracks/';
$setPath = '/items/sets/' . rawurlencode($setId);
$userAgent = 'RadioSparx API SHOUTcast';

function radiosparx_text($value): string {
    return trim((string)$value);
}

function radiosparx_download_file(string $url, string $target, string $userAgent): void {
    $tmp = $target . '.part';
    @unlink($tmp);

    $ctx = stream_context_create([
        'http' => [
            'method' => 'GET',
            'header' => "Accept: audio/mpeg,application/octet-stream;q=0.9,*/*;q=0.8\r\nUser-Agent: {$userAgent}\r\n",
            'ignore_errors' => true,
            'timeout' => 180,
        ],
        'ssl' => [
            'verify_peer' => true,
            'verify_peer_name' => true,
        ],
    ]);

    $in = @fopen($url, 'rb', false, $ctx);
    if (!is_resource($in)) throw new RuntimeException('download_open_failed');

    $dir = dirname($target);
    if (!is_dir($dir) && !@mkdir($dir, 0775, true) && !is_dir($dir)) {
        fclose($in);
        throw new RuntimeException('mkdir_failed');
    }

    $out = @fopen($tmp, 'wb');
    if (!is_resource($out)) {
        fclose($in);
        throw new RuntimeException('write_open_failed');
    }

    $copied = @stream_copy_to_stream($in, $out);
    fclose($in);
    fclose($out);

    if (!is_int($copied) || $copied <= 0) {
        @unlink($tmp);
        throw new RuntimeException('download_empty');
    }

    if (!@rename($tmp, $target)) {
        @unlink($tmp);
        throw new RuntimeException('rename_failed');
    }
}

function radiosparx_get_pending_tracks(array $ENV, string $setId): array {
    $res = directus_get($ENV, '/items/tracks', [
        'fields' => 'id,url,gain',
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

function radiosparx_get_set_track_states(array $ENV, string $setId): array {
    $res = directus_get($ENV, '/items/tracks', [
        'fields' => 'id,state',
        'filter' => ['set' => ['_eq' => $setId]],
        'limit' => -1,
    ]);

    if (!$res['ok']) return [];
    $rows = $res['data']['data'] ?? [];
    return is_array($rows) ? $rows : [];
}

function radiosparx_finish_set(array $ENV, string $setPath, array $states): void {
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
    $tracks = radiosparx_get_pending_tracks($ENV, $setId);
    if (!$tracks) break;

    foreach ($tracks as $row) {
        if (!is_array($row)) continue;

        $id = radiosparx_text($row['id'] ?? '');
        $audioUrl = radiosparx_text($row['url'] ?? '');
        $gain = isset($row['gain']) && $row['gain'] !== '' ? (float)$row['gain'] : null;

        if ($id === '' || $audioUrl === '') {
            if ($id !== '') {
                directus_patch($ENV, $itemPath . rawurlencode($id), [
                    'state' => 'error',
                    'gain' => null,
                    'error' => 'bad_url',
                ]);
                $errs[] = ['id' => $id, 'error' => 'bad_url'];
            }
            continue;
        }

        $bucket = strtolower(substr($id, 0, 1));
        if ($bucket === '') {
            $errs[] = ['id' => $id, 'error' => 'bad_id'];
            continue;
        }

        $file = $rootDir . '/' . $bucket . '/' . $id . '.mp3';
        $directusItemPath = $itemPath . rawurlencode($id);

        try {
            directus_patch($ENV, $directusItemPath, [
                'state' => 'processing',
                'error' => null,
            ]);

            radiosparx_download_file($audioUrl, $file, $userAgent);

            $p = directus_patch($ENV, $directusItemPath, [
                'state' => 'done',
                'gain' => $gain,
                'error' => null,
            ]);

            if (!$p['ok']) $errs[] = ['id' => $id, 'error' => 'patch_failed', 'status' => $p['status'] ?? 0];
            else $done[] = ['id' => $id, 'gain' => $gain];
        } catch (Throwable $e) {
            $msg = $e->getMessage() ?: 'processing_failed';

            $p = directus_patch($ENV, $directusItemPath, [
                'state' => 'error',
                'gain' => null,
                'error' => $msg,
            ]);

            if (!$p['ok']) $errs[] = ['id' => $id, 'error' => 'patch_failed', 'status' => $p['status'] ?? 0];
            else $done[] = ['id' => $id, 'error' => $msg];
        }
    }
}

radiosparx_finish_set($ENV, $setPath, radiosparx_get_set_track_states($ENV, $setId));

json_out(['ok' => true, 'done' => $done, 'errors' => $errs, 'set_id' => $setId]);
