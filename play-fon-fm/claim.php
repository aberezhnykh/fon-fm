<?php

declare(strict_types=1);

$dataDir = '/var/www/app/data/cdn/data';
require_once __DIR__ . '/config/messages.php';
require_once __DIR__ . '/runtime.php';

function respond(array $data, int $status = 200): never {
    http_response_code($status);
    header('Content-Type: application/json; charset=utf-8');
    echo json_encode($data, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    exit;
}

function ok(): never {
    respond([
        'ok' => true,
    ]);
}

function message(string $code): never {
    $text = player_message($code);
    respond([
        'ok' => false,
        'message' => $text,
    ]);
}

function writeJsonFile(string $path, array $data): bool {
    $dir = dirname($path);

    if (!is_dir($dir) && !mkdir($dir, 0775, true) && !is_dir($dir)) {
        return false;
    }

    $json = json_encode($data, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    if ($json === false) {
        return false;
    }

    return file_put_contents($path, $json . PHP_EOL, LOCK_EX) !== false;
}

function normalizeDevice(mixed $value): string {
    return trim((string)$value);
}

function resolveTimezoneOffsetMinutes(): int {
    $value = $_GET['tz'] ?? null;

    if (!is_numeric($value)) {
        return -180;
    }

    $offset = (int)$value;

    if ($offset < -840 || $offset > 720) {
        return -180;
    }

    return $offset;
}

function localTimestamp(int $offset): int {
    return time() - ($offset * 60);
}

function todayDate(int $offset): string {
    return gmdate('Y-m-d', localTimestamp($offset));
}

function isActiveStatus(mixed $value): bool {
    return $value === 'active';
}

function isExpired(?string $end, int $offset): bool {
    if (!$end) {
        return false;
    }

    return todayDate($offset) > $end;
}

$player = isset($_GET['player']) ? runtime_normalize_player_code($_GET['player']) : '';
$device = isset($_GET['device']) ? normalizeDevice($_GET['device']) : '';
$tzOffset = resolveTimezoneOffsetMinutes();

if ($player === '') {
    message('player_required');
}

if ($device === '') {
    message('device_required');
}

$context = runtime_resolve_player_context($dataDir, $player);
if (!is_array($context) || !is_array($context['player'] ?? null)) {
    message('player_not_found');
}

/** @var array<string,mixed> $playerData */
$playerData = $context['player'];

if (isset($playerData['status']) && !isActiveStatus($playerData['status'])) {
    message('player_inactive');
}

if (isExpired($playerData['end'] ?? null, $tzOffset)) {
    message('player_expired');
}

$playerId = trim((string)($context['player_id'] ?? ''));
if ($playerId === '') {
    message('player_not_found');
}

$ok = writeJsonFile(runtime_device_path($dataDir, $playerId), [
    'device' => $device,
]);

if (!$ok) {
    message('config_error');
}

ok();
