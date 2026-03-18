    :root {
      --bg: #0e0f11;
      --panel: #1a1b1e;
      --panel-border: rgba(255, 255, 255, 0.08);
      --panel-radius: 24px;
      --panel-min-height: max(500px, calc(100dvh - 40px));
      --panel-padding-y: 28px;
      --panel-padding-x: 24px;
      --content-side-padding: 12px;
      --ui-btn-height: 44px;
      --ui-btn-radius: 12px;
      --ui-btn-padding-x: 18px;
      --text: #e0e4ea;
      --muted: #8e949e;
      --soft: #bcc3cd;
      --button: #f3f4f6;
      --button-text: #0a0b0d;
      --field: #14171c;
      --field-border: rgba(255, 255, 255, 0.1);
      --focus: rgba(255, 255, 255, 0.24);
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

    .setup-screen,
    .player-shell {
      width: min(100%, 620px);
      min-height: var(--panel-min-height);
      border-radius: var(--panel-radius);
      background: var(--panel);
      border: 1px solid var(--panel-border);
    }

    .setup-screen[hidden],
    .player-shell[hidden] {
      display: none;
    }

    .setup-shell {
      min-height: inherit;
      padding: var(--panel-padding-y) var(--panel-padding-x);
      display: grid;
      place-items: center;
      gap: 18px;
      text-align: center;
    }

    .setup-brand {
      color: #747b86;
      font-size: 12px;
      line-height: 1.3;
      letter-spacing: 0.12em;
      text-transform: uppercase;
    }

    .setup-title {
      color: var(--text);
      font-size: 22px;
      line-height: 1.2;
      letter-spacing: -0.03em;
      text-wrap: balance;
    }

    .setup-message {
      min-height: 24px;
      color: var(--soft);
      font-size: 15px;
      line-height: 1.4;
      text-wrap: balance;
    }

    .setup-form {
      width: 100%;
      max-width: 280px;
      display: grid;
      gap: 12px;
    }

    .setup-input {
      width: 100%;
      height: 52px;
      border: 1px solid var(--field-border);
      border-radius: 14px;
      background: var(--field);
      color: var(--text);
      text-align: center;
      font-size: 24px;
      font-weight: 500;
      outline: none;
      letter-spacing: 0.22em;
      text-transform: uppercase;
    }

    .setup-input::placeholder {
      text-transform: uppercase;
    }

    .setup-input:focus-visible {
      outline: 2px solid var(--focus);
      outline-offset: 2px;
    }

    .ui-btn {
      min-height: var(--ui-btn-height);
      border: 1px solid rgba(255, 255, 255, 0.12);
      border-radius: var(--ui-btn-radius);
      background: transparent;
      color: var(--text);
      font-size: 14px;
      font-weight: 500;
      line-height: 1;
      cursor: pointer;
      padding: 0 var(--ui-btn-padding-x);
      letter-spacing: 0.12em;
      text-transform: uppercase;
      appearance: none;
    }

    .ui-btn:focus-visible {
      outline: 2px solid var(--focus);
      outline-offset: 2px;
    }

    .setup-submit {
      width: 100%;
      min-height: var(--ui-btn-height);
      border: 1px solid rgba(255, 255, 255, 0.12);
      border-radius: var(--ui-btn-radius);
    }

    .player-shell {
      display: grid;
      grid-template-rows: auto minmax(170px, 1fr) minmax(140px, auto) auto;
      align-items: center;
      gap: 20px;
      padding: var(--panel-padding-y) var(--panel-padding-x);
    }

    .player-header,
    .player-main,
    .player-footer {
      width: 100%;
    }

    .player-main {
      display: grid;
      align-content: center;
      gap: 20px;
    }

    .player-head {
      color: #747b86;
      text-align: center;
      font-size: 12px;
      line-height: 1.3;
      min-height: 20px;
      padding: 0 4px;
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
      outline: 2px solid var(--focus);
      outline-offset: 4px;
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
      padding: 0 var(--content-side-padding);
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
      padding: 0 4px;
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
      padding: 0 4px;
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

    .pin-submit {
      min-width: 112px;
    }

    .pin-cancel {
      color: var(--muted);
    }

    .player-footer {
      width: 100%;
      min-height: 52px;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: flex-start;
      gap: 6px;
      padding-top: 4px;
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
      padding: 0 4px;
      letter-spacing: 0.08em;
      text-transform: uppercase;
    }

    .player-actions {
      display: flex;
      flex-wrap: wrap;
      align-items: center;
      justify-content: center;
      gap: 10px;
      width: 100%;
      padding-top: 2px;
    }

    .footer-btn {
      min-width: 112px;
    }

    .install-btn {
      color: var(--text);
    }

    .logout-btn {
      color: var(--muted);
    }

    .footer-btn:hover {
      border-color: rgba(255, 255, 255, 0.18);
      background: rgba(255, 255, 255, 0.04);
      transform: translateY(-1px);
    }

    .footer-btn:active {
      transform: translateY(0);
    }

    .logout-btn:hover,
    .logout-btn:focus-visible {
      color: var(--text);
    }

    .install-btn:hover,
    .install-btn:focus-visible {
      outline: none;
      color: var(--text);
    }

    @media (max-width: 720px) {
      :root {
        --panel-radius: 20px;
        --panel-min-height: max(440px, calc(100dvh - 32px));
        --panel-padding-y: 22px;
        --panel-padding-x: 18px;
        --content-side-padding: 8px;
        --ui-btn-padding-x: 16px;
      }

      .page {
        padding:
          max(16px, var(--safe-top))
          max(16px, var(--safe-right))
          max(16px, var(--safe-bottom))
          max(16px, var(--safe-left));
      }

      .player-shell {
        grid-template-rows: auto minmax(156px, 1fr) minmax(128px, auto) auto;
        gap: 20px;
      }

      .player-main {
        gap: 18px;
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
      }

      .stream {
        min-height: 68px;
      }

      .info {
        font-size: 17px;
      }
    }

    @media (max-width: 420px) {
      :root {
        --panel-radius: 18px;
        --panel-min-height: max(400px, calc(100dvh - 24px));
        --panel-padding-y: 18px;
        --panel-padding-x: 14px;
        --content-side-padding: 4px;
        --ui-btn-height: 42px;
        --ui-btn-padding-x: 14px;
      }

      .page {
        padding:
          max(12px, var(--safe-top))
          max(12px, var(--safe-right))
          max(12px, var(--safe-bottom))
          max(12px, var(--safe-left));
      }

      .player-shell {
        grid-template-rows: auto minmax(144px, 1fr) minmax(116px, auto) auto;
        gap: 20px;
      }

      .player-main {
        gap: 16px;
      }

      .setup-title {
        font-size: 20px;
      }

      .setup-input {
        height: 48px;
        font-size: 22px;
      }

      .content-area {
        min-height: 172px;
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

      .pin-wrap {
        min-height: 102px;
        margin-top: 14px;
      }

      .pin-submit {
        width: auto;
        min-width: 104px;
        max-width: none;
        flex: 0 0 auto;
      }

      .player-actions {
        gap: 8px;
      }

      .footer-btn {
        min-width: 104px;
      }
    }
