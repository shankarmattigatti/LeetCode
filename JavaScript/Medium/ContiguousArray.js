/**
 * 525. Contiguous Array
 * @param {number[]} nums
 * @return {number}
 */
const findMaxLength = function (nums) {
  let map = new Map();
  map.set(0, -1);

  let max = 0, count = 0;
  for (let i = 0; i < nums.length; i++) {
    count += nums[i] == 1 ? 1 : -1;
    if (map.has(count)) {
      max = Math.max(max, i - map.get(count));
    } else {
      map.set(count, i);
    }
  }
  return max;
};