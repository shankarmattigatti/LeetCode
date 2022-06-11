// 2. Add Two Numbers

// Definition for singly-linked list.
class ListNode {
    val: number
    next: ListNode | null
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val === undefined ? 0 : val)
        this.next = (next === undefined ? null : next)
    }
}

function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
    const temp = new ListNode(0);
    let curr = temp, rem = 0;
    while (l1 != null || l2 != null || rem != 0) {
        let sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + rem;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        rem = Math.floor(sum / 10);

        l1 = l1 == null ? l1 : l1.next;
        l2 = l2 == null ? l2 : l2.next;
    }

    return temp.next;
}