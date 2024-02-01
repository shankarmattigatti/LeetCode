/**
 * 2966. Divide Array Into Arrays With Max Difference
 * @param {number[]} nums
 * @param {number} k
 * @return {number[][]}
 */
const divideArray = function (nums, k) {
  const result = [];
  nums.sort((a, b) => a - b);

  for (let i = 2; i < nums.length; i += 3) {
    if (nums[i] - nums[i - 2] > k)
      return [];

    result.push([nums[i - 2], nums[i - 1], nums[i]]);
  }

  return result;
};