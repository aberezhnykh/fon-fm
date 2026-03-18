<?php

// ads-media.php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$lock = lock_open('ads-media');

$body = read_json_body();
$ids = [];

if (!empty($_GET['id'])) $ids = [trim((string)$_GET['id'])];
elseif (isset($body['ids']) && is_array($body['ids'])) $ids = array_values(array_filter(array_map('strval', $body['ids'])));

if (!$ids) json_out(['ok' => false, 'error' => 'no_ids'], 400);

$rootDir = '/var/www/app/data/cdn/media/ads';
$itemPath = '/items/ads/';

$done = [];
$errs = [];

foreach ($ids as $id) {
    $id = trim((string) $id);
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
            'error' => 'file_not_found',
            'duration' => null,
            'gain' => null,
        ]);
        if (!$p['ok']) $errs[] = ['id' => $id, 'error' => 'patch_failed', 'status' => $p['status'] ?? 0];
        else $done[] = ['id' => $id, 'error' => 'file_not_found'];
        continue;
    }

    try {
        $dur = media_duration_seconds($file);
        $gain = media_gain_db($file);

        $p = directus_patch($ENV, $directusItemPath, [
            'duration' => $dur,
            'gain' => $gain,
            'error' => null,
        ]);

        if (!$p['ok']) $errs[] = ['id' => $id, 'error' => 'patch_failed', 'status' => $p['status'] ?? 0];
        else $done[] = ['id' => $id, 'duration' => $dur, 'gain' => $gain];
    } catch (Throwable $e) {
        $msg = $e->getMessage() ?: 'processing_failed';
        $p = directus_patch($ENV, $directusItemPath, [
            'error' => $msg,
            'duration' => null,
            'gain' => null,
        ]);

        if (!$p['ok']) $errs[] = ['id' => $id, 'error' => 'patch_failed', 'status' => $p['status'] ?? 0];
        else $done[] = ['id' => $id, 'error' => $msg];
    }
}

json_out(['ok' => true, 'done' => $done, 'errors' => $errs]);
