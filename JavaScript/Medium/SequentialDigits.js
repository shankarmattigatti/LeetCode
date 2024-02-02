/**
 * 1291. Sequential Digits
 * @param {number} low
 * @param {number} high
 * @return {number[]}
 */
const sequentialDigits = function (low, high) {
  const n = 10;
  const str = "123456789";
  const result = [];

  const lowLength = low.toString().length;
  const highLength = high.toString().length;

  for (let i = lowLength; i < highLength + 1; i++) {
    for (let j = 0; j < n - i; j++) {
      const num = parseInt(str.substring(j, j + i));
      if (num >= low && num <= high) {
        result.push(num);
      }
    }
  }

  return result;
};