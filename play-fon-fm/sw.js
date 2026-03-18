const CACHE_VERSION = 'fonfm-player-v1';
const APP_SHELL = [
  '/app-icon.svg',
  '/app-icon-192.png',
  '/app-icon-512.png'
];

self.addEventListener('install', (event) => {
  event.waitUntil(
    caches.open(CACHE_VERSION).then((cache) => cache.addAll(APP_SHELL)).then(() => self.skipWaiting())
  );
});

self.addEventListener('activate', (event) => {
  event.waitUntil(
    caches.keys().then((keys) =>
      Promise.all(keys.filter((key) => key !== CACHE_VERSION).map((key) => caches.delete(key)))
    ).then(() => self.clients.claim())
  );
});

function isBypassRequest(url) {
  return (
    url.pathname.startsWith('/next') ||
    url.pathname.startsWith('/meta') ||
    url.pathname.startsWith('/claim') ||
    url.pathname.startsWith('/history')
  );
}

function isCacheableAsset(url) {
  return (
    url.pathname === '/app-icon.svg' ||
    url.pathname === '/app-icon-192.png' ||
    url.pathname === '/app-icon-512.png' ||
    url.pathname.startsWith('/manifest')
  );
}

self.addEventListener('fetch', (event) => {
  const request = event.request;
  if (request.method !== 'GET') return;

  const url = new URL(request.url);
  if (url.origin !== self.location.origin) return;
  if (isBypassRequest(url)) return;

  if (request.mode === 'navigate') {
    event.respondWith(
      fetch(request)
        .then((response) => {
          const copy = response.clone();
          caches.open(CACHE_VERSION).then((cache) => cache.put(request, copy));
          return response;
        })
        .catch(() => caches.match(request))
    );
    return;
  }

  if (isCacheableAsset(url)) {
    event.respondWith(
      caches.match(request).then((cached) => {
        const network = fetch(request)
          .then((response) => {
            const copy = response.clone();
            caches.open(CACHE_VERSION).then((cache) => cache.put(request, copy));
            return response;
          })
          .catch(() => cached);

        return cached || network;
      })
    );
  }
});
