/**
 * 179. Largest Number
 * @param {number[]} nums
 * @return {string}
 */
const largestNumber = function (nums) {
  nums = nums.map(String);
  nums.sort((a, b) => (b + a) - (a + b));

  return nums[0] === '0' ? '0' : nums.join('');
};