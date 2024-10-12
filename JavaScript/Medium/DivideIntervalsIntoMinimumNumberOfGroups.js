/**
 * 2406. Divide Intervals Into Minimum Number of Groups
 * @param {number[][]} intervals
 * @return {number}
 */
const minGroups = function (intervals) {
  let events = [];
  for (const [start, end] of intervals) {
    events.push([start, 1]);
    events.push([end + 1, -1]);
  }

  events.sort((a, b) => a[0] - b[0] || a[1] - b[1]);
  let maxGroups = 0, currentGroups = 0;
  for (const [time, count] of events) {
    currentGroups += count;
    maxGroups = Math.max(maxGroups, currentGroups);
  }

  return maxGroups;
};