/**
 * 59. Spiral Matrix II
 * @param {number} n
 * @return {number[][]}
 */
var generateMatrix = function (n) {
  const matrix = new Array(n).fill().map(() => new Array(n).fill(0));

  let top = 0;
  let bottom = n - 1;
  let left = 0;
  let right = n - 1;

  let current = 1;
  while (top <= bottom && left <= right) {
    // Traverse the top row from left to right
    for (let i = left; i <= right; i++) {
      matrix[top][i] = current++;
    }
    top++;

    // Traverse the right column from top to bottom
    for (let i = top; i <= bottom; i++) {
      matrix[i][right] = current++;
    }
    right--;

    // Traverse the bottom row from right to left
    for (let i = right; i >= left; i--) {
      matrix[bottom][i] = current++;
    }
    bottom--;

    // Traverse the left column from bottom to top
    for (let i = bottom; i >= top; i--) {
      matrix[i][left] = current++;
    }
    left++;
  }

  return matrix;
};
