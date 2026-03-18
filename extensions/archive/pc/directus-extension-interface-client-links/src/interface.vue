<template>
	<div class="wrap">
		<v-button small @click="open('players')" :disabled="!clientId">Плееры</v-button>
		<v-button small @click="open('schedules')" :disabled="!clientId">Расписания</v-button>
		<v-button small @click="open('streams')" :disabled="!clientId">Потоки</v-button>
		<v-button small @click="open('ads')" :disabled="!clientId">Ролики</v-button>
		<div v-if="error" class="err">{{ error }}</div>
	</div>
</template>
<script setup>
import { computed, ref } from 'vue';
import { useApi, useStores } from '@directus/extensions-sdk';
import { useRouter } from 'vue-router';

const props = defineProps({
	item: { type: Object, default: null },
	primaryKey: { type: [String, Number], default: null },
});

const api = useApi();
const router = useRouter();
const { useUserStore } = useStores();
const userStore = useUserStore();

const error = ref('');

const clientId = computed(() => props.primaryKey ?? props.item?.id ?? null);
const userId = computed(() => userStore?.currentUser?.id ?? null);

const CLIENT_FK = 'client';     // поле связи в players/schedules/streams/ads
const LAYOUT = 'tabular';       // табличный вид

// РОВНО 4 “закладки” (по одной на коллекцию), которые будут переписываться под выбранного клиента
const PRESET_NAME = {
	players: 'client.current.players',
	schedules: 'client.current.schedules',
	streams: 'client.current.streams',
	ads: 'client.current.ads',
};

function ensureContext() {
	if (!clientId.value) throw new Error('Нет client id');
	if (!userId.value) throw new Error('Нет user id');
}

async function findPresetId(collection) {
	const name = PRESET_NAME[collection];

	const res = await api.get('/presets', {
		params: {
			limit: 1,
			fields: ['id'],
			filter: {
				_and: [
					{ bookmark: { _eq: true } },
					{ collection: { _eq: collection } },
					{ name: { _eq: name } },
					{ user: { _eq: userId.value } },
				],
			},
		},
	});

	return res?.data?.data?.[0]?.id ?? null;
}

async function getPreset(id) {
	const res = await api.get(`/presets/${id}`, {
		params: { fields: ['id', 'layout', 'layout_query', 'filters'] },
	});
	return res?.data?.data ?? null;
}

async function createPreset(collection) {
	const name = PRESET_NAME[collection];

	const payload = {
		bookmark: true,
		name,
		user: userId.value,
		collection,
		layout: LAYOUT,

		// запросные параметры для layout
		layout_query: {
			[LAYOUT]: {
				filter: { [CLIENT_FK]: { _eq: clientId.value } },
			},
		},

		// UI-фильтры таблицы (иначе визуально “фильтра нет”)
		filters: [
			{ key: '__client', field: CLIENT_FK, operator: '_eq', value: clientId.value },
		],
	};

	const res = await api.post('/presets', payload);

	// create может вернуть data как объект или как массив
	const d = res?.data?.data;
	if (Array.isArray(d)) return d?.[0]?.id ?? null;
	return d?.id ?? null;
}

async function upsertClientFilter(presetId) {
	const preset = await getPreset(presetId);

	const layoutQuery = preset?.layout_query ?? {};
	const currentLayout = layoutQuery?.[LAYOUT] ?? {};

	const nextLayoutQuery = {
		...layoutQuery,
		[LAYOUT]: {
			...currentLayout,
			filter: { [CLIENT_FK]: { _eq: clientId.value } },
		},
	};

	const existing = Array.isArray(preset?.filters) ? preset.filters : [];
	const nextFilters = [
		{ key: '__client', field: CLIENT_FK, operator: '_eq', value: clientId.value },
		...existing.filter((f) => f?.key !== '__client'),
	];

	await api.patch(`/presets/${presetId}`, {
		layout: LAYOUT,
		layout_query: nextLayoutQuery,
		filters: nextFilters,
	});
}

async function ensurePreset(collection) {
	let id = await findPresetId(collection);
	if (!id) id = await createPreset(collection);
	if (!id) throw new Error('Не удалось создать/найти preset');

	// каждый клик “перепривязывает” закладку на текущего клиента
	await upsertClientFilter(id);
	return id;
}

async function open(collection) {
	error.value = '';
	try {
		ensureContext();

		const presetId = await ensurePreset(collection);

		// открыть штатную таблицу коллекции с bookmark=<presetId>
		await router.push({ path: `/content/${collection}`, query: { bookmark: presetId } });
	} catch (e) {
		error.value = e?.message ? String(e.message) : String(e);
		console.error(e);
	}
}
</script>
<style scoped>
.wrap {
	display: flex;
	gap: 8px;
	flex-wrap: wrap;
	align-items: center;
}

.err {
	margin-top: 8px;
	width: 100%;
	color: var(--danger);
	font-size: 12px;
}
</style>