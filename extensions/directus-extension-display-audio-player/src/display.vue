<template>
	<span v-if="resolvedSrc" class="ff-cell" data-ff-version="2026-02-13-02">
		<button type="button" class="v-icon has-click ff-icon-btn" @click.stop.prevent="toggle" :aria-label="isPlaying ? 'Pause' : 'Play'" :title="isPlaying ? 'Pause' : 'Play'">
			<v-icon :name="isPlaying ? 'pause' : 'play_arrow'" />
		</button>
	</span>
	<value-null v-else />
</template>
<script>
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useApi } from '@directus/extensions-sdk';

const BUS = 'ff-audio-inline:state';
const MANAGER_KEY = '__ff_audio_inline_manager__';
const SETTINGS_CACHE_KEY = '__ff_audio_settings_cache__';

function normalizeHost(host) {
	return String(host ?? '').trim().replace(/\/+$/, '');
}

function safeFileName(v) {
	if (v == null) return '';
	const s = String(v).trim();
	if (!s) return '';
	// поддержка UUID без расширения
	if (!s.includes('.') && /^[a-f0-9-]{8,}$/i.test(s)) return `${s}.mp3`;
	return s;
}

function safeCollection(v) {
	const s = String(v ?? '').trim().toLowerCase();
	return /^[a-z0-9_]+$/.test(s) ? s : '';
}

function bucketFromFileName(fileName) {
	const s = String(fileName || '').trim().toLowerCase();
	const b = s[0] || '';
	return /^[a-f0-9]$/.test(b) ? b : '';
}

function createManager() {
	const audio = new Audio();
	audio.preload = 'none';
	audio.autoplay = false;

	const state = { audio, currentSrc: '' };

	const emit = (extra = {}) => {
		window.dispatchEvent(
			new CustomEvent(BUS, {
				detail: {
					src: state.currentSrc,
					paused: audio.paused,
					ended: audio.ended,
					hasError: !!audio.error,
					...extra,
				},
			})
		);
	};

	const stop = () => {
		try {
			audio.pause();
			audio.currentTime = 0;
			audio.src = '';
			audio.load();
		} catch { }
		state.currentSrc = '';
		emit({ action: 'stop' });
	};

	const play = async (src) => {
		if (!src) return;
		stop();
		audio.src = src;
		state.currentSrc = src;

		try {
			await audio.play();
			emit({ action: 'play' });
		} catch {
			emit({ action: 'play_error' });
		}
	};

	const pause = () => {
		audio.pause();
		emit({ action: 'pause' });
	};

	const toggle = async (src) => {
		if (!src) return;
		// сравниваем с state.currentSrc (audio.src может нормализоваться браузером)
		if (state.currentSrc === src && !audio.paused) pause();
		else await play(src);
	};

	// остановка при SPA-навигации
	const NAV_EVENT = 'ff-audio-inline:navigate';
	const NAV_PATCH_KEY = '__ff_audio_inline_nav_patch__';

	const stopOnNav = () => {
		if (!audio.paused || state.currentSrc || audio.src) stop();
	};

	if (typeof window !== 'undefined' && !window[NAV_PATCH_KEY]) {
		window[NAV_PATCH_KEY] = true;

		const fireNav = () => window.dispatchEvent(new Event(NAV_EVENT));

		const _pushState = history.pushState;
		history.pushState = function (...args) {
			const r = _pushState.apply(this, args);
			fireNav();
			return r;
		};

		window.addEventListener('popstate', fireNav);
		window.addEventListener(NAV_EVENT, stopOnNav);

		window.addEventListener('pagehide', stopOnNav);
		window.addEventListener('beforeunload', stopOnNav);
	}

	audio.addEventListener('play', () => emit({ action: 'play' }));
	audio.addEventListener('pause', () => emit({ action: 'pause' }));
	audio.addEventListener('ended', () => emit({ action: 'ended' }));
	audio.addEventListener('error', () => emit({ action: 'error' }));

	return { state, toggle, stop };
}

