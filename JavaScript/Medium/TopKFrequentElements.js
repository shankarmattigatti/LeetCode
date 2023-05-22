/**
 * 347. Top K Frequent Elements
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function (nums, k) {
  let result = new Array(k);
  let map = new Map();

  for (let num of nums) {
    map.set(num, (map.get(num) || 0) + 1);
  }

  let reverseSortedMap = new Map(
    [...map.entries()].sort((a, b) => b[1] - a[1])
  );

  let index = 0;
  for (let [key, value] of reverseSortedMap.entries()) {
    if (k === 0) break;

    k--;
    result[index++] = key;
  }

  return result;
};
