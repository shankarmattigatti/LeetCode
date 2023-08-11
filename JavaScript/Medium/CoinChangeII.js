/**
 * 518. Coin Change II
 * @param {number} amount
 * @param {number[]} coins
 * @return {number}
 */
const change = function (amount, coins) {
  let size = coins.length;
  let dp = Array.from(Array(size + 1), () => Array(amount + 1).fill(0));

  for (let i = 0; i < size + 1; i++) dp[i][0] = 1;

  for (let i = 1; i < size + 1; i++) {
    for (let j = 0; j < amount + 1; j++) {
      if (coins[i - 1] > j) dp[i][j] = dp[i - 1][j];
      else dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
    }
  }

  return dp[size][amount];
};
