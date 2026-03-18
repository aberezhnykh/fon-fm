import { defineDisplay } from '@directus/extensions-sdk';
import DisplayComponent from './display.vue';

export default defineDisplay({
	id: 'audio-player',
	name: 'Плеер аудио',
	icon: 'play_circle',
	description: 'Кнопка воспроизведения треков и роликов',
	component: DisplayComponent,

	// value = file (UUID.mp3) или UUID
	types: ['string', 'text', 'uuid'],
	localTypes: ['standard'],

	// Никаких options: всё централизовано в settings.cdn_host
	options: () => [],
});
