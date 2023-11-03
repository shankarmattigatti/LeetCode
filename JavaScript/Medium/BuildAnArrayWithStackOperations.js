/**
 * 1441. Build an Array With Stack Operations
 * @param {number[]} target
 * @param {number} n
 * @return {string[]}
 */
const buildArray = function (target, n) {
  let result = new Array();
  let i = 1, j = 0;
  while (i <= n) {
    if (j == target.length) break;

    if (i == target[j]) {
      result.push("Push");
      j++;
    } else {
      result.push("Push");
      result.push("Pop");
    }
    i++;
  }
  return result;
};
