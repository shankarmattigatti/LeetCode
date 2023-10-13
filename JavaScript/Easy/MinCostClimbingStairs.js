/**
 * 746. Min Cost Climbing Stairs
 * @param {number[]} cost
 * @return {number}
 */
const minCostClimbingStairs = function (cost) {
  let n = cost.length;
  let dp = new Array(n);
  for (let i = 0; i < n; i++) {
    if (i < 2) {
      dp[i] = cost[i];
    } else {
      dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
    }
  }

  return Math.min(dp[n - 1], dp[n - 2]);
};
