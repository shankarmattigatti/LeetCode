/**
 * 1460. Make Two Arrays Equal by Reversing Subarrays
 * @param {number[]} target
 * @param {number[]} arr
 * @return {boolean}
 */
const canBeEqual = function (target, arr) {
  arr.sort((a, b) => a - b);
  target.sort((a, b) => a - b);
  for (let i = 0; i < target.length; i++) {
    if (target[i] !== arr[i]) {
      return false;
    }
  }

  return true;
};