/**
 * 678. Valid Parenthesis String
 * @param {string} s
 * @return {boolean}
 */
const checkValidString = function (s) {
  let low = 0, high = 0;
  for (let i = 0; i < s.length; i++) {
    if (s.charAt(i) === '(') {
      low++;
      high++;
    } else if (s.charAt(i) === ')') {
      if (low > 0)
        low--;

      high--;
    } else {
      if (low > 0)
        low--;

      high++;
    }

    if (high < 0)
      return false;
  }

  return low == 0;
};