/**
 * 1802. Maximum Value at a Given Index in a Bounded Array
 * @param {number} n
 * @param {number} index
 * @param {number} maxSum
 * @return {number}
 */
const maxValue = function (n, index, maxSum) {
  let left = 0,
    right = maxSum - n;
  while (left < right) {
    let mid = Math.floor((left + right + 1) / 2);
    if (check(n, index, maxSum - n, mid)) {
      left = mid;
    } else {
      right = mid - 1;
    }
  }
  return left + 1;
};

const check = function (n, index, maxSum, mid) {
  let leftValue = Math.max(mid - index, 0);
  let rightValue = Math.max(mid - (n - 1 - index), 0);

  let sumBefore = Math.floor(((mid + leftValue) * (mid - leftValue + 1)) / 2);
  let sumAfter = Math.floor(((mid + rightValue) * (mid - rightValue + 1)) / 2);

  return sumBefore + sumAfter - mid <= maxSum;
};
