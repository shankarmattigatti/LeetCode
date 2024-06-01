/**
 * 3110. Score of a String
 * @param {string} s
 * @return {number}
 */
const scoreOfString = function (s) {
  let sum = 0;
  for (let i = 1; i < s.length; i++) {
    let diff = Math.abs(s.charCodeAt(i - 1) - s.charCodeAt(i));
    sum += diff;
  }

  return sum;
};