/**
 * 783. Minimum Distance Between BST Nodes
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var minDiffInBST = function (root) {
  if (root === null) return 0;

  let min = Number.MAX_SAFE_INTEGER;
  const stack = [];
  let curr = root,
    prev = null;
  while (curr !== null || stack.length > 0) {
    if (curr !== null) {
      stack.push(curr);
      curr = curr.left;
    } else {
      curr = stack.pop();
      if (prev !== null) {
        min = Math.min(min, curr.val - prev.val);
      }
      prev = curr;
      curr = curr.right;
    }
  }
  return min;
};
