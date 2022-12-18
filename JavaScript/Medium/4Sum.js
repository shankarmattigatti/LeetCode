/**
 * 18. 4Sum
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function (nums, target) {
  let result = [];
  if (nums == null || nums.length < 4) return result;

  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length - 3; i++) {
    if (i != 0 && nums[i] == nums[i - 1]) continue;

    for (let j = i + 1; j < nums.length - 2; j++) {
      if (j != i + 1 && nums[j] == nums[j - 1]) continue;

      let x = j + 1;
      let y = nums.length - 1;
      while (x < y) {
        let sum = nums[i] + nums[j] + nums[x] + nums[y];
        if (sum == target) {
          result.push([nums[i], nums[j], nums[x++], nums[y--]]);

          while (x < y && nums[y] == nums[y + 1]) y--;

          while (x < y && nums[x] == nums[x - 1]) x++;
        } else if (sum < target) {
          x++;
        } else {
          y--;
        }
      }
    }
  }

  return result;
};
