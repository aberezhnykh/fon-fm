import { defineEndpoint } from '@directus/extensions-sdk';
import Busboy from 'busboy';
import fs from 'node:fs';
import fsp from 'node:fs/promises';
import path from 'node:path';
import crypto from 'node:crypto';
import { pipeline } from 'node:stream/promises';

function extOf(name) {
	const i = name.lastIndexOf('.');
	return i === -1 ? '' : name.slice(i + 1).toLowerCase();
}

function stripExt(filename) {
	return String(filename || '').replace(/\.[^.]+$/, '');
}

function sourceKey(filename) {
	return stripExt(filename).trim();
}

function maybeDecodeLatin1Filename(name) {
	if (!name) return '';
	if (/[А-Яа-яЁё]/.test(name)) return name;

	if (/[ÐÑ]/.test(name)) {
		try {
			const decoded = Buffer.from(name, 'latin1').toString('utf8');
			return decoded || name;
		} catch {
			return name;
		}
	}

	return name;
}

function sanitizeFilename(name) {
	return path.posix.basename(String(name || ''));
}

function httpError(status, message) {
	const err = new Error(message);
	err.status = status;
	return err;
}

function makeUuid() {
	return crypto.randomUUID();
}

function bucketOfId(id) {
	return String(id || '').trim().toLowerCase()[0] || '0';
}

async function ensureDir(p) {
	await fsp.mkdir(p, { recursive: true });
}

async function safeUnlink(p) {
	try {
		await fsp.unlink(p);
	} catch {}
}

function isLikelyUniqueError(e) {
	const msg = String(e?.message || '').toLowerCase();
	return msg.includes('duplicate') || msg.includes('unique');
}

function clampInt(value, min, max, fallback) {
	const n = Number(value);
	if (!Number.isFinite(n)) return fallback;
	const i = Math.trunc(n);
	if (i < min) return min;
	if (i > max) return max;
	return i;
}

