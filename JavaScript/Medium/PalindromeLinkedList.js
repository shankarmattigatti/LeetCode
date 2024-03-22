/**
 * 234. Palindrome Linked List
 * @param {ListNode} head
 * @return {boolean}
 */
const isPalindrome = function (head) {
  if (head === null || head.next === null)
    return true;


  let slow = head, fast = head;
  while (fast !== null && fast.next !== null) {
    slow = slow.next;
    fast = fast.next.next;
  }

  let headSecondHalf = reverse(slow);
  let copyHeadSecondHalf = headSecondHalf;

  while (head !== null && headSecondHalf !== null) {
    if (head.val !== headSecondHalf.val) {
      return false;
    }
    head = head.next;
    headSecondHalf = headSecondHalf.next;
  }

  reverse(copyHeadSecondHalf);
  return true;
};

const reverse = function (head) {
  let prev = null;
  while (head !== null) {
    let next = head.next;
    head.next = prev;
    prev = head;
    head = next;
  }
  return prev;
};