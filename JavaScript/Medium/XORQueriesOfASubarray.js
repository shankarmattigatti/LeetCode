/**
 * 1310. XOR Queries of a Subarray
 * @param {number[]} arr
 * @param {number[][]} queries
 * @return {number[]}
 */
const xorQueries = function (arr, queries) {
  let n = arr.length;
  let prefixXor = new Array(n + 1).fill(0);
  for (let i = 0; i < n; i++) {
    prefixXor[i + 1] = prefixXor[i] ^ arr[i];
  }

  let result = [];
  for (let [Li, Ri] of queries) {
    result.push(prefixXor[Ri + 1] ^ prefixXor[Li]);
  }

  return result;
};