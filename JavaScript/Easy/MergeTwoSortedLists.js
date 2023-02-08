/**
 * 21. Merge Two Sorted Lists
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function (list1, list2) {
  let temp = new ListNode(0);
  let curr = temp;
  while (list1 != null && list2 != null) {
    if (list1.val < list2.val) {
      curr.next = new ListNode(list1.val);
      list1 = list1.next;
    } else {
      curr.next = new ListNode(list2.val);
      list2 = list2.next;
    }

    curr = curr.next;
  }

  while (list1 != null) {
    curr.next = new ListNode(list1.val);
    list1 = list1.next;
    curr = curr.next;
  }

  while (list2 != null) {
    curr.next = new ListNode(list2.val);
    list2 = list2.next;
    curr = curr.next;
  }

  return temp.next;
};
