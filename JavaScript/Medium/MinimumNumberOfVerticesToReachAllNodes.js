/**
 * 1557. Minimum Number of Vertices to Reach All Nodes
 * @param {number} n
 * @param {number[][]} edges
 * @return {number[]}
 */
var findSmallestSetOfVertices = function (n, edges) {
  let result = [];
  let seen = new Array(n).fill(false);

  for (let edge of edges) {
    seen[edge[1]] = true;
  }

  for (let i = 0; i < n; i++) {
    if (!seen[i]) result.push(i);
  }
  return result;
};
