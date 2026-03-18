const TARGETS = new Set(['ads', 'players', 'streams', 'schedules']);

export default {
	id: 'manage',
	handler: (router, { services, getSchema }) => {
		const { ItemsService } = services;

		router.get('/', (_req, res) => {
			res.setHeader('Cache-Control', 'no-store');
			res.status(200).send('manage: ok');
		});

		router.get('/:clientId/:target', async (req, res, next) => {
			try {
				const userId = req.accountability?.user;
				if (!userId) {
					res.setHeader('Cache-Control', 'no-store');
					return res.status(403).send('Forbidden');
				}

				const { clientId, target } = req.params;

				if (!TARGETS.has(target)) {
					res.setHeader('Cache-Control', 'no-store');
					return res.status(400).send('Invalid target');
				}

				if (!clientId || typeof clientId !== 'string') {
					res.setHeader('Cache-Control', 'no-store');
					return res.status(400).send('Invalid clientId');
				}

				const users = new ItemsService('directus_users', {
					schema: await getSchema(),
					accountability: req.accountability,
				});

				await users.updateOne(userId, { client_active: clientId });

				res.setHeader('Cache-Control', 'no-store');
				return res.redirect(302, `/admin/content/${target}`);
			} catch (err) {
				return next(err);
			}
		});
	},
};