<?php

// clients-json.php

declare(strict_types=1);
require __DIR__ . '/common.php';

function client_json_ad_player_ids($value): array {
    if (!is_array($value)) return [];

    $ids = [];

    foreach ($value as $row) {
        if (is_string($row) || is_int($row)) {
            $id = trim((string)$row);
        } elseif (is_array($row)) {
            if (isset($row['players_id']) && is_array($row['players_id'])) $id = trim((string)($row['players_id']['id'] ?? ''));
            elseif (isset($row['players_id'])) $id = trim((string)$row['players_id']);
            elseif (isset($row['id'])) $id = trim((string)$row['id']);
            else $id = '';
        } else {
            $id = '';
        }

        if ($id === '' || in_array($id, $ids, true)) continue;
        $ids[] = $id;
    }

    return $ids;
}

function client_json_patch_state(array $ENV, string $clientId, string $state, ?string $error = null): void {
    $payload = [
        'state' => $state,
        'error' => $error,
        'updated' => gmdate('Y-m-d H:i:s'),
    ];

    directus_patch($ENV, '/items/clients/' . rawurlencode($clientId), $payload);
}

function client_json_normalize_ad(array $adJson): array {
    if (array_key_exists('gain', $adJson)) $adJson['gain'] = json_number($adJson['gain']);
    if (array_key_exists('exactly', $adJson)) $adJson['exactly'] = json_bool($adJson['exactly']);
    if (array_key_exists('interval', $adJson)) $adJson['interval'] = json_number($adJson['interval']);
    if (array_key_exists('duration', $adJson)) $adJson['duration'] = json_number($adJson['duration']);
    if (array_key_exists('weekdays', $adJson)) $adJson['weekdays'] = json_number_array($adJson['weekdays']);
    return $adJson;
}

function client_json_normalize_player(array $playerJson): array {
    if (array_key_exists('level', $playerJson)) $playerJson['level'] = json_number($playerJson['level']);
    if (array_key_exists('trace', $playerJson)) {
        $playerJson['trace'] = json_bool($playerJson['trace']);
        if ($playerJson['trace'] !== true) unset($playerJson['trace']);
    }
    return $playerJson;
}

function client_json_normalize_schedule(array $scheduleJson): array {
    if (array_key_exists('weekdays', $scheduleJson)) $scheduleJson['weekdays'] = json_number_array($scheduleJson['weekdays']);
    return $scheduleJson;
}

api_key_check($ENV);
$lock = lock_open('clients-json');

// Клиентский runtime JSON строится только из своих полей и имени файла <client_id>.json.
$map = [
    'title' => 'title',
    'status' => 'status',
    'end' => 'end',
    'updated' => 'updated',
];
$fields = array_keys($map);
$adsFields = [
    'id',
    'title',
    'start',
    'end',
    'time',
    'interval',
    'weekdays',
    'exactly',
    'players.id',
    'players.players_id.id',
    'duration',
    'gain',
];

$adsMap = [
    'id' => 'id',
    'title' => 'title',
    'start' => 'start',
    'end' => 'end',
    'time' => 'time',
    'exactly' => 'exactly',
    'interval' => 'interval',
    'weekdays' => 'weekdays',
    'duration' => 'duration',
    'gain' => 'gain',
];

$playerFields = [
    'id',
    'title',
    'status',
    'end',
    'code',
    'level',
    'trace',
];
$junctionFields = ['schedules_id.id', 'players_id.id'];
$scheduleFields = [
    'id',
    'title',
    'status',
    'updated',
    'start',
    'weekdays',
    'slots.id',
    'slots.time',
    'slots.stream.id',
    'slots.stream.status',
];

$body = read_json_body();
$ids = [];

if (!empty($_GET['id'])) $ids = [trim((string)$_GET['id'])];
elseif (isset($body['ids']) && is_array($body['ids'])) $ids = array_values(array_filter(array_map('strval', $body['ids'])));

if (!$ids) json_out(['ok' => false, 'error' => 'no_ids'], 400);

$outDir = '/var/www/app/data/cdn/data/clients';
$done = [];
$errs = [];

