/**
 * 997. Find the Town Judge
 * @param {number} n
 * @param {number[][]} trust
 * @return {number}
 */
const findJudge = function (n, trust) {
  let cnt = new Array(n).fill(0);
  for (let t of trust) {
    cnt[t[0] - 1]--;
    cnt[t[1] - 1]++;
  }
  for (let i = 0; i < n; i++) {
    if (cnt[i] === n - 1)
      return i + 1;
  }
  return -1;
};