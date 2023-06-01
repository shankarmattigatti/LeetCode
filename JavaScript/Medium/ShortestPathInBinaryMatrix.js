/**
 * 1091. Shortest Path in Binary Matrix
 * @param {number[][]} grid
 * @return {number}
 */
var shortestPathBinaryMatrix = function (grid) {
  if (grid[0][0] === 1) return -1;

  const queue = [];
  const dirs = [[1, 0], [1, -1], [1, 1], [0, 1], [0, -1], [-1, 0], [-1, 1], [-1, -1]];

  grid[0][0] = 2;
  queue.push([0, 1]);
  const N = grid.length;

  while (queue.length > 0) {
    const cur = queue.shift();
    if (cur[0] === N * N - 1) return cur[1];

    for (let i = 0; i < 8; i++) {
      const nx = Math.floor(cur[0] / N) + dirs[i][0];
      const ny = (cur[0] % N) + dirs[i][1];

      if (nx < 0 || nx >= N || ny < 0 || ny >= N || grid[nx][ny] !== 0)
        continue;

      queue.push([nx * N + ny, cur[1] + 1]);
      grid[nx][ny] = 2;
    }
  }
  return -1;
};
