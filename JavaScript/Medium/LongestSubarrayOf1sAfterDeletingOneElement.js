/**
 * 1493. Longest Subarray of 1's After Deleting One Element
 * @param {number[]} nums
 * @return {number}
 */
var longestSubarray = function (nums) {
  let prevLength = 0, currLength = 0, maxLength = 0;
  for (let num of nums) {
    if (num === 1) {
      currLength++;
    } else {
      prevLength = currLength > 0 ? currLength : 0;
      currLength = 0;
    }
    maxLength = Math.max(maxLength, prevLength + currLength);
  }

  return maxLength === nums.length ? maxLength - 1 : maxLength;
};
