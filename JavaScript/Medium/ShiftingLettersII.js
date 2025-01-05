/**
 * 2381. Shifting Letters II
 * @param {string} s
 * @param {number[][]} shifts
 * @return {string}
 */
const shiftingLetters = function (s, shifts) {
  let n = s.length;
  const shiftDiff = new Array(n + 1).fill(0);
  for (const [start, end, direction] of shifts) {
    const shiftValue = direction === 1 ? 1 : -1;
    shiftDiff[start] += shiftValue;
    shiftDiff[end + 1] -= shiftValue;
  }

  let cumulative = 0;
  const cumulativeShifts = new Array(n).fill(0);
  for (let i = 0; i < n; i++) {
    cumulative += shiftDiff[i];
    cumulativeShifts[i] = cumulative;
  }

  const result = s.split('').map((char, i) => {
    const shift = (char.charCodeAt(0) - 97 + cumulativeShifts[i]) % 26;
    const newCharCode = (shift + 26) % 26 + 97;
    return String.fromCharCode(newCharCode);
  });

  return result.join('');
};