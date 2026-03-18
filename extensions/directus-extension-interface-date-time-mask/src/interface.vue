<template>
	<VInput ref="vInput" :model-value="draft" :placeholder="placeholder" :disabled="disabled" @update:model-value="onUpdate" />
</template>
<script>
import { defineComponent, ref, computed, watch, nextTick, onMounted, onUnmounted } from 'vue';

export default defineComponent({
	props: {
		value: { type: String, default: null },
		disabled: { type: Boolean, default: false },
		mode: { type: String, default: 'time' } // 'time' | 'date'
	},
	emits: ['input'],
	setup(props, { emit }) {
		const vInput = ref(null);
		const draft = ref(props.value ?? '');

		const isDate = computed(() => props.mode === 'date');
		const maxDigits = computed(() => (isDate.value ? 8 : 4));
		const placeholder = computed(() => (isDate.value ? '__.__.____' : '__:__'));

		function defaultTimeDigits() {
			return '0000';
		}

		function ensureTimeDefaultValue() {
			if (isDate.value) return;
			if (props.value !== null && props.value !== '') return;
			const digits = defaultTimeDigits();
			const text = format(digits);
			draft.value = text;
			emit('input', text);
		}

		function getNativeInput() {
			return vInput.value?.$el?.querySelector('input') ?? null;
		}

		function digitsOnly(v) {
			return String(v ?? '').replace(/\D/g, '');
		}

		function clampDigits(d) {
			return d.slice(0, maxDigits.value);
		}

		function normalizeTimeDigits(d) {
			const digits = clampDigits(d);
			if (isDate.value || digits.length < 4) return digits;

			const hh = parseInt(digits.slice(0, 2), 10);
			const mm = parseInt(digits.slice(2, 4), 10);
			if (!Number.isFinite(hh) || !Number.isFinite(mm)) return digits;

			const rounded = Math.round(mm / 5) * 5;
			const safeMinutes = rounded >= 60 ? 55 : rounded;

			return `${String(hh).padStart(2, '0')}${String(safeMinutes).padStart(2, '0')}`;
		}

		function format(d) {
			if (!d) return '';
			if (isDate.value) {
				const a = d.slice(0, 2);
				const b = d.slice(2, 4);
				const c = d.slice(4, 8);
				return [a, b, c].filter(Boolean).join('.');
			} else {
				const a = d.slice(0, 2);
				const b = d.slice(2, 4);
				return b ? `${a}:${b}` : a;
			}
		}

		function isComplete(d) {
			return d.length === maxDigits.value;
		}

		function isValid(d) {
			if (!isComplete(d)) return true;

			if (isDate.value) {
				const dd = parseInt(d.slice(0, 2), 10);
				const mm = parseInt(d.slice(2, 4), 10);
				return dd >= 1 && dd <= 31 && mm >= 1 && mm <= 12;
			} else {
				const hh = parseInt(d.slice(0, 2), 10);
				const mm = parseInt(d.slice(2, 4), 10);
				return hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59;
			}
		}

		// проверка "в принципе возможно" (игнорируем невозможные цифры)
		function isPossible(d) {
			return isDate.value ? isPossibleDate(d) : isPossibleTime(d);
		}

		function isPossibleTime(d) {
			// d = "HHMM" (0..4)
			if (!d) return true;

			// H1: 0..2
			if (d.length >= 1) {
				const h1 = d.charCodeAt(0) - 48;
				if (h1 < 0 || h1 > 2) return false;
			}

			// HH <= 23
			if (d.length >= 2) {
				const hh = parseInt(d.slice(0, 2), 10);
				if (hh > 23) return false;
			}

			// M1: 0..5
			if (d.length >= 3) {
				const m1 = d.charCodeAt(2) - 48;
				if (m1 < 0 || m1 > 5) return false;
			}

			// MM <= 59
			if (d.length >= 4) {
				const mm = parseInt(d.slice(2, 4), 10);
				if (mm > 59) return false;
			}

			return true;
		}

		function isPossibleDate(d) {
			// d = "DDMMYYYY" (0..8)
			if (!d) return true;

			// D1: 0..3
			if (d.length >= 1) {
				const d1 = d.charCodeAt(0) - 48;
				if (d1 < 0 || d1 > 3) return false;
			}

			// DD: 01..31
			if (d.length >= 2) {
				const dd = parseInt(d.slice(0, 2), 10);
				if (dd < 1 || dd > 31) return false;
			}

			// M1: 0..1
			if (d.length >= 3) {
				const m1 = d.charCodeAt(2) - 48;
				if (m1 < 0 || m1 > 1) return false;
			}

			// MM: 01..12
			if (d.length >= 4) {
				const mm = parseInt(d.slice(2, 4), 10);
				if (mm < 1 || mm > 12) return false;
			}

			// YYYY: любые
			return true;
		}

		function digitIndexFromCaret(text, caretPos) {
			return digitsOnly(text.slice(0, caretPos)).length;
		}

		function caretPosFromDigitIndex(idx) {
			if (isDate.value) {
				if (idx <= 2) return idx;
				if (idx <= 4) return idx + 1;
				return idx + 2;
			} else {
				if (idx <= 2) return idx;
				return idx + 1;
			}
		}

		function setCaret(idx) {
			const el = getNativeInput();
			if (!el) return;
			const pos = caretPosFromDigitIndex(idx);
			el.setSelectionRange(pos, pos);
		}

		function applyState(newDigits, caretDigitIdx) {
			newDigits = normalizeTimeDigits(clampDigits(newDigits));

			const newText = format(newDigits);
			draft.value = newText;

			nextTick(() => setCaret(caretDigitIdx));

			if (!newDigits) {
				emit('input', null);
				return;
			}

			if (isComplete(newDigits) && isValid(newDigits)) {
				emit('input', newText);
			}
		}

		function revertToSaved() {
			if (props.value === null || props.value === '') {
				draft.value = isDate.value ? '' : format(defaultTimeDigits());
				return;
			}

			const digits = normalizeTimeDigits(clampDigits(digitsOnly(props.value)));
			draft.value = format(digits);
		}

		function onBlur() {
			const d = clampDigits(digitsOnly(draft.value));
			if (!d) return;
			if (!isComplete(d) || !isValid(d)) revertToSaved();
		}

		function onKeydown(e) {
			const el = getNativeInput();
			if (!el) return;

			// навигация
			if (
				e.key === 'Tab' ||
				e.key === 'ArrowLeft' ||
				e.key === 'ArrowRight' ||
				e.key === 'Home' ||
				e.key === 'End'
			) {
				return;
			}

			const curText = draft.value ?? '';
			let d = clampDigits(digitsOnly(curText));

			const selStart = el.selectionStart ?? 0;
			const selEnd = el.selectionEnd ?? 0;

			let startIdx = digitIndexFromCaret(curText, selStart);
			let endIdx = digitIndexFromCaret(curText, selEnd);

			// если выделение — удаляем диапазон цифр
			if (endIdx > startIdx) {
				d = d.slice(0, startIdx) + d.slice(endIdx);
				endIdx = startIdx;
			}

			if (e.key === 'Backspace') {
				e.preventDefault();
				if (startIdx > 0) {
					d = d.slice(0, startIdx - 1) + d.slice(startIdx);
					applyState(d, startIdx - 1);
				} else {
					applyState(d, 0);
				}
				return;
			}

			if (e.key === 'Delete') {
				e.preventDefault();
				if (startIdx < d.length) {
					d = d.slice(0, startIdx) + d.slice(startIdx + 1);
				}
				applyState(d, startIdx);
				return;
			}

			// цифры: overwrite по курсору + игнор невозможных
			if (/^\d$/.test(e.key)) {
				e.preventDefault();

				const ch = e.key;
				if (startIdx >= maxDigits.value) return;

				if (startIdx < d.length) {
					d = d.slice(0, startIdx) + ch + d.slice(startIdx + 1);
				} else {
					d = d + ch;
				}

				if (!isPossible(d)) return; // <-- игнор

				applyState(d, Math.min(startIdx + 1, maxDigits.value));
				return;
			}

			// запрет прочих символов
			if (e.key.length === 1) e.preventDefault();
		}

		// paste/автовставка: отбрасываем невозможные цифры
		function onUpdate(raw) {
			const incoming = clampDigits(digitsOnly(raw));

			let acc = '';
			for (const ch of incoming) {
				const cand = acc + ch;
				if (isPossible(cand)) acc = cand;
			}

			applyState(acc, acc.length);
		}

		onMounted(() => {
			nextTick(() => {
				const el = getNativeInput();
				if (!el) return;
				el.setAttribute('inputmode', 'numeric');
				el.setAttribute('autocomplete', 'off');
				el.addEventListener('keydown', onKeydown);
				el.addEventListener('blur', onBlur);
			});

			ensureTimeDefaultValue();
		});

		onUnmounted(() => {
			const el = getNativeInput();
			if (!el) return;
			el.removeEventListener('keydown', onKeydown);
			el.removeEventListener('blur', onBlur);
		});

		watch(
			() => props.value,
			(v) => {
				if (v === null || v === '') {
					if (isDate.value) {
						draft.value = '';
						return;
					}

					ensureTimeDefaultValue();
					return;
				}

				const digits = normalizeTimeDigits(clampDigits(digitsOnly(v)));
				draft.value = format(digits);
			}
		);

		watch(
			() => props.mode,
			() => {
				if (isDate.value) {
					draft.value = props.value ? format(clampDigits(digitsOnly(props.value))) : '';
					return;
				}

				const d = clampDigits(digitsOnly(draft.value));
				if (!d) {
					ensureTimeDefaultValue();
					return;
				}

				draft.value = format(normalizeTimeDigits(d));
			}
		);

		return { vInput, draft, placeholder, onUpdate };
	}
});
</script>
