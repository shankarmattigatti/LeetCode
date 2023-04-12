/**
 * 71. Simplify Path
 * @param {string} path
 * @return {string}
 */
var simplifyPath = function (path) {
  const stack = [];
  const dirs = path.split("/");
  for (const dir of dirs) {
    if (stack.length && dir === "..") {
      stack.pop();
    } else if (dir !== "." && dir !== "" && dir !== "..") {
      stack.push(dir);
    }
  }

  const list = [...stack];
  return "/" + list.join("/");
};
