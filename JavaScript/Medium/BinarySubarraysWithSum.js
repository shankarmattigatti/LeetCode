/**
 * 930. Binary Subarrays With Sum
 * @param {number[]} nums
 * @param {number} goal
 * @return {number}
 */
const numSubarraysWithSum = function (nums, goal) {
  let prefixSum = 0, count = 0;
  const map = new Map();
  map.set(0, 1);

  for (let num of nums) {
    prefixSum += num;
    if (map.has(prefixSum - goal)) {
      count += map.get(prefixSum - goal);
    }
    map.set(prefixSum, (map.get(prefixSum) || 0) + 1);
  }

  return count;
};