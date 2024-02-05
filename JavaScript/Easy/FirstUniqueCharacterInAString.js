/**
 * 387. First Unique Character in a String
 * @param {string} s
 * @return {number}
 */
const firstUniqChar = function (s) {
  let map = new Map();
  for (let i = 0; i < s.length; i++) {
    let char = s.charAt(i);
    map.set(char, (map.get(char) || 0) + 1);
  }
  for (let i = 0; i < s.length; i++) {
    if (map.get(s.charAt(i)) === 1)
      return i;
  }

  return -1;
};