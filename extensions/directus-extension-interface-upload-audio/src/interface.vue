<template>
	<div class="upload-audio-ui">
		<input ref="fileInput" type="file" :accept="accept" :multiple="isSetsMode" :disabled="disabled || uploading" @change="onPickFiles" />
		<div class="row">
			<v-button :disabled="disabled || uploading" kind="primary" @click="primaryClick">
				{{ primaryLabel }}
			</v-button>
			<v-button v-if="files.length > 0 && !uploading && !disabled" secondary @click="cancel">Отменить</v-button>
		</div>
		<div class="summary">{{ messageText }}</div>
		<div v-if="uploading" class="progress">
			<div class="progress-bar" :style="{ width: progress + '%' }"></div>
			<div class="progress-text">{{ progress }}%</div>
		</div>
	</div>
</template>
<script setup>
import { computed, nextTick, ref } from 'vue';
import { useApi } from '@directus/extensions-sdk';

const props = defineProps({
	value: { type: null, default: null },
	disabled: { type: Boolean, default: false },
	collection: { type: String, default: '' },
	primaryKey: { type: [String, Number], default: null },
	item: { type: Object, default: null },
});

const emit = defineEmits(['input']);

const api = useApi();
const ENDPOINT_BASE = '/directus-extension-endpoint-upload-audio';

const fileInput = ref(null);
const files = ref([]);
const uploading = ref(false);
const progress = ref(0);
const message = ref('');
const persistedSetId = ref('');
let setFieldNamesPromise = null;

// лимиты из settings (динамические)
const uploadTracksMaxFiles = ref(100);
const uploadMaxFileMb = ref(10);

const isSetsMode = computed(() => props.collection === 'sets');
const isAdsMode = computed(() => props.collection === 'ads');
const accept = computed(() => '.mp3,audio/mpeg');

function normId(v) {
	if (v === null || v === undefined) return '';
	if (typeof v === 'object') {
		if ('id' in v) {
			const id = String(v.id ?? '').trim();
			return id === '+' ? '' : id;
		}
		return '';
	}
	const id = String(v).trim();
	return id === '+' ? '' : id;
}

const setId = computed(() => {
	if (!isSetsMode.value) return '';
	return normId(props.primaryKey) || normId(props?.item?.id);
});
const effectiveSetId = computed(() => persistedSetId.value || setId.value);

async function loadUploadSettings() {
	try {
		const r = await api.get('/items/settings', {
			params: { fields: 'upload_tracks_max_files,upload_max_file_mb' },
		});

		const s = r?.data?.data ?? {};
		const maxFiles = Number(s.upload_tracks_max_files);
		const maxMb = Number(s.upload_max_file_mb);

		if (Number.isFinite(maxFiles) && maxFiles > 0) uploadTracksMaxFiles.value = Math.trunc(maxFiles);
		if (Number.isFinite(maxMb) && maxMb > 0) uploadMaxFileMb.value = Math.trunc(maxMb);
	} catch {
		// defaults
	}
}

async function loadExistingTrackSources() {
	try {
		const r = await api.get('/items/tracks', {
			params: {
				fields: 'source',
				limit: -1,
			},
		});

		const items = Array.isArray(r?.data?.data) ? r.data.data : [];
		const sources = new Set();

		for (const item of items) {
			const source = sourceKey(item?.source);
			if (source) sources.add(source);
		}

		return sources;
	} catch {
		return new Set();
	}
}

const totalBytes = computed(() => files.value.reduce((sum, f) => sum + (Number(f.size) || 0), 0));
const primaryLabel = computed(() => {
	if (files.value.length === 0) {
		return isAdsMode.value ? 'Выбрать файл' : 'Выбрать файлы';
	}
	return 'Загрузить';
});
const selectionSummary = computed(() => {
	if (!files.value.length) {
		return isSetsMode.value
			? `Выберите файлы • Лимит: ${uploadTracksMaxFiles.value} файлов • ${uploadMaxFileMb.value} MB/файл`
			: `Выберите файл • Лимит: ${uploadMaxFileMb.value} MB/файл`;
	}

	if (isSetsMode.value) {
		return `Выбрано: ${files.value.length} • ${formatBytes(totalBytes.value)} • Лимит: ${uploadTracksMaxFiles.value} файлов • ${uploadMaxFileMb.value} MB/файл`;
	}

	return `Выбрано: ${files.value.length} • ${formatBytes(totalBytes.value)} • Лимит: ${uploadMaxFileMb.value} MB/файл`;
});
const messageText = computed(() => message.value || selectionSummary.value);

