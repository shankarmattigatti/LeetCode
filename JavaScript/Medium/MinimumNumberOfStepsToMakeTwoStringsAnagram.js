/**
 * 1347. Minimum Number of Steps to Make Two Strings Anagram
 * @param {string} s
 * @param {string} t
 * @return {number}
 */
const minSteps = function (s, t) {
  let count = 0;
  let charCount = new Array(26).fill(0);

  for (let i = 0; i < s.length; i++)
    charCount[s.charCodeAt(i) - 'a'.charCodeAt(0)]++;

  for (let i = 0; i < t.length; i++) {
    if (charCount[t.charCodeAt(i) - 'a'.charCodeAt(0)]-- <= 0)
      count++;
  }

  return count;
};