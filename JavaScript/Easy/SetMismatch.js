/**
 * 645. Set Mismatch
 * @param {number[]} nums
 * @return {number[]}
 */
const findErrorNums = function (nums) {
  let set = new Set();
  let len = nums.length, duplicate = 0;
  let sum = (len * (len + 1)) / 2;
  for (let num of nums) {
    if (set.has(num))
      duplicate = num;

    sum -= num;
    set.add(num);
  }

  return [duplicate, sum + duplicate];
};