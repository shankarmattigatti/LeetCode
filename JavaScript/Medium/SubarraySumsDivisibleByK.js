/**
 * 974. Subarray Sums Divisible by K
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
const subarraysDivByK = function (nums, k) {
  const map = new Map();
  map.set(0, 1);

  let count = 0, prefixSum = 0;
  for (let num of nums) {
    prefixSum += num;
    let remainder = prefixSum % k;

    if (remainder < 0) {
      remainder += k;
    }

    if (map.has(remainder)) {
      count += map.get(remainder);
      map.set(remainder, map.get(remainder) + 1);
    } else {
      map.set(remainder, 1);
    }
  }

  return count;
};