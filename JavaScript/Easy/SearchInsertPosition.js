/**
 * 35. Search Insert Position
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function (nums, target) {
  if (nums.length == 0 || target < nums[0]) return 0;

  if (target > nums[nums.length - 1]) return nums.length;

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] == target) return i;
  }

  let index = 0;
  for (let i = 1; i < nums.length; i++) {
    if (target > nums[i - 1] && target < nums[i]) index = i;
  }
  return index;
};
