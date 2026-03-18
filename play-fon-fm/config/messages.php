<?php

declare(strict_types=1);
require_once __DIR__ . '/settings.php';

function player_messages(): array {
    $settings = player_settings(__DIR__ . '/settings.json');
    $messages = $settings['messages'] ?? [];
    return is_array($messages) ? $messages : [];
}

function player_message_key(string $code): string {
    return match ($code) {
        'player_required' => 'player_required',
        'device_required' => 'device_required',
        'player_not_found',
        'player_client_missing',
        'client_not_found',
        'stream_not_found',
        'playlist_not_found' => 'not_found',
        'player_inactive',
        'client_inactive' => 'blocked',
        'player_expired' => 'subscription_required',
        'device_busy' => 'pin_required',
        'pin_required' => 'pin_required',
        'pin_invalid' => 'pin_invalid',
        'player_update_required' => 'update_required',
        'config_error' => 'server_wait',
        default => '',
    };
}

function player_message(string $code): string {
    $messages = player_messages();
    $key = player_message_key($code);
    return ($key !== '' && isset($messages[$key]) && is_string($messages[$key])) ? $messages[$key] : '';
}

function player_message_value(string $key): string {
    $messages = player_messages();
    return isset($messages[$key]) && is_string($messages[$key]) ? $messages[$key] : '';
}

function player_message_action(string $code): string {
    if (in_array($code, ['player_inactive', 'player_expired', 'client_inactive'], true)) {
        return 'blocked';
    }

    if (in_array($code, ['player_required', 'player_not_found', 'player_client_missing', 'client_not_found', 'stream_not_found', 'playlist_not_found'], true)) {
        return 'not_found';
    }

    if ($code === 'device_busy') {
        return 'claim';
    }

    return 'retry';
}
