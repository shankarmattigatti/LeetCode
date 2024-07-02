/**
 * 350. Intersection of Two Arrays II
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
const intersect = function (nums1, nums2) {
  const countMap = new Map();
  for (const num of nums1) {
    countMap.set(num, (countMap.get(num) || 0) + 1);
  }

  const result = [];
  for (const num of nums2) {
    if (countMap.has(num) && countMap.get(num) > 0) {
      result.push(num);
      countMap.set(num, countMap.get(num) - 1);
    }
  }

  return result;
};