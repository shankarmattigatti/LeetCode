/**
 * 983. Minimum Cost For Tickets
 * @param {number[]} days
 * @param {number[]} costs
 * @return {number}
 */
const mincostTickets = function (days, costs) {
  const n = days.length;
  const dp = new Array(n).fill(0);

  for (let i = n - 1; i >= 0; i--) {
    let oneDayPass = costs[0] + (i + 1 < n ? dp[i + 1] : 0);

    let j = i;
    while (j < n && days[j] < days[i] + 7) j++;
    let sevenDayPass = costs[1] + (j < n ? dp[j] : 0);

    j = i;
    while (j < n && days[j] < days[i] + 30) j++;
    let thirtyDayPass = costs[2] + (j < n ? dp[j] : 0);

    dp[i] = Math.min(oneDayPass, sevenDayPass, thirtyDayPass);
  }

  return dp[0];
};