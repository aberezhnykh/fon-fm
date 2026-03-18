<?php

declare(strict_types=1);

$dataDir = '/var/www/app/data/cdn/data';
$historyDir = $dataDir . '/history';

function respond(array $data, int $status = 200): never {
    http_response_code($status);
    header('Content-Type: application/json; charset=utf-8');
    echo json_encode($data, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    exit;
}

function readJsonFile(string $path): mixed {
    if (!is_file($path) || !is_readable($path)) {
        return null;
    }

    $json = file_get_contents($path);
    if ($json === false || $json === '') {
        return null;
    }

    try {
        return json_decode($json, true, 512, JSON_THROW_ON_ERROR);
    } catch (Throwable $e) {
        return null;
    }
}

function playerPath(string $base, string $player): string {
    return $base . '/players/' . $player . '.json';
}

function devicePath(string $base, string $player): string {
    return $base . '/devices/' . $player . '.json';
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

$player = normalizeString($_REQUEST['player'] ?? '');
$device = normalizeDevice($_REQUEST['device'] ?? '');
$type = normalizeString($_REQUEST['type'] ?? '');
$id = normalizeString($_REQUEST['id'] ?? '');
$date = normalizeString($_REQUEST['date'] ?? '');
$time = normalizeString($_REQUEST['time'] ?? '');

if ($player === '' || $device === '' || $id === '' || !validType($type) || $date === '' || $time === '') {
    respond(['ok' => false], 400);
}

$playerData = readJsonFile(playerPath($dataDir, $player));
if (!is_array($playerData)) {
    respond(['ok' => false], 404);
}

$deviceData = readJsonFile(devicePath($dataDir, $player));
$storedDevice = is_array($deviceData) ? normalizeDevice($deviceData['device'] ?? '') : '';
if ($storedDevice !== '' && $storedDevice !== $device) {
    respond(['ok' => false], 409);
}

$payload = [
    'time' => $time,
    'type' => $type,
    'id' => $id,
];

$path = $historyDir . '/' . $player . '/' . $date . '.ndjson';

if (!writeHistoryLine($path, $payload)) {
    respond(['ok' => false], 500);
}

respond(['ok' => true]);
