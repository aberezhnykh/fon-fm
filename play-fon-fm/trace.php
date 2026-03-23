<?php

declare(strict_types=1);

$dataDir = '/var/www/app/data/cdn/data';
$traceDir = $dataDir . '/trace';
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

function normalizeString(mixed $value): string {
    return trim((string)$value);
}

function validDate(string $value): bool {
    return (bool)preg_match('/^\d{4}-\d{2}-\d{2}$/', $value);
}

function requestBody(): string {
    $body = file_get_contents('php://input');
    return is_string($body) ? $body : '';
}

function tracePayload(string $body): string {
    $text = str_replace(["\r\n", "\r"], "\n", $body);
    $text = trim($text, "\n");

    return $text . PHP_EOL;
}

function appendTraceText(string $path, string $body): bool {
    $dir = dirname($path);
    if (!is_dir($dir) && !mkdir($dir, 0775, true) && !is_dir($dir)) {
        return false;
    }

    return file_put_contents($path, tracePayload($body), FILE_APPEND | LOCK_EX) !== false;
}

$player = runtime_normalize_player_code($_REQUEST['player'] ?? '');
$device = normalizeDevice($_REQUEST['device'] ?? '');
$date = normalizeString($_REQUEST['date'] ?? '');
$body = requestBody();

if ($player === '' || $device === '' || trim($body) === '') {
    respond(['ok' => false], 400);
}

if ($date === '') {
    $date = gmdate('Y-m-d');
}

if (!validDate($date)) {
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
    respondNoContent();
}

$path = $traceDir . '/' . $playerId . '/' . $date . '.log';

if (!appendTraceText($path, $body)) {
    respond(['ok' => false], 500);
}

respond([
    'ok' => true,
    'written' => strlen($body),
]);
