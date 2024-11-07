/**
 * 2275. Largest Combination With Bitwise AND Greater Than Zero
 * @param {number[]} candidates
 * @return {number}
 */
const largestCombination = function (candidates) {
  const bitCount = new Array(32).fill(0);
  for (const num of candidates) {
    for (let i = 0; i < 32; i++) {
      if (num & (1 << i)) {
        bitCount[i]++;
      }
    }
  }

  return Math.max(...bitCount);
};