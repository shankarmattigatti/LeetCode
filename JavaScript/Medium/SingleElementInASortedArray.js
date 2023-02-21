/**
 * 540. Single Element in a Sorted Array
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function (nums) {
  const map = new Map();
  for (const num of nums) {
    map.set(num, (map.get(num) || 0) + 1);
  }
  for (const [key, value] of map.entries()) {
    if (value === 1) {
      return key;
    }
  }

  return -1;
};
