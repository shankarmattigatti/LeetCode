/**
 * 1945. Sum of Digits of String After Convert
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
const getLucky = function (s, k) {
  let numericString = '';
  for (let i = 0; i < s.length; i++) {
    numericString += (s.charCodeAt(i) - 96);
  }

  while (k > 0) {
    let sum = 0;
    for (let i = 0; i < numericString.length; i++) {
      sum += parseInt(numericString[i], 10);
    }
    numericString = sum.toString();
    k--;
  }

  return parseInt(numericString, 10);
};