/**
 * 201. Bitwise AND of Numbers Range
 * @param {number} left
 * @param {number} right
 * @return {number}
 */
const rangeBitwiseAnd = function (left, right) {
  let i = 0;
  while ((i | left) < right) {
    i = (i << 1) | 1;
  }

  return left & ~i;
};