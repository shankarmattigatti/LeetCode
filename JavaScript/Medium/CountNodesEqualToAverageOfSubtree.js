/**
 * 2265. Count Nodes Equal to Average of Subtree
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
const averageOfSubtree = function (root) {
  let count = { value: 0 };
  dfs(root, count);
  return count.value;
};

const dfs = function (node, count) {
  if (node === null) {
    return [0, 0];
  }

  const [leftSum, leftCount] = dfs(node.left, count);
  const [rightSum, rightCount] = dfs(node.right, count);

  const currentSum = node.val + leftSum + rightSum;
  const currentCount = 1 + leftCount + rightCount;

  if (node.val === Math.floor(currentSum / currentCount)) {
    count.value++;
  }
  return [currentSum, currentCount];
};