function primaryClick() {
	if (props.disabled) return;
	if (files.value.length === 0) openPicker();
	else upload();
}

function openPicker() {
	if (props.disabled) return;
	message.value = '';
	fileInput.value?.click();
}

function cancel() {
	if (props.disabled) return;
	clearSelection();
}

function clearSelection() {
	files.value = [];
	progress.value = 0;
	message.value = '';
	if (fileInput.value) fileInput.value.value = '';
	emit('input', null);
}

function extOf(name) {
	const i = name.lastIndexOf('.');
	return i === -1 ? '' : name.slice(i + 1).toLowerCase();
}

function sourceKey(name) {
	return String(name || '').replace(/\.[^.]+$/, '').trim();
}

function validateSelectionBasic() {
	if (props.disabled) return 'Поле недоступно для загрузки';
	if (!isSetsMode.value && !isAdsMode.value) return 'Этот интерфейс здесь не используется';
	if (files.value.length === 0) return '';

	if (isAdsMode.value && files.value.length > 1) return 'В рекламу можно загрузить только один файл';

	for (const f of files.value) {
		if (extOf(f.name) !== 'mp3') return 'Разрешён только mp3';
	}

	return '';
}

function isPlainObject(value) {
	return Object.prototype.toString.call(value) === '[object Object]';
}

function readLiveFieldValue(fieldName) {
	const selectors = [
		`[data-field="${fieldName}"] input`,
		`[data-field="${fieldName}"] textarea`,
		`[data-field="${fieldName}"] [contenteditable="true"]`,
		`input[name="${fieldName}"]`,
		`textarea[name="${fieldName}"]`,
		`#${fieldName}`,
	];

	for (const selector of selectors) {
		const el = document?.querySelector?.(selector);
		if (!el) continue;

		if ('value' in el) {
			const value = String(el.value ?? '').trim();
			if (value) return value;
		}

		if ('textContent' in el) {
			const value = String(el.textContent ?? '').trim();
			if (value) return value;
		}
	}

	return '';
}

function shouldUseLiveFallback(value) {
	return value === undefined || value === null || (typeof value === 'string' && value.trim() === '');
}

function canUseLiveFallback(fieldName, value) {
	if (!shouldUseLiveFallback(value)) return false;
	return fieldName === 'title' || fieldName === 'description' || fieldName === 'url';
}

async function loadSetFieldNames() {
	if (setFieldNamesPromise) return setFieldNamesPromise;

	setFieldNamesPromise = api
		.get('/fields/sets', {
			params: { fields: 'field,schema,meta.special', limit: -1 },
		})
		.then((response) => {
			const rows = Array.isArray(response?.data?.data) ? response.data.data : [];
			return rows
				.filter((row) => row?.field && row?.field !== 'id' && row?.schema)
				.filter((row) => !Array.isArray(row?.meta?.special) || !row.meta.special.includes('alias'))
				.map((row) => String(row.field));
		})
		.catch(() => []);

	return setFieldNamesPromise;
}

function buildSetPayload(fieldNames) {
	const item = props?.item && typeof props.item === 'object' ? props.item : {};
	const payload = {};

	for (const fieldName of fieldNames) {
		if (!(fieldName in item)) continue;

		const value = item[fieldName];
		if (value === undefined) continue;
		if (typeof value === 'function') continue;
		if (value instanceof File) continue;
		if (Array.isArray(value)) continue;
		if (isPlainObject(value)) continue;

		payload[fieldName] = value;
	}

	for (const fieldName of fieldNames) {
		if (!canUseLiveFallback(fieldName, payload[fieldName])) continue;
		const liveValue = readLiveFieldValue(fieldName);
		if (liveValue !== '') payload[fieldName] = liveValue;
	}

	return payload;
}

function syncSetUrl(id) {
	if (!id || !window?.history?.replaceState) return;
	const nextPath = `/admin/content/sets/${id}`;
	if (window.location.pathname === nextPath) return;
	window.history.replaceState(window.history.state, '', nextPath);
}

function closeSetRecord() {
	const nextPath = '/admin/content/sets';
	window.location.assign(nextPath);
}

