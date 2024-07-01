/**
 * 1550. Three Consecutive Odds
 * @param {number[]} arr
 * @return {boolean}
 */
const threeConsecutiveOdds = function (arr) {
  let countOddNumbers = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 != 0) {
      countOddNumbers++;
    } else {
      countOddNumbers = 0;
    }

    if (countOddNumbers === 3)
      return true;
  }

  return false;
};