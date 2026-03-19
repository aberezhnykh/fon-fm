    :root {
      --space-2: 8px;
      --space-3: 12px;
      --space-4: 16px;
      --space-5: 20px;
      --space-6: 24px;
      --space-8: 32px;
      --space-10: 40px;
      --space-12: 48px;
      --bg: #0e0f11;
      --panel: #1a1b1e;
      --panel-border: rgba(255, 255, 255, 0.08);
      --panel-radius: var(--space-6);
      --panel-min-height: max(500px, calc(100dvh - 40px));
      --panel-padding-y: var(--space-6);
      --panel-padding-x: var(--space-6);
      --panel-gap: var(--space-12);
      --header-height: 72px;
      --footer-height: var(--header-height);
      --ui-btn-height: 44px;
      --ui-btn-radius: var(--space-3);
      --ui-btn-padding-x: var(--space-4);
      --header-gap: var(--space-3);
      --section-gap: var(--space-6);
      --content-gap: var(--space-3);
      --actions-gap: var(--space-3);
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

    .app-shell {
      width: min(100%, 620px);
      min-height: var(--panel-min-height);
      height: var(--panel-min-height);
      border-radius: var(--panel-radius);
      background: var(--panel);
      border: 1px solid var(--panel-border);
    }

    .app-shell[hidden] {
      display: none;
    }

    .app-view[hidden] {
      display: none;
    }

    .app-shell {
      min-height: 100%;
      display: grid;
      grid-template-rows: auto minmax(0, 1fr) auto;
      align-items: stretch;
      gap: var(--panel-gap);
    }

    .app-bar,
    .app-view,
    .app-footer {
      width: 100%;
      padding-inline: var(--panel-padding-x);
    }

    .app-bar {
      min-height: var(--header-height);
      display: grid;
      grid-template-columns: 32px minmax(0, 1fr) 32px;
      align-items: center;
      column-gap: var(--header-gap);
    }

    .app-bar-spacer {
      width: 32px;
      height: 32px;
      grid-column: 1;
      grid-row: 1;
    }

    .app-bar-action {
      display: flex;
      align-items: center;
      justify-content: flex-end;
      grid-column: 3;
      grid-row: 1;
    }

    .app-view {
      display: grid;
      grid-template-rows: minmax(0, 1fr) minmax(0, 1fr);
      min-height: 0;
      gap: var(--section-gap);
    }

    .app-title {
      color: #747b86;
      font-size: 12px;
      line-height: 1.3;
      letter-spacing: 0.08em;
      text-transform: uppercase;
      text-align: center;
      min-height: 44px;
      display: flex;
      align-items: center;
      justify-content: center;
    }

    .app-title-text {
      display: block;
      max-width: 100%;
      overflow: hidden;
      white-space: nowrap;
      text-overflow: ellipsis;
    }

    .hero-stage {
      width: 100%;
      min-height: 0;
      display: flex;
      align-items: center;
      justify-content: center;
    }

    .access-code-input {
      width: min(168px, 40vw);
      height: min(168px, 40vw);
      min-width: 128px;
      min-height: 128px;
      max-width: 168px;
      max-height: 168px;
      border: 4px solid rgba(255, 255, 255, 0.2);
      border-radius: 50%;
      background: var(--field);
      color: var(--text);
      text-align: center;
      font-size: 24px;
      font-weight: 500;
      outline: none;
      letter-spacing: 0.22em;
      text-transform: uppercase;
    }

    .access-code-input[readonly] {
      cursor: default;
    }

    .access-code-input:focus-visible {
      outline: 2px solid var(--focus);
      outline-offset: 4px;
    }

    .ui-btn {
      min-height: var(--ui-btn-height);
      border: 1px solid rgba(255, 255, 255, 0.12);
      border-radius: var(--ui-btn-radius);
      background: transparent;
      color: var(--text);
      font-size: 12px;
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

    .access-action {
      width: auto;
      min-width: 112px;
      min-height: var(--ui-btn-height);
      border: 1px solid rgba(255, 255, 255, 0.12);
      border-radius: var(--ui-btn-radius);
      align-self: center;
    }

    .app-footer {
      min-height: var(--footer-height);
      display: grid;
      place-items: center;
    }

    .app-title {
      cursor: copy;
      -webkit-user-select: text;
      user-select: text;
      grid-column: 2;
      grid-row: 1;
    }

    .app-title-static {
      cursor: default;
      -webkit-user-select: none;
      user-select: none;
    }

    .app-title .code,
    .app-title .title {
      color: inherit;
      font-weight: 400;
      letter-spacing: inherit;
    }

    .app-title .title {
      text-transform: uppercase;
    }

    .app-title.copied {
      color: #8d94a0;
    }

    .primary-control {
      width: min(168px, 40vw);
      height: min(168px, 40vw);
      min-width: 128px;
      min-height: 128px;
      max-width: 168px;
      max-height: 168px;
      border: 4px solid rgba(255, 255, 255, 0.2);
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
      position: relative;
      isolation: isolate;
    }

    .control-orbit {
      position: absolute;
      inset: -8px;
      border-radius: 50%;
      opacity: 0;
      pointer-events: none;
      z-index: 0;
      transition: opacity 3000ms ease;
    }

    .control-orbit::before {
      content: "";
      position: absolute;
      inset: 0;
      border-radius: 50%;
      background:
        conic-gradient(
          from 0deg,
          transparent 0deg,
          transparent 300deg,
          rgba(208, 255, 113, 0.9) 332deg,
          transparent 360deg
        );
      -webkit-mask: radial-gradient(farthest-side, transparent calc(100% - 2px), #000 0);
      mask: radial-gradient(farthest-side, transparent calc(100% - 2px), #000 0);
    }

    .primary-control::after {
      content: "";
      position: absolute;
      inset: -10px;
      border: 2px solid rgba(208, 255, 113, 0);
      border-radius: 50%;
      opacity: 0;
      transform: scale(0.96);
      pointer-events: none;
      transition: opacity 3000ms ease, transform 3000ms ease, border-color 3000ms ease;
    }

    .primary-control.is-playing .control-orbit {
      opacity: 0.88;
      animation: control-orbit-spin 3.2s linear infinite;
    }

    .primary-control.is-stopping .control-orbit {
      opacity: 0;
      animation: control-orbit-spin 3.2s linear infinite;
    }

    .primary-control.is-playing::after {
      animation: player-control-pulse 2.8s ease-out infinite;
    }

    .primary-control:hover {
      background: rgba(255, 255, 255, 0.03);
      border-color: rgba(255, 255, 255, 0.24);
    }

    .primary-control:active {
      transform: scale(0.985);
    }

    .primary-control:disabled {
      cursor: default;
      opacity: 0.72;
    }

    .primary-control:focus-visible {
      outline: 2px solid var(--focus);
      outline-offset: 4px;
    }

    @keyframes player-control-pulse {
      0% {
        opacity: 0;
        transform: scale(0.96);
        border-color: rgba(208, 255, 113, 0);
      }

      24% {
        opacity: 0.5;
        border-color: rgba(208, 255, 113, 0.26);
      }

      100% {
        opacity: 0;
        transform: scale(1.12);
        border-color: rgba(208, 255, 113, 0);
      }
    }

    @keyframes control-orbit-spin {
      to {
        transform: rotate(360deg);
      }
    }

    .icon {
      width: 0;
      height: 0;
      border-style: solid;
      flex: 0 0 auto;
    }

    .icon.play {
      border-width: 20px 0 20px 32px;
      border-color: transparent transparent transparent #d0ff71;
      margin-left: 8px;
    }

    .icon.stop {
      width: 28px;
      height: 28px;
      background: #d0ff71;
      border-radius: 4px;
    }

    .detail-panel {
      width: 100%;
      min-height: 0;
      display: grid;
      grid-template-rows: minmax(0, 1fr) auto;
      align-content: stretch;
      justify-items: center;
      gap: var(--content-gap);
    }

    .detail-primary {
      width: 100%;
      min-height: 0;
      display: flex;
      align-items: center;
      justify-content: center;
    }

    .status-panel {
      width: 100%;
      display: grid;
      align-content: end;
      align-items: center;
      gap: var(--content-gap);
    }

    .primary-status {
      display: flex;
      color: #d0ff71;
      font-size: clamp(28px, 4vw, 40px);
      font-weight: 500;
      line-height: 1.1;
      text-align: center;
      min-height: 0;
      width: 100%;
      align-items: center;
      justify-content: center;
      letter-spacing: -0.03em;
      text-wrap: balance;
    }

    .primary-status.idle {
      color: #d0ff71;
    }

    .status-text {
      width: 100%;
      color: var(--soft);
      font-size: 17px;
      line-height: 1.45;
      text-align: center;
      min-height: 24px;
      text-wrap: balance;
    }

    .confirm-panel {
      width: 100%;
      display: none;
      min-height: 72px;
      align-items: center;
      justify-content: center;
    }

    .confirm-panel.active {
      display: flex;
    }

    .confirm-actions {
      display: flex;
      column-gap: var(--actions-gap);
      row-gap: var(--actions-gap);
      align-items: center;
      justify-content: center;
      flex-wrap: wrap;
      width: 100%;
      max-width: 760px;
    }

    .confirm-action {
      min-width: 112px;
    }

    .confirm-action-secondary {
      color: var(--muted);
    }

    .app-footer-brand {
      color: #747b86;
      font-size: 12px;
      line-height: 1.3;
      text-align: center;
      letter-spacing: 0.08em;
      text-transform: uppercase;
    }

    .app-footer-brand a {
      color: inherit;
      text-decoration: none;
    }

    .app-footer-brand a:hover,
    .app-footer-brand a:focus-visible {
      color: #8d94a0;
    }

    .app-bar-actions {
      display: flex;
      align-items: center;
      justify-content: flex-end;
    }

    .icon-btn {
      width: 32px;
      height: 32px;
      border: 0;
      border-radius: var(--space-2);
      background: transparent;
      color: var(--muted);
      display: inline-flex;
      align-items: center;
      justify-content: center;
      cursor: pointer;
      padding: 0;
      appearance: none;
    }

    .icon-btn-glyph {
      font-size: 24px;
      line-height: 1;
    }

    .icon-btn:hover,
    .icon-btn:focus-visible {
      color: var(--text);
    }

    @media (max-width: 720px) {
      :root {
        --panel-radius: var(--space-5);
        --panel-min-height: max(440px, calc(100dvh - 32px));
        --panel-padding-y: var(--space-5);
        --panel-padding-x: var(--space-4);
        --header-height: 64px;
        --footer-height: var(--header-height);
        --ui-btn-padding-x: var(--space-4);
      }

      .page {
        padding:
          max(16px, var(--safe-top))
          max(16px, var(--safe-right))
          max(16px, var(--safe-bottom))
          max(16px, var(--safe-left));
      }

      .access-code-input {
        width: min(160px, 48vw);
        height: min(160px, 48vw);
      }

      .primary-control {
        width: min(160px, 48vw);
        height: min(160px, 48vw);
      }

      .icon.play {
        border-width: 16px 0 16px 28px;
      }

      .icon.stop {
        width: 28px;
        height: 28px;
      }

      .primary-status {
        min-height: 64px;
      }

      .status-text {
        font-size: 17px;
      }
    }

    @media (max-width: 420px) {
      :root {
        --panel-radius: var(--space-4);
        --panel-min-height: max(400px, calc(100dvh - 24px));
        --panel-padding-y: var(--space-4);
        --panel-padding-x: var(--space-3);
        --header-height: 56px;
        --footer-height: var(--header-height);
        --ui-btn-height: 40px;
        --ui-btn-padding-x: var(--space-3);
        --content-gap: var(--space-2);
        --actions-gap: var(--space-2);
      }

      .page {
        padding:
          max(12px, var(--safe-top))
          max(12px, var(--safe-right))
          max(12px, var(--safe-bottom))
          max(12px, var(--safe-left));
      }

      .access-code-input {
        width: min(144px, 52vw);
        height: min(144px, 52vw);
        font-size: 24px;
      }

      .access-action {
        min-width: 104px;
      }

      .primary-control {
        width: min(144px, 52vw);
        height: min(144px, 52vw);
        min-width: 112px;
        min-height: 112px;
      }

      .icon.play {
        border-width: 16px 0 16px 24px;
      }

      .icon.stop {
        width: 28px;
        height: 28px;
      }

      .primary-status {
        min-height: 64px;
      }

      .status-text {
        font-size: 16px;
      }

      .confirm-actions {
        flex-direction: row;
        flex-wrap: nowrap;
        column-gap: var(--actions-gap);
        row-gap: 0;
        max-width: 100%;
      }

      .confirm-panel {
        min-height: 96px;
      }

      .confirm-action {
        width: auto;
        min-width: 104px;
        max-width: none;
        flex: 0 0 auto;
      }

      .app-bar-actions {
        justify-content: flex-end;
      }
    }
