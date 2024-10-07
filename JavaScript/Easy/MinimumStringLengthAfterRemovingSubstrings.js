/**
 * 2696. Minimum String Length After Removing Substrings
 * @param {string} s
 * @return {number}
 */
const minLength = function (s) {
  let stack = [];
  for (let ch of s) {
    if (stack.length > 0) {
      let last = stack[stack.length - 1];
      if ((last == 'A' && ch == 'B') || (last == 'C' && ch == 'D')) {
        stack.pop();
      } else {
        stack.push(ch);
      }
    } else {
      stack.push(ch);
    }
  }

  return stack.length;
};