/**
 * 3046. Split the Array
 * @param {number[]} nums
 * @return {boolean}
 */
const isPossibleToSplit = function (nums) {
  let set1 = new Set();
  let set2 = new Set();
  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length; i += 2) {
    if (set1.has(nums[i]))
      return false;

    set1.add(nums[i]);

    if (set2.has(nums[i + 1]))
      return false;

    set2.add(nums[i + 1]);
  }

  return true;
};