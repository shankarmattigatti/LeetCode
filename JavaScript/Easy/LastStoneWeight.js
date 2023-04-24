/**
 * 1046. Last Stone Weight
 * @param {number[]} stones
 * @return {number}
 */
var lastStoneWeight = function (stones) {
  while (stones.length > 1) {
    stones.sort((a, b) => b - a);
    let firstMax = stones[0];
    let secondMax = stones[1];
    stones.splice(0, 2);
    if (firstMax !== secondMax) {
      stones.push(firstMax - secondMax);
    }
  }
  
  return stones.length === 0 ? 0 : stones[0];
};
