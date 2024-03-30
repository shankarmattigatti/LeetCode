/**
 * 992. Subarrays with K Different Integers
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
const subarraysWithKDistinct = function (nums, k) {
  return slidingWindowAtMost(nums, k) - slidingWindowAtMost(nums, k - 1);
};

const slidingWindowAtMost = function (nums, k) {
  let map = new Map();
  let left = 0, totalCount = 0;
  for (let right = 0; right < nums.length; right++) {
    map.set(nums[right], (map.get(nums[right]) || 0) + 1);

    while (map.size > k) {
      map.set(nums[left], map.get(nums[left]) - 1);
      if (map.get(nums[left]) === 0) {
        map.delete(nums[left]);
      }
      left++;
    }

    totalCount += (right - left + 1);
  }

  return totalCount;
};