/**
 * 2958. Length of Longest Subarray With at Most K Frequency
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
const maxSubarrayLength = function (nums, k) {
  let frequency = new Map();
  let start = 0, n = nums.length;;
  let charsWithFreqOverK = 0, maxLength = 0;

  for (let end = 0; end < n; end++) {
    frequency.set(nums[end], (frequency.get(nums[end]) || 0) + 1);
    if (frequency.get(nums[end]) === k + 1) {
      charsWithFreqOverK++;
    }
    while (charsWithFreqOverK > 0) {
      frequency.set(nums[start], frequency.get(nums[start]) - 1);
      if (frequency.get(nums[start]) === k) {
        charsWithFreqOverK--;
      }
      start++;
    }
    maxLength = Math.max(maxLength, end - start + 1);
  }
  return maxLength;
};