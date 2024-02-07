/**
 * 451. Sort Characters By Frequency
 * @param {string} s
 * @return {string}
 */
const frequencySort = function (s) {
  const map = new Map();
  for (const ch of s) {
    map.set(ch, (map.get(ch) || 0) + 1);
  }

  const sortedArray = Array.from(map).sort((a, b) => b[1] - a[1]);

  let result = '';
  for (const [char, freq] of sortedArray) {
    result += char.repeat(freq);
  }

  return result;
};