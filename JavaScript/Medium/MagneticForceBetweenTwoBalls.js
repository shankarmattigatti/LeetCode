/**
 * 1552. Magnetic Force Between Two Balls
 * @param {number[]} position
 * @param {number} m
 * @return {number}
 */
const maxDistance = function (position, m) {
  position.sort((a, b) => a - b);

  let left = 1;
  let right = position[position.length - 1] - position[0];
  let result = 0;

  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    if (canPlaceBalls(mid, position, m)) {
      result = mid;
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }

  return result;
};

const canPlaceBalls = function (force, position, m) {
  let count = 1;
  let lastPosition = position[0];

  for (let i = 1; i < position.length; i++) {
    if (position[i] - lastPosition >= force) {
      count++;
      lastPosition = position[i];
      if (count == m) return true;
    }
  }
  return false;
};