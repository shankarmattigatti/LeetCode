/**
 * 1367. Linked List in Binary Tree
 * @param {ListNode} head
 * @param {TreeNode} root
 * @return {boolean}
 */
const isSubPath = function (head, root) {
  if (!root) return false;

  return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
};

const dfs = function (head, root) {
  if (!head) return true;

  if (!root) return false;

  if (head.val === root.val) {
    return dfs(head.next, root.left) || dfs(head.next, root.right);
  }

  return false;
};