/**
 * 863. All Nodes Distance K in Binary Tree
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {TreeNode} target
 * @param {number} k
 * @return {number[]}
 */
const distanceK = function (root, target, k) {
  let parent = new Map();
  let result = [];

  dfs(root, null, parent);
  dfsFromTarget(target, null, k, parent, result);

  return result;
};

const dfs = function (node, par, parent) {
  if (node != null) {
    parent.set(node, par);
    dfs(node.left, node, parent);
    dfs(node.right, node, parent);
  }
};

const dfsFromTarget = function (node, par, K, parent, result) {
  if (node == null) return;
  if (K == 0) {
    result.push(node.val);
    return;
  }
  if (node.left != par) dfsFromTarget(node.left, node, K - 1, parent, result);
  if (node.right != par) dfsFromTarget(node.right, node, K - 1, parent, result);
  if (parent.get(node) != par)
    dfsFromTarget(parent.get(node), node, K - 1, parent, result);
};
