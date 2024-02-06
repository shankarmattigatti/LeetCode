/**
 * 49. Group Anagrams
 * @param {string[]} strs
 * @return {string[][]}
 */
const groupAnagrams = function (strs) {
  const result = [];
  const map = {};
  strs.forEach(str => {
    const word = str.split('').sort().join('');
    if (map.hasOwnProperty(word)) {
      map[word].push(str);
    } else {
      map[word] = [str];
    }
  });

  for (const key in map) {
    result.push(map[key]);
  }
  return result;
};