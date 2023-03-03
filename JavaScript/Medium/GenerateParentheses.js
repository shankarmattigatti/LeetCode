/**
 * 22. Generate Parentheses
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function (n) {
  const result = [];
  const queue = [];
  queue.push({ str: "", openCount: 0, closeCount: 0 });
  while (queue.length > 0) {
    const ps = queue.shift();
    if (ps.openCount === n && ps.closeCount === n) {
      result.push(ps.str);
    } else {
      if (ps.openCount < n) {
        queue.push({
          str: ps.str + "(",
          openCount: ps.openCount + 1,
          closeCount: ps.closeCount,
        });
      }
      if (ps.openCount > ps.closeCount) {
        queue.push({
          str: ps.str + ")",
          openCount: ps.openCount,
          closeCount: ps.closeCount + 1,
        });
      }
    }
  }
  return result;
};
