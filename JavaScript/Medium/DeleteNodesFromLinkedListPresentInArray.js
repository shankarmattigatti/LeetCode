/**
 * 3217. Delete Nodes From Linked List Present in Array
 * @param {number[]} nums
 * @param {ListNode} head
 * @return {ListNode}
 */
const modifiedList = function (nums, head) {
  const deleteNums = new Set(nums);
  let temp = new ListNode(-1);
  temp.next = head;

  let current = temp;
  while (current.next !== null) {
    if (deleteNums.has(current.next.val)) {
      current.next = current.next.next;
    } else {
      current = current.next;
    }
  }

  return temp.next;
};