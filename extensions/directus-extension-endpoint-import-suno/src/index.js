import crypto from 'node:crypto';
import { defineEndpoint } from '@directus/extensions-sdk';

function httpError(status, message) {
	const err = new Error(message);
	err.status = status;
	return err;
}

function normalizeText(value) {
	return String(value ?? '').trim();
}

function toNullableText(value) {
	const text = normalizeText(value);
	return text || null;
}

function normalizeDuration(value) {
	const num = Number(value);
	if (!Number.isFinite(num) || num <= 0) return null;
	return Math.round(num);
}

function normalizeDbDateTime(value) {
	const text = normalizeText(value);
	if (!text) return null;

	const date = new Date(text);
	if (Number.isNaN(date.getTime())) return null;

	const pad = (num) => String(num).padStart(2, '0');

	return [
		date.getUTCFullYear(),
		pad(date.getUTCMonth() + 1),
		pad(date.getUTCDate()),
	].join('-') + ' ' + [
		pad(date.getUTCHours()),
		pad(date.getUTCMinutes()),
		pad(date.getUTCSeconds()),
	].join(':');
}

function hasColumn(columns, name) {
	return Boolean(name && columns && Object.prototype.hasOwnProperty.call(columns, name));
}

function firstExistingColumn(columns, names) {
	for (const name of names) {
		if (hasColumn(columns, name)) return name;
	}
	return null;
}

function buildSetRuntimePatch(setColumns, values) {
	const payload = {};
	for (const [key, value] of Object.entries(values || {})) {
		if (!hasColumn(setColumns, key)) continue;
		payload[key] = value;
	}
	return payload;
}

function nowDbDateTime() {
	const date = new Date();
	const pad = (num) => String(num).padStart(2, '0');

	return [
		date.getUTCFullYear(),
		pad(date.getUTCMonth() + 1),
		pad(date.getUTCDate()),
	].join('-') + ' ' + [
		pad(date.getUTCHours()),
		pad(date.getUTCMinutes()),
		pad(date.getUTCSeconds()),
	].join(':');
}

function pickSetInsertPayload(setId, setDraft, setColumns) {
	const draft = setDraft && typeof setDraft === 'object' ? setDraft : {};
	const payload = { id: setId };

	const title = toNullableText(draft?.title);
	const description = toNullableText(draft?.description);
	const playlist = toNullableText(draft?.playlist);
	const url = toNullableText(draft?.url);
	const library = toNullableText(draft?.library);
	const status = toNullableText(draft?.status) || 'inactive';
	const state = toNullableText(draft?.state) || 'pending';
	const sort = Number.isFinite(Number(draft?.sort)) ? Math.trunc(Number(draft.sort)) : 1;

	if (hasColumn(setColumns, 'title')) payload.title = title;
	if (hasColumn(setColumns, 'description')) payload.description = description;
	if (hasColumn(setColumns, 'playlist')) payload.playlist = playlist;
	if (hasColumn(setColumns, 'url')) payload.url = url;
	if (hasColumn(setColumns, 'library')) payload.library = library;
	if (hasColumn(setColumns, 'status')) payload.status = status;
	if (hasColumn(setColumns, 'state')) payload.state = state;
	if (hasColumn(setColumns, 'error')) payload.error = null;
	if (hasColumn(setColumns, 'start')) payload.start = null;
	if (hasColumn(setColumns, 'sort')) payload.sort = sort;

	return payload;
}

function buildPlaylistUrl(playlistId) {
	return `https://suno.com/playlist/${playlistId}`;
}

function chunk(arr, size) {
	const out = [];
	for (let i = 0; i < arr.length; i += size) out.push(arr.slice(i, i + size));
	return out;
}

function isLikelyUniqueError(error) {
	const msg = String(error?.message || '').toLowerCase();
	return msg.includes('duplicate') || msg.includes('unique');
}

function parsePlaylistId(value) {
	const raw = normalizeText(value);
	if (!raw) throw httpError(400, 'Нужен playlist URL или playlist ID');

	if (/^[0-9a-f-]{36}$/i.test(raw)) return raw.toLowerCase();

	let url;
	try {
		url = new URL(raw);
	} catch {
		throw httpError(400, 'Неверный SUNO playlist URL');
	}

	const match = url.pathname.match(/\/(?:api\/)?playlist\/([0-9a-f-]{36})\/?$/i);
	if (!match) throw httpError(400, 'Не удалось извлечь playlist ID из URL');
	return String(match[1]).toLowerCase();
}

