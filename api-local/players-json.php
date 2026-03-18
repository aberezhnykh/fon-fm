<?php

// players-json.php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$lock = lock_open('players-json');

// Player runtime JSON содержит только поля самого плеера и id клиента.
$map = [
    'title' => 'title',
    'status' => 'status',
    'end' => 'end',
    'code' => 'code',
    'pin' => 'pin',
    'level' => 'level',
];
$fields = array_merge(array_keys($map), [
    'client.id',
    'client.status',
]);

$body = read_json_body();
$ids = [];

if (!empty($_GET['id'])) $ids = [trim((string)$_GET['id'])];
elseif (isset($body['ids']) && is_array($body['ids'])) $ids = array_values(array_filter(array_map('strval', $body['ids'])));

if (!$ids) json_out(['ok' => false, 'error' => 'no_ids'], 400);

$outDir = '/var/www/app/data/cdn/data/players';
$deviceDir = '/var/www/app/data/cdn/data/devices';
$done = [];
$errs = [];

foreach ($ids as $id) {
    $id = trim((string)$id);
    if ($id === '') continue;

    $res = directus_get($ENV, '/items/players/' . rawurlencode($id), [
        'fields' => implode(',', $fields),
    ]);

    if (!$res['ok']) {
        if (directus_item_unavailable($res)) {
            delete_file($outDir, $id . '.json');
            delete_file($deviceDir, $id . '.json');
            $done[] = ['id' => $id, 'deleted' => true];
            continue;
        }
        $errs[] = ['id' => $id, 'error' => $res['error'], 'status' => $res['status'] ?? 0];
        continue;
    }

    $item = $res['data']['data'] ?? null;
    if (!is_array($item)) {
        $errs[] = ['id' => $id, 'error' => 'bad_player_data'];
        continue;
    }

    // Для players JSON удаляем при archived самого плеера.
    if (($item['status'] ?? '') === 'archived') {
        delete_file($outDir, $id . '.json');
        delete_file($deviceDir, $id . '.json');
        $done[] = ['id' => $id, 'deleted' => true];
        continue;
    }

    $json = map_fields($item, $map);
    $client = $item['client'] ?? null;
    $clientId = is_array($client)
        ? (string)($client['id'] ?? '')
        : (string)$client;
    $clientStatus = is_array($client)
        ? (string)($client['status'] ?? '')
        : '';

    // Если клиент удален/не найден или переведен в archived, плеерский JSON удаляем.
    // inactive сам по себе не является причиной удаления.
    if ($clientId === '' || $clientStatus === 'archived') {
        delete_file($outDir, $id . '.json');
        delete_file($deviceDir, $id . '.json');
        $done[] = ['id' => $id, 'deleted' => true];
        continue;
    }

    // В runtime храним только id клиента, без вложенного объекта связи.
    $json['client'] = $clientId;
    $json = clean_array($json);

    write_json_file($outDir, $id . '.json', $json);
    $done[] = ['id' => $id, 'written' => true];
}

json_out(['ok' => true, 'done' => $done, 'errors' => $errs]);
