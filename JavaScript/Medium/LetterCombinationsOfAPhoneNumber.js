/**
 * 17. Letter Combinations of a Phone Number
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function (digits) {
  if (!digits.length) return [];
  const mapping = ['', '', 'abc', 'def', 'ghi', 'jkl', 'mno', 'pqrs', 'tuv', 'wxyz'];
  let result = [""];

  for (const digit of digits) {
    const letters = mapping[digit];
    const temp = [];
    for (const letter of letters) {
      for (const combination of result) {
        temp.push(combination + letter);
      }
    }
    result = temp;
  }

  return result;
};
