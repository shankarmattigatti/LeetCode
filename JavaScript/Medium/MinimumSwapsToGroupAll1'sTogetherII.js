/**
 * 2134. Minimum Swaps to Group All 1's Together II
 * @param {number[]} nums
 * @return {number}
 */
const minSwaps = function (nums) {
  const totalOnes = nums.reduce((sum, num) => sum + num, 0);

  if (totalOnes === 0) return 0;

  let windowSize = totalOnes;
  let zeroCount = 0;

  for (let i = 0; i < windowSize; i++) {
    if (nums[i] === 0) zeroCount++;
  }

  let minSwaps = zeroCount;
  for (let i = windowSize; i < nums.length + windowSize; i++) {
    if (nums[i % nums.length] === 0) zeroCount++;
    if (nums[(i - windowSize) % nums.length] === 0) zeroCount--;

    minSwaps = Math.min(minSwaps, zeroCount);
  }

  return minSwaps;
};