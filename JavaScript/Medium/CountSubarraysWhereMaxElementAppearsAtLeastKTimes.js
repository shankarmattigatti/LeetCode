/**
 * 2962. Count Subarrays Where Max Element Appears at Least K Times
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
const countSubarrays = function (nums, k) {
  let result = 0;
  const max = Math.max(...nums);
  const indexesOfMax = new Array();

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === max) {
      indexesOfMax.push(i);
    }

    let freq = indexesOfMax.length;
    if (freq >= k) {
      result += indexesOfMax[freq - k] + 1;
    }
  }

  return result;
};