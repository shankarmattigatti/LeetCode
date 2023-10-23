/**
 * 342. Power of Four
 * @param {number} n
 * @return {boolean}
 */
const isPowerOfFour = function (n) {
  return n > 0 && (n & (n - 1)) === 0 && (n & 0xAAAAAAAA) === 0;
};