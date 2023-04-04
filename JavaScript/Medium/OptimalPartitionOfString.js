/**
 * 2405. Optimal Partition of String
 * @param {string} s
 * @return {number}
 */
var partitionString = function (s) {
  const lastIndex = new Array(26).fill(-1);
  let start = 0;
  let substrings = [];

  for (let i = 0; i < s.length; i++) {
    const c = s.charCodeAt(i) - 97;
    const last = lastIndex[c];
    lastIndex[c] = i;

    if (last >= start) {
      substrings.push(s.substring(start, i));
      start = i;
    }
  }

  substrings.push(s.substring(start));

  return substrings.length;
};
