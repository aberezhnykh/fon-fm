<?php

// settings-json.php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$lock = lock_open('settings-json');

$outDir = '/var/www/app/data/cdn/data';
$fileName = 'settings.json';

$res = directus_get($ENV, '/items/settings');

if (!$res['ok']) {
    if (directus_item_unavailable($res)) {
        delete_file($outDir, $fileName);
        json_out(['ok' => true, 'deleted' => true]);
    }

    json_out([
        'ok' => false,
        'error' => $res['error'] ?? 'settings_query_failed',
        'status' => $res['status'] ?? 0,
    ], 500);
}

$item = $res['data']['data'] ?? null;
if (!is_array($item)) {
    delete_file($outDir, $fileName);
    json_out(['ok' => true, 'deleted' => true]);
}

$json = clean_array($item);
write_json_file($outDir, $fileName, $json);

json_out([
    'ok' => true,
    'written' => true,
]);
