/**
 * 1011. Capacity To Ship Packages Within D Days
 * @param {number[]} weights
 * @param {number} days
 * @return {number}
 */
var shipWithinDays = function (weights, days) {
  let left = Math.max(...weights);
  let right = weights.reduce((acc, curr) => acc + curr);
  while (left < right) {
    const mid = Math.floor((left + right) / 2);
    let currDays = 1;
    let currLoad = 0;
    for (const w of weights) {
      if (currLoad + w > mid) {
        currDays++;
        currLoad = 0;
      }
      currLoad += w;
    }
    if (currDays > days) {
      left = mid + 1;
    } else {
      right = mid;
    }
  }
  return left;
};
