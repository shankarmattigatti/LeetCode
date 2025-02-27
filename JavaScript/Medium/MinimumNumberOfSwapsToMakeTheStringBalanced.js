/**
 * 1963. Minimum Number of Swaps to Make the String Balanced
 * @param {string} s
 * @return {number}
 */
const minSwaps = function (s) {
  let stackSize = 0;
  for (let ch of s) {
    if (ch === '[') {
      stackSize++;
    } else {
      if (stackSize > 0)
        stackSize--;
    }
  }

  return Math.floor((stackSize + 1) / 2);
};