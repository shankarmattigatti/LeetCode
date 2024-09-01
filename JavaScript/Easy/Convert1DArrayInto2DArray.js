/**
 * 2022. Convert 1D Array Into 2D Array
 * @param {number[]} original
 * @param {number} m
 * @param {number} n
 * @return {number[][]}
 */
const construct2DArray = function (original, m, n) {
  if (m * n !== original.length)
    return [];

  let result = [];
  for (let i = 0; i < m; i++) {
    result.push(original.slice(i * n, i * n + n));
  }
  return result;
};