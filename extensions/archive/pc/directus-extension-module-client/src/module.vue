<template>
    <private-view title="Клиенты">
        <!-- ничего не рисуем, чтобы не мелькало лишнее -->
        <div style="height: 1px"></div>
    </private-view>
</template>
<script setup>
import { watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useApi } from '@directus/extensions-sdk';

const route = useRoute();
const router = useRouter();
const api = useApi();

async function run() {
    const raw = route.params.clientId;

    // Клик по пункту меню: /admin/client
    // Или “все”: /admin/client/all
    if (!raw || String(raw) === 'all') {
        await api.patch('/users/me', { show_all: true });
        await router.replace('/content/clients');
        return;
    }

    // “Войти”: /admin/client/<uuid>
    const clientId = String(raw);
    await api.patch('/users/me', { show_all: false, client_selected: clientId });
    await router.replace('/content/clients');
}

watch(() => route.fullPath, () => { run(); }, { immediate: true, flush: 'sync' });
</script>