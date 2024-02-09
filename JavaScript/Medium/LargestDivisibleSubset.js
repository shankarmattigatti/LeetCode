/**
 * 368. Largest Divisible Subset
 * @param {number[]} nums
 * @return {number[]}
 */
const largestDivisibleSubset = function (nums) {
  nums.sort((a, b) => a - b);
  const parent = new Array(nums.length);
  const count = new Array(nums.length).fill(0);
  let max = 0, maxIndex = -1;

  for (let i = nums.length - 1; i >= 0; i--) {
    for (let j = i; j < nums.length; j++) {
      if (nums[j] % nums[i] === 0 && count[i] < 1 + count[j]) {
        count[i] = 1 + count[j];
        parent[i] = j;
        if (count[i] > max) {
          max = count[i];
          maxIndex = i;
        }
      }
    }
  }

  const res = [];
  for (let i = 0; i < max; i++) {
    res.push(nums[maxIndex]);
    maxIndex = parent[maxIndex];
  }
  return res;
};