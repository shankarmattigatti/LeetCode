/**
 * 455. Assign Cookies
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
const findContentChildren = function (g, s) {
  g.sort((a, b) => a - b);
  s.sort((a, b) => a - b);

  let childIndex = 0, cookieIndex = 0;
  while (childIndex < g.length && cookieIndex < s.length) {
    if (s[cookieIndex] >= g[childIndex]) {
      childIndex++;
    }
    cookieIndex++;
  }

  return childIndex;
};
