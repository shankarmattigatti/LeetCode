/**
 * 238. Product of Array Except Self
 * @param {number[]} nums
 * @return {number[]}
 */
const productExceptSelf = function (nums) {
  let len = nums.length;
  let left = new Array(len), right = new Array(len);
  left[0] = 1, right[len - 1] = 1;

  for (let i = 1; i < len; i++) {
    left[i] = left[i - 1] * nums[i - 1];
  }

  for (let i = len - 2; i >= 0; i--) {
    right[i] = right[i + 1] * nums[i + 1];
  }

  let result = new Array(len);
  for (let i = 0; i < len; i++) {
    result[i] = left[i] * right[i];
  }

  return result;
};