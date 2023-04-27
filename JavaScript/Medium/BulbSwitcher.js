/**
 * 319. Bulb Switcher
 * @param {number} n
 * @return {number}
 */
var bulbSwitch = function (n) {
  let count = 0;
  for (let i = 1; i <= n; i++) {
    if (Math.sqrt(i) % 1 === 0) {
      count++;
    }
  }
  return count;
};
