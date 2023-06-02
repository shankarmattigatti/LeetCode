/**
 * 2101. Detonate the Maximum Bombs
 * @param {number[][]} bombs
 * @return {number}
 */
const maximumDetonation = function (bombs) {
  let maxDetonatedBombs = 0;

  for (let i = 0; i < bombs.length; i++) {
    let detonatedBombs = 1; // The current bomb is always detonated
    const visited = new Set([i]);
    for (let j = 0; j < bombs.length; j++) {
      if (i !== j && isInRange(bombs[i], bombs[j])) {
        detonatedBombs += getDetonatedBombsCount(j, bombs, visited);
      }
    }

    maxDetonatedBombs = Math.max(maxDetonatedBombs, detonatedBombs);
  }

  return maxDetonatedBombs;
};

const getDetonatedBombsCount = function (index, bombs, visited) {
  if (visited.has(index)) {
    return 0;
  }

  visited.add(index);
  let count = 1;

  for (let i = 0; i < bombs.length; i++) {
    if (i !== index && isInRange(bombs[index], bombs[i])) {
      count += getDetonatedBombsCount(i, bombs, visited);
    }
  }

  return count;
};

const isInRange = function (bomb1, bomb2) {
  const x1 = bomb1[0];
  const y1 = bomb1[1];
  const r1 = bomb1[2];
  const x2 = bomb2[0];
  const y2 = bomb2[1];
  const r2 = bomb2[2];

  const distance = Math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2);
  return distance <= r1;
};
