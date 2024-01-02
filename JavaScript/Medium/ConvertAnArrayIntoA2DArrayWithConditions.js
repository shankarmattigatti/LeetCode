/**
 * 2610. Convert an Array Into a 2D Array With Conditions
 * @param {number[]} nums
 * @return {number[][]}
 */
const findMatrix = function (nums) {
  const map = new Map();
  for (let i = 0; i < nums.length; i++) {
    if (map.has(nums[i])) {
      map.set(nums[i], map.get(nums[i]) + 1);
    } else {
      map.set(nums[i], 1);
    }
  }

  let res = new Array();
  while (map.size > 0) {
    let arr = new Array();
    map.forEach(function (value, key) {
      arr.push(key);
      map.set(key, value - 1);
      if (map.get(key) == 0) {
        map.delete(key);
      }
    });
    res.push(arr);
  }

  return res;
};
