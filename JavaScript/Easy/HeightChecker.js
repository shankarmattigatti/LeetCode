/**
 * 1051. Height Checker
 * @param {number[]} heights
 * @return {number}
 */
const heightChecker = function (heights) {
  let sortedHeights = heights.slice();
  sortedHeights.sort((a, b) => a - b);
  let count = 0;
  for (let i = 0; i < heights.length; i++) {
    if (heights[i] != sortedHeights[i]) {
      count++;
    }
  }

  return count;
};