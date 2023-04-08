/**
 * 133. Clone Graph
 * // Definition for a Node.
 * function Node(val, neighbors) {
 *    this.val = val === undefined ? 0 : val;
 *    this.neighbors = neighbors === undefined ? [] : neighbors;
 * };
 */

/**
 * @param {Node} node
 * @return {Node}
 */
var cloneGraph = function (node) {
  if (node === null) return null;

  const queue = [];
  const map = new Map();
  queue.push(node);
  map.set(node, new Node(node.val));

  while (queue.length !== 0) {
    const n = queue.shift();
    for (let neighbor of n.neighbors) {
      if (!map.has(neighbor)) {
        map.set(neighbor, new Node(neighbor.val));
        queue.push(neighbor);
      }

      map.get(n).neighbors.push(map.get(neighbor));
    }
  }

  return map.get(node);
};
