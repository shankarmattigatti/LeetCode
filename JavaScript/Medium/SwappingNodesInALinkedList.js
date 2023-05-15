/**
 * 1721. Swapping Nodes in a Linked List
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var swapNodes = function (head, k) {
  if (head == null) return head;

  let curr = head;
  let list = [];
  while (curr != null) {
    list.push(curr);
    curr = curr.next;
  }

  let first = list[k - 1];
  let last = list[list.length - k];

  let temp = first.val;
  first.val = last.val;
  last.val = temp;

  return head;
};
