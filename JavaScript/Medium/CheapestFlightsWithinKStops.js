/**
 * 787. Cheapest Flights Within K Stops
 * @param {number} n
 * @param {number[][]} flights
 * @param {number} src
 * @param {number} dst
 * @param {number} k
 * @return {number}
 */
const findCheapestPrice = function (n, flights, src, dst, k) {
  let prices = new Array(n).fill(Number.MAX_VALUE);
  prices[src] = 0;

  for (let i = 0; i <= k; i++) {
    let temp = prices.slice();
    for (let flight of flights) {
      let curr = flight[0], next = flight[1], price = flight[2];
      if (prices[curr] === Number.MAX_VALUE)
        continue;

      temp[next] = Math.min(temp[next], prices[curr] + price);
    }
    prices = temp;
  }
  
  return prices[dst] === Number.MAX_VALUE ? -1 : prices[dst];
};