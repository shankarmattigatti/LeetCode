/**
 * 57. Insert Interval
 * @param {number[][]} intervals
 * @param {number[]} newInterval
 * @return {number[][]}
 */
const insert = function (intervals, newInterval) {
  let i = 0;
  let result = new Array();

  while (i < intervals.length && intervals[i][1] < newInterval[0]) {
    result.push([intervals[i][0], intervals[i][1]]);
    i++;
  }

  while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
    newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
    newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
    i++;
  }

  result.push([newInterval[0], newInterval[1]]);
  while (i < intervals.length) {
    result.push([intervals[i][0], intervals[i][1]]);
    i++;
  }

  return result;
};