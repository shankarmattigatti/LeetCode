/**
 * 74. Search a 2D Matrix
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
const searchMatrix = function (matrix, target) {
  for (let i = 0; i < matrix.length; i++) {
    let low = 0, high = matrix[i].length - 1;
    while (low <= high) {
      let mid = Math.floor((low + high) / 2);
      if (matrix[i][mid] == target) {
        return true;
      } else if (target < matrix[i][mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
  }
  return false;
};
