/**
 * 1992. Find All Groups of Farmland
 * @param {number[][]} land
 * @return {number[][]}
 */
const findFarmland = function (land) {
  let result = [];
  const n = land.length, m = land[0].length;
  for (let row = 0; row < n; row++) {
    for (let col = 0; col < m; col++) {
      if (land[row][col] === 1) {
        let i = row, j = col;

        for (i = row; i < n && land[i][col] === 1; i++) {
          for (j = col; j < m && land[i][j] === 1; j++) {
            land[i][j] = 0;
          }
        }

        result.push([row, col, i - 1, j - 1]);
      }
    }
  }

  return result;
};