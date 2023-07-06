/**
 * 209. Minimum Size Subarray Sum
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function (target, nums) {
  let left = 0, sum = 0, res = Infinity;
  for (let i = 0; i < nums.length; i++) {
    sum += nums[i];
    while (sum >= target) {
      res = Math.min(res, i + 1 - left);
      sum -= nums[left++];
    }
  }
  return res == Infinity ? 0 : res;
};
