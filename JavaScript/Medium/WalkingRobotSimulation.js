/**
 * 874. Walking Robot Simulation
 * @param {number[]} commands
 * @param {number[][]} obstacles
 * @return {number}
 */
const robotSim = function (commands, obstacles) {
  const directions = [[0, 1], [1, 0], [0, -1], [-1, 0]];
  let obstacleSet = new Set(obstacles.map(obstacle => obstacle.join(',')));

  let x = 0, y = 0;
  let directionIndex = 0;
  let maxDistanceSquared = 0;
  for (let command of commands) {
    if (command === -2) {
      directionIndex = (directionIndex + 3) % 4;
    } else if (command === -1) {
      directionIndex = (directionIndex + 1) % 4;
    } else {
      let [dx, dy] = directions[directionIndex];
      for (let i = 0; i < command; i++) {
        let newX = x + dx;
        let newY = y + dy;
        if (obstacleSet.has(`${newX},${newY}`)) {
          break;
        }
        x = newX;
        y = newY;
        maxDistanceSquared = Math.max(maxDistanceSquared, x * x + y * y);
      }
    }
  }

  return maxDistanceSquared;
};