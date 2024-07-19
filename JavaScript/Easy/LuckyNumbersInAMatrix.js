/**
 * 1380. Lucky Numbers in a Matrix
 * @param {number[][]} matrix
 * @return {number[]}
 */
const luckyNumbers = function (matrix) {
  let result = [];
  for (let i = 0; i < matrix.length; i++) {
    let min = Math.min(...matrix[i]);
    let minIndex = matrix[i].indexOf(min);

    let isLucky = true;
    for (let j = 0; j < matrix.length; j++) {
      if (matrix[j][minIndex] > min) {
        isLucky = false;
        break;
      }
    }

    if (isLucky) {
      result.push(min);
    }
  }

  return result;
};