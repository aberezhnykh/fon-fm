import { defineInterface } from '@directus/extensions-sdk';
import InterfaceComponent from './interface.vue';

export default defineInterface({
	id: 'client-links',
	name: 'Client Links',
	icon: 'link',
	description: 'Open related collections filtered by current client (4 fixed bookmarks).',
	component: InterfaceComponent,

	// важно для Alias-поля (presentation), иначе интерфейс “сбрасывается”
	types: ['alias'],
	localTypes: ['presentation'],
	group: 'presentation',
});