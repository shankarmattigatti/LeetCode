/**
 * 2108. Find First Palindromic String in the Array
 * @param {string[]} words
 * @return {string}
 */
const firstPalindrome = function (words) {
  for (let i = 0; i < words.length; i++) {
    if (isPalindrome(words[i])) {
      return words[i];
    }
  }
  return '';
};

const isPalindrome = function (str) {
  return str === str.split('').reverse().join('');
};