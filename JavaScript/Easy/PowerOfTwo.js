/**
 * 231. Power of Two
 * @param {number} n
 * @return {boolean}
 */
const isPowerOfTwo = function (n) {
  if (n <= 0)
    return false;

  return (n & (n - 1)) === 0;
};