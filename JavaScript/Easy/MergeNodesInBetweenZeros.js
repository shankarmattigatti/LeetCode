/**
 * 2181. Merge Nodes in Between Zeros
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
var mergeNodes = function (head) {
  let sum = 0;
  let temp = new ListNode(0);
  let curr = head,
    node = temp;
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
