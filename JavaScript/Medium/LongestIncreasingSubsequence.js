/**
 * 300. Longest Increasing Subsequence
 * @param {number[]} nums
 * @return {number}
 */
const lengthOfLIS = function (nums) {
  if (nums.length <= 0)
    return 0;

  let i, j;
  let lis = new Array(nums.length).fill(1);
  for (i = 1; i < nums.length; i++) {
    for (j = 0; j < i; j++) {
      if (nums[i] > nums[j] && lis[i] < lis[j] + 1)
        lis[i] = lis[j] + 1;
    }
  }

  let max = lis[0];
  for (i = 0; i < nums.length; i++) {
    max = Math.max(max, lis[i]);
  }

  return max;
};