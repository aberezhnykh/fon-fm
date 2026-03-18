import { defineInterface } from '@directus/extensions-sdk';
import InterfaceComponent from './interface.vue';

export default defineInterface({
	id: 'client-enter',
	name: 'Управлять',
	icon: 'login',
	component: InterfaceComponent,

	types: ['alias'],
	group: 'presentation',
	localTypes: ['presentation'],

	options: [
		{
			field: 'target',
			name: 'Куда перейти',
			type: 'string',
			schema: { default_value: 'clients' },
			meta: {
				interface: 'select-dropdown',
				options: {
					choices: [
						{ text: 'Клиенты', value: 'clients' },
						{ text: 'Плееры', value: 'players' },
						{ text: 'Потоки', value: 'streams' },
						{ text: 'Расписания', value: 'schedules' },
						{ text: 'Ролики', value: 'ads' },
					],
				},
				width: 'half',
			},
		},
	],
});