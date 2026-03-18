// src/index.js
import { defineModule } from '@directus/extensions-sdk';
import Manage from './module.vue';

export default defineModule({
	id: 'manage',
	name: 'Clients',
	icon: 'groups',
	hidden: false,
	routes: [
		// клик по пункту меню ( /admin/manage ) сразу включает режим "все" и открывает клиентов
		{ path: '', redirect: '/manage/all/clients' },

		// шлюз: /admin/manage/:clientId/:target
		{ path: ':clientId/:target', component: Manage },
	],
});