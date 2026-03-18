<?php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$lock = lock_open('delete-json');

function delete_json_player_routes(array $ENV, string $dir, array $playerIds, array $routeCodes): int {
    $count = 0;
    $codes = [];

    foreach ($routeCodes as $code) {
        $code = strtolower(trim((string)$code));
        if ($code === '' || in_array($code, $codes, true)) continue;
        $codes[] = $code;
    }

    foreach ($playerIds as $id) {
        $id = trim((string)$id);
        if ($id === '') continue;

        delete_file($dir, $id . '.json');
        $count++;

        $res = directus_get($ENV, '/items/players/' . rawurlencode($id), [
            'fields' => 'code',
        ]);
        if ($res['ok']) {
            $item = $res['data']['data'] ?? null;
            $code = strtolower(trim((string)(is_array($item) ? ($item['code'] ?? '') : '')));
            if ($code !== '' && !in_array($code, $codes, true)) $codes[] = $code;
        }
    }

    foreach ($codes as $code) {
        delete_file($dir, $code . '.json');
        $count++;
    }

    return $count;
}

$dirs = [
    'clients' => '/var/www/app/data/cdn/data/clients',
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

$playerIds = $body['players'] ?? [];
$playerRoutes = $body['player_routes'] ?? [];
if (is_array($playerIds) || is_array($playerRoutes)) {
    $deleted = delete_json_player_routes(
        $ENV,
        '/var/www/app/data/cdn/data/players',
        is_array($playerIds) ? $playerIds : [],
        is_array($playerRoutes) ? $playerRoutes : []
    );
    if ($deleted > 0) $done['players'] = $deleted;
}

json_out([
    'ok' => true,
    'done' => $done,
]);
