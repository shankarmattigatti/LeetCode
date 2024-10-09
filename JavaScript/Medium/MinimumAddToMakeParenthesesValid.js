/**
 * 921. Minimum Add to Make Parentheses Valid
 * @param {string} s
 * @return {number}
 */
const minAddToMakeValid = function (s) {
  let stack = new Array();
  for (let ch of s) {
    if (stack.length > 0) {
      if (isMatchingPair(stack[stack.length - 1], ch))
        stack.pop();
      else
        stack.push(ch);
    } else {
      stack.push(ch);
    }
  }
  return stack.length;
};

const isMatchingPair = function (ch1, ch2) {
  return ch1 == '(' && ch2 == ')';
}