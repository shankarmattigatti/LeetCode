/**
 * 2300. Successful Pairs of Spells and Potions
 * @param {number[]} spells
 * @param {number[]} potions
 * @param {number} success
 * @return {number[]}
 */
var successfulPairs = function (spells, potions, success) {
  const pairs = new Array(spells.length).fill(0);
  potions.sort((a, b) => a - b);

  for (let i = 0; i < spells.length; i++) {
    const threshold = success / spells[i];
    const index = binarySearch(potions, threshold);
    pairs[i] = potions.length - index;
  }

  return pairs;
};

const binarySearch = function (arr, target) {
  let low = 0, high = arr.length - 1;

  while (low <= high) {
    const mid = Math.floor((low + high) / 2);
    if (arr[mid] >= target) {
      high = mid - 1;
    } else {
      low = mid + 1;
    }
  }

  return low;
};
