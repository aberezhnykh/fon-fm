<?php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$lock = lock_open('delete-json');

$dirs = [
    'clients' => '/var/www/app/data/cdn/data/clients',
    'players' => '/var/www/app/data/cdn/data/players',
    'devices' => '/var/www/app/data/cdn/data/devices',
    'streams' => '/var/www/app/data/cdn/data/streams',
];

$body = read_json_body();
$done = [];

foreach ($dirs as $key => $dir) {
    $ids = $body[$key] ?? [];
    if (!is_array($ids)) continue;

    $count = 0;

    foreach ($ids as $id) {
        $id = trim((string)$id);
        if ($id === '') continue;
        delete_file($dir, $id . '.json');
        $count++;
    }

    if ($count > 0) $done[$key] = $count;
}

json_out([
    'ok' => true,
    'done' => $done,
]);
