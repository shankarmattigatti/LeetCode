/**
 * 2038. Remove Colored Pieces if Both Neighbors are the Same Color
 * @param {string} colors
 * @return {boolean}
 */
const winnerOfGame = function (colors) {
  let aliceMoves = 0;
  let bobMoves = 0;

  let i = 0;
  while (i < colors.length) {
    if (colors[i] === 'A') {
      let start = i;
      while (i < colors.length && colors[i] === 'A') {
        i++;
      }
      aliceMoves += Math.max(0, i - start - 2);
    } else {
      let start = i;
      while (i < colors.length && colors[i] === 'B') {
        i++;
      }
      bobMoves += Math.max(0, i - start - 2);
    }
  }

  return aliceMoves > bobMoves;
};