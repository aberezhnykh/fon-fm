// src/index.js
import { defineHook } from '@directus/extensions-sdk';
import crypto from 'crypto';

/**
 * uid:
 * - безопасный алфавит без I,O,0,1
 * - длина = max_length поля uid (если задан) иначе 5
 * - create: если uid пустой -> генерирует; если задан -> UPPER + проверка дубля
 * - update: если uid очистили (''/null) -> генерирует новый; если задан -> UPPER + проверка дубля (кроме текущей записи)
 *
 * pin:
 * - только цифры, ведущие нули сохраняются (строка)
 * - длина = max_length поля pin (если задан) иначе 4
 * - create: если pin пустой -> генерирует; если задан -> валидирует
 * - update: если pin присутствует в payload и очищен (null/''/пробелы) -> генерирует новый; если задан -> валидирует
 * - уникальность pin НЕ проверяется
 */

// ===== CONFIG =====
const UID_FIELD = 'code';
const PIN_FIELD = 'pin';

const UID_ALPHABET = 'ABCDEFGHJKLMNPQRSTUVWXYZ23456789'; // без I,O,0,1
const UID_DEFAULT_LEN = 5;
const PIN_DEFAULT_LEN = 4;

// ===== HELPERS =====
function normalizeString(v) {
	if (typeof v !== 'string') return v;
	return v.trim();
}

function normalizeUpper(v) {
	if (typeof v !== 'string') return v;
	return v.trim().toUpperCase();
}

function isNonEmptyString(v) {
	return typeof v === 'string' && v.trim().length > 0;
}

function getFieldMaxLength(schema, collection, field) {
	const f = schema?.collections?.[collection]?.fields?.[field];
	const max = f?.schema?.max_length;
	return Number.isInteger(max) && max > 0 ? max : null;
}

function hasField(schema, collection, field) {
	const fields = schema?.collections?.[collection]?.fields;
	return !!fields && Object.prototype.hasOwnProperty.call(fields, field);
}

function randomToken(alphabet, len) {
	let out = '';
	for (let i = 0; i < len; i++) out += alphabet[Math.floor(Math.random() * alphabet.length)];
	return out;
}

function randomPin(len) {
	const max = 10 ** len;
	const n = crypto.randomInt(0, max);
	return String(n).padStart(len, '0');
}

function validatePin(pin, len) {
	if (!/^\d+$/.test(pin)) throw new Error(`Поле "${PIN_FIELD}" должно содержать только цифры`);
	if (pin.length !== len) throw new Error(`Поле "${PIN_FIELD}" должно быть длиной ровно ${len} символов`);
}

async function existsUid(context, collection, schema, uidUpper, excludeId) {
	const { ItemsService } = context.services;
	const items = new ItemsService(collection, {
		knex: context.database,
		schema,
		accountability: null
	});

	const filter = excludeId
		? { _and: [{ [UID_FIELD]: { _eq: uidUpper } }, { id: { _neq: excludeId } }] }
		: { [UID_FIELD]: { _eq: uidUpper } };

	const rows = await items.readByQuery({
		fields: ['id', UID_FIELD],
		limit: 1,
		filter
	});

	return Array.isArray(rows) && rows.length > 0;
}

