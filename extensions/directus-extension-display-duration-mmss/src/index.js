import { defineDisplay } from '@directus/extensions-sdk';
import DisplayDuration from './display.vue';

export default defineDisplay({
	id: 'directus-extension-display-duration-mmss',
	name: 'Формат',
	icon: 'schedule',
	description: 'Отображать секунды как mm:ss или hh:mm:ss',
	component: DisplayDuration,

	// ВОТ ЭТО важно для появления в списке Display у числового поля
	types: ['integer', 'bigInteger', 'float', 'decimal'],

	// Можно не указывать, по умолчанию standard, но пусть будет явно
	localTypes: ['standard'],
});
