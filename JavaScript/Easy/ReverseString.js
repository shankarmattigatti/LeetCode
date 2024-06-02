/**
 * 344. Reverse String
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
const reverseString = function (s) {
  let low = 0, high = s.length - 1;
  while (low < high) {
    let temp = s[low];
    s[low++] = s[high];
    s[high--] = temp;
  }
};