// ===== HOOK =====
export default defineHook(({ filter }, context) => {
	// ---------- UID ----------
	filter('items.create', async (input, meta) => {
		const collection = meta?.collection;
		if (!collection) return input;

		const schema = await context.getSchema();
		if (!hasField(schema, collection, UID_FIELD)) return input;

		const len = getFieldMaxLength(schema, collection, UID_FIELD) ?? UID_DEFAULT_LEN;

		// uid задан вручную -> UPPER + проверка дубля
		if (Object.prototype.hasOwnProperty.call(input ?? {}, UID_FIELD)) {
			if (input[UID_FIELD] !== null && input[UID_FIELD] !== undefined) {
				input[UID_FIELD] = normalizeUpper(input[UID_FIELD]);
				if (!isNonEmptyString(input[UID_FIELD])) return input;

				const dup = await existsUid(context, collection, schema, input[UID_FIELD], null);
				if (dup) throw new Error(`${UID_FIELD} "${input[UID_FIELD]}" already exists in "${collection}"`);
			}
			return input;
		}

		// uid не задан -> генерируем
		const maxAttempts = 80;
		for (let attempt = 0; attempt < maxAttempts; attempt++) {
			const candidate = randomToken(UID_ALPHABET, len);
			const dup = await existsUid(context, collection, schema, candidate, null);
			if (!dup) {
				input[UID_FIELD] = candidate;
				return input;
			}
		}

		throw new Error(`UID generation failed: could not find unique ${UID_FIELD} in ${maxAttempts} attempts for "${collection}"`);
	});

	filter('items.update', async (input, meta) => {
		const collection = meta?.collection;
		if (!collection) return input;

		// реагируем только если uid реально присутствует в payload
		if (!Object.prototype.hasOwnProperty.call(input ?? {}, UID_FIELD)) return input;

		const schema = await context.getSchema();
		if (!hasField(schema, collection, UID_FIELD)) return input;

		const len = getFieldMaxLength(schema, collection, UID_FIELD) ?? UID_DEFAULT_LEN;

		const keys = Array.isArray(meta?.keys) ? meta.keys : [];
		if (keys.length !== 1) throw new Error(`Mass update is not supported for "${UID_FIELD}" validation`);
		const currentId = keys[0];

		// null/undefined -> считаем как очистили -> генерируем новый
		if (input[UID_FIELD] === null || input[UID_FIELD] === undefined) {
			const maxAttempts = 80;
			for (let attempt = 0; attempt < maxAttempts; attempt++) {
				const candidate = randomToken(UID_ALPHABET, len);
				const dup = await existsUid(context, collection, schema, candidate, currentId);
				if (!dup) {
					input[UID_FIELD] = candidate;
					return input;
				}
			}
			throw new Error(
				`UID generation failed: could not find unique ${UID_FIELD} in ${maxAttempts} attempts for "${collection}"`
			);
		}

		input[UID_FIELD] = normalizeUpper(input[UID_FIELD]);

		// очистили строкой/пробелами -> генерируем новый
		if (!isNonEmptyString(input[UID_FIELD])) {
			const maxAttempts = 80;
			for (let attempt = 0; attempt < maxAttempts; attempt++) {
				const candidate = randomToken(UID_ALPHABET, len);
				const dup = await existsUid(context, collection, schema, candidate, currentId);
				if (!dup) {
					input[UID_FIELD] = candidate;
					return input;
				}
			}
			throw new Error(
				`UID generation failed: could not find unique ${UID_FIELD} in ${maxAttempts} attempts for "${collection}"`
			);
		}

		// обычная проверка дубля
		const dup = await existsUid(context, collection, schema, input[UID_FIELD], currentId);
		if (dup) throw new Error(`${UID_FIELD} "${input[UID_FIELD]}" already exists in "${collection}"`);

		return input;
	});

	// ---------- PIN ----------
	filter('items.create', async (input, meta) => {
		const collection = meta?.collection;
		if (!collection) return input;

		const schema = await context.getSchema();
		if (!hasField(schema, collection, PIN_FIELD)) return input;

		const len = getFieldMaxLength(schema, collection, PIN_FIELD) ?? PIN_DEFAULT_LEN;

		// pin задан (включая null/пусто) -> обработаем
		if (Object.prototype.hasOwnProperty.call(input ?? {}, PIN_FIELD)) {
			// null/undefined/пусто -> генерируем
			if (input[PIN_FIELD] === null || input[PIN_FIELD] === undefined) {
				input[PIN_FIELD] = randomPin(len);
				return input;
			}

			input[PIN_FIELD] = normalizeString(input[PIN_FIELD]);

			if (!isNonEmptyString(input[PIN_FIELD])) {
				input[PIN_FIELD] = randomPin(len);
				return input;
			}

			validatePin(input[PIN_FIELD], len);
			return input;
		}

		// pin не задан -> генерируем
		input[PIN_FIELD] = randomPin(len);
		return input;
	});

	filter('items.update', async (input, meta) => {
		const collection = meta?.collection;
		if (!collection) return input;

		// реагируем только если pin реально присутствует в payload
		if (!Object.prototype.hasOwnProperty.call(input ?? {}, PIN_FIELD)) return input;

		const schema = await context.getSchema();
		if (!hasField(schema, collection, PIN_FIELD)) return input;

		const len = getFieldMaxLength(schema, collection, PIN_FIELD) ?? PIN_DEFAULT_LEN;

		// null/undefined -> считаем как очистили -> генерируем новый
		if (input[PIN_FIELD] === null || input[PIN_FIELD] === undefined) {
			input[PIN_FIELD] = randomPin(len);
			return input;
		}

		input[PIN_FIELD] = normalizeString(input[PIN_FIELD]);

		// пустая строка/пробелы -> генерируем новый
		if (!isNonEmptyString(input[PIN_FIELD])) {
			input[PIN_FIELD] = randomPin(len);
			return input;
		}

		// ручной ввод -> валидируем
		validatePin(input[PIN_FIELD], len);
		return input;
	});
});