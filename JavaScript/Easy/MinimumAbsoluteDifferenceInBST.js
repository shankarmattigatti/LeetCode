/**
 * 530. Minimum Absolute Difference in BST
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
var getMinimumDifference = function (root) {
  if (root === null) return 0;

  let min = Number.MAX_SAFE_INTEGER;
  let cur = root, pre = null;
  let stack = [];

  while (cur !== null || stack.length > 0) {
    if (cur !== null) {
      stack.push(cur);
      cur = cur.left;
    } else {
      cur = stack.pop();
      if (pre !== null) 
        min = Math.min(min, cur.val - pre.val);
      pre = cur;
      cur = cur.right;
    }
  }
  return min;
};
