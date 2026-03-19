<?php

declare(strict_types=1);

$dataDir = '/var/www/app/data/cdn/data';
$historyDir = $dataDir . '/history';
require_once __DIR__ . '/runtime.php';

function respond(array $data, int $status = 200): never {
    http_response_code($status);
    header('Content-Type: application/json; charset=utf-8');
    echo json_encode($data, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    exit;
}

function respondNoContent(): never {
    http_response_code(204);
    exit;
}

function normalizeDevice(mixed $value): string {
    return trim((string)$value);
}

function writeHistoryLine(string $path, array $payload): bool {
    $dir = dirname($path);
    if (!is_dir($dir) && !mkdir($dir, 0775, true) && !is_dir($dir)) {
        return false;
    }

    // Храним историю построчно, чтобы не перечитывать весь файл на каждую запись.
    $line = json_encode($payload, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    if ($line === false) {
        return false;
    }

    return file_put_contents($path, $line . PHP_EOL, FILE_APPEND | LOCK_EX) !== false;
}

function normalizeString(mixed $value): string {
    return trim((string)$value);
}

function validType(string $value): bool {
    return $value === 'track' || $value === 'ad';
}

$player = runtime_normalize_player_code($_REQUEST['player'] ?? '');
$device = normalizeDevice($_REQUEST['device'] ?? '');
$type = normalizeString($_REQUEST['type'] ?? '');
$id = normalizeString($_REQUEST['id'] ?? '');
$date = normalizeString($_REQUEST['date'] ?? '');
$time = normalizeString($_REQUEST['time'] ?? '');

if ($player === '' || $device === '' || $id === '' || !validType($type) || $date === '' || $time === '') {
    respond(['ok' => false], 400);
}

$context = runtime_resolve_player_context($dataDir, $player);
if (!is_array($context) || !is_array($context['player'] ?? null)) {
    respond(['ok' => false], 404);
}

$playerId = trim((string)($context['player_id'] ?? ''));
if ($playerId === '') {
    respond(['ok' => false], 404);
}

$deviceData = runtime_read_json(runtime_device_path($dataDir, $playerId));
$storedDevice = is_array($deviceData) ? normalizeDevice($deviceData['device'] ?? '') : '';
if ($storedDevice !== '' && $storedDevice !== $device) {
    // История вторична: если устройство уже не владеет плеером,
    // просто пропускаем запись без шумной ошибки в консоли браузера.
    respondNoContent();
}

$payload = [
    'time' => $time,
    'type' => $type,
    'id' => $id,
];

$path = $historyDir . '/' . $playerId . '/' . $date . '.ndjson';

if (!writeHistoryLine($path, $payload)) {
    respond(['ok' => false], 500);
}

respond(['ok' => true]);
