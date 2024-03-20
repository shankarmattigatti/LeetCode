/**
 * 1669. Merge In Between Linked Lists
 * @param {ListNode} list1
 * @param {number} a
 * @param {number} b
 * @param {ListNode} list2
 * @return {ListNode}
 */
const mergeInBetween = function (list1, a, b, list2) {
  let temp = list1;
  let temp1 = temp, temp2 = temp;
  let i = 1, j = 0;
  while (i < a) {
    temp1 = temp1.next;
    i++;
  }

  while (j <= b) {
    temp2 = temp2.next;
    j++;
  }

  temp1.next = list2;
  while (list2.next != null) {
    list2 = list2.next;
  }
  list2.next = temp2;

  return temp;
};