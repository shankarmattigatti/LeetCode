/**
 * 989. Add to Array-Form of Integer
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
var addToArrayForm = function (num, k) {
  let result = [];
  for (let i = num.length - 1; i >= 0 || k > 0; --i) {
    result.unshift((i >= 0 ? num[i] + k : k) % 10);
    k = Math.floor((i >= 0 ? num[i] + k : k) / 10);
  }

  return result;
};
