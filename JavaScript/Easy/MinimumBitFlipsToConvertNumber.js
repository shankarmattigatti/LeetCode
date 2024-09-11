/**
 * 2220. Minimum Bit Flips to Convert Number
 * @param {number} start
 * @param {number} goal
 * @return {number}
 */
const minBitFlips = function (start, goal) {
  let count = 0, xor = start ^ goal;
  while (xor > 0) {
    count += xor & 1;
    xor >>= 1;
  }

  return count;
};