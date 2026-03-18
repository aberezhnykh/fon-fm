import { defineInterface } from '@directus/extensions-sdk';
import InterfaceComponent from './interface.vue';

export default defineInterface({
	id: 'directus-extension-interface-import-radiosparx',
	name: 'Импорт RadioSparx',
	icon: 'download',
	description: 'Импорт треков из RadioSparx playlist',
	component: InterfaceComponent,
	group: 'presentation',
	types: ['alias'],
	localTypes: ['presentation'],
	options: [],
});
