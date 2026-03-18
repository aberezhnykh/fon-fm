import { defineHook } from '@directus/extensions-sdk';

const MAX_ERROR_LENGTH = 10_000;

const WATCHED = [
	'clients',
	'players',
	'ads',
	'schedules',
	'schedules_players',
	'streams_playlists',
	'streams',
	'playlists',
	'tracks',
	'sets',
];

const emptyPayload = () => ({
	clients: [],
	players: [],
	streams: [],
	playlists: [],
	delete_clients: [],
	delete_players: [],
	delete_player_routes: [],
	delete_streams: [],
	delete_devices: [],
});

const uniq = (arr) => [...new Set((arr || []).map(String).filter(Boolean))];

const valueToId = (value) => {
	if (value == null) return '';
	if (typeof value === 'string' || typeof value === 'number') return String(value);
	if (typeof value === 'object' && value.id != null) return String(value.id);
	return '';
};

const stringifyError = (error) => {
	const text = error instanceof Error ? `${error.name}: ${error.message}` : String(error || 'Unknown error');
	return text.slice(0, MAX_ERROR_LENGTH);
};

const sqlDate = (date) => date.toISOString().slice(0, 19).replace('T', ' ');
const sqlNow = () => sqlDate(new Date());

const mergePayload = (...items) => {
	const out = emptyPayload();

	for (const item of items) {
		if (!item || typeof item !== 'object') continue;
		for (const key of Object.keys(out)) out[key] = uniq([...(out[key] || []), ...((item[key] || []).map(String))]);
	}

	return out;
};

const payloadHasWork = (payload) =>
	Object.values(payload || {}).some((value) => Array.isArray(value) && value.length > 0);

const payloadClientIds = (payload) =>
	uniq([ ...((payload?.clients || []).map(String)) ]);

const hasOnlyKeys = (payload, allowedKeys) => {
	if (!payload || typeof payload !== 'object' || Array.isArray(payload)) return false;
	const keys = Object.keys(payload);
	if (!keys.length) return false;
	return keys.every((key) => allowedKeys.includes(key));
};

const isOperationalClientUpdate = (collection, payload, meta) => {
	if (collection !== 'clients') return false;
	const sourcePayload = payload && typeof payload === 'object' && !Array.isArray(payload)
		? payload
		: (meta?.payload && typeof meta.payload === 'object' && !Array.isArray(meta.payload) ? meta.payload : null);
	return hasOnlyKeys(sourcePayload, ['state', 'error', 'updated']);
};

