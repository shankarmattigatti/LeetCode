/**
 * 19. Remove Nth Node From End of List
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function (head, n) {
  if (n == 0) return head;

  let len = getLength(head);
  if (n >= len) return head.next;

  let curr = head;
  let i = 0, j = len - n - 1;
  while (i < j) {
    i++;
    curr = curr.next;
  }

  curr.next = curr.next.next;
  return head;
};

const getLength = function (node) {
  let len = 0;
  while (node != null) {
    len++;
    node = node.next;
  }
  return len;
};
