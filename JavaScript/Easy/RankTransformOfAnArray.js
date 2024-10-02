/**
 * 1331. Rank Transform of an Array
 * @param {number[]} arr
 * @return {number[]}
 */
const arrayRankTransform = function (arr) {
  const sortedArr = [...arr].sort((a, b) => a - b);

  let rank = 1;
  let rankMap = new Map();
  for (let i = 0; i < sortedArr.length; i++) {
    if (!rankMap.has(sortedArr[i])) {
      rankMap.set(sortedArr[i], rank++);
    }
  }

  return arr.map(num => rankMap.get(num));
};