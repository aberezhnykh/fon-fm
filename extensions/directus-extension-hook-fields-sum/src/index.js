import { defineHook } from '@directus/extensions-sdk';

export default defineHook(({ filter, action }, { services, getSchema, logger }) => {
	const { ItemsService } = services;

	const TRACKS = 'tracks';
	const SETS = 'sets';
	const PLAYLISTS = 'playlists';
	const STATUS_FIELD = 'status';
	const ACTIVE = 'active';
	const TRACKS_SET_FIELD = 'set';
	const SETS_PLAYLIST_FIELD = 'playlist';

	logger.info('[fields-sum] loaded v2.2.0 (playlists only)');

	const preState = new Map();
	const TTL_MS = 60_000;

	const keyOf = (collection, id) => `${collection}:${String(id)}`;
	const now = () => Date.now();

	const cleanup = () => {
		const t = now();
		for (const [key, obj] of preState.entries()) {
			if (!obj || t - obj.ts > TTL_MS) preState.delete(key);
		}
	};

	const valueToId = (value) => {
		if (value == null) return null;
		if (typeof value === 'string' || typeof value === 'number') return String(value);
		if (typeof value === 'object' && value.id != null) return String(value.id);
		return null;
	};

	const idsFromMeta = (meta, payload = null) => {
		const ids = [];

		const push = (value) => {
			const id = valueToId(value);
			if (!id || ids.includes(id)) return;
			ids.push(id);
		};

		for (const value of Array.isArray(meta?.keys) ? meta.keys : []) push(value);
		push(meta?.key);
		for (const value of Array.isArray(payload?.keys) ? payload.keys : []) push(value);
		push(payload?.key);
		push(payload?.id);
		push(meta?.payload?.id);

		return ids;
	};

	const setPre = (collection, id, value) => {
		if (!id) return;
		preState.set(keyOf(collection, id), { v: value, ts: now() });
	};

	const getPre = (collection, id) => {
		const key = keyOf(collection, id);
		const obj = preState.get(key);
		preState.delete(key);
		return obj?.v ?? null;
	};

	function toInt(v) {
		const n = Number(v);
		return Number.isFinite(n) ? Math.trunc(n) : 0;
	}

	async function itemsService(collection, ctx) {
		const schema = ctx.schema ?? (await getSchema());
		return new ItemsService(collection, {
			schema,
			knex: ctx.database,
			accountability: { admin: true },
		});
	}

	async function updateOneNoEvents(collection, id, data, ctx) {
		const svc = await itemsService(collection, ctx);
		await svc.updateOne(id, data, { emitEvents: false });
	}

	async function readMany(collection, ids, fields, ctx) {
		const svc = await itemsService(collection, ctx);
		return await svc.readMany(ids, { fields });
	}

	async function playlistIdFromSet(setId, ctx) {
		if (!setId) return null;
		const row = await ctx.database(SETS)
			.select(SETS_PLAYLIST_FIELD)
			.where('id', setId)
			.first();
		return valueToId(row?.[SETS_PLAYLIST_FIELD]);
	}

	async function recomputeSet(setId, ctx) {
		if (!setId) return;

		const agg = await ctx.database(TRACKS)
			.where(TRACKS_SET_FIELD, setId)
			.andWhere(STATUS_FIELD, ACTIVE)
			.count({ c: '*' })
			.sum({ s: 'duration' })
			.first();

		await updateOneNoEvents(SETS, setId, {
			size: toInt(agg?.c),
			duration: toInt(agg?.s),
		}, ctx);
	}

	async function computePlaylistAgg(playlistId, ctx) {
		const row = await ctx.database(SETS)
			.where(SETS_PLAYLIST_FIELD, playlistId)
			.andWhere(STATUS_FIELD, ACTIVE)
			.select(
				ctx.database.raw('COALESCE(SUM(`size`), 0) AS tracks_count'),
				ctx.database.raw('COALESCE(SUM(`duration`), 0) AS total_duration')
			)
			.first();

		return { size: toInt(row?.tracks_count), duration: toInt(row?.total_duration) };
	}

	async function recomputePlaylist(playlistId, ctx) {
		if (!playlistId) return;
		const agg = await computePlaylistAgg(playlistId, ctx);
		await updateOneNoEvents(PLAYLISTS, playlistId, agg, ctx);
	}

	filter('items.update', async (payload, meta, ctx) => {
		cleanup();

		const ids = idsFromMeta(meta, payload);
		if (!Array.isArray(ids) || ids.length === 0) return payload;

		try {
			if (meta.collection === TRACKS) {
				const rows = await readMany(TRACKS, ids, ['id', TRACKS_SET_FIELD], ctx);
				for (const row of rows) {
					setPre(TRACKS, row.id, { set: row?.[TRACKS_SET_FIELD] ?? null });
				}
			} else if (meta.collection === SETS) {
				const rows = await readMany(SETS, ids, ['id', SETS_PLAYLIST_FIELD], ctx);
				for (const row of rows) {
					setPre(SETS, row.id, { playlist: row?.[SETS_PLAYLIST_FIELD] ?? null });
				}
			}
		} catch (error) {
			logger.warn(error, '[fields-sum] pre-capture items.update failed');
		}

		return payload;
	});

	filter('items.delete', async (keys, meta, ctx) => {
		cleanup();

		const ids = Array.isArray(keys) ? keys.map(valueToId).filter(Boolean) : idsFromMeta(meta);
		if (!Array.isArray(ids) || ids.length === 0) return keys;

		try {
			if (meta.collection === TRACKS) {
				const rows = await readMany(TRACKS, ids, ['id', TRACKS_SET_FIELD], ctx);
				for (const row of rows) {
					setPre(TRACKS, row.id, { set: row?.[TRACKS_SET_FIELD] ?? null });
				}
			} else if (meta.collection === SETS) {
				const rows = await readMany(SETS, ids, ['id', SETS_PLAYLIST_FIELD], ctx);
				for (const row of rows) {
					setPre(SETS, row.id, { playlist: row?.[SETS_PLAYLIST_FIELD] ?? null });
				}
			}
		} catch (error) {
			logger.warn(error, '[fields-sum] pre-capture items.delete failed');
		}

		return keys;
	});

	action('items.create', async (meta, ctx) => {
		if (meta.collection === TRACKS) {
			const setId = valueToId(meta?.payload?.[TRACKS_SET_FIELD]);
			await recomputeSet(setId, ctx);
			const playlistId = await playlistIdFromSet(setId, ctx);
			await recomputePlaylist(playlistId, ctx);
			return;
		}

		if (meta.collection === SETS) {
			const setId = meta?.payload?.id;
			await recomputeSet(setId, ctx);
			await recomputePlaylist(valueToId(meta?.payload?.[SETS_PLAYLIST_FIELD]), ctx);
			return;
		}

		if (meta.collection === PLAYLISTS) {
			await recomputePlaylist(meta?.payload?.id, ctx);
		}
	});

	action('items.update', async (meta, ctx) => {
		const ids = idsFromMeta(meta, meta?.payload);
		if (!Array.isArray(ids) || ids.length === 0) return;

		if (meta.collection === TRACKS) {
			const setIds = new Set();
			const playlistIds = new Set();

			for (const id of ids) {
				const old = getPre(TRACKS, id);
				if (old?.set) setIds.add(old.set);
				const oldPlaylistId = await playlistIdFromSet(old?.set, ctx);
				if (oldPlaylistId) playlistIds.add(oldPlaylistId);
			}

			const rows = await readMany(TRACKS, ids, ['id', TRACKS_SET_FIELD], ctx).catch(() => []);
			for (const row of rows) {
				const setId = valueToId(row?.[TRACKS_SET_FIELD]);
				if (setId) setIds.add(setId);
				const playlistId = await playlistIdFromSet(setId, ctx);
				if (playlistId) playlistIds.add(playlistId);
			}

			for (const setId of setIds) {
				await recomputeSet(setId, ctx);
			}
			for (const playlistId of playlistIds) {
				await recomputePlaylist(playlistId, ctx);
			}
			return;
		}

		if (meta.collection === SETS) {
			const playlistIds = new Set();
			for (const id of ids) {
				const old = getPre(SETS, id);
				if (old?.playlist) playlistIds.add(old.playlist);
			}

			const rows = await readMany(SETS, ids, ['id', SETS_PLAYLIST_FIELD], ctx).catch(() => []);
			for (const row of rows) {
				const playlistId = valueToId(row?.[SETS_PLAYLIST_FIELD]);
				if (playlistId) playlistIds.add(playlistId);
				await recomputeSet(row?.id, ctx);
			}

			for (const playlistId of playlistIds) {
				await recomputePlaylist(playlistId, ctx);
			}
			return;
		}

		if (meta.collection === PLAYLISTS) {
			for (const playlistId of ids) {
				await recomputePlaylist(playlistId, ctx);
			}
		}
	});

	action('items.delete', async (meta, ctx) => {
		const ids = idsFromMeta(meta, meta?.payload);
		if (!Array.isArray(ids) || ids.length === 0) return;

		if (meta.collection === TRACKS) {
			const setIds = new Set();
			const playlistIds = new Set();
			for (const id of ids) {
				const old = getPre(TRACKS, id);
				if (old?.set) setIds.add(old.set);
				const oldPlaylistId = await playlistIdFromSet(old?.set, ctx);
				if (oldPlaylistId) playlistIds.add(oldPlaylistId);
			}

			for (const setId of setIds) {
				await recomputeSet(setId, ctx);
			}
			for (const playlistId of playlistIds) {
				await recomputePlaylist(playlistId, ctx);
			}
			return;
		}

		if (meta.collection === SETS) {
			const playlistIds = new Set();
			for (const id of ids) {
				const old = getPre(SETS, id);
				if (old?.playlist) playlistIds.add(old.playlist);
			}

			for (const playlistId of playlistIds) {
				await recomputePlaylist(playlistId, ctx);
			}
		}
	});
});
