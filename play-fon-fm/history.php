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

function validDate(string $value): bool {
    return (bool)preg_match('/^\d{4}-\d{2}-\d{2}$/', $value);
}

function validTime(string $value): bool {
    return (bool)preg_match('/^\d{2}:\d{2}:\d{2}$/', $value);
}

function normalizeHistoryItem(mixed $item, string $fallbackDate = ''): ?array {
    if (!is_array($item)) {
        return null;
    }

    $type = normalizeString($item['type'] ?? '');
    $id = normalizeString($item['id'] ?? '');
    $time = normalizeString($item['time'] ?? '');
    $date = normalizeString($item['date'] ?? $fallbackDate);

    if (!validType($type) || $id === '' || !validDate($date) || !validTime($time)) {
        return null;
    }

    return [
        'date' => $date,
        'payload' => [
            'time' => $time,
            'type' => $type,
            'id' => $id,
        ],
    ];
}

function requestBody(): string {
    $body = file_get_contents('php://input');
    return is_string($body) ? trim($body) : '';
}

function parseNdjsonItems(string $body, string $fallbackDate = ''): array {
    if ($body === '') {
        return [];
    }

    $out = [];
    $lines = preg_split('/\r\n|\n|\r/', $body) ?: [];

    foreach ($lines as $line) {
        $line = trim($line);
        if ($line === '') {
            continue;
        }

        $decoded = json_decode($line, true);
        if (!is_array($decoded)) {
            $out[] = null;
            continue;
        }

        $out[] = normalizeHistoryItem($decoded, $fallbackDate);
    }

    return $out;
}

function parseHistoryItems(string $fallbackDate = ''): array {
    $body = requestBody();
    if ($body !== '') {
        return parseNdjsonItems($body, $fallbackDate);
    }

    $single = normalizeHistoryItem([
        'type' => $_REQUEST['type'] ?? '',
        'id' => $_REQUEST['id'] ?? '',
        'date' => $_REQUEST['date'] ?? $fallbackDate,
        'time' => $_REQUEST['time'] ?? '',
    ], $fallbackDate);

    return $single !== null ? [$single] : [];
}

$player = runtime_normalize_player_code($_REQUEST['player'] ?? '');
$device = normalizeDevice($_REQUEST['device'] ?? '');
$requestDate = normalizeString($_REQUEST['date'] ?? '');
$items = parseHistoryItems($requestDate);

if ($player === '' || $device === '' || !$items) {
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

$accepted = 0;
$rejected = 0;

foreach ($items as $item) {
    if (!is_array($item)) {
        $rejected++;
        continue;
    }

    $date = $item['date'] ?? '';
    $payload = $item['payload'] ?? null;
    if (!is_string($date) || !is_array($payload)) {
        $rejected++;
        continue;
    }

    $path = $historyDir . '/' . $playerId . '/' . $date . '.ndjson';
    if (!writeHistoryLine($path, $payload)) {
        respond([
            'ok' => false,
            'accepted' => $accepted,
            'rejected' => $rejected,
        ], 500);
    }

    $accepted++;
}

if ($accepted === 0) {
    respond([
        'ok' => false,
        'accepted' => 0,
        'rejected' => $rejected,
    ], 400);
}

respond([
    'ok' => true,
    'accepted' => $accepted,
    'rejected' => $rejected,
]);
