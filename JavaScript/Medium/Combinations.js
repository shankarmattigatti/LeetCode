/**
 * 77. Combinations
 * @param {number} n
 * @param {number} k
 * @return {number[][]}
 */
const combine = function (n, k) {
  let result = [];
  combineHelper(1, n, k, [], result);
  return result;
};

const combineHelper = function (start, end, k, list, result) {
  if (k === 0) {
    result.push([...list]);
  } else {
    for (let i = start; i <= end; i++) {
      list.push(i);
      combineHelper(i + 1, end, k - 1, list, result);
      list.pop();
    }
  }
};
