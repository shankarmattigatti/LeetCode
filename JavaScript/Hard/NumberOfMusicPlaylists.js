/**
 * 920. Number of Music Playlists
 * @param {number} n
 * @param {number} goal
 * @param {number} k
 * @return {number}
 */
const numMusicPlaylists = function (n, goal, k) {
  const MOD = 1e9 + 7;
  let dp = Array.from(Array(n + 1), () => Array(goal + 1).fill(0));
  dp[0][0] = 1;

  for (let i = 1; i <= goal; i++) {
    for (let j = 1; j <= n; j++) {
      dp[j][i] = (dp[j - 1][i - 1] * (n - (j - 1))) % MOD;
      if (j > k) {
        dp[j][i] = (dp[j][i] + dp[j][i - 1] * (j - k)) % MOD;
      }
    }
  }

  return dp[n][goal];
};
