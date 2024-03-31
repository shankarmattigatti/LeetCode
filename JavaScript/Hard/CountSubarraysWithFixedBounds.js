/**
 * 2444. Count Subarrays With Fixed Bounds
 * @param {number[]} nums
 * @param {number} minK
 * @param {number} maxK
 * @return {number}
 */
const countSubarrays = function (nums, minK, maxK) {
  let result = 0;
  let minPos = -1, maxPos = -1, leftBound = -1;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] < minK || nums[i] > maxK)
      leftBound = i;

    if (nums[i] == minK)
      minPos = i;
    if (nums[i] == maxK)
      maxPos = i;

    result += Math.max(0, Math.min(maxPos, minPos) - leftBound);
  }

  return result;
};