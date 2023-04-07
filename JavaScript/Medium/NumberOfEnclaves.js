/**
 * 1020. Number of Enclaves
 * @param {number[][]} grid
 * @return {number}
 */
var numEnclaves = function (grid) {
  let result = 0;
  for (let i = 0; i < grid.length; i++) {
    for (let j = 0; j < grid[i].length; j++) {
      if (i === 0 || j === 0 || i === grid.length - 1 || j === grid[i].length - 1) {
        dfs(grid, i, j);
      }
    }
  }

  for (let i = 0; i < grid.length; i++) {
    for (let j = 0; j < grid[i].length; j++) {
      if (grid[i][j] === 1) {
        result++;
      }
    }
  }

  return result;
};

const dfs = function (grid, i, j) {
  if (i >= 0 && i <= grid.length - 1 && j >= 0 && j <= grid[i].length - 1 && grid[i][j] === 1) {
    grid[i][j] = 0;
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
  }
};
