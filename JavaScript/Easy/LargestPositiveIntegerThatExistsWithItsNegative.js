/**
 * 2441. Largest Positive Integer That Exists With Its Negative
 * @param {number[]} nums
 * @return {number}
 */
const findMaxK = function (nums) {
  let max = -1;
  let set = new Set(nums);

  for (let num of nums) {
    if (set.has(-num) && num > max) {
      max = num;
    }
  }

  return max;
};