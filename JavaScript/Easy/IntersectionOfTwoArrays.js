/**
 * 349. Intersection of Two Arrays
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
const intersection = function (nums1, nums2) {
  let set = new Set(nums1);
  let res = new Set();

  for (let num of nums2) {
    if (set.has(num)) {
      res.add(num);
    }
  }

  return Array.from(res);
};