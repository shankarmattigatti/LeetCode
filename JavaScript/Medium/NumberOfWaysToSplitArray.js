/**
 * 2270. Number of Ways to Split Array
 * @param {number[]} nums
 * @return {number}
 */
const waysToSplitArray = function (nums) {
  const n = nums.length;
  const totalSum = nums.reduce((sum, num) => sum + num, 0);

  let leftSum = 0;
  let validSplits = 0;
  for (let i = 0; i < n - 1; i++) {
    leftSum += nums[i];
    let rightSum = totalSum - leftSum;

    if (leftSum >= rightSum) {
      validSplits++;
    }
  }

  return validSplits;
};