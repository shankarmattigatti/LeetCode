/**
 * 1481. Least Number of Unique Integers after K Removals
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
const findLeastNumOfUniqueInts = function (nums, k) {
  let map = new Map();
  nums.forEach(num => {
    map.set(num, (map.get(num) || 0) + 1);
  });

  let pq = Array.from(map.keys()).sort((a, b) => map.get(a) - map.get(b));
  while (k > 0 && pq.length > 0) {
    k -= map.get(pq.shift());
  }

  return k < 0 ? pq.length + 1 : pq.length;
};