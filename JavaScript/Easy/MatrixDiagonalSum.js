/**
 * 1572. Matrix Diagonal Sum
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function (mat) {
  let len = mat.length,
    sum = 0;
  for (let i = 0; i < len; i++) {
    sum += mat[i][i] + mat[i][len - i - 1];
  }

  if (len % 2 == 0) {
    return sum;
  } else {
    let index = Math.floor(len / 2);
    return sum - mat[index][index];
  }
};