async function flushFormState() {
	const active = document?.activeElement;
	if (active && typeof active.blur === 'function') {
		active.blur();
	}
	await nextTick();
	await new Promise((resolve) => setTimeout(resolve, 0));
}

async function ensureSavedSet() {
	if (!isSetsMode.value) return '';

	await flushFormState();

	const fieldNames = await loadSetFieldNames();
	const payload = buildSetPayload(fieldNames);
	if (fieldNames.includes('library')) payload.library = 'fonfm';
	if (!payload.status) payload.status = 'inactive';
	if (fieldNames.includes('state') && !payload.state) payload.state = 'pending';
	if (fieldNames.includes('error') && !('error' in payload)) payload.error = null;
	if (!Number.isFinite(Number(payload.sort))) payload.sort = 1;
	const existingId = effectiveSetId.value;

	if (existingId) {
		await api.patch(`/items/sets/${existingId}`, payload);
		persistedSetId.value = existingId;
		syncSetUrl(existingId);
		return existingId;
	}

	const response = await api.post('/items/sets', payload);
	const createdId = normId(response?.data?.data?.id) || normId(response?.data?.id);
	if (!createdId) throw new Error('Не удалось сохранить сет');

	persistedSetId.value = createdId;
	syncSetUrl(createdId);
	return createdId;
}

function onPickFiles(e) {
	message.value = '';

	const picked = Array.from(e.target.files || []);

	const ok = [];
	let badCount = 0;
	for (const f of picked) {
		if (extOf(f.name) === 'mp3') ok.push(f);
		else badCount++;
	}

	// убрать дубли внутри выбора (оставляем первый), молча
	const seen = new Set();
	const unique = [];
	for (const f of ok) {
		if (seen.has(f.name)) continue;
		seen.add(f.name);
		unique.push(f);
	}

	files.value = unique;

	if (badCount) message.value = `Пропущены неподдерживаемые форматы: ${badCount}`;

	const msg = validateSelectionBasic();
	if (msg) message.value = msg;
}

function collectResponseWarnings(resp) {
	const warnings = resp?.data?.warnings;
	if (!Array.isArray(warnings)) return [];
	return warnings.map((warning) => String(warning || '').trim()).filter(Boolean);
}

