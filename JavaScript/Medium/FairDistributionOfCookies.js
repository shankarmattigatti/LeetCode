/**
 * 2305. Fair Distribution of Cookies
 * @param {number[]} cookies
 * @param {number} k
 * @return {number}
 */
const distributeCookies = function (cookies, k) {
  let res = Number.MAX_VALUE;
  res = dfs(cookies, 0, new Array(k).fill(0), res);
  return res;
};

const dfs = function (cookies, cur, children, res) {
  if (cur === cookies.length) {
    let max = children.reduce((acc, c) => Math.max(acc, c), 0);
    res = Math.min(res, max);
  } else {
    for (let i = 0; i < children.length; i++) {
      children[i] += cookies[cur];
      res = dfs(cookies, cur + 1, children, res);
      children[i] -= cookies[cur];
    }
  }

  return res;
};
