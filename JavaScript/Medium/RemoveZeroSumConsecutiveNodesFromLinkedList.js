/**
 * 1171. Remove Zero Sum Consecutive Nodes from Linked List
 * @param {ListNode} head
 * @return {ListNode}
 */
const removeZeroSumSublists = function (head) {
  if (head === null) return head;

  let prefixSum = 0;
  let temp = new ListNode(0);
  temp.next = head;

  let map = new Map();
  map.set(prefixSum, temp);
  for (let i = temp; i !== null; i = i.next) {
    prefixSum += i.val;
    map.set(prefixSum, i);
  }

  prefixSum = 0;
  for (let i = temp; i !== null; i = i.next) {
    prefixSum += i.val;
    i.next = map.get(prefixSum).next;
  }
  return temp.next;
};