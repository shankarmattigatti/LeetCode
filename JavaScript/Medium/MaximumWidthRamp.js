/**
 * 962. Maximum Width Ramp
 * @param {number[]} nums
 * @return {number}
 */
const maxWidthRamp = function (nums) {
  let stack = [];
  let n = nums.length, maxWidth = 0;
  for (let i = 0; i < n; i++) {
    if (stack.length === 0 || nums[stack[stack.length - 1]] > nums[i]) {
      stack.push(i);
    }
  }

  for (let j = n - 1; j >= 0; j--) {
    while (stack.length > 0 && nums[stack[stack.length - 1]] <= nums[j]) {
      maxWidth = Math.max(maxWidth, j - stack.pop());
    }
  }

  return maxWidth;
};