foreach ($ids as $id) {
    $id = trim((string)$id);
    if ($id === '') continue;

    $res = directus_get($ENV, '/items/clients/' . rawurlencode($id), [
        'fields' => implode(',', $fields),
    ]);

    if (!$res['ok']) {
        if (directus_item_unavailable($res)) {
            delete_file($outDir, $id . '.json');
            $done[] = ['id' => $id, 'deleted' => true];
            continue;
        }
        client_json_patch_state($ENV, $id, 'error', 'client_query_failed');
        $errs[] = ['id' => $id, 'error' => $res['error'], 'status' => $res['status'] ?? 0];
        continue;
    }

    $item = $res['data']['data'] ?? null;
    if (!is_array($item)) {
        client_json_patch_state($ENV, $id, 'error', 'bad_client_data');
        $errs[] = ['id' => $id, 'error' => 'bad_client_data'];
        continue;
    }

    client_json_patch_state($ENV, $id, 'processing', null);

    // Для clients JSON удаляем только при archived или если запись стала недоступна.
    if (($item['status'] ?? '') === 'archived') {
        delete_file($outDir, $id . '.json');
        client_json_patch_state($ENV, $id, 'done', null);
        $done[] = ['id' => $id, 'deleted' => true];
        continue;
    }

    $clientJson = clean_array(map_fields($item, $map));

    $resAds = directus_get($ENV, '/items/ads', [
        'filter[client][_eq]' => $id,
        'filter[status][_eq]' => 'active',
        'sort' => 'sort,id',
        'fields' => implode(',', $adsFields),
        'limit' => '1000',
    ]);

    if (!$resAds['ok']) {
        client_json_patch_state($ENV, $id, 'error', 'ads_query_failed');
        $errs[] = ['id' => $id, 'error' => $resAds['error'] ?? 'ads_query_failed', 'status' => $resAds['status'] ?? 0];
        continue;
    }

    $ads = [];
    $adsRows = $resAds['data']['data'] ?? [];
    if (is_array($adsRows)) {
        foreach ($adsRows as $row) {
            if (!is_array($row)) continue;

            $playerIds = client_json_ad_player_ids($row['players'] ?? null);
            if (!$playerIds) continue;

            $adJson = client_json_normalize_ad(map_fields($row, $adsMap));
            $adJson['players'] = $playerIds;
            $adJson = clean_array($adJson);
            if ($adJson !== []) $ads[] = $adJson;
        }
    }

    $resPlayers = directus_get($ENV, '/items/players', [
        'filter[client][_eq]' => $id,
        'fields' => implode(',', $playerFields),
        'limit' => '1000',
    ]);

    if (!$resPlayers['ok']) {
        client_json_patch_state($ENV, $id, 'error', 'players_query_failed');
        $errs[] = ['id' => $id, 'error' => $resPlayers['error'] ?? 'players_query_failed', 'status' => $resPlayers['status'] ?? 0];
        continue;
    }

    $playerIds = [];
    $players = [];
    $playerRows = $resPlayers['data']['data'] ?? [];
    if (is_array($playerRows)) {
        foreach ($playerRows as $row) {
            if (!is_array($row)) continue;
            $pid = trim((string)($row['id'] ?? ''));
            $status = trim((string)($row['status'] ?? ''));
            if ($pid === '' || $status === 'archived' || in_array($pid, $playerIds, true)) continue;
            $playerIds[] = $pid;

            $code = strtolower(trim((string)($row['code'] ?? '')));
            if ($code === '') continue;

            $playerJson = client_json_normalize_player([
                'id' => $pid,
                'title' => (string)($row['title'] ?? ''),
                'status' => $status,
                'end' => (string)($row['end'] ?? ''),
                'code' => $code,
                'level' => $row['level'] ?? null,
                'trace' => $row['trace'] ?? null,
            ]);
            $playerJson = clean_array($playerJson);

            if ($playerJson !== []) $players[] = $playerJson;
        }
    }

    $schedules = [];
    if ($playerIds) {
        $resJunction = directus_get($ENV, '/items/schedules_players', [
            'filter[players_id][_in]' => implode(',', $playerIds),
            'fields' => implode(',', $junctionFields),
            'limit' => '1000',
        ]);

        if (!$resJunction['ok']) {
            client_json_patch_state($ENV, $id, 'error', 'junction_query_failed');
            $errs[] = ['id' => $id, 'error' => $resJunction['error'] ?? 'junction_query_failed', 'status' => $resJunction['status'] ?? 0];
            continue;
        }

        $scheduleIds = [];
        $playersBySchedule = [];
        $junctionRows = $resJunction['data']['data'] ?? [];
        if (is_array($junctionRows)) {
            foreach ($junctionRows as $row) {
                if (!is_array($row)) continue;
                $sidRaw = $row['schedules_id'] ?? null;
                $sid = is_array($sidRaw) ? trim((string)($sidRaw['id'] ?? '')) : trim((string)$sidRaw);
                if ($sid === '' || in_array($sid, $scheduleIds, true)) continue;
                $scheduleIds[] = $sid;
            }

            foreach ($junctionRows as $row) {
                if (!is_array($row)) continue;
                $sidRaw = $row['schedules_id'] ?? null;
                $sid = is_array($sidRaw) ? trim((string)($sidRaw['id'] ?? '')) : trim((string)$sidRaw);
                if ($sid === '') continue;

                $pidRaw = $row['players_id'] ?? null;
                $pid = is_array($pidRaw) ? trim((string)($pidRaw['id'] ?? '')) : trim((string)$pidRaw);
                if ($pid === '') continue;

                if (!isset($playersBySchedule[$sid])) $playersBySchedule[$sid] = [];
                if (!in_array($pid, $playersBySchedule[$sid], true)) $playersBySchedule[$sid][] = $pid;
            }
        }

        if ($scheduleIds) {
            $resSchedules = directus_get($ENV, '/items/schedules', [
                'filter[id][_in]' => implode(',', $scheduleIds),
                'fields' => implode(',', $scheduleFields),
                'limit' => '1000',
            ]);

            if (!$resSchedules['ok']) {
                client_json_patch_state($ENV, $id, 'error', 'schedules_query_failed');
                $errs[] = ['id' => $id, 'error' => $resSchedules['error'] ?? 'schedules_query_failed', 'status' => $resSchedules['status'] ?? 0];
                continue;
            }

            $scheduleRows = $resSchedules['data']['data'] ?? [];
            if (is_array($scheduleRows)) {
                foreach ($scheduleRows as $schedule) {
                    if (!is_array($schedule) || (($schedule['status'] ?? '') !== 'active')) continue;

                    $slotsOut = [];
                    $slots = $schedule['slots'] ?? [];
                    if (!is_array($slots)) continue;

                    foreach ($slots as $slot) {
                        if (!is_array($slot)) continue;

                        $streamId = '';
                        $stream = $slot['stream'] ?? null;
                        if (is_array($stream) && (($stream['status'] ?? '') === 'active')) {
                            $streamId = (string)($stream['id'] ?? '');
                        }

                        $slotJson = clean_array([
                            'time' => (string)($slot['time'] ?? ''),
                            'stream' => $streamId,
                        ]);
                        if ($slotJson !== [] && !in_array($slotJson, $slotsOut, true)) $slotsOut[] = $slotJson;
                    }

                    if (!$slotsOut) continue;

                    $scheduleJson = client_json_normalize_schedule([
                        'id' => (string)($schedule['id'] ?? ''),
                        'status' => (string)($schedule['status'] ?? ''),
                        'updated' => (string)($schedule['updated'] ?? ''),
                        'title' => (string)($schedule['title'] ?? ''),
                        'start' => (string)($schedule['start'] ?? ''),
                        'weekdays' => $schedule['weekdays'] ?? null,
                        'slots' => $slotsOut,
                        'players' => $playersBySchedule[(string)($schedule['id'] ?? '')] ?? [],
                    ]);
                    $scheduleJson = clean_array($scheduleJson);
                    if ($scheduleJson !== [] && !in_array($scheduleJson, $schedules, true)) $schedules[] = $scheduleJson;
                }
            }
        }
    }

    $json = clean_array(array_merge($clientJson, [
        'players' => $players,
        'ads' => $ads,
        'schedules' => $schedules,
    ]));

    write_json_file($outDir, $id . '.json', $json);
    client_json_patch_state($ENV, $id, 'done', null);
    $done[] = ['id' => $id, 'written' => true];
}

json_out(['ok' => true, 'done' => $done, 'errors' => $errs]);
