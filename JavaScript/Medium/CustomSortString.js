/**
 * 791. Custom Sort String
 * @param {string} order
 * @param {string} s
 * @return {string}
 */
const customSortString = function (order, s) {
  const freq = new Map();

  for (let i = 0; i < s.length; i++) {
    const letter = s[i];
    freq.set(letter, (freq.get(letter) || 0) + 1);
  }

  let result = '';
  for (let i = 0; i < order.length; i++) {
    const letter = order[i];
    while (freq.get(letter) > 0) {
      result += letter;
      freq.set(letter, freq.get(letter) - 1);
    }
  }

  for (const [letter, count] of freq) {
    let remaining = count;
    while (remaining > 0) {
      result += letter;
      remaining--;
    }
  }

  return result;
};