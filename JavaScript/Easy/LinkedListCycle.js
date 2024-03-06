/**
 * 141. Linked List Cycle
 * @param {ListNode} head
 * @return {boolean}
 */
const hasCycle = function (head) {
  if (head === null || head.next === null)
    return false;

  let slow = head, fast = head;
  while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;

    if (slow === fast)
      break;
  }

  return fast != null && fast.next != null;
};