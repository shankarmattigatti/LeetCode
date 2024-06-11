/**
 * 1122. Relative Sort Array
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number[]}
 */
const relativeSortArray = function (arr1, arr2) {
  const map = new Map();
  arr2.forEach((val, index) => map.set(val, index));

  arr1.sort((a, b) => {
    if (map.has(a) && map.has(b)) {
      return map.get(a) - map.get(b);
    } else if (map.has(a)) {
      return -1;
    } else if (map.has(b)) {
      return 1;
    } else {
      return a - b;
    }
  });

  return arr1;
};