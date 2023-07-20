/**
 * 735. Asteroid Collision
 * @param {number[]} asteroids
 * @return {number[]}
 */
var asteroidCollision = function (asteroids) {
  const res = [];
  for (let i = 0; i < asteroids.length; i++) {
    if (asteroids[i] > 0 || res.length === 0 || res[res.length - 1] < 0) {
      res.push(asteroids[i]);
    } else if (res[res.length - 1] <= -asteroids[i]) {
      if (res.pop() < -asteroids[i]) {
        i--;
      }
    }
  }
  return res;
};
