/**
 * 714. Best Time to Buy and Sell Stock with Transaction Fee
 * @param {number[]} prices
 * @param {number} fee
 * @return {number}
 */
var maxProfit = function (prices, fee) {
  let n = prices.length;
  let dp = new Array(n).fill(0).map((_) => new Array(2).fill(0));
  dp[0][0] = 0;
  dp[0][1] = -prices[0] - fee;

  for (let i = 1; i < n; i++) {
    dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
    dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i] - fee);
  }

  return dp[n - 1][0];
};
