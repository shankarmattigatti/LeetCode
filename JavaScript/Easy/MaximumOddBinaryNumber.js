/**
 * 2864. Maximum Odd Binary Number
 * @param {string} s
 * @return {string}
 */
const maximumOddBinaryNumber = function (s) {
  let zeros = 0, ones = 0;
  for (let i = 0; i < s.length; i++) {
    if (s[i] === '1') {
      ones++;
    } else if (s[i] === '0') {
      zeros++;
    }
  }

  return '1'.repeat(ones - 1) + '0'.repeat(zeros) + '1';
};