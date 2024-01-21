/**
 * 198. House Robber
 * @param {number[]} nums
 * @return {number}
 */
const rob = function (nums) {
  let oddSum = 0, evenSum = 0;
  for (let i = 0; i < nums.length; i++) {
    if (i % 2 == 0) {
      evenSum += nums[i];
      evenSum = evenSum > oddSum ? evenSum : oddSum;
    } else {
      oddSum += nums[i];
      oddSum = evenSum > oddSum ? evenSum : oddSum;
    }
  }
  return Math.max(evenSum, oddSum);
};