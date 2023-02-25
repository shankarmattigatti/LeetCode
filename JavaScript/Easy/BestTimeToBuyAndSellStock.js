/**
 * 121. Best Time to Buy and Sell Stock
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
  if (prices.length == 0) return 0;

  let minPrice = prices[0];
  let maxProfit = 0;
  for (let i = 0; i < prices.length; i++) {
    let price = prices[i];
    if (price > minPrice) {
      maxProfit = Math.max(maxProfit, price - minPrice);
    } else {
      minPrice = price;
    }
  }
  return maxProfit;
};
