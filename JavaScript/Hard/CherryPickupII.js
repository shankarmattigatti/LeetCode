/**
 * 1463. Cherry Pickup II
 * @param {number[][]} grid
 * @return {number}
 */
const cherryPickup = function (grid) {
  let C = grid[0].length;
  let dp = Array.from({ length: C }, () => Array(C).fill(0));
  let old = Array.from({ length: C }, () => Array(C).fill(0));

  for (let r = grid.length - 1; r >= 0; r--) {
    for (let c1 = Math.min(r, C - 1); c1 >= 0; c1--) {
      for (let c2 = Math.max(c1, C - 1 - r); c2 < C; c2++) {
        let max = 0;
        for (let i = c1 - 1; i <= c1 + 1; i++) {
          for (let j = c2 - 1; j <= c2 + 1; j++) {
            if (i >= 0 && i < C && j >= 0 && j < C && i <= j) max = Math.max(max, old[i][j]);
          }
        }
        dp[c1][c2] = max + grid[r][c1] + (c1 === c2 ? 0 : grid[r][c2]);
      }
    }
    let temp = dp;
    dp = old;
    old = temp;
  }
  return old[0][C - 1];
};