/**
 * 1921. Eliminate Maximum Number of Monsters
 * @param {number[]} dist
 * @param {number[]} speed
 * @return {number}
 */
const eliminateMaximum = function (dist, speed) {
  let arrivalTimes = dist.map((d, i) => d / speed[i]);
  arrivalTimes.sort((a, b) => a - b);

  let time = 0;
  let eliminated = 0;
  for (let i = 0; i < arrivalTimes.length; i++) {
    if (time < arrivalTimes[i]) {
      eliminated++;
      time++;
    } else {
      break;
    }
  }

  return eliminated;
};
