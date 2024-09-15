/**
 * 1371. Find the Longest Substring Containing Vowels in Even Counts
 * @param {string} s
 * @return {number}
 */
const findTheLongestSubstring = function (s) {
  const map = new Map();
  map.set(0, -1);

  let mask = 0, maxLength = 0;
  for (let i = 0; i < s.length; i++) {
    if (s[i] === 'a') mask ^= 1 << 0;
    if (s[i] === 'e') mask ^= 1 << 1;
    if (s[i] === 'i') mask ^= 1 << 2;
    if (s[i] === 'o') mask ^= 1 << 3;
    if (s[i] === 'u') mask ^= 1 << 4;

    if (map.has(mask)) {
      maxLength = Math.max(maxLength, i - map.get(mask));
    } else {
      map.set(mask, i);
    }
  }

  return maxLength;
};