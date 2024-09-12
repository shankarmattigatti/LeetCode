/**
 * 1684. Count the Number of Consistent Strings
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
const countConsistentStrings = function (allowed, words) {
  let count = 0;
  let allowedSet = new Set(allowed);
  for (const word of words) {
    let isConsistent = true;
    for (const char of word) {
      if (!allowedSet.has(char)) {
        isConsistent = false;
        break;
      }
    }

    if (isConsistent)
      count++;
  }
  return count;
};