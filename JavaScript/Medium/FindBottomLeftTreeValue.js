/**
 * 513. Find Bottom Left Tree Value
 * @param {TreeNode} root
 * @return {number}
 */
const findBottomLeftValue = function (root) {
  let queue = [];
  queue.push(root);
  while (queue.length > 0) {
    root = queue.shift();
    if (root.right !== null)
      queue.push(root.right);
    if (root.left !== null)
      queue.push(root.left);
  }

  return root.val;
};