/**
 * 515. Find Largest Value in Each Tree Row
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
const largestValues = function (root) {
  let res = [];
  if (root == null) {
    return res;
  }

  let queue = [];
  queue.push(root);
  while (queue.length !== 0) {
    let max = Number.MIN_SAFE_INTEGER;
    let size = queue.length;

    for (let i = 0; i < size; i++) {
      let node = queue.shift();
      max = Math.max(max, node.val);

      if (node.left !== null) {
        queue.push(node.left);
      }

      if (node.right !== null) {
        queue.push(node.right);
      }
    }

    res.push(max);
  }
  return res;
};