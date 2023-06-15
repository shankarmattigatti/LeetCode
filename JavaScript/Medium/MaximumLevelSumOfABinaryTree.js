/**
 * 1161. Maximum Level Sum of a Binary Tree
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
var maxLevelSum = function (root) {
  if (root === null) return 0;

  let res = 0, level = 1, max = Number.MIN_SAFE_INTEGER;
  let queue = [];
  queue.push(root);
  while (queue.length !== 0) {
    let size = queue.length,
      sum = 0;
    for (let i = 0; i < size; i++) {
      let node = queue.shift();
      sum += node.val;

      if (node.left !== null) queue.push(node.left);
      if (node.right !== null) queue.push(node.right);
    }
    if (sum > max) {
      max = sum;
      res = level;
    }
    level++;
  }
  return res;
};