async function fetchJson(url, { timeoutMs = 30000 } = {}) {
	const controller = new AbortController();
	const timer = setTimeout(() => controller.abort(), timeoutMs);

	try {
		const response = await fetch(url, {
			method: 'GET',
			headers: { Accept: 'application/json' },
			signal: controller.signal,
		});

		if (!response.ok) {
			throw httpError(response.status || 502, `SUNO API вернул ${response.status}`);
		}

		return await response.json();
	} catch (error) {
		if (error?.name === 'AbortError') {
			throw httpError(504, 'SUNO API не ответил вовремя');
		}

		if (error?.status) throw error;
		throw httpError(502, `Ошибка запроса к SUNO API: ${error?.message || error}`);
	} finally {
		clearTimeout(timer);
	}
}

function collectPlaylistClips(payload) {
	const playlistClips = Array.isArray(payload?.playlist_clips) ? payload.playlist_clips : [];
	return playlistClips
		.map((row) => row?.clip ?? null)
		.filter(Boolean);
}

async function fetchPlaylistPages(playlistId) {
	const clips = [];
	const seen = new Set();
	let playlist = null;
	let page = 1;
	let fetchedPages = 0;

	while (page <= 100) {
		const url = `https://studio-api.prod.suno.com/api/playlist/${playlistId}/?page=${page}`;
		const payload = await fetchJson(url);
		fetchedPages += 1;

		if (!playlist) {
			playlist = {
				id: normalizeText(payload?.id) || playlistId,
				name: normalizeText(payload?.name),
			};
		}

		const pageClips = collectPlaylistClips(payload);
		if (pageClips.length === 0) break;

		let addedOnPage = 0;
		for (const clip of pageClips) {
			const clipId = normalizeText(clip?.id);
			if (!clipId || seen.has(clipId)) continue;
			seen.add(clipId);
			clips.push(clip);
			addedOnPage += 1;
		}

		if (addedOnPage === 0) break;
		page += 1;
	}

	if (!playlist?.id) throw httpError(404, 'SUNO playlist не найден');

	return { playlist, clips, pagesFetched: fetchedPages };
}

function buildTrackPayload(trackId, setId, clip, trackColumns) {
	const payload = {
		id: trackId,
		set: setId,
		source: normalizeText(clip?.id),
		gain: null,
		error: null,
	};

	if (hasColumn(trackColumns, 'state')) payload.state = 'pending';
	if (hasColumn(trackColumns, 'url')) payload.url = toNullableText(clip?.audio_url);
	if (hasColumn(trackColumns, 'title')) payload.title = toNullableText(clip?.title);
	if (hasColumn(trackColumns, 'duration')) payload.duration = normalizeDuration(clip?.metadata?.duration);
	if (hasColumn(trackColumns, 'created')) payload.created = normalizeDbDateTime(clip?.created_at);

	const authorColumn = firstExistingColumn(trackColumns, ['author', 'autor', 'artist']);
	if (authorColumn) payload[authorColumn] = toNullableText(clip?.display_name);

	return payload;
}

function buildTrackUpdatePayload(setId, clip, trackColumns, options = {}) {
	const payload = {
		set: setId,
		gain: null,
		error: null,
	};

	if (hasColumn(trackColumns, 'state')) {
		payload.state = normalizeText(options?.state) || 'pending';
	}
	if (hasColumn(trackColumns, 'url')) payload.url = toNullableText(clip?.audio_url);
	if (hasColumn(trackColumns, 'title')) payload.title = toNullableText(clip?.title);
	if (hasColumn(trackColumns, 'duration')) payload.duration = normalizeDuration(clip?.metadata?.duration);
	if (hasColumn(trackColumns, 'created')) payload.created = normalizeDbDateTime(clip?.created_at);

	const authorColumn = firstExistingColumn(trackColumns, ['author', 'autor', 'artist']);
	if (authorColumn) payload[authorColumn] = toNullableText(clip?.display_name);

	return payload;
}

