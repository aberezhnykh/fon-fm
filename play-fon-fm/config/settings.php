<?php

declare(strict_types=1);

function settings_read_file(string $path): array {
    if (!is_file($path) || !is_readable($path)) {
        return [];
    }

    $json = file_get_contents($path);
    if ($json === false || $json === '') {
        return [];
    }

    try {
        $data = json_decode($json, true, 512, JSON_THROW_ON_ERROR);
    } catch (Throwable $e) {
        return [];
    }

    return is_array($data) ? $data : [];
}

function settings_deep_merge(array $base, array $extra): array {
    $out = $base;

    foreach ($extra as $key => $value) {
        if (is_array($value) && isset($out[$key]) && is_array($out[$key])) {
            $out[$key] = settings_deep_merge($out[$key], $value);
            continue;
        }

        $out[$key] = $value;
    }

    return $out;
}

function player_settings_defaults(): array {
    return [
        'app' => [
            'version' => '1.0.0',
        ],
        'messages' => [],
        'checks' => [],
        'retry' => [],
    ];
}

function player_settings(string $path): array {
    $raw = settings_read_file($path);

    // Backward compatibility with the legacy flat format.
    if (!isset($raw['app']) && isset($raw['app_version'])) {
        $raw['app'] = ['version' => (string)$raw['app_version']];
    }

    return settings_deep_merge(player_settings_defaults(), $raw);
}

function player_settings_app_version(string $path): string {
    $settings = player_settings($path);
    $version = $settings['app']['version'] ?? '1.0.0';
    return trim((string)$version) !== '' ? trim((string)$version) : '1.0.0';
}
