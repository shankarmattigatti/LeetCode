/**
 * 1361. Validate Binary Tree Nodes
 * @param {number} n
 * @param {number[]} leftChild
 * @param {number[]} rightChild
 * @return {boolean}
 */
const validateBinaryTreeNodes = function (n, leftChild, rightChild) {
  let parentCount = Array(n).fill(0);

  for (let i = 0; i < n; i++) {
    if (leftChild[i] !== -1) {
      parentCount[leftChild[i]]++;
    }
    if (rightChild[i] !== -1) {
      parentCount[rightChild[i]]++;
    }
  }

  let rootCount = 0;
  for (let count of parentCount) {
    if (count === 0) {
      rootCount++;
    } else if (count > 1) {
      return false;
    }
  }

  if (rootCount !== 1) return false;

  let seen = new Set();
  let root = parentCount.indexOf(0);

  dfs(root, leftChild, rightChild, seen);

  return seen.size === n;
};

const dfs = function (node, leftChild, rightChild, seen) {
  if (node === -1 || seen.has(node)) return;

  seen.add(node);
  dfs(leftChild[node], leftChild, rightChild, seen);
  dfs(rightChild[node], leftChild, rightChild, seen);
};
