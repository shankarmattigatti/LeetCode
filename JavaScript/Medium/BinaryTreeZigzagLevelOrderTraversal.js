/**
 * 103. Binary Tree Zigzag Level Order Traversal
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var zigzagLevelOrder = function (root) {
  let result = [];
  if (!root) return result;

  let leftToRight = true;
  let queue = [];
  queue.push(root);
  while (queue.length > 0) {
    let size = queue.length;
    let list = [];
    for (let i = 0; i < size; i++) {
      let node = queue.shift();

      if (leftToRight) {
        list.push(node.val);
      } else {
        list.unshift(node.val);
      }

      if (node.left) {
        queue.push(node.left);
      }
      if (node.right) {
        queue.push(node.right);
      }
    }
    leftToRight = !leftToRight;
    result.push(list);
  }

  return result;
};
