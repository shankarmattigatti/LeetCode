/**
 * 1930. Unique Length-3 Palindromic Subsequences
 * @param {string} s
 * @return {number}
 */
const countPalindromicSubsequence = function (s) {
  const uniquePalindromes = new Set();
  const firstOccurrence = Array(26).fill(-1);
  const lastOccurrence = Array(26).fill(-1);

  const charCodeBase = 'a'.charCodeAt(0);
  for (let i = 0; i < s.length; i++) {
    const index = s.charCodeAt(i) - charCodeBase;
    if (firstOccurrence[index] === -1) {
      firstOccurrence[index] = i;
    }
    lastOccurrence[index] = i;
  }

  for (let i = 0; i < 26; i++) {
    if (firstOccurrence[i] !== -1 && lastOccurrence[i] !== -1 && firstOccurrence[i] < lastOccurrence[i]) {
      const seen = new Set();
      for (let j = firstOccurrence[i] + 1; j < lastOccurrence[i]; j++) {
        seen.add(s[j]);
      }
      for (const char of seen) {
        uniquePalindromes.add(String.fromCharCode(i + charCodeBase) + char + String.fromCharCode(i + charCodeBase));
      }
    }
  }

  return uniquePalindromes.size;
};