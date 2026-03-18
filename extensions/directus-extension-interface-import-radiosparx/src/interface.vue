<template>
	<div class="radiosparx-import-ui">
		<div class="row">
			<v-button kind="primary" :disabled="!canPrimaryClick" @click="primaryClick">
				{{ primaryLabel }}
			</v-button>
			<v-button v-if="showCancel" secondary @click="cancelPreview">
				Отмена
			</v-button>
		</div>
		<div class="summary">{{ messageText }}</div>
	</div>
</template>

<script setup>
import { computed, nextTick, ref, watch } from 'vue';
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
const ENDPOINT_BASE = '/import-radiosparx';
const URL_HINT = 'Укажите ссылку или ID в поле URL';

const loading = ref(false);
const loadingStatus = ref('');
const message = ref(URL_HINT);
const previewReady = ref(false);
const previewData = ref(null);
const persistedSetId = ref('');
let loadingTimer = null;
let loadingStartedAt = 0;
let setFieldNamesPromise = null;

function normId(value) {
	if (value === null || value === undefined) return '';
	if (typeof value === 'object') {
		if ('id' in value) {
			const id = String(value.id ?? '').trim();
			return id === '+' ? '' : id;
		}
		return '';
	}

	const id = String(value).trim();
	return id === '+' ? '' : id;
}

const setId = computed(() => normId(props.primaryKey) || normId(props?.item?.id));
const effectiveSetId = computed(() => persistedSetId.value || setId.value);
const isSetsMode = computed(() => props.collection === 'sets');
const canPrimaryClick = computed(() => {
	if (!isSetsMode.value || loading.value) return false;
	return true;
});
const primaryLabel = computed(() => {
	if (loading.value) {
		if (!previewReady.value) return 'Импортируем...';
		return canUploadPreview.value ? 'Загружаем...' : 'Синхронизируем...';
	}
	if (!previewReady.value) return 'Импортировать';
	return canUploadPreview.value ? 'Загрузить' : 'Синхронизировать';
});
const summaryText = computed(() => {
	const data = previewData.value;
	if (!data) return '';

	const found = Number(data?.found_clips ?? 0) || 0;
	const willCreate = Number(data?.will_create_count ?? 0) || 0;
	const willDeactivate = Number(data?.will_deactivate_count ?? 0) || 0;
	const parts = [
		`Треков: ${found}`,
		`Будет добавлено: ${willCreate}`,
		`Будет деактивировано: ${willDeactivate}`,
	];
	return parts.join(' • ');
});
const canUploadPreview = computed(() => (Number(previewData.value?.will_create_count ?? 0) || 0) > 0);
const showCancel = computed(() => previewReady.value && !loading.value);
const messageText = computed(() => {
	if (loadingStatus.value) return loadingStatus.value;
	if (message.value) return message.value;
	if (summaryText.value) return summaryText.value;
	return URL_HINT;
});

function resetPreview() {
	previewReady.value = false;
	previewData.value = null;
}

function cancelPreview() {
	resetPreview();
	loadingStatus.value = '';
	message.value = URL_HINT;
}

function validate() {
	if (!isSetsMode.value) return 'Этот интерфейс предназначен только для sets';
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
	await flushFormState();
	const fieldNames = await loadSetFieldNames();
	const payload = buildSetPayload(fieldNames);
	if (fieldNames.includes('library')) payload.library = 'radiosparx';
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

async function resolvePlaylistUrl() {
	await flushFormState();
	const fieldNames = await loadSetFieldNames();
	const payload = buildSetPayload(fieldNames);
	return String(payload.url ?? props?.item?.url ?? '').trim();
}

function primaryClick() {
	if (previewReady.value) {
		importPlaylist();
		return;
	}

	previewPlaylist();
}

function startLoadingStatus(steps) {
	stopLoadingStatus();
	loadingStartedAt = Date.now();

	let index = 0;
	loadingStatus.value = steps[index];
	loadingTimer = window.setInterval(() => {
		index = Math.min(index + 1, steps.length - 1);
		loadingStatus.value = steps[index];
	}, 1400);
}

function stopLoadingStatus() {
	if (loadingTimer) {
		window.clearInterval(loadingTimer);
		loadingTimer = null;
	}
}

async function ensureLoadingVisible(minMs = 900) {
	const elapsed = Date.now() - loadingStartedAt;
	if (elapsed >= minMs) return;
	await new Promise((resolve) => window.setTimeout(resolve, minMs - elapsed));
}

async function previewPlaylist() {
	message.value = '';

	const validationError = validate();
	if (validationError) {
		message.value = validationError;
		return;
	}

	loading.value = true;
	startLoadingStatus([
		'Проверяем playlist RadioSparx...',
		'Получаем список треков...',
	]);
	await nextTick();
	await new Promise((resolve) => window.setTimeout(resolve, 80));

	try {
		const currentUrl = await resolvePlaylistUrl();
		if (!currentUrl) {
			message.value = URL_HINT;
			return;
		}

		const response = await api.post(`${ENDPOINT_BASE}/preview`, {
			set: effectiveSetId.value || undefined,
			playlist_url: currentUrl,
		});
		previewData.value = response?.data ?? {};
		previewReady.value = true;
		loadingStatus.value = '';
		message.value = summaryText.value;
	} catch (err) {
		resetPreview();
		message.value = humanError(err);
	} finally {
		await ensureLoadingVisible();
		loading.value = false;
		stopLoadingStatus();
	}
}

async function importPlaylist() {
	message.value = '';

	const validationError = validate();
	if (validationError) {
		message.value = validationError;
		return;
	}

	loading.value = true;
		startLoadingStatus([
			'Создаём записи tracks...',
			'Обработка на сервере...',
		]);
	await nextTick();
	await new Promise((resolve) => window.setTimeout(resolve, 80));

	try {
		const savedSetId = await ensureSavedSet();
		const currentUrl = await resolvePlaylistUrl();
		if (!currentUrl) {
			message.value = URL_HINT;
			return;
		}

		const response = await api.post(`${ENDPOINT_BASE}/import`, {
			set: savedSetId,
			playlist_url: currentUrl,
		});

		const data = response?.data ?? {};
		message.value = `Загружено: ${Number(data?.created_count ?? 0) || 0}`;
		resetPreview();
		emit('input', null);
		closeSetRecord();
		return;
	} catch (err) {
		message.value = humanError(err);
	} finally {
		await ensureLoadingVisible();
		loading.value = false;
		stopLoadingStatus();
	}
}

function humanError(err) {
	const msg =
		err?.response?.data?.error ||
		err?.response?.data?.errors?.[0]?.message ||
		err?.response?.data?.message ||
		err?.message ||
		String(err);

	const statusCode = err?.response?.status;
	return statusCode ? `Ошибка ${statusCode}: ${msg}` : `Ошибка: ${msg}`;
}

watch(
	() => String(props?.item?.url ?? '').trim(),
	() => {
		resetPreview();
		loadingStatus.value = '';
		message.value = URL_HINT;
	}
);

watch(() => readLiveFieldValue('url'), () => {
	resetPreview();
	loadingStatus.value = '';
	message.value = URL_HINT;
});
</script>

<style scoped>
.radiosparx-import-ui {
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

.summary {
	opacity: 0.85;
	font-size: 12px;
	margin-top: 2px;
	min-height: 18px;
}
</style>
