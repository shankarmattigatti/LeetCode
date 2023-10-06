/**
 * 343. Integer Break
 * @param {number} n
 * @return {number}
 */
const integerBreak = function (n) {
  if (n <= 3) return n - 1;

  let result = 1;
  while (n > 4) {
    result *= 3;
    n -= 3;
  }

  result *= n;
  return result;
};