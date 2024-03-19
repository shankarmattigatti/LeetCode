/**
 * 621. Task Scheduler
 * @param {character[]} tasks
 * @param {number} n
 * @return {number}
 */
const leastInterval = function (tasks, n) {
  if (!tasks || tasks.length === 0)
    return 0;

  const count = new Array(26).fill(0);
  for (let task of tasks) {
    count[task.charCodeAt(0) - 'A'.charCodeAt(0)]++;
  }

  count.sort((a, b) => a - b);
  const max = count[25] - 1;
  let spaces = max * n;

  for (let i = 24; i >= 0; i--) {
    spaces -= Math.min(max, count[i]);
  }

  spaces = Math.max(0, spaces);
  return tasks.length + spaces;
};