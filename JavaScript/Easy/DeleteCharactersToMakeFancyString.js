/**
 * 1957. Delete Characters to Make Fancy String
 * @param {string} s
 * @return {string}
 */
const makeFancyString = function (s) {
  let freq = 1;
  let result = s[0], prev = s[0];
  for (let i = 1; i < s.length; i++) {
    if (prev === s[i]) {
      freq++;
    } else {
      prev = s[i];
      freq = 1;
    }

    if (freq < 3) {
      result += s[i];
    }
  }

  return result;
};