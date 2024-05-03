/**
 * 165. Compare Version Numbers
 * @param {string} version1
 * @param {string} version2
 * @return {number}
 */
const compareVersion = function (version1, version2) {
  let v1 = version1.split(".");
  let v2 = version2.split(".");

  let i = 0;
  while (i < v1.length || i < v2.length) {
    if (i < v1.length && i < v2.length) {
      let n1 = parseInt(v1[i]);
      let n2 = parseInt(v2[i]);
      if (n1 > n2)
        return 1;
      if (n1 < n2)
        return -1;
    } else if (i < v1.length) {
      if (parseInt(v1[i]) !== 0)
        return 1;
    } else {
      if (parseInt(v2[i]) !== 0)
        return -1;
    }
    i++;
  }
  return 0;
};