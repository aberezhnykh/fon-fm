    const PLAYER_BASE_URL = "https://play.fon.fm/meta";
    const NEXT_BASE_URL = "https://play.fon.fm/next";
    const CLAIM_BASE_URL = "https://play.fon.fm/claim";
    const HISTORY_BASE_URL = "https://play.fon.fm/history";
    const PREFETCH_SECONDS = 10;
    const FRONTEND_SETTINGS = <?= json_encode($playerFrontendSettings ?? [], JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES) ?>;
    const SETTINGS_MESSAGES = FRONTEND_SETTINGS.messages || {};
    const SETTINGS_CHECKS = FRONTEND_SETTINGS.checks || {};
    const SETTINGS_RETRY = FRONTEND_SETTINGS.retry || {};
    const PAUSE_RETRY_DELAY = numberSetting(SETTINGS_RETRY.pause_ms, 300000);
    const TRACK_FADE_MS = 650;
    const STOP_FADE_MS = 3000;
    const HISTORY_LOG_DELAY_MS = 15000;
    const FETCH_TIMEOUT_MS = numberSetting(SETTINGS_CHECKS.fetch_timeout_ms, 8000);
    const CONNECTIVITY_CHECK_URL = stringSetting(SETTINGS_CHECKS.connectivity_url, "https://radiosparx.ru/img/logo-dark.svg");
    const CONNECTIVITY_CHECK_TIMEOUT_MS = numberSetting(SETTINGS_CHECKS.connectivity_timeout_ms, 5000);
    const DEVICE_STORAGE_KEY = "fonfm_device";
    const PLAYER_CODE_STORAGE_KEY = "fonfm_player_code";
    const AUTOSTART_STORAGE_KEY = "fonfm_autostart_after_reload";
    const UPDATED_STORAGE_KEY = "fonfm_updated_after_reload";
    const INTERNET_CHECK_TEXT = stringSetting(SETTINGS_MESSAGES.offline, "");
    const SERVER_WAIT_TEXT = stringSetting(SETTINGS_MESSAGES.server_wait, "");
    const IDLE_TEXT = stringSetting(SETTINGS_MESSAGES.idle, "");
    const BLOCKED_TEXT = stringSetting(SETTINGS_MESSAGES.blocked, "");
    const IDLE_STREAM_TEXT = stringSetting(SETTINGS_MESSAGES.idle_stream, "");
    const PLAYER_REQUIRED_TEXT = stringSetting(SETTINGS_MESSAGES.player_required, "");
    const COPY_HINT_TEXT = stringSetting(SETTINGS_MESSAGES.copy_hint, "");
    const COPY_DONE_TEXT = stringSetting(SETTINGS_MESSAGES.copy_done, "");
    const CLAIM_BUSY_TEXT = stringSetting(SETTINGS_MESSAGES.device_busy, "");
    const PLAYER_UPDATED_TEXT = stringSetting(SETTINGS_MESSAGES.player_updated, "");
    const PLAYER_RELOADING_TEXT = stringSetting(SETTINGS_MESSAGES.player_reloading, "");
    const AD_LABEL_TEXT = stringSetting(SETTINGS_MESSAGES.ad_label, "");
    const NOT_FOUND_FALLBACK_TEXT = stringSetting(SETTINGS_MESSAGES.not_found, "");
    const SETUP_INVALID_TEXT = stringSetting(SETTINGS_MESSAGES.setup_invalid, "");
    const OFFLINE_RETRY_DELAY_INITIAL = numberSetting(SETTINGS_RETRY.offline_initial_ms, 5000);
    const OFFLINE_RETRY_DELAY_MAX = numberSetting(SETTINGS_RETRY.offline_max_ms, 30000);
    const SERVER_RETRY_DELAY_INITIAL = numberSetting(SETTINGS_RETRY.server_initial_ms, 10000);
    const SERVER_RETRY_DELAY_MAX = numberSetting(SETTINGS_RETRY.server_max_ms, 60000);
    const BLOCKED_RETRY_DELAY = numberSetting(SETTINGS_RETRY.blocked_ms, 60000);
    const PLAYER_ID = <?= json_encode($player, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES) ?>;
    const TIMEZONE_OFFSET = String(new Date().getTimezoneOffset());
    const APP_VERSION = <?= json_encode($appVersion, JSON_UNESCAPED_UNICODE | JSON_UNESCAPED_SLASHES) ?>;
    const IS_IOS = detectIosPlatform();

    const audio = document.getElementById("audio");
    const button = document.getElementById("playButton");
    const icon = document.getElementById("icon");
    const setupWrap = document.getElementById("setupWrap");
    const setupMessage = document.getElementById("setupMessage");
    const setupInput = document.getElementById("setupInput");
    const setupSubmit = document.getElementById("setupSubmit");
    const playerShell = document.getElementById("playerShell");
    const info = document.getElementById("info");
    const infoWrap = document.getElementById("infoWrap");
    const meta = document.getElementById("meta");
    const manifestLink = document.getElementById("manifestLink");
    const streamEl = document.getElementById("stream");
    const playerHeadEl = document.getElementById("playerHead");
    const logoutButton = document.getElementById("logoutButton");
    const pinWrap = document.getElementById("pinWrap");
    const pinSubmit = document.getElementById("pinSubmit");
    const pinCancel = document.getElementById("pinCancel");

    let player = resolvePlayer();
    let device = resolveDevice();

    let isStarted = false;
    let isStoppedByUser = false;
    let timer = null;
    let playlist = null;
    let playQueue = [];
    let prefetchDone = false;

    let isPageHidden = false;
    let restoreTimer = null;
    let breakWatchTimer = null;
    let isRecovering = false;
    let currentTrackUrl = "";
    let scheduledBreakAt = null;
    let copyFeedbackTimer = null;
    let nextStartMode = null;
    let currentMediaType = "";
    let isFadingOut = false;
    let isStopping = false;
    let isRefreshingQueue = false;
    let resumeRequiresReload = false;
    let isResettingPlayback = false;
    let historyLogTimer = null;
    let historyLogKey = "";
    let offlineRetryDelay = OFFLINE_RETRY_DELAY_INITIAL;
    let serverRetryDelay = SERVER_RETRY_DELAY_INITIAL;
    let playerLevel = 1;

    setupMediaSession();
    registerAppShell();
    restoreUpdatedNotice();
    restoreAutostart();
    setupInitialScreen();

    button.addEventListener("click", async () => {
      if (!player) {
        showSetupScreen(PLAYER_REQUIRED_TEXT || SETUP_INVALID_TEXT);
        return;
      }

      if (!isStarted) {
        if (isStopping) return;
        isStarted = true;
        isStoppedByUser = false;
        setStopIcon();
        hideContentBlocks();
        await startFirstTrack("manual");
        return;
      }

      if (isStopping) return;
      await stopPlayer();
    });

    playerHeadEl.addEventListener("click", async () => {
      const text = playerHeadEl.textContent.trim();
      if (!text) return;
      await copyPlayerHead(text);
    });

    pinSubmit.addEventListener("click", async () => {
      await submitClaim();
    });

    pinCancel.addEventListener("click", () => {
      hidePin();
      applyStoppedState();
    });

    setupSubmit.addEventListener("click", async () => {
      await submitPlayerCode();
    });

    setupInput.addEventListener("keydown", async (e) => {
      if (e.key === "Enter") {
        e.preventDefault();
        await submitPlayerCode();
      }
    });

    setupInput.addEventListener("input", () => {
      const filtered = String(setupInput.value || "")
        .replace(/[^a-zA-Z0-9]/g, "")
        .slice(0, 5)
        .toUpperCase();

      if (setupInput.value !== filtered) {
        setupInput.value = filtered;
      }
    });

    logoutButton.addEventListener("click", async () => {
      await logoutPlayer();
    });

    audio.addEventListener("ended", async () => {
      if (isStoppedByUser) return;
      await playPreparedOrLoadNext();
    });

    audio.addEventListener("error", async () => {
      if (isStoppedByUser) return;
      await handleMediaError();
    });

    audio.addEventListener("timeupdate", async () => {
      if (!isStarted || isStoppedByUser) return;

      if (shouldTriggerBreakNow()) {
        await fadeOutAndContinue();
        return;
      }

      if (prefetchDone) return;
      const remain = effectiveTrackRemain();
      if (!Number.isFinite(remain) || remain <= 0) return;

      if (remain <= PREFETCH_SECONDS) {
        prefetchDone = true;
        await prefetchNext();
      }
    });

    audio.addEventListener("seeked", async () => {
      if (!isStarted || isStoppedByUser) return;
      if (isFadingOut || isStopping) return;
      if (currentMediaType !== "track") return;

      await refreshQueueAfterSeek();
    });

    audio.addEventListener("pause", async () => {
      if (!isStarted || isStoppedByUser) return;
      if (audio.ended) return;
      if (isPageHidden) return;
      if (isFadingOut || isStopping) return;
      if (isResettingPlayback) return;

      resumeRequiresReload = true;
      scheduleRestore(800);
    });

    audio.addEventListener("play", async () => {
      if (!isStarted || isStoppedByUser) return;
      if (!resumeRequiresReload) return;
      if (isFadingOut || isStopping) return;
      if (isResettingPlayback) return;

      audio.pause();
      await reloadAfterPause();
    });

    document.addEventListener("visibilitychange", async () => {
      isPageHidden = document.hidden;

      if (!document.hidden) {
        scheduleRestore(300);
      }
    });

    window.addEventListener("pageshow", async () => {
      scheduleRestore(300);
    });

    window.addEventListener("focus", async () => {
      scheduleRestore(300);
    });

    window.addEventListener("online", async () => {
      if (!isStarted || isStoppedByUser || isStopping) return;
      if (!audio.paused && currentTrackUrl) return;

      resetRetryDelay();
      await loadNextAndPlay();
    });

    window.addEventListener("offline", () => {
      if (!isStarted || isStoppedByUser || isStopping) return;
      if (!audio.paused && currentTrackUrl) return;
      handleTemporaryState("offline");
    });

    window.addEventListener("beforeunload", (e) => {
      if (!isStarted || isStoppedByUser) return;
      e.preventDefault();
      e.returnValue = "";
    });

    function normalizePlayerCode(value) {
      const code = String(value || "").trim().toLowerCase();
      return /^[a-z0-9]{5}$/.test(code) ? code : "";
    }

    function formatPlayerCodeForDisplay(value) {
      return String(value || "").trim().toUpperCase();
    }

    function loadPlayerCode() {
      try {
        return normalizePlayerCode(localStorage.getItem(PLAYER_CODE_STORAGE_KEY) || "");
      } catch (e) {
        return "";
      }
    }

    function savePlayerCode(code) {
      const normalized = normalizePlayerCode(code);
      if (!normalized) return "";

      try {
        localStorage.setItem(PLAYER_CODE_STORAGE_KEY, normalized);
      } catch (e) {}

      return normalized;
    }

    function clearPlayerCode() {
      try {
        localStorage.removeItem(PLAYER_CODE_STORAGE_KEY);
      } catch (e) {}
    }

    function syncCleanUrl() {
      if (!window.history || typeof window.history.replaceState !== "function") {
        return;
      }

      const currentUrl = new URL(window.location.href);
      if (currentUrl.pathname === "/" && !currentUrl.searchParams.has("player")) {
        return;
      }

      window.history.replaceState({}, "", "/");
    }

    function updateManifestLink(code = player) {
      if (!manifestLink) return;
      manifestLink.href = code ? `/manifest?player=${encodeURIComponent(code)}` : "/manifest";
    }

    function resolvePlayer() {
      const fromUrl = normalizePlayerCode(PLAYER_ID || "");
      if (fromUrl) {
        savePlayerCode(fromUrl);
        syncCleanUrl();
        updateManifestLink(fromUrl);
        return fromUrl;
      }

      const fromStorage = loadPlayerCode();
      updateManifestLink(fromStorage);
      return fromStorage;
    }

    function registerAppShell() {
      if (!("serviceWorker" in navigator)) {
        return;
      }

      window.addEventListener("load", () => {
        navigator.serviceWorker.register("/sw.js").catch(() => {});
      }, { once: true });
    }

    function stringSetting(value, fallback) {
      return typeof value === "string" && value.trim() !== "" ? value : fallback;
    }

    function numberSetting(value, fallback) {
      const parsed = Number(value);
      return Number.isFinite(parsed) && parsed > 0 ? parsed : fallback;
    }

    function resolveDevice() {
      const fromStorage = localStorage.getItem(DEVICE_STORAGE_KEY);
      if (fromStorage) {
        return fromStorage;
      }

      const value = createDevice();
      localStorage.setItem(DEVICE_STORAGE_KEY, value);
      return value;
    }

    function createDevice() {
      if (window.crypto && crypto.randomUUID) {
        return crypto.randomUUID();
      }

      return "d-" + Date.now() + "-" + Math.random().toString(16).slice(2);
    }

    async function initPlayerInfo() {
      if (!player) return;

      try {
        const params = new URLSearchParams();
        params.set("player", player);
        params.set("tz", TIMEZONE_OFFSET);

        const data = await fetchJsonWithTimeout(`${PLAYER_BASE_URL}?${params.toString()}`);
          if (!data || data.ok !== true) {
            playerLevel = 1;
            renderPlayerHead(player, "");
            return;
          }

          playerLevel = resolvePlayerLevel(data.level);
          renderPlayerHead(data.code || player, data.title || "");
        } catch (e) {
          playerLevel = 1;
          renderPlayerHead(player, "");
        }
      }

    function renderPlayerHead(code, title) {
      const safeCode = escapeHtml(String(code || "").toUpperCase());
      const safeTitle = escapeHtml(title || "");

      if (!safeCode && !safeTitle) {
        playerHeadEl.textContent = "";
        return;
      }

      if (safeTitle) {
        playerHeadEl.innerHTML =
          `<span class="code">${safeCode}</span> <span class="title">• ${safeTitle}</span>`;
      } else {
        playerHeadEl.innerHTML = `<span class="code">${safeCode}</span>`;
      }

      playerHeadEl.title = COPY_HINT_TEXT;
    }

    function escapeHtml(value) {
      return String(value)
        .replace(/&/g, "&amp;")
        .replace(/</g, "&lt;")
        .replace(/>/g, "&gt;")
        .replace(/"/g, "&quot;")
        .replace(/'/g, "&#039;");
    }

    async function copyPlayerHead(text) {
      try {
        if (navigator.clipboard && window.isSecureContext) {
          await navigator.clipboard.writeText(text);
        } else {
          const input = document.createElement("textarea");
          input.value = text;
          input.setAttribute("readonly", "");
          input.style.position = "absolute";
          input.style.left = "-9999px";
          document.body.appendChild(input);
          input.select();
          document.execCommand("copy");
          document.body.removeChild(input);
        }

        playerHeadEl.classList.add("copied");
        playerHeadEl.title = COPY_DONE_TEXT;

        if (copyFeedbackTimer) {
          clearTimeout(copyFeedbackTimer);
        }

        copyFeedbackTimer = setTimeout(() => {
          playerHeadEl.classList.remove("copied");
          playerHeadEl.title = COPY_HINT_TEXT;
          copyFeedbackTimer = null;
        }, 1200);
      } catch (e) {}
    }

    async function startFirstTrack(mode = null) {
      nextStartMode = mode;
      playQueue = [];
      prefetchDone = false;
      await loadNextAndPlay();
    }

    async function playPreparedOrLoadNext() {
      clearTimer();

      if (playQueue.length > 0) {
        await playQueueItem(shiftQueueItem());
        return;
      }

      await loadNextAndPlay();
    }

    async function prefetchNext() {
      if (playQueue.length > 0) return;

      try {
        const data = await fetchNext();
        if (!isStarted || isStoppedByUser) return;
        const queue = normalizeQueueResponse(data);
        if (!queue || queue.length === 0) return;
        playQueue = queue;
      } catch (e) {}
    }

    async function refreshQueueAfterSeek() {
      if (isRefreshingQueue) {
        return;
      }

      isRefreshingQueue = true;
      prefetchDone = false;
      playQueue = [];

      try {
        const data = await fetchNext();
        if (!isStarted || isStoppedByUser || currentMediaType !== "track") {
          return;
        }

        const queue = normalizeQueueResponse(data);
        if (!queue || queue.length === 0) {
          return;
        }

        playQueue = queue;
        scheduledBreakAt = resolveScheduledBreakAt();
        scheduleBreakWatch();

        if (shouldTriggerBreakNow()) {
          await fadeOutAndContinue();
        }
      } catch (e) {
      } finally {
        isRefreshingQueue = false;
      }
    }

    async function reloadAfterPause() {
      if (!resumeRequiresReload) {
        return;
      }

      resumeRequiresReload = false;
      clearHistoryLogTimer();
      historyLogKey = "";
      playQueue = [];
      prefetchDone = false;
      currentTrackUrl = "";
      currentMediaType = "";
      scheduledBreakAt = null;
      clearBreakWatchTimer();
      clearTimer();

      await loadNextAndPlay();
    }

    async function loadNextAndPlay() {
      clearTimer();

      let data;

      try {
        data = await fetchNext();
      } catch (e) {
        handleFetchFailure(e);
        return;
      }

      if (!isStarted || isStoppedByUser) return;
      resetRetryDelay();

      const queue = normalizeQueueResponse(data);
      if (!queue || queue.length === 0) {
        handleTemporaryState("server");
        return;
      }

      const retryAfter = normalizeRetryAfter(data);
      playQueue = queue;
      await playQueueItem(shiftQueueItem(), retryAfter);
    }

    async function playQueueItem(current, retryAfter = null) {
      clearBreakWatchTimer();
      scheduledBreakAt = null;
      resumeRequiresReload = false;
      clearHistoryLogTimer();

      if (!current || typeof current !== "object") {
        handleTemporaryState("server");
        return;
      }

      if (current.type === "message") {
        if (current.action === "claim") {
          clearPlaybackState();
          isStarted = false;
          isStoppedByUser = true;
          setPlayIcon();
          showClaimPrompt(current.message || CLAIM_BUSY_TEXT);
        } else if (current.action === "blocked") {
          handleBlockedState();
        } else if (current.action === "not_found") {
          stopForMissingData(current.message || NOT_FOUND_FALLBACK_TEXT);
        } else {
          handleTemporaryState("server", current.message || SERVER_WAIT_TEXT);
        }

        return;
      }

      if (current.type === "update") {
        audio.pause();
        currentTrackUrl = "";
        currentMediaType = "";
        meta.textContent = "";
        playQueue = [];
        clearHistoryLogTimer();
        historyLogKey = "";
        updateMediaSessionMetadata(null);

        isStarted = false;
        isStoppedByUser = true;
        setPlayIcon();
        showMessage(current.message || PLAYER_RELOADING_TEXT);
        reloadPlayer();
        return;
      }

      hidePin();

      if (current.type === "idle") {
        audio.pause();
        currentTrackUrl = "";
        currentMediaType = "";
        meta.textContent = "";
        playQueue = [];
        clearHistoryLogTimer();
        historyLogKey = "";
        updateMediaSessionMetadata(null);
        showMessage(current.message || IDLE_TEXT);
        scheduleRetry(typeof retryAfter === "number" ? retryAfter * 1000 : PAUSE_RETRY_DELAY);
        return;
      }

      if (current.type === "break") {
        const items = Array.isArray(current.items)
          ? current.items.filter((item) => item && typeof item === "object")
          : [];

        if (items.length === 0) {
          await playPreparedOrLoadNext();
          return;
        }

        playQueue = items.concat(playQueue);
        await playPreparedOrLoadNext();
        return;
      }

      if (current.type !== "track" && current.type !== "ad") {
        handleTemporaryState("server");
        return;
      }

      const url = mediaUrl(current);

      if (!url) {
        handleTemporaryState("server");
        return;
      }

      try {
        if (typeof current.playlist === "number") {
          playlist = current.playlist;
        }

          applyPlaybackVolume(current);
        prefetchDone = false;

        if (current.type === "ad") {
          showAdMeta(current);
          showStream(AD_LABEL_TEXT);
        } else {
          showTrackMeta(current);
          showStream(current.stream || "");
          scheduledBreakAt = resolveScheduledBreakAt();
        }

        currentTrackUrl = url;
        currentMediaType = current.type;
        updateMediaSessionMetadata(current);

        audio.src = url;
        audio.load();
        await audio.play();
        scheduleHistoryLog(current);
        scheduleBreakWatch();
        resetRetryDelay();
      } catch (e) {
        await handleMediaError();
      }
    }

    async function fetchNext() {
      const params = new URLSearchParams();
      params.set("player", player);
      params.set("device", device);
      params.set("tz", TIMEZONE_OFFSET);
      params.set("version", APP_VERSION);
      if (nextStartMode === "manual" || nextStartMode === "auto") {
        params.set("start", nextStartMode);
      }

      if (playlist !== null && Number.isInteger(playlist)) {
        params.set("playlist", String(playlist));
      }

      const url = `${NEXT_BASE_URL}?${params.toString()}`;

      const data = await fetchJsonWithTimeout(url);
      nextStartMode = null;
      return data;
    }

    function normalizeQueueResponse(data) {
      if (!data || typeof data !== "object") {
        return null;
      }

      if (!Array.isArray(data.queue)) {
        return null;
      }

      return data.queue.filter((item) => item && typeof item === "object");
    }

    function normalizeRetryAfter(data) {
      if (!data || typeof data !== "object") {
        return null;
      }

      const value = Number(data.retry_after);
      if (!Number.isFinite(value) || value <= 0) {
        return null;
      }

      return Math.floor(value);
    }

    function shiftQueueItem() {
      if (playQueue.length === 0) {
        return null;
      }

      return playQueue.shift() || null;
    }

    async function submitClaim() {
      try {
        pinSubmit.disabled = true;
        pinCancel.disabled = true;

        await claimHere();

        isStarted = true;
        isStoppedByUser = false;
        setStopIcon();
        hideContentBlocks();

        await startFirstTrack("manual");
      } catch (e) {
        showClaimPrompt(e && e.message ? e.message : CLAIM_BUSY_TEXT);
      } finally {
        pinSubmit.disabled = false;
        pinCancel.disabled = false;
      }
    }

    function showSetupScreen(text = "") {
      playerShell.hidden = true;
      setupWrap.hidden = false;
      clearPlaybackState();
      hidePin();
      isStarted = false;
      isStoppedByUser = true;
      setPlayIcon();
      playerHeadEl.textContent = "";
      meta.textContent = "";
      updateManifestLink();
      if (setupMessage) setupMessage.textContent = text || "";
      if (setupInput) {
        setupInput.value = formatPlayerCodeForDisplay(player);
        setTimeout(() => setupInput.focus(), 0);
      }
    }

    function showPlayerScreen() {
      setupWrap.hidden = true;
      playerShell.hidden = false;
      updateManifestLink();
      applyStoppedState();
      void initPlayerInfo();
    }

    function setupInitialScreen() {
      if (!player) {
        showSetupScreen();
        return;
      }

      showPlayerScreen();
    }

    async function submitPlayerCode() {
      const nextPlayer = normalizePlayerCode(setupInput.value);
      if (!nextPlayer) {
        showSetupScreen(SETUP_INVALID_TEXT);
        if (setupInput) {
          setupInput.focus();
          setupInput.select();
        }
        return;
      }

      player = savePlayerCode(nextPlayer);
      setupInput.value = formatPlayerCodeForDisplay(player);
      if (setupMessage) setupMessage.textContent = "";
      showPlayerScreen();
    }

    async function logoutPlayer() {
      clearPlayerCode();
      player = "";
      await stopPlayer();
      meta.textContent = "";
      playerHeadEl.textContent = "";
      if (setupMessage) setupMessage.textContent = "";
      showSetupScreen();
    }

    async function claimHere() {
      const params = new URLSearchParams();
      params.set("player", player);
      params.set("device", device);
      params.set("tz", TIMEZONE_OFFSET);

      const url = `${CLAIM_BASE_URL}?${params.toString()}`;

      const res = await fetch(url, {
        cache: "no-store"
      });

      if (!res.ok) {
        throw new Error(CLAIM_BUSY_TEXT);
      }

      const data = await res.json();

      if (!data || data.ok !== true) {
        throw new Error(data && data.message ? data.message : CLAIM_BUSY_TEXT);
      }
    }

    function makePlayerError(kind, message = "") {
      const error = new Error(message || kind);
      error.kind = kind;
      return error;
    }

    function browserOffline() {
      return navigator.onLine === false;
    }

    async function hasExternalConnectivity() {
      if (browserOffline()) {
        return false;
      }

      const controller = new AbortController();
      const timeout = setTimeout(() => {
        controller.abort();
      }, CONNECTIVITY_CHECK_TIMEOUT_MS);

      try {
        const res = await fetch(`${CONNECTIVITY_CHECK_URL}?t=${Date.now()}`, {
          method: "GET",
          mode: "no-cors",
          cache: "no-store",
          signal: controller.signal
        });

        return !!res;
      } catch (e) {
        return false;
      } finally {
        clearTimeout(timeout);
      }
    }

    async function fetchJsonWithTimeout(url) {
      if (browserOffline()) {
        throw makePlayerError("offline");
      }

      const controller = new AbortController();
      let timedOut = false;
      const timeout = setTimeout(() => {
        timedOut = true;
        controller.abort();
      }, FETCH_TIMEOUT_MS);

      try {
        const res = await fetch(url, {
          cache: "no-store",
          signal: controller.signal
        });

        if (!res.ok) {
          throw makePlayerError("server", `HTTP ${res.status}`);
        }

        try {
          return await res.json();
        } catch (e) {
          throw makePlayerError("server", "bad_json");
        }
      } catch (e) {
        if (e && e.kind) {
          throw e;
        }

        if (browserOffline()) {
          throw makePlayerError("offline");
        }

        if (timedOut || (e && e.name === "AbortError") || e instanceof TypeError) {
          throw makePlayerError("offline", e && e.message ? e.message : "network_unreachable");
        }

        throw makePlayerError("server", e && e.message ? e.message : "fetch_failed");
      } finally {
        clearTimeout(timeout);
      }
    }

    function clearPlaybackState() {
      isResettingPlayback = true;
      resumeRequiresReload = false;
      audio.pause();
      audio.removeAttribute("src");
      audio.load();
      currentTrackUrl = "";
      currentMediaType = "";
      scheduledBreakAt = null;
      playQueue = [];
      prefetchDone = false;
      clearTimer();
      clearRestoreTimer();
      clearBreakWatchTimer();
      clearHistoryLogTimer();
      historyLogKey = "";
      meta.textContent = "";
      updateMediaSessionMetadata(null);
      setTimeout(() => {
        isResettingPlayback = false;
      }, 0);
    }

    function handleTemporaryState(mode, text = "") {
      clearPlaybackState();
      hidePin();
      showMessage(text || (mode === "offline" ? INTERNET_CHECK_TEXT : SERVER_WAIT_TEXT));
      scheduleRetry(mode);
    }

    function handleBlockedState() {
      clearPlaybackState();
      hidePin();
      showMessage(BLOCKED_TEXT);
      scheduleRetry("blocked");
    }

    function stopForMissingData(text) {
      clearPlaybackState();
      hidePin();
      isStarted = false;
      isStoppedByUser = true;
      setPlayIcon();
      showMessage(text || NOT_FOUND_FALLBACK_TEXT);
    }

    async function handleFetchFailure(error) {
      if (error && error.kind === "offline") {
        handleTemporaryState("offline");
        return;
      }

      const hasInternet = await hasExternalConnectivity();
      handleTemporaryState(hasInternet ? "server" : "offline");
    }

    async function handleMediaError() {
      if (browserOffline()) {
        handleTemporaryState("offline");
        return;
      }

      const hasInternet = await hasExternalConnectivity();
      handleTemporaryState(hasInternet ? "server" : "offline");
    }

    function applyPlaybackVolume(current) {
      const volume = volumeAdjustment(current);
      audio.volume = volume;
    }

    function volumeAdjustment(current) {
      if (current && typeof current === "object" && typeof current.volume !== "undefined" && current.volume !== null && current.volume !== "" && !isNaN(current.volume)) {
        return clamp(parseFloat(current.volume), 0, 1);
      }

      const type = current && typeof current === "object" ? current.type : "";
      const base = type === "track" ? playerLevel : 1.0;
      const fallbackFactor = Math.pow(10, -3 / 20);
      return clamp(base * fallbackFactor, 0, 1);
    }

    function resolvePlayerLevel(value) {
      if (typeof value === "undefined" || value === null || value === "") {
        return 1.0;
      }

      const level = parseFloat(value);
      if (!Number.isFinite(level)) {
        return 1.0;
      }

      return clamp(level / 100, 0, 1);
    }

    function clamp(value, min, max) {
      if (!Number.isFinite(value)) {
        return min;
      }

      return Math.min(max, Math.max(min, value));
    }

    function detectIosPlatform() {
      const ua = navigator.userAgent || "";
      const platform = navigator.platform || "";
      const maxTouchPoints = Number(navigator.maxTouchPoints || 0);

      if (/iPad|iPhone|iPod/.test(ua)) {
        return true;
      }

      return platform === "MacIntel" && maxTouchPoints > 1;
    }

    function setupMediaSession() {
      if (!("mediaSession" in navigator) || !navigator.mediaSession) {
        return;
      }

      setMediaSessionHandler("play", () => {
        void startFromMediaSession();
      });

      const stopActions = [
        "pause",
        "stop",
        "skipad"
      ];

      for (const action of stopActions) {
        setMediaSessionHandler(action, () => {
          void forceStopPlayback();
        });
      }

      const ignoredActions = [
        "seekbackward",
        "seekforward",
        "seekto",
        "previoustrack",
        "nexttrack"
      ];

      for (const action of ignoredActions) {
        setMediaSessionHandler(action, () => {});
      }
    }

    function setMediaSessionHandler(action, handler) {
      try {
        navigator.mediaSession.setActionHandler(action, handler);
      } catch (e) {}
    }

    function updateMediaSessionMetadata(item) {
      if (!("mediaSession" in navigator) || !navigator.mediaSession || typeof MediaMetadata === "undefined") {
        return;
      }

      if (!item || typeof item !== "object") {
        navigator.mediaSession.metadata = null;
        return;
      }

      // Даже без обложки локскрин должен показывать понятный заголовок.
      const isAd = item.type === "ad";
      const title = isAd ? (item.title || AD_LABEL_TEXT) : (item.stream || "FON.FM");
      const artist = isAd ? "FON.FM" : (item.set || "");
      const album = isAd ? AD_LABEL_TEXT : (item.code || "");

      try {
        navigator.mediaSession.metadata = new MediaMetadata({
          title: String(title || "FON.FM"),
          artist: String(artist || "FON.FM"),
          album: String(album || "")
        });
      } catch (e) {}
    }


    async function startFromMediaSession() {
      if (isStopping || isStarted || !player) {
        return;
      }

      isStarted = true;
      isStoppedByUser = false;
      resumeRequiresReload = false;
      setStopIcon();
      hideContentBlocks();
      await startFirstTrack("manual");
    }


    function mediaUrl(track) {
      if (!track || !track.id) {
        return "";
      }

      const first = String(track.id).charAt(0);
      const folder = track.type === "ad" ? "ads" : "tracks";
      return `https://cdn.fon.fm/media/${folder}/${first}/${track.id}.mp3`;
    }

    function showTrackMeta(track) {
      const parts = [];
      if (track.set) parts.push(track.set);
      if (track.code) parts.push(track.code);
      meta.textContent = parts.join(" • ");
    }

    function showAdMeta(ad) {
      meta.textContent = ad && ad.title ? String(ad.title) : "";
    }

    function resolveRetryDelay(mode, ms) {
      if (typeof ms === "number") {
        return ms;
      }

      if (mode === "offline") {
        const delay = offlineRetryDelay;
        offlineRetryDelay = Math.min(offlineRetryDelay * 2, OFFLINE_RETRY_DELAY_MAX);
        return delay;
      }

      if (mode === "blocked") {
        return BLOCKED_RETRY_DELAY;
      }

      const delay = serverRetryDelay;
      serverRetryDelay = Math.min(serverRetryDelay * 2, SERVER_RETRY_DELAY_MAX);
      return delay;
    }

    function scheduleRetry(mode = "server", ms = null) {
      if (typeof mode === "number") {
        ms = mode;
        mode = "server";
      }

      clearTimer();
      const delay = resolveRetryDelay(mode, ms);

      timer = setTimeout(async () => {
        if (!isStarted || isStoppedByUser) return;
        await loadNextAndPlay();
      }, delay);
    }

    function resetRetryDelay() {
      offlineRetryDelay = OFFLINE_RETRY_DELAY_INITIAL;
      serverRetryDelay = SERVER_RETRY_DELAY_INITIAL;
    }

    function clearTimer() {
      if (timer) {
        clearTimeout(timer);
        timer = null;
      }
    }

    function resolveScheduledBreakAt() {
      const upcomingBreak = playQueue.find((item) => item && item.type === "break");
      if (!upcomingBreak || !upcomingBreak.exactly) {
        return null;
      }

      const at = Number(upcomingBreak.at);
      if (!Number.isFinite(at) || at <= 0) {
        return null;
      }

      return at;
    }

    function scheduleBreakWatch() {
      clearBreakWatchTimer();

      if (!Number.isFinite(scheduledBreakAt) || scheduledBreakAt <= 0) {
        return;
      }

      const delay = Math.max(0, ((scheduledBreakAt - localNowTimestamp()) * 1000) - 250);

      breakWatchTimer = setTimeout(async () => {
        if (!isStarted || isStoppedByUser) return;
        if (!shouldTriggerBreakNow()) return;
        await fadeOutAndContinue();
      }, delay);
    }

    function clearBreakWatchTimer() {
      if (breakWatchTimer) {
        clearTimeout(breakWatchTimer);
        breakWatchTimer = null;
      }
    }

    function clearHistoryLogTimer() {
      if (historyLogTimer) {
        clearTimeout(historyLogTimer);
        historyLogTimer = null;
      }
    }

    function localDateTimeParts(date = new Date()) {
      const year = date.getFullYear();
      const month = String(date.getMonth() + 1).padStart(2, "0");
      const day = String(date.getDate()).padStart(2, "0");
      const hour = String(date.getHours()).padStart(2, "0");
      const minute = String(date.getMinutes()).padStart(2, "0");
      const second = String(date.getSeconds()).padStart(2, "0");

      return {
        date: `${year}-${month}-${day}`,
        time: `${hour}:${minute}:${second}`
      };
    }

    function historyPayload(item, startedAt) {
      const started = localDateTimeParts(startedAt);
      const payload = new URLSearchParams();

      payload.set("player", player);
      payload.set("device", device);
      payload.set("type", String(item.type || ""));
      payload.set("id", String(item.id || ""));
      payload.set("date", started.date);
      payload.set("time", started.time);

      return payload;
    }

    function scheduleHistoryLog(item) {
      if (!item || (item.type !== "track" && item.type !== "ad") || !item.id) {
        return;
      }

      // Логируем только то, что реально продержалось в эфире заданную задержку.
      clearHistoryLogTimer();

      const startedAt = new Date();
      const key = `${item.type}:${item.id}:${startedAt.getTime()}`;
      historyLogKey = key;

      historyLogTimer = setTimeout(async () => {
        if (!isStarted || isStoppedByUser) return;
        if (currentMediaType !== item.type) return;
        if (!audio.src) return;
        if (historyLogKey !== key) return;

        try {
          await fetch(HISTORY_BASE_URL, {
            method: "POST",
            headers: {
              "Content-Type": "application/x-www-form-urlencoded;charset=UTF-8"
            },
            body: historyPayload(item, startedAt).toString(),
            keepalive: true,
            cache: "no-store"
          });
        } catch (e) {
        } finally {
          if (historyLogKey === key) {
            historyLogKey = "";
          }
          historyLogTimer = null;
        }
      }, HISTORY_LOG_DELAY_MS);
    }

    function localNowTimestamp() {
      const offset = Number(TIMEZONE_OFFSET);
      if (!Number.isFinite(offset)) {
        return Math.floor(Date.now() / 1000);
      }

      return Math.floor(Date.now() / 1000) - (offset * 60);
    }

    function shouldTriggerBreakNow() {
      if (!Number.isFinite(scheduledBreakAt) || scheduledBreakAt <= 0) {
        return false;
      }

      return localNowTimestamp() >= scheduledBreakAt;
    }

    function effectiveTrackRemain() {
      const trackRemain = Number.isFinite(audio.duration) && audio.duration > 0
        ? audio.duration - audio.currentTime
        : NaN;

      if (!Number.isFinite(scheduledBreakAt) || scheduledBreakAt <= 0) {
        return trackRemain;
      }

      const breakRemain = scheduledBreakAt - localNowTimestamp();
      if (!Number.isFinite(trackRemain)) {
        return breakRemain;
      }

      return Math.min(trackRemain, breakRemain);
    }

    async function fadeOutAndContinue() {
      await fadeOutAudio(currentMediaType === "track" ? TRACK_FADE_MS : 0);
      await playPreparedOrLoadNext();
    }

    async function fadeOutAudio(durationMs) {
      if (isFadingOut) {
        return;
      }

      if (IS_IOS || !Number.isFinite(durationMs) || durationMs <= 0 || audio.paused) {
        audio.pause();
        audio.volume = 1;
        return;
      }

      isFadingOut = true;

      const startVolume = audio.volume;
      const steps = Math.max(1, Math.round(durationMs / 50));

      try {
        for (let i = steps - 1; i >= 0; i -= 1) {
          const progress = i / steps;
          audio.volume = startVolume * (progress * progress);
          await sleep(Math.max(20, Math.round(durationMs / steps)));
        }

        audio.pause();
      } finally {
        audio.volume = startVolume;
        isFadingOut = false;
      }
    }

    function sleep(ms) {
      return new Promise((resolve) => {
        setTimeout(resolve, ms);
      });
    }

    function scheduleRestore(ms) {
      clearRestoreTimer();
      restoreTimer = setTimeout(async () => {
        await restorePlayback();
      }, ms);
    }

    function clearRestoreTimer() {
      if (restoreTimer) {
        clearTimeout(restoreTimer);
        restoreTimer = null;
      }
    }

    async function restorePlayback() {
      if (!isStarted || isStoppedByUser) return;
      if (isPageHidden) return;
      if (isRecovering) return;
      if (!currentTrackUrl) return;
      if (!audio.paused) return;

      isRecovering = true;

      try {
        if (resumeRequiresReload) {
          await reloadAfterPause();
        } else {
          await audio.play();
        }
      } catch (e) {} finally {
        isRecovering = false;
      }
    }

    async function forceStopPlayback() {
      if (isStopping) {
        return;
      }

      isStopping = true;
      button.disabled = true;
      isStarted = false;
      isStoppedByUser = true;
      resumeRequiresReload = false;

      clearTimer();
      clearRestoreTimer();
      clearBreakWatchTimer();
      clearHistoryLogTimer();
      resetRetryDelay();

      audio.pause();
      audio.removeAttribute("src");
      audio.load();
      audio.volume = 1;
      updateMediaSessionMetadata(null);

      playlist = null;
      playQueue = [];
      prefetchDone = false;
      currentTrackUrl = "";
      currentMediaType = "";
      scheduledBreakAt = null;
      historyLogKey = "";

      meta.textContent = "";
      pinSubmit.disabled = false;
      pinCancel.disabled = false;

      hideContentBlocks();
      setPlayIcon();
      applyStoppedState();
      button.disabled = false;
      isStopping = false;
    }

    async function stopPlayer() {
      if (isStopping) {
        return;
      }

      isStopping = true;
      button.disabled = true;
      isStarted = false;
      isStoppedByUser = true;

      clearTimer();
      clearRestoreTimer();
      clearBreakWatchTimer();
      clearHistoryLogTimer();
      resetRetryDelay();

      await fadeOutAudio(STOP_FADE_MS);
      audio.removeAttribute("src");
      audio.load();
      updateMediaSessionMetadata(null);

      playlist = null;
      playQueue = [];
      prefetchDone = false;
      currentTrackUrl = "";
      currentMediaType = "";
      scheduledBreakAt = null;
      resumeRequiresReload = false;
      historyLogKey = "";

      meta.textContent = "";
      pinSubmit.disabled = false;
      pinCancel.disabled = false;

      hideContentBlocks();
      setPlayIcon();
      applyStoppedState();
      button.disabled = false;
      isStopping = false;
    }

    function restoreAutostart() {
      const value = sessionStorage.getItem(AUTOSTART_STORAGE_KEY);
      if (value !== "1") return;

      sessionStorage.removeItem(AUTOSTART_STORAGE_KEY);

      setTimeout(async () => {
        if (isStarted || !player) return;
        isStarted = true;
        isStoppedByUser = false;
        setStopIcon();
        hideContentBlocks();
        await startFirstTrack("auto");
      }, 150);
    }

    function restoreUpdatedNotice() {
      const value = sessionStorage.getItem(UPDATED_STORAGE_KEY);
      if (value !== "1") return;

      sessionStorage.removeItem(UPDATED_STORAGE_KEY);

      if (player && !isStarted) {
        showMessage(PLAYER_UPDATED_TEXT);
      }
    }

    function reloadPlayer() {
      sessionStorage.setItem(UPDATED_STORAGE_KEY, "1");
      sessionStorage.setItem(AUTOSTART_STORAGE_KEY, "1");
      window.location.reload();
    }

    function hideContentBlocks() {
      streamEl.classList.remove("active");
      infoWrap.classList.remove("active");
      pinWrap.classList.remove("active");

      streamEl.textContent = "";
      info.textContent = "";
      pinSubmit.disabled = false;
      pinCancel.disabled = false;
    }

    function showStream(text) {
      hideContentBlocks();
      streamEl.textContent = text || "";
      streamEl.classList.remove("idle");
      streamEl.classList.add("active");
    }

    function showMessage(text) {
      hideContentBlocks();
      info.textContent = text || "";
      infoWrap.classList.add("active");
    }

    function showClaimPrompt(text) {
      hideContentBlocks();
      isStarted = false;
      isStoppedByUser = true;
      setPlayIcon();
      info.textContent = text || CLAIM_BUSY_TEXT;
      infoWrap.classList.add("active");
      pinWrap.classList.add("active");
      pinSubmit.focus();
    }

    function hidePin() {
      pinWrap.classList.remove("active");
      pinSubmit.disabled = false;
      pinCancel.disabled = false;
    }

    function applyStoppedState() {
      showStream(IDLE_STREAM_TEXT);
      streamEl.classList.add("idle");
      meta.textContent = "";
    }

    function setPlayIcon() {
      icon.classList.remove("stop");
      icon.classList.add("play");
    }

    function setStopIcon() {
      icon.classList.remove("play");
      icon.classList.add("stop");
    }
