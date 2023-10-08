/**
 * 1458. Max Dot Product of Two Subsequences
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var maxDotProduct = function (nums1, nums2) {
  const m = nums1.length;
  const n = nums2.length;
  let dp = Array.from({ length: m + 1 }, () => Array(n + 1).fill(-Infinity));

  for (let i = 1; i <= m; i++) {
    for (let j = 1; j <= n; j++) {
      dp[i][j] = nums1[i - 1] * nums2[j - 1];

      if (i > 1 && j > 1) {
        dp[i][j] = Math.max(dp[i][j], nums1[i - 1] * nums2[j - 1] + dp[i - 1][j - 1]);
      }

      dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);

      dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
    }
  }

  return dp[m][n];
};