/**
 * 2914. Minimum Number of Changes to Make Binary String Beautiful
 * @param {string} s
 * @return {number}
 */
const minChanges = function (s) {
  let count = 0;
  for (let i = 0; i < s.length - 1; i += 2) {
    if (s[i] != s[i + 1])
      count++;
  }

  return count;
};