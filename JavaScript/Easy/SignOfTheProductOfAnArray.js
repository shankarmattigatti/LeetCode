/**
 * 1822. Sign of the Product of an Array
 * @param {number[]} nums
 * @return {number}
 */
var arraySign = function (nums) {
  let counter = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] == 0) return 0;

    if (nums[i] < 0) counter++;
  }
  return counter % 2 == 0 ? 1 : -1;
};
