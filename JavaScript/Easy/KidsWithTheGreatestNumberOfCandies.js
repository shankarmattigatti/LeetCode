/**
 * 1431. Kids With the Greatest Number of Candies
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function (candies, extraCandies) {
  const res = [];
  const max = Math.max(...candies);
  for (let i = 0; i < candies.length; i++) {
    if (candies[i] + extraCandies >= max) {
      res.push(true);
    } else {
      res.push(false);
    }
  }
  return res;
};