export default defineHook(({ filter, action }, { services, logger, env, database, getSchema }) => {
	const { ItemsService } = services;

	const service = async (collection) => {
		const schema = await getSchema();

		return new ItemsService(collection, {
			knex: database,
			schema,
			accountability: null,
		});
	};

	const readIdsByQuery = async (collection, query) => {
		try {
			const rows = await (await service(collection)).readByQuery({
				fields: ['id'],
				limit: -1,
				...query,
			});

			return uniq(rows.map((row) => valueToId(row?.id)).filter(Boolean));
		} catch (error) {
			logger.warn({ collection, query, error: stringifyError(error) }, 'readIdsByQuery failed');
			return [];
		}
	};

	const readRowsByQuery = async (collection, query) => {
		try {
			return await (await service(collection)).readByQuery({
				limit: -1,
				...query,
			});
		} catch (error) {
			logger.warn({ collection, query, error: stringifyError(error) }, 'readRowsByQuery failed');
			return [];
		}
	};

	const readRelIds = async (collection, ids, fieldsToTry) => {
		ids = uniq(ids);
		if (!ids.length) return [];

		for (const field of fieldsToTry) {
			try {
				const rows = await (await service(collection)).readByQuery({
					fields: [field],
					filter: { id: { _in: ids } },
					limit: -1,
				});

				const out = uniq(rows.map((row) => valueToId(row?.[field])).filter(Boolean));
				if (out.length) return out;
			} catch {
				// try next field
			}
		}

		return [];
	};

	const playerIdsFromClients = (clientIds) =>
		readIdsByQuery('players', { filter: { client: { _in: uniq(clientIds) } } });

	const clientIdsFromPlayers = (playerIds) =>
		readRelIds('players', playerIds, ['client']);

	const streamIdsFromPlayers = (playerIds) =>
		readRelIds('players', playerIds, ['stream']);

	const streamIdsFromClients = async (clientIds) => {
		const directStreams = await readIdsByQuery('streams', { filter: { client: { _in: uniq(clientIds) } } });
		const playerStreams = await streamIdsFromPlayers(await playerIdsFromClients(clientIds));
		return uniq([...directStreams, ...playerStreams]);
	};

	const playlistIdsFromSets = (setIds) =>
		readRelIds('sets', setIds, ['playlist']);

	const streamIdsFromPlaylists = async (playlistIds) => {
		playlistIds = uniq(playlistIds);
		if (!playlistIds.length) return [];

		const rows = await readRowsByQuery('streams_playlists', {
			fields: ['streams_id'],
			filter: { playlists_id: { _in: playlistIds } },
		});

		return uniq(rows.map((row) => valueToId(row?.streams_id)).filter(Boolean));
	};

	const buildClientsPayload = async (clientIds) => {
		clientIds = uniq(clientIds);
		if (!clientIds.length) return emptyPayload();

		const playerIds = await playerIdsFromClients(clientIds);
		const streamIds = await streamIdsFromClients(clientIds);
		const playlistRows = await readRowsByQuery('streams_playlists', {
			fields: ['playlists_id'],
			filter: { streams_id: { _in: streamIds } },
		});
		const playlistIds = uniq(playlistRows.map((row) => valueToId(row?.playlists_id)).filter(Boolean));

		return mergePayload({
			clients: clientIds,
			players: playerIds,
			streams: streamIds,
			playlists: playlistIds,
		});
	};

	const clientSnapshot = async (clientId) => ({
		playerIds: await playerIdsFromClients([clientId]),
		playerCodes: uniq((await readRowsByQuery('players', {
			fields: ['code'],
			filter: { client: { _eq: clientId } },
		})).map((row) => String(row?.code || '').trim().toLowerCase()).filter(Boolean)),
		streamIds: await streamIdsFromClients([clientId]),
	});

	const buildDeletePayloadFromSnapshot = (clientIds, snapshotsByClient) => {
		const payload = emptyPayload();

		for (const clientId of uniq(clientIds)) {
			const snapshot = snapshotsByClient[clientId] || { playerIds: [], playerCodes: [], streamIds: [] };
			payload.delete_clients.push(clientId);
			payload.delete_players.push(...snapshot.playerIds);
			payload.delete_player_routes.push(...snapshot.playerCodes);
			payload.delete_devices.push(...snapshot.playerIds);
			payload.delete_streams.push(...snapshot.streamIds);
		}

		return mergePayload(payload);
	};

	const buildDeletePayloadFromClients = async (clientIds) => {
		const snapshots = {};
		for (const clientId of uniq(clientIds)) snapshots[clientId] = await clientSnapshot(clientId);
		return buildDeletePayloadFromSnapshot(clientIds, snapshots);
	};

	const buildPayloadForCollection = async (collection, ids, extra = {}, deleteIds = []) => {
		ids = uniq(ids);
		deleteIds = uniq(deleteIds);

		if (collection === 'clients') {
			const payload = await buildClientsPayload(ids);
			if (!deleteIds.length) return payload;
			return mergePayload(payload, await buildDeletePayloadFromClients(deleteIds));
		}

		if (collection === 'players') {
			const rows = await readRowsByQuery('players', {
				fields: ['id', 'client'],
				filter: { id: { _in: ids } },
			});
			const playerIds = uniq([...ids, ...((extra.players || []).map(String))]);
			const clientIds = uniq([
				...rows.map((row) => valueToId(row?.client)).filter(Boolean),
				...((extra.clients || []).map(String)),
			]);
			return mergePayload({
				players: playerIds,
				clients: clientIds,
				delete_player_routes: extra.delete_player_routes,
			});
		}

		if (collection === 'ads') {
			const rows = await readRowsByQuery('ads', {
				fields: ['client'],
				filter: { id: { _in: ids } },
			});
			const clientIds = uniq([
				...rows.map((row) => valueToId(row?.client)).filter(Boolean),
				...((extra.clients || []).map(String)),
			]);
			return mergePayload({ clients: clientIds });
		}

		if (collection === 'schedules') {
			const playerRows = await readRowsByQuery('schedules_players', {
				fields: ['players_id'],
				filter: { schedules_id: { _in: ids } },
			});
			const playerIds = uniq(playerRows.map((row) => valueToId(row?.players_id)).filter(Boolean));
			return mergePayload({ clients: await clientIdsFromPlayers(playerIds) });
		}

		if (collection === 'schedules_players') {
			const rows = await readRowsByQuery('schedules_players', {
				fields: ['players_id'],
				filter: { id: { _in: ids } },
			});
			const playerIds = uniq([
				...rows.map((row) => valueToId(row?.players_id)).filter(Boolean),
				...((extra.player_ids || []).map(String)),
			]);
			return mergePayload({ clients: await clientIdsFromPlayers(playerIds) });
		}

		if (collection === 'streams') {
			return mergePayload({ streams: ids });
		}

		if (collection === 'streams_playlists') {
			const rows = await readRowsByQuery('streams_playlists', {
				fields: ['streams_id'],
				filter: { id: { _in: ids } },
			});
			const streamIds = uniq([
				...rows.map((row) => valueToId(row?.streams_id)).filter(Boolean),
				...((extra.streams || []).map(String)),
			]);
			return mergePayload({ streams: streamIds });
		}

		if (collection === 'playlists') {
			const streamIds = uniq((extra.streams || []).map(String));
			return mergePayload({
				playlists: ids,
				streams: streamIds,
			});
		}

		if (collection === 'tracks') {
			const setIds = uniq((extra.set_ids || []).map(String));
			const playlistIds = uniq(await playlistIdsFromSets(setIds));
			return mergePayload({
				playlists: playlistIds,
				streams: await streamIdsFromPlaylists(playlistIds),
			});
		}

		if (collection === 'sets') {
			const playlistIds = uniq([
				...((extra.playlists || []).map(String)),
				...(await playlistIdsFromSets(ids)),
			]);
			return mergePayload({
				playlists: playlistIds,
				streams: await streamIdsFromPlaylists(playlistIds),
			});
		}

		return emptyPayload();
	};

	const readClientStatusMap = async (clientIds) => {
		clientIds = uniq(clientIds);
		if (!clientIds.length) return {};

		const rows = await readRowsByQuery('clients', {
			fields: ['id', 'status'],
			filter: { id: { _in: clientIds } },
		});

		const map = {};
		for (const row of rows) {
			const id = valueToId(row?.id);
			if (!id) continue;
			map[id] = String(row?.status || '');
		}

		return map;
	};

	const rememberMap = new Map();
	const preDeleteSnapshots = new Map();

	const rememberSet = (key, value, ttl = 30_000) => {
		rememberMap.set(key, value);
		setTimeout(() => rememberMap.delete(key), ttl);
	};

	const resolveEventIds = async (collection, payload, meta) => {
		const direct = uniq([
			...(Array.isArray(meta?.keys) ? meta.keys : []),
			...(meta?.key != null ? [meta.key] : []),
			...(Array.isArray(payload?.keys) ? payload.keys : []),
			...(payload?.key != null ? [payload.key] : []),
			...(Array.isArray(meta?.payload?.keys) ? meta.payload.keys : []),
			...(meta?.payload?.key != null ? [meta.payload.key] : []),
			...(Array.isArray(payload) ? payload.map((item) => valueToId(item?.id)).filter(Boolean) : []),
			...(payload?.id != null ? [payload.id] : []),
		]);
		if (direct.length) return direct;

		const filters = [
			meta?.query?.filter,
			meta?.filter,
			meta?.payload?.filter,
			payload?.filter,
			payload?._filter,
		].filter((value) => value && typeof value === 'object' && !Array.isArray(value));

		for (const queryFilter of filters) {
			const ids = await readIdsByQuery(collection, { filter: queryFilter });
			if (ids.length) return ids;
		}

		return [];
	};

	const markClientsState = async (clientIds, state, error = null) => {
		clientIds = uniq(clientIds);
		if (!clientIds.length) return;

		try {
			await database('clients')
				.whereIn('id', clientIds)
				.update({
					state,
					error,
					updated: sqlNow(),
				});
		} catch (updateError) {
			logger.warn({ clientIds, state, error: stringifyError(updateError) }, 'clients state update failed');
		}
	};

	filter('items.update', async (payload, meta) => {
		const collection = meta.collection;
		if (!WATCHED.includes(collection)) return payload;
		if (isOperationalClientUpdate(collection, payload, meta)) return payload;

		try {
			const ids = await resolveEventIds(collection, payload, meta);
			if (!ids.length) {
				logger.warn({ collection, meta }, 'preUpdate ids not resolved');
				return payload;
			}

			let extra = {};

			if (collection === 'tracks') {
				const rows = await readRowsByQuery('tracks', {
					fields: ['id', 'set'],
					filter: { id: { _in: ids } },
				});
				extra = { set_ids: uniq(rows.map((row) => valueToId(row?.set)).filter(Boolean)) };
			} else if (collection === 'sets') {
				const rows = await readRowsByQuery('sets', {
					fields: ['id', 'playlist'],
					filter: { id: { _in: ids } },
				});
				extra = { playlists: uniq(rows.map((row) => valueToId(row?.playlist)).filter(Boolean)) };
			} else if (collection === 'streams_playlists') {
				const rows = await readRowsByQuery('streams_playlists', {
					fields: ['id', 'streams_id'],
					filter: { id: { _in: ids } },
				});
				extra = { streams: uniq(rows.map((row) => valueToId(row?.streams_id)).filter(Boolean)) };
			} else if (collection === 'players') {
				const rows = await readRowsByQuery('players', {
					fields: ['id', 'client', 'code'],
					filter: { id: { _in: ids } },
				});
				extra = {
					clients: uniq(rows.map((row) => valueToId(row?.client)).filter(Boolean)),
					delete_player_routes: uniq(rows.map((row) => String(row?.code || '').trim().toLowerCase()).filter(Boolean)),
				};
			} else if (collection === 'ads') {
				const rows = await readRowsByQuery('ads', {
					fields: ['id', 'client'],
					filter: { id: { _in: ids } },
				});
				extra = { clients: uniq(rows.map((row) => valueToId(row?.client)).filter(Boolean)) };
			} else if (collection === 'schedules_players') {
				const rows = await readRowsByQuery('schedules_players', {
					fields: ['id', 'players_id'],
					filter: { id: { _in: ids } },
				});
				extra = { player_ids: uniq(rows.map((row) => valueToId(row?.players_id)).filter(Boolean)) };
			} else if (collection === 'playlists') {
				const rows = await readRowsByQuery('streams_playlists', {
					fields: ['streams_id'],
					filter: { playlists_id: { _in: ids } },
				});
				extra = { streams: uniq(rows.map((row) => valueToId(row?.streams_id)).filter(Boolean)) };
			}

			rememberSet(`${collection}:${ids.join(',')}`, { ids, extra });
		} catch (error) {
			logger.warn({ collection, error: stringifyError(error) }, 'preUpdate capture failed');
		}

		return payload;
	});

	filter('items.delete', async (keys, meta) => {
		const collection = meta.collection;
		if (!WATCHED.includes(collection)) return keys;

		const ids = uniq(Array.isArray(keys) ? keys : [keys]);

		try {
			let extra = {};

			if (collection === 'tracks') {
				const rows = await readRowsByQuery('tracks', {
					fields: ['id', 'set'],
					filter: { id: { _in: ids } },
				});
				extra = { set_ids: uniq(rows.map((row) => valueToId(row?.set)).filter(Boolean)) };
			} else if (collection === 'sets') {
				const rows = await readRowsByQuery('sets', {
					fields: ['id', 'playlist'],
					filter: { id: { _in: ids } },
				});
				extra = { playlists: uniq(rows.map((row) => valueToId(row?.playlist)).filter(Boolean)) };
			} else if (collection === 'streams_playlists') {
				const rows = await readRowsByQuery('streams_playlists', {
					fields: ['id', 'streams_id'],
					filter: { id: { _in: ids } },
				});
				extra = { streams: uniq(rows.map((row) => valueToId(row?.streams_id)).filter(Boolean)) };
			} else if (collection === 'players') {
				const rows = await readRowsByQuery('players', {
					fields: ['id', 'client', 'code'],
					filter: { id: { _in: ids } },
				});
				extra = {
					clients: uniq(rows.map((row) => valueToId(row?.client)).filter(Boolean)),
					delete_player_routes: uniq(rows.map((row) => String(row?.code || '').trim().toLowerCase()).filter(Boolean)),
				};
			} else if (collection === 'ads') {
				const rows = await readRowsByQuery('ads', {
					fields: ['id', 'client'],
					filter: { id: { _in: ids } },
				});
				extra = { clients: uniq(rows.map((row) => valueToId(row?.client)).filter(Boolean)) };
			} else if (collection === 'schedules_players') {
				const rows = await readRowsByQuery('schedules_players', {
					fields: ['id', 'players_id'],
					filter: { id: { _in: ids } },
				});
				extra = { player_ids: uniq(rows.map((row) => valueToId(row?.players_id)).filter(Boolean)) };
			} else if (collection === 'playlists') {
				const rows = await readRowsByQuery('streams_playlists', {
					fields: ['streams_id'],
					filter: { playlists_id: { _in: ids } },
				});
				extra = { streams: uniq(rows.map((row) => valueToId(row?.streams_id)).filter(Boolean)) };
			}

			rememberSet(`delete:${collection}:${ids.join(',')}`, { ids, extra });

			if (collection === 'clients') {
				const snapshots = {};
				for (const clientId of ids) snapshots[clientId] = await clientSnapshot(clientId);
				preDeleteSnapshots.set(ids.join(','), snapshots);
				setTimeout(() => preDeleteSnapshots.delete(ids.join(',')), 30_000);
			}
		} catch (error) {
			logger.warn({ collection, ids, error: stringifyError(error) }, 'preDelete capture failed');
		}

		return keys;
	});

	const resolveActionIds = async (collection, meta) => {
		const ids = await resolveEventIds(collection, meta?.payload, meta);
		if (ids.length) return ids;

		logger.warn({ collection, meta }, 'action ids not resolved');
		return [];
	};

	const callPhp = async (script, ids) => {
		ids = uniq(ids);
		if (!ids.length) return;

		const base = String(env.API_LOCAL_URL || '').replace(/\/+$/, '');
		const key = String(env.API_KEY || '');

		if (!base || !key) {
			throw new Error('API_LOCAL_URL or API_KEY is empty');
		}

		const response = await fetch(`${base}/${script}`, {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json',
				'X-Api-Key': key,
			},
			body: JSON.stringify({ ids }),
		});

		if (response.ok) return;

		const text = await response.text().catch(() => '');
		const error = new Error(`${script} failed with status ${response.status}${text ? `: ${text}` : ''}`);
		error.status = response.status;
		throw error;
	};

	const callDeletePhp = async (payload) => {
		payload = mergePayload(payload);

		const body = {
			clients: payload.delete_clients,
			players: payload.delete_players,
			player_routes: payload.delete_player_routes,
			devices: payload.delete_devices,
			streams: payload.delete_streams,
		};

		const hasWork = Object.values(body).some((value) => Array.isArray(value) && value.length > 0);
		if (!hasWork) return;

		const base = String(env.API_LOCAL_URL || '').replace(/\/+$/, '');
		const key = String(env.API_KEY || '');

		if (!base || !key) {
			throw new Error('API_LOCAL_URL or API_KEY is empty');
		}

		const response = await fetch(`${base}/delete-json.php`, {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json',
				'X-Api-Key': key,
			},
			body: JSON.stringify(body),
		});

		if (response.ok) return;

		const text = await response.text().catch(() => '');
		const error = new Error(`delete-json.php failed with status ${response.status}${text ? `: ${text}` : ''}`);
		error.status = response.status;
		throw error;
	};

	const runPayload = async (payload) => {
		payload = mergePayload(payload);
		const clientIds = payloadClientIds(payload);
		await callDeletePhp(payload);

		await callPhp('clients-json.php', clientIds);
		await callPhp('players-json.php', payload.players);
		await callPhp('streams-json.php', payload.streams);
		await callPhp('playlists-json.php', payload.playlists);
	};

	const processPayload = async (payload, source) => {
		payload = mergePayload(payload);
		if (!payloadHasWork(payload)) return;

		const clientIds = payloadClientIds(payload);
		await markClientsState(clientIds, 'pending', null);

		try {
			await runPayload(payload);
			logger.info({ source }, 'json sync succeeded');
		} catch (error) {
			await markClientsState(clientIds, 'error', stringifyError(error));
			logger.warn({ source, error: stringifyError(error) }, 'json sync failed');
			throw error;
		}
	};

	action('items.create', async (meta) => {
		const collection = meta.collection;
		if (!WATCHED.includes(collection)) return;

		const ids = await resolveActionIds(collection, meta);
		const payload = await buildPayloadForCollection(collection, ids);

		logger.info({ collection, ids }, 'json sync from create');
		await processPayload(payload, `${collection}.create`);
	});

	action('items.update', async (meta) => {
		const collection = meta.collection;
		if (!WATCHED.includes(collection)) return;
		if (isOperationalClientUpdate(collection, meta?.payload, meta)) return;

		const ids = await resolveActionIds(collection, meta);
		const key = `${collection}:${ids.join(',')}`;
		const remembered = rememberMap.get(key) || null;
		rememberMap.delete(key);

		const extra = remembered?.extra || {};

		if (collection === 'clients') {
			const statusMap = await readClientStatusMap(ids);
			const archivedClients = ids.filter((id) => statusMap[id] === 'archived');
			const activeClients = ids.filter((id) => statusMap[id] && statusMap[id] !== 'archived');

			const payload = await buildPayloadForCollection(collection, activeClients, {}, archivedClients);

			logger.info({ collection, ids }, 'json sync from update');
			await processPayload(payload, `${collection}.update`);
			return;
		}

		const payload = await buildPayloadForCollection(collection, ids, extra);
		logger.info({ collection, ids }, 'json sync from update');
		await processPayload(payload, `${collection}.update`);
	});

	action('items.delete', async (meta) => {
		const collection = meta.collection;
		if (!WATCHED.includes(collection)) return;

		const ids = await resolveActionIds(collection, meta);
		const key = `delete:${collection}:${ids.join(',')}`;
		const remembered = rememberMap.get(key) || null;
		rememberMap.delete(key);

		const extra = remembered?.extra || {};

		if (collection === 'clients') {
			const snapshots = preDeleteSnapshots.get(ids.join(',')) || {};
			preDeleteSnapshots.delete(ids.join(','));
			const payload = buildDeletePayloadFromSnapshot(ids, snapshots);

			logger.info({ collection, ids }, 'json sync from delete');
			await processPayload(payload, `${collection}.delete`);
			return;
		}

		const payload = await buildPayloadForCollection(collection, ids, extra);
		logger.info({ collection, ids }, 'json sync from delete');
		await processPayload(payload, `${collection}.delete`);
	});
});
