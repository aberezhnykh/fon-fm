import fs from 'node:fs/promises';
import path from 'node:path';
import { defineHook } from '@directus/extensions-sdk';

const CDN_ROOT = process.env.CDN_ROOT || '/cdn';
const MEDIA_ROOT = path.posix.join(CDN_ROOT, 'media');
const FILE_EXT = '.mp3';
const DIRECT_COLLECTIONS = new Set(['tracks', 'ads']);
const CACHE_TTL_MS = 30_000;

function idString(id) {
	if (typeof id === 'string') return id.trim();
	if (typeof id === 'number' && Number.isFinite(id)) return String(id);
	if (typeof id === 'object' && id && 'id' in id) return idString(id.id);
	return '';
}

function uniqIds(values) {
	const out = [];
	for (const value of Array.isArray(values) ? values : [values]) {
		const id = idString(value);
		if (!id || out.includes(id)) continue;
		out.push(id);
	}
	return out;
}

function isSafeId(id) {
	return /^[a-z0-9-]+$/i.test(id);
}

function bucket(id) {
	return (id[0] || '0').toLowerCase();
}

function cacheKey(collection, ids) {
	return `${collection}:${uniqIds(ids).join(',')}`;
}

async function unlinkIfExists(file) {
	try {
		await fs.unlink(file);
	} catch (error) {
		if (error?.code === 'ENOENT' || error?.code === 'ENOTDIR') return;
		throw error;
	}
}

async function deleteAudioFiles(collection, ids, logger) {
	for (const id of uniqIds(ids)) {
		if (!isSafeId(id)) continue;

		const file = path.posix.join(MEDIA_ROOT, collection, bucket(id), `${id}${FILE_EXT}`);

		try {
			await unlinkIfExists(file);
		} catch (error) {
			logger.error(`[delete-audio] delete failed: collection=${collection} id=${id} file=${file}`);
			logger.error(error);
		}
	}
}

export default defineHook(({ filter, action }, { logger }) => {
	const pendingDeletes = new Map();

	const remember = (key, value) => {
		pendingDeletes.set(key, value);
		setTimeout(() => pendingDeletes.delete(key), CACHE_TTL_MS);
	};

	filter('items.delete', async (keys, meta, ctx) => {
		const collection = meta.collection;
		const ids = uniqIds(keys);
		if (!ids.length) return keys;

		if (DIRECT_COLLECTIONS.has(collection)) {
			remember(cacheKey(collection, ids), { collection, ids });
			return keys;
		}

		if (collection === 'sets') {
			try {
				const rows = await ctx.database('tracks')
					.select('id')
					.whereIn('set', ids);

				const trackIds = uniqIds(rows.map((row) => row?.id));
				if (trackIds.length) {
					remember(cacheKey(collection, ids), { collection: 'tracks', ids: trackIds });
				}
			} catch (error) {
				logger.error({ ids, error }, '[delete-audio] failed to capture tracks for set delete');
			}
		}

		return keys;
	});

	action('items.delete', async (meta) => {
		const collection = meta.collection;
		const ids = uniqIds(Array.isArray(meta?.keys) ? meta.keys : meta?.key);
		if (!ids.length) return;

		const remembered = pendingDeletes.get(cacheKey(collection, ids));
		pendingDeletes.delete(cacheKey(collection, ids));
		if (!remembered?.collection || !remembered?.ids?.length) return;

		await deleteAudioFiles(remembered.collection, remembered.ids, logger);
	});
});
