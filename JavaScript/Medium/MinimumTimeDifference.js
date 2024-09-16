/**
 * 539. Minimum Time Difference
 * @param {string[]} timePoints
 * @return {number}
 */
const findMinDifference = function (timePoints) {
  const minutes = timePoints.map(timeToMinutes);
  minutes.sort((a, b) => a - b);

  let minDiff = Infinity;
  for (let i = 1; i < minutes.length; i++) {
    minDiff = Math.min(minDiff, minutes[i] - minutes[i - 1]);
  }

  const dayMinutes = 24 * 60;
  minDiff = Math.min(minDiff, dayMinutes + minutes[0] - minutes[minutes.length - 1]);

  return minDiff;
};

const timeToMinutes = function (time) {
  const [hours, minutes] = time.split(':').map(Number);
  return hours * 60 + minutes;
};