function getManager() {
	if (typeof window === 'undefined') return null;
	if (!window[MANAGER_KEY]) window[MANAGER_KEY] = createManager();
	return window[MANAGER_KEY];
}

// 1 раз на страницу читаем settings.cdn_host
function getCdnHostOnce(api) {
	if (typeof window === 'undefined') return Promise.resolve('');
	if (window[SETTINGS_CACHE_KEY]?.promise) return window[SETTINGS_CACHE_KEY].promise;

	const promise = (async () => {
		try {
			const r = await api.get('/items/settings', { params: { fields: 'cdn_host' } });
			const host = normalizeHost(r?.data?.data?.cdn_host || '');
			return host;
		} catch {
			return '';
		}
	})();

	window[SETTINGS_CACHE_KEY] = { promise };
	return promise;
}

export default {
	props: {
		value: { type: [String, Object], default: null },
		collection: { type: String, default: '' },
		field: { type: String, default: '' },
	},

	setup(props) {
		const api = useApi();
		const manager = getManager();
		const isPlaying = ref(false);

		const cdnHost = ref(''); // берём из settings.cdn_host
		const fileName = computed(() => {
			if (typeof props.value === 'string') return safeFileName(props.value);
			if (props.value && typeof props.value === 'object') {
				return safeFileName(props.value.file ?? props.value.value ?? '');
			}
			return '';
		});

		// фиксированный allowlist (если надо расширишь позже)
		const mediaCollection = computed(() => {
			const c = safeCollection(props.collection);
			return c === 'tracks' || c === 'ads' ? c : '';
		});

		const resolvedSrc = computed(() => {
			if (!cdnHost.value) return '';
			if (!fileName.value) return '';
			if (!mediaCollection.value) return '';
			const bucket = bucketFromFileName(fileName.value);
			if (!bucket) return '';
			return `${cdnHost.value}/media/${mediaCollection.value}/${bucket}/${encodeURIComponent(fileName.value)}`;
		});

		const sync = (detail) => {
			if (!manager) {
				isPlaying.value = false;
				return;
			}
			const src = detail?.src ?? manager.state.currentSrc ?? '';
			const paused = typeof detail?.paused === 'boolean' ? detail.paused : manager.state.audio.paused;
			isPlaying.value = !!resolvedSrc.value && src === resolvedSrc.value && paused === false;
		};

		const onBus = (e) => sync(e.detail);

		const toggle = async () => {
			if (!manager) return;
			await manager.toggle(resolvedSrc.value);
			sync({ src: manager.state.currentSrc, paused: manager.state.audio.paused });
		};

		onMounted(async () => {
			window.addEventListener(BUS, onBus);
			cdnHost.value = (await getCdnHostOnce(api)) || 'https://cdn.fon.fm';
			sync({ src: manager?.state.currentSrc, paused: manager?.state.audio.paused });
		});

		onBeforeUnmount(() => {
			if (manager?.state?.audio && resolvedSrc.value && manager.state.currentSrc === resolvedSrc.value) {
				manager.stop();
			}
			window.removeEventListener(BUS, onBus);
		});

		watch(resolvedSrc, () => {
			sync({ src: manager?.state.currentSrc, paused: manager?.state.audio.paused });
		});

		return { resolvedSrc, isPlaying, toggle };
	},
};
</script>
<style scoped>
.ff-cell {
	display: inline-flex;
	align-items: center;
	justify-content: center;
	line-height: 1;
	margin-right: 8px;
}

.ff-icon-btn {
	width: 24px;
	height: 24px;
	min-width: 24px;
	min-height: 24px;
	padding: 0;
	display: inline-flex;
	align-items: center;
	justify-content: center;
	color: var(--foreground-subdued);
}

.ff-icon-btn:hover {
	color: var(--foreground-normal);
}
</style>