async function upload() {
	message.value = '';
	progress.value = 0;

	const msg0 = validateSelectionBasic();
	if (msg0) {
		message.value = msg0;
		return;
	}

	uploading.value = true;

	try {
		await loadUploadSettings();
		const currentSetId = isSetsMode.value ? await ensureSavedSet() : '';

		const maxBytes = uploadMaxFileMb.value * 1024 * 1024;

		// ADS: проверка размера заранее
		if (isAdsMode.value) {
			const f = files.value[0];
			if (f && Number(f.size) > maxBytes) {
				message.value = `Файл слишком большой • Лимит: ${uploadMaxFileMb.value} MB`;
				return;
			}
		}

		let selectedBefore = files.value.length;

		// TRACKS: удалить oversized заранее (без имён)
		let oversizeClient = 0;
		let existsClient = 0;
		if (isSetsMode.value) {
			const existingSources = await loadExistingTrackSources();
			const filtered = [];
			for (const f of files.value) {
				if (Number(f.size) > maxBytes) {
					oversizeClient++;
					continue;
				}

				if (existingSources.has(sourceKey(f.name))) {
					existsClient++;
					continue;
				}

				filtered.push(f);
			}
			files.value = filtered;

			if (files.value.length === 0) {
				const reasons = [];
				if (existsClient) reasons.push(`уже есть: ${existsClient}`);
				if (oversizeClient) reasons.push(`слишком большие: ${oversizeClient}`);
				message.value = reasons.length
					? `Нечего загружать • ${reasons.join(' • ')}`
					: 'Нечего загружать';
				if (fileInput.value) fileInput.value.value = '';
				return;
			}
		}

		// TRACKS: ограничить количество файлов по settings
		let limitedClient = 0;
		if (isSetsMode.value && files.value.length > uploadTracksMaxFiles.value) {
			limitedClient = files.value.length - uploadTracksMaxFiles.value;
			files.value = files.value.slice(0, uploadTracksMaxFiles.value);
		}

		// Предупреждение (только числа)
		const lines = [];
		if (isSetsMode.value) {
			if (selectedBefore !== files.value.length || existsClient || oversizeClient || limitedClient) {
				lines.push(`Выбрано: ${selectedBefore}.`);
				if (existsClient) lines.push(`Уже есть: ${existsClient}.`);
				if (oversizeClient) lines.push(`Слишком большие: ${oversizeClient}.`);
				if (limitedClient) lines.push(`Сверх лимита: ${limitedClient}.`);
				lines.push(`Будет загружено: ${files.value.length}.`);
				message.value = lines.join(' ');
			}
		}

		const kind = isAdsMode.value ? 'ads' : 'tracks';
		const url = `${ENDPOINT_BASE}/${kind}`;

		const form = new FormData();

		// поле set ДО files
		if (isSetsMode.value) form.append('set', currentSetId);

		// ADS: если title уже введён — отправляем
		if (isAdsMode.value) {
			const t = String(props?.item?.title ?? '').trim();
			if (t) form.append('title', t);
		}

		for (const f of files.value) form.append('files', f);

		const resp = await api.post(url, form, {
			headers: { 'Content-Type': 'multipart/form-data' },
			onUploadProgress: (evt) => {
				if (!evt.total) return;
				progress.value = Math.min(100, Math.round((evt.loaded / evt.total) * 100));
			},
		});

		emit('input', null);
		if (fileInput.value) fileInput.value.value = '';
		files.value = [];

		// ADS: редирект/обновление
		if (isAdsMode.value) {
			const adId = resp?.data?.ad_id;
			if (adId) {
				window.location.href = `/admin/content/ads/${adId}`;
				return;
			}
			setTimeout(() => window.location.reload(), 300);
			return;
		}

		// TRACKS: итог (без имён)
		const createdCount = Number(resp?.data?.created_count ?? 0) || 0;
		const skipped = resp?.data?.skipped ?? {};
		const warnings = collectResponseWarnings(resp);

		const parts = [];
		const ignored = Number(skipped?.ignored_by_limit ?? 0) || 0;
		const oversizeSrv = Number(skipped?.oversize ?? 0) || 0;
		const existsSrv = Number(skipped?.exists ?? 0) || 0;

		if (existsSrv) parts.push(`Дубликаты: ${existsSrv}.`);
		if (oversizeSrv) parts.push(`Слишком большие: ${oversizeSrv}.`);
		if (ignored) parts.push(`Сверх лимита: ${ignored}.`);

		if (warnings.length) {
			for (const w of warnings) parts.push(w);
		}

		if (parts.length) {
			message.value = parts.join(' ');
		}

		if (createdCount > 0) {
			const partsWithSuccess = [`Загружено: ${createdCount}.`, ...parts];
			message.value = partsWithSuccess.join(' ');
			if (isSetsMode.value && currentSetId) {
				closeSetRecord();
				return;
			}
			return;
		}

		message.value = parts.length ? parts.join(' ') : 'Файлы не были загружены';
	} catch (e) {
		message.value = humanError(e);
	} finally {
		uploading.value = false;
	}
}

function humanError(e) {
	const msg =
		e?.response?.data?.error ||
		e?.response?.data?.errors?.[0]?.message ||
		e?.response?.data?.message ||
		e?.message ||
		String(e);

	const st = e?.response?.status;
	return st ? `Ошибка ${st}: ${msg}` : `Ошибка: ${msg}`;
}

function formatBytes(bytes) {
	if (!bytes && bytes !== 0) return '';
	const units = ['B', 'KB', 'MB', 'GB', 'TB'];
	let b = bytes;
	let u = 0;
	while (b >= 1024 && u < units.length - 1) {
		b /= 1024;
		u++;
	}
	return `${b.toFixed(u === 0 ? 0 : 1)} ${units[u]}`;
}
</script>
<style scoped>
.upload-audio-ui {
	display: flex;
	flex-direction: column;
	gap: 12px;
	padding: 8px 0;
}

.row {
	display: flex;
	gap: 8px;
	align-items: center;
	flex-wrap: wrap;
}

input[type='file'] {
	display: none;
}

.summary {
	opacity: 0.85;
	font-size: 12px;
	margin-top: 2px;
}

.progress {
	position: relative;
	height: 14px;
	border-radius: 999px;
	border: 1px solid var(--border-subdued, rgba(0, 0, 0, 0.12));
	overflow: hidden;
}

.progress-bar {
	height: 100%;
	background: rgba(0, 110, 255, 0.35);
	transition: width 120ms linear;
}

.progress-text {
	margin-top: 6px;
	font-size: 12px;
	opacity: 0.8;
}
</style>
