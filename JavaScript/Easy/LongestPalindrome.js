/**
 * 409. Longest Palindrome
 * @param {string} s
 * @return {number}
 */
const longestPalindrome = function (s) {
  if (!s || s.length === 0) {
    return 0;
  }

  let count = 0;
  let set = new Set();

  for (let i = 0; i < s.length; i++) {
    let ch = s.charAt(i);
    if (set.has(ch)) {
      set.delete(ch);
      count++;
    } else {
      set.add(ch);
    }
  }

  return set.size === 0 ? count * 2 : count * 2 + 1;
};