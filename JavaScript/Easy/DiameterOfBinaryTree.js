/**
 * 543. Diameter of Binary Tree
 * @param {TreeNode} root
 * @return {number}
 */
const diameterOfBinaryTree = function (root) {
  if (root == null)
    return 0;

  let a = { ans: 0 };
  height(root, a);
  return a.ans;
};

const height = function (root, a) {
  if (root == null)
    return 0;

  let leftHeight = height(root.left, a);

  let rightHeight = height(root.right, a);

  a.ans = Math.max(a.ans, leftHeight + rightHeight);

  return 1 + Math.max(leftHeight, rightHeight);
};