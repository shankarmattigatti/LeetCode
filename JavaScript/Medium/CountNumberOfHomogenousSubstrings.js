/**
 * 1759. Count Number of Homogenous Substrings
 * @param {string} s
 * @return {number}
 */
const countHomogenous = function (s) {
  let count = 0;
  const MOD = 1e9 + 7;
  let currentCharCount = 1;

  for (let i = 1; i < s.length; i++) {
    if (s[i] === s[i - 1]) {
      currentCharCount++;
    } else {
      count = (count + currentCharCount * (currentCharCount + 1) / 2) % MOD;
      currentCharCount = 1;
    }
  }

  count = (count + currentCharCount * (currentCharCount + 1) / 2) % MOD;

  return count;
};