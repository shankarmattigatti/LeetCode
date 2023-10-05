/**
 * 229. Majority Element II
 * @param {number[]} nums
 * @return {number[]}
 */
const majorityElement = function (nums) {
  let n = Math.floor(nums.length / 3);
  let res = [];
  let map = new Map();

  for (let num of nums) {
    map.set(num, (map.get(num) || 0) + 1);
  }

  for (let [key, value] of map) {
    if (value > n)
      res.push(key);
  }

  return res;
};