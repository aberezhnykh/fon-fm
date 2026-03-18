import { defineModule } from '@directus/extensions-sdk';
import Client from './module.vue';

export default defineModule({
	id: 'client',
	name: 'Клиенты',
	icon: 'corporate_fare',
	hidden: false,
	routes: [
		{ path: '', component: Client },        // /admin/client
		{ path: ':clientId', component: Client } // /admin/client/<id>  или  /admin/client/all
	],
});