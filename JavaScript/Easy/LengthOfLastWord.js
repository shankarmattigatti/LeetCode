/**
 * 58. Length of Last Word
 * @param {string} s
 * @return {number}
 */
const lengthOfLastWord = function (s) {
  s = s.trim();
  return s.length - s.lastIndexOf(' ') - 1;
};