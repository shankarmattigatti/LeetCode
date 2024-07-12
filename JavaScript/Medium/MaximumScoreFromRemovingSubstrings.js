/**
 * 1717. Maximum Score From Removing Substrings
 * @param {string} s
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
const maximumGain = function (s, x, y) {
  let score = { value: 0 };

  if (x > y) {
    s = removeSubstring(s, 'a', 'b', x, score);
    s = removeSubstring(s, 'b', 'a', y, score);
  } else {
    s = removeSubstring(s, 'b', 'a', y, score);
    s = removeSubstring(s, 'a', 'b', x, score);
  }

  return score.value;
};

const removeSubstring = function (s, sub1, sub2, points, score) {
  let stack = [];
  for (let char of s) {
    if (stack.length && stack[stack.length - 1] === sub1 && char === sub2) {
      stack.pop();
      score.value += points;
    } else {
      stack.push(char);
    }
  }
  return stack.join('');
}