<template>
	<private-view title="manage">
		<div style="padding:16px">{{ msg }}</div>
	</private-view>
</template>
<script setup>
import { ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useApi } from '@directus/extensions-sdk';

const TARGETS = new Set(['ads', 'players', 'streams', 'schedules', 'clients']);

const msg = ref('...');
const route = useRoute();
const router = useRouter();
const api = useApi();

async function run() {
	const clientIdRaw = route.params.clientId;
	const targetRaw = route.params.target;

	if (!clientIdRaw || !targetRaw) {
		msg.value = 'Invalid link';
		return;
	}

	const clientId = String(clientIdRaw);
	const target = String(targetRaw);

	if (!TARGETS.has(target)) {
		msg.value = 'Invalid target';
		return;
	}

	try {
		if (clientId === 'all') {
			await api.patch('/users/me', { all: true });
		} else {
			await api.patch('/users/me', { all: false, client_active: clientId });
		}

		msg.value = 'Redirect...';
		await router.replace(`/content/${target}`);
	} catch {
		msg.value = 'Forbidden';
	}
}

watch(
	() => route.fullPath,
	() => { run(); },
	{ immediate: true }
);
</script>