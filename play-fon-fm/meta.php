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

function message(string $code): never {
    $text = player_message($code);
    respond([
        'ok' => false,
        'reason' => $code,
        'action' => player_message_action($code),
        'message' => $text,
    ]);
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
$tzOffset = resolveTimezoneOffsetMinutes();

if ($player === '') {
    message('player_required');
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

respond([
    'ok' => true,
    'player' => $player,
    'code' => isset($playerData['code']) ? (string)$playerData['code'] : $player,
    'title' => isset($playerData['title']) ? (string)$playerData['title'] : '',
    'level' => isset($playerData['level']) ? $playerData['level'] : null,
]);
