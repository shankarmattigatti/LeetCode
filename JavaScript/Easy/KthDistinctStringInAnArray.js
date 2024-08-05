/**
 * 2053. Kth Distinct String in an Array
 * @param {string[]} arr
 * @param {number} k
 * @return {string}
 */
const kthDistinct = function (arr, k) {
  let map = new Map();
  for (let a of arr) {
    map.set(a, (map.get(a) || 0) + 1);
  }

  const distinctStrings = [];
  for (const [str, count] of map.entries()) {
    if (count === 1) {
      distinctStrings.push(str);
    }
  }

  return distinctStrings.length >= k ? distinctStrings[k - 1] : "";
};