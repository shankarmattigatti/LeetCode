/**
 * 2009. Minimum Number of Operations to Make Array Continuous
 * @param {number[]} nums
 * @return {number}
 */
const minOperations = function (nums) {
  let n = nums.length;
  nums = [...new Set(nums)].sort((a, b) => a - b);

  let minOps = n;
  for (let i = 0; i < nums.length; i++) {
    let start = nums[i];
    let end = start + n - 1;

    let index = bisectRight(nums, end);

    let uniqueLen = index - i;
    minOps = Math.min(minOps, n - uniqueLen);
  }

  return minOps;
};

const bisectRight = function (arr, target) {
  let left = 0, right = arr.length;
  while (left < right) {
    let mid = Math.floor((left + right) / 2);
    if (target < arr[mid]) {
      right = mid;
    } else {
      left = mid + 1;
    }
  }
  return left;
}