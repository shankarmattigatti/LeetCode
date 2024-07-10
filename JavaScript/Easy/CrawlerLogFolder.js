/**
 * 1598. Crawler Log Folder
 * @param {string[]} logs
 * @return {number}
 */
const minOperations = function (logs) {
  let stack = new Array();
  logs.forEach((log) => {
    if (log === "../") {
      if (stack.length > 0)
        stack.pop();
    } else if (log === "./") {

    } else {
      stack.push(log);
    }
  });

  return stack.length;
};