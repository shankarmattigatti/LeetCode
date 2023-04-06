/**
 * 1254. Number of Closed Islands
 * @param {number[][]} grid
 * @return {number}
 */
var closedIsland = function (grid) {
  let count = 0;
  const rows = grid.length;
  const cols = grid[0].length;
  for (let row = 0; row < rows; row++) {
    for (let col = 0; col < cols; col++) {
      if (bfs(grid, row, col, rows, cols)) {
        count++;
      }
    }
  }

  return count;
};

const bfs = function (grid, row, col, rows, cols) {
  if (grid[row][col] != 0) return false;

  let queue = [[row, col]];
  let isClosed = true;
  while (queue.length) {
    let [r, c] = queue.shift();

    if (r < 0 || c < 0 || r >= rows || c >= cols) {
      isClosed = false;
      continue;
    }

    if (grid[r][c] !== 0) {
      continue;
    }

    grid[r][c] = 2;

    queue.push([r + 1, c]);
    queue.push([r - 1, c]);
    queue.push([r, c + 1]);
    queue.push([r, c - 1]);
  }

  return isClosed;
};