async function inspectPlaylistForImport(database, playlistId) {
	const { playlist, clips, pagesFetched } = await fetchPlaylistPages(playlistId);

	const totalFound = clips.length;
	const remixable = [];
	let skippedNoRemix = 0;
	let skippedNoAudio = 0;
	let skippedNoSource = 0;
	let skippedExplicit = 0;

	for (const clip of clips) {
		if (clip?.explicit === true) {
			skippedExplicit += 1;
			continue;
		}

		const canRemix = clip?.metadata?.can_remix === true;
		if (!canRemix) {
			skippedNoRemix += 1;
			continue;
		}

		const source = normalizeText(clip?.id);
		const audioUrl = normalizeText(clip?.audio_url);

		if (!source) {
			skippedNoSource += 1;
			continue;
		}

		if (!audioUrl) {
			skippedNoAudio += 1;
			continue;
		}

		remixable.push({ clip, source, audioUrl });
	}

	const sourceIds = remixable.map((item) => item.source);
	const existingRows = new Map();
	const setRows = new Map();

	for (const sourceChunk of chunk(sourceIds, 200)) {
		if (sourceChunk.length === 0) continue;
		const rows = await database('tracks').select('id', 'source', 'created', 'state').whereIn('source', sourceChunk);
		for (const row of rows) {
			const source = normalizeText(row?.source);
			if (source) existingRows.set(source, row);
		}
	}

	let duplicateInPlaylist = 0;
	let exists = 0;
	let updates = 0;
	const importable = [];
	const metadataOnly = [];
	const seenInPlaylist = new Set();

	for (const item of remixable) {
		if (seenInPlaylist.has(item.source)) {
			duplicateInPlaylist += 1;
			continue;
		}
		seenInPlaylist.add(item.source);

		const existing = existingRows.get(item.source);
		const shouldRefresh = Boolean(existing?.id) && normalizeText(existing?.state).toLowerCase() !== 'done';

		if (existing?.id && !shouldRefresh) {
			exists += 1;
			metadataOnly.push({
				...item,
				mode: 'metadata',
				track_id: normalizeText(existing?.id) || null,
			});
			continue;
		}

		if (existing?.id) updates += 1;
		importable.push({
			...item,
			mode: existing?.id ? 'update' : 'create',
			track_id: normalizeText(existing?.id) || null,
		});
	}

	const warnings = [];
	if (skippedExplicit) warnings.push(`Пропущено explicit: ${skippedExplicit}.`);
	if (skippedNoRemix) warnings.push(`Пропущено без права remix: ${skippedNoRemix}.`);
	if (skippedNoAudio) warnings.push(`Пропущено без audio_url: ${skippedNoAudio}.`);
	if (skippedNoSource) warnings.push(`Пропущено без clip.id: ${skippedNoSource}.`);
	if (duplicateInPlaylist) warnings.push(`Пропущено дублей в плейлисте: ${duplicateInPlaylist}.`);
	if (exists) warnings.push(`Уже существовали в tracks: ${exists}.`);
	if (updates) warnings.push(`Будут обновлены: ${updates}.`);

	return {
		playlist,
		pagesFetched,
		totalFound,
		remixable,
		importable,
		metadataOnly,
		findToDeactivate: async (setId) => {
			const normalizedSetId = normalizeText(setId);
			if (!normalizedSetId) return [];
			if (!setRows.has(normalizedSetId)) {
				const rows = await database('tracks')
					.select('id', 'source', 'status')
					.where({ set: normalizedSetId });
				setRows.set(normalizedSetId, rows);
			}

			const rows = setRows.get(normalizedSetId) || [];
			const playlistSources = new Set(seenInPlaylist);
			return rows.filter((row) => {
				const source = normalizeText(row?.source);
				const status = normalizeText(row?.status).toLowerCase();
				if (!source) return false;
				if (playlistSources.has(source)) return false;
				return status !== 'inactive';
			});
		},
		skipped: {
			explicit: skippedExplicit,
			no_remix: skippedNoRemix,
			no_audio: skippedNoAudio,
			no_source: skippedNoSource,
			duplicate_in_playlist: duplicateInPlaylist,
			exists,
			updates,
		},
		warnings,
	};
}

