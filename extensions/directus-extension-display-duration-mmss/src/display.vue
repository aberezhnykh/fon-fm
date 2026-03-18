<template>
	<span v-if="text">{{ text }}</span>
</template>
<script setup>
import { computed } from 'vue';

const props = defineProps({
	value: { type: [Number, String, null], default: null },
});

const text = computed(() => {
	// пусто -> ничего не показываем
	if (props.value === null || props.value === undefined || props.value === '') return '';

	const n = Number(props.value);
	if (!Number.isFinite(n)) return '';

	// 0 секунд — это НЕ пусто, показываем 00:00
	const total = Math.max(0, Math.floor(n));

	// до 1 часа: mm:ss
	if (total < 3600) {
		const mm = Math.floor(total / 60);
		const ss = total % 60;
		return String(mm).padStart(2, '0') + ':' + String(ss).padStart(2, '0');
	}

	// 1 час и больше: hh:mm:ss
	const hh = Math.floor(total / 3600);
	const mm = Math.floor((total % 3600) / 60);
	const ss = total % 60;

	return (
		String(hh).padStart(2, '0') +
		':' +
		String(mm).padStart(2, '0') +
		':' +
		String(ss).padStart(2, '0')
	);
});
</script>
