/**
 * 1143. Longest Common Subsequence
 * @param {string} text1
 * @param {string} text2
 * @return {number}
 */
const longestCommonSubsequence = function (text1, text2) {
  let length1 = text1.length;
  let length2 = text2.length;
  let dpTable = Array.from(Array(length1 + 1), () => Array(length2 + 1).fill(0));

  for (let i = 0; i <= length1; i++) {
    for (let j = 0; j <= length2; j++) {
      if (i === 0 || j === 0)
        dpTable[i][j] = 0;
      else if (text1.charAt(i - 1) === text2.charAt(j - 1))
        dpTable[i][j] = dpTable[i - 1][j - 1] + 1;
      else
        dpTable[i][j] = Math.max(dpTable[i - 1][j], dpTable[i][j - 1]);
    }
  }
  return dpTable[length1][length2];
};