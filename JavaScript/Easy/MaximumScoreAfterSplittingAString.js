/**
 * 1422. Maximum Score After Splitting a String
 * @param {string} s
 * @return {number}
 */
const maxScore = function (s) {
  let maxScore = 0;
  for (let i = 0; i < s.length - 1; i++) {
    let left = s.substr(0, i + 1);
    let right = s.substr(i + 1, s.length);

    let countZeros = left.split('').filter(x => x === '0').length;
    let countOnes = right.split('').filter(x => x === '1').length;

    maxScore = Math.max(maxScore, countZeros + countOnes);
  }

  return maxScore;
};