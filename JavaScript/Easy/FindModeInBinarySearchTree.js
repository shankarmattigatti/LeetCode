/**
 * 501. Find Mode in Binary Search Tree
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
const findMode = function (root) {
  let maxCount = 0;
  let currentCount = 0;
  let currentValue = null;
  let mode = [];

  function inOrder(node) {
    if (!node) return;

    inOrder(node.left);

    if (currentValue !== node.val) {
      currentValue = node.val;
      currentCount = 1;
    } else {
      currentCount++;
    }

    if (currentCount > maxCount) {
      maxCount = currentCount;
      mode = [currentValue];
    } else if (currentCount === maxCount) {
      mode.push(currentValue);
    }

    inOrder(node.right);
  }

  inOrder(root);
  return mode;
};
