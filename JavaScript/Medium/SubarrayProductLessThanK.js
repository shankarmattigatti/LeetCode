/**
 * 713. Subarray Product Less Than K
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
const numSubarrayProductLessThanK = function (nums, k) {
  if (k <= 1)
    return 0;

  let product = 1, totalCount = 0;
  for (let left = 0, right = 0; right < nums.length; right++) {
    product *= nums[right];
    while (product >= k) {
      product /= nums[left++];
    }

    totalCount += right - left + 1;
  }

  return totalCount;
};