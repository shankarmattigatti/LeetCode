/**
 * 945. Minimum Increment to Make Array Unique
 * @param {number[]} nums
 * @return {number}
 */
const minIncrementForUnique = function (nums) {
  if (nums.length === 0) return 0;

  let moves = 0;
  nums.sort((a, b) => a - b);
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] <= nums[i - 1]) {
      let increment = nums[i - 1] - nums[i] + 1;
      nums[i] += increment;
      moves += increment;
    }
  }

  return moves;
};