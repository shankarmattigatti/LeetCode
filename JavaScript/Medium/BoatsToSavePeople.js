/**
 * 881. Boats to Save People
 * @param {number[]} people
 * @param {number} limit
 * @return {number}
 */
var numRescueBoats = function (people, limit) {
  people.sort((a, b) => a - b);

  let minNumberOfBoats = 0;
  let i = 0, j = people.length - 1;
  while (i <= j) {
    if (people[i] + people[j] <= limit) {
      i++;
    }

    j--;
    minNumberOfBoats++;
  }

  return minNumberOfBoats;
};
