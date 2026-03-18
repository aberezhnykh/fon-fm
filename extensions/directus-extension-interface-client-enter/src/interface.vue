<template>
	<v-button :disabled="disabled || nonEditable || primaryKey === '+' || busy" :loading="busy" @click="onClick">
		{{ buttonText }}
	</v-button>
</template>
<script setup>
import { ref, computed } from 'vue';
import { useApi, useStores } from '@directus/extensions-sdk';
import { useRouter } from 'vue-router';

const props = defineProps([
	'disabled',
	'nonEditable',
	'primaryKey', // id текущего клиента (uuid)
	'target',     // куда перейти после "Войти"
]);

const api = useApi();
const router = useRouter();

const { useUserStore, usePermissionsStore } = useStores();
const userStore = useUserStore();
const permissionsStore = usePermissionsStore();

const busy = ref(false);

const currentSelected = computed(() => userStore.currentUser?.client_selected ?? null);

const isThisClientSelected = computed(() => {
	if (!props.primaryKey || props.primaryKey === '+') return false;
	return currentSelected.value === props.primaryKey;
});

const buttonText = computed(() => (isThisClientSelected.value ? 'Выйти' : 'Войти'));

async function rehydrateAfterUserChange(nextSelected, nextShowAll) {
	// 1) локально обновляем userStore, чтобы UI мгновенно видел новое значение
	if (userStore.currentUser && !('share' in userStore.currentUser)) {
		userStore.currentUser = {
			...userStore.currentUser,
			client_selected: nextSelected,
			show_all: nextShowAll,
		};
	}

	// 2) пересчитываем permissions/presets (там у вас $CURRENT_USER.client_selected)
	await permissionsStore.hydrate();
}

async function onClick() {
	if (busy.value) return;
	if (!props.primaryKey || props.primaryKey === '+') return;

	busy.value = true;
	try {
		if (isThisClientSelected.value) {
			// Выйти: сбросить клиента и включить show_all (чтобы не получить "пусто")
			await api.patch('/users/me', { client_selected: null, show_all: true });
			await rehydrateAfterUserChange(null, true);

			await router.replace('/content/clients');
		} else {
			// Войти: выбрать клиента и выключить show_all
			await api.patch('/users/me', { client_selected: props.primaryKey, show_all: false });
			await rehydrateAfterUserChange(props.primaryKey, false);

			const target = props.target || 'clients';
			await router.replace(`/content/${target}`);
		}
	} finally {
		busy.value = false;
	}
}
</script>