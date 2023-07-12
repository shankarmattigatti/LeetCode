/**
 * 802. Find Eventual Safe States
 * @param {number[][]} graph
 * @return {number[]}
 */
const eventualSafeNodes = function (graph) {
  const n = graph.length;
  const status = new Array(n).fill(null);

  const result = [];
  for (let i = 0; i < n; ++i) {
    if (dfs(i, graph, status)) {
      result.push(i);
    }
  }

  return result;
};

const dfs = function (node, graph, status) {
  if (status[node] !== null) {
    return status[node] === 1;
  }

  status[node] = 0;

  for (let neighbor of graph[node]) {
    if (!dfs(neighbor, graph, status)) {
      return false;
    }
  }

  status[node] = 1;
  return true;
};
