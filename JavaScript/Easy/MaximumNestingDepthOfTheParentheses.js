/**
 * 1614. Maximum Nesting Depth of the Parentheses
 * @param {string} s
 * @return {number}
 */
const maxDepth = function (s) {
  let maxDepth = 0;
  const stack = [];
  for (let i = 0; i < s.length; i++) {
    const ch = s[i];
    if (ch === '(') {
      stack.push(ch);
    }
    if (ch === ')') {
      if (stack.length > 0 && stack[stack.length - 1] === '(') {
        maxDepth = Math.max(stack.length, maxDepth);
        stack.pop();
      }
    }
  }
  return maxDepth;
};