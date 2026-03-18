import { defineInterface } from '@directus/extensions-sdk';
import InterfaceComponent from './interface.vue';

export default defineInterface({
	id: 'date-time-mask',
	name: 'Дата/время',
	description: 'HH:MM или DD.MM.YY.',
	icon: 'schedule',
	component: InterfaceComponent,
	types: ['string'],
	group: 'standard',
	options: [
		{
			field: 'mode',
			name: 'Формат',
			type: 'string',
			meta: {
				width: 'half',
				interface: 'select-dropdown',
				options: {
					choices: [
						{ text: 'Время', value: 'time' },
						{ text: 'Дата', value: 'date' }
					]
				}
			},
			schema: { default_value: 'time' }
		}
	]
});