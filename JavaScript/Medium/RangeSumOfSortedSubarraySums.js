/**
 * 1508. Range Sum of Sorted Subarray Sums
 * @param {number[]} nums
 * @param {number} n
 * @param {number} left
 * @param {number} right
 * @return {number}
 */
const rangeSum = function (nums, n, left, right) {
  let MOD = 1e9 + 7;
  let subarraySums = [];
  for (let i = 0; i < n; i++) {
    let currentSum = 0;
    for (let j = i; j < n; j++) {
      currentSum += nums[j];
      subarraySums.push(currentSum);
    }
  }

  let rangeSum = 0;
  subarraySums.sort((a, b) => a - b);
  for (let i = left - 1; i <= right - 1; i++) {
    rangeSum = (rangeSum + subarraySums[i]) % MOD;
  }

  return rangeSum;
};