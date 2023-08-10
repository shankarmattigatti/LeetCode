/**
 * 81. Search in Rotated Sorted Array II
 * @param {number[]} nums
 * @param {number} target
 * @return {boolean}
 */
var search = function (nums, target) {
  let start = 0, end = nums.length - 1;
  while (start <= end) {
    let mid = start + Math.floor((end - start) / 2);
    if (nums[mid] == target) return true;

    if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
      start++;
      end--;
    } else if (nums[start] <= nums[mid]) {
      if (target >= nums[start] && target < nums[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    } else {
      if (target > nums[mid] && target <= nums[end]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
  }
  return false;
};
