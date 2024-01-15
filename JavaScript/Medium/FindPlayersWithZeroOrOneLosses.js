/**
 * 2225. Find Players With Zero or One Losses
 * @param {number[][]} matches
 * @return {number[][]}
 */
const findWinners = function (matches) {
  const losses = {};
  const hasWon = {};

  matches.forEach(([winner, loser]) => {
    hasWon[winner] = true;
    losses[loser] = (losses[loser] || 0) + 1;
  });

  const noLosses = [];
  const oneLoss = [];

  for (const player in losses) {
    if (losses[player] === 1) {
      oneLoss.push(parseInt(player));
    }
  }

  for (const player in hasWon) {
    if (!(player in losses)) {
      noLosses.push(parseInt(player));
    }
  }

  noLosses.sort((a, b) => a - b);
  oneLoss.sort((a, b) => a - b);

  return [noLosses, oneLoss];
};