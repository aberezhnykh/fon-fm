<?php

// players-json.php

declare(strict_types=1);
require __DIR__ . '/common.php';

api_key_check($ENV);
$lock = lock_open('players-json');

function player_json_code(mixed $value): string {
    return strtolower(trim((string)$value));
}

function delete_stale_player_routes(string $dir, string $playerId, string $keepFile): int {
    if ($playerId === '' || !is_dir($dir)) return 0;

    $deleted = 0;
    foreach (scandir($dir) ?: [] as $name) {
        if (!is_string($name) || substr($name, -5) !== '.json') continue;
        if ($name === $keepFile) continue;

        $path = $dir . '/' . $name;
        $json = @file_get_contents($path);
        if (!is_string($json) || $json === '') continue;

        $data = json_decode($json, true);
        if (!is_array($data)) continue;

        if (trim((string)($data['player'] ?? '')) !== $playerId) continue;
        @unlink($path);
        $deleted++;
    }

    return $deleted;
}

// Player route JSON содержит только внешний code и внутренние связи.
$fields = [
    'id',
    'code',
    'status',
    'client.id',
    'client.status',
];

$body = read_json_body();
$ids = [];

if (!empty($_GET['id'])) $ids = [trim((string)$_GET['id'])];
elseif (isset($body['ids']) && is_array($body['ids'])) $ids = array_values(array_filter(array_map('strval', $body['ids'])));

if (!$ids) json_out(['ok' => false, 'error' => 'no_ids'], 400);

$outDir = '/var/www/app/data/cdn/data/players';
$done = [];
$errs = [];

foreach ($ids as $id) {
    $id = trim((string)$id);
    if ($id === '') continue;

    $legacyFile = $id . '.json';

    $res = directus_get($ENV, '/items/players/' . rawurlencode($id), [
        'fields' => implode(',', $fields),
    ]);

    if (!$res['ok']) {
        if (directus_item_unavailable($res)) {
            delete_file($outDir, $legacyFile);
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
        delete_file($outDir, $legacyFile);
        $done[] = ['id' => $id, 'deleted' => true];
        continue;
    }

    $code = player_json_code($item['code'] ?? '');
    if ($code === '') {
        $errs[] = ['id' => $id, 'error' => 'bad_player_code'];
        continue;
    }

    $routeFile = $code . '.json';
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
        if ($clientId === '') {
            $errs[] = ['id' => $id, 'error' => 'bad_player_client'];
            continue;
        }
        delete_file($outDir, $legacyFile);
        delete_file($outDir, $routeFile);
        $done[] = ['id' => $id, 'deleted' => true];
        continue;
    }

    $json = clean_array([
        'player' => $id,
        'client' => $clientId,
    ]);

    delete_file($outDir, $legacyFile);
    write_json_file($outDir, $routeFile, $json);
    delete_stale_player_routes($outDir, $id, $routeFile);
    $done[] = ['id' => $id, 'code' => $code, 'written' => true];
}

json_out(['ok' => true, 'done' => $done, 'errors' => $errs]);
