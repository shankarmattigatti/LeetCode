/**
 * 2181. Merge Nodes in Between Zeros
 * @param {ListNode} head
 * @return {ListNode}
 */
const mergeNodes = function (head) {
  let sum = 0;
  let temp = new ListNode(0);
  let curr = head, node = temp;
  while (curr != null) {
    if (curr.val == 0 && sum != 0) {
      node.next = new ListNode(sum);
      node = node.next;
      sum = 0;
    } else {
      sum += curr.val;
    }
    curr = curr.next;
  }
  return temp.next;
};