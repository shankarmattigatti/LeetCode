/**
 * 1503. Last Moment Before All Ants Fall Out of a Plank
 * @param {number} n
 * @param {number[]} left
 * @param {number[]} right
 * @return {number}
 */
const getLastMoment = function (n, left, right) {
  let maxTime = 0;
  for (let i = 0; i < left.length; i++) {
    maxTime = Math.max(maxTime, left[i]);
  }

  for (let i = 0; i < right.length; i++) {
    maxTime = Math.max(maxTime, n - right[i]);
  }

  return maxTime;
};
