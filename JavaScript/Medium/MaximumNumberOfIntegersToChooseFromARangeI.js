/**
 * 2554. Maximum Number of Integers to Choose From a Range I
 * @param {number[]} banned
 * @param {number} n
 * @param {number} maxSum
 * @return {number}
 */
var maxCount = function (banned, n, maxSum) {
  let set = new Set(banned);
  let sum = 0,
    count = 0;
  for (let i = 1; i <= n; i++) {
    if (!set.has(i)) {
      sum += i;
      if (sum > maxSum) {
        sum -= i;
      } else {
        count++;
      }
    }
  }
  return count;
};
