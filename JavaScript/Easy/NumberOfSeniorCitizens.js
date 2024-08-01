/**
 * 2678. Number of Senior Citizens
 * @param {string[]} details
 * @return {number}
 */
const countSeniors = function (details) {
  let count = 0;
  for (let detail of details) {
    let age = parseInt(detail.slice(11, 13));
    if (age > 60) {
      count++;
    }
  }

  return count;
};