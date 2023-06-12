/**
 * 228. Summary Ranges
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function (nums) {
  const ranges = [];
  let i = 0;
  while (i < nums.length) {
    const start = nums[i];
    while (nums[i + 1] === nums[i] + 1) {
      i++;
    }
    if (start === nums[i]) {
      ranges.push(start.toString());
    } else {
      ranges.push(start.toString() + "->" + nums[i].toString());
    }
    i++;
  }
  return ranges;
};
