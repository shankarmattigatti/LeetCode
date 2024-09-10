/**
 * 2807. Insert Greatest Common Divisors in Linked List
 * @param {ListNode} head
 * @return {ListNode}
 */
const insertGreatestCommonDivisors = function (head) {
  if (!head || !head.next)
    return head;

  let current = head;
  while (current && current.next) {
    let val1 = current.val;
    let val2 = current.next.val;

    let gcdVal = gcd(val1, val2);
    let gcdNode = new ListNode(gcdVal);

    gcdNode.next = current.next;
    current.next = gcdNode;

    current = gcdNode.next;
  }

  return head;
};

const gcd = function (a, b) {
  if (b === 0)
    return a;

  return gcd(b, a % b);
};