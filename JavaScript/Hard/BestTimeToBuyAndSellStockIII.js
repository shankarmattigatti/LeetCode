/**
 * 123. Best Time to Buy and Sell Stock III
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
  let buy1 = -Infinity,
    sell1 = 0;
  let buy2 = -Infinity,
    sell2 = 0;

  for (let i = 0; i < prices.length; i++) {
    buy1 = Math.max(buy1, -prices[i]);
    sell1 = Math.max(sell1, buy1 + prices[i]);
    buy2 = Math.max(buy2, sell1 - prices[i]);
    sell2 = Math.max(sell2, buy2 + prices[i]);
  }

  return sell2;
};
