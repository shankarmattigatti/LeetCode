/**
 * 647. Palindromic Substrings
 * @param {string} s
 * @return {number}
 */
const countSubstrings = function (s) {
  let result = 1;
  for (let i = 0; i < s.length - 1; i++) {
    result += countPalindrome(s, i, i);
    result += countPalindrome(s, i, i + 1);
  }

  return result;
};

const countPalindrome = function (s, start, end) {
  let count = 0;
  while (start >= 0 && end < s.length && s[start] === s[end]) {
    count++;
    start--;
    end++;
  }

  return count;
};