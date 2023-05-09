/**
 * 54. Spiral Matrix
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function (matrix) {
  const result = [];
  if (matrix.length == 0) return result;

  let rowBegin = 0,
    rowEnd = matrix.length - 1;
  let colBegin = 0,
    colEnd = matrix[0].length - 1;

  while (rowBegin <= rowEnd && colBegin <= colEnd) {
    // traverse right
    for (let i = colBegin; i <= colEnd; i++) result.push(matrix[rowBegin][i]);

    rowBegin++;
    // travse down
    for (let i = rowBegin; i <= rowEnd; i++) result.push(matrix[i][colEnd]);

    colEnd--;

    if (rowBegin <= rowEnd) {
      for (let i = colEnd; i >= colBegin; i--) result.push(matrix[rowEnd][i]);
    }

    rowEnd--;

    if (colBegin <= colEnd) {
      for (let i = rowEnd; i >= rowBegin; i--) result.push(matrix[i][colBegin]);
    }
    colBegin++;
  }

  return result;
};