export default defineEndpoint({
	id: 'import-suno',
	handler: (router, context) => {
		const { database, services, getSchema } = context;
		const { ItemsService } = services;
		const logger = context.logger;

		const API_LOCAL_URL = process.env.API_LOCAL_URL || 'http://api.local';
		const API_KEY = process.env.API_KEY || '';
		let trackColumnsCache = null;
		let setColumnsCache = null;

		async function getTrackColumns() {
			if (trackColumnsCache) return trackColumnsCache;
			trackColumnsCache = await database('tracks').columnInfo();
			return trackColumnsCache;
		}

		async function getSetColumns() {
			if (setColumnsCache) return setColumnsCache;
			setColumnsCache = await database('sets').columnInfo();
			return setColumnsCache;
		}

		async function makeItemsService(collection) {
			const schema = await getSchema();
			return new ItemsService(collection, {
				knex: database,
				schema,
				accountability: null,
			});
		}

		function kick(script, body) {
			if (!API_KEY) return false;

			let url;
			try {
				url = new URL(`/${script}`, API_LOCAL_URL).toString();
			} catch {
				return false;
			}

			const controller = new AbortController();
			const timer = setTimeout(() => controller.abort(), 1500);

			fetch(url, {
				method: 'POST',
				headers: {
					'Content-Type': 'application/json',
					'X-Api-Key': API_KEY,
				},
				body: JSON.stringify(body),
				signal: controller.signal,
			})
				.catch(() => {})
				.finally(() => clearTimeout(timer));

			return true;
		}

	router.post('/preview', async (req, res, next) => {
		try {
			const playlistInput = normalizeText(req.body?.playlist_url ?? req.body?.playlist_id);
			const playlistId = parsePlaylistId(playlistInput);
			const inspected = await inspectPlaylistForImport(database, playlistId);
			const setId = normalizeText(req.body?.set ?? req.body?.set_id);
			const toDeactivate = await inspected.findToDeactivate(setId);

			res.json({
				ok: true,
				playlist: {
					id: inspected.playlist.id,
					name: inspected.playlist.name || null,
					pages_fetched: inspected.pagesFetched,
				},
				found_clips: inspected.totalFound,
				will_create_count: inspected.importable.length,
				will_deactivate_count: toDeactivate.length,
				skipped: inspected.skipped,
				warnings: inspected.warnings.length ? inspected.warnings : undefined,
			});
		} catch (error) {
			logger.error(
				{
					message: error?.message,
					status: error?.status,
					code: error?.code,
					stack: error?.stack,
				},
				'[import-suno] preview failed'
			);
			next(error);
		}
	});

	router.post('/import', async (req, res, next) => {
		try {
			logger.info({ url: req.originalUrl, has_body: !!req.body }, '[import-suno] request accepted');

			const setId = normalizeText(req.body?.set ?? req.body?.set_id);
			const playlistInput = normalizeText(req.body?.playlist_url ?? req.body?.playlist_id);
			const setDraft = req.body?.set_draft;
			const setsService = await makeItemsService('sets');
			const tracksService = await makeItemsService('tracks');
			const setColumns = await getSetColumns();

			if (!setId || setId === '+') throw httpError(400, 'Сначала сохрани сет, затем запускай импорт.');

			const playlistId = parsePlaylistId(playlistInput);
			const playlistUrl = buildPlaylistUrl(playlistId);
			let set = await database('sets').first('id', 'title', 'source').where({ id: setId });
			if (!set?.id) {
				await setsService.createOne(pickSetInsertPayload(setId, setDraft, setColumns));
				set = await database('sets').first('id', 'title', 'source').where({ id: setId });
			}
			if (!set?.id) throw httpError(400, 'Не удалось создать сет для импорта.');
			const inspected = await inspectPlaylistForImport(database, playlistId);
			const { playlist, pagesFetched } = inspected;
			const totalFound = inspected.totalFound;
			const toDeactivate = await inspected.findToDeactivate(setId);
			const startedAt = nowDbDateTime();

			let updatedSetSource = false;
			let updatedSetTitle = false;
			let updatedSetUrl = false;
			const setPatch = {};
			if (!normalizeText(set?.source) && playlist.id) {
				setPatch.source = playlist.id;
				updatedSetSource = true;
			}
			if (!normalizeText(set?.title) && playlist.name) {
				setPatch.title = playlist.name;
				updatedSetTitle = true;
			}
			if (playlistUrl) {
				setPatch.url = playlistUrl;
				updatedSetUrl = true;
			}
			if (hasColumn(setColumns, 'start')) {
				setPatch.start = startedAt;
			}
			if (Object.keys(setPatch).length > 0) {
				await setsService.updateOne(setId, setPatch);
			}

			const created = [];
			const trackColumns = await getTrackColumns();
			const hasTrackStatus = hasColumn(trackColumns, 'status');
			let skippedExists = inspected.skipped.exists;
			let updatedCount = 0;
			let metadataUpdatedCount = 0;
			let deactivatedCount = 0;

			if (hasTrackStatus) {
				for (const row of toDeactivate) {
					const trackId = normalizeText(row?.id);
					if (!trackId) continue;
					await tracksService.updateOne(trackId, { status: 'inactive' });
					deactivatedCount += 1;
				}
			}

			for (const item of inspected.metadataOnly) {
				if (!item.track_id) continue;
				await tracksService.updateOne(
					item.track_id,
					buildTrackUpdatePayload(setId, item.clip, trackColumns, { state: 'done' })
				);
				metadataUpdatedCount += 1;
			}

			for (const item of inspected.importable) {
				try {
					const trackId = item.mode === 'update' && item.track_id
						? item.track_id
						: crypto.randomUUID();

					if (item.mode === 'update' && item.track_id) {
						await tracksService.updateOne(
							trackId,
							buildTrackUpdatePayload(setId, item.clip, trackColumns, { state: 'pending' })
						);
						updatedCount += 1;
					} else {
						await tracksService.createOne(buildTrackPayload(trackId, setId, item.clip, trackColumns));
					}

					created.push({
						id: trackId,
						source: item.source,
						audio_url: item.audioUrl,
					});
				} catch (error) {
					if (isLikelyUniqueError(error)) {
						skippedExists += 1;
						continue;
					}
					throw error;
				}
			}

			let processingKicked = false;
			if (created.length) {
				const patch = buildSetRuntimePatch(setColumns, {
					state: 'pending',
					error: null,
				});
				if (Object.keys(patch).length) await setsService.updateOne(setId, patch);
				processingKicked = kick('tracks-suno-media.php', { set_id: setId });
			} else {
				const patch = buildSetRuntimePatch(setColumns, {
					state: 'done',
					error: null,
				});
				if (Object.keys(patch).length) await setsService.updateOne(setId, patch);
			}

			const warnings = [];
			if (inspected.skipped.explicit) warnings.push(`Пропущено explicit: ${inspected.skipped.explicit}.`);
			if (inspected.skipped.no_remix) warnings.push(`Пропущено без права remix: ${inspected.skipped.no_remix}.`);
			if (inspected.skipped.no_audio) warnings.push(`Пропущено без audio_url: ${inspected.skipped.no_audio}.`);
			if (inspected.skipped.no_source) warnings.push(`Пропущено без clip.id: ${inspected.skipped.no_source}.`);
			if (inspected.skipped.duplicate_in_playlist) warnings.push(`Пропущено дублей в плейлисте: ${inspected.skipped.duplicate_in_playlist}.`);
			if (skippedExists) warnings.push(`Уже существовали в tracks: ${skippedExists}.`);
			if (updatedCount) warnings.push(`Обновлено существующих tracks: ${updatedCount}.`);
			if (metadataUpdatedCount) warnings.push(`Синхронизировано метаданных: ${metadataUpdatedCount}.`);
			if (deactivatedCount) warnings.push(`Деактивировано tracks: ${deactivatedCount}.`);

			res.json({
				ok: true,
				set_id: setId,
				playlist: {
					id: playlist.id,
					name: playlist.name || null,
					pages_fetched: pagesFetched,
				},
				set_updated: {
					source: updatedSetSource,
					title: updatedSetTitle,
					url: updatedSetUrl,
				},
				found_clips: totalFound,
				will_create_count: created.length,
				created_count: created.length,
				updated_count: updatedCount,
				metadata_updated_count: metadataUpdatedCount,
				deactivated_count: deactivatedCount,
				created_ids: created.map((row) => row.id),
				processing_kicked: processingKicked,
				skipped: {
					explicit: inspected.skipped.explicit,
					no_remix: inspected.skipped.no_remix,
					no_audio: inspected.skipped.no_audio,
					no_source: inspected.skipped.no_source,
					duplicate_in_playlist: inspected.skipped.duplicate_in_playlist,
					exists: skippedExists,
					updates: updatedCount,
					deactivated: deactivatedCount,
				},
				warnings: warnings.length ? warnings : undefined,
			});
		} catch (error) {
			logger.error(
				{
					message: error?.message,
					status: error?.status,
					code: error?.code,
					stack: error?.stack,
				},
				'[import-suno] request failed'
			);
			next(error);
		}
		});
	},
});
