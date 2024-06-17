/**
 * 633. Sum of Square Numbers
 * @param {number} c
 * @return {boolean}
 */
const judgeSquareSum = function (c) {
  if (c < 0)
    return false;

  let left = 0, right = Math.round(Math.sqrt(c));
  while (left <= right) {
    let num = (left * left) + (right * right);
    if (num == c)
      return true;
    else if (num < c)
      left++;
    else
      right--;
  }
  return false;
};