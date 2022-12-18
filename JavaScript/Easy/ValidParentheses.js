/**
 * 20. Valid Parentheses
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  let stack = [];
  for (let ch of s) {
    if (ch == "(" || ch == "{" || ch == "[") {
      stack.push(ch);
    } else {
      if (stack.length == 0 || !compare(stack.pop(), ch)) {
        return false;
      }
    }
  }
  return stack.length == 0;
};

const compare = function (i, j) {
  if (i == "(" && j == ")") return true;
  if (i == "[" && j == "]") return true;
  if (i == "{" && j == "}") return true;

  return false;
};
