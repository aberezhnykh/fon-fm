    :root {
      --bg: #0e0f11;
      --panel: #1a1b1e;
      --panel-border: rgba(255, 255, 255, 0.08);
      --text: #e0e4ea;
      --muted: #8e949e;
      --soft: #bcc3cd;
      --button: #f3f4f6;
      --button-text: #0a0b0d;
      --field: #14171c;
      --field-border: rgba(255, 255, 255, 0.1);
      --focus: rgba(255, 255, 255, 0.14);
      --safe-top: env(safe-area-inset-top, 0px);
      --safe-right: env(safe-area-inset-right, 0px);
      --safe-bottom: env(safe-area-inset-bottom, 0px);
      --safe-left: env(safe-area-inset-left, 0px);
    }

    * {
      box-sizing: border-box;
    }

    html,
    body {
      margin: 0;
      padding: 0;
      height: 100%;
      background: var(--bg);
      color: var(--text);
      font-family: "Segoe UI Variable Display", "Segoe UI", Arial, sans-serif;
      overflow-x: hidden;
      overflow-y: auto;
      overscroll-behavior-y: auto;
    }

    body {
      -webkit-font-smoothing: antialiased;
      -moz-osx-font-smoothing: grayscale;
      position: relative;
      touch-action: manipulation;
      -webkit-user-select: none;
      user-select: none;
      -webkit-tap-highlight-color: transparent;
    }

    .page {
      min-height: 100dvh;
      display: flex;
      align-items: center;
      justify-content: center;
      padding:
        max(20px, var(--safe-top))
        max(20px, var(--safe-right))
        max(20px, var(--safe-bottom))
        max(20px, var(--safe-left));
    }

    .player-shell {
      width: min(100%, 620px);
      min-height: max(500px, calc(100dvh - 40px));
      padding: 28px;
      border-radius: 24px;
      background: var(--panel);
      border: 1px solid var(--panel-border);
      display: grid;
      grid-template-rows: auto minmax(170px, 1fr) minmax(140px, auto) auto;
      align-items: center;
      gap: 20px;
    }

    .player-head {
      color: #747b86;
      text-align: center;
      font-size: 12px;
      line-height: 1.3;
      min-height: 20px;
      padding: 0 8px;
      letter-spacing: 0.08em;
      text-transform: uppercase;
      cursor: copy;
      -webkit-user-select: text;
      user-select: text;
    }

    .player-head .code,
    .player-head .title {
      color: inherit;
      font-weight: 400;
      letter-spacing: inherit;
    }

    .player-head .title {
      text-transform: uppercase;
    }

    .player-head.copied {
      color: #8d94a0;
    }

    .player-wrap {
      width: 100%;
      min-height: 170px;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .player-btn {
      width: min(168px, 40vw);
      height: min(168px, 40vw);
      min-width: 128px;
      min-height: 128px;
      max-width: 168px;
      max-height: 168px;
      border: 1px solid rgba(255, 255, 255, 0.16);
      border-radius: 50%;
      background: transparent;
      display: flex;
      align-items: center;
      justify-content: center;
      cursor: pointer;
      transition: transform 0.16s ease, border-color 0.16s ease, background 0.16s ease;
      -webkit-tap-highlight-color: transparent;
      appearance: none;
      outline: none;
    }

    .player-btn:hover {
      background: rgba(255, 255, 255, 0.03);
      border-color: rgba(255, 255, 255, 0.24);
    }

    .player-btn:active {
      transform: scale(0.985);
    }

    .player-btn:disabled {
      cursor: default;
      opacity: 0.72;
    }

    .player-btn:focus-visible {
      box-shadow: 0 0 0 6px var(--focus);
    }

    .icon {
      width: 0;
      height: 0;
      border-style: solid;
      flex: 0 0 auto;
    }

    .icon.play {
      border-width: 20px 0 20px 31px;
      border-color: transparent transparent transparent #d0ff71;
      margin-left: 6px;
    }

    .icon.stop {
      width: 26px;
      height: 26px;
      background: #d0ff71;
      border-radius: 2px;
    }

    .content-area {
      width: 100%;
      min-height: 140px;
      position: relative;
      display: flex;
      align-items: center;
      justify-content: center;
      padding: 0 10px;
    }

    .stream,
    .info-wrap {
      width: 100%;
      position: absolute;
      inset: 0;
      opacity: 0;
      visibility: hidden;
      pointer-events: none;
      transition: opacity 0.16s ease, visibility 0.16s ease;
    }

    .stream.active,
    .info-wrap.active {
      opacity: 1;
      visibility: visible;
      pointer-events: auto;
    }

    .stream {
      display: flex;
      color: #d0ff71;
      font-size: clamp(28px, 4vw, 40px);
      font-weight: 500;
      line-height: 1.1;
      text-align: center;
      min-height: 78px;
      padding: 0 12px;
      align-items: center;
      justify-content: center;
      letter-spacing: -0.03em;
      text-wrap: balance;
    }

    .stream.idle {
      color: #d0ff71;
    }

    .info-wrap {
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      gap: 20px;
      padding: 8px 0;
    }

    .info {
      width: 100%;
      color: var(--soft);
      font-size: 17px;
      line-height: 1.45;
      text-align: center;
      min-height: 32px;
      padding: 0 12px;
      text-wrap: balance;
    }

    .pin-wrap {
      width: 100%;
      display: none;
      min-height: 72px;
      margin-top: 8px;
      align-items: center;
      justify-content: center;
    }

    .pin-wrap.active {
      display: flex;
    }

    .pin-box {
      display: flex;
      column-gap: 10px;
      row-gap: 12px;
      align-items: center;
      justify-content: center;
      flex-wrap: wrap;
      width: 100%;
      max-width: 760px;
    }

    .pin-input {
      width: 140px;
      height: 46px;
      border: 1px solid var(--field-border);
      border-radius: 12px;
      background: var(--field);
      color: var(--text);
      text-align: center;
      font-size: 17px;
      font-weight: 500;
      outline: none;
      letter-spacing: 0.18em;
    }

    .pin-submit {
      border: 1px solid rgba(255, 255, 255, 0.12);
      border-radius: 12px;
      background: transparent;
      color: var(--text);
      font-size: 17px;
      font-weight: 500;
      min-height: 46px;
      min-width: 92px;
      padding: 10px 16px;
      cursor: pointer;
      letter-spacing: 0.18em;
      text-transform: uppercase;
    }

    .pin-input:focus,
    .pin-submit:focus-visible {
      outline: none;
      box-shadow: 0 0 0 4px var(--focus);
    }

    .bottom-meta {
      width: 100%;
      min-height: 52px;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: flex-start;
      gap: 6px;
    }

    .brand {
      color: #747b86;
      font-size: 12px;
      line-height: 1.3;
      text-align: center;
      letter-spacing: 0.08em;
      text-transform: uppercase;
    }

    .brand a {
      color: inherit;
      text-decoration: none;
    }

    .brand a:hover,
    .brand a:focus-visible {
      color: #8d94a0;
    }

    .meta {
      color: var(--muted);
      font-size: 13px;
      line-height: 1.35;
      text-align: center;
      min-height: 20px;
      max-width: 760px;
      padding: 0 12px;
      letter-spacing: 0.08em;
      text-transform: uppercase;
    }

    .install-btn {
        border: 0;
        background: transparent;
        color: var(--text);
        font-size: 12px;
        cursor: pointer;
        letter-spacing: 0.06em;
        text-transform: uppercase;
      }

    .install-btn:hover,
    .install-btn:focus-visible {
        outline: none;
        opacity: 0.78;
      }

    @media (max-width: 720px) {
      .page {
        padding:
          max(16px, var(--safe-top))
          max(16px, var(--safe-right))
          max(16px, var(--safe-bottom))
          max(16px, var(--safe-left));
      }

      .player-shell {
        min-height: max(440px, calc(100dvh - 32px));
        padding: 22px 18px;
        border-radius: 20px;
        grid-template-rows: auto minmax(156px, 1fr) minmax(128px, auto) auto;
        gap: 20px;
      }

      .player-btn {
        width: min(156px, 48vw);
        height: min(156px, 48vw);
      }

      .icon.play {
        border-width: 18px 0 18px 29px;
        margin-left: 7px;
      }

      .icon.stop {
        width: 24px;
        height: 24px;
      }

      .content-area {
        min-height: 128px;
        padding: 0 8px;
      }

      .stream {
        min-height: 68px;
      }

      .info {
        font-size: 17px;
      }
    }

    @media (max-width: 420px) {
      .page {
        padding:
          max(12px, var(--safe-top))
          max(12px, var(--safe-right))
          max(12px, var(--safe-bottom))
          max(12px, var(--safe-left));
      }

      .player-shell {
        min-height: max(400px, calc(100dvh - 24px));
        padding: 18px 14px;
        border-radius: 18px;
        grid-template-rows: auto minmax(144px, 1fr) minmax(116px, auto) auto;
        gap: 20px;
      }

      .content-area {
        min-height: 172px;
        padding: 0 4px;
      }

      .info-wrap {
        gap: 18px;
      }

      .player-btn {
        width: min(144px, 52vw);
        height: min(144px, 52vw);
        min-width: 114px;
        min-height: 114px;
      }

      .icon.play {
        border-width: 16px 0 16px 26px;
        margin-left: 5px;
      }

      .icon.stop {
        width: 22px;
        height: 22px;
      }

      .stream {
        min-height: 64px;
      }

      .info {
        font-size: 16px;
      }

      .pin-box {
        flex-direction: row;
        flex-wrap: nowrap;
        column-gap: 8px;
        row-gap: 0;
        max-width: 100%;
      }

      .pin-input {
        width: 140px;
        flex: 0 0 auto;
      }

      .pin-wrap {
        min-height: 102px;
        margin-top: 14px;
      }

      .pin-submit {
        width: auto;
        min-width: 84px;
        max-width: none;
        min-height: 44px;
        padding: 9px 14px;
        font-size: 17px;
        letter-spacing: 0.18em;
        flex: 0 0 auto;
      }
    }
