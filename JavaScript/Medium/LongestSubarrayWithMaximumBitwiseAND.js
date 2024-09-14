/**
 * 2419. Longest Subarray With Maximum Bitwise AND
 * @param {number[]} nums
 * @return {number}
 */
const longestSubarray = function (nums) {
  let maxLen = 0, currentLen = 0;
  const maxNum = Math.max(...nums);
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === maxNum) {
      currentLen++;
    } else {
      currentLen = 0;
    }

    maxLen = Math.max(maxLen, currentLen);
  }

  return maxLen;
};