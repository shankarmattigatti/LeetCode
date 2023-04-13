/**
 * 946. Validate Stack Sequences
 * @param {number[]} pushed
 * @param {number[]} popped
 * @return {boolean}
 */
var validateStackSequences = function (pushed, popped) {
  let stack = [];
  let i = 0;
  for (let j of pushed) {
    stack.push(j);
    while (stack.length > 0 && stack[stack.length - 1] === popped[i]) {
      stack.pop();
      i++;
    }
  }

  return i === popped.length;
};
