/**
 * 2616. Minimize the Maximum Difference of Pairs
 * @param {number[]} nums
 * @param {number} p
 * @return {number}
 */
const minimizeMax = function (nums, p) {
  nums.sort((a, b) => a - b);

  let left = 0, right = nums[nums.length - 1] - nums[0];
  let res = right;
  while (left <= right) {
    let mid = left + Math.floor((right - left) / 2);
    if (canFormPairs(nums, mid, p)) {
      res = mid;
      right = mid - 1;
    } else {
      left = mid + 1;
    }
  }

  return res;
};

const canFormPairs = function (nums, d, p) {
  let used = Array(nums.length).fill(false);
  let pairs = 0;

  for (let i = 0; i < nums.length; i++) {
    if (used[i]) continue;

    let j = i + 1;
    while (j < nums.length && (used[j] || nums[j] - nums[i] <= d)) {
      if (!used[j] && nums[j] - nums[i] <= d) {
        pairs++;
        used[i] = true;
        used[j] = true;
        break;
      }
      j++;
    }
  }

  return pairs >= p;
};
