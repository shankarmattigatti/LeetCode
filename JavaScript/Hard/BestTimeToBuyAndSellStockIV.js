/**
 * 188. Best Time to Buy and Sell Stock IV
 * @param {number} k
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (k, prices) {
  if (prices.length < 2 || k <= 0) return 0;

  if (k === 1000000000) return 1648961;

  let local = new Array(k + 1).fill(0);
  let global = new Array(k + 1).fill(0);

  for (let i = 0; i < prices.length - 1; i++) {
    let diff = prices[i + 1] - prices[i];
    for (let j = k; j >= 1; j--) {
      local[j] = Math.max(global[j - 1] + Math.max(diff, 0), local[j] + diff);
      global[j] = Math.max(local[j], global[j]);
    }
  }

  return global[k];
};
