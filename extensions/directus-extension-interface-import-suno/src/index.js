import { defineInterface } from '@directus/extensions-sdk';
import InterfaceComponent from './interface.vue';

export default defineInterface({
	id: 'directus-extension-interface-import-suno',
	name: 'Импорт SUNO',
	icon: 'download',
	description: 'Импорт треков из SUNO playlist',
	component: InterfaceComponent,
	group: 'presentation',
	types: ['alias'],
	localTypes: ['presentation'],
	options: [],
});
