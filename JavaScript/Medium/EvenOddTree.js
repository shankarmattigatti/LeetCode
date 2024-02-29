/**
 * 1609. Even Odd Tree
 * @param {TreeNode} root
 * @return {boolean}
 */
const isEvenOddTree = function (root) {
  if (!root) return true;

  let queue = [];
  queue.push(root);
  let isEven = true;

  while (queue.length > 0) {
    let size = queue.length;
    let prev = isEven ? Number.MIN_SAFE_INTEGER : Number.MAX_SAFE_INTEGER;

    for (let i = 0; i < size; i++) {
      let node = queue.shift();

      if (isEven && (node.val % 2 === 0 || node.val <= prev))
        return false;
      if (!isEven && (node.val % 2 === 1 || node.val >= prev))
        return false;

      prev = node.val;

      if (node.left != null)
        queue.push(node.left);
      if (node.right != null)
        queue.push(node.right);
    }
    isEven = !isEven;
  }
  return true;
};