/**
 * 67. Add Binary
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function (a, b) {
  let result = "";
  let i = a.length - 1,
    j = b.length - 1,
    carry = 0;
  while (i >= 0 || j >= 0 || carry !== 0) {
    let x = i === -1 ? 0 : parseInt(a.charAt(i));
    let y = j === -1 ? 0 : parseInt(b.charAt(j));

    let sum = x + y + carry;
    if (sum === 3) {
      result = "1" + result;
      carry = 1;
    } else if (sum === 2) {
      result = "0" + result;
      carry = 1;
    } else {
      result = sum + result;
      carry = 0;
    }

    i = i === -1 ? -1 : --i;
    j = j === -1 ? -1 : --j;
  }

  return result;
};
