<?php

declare(strict_types=1);

function runtime_read_json(string $path): mixed {
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

function runtime_normalize_player_code(mixed $value): string {
    return strtolower(trim((string)$value));
}

function runtime_player_route_path(string $base, string $code): string {
    return $base . '/players/' . runtime_normalize_player_code($code) . '.json';
}

function runtime_client_path(string $base, string $clientId): string {
    return $base . '/clients/' . $clientId . '.json';
}

function runtime_device_path(string $base, string $playerId): string {
    return $base . '/devices/' . $playerId . '.json';
}

function runtime_player_code_display(mixed $code): string {
    return strtoupper(trim((string)$code));
}

function runtime_find_player_in_client(array $clientData, string $playerId = '', string $code = ''): ?array {
    $players = $clientData['players'] ?? null;
    if (!is_array($players)) {
        return null;
    }

    $normalizedCode = runtime_normalize_player_code($code);

    foreach ($players as $player) {
        if (!is_array($player)) {
            continue;
        }

        $candidateId = trim((string)($player['id'] ?? ''));
        $candidateCode = runtime_normalize_player_code($player['code'] ?? '');

        if ($playerId !== '' && $candidateId === $playerId) {
            return $player;
        }

        if ($normalizedCode !== '' && $candidateCode === $normalizedCode) {
            return $player;
        }
    }

    return null;
}

function runtime_resolve_player_context(string $base, string $code): ?array {
    $normalizedCode = runtime_normalize_player_code($code);
    if ($normalizedCode === '') {
        return null;
    }

    $routeData = runtime_read_json(runtime_player_route_path($base, $normalizedCode));
    if (!is_array($routeData)) {
        return null;
    }

    $clientId = trim((string)($routeData['client'] ?? ''));
    $playerId = trim((string)($routeData['player'] ?? ''));
    if ($clientId === '' || $playerId === '') {
        return null;
    }

    $clientData = runtime_read_json(runtime_client_path($base, $clientId));
    if (!is_array($clientData)) {
        return [
            'code' => $normalizedCode,
            'client_id' => $clientId,
            'player_id' => $playerId,
            'route' => $routeData,
            'client' => null,
            'player' => null,
        ];
    }

    $playerData = runtime_find_player_in_client($clientData, $playerId, $normalizedCode);

    return [
        'code' => $normalizedCode,
        'client_id' => $clientId,
        'player_id' => $playerId,
        'route' => $routeData,
        'client' => $clientData,
        'player' => $playerData,
    ];
}
