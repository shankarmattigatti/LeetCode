/**
 * 1110. Delete Nodes And Return Forest
 * @param {TreeNode} root
 * @param {number[]} to_delete
 * @return {TreeNode[]}
 */
const delNodes = function (root, to_delete) {
  const toDeleteSet = new Set(to_delete);
  const forest = [];
  dfs(root, toDeleteSet, forest, true);

  return forest;
};

const dfs = function (node, toDeleteSet, forest, isRoot) {
  if (!node) return null;
  const deleted = toDeleteSet.has(node.val);
  if (isRoot && !deleted) {
    forest.push(node);
  }
  node.left = dfs(node.left, toDeleteSet, forest, deleted);
  node.right = dfs(node.right, toDeleteSet, forest, deleted);
  return deleted ? null : node;
};