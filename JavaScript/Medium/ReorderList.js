/**
 * 143. Reorder List
 * @param {ListNode} head
 * @return {void} Do not return anything, modify head in-place instead.
 */
const reorderList = function (head) {
  if (head == null)
    return;

  let fast = head, slow = head;
  while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
  }

  let headOfFirst = head;
  let headOfSecond = reverse(slow);

  while (headOfFirst != null && headOfSecond != null) {
    let temp = headOfFirst.next;
    headOfFirst.next = headOfSecond;
    headOfFirst = temp;

    temp = headOfSecond.next;
    headOfSecond.next = headOfFirst;
    headOfSecond = temp;
  }

  if (headOfFirst != null)
    headOfFirst.next = null;
};

const reverse = function (node) {
  let prev = null;
  while (node != null) {
    let next = node.next;
    node.next = prev;
    prev = node;
    node = next;
  }
  return prev;
};