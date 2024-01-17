/**
 * 1207. Unique Number of Occurrences
 * @param {number[]} arr
 * @return {boolean}
 */
const uniqueOccurrences = function (arr) {
  let occurrenceMap = new Map();
  let occurrenceSet = new Set();

  for (let num of arr) {
    occurrenceMap.set(num, (occurrenceMap.get(num) || 0) + 1);
  }

  for (let count of occurrenceMap.values()) {
    if (occurrenceSet.has(count))
      return false;

    occurrenceSet.add(count);
  }

  return true;
};