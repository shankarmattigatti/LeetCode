/**
 * 2582. Pass the Pillow
 * @param {number} n
 * @param {number} time
 * @return {number}
 */
const passThePillow = function (n, time) {
  let currentHolder = 1, direction = 1;
  for (let i = 0; i < time; i++) {
    currentHolder += direction;

    if (currentHolder === n + 1) {
      currentHolder = n - 1;
      direction = -1;
    } else if (currentHolder === 0) {
      currentHolder = 2;
      direction = 1;
    }
  }

  return currentHolder;
};