/**
 * 2971. Find Polygon With the Largest Perimeter
 * @param {number[]} nums
 * @return {number}
 */
const largestPerimeter = function (nums) {
  nums.sort((a, b) => a - b);
  let res = -1, cur = 0;
  for (let i = 0; i < nums.length; ++i) {
    if ((cur += nums[i]) > nums[i] * 2) {
      res = cur;
    }
  }
  return res;
};