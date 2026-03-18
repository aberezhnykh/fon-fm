import { defineInterface } from '@directus/extensions-sdk';
import InterfaceComponent from './interface.vue';

export default defineInterface({
	id: 'directus-extension-interface-upload-audio',
	name: 'Загрузка аудио',
	icon: 'cloud_upload',
	description: 'Загрузка аудиофайлов',
	component: InterfaceComponent,
	group: 'presentation',
	types: ['alias'],
	localTypes: ['presentation'],
	options: [],
});
