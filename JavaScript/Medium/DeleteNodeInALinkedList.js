/**
 * 237. Delete Node in a Linked List
 * @param {ListNode} node
 * @return {void} Do not return anything, modify node in-place instead.
 */
const deleteNode = function (node) {
  node.val = node.next.val;
  node.next = node.next.next;
};