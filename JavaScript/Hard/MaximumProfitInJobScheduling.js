/**
 * 1235. Maximum Profit in Job Scheduling
 * @param {number[]} startTime
 * @param {number[]} endTime
 * @param {number[]} profit
 * @return {number}
 */
const jobScheduling = function (startTime, endTime, profit) {
  let n = startTime.length;
  let jobs = [];
  for (let i = 0; i < n; i++) {
    jobs.push({ start: startTime[i], end: endTime[i], profit: profit[i] });
  }

  jobs.sort((a, b) => a.end - b.end);

  let dp = new Array(n).fill(0);
  dp[0] = jobs[0].profit;
  for (let i = 1; i < n; i++) {
    let profitIncludingCurrent = jobs[i].profit;
    let nonConflictIndex = findNonConflictJob(jobs, i);
    if (nonConflictIndex != -1) {
      profitIncludingCurrent += dp[nonConflictIndex];
    }
    dp[i] = Math.max(profitIncludingCurrent, dp[i - 1]);
  }

  return dp[n - 1];
};

const findNonConflictJob = function (jobs, index) {
  let low = 0, high = index - 1;
  while (low <= high) {
    let mid = low + Math.floor((high - low) / 2);
    if (jobs[mid].end <= jobs[index].start) {
      if (mid == index - 1 || jobs[mid + 1].end > jobs[index].start) {
        return mid;
      }
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
  return -1;
};