<?php

declare(strict_types=1);

$dataDir = '/var/www/app/data/cdn/data';
$settingsPath = __DIR__ . '/config/settings.json';
require_once __DIR__ . '/config/settings.php';
require_once __DIR__ . '/runtime.php';
function manifest_player_title(array $playerData, string $player): string {
    $title = trim((string)($playerData['title'] ?? ''));
    if ($title !== '') {
        return $title;
    }

    $code = trim((string)($playerData['code'] ?? ''));
    if ($code !== '') {
        return 'FON.FM ' . runtime_player_code_display($code);
    }

    return $player !== '' ? 'FON.FM ' . runtime_player_code_display($player) : 'FON.FM';
}

$player = runtime_normalize_player_code($_GET['player'] ?? '');
$context = $player !== '' ? runtime_resolve_player_context($dataDir, $player) : null;
$playerData = is_array($context) && is_array($context['player'] ?? null) ? $context['player'] : null;
$settings = player_settings($settingsPath);
$themeColor = '#0e0f11';
$startUrl = $player !== '' ? '/' . rawurlencode($player) : '/';
$appId = $player !== '' ? '/player/' . rawurlencode($player) : '/player';
$version = player_settings_app_version($settingsPath);

$manifest = [
    'id' => $appId,
    'name' => 'FON.FM Плеер',
    'short_name' => 'FON.FM',
    'description' => 'FON.FM Плеер',
    'start_url' => $startUrl,
    'scope' => '/',
    'display' => 'standalone',
    'display_override' => ['window-controls-overlay', 'standalone'],
    'orientation' => 'portrait',
    'prefer_related_applications' => false,
    'background_color' => $themeColor,
    'theme_color' => $themeColor,
    'icons' => [
        [
            'src' => '/app-icon-192.png?v=' . rawurlencode($version),
            'sizes' => '192x192',
            'type' => 'image/png',
            'purpose' => 'any maskable',
        ],
        [
            'src' => '/app-icon-512.png?v=' . rawurlencode($version),
            'sizes' => '512x512',
            'type' => 'image/png',
            'purpose' => 'any maskable',
        ],
        [
            'src' => '/app-icon.svg?v=' . rawurlencode($version),
            'sizes' => 'any',
            'type' => 'image/svg+xml',
            'purpose' => 'any maskable',
        ],
    ],
];

header('Content-Type: application/manifest+json; charset=utf-8');
echo json_encode($manifest, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
