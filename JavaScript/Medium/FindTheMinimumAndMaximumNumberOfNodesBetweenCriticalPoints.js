/**
 * 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
 * @param {ListNode} head
 * @return {number[]}
 */
const nodesBetweenCriticalPoints = function (head) {
  let first = -1, last = -1, minDist = Infinity;
  let prev = head, curr = head.next, idx = 1;
  let prevCritical = -1;

  while (curr && curr.next) {
    if ((curr.val > prev.val && curr.val > curr.next.val) ||
      (curr.val < prev.val && curr.val < curr.next.val)) {
      if (first === -1) {
        first = idx;
      } else {
        minDist = Math.min(minDist, idx - prevCritical);
      }
      prevCritical = idx;
      last = idx;
    }
    prev = curr;
    curr = curr.next;
    idx++;
  }

  if (first === -1 || first === last) {
    return [-1, -1];
  }
  return [minDist, last - first];
};