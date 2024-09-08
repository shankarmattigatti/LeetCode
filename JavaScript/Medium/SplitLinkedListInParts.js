/**
 * 725. Split Linked List in Parts
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode[]}
 */
const splitListToParts = function(head, k) {
    let len = 0;
    let result = new Array(k).fill(null);
    for(let curr = head; curr != null; curr = curr.next) {
        len++;
    }
    
    let n = Math.floor(len / k), r = len % k;
    let curr = head, prev = null;
    for(let i = 0; i < k && curr != null; i++, r--) {
        result[i] = curr;
        for(let j = 0; j < n + (r > 0 ? 1 : 0); j++) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }
    
    return result;
};