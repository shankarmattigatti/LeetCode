/**
 * 1823. Find the Winner of the Circular Game
 * @param {number} n
 * @param {number} k
 * @return {number}
 */
const findTheWinner = function (n, k) {
  let res = 0;
  for (let i = 1; i <= n; i++) {
    res = (res + k) % i;
  }

  return res + 1;
};