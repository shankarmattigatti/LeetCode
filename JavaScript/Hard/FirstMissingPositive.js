/**
 * 41. First Missing Positive
 * @param {number[]} nums
 * @return {number}
 */
const firstMissingPositive = function (nums) {
  if (nums.length == 0)
    return 1;

  let i = 0;
  while (i < nums.length) {
    if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]) {
      let temp = nums[nums[i] - 1];
      nums[nums[i] - 1] = nums[i];
      nums[i] = temp;
    } else {
      i++;
    }
  }

  for (i = 0; i < nums.length; i++) {
    if (nums[i] != i + 1)
      return i + 1;
  }

  return nums.length + 1;
};