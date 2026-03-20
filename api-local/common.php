<?php

// common.php

declare(strict_types=1);

function env_load(string $path): array {
    $out = [];
    if (!is_file($path)) return $out;
    foreach (file($path, FILE_IGNORE_NEW_LINES) as $line) {
        $line = trim($line);
        if ($line === '' || $line[0] === '#') continue;
        $p = strpos($line, '=');
        if ($p === false) continue;
        $k = trim(substr($line, 0, $p));
        $v = trim(substr($line, $p + 1));
        $v = trim($v, "\"'");
        $out[$k] = $v;
    }
    return $out;
}

$ENV = env_load(__DIR__ . '/.env');

// Единый выход JSON-ответом для всех служебных скриптов.
function json_out(array $data, int $code = 200): void {
    http_response_code($code);
    header('Content-Type: application/json; charset=utf-8');
    echo json_encode($data, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    exit;
}

// Все внутренние вызовы в проекте идут только по X-Api-Key.
function api_key_check(array $ENV): void {
    $need = $ENV['API_KEY'] ?? '';
    $got  = $_SERVER['HTTP_X_API_KEY'] ?? '';
    if ($need === '' || $got === '' || !hash_equals($need, (string)$got)) {
        json_out(['ok' => false, 'error' => 'forbidden'], 403);
    }
}

// Lock нужен только для генераторов, чтобы один и тот же скрипт не работал параллельно.
function lock_open(string $name) {
    $dir = __DIR__ . '/locks';
    if (!is_dir($dir)) @mkdir($dir, 0775, true);
    $fp = fopen($dir . '/' . $name . '.lock', 'c+');
    if (!$fp) json_out(['ok' => false, 'error' => 'lock_open_failed'], 500);
    if (!flock($fp, LOCK_EX | LOCK_NB)) json_out(['ok' => false, 'error' => 'busy'], 409);
    return $fp;
}

// Скрипты принимают ids через POST JSON body.
function read_json_body(): array {
    $raw = file_get_contents('php://input');
    if (!$raw) return [];
    $j = json_decode($raw, true);
    return is_array($j) ? $j : [];
}

// Базовый GET в Directus API.
function http_get_json(string $url, array $headers = []): array {
    $h = array_merge(['Accept: application/json'], $headers);
    $ctx = stream_context_create([
        'http' => [
            'method' => 'GET',
            'header' => implode("\r\n", $h),
            'ignore_errors' => true,
            'timeout' => 15,
        ]
    ]);

    $body = @file_get_contents($url, false, $ctx);
    $status = 0;

    if (isset($http_response_header[0]) && preg_match('~HTTP/\S+\s+(\d+)~', $http_response_header[0], $m)) {
        $status = (int)$m[1];
    }

    $json = is_string($body) ? json_decode($body, true) : null;

    return [
        'status' => $status,
        'body' => is_array($json) ? $json : null,
        'raw' => is_string($body) ? $body : '',
    ];
}

// Обертка над Directus GET с единым форматом ответа.
function directus_get(array $ENV, string $path, array $query = []): array {
    $base = rtrim((string)($ENV['DIRECTUS_URL'] ?? ''), '/');
    $token = (string)($ENV['DIRECTUS_TOKEN'] ?? '');
    if ($base === '' || $token === '') {
        json_out(['ok' => false, 'error' => 'directus_env_missing'], 500);
    }

    $qs = $query ? ('?' . http_build_query($query)) : '';
    $url = $base . $path . $qs;

    $res = http_get_json($url, ['Authorization: Bearer ' . $token]);

    if ($res['status'] < 200 || $res['status'] >= 300 || !is_array($res['body'])) {
        return ['ok' => false, 'status' => $res['status'], 'error' => 'directus_http', 'raw' => $res['raw']];
    }

    return ['ok' => true, 'data' => $res['body']];
}

// JSON пишется атомарно через временный файл и rename.
function write_json_file(string $dir, string $name, array $data): void {
    if (!is_dir($dir)) @mkdir($dir, 0775, true);

    $tmp = $dir . '/' . $name . '.tmp';
    $dst = $dir . '/' . $name;

    $json = json_encode($data, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
    if ($json === false) json_out(['ok' => false, 'error' => 'json_encode_failed'], 500);

    if (file_put_contents($tmp, $json) === false) json_out(['ok' => false, 'error' => 'write_failed'], 500);
    if (!@rename($tmp, $dst)) {
        @unlink($tmp);
        json_out(['ok' => false, 'error' => 'rename_failed'], 500);
    }
}

function delete_file(string $dir, string $name): void {
    $p = $dir . '/' . $name;
    if (is_file($p)) @unlink($p);
}

// Для runtime JSON 403 и 404 трактуем одинаково: запись недоступна и файл надо удалить.
function directus_item_unavailable(array $res): bool {
    $status = (int)($res['status'] ?? 0);
    return $status === 403 || $status === 404;
}

// Поддержка путей вида set.title при маппинге ответа Directus в runtime JSON.
function map_value(array $src, string $path) {
    if ($path === '') return null;
    if (strpos($path, '.') === false) return $src[$path] ?? null;

    $cur = $src;
    foreach (explode('.', $path) as $part) {
        if (!is_array($cur) || !array_key_exists($part, $cur)) return null;
        $cur = $cur[$part];
    }
    return $cur;
}

function map_fields(array $src, array $map): array {
    $out = [];
    foreach ($map as $srcField => $jsonField) {
        $out[$jsonField] = map_value($src, (string)$srcField);
    }
    return $out;
}

// В runtime JSON не пишем null, пустые строки и пустые массивы.
function clean_array(array $data): array {
    $out = [];
    $isList = array_keys($data) === range(0, count($data) - 1);

    foreach ($data as $k => $v) {
        if (is_array($v)) {
            $v = clean_array($v);
        }

        if ($v === null || $v === '' || (is_array($v) && $v === [])) {
            continue;
        }

        if ($isList) $out[] = $v;
        else $out[$k] = $v;
    }

    return $out;
}

function json_number(mixed $value): int|float|null {
    if ($value === null || $value === '') return null;
    if (!is_numeric($value)) return null;

    $number = $value + 0;
    return is_int($number) || is_float($number) ? $number : null;
}

function json_bool(mixed $value): ?bool {
    if ($value === null || $value === '') return null;
    if (is_bool($value)) return $value;
    if (is_int($value) || is_float($value)) return ((int)$value) !== 0;

    $normalized = strtolower(trim((string)$value));
    if ($normalized === '1' || $normalized === 'true') return true;
    if ($normalized === '0' || $normalized === 'false') return false;

    return null;
}

function json_number_array(mixed $value): array {
    if (!is_array($value)) return [];

    $out = [];
    foreach ($value as $item) {
        $number = json_number($item);
        if ($number === null) continue;
        $out[] = $number;
    }

    return $out;
}

// Базовый HTTP-запрос с JSON body для PATCH и внутренних вызовов.
function http_req_json(string $method, string $url, array $headers = [], ?array $body = null): array {
    $h = array_merge(['Accept: application/json'], $headers);

    $opts = [
        'http' => [
            'method' => $method,
            'header' => implode("\r\n", $h),
            'ignore_errors' => true,
            'timeout' => 60,
        ]
    ];

    if ($body !== null) {
        $json = json_encode($body, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES);
        $opts['http']['header'] .= "\r\nContent-Type: application/json";
        $opts['http']['content'] = $json === false ? '{}' : $json;
    }

    $ctx = stream_context_create($opts);
    $raw = @file_get_contents($url, false, $ctx);

    $status = 0;
    if (isset($http_response_header[0]) && preg_match('~HTTP/\S+\s+(\d+)~', $http_response_header[0], $m)) {
        $status = (int)$m[1];
    }

    $json = is_string($raw) ? json_decode($raw, true) : null;

    return [
        'status' => $status,
        'body' => is_array($json) ? $json : null,
        'raw' => is_string($raw) ? $raw : '',
    ];
}

function directus_patch(array $ENV, string $path, array $data): array {
    $base = rtrim((string)($ENV['DIRECTUS_URL'] ?? ''), '/');
    $token = (string)($ENV['DIRECTUS_TOKEN'] ?? '');
    if ($base === '' || $token === '') {
        json_out(['ok' => false, 'error' => 'directus_env_missing'], 500);
    }

    $url = $base . $path;

    $res = http_req_json('PATCH', $url, [
        'Authorization: Bearer ' . $token,
    ], $data);

    if ($res['status'] < 200 || $res['status'] >= 300 || !is_array($res['body'])) {
        return ['ok' => false, 'status' => $res['status'], 'error' => 'directus_http', 'raw' => $res['raw']];
    }

    return ['ok' => true, 'data' => $res['body']];
}

function directus_post(array $ENV, string $path, array $data): array {
    $base = rtrim((string)($ENV['DIRECTUS_URL'] ?? ''), '/');
    $token = (string)($ENV['DIRECTUS_TOKEN'] ?? '');
    if ($base === '' || $token === '') {
        json_out(['ok' => false, 'error' => 'directus_env_missing'], 500);
    }

    $url = $base . $path;

    $res = http_req_json('POST', $url, [
        'Authorization: Bearer ' . $token,
    ], $data);

    if ($res['status'] < 200 || $res['status'] >= 300 || !is_array($res['body'])) {
        return ['ok' => false, 'status' => $res['status'], 'error' => 'directus_http', 'raw' => $res['raw']];
    }

    return ['ok' => true, 'data' => $res['body']];
}

function directus_delete(array $ENV, string $path): array {
    $base = rtrim((string)($ENV['DIRECTUS_URL'] ?? ''), '/');
    $token = (string)($ENV['DIRECTUS_TOKEN'] ?? '');
    if ($base === '' || $token === '') {
        json_out(['ok' => false, 'error' => 'directus_env_missing'], 500);
    }

    $url = $base . $path;

    $res = http_req_json('DELETE', $url, [
        'Authorization: Bearer ' . $token,
    ], null);

    if ($res['status'] < 200 || $res['status'] >= 300) {
        return ['ok' => false, 'status' => $res['status'], 'error' => 'directus_http', 'raw' => $res['raw']];
    }

    return ['ok' => true];
}

// Общие media helper-ы для ads-media.php и tracks-media.php.
function media_sh(string $cmd): array {
    $out = [];
    $code = 0;
    exec($cmd . ' 2>&1', $out, $code);
    return [$code, implode("\n", $out)];
}

function media_duration_seconds(string $file): int {
    [$code, $out] = media_sh(
        'ffprobe -v error -show_entries format=duration -of default=noprint_wrappers=1:nokey=1 ' . escapeshellarg($file)
    );
    if ($code !== 0) throw new RuntimeException('ffprobe_failed');

    $v = trim($out);
    if ($v === '' || !is_numeric($v)) throw new RuntimeException('ffprobe_bad_output');

    return (int) round((float) $v);
}

function media_gain_db(string $file): float {
    [$code, $out] = media_sh('mp3gain -s s ' . escapeshellarg($file));
    if ($code !== 0) throw new RuntimeException('mp3gain_failed');

    if (preg_match('/Recommended\s+"Track"\s+dB\s+change:\s*([+-]?\d+(?:\.\d+)?)/i', $out, $m)) return (float) $m[1];
    if (preg_match('/Track"\s+dB\s+change:\s*([+-]?\d+(?:\.\d+)?)/i', $out, $m)) return (float) $m[1];

    throw new RuntimeException('mp3gain_parse_failed');
}
