/**
 * 63. Unique Paths II
 * @param {number[][]} obstacleGrid
 * @return {number}
 */
const uniquePathsWithObstacles = function (obstacleGrid) {
  let dp = new Array(obstacleGrid[0].length).fill(0);
  dp[0] = 1;
  for (let row of obstacleGrid) {
    for (let j = 0; j < obstacleGrid[0].length; j++) {
      if (row[j] == 1) 
        dp[j] = 0;
      else if (j > 0) 
        dp[j] += dp[j - 1];
    }
  }

  return dp[obstacleGrid[0].length - 1];
};
