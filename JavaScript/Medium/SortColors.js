/**
 * 75. Sort Colors
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
const sortColors = function (nums) {
  let i = 0, j = nums.length - 1;
  for (let k = i; k <= j; k++) {
    if (nums[k] == 0) {
      nums[k] = nums[i];
      nums[i++] = 0;
    }

    if (nums[k] == 2) {
      nums[k] = nums[j];
      nums[j--] = 2;
      k--;
    }
  }
};