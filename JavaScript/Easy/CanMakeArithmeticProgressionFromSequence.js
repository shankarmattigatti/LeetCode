/**
 * 1502. Can Make Arithmetic Progression From Sequence
 * @param {number[]} arr
 * @return {boolean}
 */
const canMakeArithmeticProgression = function (arr) {
  if (arr.length <= 1) return false;

  arr.sort((a, b) => a - b);
  let diff = arr[1] - arr[0];
  for (let i = 1; i < arr.length - 1; i++) {
    if (arr[i + 1] - arr[i] != diff) return false;
  }
  return true;
};
