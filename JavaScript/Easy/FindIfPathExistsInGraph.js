/**
 * 1971. Find if Path Exists in Graph
 * @param {number} n
 * @param {number[][]} edges
 * @param {number} source
 * @param {number} destination
 * @return {boolean}
 */
const validPath = function (n, edges, source, destination) {
  if (source === destination) {
    return true;
  }

  const graph = new Array(n).fill(0).map(() => []);
  edges.forEach(([u, v]) => {
    graph[u].push(v);
    graph[v].push(u);
  });

  const queue = [source];
  const visited = new Set();
  visited.add(source);

  while (queue.length > 0) {
    const node = queue.shift();
    for (let neighbor of graph[node]) {
      if (neighbor === destination) {
        return true;
      }

      if (!visited.has(neighbor)) {
        visited.add(neighbor);
        queue.push(neighbor);
      }
    }
  }

  return false;
};