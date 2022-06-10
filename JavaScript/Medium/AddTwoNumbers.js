// 2. Add Two Numbers

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let temp = new ListNode(0);
    let curr = temp;
    let rem = 0;
    while (l1 != null || l2 != null || rem != 0) { 
        let sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + rem;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        rem = Math.floor(sum / 10);

        l1 = l1 == null ? l1 : l1.next;
        l2 = l2 == null ? l2 : l2.next;
    }

    return temp.next;
};