/**
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var maxVowels = function (s, k) {
  let count = 0,
    res = 0,
    start = 0;
  for (let i = 0; i < s.length; i++) {
    if (isVowels(s[i])) count++;
    if (i >= k - 1) {
      res = Math.max(res, count);
      count -= isVowels(s[start++]) ? 1 : 0;
    }
  }

  return res;
};

const isVowels = function (ch) {
  return ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u";
};
