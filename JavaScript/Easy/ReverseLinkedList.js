/**
 * 206. Reverse Linked List
 * @param {ListNode} head
 * @return {ListNode}
 */
const reverseList = function (head) {
  let curr = head, prev = null;
  while (curr != null) {
    let next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
  }

  return prev;
};