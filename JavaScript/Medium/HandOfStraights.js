/**
 * 846. Hand of Straights
 * @param {number[]} hand
 * @param {number} groupSize
 * @return {boolean}
 */
const isNStraightHand = function (hand, groupSize) {
  if (hand.length % groupSize !== 0) {
    return false;
  }

  const countMap = new Map();
  for (const card of hand) {
    countMap.set(card, (countMap.get(card) || 0) + 1);
  }

  const uniqueCards = Array.from(countMap.keys()).sort((a, b) => a - b);

  for (const card of uniqueCards) {
    const count = countMap.get(card);
    if (count > 0) {
      for (let i = 0; i < groupSize; i++) {
        const currentCard = card + i;
        const currentCount = countMap.get(currentCard) || 0;
        if (currentCount < count) {
          return false;
        }
        countMap.set(currentCard, currentCount - count);
      }
    }
  }

  return true;
};