function hasColumn(columns, name) {
	return Boolean(name && columns && Object.prototype.hasOwnProperty.call(columns, name));
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

export default defineEndpoint((router, context) => {
	const { services, database, getSchema } = context;
	const { ItemsService } = services;

	const MEDIA_ROOT = '/cdn/media';
	const API_LOCAL_URL = process.env.API_LOCAL_URL || 'http://api.local';
	const API_KEY = process.env.API_KEY || '';
	let setColumnsCache = null;

	async function getSetColumns() {
		if (setColumnsCache) return setColumnsCache;
		setColumnsCache = await database('sets').columnInfo();
		return setColumnsCache;
	}

	async function readUploadLimits() {
		const defaultMaxFiles = 100;
		const defaultMaxFileMb = 10;

		try {
			const row = await database('settings').first('upload_tracks_max_files', 'upload_max_file_mb');
			const tracksMaxFiles = clampInt(row?.upload_tracks_max_files, 1, 500, defaultMaxFiles);
			const maxFileMb = clampInt(row?.upload_max_file_mb, 1, 4096, defaultMaxFileMb);

			return {
				tracksMaxFiles,
				maxFileMb,
				maxFileBytes: maxFileMb * 1024 * 1024,
			};
		} catch {
			return {
				tracksMaxFiles: defaultMaxFiles,
				maxFileMb: defaultMaxFileMb,
				maxFileBytes: defaultMaxFileMb * 1024 * 1024,
			};
		}
	}

	function kick(script, body) {
		if (!API_KEY || !body || typeof body !== 'object') return false;

		let url;
		try {
			url = new URL(`/${script}`, API_LOCAL_URL).toString();
		} catch {
			return false;
		}

		const controller = new AbortController();
		const t = setTimeout(() => controller.abort(), 1500);

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
			.finally(() => clearTimeout(t));

		return true;
	}

	function mediaPaths(kind, id) {
		const fileName = `${id}.mp3`;
		const bucket = bucketOfId(id);
		const dir = path.join(MEDIA_ROOT, kind, bucket);
		const mp3Path = path.join(dir, fileName);
		return { dir, mp3Path };
	}

	router.post('/tracks', async (req, res, next) => {
		const { tracksMaxFiles, maxFileMb, maxFileBytes } = await readUploadLimits();
		const schema = await getSchema();
		const accountability = req.accountability;
		const setColumns = await getSetColumns();

		const setsService = new ItemsService('sets', { schema, accountability });
		const tracksService = new ItemsService('tracks', { schema, accountability });

		let setId = '';
		const seenInRequest = new Set();

		let receivedFiles = 0;
		let ignoredByLimit = 0;
		let skippedBadExt = 0;
		let skippedDupInRequest = 0;
		let skippedExists = 0;
		let skippedOversize = 0;

		const created = [];
		let createdCount = 0;

		const busboy = Busboy({
			headers: req.headers,
			limits: {
				fileSize: maxFileBytes,
				fields: 20,
				parts: 10000,
			},
		});

		const tasks = [];
		let fatal = null;
		const fail = (e) => {
			if (!fatal) fatal = e;
		};

		busboy.on('fieldsLimit', () => fail(httpError(400, 'Слишком много полей формы')));
		busboy.on('partsLimit', () => fail(httpError(400, 'Слишком много частей формы')));

		busboy.on('field', (name, val) => {
			const v = String(val || '').trim();
			if (name === 'set' || name === 'set_id') setId = v;
		});

		busboy.on('file', (fieldname, fileStream, info) => {
			if (fieldname !== 'files') {
				fileStream.resume();
				return;
			}

			receivedFiles += 1;

			if (receivedFiles > tracksMaxFiles) {
				ignoredByLimit += 1;
				fileStream.resume();
				return;
			}

			let tooBig = false;
			fileStream.on('limit', () => {
				tooBig = true;
			});

			const rawFilename = info?.filename ?? '';
			const originalName = sanitizeFilename(maybeDecodeLatin1Filename(rawFilename));
			const source = sourceKey(originalName);

			const p = (async () => {
				if (!setId) {
					fileStream.resume();
					throw httpError(400, 'Сначала нужно указать идентификатор сета');
				}

				await setsService.readOne(setId, { fields: ['id'] });

				if (extOf(originalName) !== 'mp3') {
					skippedBadExt += 1;
					fileStream.resume();
					return;
				}

				if (seenInRequest.has(source)) {
					skippedDupInRequest += 1;
					fileStream.resume();
					return;
				}
				seenInRequest.add(source);

				const exists = await database('tracks').first('id').where({ source });
				if (exists?.id) {
					skippedExists += 1;
					fileStream.resume();
					return;
				}

				const trackId = makeUuid();
				const { dir, mp3Path } = mediaPaths('tracks', trackId);

				await ensureDir(dir);

				const ws = fs.createWriteStream(mp3Path, { flags: 'wx' });

				try {
					await pipeline(fileStream, ws);
				} catch (e) {
					await safeUnlink(mp3Path);
					throw e;
				}

				if (tooBig) {
					await safeUnlink(mp3Path);
					skippedOversize += 1;
					return;
				}

				try {
					await tracksService.createOne({
						id: trackId,
						set: setId,
						source,
						state: 'pending',
						duration: null,
						gain: null,
						error: null,
					});
				} catch (e) {
					if (isLikelyUniqueError(e)) {
						skippedExists += 1;
					} else {
						throw e;
					}

					try {
						await tracksService.deleteOne(trackId);
					} catch {}

					await safeUnlink(mp3Path);
					return;
				}

				createdCount += 1;
				created.push({ track_id: trackId });
			})();

			p.catch(fail);
			tasks.push(p);
		});

		busboy.on('error', (e) => fail(e));
		req.on('error', (e) => fail(e));
		req.on('aborted', () => fail(httpError(499, 'Загрузка была прервана')));

		busboy.on('finish', async () => {
			try {
				await Promise.allSettled(tasks);
				if (fatal) throw fatal;
				if (receivedFiles === 0) throw httpError(400, 'Файл обязателен');

				const createdIds = created.map((x) => x.track_id);
				let processingKicked = false;
				if (createdIds.length) {
					const patch = buildSetRuntimePatch(setColumns, {
						state: 'pending',
						error: null,
						start: nowDbDateTime(),
					});
					if (Object.keys(patch).length) await setsService.updateOne(setId, patch);
					processingKicked = kick('tracks-media.php', { set_id: setId });
				}

				const warnings = [];
				if (ignoredByLimit > 0) {
					warnings.push(`Лимит ${tracksMaxFiles} файлов: проигнорировано ${ignoredByLimit}`);
				}
				if (skippedOversize > 0) {
					warnings.push(`Файлы больше ${maxFileMb} MB: пропущено ${skippedOversize}`);
				}

				res.json({
					ok: true,
					set_id: setId,
					processing_kicked: processingKicked,
					limits: { tracksMaxFiles, maxFileMb },
					received_files: receivedFiles,
					created_count: createdCount,
					created,
					skipped: {
						ignored_by_limit: ignoredByLimit,
						exists: skippedExists,
						duplicate_in_request: skippedDupInRequest,
						bad_ext: skippedBadExt,
						oversize: skippedOversize,
					},
					warnings: warnings.length ? warnings : undefined,
				});
			} catch (e) {
				next(e);
			}
		});

		req.pipe(busboy);
	});

	router.post('/ads', async (req, res, next) => {
		const { maxFileMb, maxFileBytes } = await readUploadLimits();
		const schema = await getSchema();
		const accountability = req.accountability;

		const adsService = new ItemsService('ads', { schema, accountability });

		let fileCount = 0;
		let providedTitle = '';

		let createdAdId = null;
		let createdMp3Path = null;

		const busboy = Busboy({
			headers: req.headers,
			limits: {
				files: 1,
				fileSize: maxFileBytes,
				fields: 20,
				parts: 50,
			},
		});

		const tasks = [];
		let fatal = null;
		const fail = (e) => {
			if (!fatal) fatal = e;
		};

		busboy.on('filesLimit', () => fail(httpError(400, 'В рекламу можно загрузить только один файл')));
		busboy.on('fieldsLimit', () => fail(httpError(400, 'Слишком много полей формы')));
		busboy.on('partsLimit', () => fail(httpError(400, 'Слишком много частей формы')));

		busboy.on('field', (name, val) => {
			if (name === 'title') providedTitle = String(val || '').trim();
		});

		busboy.on('file', (fieldname, fileStream, info) => {
			if (fieldname !== 'files') {
				fileStream.resume();
				return;
			}

			let tooBig = false;
			fileStream.on('limit', () => {
				tooBig = true;
			});

			fileCount += 1;

			const rawFilename = info?.filename ?? '';
			const originalName = sanitizeFilename(maybeDecodeLatin1Filename(rawFilename));
			const source = sourceKey(originalName);

			const p = (async () => {
				if (fileCount > 1) {
					fileStream.resume();
					throw httpError(400, 'В рекламу можно загрузить только один файл');
				}

				if (extOf(originalName) !== 'mp3') {
					fileStream.resume();
					throw httpError(400, 'Разрешён только mp3');
				}

				const adId = makeUuid();
				const { dir, mp3Path } = mediaPaths('ads', adId);

				await ensureDir(dir);

				const ws = fs.createWriteStream(mp3Path, { flags: 'wx' });
				try {
					await pipeline(fileStream, ws);
				} catch (e) {
					await safeUnlink(mp3Path);
					throw e;
				}

				if (tooBig) {
					await safeUnlink(mp3Path);
					throw httpError(413, `Файл слишком большой. Лимит: ${maxFileMb} MB`);
				}

				createdMp3Path = mp3Path;

				const title = providedTitle || source;

				try {
					await adsService.createOne({
						id: adId,
						title,
						source,
						duration: null,
						gain: null,
						error: null,
					});
					createdAdId = adId;
				} catch (e) {
					await safeUnlink(mp3Path);
					throw e;
				}

				return { ad_id: createdAdId };
			})();

			p.catch(fail);
			tasks.push(p);
		});

		busboy.on('error', (e) => fail(e));
		req.on('error', (e) => fail(e));
		req.on('aborted', () => fail(httpError(499, 'Загрузка была прервана')));

		busboy.on('finish', async () => {
			try {
				const results = await Promise.allSettled(tasks);

				if (fatal) throw fatal;
				if (!createdAdId) throw httpError(400, 'Файл обязателен');

				kick('ads-media.php', [createdAdId]);

				const ok = results.find((r) => r.status === 'fulfilled')?.value;
				res.json({ ok: true, ...ok, ad_id: createdAdId, limits: { maxFileMb } });
			} catch (e) {
				try {
					if (createdAdId) await adsService.deleteOne(createdAdId);
				} catch {}

				if (createdMp3Path) await safeUnlink(createdMp3Path);
				next(e);
			}
		});

		req.pipe(busboy);
	});
});
