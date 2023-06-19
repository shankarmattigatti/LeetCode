/**
 * 1732. Find the Highest Altitude
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function (gain) {
  let max = 0, maxAlt = 0;
  for (let i = 0; i < gain.length; i++) {
    max += gain[i];
    maxAlt = Math.max(maxAlt, max);
  }
  return maxAlt;
};
