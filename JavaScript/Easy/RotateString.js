/**
 * 796. Rotate String
 * @param {string} s
 * @param {string} goal
 * @return {boolean}
 */
const rotateString = function (s, goal) {
  if (s === goal) return true;
  for (let i = 0; i < s.length - 1; i++) {
    let subStr = s.substring(0, i + 1);
    let remStr = s.substring(i + 1, s.length);
    let word = remStr + subStr;
    if (word === goal)
      return true;
  }

  return false;
};