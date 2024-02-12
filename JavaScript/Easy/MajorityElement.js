/**
 * 169. Majority Element
 * @param {number[]} nums
 * @return {number}
 */
const majorityElement = function (nums) {
  const map = new Map();
  nums.forEach(num => {
    map.set(num, (map.get(num) || 0) + 1);
  });

  let max = 0;
  let majorNum = 0;
  map.forEach((count, num) => {
    if (count > max) {
      max = count;
      majorNum = num;
    }
  });

  return parseInt(majorNum);
};