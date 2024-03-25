/**
 * 442. Find All Duplicates in an Array
 * @param {number[]} nums
 * @return {number[]}
 */
const findDuplicates = function (nums) {
  const duplicates = [];

  for (let i = 0; i < nums.length; i++) {
    const index = Math.abs(nums[i]) - 1;

    if (nums[index] < 0) {
      duplicates.push(index + 1);
    } else {
      nums[index] = -nums[index];
    }
  }

  return duplicates;
};