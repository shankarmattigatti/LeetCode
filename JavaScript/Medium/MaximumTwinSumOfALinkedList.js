/**
 * 2130. Maximum Twin Sum of a Linked List
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number}
 */
var pairSum = function (head) {
  if (head == null) return 0;
  if (head.next == null) return head.val;

  let slow = head,
    fast = head;
  while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
  }
  slow = reverse(slow);
  fast = head;
  let sum = -Infinity;
  while (slow != null) {
    sum = Math.max(slow.val + fast.val, sum);
    slow = slow.next;
    fast = fast.next;
  }
  return sum;
};

const reverse = function (node) {
  let previous = null;
  while (node != null) {
    let next = node.next;
    node.next = previous;
    previous = node;
    node = next;
  }
  return previous;
};
