/**
 * 826. Most Profit Assigning Work
 * @param {number[]} difficulty
 * @param {number[]} profit
 * @param {number[]} worker
 * @return {number}
 */
const maxProfitAssignment = function (difficulty, profit, worker) {
  let jobs = [];
  for (let i = 0; i < difficulty.length; i++) {
    jobs.push({ difficulty: difficulty[i], profit: profit[i] });
  }

  jobs.sort((a, b) => a.difficulty - b.difficulty || b.profit - a.profit);

  worker.sort((a, b) => a - b);

  let maxProfit = 0, bestProfit = 0, jobIndex = 0;
  for (let i = 0; i < worker.length; i++) {
    while (jobIndex < jobs.length && worker[i] >= jobs[jobIndex].difficulty) {
      bestProfit = Math.max(bestProfit, jobs[jobIndex].profit);
      jobIndex++;
    }
    maxProfit += bestProfit;
  }

  return maxProfit;
};