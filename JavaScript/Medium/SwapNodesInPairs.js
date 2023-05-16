/**
 * 24. Swap Nodes in Pairs
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function (head) {
  let node = new ListNode(0);
  node.next = head;
  let curr = node;
  while (curr.next != null && curr.next.next != null) {
    let first = curr.next;
    let second = curr.next.next;
    first.next = second.next;
    curr.next = second;
    curr.next.next = first;
    curr = curr.next.next;
  }
  return node.next;
};
